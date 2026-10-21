package net.lingala.zip4j.crypto.engine;

import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public class ZipCryptoEngine {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f84932b = new int[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f84933a = new int[3];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 = (i11 & 1) == 1 ? (i11 >>> 1) ^ (-306674912) : i11 >>> 1;
            }
            f84932b[i10] = i11;
        }
    }

    public byte decryptByte() {
        int i10 = this.f84933a[2] | 2;
        return (byte) ((i10 * (i10 ^ 1)) >>> 8);
    }

    public void initKeys(char[] cArr) {
        int[] iArr = this.f84933a;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (byte b10 : Zip4jUtil.convertCharArrayToByteArray(cArr)) {
            updateKeys((byte) (b10 & 255));
        }
    }

    public void updateKeys(byte b10) {
        int[] iArr = this.f84933a;
        int i10 = iArr[0];
        int[] iArr2 = f84932b;
        int i11 = iArr2[(b10 ^ i10) & 255] ^ (i10 >>> 8);
        iArr[0] = i11;
        int i12 = iArr[1] + (i11 & 255);
        iArr[1] = i12;
        int i13 = (i12 * 134775813) + 1;
        iArr[1] = i13;
        int i14 = iArr[2];
        iArr[2] = iArr2[(i14 ^ ((byte) (i13 >> 24))) & 255] ^ (i14 >>> 8);
    }
}
