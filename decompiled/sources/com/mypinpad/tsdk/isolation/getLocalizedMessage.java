package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getLocalizedMessage implements setDescendantFocusability {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55903d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55904e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getWidth f55905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TerminalCallbackKt f55906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setColorFilter f55907c;

    public getLocalizedMessage(@NotNull getWidth getwidth, @NotNull TerminalCallbackKt terminalCallbackKt, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(getwidth, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f55905a = getwidth;
        this.f55906b = terminalCallbackKt;
        this.f55907c = setcolorfilter;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Object readresolve;
        byte[] bArr;
        int i13 = ~i10;
        switch ((((~(i10 | (~i11))) | (~(i11 | i13 | i12))) * 235) + (((~(i13 | i12)) | i11) * (-470)) + (((~((~i12) | i13)) | i11) * (-235)) + (i11 * 471) + (i10 * 236)) {
            case 1:
                getLocalizedMessage getlocalizedmessage = (getLocalizedMessage) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i14 = f55904e;
                int i15 = (i14 ^ 3) + ((i14 & 3) << 1);
                f55903d = i15 % 128;
                if (i15 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    setProgressBackgroundTintList onFocusChangeListener = getlocalizedmessage.f55905a.setOnFocusChangeListener(bArr2);
                    return (byte[]) setProgressBackgroundTintList.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener}, 467198636, -467198636, System.identityHashCode(onFocusChangeListener));
                }
                Intrinsics.checkNotNullParameter(bArr2, "");
                setProgressBackgroundTintList onFocusChangeListener2 = getlocalizedmessage.f55905a.setOnFocusChangeListener(bArr2);
                throw null;
            case 2:
                getLocalizedMessage getlocalizedmessage2 = (getLocalizedMessage) objArr[0];
                int i16 = f55903d;
                int i17 = ((i16 & 12) + (i16 | 12)) - 1;
                f55904e = i17 % 128;
                int i18 = i17 % 2;
                setHorizontallyScrolling x4 = getlocalizedmessage2.f55905a.setX();
                if (i18 == 0) {
                    throw null;
                }
                readresolve = (byte[]) setHorizontallyScrolling.setCompoundDrawableTintBlendMode(new Object[]{x4}, 758296987, -758296987, System.identityHashCode(x4));
                int i19 = f55903d;
                int i20 = (((i19 ^ 5) | (i19 & 5)) << 1) - (((~i19) & 5) | (i19 & (-6)));
                f55904e = i20 % 128;
                if (i20 % 2 == 0) {
                    throw null;
                }
                break;
            case 3:
                getLocalizedMessage getlocalizedmessage3 = (getLocalizedMessage) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                byte[] bArr4 = (byte[]) objArr[2];
                int i21 = f55904e;
                int i22 = (((i21 | 40) << 1) - (i21 ^ 40)) - 1;
                f55903d = i22 % 128;
                if (i22 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr3, "");
                    Intrinsics.checkNotNullParameter(bArr4, "");
                    getProgressBarColor compoundDrawableTintBlendMode = getlocalizedmessage3.f55905a.setCompoundDrawableTintBlendMode(bArr3, bArr4);
                    bArr = (byte[]) getProgressBarColor.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode}, -2055569254, 2055569254, System.identityHashCode(compoundDrawableTintBlendMode));
                    int i23 = 45 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(bArr3, "");
                    Intrinsics.checkNotNullParameter(bArr4, "");
                    getProgressBarColor compoundDrawableTintBlendMode2 = getlocalizedmessage3.f55905a.setCompoundDrawableTintBlendMode(bArr3, bArr4);
                    bArr = (byte[]) getProgressBarColor.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode2}, -2055569254, 2055569254, System.identityHashCode(compoundDrawableTintBlendMode2));
                }
                byte[] bArr5 = bArr;
                int i24 = f55904e;
                int i25 = ((i24 ^ 101) - (~(-(-((i24 & 101) << 1))))) - 1;
                f55903d = i25 % 128;
                int i26 = i25 % 2;
                return bArr5;
            case 4:
                getLocalizedMessage getlocalizedmessage4 = (getLocalizedMessage) objArr[0];
                int i27 = f55903d + 111;
                f55904e = i27 % 128;
                int i28 = i27 % 2;
                getDecimalSeparator compoundDrawableTintBlendMode3 = getlocalizedmessage4.f55905a.setCompoundDrawableTintBlendMode();
                if (i28 != 0) {
                    return Long.valueOf(((Long) getDecimalSeparator.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode3}, 1401997899, -1401997899, System.identityHashCode(compoundDrawableTintBlendMode3))).longValue());
                }
                ((Long) getDecimalSeparator.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode3}, 1401997899, -1401997899, System.identityHashCode(compoundDrawableTintBlendMode3))).longValue();
                throw null;
            case 5:
                getLocalizedMessage getlocalizedmessage5 = (getLocalizedMessage) objArr[0];
                getAmountFieldBgColor getamountfieldbgcolor = (getAmountFieldBgColor) objArr[1];
                Intrinsics.checkNotNullParameter(getamountfieldbgcolor, "");
                getlocalizedmessage5.f55905a.setOnFocusChangeListener(new getDynamicButtonTextColor(getamountfieldbgcolor));
                int i29 = f55903d;
                int i30 = i29 & 1;
                int i31 = -(-((i29 ^ 1) | i30));
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                f55904e = i32 % 128;
                if (i32 % 2 != 0) {
                    return null;
                }
                throw null;
            case 6:
                getLocalizedMessage getlocalizedmessage6 = (getLocalizedMessage) objArr[0];
                readresolve = new readResolve(getlocalizedmessage6.f55905a, getlocalizedmessage6.f55906b, getlocalizedmessage6.f55907c, null);
                int i33 = f55904e;
                int i34 = i33 & 125;
                int i35 = (i33 ^ 125) | i34;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                f55903d = i36 % 128;
                int i37 = i36 % 2;
                break;
            case 7:
                getLocalizedMessage getlocalizedmessage7 = (getLocalizedMessage) objArr[0];
                int iIdentityHashCode = System.identityHashCode(getlocalizedmessage7);
                int i38 = (-539027211) ^ iIdentityHashCode;
                int i39 = ~iIdentityHashCode;
                int i40 = iIdentityHashCode & (-539027211);
                int i41 = (i40 & i38) | (i38 ^ i40);
                int i42 = ~i41;
                int i43 = (-1638723567) & i42;
                int i44 = ((-1638723567) | i42) & (~i43);
                int i45 = -(-(((i44 & i43) | (i44 ^ i43)) * (-476)));
                int i46 = 1723351079 & i45;
                int i47 = -(-((i45 ^ 1723351079) | i46));
                int i48 = (((i46 & i47) + (i47 | i46)) - (~(-(-(((i41 | i42) & i42) * 952))))) - 1;
                int i49 = ((~i39) & (-564193039)) | (564193038 & i39);
                int i50 = (-564193039) & i39;
                int i51 = (i49 & i50) | (i49 ^ i50);
                int i52 = (1613557738 & i51) | ((~i51) & (-1613557739));
                int i53 = i51 & (-1613557739);
                int i54 = (i53 & i52) | (i52 ^ i53);
                int i55 = ~i54;
                int i56 = -(-(((i54 | i55) & i55) * 476));
                int i57 = ((i48 ^ i56) - (~((i56 & i48) << 1))) - 1;
                int iIdentityHashCode2 = System.identityHashCode(getlocalizedmessage7);
                int i58 = ~iIdentityHashCode2;
                int i59 = (iIdentityHashCode2 | i58) & i58;
                int i60 = (-246349007) ^ i59;
                int i61 = (-246349007) & i59;
                int i62 = ~((i61 & i60) | (i60 ^ i61));
                int i63 = -(-(((i62 & (-58148068)) | ((~i62) & (-58148068)) | (58148067 & i62)) * (-983)));
                int i64 = (-1255851138) & i63;
                int i65 = (((-1255851138) ^ i63) | i64) << 1;
                int i66 = -((i63 | (-1255851138)) & (~i64));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                int i68 = (-58148068) & i59;
                int i69 = (i59 | (-58148068)) & (~i68);
                int i70 = (i69 & i68) | (i69 ^ i68);
                int i71 = ~i70;
                int i72 = (i70 | i71) & i71;
                int i73 = i72 & 22085665;
                int i74 = (i72 | 22085665) & (~i73);
                int i75 = -(-(((i74 & i73) | (i74 ^ i73)) * 983));
                int i76 = ((i67 | i75) << 1) - (i75 ^ i67);
                setTopEdgeEffectColor onFocusChangeListener3 = getlocalizedmessage7.f55905a.setOnFocusChangeListener();
                if (i57 <= i76) {
                    readresolve = (String) setTopEdgeEffectColor.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, 2139112085, -2139112085, System.identityHashCode(onFocusChangeListener3));
                } else {
                    readresolve = (String) setTopEdgeEffectColor.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, 2139112085, -2139112085, System.identityHashCode(onFocusChangeListener3));
                    int i77 = 80 / 0;
                }
                break;
            case 8:
                getLocalizedMessage getlocalizedmessage8 = (getLocalizedMessage) objArr[0];
                byte[] bArr6 = (byte[]) objArr[1];
                int i78 = f55904e;
                int i79 = i78 & 63;
                int i80 = (i78 ^ 63) | i79;
                int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                f55903d = i81 % 128;
                int i82 = i81 % 2;
                Intrinsics.checkNotNullParameter(bArr6, "");
                setVerticalScrollbarThumbDrawable compoundDrawableTintBlendMode4 = getlocalizedmessage8.f55905a.setCompoundDrawableTintBlendMode(bArr6);
                byte[] bArr7 = (byte[]) setVerticalScrollbarThumbDrawable.setX(new Object[]{compoundDrawableTintBlendMode4}, 1652741037, -1652741037, System.identityHashCode(compoundDrawableTintBlendMode4));
                int i83 = f55904e;
                int i84 = (-2) - ((((i83 | 10) << 1) - (i83 ^ 10)) ^ (-1));
                f55903d = i84 % 128;
                if (i84 % 2 == 0) {
                    return bArr7;
                }
                int i85 = 31 / 0;
                return bArr7;
            case 9:
                getLocalizedMessage getlocalizedmessage9 = (getLocalizedMessage) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                int i86 = f55903d;
                int i87 = i86 ^ 69;
                int i88 = -(-((i86 & 69) << 1));
                int i89 = (i87 & i88) + (i88 | i87);
                f55904e = i89 % 128;
                int i90 = i89 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                getWidth getwidth = getlocalizedmessage9.f55905a;
                setItemsCanFocus setitemscanfocus = (setItemsCanFocus) getWidth.setCompoundDrawableTintBlendMode(new Object[]{getwidth, str, str2}, 813737319, -813737319, System.identityHashCode(getwidth));
                boolean zBooleanValue = ((Boolean) setItemsCanFocus.setOnFocusChangeListener(new Object[]{setitemscanfocus}, -2146958847, 2146958847, System.identityHashCode(setitemscanfocus))).booleanValue();
                int i91 = f55903d;
                int i92 = (((i91 & (-74)) | ((~i91) & 73)) - (~(-(-((i91 & 73) << 1))))) - 1;
                f55904e = i92 % 128;
                int i93 = i92 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 10:
                getLocalizedMessage getlocalizedmessage10 = (getLocalizedMessage) objArr[0];
                int i94 = f55903d + 59;
                f55904e = i94 % 128;
                int i95 = i94 % 2;
                setTag dividerPadding = getlocalizedmessage10.f55905a.setDividerPadding();
                readresolve = (String) setTag.setDividerPadding(new Object[]{dividerPadding}, 1271190134, -1271190134, System.identityHashCode(dividerPadding));
                int i96 = f55903d;
                int i97 = ((i96 | 107) << 1) - (i96 ^ 107);
                f55904e = i97 % 128;
                if (i97 % 2 == 0) {
                    throw null;
                }
                break;
            case 11:
                getLocalizedMessage getlocalizedmessage11 = (getLocalizedMessage) objArr[0];
                setVerticalScrollbarPosition setverticalscrollbarposition = (setVerticalScrollbarPosition) objArr[1];
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                int i98 = f55903d;
                int i99 = i98 & 79;
                int i100 = (i98 ^ 79) | i99;
                int i101 = (i99 & i100) + (i100 | i99);
                f55904e = i101 % 128;
                if (i101 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
                    getlocalizedmessage11.f55905a.setOnFocusChangeListener(setverticalscrollbarposition, zBooleanValue2);
                    int i102 = 88 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
                    getlocalizedmessage11.f55905a.setOnFocusChangeListener(setverticalscrollbarposition, zBooleanValue2);
                }
                int i103 = f55903d;
                int i104 = i103 & 101;
                int i105 = ((i103 ^ 101) | i104) << 1;
                int i106 = -((i103 | 101) & (~i104));
                int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                f55904e = i107 % 128;
                int i108 = i107 % 2;
                return null;
            case 12:
                getLocalizedMessage getlocalizedmessage12 = (getLocalizedMessage) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i109 = f55904e;
                int i110 = (i109 ^ 91) + ((i109 & 91) << 1);
                f55903d = i110 % 128;
                int i111 = i110 % 2;
                setKeyboardNavigationCluster dividerPadding2 = getlocalizedmessage12.f55905a.setDividerPadding(iIntValue);
                Object[] objArr2 = new Object[1];
                if (i111 == 0) {
                    objArr2[0] = dividerPadding2;
                    readresolve = (byte[]) setKeyboardNavigationCluster.setY(objArr2, 32326471, -32326471, System.identityHashCode(dividerPadding2));
                } else {
                    objArr2[0] = dividerPadding2;
                    readresolve = (byte[]) setKeyboardNavigationCluster.setY(objArr2, 32326471, -32326471, System.identityHashCode(dividerPadding2));
                    int i112 = 84 / 0;
                }
                break;
            case 13:
                getLocalizedMessage getlocalizedmessage13 = (getLocalizedMessage) objArr[0];
                int i113 = f55903d;
                int i114 = i113 & 55;
                int i115 = ((i113 | 55) & (~i114)) + (i114 << 1);
                f55904e = i115 % 128;
                int i116 = i115 % 2;
                getWidth getwidth2 = getlocalizedmessage13.f55905a;
                getWidth.setCompoundDrawableTintBlendMode(new Object[]{getwidth2}, -979666599, 979666600, System.identityHashCode(getwidth2));
                int i117 = f55903d;
                int i118 = ((i117 ^ 31) | (i117 & 31)) << 1;
                int i119 = -(((~i117) & 31) | (i117 & (-32)));
                int i120 = (i118 & i119) + (i119 | i118);
                f55904e = i120 % 128;
                int i121 = i120 % 2;
                return null;
            default:
                getLocalizedMessage getlocalizedmessage14 = (getLocalizedMessage) objArr[0];
                setInterpolator setinterpolator = (setInterpolator) objArr[1];
                int i122 = f55903d;
                int i123 = ((i122 | 5) << 1) - (i122 ^ 5);
                f55904e = i123 % 128;
                if (i123 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setinterpolator, "");
                    return getlocalizedmessage14.f55905a.setDividerPadding(setinterpolator);
                }
                Intrinsics.checkNotNullParameter(setinterpolator, "");
                getlocalizedmessage14.f55905a.setDividerPadding(setinterpolator);
                throw null;
        }
        return readresolve;
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    public final void setCompoundDrawableTintBlendMode(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, boolean z10) throws Throwable {
        setY(new Object[]{this, setverticalscrollbarposition, Boolean.valueOf(z10)}, -2032677157, 2032677168, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    public final void setDividerPadding() throws Throwable {
        setY(new Object[]{this}, 574378350, -574378337, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    public final boolean setOnFocusChangeListener(@NotNull String str, @NotNull String str2) {
        return ((Boolean) setY(new Object[]{this, str, str2}, 294141805, -294141796, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @NotNull
    public final byte[] setX(@NotNull byte[] bArr) {
        return (byte[]) setY(new Object[]{this, bArr}, 870246020, -870246019, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (byte[]) setY(new Object[]{this, bArr, bArr2}, -1455507511, 1455507514, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @NotNull
    public final getEnableLocalAttestationForDebugBuilds setDividerPadding(@Nullable getClientSecret getclientsecret) {
        return (getEnableLocalAttestationForDebugBuilds) setY(new Object[]{this, getclientsecret}, 1390651725, -1390651719, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setY(new Object[]{this}, -2143527274, 2143527284, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @Nullable
    public final String setX() {
        return (String) setY(new Object[]{this}, -645435021, 645435028, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, -70162910, 70162912, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    public final void setCompoundDrawableTintBlendMode(@NotNull getAmountFieldBgColor getamountfieldbgcolor) throws Throwable {
        setY(new Object[]{this, getamountfieldbgcolor}, -2064634461, 2064634466, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @NotNull
    public final byte[] setY(@NotNull byte[] bArr) {
        return (byte[]) setY(new Object[]{this, bArr}, -681409585, 681409593, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    public final long setY() {
        return ((Long) setY(new Object[]{this}, -61120054, 61120058, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @NotNull
    public final getPinPadPortrait setY(@NotNull setInterpolator setinterpolator) {
        return (getPinPadPortrait) setY(new Object[]{this, setinterpolator}, 653635788, -653635788, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDescendantFocusability
    @NotNull
    public final byte[] setY(int i10) {
        return (byte[]) setY(new Object[]{this, Integer.valueOf(i10)}, -136147735, 136147747, i10);
    }
}
