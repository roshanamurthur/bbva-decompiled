package org.bouncycastle.jcajce;

import org.bouncycastle.crypto.CharToByteConverter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class PBKDF2Key implements PBKDFKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char[] f89683p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CharToByteConverter f89684q0;

    public PBKDF2Key(char[] cArr, CharToByteConverter charToByteConverter) {
        this.f89683p0 = Arrays.clone(cArr);
        this.f89684q0 = charToByteConverter;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f89684q0.convert(this.f89683p0);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f89684q0.getType();
    }

    public char[] getPassword() {
        return this.f89683p0;
    }
}
