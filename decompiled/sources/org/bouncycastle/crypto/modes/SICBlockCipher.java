package org.bouncycastle.crypto.modes;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockCipher f89159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f89161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f89162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f89163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f89164g;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.f89159b = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f89160c = blockSize;
        this.f89161d = new byte[blockSize];
        this.f89162e = new byte[blockSize];
        this.f89163f = new byte[blockSize];
        this.f89164g = 0;
    }

    public final void a() {
        if (this.f89161d.length >= this.f89160c) {
            return;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f89161d;
            if (i10 == bArr.length) {
                return;
            }
            if (this.f89162e[i10] != bArr[i10]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
            i10++;
        }
    }

    public final void b(int i10) {
        byte b10;
        byte[] bArr = this.f89162e;
        int length = bArr.length - i10;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b10 = (byte) (bArr[length] - 1);
            bArr[length] = b10;
        } while (b10 == -1);
    }

    public final void c(int i10) {
        byte b10;
        byte[] bArr = this.f89162e;
        int length = bArr.length - i10;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
        } while (b10 == 0);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) throws IllegalStateException, DataLengthException {
        int i10 = this.f89164g;
        byte[] bArr = this.f89162e;
        byte[] bArr2 = this.f89163f;
        if (i10 == 0) {
            this.f89159b.processBlock(bArr, 0, bArr2, 0);
            int i11 = this.f89164g;
            this.f89164g = i11 + 1;
            return (byte) (b10 ^ bArr2[i11]);
        }
        int i12 = i10 + 1;
        this.f89164g = i12;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        if (i12 == bArr.length) {
            this.f89164g = 0;
            c(0);
            a();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89159b.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89159b.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.f89162e;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i10 = length - 1;
        while (i10 >= 1) {
            byte[] bArr3 = this.f89161d;
            int i11 = i10 < bArr3.length ? (bArr2[i10] & 255) - (bArr3[i10] & 255) : bArr2[i10] & 255;
            if (i11 < 0) {
                int i12 = i10 - 1;
                bArr2[i12] = (byte) (bArr2[i12] - 1);
                i11 += 256;
            }
            bArr2[i10] = (byte) i11;
            i10--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * ((long) this.f89160c)) + ((long) this.f89164g);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
        this.f89161d = bArrClone;
        int length = bArrClone.length;
        int i10 = this.f89160c;
        if (i10 < length) {
            throw new IllegalArgumentException(b.a("CTR/SIC mode requires IV no greater than: ", i10, " bytes."));
        }
        int i11 = 8 > i10 / 2 ? i10 / 2 : 8;
        if (i10 - bArrClone.length <= i11) {
            if (parametersWithIV.getParameters() != null) {
                this.f89159b.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (i10 - i11) + " bytes.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, this.f89160c, bArr2, i11);
        return this.f89160c;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.f89162e;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.f89161d;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f89159b.reset();
        this.f89164g = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j10) {
        reset();
        return skip(j10);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j10) {
        int i10;
        byte[] bArr = this.f89162e;
        int i11 = this.f89160c;
        if (j10 >= 0) {
            long j11 = i11;
            long j12 = (((long) this.f89164g) + j10) / j11;
            long j13 = j12;
            if (j12 > 255) {
                for (int i12 = 5; i12 >= 1; i12--) {
                    long j14 = 1 << (i12 * 8);
                    while (j13 >= j14) {
                        c(i12);
                        j13 -= j14;
                    }
                }
            }
            int i13 = (int) j13;
            byte b10 = bArr[bArr.length - 1];
            int length = bArr.length - 1;
            bArr[length] = (byte) (bArr[length] + i13);
            if (b10 != 0 && bArr[bArr.length - 1] < b10) {
                c(1);
            }
            this.f89164g = (int) ((((long) this.f89164g) + j10) - (j11 * j12));
            i10 = 0;
        } else {
            long j15 = i11;
            long j16 = ((-j10) - ((long) this.f89164g)) / j15;
            long j17 = j16;
            if (j16 > 255) {
                for (int i14 = 5; i14 >= 1; i14--) {
                    long j18 = 1 << (i14 * 8);
                    while (j17 > j18) {
                        b(i14);
                        j17 -= j18;
                    }
                }
            }
            for (long j19 = 0; j19 != j17; j19++) {
                b(0);
            }
            i10 = 0;
            int i15 = (int) ((j15 * j16) + ((long) this.f89164g) + j10);
            if (i15 >= 0) {
                this.f89164g = 0;
            } else {
                b(0);
                this.f89164g = i11 + i15;
            }
        }
        a();
        this.f89159b.processBlock(bArr, i10, this.f89163f, i10);
        return j10;
    }
}
