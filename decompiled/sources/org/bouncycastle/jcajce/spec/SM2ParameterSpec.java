package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class SM2ParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90296a;

    public SM2ParameterSpec(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("id string cannot be null");
        }
        this.f90296a = Arrays.clone(bArr);
    }

    public byte[] getID() {
        return Arrays.clone(this.f90296a);
    }
}
