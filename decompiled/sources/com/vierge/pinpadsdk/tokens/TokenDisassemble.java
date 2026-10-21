package com.vierge.pinpadsdk.tokens;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TokenDisassemble {
    public static void getTokenFromMessage(ArrayList<Short> arrayList, Map<String, String> map) {
        int i10 = 0;
        boolean z10 = true;
        boolean z11 = true;
        while (i10 < arrayList.size() - 11) {
            if (arrayList.get(i10).shortValue() == 33 && arrayList.get(i10 + 1).shortValue() == 32) {
                int i11 = i10 + 9;
                if (arrayList.get(i11).shortValue() == 32) {
                    int i12 = i10 + 4;
                    Short[] shArr = (Short[]) arrayList.subList(i10 + 2, i12).toArray(new Short[2]);
                    Short[] shArr2 = (Short[]) arrayList.subList(i12, i11).toArray(new Short[5]);
                    int i13 = Integer.parseInt(String.format("%c%c%c%c%c", shArr2[0], shArr2[1], shArr2[2], shArr2[3], shArr2[4]));
                    int i14 = i13 + 10 + i10;
                    Short[] shArr3 = (Short[]) arrayList.subList(i10, i14).toArray(new Short[i14 - i10]);
                    i10 += i13 + 9;
                    String str = String.format("%c%c", shArr[0], shArr[1]);
                    if (str.compareTo("EZ") == 0) {
                        if (z10) {
                            z10 = false;
                        } else {
                            str = "EZ2";
                        }
                    }
                    if (str.compareTo("EY") == 0) {
                        if (z11) {
                            z11 = false;
                        } else {
                            str = "EY2";
                        }
                    }
                    String strH = "";
                    for (Short sh2 : shArr3) {
                        strH = u.h("%c", new Object[]{sh2}, c.d(strH));
                    }
                    map.put(str, strH);
                }
            }
            i10++;
        }
    }
}
