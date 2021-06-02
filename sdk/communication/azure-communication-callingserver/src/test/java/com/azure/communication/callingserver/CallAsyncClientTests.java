package com.azure.communication.callingserver;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.UUID;

import com.azure.communication.callingserver.models.CallModality;
import com.azure.communication.callingserver.models.CreateCallOptions;
import com.azure.communication.callingserver.models.CreateCallResult;
import com.azure.communication.callingserver.models.EventSubscriptionType;
import com.azure.communication.callingserver.models.InviteParticipantsRequest;
import com.azure.communication.callingserver.models.PlayAudioResult;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Set the AZURE_TEST_MODE environment variable to either PLAYBACK or RECORD to determine if tests are playback or
 * live. By default, tests are run in playback mode.
 */
public class CallAsyncClientTests extends CallingServerTestBase {
    private String from = "8:acs:016a7064-0581-40b9-be73-6dde64d69d72_0000000a-6198-4a66-02c3-593a0d00560d";
    private String alternateId =   "+18445764430";
    private String to =   "+15125189815";     
    private String callBackUri = "https://host.app/api/callback/calling";
    private String audioFileUri = "https://host.app/audio/bot-callcenter-intro.wav";
    private String invitedUser = "8:acs:016a7064-0581-40b9-be73-6dde64d69d72_0000000a-6d91-5555-b5bb-a43a0d00068c";;

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runCreatePlayAudioHangupScenarioAsync(HttpClient httpClient) throws URISyntaxException, InterruptedException {
        var builder = getCallClientUsingConnectionString(httpClient);
        var callAsyncClient = setupAsyncClient(builder, "runCreatePlayAudioHangupScenarioAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri, 
                new LinkedList<CallModality>(Arrays.asList(CallModality.AUDIO)), 
                new LinkedList<EventSubscriptionType>(Arrays.asList(EventSubscriptionType.PARTICIPANTS_UPDATED)));
                
            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));
            
            CreateCallResult createCallResult = callAsyncClient.createCall(
                new CommunicationUserIdentifier(from), 
                new LinkedList<CommunicationIdentifier>(Arrays.asList(new PhoneNumberIdentifier(to))), 
                options).block();
            
            CallingServerTestUtils.ValidateCreateCallResult(createCallResult);
            var callId = createCallResult.getCallLegId();            

            // Play Audio
            var operationContext = "ac794123-3820-4979-8e2d-50c7d3e07b12";
            PlayAudioResult playAudioResult = callAsyncClient.playAudio(
                callId, 
                audioFileUri, 
                false, 
                UUID.randomUUID().toString(), 
                operationContext).block();
            CallingServerTestUtils.ValidatePlayAudioResult(playAudioResult, operationContext);

            // Hang up
            callAsyncClient.hangupCall(callId).block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }   

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runCreatePlayAudioHangupScenarioWithResponseAsync(HttpClient httpClient) throws URISyntaxException, InterruptedException {
        var builder = getCallClientUsingConnectionString(httpClient);
        var callAsyncClient = setupAsyncClient(builder, "runCreatePlayAudioHangupScenarioWithResponseAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri, 
                new LinkedList<CallModality>(Arrays.asList(CallModality.AUDIO)), 
                new LinkedList<EventSubscriptionType>(Arrays.asList(EventSubscriptionType.PARTICIPANTS_UPDATED)));
                
            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));
            
            Response<CreateCallResult> createCallResponse = callAsyncClient.createCallWithResponse(
                new CommunicationUserIdentifier(from), 
                new LinkedList<CommunicationIdentifier>(Arrays.asList(new PhoneNumberIdentifier(to))), 
                options, 
                Context.NONE).block();
            
            CallingServerTestUtils.ValidateCreateCallResponse(createCallResponse);
            var callId = createCallResponse.getValue().getCallLegId();            

            // Play Audio
            var operationContext = "ac794123-3820-4979-8e2d-50c7d3e07b12";
            Response<PlayAudioResult> playAudioResponse = callAsyncClient.playAudioWithResponse(
                callId, 
                audioFileUri, 
                false, 
                UUID.randomUUID().toString(), 
                operationContext, 
                Context.NONE).block();
                CallingServerTestUtils.ValidatePlayAudioResponse(playAudioResponse, operationContext);

            // Hang up
            Response<Void> hangupResponse = callAsyncClient.hangupCallWithResponse(callId, Context.NONE).block();
            CallingServerTestUtils.ValidateHangupResponse(hangupResponse);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    } 
    
    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void inviteUserRemoveParticipantScenarioAsync(HttpClient httpClient) throws URISyntaxException, InterruptedException {
        var builder = getCallClientUsingConnectionString(httpClient);
        var callAsyncClient = setupAsyncClient(builder, "inviteUserRemoveParticipantScenarioAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri, 
                new LinkedList<CallModality>(Arrays.asList(CallModality.AUDIO)), 
                new LinkedList<EventSubscriptionType>(Arrays.asList(EventSubscriptionType.PARTICIPANTS_UPDATED)));
                
            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));
            
            CreateCallResult createCallResult = callAsyncClient.createCall(
                new CommunicationUserIdentifier(from), 
                new LinkedList<CommunicationIdentifier>(Arrays.asList(new PhoneNumberIdentifier(to))), 
                options).block();
            
            CallingServerTestUtils.ValidateCreateCallResult(createCallResult);
            var callId = createCallResult.getCallLegId();            

            // Invite User
            var operationContext = "ac794123-3820-4979-8e2d-50c7d3e07b12";
            InviteParticipantsRequest inviteParticipantsRequest = new InviteParticipantsRequest();
            inviteParticipantsRequest.setParticipants(new LinkedList<CommunicationIdentifier>(Arrays.asList(new CommunicationUserIdentifier(invitedUser))));
            inviteParticipantsRequest.setOperationContext(operationContext);
            callAsyncClient.inviteParticipants(callId, inviteParticipantsRequest).block();
            
            // Remove Participant
            var participantId = "845156dc-15ad-4dec-883c-ee2e27cdb99e";
            callAsyncClient.removeParticipant(callId, participantId).block();

            // Hang up
            callAsyncClient.hangupCall(callId).block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void inviteUserRemoveParticipantScenarioWithResponseAsync(HttpClient httpClient) throws URISyntaxException, InterruptedException {
        var builder = getCallClientUsingConnectionString(httpClient);
        var callAsyncClient = setupAsyncClient(builder, "inviteUserRemoveParticipantScenarioWithResponseAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri, 
                new LinkedList<CallModality>(Arrays.asList(CallModality.AUDIO)), 
                new LinkedList<EventSubscriptionType>(Arrays.asList(EventSubscriptionType.PARTICIPANTS_UPDATED)));
                
            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));
            
            Response<CreateCallResult> createCallResponse = callAsyncClient.createCallWithResponse(
                new CommunicationUserIdentifier(from), 
                new LinkedList<CommunicationIdentifier>(Arrays.asList(new PhoneNumberIdentifier(to))), 
                options, 
                Context.NONE).block();
            
            CallingServerTestUtils.ValidateCreateCallResponse(createCallResponse);
            var callId = createCallResponse.getValue().getCallLegId();            

            // Invite User
            var operationContext = "ac794123-3820-4979-8e2d-50c7d3e07b12";
            InviteParticipantsRequest inviteParticipantsRequest = new InviteParticipantsRequest();
            inviteParticipantsRequest.setParticipants(new LinkedList<CommunicationIdentifier>(Arrays.asList(new CommunicationUserIdentifier(invitedUser))));
            inviteParticipantsRequest.setOperationContext(operationContext);
            Response<Void> inviteParticipantResponse = callAsyncClient.inviteParticipantsWithResponse(callId, inviteParticipantsRequest, Context.NONE).block();
            CallingServerTestUtils.ValidateInviteParticipantResponse(inviteParticipantResponse);
             
            // Remove Participant
            var participantId = "8465d43d-3cf2-4e7f-96f6-e9824348c894";
            Response<Void> removeParticipantResponse = callAsyncClient.removeParticipantWithResponse(callId, participantId, Context.NONE).block();
            CallingServerTestUtils.ValidateRemoveParticipantResponse(removeParticipantResponse);

            // Hang up
            Response<Void> hangupResponse = callAsyncClient.hangupCallWithResponse(callId, Context.NONE).block();
            CallingServerTestUtils.ValidateHangupResponse(hangupResponse);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }
    
    private CallAsyncClient setupAsyncClient(CallClientBuilder builder, String testName) {
        return addLoggingPolicy(builder, testName).buildAsyncClient();
    }

    protected CallClientBuilder addLoggingPolicy(CallClientBuilder builder, String testName) {
        return builder.addPolicy((context, next) -> logHeaders(testName, next));
    }
}

