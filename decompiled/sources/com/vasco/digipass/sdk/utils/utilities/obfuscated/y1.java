package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f66434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66435b;

    public y1(byte[] bArr, int i10) {
        this.f66434a = bArr;
        this.f66435b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        if (y1Var.f66435b != this.f66435b) {
            return false;
        }
        return Arrays.areEqual(this.f66434a, y1Var.f66434a);
    }

    public int hashCode() {
        return this.f66435b ^ Arrays.hashCode(this.f66434a);
    }
}
