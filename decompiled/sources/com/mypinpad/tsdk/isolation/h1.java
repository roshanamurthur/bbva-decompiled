package com.mypinpad.tsdk.isolation;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes10.dex */
public final class h1 extends g1 {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f56123w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final CRLException f56124x0;

    public h1(aoz aozVar, aix aixVar, String str, byte[] bArr, boolean z10, byte[] bArr2, i1.a aVar) {
        super(aozVar, aixVar, str, bArr, z10);
        this.f56123w0 = bArr2;
        this.f56124x0 = aVar;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() throws CRLException {
        System.identityHashCode(this);
        h1 h1Var = (h1) new Object[]{this}[0];
        CRLException cRLException = h1Var.f56124x0;
        if (cRLException != null) {
            throw cRLException;
        }
        byte[] bArr = h1Var.f56123w0;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
