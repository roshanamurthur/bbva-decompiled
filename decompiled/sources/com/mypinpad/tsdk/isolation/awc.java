package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class awc extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54042s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final awa f54043r0;

    public awc(boolean z10, awa awaVar) {
        super(z10);
        this.f54043r0 = awaVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        awc awcVar = (awc) objArr[0];
        int i13 = f54042s0;
        int i14 = i13 & 7;
        int i15 = (i13 | 7) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 & i16) + (i15 | i16);
        int i18 = i17 % 128;
        int i19 = i17 % 2;
        awa awaVar = awcVar.f54043r0;
        int i20 = i18 + 119;
        f54042s0 = i20 % 128;
        if (i20 % 2 == 0) {
            return awaVar;
        }
        throw null;
    }

    public final awa setCompoundDrawableTintBlendMode() {
        return (awa) setY(new Object[]{this}, -450809005, 450809005, System.identityHashCode(this));
    }
}
