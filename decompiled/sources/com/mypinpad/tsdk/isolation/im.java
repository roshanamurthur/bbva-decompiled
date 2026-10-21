package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class im extends TerminalSdkConfigurationCompanion<setRevealOnFocusHint> {
    public static int E = 0;
    public static int F = 1;

    @NotNull
    public final setFontFeatureSettings A;

    @NotNull
    public final setRevealOnFocusHint B;
    public boolean C;
    public boolean D;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cr;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cr;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cr, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56477q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56478r0 = 1;

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-755)) + (i10 * (-755));
            int i14 = ~((~i10) | (~i11));
            int i15 = i10 | i11;
            if (((i15 | (~i12)) * 756) + (((~(i15 | i12)) | i14) * (-756)) + (i14 * 1512) + i13 != 1) {
                a aVar = (a) objArr[0];
                cr crVar = (cr) objArr[1];
                int i16 = f56478r0 + 75;
                f56477q0 = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(crVar, "");
                im imVar = im.this;
                setRevealOnFocusHint setrevealonfocushint = (setRevealOnFocusHint) im.setY(new Object[]{imVar}, -967673671, 967673681, System.identityHashCode(imVar));
                cr.setDividerPadding(new Object[]{crVar, Boolean.valueOf(((Boolean) setRevealOnFocusHint.setY(new Object[]{setrevealonfocushint}, 1247328667, -1247328661, System.identityHashCode(setrevealonfocushint))).booleanValue())}, 2136829513, -2136829502, System.identityHashCode(crVar));
                int i18 = f56478r0;
                int i19 = i18 & 79;
                int i20 = -(-((i18 ^ 79) | i19));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f56477q0 = i21 % 128;
                int i22 = i21 % 2;
                return null;
            }
            a aVar2 = (a) objArr[0];
            Object obj = objArr[1];
            int i23 = f56478r0 + 9;
            f56477q0 = i23 % 128;
            int i24 = i23 % 2;
            a(new Object[]{aVar2, (cr) obj}, -1158776664, 1158776664, System.identityHashCode(aVar2));
            Unit unit = Unit.INSTANCE;
            int i25 = f56477q0;
            int i26 = i25 & 115;
            int i27 = ((i25 ^ 115) | i26) << 1;
            int i28 = -((i25 | 115) & (~i26));
            int i29 = (i27 & i28) + (i28 | i27);
            f56478r0 = i29 % 128;
            if (i29 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cr crVar) {
            return a(new Object[]{this, crVar}, 2103583763, -2103583762, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public im(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull di diVar, @NotNull setChildIndicator setchildindicator) {
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        Terminal terminal = Terminal.KERNEL_3;
        super(setbackgroundtintlist, diVar, setchildindicator, terminal);
        this.A = setfontfeaturesettings;
        this.B = (setRevealOnFocusHint) setchildindicator.setCompoundDrawableTintBlendMode(terminal);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01b5 A[PHI: r8
      0x01b5: PHI (r8v33 boolean) = (r8v32 boolean), (r8v53 boolean) binds: [B:24:0x01b3, B:20:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x023e  */
    /* JADX WARN: Code duplicated, block: B:39:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x025c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0273  */
    /* JADX WARN: Code duplicated, block: B:43:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x0333  */
    /* JADX WARN: Code duplicated, block: B:48:0x033e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0395  */
    /* JADX WARN: Code duplicated, block: B:52:0x0404  */
    /* JADX WARN: Code duplicated, block: B:55:0x054a  */
    /* JADX WARN: Code duplicated, block: B:57:0x054e  */
    /* JADX WARN: Code duplicated, block: B:68:0x05d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x05db  */
    /* JADX WARN: Code duplicated, block: B:71:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x05fc  */
    public static /* synthetic */ Boolean c0(Object[] objArr) throws Exception {
        int i10;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        im imVar = (im) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        TerminalCreationFailure terminalCreationFailure = (TerminalCreationFailure) objArr[2];
        int i16 = F + 73;
        E = i16 % 128;
        int i17 = i16 % 2;
        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        boolean zBooleanValue3 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, imVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), setTextSize.setCompoundDrawableTintBlendMode}, 676404020, -676404015, (int) System.currentTimeMillis())).booleanValue();
        setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        boolean dividerPadding = imVar.setDividerPadding((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)));
        if (!(!dividerPadding)) {
            int i18 = E;
            int i19 = ((i18 ^ 59) - (~((i18 & 59) << 1))) - 1;
            F = i19 % 128;
            if (i19 % 2 == 0) {
                setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                setPressed.Companion companion = setPressed.INSTANCE;
                throw null;
            }
            setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (((setPressed) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -1730794875, 1730794879, System.identityHashCode(setscrollcontainer4))) == setPressed.setOnFocusChangeListener) {
                int i20 = F;
                int i21 = i20 | 115;
                int i22 = ((i21 << 1) - (~(-((~(i20 & 115)) & i21)))) - 1;
                E = i22 % 128;
                int i23 = i22 % 2;
                if (!zBooleanValue3) {
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                    int i24 = E;
                    int i25 = (i24 & (-56)) | ((~i24) & 55);
                    int i26 = -(-((i24 & 55) << 1));
                    int i27 = (i25 & i26) + (i26 | i25);
                    F = i27 % 128;
                    int i28 = i27 % 2;
                    return Boolean.FALSE;
                }
            }
        }
        if (dividerPadding) {
            int i29 = E;
            int i30 = i29 | 73;
            int i31 = ((i30 << 1) - (~(-((~(i29 & 73)) & i30)))) - 1;
            F = i31 % 128;
            if (i31 % 2 == 0) {
                zBooleanValue = ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                if (terminalCreationFailure != null) {
                    int i32 = E;
                    int i33 = (((i32 ^ 115) | (i32 & 115)) << 1) - (((~i32) & 115) | (i32 & (-116)));
                    F = i33 % 128;
                    int i34 = i33 % 2;
                    setScrollContainer setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6)), terminalCreationFailure, imVar.setDividerPadding()}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener))).booleanValue();
                    int i35 = E;
                    int i36 = i35 & 99;
                    int i37 = (i35 | 99) & (~i36);
                    int i38 = i36 << 1;
                    int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                    F = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    zBooleanValue2 = false;
                }
            } else {
                zBooleanValue = ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                if (terminalCreationFailure != null) {
                    int i310 = E;
                    int i311 = (((i310 ^ 115) | (i310 & 115)) << 1) - (((~i310) & 115) | (i310 & (-116)));
                    F = i311 % 128;
                    int i312 = i311 % 2;
                    setScrollContainer setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, -888877733, 888877739, System.identityHashCode(setscrollcontainer7)), terminalCreationFailure, imVar.setDividerPadding()}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener))).booleanValue();
                    int i313 = E;
                    int i314 = i313 & 99;
                    int i315 = (i313 | 99) & (~i314);
                    int i316 = i314 << 1;
                    int i317 = (i315 ^ i316) + ((i315 & i316) << 1);
                    F = i317 % 128;
                    int i41 = i317 % 2;
                } else {
                    zBooleanValue2 = true;
                }
            }
            if (!(!zBooleanValue3)) {
                int i42 = E;
                int i43 = ((i42 ^ 126) + ((i42 & 126) << 1)) - 1;
                F = i43 % 128;
                if (i43 % 2 == 0) {
                    throw null;
                }
                if (!zBooleanValue || !zBooleanValue2) {
                    if (terminalCreationFailure != TerminalCreationFailure.setLayoutAnimation) {
                        if (!zBooleanValue3) {
                            int i44 = E;
                            int i45 = i44 | 103;
                            int i46 = i45 << 1;
                            int i47 = -((~(i44 & 103)) & i45);
                            i15 = ((i46 | i47) << 1) - (i47 ^ i46);
                            F = i15 % 128;
                            if (i15 % 2 == 0) {
                                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer8 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{14062, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer8}, -888877733, 888877739, System.identityHashCode(setscrollcontainer8))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 14062);
                            } else {
                                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer9 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer9}, -888877733, 888877739, System.identityHashCode(setscrollcontainer9))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                            }
                            int i48 = E;
                            int i49 = (i48 ^ 74) + ((i48 & 74) << 1);
                            int i50 = (i49 ^ (-1)) + (i49 << 1);
                            F = i50 % 128;
                            int i51 = i50 % 2;
                        }
                        if (!zBooleanValue) {
                            i14 = F + 5;
                            E = i14 % 128;
                            if (i14 % 2 != 0) {
                                SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer10 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{14371, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer10}, -888877733, 888877739, System.identityHashCode(setscrollcontainer10))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 14371);
                            } else {
                                SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer11 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{20037, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer11}, -888877733, 888877739, System.identityHashCode(setscrollcontainer11))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20037);
                            }
                            int i52 = E;
                            int i53 = (i52 | 35) << 1;
                            int i54 = -(((~i52) & 35) | (i52 & (-36)));
                            int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                            F = i55 % 128;
                            int i56 = i55 % 2;
                        }
                        if (!zBooleanValue2) {
                            int i57 = E;
                            int i58 = ((i57 | 69) << 1) - (i57 ^ 69);
                            F = i58 % 128;
                            int i59 = i58 % 2;
                            SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer12 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20034, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer12}, -888877733, 888877739, System.identityHashCode(setscrollcontainer12))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20034);
                            int i60 = E;
                            int i61 = (i60 | 25) << 1;
                            int i62 = -(((~i60) & 25) | (i60 & (-26)));
                            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                            F = i63 % 128;
                            int i64 = i63 % 2;
                        }
                        int iIdentityHashCode = System.identityHashCode(imVar);
                        int i65 = ~iIdentityHashCode;
                        int i66 = (-1449005035) & i65;
                        int i67 = ((((-1449005035) | i65) & (~i66)) | i66) * (-757);
                        int i68 = 1587003054 & i67;
                        int i69 = -(-((i67 ^ 1587003054) | i68));
                        int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                        int i71 = (-1443235169) ^ iIdentityHashCode;
                        int i72 = (-1443235169) & iIdentityHashCode;
                        int i73 = -(~((~((i72 & i71) | (i71 ^ i72))) * 1514));
                        int i74 = (((i70 | i73) << 1) - (i73 ^ i70)) - 1;
                        int i75 = (i65 & (-1453823329)) | ((-1453823329) ^ i65);
                        int i76 = ~i75;
                        int i77 = (i75 | i76) & i76;
                        int i78 = (i77 & 10588160) | (10588160 ^ i77);
                        int i79 = (-5769867) & iIdentityHashCode;
                        int i80 = ((iIdentityHashCode | (-5769867)) & (~i79)) | i79;
                        int i81 = ~i80;
                        int i82 = (i80 | i81) & i81;
                        int i83 = i78 & i82;
                        int i84 = (i82 | i78) & (~i83);
                        int i85 = ((i84 & i83) | (i84 ^ i83)) * 757;
                        int i86 = i74 & i85;
                        int i87 = (i85 ^ i74) | i86;
                        i11 = (i86 & i87) + (i87 | i86);
                        int iIdentityHashCode2 = System.identityHashCode(imVar);
                        int i88 = ~iIdentityHashCode2;
                        int i89 = ~i88;
                        int i90 = (1016058338 & i88) | ((-1016058339) & i89);
                        int i91 = (-1016058339) & i88;
                        int i92 = -(-((~((i90 & i91) | (i90 ^ i91))) * (-560)));
                        int i93 = (-1871390486) ^ i92;
                        int i94 = ((((i92 & (-1871390486)) | i93) << 1) - (~(-i93))) - 1;
                        int i95 = (-268505537) & iIdentityHashCode2;
                        int i96 = (iIdentityHashCode2 | (-268505537)) & (~i95);
                        int i97 = (~((i96 & i95) | (i96 ^ i95))) * (-560);
                        int i98 = i94 & i97;
                        int i99 = (i98 - (~(-(-((i97 ^ i94) | i98))))) - 1;
                        int i100 = ((-1342249422) & i88) | (i89 & 1342249421);
                        int i101 = i88 & 1342249421;
                        int i102 = ~((i100 & i101) | (i100 ^ i101));
                        int i103 = (-2089802224) & i102;
                        int i104 = (i102 | (-2089802224)) & (~i103);
                        int i105 = ((i104 & i103) | (i104 ^ i103)) * 560;
                        i12 = ((~i105) & i99) | ((~i99) & i105);
                        i13 = (i105 & i99) << 1;
                        if (i11 > ((i12 | i13) << 1) - (i13 ^ i12)) {
                            return Boolean.FALSE;
                        }
                        int i106 = 38 / 0;
                        return Boolean.FALSE;
                    }
                }
            } else if (terminalCreationFailure != TerminalCreationFailure.setLayoutAnimation) {
                if (!zBooleanValue3) {
                    int i410 = E;
                    int i411 = i410 | 103;
                    int i412 = i411 << 1;
                    int i413 = -((~(i410 & 103)) & i411);
                    i15 = ((i412 | i413) << 1) - (i413 ^ i412);
                    F = i15 % 128;
                    if (i15 % 2 == 0) {
                        SouthPacificEndpoint southPacificEndpoint7 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer13 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{14062, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer13}, -888877733, 888877739, System.identityHashCode(setscrollcontainer13))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 14062);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint8 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer14 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer14}, -888877733, 888877739, System.identityHashCode(setscrollcontainer14))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                    }
                    int i414 = E;
                    int i415 = (i414 ^ 74) + ((i414 & 74) << 1);
                    int i510 = (i415 ^ (-1)) + (i415 << 1);
                    F = i510 % 128;
                    int i511 = i510 % 2;
                }
                if (!zBooleanValue) {
                    i14 = F + 5;
                    E = i14 % 128;
                    if (i14 % 2 != 0) {
                        SouthPacificEndpoint southPacificEndpoint9 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer15 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{14371, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer15}, -888877733, 888877739, System.identityHashCode(setscrollcontainer15))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 14371);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint10 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer16 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20037, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer16}, -888877733, 888877739, System.identityHashCode(setscrollcontainer16))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20037);
                    }
                    int i512 = E;
                    int i513 = (i512 | 35) << 1;
                    int i514 = -(((~i512) & 35) | (i512 & (-36)));
                    int i515 = (i513 ^ i514) + ((i514 & i513) << 1);
                    F = i515 % 128;
                    int i516 = i515 % 2;
                }
                if (!zBooleanValue2) {
                    int i517 = E;
                    int i518 = ((i517 | 69) << 1) - (i517 ^ 69);
                    F = i518 % 128;
                    int i519 = i518 % 2;
                    SouthPacificEndpoint southPacificEndpoint11 = SouthPacificEndpoint.setX;
                    setScrollContainer setscrollcontainer17 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    SouthPacificEndpoint.setX(new Object[]{20034, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer17}, -888877733, 888877739, System.identityHashCode(setscrollcontainer17))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20034);
                    int i610 = E;
                    int i611 = (i610 | 25) << 1;
                    int i612 = -(((~i610) & 25) | (i610 & (-26)));
                    int i613 = (i611 ^ i612) + ((i612 & i611) << 1);
                    F = i613 % 128;
                    int i614 = i613 % 2;
                }
                int iIdentityHashCode3 = System.identityHashCode(imVar);
                int i615 = ~iIdentityHashCode3;
                int i616 = (-1449005035) & i615;
                int i617 = ((((-1449005035) | i615) & (~i616)) | i616) * (-757);
                int i618 = 1587003054 & i617;
                int i619 = -(-((i617 ^ 1587003054) | i618));
                int i710 = ((i618 | i619) << 1) - (i619 ^ i618);
                int i711 = (-1443235169) ^ iIdentityHashCode3;
                int i712 = (-1443235169) & iIdentityHashCode3;
                int i713 = -(~((~((i712 & i711) | (i711 ^ i712))) * 1514));
                int i714 = (((i710 | i713) << 1) - (i713 ^ i710)) - 1;
                int i715 = (i615 & (-1453823329)) | ((-1453823329) ^ i615);
                int i716 = ~i715;
                int i717 = (i715 | i716) & i716;
                int i718 = (i717 & 10588160) | (10588160 ^ i717);
                int i719 = (-5769867) & iIdentityHashCode3;
                int i810 = ((iIdentityHashCode3 | (-5769867)) & (~i719)) | i719;
                int i811 = ~i810;
                int i812 = (i810 | i811) & i811;
                int i813 = i718 & i812;
                int i814 = (i812 | i718) & (~i813);
                int i815 = ((i814 & i813) | (i814 ^ i813)) * 757;
                int i816 = i714 & i815;
                int i817 = (i815 ^ i714) | i816;
                i11 = (i816 & i817) + (i817 | i816);
                int iIdentityHashCode4 = System.identityHashCode(imVar);
                int i818 = ~iIdentityHashCode4;
                int i819 = ~i818;
                int i910 = (1016058338 & i818) | ((-1016058339) & i819);
                int i911 = (-1016058339) & i818;
                int i912 = -(-((~((i910 & i911) | (i910 ^ i911))) * (-560)));
                int i913 = (-1871390486) ^ i912;
                int i914 = ((((i912 & (-1871390486)) | i913) << 1) - (~(-i913))) - 1;
                int i915 = (-268505537) & iIdentityHashCode4;
                int i916 = (iIdentityHashCode4 | (-268505537)) & (~i915);
                int i917 = (~((i916 & i915) | (i916 ^ i915))) * (-560);
                int i918 = i914 & i917;
                int i919 = (i918 - (~(-(-((i917 ^ i914) | i918))))) - 1;
                int i107 = ((-1342249422) & i818) | (i819 & 1342249421);
                int i108 = i818 & 1342249421;
                int i109 = ~((i107 & i108) | (i107 ^ i108));
                int i1010 = (-2089802224) & i109;
                int i1011 = (i109 | (-2089802224)) & (~i1010);
                int i1012 = ((i1011 & i1010) | (i1011 ^ i1010)) * 560;
                i12 = ((~i1012) & i919) | ((~i919) & i1012);
                i13 = (i1012 & i919) << 1;
                if (i11 > ((i12 | i13) << 1) - (i13 ^ i12)) {
                    return Boolean.FALSE;
                }
                int i1013 = 38 / 0;
                return Boolean.FALSE;
            }
            imVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
            int i110 = E;
            int i111 = i110 & 29;
            int i112 = (i110 | 29) & (~i111);
            int i113 = i111 << 1;
            int i114 = ((i112 | i113) << 1) - (i112 ^ i113);
            F = i114 % 128;
            int i115 = i114 % 2;
        } else {
            setScrollContainer setscrollcontainer18 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (imVar.setY((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer18}, -888877733, 888877739, System.identityHashCode(setscrollcontainer18)))) {
                int i116 = F + 53;
                E = i116 % 128;
                if (i116 % 2 != 0) {
                    setScrollContainer setscrollcontainer19 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    int i117 = 69 / 0;
                    if (!(!imVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer19}, -888877733, 888877739, System.identityHashCode(setscrollcontainer19))))) {
                        if (zBooleanValue3) {
                            int i118 = F;
                            i10 = (((i118 | 38) << 1) - (i118 ^ 38)) - 1;
                            E = i10 % 128;
                            if (i10 % 2 == 0) {
                                imVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                                throw null;
                            }
                            imVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                            int i119 = E;
                            int i120 = (i119 ^ 103) + ((i119 & 103) << 1);
                            F = i120 % 128;
                            int i121 = i120 % 2;
                        }
                    }
                } else {
                    setScrollContainer setscrollcontainer20 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (imVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer20}, -888877733, 888877739, System.identityHashCode(setscrollcontainer20)))) {
                        if (zBooleanValue3) {
                            int i1110 = F;
                            i10 = (((i1110 | 38) << 1) - (i1110 ^ 38)) - 1;
                            E = i10 % 128;
                            if (i10 % 2 == 0) {
                                imVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                                throw null;
                            }
                            imVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                            int i1111 = E;
                            int i122 = (i1111 ^ 103) + ((i1111 & 103) << 1);
                            F = i122 % 128;
                            int i123 = i122 % 2;
                        }
                    }
                }
                setScrollContainer setscrollcontainer21 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (!imVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer21}, -888877733, 888877739, System.identityHashCode(setscrollcontainer21)))) {
                    int i124 = E;
                    int i125 = i124 & 1;
                    int i126 = -(-((i124 ^ 1) | i125));
                    int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                    F = i127 % 128;
                    int i128 = i127 % 2;
                    SouthPacificEndpoint southPacificEndpoint12 = SouthPacificEndpoint.setX;
                    setScrollContainer setscrollcontainer22 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    SouthPacificEndpoint.setX(new Object[]{20035, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer22}, -888877733, 888877739, System.identityHashCode(setscrollcontainer22))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20035);
                    int i129 = E;
                    int i130 = i129 ^ 109;
                    int i131 = ((i129 & 109) | i130) << 1;
                    int i132 = -i130;
                    int i133 = (i131 & i132) + (i131 | i132);
                    F = i133 % 128;
                    int i134 = i133 % 2;
                }
                if (!zBooleanValue3) {
                    int i135 = F + 111;
                    E = i135 % 128;
                    if (i135 % 2 != 0) {
                        SouthPacificEndpoint southPacificEndpoint13 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer23 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{1865, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer23}, -888877733, 888877739, System.identityHashCode(setscrollcontainer23))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 2}, 1336485880, -1336485874, 1865);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint14 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer24 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer24}, -888877733, 888877739, System.identityHashCode(setscrollcontainer24))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                    }
                    int i136 = E;
                    int i137 = (((i136 | 78) << 1) - (i136 ^ 78)) - 1;
                    F = i137 % 128;
                    int i138 = i137 % 2;
                }
                int i139 = F;
                int i140 = i139 & 37;
                int i141 = -(-(i139 | 37));
                int i142 = (i140 & i141) + (i141 | i140);
                E = i142 % 128;
                int i143 = i142 % 2;
                return Boolean.FALSE;
            }
        }
        setScrollContainer setscrollcontainer25 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer25}, -888877733, 888877739, System.identityHashCode(setscrollcontainer25));
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
        if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
            int i144 = E;
            int i145 = (i144 | 61) << 1;
            int i146 = -(((~i144) & 61) | (i144 & (-62)));
            int i147 = (i145 & i146) + (i146 | i145);
            F = i147 % 128;
            if (i147 % 2 == 0) {
                ((Boolean) setY(new Object[]{getbeeponfailure}, 1931526624, -1931526623, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (!((Boolean) setY(new Object[]{getbeeponfailure}, 1931526624, -1931526623, (int) System.currentTimeMillis())).booleanValue()) {
                SouthPacificEndpoint southPacificEndpoint15 = SouthPacificEndpoint.setX;
                setScrollContainer setscrollcontainer26 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                SouthPacificEndpoint.setX(new Object[]{20038, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer26}, -888877733, 888877739, System.identityHashCode(setscrollcontainer26))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20038);
                int i148 = E;
                int i149 = (i148 | 13) << 1;
                int i150 = -(((~i148) & 13) | (i148 & (-14)));
                int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
                F = i151 % 128;
                int i152 = i151 % 2;
                return Boolean.FALSE;
            }
        }
        int i153 = E;
        int i154 = (((i153 & (-46)) | ((~i153) & 45)) - (~((i153 & 45) << 1))) - 1;
        F = i154 % 128;
        int i155 = i154 % 2;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e9 A[Catch: Exception -> 0x012c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x012c, blocks: (B:24:0x00e2, B:26:0x0121, B:40:0x0173, B:43:0x01b8, B:51:0x01e9, B:53:0x020f, B:57:0x0220, B:59:0x022c, B:65:0x02b3, B:67:0x02bd, B:37:0x0132), top: B:106:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0215  */
    /* JADX WARN: Code duplicated, block: B:57:0x0220 A[Catch: Exception -> 0x012c, TRY_ENTER, TryCatch #0 {Exception -> 0x012c, blocks: (B:24:0x00e2, B:26:0x0121, B:40:0x0173, B:43:0x01b8, B:51:0x01e9, B:53:0x020f, B:57:0x0220, B:59:0x022c, B:65:0x02b3, B:67:0x02bd, B:37:0x0132), top: B:106:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0293  */
    /* JADX WARN: Code duplicated, block: B:63:0x029c  */
    /* JADX WARN: Code duplicated, block: B:64:0x02a2 A[LOOP:0: B:53:0x020f->B:64:0x02a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x04c0  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        boolean z10;
        Object objValueOf;
        Iterator it;
        boolean z11;
        int i13;
        getBeepOnFailure getbeeponfailure;
        boolean dividerPadding;
        int i14;
        int i15;
        int i16 = ~((~i10) | i11);
        int i17 = ~i11;
        int i18 = (((~(i10 | i17 | (~i12))) | i16) * 449) + (i16 * (-1347)) + (((~(i17 | i10 | i12)) | i16) * 449) + (i11 * (-448)) + (i10 * 450);
        int i19 = 865402441;
        int i20 = -865402437;
        int i21 = 2;
        char c10 = 0;
        switch (i18) {
            case 1:
                ah ahVar = new ah((getBeepOnFailure) objArr[0]);
                boolean navBarTitleString = ((an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)))).getNavBarTitleString();
                int i22 = F;
                int i23 = i22 & 1;
                int i24 = i23 + ((i22 ^ 1) | i23);
                E = i24 % 128;
                int i25 = i24 % 2;
                return Boolean.valueOf(navBarTitleString);
            case 2:
                im imVar = (im) objArr[0];
                int i26 = E;
                int i27 = i26 & 91;
                int i28 = (i26 ^ 91) | i27;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                F = i29 % 128;
                int i30 = i29 % 2;
                boolean z12 = imVar.D;
                if (i30 != 0) {
                    return Boolean.valueOf(z12);
                }
                throw null;
            case 3:
                im imVar2 = (im) objArr[0];
                md mdVar = (md) objArr[1];
                setTop settop = (setTop) objArr[2];
                Intrinsics.checkNotNullParameter(mdVar, "");
                Intrinsics.checkNotNullParameter(settop, "");
                cs csVar = new cs(imVar2);
                setOnHoverListener setonhoverlistener = new setOnHoverListener(mdVar, settop.setCompoundDrawableTintBlendMode());
                setBackground navBarTitleString2 = imVar2.getNavBarTitleString();
                setBackground.setX(new Object[]{navBarTitleString2, setonhoverlistener}, 154663697, -154663696, System.identityHashCode(navBarTitleString2));
                int i31 = F;
                int i32 = (i31 & 125) + (i31 | 125);
                E = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 4:
                return c0(objArr);
            case 5:
                im imVar3 = (im) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i34 = E;
                int i35 = (i34 & (-4)) | ((~i34) & 3);
                int i36 = (i34 & 3) << 1;
                int i37 = (i35 & i36) + (i36 | i35);
                F = i37 % 128;
                int i38 = i37 % 2;
                imVar3.C = zBooleanValue;
                if (i38 == 0) {
                    throw null;
                }
                return null;
            case 6:
                im imVar4 = (im) objArr[0];
                setMaxWidth setmaxwidth = (setMaxWidth) objArr[1];
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
                ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1949712751, -1949712727, System.identityHashCode(setmaxwidth))).booleanValue();
                setMaxWidth.setX(new Object[]{setmaxwidth}, -1326128514, 1326128523, System.identityHashCode(setmaxwidth));
                ArrayList arrayList = new ArrayList();
                Iterator it2 = setmaxwidth.iterator();
                int i39 = F + 9;
                E = i39 % 128;
                int i40 = i39 % 2;
                while (!(!it2.hasNext())) {
                    int i41 = E + 91;
                    F = i41 % 128;
                    int i42 = i41 % i21;
                    Object next = it2.next();
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) next;
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = getbeeponfailure2;
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(objArr2, i19, i20, System.identityHashCode(getbeeponfailure2));
                    Object[] objArr3 = new Object[1];
                    objArr3[c10] = setscrollcontainer;
                    if (imVar4.setDividerPadding((String) setScrollContainer.setOnFocusChangeListener(objArr3, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                        int i43 = E;
                        int i44 = (i43 | 81) << 1;
                        int i45 = -(((~i43) & 81) | (i43 & (-82)));
                        int i46 = (i44 & i45) + (i45 | i44);
                        F = i46 % 128;
                        int i47 = i46 % 2;
                    } else {
                        int iIdentityHashCode = System.identityHashCode(imVar4);
                        int i48 = ~iIdentityHashCode;
                        int i49 = i48 ^ 1174759315;
                        int i50 = i48 & 1174759315;
                        int i51 = (i49 ^ i50) | (i49 & i50);
                        int i52 = ~i51;
                        int i53 = i52 & (i51 | i52);
                        int i54 = i53 ^ (-1994780608);
                        int i55 = i53 & (-1994780608);
                        int i56 = ((i54 & i55) | (i54 ^ i55)) * 529;
                        int i57 = (341524162 & (~i56)) | (i56 & (-341524163));
                        int i58 = (341524162 & i56) << 1;
                        int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                        int i60 = ~((1174759315 ^ iIdentityHashCode) | (iIdentityHashCode & 1174759315));
                        int i61 = ((i60 & (-1994436414)) | ((-1994436414) ^ i60)) * 529;
                        int i62 = ((i59 | i61) << 1) - (i59 ^ i61);
                        int iIdentityHashCode2 = System.identityHashCode(imVar4);
                        int i63 = ~iIdentityHashCode2;
                        int i64 = i63 & (-24080189);
                        int i65 = i63 | (-24080189);
                        int i66 = (~i64) & i65;
                        int i67 = ~((i66 ^ i64) | (i64 & i66));
                        int i68 = 21382200 & i67;
                        int i69 = (i67 | 21382200) & (~i68);
                        int i70 = -(~(((i69 & i68) | (i69 ^ i68)) * (-712)));
                        int i71 = ((-1756121949) & i70) + (i70 | (-1756121949));
                        int i72 = (i71 ^ (-1)) + (i71 << 1);
                        int i73 = 514403207 & i63;
                        int i74 = (~i73) & (514403207 | i63);
                        int i75 = ~((i74 ^ i73) | (i73 & i74) | (-24080189));
                        int i76 = (i63 & (-2697989)) | (2697988 & iIdentityHashCode2);
                        int i77 = iIdentityHashCode2 & (-2697989);
                        int i78 = ~((i77 & i76) | (i76 ^ i77));
                        int i79 = -(~(-(-(((i78 & i75) | (i75 ^ i78)) * (-712)))));
                        int i80 = ((i72 & i79) + (i79 | i72)) - 1;
                        int i81 = ~i65;
                        int i82 = ((~i81) & 514403207) | ((-514403208) & i81);
                        int i83 = i81 & 514403207;
                        int i84 = -(-(((i83 & i82) | (i82 ^ i83)) * 712));
                        int i85 = i80 ^ i84;
                        int i86 = -(-((i84 & i80) << 1));
                        if (i62 <= ((i85 | i86) << 1) - (i86 ^ i85)) {
                            z10 = true;
                        }
                        if (!z10) {
                            int i87 = F;
                            int i88 = (i87 ^ 7) + ((i87 & 7) << 1);
                            E = i88 % 128;
                            int i89 = i88 % 2;
                            arrayList.add(next);
                            int i90 = E + 97;
                            F = i90 % 128;
                            int i91 = i90 % 2;
                        }
                        i19 = 865402441;
                        i20 = -865402437;
                        i21 = 2;
                        c10 = 0;
                    }
                    z10 = false;
                    if (!z10) {
                        int i810 = F;
                        int i811 = (i810 ^ 7) + ((i810 & 7) << 1);
                        E = i811 % 128;
                        int i812 = i811 % 2;
                        arrayList.add(next);
                        int i92 = E + 97;
                        F = i92 % 128;
                        int i93 = i92 % 2;
                    }
                    i19 = 865402441;
                    i20 = -865402437;
                    i21 = 2;
                    c10 = 0;
                }
                setmaxwidth.removeAll(arrayList);
                int i94 = F;
                int i95 = (i94 ^ 9) + ((i94 & 9) << 1);
                E = i95 % 128;
                if (i95 % 2 != 0) {
                    int i96 = 62 / 0;
                }
                return null;
            case 7:
                im imVar5 = (im) objArr[0];
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[1];
                TerminalCreationFailure terminalCreationFailure = (TerminalCreationFailure) objArr[2];
                int i97 = E;
                int i98 = ((i97 & 6) + (i97 | 6)) - 1;
                F = i98 % 128;
                try {
                    if (i98 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(getbeeponfailure3, "");
                        setY(new Object[]{imVar5, (setMaxWidth) ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3)))}, 151682120, -151682114, System.identityHashCode(imVar5));
                        setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                        int i99 = 57 / 0;
                        if (!(!((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -927948209, 927948212, System.identityHashCode(setscrollcontainer2))).booleanValue())) {
                            int i100 = E;
                            int i101 = i100 ^ 63;
                            int i102 = -(-((i100 & 63) << 1));
                            int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
                            F = i103 % 128;
                            int i104 = i103 % 2;
                            if (!(!((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3))).isEmpty())) {
                                int i105 = F;
                                int i106 = ((i105 | 115) << 1) - (i105 ^ 115);
                                int i107 = i106 % 128;
                                E = i107;
                                int i108 = i106 % 2;
                                i15 = i107 + 109;
                                F = i15 % 128;
                                if (i15 % 2 != 0) {
                                    throw null;
                                }
                                objValueOf = Boolean.TRUE;
                            } else {
                                it = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3))).iterator();
                                int i109 = E;
                                int i110 = i109 & 1;
                                int i111 = (((i109 ^ 1) | i110) << 1) - ((i109 | 1) & (~i110));
                                F = i111 % 128;
                                int i112 = i111 % 2;
                                z11 = false;
                                while (it.hasNext()) {
                                    i13 = E + 77;
                                    F = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        imVar5.setDividerPadding((getBeepOnFailure) it.next(), terminalCreationFailure);
                                        try {
                                            throw null;
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    getbeeponfailure = (getBeepOnFailure) it.next();
                                    dividerPadding = imVar5.setDividerPadding(getbeeponfailure, terminalCreationFailure);
                                    if (dividerPadding) {
                                        int i113 = E;
                                        int i114 = ((i113 & 62) + (i113 | 62)) - 1;
                                        F = i114 % 128;
                                        int i115 = i114 % 2;
                                        z11 = dividerPadding;
                                    } else {
                                        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                                        setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                        SouthPacificEndpoint.setX(new Object[]{20031, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20031);
                                        int i116 = E;
                                        int i117 = (i116 & 118) + (i116 | 118);
                                        i14 = (i117 ^ (-1)) + (i117 << 1);
                                        F = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            int i118 = 96 / 0;
                                            objValueOf = Boolean.valueOf(dividerPadding);
                                        } else {
                                            objValueOf = Boolean.valueOf(dividerPadding);
                                        }
                                    }
                                }
                                int i119 = F;
                                int i120 = i119 & 3;
                                int i121 = (i119 | 3) & (~i120);
                                int i122 = i120 << 1;
                                int i123 = ((i121 | i122) << 1) - (i121 ^ i122);
                                E = i123 % 128;
                                int i124 = i123 % 2;
                                objValueOf = Boolean.valueOf(z11);
                            }
                        } else {
                            boolean zBooleanValue2 = ((Boolean) setY(new Object[]{imVar5, getbeeponfailure3, terminalCreationFailure}, 1084151924, -1084151920, System.identityHashCode(imVar5))).booleanValue();
                            int i125 = E;
                            int i126 = i125 & 41;
                            int i127 = (i125 ^ 41) | i126;
                            int i128 = (i126 & i127) + (i127 | i126);
                            F = i128 % 128;
                            int i129 = i128 % 2;
                            objValueOf = Boolean.valueOf(zBooleanValue2);
                        }
                    } else {
                        Intrinsics.checkNotNullParameter(getbeeponfailure3, "");
                        setY(new Object[]{imVar5, (setMaxWidth) ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3)))}, 151682120, -151682114, System.identityHashCode(imVar5));
                        setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                        if (!((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -927948209, 927948212, System.identityHashCode(setscrollcontainer4))).booleanValue()) {
                            boolean zBooleanValue3 = ((Boolean) setY(new Object[]{imVar5, getbeeponfailure3, terminalCreationFailure}, 1084151924, -1084151920, System.identityHashCode(imVar5))).booleanValue();
                            int i1210 = E;
                            int i1211 = i1210 & 41;
                            int i1212 = (i1210 ^ 41) | i1211;
                            int i1213 = (i1211 & i1212) + (i1212 | i1211);
                            F = i1213 % 128;
                            int i1214 = i1213 % 2;
                            objValueOf = Boolean.valueOf(zBooleanValue3);
                        } else {
                            int i1010 = E;
                            int i1011 = i1010 ^ 63;
                            int i1012 = -(-((i1010 & 63) << 1));
                            int i1013 = (i1011 ^ i1012) + ((i1012 & i1011) << 1);
                            F = i1013 % 128;
                            int i1014 = i1013 % 2;
                            if (!(!((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3))).isEmpty())) {
                                int i1015 = F;
                                int i1016 = ((i1015 | 115) << 1) - (i1015 ^ 115);
                                int i1017 = i1016 % 128;
                                E = i1017;
                                int i1018 = i1016 % 2;
                                i15 = i1017 + 109;
                                F = i15 % 128;
                                if (i15 % 2 != 0) {
                                    throw null;
                                }
                                objValueOf = Boolean.TRUE;
                            } else {
                                it = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3))).iterator();
                                int i1019 = E;
                                int i1110 = i1019 & 1;
                                int i1111 = (((i1019 ^ 1) | i1110) << 1) - ((i1019 | 1) & (~i1110));
                                F = i1111 % 128;
                                int i1112 = i1111 % 2;
                                z11 = false;
                                while (it.hasNext()) {
                                    i13 = E + 77;
                                    F = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        imVar5.setDividerPadding((getBeepOnFailure) it.next(), terminalCreationFailure);
                                        throw null;
                                    }
                                    getbeeponfailure = (getBeepOnFailure) it.next();
                                    dividerPadding = imVar5.setDividerPadding(getbeeponfailure, terminalCreationFailure);
                                    if (dividerPadding) {
                                        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                                        setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                        SouthPacificEndpoint.setX(new Object[]{20031, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20031);
                                        int i1113 = E;
                                        int i1114 = (i1113 & 118) + (i1113 | 118);
                                        i14 = (i1114 ^ (-1)) + (i1114 << 1);
                                        F = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            int i1115 = 96 / 0;
                                            objValueOf = Boolean.valueOf(dividerPadding);
                                        } else {
                                            objValueOf = Boolean.valueOf(dividerPadding);
                                        }
                                    } else {
                                        int i1116 = E;
                                        int i1117 = ((i1116 & 62) + (i1116 | 62)) - 1;
                                        F = i1117 % 128;
                                        int i1118 = i1117 % 2;
                                        z11 = dividerPadding;
                                    }
                                }
                                int i1119 = F;
                                int i1215 = i1119 & 3;
                                int i1216 = (i1119 | 3) & (~i1215);
                                int i1217 = i1215 << 1;
                                int i1218 = ((i1216 | i1217) << 1) - (i1216 ^ i1217);
                                E = i1218 % 128;
                                int i1219 = i1218 % 2;
                                objValueOf = Boolean.valueOf(z11);
                            }
                        }
                    }
                } catch (Exception e5) {
                    SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{"Failed to parse and store card response"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                    SouthPacificEndpoint.setX(new Object[]{20032, (getDetailsFieldTextSizeSp) Iso4217Currency.setCompoundDrawableTintBlendMode(new Object[]{e5}, 940749687, -940749687, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20032);
                    objValueOf = Boolean.FALSE;
                }
                return objValueOf;
            case 8:
                im imVar6 = (im) objArr[0];
                int i130 = E;
                int i131 = i130 & 81;
                int i132 = i131 + ((i130 ^ 81) | i131);
                F = i132 % 128;
                int i133 = i132 % 2;
                boolean z13 = imVar6.C;
                if (i133 != 0) {
                    return Boolean.valueOf(z13);
                }
                throw null;
            case 9:
                im imVar7 = (im) objArr[0];
                boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int i134 = E + 115;
                int i135 = i134 % 128;
                F = i135;
                int i136 = i134 % 2;
                imVar7.D = zBooleanValue4;
                int i137 = i135 + 125;
                E = i137 % 128;
                if (i137 % 2 == 0) {
                    return null;
                }
                throw null;
            case 10:
                im imVar8 = (im) objArr[0];
                int i138 = F + 51;
                E = i138 % 128;
                if (i138 % 2 == 0) {
                    return imVar8.B;
                }
                setRevealOnFocusHint setrevealonfocushint = imVar8.B;
                throw null;
            default:
                im imVar9 = (im) objArr[0];
                int i139 = E;
                int i140 = i139 & 89;
                int i141 = (i139 ^ 89) | i140;
                int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                int i143 = i142 % 128;
                F = i143;
                int i144 = i142 % 2;
                objValueOf = imVar9.A;
                int i145 = i143 & 107;
                int i146 = i145 + ((i143 ^ 107) | i145);
                E = i146 % 128;
                if (i146 % 2 != 0) {
                    throw null;
                }
                return objValueOf;
        }
    }

    public final boolean TransactionResult() {
        return ((Boolean) setY(new Object[]{this}, 413373164, -413373162, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setFontFeatureSettings getSuppressed() {
        return (setFontFeatureSettings) setY(new Object[]{this}, -408299353, 408299353, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    public final boolean setDividerPadding(@NotNull getBeepOnFailure getbeeponfailure, @Nullable TerminalCreationFailure terminalCreationFailure) {
        return ((Boolean) setY(new Object[]{this, getbeeponfailure, terminalCreationFailure}, 1111828780, -1111828773, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setRevealOnFocusHint setMaxEms() {
        return (setRevealOnFocusHint) setY(new Object[]{this}, -967673671, 967673681, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    public final void setOnFocusChangeListener(@NotNull md mdVar, @NotNull setTop settop) throws Exception {
        setY(new Object[]{this, mdVar, settop}, 826063392, -826063389, System.identityHashCode(this));
    }

    public final boolean setTextSelectHandleRight() {
        return ((Boolean) setY(new Object[]{this}, 61227936, -61227928, System.identityHashCode(this))).booleanValue();
    }

    public final void setX(boolean z10) throws Exception {
        setY(new Object[]{this, Boolean.valueOf(z10)}, -818388399, 818388408, System.identityHashCode(this));
    }

    public final void setY(boolean z10) throws Exception {
        setY(new Object[]{this, Boolean.valueOf(z10)}, 36630807, -36630802, System.identityHashCode(this));
    }
}
