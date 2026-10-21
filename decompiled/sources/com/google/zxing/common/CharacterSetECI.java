package com.google.zxing.common;

import com.google.zxing.FormatException;
import com.veridas.Veridas;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public enum CharacterSetECI {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2("ISO8859_2", "ISO-8859-2"),
    ISO8859_3("ISO8859_3", "ISO-8859-3"),
    ISO8859_4("ISO8859_4", "ISO-8859-4"),
    ISO8859_5("ISO8859_5", "ISO-8859-5"),
    ISO8859_6("ISO8859_6", "ISO-8859-6"),
    ISO8859_7("ISO8859_7", "ISO-8859-7"),
    ISO8859_8("ISO8859_8", "ISO-8859-8"),
    ISO8859_9("ISO8859_9", "ISO-8859-9"),
    ISO8859_10("ISO8859_10", "ISO-8859-10"),
    ISO8859_11("ISO8859_11", "ISO-8859-11"),
    ISO8859_13("ISO8859_13", "ISO-8859-13"),
    ISO8859_14("ISO8859_14", "ISO-8859-14"),
    ISO8859_15("ISO8859_15", "ISO-8859-15"),
    ISO8859_16("ISO8859_16", "ISO-8859-16"),
    SJIS(StringUtils.SHIFT_JIS, "Shift_JIS"),
    Cp1250("Cp1250", "windows-1250"),
    Cp1251("Cp1251", "windows-1251"),
    Cp1252("Cp1252", "windows-1252"),
    Cp1256("Cp1256", "windows-1256"),
    UnicodeBigUnmarked("UnicodeBigUnmarked", "UTF-16BE", "UnicodeBig"),
    UTF8("UTF8", "UTF-8"),
    ASCII(new int[]{27, 170}, Veridas.US_ASCII),
    Big5(new int[]{28}, new String[0]),
    GB18030("GB18030", StringUtils.GB2312, "EUC_CN", "GBK"),
    EUC_KR("EUC_KR", "EUC-KR");

    private final String[] otherEncodingNames;
    private final int[] values;
    private static final Map<Integer, CharacterSetECI> VALUE_TO_ECI = new HashMap();
    private static final Map<String, CharacterSetECI> NAME_TO_ECI = new HashMap();

    static {
        for (CharacterSetECI characterSetECI : values()) {
            for (int i10 : characterSetECI.values) {
                VALUE_TO_ECI.put(Integer.valueOf(i10), characterSetECI);
            }
            NAME_TO_ECI.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.otherEncodingNames) {
                NAME_TO_ECI.put(str, characterSetECI);
            }
        }
    }

    CharacterSetECI() {
        throw null;
    }

    CharacterSetECI(String str, String... strArr) {
        this.values = new int[]{i};
        this.otherEncodingNames = strArr;
    }

    public static CharacterSetECI getCharacterSetECIByName(String str) {
        return NAME_TO_ECI.get(str);
    }

    public static CharacterSetECI getCharacterSetECIByValue(int i10) throws FormatException {
        if (i10 < 0 || i10 >= 900) {
            throw FormatException.getFormatInstance();
        }
        return VALUE_TO_ECI.get(Integer.valueOf(i10));
    }

    public int getValue() {
        return this.values[0];
    }

    CharacterSetECI(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }
}
