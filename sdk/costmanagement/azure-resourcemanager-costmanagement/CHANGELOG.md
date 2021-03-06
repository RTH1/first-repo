# Release History

## 1.0.0-beta.4 (Unreleased)


## 1.0.0-beta.3 (2021-07-29)

- Azure Resource Manager CostManagement client library for Java. This package contains Microsoft Azure SDK for CostManagement Management SDK.  Package tag package-2019-11. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ExportProperties` was removed

#### `models.View$Update` was modified

* `withTypePropertiesQueryType(models.ReportType)` was removed

#### `models.View` was modified

* `typePropertiesQueryType()` was removed

#### `models.View$Definition` was modified

* `withTypePropertiesQueryType(models.ReportType)` was removed

### Features Added

* `models.CacheItem` was added

* `models.SettingsPropertiesStartOn` was added

#### `models.View$Update` was modified

* `withTypePropertiesType(models.ReportType)` was added

#### `models.View` was modified

* `typePropertiesType()` was added

#### `CostManagementManager$Configurable` was modified

* `withScope(java.lang.String)` was added

#### `models.Setting` was modified

* `startOn()` was added
* `cache()` was added

#### `models.View$Definition` was modified

* `withTypePropertiesType(models.ReportType)` was added

## 1.0.0-beta.2 (2021-04-07)

- Azure Resource Manager CostManagement client library for Java. This package contains Microsoft Azure SDK for CostManagement Management SDK.  Package tag package-2019-11. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Change

* `models.ReportConfigFilterAutoGenerated` was removed

* `models.ExportTimePeriod` was removed

* `models.ExportDatasetConfiguration` was removed

* `models.ForecastDataset` was removed

* `models.ReportConfigDatasetAutoGenerated` was removed

* `models.ExportDataset` was removed

#### `models.View$Update` was modified

* `withDataset(models.ReportConfigDataset)` was removed

#### `models.View` was modified

* `dataset()` was removed

#### `models.Export` was modified

* `nextRunTimeEstimate()` was removed
* `runHistory()` was removed

#### `models.ExportExecution` was modified

* `models.ExecutionType executionType()` -> `models.ExecutionType executionType()`
* `models.CommonExportProperties runSettings()` -> `models.CommonExportProperties runSettings()`
* `java.lang.String fileName()` -> `java.lang.String fileName()`
* `java.lang.String submittedBy()` -> `java.lang.String submittedBy()`
* `etag()` was removed
* `java.time.OffsetDateTime processingStartTime()` -> `java.time.OffsetDateTime processingStartTime()`
* `models.ExecutionStatus status()` -> `models.ExecutionStatus status()`
* `type()` was removed
* `error()` was removed
* `java.time.OffsetDateTime submittedTime()` -> `java.time.OffsetDateTime submittedTime()`
* `name()` was removed
* `id()` was removed
* `java.time.OffsetDateTime processingEndTime()` -> `java.time.OffsetDateTime processingEndTime()`
* `innerModel()` was removed

#### `models.ForecastDefinition` was modified

* `models.ForecastDataset dataset()` -> `models.QueryDataset dataset()`
* `withDataset(models.ForecastDataset)` was removed

#### `models.QueryFilter` was modified

* `dimension()` was removed
* `withTag(models.QueryComparisonExpression)` was removed
* `withNot(models.QueryFilter)` was removed
* `tag()` was removed
* `withDimension(models.QueryComparisonExpression)` was removed
* `not()` was removed

#### `models.Export$Update` was modified

* `withRunHistory(fluent.models.ExportExecutionListResultInner)` was removed

#### `models.ExportDefinition` was modified

* `withDataSet(models.ExportDataset)` was removed
* `withTimePeriod(models.ExportTimePeriod)` was removed
* `models.ExportTimePeriod timePeriod()` -> `models.QueryTimePeriod timePeriod()`
* `models.ExportDataset dataSet()` -> `models.QueryDatasetAutoGenerated dataSet()`

#### `models.View$Definition` was modified

* `withDataset(models.ReportConfigDataset)` was removed

#### `models.CommonExportProperties` was modified

* `models.ExportDefinition definition()` -> `models.ExportDefinition definition()`
* `innerModel()` was removed
* `runHistory()` was removed
* `models.ExportDeliveryInfo deliveryInfo()` -> `models.ExportDeliveryInfo deliveryInfo()`
* `nextRunTimeEstimate()` was removed
* `models.FormatType format()` -> `models.FormatType format()`

#### `models.Exports` was modified

* `listWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getByIdWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Export$Definition` was modified

* `withRunHistory(fluent.models.ExportExecutionListResultInner)` was removed

#### `models.ReportConfigFilter` was modified

* `withNot(models.ReportConfigFilter)` was removed
* `dimension()` was removed
* `tag()` was removed
* `not()` was removed
* `withDimension(models.ReportConfigComparisonExpression)` was removed
* `withTag(models.ReportConfigComparisonExpression)` was removed

#### `models.ExportProperties` was modified

* `withRunHistory(fluent.models.ExportExecutionListResultInner)` was removed
* `fluent.models.CommonExportPropertiesInner withFormat(models.FormatType)` -> `models.CommonExportProperties withFormat(models.FormatType)`
* `fluent.models.CommonExportPropertiesInner withDefinition(models.ExportDefinition)` -> `models.CommonExportProperties withDefinition(models.ExportDefinition)`
* `fluent.models.CommonExportPropertiesInner withDeliveryInfo(models.ExportDeliveryInfo)` -> `models.CommonExportProperties withDeliveryInfo(models.ExportDeliveryInfo)`
* `withRunHistory(fluent.models.ExportExecutionListResultInner)` was removed

### New Feature

* `models.GenerateReservationDetailsReports` was added

* `models.GenerateReservationDetailsReportsByBillingProfileIdHeaders` was added

* `models.GenerateReservationDetailsReportsByBillingAccountIdResponse` was added

* `models.Status` was added

* `models.Setting` was added

* `models.GenerateReservationDetailsReportsByBillingAccountIdHeaders` was added

* `models.OperationStatusType` was added

* `models.QueryFilterAutoGenerated` was added

* `models.ProxySettingResource` was added

* `models.GenerateReservationDetailsReportsByBillingProfileIdResponse` was added

* `models.Settings` was added

* `models.SettingsListResult` was added

* `models.OperationStatus` was added

* `models.QueryDatasetAutoGenerated` was added

#### `CostManagementManager` was modified

* `settings()` was added
* `generateReservationDetailsReports()` was added

#### `models.View$Update` was modified

* `withDataSet(models.ReportConfigDataset)` was added

#### `models.View` was modified

* `currency()` was added
* `includeMonetaryCommitment()` was added
* `dataSet()` was added
* `dateRange()` was added

#### `models.Export` was modified

* `executeWithResponse(com.azure.core.util.Context)` was added
* `execute()` was added

#### `models.ExportExecution` was modified

* `withSubmittedBy(java.lang.String)` was added
* `tags()` was added
* `withSubmittedTime(java.time.OffsetDateTime)` was added
* `withExecutionType(models.ExecutionType)` was added
* `withRunSettings(models.CommonExportProperties)` was added
* `validate()` was added
* `withStatus(models.ExecutionStatus)` was added
* `withProcessingStartTime(java.time.OffsetDateTime)` was added
* `withFileName(java.lang.String)` was added
* `withProcessingEndTime(java.time.OffsetDateTime)` was added

#### `models.ForecastDefinition` was modified

* `withDataset(models.QueryDataset)` was added

#### `models.QueryFilter` was modified

* `withTags(models.QueryComparisonExpression)` was added
* `dimensions()` was added
* `withDimensions(models.QueryComparisonExpression)` was added
* `tags()` was added

#### `models.ExportDefinition` was modified

* `withTimePeriod(models.QueryTimePeriod)` was added
* `withDataSet(models.QueryDatasetAutoGenerated)` was added

#### `models.View$Definition` was modified

* `withDataSet(models.ReportConfigDataset)` was added

#### `models.CommonExportProperties` was modified

* `validate()` was added
* `withDeliveryInfo(models.ExportDeliveryInfo)` was added
* `withFormat(models.FormatType)` was added
* `withDefinition(models.ExportDefinition)` was added

#### `models.Exports` was modified

* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `listWithResponse(java.lang.String,com.azure.core.util.Context)` was added

#### `models.ReportConfigFilter` was modified

* `tagKey()` was added
* `dimensions()` was added
* `withDimensions(models.ReportConfigComparisonExpression)` was added
* `tags()` was added
* `withTagKey(models.ReportConfigComparisonExpression)` was added
* `tagValue()` was added
* `withTags(models.ReportConfigComparisonExpression)` was added
* `withTagValue(models.ReportConfigComparisonExpression)` was added

#### `models.QueryResult` was modified

* `sku()` was added
* `etag()` was added
* `location()` was added

## 1.0.0-beta.1 (2020-12-18)

- Azure Resource Manager CostManagement client library for Java. This package contains Microsoft Azure SDK for CostManagement Management SDK.  Package tag package-2020-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
