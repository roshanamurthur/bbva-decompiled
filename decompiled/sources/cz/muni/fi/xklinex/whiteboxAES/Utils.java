package cz.muni.fi.xklinex.whiteboxAES;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class Utils implements Serializable {
    private static final long serialVersionUID = 6444143955262330363L;

    public static long byte2long(byte[] bArr) {
        return (((long) bArr[0]) & 255) | ((((long) bArr[1]) & 255) << 8) | ((((long) bArr[2]) & 255) << 16) | ((255 & ((long) bArr[3])) << 24);
    }

    public static void long2byte(byte[] bArr, long j10) {
        bArr[0] = (byte) (j10 & 255);
        bArr[1] = (byte) ((j10 >>> 8) & 255);
        bArr[2] = (byte) ((j10 >>> 16) & 255);
        bArr[3] = (byte) ((j10 >>> 24) & 255);
    }
}
