package org.bouncycastle.crypto.modes;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class CFBBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f88974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f88975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BlockCipher f88978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f88979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88980i;

    public CFBBlockCipher(BlockCipher blockCipher, int i10) {
        super(blockCipher);
        this.f88978g = null;
        if (i10 < 8 || i10 % 8 != 0) {
            throw new IllegalArgumentException(b.a("CFB", i10, " not supported"));
        }
        this.f88978g = blockCipher;
        int i11 = i10 / 8;
        this.f88977f = i11;
        this.f88973b = new byte[blockCipher.getBlockSize()];
        this.f88974c = new byte[blockCipher.getBlockSize()];
        this.f88975d = new byte[blockCipher.getBlockSize()];
        this.f88976e = new byte[i11];
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) throws IllegalStateException, DataLengthException {
        byte b11;
        boolean z10 = this.f88979h;
        int i10 = this.f88977f;
        byte[] bArr = this.f88976e;
        BlockCipher blockCipher = this.f88978g;
        byte[] bArr2 = this.f88974c;
        byte[] bArr3 = this.f88975d;
        if (z10) {
            if (this.f88980i == 0) {
                blockCipher.processBlock(bArr2, 0, bArr3, 0);
            }
            int i11 = this.f88980i;
            b11 = (byte) (b10 ^ bArr3[i11]);
            int i12 = i11 + 1;
            this.f88980i = i12;
            bArr[i11] = b11;
            if (i12 == i10) {
                this.f88980i = 0;
                System.arraycopy(bArr2, i10, bArr2, 0, bArr2.length - i10);
                System.arraycopy(bArr, 0, bArr2, bArr2.length - i10, i10);
            }
        } else {
            if (this.f88980i == 0) {
                blockCipher.processBlock(bArr2, 0, bArr3, 0);
            }
            int i13 = this.f88980i;
            bArr[i13] = b10;
            int i14 = i13 + 1;
            this.f88980i = i14;
            b11 = (byte) (b10 ^ bArr3[i13]);
            if (i14 == i10) {
                this.f88980i = 0;
                System.arraycopy(bArr2, i10, bArr2, 0, bArr2.length - i10);
                System.arraycopy(bArr, 0, bArr2, bArr2.length - i10, i10);
            }
        }
        return b11;
    }

    public int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, this.f88977f, bArr2, i11);
        return this.f88977f;
    }

    public int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, this.f88977f, bArr2, i11);
        return this.f88977f;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f88978g.getAlgorithmName() + "/CFB" + (this.f88977f * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f88977f;
    }

    public byte[] getCurrentIV() {
        return Arrays.clone(this.f88974c);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f88979h = z10;
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f88978g;
        if (!z11) {
            reset();
            if (cipherParameters != null) {
                blockCipher.init(true, cipherParameters);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        byte[] bArr = this.f88973b;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            for (int i10 = 0; i10 < bArr.length - iv.length; i10++) {
                bArr[i10] = 0;
            }
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        if (parametersWithIV.getParameters() != null) {
            blockCipher.init(true, parametersWithIV.getParameters());
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, this.f88977f, bArr2, i11);
        return this.f88977f;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.f88974c;
        byte[] bArr2 = this.f88973b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        Arrays.fill(this.f88976e, (byte) 0);
        this.f88980i = 0;
        this.f88978g.reset();
    }
}
