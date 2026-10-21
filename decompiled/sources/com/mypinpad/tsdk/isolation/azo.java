package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class azo extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54210s0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f54211r0;

    public azo(boolean z10, String str) {
        super(z10);
        this.f54211r0 = str;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        azo azoVar = (azo) objArr[0];
        int i13 = f54210s0;
        int i14 = i13 & 95;
        int i15 = i13 | 95;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        String str = azoVar.f54211r0;
        int i19 = ((i17 & 70) + (i17 | 70)) - 1;
        f54210s0 = i19 % 128;
        int i20 = i19 % 2;
        return str;
    }

    public final String setCompoundDrawableTintBlendMode() {
        return (String) setY(new Object[]{this}, 1834578482, -1834578482, System.identityHashCode(this));
    }
}
