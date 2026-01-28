package com.xm.crs.entity;

import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

@Embeddable
public record CryptoPriceId(
        LocalDateTime timestamp,
        String symbol) {
}
