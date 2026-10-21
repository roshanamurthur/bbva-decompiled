package org.bouncycastle.jce.provider;

/* JADX INFO: loaded from: classes8.dex */
public interface BrokenPBE {
    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;

    public static class Util {
        public static void a(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                bArr[i10] = (byte) ((((b10 >> 7) ^ ((((((b10 >> 1) ^ (b10 >> 2)) ^ (b10 >> 3)) ^ (b10 >> 4)) ^ (b10 >> 5)) ^ (b10 >> 6))) ^ 1) | (b10 & 254));
            }
        }
    }
}
