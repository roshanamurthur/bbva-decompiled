package org.bouncycastle.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class ScryptKeySpec implements KeySpec {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char[] f90297p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f90298q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f90299r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f90300s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f90301t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f90302u0;

    public ScryptKeySpec(char[] cArr, byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f90297p0 = cArr;
        this.f90298q0 = Arrays.clone(bArr);
        this.f90299r0 = i10;
        this.f90300s0 = i11;
        this.f90301t0 = i12;
        this.f90302u0 = i13;
    }

    public int getBlockSize() {
        return this.f90300s0;
    }

    public int getCostParameter() {
        return this.f90299r0;
    }

    public int getKeyLength() {
        return this.f90302u0;
    }

    public int getParallelizationParameter() {
        return this.f90301t0;
    }

    public char[] getPassword() {
        return this.f90297p0;
    }

    public byte[] getSalt() {
        return Arrays.clone(this.f90298q0);
    }
}
