package com.mypinpad.tsdk.isolation;

import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setHorizontalFadingEdgeEnabled implements getProcessingResult {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f59792j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f59793k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setSupportImageTintList f59794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f59798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f59799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f59800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f59801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f59802i;

    public setHorizontalFadingEdgeEnabled(@NotNull setSupportImageTintList setsupportimagetintlist, int i10, int i11, int i12, float f6) {
        int iRoundToInt;
        Intrinsics.checkNotNullParameter(setsupportimagetintlist, "");
        this.f59794a = setsupportimagetintlist;
        this.f59795b = i10;
        this.f59796c = i11;
        this.f59797d = i12;
        this.f59798e = f6;
        this.f59799f = ((Float) setY(new Object[]{this}, 2118173899, -2118173890, System.identityHashCode(this))).floatValue();
        this.f59800g = ((Float) setY(new Object[]{this}, 774778101, -774778091, System.identityHashCode(this))).floatValue();
        if (((Float) setY(new Object[]{this}, 954551151, -954551148, System.identityHashCode(this))).floatValue() == 0.0f) {
            setSupportImageTintList setsupportimagetintlist2 = (setSupportImageTintList) setY(new Object[]{this}, 1500236130, -1500236128, System.identityHashCode(this));
            float fFloatValue = ((Float) setY(new Object[]{this}, -1716384969, 1716384974, System.identityHashCode(this))).floatValue() * ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist2}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist2))).intValue();
            setSupportImageTintList setsupportimagetintlist3 = (setSupportImageTintList) setY(new Object[]{this}, 1500236130, -1500236128, System.identityHashCode(this));
            iRoundToInt = c.roundToInt(fFloatValue + (((Integer) setY(new Object[]{this}, 1678743617, -1678743609, System.identityHashCode(this))).intValue() * (((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist3}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist3))).intValue() - 1)));
        } else {
            setSupportImageTintList setsupportimagetintlist4 = (setSupportImageTintList) setY(new Object[]{this}, 1500236130, -1500236128, System.identityHashCode(this));
            float fFloatValue2 = ((Float) setY(new Object[]{this}, -1716384969, 1716384974, System.identityHashCode(this))).floatValue() * ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist4}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist4))).intValue();
            setSupportImageTintList setsupportimagetintlist5 = (setSupportImageTintList) setY(new Object[]{this}, 1500236130, -1500236128, System.identityHashCode(this));
            int iIntValue = ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist5}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist5))).intValue();
            int i13 = iIntValue * (-864);
            int i14 = 866 & i13;
            int i15 = -(-((i13 ^ 866) | i14));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            int i17 = ~iIntValue;
            int i18 = ~i10;
            int i19 = (-2) & i18;
            int i20 = ((~i19) & ((-2) | i18)) | i19;
            int i21 = ~i20;
            int i22 = (i20 | i21) & i21;
            int i23 = i17 & i22;
            int i24 = (~i23) & (i22 | i17);
            int i25 = -(-(((i24 & i23) | (i24 ^ i23)) * (-865)));
            int i26 = i16 & i25;
            int i27 = (i26 - (~((i16 ^ i25) | i26))) - 1;
            int i28 = i18 & 1;
            int i29 = (i10 & (-2)) | i28;
            int i30 = i10 & 1;
            int i31 = (i29 ^ i30) | (i29 & i30);
            int i32 = ~i31;
            int i33 = (((i31 | i32) & i32) * 865) + i27;
            int i34 = i17 ^ i18;
            int i35 = i17 & i18;
            int i36 = ~((i35 & i34) | (i34 ^ i35));
            int i37 = ((~i18) & 1) | i19;
            int i38 = ~((i37 & i28) | (i37 ^ i28));
            iRoundToInt = c.roundToInt(fFloatValue2 + (((Integer) setY(new Object[]{this}, 1678743617, -1678743609, System.identityHashCode(this))).intValue() * ((i33 - (~(-(-(((i36 & i38) | (i36 ^ i38)) * 865))))) - 1)));
        }
        this.f59802i = iRoundToInt;
        setSupportImageTintList setsupportimagetintlist6 = (setSupportImageTintList) setY(new Object[]{this}, 1500236130, -1500236128, System.identityHashCode(this));
        int iIntValue2 = ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist6}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist6))).intValue();
        int i39 = -(-(iIntValue2 * (-590)));
        int i40 = ((592 & i39) - (~(i39 | 592))) - 1;
        int i41 = (-2) & iIntValue2;
        int i42 = (~i41) & ((-2) | iIntValue2);
        int i43 = ~iIntValue2;
        int i44 = (~((i42 & i41) | (i42 ^ i41))) * (-1182);
        int i45 = i40 ^ i44;
        int i46 = (i44 & i40) << 1;
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        int i48 = (-2) ^ i43;
        int i49 = (-2) & i43;
        int i50 = (i48 ^ i49) | (i48 & i49);
        int i51 = ~i10;
        int i52 = i50 ^ i51;
        int i53 = i50 & i51;
        int i54 = ~((i53 & i52) | (i52 ^ i53));
        int i55 = iIntValue2 ^ 1;
        int i56 = iIntValue2 & 1;
        int i57 = (i56 & i55) | (i55 ^ i56);
        int i58 = ~i57;
        int i59 = (i57 | i58) & i58;
        int i60 = i54 ^ i59;
        int i61 = i59 & i54;
        int i62 = (i47 - (~(-(-(((i61 & i60) | (i60 ^ i61)) * (-591)))))) - 1;
        int i63 = i10 & (-2);
        int i64 = ((i10 | (-2)) & (~i63)) | i63;
        int i65 = -(-(((i64 & i43) | (i64 ^ i43)) * 591));
        float fFloatValue3 = ((Float) setY(new Object[]{this}, -1087747947, 1087747953, System.identityHashCode(this))).floatValue() * ((i62 & i65) + (i65 | i62));
        setSupportImageTintList setsupportimagetintlist7 = (setSupportImageTintList) setY(new Object[]{this}, 1500236130, -1500236128, System.identityHashCode(this));
        int iIntValue3 = ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist7}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist7))).intValue();
        int i66 = iIntValue3 & 2;
        int i67 = (iIntValue3 ^ 2) | i66;
        this.f59801h = c.roundToInt(fFloatValue3 + (((Integer) setY(new Object[]{this}, 1678743617, -1678743609, System.identityHashCode(this))).intValue() * ((i66 ^ i67) + ((i67 & i66) << 1))));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Float fValueOf;
        int i13;
        float f6;
        float fIntValue;
        float fIntValue2;
        int iRoundToInt;
        switch ((((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058) {
            case 1:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i14 = f59793k;
                int i15 = ((i14 ^ 38) + ((i14 & 38) << 1)) - 1;
                f59792j = i15 % 128;
                int i16 = i15 % 2;
                sethorizontalfadingedgeenabled.getClass();
                if (i16 == 0) {
                    return 0;
                }
                throw null;
            case 2:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled2 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i17 = f59792j;
                int i18 = ((-1) << 1) - (((i17 ^ 80) + ((i17 & 80) << 1)) ^ (-1));
                f59793k = i18 % 128;
                int i19 = i18 % 2;
                setSupportImageTintList setsupportimagetintlist = sethorizontalfadingedgeenabled2.f59794a;
                int i20 = (i17 & (-124)) | ((~i17) & 123);
                int i21 = -(-((i17 & 123) << 1));
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                f59793k = i22 % 128;
                int i23 = i22 % 2;
                return setsupportimagetintlist;
            case 3:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled3 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i24 = f59793k;
                int i25 = ((i24 ^ 89) | (i24 & 89)) << 1;
                int i26 = -((i24 & (-90)) | ((~i24) & 89));
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                f59792j = i27 % 128;
                int i28 = i27 % 2;
                float f10 = sethorizontalfadingedgeenabled3.f59798e;
                if (i28 != 0) {
                    throw null;
                }
                int i29 = i24 & 101;
                int i30 = (i24 | 101) & (~i29);
                int i31 = -(-(i29 << 1));
                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                f59792j = i32 % 128;
                int i33 = i32 % 2;
                return Float.valueOf(f10);
            case 4:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled4 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i34 = ((-1) << 1) - ((f59792j + 30) ^ (-1));
                int i35 = i34 % 128;
                f59793k = i35;
                int i36 = i34 % 2;
                int i37 = sethorizontalfadingedgeenabled4.f59802i;
                int i38 = i35 + 103;
                f59792j = i38 % 128;
                int i39 = i38 % 2;
                return Integer.valueOf(i37);
            case 5:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled5 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i40 = f59792j;
                int i41 = (i40 & 105) + (i40 | 105);
                int i42 = i41 % 128;
                f59793k = i42;
                int i43 = i41 % 2;
                float f11 = sethorizontalfadingedgeenabled5.f59799f;
                int i44 = i42 & 69;
                int i45 = ((i42 ^ 69) | i44) << 1;
                int i46 = -((i42 | 69) & (~i44));
                int i47 = (i45 & i46) + (i46 | i45);
                f59792j = i47 % 128;
                int i48 = i47 % 2;
                return Float.valueOf(f11);
            case 6:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled6 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i49 = f59793k + 61;
                int i50 = i49 % 128;
                f59792j = i50;
                int i51 = i49 % 2;
                float f12 = sethorizontalfadingedgeenabled6.f59800g;
                if (i51 != 0) {
                    throw null;
                }
                int i52 = i50 & 109;
                int i53 = (i50 ^ 109) | i52;
                int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
                f59793k = i54 % 128;
                if (i54 % 2 == 0) {
                    int i55 = 28 / 0;
                }
                fValueOf = Float.valueOf(f12);
                break;
                break;
            case 7:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled7 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                ((Number) objArr[2]).intValue();
                Rect rect = new Rect();
                if (((Float) setY(new Object[]{sethorizontalfadingedgeenabled7}, 954551151, -954551148, System.identityHashCode(sethorizontalfadingedgeenabled7))).floatValue() == 0.0f) {
                    int i56 = f59792j + 11;
                    int i57 = i56 % 128;
                    f59793k = i57;
                    if (i56 % 2 != 0) {
                        int i58 = (-2) - (((i57 ^ 46) + ((i57 & 46) << 1)) ^ (-1));
                        f59792j = i58 % 128;
                        if (i58 % 2 != 0) {
                            float fIntValue3 = (sethorizontalfadingedgeenabled7.f59795b >> (((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue() * 2)) - 3.0f;
                            int iRoundToInt2 = c.roundToInt((fIntValue3 / iIntValue) * (((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue() >>> iIntValue));
                            rect.left = iRoundToInt2;
                            f6 = iRoundToInt2 - fIntValue3;
                        } else {
                            int i59 = sethorizontalfadingedgeenabled7.f59795b;
                            int i60 = -(~(-(((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue() * 2)));
                            float f13 = (((i59 & i60) + (i59 | i60)) - 1) / 3.0f;
                            int iRoundToInt3 = c.roundToInt((iIntValue * f13) + (((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue() * iIntValue));
                            rect.left = iRoundToInt3;
                            f6 = iRoundToInt3 + f13;
                        }
                        rect.right = c.roundToInt(f6);
                        int i61 = f59792j;
                        int i62 = (i61 & (-52)) | ((~i61) & 51);
                        int i63 = -(-((i61 & 51) << 1));
                        int i64 = (i62 & i63) + (i63 | i62);
                        f59793k = i64 % 128;
                        int i65 = i64 % 2;
                    }
                    rect.top = c.roundToInt((((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 67079635, -67079624, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue() - ((Float) setY(new Object[]{sethorizontalfadingedgeenabled7}, -1087747947, 1087747953, System.identityHashCode(sethorizontalfadingedgeenabled7))).floatValue()) - ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue());
                    int iIntValue2 = ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 67079635, -67079624, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue();
                    int i66 = -(~(-((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue()));
                    rect.bottom = (((iIntValue2 | i66) << 1) - (i66 ^ iIntValue2)) - 1;
                    int i67 = f59793k;
                    int i68 = i67 ^ 53;
                    int i69 = ((i67 & 53) | i68) << 1;
                    int i70 = -i68;
                    i13 = (i69 & i70) + (i69 | i70);
                    f59792j = i13 % 128;
                    if (i13 % 2 == 0) {
                        return rect;
                    }
                    throw null;
                }
                int i71 = f59792j + 73;
                f59793k = i71 % 128;
                int i72 = i71 % 2;
                int i73 = sethorizontalfadingedgeenabled7.f59795b;
                int i74 = -(((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue() * 4);
                int i75 = ((i74 * (-419)) - (~(i73 * 421))) - 1;
                int i76 = ~iIntValue;
                int i77 = i73 & i76;
                int i78 = ~i73;
                int i79 = -(~((~(i77 | (iIntValue & i78) | (i73 & iIntValue))) * TypedValues.CycleType.TYPE_EASING));
                int i80 = ((i75 ^ i79) + ((i75 & i79) << 1)) - 1;
                int i81 = ~i74;
                int i82 = (i74 | i81) & i81;
                int i83 = i73 ^ i82;
                int i84 = i73 & i82;
                int i85 = -(~(((i83 ^ i84) | (i83 & i84)) * (-420)));
                int i86 = (-2) - (((i80 ^ i85) + ((i80 & i85) << 1)) ^ (-1));
                int i87 = ~(((~i82) & i78) | ((~i78) & i82) | (i82 & i78));
                int i88 = i73 ^ i76;
                int i89 = (i88 & i77) | (i88 ^ i77);
                int i90 = ~i89;
                int i91 = (i89 | i90) & i90;
                int i92 = -(-(((i87 & i91) | ((~i91) & i87) | ((~i87) & i91)) * TypedValues.CycleType.TYPE_EASING));
                float f14 = (((((~i92) & i86) | ((~i86) & i92)) - (~(-(-((i92 & i86) << 1))))) - 1) / 3.0f;
                int iRoundToInt4 = c.roundToInt((iIntValue * f14) + (((((iIntValue | 2) << 1) - (iIntValue ^ 2)) - 1) * ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue()));
                rect.left = iRoundToInt4;
                rect.right = c.roundToInt(iRoundToInt4 + f14);
                int i93 = f59792j;
                int i94 = (i93 ^ 27) + ((i93 & 27) << 1);
                f59793k = i94 % 128;
                int i95 = i94 % 2;
                rect.top = c.roundToInt((((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 67079635, -67079624, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue() - ((Float) setY(new Object[]{sethorizontalfadingedgeenabled7}, -1087747947, 1087747953, System.identityHashCode(sethorizontalfadingedgeenabled7))).floatValue()) - ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue());
                int iIntValue3 = ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 67079635, -67079624, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue();
                int i610 = -(~(-((Integer) setY(new Object[]{sethorizontalfadingedgeenabled7}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled7))).intValue()));
                rect.bottom = (((iIntValue3 | i610) << 1) - (i610 ^ iIntValue3)) - 1;
                int i611 = f59793k;
                int i612 = i611 ^ 53;
                int i613 = ((i611 & 53) | i612) << 1;
                int i710 = -i612;
                i13 = (i613 & i710) + (i613 | i710);
                f59792j = i13 % 128;
                if (i13 % 2 == 0) {
                    return rect;
                }
                throw null;
            case 8:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled8 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i96 = f59792j;
                int i97 = (i96 ^ 81) + ((i96 & 81) << 1);
                f59793k = i97 % 128;
                int i98 = i97 % 2;
                int i99 = sethorizontalfadingedgeenabled8.f59797d;
                if (i98 != 0) {
                    return Integer.valueOf(i99);
                }
                throw null;
            case 9:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled9 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i100 = f59792j + 55;
                f59793k = i100 % 128;
                int i101 = i100 % 2;
                if (((Float) setY(new Object[]{sethorizontalfadingedgeenabled9}, 954551151, -954551148, System.identityHashCode(sethorizontalfadingedgeenabled9))).floatValue() == 0.0f) {
                    int i102 = f59792j;
                    int i103 = ((i102 ^ 75) | (i102 & 75)) << 1;
                    int i104 = -(((~i102) & 75) | (i102 & (-76)));
                    int i105 = (i103 & i104) + (i104 | i103);
                    int i106 = i105 % 128;
                    f59793k = i106;
                    int i107 = i105 % 2;
                    int i108 = (i106 & 117) + (i106 | 117);
                    int i109 = i108 % 128;
                    f59792j = i109;
                    int i110 = i108 % 2;
                    int i111 = ((i109 & 116) + (i109 | 116)) - 1;
                    f59793k = i111 % 128;
                    if (i111 % 2 == 0) {
                        float f15 = sethorizontalfadingedgeenabled9.f59795b;
                        setSupportImageTintList setsupportimagetintlist2 = (setSupportImageTintList) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled9));
                        float fIntValue4 = f15 - ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist2}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist2))).intValue() / 1.0f) + ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled9))).intValue());
                        setSupportImageTintList setsupportimagetintlist3 = (setSupportImageTintList) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled9));
                        fIntValue = fIntValue4 - ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist3}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist3))).intValue();
                    } else {
                        float f16 = sethorizontalfadingedgeenabled9.f59795b;
                        setSupportImageTintList setsupportimagetintlist4 = (setSupportImageTintList) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled9));
                        float fIntValue5 = f16 - ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist4}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist4))).intValue() - 1.0f) * ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled9))).intValue());
                        setSupportImageTintList setsupportimagetintlist5 = (setSupportImageTintList) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled9));
                        fIntValue = fIntValue5 / ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist5}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist5))).intValue();
                    }
                    int i112 = f59793k;
                    int i113 = (i112 & 11) + (i112 | 11);
                    f59792j = i113 % 128;
                    if (i113 % 2 != 0) {
                        throw null;
                    }
                } else {
                    int i114 = f59792j;
                    int i115 = i114 & 73;
                    int i116 = ((((i114 ^ 73) | i115) << 1) - (~(-((i114 | 73) & (~i115))))) - 1;
                    f59793k = i116 % 128;
                    int i117 = i116 % 2;
                    float f17 = sethorizontalfadingedgeenabled9.f59795b;
                    setSupportImageTintList setsupportimagetintlist6 = (setSupportImageTintList) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled9));
                    float fIntValue6 = f17 - ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist6}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist6))).intValue() + 1.0f) * ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled9))).intValue());
                    setSupportImageTintList setsupportimagetintlist7 = (setSupportImageTintList) setY(new Object[]{sethorizontalfadingedgeenabled9}, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled9));
                    fIntValue = fIntValue6 / ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist7}, -425827594, 425827594, System.identityHashCode(setsupportimagetintlist7))).intValue();
                    int i118 = f59792j + 19;
                    f59793k = i118 % 128;
                    int i119 = i118 % 2;
                }
                fValueOf = Float.valueOf(fIntValue);
                break;
            case 10:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled10 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i120 = f59792j;
                int i121 = i120 & 65;
                int i122 = -(-((i120 ^ 65) | i121));
                int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                f59793k = i123 % 128;
                int i124 = i123 % 2;
                float f18 = sethorizontalfadingedgeenabled10.f59796c;
                Object[] objArr2 = new Object[1];
                if (i124 == 0) {
                    objArr2[0] = sethorizontalfadingedgeenabled10;
                    setSupportImageTintList setsupportimagetintlist8 = (setSupportImageTintList) setY(objArr2, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled10));
                    float fIntValue7 = ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist8}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist8))).intValue() - 0.0f) - ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled10}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled10))).intValue()) + f18;
                    setSupportImageTintList setsupportimagetintlist9 = (setSupportImageTintList) setY(new Object[]{sethorizontalfadingedgeenabled10}, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled10));
                    fIntValue2 = fIntValue7 / (((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist9}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist9))).intValue() * 1.0f);
                } else {
                    objArr2[0] = sethorizontalfadingedgeenabled10;
                    setSupportImageTintList setsupportimagetintlist10 = (setSupportImageTintList) setY(objArr2, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled10));
                    float fIntValue8 = f18 - ((((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist10}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist10))).intValue() + 2.0f) * ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled10}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled10))).intValue());
                    setSupportImageTintList setsupportimagetintlist11 = (setSupportImageTintList) setY(new Object[]{sethorizontalfadingedgeenabled10}, 1500236130, -1500236128, System.identityHashCode(sethorizontalfadingedgeenabled10));
                    fIntValue2 = fIntValue8 / (((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{setsupportimagetintlist11}, 1397292818, -1397292817, System.identityHashCode(setsupportimagetintlist11))).intValue() + 1.0f);
                }
                int i125 = f59793k;
                int i126 = ((i125 & 106) + (i125 | 106)) - 1;
                f59792j = i126 % 128;
                int i127 = i126 % 2;
                return Float.valueOf(fIntValue2);
            case 11:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled11 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i128 = f59793k;
                int i129 = (i128 ^ 51) + ((i128 & 51) << 1);
                int i130 = i129 % 128;
                f59792j = i130;
                int i131 = i129 % 2;
                int i132 = sethorizontalfadingedgeenabled11.f59801h;
                int i133 = (i130 & 75) + (i130 | 75);
                f59793k = i133 % 128;
                int i134 = i133 % 2;
                return Integer.valueOf(i132);
            case 12:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled12 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int i135 = f59793k;
                int i136 = i135 ^ 23;
                int i137 = (i135 & 23) << 1;
                int i138 = (i136 & i137) + (i137 | i136);
                f59792j = i138 % 128;
                int i139 = i138 % 2;
                sethorizontalfadingedgeenabled12.getClass();
                if (i139 == 0) {
                    return 0;
                }
                throw null;
            default:
                setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled13 = (setHorizontalFadingEdgeEnabled) objArr[0];
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int iIntValue5 = ((Number) objArr[2]).intValue();
                Rect rect2 = new Rect();
                if (((Float) setY(new Object[]{sethorizontalfadingedgeenabled13}, 954551151, -954551148, System.identityHashCode(sethorizontalfadingedgeenabled13))).floatValue() == 0.0f) {
                    int i140 = f59792j + 83;
                    int i141 = i140 % 128;
                    f59793k = i141;
                    int i142 = i140 % 2;
                    int i143 = i141 & 39;
                    int i144 = ((((i141 ^ 39) | i143) << 1) - (~(-((i141 | 39) & (~i143))))) - 1;
                    f59792j = i144 % 128;
                    iRoundToInt = i144 % 2 != 0 ? c.roundToInt((((Float) setY(new Object[]{sethorizontalfadingedgeenabled13}, -1716384969, 1716384974, System.identityHashCode(sethorizontalfadingedgeenabled13))).floatValue() % iIntValue4) + (((Integer) setY(new Object[]{sethorizontalfadingedgeenabled13}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled13))).intValue() % iIntValue4)) : c.roundToInt((((Float) setY(new Object[]{sethorizontalfadingedgeenabled13}, -1716384969, 1716384974, System.identityHashCode(sethorizontalfadingedgeenabled13))).floatValue() * iIntValue4) + (((Integer) setY(new Object[]{sethorizontalfadingedgeenabled13}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled13))).intValue() * iIntValue4));
                } else {
                    int i145 = f59793k;
                    int i146 = ((i145 & 34) + (i145 | 34)) - 1;
                    f59792j = i146 % 128;
                    int i147 = i146 % 2;
                    int i148 = iIntValue4 & 1;
                    int i149 = -(-((iIntValue4 ^ 1) | i148));
                    iRoundToInt = c.roundToInt((((Float) setY(new Object[]{sethorizontalfadingedgeenabled13}, -1716384969, 1716384974, System.identityHashCode(sethorizontalfadingedgeenabled13))).floatValue() * iIntValue4) + ((((i148 | i149) << 1) - (i149 ^ i148)) * ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled13}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled13))).intValue()));
                    int i150 = f59793k;
                    int i151 = i150 & 73;
                    int i152 = i151 + ((i150 ^ 73) | i151);
                    f59792j = i152 % 128;
                    int i153 = i152 % 2;
                }
                rect2.left = iRoundToInt;
                rect2.right = c.roundToInt(((Float) setY(new Object[]{sethorizontalfadingedgeenabled13}, -1716384969, 1716384974, System.identityHashCode(sethorizontalfadingedgeenabled13))).floatValue() + iRoundToInt);
                int iRoundToInt5 = c.roundToInt((((Float) setY(new Object[]{sethorizontalfadingedgeenabled13}, -1087747947, 1087747953, System.identityHashCode(sethorizontalfadingedgeenabled13))).floatValue() * iIntValue5) + (((iIntValue5 & 1) + (iIntValue5 | 1)) * ((Integer) setY(new Object[]{sethorizontalfadingedgeenabled13}, 1678743617, -1678743609, System.identityHashCode(sethorizontalfadingedgeenabled13))).intValue()));
                rect2.top = iRoundToInt5;
                rect2.bottom = c.roundToInt(((Float) setY(new Object[]{sethorizontalfadingedgeenabled13}, -1087747947, 1087747953, System.identityHashCode(sethorizontalfadingedgeenabled13))).floatValue() + iRoundToInt5);
                int i154 = f59793k;
                int i155 = i154 & 39;
                int i156 = -(-((i154 ^ 39) | i155));
                int i157 = (i155 ^ i156) + ((i156 & i155) << 1);
                f59792j = i157 % 128;
                if (i157 % 2 == 0) {
                    return rect2;
                }
                int i158 = 91 / 0;
                return rect2;
        }
        return fValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    @NotNull
    public final Rect E_(int i10, int i11) {
        return (Rect) setY(new Object[]{this, Integer.valueOf(i10), Integer.valueOf(i11)}, -1955577159, 1955577159, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    @NotNull
    public final Rect F_(int i10, int i11) {
        return (Rect) setY(new Object[]{this, Integer.valueOf(i10), Integer.valueOf(i11)}, 1009351991, -1009351984, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setY(new Object[]{this}, 579489713, -579489701, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final float setDividerPadding() {
        return ((Float) setY(new Object[]{this}, -1087747947, 1087747953, System.identityHashCode(this))).floatValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    @NotNull
    public final setSupportImageTintList setLayoutAnimation() {
        return (setSupportImageTintList) setY(new Object[]{this}, 1500236130, -1500236128, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setNavigationOnClickListener() {
        return ((Integer) setY(new Object[]{this}, -1409886640, 1409886644, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final float setOnFocusChangeListener() {
        return ((Float) setY(new Object[]{this}, -1716384969, 1716384974, System.identityHashCode(this))).floatValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setOnLongClickListener() {
        return ((Integer) setY(new Object[]{this}, 67079635, -67079624, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setX() {
        return ((Integer) setY(new Object[]{this}, 1678743617, -1678743609, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getProcessingResult
    public final int setY() {
        return ((Integer) setY(new Object[]{this}, -396605323, 396605324, System.identityHashCode(this))).intValue();
    }
}
