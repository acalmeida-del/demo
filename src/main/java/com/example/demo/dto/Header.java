package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Header {
    @JsonProperty("requestID")
    private String requestID;

    @JsonProperty("status")
    private Status status;
}
