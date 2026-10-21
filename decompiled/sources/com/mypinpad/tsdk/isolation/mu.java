package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57154a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57155b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        String x4;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ((~i15) * 497) + (i11 * (-496)) + (i10 * (-496));
        int i17 = ~(i15 | i12);
        int i18 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i18 | i13))) * 497) + ((i17 | (~(i14 | i18 | i10))) * 497) + i16 != 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp = (getDynamicButtonIconTextSpacingDp) objArr[1];
            Throwable th2 = (Throwable) objArr[2];
            int i19 = f57155b;
            int i20 = i19 & 71;
            int i21 = ((i19 ^ 71) | i20) << 1;
            int i22 = -((i19 | 71) & (~i20));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f57154a = i23 % 128;
            int i24 = i23 % 2;
            mq mqVar = mq.INSTANCE;
            if (getdynamicbuttonicontextspacingdp != null) {
                int i25 = f57155b;
                int i26 = ((i25 | 4) << 1) - (i25 ^ 4);
                int i27 = (i26 ^ (-1)) + (i26 << 1);
                f57154a = i27 % 128;
                int i28 = i27 % 2;
                x4 = getdynamicbuttonicontextspacingdp.setX();
                int i29 = f57155b;
                int i30 = i29 & 77;
                int i31 = i30 + ((i29 ^ 77) | i30);
                f57154a = i31 % 128;
                int i32 = i31 % 2;
            } else {
                int i33 = f57155b;
                int i34 = ((i33 | 93) << 1) - (i33 ^ 93);
                f57154a = i34 % 128;
                int i35 = i34 % 2;
                x4 = null;
            }
            mqVar.setY(iIntValue, x4, th2);
            int i36 = f57154a;
            int i37 = i36 & 25;
            int i38 = (i36 ^ 25) | i37;
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            f57155b = i39 % 128;
            int i40 = i39 % 2;
        } else {
            int iIntValue2 = ((Number) objArr[0]).intValue();
            getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp2 = (getDynamicButtonIconTextSpacingDp) objArr[1];
            Throwable th3 = (Throwable) objArr[2];
            int iIntValue3 = ((Number) objArr[3]).intValue();
            int i41 = f57155b;
            int i42 = i41 + 31;
            f57154a = i42 % 128;
            int i43 = i42 % 2;
            if ((iIntValue3 & 2) != 0) {
                int i44 = i41 & 123;
                int i45 = i44 + ((i41 ^ 123) | i44);
                f57154a = i45 % 128;
                int i46 = i45 % 2;
                int i47 = ((-1) << 1) - ((i41 + 58) ^ (-1));
                f57154a = i47 % 128;
                int i48 = i47 % 2;
                getdynamicbuttonicontextspacingdp2 = null;
            }
            if ((iIntValue3 & 4) != 0) {
                int i49 = i41 + 29;
                int i50 = i49 % 128;
                f57154a = i50;
                int i51 = i49 % 2;
                int i52 = i50 ^ 101;
                int i53 = -(-((i50 & 101) << 1));
                int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                f57155b = i54 % 128;
                int i55 = i54 % 2;
                th3 = null;
            }
            setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue2), getdynamicbuttonicontextspacingdp2, th3}, -1087921663, 1087921663, iIntValue2);
            int i56 = f57155b;
            int i57 = i56 & 87;
            int i58 = -(-((i56 ^ 87) | i57));
            int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
            f57154a = i59 % 128;
            int i60 = i59 % 2;
        }
        return null;
    }

    public static final void setX(int i10, @Nullable getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp, @Nullable Throwable th2) {
        setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10), getdynamicbuttonicontextspacingdp, th2}, -1087921663, 1087921663, i10);
    }
}
