package com.vierge.pinpadsdk.utils;

import androidx.room.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class Binary {
    public static ArrayList<Byte> IntegerToArrayBinary(Integer num, Integer num2) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        int iA = 0;
        String strConcat = String.format("%x", num);
        while (strConcat.length() < num2.intValue() * 2) {
            strConcat = "0".concat(strConcat);
        }
        while (iA < num2.intValue()) {
            int i10 = iA * 2;
            iA = a.a((byte) Integer.parseInt(strConcat.substring(i10, i10 + 2), 16), arrayList, iA, 1);
        }
        return arrayList;
    }
}
