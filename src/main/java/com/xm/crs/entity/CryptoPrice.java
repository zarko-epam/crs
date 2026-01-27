package com.xm.crs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public record CryptoPrice(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        LocalDateTime timestamp,
        String symbol,
        BigDecimal price
) {}