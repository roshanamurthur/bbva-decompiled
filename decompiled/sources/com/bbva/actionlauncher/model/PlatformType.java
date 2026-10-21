package com.bbva.actionlauncher.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PlatformType.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/actionlauncher/model/PlatformType;", "", "GMS", "HMS", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
public final class PlatformType {
    private static final /* synthetic */ PlatformType[] $VALUES;
    public static final PlatformType GMS;
    public static final PlatformType HMS;

    static {
        PlatformType platformType = new PlatformType("GMS", 0);
        GMS = platformType;
        PlatformType platformType2 = new PlatformType("HMS", 1);
        HMS = platformType2;
        $VALUES = new PlatformType[]{platformType, platformType2};
    }

    public PlatformType() {
        throw null;
    }

    public static PlatformType valueOf(String str) {
        return (PlatformType) Enum.valueOf(PlatformType.class, str);
    }

    public static PlatformType[] values() {
        return (PlatformType[]) $VALUES.clone();
    }
}
