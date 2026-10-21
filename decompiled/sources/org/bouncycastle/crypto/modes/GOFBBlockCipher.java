package org.bouncycastle.crypto.modes;

import android.R;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class GOFBBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f89070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BlockCipher f89073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f89074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f89075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f89076j;

    public GOFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.f89074h = true;
        this.f89073g = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f89072f = blockSize;
        if (blockSize != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.f89068b = new byte[blockCipher.getBlockSize()];
        this.f89069c = new byte[blockCipher.getBlockSize()];
        this.f89070d = new byte[blockCipher.getBlockSize()];
    }

    public static int a(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr[i10 + 2] << 16) & 16711680) + ((bArr[i10 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i10] & 255);
    }

    public static void b(int i10, int i11, byte[] bArr) {
        bArr[i11 + 3] = (byte) (i10 >>> 24);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        int i10 = this.f89071e;
        byte[] bArr = this.f89070d;
        byte[] bArr2 = this.f89069c;
        if (i10 == 0) {
            boolean z10 = this.f89074h;
            BlockCipher blockCipher = this.f89073g;
            if (z10) {
                this.f89074h = false;
                blockCipher.processBlock(bArr2, 0, bArr, 0);
                this.f89075i = a(0, bArr);
                this.f89076j = a(4, bArr);
            }
            int i11 = this.f89075i + R.attr.cacheColorHint;
            this.f89075i = i11;
            int i12 = this.f89076j;
            int i13 = i12 + R.attr.hand_minute;
            this.f89076j = i13;
            if (i13 < 16843012 && i13 > 0) {
                this.f89076j = i12 + R.attr.format;
            }
            b(i11, 0, bArr2);
            b(this.f89076j, 4, bArr2);
            blockCipher.processBlock(bArr2, 0, bArr, 0);
        }
        int i14 = this.f89071e;
        int i15 = i14 + 1;
        this.f89071e = i15;
        byte b11 = (byte) (b10 ^ bArr[i14]);
        int i16 = this.f89072f;
        if (i15 == i16) {
            this.f89071e = 0;
            System.arraycopy(bArr2, i16, bArr2, 0, bArr2.length - i16);
            System.arraycopy(bArr, 0, bArr2, bArr2.length - i16, i16);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89073g.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89072f;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f89074h = true;
        this.f89075i = 0;
        this.f89076j = 0;
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f89073g;
        if (z11) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.f89068b;
            if (length < bArr.length) {
                System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                for (int i10 = 0; i10 < bArr.length - iv.length; i10++) {
                    bArr[i10] = 0;
                }
            } else {
                System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            reset();
            if (parametersWithIV.getParameters() == null) {
                return;
            } else {
                cipherParameters = parametersWithIV.getParameters();
            }
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            }
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, this.f89072f, bArr2, i11);
        return this.f89072f;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.f89074h = true;
        this.f89075i = 0;
        this.f89076j = 0;
        byte[] bArr = this.f89069c;
        byte[] bArr2 = this.f89068b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f89071e = 0;
        this.f89073g.reset();
    }
}
