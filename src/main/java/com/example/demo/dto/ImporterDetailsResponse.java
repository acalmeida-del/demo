package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ImporterDetailsResponse {
    @JsonProperty("header")
    private Header header;

    @JsonProperty("data")
    private ImporterDetail importerDetail;
}
