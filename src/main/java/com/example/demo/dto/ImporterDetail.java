package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ImporterDetail {

    @JsonProperty("portCode")
    private Integer portCode;

    @JsonProperty("importerNumber")
    private Integer importerNumber;

    @JsonProperty("hqImporterNumber")
    private Integer hqImporterNumber;

    @JsonProperty("importerTypeCode")
    private Integer importerTypeCode;

    @JsonProperty("businessIdTypeCode")
    private Integer businessIdTypeCode;

    @JsonProperty("countryCode")
    private Integer countryCode;

    @JsonProperty("businessId")
    private String businessId;

    @JsonProperty("businessIdBranch")
    private String businessIdBranch;

    @JsonProperty("businessIdExpiryDate")
    private String businessIdExpiryDate;

    @JsonProperty("countryCodeOfId")
    private Integer countryCodeOfId;

    @JsonProperty("cityCodeOfId")
    private Integer cityCodeOfId;

    @JsonProperty("importerExportType")
    private Integer importerExportType;

    @JsonProperty("arabicImporterName")
    private String arabicImporterName;

    @JsonProperty("englishImporterName")
    private String englishImporterName;

    @JsonProperty("importerStandardName")
    private String importerStandardName;

    @JsonProperty("importerNumberParent")
    private Integer importerNumberParent;

    @JsonProperty("importerContactName")
    private String importerContactName;

    @JsonProperty("importerTelephoneNumber")
    private String importerTelephoneNumber;

    @JsonProperty("importerPobNumber")
    private Integer importerPobNumber;

    @JsonProperty("importerZipCode")
    private Integer importerZipCode;

    @JsonProperty("importerFaxNumber")
    private String importerFaxNumber;

    @JsonProperty("importerTelexNumber")
    private String importerTelexNumber;

    @JsonProperty("email")
    private String email;

    @JsonProperty("addCountryCode")
    private Integer addCountryCode;

    @JsonProperty("cityCode")
    private Integer cityCode;

    @JsonProperty("lastTransactionDate")
    private String lastTransactionDate;

    @JsonProperty("importerStatementNumber")
    private Integer importerStatementNumber;

    @JsonProperty("importerDataSource")
    private Integer importerDataSource;

    @JsonProperty("commercialRegistrationType")
    private Integer commercialRegistrationType;

    @JsonProperty("isSuspended")
    private Boolean isSuspended;
}

