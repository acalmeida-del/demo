package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Status {
    @JsonProperty("code")
    private String code;

    @JsonProperty("description")
    private String description;
}
