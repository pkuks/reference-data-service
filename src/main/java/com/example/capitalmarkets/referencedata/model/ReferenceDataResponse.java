package com.example.capitalmarkets.referencedata.model;

import java.math.BigDecimal;

public record ReferenceDataResponse(
        String instrument,
        BigDecimal valuationPrice,
        String currency
) {
}
