package com.mastercard.mpsdk.mcbp.mcmlite.apdu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Iso7816 {
    private static final /* synthetic */ Iso7816[] $VALUES;
    public static int CLA_OFFSET = 0;
    public static final int C_DATA_OFFSET = 5;
    public static final Iso7816 INSTANCE;
    public static int INS_OFFSET = 1;
    public static final int LC_OFFSET = 4;
    public static int P1_OFFSET = 2;
    public static int P2_OFFSET = 3;
    public static final char SW_CLA_NOT_SUPPORTED = 28160;
    public static final char SW_CONDITIONS_NOT_SATISFIED = 27013;
    public static final char SW_FILE_NOT_FOUND = 27266;
    public static final char SW_INCORRECT_P1P2 = 27270;
    public static final char SW_INS_NOT_SUPPORTED = 27904;
    public static final char SW_NO_ERROR = 36864;
    public static final char SW_RECORD_NOT_FOUND = 27267;
    public static final char SW_SECURITY_STATUS_NOT_SATISFIED = 27010;
    public static final char SW_UNKNOWN = 28416;
    public static final char SW_WRONG_LENGTH = 26368;

    static {
        Iso7816 iso7816 = new Iso7816("INSTANCE", 0);
        INSTANCE = iso7816;
        $VALUES = new Iso7816[]{iso7816};
    }

    public Iso7816() {
        throw null;
    }

    public static Iso7816 valueOf(String str) {
        return (Iso7816) Enum.valueOf(Iso7816.class, str);
    }

    public static Iso7816[] values() {
        return (Iso7816[]) $VALUES.clone();
    }
}
