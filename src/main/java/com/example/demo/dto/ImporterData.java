package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ImporterData {

    @JsonProperty("importerDetails")
    private List<ImporterDetail> importerDetails;

    @JsonProperty("count")
    private Integer count;
}
