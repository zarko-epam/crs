package com.xm.crs.controller;

import org.springframework.web.bind.annotation.*;

import com.xm.crs.service.ICryptoPriceService;

@RestController
public class CryptoPriceController {

    private final ICryptoPriceService cryptoPriceService;

    public CryptoPriceController(ICryptoPriceService cryptoPriceService) {
        this.cryptoPriceService = cryptoPriceService;
    }
}
