package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InputRequestHeader {
    @JsonProperty("X-Message-Id")
    private String xMessageId;

    @JsonProperty("X-Session-Language")
    private String xSessionLanguage;

    @JsonProperty("X-Device-Id")
    private String xDeviceId;

    @JsonProperty("X-Device-Name")
    private String xDeviceName;

    @JsonProperty("X-Device-Platform")
    private String xDevicePlatform;

    @JsonProperty("Content-Type")
    private String contentType;

    @JsonProperty("Accept")
    private String accept;
}
