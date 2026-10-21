package com.huawei.secure.android.common.util;

import android.util.Base64;

/* JADX INFO: loaded from: classes10.dex */
public class SafeBase64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50663a = "SafeBase64";

    private SafeBase64() {
    }

    public static byte[] decode(byte[] bArr, int i10) {
        try {
            return Base64.decode(bArr, i10);
        } catch (Exception e5) {
            e5.getMessage();
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i10) {
        try {
            return Base64.encode(bArr, i10);
        } catch (Exception e5) {
            e5.getMessage();
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i10) {
        try {
            return Base64.encodeToString(bArr, i10);
        } catch (Exception e5) {
            e5.getMessage();
            return "";
        }
    }

    public static byte[] decode(byte[] bArr, int i10, int i11, int i12) {
        try {
            return Base64.decode(bArr, i10, i11, i12);
        } catch (Exception e5) {
            e5.getMessage();
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i10, int i11, int i12) {
        try {
            return Base64.encode(bArr, i10, i11, i12);
        } catch (Exception e5) {
            e5.getMessage();
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i10, int i11, int i12) {
        try {
            return Base64.encodeToString(bArr, i10, i11, i12);
        } catch (Exception e5) {
            e5.getMessage();
            return "";
        }
    }

    public static byte[] decode(String str, int i10) {
        try {
            return Base64.decode(str, i10);
        } catch (Exception e5) {
            e5.getMessage();
            return new byte[0];
        }
    }
}
