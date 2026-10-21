package com.noknok.android.client.asm.core.uaf;

/* JADX INFO: loaded from: classes11.dex */
public class AAIDUtil {
    public static final String AKID_FPS = "0000";
    public static final String AKID_MOCK = "8000";
    public static final String AKID_SFT = "8000";
    public static final String AKID_WB = "0000";

    public static String getTokenAKId(String str, String str2) {
        String[] strArrSplit = str.split("#");
        return String.format("%s#%s", strArrSplit[0], String.format("%04X", Integer.valueOf(Integer.parseInt(strArrSplit[1], 16) | Integer.parseInt(str2, 16))));
    }
}
