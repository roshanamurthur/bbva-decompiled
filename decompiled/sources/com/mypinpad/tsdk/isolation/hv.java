package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class hv extends hi {
    public static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f56249n = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final getValue f56250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final gz f56251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final io f56252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final et f56253l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull gz gzVar, @NotNull io ioVar, @NotNull et etVar) {
        super(gvVar, settextkeepstate, exVar, getvalue);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(ioVar, "");
        Intrinsics.checkNotNullParameter(etVar, "");
        this.f56250i = getvalue;
        this.f56251j = gzVar;
        this.f56252k = ioVar;
        this.f56253l = etVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0302  */
    /* JADX WARN: Code duplicated, block: B:26:0x0331  */
    /* JADX WARN: Code duplicated, block: B:28:0x034d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0378  */
    /* JADX WARN: Code duplicated, block: B:33:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x0437  */
    /* JADX WARN: Code duplicated, block: B:38:0x0451  */
    /* JADX WARN: Code duplicated, block: B:40:0x047a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0495  */
    /* JADX WARN: Code duplicated, block: B:44:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x0529  */
    /* JADX WARN: Code duplicated, block: B:49:0x0550  */
    /* JADX WARN: Code duplicated, block: B:52:0x0555  */
    /* JADX WARN: Code duplicated, block: B:55:0x062e  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        String str;
        String str2;
        getValue getvalue;
        ah ahVar;
        int i13;
        getBeepOnFailure getbeeponfailure;
        Object onFocusChangeListener;
        int i14;
        int i15;
        int i16;
        setScrollContainer setscrollcontainer;
        int i17 = ~i11;
        int i18 = ~i12;
        int i19 = (((~(i10 | i18 | i11)) | (~(i12 | i17)) | (~((~i10) | i17))) * 988) + ((i10 | i17) * (-988)) + (((~(i17 | i18 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989);
        if (i19 != 1) {
            if (i19 == 2) {
                hv hvVar = (hv) objArr[0];
                setRotationX setrotationx = (setRotationX) objArr[1];
                int i20 = ((-1) << 1) - ((f56249n + 46) ^ (-1));
                m = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(setrotationx, "");
                et etVar = hvVar.f56253l;
                et.setDividerPadding(new Object[]{hvVar.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
                ex x4 = hvVar.setX();
                gv onFocusChangeListener2 = hvVar.setOnFocusChangeListener();
                setTextKeepState compoundDrawableTintBlendMode = hvVar.setCompoundDrawableTintBlendMode();
                activateSession activatesession = activateSession.PRESENT_CARD_AGAIN;
                ValueQualifier valueQualifier = ValueQualifier.setOnFocusChangeListener;
                byte[] bArr = new byte[3];
                int i22 = f56249n;
                int i23 = (i22 & 7) + (i22 | 7);
                m = i23 % 128;
                int i24 = i23 % 2;
                int i25 = 0;
                while (i25 < 3) {
                    int i26 = f56249n;
                    int i27 = ((i26 | 79) << 1) - (i26 ^ 79);
                    int i28 = i27 % 128;
                    m = i28;
                    int i29 = i27 % 2;
                    bArr[i25] = 0;
                    i25++;
                    int i30 = i28 + 87;
                    f56249n = i30 % 128;
                    int i31 = i30 % 2;
                }
                fk dividerPadding = ex.setDividerPadding(x4, onFocusChangeListener2, compoundDrawableTintBlendMode, activatesession, valueQualifier, bArr, fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.FALSE, activateSession.PRESENT_CARD_AGAIN, (setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx)), null, null, null, null, null, null, null, null, false, false, 4193280);
                int i32 = f56249n;
                int i33 = (i32 & 105) + (i32 | 105);
                m = i33 % 128;
                int i34 = i33 % 2;
                return dividerPadding;
            }
            if (i19 == 3) {
                hv hvVar2 = (hv) objArr[0];
                int i35 = m;
                int i36 = i35 & 25;
                int i37 = i35 | 25;
                int i38 = (i36 & i37) + (i37 | i36);
                f56249n = i38 % 128;
                int i39 = i38 % 2;
                et etVar2 = hvVar2.f56253l;
                et.setDividerPadding(new Object[]{hvVar2.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
                fk compoundDrawableTintBlendMode2 = ex.setCompoundDrawableTintBlendMode(hvVar2.setX(), hvVar2.setOnFocusChangeListener(), hvVar2.setCompoundDrawableTintBlendMode(), fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setOnFocusChangeListener, null, false, 184);
                int i40 = f56249n;
                int i41 = ((i40 ^ 39) | (i40 & 39)) << 1;
                int i42 = -(((~i40) & 39) | (i40 & (-40)));
                int i43 = (i41 & i42) + (i42 | i41);
                m = i43 % 128;
                int i44 = i43 % 2;
                return compoundDrawableTintBlendMode2;
            }
            hv hvVar3 = (hv) objArr[0];
            a aVar = (a) objArr[1];
            int i45 = m;
            int i46 = (i45 & 41) + (i45 | 41);
            f56249n = i46 % 128;
            int i47 = i46 % 2;
            Intrinsics.checkNotNullParameter(aVar, "");
            gv onFocusChangeListener3 = hvVar3.setOnFocusChangeListener();
            gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener3, (Integer) a.setX(new Object[]{aVar}, -114513983, 114513983, System.identityHashCode(aVar)), (Integer) a.setX(new Object[]{aVar}, 156913967, -156913963, System.identityHashCode(aVar)), (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))}, -1273972116, 1273972121, System.identityHashCode(onFocusChangeListener3));
            fk fkVar = fk.setNavigationOnClickListener;
            int i48 = m;
            int i49 = (i48 & (-94)) | ((~i48) & 93);
            int i50 = (i48 & 93) << 1;
            int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
            f56249n = i51 % 128;
            if (i51 % 2 != 0) {
                return fkVar;
            }
            int i52 = 45 / 0;
            return fkVar;
        }
        hv hvVar4 = (hv) objArr[0];
        setRotationX setrotationx2 = (setRotationX) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i53 = m;
        int i54 = i53 ^ 43;
        int i55 = ((((i53 & 43) | i54) << 1) - (~(-i54))) - 1;
        f56249n = i55 % 128;
        int i56 = i55 % 2;
        gv onFocusChangeListener4 = hvVar4.setOnFocusChangeListener();
        String str3 = (String) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, -1126898243, 1126898267, System.identityHashCode(onFocusChangeListener4));
        gv onFocusChangeListener5 = hvVar4.setOnFocusChangeListener();
        setMaxWidth setmaxwidth = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener5}, -836208544, 836208569, System.identityHashCode(onFocusChangeListener5));
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth}, -852037600, 852037625, System.identityHashCode(setmaxwidth));
        gv onFocusChangeListener6 = hvVar4.setOnFocusChangeListener();
        if (getbeeponfailure2 != null) {
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
            if (setscrollcontainer2 == null) {
                int i57 = f56249n;
                int i58 = i57 ^ 85;
                int i59 = ((i57 & 85) | i58) << 1;
                int i60 = -i58;
                int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                m = i61 % 128;
                int i62 = i61 % 2;
                System.identityHashCode(hvVar4);
                System.identityHashCode(hvVar4);
            } else {
                str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                int i63 = f56249n;
                int i64 = ((((i63 ^ 65) | (i63 & 65)) << 1) - (~(-((i63 & (-66)) | (65 & (~i63)))))) - 1;
                m = i64 % 128;
                int i65 = i64 % 2;
            }
            gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener6, str}, -64680794, 64680813, System.identityHashCode(onFocusChangeListener6));
            gv onFocusChangeListener7 = hvVar4.setOnFocusChangeListener();
            str2 = (String) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener7}, -1126898243, 1126898267, System.identityHashCode(onFocusChangeListener7));
            getvalue = hvVar4.f56250i;
            if (str2 != null) {
                getvalue.setOnFocusChangeListener(new setDrawingCacheQuality(setInputExtras.setOnFocusChangeListener(str2, 2)));
                gv onFocusChangeListener8 = hvVar4.setOnFocusChangeListener();
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8, setSupportBackgroundTintMode.setY}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener8));
                int i66 = m;
                int i67 = (i66 & 59) + (i66 | 59);
                f56249n = i67 % 128;
                int i68 = i67 % 2;
            } else {
                gv onFocusChangeListener9 = hvVar4.setOnFocusChangeListener();
                ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener9));
                if (ahVar != null) {
                    int i69 = m + 41;
                    f56249n = i69 % 128;
                    int i70 = i69 % 2;
                    if (((an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)))).setNavigationOnClickListener().isEmpty()) {
                        gv onFocusChangeListener10 = hvVar4.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener10));
                        int i71 = m;
                        i13 = (-2) - (((i71 ^ 60) + ((i71 & 60) << 1)) ^ (-1));
                        f56249n = i13 % 128;
                    } else {
                        av avVar = ahVar.setAlwaysDrawnWithCacheEnabled().setNavigationOnClickListener().get(0);
                        byte bByteValue = ((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue();
                        av avVar2 = ahVar.setAlwaysDrawnWithCacheEnabled().setNavigationOnClickListener().get(0);
                        getvalue.setOnFocusChangeListener(new setText(bByteValue, ((Byte) av.setY(new Object[]{avVar2}, 1262930435, -1262930433, System.identityHashCode(avVar2))).byteValue()));
                        gv onFocusChangeListener11 = hvVar4.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener11, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener11));
                        int i72 = f56249n;
                        int i73 = i72 ^ 27;
                        i13 = ((((i72 & 27) | i73) << 1) - (~(-i73))) - 1;
                        m = i13 % 128;
                    }
                } else {
                    gv onFocusChangeListener12 = hvVar4.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener12, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener12));
                    int i74 = m;
                    i13 = (-2) - (((i74 ^ 60) + ((i74 & 60) << 1)) ^ (-1));
                    f56249n = i13 % 128;
                }
                int i75 = i13 % 2;
            }
            if (((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
                int i76 = m;
                i15 = (i76 & 49) + (i76 | 49);
                f56249n = i15 % 128;
                if (i15 % 2 != 0) {
                    ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{hvVar4.setOnFocusChangeListener(), (byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2))}, 300574997, -300574952, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{hvVar4.setOnFocusChangeListener(), (byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2))}, 300574997, -300574952, (int) System.currentTimeMillis())).booleanValue()) {
                    int i77 = f56249n;
                    int i78 = i77 & 119;
                    int i79 = -(-((i77 ^ 119) | i78));
                    i16 = (i78 ^ i79) + ((i79 & i78) << 1);
                    m = i16 % 128;
                    if (i16 % 2 == 0) {
                        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                        setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                        Intrinsics.areEqual(str3, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)));
                        throw null;
                    }
                    getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                    setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 865402441, -865402437, System.identityHashCode(getbeeponfailure4));
                    if (Intrinsics.areEqual(str3, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                        getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                        int i80 = f56249n;
                        int i81 = i80 & 115;
                        int i82 = i80 | 115;
                        int i83 = (i81 & i82) + (i82 | i81);
                        m = i83 % 128;
                        int i84 = i83 % 2;
                    } else {
                        getbeeponfailure = null;
                    }
                } else {
                    getbeeponfailure = null;
                }
            } else {
                getbeeponfailure = null;
            }
            if (getbeeponfailure == null) {
                int i85 = m;
                int i86 = i85 & 79;
                int i87 = i85 | 79;
                int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                f56249n = i88 % 128;
                int i89 = i88 % 2;
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str3, null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                int i90 = f56249n;
                int i91 = i90 ^ 5;
                int i92 = ((i90 & 5) | i91) << 1;
                int i93 = -i91;
                int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                m = i94 % 128;
                int i95 = i94 % 2;
            }
            gv onFocusChangeListener13 = hvVar4.setOnFocusChangeListener();
            setAnimation setanimation = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener13, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener13));
            Intrinsics.checkNotNull(getbeeponfailure5);
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, getbeeponfailure}, 1215253814, -1215253809, System.identityHashCode(getbeeponfailure5));
            hw hwVar = new hw(hvVar4.setX(), hvVar4.f56253l);
            onFocusChangeListener = hw.setOnFocusChangeListener(new Object[]{hwVar, hvVar4.setOnFocusChangeListener(), hvVar4.setCompoundDrawableTintBlendMode(), hvVar4.f56251j, getvalue, hvVar4.f56252k, continuation}, -2058538250, 2058538250, System.identityHashCode(hwVar));
            int i96 = f56249n;
            i14 = (i96 ^ 35) + ((i96 & 35) << 1);
            m = i14 % 128;
            if (i14 % 2 != 0) {
                return onFocusChangeListener;
            }
            int i97 = 28 / 0;
            return onFocusChangeListener;
        }
        int i98 = m;
        int i99 = ((i98 ^ 108) + ((i98 & 108) << 1)) - 1;
        int i100 = i99 % 128;
        f56249n = i100;
        int i101 = i99 % 2;
        int i102 = i100 + 37;
        m = i102 % 128;
        int i103 = i102 % 2;
        str = null;
        gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener6, str}, -64680794, 64680813, System.identityHashCode(onFocusChangeListener6));
        gv onFocusChangeListener14 = hvVar4.setOnFocusChangeListener();
        str2 = (String) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener14}, -1126898243, 1126898267, System.identityHashCode(onFocusChangeListener14));
        getvalue = hvVar4.f56250i;
        if (str2 != null) {
            getvalue.setOnFocusChangeListener(new setDrawingCacheQuality(setInputExtras.setOnFocusChangeListener(str2, 2)));
            gv onFocusChangeListener15 = hvVar4.setOnFocusChangeListener();
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener15, setSupportBackgroundTintMode.setY}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener15));
            int i610 = m;
            int i611 = (i610 & 59) + (i610 | 59);
            f56249n = i611 % 128;
            int i612 = i611 % 2;
        } else {
            gv onFocusChangeListener16 = hvVar4.setOnFocusChangeListener();
            ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener16}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener16));
            if (ahVar != null) {
                int i613 = m + 41;
                f56249n = i613 % 128;
                int i710 = i613 % 2;
                if (((an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)))).setNavigationOnClickListener().isEmpty()) {
                    gv onFocusChangeListener17 = hvVar4.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener17, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener17));
                    int i711 = m;
                    i13 = (-2) - (((i711 ^ 60) + ((i711 & 60) << 1)) ^ (-1));
                    f56249n = i13 % 128;
                } else {
                    av avVar3 = ahVar.setAlwaysDrawnWithCacheEnabled().setNavigationOnClickListener().get(0);
                    byte bByteValue2 = ((Byte) av.setY(new Object[]{avVar3}, -888174800, 888174800, System.identityHashCode(avVar3))).byteValue();
                    av avVar4 = ahVar.setAlwaysDrawnWithCacheEnabled().setNavigationOnClickListener().get(0);
                    getvalue.setOnFocusChangeListener(new setText(bByteValue2, ((Byte) av.setY(new Object[]{avVar4}, 1262930435, -1262930433, System.identityHashCode(avVar4))).byteValue()));
                    gv onFocusChangeListener18 = hvVar4.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener18, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener18));
                    int i712 = f56249n;
                    int i713 = i712 ^ 27;
                    i13 = ((((i712 & 27) | i713) << 1) - (~(-i713))) - 1;
                    m = i13 % 128;
                }
            } else {
                gv onFocusChangeListener19 = hvVar4.setOnFocusChangeListener();
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener19, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener19));
                int i714 = m;
                i13 = (-2) - (((i714 ^ 60) + ((i714 & 60) << 1)) ^ (-1));
                f56249n = i13 % 128;
            }
            int i715 = i13 % 2;
        }
        if (((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
            int i716 = m;
            i15 = (i716 & 49) + (i716 | 49);
            f56249n = i15 % 128;
            if (i15 % 2 != 0) {
                ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{hvVar4.setOnFocusChangeListener(), (byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2))}, 300574997, -300574952, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{hvVar4.setOnFocusChangeListener(), (byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2))}, 300574997, -300574952, (int) System.currentTimeMillis())).booleanValue()) {
                int i717 = f56249n;
                int i718 = i717 & 119;
                int i719 = -(-((i717 ^ 119) | i718));
                i16 = (i718 ^ i719) + ((i719 & i718) << 1);
                m = i16 % 128;
                if (i16 % 2 == 0) {
                    getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 865402441, -865402437, System.identityHashCode(getbeeponfailure6));
                    Intrinsics.areEqual(str3, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)));
                    throw null;
                }
                getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure7}, 865402441, -865402437, System.identityHashCode(getbeeponfailure7));
                if (Intrinsics.areEqual(str3, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                    getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                    int i810 = f56249n;
                    int i811 = i810 & 115;
                    int i812 = i810 | 115;
                    int i813 = (i811 & i812) + (i812 | i811);
                    m = i813 % 128;
                    int i814 = i813 % 2;
                } else {
                    getbeeponfailure = null;
                }
            } else {
                getbeeponfailure = null;
            }
        } else {
            getbeeponfailure = null;
        }
        if (getbeeponfailure == null) {
            int i815 = m;
            int i816 = i815 & 79;
            int i817 = i815 | 79;
            int i818 = (i816 ^ i817) + ((i817 & i816) << 1);
            f56249n = i818 % 128;
            int i819 = i818 % 2;
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
            getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str3, null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
            int i910 = f56249n;
            int i911 = i910 ^ 5;
            int i912 = ((i910 & 5) | i911) << 1;
            int i913 = -i911;
            int i914 = (i912 ^ i913) + ((i912 & i913) << 1);
            m = i914 % 128;
            int i915 = i914 % 2;
        }
        gv onFocusChangeListener110 = hvVar4.setOnFocusChangeListener();
        setAnimation setanimation2 = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure8 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener110, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener110));
        Intrinsics.checkNotNull(getbeeponfailure8);
        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure8, getbeeponfailure}, 1215253814, -1215253809, System.identityHashCode(getbeeponfailure8));
        hw hwVar2 = new hw(hvVar4.setX(), hvVar4.f56253l);
        onFocusChangeListener = hw.setOnFocusChangeListener(new Object[]{hwVar2, hvVar4.setOnFocusChangeListener(), hvVar4.setCompoundDrawableTintBlendMode(), hvVar4.f56251j, getvalue, hvVar4.f56252k, continuation}, -2058538250, 2058538250, System.identityHashCode(hwVar2));
        int i916 = f56249n;
        i14 = (i916 ^ 35) + ((i916 & 35) << 1);
        m = i14 % 128;
        if (i14 % 2 != 0) {
            return onFocusChangeListener;
        }
        int i917 = 28 / 0;
        return onFocusChangeListener;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull a aVar) {
        return (fk) setDividerPadding(new Object[]{this, aVar}, 674618238, -674618238, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setDividerPadding(new Object[]{this}, -291426234, 291426237, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.hi
    @NotNull
    public final fk setOnFocusChangeListener(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -1161981860, 1161981862, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.hi
    @Nullable
    public final Object setY(@NotNull setRotationX setrotationx, @NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, setrotationx, continuation}, 1569030290, -1569030289, System.identityHashCode(this));
    }
}
