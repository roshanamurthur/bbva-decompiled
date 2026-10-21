package com.mypinpad.tsdk.isolation;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class TsdkInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51939a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51940b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setCollapseIcon.setY sety;
        int i13 = ~i12;
        int i14 = ~i11;
        int i15 = (((~(i10 | i11 | i12)) | (~(i13 | i14)) | (~((~i10) | i14))) * 757) + ((~(i14 | i10 | i12)) * 1514) + ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
        if (i15 != 1) {
            if (i15 == 2) {
                Rect rect = (Rect) objArr[0];
                int i16 = f51940b;
                int i17 = i16 & 3;
                int i18 = -(-(i16 | 3));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f51939a = i19 % 128;
                int i20 = i19 % 2;
                RectF rectF = (RectF) setDividerPadding(new Object[]{rect}, 308516988, -308516985, (int) System.currentTimeMillis());
                int i21 = f51940b;
                int i22 = (i21 & 30) + (i21 | 30);
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                f51939a = i23 % 128;
                if (i23 % 2 == 0) {
                    return rectF;
                }
                throw null;
            }
            if (i15 == 3) {
                Rect rect2 = (Rect) objArr[0];
                RectF rectF2 = new RectF(rect2.left, rect2.top, rect2.right, rect2.bottom);
                int i24 = f51940b;
                int i25 = i24 & 107;
                int i26 = ((((i24 ^ 107) | i25) << 1) - (~(-((i24 | 107) & (~i25))))) - 1;
                f51939a = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 35 / 0;
                }
                return rectF2;
            }
            getMetadata getmetadata = (getMetadata) objArr[0];
            int i28 = f51940b;
            int i29 = (i28 & 87) + (i28 | 87);
            f51939a = i29 % 128;
            if (i29 % 2 != 0) {
                sety = (setCollapseIcon.setY) setDividerPadding(new Object[]{getmetadata}, -2135159411, 2135159412, (int) System.currentTimeMillis());
                int i30 = 71 / 0;
            } else {
                sety = (setCollapseIcon.setY) setDividerPadding(new Object[]{getmetadata}, -2135159411, 2135159412, (int) System.currentTimeMillis());
            }
            int i31 = f51939a;
            int i32 = i31 & 15;
            int i33 = -(-((i31 ^ 15) | i32));
            int i34 = (i32 & i33) + (i33 | i32);
            f51940b = i34 % 128;
            int i35 = i34 % 2;
            return sety;
        }
        getMetadata getmetadata2 = (getMetadata) objArr[0];
        int i36 = f51939a;
        int i37 = (i36 ^ 102) + ((i36 & 102) << 1);
        int i38 = (i37 ^ (-1)) + (i37 << 1);
        int i39 = i38 % 128;
        f51940b = i39;
        if (i38 % 2 == 0) {
            boolean z10 = getmetadata2 instanceof setImeOptions;
            throw null;
        }
        if (!(!(getmetadata2 instanceof setImeOptions))) {
            int i40 = i39 & 53;
            int i41 = i40 + ((i39 ^ 53) | i40);
            f51939a = i41 % 128;
            int i42 = i41 % 2;
            setCollapseIcon.setY sety2 = setCollapseIcon.setY.setX;
            int i43 = f51939a;
            int i44 = (i43 ^ 101) + ((i43 & 101) << 1);
            f51940b = i44 % 128;
            int i45 = i44 % 2;
            return sety2;
        }
        if (getmetadata2 instanceof setTextMetricsParams) {
            int i46 = ((i39 ^ 122) + ((i39 & 122) << 1)) - 1;
            f51939a = i46 % 128;
            int i47 = i46 % 2;
            setCollapseIcon.setY sety3 = setCollapseIcon.setY.setOnFocusChangeListener;
            int i48 = f51940b + 39;
            f51939a = i48 % 128;
            int i49 = i48 % 2;
            return sety3;
        }
        if (!(!(getmetadata2 instanceof setImageDrawable))) {
            int i50 = i36 & 73;
            int i51 = (i36 | 73) & (~i50);
            int i52 = i50 << 1;
            int i53 = (i51 & i52) + (i52 | i51);
            f51940b = i53 % 128;
            int i54 = i53 % 2;
            setCollapseIcon.setY sety4 = setCollapseIcon.setY.setCompoundDrawableTintBlendMode;
            int i55 = f51940b;
            int i56 = i55 & 75;
            int i57 = ((i55 ^ 75) | i56) << 1;
            int i58 = -((i55 | 75) & (~i56));
            int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
            f51939a = i59 % 128;
            if (i59 % 2 == 0) {
                return sety4;
            }
            throw null;
        }
        if (!(getmetadata2 instanceof setNestedScrollingEnabled)) {
            throw new NoWhenBranchMatchedException();
        }
        int i60 = i36 + 71;
        f51940b = i60 % 128;
        if (i60 % 2 == 0) {
            setCollapseIcon.setY sety5 = setCollapseIcon.setY.setX;
            throw null;
        }
        setCollapseIcon.setY sety6 = setCollapseIcon.setY.setY;
        int i61 = f51940b;
        int i62 = ((i61 ^ 123) | (i61 & 123)) << 1;
        int i63 = -(((~i61) & 123) | (i61 & (-124)));
        int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
        f51939a = i64 % 128;
        if (i64 % 2 == 0) {
            return sety6;
        }
        throw null;
    }

    public static final /* synthetic */ setCollapseIcon.setY setX(getMetadata getmetadata) {
        return (setCollapseIcon.setY) setDividerPadding(new Object[]{getmetadata}, 1323446622, -1323446622, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ RectF w_(Rect rect) {
        return (RectF) setDividerPadding(new Object[]{rect}, 1432924026, -1432924024, (int) System.currentTimeMillis());
    }
}
