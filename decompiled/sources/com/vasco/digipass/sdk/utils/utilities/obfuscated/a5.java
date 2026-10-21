package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.BlockCipher;
import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.DataLengthException;
import bc.org.bouncycastle.crypto.params.ParametersWithIV;
import bc.org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class a5 extends g5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockCipher f65927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f65928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f65929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f65930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f65931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65932g;

    public a5(BlockCipher blockCipher) {
        super(blockCipher);
        this.f65927b = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f65928c = blockSize;
        this.f65929d = new byte[blockSize];
        this.f65930e = new byte[blockSize];
        this.f65931f = new byte[blockSize];
        this.f65932g = 0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g5
    public byte a(byte b10) throws IllegalStateException, DataLengthException {
        int i10 = this.f65932g;
        if (i10 == 0) {
            this.f65927b.processBlock(this.f65930e, 0, this.f65931f, 0);
            byte[] bArr = this.f65931f;
            int i11 = this.f65932g;
            this.f65932g = i11 + 1;
            return (byte) (b10 ^ bArr[i11]);
        }
        byte[] bArr2 = this.f65931f;
        int i12 = i10 + 1;
        this.f65932g = i12;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        if (i12 == this.f65930e.length) {
            this.f65932g = 0;
            a(0);
            a();
        }
        return b11;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f65927b.getAlgorithmName() + "/SIC";
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f65927b.getBlockSize();
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
        this.f65929d = bArrClone;
        int i10 = this.f65928c;
        if (i10 < bArrClone.length) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.c(new StringBuilder("CTR/SIC mode requires IV no greater than: "), this.f65928c, " bytes."));
        }
        int i11 = i10 / 2;
        if (8 <= i11) {
            i11 = 8;
        }
        if (i10 - bArrClone.length <= i11) {
            if (parametersWithIV.getParameters() != null) {
                this.f65927b.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.f65928c - i11) + " bytes.");
        }
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        a(bArr, i10, this.f65928c, bArr2, i11);
        return this.f65928c;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.f65930e, (byte) 0);
        byte[] bArr = this.f65929d;
        System.arraycopy(bArr, 0, this.f65930e, 0, bArr.length);
        this.f65927b.reset();
        this.f65932g = 0;
    }

    private void a() {
        if (this.f65929d.length >= this.f65928c) {
            return;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f65929d;
            if (i10 == bArr.length) {
                return;
            }
            if (this.f65930e[i10] != bArr[i10]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
            i10++;
        }
    }

    private void a(int i10) {
        byte b10;
        int length = this.f65930e.length - i10;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.f65930e;
            b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
        } while (b10 == 0);
    }
}
