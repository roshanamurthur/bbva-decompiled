package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setColorFilter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59559c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59560d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function3<setHorizontalScrollbarOverlay, String, Throwable, Unit> f59561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function3<Integer, String, Throwable, Unit> f59562b;

    /* JADX WARN: Multi-variable type inference failed */
    public setColorFilter(@NotNull Function3<? super setHorizontalScrollbarOverlay, ? super String, ? super Throwable, Unit> function3, @NotNull Function3<? super Integer, ? super String, ? super Throwable, Unit> function4) {
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(function4, "");
        this.f59561a = function3;
        this.f59562b = function4;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        String x4;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = ((i16 | (~(i13 | i17)) | (~(i14 | i17))) * (-1136)) + (i11 * 569) + (i10 * 569);
        int i19 = i10 | i17;
        switch ((((~i19) | (~(i11 | i17)) | (~(i15 | i12))) * 568) + (((~(i13 | i12)) | (~(i14 | i12)) | (~(i19 | i11))) * (-568)) + i18) {
            case 1:
                setColorFilter setcolorfilter = (setColorFilter) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp = (getDynamicButtonIconTextSpacingDp) objArr[2];
                Throwable th2 = (Throwable) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int i20 = f59560d;
                int i21 = i20 & 81;
                int i22 = (((i20 ^ 81) | i21) << 1) - ((i20 | 81) & (~i21));
                int i23 = i22 % 128;
                f59559c = i23;
                int i24 = i22 % 2;
                if ((iIntValue2 & 2) != 0) {
                    int i25 = (i23 & 99) + (i23 | 99);
                    int i26 = i25 % 128;
                    f59560d = i26;
                    int i27 = i25 % 2;
                    int i28 = (i26 ^ 39) + ((i26 & 39) << 1);
                    f59559c = i28 % 128;
                    int i29 = i28 % 2;
                    getdynamicbuttonicontextspacingdp = null;
                }
                if ((iIntValue2 & 4) != 0) {
                    int i30 = f59559c;
                    int i31 = (((i30 & (-52)) | ((~i30) & 51)) - (~(-(-((i30 & 51) << 1))))) - 1;
                    f59560d = i31 % 128;
                    if (i31 % 2 == 0) {
                        throw null;
                    }
                    th2 = null;
                }
                setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, Integer.valueOf(iIntValue), getdynamicbuttonicontextspacingdp, th2}, -1999045713, 1999045717, iIntValue);
                int i32 = f59559c + 17;
                f59560d = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = 25 / 0;
                }
                return null;
            case 2:
                String str = (String) objArr[0];
                int i34 = f59560d;
                int i35 = (i34 & 39) + (i34 | 39);
                f59559c = i35 % 128;
                int i36 = i35 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Unit unit = Unit.INSTANCE;
                int i37 = f59559c;
                int i38 = i37 & 75;
                int i39 = i37 | 75;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                f59560d = i40 % 128;
                int i41 = i40 % 2;
                return null;
            case 3:
                String str2 = (String) objArr[0];
                int i42 = f59560d;
                int i43 = i42 & 81;
                int i44 = ((((i42 ^ 81) | i43) << 1) - (~(-((i42 | 81) & (~i43))))) - 1;
                f59559c = i44 % 128;
                int i45 = i44 % 2;
                setCompoundDrawableTintBlendMode(new Object[]{str2}, -821746216, 821746227, (int) System.currentTimeMillis());
                int i46 = f59559c;
                int i47 = i46 & 103;
                int i48 = -(-((i46 ^ 103) | i47));
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                f59560d = i49 % 128;
                if (i49 % 2 == 0) {
                    throw null;
                }
                return null;
            case 4:
                setColorFilter setcolorfilter2 = (setColorFilter) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp2 = (getDynamicButtonIconTextSpacingDp) objArr[2];
                Throwable th3 = (Throwable) objArr[3];
                int i50 = f59560d;
                int i51 = ((i50 & (-62)) | ((~i50) & 61)) + ((i50 & 61) << 1);
                f59559c = i51 % 128;
                if (i51 % 2 != 0) {
                    Function3<Integer, String, Throwable, Unit> function3 = setcolorfilter2.f59562b;
                    throw null;
                }
                Function3<Integer, String, Throwable, Unit> function4 = setcolorfilter2.f59562b;
                Integer numValueOf = Integer.valueOf(iIntValue3);
                if (getdynamicbuttonicontextspacingdp2 == null) {
                    int i52 = f59560d;
                    int i53 = i52 ^ 81;
                    int i54 = -(-((i52 & 81) << 1));
                    int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                    f59559c = i55 % 128;
                    int i56 = i55 % 2;
                    x4 = null;
                } else {
                    x4 = getdynamicbuttonicontextspacingdp2.setX();
                    int i57 = f59560d;
                    int i58 = i57 & 19;
                    int i59 = i58 + ((i57 ^ 19) | i58);
                    f59559c = i59 % 128;
                    int i60 = i59 % 2;
                }
                function4.invoke(numValueOf, x4, th3);
                int i61 = f59559c;
                int i62 = (i61 ^ 49) + ((i61 & 49) << 1);
                f59560d = i62 % 128;
                int i63 = i62 % 2;
                return null;
            case 5:
                String str3 = (String) objArr[0];
                int i64 = f59560d;
                int i65 = (i64 & 98) + (i64 | 98);
                int i66 = (i65 ^ (-1)) + (i65 << 1);
                f59559c = i66 % 128;
                if (i66 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str3, "");
                    Unit unit2 = Unit.INSTANCE;
                    return null;
                }
                Intrinsics.checkNotNullParameter(str3, "");
                Unit unit3 = Unit.INSTANCE;
                throw null;
            case 6:
                String str4 = (String) objArr[0];
                int i67 = f59560d + 7;
                f59559c = i67 % 128;
                if (i67 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str4, "");
                    Unit unit4 = Unit.INSTANCE;
                    return null;
                }
                Intrinsics.checkNotNullParameter(str4, "");
                Unit unit5 = Unit.INSTANCE;
                throw null;
            case 7:
                String str5 = (String) objArr[0];
                int i68 = f59559c;
                int i69 = i68 & 43;
                int i70 = (i68 ^ 43) | i69;
                int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                f59560d = i71 % 128;
                int i72 = i71 % 2;
                setCompoundDrawableTintBlendMode(new Object[]{str5}, 1673747418, -1673747410, (int) System.currentTimeMillis());
                int i73 = f59559c;
                int i74 = i73 & 5;
                int i75 = (((i73 ^ 5) | i74) << 1) - ((i73 | 5) & (~i74));
                f59560d = i75 % 128;
                if (i75 % 2 == 0) {
                    int i76 = 0 / 0;
                }
                return null;
            case 8:
                String str6 = (String) objArr[0];
                int i77 = f59560d;
                int i78 = (i77 ^ 85) + ((i77 & 85) << 1);
                f59559c = i78 % 128;
                int i79 = i78 % 2;
                Intrinsics.checkNotNullParameter(str6, "");
                Unit unit6 = Unit.INSTANCE;
                int i80 = f59559c;
                int i81 = (-2) - ((((i80 | 110) << 1) - (i80 ^ 110)) ^ (-1));
                f59560d = i81 % 128;
                if (i81 % 2 == 0) {
                    throw null;
                }
                return null;
            case 9:
                String str7 = (String) objArr[0];
                int i82 = f59559c;
                int i83 = i82 ^ 123;
                int i84 = -(-((i82 & 123) << 1));
                int i85 = (i83 & i84) + (i84 | i83);
                f59560d = i85 % 128;
                if (i85 % 2 == 0) {
                    setCompoundDrawableTintBlendMode(new Object[]{str7}, -1628583384, 1628583386, (int) System.currentTimeMillis());
                    int i86 = 11 / 0;
                } else {
                    setCompoundDrawableTintBlendMode(new Object[]{str7}, -1628583384, 1628583386, (int) System.currentTimeMillis());
                }
                int i87 = f59559c;
                int i88 = (i87 ^ 66) + ((i87 & 66) << 1);
                int i89 = (i88 ^ (-1)) + (i88 << 1);
                f59560d = i89 % 128;
                int i90 = i89 % 2;
                return null;
            case 10:
                String str8 = (String) objArr[0];
                int i91 = f59560d;
                int i92 = (i91 & 35) + (i91 | 35);
                f59559c = i92 % 128;
                int i93 = i92 % 2;
                setCompoundDrawableTintBlendMode(new Object[]{str8}, 640266945, -640266940, (int) System.currentTimeMillis());
                int i94 = f59559c;
                int i95 = (((i94 ^ 41) | (i94 & 41)) << 1) - (((~i94) & 41) | (i94 & (-42)));
                f59560d = i95 % 128;
                int i96 = i95 % 2;
                return null;
            case 11:
                String str9 = (String) objArr[0];
                int i97 = f59560d;
                int i98 = i97 & 19;
                int i99 = ((i97 ^ 19) | i98) << 1;
                int i100 = -((i97 | 19) & (~i98));
                int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
                f59559c = i101 % 128;
                if (i101 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str9, "");
                    Unit unit7 = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str9, "");
                Unit unit8 = Unit.INSTANCE;
                int i102 = f59560d;
                int i103 = (i102 & 113) + (i102 | 113);
                f59559c = i103 % 128;
                if (i103 % 2 != 0) {
                    int i104 = 82 / 0;
                }
                return null;
            default:
                String str10 = (String) objArr[0];
                int i105 = f59559c;
                int i106 = (((i105 | 74) << 1) - (i105 ^ 74)) - 1;
                f59560d = i106 % 128;
                int i107 = i106 % 2;
                setCompoundDrawableTintBlendMode(new Object[]{str10}, 931780620, -931780614, (int) System.currentTimeMillis());
                int i108 = f59560d;
                int i109 = ((i108 & (-90)) | ((~i108) & 89)) + ((i108 & 89) << 1);
                f59559c = i109 % 128;
                if (i109 % 2 != 0) {
                    throw null;
                }
                return null;
        }
    }

    public static void setNavigationOnClickListener(@NotNull String str) {
        setCompoundDrawableTintBlendMode(new Object[]{str}, 1673747418, -1673747410, (int) System.currentTimeMillis());
    }

    public final void setY(int i10, @Nullable getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp, @Nullable Throwable th2) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10), getdynamicbuttonicontextspacingdp, th2}, -1999045713, 1999045717, i10);
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull String str) {
        setCompoundDrawableTintBlendMode(new Object[]{str}, -821746216, 821746227, (int) System.currentTimeMillis());
    }
}
