package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f60968a = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60969b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60970c = 1;

    static {
        int i10 = (1 - (-92)) - 1;
        f60969b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void a(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i14 = ~i10;
        if ((((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13 != 1) {
            byte[] bArr = (byte[]) objArr[0];
            int[] iArr = (int[]) objArr[1];
            int i15 = f60970c;
            int i16 = (i15 & 21) + (i15 | 21);
            f60969b = i16 % 128;
            int i17 = i16 % 2;
            s1.a(new Object[]{bArr, iArr}, -445789198, 445789198, (int) System.currentTimeMillis());
            int i18 = f60969b;
            int i19 = (i18 ^ 35) + ((i18 & 35) << 1);
            f60970c = i19 % 128;
            int i20 = i19 % 2;
            return;
        }
        int[] iArr2 = (int[]) objArr[0];
        int[] iArr3 = (int[]) objArr[1];
        int i21 = f60970c;
        int i22 = i21 & 33;
        int i23 = i21 | 33;
        int i24 = (i22 & i23) + (i23 | i22);
        f60969b = i24 % 128;
        int i25 = i24 % 2;
        int[] iArr4 = f60968a;
        if (i25 != 0) {
            int i26 = iArr2[1];
            ((Integer) auy.setOnFocusChangeListener(new Object[]{0, iArr2, iArr4, iArr3}, -1557277485, 1557277512, 0)).intValue();
            onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{iArr3, 1}, 214036312, -214036269, 1);
        } else {
            int i27 = (~iArr2[0]) & 1;
            ((Integer) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(i27), iArr2, iArr4, iArr3}, -1557277485, 1557277512, i27)).intValue();
            onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{iArr3, 1}, 214036312, -214036269, 1);
        }
        ((Integer) onFocusChangeListener).intValue();
        int i28 = f60970c;
        int i29 = ((i28 & (-38)) | ((~i28) & 37)) + ((i28 & 37) << 1);
        f60969b = i29 % 128;
        if (i29 % 2 != 0) {
            throw null;
        }
    }
}
