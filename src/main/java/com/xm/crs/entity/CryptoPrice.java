package com.xm.crs.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public record CryptoPrice(
        @EmbeddedId
        CryptoPriceId id,
        BigDecimal price
) {}