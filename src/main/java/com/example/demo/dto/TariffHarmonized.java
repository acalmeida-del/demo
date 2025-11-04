package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TariffHarmonized {

    @JsonProperty("harmonizedCode")
    private String harmonizedCode;

    @JsonProperty("itemDescriptionAr")
    private String itemDescriptionAr;

    @JsonProperty("itemDescriptionEn")
    private String itemDescriptionEn;
}
