package com.mypinpad.tsdk.isolation;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class hs extends hh {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56235l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final component17 f56236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final gz f56237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final io f56238k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull component17 component17Var, @NotNull gz gzVar, @NotNull io ioVar) {
        super(gvVar, settextkeepstate, exVar, getvalue);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(ioVar, "");
        this.f56236i = component17Var;
        this.f56237j = gzVar;
        this.f56238k = ioVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ fk a(Object[] objArr) {
        hs hsVar = (hs) objArr[0];
        gv gvVar = (gv) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        setRotationX setrotationx = (setRotationX) objArr[3];
        int i10 = m + 11;
        f56235l = i10 % 128;
        int i11 = i10 % 2;
        ex exVar = (ex) hsVar.setX();
        activateSession activatesession = activateSession.ERROR_OTHER_CARD;
        fk dividerPadding = ex.setDividerPadding(exVar, gvVar, settextkeepstate, activatesession, ValueQualifier.setY, null, fd.SELECT_NEXT, getY.setCompoundDrawableTintBlendMode, null, activatesession, null, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)), setContentCaptureSession.setLayoutAnimation, null, null, null, null, (byte) -1, null, false, false, 3011216);
        int i12 = f56235l + 101;
        m = i12 % 128;
        if (i12 % 2 != 0) {
            return dividerPadding;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ fk b(Object[] objArr) {
        hs hsVar = (hs) objArr[0];
        a aVar = (a) objArr[1];
        int i10 = m;
        int i11 = i10 & 125;
        int i12 = (i11 - (~(-(-((i10 ^ 125) | i11))))) - 1;
        f56235l = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(aVar, "");
        gv gvVar = (gv) hsVar.setOnFocusChangeListener();
        gv.setOnFocusChangeListener(new Object[]{gvVar, (Integer) a.setX(new Object[]{aVar}, -114513983, 114513983, System.identityHashCode(aVar)), (Integer) a.setX(new Object[]{aVar}, 156913967, -156913963, System.identityHashCode(aVar)), (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))}, -1273972116, 1273972121, System.identityHashCode(gvVar));
        fk fkVar = fk.setDividerPadding;
        int i14 = f56235l;
        int i15 = i14 & 27;
        int i16 = ((((i14 ^ 27) | i15) << 1) - (~(-((i14 | 27) & (~i15))))) - 1;
        m = i16 % 128;
        if (i16 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    public static /* synthetic */ fk c(Object[] objArr) {
        hs hsVar = (hs) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i10 = f56235l;
        int i11 = i10 & 33;
        int i12 = i11 + ((i10 ^ 33) | i11);
        m = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        if (!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
            int i14 = m;
            int i15 = i14 & 117;
            int i16 = (((i14 | 117) & (~i15)) - (~(i15 << 1))) - 1;
            f56235l = i16 % 128;
            int i17 = i16 % 2;
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{20002, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20002);
            fk fkVar = (fk) setDividerPadding(new Object[]{hsVar, (gv) hsVar.setOnFocusChangeListener(), hsVar.setCompoundDrawableTintBlendMode(), setrotationx}, -933091494, 933091504, System.identityHashCode(hsVar));
            int i18 = m;
            int i19 = i18 ^ 123;
            int i20 = ((i18 & 123) | i19) << 1;
            int i21 = -i19;
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            f56235l = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 77 / 0;
            }
            return fkVar;
        }
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) setDividerPadding(new Object[]{setrotationx, (gv) hsVar.setOnFocusChangeListener()}, -1272467288, 1272467289, (int) System.currentTimeMillis());
        if (setcontentcapturesession != null) {
            int i24 = m + 87;
            f56235l = i24 % 128;
            if (i24 % 2 != 0) {
                int length = ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length;
                throw null;
            }
            if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length == 0) {
                int i25 = f56235l;
                int i26 = (i25 & (-24)) | ((~i25) & 23);
                int i27 = -(-((i25 & 23) << 1));
                int i28 = (i26 & i27) + (i26 | i27);
                m = i28 % 128;
                int i29 = i28 % 2;
                int i30 = i25 & 117;
                int i31 = (i25 ^ 117) | i30;
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                m = i32 % 128;
                int i33 = i32 % 2;
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20003, null, 6}, 1336485880, -1336485874, 20003);
                int i34 = f56235l;
                int i35 = (((i34 ^ 21) | (i34 & 21)) << 1) - (((~i34) & 21) | (i34 & (-22)));
                m = i35 % 128;
                int i36 = i35 % 2;
            } else {
                int i37 = f56235l;
                int i38 = i37 & 97;
                int i39 = i38 + ((i37 ^ 97) | i38);
                m = i39 % 128;
                int i40 = i39 % 2;
                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20004, null, 6}, 1336485880, -1336485874, 20004);
                int i41 = m;
                int i42 = (i41 ^ 58) + ((i41 & 58) << 1);
                int i43 = (i42 ^ (-1)) + (i42 << 1);
                f56235l = i43 % 128;
                int i44 = i43 % 2;
            }
            fk fkVar2 = (fk) setDividerPadding(new Object[]{hsVar, (gv) hsVar.setOnFocusChangeListener(), hsVar.setCompoundDrawableTintBlendMode(), setcontentcapturesession}, 532739542, -532739533, System.identityHashCode(hsVar));
            int i45 = m;
            int i46 = i45 & 7;
            int i47 = (((i45 | 7) & (~i46)) - (~(-(-(i46 << 1))))) - 1;
            f56235l = i47 % 128;
            if (i47 % 2 == 0) {
                return fkVar2;
            }
            throw null;
        }
        gv gvVar = (gv) hsVar.setOnFocusChangeListener();
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2064855914, -2064855856, System.identityHashCode(gvVar))).booleanValue()) {
            int i48 = f56235l;
            int i49 = ((i48 & 110) + (i48 | 110)) - 1;
            m = i49 % 128;
            int i50 = i49 % 2;
            gv gvVar2 = (gv) hsVar.setOnFocusChangeListener();
            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, 2064855914, -2064855856, System.identityHashCode(gvVar2))).booleanValue()) {
                int i51 = f56235l;
                int i52 = (i51 & 21) + (i51 | 21);
                m = i52 % 128;
                int i53 = i52 % 2;
                fk fkVar3 = (fk) setDividerPadding(new Object[]{hsVar, (gv) hsVar.setOnFocusChangeListener(), hsVar.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setOnFocusChangeListener}, 532739542, -532739533, System.identityHashCode(hsVar));
                int i54 = f56235l;
                int i55 = i54 & 107;
                int i56 = i54 | 107;
                int i57 = (i55 & i56) + (i56 | i55);
                m = i57 % 128;
                if (i57 % 2 != 0) {
                    return fkVar3;
                }
                throw null;
            }
        }
        aq aqVar = new aq(hsVar.setOnFocusChangeListener());
        am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
        if (!((Boolean) am.setY(new Object[]{amVar}, -1841382210, 1841382214, System.identityHashCode(amVar))).booleanValue()) {
            fk fkVar4 = (fk) setDividerPadding(new Object[]{hsVar, (gv) hsVar.setOnFocusChangeListener(), hsVar.setCompoundDrawableTintBlendMode(), setContentCaptureSession.getNavBarTitleString}, 532739542, -532739533, System.identityHashCode(hsVar));
            int i58 = m;
            int i59 = ((i58 | 81) << 1) - (i58 ^ 81);
            f56235l = i59 % 128;
            int i60 = i59 % 2;
            return fkVar4;
        }
        int i61 = m;
        int i62 = (i61 & 61) + (i61 | 61);
        f56235l = i62 % 128;
        int i63 = i62 % 2;
        io ioVar = hsVar.f56238k;
        gz gzVar = hsVar.f56237j;
        if (i63 != 0) {
            throw null;
        }
        fk fkVar5 = (fk) setDividerPadding(new Object[]{hsVar, (gv) hsVar.setOnFocusChangeListener(), hsVar.setCompoundDrawableTintBlendMode(), gzVar, hsVar.setY(), ioVar}, 266451428, -266451428, System.identityHashCode(hsVar));
        int i64 = f56235l;
        int i65 = ((i64 & 74) + (i64 | 74)) - 1;
        m = i65 % 128;
        if (i65 % 2 != 0) {
            return fkVar5;
        }
        throw null;
    }

    public static /* synthetic */ setContentCaptureSession d(Object[] objArr) {
        getBeepOnFailure next;
        setRotationX setrotationx = (setRotationX) objArr[0];
        gv gvVar = (gv) objArr[1];
        int i10 = f56235l;
        int i11 = ((i10 ^ 4) + ((i10 & 4) << 1)) - 1;
        m = i11 % 128;
        int i12 = i11 % 2;
        setMaxWidth onDragListener = setrotationx.setOnDragListener();
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
        if (((getBeepOnFailure) setMaxWidth.setX(new Object[]{onDragListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -480651882, 480651889, System.identityHashCode(onDragListener))) != null) {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i13 = ~iCurrentTimeMillis;
            int i14 = (-250797358) ^ i13;
            int i15 = i13 & (-250797358);
            int i16 = (i15 & i14) | (i14 ^ i15);
            int i17 = ~i16;
            int i18 = (i16 | i17) & i17;
            int i19 = -(-(((i18 & 235949349) | ((~i18) & 235949349) | ((-235949350) & i18)) * 446));
            int i20 = ((-1048904922) & i19) + (i19 | (-1048904922));
            int i21 = ~((iCurrentTimeMillis & (-14848009)) | ((-14848009) ^ iCurrentTimeMillis));
            int i22 = ((i21 & 268436112) | (268436112 ^ i21)) * 446;
            int i23 = ((i20 | i22) << 1) - (i22 ^ i20);
            int i24 = i23 & (-2140772746);
            int i25 = -(-(((-2140772746) ^ i23) | i24));
            int i26 = (i24 & i25) + (i25 | i24);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i27 = ~iCurrentTimeMillis2;
            int i28 = (-2099879289) | i27;
            int i29 = i28 ^ 1994490841;
            int i30 = i28 & 1994490841;
            int i31 = ~((i29 ^ i30) | (i29 & i30));
            int i32 = (iCurrentTimeMillis2 | i27) & i27;
            int i33 = ((-1994490842) & (~i32)) | (i32 & 1994490841);
            int i34 = (-1994490842) & i32;
            int i35 = (i33 ^ i34) | (i34 & i33);
            int i36 = i35 & 2099879288;
            int i37 = ~(((~i36) & (i35 | 2099879288)) | i36);
            int i38 = ((i37 & i31) | (i31 ^ i37)) * (-184);
            int i39 = (-1945424103) ^ i38;
            int i40 = -(-((i38 & (-1945424103)) << 1));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            int i42 = (-2099879289) & i27;
            int i43 = (~i42) & i28;
            int i44 = (i42 & i43) | (i43 ^ i42);
            int i45 = ~i44;
            int i46 = (i44 | i45) & i45;
            int i47 = (i46 & 1948352856) | (1948352856 ^ i46);
            int i48 = ((-1994490842) & (~i27)) | (i27 & 1994490841);
            int i49 = (-1994490842) & i27;
            int i50 = (i48 & i49) | (i48 ^ i49);
            int i51 = ~i50;
            int i52 = (i50 | i51) & i51;
            int i53 = i47 & i52;
            int i54 = (((i47 | i52) & (~i53)) | i53) * 184;
            int i55 = ((((i41 ^ i54) | (i41 & i54)) << 1) - (~(-((i54 & (~i41)) | ((~i54) & i41))))) - 1;
            int i56 = i55 & (-269813000);
            int i57 = ((i55 ^ (-269813000)) | i56) << 1;
            int i58 = -(((-269813000) | i55) & (~i56));
            if (i26 <= (i57 & i58) + (i58 | i57)) {
                setMaxWidth onDragListener2 = setrotationx.setOnDragListener();
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                throw null;
            }
            setMaxWidth onDragListener3 = setrotationx.setOnDragListener();
            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
            if (((getBeepOnFailure) setMaxWidth.setX(new Object[]{onDragListener3, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -480651882, 480651889, System.identityHashCode(onDragListener3))) != null) {
                Iterator<getBeepOnFailure> it = setrotationx.setOnDragListener().iterator();
                int i59 = f56235l;
                int i60 = ((i59 & 92) + (i59 | 92)) - 1;
                m = i60 % 128;
                int i61 = i60 % 2;
                while (true) {
                    if (!it.hasNext()) {
                        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)), TerminalCreationFailure.setLayoutAnimation}, -1215492211, 1215492218, System.identityHashCode(gvVar))).booleanValue()) {
                            setContentCaptureSession setcontentcapturesession = setContentCaptureSession.setNavigationOnClickListener;
                            int i62 = f56235l;
                            int i63 = i62 & 125;
                            int i64 = -(-((i62 ^ 125) | i63));
                            int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                            m = i65 % 128;
                            int i66 = i65 % 2;
                            return setcontentcapturesession;
                        }
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        int i67 = f56235l;
                        int i68 = i67 & 3;
                        int i69 = -(-((i67 ^ 3) | i68));
                        int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                        m = i70 % 128;
                        int i71 = i70 % 2;
                        return null;
                    }
                    int i72 = m;
                    int i73 = (((i72 ^ 105) | (i72 & 105)) << 1) - (((~i72) & 105) | (i72 & (-106)));
                    f56235l = i73 % 128;
                    int i74 = i73 % 2;
                    next = it.next();
                    if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 610902136, -610902111, System.identityHashCode(next))).booleanValue()) {
                        break;
                    }
                    int i75 = f56235l;
                    int i76 = i75 ^ 113;
                    int i77 = (((i75 & 113) | i76) << 1) - i76;
                    m = i77 % 128;
                    if (i77 % 2 == 0) {
                        int i78 = 67 / 0;
                        if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, -32940825, 32940851, System.identityHashCode(next))).booleanValue()) {
                            break;
                        }
                        int i79 = m;
                        int i80 = (i79 | 95) << 1;
                        int i81 = -(((~i79) & 95) | (i79 & (-96)));
                        int i82 = (i80 & i81) + (i81 | i80);
                        f56235l = i82 % 128;
                        int i83 = i82 % 2;
                    } else {
                        if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, -32940825, 32940851, System.identityHashCode(next))).booleanValue()) {
                            break;
                        }
                        int i710 = m;
                        int i84 = (i710 | 95) << 1;
                        int i85 = -(((~i710) & 95) | (i710 & (-96)));
                        int i86 = (i84 & i85) + (i85 | i84);
                        f56235l = i86 % 128;
                        int i87 = i86 % 2;
                    }
                }
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                SouthPacificEndpoint.setX(new Object[]{20005, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20005);
                setContentCaptureSession setcontentcapturesession2 = setContentCaptureSession.setNavigationOnClickListener;
                int i88 = f56235l;
                int i89 = i88 ^ 19;
                int i90 = (i88 & 19) << 1;
                int i91 = (i89 & i90) + (i90 | i89);
                m = i91 % 128;
                if (i91 % 2 != 0) {
                    return setcontentcapturesession2;
                }
                throw null;
            }
        }
        setContentCaptureSession setcontentcapturesession3 = setContentCaptureSession.setOnFocusChangeListener;
        int i92 = f56235l;
        int i93 = (i92 ^ 121) + ((i92 & 121) << 1);
        m = i93 % 128;
        int i94 = i93 % 2;
        return setcontentcapturesession3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0119 A[PHI: r3
      0x0119: PHI (r3v4 com.mypinpad.tsdk.i.getBeepOnFailure) = (r3v3 com.mypinpad.tsdk.i.getBeepOnFailure), (r3v19 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:13:0x0117, B:10:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:18:0x023f  */
    /* JADX WARN: Code duplicated, block: B:20:0x025c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0292  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x028e, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r5, (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r7}, 1914607362, -1914607356, java.lang.System.identityHashCode(r7))}, 2064855914, -2064855856, java.lang.System.identityHashCode(r5))).booleanValue() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02c1, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r5, (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r7}, 1914607362, -1914607356, java.lang.System.identityHashCode(r7))}, 2064855914, -2064855856, java.lang.System.identityHashCode(r5))).booleanValue() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02c5, code lost:
    
        r7 = (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], 2002669863, -2002669628, (int) java.lang.System.currentTimeMillis());
        r7 = (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r7}, 1914607362, -1914607356, java.lang.System.identityHashCode(r7));
        r8 = kotlin.collections.ArraysKt___ArraysKt.sliceArray((byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r3}, 252497730, -252497710, java.lang.System.identityHashCode(r3)), new kotlin.ranges.IntRange(0, 1));
        r8 = java.lang.Boolean.FALSE;
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r5, (com.mypinpad.tsdk.isolation.getBeepOnFailure) com.mypinpad.tsdk.i.getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new java.lang.Object[]{r7, r8, null, r8, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, java.lang.System.identityHashCode(r5));
        r1 = (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], 1434076523, -1434076328, (int) java.lang.System.currentTimeMillis());
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r5, (com.mypinpad.tsdk.isolation.getBeepOnFailure) com.mypinpad.tsdk.i.getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new java.lang.Object[]{(java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r1}, 1914607362, -1914607356, java.lang.System.identityHashCode(r1)), kotlin.collections.ArraysKt___ArraysKt.sliceArray((byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r3}, 252497730, -252497710, java.lang.System.identityHashCode(r3)), kotlin.ranges.c.until(2, ((byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r3}, 252497730, -252497710, java.lang.System.identityHashCode(r3))).length)), null, r8, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, java.lang.System.identityHashCode(r5));
        r1 = com.mypinpad.tsdk.isolation.hs.f56235l;
        r2 = (r1 & 9) + (r1 | 9);
        com.mypinpad.tsdk.isolation.hs.m = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x03b8, code lost:
    
        if ((r2 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x03ba, code lost:
    
        r1 = 50 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x03be, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x03bf, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.setContentCaptureSession e(java.lang.Object[] r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.hs.e(java.lang.Object[]):com.mypinpad.tsdk.i.setContentCaptureSession");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x029f  */
    /* JADX WARN: Code duplicated, block: B:44:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x0309  */
    /* JADX WARN: Code duplicated, block: B:48:0x035a  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b7, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.hd.setY(new java.lang.Object[]{r2}, 701423058, -701423056, java.lang.System.identityHashCode(r2))).booleanValue()) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.setAnimation.INSTANCE;
        r1 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r1, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -1152230407, 1152230575, (int) java.lang.System.currentTimeMillis())}, -1593889019, 1593889062, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00de, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e0, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.hs.f56235l;
        r2 = r1 + 39;
        com.mypinpad.tsdk.isolation.hs.m = r2 % 128;
        r2 = r2 % 2;
        r2 = (r1 | 31) << 1;
        r1 = -(((~r1) & 31) | (r1 & (-32)));
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        com.mypinpad.tsdk.isolation.hs.m = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fd, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0100, code lost:
    
        r1 = (byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r1}, 252497730, -252497710, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010e, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0110, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.hs.f56235l;
        r2 = r1 & 81;
        r3 = (~r2) & (r1 | 81);
        r2 = r2 << 1;
        r5 = ((r3 | r2) << 1) - (r2 ^ r3);
        com.mypinpad.tsdk.isolation.hs.m = r5 % 128;
        r5 = r5 % 2;
        r2 = r1 & 105;
        r1 = (r1 ^ 105) | r2;
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        com.mypinpad.tsdk.isolation.hs.m = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0133, code lost:
    
        r1 = java.lang.Long.valueOf(((java.lang.Long) com.mypinpad.tsdk.isolation.setInputExtras.setDividerPadding(new java.lang.Object[]{r1}, -879493274, 879493283, (int) java.lang.System.currentTimeMillis())).longValue());
        r2 = com.mypinpad.tsdk.isolation.hs.f56235l;
        r3 = (r2 & 81) + (r2 | 81);
        com.mypinpad.tsdk.isolation.hs.m = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0159, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x015b, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.hs.m;
        r2 = r1 & 117;
        r2 = (r2 - (~(-(-((r1 ^ 117) | r2))))) - 1;
        com.mypinpad.tsdk.isolation.hs.f56235l = r2 % 128;
        r2 = r2 % 2;
        r1 = (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -1152230407, 1152230575, (int) java.lang.System.currentTimeMillis());
        r1 = ((com.mypinpad.tsdk.isolation.setFindListener) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r1}, -570885530, 570885532, java.lang.System.identityHashCode(r1))).setOnFocusChangeListener();
        r0 = ((java.lang.Long) com.mypinpad.tsdk.isolation.setInputExtras.setDividerPadding(new java.lang.Object[]{(byte[]) com.mypinpad.tsdk.isolation.setInputExtras.setDividerPadding(new java.lang.Object[]{"", java.lang.Integer.valueOf(r1)}, -689525923, 689525942, r1)}, -879493274, 879493283, (int) java.lang.System.currentTimeMillis())).longValue();
        r2 = com.mypinpad.tsdk.isolation.hs.m;
        r3 = (((r2 | 82) << 1) - (r2 ^ 82)) - 1;
        com.mypinpad.tsdk.isolation.hs.f56235l = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01cc, code lost:
    
        if ((r3 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01d2, code lost:
    
        return java.lang.Long.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01d3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01d4, code lost:
    
        r0 = r1.longValue();
        r2 = com.mypinpad.tsdk.isolation.hs.f56235l;
        r3 = (((r2 ^ 109) | (r2 & 109)) << 1) - (((~r2) & 109) | (r2 & (-110)));
        com.mypinpad.tsdk.isolation.hs.m = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ed, code lost:
    
        if ((r3 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f3, code lost:
    
        return java.lang.Long.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01f4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0091, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.hd.setY(new java.lang.Object[]{r2}, 701423058, -701423056, java.lang.System.identityHashCode(r2))).booleanValue() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Long f(java.lang.Object[] r17) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.hs.f(java.lang.Object[]):java.lang.Long");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00ee  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ fk g(Object[] objArr) {
        hs hsVar = (hs) objArr[0];
        gv gvVar = (gv) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        gz gzVar = (gz) objArr[3];
        getValue getvalue = (getValue) objArr[4];
        io ioVar = (io) objArr[5];
        setAnimation setanimation = setAnimation.INSTANCE;
        byte[] bArr = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar));
        setFocusable setfocusable = new setFocusable(bArr.length);
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus((byte[]) setFocusable.setOnFocusChangeListener(new Object[]{setfocusable}, 1803955216, -1803955212, System.identityHashCode(setfocusable)), bArr);
        ah ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar}, 1437547358, -1437547304, System.identityHashCode(gvVar));
        if (ahVar != null) {
            int i10 = f56235l;
            int i11 = i10 & 25;
            int i12 = (i10 ^ 25) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            m = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1115257939, -1115257923, System.identityHashCode(ahVar));
            if (setimagetintlist != null) {
                int i14 = m;
                int i15 = i14 & 31;
                int i16 = (i15 - (~(-(-((i14 ^ 31) | i15))))) - 1;
                f56235l = i16 % 128;
                if (i16 % 2 != 0) {
                    ((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{setimagetintlist, bArrPlus}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                ((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{setimagetintlist, bArrPlus}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue();
            }
        }
        gv.setOnFocusChangeListener(new Object[]{gvVar, Long.valueOf(((Long) setDividerPadding(new Object[]{gvVar}, 720517235, -720517231, (int) System.currentTimeMillis())).longValue())}, 1340203425, -1340203407, System.identityHashCode(gvVar));
        hb hbVar = new hb(gvVar);
        aq aqVar = new aq(gvVar);
        hd hdVar = (hd) ((setImageTintList) w.setX(new Object[]{hbVar}, 1693919772, -1693919769, System.identityHashCode(hbVar)));
        if (((Boolean) hd.setY(new Object[]{hdVar}, 1474832131, -1474832130, System.identityHashCode(hdVar))).booleanValue()) {
            int i17 = f56235l;
            int i18 = i17 & 53;
            int i19 = ((i17 | 53) & (~i18)) + (i18 << 1);
            m = i19 % 128;
            if (i19 % 2 == 0) {
                am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
                ((Boolean) am.setY(new Object[]{amVar}, 1965114111, -1965114106, System.identityHashCode(amVar))).booleanValue();
                throw null;
            }
            am amVar2 = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
            if (((Boolean) am.setY(new Object[]{amVar2}, 1965114111, -1965114106, System.identityHashCode(amVar2))).booleanValue()) {
                setImeActionLabel setimeactionlabel = (setImeActionLabel) setDividerPadding(new Object[]{hsVar, gvVar}, 986403501, -986403498, System.identityHashCode(hsVar));
                ig.setCompoundDrawableTintBlendMode(new Object[]{ioVar}, -1285585610, 1285585610, System.identityHashCode(ioVar));
                getvalue.setOnFocusChangeListener(setimeactionlabel);
                fk fkVar = fk.getNavBarTitleString;
                int i20 = f56235l;
                int i21 = i20 ^ 51;
                int i22 = (i20 & 51) << 1;
                int i23 = (i21 & i22) + (i22 | i21);
                m = i23 % 128;
                if (i23 % 2 != 0) {
                    return fkVar;
                }
                throw null;
            }
        }
        cz czVar = new cz(gvVar);
        hr hrVar = new hr((ex) hsVar.setX());
        fk fkVar2 = (fk) hr.setOnFocusChangeListener(new Object[]{hrVar, gvVar, settextkeepstate, gzVar, getvalue}, -1673391252, 1673391253, System.identityHashCode(hrVar));
        int i24 = m;
        int i25 = i24 & 39;
        int i26 = ((i24 | 39) & (~i25)) + (i25 << 1);
        f56235l = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 36 / 0;
        }
        return fkVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        boolean z10;
        setContentCaptureSession setcontentcapturesession;
        int i13;
        ex exVar;
        gv gvVar;
        setTextKeepState compoundDrawableTintBlendMode;
        fd fdVar;
        getY gety;
        setItemChecked setitemchecked;
        setContentCaptureSession setcontentcapturesession2;
        setDrawSelectorOnTop setdrawselectorontop;
        Byte b10;
        boolean z11;
        int i14;
        activateSession activatesession;
        activateSession activatesession2;
        ValueQualifier valueQualifier;
        byte[] bArr;
        fd fdVar2;
        getY gety2;
        Boolean bool;
        setItemChecked setitemchecked2;
        byte[] bArr2;
        setDrawSelectorOnTop setdrawselectorontop2;
        setSelector setselector;
        byte[] bArr3;
        byte[] bArr4;
        Byte b11;
        setTransitionVisibility settransitionvisibility;
        boolean z12;
        boolean z13;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = i15 | i16;
        int i18 = ~(i17 | i12);
        int i19 = ~i12;
        switch ((((~(i10 | i16 | i12)) | (~(i11 | i15 | i12)) | (~(i17 | i19))) * 920) + (((~i17) | (~(i15 | i19))) * 920) + ((i18 | (~(i16 | i19 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919))) {
            case 1:
                setRotationX setrotationx = (setRotationX) objArr[0];
                gv gvVar2 = (gv) objArr[1];
                int i20 = m;
                int i21 = i20 ^ 115;
                int i22 = ((i20 & 115) | i21) << 1;
                int i23 = -i21;
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                f56235l = i24 % 128;
                int i25 = i24 % 2;
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                Pair pair = (Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))}, 2119034130, -2119034129, (int) System.currentTimeMillis());
                if (((Number) pair.getSecond()).intValue() != ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length) {
                    int i26 = m;
                    int i27 = (((i26 & (-22)) | ((~i26) & 21)) - (~((i26 & 21) << 1))) - 1;
                    f56235l = i27 % 128;
                    int i28 = i27 % 2;
                    setcontentcapturesession = setContentCaptureSession.setNavigationOnClickListener;
                    int i29 = f56235l;
                    int i30 = ((i29 ^ 3) | (i29 & 3)) << 1;
                    int i31 = -(((~i29) & 3) | (i29 & (-4)));
                    i13 = (i30 ^ i31) + ((i31 & i30) << 1);
                } else {
                    if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length == 0) {
                        int i32 = f56235l;
                        int i33 = i32 ^ 45;
                        int i34 = (i32 & 45) << 1;
                        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                        m = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = ((((i32 ^ 67) | (i32 & 67)) << 1) - (~(-((i32 & (-68)) | ((~i32) & 67))))) - 1;
                        m = i37 % 128;
                        int i38 = i37 % 2;
                        int i39 = i32 & 77;
                        int i40 = (((i32 | 77) & (~i39)) - (~(i39 << 1))) - 1;
                        m = i40 % 128;
                        int i41 = i40 % 2;
                        z10 = false;
                    } else {
                        int i42 = m;
                        int i43 = i42 ^ 49;
                        int i44 = ((i42 & 49) | i43) << 1;
                        int i45 = -i43;
                        int i46 = (i44 & i45) + (i44 | i45);
                        int i47 = i46 % 128;
                        f56235l = i47;
                        int i48 = i46 % 2;
                        int i49 = i47 + 85;
                        int i50 = i49 % 128;
                        m = i50;
                        int i51 = i49 % 2;
                        int i52 = ((i50 & (-56)) | ((~i50) & 55)) + ((i50 & 55) << 1);
                        f56235l = i52 % 128;
                        int i53 = i52 % 2;
                        z10 = true;
                    }
                    if (!(!z10)) {
                        int i54 = m + 57;
                        f56235l = i54 % 128;
                        if (i54 % 2 == 0 ? ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))[0] == 119 : ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))[1] == 23) {
                            int i55 = f56235l;
                            int i56 = (i55 & (-24)) | ((~i55) & 23);
                            int i57 = -(-((i55 & 23) << 1));
                            int i58 = (i56 & i57) + (i57 | i56);
                            m = i58 % 128;
                            int i59 = i58 % 2;
                            setcontentcapturesession = (setContentCaptureSession) setDividerPadding(new Object[]{setrotationx, gvVar2}, 350807915, -350807904, (int) System.currentTimeMillis());
                            int i60 = m;
                            int i61 = i60 & 5;
                            int i62 = (5 ^ i60) | i61;
                            i13 = (i61 ^ i62) + ((i62 & i61) << 1);
                            f56235l = i13 % 128;
                        }
                        int i63 = i13 % 2;
                        return setcontentcapturesession;
                    }
                    setcontentcapturesession = (setContentCaptureSession) setDividerPadding(new Object[]{setrotationx, pair, gvVar2}, -141080200, 141080207, (int) System.currentTimeMillis());
                    int i64 = f56235l;
                    i13 = ((i64 | 85) << 1) - (i64 ^ 85);
                }
                m = i13 % 128;
                int i65 = i13 % 2;
                return setcontentcapturesession;
            case 2:
                return c(objArr);
            case 3:
                hs hsVar = (hs) objArr[0];
                gv gvVar3 = (gv) objArr[1];
                int i66 = f56235l + 7;
                m = i66 % 128;
                int i67 = i66 % 2;
                setAnimation setanimation = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar3));
                if (getbeeponfailure != null) {
                    int i68 = f56235l;
                    int i69 = ((i68 ^ 73) - (~(-(-((i68 & 73) << 1))))) - 1;
                    m = i69 % 128;
                    int i70 = i69 % 2;
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (byte[]) component17.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{hsVar.f56236i}, -811017857, 811017857, (int) System.currentTimeMillis())}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure));
                    int i71 = f56235l;
                    int i72 = ((i71 & (-56)) | ((~i71) & 55)) + ((i71 & 55) << 1);
                    m = i72 % 128;
                    int i73 = i72 % 2;
                }
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, (TransactionFailed) setAnimation.setY(new Object[0], -1184491080, 1184491325, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar3));
                if (getbeeponfailure2 == null) {
                    int i74 = f56235l;
                    int i75 = (i74 & (-104)) | ((~i74) & 103);
                    int i76 = -(-((i74 & 103) << 1));
                    int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                    m = i77 % 128;
                    int i78 = i77 % 2;
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                    TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1184491080, 1184491325, (int) System.currentTimeMillis());
                    getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, getbeeponfailure2}, 2008358388, -2008358355, System.identityHashCode(gvVar3));
                    int i79 = m;
                    int i80 = (((i79 & (-30)) | ((~i79) & 29)) - (~(-(-((i79 & 29) << 1))))) - 1;
                    f56235l = i80 % 128;
                    int i81 = i80 % 2;
                }
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar3))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure2));
                setHasTransientState sethastransientstate = new setHasTransientState(getbeeponfailure2.setOnFocusChangeListener());
                int i82 = m;
                int i83 = i82 & 117;
                int i84 = ((i82 ^ 117) | i83) << 1;
                int i85 = -((i82 | 117) & (~i83));
                int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                f56235l = i86 % 128;
                int i87 = i86 % 2;
                return sethastransientstate;
            case 4:
                return f(objArr);
            case 5:
                hs hsVar2 = (hs) objArr[0];
                int iIdentityHashCode = System.identityHashCode(hsVar2);
                int i88 = ~iIdentityHashCode;
                int i89 = ~(((-780659254) & i88) | (780659253 & iIdentityHashCode) | ((-780659254) & iIdentityHashCode));
                int i90 = ((~i89) & 134228533) | ((-134228534) & i89);
                int i91 = i89 & 134228533;
                int i92 = -(-(((i91 & i90) | (i90 ^ i91)) * 576));
                int i93 = 2052841588 ^ i92;
                int i94 = (i92 & 2052841588) << 1;
                int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                int i96 = (iIdentityHashCode | i88) & i88;
                int i97 = (-780659254) ^ i96;
                int i98 = i96 & (-780659254);
                int i99 = (i98 & i97) | (i97 ^ i98);
                int i100 = -(~(-(-(((~((i99 & 1479031615) | (i99 ^ 1479031615))) | 1344803082) * 576))));
                int i101 = (-2) - (((i95 & i100) + (i100 | i95)) ^ (-1));
                int i102 = i101 & 6223680;
                int i103 = (((i101 ^ 6223680) | i102) << 1) - ((i101 | 6223680) & (~i102));
                int iIdentityHashCode2 = System.identityHashCode(hsVar2);
                int i104 = ~iIdentityHashCode2;
                int i105 = (-5378050) & i104;
                int i106 = (5378049 & iIdentityHashCode2) | i105;
                int i107 = iIdentityHashCode2 & (-5378050);
                int i108 = (i107 & i106) | (i106 ^ i107);
                int i109 = ~i108;
                int i110 = (i108 | i109) & i109;
                int i111 = -(-(((i110 & 92660234) | (92660234 ^ i110)) * (-756)));
                int i112 = 1189780856 & i111;
                int i113 = i112 + ((i111 ^ 1189780856) | i112);
                int i114 = -(~((((-5378050) ^ i104) | i105) * 756));
                int i115 = ((i113 ^ i114) + ((i114 & i113) << 1)) - 1;
                O x4 = hsVar2.setX();
                if (i103 > i115) {
                    exVar = (ex) x4;
                    gvVar = (gv) hsVar2.setOnFocusChangeListener();
                    compoundDrawableTintBlendMode = hsVar2.setCompoundDrawableTintBlendMode();
                    fdVar = fd.END_APPLICATION;
                    gety = null;
                    setitemchecked = null;
                    setcontentcapturesession2 = null;
                    setdrawselectorontop = setDrawSelectorOnTop.setOnFocusChangeListener;
                    b10 = null;
                    z11 = false;
                    i14 = 24347;
                } else {
                    exVar = (ex) x4;
                    gvVar = (gv) hsVar2.setOnFocusChangeListener();
                    compoundDrawableTintBlendMode = hsVar2.setCompoundDrawableTintBlendMode();
                    fdVar = fd.END_APPLICATION;
                    gety = null;
                    setitemchecked = null;
                    setcontentcapturesession2 = null;
                    setdrawselectorontop = setDrawSelectorOnTop.setOnFocusChangeListener;
                    b10 = null;
                    z11 = false;
                    i14 = 184;
                }
                return ex.setCompoundDrawableTintBlendMode(exVar, gvVar, compoundDrawableTintBlendMode, fdVar, gety, setitemchecked, setcontentcapturesession2, setdrawselectorontop, b10, z11, i14);
            case 6:
                hs hsVar3 = (hs) objArr[0];
                setRotationX setrotationx2 = (setRotationX) objArr[1];
                int i116 = m;
                int i117 = (i116 | 63) << 1;
                int i118 = -(((~i116) & 63) | (i116 & (-64)));
                int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                f56235l = i119 % 128;
                int i120 = i119 % 2;
                Intrinsics.checkNotNullParameter(setrotationx2, "");
                fk compoundDrawableTintBlendMode2 = ex.setCompoundDrawableTintBlendMode((ex) hsVar3.setX(), (gv) hsVar3.setOnFocusChangeListener(), hsVar3.setCompoundDrawableTintBlendMode(), fd.TRY_AGAIN, getY.setOnFocusChangeListener, (setItemChecked) setRotationX.setX(new Object[]{setrotationx2}, 2020716727, -2020716721, System.identityHashCode(setrotationx2)), null, null, null, false, 224);
                int i121 = m;
                int i122 = i121 & 55;
                int i123 = (i121 | 55) & (~i122);
                int i124 = -(-(i122 << 1));
                int i125 = (i123 ^ i124) + ((i123 & i124) << 1);
                f56235l = i125 % 128;
                int i126 = i125 % 2;
                return compoundDrawableTintBlendMode2;
            case 7:
                return e(objArr);
            case 8:
                return b(objArr);
            case 9:
                hs hsVar4 = (hs) objArr[0];
                gv gvVar4 = (gv) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                setContentCaptureSession setcontentcapturesession3 = (setContentCaptureSession) objArr[3];
                int i127 = m;
                int i128 = ((i127 | 15) << 1) - (i127 ^ 15);
                f56235l = i128 % 128;
                int i129 = i128 % 2;
                ex exVar2 = (ex) hsVar4.setX();
                if (i129 != 0) {
                    activatesession = activateSession.ERROR_OTHER_CARD;
                    activatesession2 = activatesession;
                    valueQualifier = ValueQualifier.setY;
                    bArr = null;
                    fdVar2 = fd.END_APPLICATION;
                    gety2 = null;
                    bool = Boolean.TRUE;
                    setitemchecked2 = null;
                    bArr2 = null;
                    setdrawselectorontop2 = null;
                    setselector = null;
                    bArr3 = null;
                    bArr4 = null;
                    b11 = null;
                    settransitionvisibility = null;
                    z12 = true;
                    z13 = true;
                } else {
                    activatesession = activateSession.ERROR_OTHER_CARD;
                    activatesession2 = activatesession;
                    valueQualifier = ValueQualifier.setY;
                    bArr = null;
                    fdVar2 = fd.END_APPLICATION;
                    gety2 = null;
                    bool = Boolean.TRUE;
                    setitemchecked2 = null;
                    bArr2 = null;
                    setdrawselectorontop2 = null;
                    setselector = null;
                    bArr3 = null;
                    bArr4 = null;
                    b11 = null;
                    settransitionvisibility = null;
                    z12 = false;
                    z13 = false;
                }
                return ex.setDividerPadding(exVar2, gvVar4, settextkeepstate, activatesession2, valueQualifier, bArr, fdVar2, gety2, bool, activatesession, setitemchecked2, bArr2, setcontentcapturesession3, setdrawselectorontop2, setselector, bArr3, bArr4, b11, settransitionvisibility, z12, z13, 4191824);
            case 10:
                return a(objArr);
            case 11:
                return d(objArr);
            default:
                return g(objArr);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull a aVar) {
        return (fk) setDividerPadding(new Object[]{this, aVar}, -1429507782, 1429507790, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setDividerPadding(new Object[]{this}, -1502562037, 1502562042, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setX(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -1012476019, 1012476025, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -1481268846, 1481268848, System.identityHashCode(this));
    }
}
