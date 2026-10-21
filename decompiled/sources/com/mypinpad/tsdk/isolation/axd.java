package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class axd implements akk {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54085r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54086s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f54087p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f54088q0;
    public static final axd setX = new axd("falcon-512", 9);
    public static final axd setCompoundDrawableTintBlendMode = new axd("falcon-1024", 10);

    static {
        int i10 = f54085r0;
        int i11 = i10 & 113;
        int i12 = i11 + ((i10 ^ 113) | i11);
        f54086s0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public axd(String str, int i10) {
        if (i10 <= 0 || i10 > 10) {
            throw new IllegalArgumentException("Log N degree should be between 1 and 10");
        }
        this.f54087p0 = str;
        this.f54088q0 = i10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i12;
        if ((((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529)) == 1) {
            axd axdVar = (axd) objArr[0];
            int i17 = f54085r0;
            int i18 = i17 & 13;
            int i19 = ((~i18) & (i17 | 13)) + (i18 << 1);
            f54086s0 = i19 % 128;
            int i20 = i19 % 2;
            String str = axdVar.f54087p0;
            int i21 = (-2) - (((i17 & 74) + (i17 | 74)) ^ (-1));
            f54086s0 = i21 % 128;
            if (i21 % 2 != 0) {
                return str;
            }
            throw null;
        }
        axd axdVar2 = (axd) objArr[0];
        int i22 = f54086s0;
        int i23 = i22 ^ 91;
        int i24 = ((i22 & 91) | i23) << 1;
        int i25 = -i23;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        f54085r0 = i26 % 128;
        int i27 = i26 % 2;
        int i28 = axdVar2.f54088q0;
        if (i27 != 0) {
            throw null;
        }
        int i29 = i22 + 45;
        f54085r0 = i29 % 128;
        int i30 = i29 % 2;
        return Integer.valueOf(i28);
    }

    public final String setDividerPadding() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -722872963, 722872964, System.identityHashCode(this));
    }

    public final int setX() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 861189084, -861189084, System.identityHashCode(this))).intValue();
    }
}
