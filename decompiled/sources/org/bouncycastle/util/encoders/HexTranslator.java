package org.bouncycastle.util.encoders;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class HexTranslator implements Translator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f91647a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102};

    @Override // org.bouncycastle.util.encoders.Translator
    public int decode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = (i14 * 2) + i10;
            byte b10 = bArr[i15];
            byte b11 = bArr[i15 + 1];
            if (b10 < 97) {
                bArr2[i12] = (byte) ((b10 - 48) << 4);
            } else {
                bArr2[i12] = (byte) ((b10 - 87) << 4);
            }
            if (b11 < 97) {
                bArr2[i12] = (byte) (bArr2[i12] + ((byte) (b11 - 48)));
            } else {
                bArr2[i12] = (byte) (bArr2[i12] + ((byte) (b11 - 87)));
            }
            i12++;
        }
        return i13;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int encode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            int i15 = i12 + i14;
            byte[] bArr3 = f91647a;
            bArr2[i15] = bArr3[(bArr[i10] >> 4) & 15];
            bArr2[i15 + 1] = bArr3[bArr[i10] & 15];
            i10++;
            i13++;
            i14 += 2;
        }
        return i11 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getDecodedBlockSize() {
        return 1;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getEncodedBlockSize() {
        return 2;
    }
}
