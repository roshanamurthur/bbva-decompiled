package com.viergegroup.sdk.taptophone.vierge;

import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public class UtilsJava {
    public static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static final int LENGTH = 20;

    public static String generateSerialNumber() {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 20; i10++) {
            sb2.append(CHARACTERS.charAt(random.nextInt(36)));
        }
        return sb2.toString();
    }

    public int validateParameterClosePosTip() {
        return 0;
    }
}
