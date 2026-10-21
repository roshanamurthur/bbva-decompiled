package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class DSTU7624Mac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DSTU7624Engine f88855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f88856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f88857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f88858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f88859i = false;

    public DSTU7624Mac(int i10, int i11) {
        this.f88855e = new DSTU7624Engine(i10);
        int i12 = i10 / 8;
        this.f88854d = i12;
        this.f88853c = i11 / 8;
        this.f88856f = new byte[i12];
        this.f88858h = new byte[i12];
        this.f88857g = new byte[i12];
        this.f88851a = new byte[i12];
    }

    public final void a(int i10, byte[] bArr) {
        b(this.f88856f, bArr, i10, this.f88857g);
        this.f88855e.processBlock(this.f88857g, 0, this.f88856f, 0);
    }

    public final void b(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        int length = bArr.length;
        int i11 = this.f88854d;
        if (length < i11 || bArr2.length - i10 < i11 || bArr3.length < i11) {
            throw new IllegalArgumentException("some of input buffers too short");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            bArr3[i12] = (byte) (bArr[i12] ^ bArr2[i12 + i10]);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        int i11 = this.f88852b;
        byte[] bArr2 = this.f88851a;
        if (i11 % bArr2.length != 0) {
            throw new DataLengthException("input must be a multiple of blocksize");
        }
        b(this.f88856f, bArr2, 0, this.f88857g);
        b(this.f88857g, this.f88858h, 0, this.f88856f);
        DSTU7624Engine dSTU7624Engine = this.f88855e;
        byte[] bArr3 = this.f88856f;
        dSTU7624Engine.processBlock(bArr3, 0, bArr3, 0);
        int i12 = this.f88853c;
        if (i12 + i10 > bArr.length) {
            throw new OutputLengthException("output buffer too short");
        }
        System.arraycopy(bArr3, 0, bArr, i10, i12);
        reset();
        return i12;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "DSTU7624Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88853c;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to DSTU7624Mac");
        }
        this.f88855e.init(true, cipherParameters);
        this.f88859i = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Arrays.fill(this.f88856f, (byte) 0);
        Arrays.fill(this.f88857g, (byte) 0);
        byte[] bArr = this.f88858h;
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(this.f88851a, (byte) 0);
        DSTU7624Engine dSTU7624Engine = this.f88855e;
        dSTU7624Engine.reset();
        if (this.f88859i) {
            dSTU7624Engine.processBlock(bArr, 0, bArr, 0);
        }
        this.f88852b = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        int i10 = this.f88852b;
        byte[] bArr = this.f88851a;
        if (i10 == bArr.length) {
            a(0, bArr);
            this.f88852b = 0;
        }
        int i11 = this.f88852b;
        this.f88852b = i11 + 1;
        bArr[i11] = b10;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("can't have a negative input length!");
        }
        int blockSize = this.f88855e.getBlockSize();
        int i12 = this.f88852b;
        int i13 = blockSize - i12;
        byte[] bArr2 = this.f88851a;
        if (i11 > i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i13);
            a(0, bArr2);
            this.f88852b = 0;
            i11 -= i13;
            i10 += i13;
            while (i11 > blockSize) {
                a(i10, bArr);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, bArr2, this.f88852b, i11);
        this.f88852b += i11;
    }
}
