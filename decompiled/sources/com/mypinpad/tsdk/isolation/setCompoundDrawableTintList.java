package com.mypinpad.tsdk.isolation;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setCompoundDrawableTintList {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59563b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59564c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f59565a = new AtomicInteger(0);

    public static final class getNavBarTitleString extends getId {
    }

    public static final class setAlwaysDrawnWithCacheEnabled extends setAccessibilityHeading {
    }

    public static final class setCompoundDrawableTintBlendMode extends setHovered {
    }

    public static final class setDividerPadding extends component21 {
    }

    public static final class setLayoutAnimation extends setSelectionAfterHeaderView {
    }

    public static final class setNavigationOnClickListener extends setSelectedGroup {
    }

    public static final class setOnDragListener extends setHintTextColor {
    }

    public static final class setOnFocusChangeListener extends description {
    }

    public static final class setOnLongClickListener extends setMapTrackballToArrowKeys {
    }

    public static final class setX extends setStateDescription {
    }

    public static final class setY extends setAutoSizeTextTypeUniformWithConfiguration {
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object setcompounddrawabletintblendmode;
        Object setonfocuschangelistener;
        Object objValueOf;
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        switch (((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13) {
            case 1:
                setCompoundDrawableTintList setcompounddrawabletintlist = (setCompoundDrawableTintList) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                Intrinsics.checkNotNullParameter(bArr, "");
                setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode(((Integer) setY(new Object[]{setcompounddrawabletintlist}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist))).intValue(), bArr);
                int i16 = (-2) - ((f59564c + 50) ^ (-1));
                f59563b = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 51 / 0;
                }
                return setcompounddrawabletintblendmode;
            case 2:
                setCompoundDrawableTintList setcompounddrawabletintlist2 = (setCompoundDrawableTintList) objArr[0];
                component16 component16Var = (component16) objArr[1];
                byte[] bArr2 = (byte[]) objArr[2];
                byte[] bArr3 = (byte[]) objArr[3];
                Intrinsics.checkNotNullParameter(bArr2, "");
                Intrinsics.checkNotNullParameter(bArr3, "");
                setonfocuschangelistener = new setOnFocusChangeListener(((Integer) setY(new Object[]{setcompounddrawabletintlist2}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist2))).intValue(), component16Var, bArr2, bArr3);
                int i18 = ((-1) << 1) - ((f59563b + 52) ^ (-1));
                f59564c = i18 % 128;
                int i19 = i18 % 2;
                return setonfocuschangelistener;
            case 3:
                setCompoundDrawableTintList setcompounddrawabletintlist3 = (setCompoundDrawableTintList) objArr[0];
                component16 component16Var2 = (component16) objArr[1];
                byte[] bArr4 = (byte[]) objArr[2];
                byte[] bArr5 = (byte[]) objArr[3];
                Intrinsics.checkNotNullParameter(bArr4, "");
                Intrinsics.checkNotNullParameter(bArr5, "");
                setonfocuschangelistener = new setLayoutAnimation(((Integer) setY(new Object[]{setcompounddrawabletintlist3}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist3))).intValue(), component16Var2, bArr4, bArr5);
                int i20 = f59563b + 43;
                f59564c = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 72 / 0;
                }
                return setonfocuschangelistener;
            case 4:
                setCompoundDrawableTintList setcompounddrawabletintlist4 = (setCompoundDrawableTintList) objArr[0];
                setClipChildren setclipchildren = (setClipChildren) objArr[1];
                setProgressTintList setprogresstintlist = (setProgressTintList) objArr[2];
                Intrinsics.checkNotNullParameter(setclipchildren, "");
                Intrinsics.checkNotNullParameter(setprogresstintlist, "");
                setonfocuschangelistener = new setAlwaysDrawnWithCacheEnabled(((Integer) setY(new Object[]{setcompounddrawabletintlist4}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist4))).intValue(), setclipchildren, setprogresstintlist);
                int i22 = f59564c;
                int i23 = (((i22 | 66) << 1) - (i22 ^ 66)) - 1;
                f59563b = i23 % 128;
                int i24 = i23 % 2;
                return setonfocuschangelistener;
            case 5:
                setCompoundDrawableTintList setcompounddrawabletintlist5 = (setCompoundDrawableTintList) objArr[0];
                int i25 = f59563b;
                int i26 = i25 | 87;
                int i27 = i26 << 1;
                int i28 = -((~(i25 & 87)) & i26);
                int i29 = (i27 & i28) + (i28 | i27);
                f59564c = i29 % 128;
                int i30 = i29 % 2;
                int andAdd = setcompounddrawabletintlist5.f59565a.getAndAdd(1);
                int i31 = f59563b + 99;
                f59564c = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 63 / 0;
                }
                objValueOf = Integer.valueOf(andAdd);
                return objValueOf;
            case 6:
                setCompoundDrawableTintList setcompounddrawabletintlist6 = (setCompoundDrawableTintList) objArr[0];
                component16 component16Var3 = (component16) objArr[1];
                byte[] bArr6 = (byte[]) objArr[2];
                byte[] bArr7 = (byte[]) objArr[3];
                Intrinsics.checkNotNullParameter(bArr6, "");
                Intrinsics.checkNotNullParameter(bArr7, "");
                setonfocuschangelistener = new setY(((Integer) setY(new Object[]{setcompounddrawabletintlist6}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist6))).intValue(), component16Var3, bArr6, bArr7);
                int i33 = f59564c;
                int i34 = i33 & 91;
                int i35 = i33 | 91;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f59563b = i36 % 128;
                int i37 = i36 % 2;
                return setonfocuschangelistener;
            case 7:
                setCompoundDrawableTintList setcompounddrawabletintlist7 = (setCompoundDrawableTintList) objArr[0];
                setcompounddrawabletintblendmode = new setOnLongClickListener(((Integer) setY(new Object[]{setcompounddrawabletintlist7}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist7))).intValue(), (SessionActivationFailureCause) objArr[1]);
                int i38 = f59564c;
                int i39 = ((i38 & 114) + (i38 | 114)) - 1;
                f59563b = i39 % 128;
                if (i39 % 2 != 0) {
                    throw null;
                }
                return setcompounddrawabletintblendmode;
            case 8:
                setCompoundDrawableTintList setcompounddrawabletintlist8 = (setCompoundDrawableTintList) objArr[0];
                getNavBarTitleString getnavbartitlestring = new getNavBarTitleString(((Integer) setY(new Object[]{setcompounddrawabletintlist8}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist8))).intValue());
                int i40 = f59563b;
                int i41 = ((i40 | 49) << 1) - (i40 ^ 49);
                f59564c = i41 % 128;
                int i42 = i41 % 2;
                return getnavbartitlestring;
            case 9:
                setCompoundDrawableTintList setcompounddrawabletintlist9 = (setCompoundDrawableTintList) objArr[0];
                component16 component16Var4 = (component16) objArr[1];
                byte[] bArr8 = (byte[]) objArr[2];
                byte[] bArr9 = (byte[]) objArr[3];
                Intrinsics.checkNotNullParameter(bArr8, "");
                Intrinsics.checkNotNullParameter(bArr9, "");
                setonfocuschangelistener = new setOnDragListener(((Integer) setY(new Object[]{setcompounddrawabletintlist9}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist9))).intValue(), component16Var4, bArr8, bArr9);
                int i43 = f59564c;
                int i44 = i43 & 93;
                int i45 = (i43 ^ 93) | i44;
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                f59563b = i46 % 128;
                if (i46 % 2 != 0) {
                    throw null;
                }
                return setonfocuschangelistener;
            case 10:
                setCompoundDrawableTintList setcompounddrawabletintlist10 = (setCompoundDrawableTintList) objArr[0];
                setClipChildren setclipchildren2 = (setClipChildren) objArr[1];
                setProgressTintList setprogresstintlist2 = (setProgressTintList) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                byte[] bArr10 = (byte[]) objArr[4];
                SessionActivationFailureCause sessionActivationFailureCause = (SessionActivationFailureCause) objArr[5];
                setSaveFromParentEnabled setsavefromparentenabled = (setSaveFromParentEnabled) objArr[6];
                component16 component16Var5 = (component16) objArr[7];
                Intrinsics.checkNotNullParameter(setclipchildren2, "");
                objValueOf = new setNavigationOnClickListener(((Integer) setY(new Object[]{setcompounddrawabletintlist10}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist10))).intValue(), setclipchildren2, setprogresstintlist2, zBooleanValue, bArr10, sessionActivationFailureCause, setsavefromparentenabled, component16Var5);
                int i47 = f59564c;
                int i48 = (-2) - ((-1) ^ (((i47 | 100) << 1) - (i47 ^ 100)));
                f59563b = i48 % 128;
                if (i48 % 2 != 0) {
                    throw null;
                }
                return objValueOf;
            case 11:
                setCompoundDrawableTintList setcompounddrawabletintlist11 = (setCompoundDrawableTintList) objArr[0];
                component16 component16Var6 = (component16) objArr[1];
                byte[] bArr11 = (byte[]) objArr[2];
                byte[] bArr12 = (byte[]) objArr[3];
                Intrinsics.checkNotNullParameter(bArr11, "");
                Intrinsics.checkNotNullParameter(bArr12, "");
                setonfocuschangelistener = new setDividerPadding(((Integer) setY(new Object[]{setcompounddrawabletintlist11}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist11))).intValue(), component16Var6, bArr11, bArr12);
                int i49 = f59564c + 87;
                f59563b = i49 % 128;
                if (i49 % 2 != 0) {
                    throw null;
                }
                return setonfocuschangelistener;
            default:
                setCompoundDrawableTintList setcompounddrawabletintlist12 = (setCompoundDrawableTintList) objArr[0];
                component22 component22Var = (component22) objArr[1];
                Intrinsics.checkNotNullParameter(component22Var, "");
                setX setx = new setX(((Integer) setY(new Object[]{setcompounddrawabletintlist12}, -1698738482, 1698738487, System.identityHashCode(setcompounddrawabletintlist12))).intValue(), component22Var);
                int i50 = f59563b + 113;
                f59564c = i50 % 128;
                if (i50 % 2 != 0) {
                    return setx;
                }
                int i51 = 23 / 0;
                return setx;
        }
    }

    @NotNull
    public final setHovered setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) {
        return (setHovered) setY(new Object[]{this, bArr}, -595954644, 595954645, System.identityHashCode(this));
    }

    @NotNull
    public final component21 setDividerPadding(@Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (component21) setY(new Object[]{this, component16Var, bArr, bArr2}, -1156313229, 1156313240, System.identityHashCode(this));
    }

    @NotNull
    public final setStateDescription setOnFocusChangeListener(@NotNull component22 component22Var) {
        return (setStateDescription) setY(new Object[]{this, component22Var}, -1829490722, 1829490722, System.identityHashCode(this));
    }

    @NotNull
    public final setHintTextColor setX(@Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (setHintTextColor) setY(new Object[]{this, component16Var, bArr, bArr2}, 1631740554, -1631740545, System.identityHashCode(this));
    }

    @NotNull
    public final setSelectionAfterHeaderView setCompoundDrawableTintBlendMode(@Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (setSelectionAfterHeaderView) setY(new Object[]{this, component16Var, bArr, bArr2}, -437051737, 437051740, System.identityHashCode(this));
    }

    @NotNull
    public final setMapTrackballToArrowKeys setDividerPadding(@Nullable SessionActivationFailureCause sessionActivationFailureCause) {
        return (setMapTrackballToArrowKeys) setY(new Object[]{this, sessionActivationFailureCause}, 593147367, -593147360, System.identityHashCode(this));
    }

    @NotNull
    public final setSystemGestureExclusionRects setOnFocusChangeListener(@NotNull setClipChildren setclipchildren, @Nullable setProgressTintList setprogresstintlist, boolean z10, @Nullable byte[] bArr, @Nullable SessionActivationFailureCause sessionActivationFailureCause, @Nullable setSaveFromParentEnabled setsavefromparentenabled, @Nullable component16 component16Var) {
        return (setSystemGestureExclusionRects) setY(new Object[]{this, setclipchildren, setprogresstintlist, Boolean.valueOf(z10), bArr, sessionActivationFailureCause, setsavefromparentenabled, component16Var}, 148661860, -148661850, System.identityHashCode(this));
    }

    @NotNull
    public final getId setOnFocusChangeListener() {
        return (getId) setY(new Object[]{this}, -507292573, 507292581, System.identityHashCode(this));
    }

    @NotNull
    public final description setOnFocusChangeListener(@Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (description) setY(new Object[]{this, component16Var, bArr, bArr2}, -1458464409, 1458464411, System.identityHashCode(this));
    }

    @NotNull
    public final setAutoSizeTextTypeUniformWithConfiguration setY(@Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (setAutoSizeTextTypeUniformWithConfiguration) setY(new Object[]{this, component16Var, bArr, bArr2}, -2025331163, 2025331169, System.identityHashCode(this));
    }

    @NotNull
    public final setAccessibilityHeading setY(@NotNull setClipChildren setclipchildren, @NotNull setProgressTintList setprogresstintlist) {
        return (setAccessibilityHeading) setY(new Object[]{this, setclipchildren, setprogresstintlist}, -192762444, 192762448, System.identityHashCode(this));
    }
}
