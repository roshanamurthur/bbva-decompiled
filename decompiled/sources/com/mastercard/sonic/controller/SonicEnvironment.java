package com.mastercard.sonic.controller;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SonicController.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/controller/SonicEnvironment;", "", "SANDBOX", "PRODUCTION", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SonicEnvironment {
    private static final /* synthetic */ SonicEnvironment[] $VALUES;
    public static final SonicEnvironment PRODUCTION;
    public static final SonicEnvironment SANDBOX;

    static {
        SonicEnvironment sonicEnvironment = new SonicEnvironment("SANDBOX", 0);
        SANDBOX = sonicEnvironment;
        SonicEnvironment sonicEnvironment2 = new SonicEnvironment("PRODUCTION", 1);
        PRODUCTION = sonicEnvironment2;
        $VALUES = new SonicEnvironment[]{sonicEnvironment, sonicEnvironment2};
    }

    public SonicEnvironment() {
        throw null;
    }

    public static SonicEnvironment valueOf(String str) {
        return (SonicEnvironment) Enum.valueOf(SonicEnvironment.class, str);
    }

    public static SonicEnvironment[] values() {
        return (SonicEnvironment[]) $VALUES.clone();
    }
}
