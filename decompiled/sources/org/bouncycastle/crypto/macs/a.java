package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f88952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f88953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BlockCipher f88956e;

    public final void a(byte[] bArr, int i10, byte[] bArr2) throws IllegalStateException, DataLengthException {
        int i11 = this.f88955d;
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        BlockCipher blockCipher = this.f88956e;
        byte[] bArr3 = this.f88953b;
        byte[] bArr4 = this.f88954c;
        blockCipher.processBlock(bArr3, 0, bArr4, 0);
        for (int i12 = 0; i12 < i11; i12++) {
            bArr2[i12] = (byte) (bArr4[i12] ^ bArr[i10 + i12]);
        }
        System.arraycopy(bArr3, i11, bArr3, 0, bArr3.length - i11);
        System.arraycopy(bArr2, 0, bArr3, bArr3.length - i11, i11);
    }
}
