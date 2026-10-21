package com.bumptech.glide;

/* JADX INFO: loaded from: classes9.dex */
public enum MemoryCategory {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);

    private final float multiplier;

    MemoryCategory(float f6) {
        this.multiplier = f6;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
