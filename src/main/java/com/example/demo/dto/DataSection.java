package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DataSection {
    @JsonProperty("tariffsHarmonized")
    private List<TariffHarmonized> tariffsHarmonized;

    @JsonProperty("count")
    private int count;
}
