package com.starkmotors.domain;

import java.util.UUID;

class AccessoryId {
    private UUID uuid;

    public AccessoryId(UUID uuid) {
        this.uuid = uuid;
    }

    public static AccessoryId newAccessoryId() {
        return new AccessoryId(UUID.randomUUID());
    }
}
