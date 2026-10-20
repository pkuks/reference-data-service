package com.example.capitalmarkets.referencedata.service;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.capitalmarkets.referencedata.model.ReferenceDataResponse;

@Service
public class ReferenceDataService {

    private final Map<String, ReferenceDataResponse> referenceData =
            Map.of(
                    "EQUITY", new ReferenceDataResponse(
                            "EQUITY",
                            new BigDecimal("155.00"),
                            "USD"
                    ),
                    "BOND", new ReferenceDataResponse(
                            "BOND",
                            new BigDecimal("980.00"),
                            "USD"
                    ),
                    "FX", new ReferenceDataResponse(
                            "FX",
                            new BigDecimal("1.35"),
                            "SGD"
                    )
            );

    public ReferenceDataResponse getReferenceData(String instrument) {

        ReferenceDataResponse response =
                referenceData.get(instrument.toUpperCase());

        if (response == null) {
            throw new IllegalArgumentException(
                    "Reference data not found for instrument: " + instrument
            );
        }

        return response;
    }
}