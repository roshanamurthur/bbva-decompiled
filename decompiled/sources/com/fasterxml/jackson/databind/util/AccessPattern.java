package com.fasterxml.jackson.databind.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AccessPattern {
    private static final /* synthetic */ AccessPattern[] $VALUES;
    public static final AccessPattern ALWAYS_NULL;
    public static final AccessPattern CONSTANT;
    public static final AccessPattern DYNAMIC;

    static {
        AccessPattern accessPattern = new AccessPattern("ALWAYS_NULL", 0);
        ALWAYS_NULL = accessPattern;
        AccessPattern accessPattern2 = new AccessPattern("CONSTANT", 1);
        CONSTANT = accessPattern2;
        AccessPattern accessPattern3 = new AccessPattern("DYNAMIC", 2);
        DYNAMIC = accessPattern3;
        $VALUES = new AccessPattern[]{accessPattern, accessPattern2, accessPattern3};
    }

    public AccessPattern() {
        throw null;
    }

    public static AccessPattern valueOf(String str) {
        return (AccessPattern) Enum.valueOf(AccessPattern.class, str);
    }

    public static AccessPattern[] values() {
        return (AccessPattern[]) $VALUES.clone();
    }
}
