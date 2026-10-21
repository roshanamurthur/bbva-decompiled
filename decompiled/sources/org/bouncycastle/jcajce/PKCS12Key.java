package org.bouncycastle.jcajce;

import org.bouncycastle.crypto.PBEParametersGenerator;

/* JADX INFO: loaded from: classes6.dex */
public class PKCS12Key implements PBKDFKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char[] f89687p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f89688q0;

    public PKCS12Key(char[] cArr) {
        this(cArr, false);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        boolean z10 = this.f89688q0;
        char[] cArr = this.f89687p0;
        return (z10 && cArr.length == 0) ? new byte[2] : PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS12";
    }

    public char[] getPassword() {
        return this.f89687p0;
    }

    public PKCS12Key(char[] cArr, boolean z10) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.f89687p0 = cArr2;
        this.f89688q0 = z10;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }
}
