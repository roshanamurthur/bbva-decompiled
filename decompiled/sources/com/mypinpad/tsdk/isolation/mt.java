package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class mt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57152a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57153b = 1;

    public static final void setCompoundDrawableTintBlendMode(@NotNull String str) {
        setX(new Object[]{str}, 1760239564, -1760239563, (int) System.currentTimeMillis());
    }

    public static final void setOnFocusChangeListener(@NotNull String str) {
        setX(new Object[]{str}, 1189439426, -1189439420, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        switch (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19) {
            case 1:
                String str = (String) objArr[0];
                int i22 = f57153b;
                int i23 = (((i22 | 24) << 1) - (i22 ^ 24)) - 1;
                f57152a = i23 % 128;
                int i24 = i23 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                ms.INSTANCE.setCompoundDrawableTintBlendMode(setHorizontalScrollbarOverlay.setOnDragListener, str);
                int i25 = f57152a;
                int i26 = (i25 ^ 51) + ((i25 & 51) << 1);
                f57153b = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 2:
                String str2 = (String) objArr[1];
                int i28 = f57153b;
                int i29 = (-2) - ((((i28 | 2) << 1) - (i28 ^ 2)) ^ (-1));
                f57152a = i29 % 128;
                int i30 = i29 % 2;
                setX(new Object[]{str2}, 1893969717, -1893969717, (int) System.currentTimeMillis());
                int i31 = f57152a;
                int i32 = i31 & 109;
                int i33 = (i31 ^ 109) | i32;
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                f57153b = i34 % 128;
                if (i34 % 2 == 0) {
                    int i35 = 83 / 0;
                }
                return null;
            case 3:
                String str3 = (String) objArr[1];
                int i36 = f57153b;
                int i37 = ((i36 & (-4)) | ((~i36) & 3)) + ((i36 & 3) << 1);
                f57152a = i37 % 128;
                if (i37 % 2 == 0) {
                    setX(new Object[]{str3}, 1189439426, -1189439420, (int) System.currentTimeMillis());
                    return null;
                }
                setX(new Object[]{str3}, 1189439426, -1189439420, (int) System.currentTimeMillis());
                throw null;
            case 4:
                String str4 = (String) objArr[0];
                int i38 = f57152a;
                int i39 = i38 & 55;
                int i40 = ((((i38 ^ 55) | i39) << 1) - (~(-((i38 | 55) & (~i39))))) - 1;
                f57153b = i40 % 128;
                int i41 = i40 % 2;
                Intrinsics.checkNotNullParameter(str4, "");
                ms.INSTANCE.setCompoundDrawableTintBlendMode(setHorizontalScrollbarOverlay.setOnLongClickListener, str4);
                int i42 = f57153b;
                int i43 = (i42 & (-82)) | ((~i42) & 81);
                int i44 = (i42 & 81) << 1;
                int i45 = (i43 & i44) + (i44 | i43);
                f57152a = i45 % 128;
                int i46 = i45 % 2;
                return null;
            case 5:
                String str5 = (String) objArr[0];
                int i47 = f57152a;
                int i48 = i47 & 23;
                int i49 = -(-((i47 ^ 23) | i48));
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                f57153b = i50 % 128;
                if (i50 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str5, "");
                    ms.INSTANCE.setCompoundDrawableTintBlendMode(setHorizontalScrollbarOverlay.setCompoundDrawableTintBlendMode, str5);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str5, "");
                ms.INSTANCE.setCompoundDrawableTintBlendMode(setHorizontalScrollbarOverlay.setCompoundDrawableTintBlendMode, str5);
                int i51 = f57152a + 75;
                f57153b = i51 % 128;
                int i52 = i51 % 2;
                return null;
            case 6:
                String str6 = (String) objArr[0];
                int i53 = f57152a;
                int i54 = ((i53 ^ 19) | (i53 & 19)) << 1;
                int i55 = -(((~i53) & 19) | (i53 & (-20)));
                int i56 = (i54 & i55) + (i55 | i54);
                f57153b = i56 % 128;
                int i57 = i56 % 2;
                Intrinsics.checkNotNullParameter(str6, "");
                ms.INSTANCE.setCompoundDrawableTintBlendMode(setHorizontalScrollbarOverlay.setY, str6);
                int i58 = f57153b;
                int i59 = i58 & 61;
                int i60 = (i58 | 61) & (~i59);
                int i61 = -(-(i59 << 1));
                int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                f57152a = i62 % 128;
                if (i62 % 2 != 0) {
                    throw null;
                }
                return null;
            case 7:
                String str7 = (String) objArr[1];
                int i63 = f57153b;
                int i64 = (i63 & 19) + (i63 | 19);
                f57152a = i64 % 128;
                int i65 = i64 % 2;
                setX(new Object[]{str7}, 383964057, -383964053, (int) System.currentTimeMillis());
                int i66 = f57153b + 69;
                f57152a = i66 % 128;
                int i67 = i66 % 2;
                return null;
            case 8:
                String str8 = (String) objArr[1];
                int i68 = f57152a + 31;
                f57153b = i68 % 128;
                if (i68 % 2 != 0) {
                    setX(new Object[]{str8}, 937406799, -937406794, (int) System.currentTimeMillis());
                    return null;
                }
                setX(new Object[]{str8}, 937406799, -937406794, (int) System.currentTimeMillis());
                throw null;
            case 9:
                int i69 = f57153b;
                int i70 = ((i69 | 25) << 1) - (i69 ^ 25);
                f57152a = i70 % 128;
                if (i70 % 2 != 0) {
                    setX(new Object[]{""}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                    throw null;
                }
                setX(new Object[]{""}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                int i71 = f57153b + 9;
                f57152a = i71 % 128;
                if (i71 % 2 != 0) {
                    throw null;
                }
                return null;
            default:
                String str9 = (String) objArr[0];
                int i72 = f57152a;
                int i73 = i72 & 1;
                int i74 = i73 + ((i72 ^ 1) | i73);
                f57153b = i74 % 128;
                int i75 = i74 % 2;
                Intrinsics.checkNotNullParameter(str9, "");
                ms.INSTANCE.setCompoundDrawableTintBlendMode(setHorizontalScrollbarOverlay.setX, str9);
                int i76 = f57152a;
                int i77 = (i76 ^ 51) + ((i76 & 51) << 1);
                f57153b = i77 % 128;
                int i78 = i77 % 2;
                return null;
        }
    }

    public static final void setY(@NotNull String str) {
        setX(new Object[]{str}, 383964057, -383964053, (int) System.currentTimeMillis());
    }
}
