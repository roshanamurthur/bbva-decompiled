package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class azw extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54215s0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final azz f54216r0;

    public azw(boolean z10, azz azzVar) {
        super(z10);
        this.f54216r0 = azzVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        azw azwVar = (azw) objArr[0];
        int i13 = f54215s0;
        int i14 = i13 & 81;
        int i15 = (i14 - (~(-(-((i13 ^ 81) | i14))))) - 1;
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        azz azzVar = azwVar.f54216r0;
        if (i17 != 0) {
            throw null;
        }
        int i18 = i16 & 63;
        int i19 = (i16 | 63) & (~i18);
        int i20 = i18 << 1;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        f54215s0 = i21 % 128;
        if (i21 % 2 != 0) {
            return azzVar;
        }
        throw null;
    }

    public final azz setDividerPadding() {
        return (azz) setDividerPadding(new Object[]{this}, 2097715784, -2097715784, System.identityHashCode(this));
    }
}
