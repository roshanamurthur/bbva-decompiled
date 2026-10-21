package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class baq extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54343s0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f54344r0;

    public baq(boolean z10, String str) {
        super(z10);
        this.f54344r0 = str;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        baq baqVar = (baq) objArr[0];
        int i13 = f54343s0;
        int i14 = i13 & 79;
        int i15 = (i13 ^ 79) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        String str = baqVar.f54344r0;
        if (i18 != 0) {
            int i19 = 20 / 0;
        }
        int i20 = i17 & 73;
        int i21 = (i17 | 73) & (~i20);
        int i22 = -(-(i20 << 1));
        int i23 = (i21 & i22) + (i21 | i22);
        f54343s0 = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 11 / 0;
        }
        return str;
    }

    public final String setDividerPadding() {
        return (String) setDividerPadding(new Object[]{this}, 1182771546, -1182771546, System.identityHashCode(this));
    }
}
