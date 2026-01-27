package com.xm.crs.controller;

import org.springframework.web.bind.annotation.*;

import com.xm.crs.service.ICryptoPriceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CryptoPriceController {

    private final ICryptoPriceService cryptoPriceService;

}
