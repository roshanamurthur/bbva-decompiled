package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class hp extends hh {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56216i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56217j = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull et etVar) {
        super(gvVar, settextkeepstate, exVar, getvalue);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(etVar, "");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0350  */
    /* JADX WARN: Code duplicated, block: B:31:0x0379 A[LOOP:0: B:30:0x0377->B:31:0x0379, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        byte[] bArr;
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (i15 * 490) + (((~(i10 | i16)) | (~(i16 | i12))) * 490) + ((i15 | i16 | (~i12)) * (-490)) + (i11 * (-489)) + (i10 * 491);
        byte b10 = 0;
        if (i17 == 1) {
            hp hpVar = (hp) objArr[0];
            setRotationX setrotationx = (setRotationX) objArr[1];
            int i18 = f56217j;
            int i19 = i18 & 1;
            int i20 = (((i18 ^ 1) | i19) << 1) - ((i18 | 1) & (~i19));
            f56216i = i20 % 128;
            int i21 = i20 % 2;
            Intrinsics.checkNotNullParameter(setrotationx, "");
            fk fkVar = (fk) setOnFocusChangeListener(new Object[]{hpVar, (gv) hpVar.setOnFocusChangeListener(), hpVar.setCompoundDrawableTintBlendMode()}, 351602412, -351602410, System.identityHashCode(hpVar));
            int i22 = f56217j;
            int i23 = i22 & 113;
            int i24 = -(-((i22 ^ 113) | i23));
            int i25 = (i23 & i24) + (i24 | i23);
            f56216i = i25 % 128;
            int i26 = i25 % 2;
            return fkVar;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                int i27 = f56217j + 113;
                f56216i = i27 % 128;
                int i28 = i27 % 2;
                fk fkVar2 = fk.setLayoutAnimation;
                int i29 = f56216i;
                int i30 = ((i29 | 49) << 1) - (i29 ^ 49);
                f56217j = i30 % 128;
                int i31 = i30 % 2;
                return fkVar2;
            }
            if (i17 == 4) {
                a aVar = (a) objArr[1];
                int i32 = f56217j;
                int i33 = i32 & 123;
                int i34 = i32 | 123;
                int i35 = (i33 & i34) + (i34 | i33);
                f56216i = i35 % 128;
                int i36 = i35 % 2;
                Intrinsics.checkNotNullParameter(aVar, "");
                fk fkVar3 = fk.setLayoutAnimation;
                int i37 = f56217j;
                int i38 = i37 ^ 29;
                int i39 = ((i37 & 29) | i38) << 1;
                int i40 = -i38;
                int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                f56216i = i41 % 128;
                int i42 = i41 % 2;
                return fkVar3;
            }
            hp hpVar2 = (hp) objArr[0];
            setRotationX setrotationx2 = (setRotationX) objArr[1];
            int i43 = f56216i + 49;
            f56217j = i43 % 128;
            if (i43 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setrotationx2, "");
                ((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue();
                throw null;
            }
            Intrinsics.checkNotNullParameter(setrotationx2, "");
            if (((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
                gv gvVar = (gv) hpVar2.setOnFocusChangeListener();
                if (!((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -595845106, 595845122, System.identityHashCode(gvVar))).isEmpty()) {
                    int i44 = f56216i;
                    int i45 = (i44 & 113) + (i44 | 113);
                    int i46 = i45 % 128;
                    f56217j = i46;
                    int i47 = i45 % 2;
                    int i48 = (i46 ^ 51) + ((i46 & 51) << 1);
                    f56216i = i48 % 128;
                    int i49 = i48 % 2;
                    gv gvVar2 = (gv) hpVar2.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailureRemove = ((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -595845106, 595845122, System.identityHashCode(gvVar2))).remove(0);
                    Intrinsics.checkNotNullExpressionValue(getbeeponfailureRemove, "");
                    hpVar2.setY().setOnFocusChangeListener(new getAmountGroupSeparator(getbeeponfailureRemove));
                    fk fkVar4 = fk.setLayoutAnimation;
                    int i50 = f56216i;
                    int i51 = i50 & 81;
                    int i52 = -(-(i50 | 81));
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    f56217j = i53 % 128;
                    int i54 = i53 % 2;
                    return fkVar4;
                }
                int i55 = f56217j;
                int i56 = i55 ^ 23;
                int i57 = (i55 & 23) << 1;
                int i58 = (i56 & i57) + (i57 | i56);
                f56216i = i58 % 128;
                int i59 = i58 % 2;
                gv gvVar3 = (gv) hpVar2.setOnFocusChangeListener();
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, setAnimation.setOnReceiveContentListener()}, -1593889019, 1593889062, System.identityHashCode(gvVar3));
                Intrinsics.checkNotNull(getbeeponfailure);
                byte b11 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0];
                int i60 = (b11 & 127) | ((~b11) & (-128));
                int i61 = b11 & (-128);
                byte b12 = (byte) ((i61 & i60) | (i60 ^ i61));
                gv gvVar4 = (gv) hpVar2.setOnFocusChangeListener();
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar4, setAnimation.setOnReceiveContentListener()}, -1593889019, 1593889062, System.identityHashCode(gvVar4));
                Intrinsics.checkNotNull(getbeeponfailure2);
                ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))[0] = b12;
                int i62 = f56217j;
                int i63 = i62 & 65;
                int i64 = -(-((i62 ^ 65) | i63));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                f56216i = i65 % 128;
                int i66 = i65 % 2;
            }
            fk fkVar5 = (fk) setOnFocusChangeListener(new Object[]{hpVar2, (gv) hpVar2.setOnFocusChangeListener(), hpVar2.setCompoundDrawableTintBlendMode()}, 351602412, -351602410, System.identityHashCode(hpVar2));
            int i67 = f56217j;
            int i68 = i67 & 35;
            int i69 = -(-((i67 ^ 35) | i68));
            int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
            f56216i = i70 % 128;
            if (i70 % 2 == 0) {
                return fkVar5;
            }
            int i71 = 38 / 0;
            return fkVar5;
        }
        hp hpVar3 = (hp) objArr[0];
        gv gvVar5 = (gv) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i72 = f56217j;
        int i73 = (((i72 | 122) << 1) - (i72 ^ 122)) - 1;
        f56216i = i73 % 128;
        int i74 = i73 % 2;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1922367467, -1922367190, (int) System.currentTimeMillis());
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar5, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2064855914, -2064855856, System.identityHashCode(gvVar5))).booleanValue()) {
            int i75 = f56216i + 53;
            f56217j = i75 % 128;
            int i76 = i75 % 2;
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar5, (TransactionFailed) setAnimation.setY(new Object[0], 1922367467, -1922367190, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar5));
            Intrinsics.checkNotNull(getbeeponfailure3);
            if ((((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue() & 783) != 0) {
                ae aeVar = new ae(gvVar5);
                af afVar = (af) ((setImageTintList) w.setX(new Object[]{aeVar}, 1693919772, -1693919769, System.identityHashCode(aeVar)));
                af.setDividerPadding(new Object[]{afVar, ValueQualifier.setCompoundDrawableTintBlendMode}, 1991488095, -1991488092, System.identityHashCode(afVar));
                ex.setCompoundDrawableTintBlendMode(settextkeepstate, aeVar);
                et.setDividerPadding(new Object[]{gvVar5}, 338249870, -338249868, (int) System.currentTimeMillis());
                x xVar = new x(gvVar5);
                int i77 = f56217j;
                int i78 = ((i77 ^ 60) + ((i77 & 60) << 1)) - 1;
                f56216i = i78 % 128;
                int i79 = i78 % 2;
            } else {
                ex exVar = (ex) hpVar3.setX();
                activateSession activatesession = activateSession.CLEAR_DISPLAY;
                ValueQualifier valueQualifier = ValueQualifier.setCompoundDrawableTintBlendMode;
                bArr = new byte[3];
                int i80 = f56217j;
                int i81 = (i80 & (-86)) | ((~i80) & 85);
                int i82 = -(-((i80 & 85) << 1));
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f56216i = i83 % 128;
                int i84 = i83 % 2;
                i13 = 0;
                for (i14 = 3; i13 < i14; i14 = 3) {
                    int i85 = f56216i;
                    int i86 = ((i85 | 107) << 1) - (i85 ^ 107);
                    f56217j = i86 % 128;
                    int i87 = i86 % 2;
                    bArr[i13] = b10;
                    int iIdentityHashCode = System.identityHashCode(hpVar3);
                    int i88 = (i13 * 370) + 370;
                    int i89 = ~i13;
                    int i90 = (i89 & 1) | (i13 & (-2)) | (i13 & 1);
                    int i91 = ~iIdentityHashCode;
                    int i92 = ((~i91) & i90) | ((~i90) & i91);
                    int i93 = i90 & i91;
                    int i94 = -(-(((i92 & i93) | (i92 ^ i93)) * (-369)));
                    int i95 = i88 & i94;
                    int i96 = ((((i88 ^ i94) | i95) << 1) - (~(-((i94 | i88) & (~i95))))) - 1;
                    int i97 = ~iIdentityHashCode;
                    int i98 = ~iIdentityHashCode;
                    int i99 = i97 & (i98 | iIdentityHashCode);
                    int i100 = ((~i99) & (-2)) | (i99 & 1);
                    int i101 = i99 & (-2);
                    int i102 = ~((i100 ^ i101) | (i101 & i100));
                    int i103 = (i96 - (~(-(-(((i102 & i13) | (i13 ^ i102)) * (-369)))))) - 1;
                    int i104 = (~i13) & (i89 | i13);
                    int i105 = i104 & 1;
                    int i106 = (i104 | 1) & (~i105);
                    int i107 = ~((i106 & i105) | (i106 ^ i105));
                    int i108 = ~((iIdentityHashCode & 1) | (i98 & 1) | (iIdentityHashCode & (-2)));
                    int i109 = (i107 & i108) | (i107 ^ i108);
                    int i110 = (-2) & i98;
                    int i111 = i110 | ((i98 | (-2)) & (~i110));
                    int i112 = i111 & i13;
                    int i113 = ((i111 | i13) & (~i112)) | i112;
                    int i114 = (i113 | (~i113)) & (~i113);
                    int i115 = -(~(-(-(((i109 & i114) | (i109 ^ i114)) * 369))));
                    i13 = ((i103 ^ i115) + ((i115 & i103) << 1)) - 1;
                    int i116 = f56216i;
                    int i117 = ((i116 & 11) - (~(-(-(i116 | 11))))) - 1;
                    f56217j = i117 % 128;
                    int i118 = i117 % 2;
                    b10 = 0;
                }
                ex.setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar5, settextkeepstate, activatesession, valueQualifier, bArr}, -278132640, 278132647, (int) System.currentTimeMillis());
                et.setDividerPadding(new Object[]{gvVar5}, 338249870, -338249868, (int) System.currentTimeMillis());
                x xVar2 = new x(gvVar5);
                int i119 = f56217j;
                int i120 = i119 & 45;
                int i121 = -(-((i119 ^ 45) | i120));
                int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
                f56216i = i122 % 128;
                int i123 = i122 % 2;
            }
        } else {
            ex exVar2 = (ex) hpVar3.setX();
            activateSession activatesession2 = activateSession.CLEAR_DISPLAY;
            ValueQualifier valueQualifier2 = ValueQualifier.setCompoundDrawableTintBlendMode;
            bArr = new byte[3];
            int i810 = f56217j;
            int i811 = (i810 & (-86)) | ((~i810) & 85);
            int i812 = -(-((i810 & 85) << 1));
            int i813 = (i811 ^ i812) + ((i812 & i811) << 1);
            f56216i = i813 % 128;
            int i814 = i813 % 2;
            i13 = 0;
            while (i13 < i14) {
                int i815 = f56216i;
                int i816 = ((i815 | 107) << 1) - (i815 ^ 107);
                f56217j = i816 % 128;
                int i817 = i816 % 2;
                bArr[i13] = b10;
                int iIdentityHashCode2 = System.identityHashCode(hpVar3);
                int i818 = (i13 * 370) + 370;
                int i819 = ~i13;
                int i910 = (i819 & 1) | (i13 & (-2)) | (i13 & 1);
                int i911 = ~iIdentityHashCode2;
                int i912 = ((~i911) & i910) | ((~i910) & i911);
                int i913 = i910 & i911;
                int i914 = -(-(((i912 & i913) | (i912 ^ i913)) * (-369)));
                int i915 = i818 & i914;
                int i916 = ((((i818 ^ i914) | i915) << 1) - (~(-((i914 | i818) & (~i915))))) - 1;
                int i917 = ~iIdentityHashCode2;
                int i918 = ~iIdentityHashCode2;
                int i919 = i917 & (i918 | iIdentityHashCode2);
                int i1010 = ((~i919) & (-2)) | (i919 & 1);
                int i1011 = i919 & (-2);
                int i1012 = ~((i1010 ^ i1011) | (i1011 & i1010));
                int i1013 = (i916 - (~(-(-(((i1012 & i13) | (i13 ^ i1012)) * (-369)))))) - 1;
                int i1014 = (~i13) & (i819 | i13);
                int i1015 = i1014 & 1;
                int i1016 = (i1014 | 1) & (~i1015);
                int i1017 = ~((i1016 & i1015) | (i1016 ^ i1015));
                int i1018 = ~((iIdentityHashCode2 & 1) | (i918 & 1) | (iIdentityHashCode2 & (-2)));
                int i1019 = (i1017 & i1018) | (i1017 ^ i1018);
                int i1110 = (-2) & i918;
                int i1111 = i1110 | ((i918 | (-2)) & (~i1110));
                int i1112 = i1111 & i13;
                int i1113 = ((i1111 | i13) & (~i1112)) | i1112;
                int i1114 = (i1113 | (~i1113)) & (~i1113);
                int i1115 = -(~(-(-(((i1019 & i1114) | (i1019 ^ i1114)) * 369))));
                i13 = ((i1013 ^ i1115) + ((i1115 & i1013) << 1)) - 1;
                int i1116 = f56216i;
                int i1117 = ((i1116 & 11) - (~(-(-(i1116 | 11))))) - 1;
                f56217j = i1117 % 128;
                int i1118 = i1117 % 2;
                b10 = 0;
            }
            ex.setCompoundDrawableTintBlendMode(new Object[]{exVar2, gvVar5, settextkeepstate, activatesession2, valueQualifier2, bArr}, -278132640, 278132647, (int) System.currentTimeMillis());
            et.setDividerPadding(new Object[]{gvVar5}, 338249870, -338249868, (int) System.currentTimeMillis());
            x xVar3 = new x(gvVar5);
            int i1119 = f56217j;
            int i124 = i1119 & 45;
            int i125 = -(-((i1119 ^ 45) | i124));
            int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
            f56216i = i126 % 128;
            int i127 = i126 % 2;
        }
        fk dividerPadding = ex.setDividerPadding((ex) hpVar3.setX(), gvVar5, settextkeepstate, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 3670012);
        int i128 = f56216i;
        int i129 = (i128 & 121) + (i128 | 121);
        f56217j = i129 % 128;
        int i130 = i129 % 2;
        return dividerPadding;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull a aVar) {
        return (fk) setOnFocusChangeListener(new Object[]{this, aVar}, 2084837296, -2084837292, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setOnFocusChangeListener(new Object[]{this}, -1518340837, 1518340840, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setX(@NotNull setRotationX setrotationx) {
        return (fk) setOnFocusChangeListener(new Object[]{this, setrotationx}, -1300608836, 1300608837, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setOnFocusChangeListener(new Object[]{this, setrotationx}, 400523423, -400523423, System.identityHashCode(this));
    }
}
