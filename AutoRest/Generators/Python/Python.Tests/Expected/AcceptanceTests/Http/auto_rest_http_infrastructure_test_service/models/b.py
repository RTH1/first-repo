# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from .a import A


class B(A):

    _required = []

    _attribute_map = {
        'text_status_code': {'key': 'textStatusCode', 'type': 'str'},
    }

    def __init__(self, *args, **kwargs):
        """B

        :param str text_status_code
        """
        self.text_status_code = None

        super(B, self).__init__(*args, **kwargs)
