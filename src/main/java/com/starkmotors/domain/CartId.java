package com.starkmotors.domain;

import java.util.UUID;

class CartId {
    private UUID uuid;

    public CartId(UUID uuid) {
        this.uuid = uuid;
    }

    public static CartId newCarId() {
        return new CartId(UUID.randomUUID());
    }
}
