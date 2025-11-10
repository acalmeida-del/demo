package com.example.demo.service;

import com.example.demo.dto.HrResponse;
import org.springframework.http.ResponseEntity;
import com.example.demo.dto.ImporterData;

public interface NebrasService {
    ResponseEntity<HrResponse> getTariffsHarmonizedDetails();

    ResponseEntity<ImporterData> getImporterDetails();
}
