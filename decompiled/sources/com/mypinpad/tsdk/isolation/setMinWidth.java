package com.mypinpad.tsdk.isolation;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setMinWidth {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60123c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60124d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f60125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setOnChildClickListener f60126b;

    public setMinWidth(@NotNull getScope getscope, @NotNull setMinimumWidth setminimumwidth, @NotNull startTransactiondefault starttransactiondefault, @NotNull setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, @NotNull setSubtitle setsubtitle, @NotNull AsiaPacificEndpoint asiaPacificEndpoint, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(getscope, "");
        Intrinsics.checkNotNullParameter(setminimumwidth, "");
        Intrinsics.checkNotNullParameter(starttransactiondefault, "");
        Intrinsics.checkNotNullParameter(setprogressbackgroundtintblendmode, "");
        Intrinsics.checkNotNullParameter(setsubtitle, "");
        Intrinsics.checkNotNullParameter(asiaPacificEndpoint, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f60125a = setcolorfilter;
        this.f60126b = (setOnChildClickListener) setY(new Object[]{this, setprogressbackgroundtintblendmode, setsubtitle, asiaPacificEndpoint, getscope, setminimumwidth, starttransactiondefault}, 259245825, -259245824, System.identityHashCode(this));
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object setprogressbackgroundtintlist;
        Object getdecimalseparator;
        int i13;
        int i14;
        int i15;
        int i16 = ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
        int i17 = ~i11;
        if ((((~(i10 | i17 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i17 | i12)) | i10) * (-366)) + i16 == 1) {
            setMinWidth setminwidth = (setMinWidth) objArr[0];
            setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode = (setProgressBackgroundTintBlendMode) objArr[1];
            setOnChildClickListener setonchildclicklistener = new setOnChildClickListener((getScope) objArr[4], (setSubtitle) objArr[2], (AsiaPacificEndpoint) objArr[3], setminwidth.f60125a, setprogressbackgroundtintblendmode, (setMinimumWidth) objArr[5], (startTransactiondefault) objArr[6], null, 128, null);
            int i18 = f60124d + 75;
            f60123c = i18 % 128;
            if (i18 % 2 == 0) {
                return setonchildclicklistener;
            }
            throw null;
        }
        setMinWidth setminwidth2 = (setMinWidth) objArr[0];
        setFastScrollAlwaysVisible setfastscrollalwaysvisible = (setFastScrollAlwaysVisible) objArr[1];
        int i19 = f60124d;
        int i20 = i19 & 41;
        int i21 = -(-(i19 | 41));
        int i22 = (i20 & i21) + (i21 | i20);
        int i23 = i22 % 128;
        f60123c = i23;
        if (i22 % 2 != 0) {
            boolean z10 = setfastscrollalwaysvisible instanceof getCancelButtonText;
            throw null;
        }
        if (setfastscrollalwaysvisible instanceof getCancelButtonText) {
            getCancelButtonText getcancelbuttontext = (getCancelButtonText) setfastscrollalwaysvisible;
            setminwidth2.f60126b.setCompoundDrawableTintBlendMode((setVerticalScrollbarPosition) getCancelButtonText.setOnFocusChangeListener(new Object[]{getcancelbuttontext}, -1828569903, 1828569904, System.identityHashCode(getcancelbuttontext)), ((Boolean) getCancelButtonText.setOnFocusChangeListener(new Object[]{getcancelbuttontext}, 751000322, -751000322, System.identityHashCode(getcancelbuttontext))).booleanValue());
            setAutoSizeTextTypeWithDefaults setautosizetexttypewithdefaults = setAutoSizeTextTypeWithDefaults.INSTANCE;
            int i24 = f60123c;
            int i25 = i24 & 125;
            int i26 = -(-(i24 | 125));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f60124d = i27 % 128;
            int i28 = i27 % 2;
            return setautosizetexttypewithdefaults;
        }
        if (setfastscrollalwaysvisible instanceof TerminalErrorCodesInvocation) {
            int i29 = (i23 ^ 69) + ((i23 & 69) << 1);
            f60124d = i29 % 128;
            if (i29 % 2 != 0) {
                setminwidth2.f60126b.setOnFocusChangeListener();
                return setDrawingCacheBackgroundColor.INSTANCE;
            }
            setminwidth2.f60126b.setOnFocusChangeListener();
            setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = setDrawingCacheBackgroundColor.INSTANCE;
            throw null;
        }
        if (!(setfastscrollalwaysvisible instanceof getHOSTAPP_ERROR_ON_AUTH_REQUESTannotations)) {
            if (setfastscrollalwaysvisible instanceof setOnContextClickListener) {
                setTag settag = new setTag(setminwidth2.f60126b.setDividerPadding());
                int i30 = f60123c;
                int i31 = (i30 ^ 41) + ((i30 & 41) << 1);
                f60124d = i31 % 128;
                int i32 = i31 % 2;
                return settag;
            }
            if (setfastscrollalwaysvisible instanceof registerForContextMenu) {
                setOnChildClickListener setonchildclicklistener2 = setminwidth2.f60126b;
                getdecimalseparator = new setTopEdgeEffectColor((String) setOnChildClickListener.setY(new Object[]{setonchildclicklistener2}, 659333055, -659333055, System.identityHashCode(setonchildclicklistener2)));
                i15 = f60124d + 123;
                f60123c = i15 % 128;
            } else {
                if (!(setfastscrollalwaysvisible instanceof setBackgroundColor)) {
                    if (setfastscrollalwaysvisible instanceof ProceedPinPadLaunchRequest) {
                        ProceedPinPadLaunchRequest proceedPinPadLaunchRequest = (ProceedPinPadLaunchRequest) setfastscrollalwaysvisible;
                        setprogressbackgroundtintlist = new setItemsCanFocus(setminwidth2.f60126b.setCompoundDrawableTintBlendMode((String) ProceedPinPadLaunchRequest.setY(new Object[]{proceedPinPadLaunchRequest}, -1414403004, 1414403004, System.identityHashCode(proceedPinPadLaunchRequest)), (String) ProceedPinPadLaunchRequest.setY(new Object[]{proceedPinPadLaunchRequest}, -1662177047, 1662177048, System.identityHashCode(proceedPinPadLaunchRequest))));
                        int i33 = (-2) - ((f60124d + 94) ^ (-1));
                        f60123c = i33 % 128;
                        int i34 = i33 % 2;
                    } else {
                        if (!(setfastscrollalwaysvisible instanceof getDescription)) {
                            if (!(setfastscrollalwaysvisible instanceof setIgnoreGravity)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            setIgnoreGravity setignoregravity = (setIgnoreGravity) setfastscrollalwaysvisible;
                            setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = new setVerticalScrollbarThumbDrawable((byte[]) setSecondaryProgressTintList.setY(new Object[]{setminwidth2.f60126b.setDividerPadding((byte[]) setIgnoreGravity.setY(new Object[]{setignoregravity}, -956454107, 956454107, System.identityHashCode(setignoregravity)))}, -1211050824, 1211050824, (int) System.currentTimeMillis()));
                            int i35 = f60123c;
                            int i36 = ((i35 & (-44)) | ((~i35) & 43)) + ((i35 & 43) << 1);
                            f60124d = i36 % 128;
                            if (i36 % 2 != 0) {
                                return setverticalscrollbarthumbdrawable;
                            }
                            throw null;
                        }
                        getDescription getdescription = (getDescription) setfastscrollalwaysvisible;
                        setprogressbackgroundtintlist = new setProgressBackgroundTintList(setminwidth2.f60126b.setY((byte[]) getDescription.setY(new Object[]{getdescription}, 2045952693, -2045952693, System.identityHashCode(getdescription))));
                        int i37 = f60123c;
                        int i38 = i37 & 61;
                        int i39 = (i37 | 61) & (~i38);
                        int i40 = -(-(i38 << 1));
                        int i41 = (i39 & i40) + (i39 | i40);
                        f60124d = i41 % 128;
                        if (i41 % 2 == 0) {
                            int i42 = 28 / 0;
                        }
                    }
                    return setprogressbackgroundtintlist;
                }
                getdecimalseparator = new getDecimalSeparator(setminwidth2.f60126b.setCompoundDrawableTintBlendMode());
                int i43 = f60123c;
                i13 = i43 & 26;
                i14 = i43 | 26;
            }
            int i44 = i15 % 2;
            return getdecimalseparator;
        }
        getdecimalseparator = new setHorizontallyScrolling(setminwidth2.f60126b.setX());
        int i45 = f60123c;
        i13 = i45 ^ 58;
        i14 = (i45 & 58) << 1;
        i15 = (-2) - ((i13 + i14) ^ (-1));
        f60124d = i15 % 128;
        int i46 = i15 % 2;
        return getdecimalseparator;
    }

    @NotNull
    public final synchronized Endpoint setX(@NotNull setStateListAnimator setstatelistanimator) {
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener;
        Intrinsics.checkNotNullParameter(setstatelistanimator, "");
        PinViewports pinViewports = (PinViewports) setstatelistanimator;
        setonapplywindowinsetslistener = new setOnApplyWindowInsetsListener((setForeground) setY(new Object[]{this, (setFastScrollAlwaysVisible) PinViewports.setOnFocusChangeListener(new Object[]{pinViewports}, -237980738, 237980738, System.identityHashCode(pinViewports))}, 2052636997, -2052636997, System.identityHashCode(this)));
        int i10 = f60124d;
        int i11 = ((i10 | 55) << 1) - (i10 ^ 55);
        f60123c = i11 % 128;
        int i12 = i11 % 2;
        return setonapplywindowinsetslistener;
    }
}
