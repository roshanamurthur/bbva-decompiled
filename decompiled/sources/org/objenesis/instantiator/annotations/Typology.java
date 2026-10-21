package org.objenesis.instantiator.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class Typology {
    private static final /* synthetic */ Typology[] $VALUES;
    public static final Typology NOT_COMPLIANT;
    public static final Typology SERIALIZATION;
    public static final Typology STANDARD;
    public static final Typology UNKNOWN;

    static {
        Typology typology = new Typology("STANDARD", 0);
        STANDARD = typology;
        Typology typology2 = new Typology("SERIALIZATION", 1);
        SERIALIZATION = typology2;
        Typology typology3 = new Typology("NOT_COMPLIANT", 2);
        NOT_COMPLIANT = typology3;
        Typology typology4 = new Typology("UNKNOWN", 3);
        UNKNOWN = typology4;
        $VALUES = new Typology[]{typology, typology2, typology3, typology4};
    }

    public Typology() {
        throw null;
    }

    public static Typology valueOf(String str) {
        return (Typology) Enum.valueOf(Typology.class, str);
    }

    public static Typology[] values() {
        return (Typology[]) $VALUES.clone();
    }
}
