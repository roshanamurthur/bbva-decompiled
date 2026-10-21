package com.google.android.gms.internal.wearable;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
final class zzv {
    final int tag;
    final byte[] zzhm;

    public zzv(int i10, byte[] bArr) {
        this.tag = i10;
        this.zzhm = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzv)) {
            return false;
        }
        zzv zzvVar = (zzv) obj;
        return this.tag == zzvVar.tag && Arrays.equals(this.zzhm, zzvVar.zzhm);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzhm) + ((this.tag + 527) * 31);
    }
}
