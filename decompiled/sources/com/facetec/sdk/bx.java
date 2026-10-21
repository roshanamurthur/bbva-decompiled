package com.facetec.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Random;
import java.util.UUID;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
final class bx {
    public static String a(String str) {
        int iNextInt = new Random().nextInt(8);
        int i10 = iNextInt + 2;
        String strReplace = UUID.randomUUID().toString().replace(Constant.DASH_STRING, "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strReplace.substring(0, 1));
        sb2.append(i10);
        sb2.append(strReplace.substring(2));
        String string = sb2.toString();
        int length = (strReplace.length() - 1) - i10;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string.substring(0, i10));
        sb3.append(str.charAt(0));
        sb3.append(string.substring(iNextInt + 3));
        String string2 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string2.substring(0, length));
        sb4.append(str.charAt(1));
        sb4.append(string2.substring(length + 1));
        return sb4.toString();
    }

    public static String b(String str) {
        int iNextInt = new Random().nextInt(8);
        int i10 = iNextInt + 2;
        String strReplace = UUID.randomUUID().toString().replace(Constant.DASH_STRING, "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strReplace.substring(0, 1));
        sb2.append(i10);
        sb2.append(strReplace.substring(2));
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string.substring(0, i10));
        sb3.append(str);
        sb3.append(string.substring(iNextInt + 3));
        return sb3.toString();
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected() & (activeNetworkInfo.getType() == 1)) {
                return true;
            }
        }
        return false;
    }
}
