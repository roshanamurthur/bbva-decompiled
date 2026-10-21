package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes3.dex */
public class NullEngine implements BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88508b;

    public NullEngine() {
        this(1);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Null";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f88508b;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f88507a = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        if (!this.f88507a) {
            throw new IllegalStateException("Null engine not initialised");
        }
        int i12 = this.f88508b;
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            bArr2[i11 + i13] = bArr[i10 + i13];
        }
        return i12;
    }

    public NullEngine(int i10) {
        this.f88508b = i10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
