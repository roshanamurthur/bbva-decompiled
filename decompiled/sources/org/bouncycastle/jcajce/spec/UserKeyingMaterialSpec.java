package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class UserKeyingMaterialSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90309a;

    public UserKeyingMaterialSpec(byte[] bArr) {
        this.f90309a = Arrays.clone(bArr);
    }

    public byte[] getUserKeyingMaterial() {
        return Arrays.clone(this.f90309a);
    }
}
