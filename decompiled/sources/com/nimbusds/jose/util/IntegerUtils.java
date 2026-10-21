package com.nimbusds.jose.util;

/* JADX INFO: loaded from: classes10.dex */
public class IntegerUtils {
    public static byte[] toBytes(int i10) {
        return new byte[]{(byte) (i10 >>> 24), (byte) ((i10 >>> 16) & 255), (byte) ((i10 >>> 8) & 255), (byte) (i10 & 255)};
    }
}
