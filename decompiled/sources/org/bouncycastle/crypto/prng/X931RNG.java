package org.bouncycastle.crypto.prng;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import org.bouncycastle.crypto.BlockCipher;

/* JADX INFO: loaded from: classes5.dex */
public class X931RNG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f89441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntropySource f89442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f89444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f89445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f89446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f89447g = 1;

    public X931RNG(BlockCipher blockCipher, byte[] bArr, EntropySource entropySource) {
        this.f89441a = blockCipher;
        this.f89442b = entropySource;
        byte[] bArr2 = new byte[blockCipher.getBlockSize()];
        this.f89443c = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f89444d = new byte[blockCipher.getBlockSize()];
        this.f89445e = new byte[blockCipher.getBlockSize()];
    }

    public final int a(boolean z10, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = this.f89445e;
        if (bArr4.length == 8) {
            if (this.f89447g > SvgConstantsKt.SPECIFIED_FONT_WEIGHT) {
                return -1;
            }
            if (bArr != null && bArr.length > 512) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (this.f89447g > SvgConstantsKt.SPECIFIED_MARKER_END) {
                return -1;
            }
            if (bArr != null && bArr.length > 32768) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        BlockCipher blockCipher = this.f89441a;
        if (z10 || this.f89446f == null) {
            byte[] entropy = this.f89442b.getEntropy();
            this.f89446f = entropy;
            if (entropy.length != blockCipher.getBlockSize()) {
                throw new IllegalStateException("Insufficient entropy returned");
            }
        }
        int length = bArr.length / bArr4.length;
        int i10 = 0;
        while (true) {
            bArr2 = this.f89443c;
            bArr3 = this.f89444d;
            if (i10 >= length) {
                break;
            }
            blockCipher.processBlock(bArr2, 0, bArr3, 0);
            b(bArr4, bArr3, this.f89446f);
            b(this.f89446f, bArr4, bArr3);
            System.arraycopy(bArr4, 0, bArr, bArr4.length * i10, bArr4.length);
            for (int length2 = bArr2.length - 1; length2 >= 0; length2--) {
                byte b10 = (byte) (bArr2[length2] + 1);
                bArr2[length2] = b10;
                if (b10 != 0) {
                    break;
                }
            }
            i10++;
        }
        int length3 = bArr.length - (bArr4.length * length);
        if (length3 > 0) {
            blockCipher.processBlock(bArr2, 0, bArr3, 0);
            b(bArr4, bArr3, this.f89446f);
            b(this.f89446f, bArr4, bArr3);
            System.arraycopy(bArr4, 0, bArr, length * bArr4.length, length3);
            for (int length4 = bArr2.length - 1; length4 >= 0; length4--) {
                byte b11 = (byte) (bArr2[length4] + 1);
                bArr2[length4] = b11;
                if (b11 != 0) {
                    break;
                }
            }
        }
        this.f89447g++;
        return bArr.length;
    }

    public final void b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = (byte) (bArr2[i10] ^ bArr3[i10]);
        }
        this.f89441a.processBlock(bArr, 0, bArr, 0);
    }
}
