package com.mypinpad.tsdk.isolation;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0085\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b \u0010!"}, d2 = {"Lcom/mypinpad/tsdk/i/setSubtitleTextColor;", "", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p0", "Lcom/mypinpad/tsdk/i/setAccessibilityPaneTitle;", "p1", "Lcom/mypinpad/tsdk/i/gz;", "p2", "Lcom/mypinpad/tsdk/i/me;", "p3", "Lcom/mypinpad/tsdk/i/getValue;", "p4", "Lcom/mypinpad/tsdk/i/di;", "p5", "Lcom/mypinpad/tsdk/i/component10;", "p6", "Lcom/mypinpad/tsdk/i/setTop;", "p7", "Lcom/mypinpad/tsdk/i/setChildIndicator;", "p8", "Lcom/mypinpad/tsdk/i/component17;", "p9", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p10", "Lcom/mypinpad/tsdk/i/getDetailsFieldTextColor;", "p11", "Lcom/mypinpad/tsdk/i/setFontFeatureSettings;", "p12", "Lcom/mypinpad/tsdk/i/ij;", "p13", "Lcom/mypinpad/tsdk/i/GlobalEndpoint;", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "setY", "(Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/setAccessibilityPaneTitle;Lcom/mypinpad/tsdk/i/gz;Lcom/mypinpad/tsdk/i/me;Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/di;Lcom/mypinpad/tsdk/i/component10;Lcom/mypinpad/tsdk/i/setTop;Lcom/mypinpad/tsdk/i/setChildIndicator;Lcom/mypinpad/tsdk/i/component17;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/getDetailsFieldTextColor;Lcom/mypinpad/tsdk/i/setFontFeatureSettings;Lcom/mypinpad/tsdk/i/ij;)Lcom/mypinpad/tsdk/i/GlobalEndpoint;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setSubtitleTextColor {

    @NotNull
    public static final setSubtitleTextColor INSTANCE = new setSubtitleTextColor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60605a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60606b = 1;

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[Terminal.valuesCustom().length];
            iArr[Terminal.KERNEL_3.ordinal()] = 1;
            iArr[Terminal.KERNEL_2.ordinal()] = 2;
            iArr[Terminal.KERNEL_4.ordinal()] = 3;
            iArr[Terminal.KERNEL_6.ordinal()] = 4;
            iArr[Terminal.KERNEL_13.ordinal()] = 5;
            iArr[Terminal.KERNEL_INTERAC.ordinal()] = 6;
            iArr[Terminal.KERNEL_EFTPOS.ordinal()] = 7;
            setY = iArr;
            int i10 = -(-45);
            int i11 = (i10 << 1) - i10;
            int i12 = i11 % 128;
            int i13 = i11 % 2;
        }
    }

    static {
        int i10 = f60605a;
        int i11 = (((i10 | 62) << 1) - (i10 ^ 62)) - 1;
        f60606b = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0183  */
    /* JADX WARN: Code duplicated, block: B:12:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:15:0x023f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0253  */
    /* JADX WARN: Code duplicated, block: B:18:0x028d  */
    /* JADX WARN: Code duplicated, block: B:20:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:21:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:23:0x0333  */
    /* JADX WARN: Code duplicated, block: B:25:0x033b  */
    /* JADX WARN: Code duplicated, block: B:28:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x0412  */
    /* JADX WARN: Code duplicated, block: B:33:0x0419  */
    /* JADX WARN: Code duplicated, block: B:35:0x0456  */
    /* JADX WARN: Code duplicated, block: B:36:0x045b  */
    /* JADX WARN: Code duplicated, block: B:40:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        getValue getvalue;
        setBackgroundTintList setbackgroundtintlist;
        int i13;
        Object ilVar;
        int i14;
        Object gtVar;
        int i15;
        int i16;
        int i17;
        int i18;
        ln lnVar;
        int i19;
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[0];
        setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) objArr[1];
        gz gzVar = (gz) objArr[2];
        me meVar = (me) objArr[3];
        getValue getvalue2 = (getValue) objArr[4];
        di diVar = (di) objArr[5];
        component10 component10Var = (component10) objArr[6];
        setTop settop = (setTop) objArr[7];
        setChildIndicator setchildindicator = (setChildIndicator) objArr[8];
        component17 component17Var = (component17) objArr[9];
        setContentDescription setcontentdescription = (setContentDescription) objArr[10];
        getDetailsFieldTextColor getdetailsfieldtextcolor = (getDetailsFieldTextColor) objArr[11];
        setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) objArr[12];
        ij ijVar = (ij) objArr[13];
        int i20 = f60605a + 53;
        f60606b = i20 % 128;
        int i21 = i20 % 2;
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(setaccessibilitypanetitle, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(meVar, "");
        Intrinsics.checkNotNullParameter(getvalue2, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(getdetailsfieldtextcolor, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(ijVar, "");
        setTitleMarginTop settitlemargintop = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor));
        Terminal terminal = (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop));
        setScreenReaderFocusable setscreenreaderfocusable = (setScreenReaderFocusable) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, -321474626, 321474627, System.identityHashCode(getdetailsfieldtextcolor));
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
        if (getbeeponfailure != null) {
            setAnimation setanimation = setAnimation.INSTANCE;
            getvalue = getvalue2;
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
            if (getbeeponfailure2 == null) {
                int i22 = f60605a;
                int i23 = (-2) - ((i22 + 64) ^ (-1));
                f60606b = i23 % 128;
                int i24 = i23 % 2;
                int i25 = i22 & 5;
                int i26 = -(-((i22 ^ 5) | i25));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f60606b = i27 % 128;
                int i28 = i27 % 2;
            } else {
                setbackgroundtintlist = new setBackgroundTintList(getbeeponfailure2.setOnFocusChangeListener());
                int i29 = f60605a;
                int i30 = (i29 ^ 61) + ((i29 & 61) << 1);
                f60606b = i30 % 128;
                int i31 = i30 % 2;
            }
            if (setbackgroundtintlist == null) {
                int i32 = f60605a;
                int i33 = ((i32 | 47) << 1) - (i32 ^ 47);
                f60606b = i33 % 128;
                int i34 = i33 % 2;
                setTitleMarginTop settitlemargintop2 = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor));
                setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop2}, 423062029, -423062025, System.identityHashCode(settitlemargintop2));
                int i35 = f60605a;
                int i36 = (i35 & (-114)) | ((~i35) & 113);
                int i37 = -(-((i35 & 113) << 1));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f60606b = i38 % 128;
                int i39 = i38 % 2;
                setbackgroundtintlist = setbackgroundtintlist2;
                i13 = 2;
            } else {
                int i40 = f60605a;
                int i41 = i40 & 41;
                int i42 = -(-((i40 ^ 41) | i41));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f60606b = i43 % 128;
                i13 = 2;
                int i44 = i43 % 2;
            }
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr = new getDetailsFieldTextSizeSp[i13];
            getdetailsfieldtextsizespArr[0] = setLogo.setX(terminal.setY());
            getdetailsfieldtextsizespArr[1] = setInputExtras.setNavigationOnClickListener(setbackgroundtintlist.setY());
            TerminalLogger terminalLogger = new TerminalLogger(getdetailsfieldtextsizespArr, null, i13, null);
            Object[] objArr2 = new Object[3];
            objArr2[0] = 10020;
            objArr2[1] = terminalLogger;
            objArr2[i13] = 4;
            SouthPacificEndpoint.setX(objArr2, 1336485880, -1336485874, 10020);
            switch (setDividerPadding.setY[terminal.ordinal()]) {
                case 1:
                    setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_3}, -157457190, 157457205, (int) System.currentTimeMillis());
                    ilVar = new il(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setfontfeaturesettings, setchildindicator, component17Var, setcontentdescription);
                    GlobalEndpoint.setCompoundDrawableTintBlendMode(new Object[]{ilVar, meVar}, 713541873, -713541860, System.identityHashCode(ilVar));
                    int i45 = f60606b;
                    int i46 = i45 & 11;
                    int i47 = -(-((i45 ^ 11) | i46));
                    i14 = (i46 ^ i47) + ((i47 & i46) << 1);
                    f60605a = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    return ilVar;
                case 2:
                    setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_2}, -157457190, 157457205, (int) System.currentTimeMillis());
                    gtVar = new gt(setbackgroundtintlist, settextkeepstate, gzVar, meVar, getvalue, diVar, component10Var, settop, setfontfeaturesettings, setcontentdescription, component17Var, ijVar.setY(settextkeepstate));
                    i15 = f60605a + 115;
                    f60606b = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i48 = 40 / 0;
                    }
                    return gtVar;
                case 3:
                    setOnGenericMotionListener setongenericmotionlistener3 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_4}, -157457190, 157457205, (int) System.currentTimeMillis());
                    gtVar = new ix(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setfontfeaturesettings, (iw) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(iw.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle))), setchildindicator, component17Var, setcontentdescription);
                    int i49 = f60606b;
                    int i50 = ((i49 ^ 17) | (i49 & 17)) << 1;
                    int i51 = -(((~i49) & 17) | (i49 & (-18)));
                    i16 = (i50 & i51) + (i51 | i50);
                    f60605a = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i52 = 52 / 0;
                    }
                    return gtVar;
                case 4:
                    setOnGenericMotionListener setongenericmotionlistener4 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_6}, -157457190, 157457205, (int) System.currentTimeMillis());
                    ilVar = new jz(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setfontfeaturesettings, (kb) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(kb.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle))), setchildindicator, component17Var, setcontentdescription);
                    GlobalEndpoint.setCompoundDrawableTintBlendMode(new Object[]{ilVar, meVar}, 713541873, -713541860, System.identityHashCode(ilVar));
                    int i53 = f60605a;
                    i17 = ((i53 | 49) << 1) - (i53 ^ 49);
                    f60606b = i17 % 128;
                    if (i17 % 2 == 0) {
                        throw null;
                    }
                    return ilVar;
                case 5:
                    setOnGenericMotionListener setongenericmotionlistener5 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_13}, -157457190, 157457205, (int) System.currentTimeMillis());
                    ilVar = new fl(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setchildindicator, setfontfeaturesettings, (setClipToOutline) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(setClipToOutline.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle))), component17Var, setcontentdescription);
                    int i54 = f60605a;
                    int i55 = ((i54 ^ 45) | (i54 & 45)) << 1;
                    int i56 = -(((~i54) & 45) | (i54 & (-46)));
                    i18 = ((i55 | i56) << 1) - (i56 ^ i55);
                    f60606b = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i57 = 92 / 0;
                    }
                    return ilVar;
                case 6:
                    setOnGenericMotionListener setongenericmotionlistener6 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_INTERAC}, -157457190, 157457205, (int) System.currentTimeMillis());
                    lnVar = new ln(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setchildindicator, setfontfeaturesettings, component17Var, setcontentdescription);
                    int i58 = f60605a;
                    int i59 = ((i58 | 80) << 1) - (i58 ^ 80);
                    i19 = (i59 ^ (-1)) + (i59 << 1);
                    f60606b = i19 % 128;
                    if (i19 % 2 == 0) {
                        return lnVar;
                    }
                    int i60 = 41 / 0;
                    return lnVar;
                case 7:
                    setOnGenericMotionListener setongenericmotionlistener7 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_EFTPOS}, -157457190, 157457205, (int) System.currentTimeMillis());
                    ks ksVar = new ks(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setchildindicator, setfontfeaturesettings, component17Var, setcontentdescription);
                    int i61 = f60606b;
                    int i62 = (i61 ^ 76) + ((i61 & 76) << 1);
                    int i63 = (i62 ^ (-1)) + (i62 << 1);
                    f60605a = i63 % 128;
                    int i64 = i63 % 2;
                    return ksVar;
                default:
                    throw new setIndeterminateDrawable(AuthApiStatusCodes.AUTH_API_CLIENT_ERROR, terminal.toString(), null, 4, null);
            }
        }
        int i65 = f60605a;
        int i66 = (i65 ^ 85) + ((i65 & 85) << 1);
        f60606b = i66 % 128;
        int i67 = i66 % 2;
        int i68 = ((i65 ^ 92) + ((i65 & 92) << 1)) - 1;
        f60606b = i68 % 128;
        int i69 = i68 % 2;
        getvalue = getvalue2;
        setbackgroundtintlist = null;
        if (setbackgroundtintlist == null) {
            int i310 = f60605a;
            int i311 = ((i310 | 47) << 1) - (i310 ^ 47);
            f60606b = i311 % 128;
            int i312 = i311 % 2;
            setTitleMarginTop settitlemargintop3 = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor));
            setBackgroundTintList setbackgroundtintlist3 = (setBackgroundTintList) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop3}, 423062029, -423062025, System.identityHashCode(settitlemargintop3));
            int i313 = f60605a;
            int i314 = (i313 & (-114)) | ((~i313) & 113);
            int i315 = -(-((i313 & 113) << 1));
            int i316 = (i314 ^ i315) + ((i315 & i314) << 1);
            f60606b = i316 % 128;
            int i317 = i316 % 2;
            setbackgroundtintlist = setbackgroundtintlist3;
            i13 = 2;
        } else {
            int i410 = f60605a;
            int i411 = i410 & 41;
            int i412 = -(-((i410 ^ 41) | i411));
            int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
            f60606b = i413 % 128;
            i13 = 2;
            int i414 = i413 % 2;
        }
        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
        getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr2 = new getDetailsFieldTextSizeSp[i13];
        getdetailsfieldtextsizespArr2[0] = setLogo.setX(terminal.setY());
        getdetailsfieldtextsizespArr2[1] = setInputExtras.setNavigationOnClickListener(setbackgroundtintlist.setY());
        TerminalLogger terminalLogger2 = new TerminalLogger(getdetailsfieldtextsizespArr2, null, i13, null);
        Object[] objArr3 = new Object[3];
        objArr3[0] = 10020;
        objArr3[1] = terminalLogger2;
        objArr3[i13] = 4;
        SouthPacificEndpoint.setX(objArr3, 1336485880, -1336485874, 10020);
        switch (setDividerPadding.setY[terminal.ordinal()]) {
            case 1:
                setOnGenericMotionListener setongenericmotionlistener8 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_3}, -157457190, 157457205, (int) System.currentTimeMillis());
                ilVar = new il(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setfontfeaturesettings, setchildindicator, component17Var, setcontentdescription);
                GlobalEndpoint.setCompoundDrawableTintBlendMode(new Object[]{ilVar, meVar}, 713541873, -713541860, System.identityHashCode(ilVar));
                int i415 = f60606b;
                int i416 = i415 & 11;
                int i417 = -(-((i415 ^ 11) | i416));
                i14 = (i416 ^ i417) + ((i417 & i416) << 1);
                f60605a = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
                return ilVar;
            case 2:
                setOnGenericMotionListener setongenericmotionlistener9 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_2}, -157457190, 157457205, (int) System.currentTimeMillis());
                gtVar = new gt(setbackgroundtintlist, settextkeepstate, gzVar, meVar, getvalue, diVar, component10Var, settop, setfontfeaturesettings, setcontentdescription, component17Var, ijVar.setY(settextkeepstate));
                i15 = f60605a + 115;
                f60606b = i15 % 128;
                if (i15 % 2 == 0) {
                    int i418 = 40 / 0;
                }
                return gtVar;
            case 3:
                setOnGenericMotionListener setongenericmotionlistener10 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_4}, -157457190, 157457205, (int) System.currentTimeMillis());
                gtVar = new ix(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setfontfeaturesettings, (iw) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(iw.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle))), setchildindicator, component17Var, setcontentdescription);
                int i419 = f60606b;
                int i510 = ((i419 ^ 17) | (i419 & 17)) << 1;
                int i511 = -(((~i419) & 17) | (i419 & (-18)));
                i16 = (i510 & i511) + (i511 | i510);
                f60605a = i16 % 128;
                if (i16 % 2 != 0) {
                    int i512 = 52 / 0;
                }
                return gtVar;
            case 4:
                setOnGenericMotionListener setongenericmotionlistener11 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_6}, -157457190, 157457205, (int) System.currentTimeMillis());
                ilVar = new jz(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setfontfeaturesettings, (kb) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(kb.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle))), setchildindicator, component17Var, setcontentdescription);
                GlobalEndpoint.setCompoundDrawableTintBlendMode(new Object[]{ilVar, meVar}, 713541873, -713541860, System.identityHashCode(ilVar));
                int i513 = f60605a;
                i17 = ((i513 | 49) << 1) - (i513 ^ 49);
                f60606b = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
                return ilVar;
            case 5:
                setOnGenericMotionListener setongenericmotionlistener12 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_13}, -157457190, 157457205, (int) System.currentTimeMillis());
                ilVar = new fl(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setchildindicator, setfontfeaturesettings, (setClipToOutline) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(setClipToOutline.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle))), component17Var, setcontentdescription);
                int i514 = f60605a;
                int i515 = ((i514 ^ 45) | (i514 & 45)) << 1;
                int i516 = -(((~i514) & 45) | (i514 & (-46)));
                i18 = ((i515 | i516) << 1) - (i516 ^ i515);
                f60606b = i18 % 128;
                if (i18 % 2 == 0) {
                    int i517 = 92 / 0;
                }
                return ilVar;
            case 6:
                setOnGenericMotionListener setongenericmotionlistener13 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_INTERAC}, -157457190, 157457205, (int) System.currentTimeMillis());
                lnVar = new ln(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setchildindicator, setfontfeaturesettings, component17Var, setcontentdescription);
                int i518 = f60605a;
                int i519 = ((i518 | 80) << 1) - (i518 ^ 80);
                i19 = (i519 ^ (-1)) + (i519 << 1);
                f60606b = i19 % 128;
                if (i19 % 2 == 0) {
                    return lnVar;
                }
                int i610 = 41 / 0;
                return lnVar;
            case 7:
                setOnGenericMotionListener setongenericmotionlistener14 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_EFTPOS}, -157457190, 157457205, (int) System.currentTimeMillis());
                ks ksVar2 = new ks(setbackgroundtintlist, settextkeepstate, meVar, getvalue, diVar, component10Var, settop, setchildindicator, setfontfeaturesettings, component17Var, setcontentdescription);
                int i611 = f60606b;
                int i612 = (i611 ^ 76) + ((i611 & 76) << 1);
                int i613 = (i612 ^ (-1)) + (i612 << 1);
                f60605a = i613 % 128;
                int i614 = i613 % 2;
                return ksVar2;
            default:
                throw new setIndeterminateDrawable(AuthApiStatusCodes.AUTH_API_CLIENT_ERROR, terminal.toString(), null, 4, null);
        }
    }

    @NotNull
    public static GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> setY(@NotNull setTextKeepState p4, @NotNull setAccessibilityPaneTitle p10, @NotNull gz p11, @NotNull me p12, @NotNull getValue p13, @NotNull di p14, @NotNull component10 p15, @NotNull setTop p16, @NotNull setChildIndicator p17, @NotNull component17 p18, @NotNull setContentDescription p19, @NotNull getDetailsFieldTextColor p110, @NotNull setFontFeatureSettings p111, @NotNull ij p112) {
        return (GlobalEndpoint) setDividerPadding(new Object[]{p4, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p110, p111, p112}, -2104124925, 2104124925, (int) System.currentTimeMillis());
    }
}
