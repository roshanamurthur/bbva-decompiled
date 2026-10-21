package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;
import org.bouncycastle.crypto.CharToByteConverter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class PBKDF1KeyWithParameters extends PBKDF1Key implements PBEKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f89681r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f89682s0;

    public PBKDF1KeyWithParameters(char[] cArr, CharToByteConverter charToByteConverter, byte[] bArr, int i10) {
        super(cArr, charToByteConverter);
        this.f89681r0 = Arrays.clone(bArr);
        this.f89682s0 = i10;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f89682s0;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f89681r0;
    }
}
