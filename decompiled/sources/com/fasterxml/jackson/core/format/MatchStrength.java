package com.fasterxml.jackson.core.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class MatchStrength {
    private static final /* synthetic */ MatchStrength[] $VALUES;
    public static final MatchStrength FULL_MATCH;
    public static final MatchStrength INCONCLUSIVE;
    public static final MatchStrength NO_MATCH;
    public static final MatchStrength SOLID_MATCH;
    public static final MatchStrength WEAK_MATCH;

    static {
        MatchStrength matchStrength = new MatchStrength("NO_MATCH", 0);
        NO_MATCH = matchStrength;
        MatchStrength matchStrength2 = new MatchStrength("INCONCLUSIVE", 1);
        INCONCLUSIVE = matchStrength2;
        MatchStrength matchStrength3 = new MatchStrength("WEAK_MATCH", 2);
        WEAK_MATCH = matchStrength3;
        MatchStrength matchStrength4 = new MatchStrength("SOLID_MATCH", 3);
        SOLID_MATCH = matchStrength4;
        MatchStrength matchStrength5 = new MatchStrength("FULL_MATCH", 4);
        FULL_MATCH = matchStrength5;
        $VALUES = new MatchStrength[]{matchStrength, matchStrength2, matchStrength3, matchStrength4, matchStrength5};
    }

    public MatchStrength() {
        throw null;
    }

    public static MatchStrength valueOf(String str) {
        return (MatchStrength) Enum.valueOf(MatchStrength.class, str);
    }

    public static MatchStrength[] values() {
        return (MatchStrength[]) $VALUES.clone();
    }
}
