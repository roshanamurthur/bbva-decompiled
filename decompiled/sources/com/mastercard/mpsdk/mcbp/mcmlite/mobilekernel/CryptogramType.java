package com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class CryptogramType {
    private static final /* synthetic */ CryptogramType[] $VALUES;
    public static final CryptogramType DE55;
    public static final CryptogramType UCAF;

    static {
        CryptogramType cryptogramType = new CryptogramType("UCAF", 0);
        UCAF = cryptogramType;
        CryptogramType cryptogramType2 = new CryptogramType("DE55", 1);
        DE55 = cryptogramType2;
        $VALUES = new CryptogramType[]{cryptogramType, cryptogramType2};
    }

    public CryptogramType() {
        throw null;
    }

    public static CryptogramType fromString(String str) {
        if (str.equalsIgnoreCase("ucaf")) {
            return UCAF;
        }
        return str.equalsIgnoreCase("de55") ? DE55 : UCAF;
    }

    public static CryptogramType valueOf(String str) {
        return (CryptogramType) Enum.valueOf(CryptogramType.class, str);
    }

    public static CryptogramType[] values() {
        return (CryptogramType[]) $VALUES.clone();
    }
}
