package org.bouncycastle.jcajce;

import org.bouncycastle.crypto.CharToByteConverter;

/* JADX INFO: loaded from: classes6.dex */
public class PBKDF1Key implements PBKDFKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char[] f89679p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CharToByteConverter f89680q0;

    public PBKDF1Key(char[] cArr, CharToByteConverter charToByteConverter) {
        char[] cArr2 = new char[cArr.length];
        this.f89679p0 = cArr2;
        this.f89680q0 = charToByteConverter;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f89680q0.convert(this.f89679p0);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f89680q0.getType();
    }

    public char[] getPassword() {
        return this.f89679p0;
    }
}
