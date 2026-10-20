package com.example.capitalmarkets.referencedata.controller;

import com.example.capitalmarkets.referencedata.model.ReferenceDataResponse;
import com.example.capitalmarkets.referencedata.service.ReferenceDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reference-data")
public class ReferenceDataController {
    private final ReferenceDataService referenceDataService;

    public ReferenceDataController(ReferenceDataService referenceDataService){
        this.referenceDataService = referenceDataService;
    }

    @GetMapping("/{instrument}")
    public ReferenceDataResponse getReferenceData(
            @PathVariable String instrument
    ){
        return referenceDataService.getReferenceData(instrument);
    }
}
