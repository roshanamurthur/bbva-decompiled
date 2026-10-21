package org.bouncycastle.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class TLSKeyMaterialSpec implements KeySpec {
    public static final String KEY_EXPANSION = "key expansion";
    public static final String MASTER_SECRET = "master secret";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f90305p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f90306q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f90307r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f90308s0;

    public TLSKeyMaterialSpec(byte[] bArr, String str, int i10, byte[]... bArr2) {
        this.f90305p0 = Arrays.clone(bArr);
        this.f90306q0 = str;
        this.f90307r0 = i10;
        this.f90308s0 = Arrays.concatenate(bArr2);
    }

    public String getLabel() {
        return this.f90306q0;
    }

    public int getLength() {
        return this.f90307r0;
    }

    public byte[] getSecret() {
        return Arrays.clone(this.f90305p0);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f90308s0);
    }
}
