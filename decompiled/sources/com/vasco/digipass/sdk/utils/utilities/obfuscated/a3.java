package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
class a3 implements m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int[] f65926a;

    public a3(int[] iArr) {
        this.f65926a = Arrays.clone(iArr);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.m4
    public int a() {
        int[] iArr = this.f65926a;
        return iArr[iArr.length - 1];
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.m4
    public int[] b() {
        return Arrays.clone(this.f65926a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a3) {
            return Arrays.areEqual(this.f65926a, ((a3) obj).f65926a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f65926a);
    }
}
