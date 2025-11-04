package com.example.demo.service;

import com.example.demo.dto.HrResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NebrasServiceImp implements NebrasService{

    private final RestTemplate restTemplate;

    @Override
    public ResponseEntity<HrResponse> getTariffsHarmonizedDetails() {

            String url = "https://test-internal-api.zatca.gov.sa/test/internal/v1/customs/harmonized/tariffs?pageIndex=12&pageSize=12&routePortCode=99";

            HttpHeaders headers = new HttpHeaders();
            headers.set("X-ZATCA-Client-Id", "cda747fe5c68e72608fa60ba6c6f56c6");
            headers.set("X-ZATCA-Client-Secret", "3ffe15532ec6eaa5499754ff4d438e3a");
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(List.of(MediaType.APPLICATION_JSON, MediaType.ALL));

            HttpEntity<Void> entity = new HttpEntity<>(headers);

            ResponseEntity<HrResponse> response =
                    restTemplate.exchange(
                            url,
                            HttpMethod.GET,
                            entity,
                            new ParameterizedTypeReference<HrResponse>() {}
                    );

            return ResponseEntity.ok(response.getBody());
    }
}
