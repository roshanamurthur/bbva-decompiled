package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f89689r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f89690s0;

    public PKCS12KeyWithParameters(char[] cArr, boolean z10, byte[] bArr, int i10) {
        super(cArr, z10);
        this.f89689r0 = Arrays.clone(bArr);
        this.f89690s0 = i10;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f89690s0;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f89689r0;
    }

    public PKCS12KeyWithParameters(char[] cArr, byte[] bArr, int i10) {
        super(cArr);
        this.f89689r0 = Arrays.clone(bArr);
        this.f89690s0 = i10;
    }
}
