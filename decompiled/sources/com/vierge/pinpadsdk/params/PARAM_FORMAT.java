package com.vierge.pinpadsdk.params;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class PARAM_FORMAT {
    private static final /* synthetic */ PARAM_FORMAT[] $VALUES;
    public static final PARAM_FORMAT ALFA;
    public static final PARAM_FORMAT ALFANUMERIC;
    public static final PARAM_FORMAT BINARY;
    public static final PARAM_FORMAT BOLEAN;
    public static final PARAM_FORMAT FILEAPK;
    public static final PARAM_FORMAT HEXADECIMAL;
    public static final PARAM_FORMAT NUMERIC;
    public static final PARAM_FORMAT TAG;

    static {
        PARAM_FORMAT param_format = new PARAM_FORMAT("ALFANUMERIC", 0);
        ALFANUMERIC = param_format;
        PARAM_FORMAT param_format2 = new PARAM_FORMAT("NUMERIC", 1);
        NUMERIC = param_format2;
        PARAM_FORMAT param_format3 = new PARAM_FORMAT("ALFA", 2);
        ALFA = param_format3;
        PARAM_FORMAT param_format4 = new PARAM_FORMAT("FILEAPK", 3);
        FILEAPK = param_format4;
        PARAM_FORMAT param_format5 = new PARAM_FORMAT("BOLEAN", 4);
        BOLEAN = param_format5;
        PARAM_FORMAT param_format6 = new PARAM_FORMAT("BINARY", 5);
        BINARY = param_format6;
        PARAM_FORMAT param_format7 = new PARAM_FORMAT("HEXADECIMAL", 6);
        HEXADECIMAL = param_format7;
        PARAM_FORMAT param_format8 = new PARAM_FORMAT("TAG", 7);
        TAG = param_format8;
        $VALUES = new PARAM_FORMAT[]{param_format, param_format2, param_format3, param_format4, param_format5, param_format6, param_format7, param_format8};
    }

    public PARAM_FORMAT() {
        throw null;
    }

    public static PARAM_FORMAT valueOf(String str) {
        return (PARAM_FORMAT) Enum.valueOf(PARAM_FORMAT.class, str);
    }

    public static PARAM_FORMAT[] values() {
        return (PARAM_FORMAT[]) $VALUES.clone();
    }
}
