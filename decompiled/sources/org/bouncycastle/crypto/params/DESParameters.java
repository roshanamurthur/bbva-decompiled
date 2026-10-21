package org.bouncycastle.crypto.params;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;

/* JADX INFO: loaded from: classes5.dex */
public class DESParameters extends KeyParameter {
    public static final int DES_KEY_LENGTH = 8;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final byte[] f89220q0 = {1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.CVR_B1b41_1110_ONLINE_PIN, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, Constants.CVR_B1b41_1110_ONLINE_PIN, -15, Constants.CVR_B1b41_1110_ONLINE_PIN, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, Constants.CVR_B1b41_1110_ONLINE_PIN, -2, Constants.CVR_B1b41_1110_ONLINE_PIN, -2, 1, 31, 1, 31, 1, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, Constants.CVR_B1b41_1110_ONLINE_PIN, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, Constants.CVR_B1b41_1110_ONLINE_PIN, -15, Constants.CVR_B1b41_1110_ONLINE_PIN, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, Constants.CVR_B1b41_1110_ONLINE_PIN, -2, Constants.CVR_B1b41_1110_ONLINE_PIN, 31, 1, 31, 1, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, -2, -32, -2, -32, -2, -15, -2, -15};

    public DESParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0)) {
            throw new IllegalArgumentException("attempt to create weak DES key");
        }
    }

    public static boolean isWeakKey(byte[] bArr, int i10) {
        if (bArr.length - i10 < 8) {
            throw new IllegalArgumentException("key material too short.");
        }
        for (int i11 = 0; i11 < 16; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                if (bArr[i12 + i10] != f89220q0[(i11 * 8) + i12]) {
                }
            }
            return true;
        }
        return false;
    }

    public static void setOddParity(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = (byte) (((((b10 >> 7) ^ ((((((b10 >> 1) ^ (b10 >> 2)) ^ (b10 >> 3)) ^ (b10 >> 4)) ^ (b10 >> 5)) ^ (b10 >> 6))) ^ 1) & 1) | (b10 & 254));
        }
    }
}
