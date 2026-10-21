package com.vierge.pinpadsdk.utils;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes6.dex */
public class Logs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f67595a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f67596b = true;
    public static Set<Categories> categories = new HashSet();

    public static String a() {
        if (!f67596b) {
            return "";
        }
        try {
            return Constant.BRACKET_OPEN + new Throwable().getStackTrace()[2].getFileName() + Constant.BRACKET_CLOSE;
        } catch (Exception unused) {
            f67596b = false;
            return "";
        }
    }

    public static String b() {
        if (!f67595a) {
            return "";
        }
        try {
            return Constant.BRACKET_OPEN + new Throwable().getStackTrace()[2].getMethodName() + Constant.BRACKET_CLOSE;
        } catch (Exception unused) {
            f67595a = false;
            return "";
        }
    }

    public static void write(String str, byte[] bArr, Categories categories2) {
        if (categories.contains(Categories.debug)) {
            String strB = b();
            StringBuilder sbD = c.d(strB);
            sbD.append(a());
            sbD.append(strB);
            String string = sbD.toString();
            PrintStream printStream = System.out;
            printStream.println(string);
            printStream.println(str);
        }
        String strH = "";
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 % 30 != 0) {
                strH = u.h("%02X ", new Object[]{Byte.valueOf(bArr[i10])}, c.d(strH));
            } else {
                System.out.println(strH);
                strH = u.h("%02X ", new Object[]{Byte.valueOf(bArr[i10])}, new StringBuilder(""));
            }
        }
        System.out.println(strH);
    }

    public static void write(String str, short[] sArr, Categories categories2) {
        if (categories.contains(Categories.debug)) {
            String strB = b();
            StringBuilder sbD = c.d(strB);
            sbD.append(a());
            sbD.append(strB);
            String string = sbD.toString();
            PrintStream printStream = System.out;
            printStream.println(string);
            printStream.println(str);
        }
        String strH = "";
        for (int i10 = 0; i10 < sArr.length; i10++) {
            if (i10 % 30 != 0) {
                strH = u.h("%02X ", new Object[]{Short.valueOf(sArr[i10])}, c.d(strH));
            } else {
                System.out.println(strH);
                strH = u.h("%02X ", new Object[]{Short.valueOf(sArr[i10])}, new StringBuilder(""));
            }
        }
        System.out.println(strH);
    }

    public static void write(String str, ArrayList<Short> arrayList, Categories categories2) {
        if (categories.contains(Categories.debug)) {
            String strB = b();
            StringBuilder sbD = c.d(strB);
            sbD.append(a());
            sbD.append(strB);
            String string = sbD.toString();
            PrintStream printStream = System.out;
            printStream.println(string);
            printStream.println(str);
        }
        String strH = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i10 % 30 == 0) {
                System.out.println(strH);
                strH = "";
            } else {
                strH = u.h("%02X ", new Object[]{arrayList.get(i10)}, c.d(strH));
            }
        }
        System.out.println(strH);
    }

    public static void write(String str, String str2, Categories categories2) {
        if (categories.contains(categories2)) {
            String strB = b();
            StringBuilder sbD = c.d(strB);
            sbD.append(a());
            sbD.append(strB);
            String string = sbD.toString();
            PrintStream printStream = System.out;
            printStream.println(string);
            printStream.println(str);
            printStream.println(str2);
        }
    }

    public static void write(String str, Categories categories2) {
        if (categories.contains(categories2)) {
            String strB = b();
            StringBuilder sbD = c.d(strB);
            sbD.append(a());
            sbD.append(strB);
            String string = sbD.toString();
            PrintStream printStream = System.out;
            printStream.println(string);
            printStream.println(str);
        }
    }

    public static void write(String str) {
        if (categories.contains(Categories.debug)) {
            String strB = b();
            StringBuilder sbD = c.d(strB);
            sbD.append(a());
            sbD.append(strB);
            String string = sbD.toString();
            PrintStream printStream = System.out;
            printStream.println(string);
            printStream.println(str);
        }
    }

    public static void write(boolean z10) {
        if (categories.contains(Categories.debug)) {
            String strB = b();
            StringBuilder sbD = c.d(strB);
            sbD.append(a());
            sbD.append(strB);
            String string = sbD.toString();
            PrintStream printStream = System.out;
            printStream.println(string);
            printStream.println(z10);
        }
    }
}
