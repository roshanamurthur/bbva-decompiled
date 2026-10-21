package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class DESedeEngine extends DESEngine {
    protected static final int BLOCK_SIZE = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f88369o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f88370p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f88371q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f88372r;

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to DESede init - "));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 24 && key.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.f88372r = z10;
        byte[] bArr = new byte[8];
        System.arraycopy(key, 0, bArr, 0, 8);
        this.f88369o = generateWorkingKey(z10, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(key, 8, bArr2, 0, 8);
        this.f88370p = generateWorkingKey(!z10, bArr2);
        if (key.length != 24) {
            this.f88371q = this.f88369o;
            return;
        }
        byte[] bArr3 = new byte[8];
        System.arraycopy(key, 16, bArr3, 0, 8);
        this.f88371q = generateWorkingKey(z10, bArr3);
    }

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.f88369o;
        if (iArr == null) {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.f88372r) {
            desFunc(iArr, bArr, i10, bArr3, 0);
            desFunc(this.f88370p, bArr3, 0, bArr3, 0);
            desFunc(this.f88371q, bArr3, 0, bArr2, i11);
        } else {
            desFunc(this.f88371q, bArr, i10, bArr3, 0);
            desFunc(this.f88370p, bArr3, 0, bArr3, 0);
            desFunc(this.f88369o, bArr3, 0, bArr2, i11);
        }
        return 8;
    }

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
