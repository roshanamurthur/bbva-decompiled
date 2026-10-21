package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class bdn extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54573s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f54574r0;

    public bdn(boolean z10, String str) {
        super(z10);
        this.f54574r0 = str;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        bdn bdnVar = (bdn) objArr[0];
        int i13 = f54573s0 + 76;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        String str = bdnVar.f54574r0;
        int i17 = (((i15 ^ 97) | (i15 & 97)) << 1) - (((~i15) & 97) | (i15 & (-98)));
        f54573s0 = i17 % 128;
        if (i17 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String setOnFocusChangeListener() {
        return (String) setY(new Object[]{this}, -11270140, 11270140, System.identityHashCode(this));
    }
}
