package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v2 f66025a = new f3();

    public static byte[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static byte[] a(byte[] bArr, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f66025a.a(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new w2(ci.a.b(e5, new StringBuilder("exception encoding Hex string: ")), e5);
        }
    }

    public static String b(byte[] bArr, int i10, int i11) {
        return k5.b(a(bArr, i10, i11));
    }

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f66025a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new j2(ci.a.b(e5, new StringBuilder("exception decoding Hex string: ")), e5);
        }
    }
}
