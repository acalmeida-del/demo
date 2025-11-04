package com.example.demo;

import com.example.demo.dto.HrResponse;
import com.example.demo.service.NebrasService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NebrasController {

    @Autowired
    private final NebrasService nebrasService;

    @GetMapping("/getHSDetails")
    public ResponseEntity<HrResponse> getTariffsHarmonized()
    {
        return nebrasService.getTariffsHarmonizedDetails();
    }

}
