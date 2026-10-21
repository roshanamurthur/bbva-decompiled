package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ajx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52945c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52946d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aph f52947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ajz f52948b;

    public final synchronized aph setCompoundDrawableTintBlendMode() {
        aph aphVar;
        try {
            int i10 = f52945c;
            int i11 = ((i10 | 115) << 1) - (i10 ^ 115);
            f52946d = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (this.f52947a == null) {
                this.f52947a = setDividerPadding();
                int i12 = f52945c + 55;
                f52946d = i12 % 128;
                int i13 = i12 % 2;
            }
            aphVar = this.f52947a;
            int i14 = f52946d;
            int i15 = (i14 & 63) + (i14 | 63);
            f52945c = i15 % 128;
            int i16 = i15 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
        return aphVar;
    }

    public aph setDividerPadding() {
        int i10 = f52946d;
        int i11 = i10 | 65;
        int i12 = (i11 << 1) - ((~(i10 & 65)) & i11);
        f52945c = i12 % 128;
        int i13 = i12 % 2;
        ajz x4 = setX();
        aph aphVar = (aph) ajz.setDividerPadding(new Object[]{x4}, -1237598812, 1237598815, System.identityHashCode(x4));
        int i14 = f52945c + 99;
        f52946d = i14 % 128;
        int i15 = i14 % 2;
        return aphVar;
    }

    public abstract ajz setX();

    public final synchronized ajz setY() {
        ajz ajzVar;
        try {
            int i10 = f52946d;
            int i11 = i10 ^ 63;
            int i12 = ((i10 & 63) | i11) << 1;
            int i13 = -i11;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            int i15 = i14 % 128;
            f52945c = i15;
            if (i14 % 2 != 0) {
                throw null;
            }
            if (this.f52948b == null) {
                int i16 = ((-1) << 1) - ((((i15 | 64) << 1) - (i15 ^ 64)) ^ (-1));
                f52946d = i16 % 128;
                int i17 = i16 % 2;
                this.f52948b = setX();
                int i18 = f52945c;
                int i19 = i18 & 67;
                int i20 = (i18 | 67) & (~i19);
                int i21 = i19 << 1;
                int i22 = (i20 & i21) + (i20 | i21);
                f52946d = i22 % 128;
                int i23 = i22 % 2;
            }
            ajzVar = this.f52948b;
            int i24 = f52946d + 111;
            f52945c = i24 % 128;
            int i25 = i24 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
        return ajzVar;
    }
}
