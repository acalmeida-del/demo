package com.example.demo.service;

import com.example.demo.dto.HrResponse;
import org.springframework.http.ResponseEntity;

public interface NebrasService {
    ResponseEntity<HrResponse> getTariffsHarmonizedDetails();
}
