package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.BlockCipher;
import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.DataLengthException;
import bc.org.bouncycastle.crypto.params.ParametersWithIV;
import bc.org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class q0 extends g5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f66257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f66258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f66259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f66260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BlockCipher f66262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f66264i;

    public q0(BlockCipher blockCipher, int i10) {
        super(blockCipher);
        this.f66262g = blockCipher;
        this.f66261f = i10 / 8;
        this.f66257b = new byte[blockCipher.getBlockSize()];
        this.f66258c = new byte[blockCipher.getBlockSize()];
        this.f66259d = new byte[blockCipher.getBlockSize()];
        this.f66260e = new byte[this.f66261f];
    }

    private byte b(byte b10) {
        if (this.f66264i == 0) {
            this.f66262g.processBlock(this.f66258c, 0, this.f66259d, 0);
        }
        byte[] bArr = this.f66260e;
        int i10 = this.f66264i;
        bArr[i10] = b10;
        byte[] bArr2 = this.f66259d;
        int i11 = i10 + 1;
        this.f66264i = i11;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        int i12 = this.f66261f;
        if (i11 == i12) {
            this.f66264i = 0;
            byte[] bArr3 = this.f66258c;
            System.arraycopy(bArr3, i12, bArr3, 0, bArr3.length - i12);
            byte[] bArr4 = this.f66260e;
            byte[] bArr5 = this.f66258c;
            int length = bArr5.length;
            int i13 = this.f66261f;
            System.arraycopy(bArr4, 0, bArr5, length - i13, i13);
        }
        return b11;
    }

    private byte c(byte b10) {
        if (this.f66264i == 0) {
            this.f66262g.processBlock(this.f66258c, 0, this.f66259d, 0);
        }
        byte[] bArr = this.f66259d;
        int i10 = this.f66264i;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        byte[] bArr2 = this.f66260e;
        int i11 = i10 + 1;
        this.f66264i = i11;
        bArr2[i10] = b11;
        int i12 = this.f66261f;
        if (i11 == i12) {
            this.f66264i = 0;
            byte[] bArr3 = this.f66258c;
            System.arraycopy(bArr3, i12, bArr3, 0, bArr3.length - i12);
            byte[] bArr4 = this.f66260e;
            byte[] bArr5 = this.f66258c;
            int length = bArr5.length;
            int i13 = this.f66261f;
            System.arraycopy(bArr4, 0, bArr5, length - i13, i13);
        }
        return b11;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g5
    public byte a(byte b10) throws IllegalStateException, DataLengthException {
        return this.f66263h ? c(b10) : b(b10);
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f66262g.getAlgorithmName() + "/CFB" + (this.f66261f * 8);
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f66261f;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f66263h = z10;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            reset();
            if (cipherParameters != null) {
                this.f66262g.init(true, cipherParameters);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        byte[] bArr = this.f66257b;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            int i10 = 0;
            while (true) {
                byte[] bArr2 = this.f66257b;
                if (i10 >= bArr2.length - iv.length) {
                    break;
                }
                bArr2[i10] = 0;
                i10++;
            }
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        if (parametersWithIV.getParameters() != null) {
            this.f66262g.init(true, parametersWithIV.getParameters());
        }
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        a(bArr, i10, this.f66261f, bArr2, i11);
        return this.f66261f;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.f66257b;
        System.arraycopy(bArr, 0, this.f66258c, 0, bArr.length);
        Arrays.fill(this.f66260e, (byte) 0);
        this.f66264i = 0;
        this.f66262g.reset();
    }
}
