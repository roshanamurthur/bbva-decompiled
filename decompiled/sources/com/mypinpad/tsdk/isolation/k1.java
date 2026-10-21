package com.mypinpad.tsdk.isolation;

import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class k1 extends j1 {
    public static int E0 = 1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final byte[] f56743x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final CertificateEncodingException f56744y0;

    public k1(aoz aozVar, aiy aiyVar, aiu aiuVar, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, m1.a aVar) {
        super(aozVar, aiyVar, aiuVar, zArr, str, bArr);
        this.f56743x0 = bArr2;
        this.f56744y0 = aVar;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        System.identityHashCode(this);
        k1 k1Var = (k1) new Object[]{this}[0];
        int i10 = E0;
        int i11 = i10 & 33;
        int i12 = (i10 | 33) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        CertificateEncodingException certificateEncodingException = k1Var.f56744y0;
        if (certificateEncodingException != null) {
            int i17 = i15 & 65;
            int i18 = -(-((i15 ^ 65) | i17));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            E0 = i19 % 128;
            int i20 = i19 % 2;
            throw certificateEncodingException;
        }
        byte[] bArr = k1Var.f56743x0;
        if (bArr == null) {
            throw new CertificateEncodingException();
        }
        int i21 = i15 & 93;
        int i22 = i21 + ((i15 ^ 93) | i21);
        E0 = i22 % 128;
        if (i22 % 2 != 0) {
            return bArr;
        }
        throw null;
    }
}
