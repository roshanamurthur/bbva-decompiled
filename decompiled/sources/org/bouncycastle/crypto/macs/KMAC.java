package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.CSHAKEDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes4.dex */
public class KMAC implements Mac, Xof {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f88889g = new byte[100];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CSHAKEDigest f88890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88895f;

    public KMAC(int i10, byte[] bArr) {
        this.f88890a = new CSHAKEDigest(i10, Strings.toByteArray("KMAC"), bArr);
        this.f88891b = i10;
        this.f88892c = (i10 * 2) / 8;
    }

    public static byte[] b(long j10) {
        long j11 = j10;
        byte b10 = 1;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b10 = (byte) (b10 + 1);
        }
        byte[] bArr = new byte[b10 + 1];
        bArr[0] = b10;
        for (int i10 = 1; i10 <= b10; i10++) {
            bArr[i10] = (byte) (j10 >> ((b10 - i10) * 8));
        }
        return bArr;
    }

    public static byte[] c(long j10) {
        byte b10 = 1;
        long j11 = j10;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b10 = (byte) (b10 + 1);
        }
        byte[] bArr = new byte[b10 + 1];
        bArr[b10] = b10;
        for (int i10 = 0; i10 < b10; i10++) {
            int i11 = b10 - i10;
            bArr[i11 - 1] = (byte) (j10 >> (i11 * 8));
        }
        return bArr;
    }

    public final void a(int i10, byte[] bArr) throws CloneNotSupportedException {
        byte[] bArrB = b(i10);
        update(bArrB, 0, bArrB.length);
        byte[] bArrConcatenate = Arrays.concatenate(b(bArr.length * 8), bArr);
        update(bArrConcatenate, 0, bArrConcatenate.length);
        int length = i10 - ((bArrB.length + bArrConcatenate.length) % i10);
        if (length <= 0) {
            return;
        }
        while (true) {
            byte[] bArr2 = f88889g;
            if (length <= 100) {
                update(bArr2, 0, length);
                return;
            } else {
                update(bArr2, 0, 100);
                length -= 100;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException, CloneNotSupportedException {
        boolean z10 = this.f88895f;
        CSHAKEDigest cSHAKEDigest = this.f88890a;
        if (z10) {
            if (!this.f88894e) {
                throw new IllegalStateException("KMAC not initialized");
            }
            byte[] bArrC = c(getMacSize() * 8);
            cSHAKEDigest.update(bArrC, 0, bArrC.length);
        }
        int iDoFinal = cSHAKEDigest.doFinal(bArr, i10, getMacSize());
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i10, int i11) {
        boolean z10 = this.f88895f;
        CSHAKEDigest cSHAKEDigest = this.f88890a;
        if (z10) {
            if (!this.f88894e) {
                throw new IllegalStateException("KMAC not initialized");
            }
            byte[] bArrC = c(0L);
            cSHAKEDigest.update(bArrC, 0, bArrC.length);
            this.f88895f = false;
        }
        return cSHAKEDigest.doOutput(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "KMACwith" + this.f88890a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.f88890a.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f88892c;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88892c;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException, CloneNotSupportedException {
        this.f88893d = Arrays.clone(((KeyParameter) cipherParameters).getKey());
        this.f88894e = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() throws CloneNotSupportedException {
        this.f88890a.reset();
        byte[] bArr = this.f88893d;
        if (bArr != null) {
            a(this.f88891b == 128 ? 168 : 136, bArr);
        }
        this.f88895f = true;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        if (!this.f88894e) {
            throw new IllegalStateException("KMAC not initialized");
        }
        this.f88890a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i10, int i11) throws CloneNotSupportedException {
        boolean z10 = this.f88895f;
        CSHAKEDigest cSHAKEDigest = this.f88890a;
        if (z10) {
            if (!this.f88894e) {
                throw new IllegalStateException("KMAC not initialized");
            }
            byte[] bArrC = c(i11 * 8);
            cSHAKEDigest.update(bArrC, 0, bArrC.length);
        }
        int iDoFinal = cSHAKEDigest.doFinal(bArr, i10, i11);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        if (!this.f88894e) {
            throw new IllegalStateException("KMAC not initialized");
        }
        this.f88890a.update(bArr, i10, i11);
    }
}
