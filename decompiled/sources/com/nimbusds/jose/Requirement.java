package com.nimbusds.jose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Requirement {
    private static final /* synthetic */ Requirement[] $VALUES;
    public static final Requirement OPTIONAL;
    public static final Requirement RECOMMENDED;
    public static final Requirement REQUIRED;

    static {
        Requirement requirement = new Requirement("REQUIRED", 0);
        REQUIRED = requirement;
        Requirement requirement2 = new Requirement("RECOMMENDED", 1);
        RECOMMENDED = requirement2;
        Requirement requirement3 = new Requirement("OPTIONAL", 2);
        OPTIONAL = requirement3;
        $VALUES = new Requirement[]{requirement, requirement2, requirement3};
    }

    public Requirement() {
        throw null;
    }

    public static Requirement valueOf(String str) {
        return (Requirement) Enum.valueOf(Requirement.class, str);
    }

    public static Requirement[] values() {
        return (Requirement[]) $VALUES.clone();
    }
}
