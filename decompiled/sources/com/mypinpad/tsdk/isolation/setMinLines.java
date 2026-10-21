package com.mypinpad.tsdk.isolation;

import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c2.b;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setMinLines implements getProcessingResult {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60112j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f60113k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setSupportImageTintList f60114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f60117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f60118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f60119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f60120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f60121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f60122i;

    public setMinLines(@NotNull setSupportImageTintList setsupportimagetintlist, int i10, int i11, int i12, float f6) {
        int iRoundToInt;
        Intrinsics.checkNotNullParameter(setsupportimagetintlist, "");
        this.f60114a = setsupportimagetintlist;
        this.f60115b = i10;
        this.f60116c = i11;
        this.f60117d = i12;
        this.f60118e = f6;
        this.f60119f = ((Float) setDividerPadding(new Object[]{this}, 1131947670, -1131947665, System.identityHashCode(this))).floatValue();
        this.f60120g = ((Float) setDividerPadding(new Object[]{this}, -888703044, 888703047, System.identityHashCode(this))).floatValue();
        if (((Float) setDividerPadding(new Object[]{this}, 1275420678, -1275420669, System.identityHashCode(this))).floatValue() == 0.0f) {
            setSupportImageTintList setsupportimagetintlist2 = (setSupportImageTintList) setDividerPadding(new Object[]{this}, -1461045517, 1461045523, System.identityHashCode(this));
            float fFloatValue = ((Float) setDividerPadding(new Object[]{this}, 1539435750, -1539435748, System.identityHashCode(this))).floatValue() * ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist2}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist2))).intValue();
            setSupportImageTintList setsupportimagetintlist3 = (setSupportImageTintList) setDividerPadding(new Object[]{this}, -1461045517, 1461045523, System.identityHashCode(this));
            int iIntValue = ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist3}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist3))).intValue();
            int i13 = iIntValue * 131;
            int i14 = (129 | i13) << 1;
            int i15 = -(i13 ^ 129);
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            int i17 = ~iIntValue;
            int i18 = ~i10;
            int i19 = (i17 ^ i18) | (i17 & i18);
            int i20 = i19 ^ (-1);
            int i21 = (i16 - (~(-(~((~((i20 ^ i19) | (i19 & i20))) * 130))))) - 2;
            int i22 = (iIntValue | i17) & i17;
            int i23 = ~i22;
            int i24 = (i22 & i23) | (i23 ^ i22);
            int i25 = ~i24;
            int i26 = ((i24 | i25) & i25) * (-260);
            int i27 = i21 & i26;
            int i28 = (i27 - (~(-(-((i26 ^ i21) | i27))))) - 1;
            int i29 = ~((i18 ^ i10) | (i18 & i10));
            int i30 = i17 ^ i29;
            int i31 = i29 & i17;
            int i32 = ((i31 & i30) | (i30 ^ i31)) * 130;
            iRoundToInt = c.roundToInt(fFloatValue + (((Integer) setDividerPadding(new Object[]{this}, 487699574, -487699570, System.identityHashCode(this))).intValue() * (((i28 | i32) << 1) - (i32 ^ i28))));
        } else {
            setSupportImageTintList setsupportimagetintlist4 = (setSupportImageTintList) setDividerPadding(new Object[]{this}, -1461045517, 1461045523, System.identityHashCode(this));
            float fFloatValue2 = ((Float) setDividerPadding(new Object[]{this}, 1539435750, -1539435748, System.identityHashCode(this))).floatValue() * ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist4}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist4))).intValue();
            setSupportImageTintList setsupportimagetintlist5 = (setSupportImageTintList) setDividerPadding(new Object[]{this}, -1461045517, 1461045523, System.identityHashCode(this));
            int iIntValue2 = ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist5}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist5))).intValue();
            int i33 = -(~(iIntValue2 * 421));
            int i34 = (((-419) & i33) + (i33 | (-419))) - 1;
            int i35 = (iIntValue2 ^ i10) | (iIntValue2 & i10);
            int i36 = ~i35;
            int i37 = -(~(-(-(((i35 | i36) & i36) * TypedValues.CycleType.TYPE_EASING))));
            int i38 = (-2) - (((i34 ^ i37) + ((i37 & i34) << 1)) ^ (-1));
            int i39 = ((iIntValue2 ^ (-2)) | (iIntValue2 & (-2))) * (-420);
            int i40 = i38 & i39;
            int i41 = ((i38 | i39) & (~i40)) + (i40 << 1);
            int i42 = ~iIntValue2;
            int i43 = (-2) & i42;
            int i44 = (i42 | (-2)) & (~i43);
            int i45 = (i44 & i43) | (i44 ^ i43);
            int i46 = ~i45;
            int i47 = (i45 | i46) & i46;
            int i48 = ~i10;
            int i49 = i48 & (i48 | i10);
            int i50 = (iIntValue2 & i49) | (i49 ^ iIntValue2);
            int i51 = ~i50;
            int i52 = (i50 | i51) & i51;
            int i53 = ((~i52) & i47) | ((~i47) & i52);
            int i54 = i52 & i47;
            int i55 = -(-(((i54 & i53) | (i53 ^ i54)) * TypedValues.CycleType.TYPE_EASING));
            int i56 = ((~i55) & i41) | ((~i41) & i55);
            int i57 = (i55 & i41) << 1;
            iRoundToInt = c.roundToInt(fFloatValue2 + (((Integer) setDividerPadding(new Object[]{this}, 487699574, -487699570, System.identityHashCode(this))).intValue() * (((i56 | i57) << 1) - (i57 ^ i56))));
        }
        this.f60122i = iRoundToInt;
        setSupportImageTintList setsupportimagetintlist6 = (setSupportImageTintList) setDividerPadding(new Object[]{this}, -1461045517, 1461045523, System.identityHashCode(this));
        float fFloatValue3 = ((Float) setDividerPadding(new Object[]{this}, 848219510, -848219503, System.identityHashCode(this))).floatValue() * ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist6}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist6))).intValue();
        setSupportImageTintList setsupportimagetintlist7 = (setSupportImageTintList) setDividerPadding(new Object[]{this}, -1461045517, 1461045523, System.identityHashCode(this));
        int iIntValue3 = ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist7}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist7))).intValue();
        int i58 = -(~(iIntValue3 * (-493)));
        int i59 = (((495 | i58) << 1) - (i58 ^ 495)) - 1;
        int i60 = ~iIntValue3;
        int i61 = ~i60;
        int i62 = -(~((i60 | 1) * (-988)));
        int i63 = (-2) - ((((i59 | i62) << 1) - (i59 ^ i62)) ^ (-1));
        int i64 = iIntValue3 ^ (-2);
        int i65 = iIntValue3 & (-2);
        int i66 = (i64 & i65) | (i64 ^ i65);
        int i67 = ~i10;
        int i68 = i66 & i67;
        int i69 = (i66 | i67) & (~i68);
        int i70 = ((i69 & i68) | (i69 ^ i68)) * 494;
        int i71 = (i63 ^ i70) + ((i63 & i70) << 1);
        int i72 = (i60 & (-2)) | (i61 & (-2)) | (i60 & 1);
        int i73 = ~i72;
        int i74 = (i72 | i73) & i73;
        int i75 = (i10 | i67) & i67;
        int i76 = i75 & iIntValue3;
        int i77 = (i75 | iIntValue3) & (~i76);
        int i78 = ~((i77 & i76) | (i77 ^ i76));
        int i79 = ((~i78) & i74) | ((~i74) & i78);
        int i80 = i78 & i74;
        int i81 = (i80 & i79) | (i79 ^ i80);
        int i82 = ~(iIntValue3 | 1);
        int i83 = i81 & i82;
        int i84 = (i81 | i82) & (~i83);
        int i85 = ((i84 & i83) | (i84 ^ i83)) * 494;
        int i86 = i71 ^ i85;
        int i87 = ((i85 & i71) | i86) << 1;
        int i88 = -i86;
        this.f60121h = c.roundToInt(fFloatValue3 + (((Integer) setDividerPadding(new Object[]{this}, 487699574, -487699570, System.identityHashCode(this))).intValue() * ((i87 ^ i88) + ((i87 & i88) << 1))));
    }

    public static /* synthetic */ Float a(Object[] objArr) {
        setMinLines setminlines = (setMinLines) objArr[0];
        int i10 = f60113k;
        int i11 = i10 & 5;
        int i12 = i10 | 5;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f60112j = i13 % 128;
        int i14 = i13 % 2;
        float f6 = setminlines.f60119f;
        if (i14 != 0) {
            throw null;
        }
        int i15 = (((i10 ^ 65) | (i10 & 65)) << 1) - (((~i10) & 65) | (i10 & (-66)));
        f60112j = i15 % 128;
        if (i15 % 2 == 0) {
            return Float.valueOf(f6);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0276 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0277  */
    public static /* synthetic */ Rect b(Object[] objArr) {
        int iRoundToInt;
        int i10;
        setMinLines setminlines = (setMinLines) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        Rect rect = new Rect();
        if (((Float) setDividerPadding(new Object[]{setminlines}, 1275420678, -1275420669, System.identityHashCode(setminlines))).floatValue() == 0.0f) {
            int i11 = (-2) - ((f60113k + 48) ^ (-1));
            int i12 = i11 % 128;
            f60112j = i12;
            boolean z10 = i11 % 2 == 0;
            int i13 = i12 & 23;
            int i14 = (i12 ^ 23) | i13;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            f60113k = i15 % 128;
            int i16 = i15 % 2;
            if (z10) {
                int i17 = i12 & 75;
                int i18 = i17 + ((i12 ^ 75) | i17);
                f60113k = i18 % 128;
                iRoundToInt = i18 % 2 == 0 ? c.roundToInt((((Float) setDividerPadding(new Object[]{setminlines}, 1539435750, -1539435748, System.identityHashCode(setminlines))).floatValue() + iIntValue) % (((Integer) setDividerPadding(new Object[]{setminlines}, 487699574, -487699570, System.identityHashCode(setminlines))).intValue() / iIntValue)) : c.roundToInt((((Float) setDividerPadding(new Object[]{setminlines}, 1539435750, -1539435748, System.identityHashCode(setminlines))).floatValue() * iIntValue) + (((Integer) setDividerPadding(new Object[]{setminlines}, 487699574, -487699570, System.identityHashCode(setminlines))).intValue() * iIntValue));
            }
            rect.left = iRoundToInt;
            rect.right = c.roundToInt(((Float) setDividerPadding(new Object[]{setminlines}, 1539435750, -1539435748, System.identityHashCode(setminlines))).floatValue() + iRoundToInt);
            float fFloatValue = ((Float) setDividerPadding(new Object[]{setminlines}, 848219510, -848219503, System.identityHashCode(setminlines))).floatValue() * iIntValue2;
            int iIntValue3 = ((Integer) setDividerPadding(new Object[]{setminlines}, 487699574, -487699570, System.identityHashCode(setminlines))).intValue();
            int i19 = -(-(iIntValue2 * (-103)));
            int i20 = ((((-103) ^ i19) | ((-103) & i19)) << 1) - ((i19 & 102) | ((-103) & (~i19)));
            int i21 = ~iIntValue2;
            int i22 = (-2) & i21;
            int i23 = ((-2) | i21) & (~i22);
            int i24 = ~((i23 & i22) | (i23 ^ i22));
            int i25 = i21 ^ iIntValue;
            int i26 = ~iIntValue;
            int i27 = i21 & iIntValue;
            int i28 = (i25 ^ i27) | (i27 & i25);
            int i29 = ~i28;
            int i30 = (i28 | i29) & i29;
            int i31 = (i20 - (~(((((~i24) & i30) | ((~i30) & i24)) | (i30 & i24)) * 104))) - 1;
            int i32 = (i26 ^ 1) | (i26 & 1);
            int i33 = (i32 & iIntValue2) | (i32 ^ iIntValue2);
            int i34 = ~i33;
            int i35 = ((i33 | i34) & i34) * (-104);
            int i36 = i31 & i35;
            int i37 = i36 + ((i35 ^ i31) | i36);
            int i38 = iIntValue ^ 1;
            int i39 = iIntValue & 1;
            int i40 = -(-(((i39 & i38) | (i38 ^ i39)) * 104));
            int i41 = i37 & i40;
            int i42 = (i40 | i37) & (~i41);
            int i43 = i41 << 1;
            int iRoundToInt2 = c.roundToInt(fFloatValue + ((((i42 | i43) << 1) - (i42 ^ i43)) * iIntValue3));
            rect.top = iRoundToInt2;
            rect.bottom = c.roundToInt((((Float) setDividerPadding(new Object[]{setminlines}, 848219510, -848219503, System.identityHashCode(setminlines))).floatValue() * 2.0f) + iRoundToInt2 + ((Integer) setDividerPadding(new Object[]{setminlines}, 487699574, -487699570, System.identityHashCode(setminlines))).intValue());
            int i44 = f60113k;
            i10 = ((i44 | 109) << 1) - (i44 ^ 109);
            f60112j = i10 % 128;
            if (i10 % 2 == 0) {
                return rect;
            }
            throw null;
        }
        int i45 = f60113k;
        int i46 = (i45 ^ 7) + ((i45 & 7) << 1);
        f60112j = i46 % 128;
        int i47 = i46 % 2;
        float fFloatValue2 = ((Float) setDividerPadding(new Object[]{setminlines}, 1539435750, -1539435748, System.identityHashCode(setminlines))).floatValue() * iIntValue;
        int iIntValue4 = ((Integer) setDividerPadding(new Object[]{setminlines}, 487699574, -487699570, System.identityHashCode(setminlines))).intValue();
        int i48 = -(-(iIntValue * (-864)));
        int i49 = (866 ^ i48) + ((i48 & 866) << 1);
        int i50 = ~iIntValue;
        int i51 = i50 & (i50 | iIntValue);
        int i52 = (-2) ^ i51;
        int i53 = (-2) & i51;
        int i54 = ~((i52 ^ i53) | (i52 & i53));
        int i55 = -(-(((i50 ^ i54) | (i54 & i50)) * (-865)));
        int i56 = (((~i55) & i49) | ((~i49) & i55)) + ((i55 & i49) << 1);
        int i57 = iIntValue | 1;
        int i58 = ~i57;
        int i59 = (((i57 | i58) & i58) * 865) + i56;
        int i60 = i50 ^ i50;
        int i61 = i50 & i50;
        int i62 = ~((i60 & i61) | (i60 ^ i61));
        int i63 = (i50 & (-2)) | ((~i50) & 1);
        int i64 = i50 & 1;
        int i65 = ~((i63 & i64) | (i63 ^ i64));
        int i66 = ((i62 & i65) | ((~i65) & i62) | ((~i62) & i65)) * 865;
        int i67 = i59 ^ i66;
        int i68 = (i59 & i66) << 1;
        iRoundToInt = c.roundToInt(fFloatValue2 + (((i67 ^ i68) + ((i68 & i67) << 1)) * iIntValue4));
        int i69 = f60113k;
        int i70 = ((i69 | 95) << 1) - (i69 ^ 95);
        f60112j = i70 % 128;
        int i71 = i70 % 2;
        rect.left = iRoundToInt;
        rect.right = c.roundToInt(((Float) setDividerPadding(new Object[]{setminlines}, 1539435750, -1539435748, System.identityHashCode(setminlines))).floatValue() + iRoundToInt);
        float fFloatValue3 = ((Float) setDividerPadding(new Object[]{setminlines}, 848219510, -848219503, System.identityHashCode(setminlines))).floatValue() * iIntValue2;
        int iIntValue5 = ((Integer) setDividerPadding(new Object[]{setminlines}, 487699574, -487699570, System.identityHashCode(setminlines))).intValue();
        int i110 = -(-(iIntValue2 * (-103)));
        int i210 = ((((-103) ^ i110) | ((-103) & i110)) << 1) - ((i110 & 102) | ((-103) & (~i110)));
        int i211 = ~iIntValue2;
        int i212 = (-2) & i211;
        int i213 = ((-2) | i211) & (~i212);
        int i214 = ~((i213 & i212) | (i213 ^ i212));
        int i215 = i211 ^ iIntValue;
        int i216 = ~iIntValue;
        int i217 = i211 & iIntValue;
        int i218 = (i215 ^ i217) | (i217 & i215);
        int i219 = ~i218;
        int i310 = (i218 | i219) & i219;
        int i311 = (i210 - (~(((((~i214) & i310) | ((~i310) & i214)) | (i310 & i214)) * 104))) - 1;
        int i312 = (i216 ^ 1) | (i216 & 1);
        int i313 = (i312 & iIntValue2) | (i312 ^ iIntValue2);
        int i314 = ~i313;
        int i315 = ((i313 | i314) & i314) * (-104);
        int i316 = i311 & i315;
        int i317 = i316 + ((i315 ^ i311) | i316);
        int i318 = iIntValue ^ 1;
        int i319 = iIntValue & 1;
        int i410 = -(-(((i319 & i318) | (i318 ^ i319)) * 104));
        int i411 = i317 & i410;
        int i412 = (i410 | i317) & (~i411);
        int i413 = i411 << 1;
        int iRoundToInt3 = c.roundToInt(fFloatValue3 + ((((i412 | i413) << 1) - (i412 ^ i413)) * iIntValue5));
        rect.top = iRoundToInt3;
        rect.bottom = c.roundToInt((((Float) setDividerPadding(new Object[]{setminlines}, 848219510, -848219503, System.identityHashCode(setminlines))).floatValue() * 2.0f) + iRoundToInt3 + ((Integer) setDividerPadding(new Object[]{setminlines}, 487699574, -487699570, System.identityHashCode(setminlines))).intValue());
        int i414 = f60113k;
        i10 = ((i414 | 109) << 1) - (i414 ^ 109);
        f60112j = i10 % 128;
        if (i10 % 2 == 0) {
            return rect;
        }
        throw null;
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        setMinLines setminlines = (setMinLines) objArr[0];
        int i10 = f60113k;
        int i11 = i10 & 71;
        int i12 = (((~i11) & (i10 | 71)) - (~(-(-(i11 << 1))))) - 1;
        f60112j = i12 % 128;
        int i13 = i12 % 2;
        int i14 = setminlines.f60122i;
        int i15 = i10 ^ 79;
        int i16 = (((i10 & 79) | i15) << 1) - i15;
        f60112j = i16 % 128;
        if (i16 % 2 == 0) {
            return Integer.valueOf(i14);
        }
        throw null;
    }

    public static /* synthetic */ setSupportImageTintList d(Object[] objArr) {
        setMinLines setminlines = (setMinLines) objArr[0];
        int i10 = f60112j;
        int i11 = ((i10 ^ 87) | (i10 & 87)) << 1;
        int i12 = -(((~i10) & 87) | (i10 & (-88)));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f60113k = i14;
        int i15 = i13 % 2;
        setSupportImageTintList setsupportimagetintlist = setminlines.f60114a;
        if (i15 == 0) {
            throw null;
        }
        int i16 = i14 & 79;
        int i17 = -(-((i14 ^ 79) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f60112j = i18 % 128;
        int i19 = i18 % 2;
        return setsupportimagetintlist;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:15:0x017c  */
    /* JADX WARN: Code duplicated, block: B:17:0x018e  */
    /* JADX WARN: Code duplicated, block: B:18:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:21:0x030c  */
    /* JADX WARN: Code duplicated, block: B:22:0x030f  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        float fIntValue;
        float fIntValue2;
        Object compoundDrawableTintBlendMode;
        float fIntValue3;
        Object objValueOf;
        boolean z10;
        int i13;
        int iRoundToInt;
        int i14;
        int i15 = ~i12;
        int i16 = ((i10 | i15) * (-757)) + (i11 * (-756)) + (i10 * 758);
        int i17 = ~i11;
        switch ((((~(i10 | i11 | i12)) | (~(i15 | i17)) | (~((~i10) | i17))) * 757) + ((~(i17 | i10 | i12)) * 1514) + i16) {
            case 1:
                setMinLines setminlines = (setMinLines) objArr[0];
                int i18 = f60112j;
                int i19 = ((i18 | 25) << 1) - (i18 ^ 25);
                f60113k = i19 % 128;
                int i20 = i19 % 2;
                setminlines.getClass();
                int i21 = f60113k + 89;
                f60112j = i21 % 128;
                int i22 = i21 % 2;
                return 0;
            case 2:
                return a(objArr);
            case 3:
                setMinLines setminlines2 = (setMinLines) objArr[0];
                int i23 = f60113k;
                int i24 = ((((i23 ^ 41) | (i23 & 41)) << 1) - (~(-(((~i23) & 41) | (i23 & (-42)))))) - 1;
                f60112j = i24 % 128;
                if (i24 % 2 != 0) {
                    float f6 = setminlines2.f60116c;
                    setSupportImageTintList setsupportimagetintlist = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines2}, -1461045517, 1461045523, System.identityHashCode(setminlines2));
                    float fIntValue4 = ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist))).intValue() + 0.0f) % ((Integer) setDividerPadding(new Object[]{setminlines2}, 487699574, -487699570, System.identityHashCode(setminlines2))).intValue()) * f6;
                    setSupportImageTintList setsupportimagetintlist2 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines2}, -1461045517, 1461045523, System.identityHashCode(setminlines2));
                    fIntValue = fIntValue4 % ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist2}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist2))).intValue();
                } else {
                    float f10 = setminlines2.f60116c;
                    setSupportImageTintList setsupportimagetintlist3 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines2}, -1461045517, 1461045523, System.identityHashCode(setminlines2));
                    float fIntValue5 = f10 - ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist3}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist3))).intValue() + 1.0f) * ((Integer) setDividerPadding(new Object[]{setminlines2}, 487699574, -487699570, System.identityHashCode(setminlines2))).intValue());
                    setSupportImageTintList setsupportimagetintlist4 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines2}, -1461045517, 1461045523, System.identityHashCode(setminlines2));
                    fIntValue = fIntValue5 / ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist4}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist4))).intValue();
                }
                int i25 = f60113k;
                int i26 = ((i25 ^ 49) | (i25 & 49)) << 1;
                int i27 = -(((~i25) & 49) | (i25 & (-50)));
                int i28 = (i26 & i27) + (i27 | i26);
                f60112j = i28 % 128;
                int i29 = i28 % 2;
                return Float.valueOf(fIntValue);
            case 4:
                setMinLines setminlines3 = (setMinLines) objArr[0];
                int i30 = f60112j;
                int i31 = ((i30 | 38) << 1) - (i30 ^ 38);
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                int i33 = i32 % 128;
                f60113k = i33;
                int i34 = i32 % 2;
                int i35 = setminlines3.f60117d;
                int i36 = i33 ^ 37;
                int i37 = (((i33 & 37) | i36) << 1) - i36;
                f60112j = i37 % 128;
                int i38 = i37 % 2;
                return Integer.valueOf(i35);
            case 5:
                setMinLines setminlines4 = (setMinLines) objArr[0];
                int i39 = f60113k;
                int i40 = (i39 & (-82)) | ((~i39) & 81);
                int i41 = (i39 & 81) << 1;
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                f60112j = i42 % 128;
                if (i42 % 2 == 0 ? ((Float) setDividerPadding(new Object[]{setminlines4}, 1275420678, -1275420669, System.identityHashCode(setminlines4))).floatValue() != 0.0f : ((Float) setDividerPadding(new Object[]{setminlines4}, 1275420678, -1275420669, System.identityHashCode(setminlines4))).floatValue() != 0.0f) {
                    int i43 = f60113k + 110;
                    int i44 = (i43 ^ (-1)) + (i43 << 1);
                    f60112j = i44 % 128;
                    int i45 = i44 % 2;
                    float f11 = setminlines4.f60115b;
                    setSupportImageTintList setsupportimagetintlist5 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines4}, -1461045517, 1461045523, System.identityHashCode(setminlines4));
                    float fIntValue6 = f11 - ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist5}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist5))).intValue() + 1.0f) * ((Integer) setDividerPadding(new Object[]{setminlines4}, 487699574, -487699570, System.identityHashCode(setminlines4))).intValue());
                    setSupportImageTintList setsupportimagetintlist6 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines4}, -1461045517, 1461045523, System.identityHashCode(setminlines4));
                    fIntValue3 = fIntValue6 / ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist6}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist6))).intValue();
                    int i46 = f60113k;
                    int i47 = (((i46 | 20) << 1) - (i46 ^ 20)) - 1;
                    f60112j = i47 % 128;
                    int i48 = i47 % 2;
                } else {
                    int i49 = f60113k;
                    int i50 = i49 & 113;
                    int i51 = (i50 - (~((i49 ^ 113) | i50))) - 1;
                    f60112j = i51 % 128;
                    int i52 = i51 % 2;
                    int i53 = (i49 ^ 30) + ((i49 & 30) << 1);
                    int i54 = (i53 ^ (-1)) + (i53 << 1);
                    f60112j = i54 % 128;
                    if (i54 % 2 != 0) {
                        float f12 = setminlines4.f60115b;
                        setSupportImageTintList setsupportimagetintlist7 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines4}, -1461045517, 1461045523, System.identityHashCode(setminlines4));
                        fIntValue2 = (((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist7}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist7))).intValue() / 0.0f) * ((Integer) setDividerPadding(new Object[]{setminlines4}, 487699574, -487699570, System.identityHashCode(setminlines4))).intValue() * f12;
                        setSupportImageTintList setsupportimagetintlist8 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines4}, -1461045517, 1461045523, System.identityHashCode(setminlines4));
                        compoundDrawableTintBlendMode = setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist8}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist8));
                    } else {
                        float f13 = setminlines4.f60115b;
                        setSupportImageTintList setsupportimagetintlist9 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines4}, -1461045517, 1461045523, System.identityHashCode(setminlines4));
                        fIntValue2 = f13 - ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist9}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist9))).intValue() - 1.0f) * ((Integer) setDividerPadding(new Object[]{setminlines4}, 487699574, -487699570, System.identityHashCode(setminlines4))).intValue());
                        setSupportImageTintList setsupportimagetintlist10 = (setSupportImageTintList) setDividerPadding(new Object[]{setminlines4}, -1461045517, 1461045523, System.identityHashCode(setminlines4));
                        compoundDrawableTintBlendMode = setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist10}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist10));
                    }
                    fIntValue3 = fIntValue2 / ((Integer) compoundDrawableTintBlendMode).intValue();
                    int i55 = f60112j;
                    int i56 = ((i55 ^ 92) + ((i55 & 92) << 1)) - 1;
                    f60113k = i56 % 128;
                    int i57 = i56 % 2;
                }
                objValueOf = Float.valueOf(fIntValue3);
                break;
            case 6:
                return d(objArr);
            case 7:
                setMinLines setminlines5 = (setMinLines) objArr[0];
                int i58 = f60112j;
                int i59 = (i58 & 103) + (i58 | 103);
                int i60 = i59 % 128;
                f60113k = i60;
                int i61 = i59 % 2;
                float f14 = setminlines5.f60120g;
                int i62 = i60 & 77;
                int i63 = -(-((i60 ^ 77) | i62));
                int i64 = (i62 & i63) + (i63 | i62);
                f60112j = i64 % 128;
                int i65 = i64 % 2;
                return Float.valueOf(f14);
            case 8:
                return c(objArr);
            case 9:
                setMinLines setminlines6 = (setMinLines) objArr[0];
                int i66 = f60112j;
                int i67 = (i66 ^ 60) + ((i66 & 60) << 1);
                int i68 = (i67 ^ (-1)) + (i67 << 1);
                f60113k = i68 % 128;
                if (i68 % 2 == 0) {
                    float f15 = setminlines6.f60118e;
                    throw null;
                }
                float f16 = setminlines6.f60118e;
                int i69 = i66 & 109;
                int i70 = (((i66 | 109) & (~i69)) - (~(i69 << 1))) - 1;
                f60113k = i70 % 128;
                if (i70 % 2 != 0) {
                    return Float.valueOf(f16);
                }
                throw null;
            case 10:
                setMinLines setminlines7 = (setMinLines) objArr[0];
                int i71 = f60113k;
                int i72 = i71 & 7;
                int i73 = -(-((i71 ^ 7) | i72));
                int i74 = (i72 & i73) + (i73 | i72);
                f60112j = i74 % 128;
                int i75 = i74 % 2;
                setminlines7.getClass();
                int i76 = f60113k;
                int i77 = ((((i76 ^ 37) | (i76 & 37)) << 1) - (~(-(((~i76) & 37) | (i76 & (-38)))))) - 1;
                f60112j = i77 % 128;
                if (i77 % 2 == 0) {
                    return 0;
                }
                throw null;
            case 11:
                setMinLines setminlines8 = (setMinLines) objArr[0];
                int i78 = f60113k;
                int i79 = ((i78 | 117) << 1) - (i78 ^ 117);
                f60112j = i79 % 128;
                int i80 = i79 % 2;
                int i81 = setminlines8.f60121h;
                int i82 = (i78 ^ 43) + ((i78 & 43) << 1);
                f60112j = i82 % 128;
                if (i82 % 2 != 0) {
                    int i83 = 93 / 0;
                }
                objValueOf = Integer.valueOf(i81);
                break;
            case 12:
                return b(objArr);
            default:
                setMinLines setminlines9 = (setMinLines) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                Rect rect = new Rect();
                if (((Float) setDividerPadding(new Object[]{setminlines9}, 1275420678, -1275420669, System.identityHashCode(setminlines9))).floatValue() == 0.0f) {
                    int i84 = f60113k;
                    int i85 = (i84 & 103) + (i84 | 103);
                    f60112j = i85 % 128;
                    if (i85 % 2 == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        float fFloatValue = ((Float) setDividerPadding(new Object[]{setminlines9}, 1539435750, -1539435748, System.identityHashCode(setminlines9))).floatValue() * iIntValue;
                        int iIntValue3 = ((Integer) setDividerPadding(new Object[]{setminlines9}, 487699574, -487699570, System.identityHashCode(setminlines9))).intValue();
                        int i86 = -(-(iIntValue * (-396)));
                        int i87 = (398 & i86) + (398 | i86);
                        int i88 = ~iIntValue;
                        int i89 = i88 & (i88 | iIntValue);
                        int i90 = ((~i89) & (-2)) | (i89 & 1);
                        int i91 = (-2) & i89;
                        int i92 = ~((i90 ^ i91) | (i90 & i91));
                        int i93 = (-2) & iIntValue;
                        int i94 = ((-2) ^ iIntValue) | i93;
                        int i95 = ~i94;
                        int i96 = (i94 | i95) & i95;
                        int i97 = i92 ^ i96;
                        int i98 = i96 & i92;
                        int i99 = (i97 & i98) | (i97 ^ i98);
                        int i100 = i89 ^ iIntValue;
                        int i101 = i89 & iIntValue;
                        int i102 = ~((i100 ^ i101) | (i101 & i100));
                        int i103 = i99 & i102;
                        int i104 = (~i103) & (i102 | i99);
                        int i105 = ((i104 & i103) | (i104 ^ i103)) * (-397);
                        int i106 = i87 & i105;
                        int i107 = -(-((i87 ^ i105) | i106));
                        int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                        int i109 = i95 * (-397);
                        int i110 = i108 & i109;
                        int i111 = (~i110) & (i108 | i109);
                        int i112 = i110 << 1;
                        int i113 = (i111 & i112) + (i112 | i111);
                        int i114 = (~i93) & ((-2) | iIntValue);
                        int i115 = ~((i114 & i93) | (i114 ^ i93));
                        int i116 = ((~i115) & iIntValue) | (i115 & i88);
                        int i117 = i115 & iIntValue;
                        int i118 = (i117 & i116) | (i116 ^ i117);
                        int i119 = (i88 & (-2)) | ((~i88) & 1);
                        int i120 = i88 & 1;
                        int i121 = ~((i119 & i120) | (i119 ^ i120));
                        int i122 = i118 & i121;
                        int i123 = (i118 | i121) & (~i122);
                        int i124 = ((i123 & i122) | (i123 ^ i122)) * 397;
                        iRoundToInt = c.roundToInt(fFloatValue + b.e(((~i124) & i113) | ((~i113) & i124), ~(-(-((i124 & i113) << 1))), 1, iIntValue3));
                        int i125 = f60112j;
                        int i126 = (((i125 ^ 31) | (i125 & 31)) << 1) - (((~i125) & 31) | (i125 & (-32)));
                        f60113k = i126 % 128;
                        int i127 = i126 % 2;
                    } else {
                        int i128 = f60112j;
                        int i129 = i128 & 13;
                        int i130 = (i128 ^ 13) | i129;
                        i13 = (i129 & i130) + (i130 | i129);
                        f60113k = i13 % 128;
                        if (i13 % 2 == 0) {
                            iRoundToInt = c.roundToInt((((Float) setDividerPadding(new Object[]{setminlines9}, 1539435750, -1539435748, System.identityHashCode(setminlines9))).floatValue() + iIntValue) / (((Integer) setDividerPadding(new Object[]{setminlines9}, 487699574, -487699570, System.identityHashCode(setminlines9))).intValue() >> iIntValue));
                        } else {
                            iRoundToInt = c.roundToInt((((Float) setDividerPadding(new Object[]{setminlines9}, 1539435750, -1539435748, System.identityHashCode(setminlines9))).floatValue() * iIntValue) + (((Integer) setDividerPadding(new Object[]{setminlines9}, 487699574, -487699570, System.identityHashCode(setminlines9))).intValue() * iIntValue));
                        }
                    }
                    rect.left = iRoundToInt;
                    rect.right = c.roundToInt(((Float) setDividerPadding(new Object[]{setminlines9}, 1539435750, -1539435748, System.identityHashCode(setminlines9))).floatValue() + iRoundToInt);
                    float fFloatValue2 = ((Float) setDividerPadding(new Object[]{setminlines9}, 848219510, -848219503, System.identityHashCode(setminlines9))).floatValue() * iIntValue2;
                    int iIntValue4 = ((Integer) setDividerPadding(new Object[]{setminlines9}, 487699574, -487699570, System.identityHashCode(setminlines9))).intValue();
                    int i131 = -(-(iIntValue2 * (-590)));
                    int i132 = 592 & i131;
                    int i133 = ((592 ^ i131) | i132) << 1;
                    int i134 = -((i131 | 592) & (~i132));
                    int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                    int i136 = (-2) & iIntValue2;
                    int i137 = (~i136) & ((-2) | iIntValue2);
                    int i138 = ~iIntValue2;
                    int i139 = -(-((~(i136 | i137)) * (-1182)));
                    int i140 = (i135 & i139) + (i139 | i135);
                    int i141 = ((-2) ^ i138) | ((-2) & i138);
                    int i142 = ~iIntValue;
                    int i143 = (i142 | iIntValue) & i142;
                    int i144 = i141 & i143;
                    int i145 = (i141 | i143) & (~i144);
                    int i146 = ~((i145 & i144) | (i145 ^ i144));
                    int i147 = iIntValue2 & 1;
                    int i148 = (~i147) & (iIntValue2 | 1);
                    int i149 = (i147 & i148) | (i148 ^ i147);
                    int i150 = ~i149;
                    int i151 = (i149 | i150) & i150;
                    int i152 = ((~i151) & i146) | ((~i146) & i151);
                    int i153 = i146 & i151;
                    int i154 = ((i153 & i152) | (i152 ^ i153)) * (-591);
                    int i155 = (((i140 ^ i154) | (i140 & i154)) << 1) - ((i154 & (~i140)) | ((~i154) & i140));
                    int i156 = (iIntValue & 1) | (i142 & (-2));
                    int i157 = iIntValue & (-2);
                    int i158 = (i157 & i156) | (i156 ^ i157);
                    int i159 = (iIntValue2 | i138) & i138;
                    int iRoundToInt2 = c.roundToInt(fFloatValue2 + b.e(i155, ~(((i158 & i159) | (i158 ^ i159)) * 591), 1, iIntValue4));
                    rect.top = iRoundToInt2;
                    rect.bottom = c.roundToInt(((Float) setDividerPadding(new Object[]{setminlines9}, 848219510, -848219503, System.identityHashCode(setminlines9))).floatValue() + iRoundToInt2);
                    int i160 = f60112j;
                    int i161 = (i160 & (-20)) | ((~i160) & 19);
                    int i162 = -(-((i160 & 19) << 1));
                    i14 = (i161 ^ i162) + ((i162 & i161) << 1);
                    f60113k = i14 % 128;
                    if (i14 % 2 != 0) {
                        return rect;
                    }
                    throw null;
                }
                int i163 = f60113k;
                int i164 = (((i163 & (-84)) | ((~i163) & 83)) - (~((i163 & 83) << 1))) - 1;
                f60112j = i164 % 128;
                int i165 = i164 % 2;
                z10 = false;
                if (!z10) {
                    float fFloatValue3 = ((Float) setDividerPadding(new Object[]{setminlines9}, 1539435750, -1539435748, System.identityHashCode(setminlines9))).floatValue() * iIntValue;
                    int iIntValue5 = ((Integer) setDividerPadding(new Object[]{setminlines9}, 487699574, -487699570, System.identityHashCode(setminlines9))).intValue();
                    int i810 = -(-(iIntValue * (-396)));
                    int i811 = (398 & i810) + (398 | i810);
                    int i812 = ~iIntValue;
                    int i813 = i812 & (i812 | iIntValue);
                    int i910 = ((~i813) & (-2)) | (i813 & 1);
                    int i911 = (-2) & i813;
                    int i912 = ~((i910 ^ i911) | (i910 & i911));
                    int i913 = (-2) & iIntValue;
                    int i914 = ((-2) ^ iIntValue) | i913;
                    int i915 = ~i914;
                    int i916 = (i914 | i915) & i915;
                    int i917 = i912 ^ i916;
                    int i918 = i916 & i912;
                    int i919 = (i917 & i918) | (i917 ^ i918);
                    int i1010 = i813 ^ iIntValue;
                    int i1011 = i813 & iIntValue;
                    int i1012 = ~((i1010 ^ i1011) | (i1011 & i1010));
                    int i1013 = i919 & i1012;
                    int i1014 = (~i1013) & (i1012 | i919);
                    int i1015 = ((i1014 & i1013) | (i1014 ^ i1013)) * (-397);
                    int i1016 = i811 & i1015;
                    int i1017 = -(-((i811 ^ i1015) | i1016));
                    int i1018 = (i1016 ^ i1017) + ((i1017 & i1016) << 1);
                    int i1019 = i915 * (-397);
                    int i1110 = i1018 & i1019;
                    int i1111 = (~i1110) & (i1018 | i1019);
                    int i1112 = i1110 << 1;
                    int i1113 = (i1111 & i1112) + (i1112 | i1111);
                    int i1114 = (~i913) & ((-2) | iIntValue);
                    int i1115 = ~((i1114 & i913) | (i1114 ^ i913));
                    int i1116 = ((~i1115) & iIntValue) | (i1115 & i812);
                    int i1117 = i1115 & iIntValue;
                    int i1118 = (i1117 & i1116) | (i1116 ^ i1117);
                    int i1119 = (i812 & (-2)) | ((~i812) & 1);
                    int i1210 = i812 & 1;
                    int i1211 = ~((i1119 & i1210) | (i1119 ^ i1210));
                    int i1212 = i1118 & i1211;
                    int i1213 = (i1118 | i1211) & (~i1212);
                    int i1214 = ((i1213 & i1212) | (i1213 ^ i1212)) * 397;
                    iRoundToInt = c.roundToInt(fFloatValue3 + b.e(((~i1214) & i1113) | ((~i1113) & i1214), ~(-(-((i1214 & i1113) << 1))), 1, iIntValue5));
                    int i1215 = f60112j;
                    int i1216 = (((i1215 ^ 31) | (i1215 & 31)) << 1) - (((~i1215) & 31) | (i1215 & (-32)));
                    f60113k = i1216 % 128;
                    int i1217 = i1216 % 2;
                } else {
                    int i1218 = f60112j;
                    int i1219 = i1218 & 13;
                    int i1310 = (i1218 ^ 13) | i1219;
                    i13 = (i1219 & i1310) + (i1310 | i1219);
                    f60113k = i13 % 128;
                    if (i13 % 2 == 0) {
                        iRoundToInt = c.roundToInt((((Float) setDividerPadding(new Object[]{setminlines9}, 1539435750, -1539435748, System.identityHashCode(setminlines9))).floatValue() + iIntValue) / (((Integer) setDividerPadding(new Object[]{setminlines9}, 487699574, -487699570, System.identityHashCode(setminlines9))).intValue() >> iIntValue));
                    } else {
                        iRoundToInt = c.roundToInt((((Float) setDividerPadding(new Object[]{setminlines9}, 1539435750, -1539435748, System.identityHashCode(setminlines9))).floatValue() * iIntValue) + (((Integer) setDividerPadding(new Object[]{setminlines9}, 487699574, -487699570, System.identityHashCode(setminlines9))).intValue() * iIntValue));
                    }
                }
                rect.left = iRoundToInt;
                rect.right = c.roundToInt(((Float) setDividerPadding(new Object[]{setminlines9}, 1539435750, -1539435748, System.identityHashCode(setminlines9))).floatValue() + iRoundToInt);
                float fFloatValue4 = ((Float) setDividerPadding(new Object[]{setminlines9}, 848219510, -848219503, System.identityHashCode(setminlines9))).floatValue() * iIntValue2;
                int iIntValue6 = ((Integer) setDividerPadding(new Object[]{setminlines9}, 487699574, -487699570, System.identityHashCode(setminlines9))).intValue();
                int i1311 = -(-(iIntValue2 * (-590)));
                int i1312 = 592 & i1311;
                int i1313 = ((592 ^ i1311) | i1312) << 1;
                int i1314 = -((i1311 | 592) & (~i1312));
                int i1315 = (i1313 ^ i1314) + ((i1314 & i1313) << 1);
                int i1316 = (-2) & iIntValue2;
                int i1317 = (~i1316) & ((-2) | iIntValue2);
                int i1318 = ~iIntValue2;
                int i1319 = -(-((~(i1316 | i1317)) * (-1182)));
                int i1410 = (i1315 & i1319) + (i1319 | i1315);
                int i1411 = ((-2) ^ i1318) | ((-2) & i1318);
                int i1412 = ~iIntValue;
                int i1413 = (i1412 | iIntValue) & i1412;
                int i1414 = i1411 & i1413;
                int i1415 = (i1411 | i1413) & (~i1414);
                int i1416 = ~((i1415 & i1414) | (i1415 ^ i1414));
                int i1417 = iIntValue2 & 1;
                int i1418 = (~i1417) & (iIntValue2 | 1);
                int i1419 = (i1417 & i1418) | (i1418 ^ i1417);
                int i1510 = ~i1419;
                int i1511 = (i1419 | i1510) & i1510;
                int i1512 = ((~i1511) & i1416) | ((~i1416) & i1511);
                int i1513 = i1416 & i1511;
                int i1514 = ((i1513 & i1512) | (i1512 ^ i1513)) * (-591);
                int i1515 = (((i1410 ^ i1514) | (i1410 & i1514)) << 1) - ((i1514 & (~i1410)) | ((~i1514) & i1410));
                int i1516 = (iIntValue & 1) | (i1412 & (-2));
                int i1517 = iIntValue & (-2);
                int i1518 = (i1517 & i1516) | (i1516 ^ i1517);
                int i1519 = (iIntValue2 | i1318) & i1318;
                int iRoundToInt3 = c.roundToInt(fFloatValue4 + b.e(i1515, ~(((i1518 & i1519) | (i1518 ^ i1519)) * 591), 1, iIntValue6));
                rect.top = iRoundToInt3;
                rect.bottom = c.roundToInt(((Float) setDividerPadding(new Object[]{setminlines9}, 848219510, -848219503, System.identityHashCode(setminlines9))).floatValue() + iRoundToInt3);
                int i166 = f60112j;
                int i167 = (i166 & (-20)) | ((~i166) & 19);
                int i168 = -(-((i166 & 19) << 1));
                i14 = (i167 ^ i168) + ((i168 & i167) << 1);
                f60113k = i14 % 128;
                if (i14 % 2 != 0) {
                    return rect;
                }
                throw null;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    @NotNull
    public final Rect E_(int i10, int i11) {
        return (Rect) setDividerPadding(new Object[]{this, Integer.valueOf(i10), Integer.valueOf(i11)}, 1385282569, -1385282569, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    @NotNull
    public final Rect F_(int i10, int i11) {
        return (Rect) setDividerPadding(new Object[]{this, Integer.valueOf(i10), Integer.valueOf(i11)}, 1404650341, -1404650329, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -790905484, 790905494, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    @NotNull
    public final setSupportImageTintList setLayoutAnimation() {
        return (setSupportImageTintList) setDividerPadding(new Object[]{this}, -1461045517, 1461045523, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setNavigationOnClickListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1433996889, -1433996881, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final float setOnFocusChangeListener() {
        return ((Float) setDividerPadding(new Object[]{this}, 1539435750, -1539435748, System.identityHashCode(this))).floatValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setOnLongClickListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -807007874, 807007885, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setX() {
        return ((Integer) setDividerPadding(new Object[]{this}, 487699574, -487699570, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setY() {
        return ((Integer) setDividerPadding(new Object[]{this}, 2023648921, -2023648920, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final float setDividerPadding() {
        return ((Float) setDividerPadding(new Object[]{this}, 848219510, -848219503, System.identityHashCode(this))).floatValue();
    }
}
