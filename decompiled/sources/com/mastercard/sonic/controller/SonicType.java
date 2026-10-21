package com.mastercard.sonic.controller;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SonicController.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/controller/SonicType;", "", "SOUND_AND_ANIMATION", "SOUND_ONLY", "ANIMATION_ONLY", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SonicType {
    private static final /* synthetic */ SonicType[] $VALUES;
    public static final SonicType ANIMATION_ONLY;
    public static final SonicType SOUND_AND_ANIMATION;
    public static final SonicType SOUND_ONLY;

    static {
        SonicType sonicType = new SonicType("SOUND_AND_ANIMATION", 0);
        SOUND_AND_ANIMATION = sonicType;
        SonicType sonicType2 = new SonicType("SOUND_ONLY", 1);
        SOUND_ONLY = sonicType2;
        SonicType sonicType3 = new SonicType("ANIMATION_ONLY", 2);
        ANIMATION_ONLY = sonicType3;
        $VALUES = new SonicType[]{sonicType, sonicType2, sonicType3};
    }

    public SonicType() {
        throw null;
    }

    public static SonicType valueOf(String str) {
        return (SonicType) Enum.valueOf(SonicType.class, str);
    }

    public static SonicType[] values() {
        return (SonicType[]) $VALUES.clone();
    }
}
