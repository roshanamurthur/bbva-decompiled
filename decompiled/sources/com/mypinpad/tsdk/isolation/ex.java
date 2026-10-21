package com.mypinpad.tsdk.isolation;

import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ex extends ez implements fb<gv> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55430k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f55431l = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        af afVar = (af) objArr[0];
        activateSession activatesession = (activateSession) objArr[1];
        ValueQualifier valueQualifier = (ValueQualifier) objArr[2];
        byte[] bArr = (byte[]) objArr[3];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[4];
        byte[] bArr2 = (byte[]) objArr[5];
        byte[] bArr3 = (byte[]) objArr[6];
        setSelector setselector = (setSelector) objArr[7];
        byte[] bArr4 = (byte[]) objArr[8];
        int i10 = f55431l;
        int i11 = (-2) - ((((i10 | 70) << 1) - (i10 ^ 70)) ^ (-1));
        f55430k = i11 % 128;
        int i12 = i11 % 2;
        af.setDividerPadding(new Object[]{afVar, activatesession}, 1583481674, -1583481662, System.identityHashCode(afVar));
        af.setDividerPadding(new Object[]{afVar, valueQualifier}, 1991488095, -1991488092, System.identityHashCode(afVar));
        if (bArr == null) {
            int i13 = f55430k;
            int i14 = (i13 ^ 103) + ((i13 & 103) << 1);
            f55431l = i14 % 128;
            if (i14 % 2 == 0) {
                setAnimation setanimation = setAnimation.INSTANCE;
                throw null;
            }
            setAnimation setanimation2 = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], -1773023437, 1773023670, (int) System.currentTimeMillis())}, 1509579822, -1509579760, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            if (getbeeponfailure == null) {
                int i15 = f55430k;
                int i16 = i15 ^ 61;
                int i17 = (((i15 & 61) | i16) << 1) - i16;
                f55431l = i17 % 128;
                int i18 = i17 % 2;
                int i19 = ((i15 ^ 92) + ((i15 & 92) << 1)) - 1;
                f55431l = i19 % 128;
                int i20 = i19 % 2;
                bArr = null;
            } else {
                byte[] bArr5 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                int i21 = f55431l;
                int i22 = (i21 & (-10)) | ((~i21) & 9);
                int i23 = (i21 & 9) << 1;
                int i24 = (i22 & i23) + (i23 | i22);
                f55430k = i24 % 128;
                int i25 = i24 % 2;
                bArr = bArr5;
            }
            if (bArr == null) {
                int i26 = f55430k;
                int i27 = i26 ^ 43;
                int i28 = (((i26 & 43) | i27) << 1) - i27;
                f55431l = i28 % 128;
                int i29 = i28 % 2;
                bArr = (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis());
                int i30 = f55431l + 91;
                f55430k = i30 % 128;
                int i31 = i30 % 2;
            } else {
                int i32 = f55430k;
                int i33 = i32 ^ 53;
                int i34 = ((i32 & 53) | i33) << 1;
                int i35 = -i33;
                int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                f55431l = i36 % 128;
                int i37 = i36 % 2;
            }
        } else {
            int i38 = f55431l;
            int i39 = (((i38 ^ 77) | (i38 & 77)) << 1) - (((~i38) & 77) | (i38 & (-78)));
            f55430k = i39 % 128;
            int i40 = i39 % 2;
        }
        af.setDividerPadding(new Object[]{afVar, bArr}, -730300567, 730300574, System.identityHashCode(afVar));
        if (bArr2 != null) {
            int i41 = f55431l + 63;
            f55430k = i41 % 128;
            if (i41 % 2 != 0) {
                af.setDividerPadding(new Object[]{afVar, bArr2}, 1964512517, -1964512513, System.identityHashCode(afVar));
                throw null;
            }
            af.setDividerPadding(new Object[]{afVar, bArr2}, 1964512517, -1964512513, System.identityHashCode(afVar));
            int i42 = f55431l;
            int i43 = i42 & 41;
            int i44 = ((i42 ^ 41) | i43) << 1;
            int i45 = -((i42 | 41) & (~i43));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            f55430k = i46 % 128;
            int i47 = i46 % 2;
        }
        if (bArr3 != null) {
            int i48 = f55431l;
            int i49 = i48 & 121;
            int i50 = (i48 ^ 121) | i49;
            int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
            f55430k = i51 % 128;
            if (i51 % 2 != 0) {
                af.setDividerPadding(new Object[]{afVar, bArr3}, -1405137347, 1405137361, System.identityHashCode(afVar));
                throw null;
            }
            af.setDividerPadding(new Object[]{afVar, bArr3}, -1405137347, 1405137361, System.identityHashCode(afVar));
        }
        af.setDividerPadding(new Object[]{afVar, setselector}, -1098788825, 1098788826, System.identityHashCode(afVar));
        if (bArr4 != null) {
            int i52 = f55430k;
            int i53 = i52 & 109;
            int i54 = (i52 ^ 109) | i53;
            int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
            f55431l = i55 % 128;
            int i56 = i55 % 2;
            af.setDividerPadding(new Object[]{afVar, bArr4}, 2106657059, -2106657053, System.identityHashCode(afVar));
            int i57 = f55431l;
            int i58 = i57 & 51;
            int i59 = ((i57 ^ 51) | i58) << 1;
            int i60 = -((i57 | 51) & (~i58));
            int i61 = (i59 & i60) + (i60 | i59);
            f55430k = i61 % 128;
            int i62 = i61 % 2;
        }
        int i63 = f55431l;
        int i64 = i63 & 9;
        int i65 = (i63 | 9) & (~i64);
        int i66 = i64 << 1;
        int i67 = (i65 & i66) + (i65 | i66);
        f55430k = i67 % 128;
        int i68 = i67 % 2;
    }

    public static /* synthetic */ Triple b(Object[] objArr) {
        af afVar;
        ex exVar = (ex) objArr[0];
        gv gvVar = (gv) objArr[1];
        activateSession activatesession = (activateSession) objArr[2];
        setItemChecked setitemchecked = (setItemChecked) objArr[3];
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[4];
        setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[5];
        byte[] bArr = (byte[]) objArr[6];
        activateSession activatesession2 = (activateSession) objArr[7];
        ValueQualifier valueQualifier = (ValueQualifier) objArr[8];
        byte[] bArr2 = (byte[]) objArr[9];
        byte[] bArr3 = (byte[]) objArr[10];
        setSelector setselector = (setSelector) objArr[11];
        byte[] bArr4 = (byte[]) objArr[12];
        fd fdVar = (fd) objArr[13];
        getY gety = (getY) objArr[14];
        Boolean bool = (Boolean) objArr[15];
        Boolean bool2 = (Boolean) objArr[16];
        Byte b10 = (Byte) objArr[17];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[18];
        byte[] bArr5 = (byte[]) objArr[19];
        boolean zBooleanValue = ((Boolean) objArr[20]).booleanValue();
        int i10 = f55431l;
        int i11 = i10 ^ 71;
        int i12 = -(-((i10 & 71) << 1));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f55430k = i13 % 128;
        int i14 = i13 % 2;
        aa aaVar = (aa) setCompoundDrawableTintBlendMode(new Object[]{gvVar, activatesession, setitemchecked, setcontentcapturesession, setdrawselectorontop, bArr}, 194995837, -194995821, (int) System.currentTimeMillis());
        if (!zBooleanValue) {
            ae aeVar = new ae(gvVar);
            afVar = (af) ((setImageTintList) w.setX(new Object[]{aeVar}, 1693919772, -1693919769, System.identityHashCode(aeVar)));
            int i15 = f55431l;
            int i16 = i15 & 15;
            int i17 = i15 | 15;
            int i18 = (i16 & i17) + (i17 | i16);
            f55430k = i18 % 128;
            int i19 = i18 % 2;
        } else {
            int i20 = f55431l;
            int i21 = i20 & 47;
            int i22 = -(-((i20 ^ 47) | i21));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f55430k = i23 % 128;
            int i24 = i23 % 2;
            af afVar2 = (af) setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar, activatesession2, valueQualifier, bArr2, bArr3, setselector, bArr4, bArr5, Boolean.TRUE}, 1929876847, -1929876838, System.identityHashCode(exVar));
            System.identityHashCode(exVar);
            System.identityHashCode(exVar);
            afVar = afVar2;
        }
        Triple triple = new Triple(aaVar, afVar, (z) setCompoundDrawableTintBlendMode(new Object[]{gvVar, fdVar, gety, bool, bool2, b10, settransitionvisibility, Boolean.valueOf(zBooleanValue)}, -1294184129, 1294184131, (int) System.currentTimeMillis()));
        int i25 = f55430k;
        int i26 = i25 & 11;
        int i27 = (i26 - (~(-(-((i25 ^ 11) | i26))))) - 1;
        f55431l = i27 % 128;
        if (i27 % 2 != 0) {
            return triple;
        }
        throw null;
    }

    public static /* synthetic */ af c(Object[] objArr) {
        int i10;
        ex exVar = (ex) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        activateSession activatesession = (activateSession) objArr[2];
        ValueQualifier valueQualifier = (ValueQualifier) objArr[3];
        byte[] bArr = (byte[]) objArr[4];
        byte[] bArr2 = (byte[]) objArr[5];
        setSelector setselector = (setSelector) objArr[6];
        byte[] bArr3 = (byte[]) objArr[7];
        byte[] bArr4 = (byte[]) objArr[8];
        boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
        int i11 = f55431l;
        int i12 = i11 & 1;
        int i13 = (~i12) & (i11 | 1);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        f55430k = i15 % 128;
        int i16 = i15 % 2;
        if (activatesession == activateSession.N_A) {
            int i17 = f55430k;
            int i18 = i17 | 7;
            int i19 = i18 << 1;
            int i20 = -((~(i17 & 7)) & i18);
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            f55431l = i21 % 128;
            int i22 = i21 % 2;
            if (valueQualifier == ValueQualifier.setOnDragListener) {
                int i23 = f55430k;
                int i24 = (i23 & (-16)) | ((~i23) & 15);
                int i25 = -(-((i23 & 15) << 1));
                int i26 = (i24 & i25) + (i25 | i24);
                f55431l = i26 % 128;
                int i27 = i26 % 2;
                return null;
            }
        }
        ae aeVar = new ae(setscrollbardefaultdelaybeforefade);
        if (zBooleanValue) {
            int i28 = f55430k;
            int i29 = i28 & 89;
            i10 = (i29 - (~(-(-((i28 ^ 89) | i29))))) - 1;
        } else {
            int i30 = f55430k;
            i10 = (((i30 | 28) << 1) - (i30 ^ 28)) - 1;
        }
        f55431l = i10 % 128;
        int i31 = i10 % 2;
        af afVar = (af) ((setImageTintList) w.setX(new Object[]{aeVar}, 1693919772, -1693919769, System.identityHashCode(aeVar)));
        int i32 = f55431l;
        int i33 = (i32 | 25) << 1;
        int i34 = -(i32 ^ 25);
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        f55430k = i35 % 128;
        if (i35 % 2 == 0) {
            return afVar;
        }
        throw null;
    }

    public static /* synthetic */ fk d(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ex exVar = (ex) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        activateSession activatesession = (activateSession) objArr[3];
        ValueQualifier valueQualifier = (ValueQualifier) objArr[4];
        byte[] bArr = (byte[]) objArr[5];
        fd fdVar = (fd) objArr[6];
        getY gety = (getY) objArr[7];
        Boolean bool = (Boolean) objArr[8];
        activateSession activatesession2 = (activateSession) objArr[9];
        setItemChecked setitemchecked = (setItemChecked) objArr[10];
        byte[] bArr2 = (byte[]) objArr[11];
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[12];
        setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[13];
        setSelector setselector = (setSelector) objArr[14];
        byte[] bArr3 = (byte[]) objArr[15];
        byte[] bArr4 = (byte[]) objArr[16];
        Byte b10 = (Byte) objArr[18];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[19];
        boolean zBooleanValue = ((Boolean) objArr[20]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[21]).booleanValue();
        int i15 = f55431l;
        int i16 = i15 & 71;
        int i17 = -(-((i15 ^ 71) | i16));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        f55430k = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(activatesession, "");
        Intrinsics.checkNotNullParameter(valueQualifier, "");
        Intrinsics.checkNotNullParameter(fdVar, "");
        Intrinsics.checkNotNullParameter(gety, "");
        Intrinsics.checkNotNullParameter(activatesession2, "");
        Intrinsics.checkNotNullParameter(setitemchecked, "");
        Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
        Intrinsics.checkNotNullParameter(setdrawselectorontop, "");
        Intrinsics.checkNotNullParameter(setselector, "");
        gv gvVar = (gv) setscrollbardefaultdelaybeforefade;
        Triple triple = (Triple) setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar, activatesession2, setitemchecked, setcontentcapturesession, setdrawselectorontop, bArr2, activatesession, valueQualifier, bArr, bArr3, setselector, bArr4, fdVar, gety, bool, null, b10, settransitionvisibility, null, Boolean.valueOf(zBooleanValue)}, 46167624, -46167609, System.identityHashCode(exVar));
        aa aaVar = (aa) triple.component1();
        af afVar = (af) triple.component2();
        z zVar = (z) triple.component3();
        setAnimation setanimation = setAnimation.INSTANCE;
        String str = (String) setCompoundDrawableTintBlendMode(new Object[0], 466137149, -466137145, (int) System.currentTimeMillis());
        if (aaVar == null) {
            y yVar = new y(setscrollbardefaultdelaybeforefade);
            aaVar = (aa) ((setImageTintList) w.setX(new Object[]{yVar}, 1693919772, -1693919769, System.identityHashCode(yVar)));
            int i20 = f55431l;
            int i21 = i20 & 33;
            i11 = (((i20 | 33) & (~i21)) - (~(i21 << 1))) - 1;
            f55430k = i11 % 128;
            i10 = 2;
        } else {
            i10 = 2;
            i11 = f55430k + 115;
            f55431l = i11 % 128;
        }
        int i22 = i11 % i10;
        if (afVar == null) {
            ae aeVar = new ae(setscrollbardefaultdelaybeforefade);
            afVar = (af) ((setImageTintList) w.setX(new Object[]{aeVar}, 1693919772, -1693919769, System.identityHashCode(aeVar)));
            int i23 = f55431l;
            int i24 = (i23 ^ 61) + ((i23 & 61) << 1);
            f55430k = i24 % 128;
            int i25 = i24 % 2;
            i12 = 1;
        } else {
            int i26 = f55431l;
            i12 = 1;
            int i27 = (((i26 & (-48)) | ((~i26) & 47)) - (~((i26 & 47) << 1))) - 1;
            f55430k = i27 % 128;
            int i28 = i27 % 2;
        }
        if (zVar == null) {
            x xVar = new x(setscrollbardefaultdelaybeforefade);
            Object[] objArr2 = new Object[i12];
            objArr2[0] = xVar;
            zVar = (z) ((setImageTintList) w.setX(objArr2, 1693919772, -1693919769, System.identityHashCode(xVar)));
            int i29 = f55431l;
            i14 = ((i29 | 77) << i12) - (i29 ^ 77);
            f55430k = i14 % 128;
            i13 = 2;
        } else {
            i13 = 2;
            i14 = f55431l + 95;
            f55430k = i14 % 128;
        }
        int i30 = i14 % i13;
        if (!zBooleanValue2) {
            fk fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar, settextkeepstate, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis()), (fd) z.setY(new Object[]{zVar}, -963084998, 963085008, System.identityHashCode(zVar)), (getY) z.setY(new Object[]{zVar}, -1590722919, 1590722932, System.identityHashCode(zVar)), Boolean.valueOf(((Boolean) z.setY(new Object[]{zVar}, -837836248, 837836255, System.identityHashCode(zVar))).booleanValue()), aaVar.setZ(), aaVar.setNavigationOnClickListener(), aaVar.setTextAlignment(), aaVar.setLayoutAnimation(), aaVar.getNavBarTitleString(), setSelector.NONE, (byte[]) ez.setY.setX(new Object[0], 1514668654, -1514668649, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], 1936104505, -1936104498, (int) System.currentTimeMillis()), Boolean.valueOf(((Boolean) z.setY(new Object[]{zVar}, -581596710, 581596710, System.identityHashCode(zVar))).booleanValue()), Byte.valueOf(((Byte) z.setY(new Object[]{zVar}, -746235387, 746235391, System.identityHashCode(zVar))).byteValue()), (setTransitionVisibility) z.setY(new Object[]{zVar}, -1655190133, 1655190134, System.identityHashCode(zVar)), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), null, str}, -850456680, 850456697, System.identityHashCode(exVar));
            int i31 = f55430k;
            int i32 = ((i31 | 53) << 1) - (i31 ^ 53);
            f55431l = i32 % 128;
            if (i32 % 2 != 0) {
                return fkVar;
            }
            throw null;
        }
        int i33 = f55431l;
        int i34 = i33 & 59;
        int i35 = ((i33 | 59) & (~i34)) + (i34 << 1);
        f55430k = i35 % 128;
        int i36 = i35 % 2;
        fk fkVar2 = (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar, settextkeepstate, (activateSession) af.setDividerPadding(new Object[]{afVar}, -1539226566, 1539226571, System.identityHashCode(afVar)), (ValueQualifier) af.setDividerPadding(new Object[]{afVar}, -973348551, 973348561, System.identityHashCode(afVar)), (byte[]) af.setDividerPadding(new Object[]{afVar}, 260633922, -260633914, System.identityHashCode(afVar)), (fd) z.setY(new Object[]{zVar}, -963084998, 963085008, System.identityHashCode(zVar)), (getY) z.setY(new Object[]{zVar}, -1590722919, 1590722932, System.identityHashCode(zVar)), Boolean.valueOf(((Boolean) z.setY(new Object[]{zVar}, -837836248, 837836255, System.identityHashCode(zVar))).booleanValue()), aaVar.setZ(), aaVar.setNavigationOnClickListener(), aaVar.setTextAlignment(), aaVar.setLayoutAnimation(), aaVar.getNavBarTitleString(), (setSelector) af.setDividerPadding(new Object[]{afVar}, -943079573, 943079586, System.identityHashCode(afVar)), (byte[]) af.setDividerPadding(new Object[]{afVar}, -1964906171, 1964906173, System.identityHashCode(afVar)), (byte[]) af.setDividerPadding(new Object[]{afVar}, -1096391351, 1096391362, System.identityHashCode(afVar)), Boolean.valueOf(((Boolean) z.setY(new Object[]{zVar}, -581596710, 581596710, System.identityHashCode(zVar))).booleanValue()), Byte.valueOf(((Byte) z.setY(new Object[]{zVar}, -746235387, 746235391, System.identityHashCode(zVar))).byteValue()), (setTransitionVisibility) z.setY(new Object[]{zVar}, -1655190133, 1655190134, System.identityHashCode(zVar)), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), (byte[]) af.setDividerPadding(new Object[]{afVar}, 376850173, -376850173, System.identityHashCode(afVar)), str}, -850456680, 850456697, System.identityHashCode(exVar));
        System.identityHashCode(exVar);
        System.identityHashCode(exVar);
        return fkVar2;
    }

    public static /* synthetic */ fk e(Object[] objArr) {
        char c10;
        setContentCaptureSession setcontentcapturesession;
        byte[] bArr;
        byte[] bArr2;
        ex exVar = (ex) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        activateSession activatesession = (activateSession) objArr[3];
        ValueQualifier valueQualifier = (ValueQualifier) objArr[4];
        byte[] bArr3 = (byte[]) objArr[5];
        fd fdVar = (fd) objArr[6];
        getY gety = (getY) objArr[7];
        Boolean bool = (Boolean) objArr[8];
        activateSession activatesession2 = (activateSession) objArr[9];
        setItemChecked setitemchecked = (setItemChecked) objArr[10];
        byte[] bArr4 = (byte[]) objArr[11];
        setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[12];
        setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[13];
        setSelector setselector = (setSelector) objArr[14];
        byte[] bArr5 = (byte[]) objArr[15];
        byte[] bArr6 = (byte[]) objArr[16];
        Byte b10 = (Byte) objArr[17];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[18];
        boolean zBooleanValue = ((Boolean) objArr[19]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[20]).booleanValue();
        int iIntValue = ((Number) objArr[21]).intValue();
        int i10 = f55431l;
        int i11 = ~i10;
        int i12 = (i10 & (-42)) | (41 & i11);
        int i13 = -(-((i10 & 41) << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f55430k = i14 % 128;
        if (i14 % 2 == 0 ? (iIntValue & 4) != 0 : (iIntValue & 5) != 0) {
            int i15 = ((i10 & (-56)) | (i11 & 55)) + ((i10 & 55) << 1);
            f55430k = i15 % 128;
            int i16 = i15 % 2;
            activatesession = (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis());
            int i17 = f55430k;
            int i18 = (((i17 | 70) << 1) - (i17 ^ 70)) - 1;
            f55431l = i18 % 128;
            int i19 = i18 % 2;
        }
        if ((iIntValue & 8) != 0) {
            int i20 = f55430k;
            int i21 = (i20 & 1) + (i20 | 1);
            f55431l = i21 % 128;
            int i22 = i21 % 2;
            valueQualifier = (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis());
            int i23 = f55431l;
            int i24 = i23 ^ 95;
            int i25 = ((i23 & 95) | i24) << 1;
            int i26 = -i24;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            f55430k = i27 % 128;
            int i28 = i27 % 2;
        }
        if ((iIntValue & 16) != 0) {
            int i29 = f55430k;
            int i30 = i29 ^ 61;
            int i31 = -(-((i29 & 61) << 1));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f55431l = i32 % 128;
            if (i32 % 2 == 0) {
                bArr2 = (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis());
                int i33 = 78 / 0;
            } else {
                bArr2 = (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis());
            }
            bArr3 = bArr2;
        }
        if ((iIntValue & 32) != 0) {
            int i34 = f55431l;
            int i35 = i34 & 111;
            int i36 = (i34 ^ 111) | i35;
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            f55430k = i37 % 128;
            int i38 = i37 % 2;
            fdVar = (fd) ez.setY.setX(new Object[0], 871749756, -871749756, (int) System.currentTimeMillis());
            int i39 = f55430k;
            int i40 = i39 | 65;
            int i41 = ((i40 << 1) - (~(-((~(i39 & 65)) & i40)))) - 1;
            f55431l = i41 % 128;
            int i42 = i41 % 2;
        }
        if ((iIntValue & 64) != 0) {
            int i43 = f55431l;
            int i44 = ((i43 & 30) + (i43 | 30)) - 1;
            f55430k = i44 % 128;
            int i45 = i44 % 2;
            gety = (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis());
        }
        if ((iIntValue & 128) != 0) {
            int i46 = f55431l;
            int i47 = i46 ^ 115;
            int i48 = -(-((i46 & 115) << 1));
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            int i50 = i49 % 128;
            f55430k = i50;
            if (i49 % 2 != 0) {
                throw null;
            }
            int i51 = i50 + 23;
            f55431l = i51 % 128;
            int i52 = i51 % 2;
            bool = null;
        }
        if ((iIntValue & 256) != 0) {
            int i53 = f55430k + 108;
            int i54 = (i53 ^ (-1)) + (i53 << 1);
            f55431l = i54 % 128;
            if (i54 % 2 == 0) {
                throw null;
            }
            activatesession2 = (activateSession) ez.setY.setX(new Object[0], 316386280, -316386274, (int) System.currentTimeMillis());
            int i55 = f55431l;
            int i56 = i55 & 17;
            int i57 = i56 + ((i55 ^ 17) | i56);
            f55430k = i57 % 128;
            int i58 = i57 % 2;
        }
        if ((iIntValue & 512) != 0) {
            int i59 = f55431l;
            int i60 = (i59 & (-120)) | (119 & (~i59));
            int i61 = -(-((i59 & 119) << 1));
            int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
            f55430k = i62 % 128;
            int i63 = i62 % 2;
            setItemChecked setitemchecked2 = (setItemChecked) ez.setY.setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis());
            int i64 = f55430k;
            int i65 = ((i64 | 57) << 1) - (i64 ^ 57);
            f55431l = i65 % 128;
            int i66 = i65 % 2;
            setitemchecked = setitemchecked2;
        }
        if ((iIntValue & 1024) != 0) {
            int i67 = f55430k + 95;
            f55431l = i67 % 128;
            if (i67 % 2 == 0) {
                bArr = (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis());
                int i68 = 6 / 0;
            } else {
                bArr = (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis());
            }
            byte[] bArr7 = bArr;
            int i69 = f55431l + 121;
            f55430k = i69 % 128;
            int i70 = i69 % 2;
            bArr4 = bArr7;
        }
        if ((iIntValue & 2048) != 0) {
            int i71 = f55431l + 111;
            f55430k = i71 % 128;
            if (i71 % 2 != 0) {
                setcontentcapturesession = (setContentCaptureSession) ez.setY.setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis());
                int i72 = 55 / 0;
            } else {
                setcontentcapturesession = (setContentCaptureSession) ez.setY.setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis());
            }
            setcontentcapturesession2 = setcontentcapturesession;
        }
        if ((iIntValue & 4096) != 0) {
            int i73 = f55430k;
            int i74 = i73 & 89;
            int i75 = (i73 | 89) & (~i74);
            int i76 = i74 << 1;
            int i77 = ((i75 | i76) << 1) - (i75 ^ i76);
            f55431l = i77 % 128;
            if (i77 % 2 == 0) {
                throw null;
            }
            setdrawselectorontop = (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis());
            int i78 = f55431l;
            int i79 = (i78 & (-58)) | ((~i78) & 57);
            int i80 = (i78 & 57) << 1;
            int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
            f55430k = i81 % 128;
            int i82 = i81 % 2;
        }
        if ((iIntValue & 8192) != 0) {
            int i83 = f55431l;
            int i84 = i83 & 99;
            int i85 = ((i83 ^ 99) | i84) << 1;
            int i86 = -((i83 | 99) & (~i84));
            int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
            f55430k = i87 % 128;
            if (i87 % 2 != 0) {
                setSelector.Companion companion = setSelector.INSTANCE;
                throw null;
            }
            setselector = setSelector.NONE;
        }
        if ((iIntValue & 16384) != 0) {
            int i88 = f55430k;
            int i89 = (i88 & 118) + (i88 | 118);
            int i90 = (i89 ^ (-1)) + (i89 << 1);
            f55431l = i90 % 128;
            if (i90 % 2 == 0) {
                throw null;
            }
            bArr5 = (byte[]) ez.setY.setX(new Object[0], 1514668654, -1514668649, (int) System.currentTimeMillis());
            int i91 = f55430k;
            int i92 = i91 ^ 41;
            int i93 = (i91 & 41) << 1;
            int i94 = (i92 & i93) + (i93 | i92);
            f55431l = i94 % 128;
            int i95 = i94 % 2;
        }
        if ((32768 & iIntValue) != 0) {
            int i96 = f55430k;
            int i97 = ((i96 ^ 54) + ((i96 & 54) << 1)) - 1;
            f55431l = i97 % 128;
            int i98 = i97 % 2;
            bArr6 = (byte[]) ez.setY.setX(new Object[0], 1936104505, -1936104498, (int) System.currentTimeMillis());
            int i99 = f55430k;
            int i100 = i99 & 103;
            int i101 = i100 + ((i99 ^ 103) | i100);
            f55431l = i101 % 128;
            int i102 = i101 % 2;
        }
        if ((131072 & iIntValue) != 0) {
            int i103 = f55430k;
            int i104 = i103 & 75;
            int i105 = ((((i103 ^ 75) | i104) << 1) - (~(-((i103 | 75) & (~i104))))) - 1;
            int i106 = i105 % 128;
            f55431l = i106;
            int i107 = i105 % 2;
            int i108 = i106 + 2;
            int i109 = (i108 ^ (-1)) + (i108 << 1);
            f55430k = i109 % 128;
            int i110 = i109 % 2;
            b10 = null;
        }
        if ((262144 & iIntValue) != 0) {
            int i111 = f55430k;
            int i112 = (-2) - ((((i111 | 58) << 1) - (i111 ^ 58)) ^ (-1));
            int i113 = i112 % 128;
            f55431l = i113;
            if (i112 % 2 == 0) {
                throw null;
            }
            int i114 = i113 + 25;
            f55430k = i114 % 128;
            int i115 = i114 % 2;
            settransitionvisibility = null;
        }
        if ((524288 & iIntValue) != 0) {
            int i116 = f55431l;
            int i117 = ((i116 ^ 27) | (i116 & 27)) << 1;
            int i118 = -((i116 & (-28)) | (27 & (~i116)));
            int i119 = (i117 ^ i118) + ((i117 & i118) << 1);
            f55430k = i119 % 128;
            int i120 = i119 % 2;
            int i121 = i116 + 29;
            f55430k = i121 % 128;
            int i122 = i121 % 2;
            zBooleanValue = true;
        }
        if ((1048576 & iIntValue) != 0) {
            int i123 = f55431l;
            int i124 = (i123 & (-54)) | ((~i123) & 53);
            int i125 = (i123 & 53) << 1;
            int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
            f55430k = i126 % 128;
            c10 = 2;
            int i127 = i126 % 2;
            zBooleanValue2 = true;
        } else {
            c10 = 2;
        }
        Object[] objArr2 = new Object[23];
        objArr2[0] = exVar;
        objArr2[1] = setscrollbardefaultdelaybeforefade;
        objArr2[c10] = settextkeepstate;
        objArr2[3] = activatesession;
        objArr2[4] = valueQualifier;
        objArr2[5] = bArr3;
        objArr2[6] = fdVar;
        objArr2[7] = gety;
        objArr2[8] = bool;
        objArr2[9] = activatesession2;
        objArr2[10] = setitemchecked;
        objArr2[11] = bArr4;
        objArr2[12] = setcontentcapturesession2;
        objArr2[13] = setdrawselectorontop;
        objArr2[14] = setselector;
        objArr2[15] = bArr5;
        objArr2[16] = bArr6;
        objArr2[17] = null;
        objArr2[18] = b10;
        objArr2[19] = settransitionvisibility;
        objArr2[20] = Boolean.valueOf(zBooleanValue);
        objArr2[21] = Boolean.valueOf(zBooleanValue2);
        objArr2[22] = null;
        fk fkVar = (fk) setCompoundDrawableTintBlendMode(objArr2, -1142438067, 1142438081, System.identityHashCode(exVar));
        int i128 = f55431l;
        int i129 = (((i128 | 86) << 1) - (i128 ^ 86)) - 1;
        f55430k = i129 % 128;
        if (i129 % 2 == 0) {
            return fkVar;
        }
        throw null;
    }

    public static /* synthetic */ fk f(Object[] objArr) {
        setDrawSelectorOnTop setdrawselectorontop;
        ex exVar = (ex) objArr[0];
        gv gvVar = (gv) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        fd fdVar = (fd) objArr[3];
        getY gety = (getY) objArr[4];
        setItemChecked setitemchecked = (setItemChecked) objArr[5];
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[6];
        setDrawSelectorOnTop setdrawselectorontop2 = (setDrawSelectorOnTop) objArr[7];
        Byte b10 = (Byte) objArr[8];
        boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
        int iIntValue = ((Number) objArr[10]).intValue();
        int i10 = f55431l;
        int i11 = (i10 ^ 97) + ((i10 & 97) << 1);
        f55430k = i11 % 128;
        if (i11 % 2 == 0 ? (iIntValue & 8) != 0 : (iIntValue & 17) != 0) {
            int i12 = i10 ^ 95;
            int i13 = -(-((i10 & 95) << 1));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            f55430k = i14 % 128;
            int i15 = i14 % 2;
            gety = getY.setNavigationOnClickListener;
            int i16 = f55431l + 83;
            f55430k = i16 % 128;
            int i17 = i16 % 2;
        }
        if ((iIntValue & 16) != 0) {
            int i18 = f55431l;
            int i19 = (((i18 ^ 35) | (i18 & 35)) << 1) - ((i18 & (-36)) | ((~i18) & 35));
            f55430k = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            setitemchecked = (setItemChecked) ez.setY.setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis());
            int i20 = f55431l;
            int i21 = ((i20 & 24) + (i20 | 24)) - 1;
            f55430k = i21 % 128;
            int i22 = i21 % 2;
        }
        if ((iIntValue & 32) != 0) {
            int i23 = f55430k;
            int i24 = ((i23 ^ 9) | (i23 & 9)) << 1;
            int i25 = -(((~i23) & 9) | (i23 & (-10)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f55431l = i26 % 128;
            int i27 = i26 % 2;
            setcontentcapturesession = (setContentCaptureSession) ez.setY.setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis());
            int i28 = f55430k;
            int i29 = ((((i28 ^ 117) | (i28 & 117)) << 1) - (~(-(((~i28) & 117) | (i28 & (-118)))))) - 1;
            f55431l = i29 % 128;
            int i30 = i29 % 2;
        }
        if ((iIntValue & 64) != 0) {
            int i31 = f55431l;
            int i32 = i31 & 17;
            int i33 = -(-((i31 ^ 17) | i32));
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            f55430k = i34 % 128;
            int i35 = i34 % 2;
            setdrawselectorontop = (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis());
            int i36 = f55431l;
            int i37 = i36 & 71;
            int i38 = i37 + ((i36 ^ 71) | i37);
            f55430k = i38 % 128;
            int i39 = i38 % 2;
        } else {
            setdrawselectorontop = setdrawselectorontop2;
        }
        if ((iIntValue & 128) != 0) {
            int i40 = f55431l;
            int i41 = i40 & 23;
            int i42 = (i41 - (~(-(-((i40 ^ 23) | i41))))) - 1;
            int i43 = i42 % 128;
            f55430k = i43;
            int i44 = i42 % 2;
            int i45 = i43 & 1;
            int i46 = (i43 ^ 1) | i45;
            int i47 = (i45 & i46) + (i46 | i45);
            f55431l = i47 % 128;
            int i48 = i47 % 2;
            b10 = null;
        }
        if ((iIntValue & 256) != 0) {
            int i49 = f55431l;
            int i50 = (i49 & (-48)) | ((~i49) & 47);
            int i51 = (i49 & 47) << 1;
            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
            f55430k = i52 % 128;
            zBooleanValue = i52 % 2 == 0;
        }
        fk fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar, settextkeepstate, fdVar, gety, setitemchecked, setcontentcapturesession, setdrawselectorontop, b10, Boolean.valueOf(zBooleanValue)}, 46568699, -46568693, System.identityHashCode(exVar));
        int i53 = f55431l;
        int i54 = i53 & 63;
        int i55 = -(-(i53 | 63));
        int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
        f55430k = i56 % 128;
        int i57 = i56 % 2;
        return fkVar;
    }

    public static /* synthetic */ z g(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        fd fdVar = (fd) objArr[1];
        getY gety = (getY) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        Boolean bool2 = (Boolean) objArr[4];
        Byte b10 = (Byte) objArr[5];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[6];
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        x xVar = new x(setscrollbardefaultdelaybeforefade);
        if (zBooleanValue) {
            int i10 = f55431l;
            int i11 = (-2) - (((i10 & 34) + (i10 | 34)) ^ (-1));
            f55430k = i11 % 128;
            int i12 = i11 % 2;
        }
        z zVar = (z) ((setImageTintList) w.setX(new Object[]{xVar}, 1693919772, -1693919769, System.identityHashCode(xVar)));
        int i13 = f55431l;
        int i14 = i13 ^ 89;
        int i15 = ((i13 & 89) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 & i16) + (i15 | i16);
        f55430k = i17 % 128;
        if (i17 % 2 == 0) {
            return zVar;
        }
        throw null;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object compoundDrawableTintBlendMode;
        Object obj;
        int i13;
        char c10;
        j jVar;
        int i14 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~(i10 | i12);
        int i18 = ((i16 | i17) * (-814)) + i14;
        int i19 = ~(i15 | (~i12));
        int i20 = ~i10;
        int i21 = ~(i20 | i11);
        switch ((((~(i20 | i12)) | i21 | (~(i11 | i12))) * 407) + ((i19 | i21 | i17) * 407) + i18) {
            case 1:
                ex exVar = (ex) objArr[0];
                gv gvVar = (gv) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                int i22 = f55431l;
                int i23 = i22 & 33;
                int i24 = (i23 - (~(-(-((i22 ^ 33) | i23))))) - 1;
                f55430k = i24 % 128;
                if (i24 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(gvVar, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate, "");
                    compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar, settextkeepstate, fd.TRY_AGAIN, null, null, null, setDrawSelectorOnTop.setY, null, Boolean.FALSE, 184}, 146326336, -146326323, 184);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(gvVar, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate, "");
                    compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar, settextkeepstate, fd.TRY_AGAIN, null, null, null, setDrawSelectorOnTop.setY, null, Boolean.FALSE, 6234}, 146326336, -146326323, 6234);
                }
                fk fkVar = (fk) compoundDrawableTintBlendMode;
                int i25 = f55431l;
                int i26 = (i25 ^ 37) + ((i25 & 37) << 1);
                f55430k = i26 % 128;
                int i27 = i26 % 2;
                return fkVar;
            case 2:
                return g(objArr);
            case 3:
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[0];
                ae aeVar = (ae) objArr[1];
                Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                Intrinsics.checkNotNullParameter(aeVar, "");
                af afVar = (af) ((setImageTintList) w.setX(new Object[]{aeVar}, 1693919772, -1693919769, System.identityHashCode(aeVar)));
                setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate2, new e(new l(afVar.getNavBarTitleString(), afVar.setNavigationOnClickListener(), afVar.setLayoutAnimation(), afVar.UiMessageCallbackKtWhenMappings(), afVar.setIncludeFontPadding(), afVar.setTextAlignment(), afVar.setAlwaysDrawnWithCacheEnabled()), ((af) ((setImageTintList) w.setX(new Object[]{aeVar}, 1693919772, -1693919769, System.identityHashCode(aeVar)))).toString())}, -1386319901, 1386319908, System.identityHashCode(settextkeepstate2));
                int i28 = f55431l;
                int i29 = (i28 ^ 45) + ((i28 & 45) << 1);
                f55430k = i29 % 128;
                int i30 = i29 % 2;
                break;
            case 4:
                int i31 = f55431l;
                int i32 = i31 & 49;
                int i33 = i32 + ((i31 ^ 49) | i32);
                f55430k = i33 % 128;
                int i34 = i33 % 2;
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                int i35 = f55430k;
                int i36 = (i35 ^ 109) + ((i35 & 109) << 1);
                f55431l = i36 % 128;
                int i37 = i36 % 2;
                return "";
            case 5:
                ex exVar2 = (ex) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
                int i38 = f55431l;
                int i39 = i38 ^ 87;
                int i40 = ((((i38 & 87) | i39) << 1) - (~(-i39))) - 1;
                f55430k = i40 % 128;
                if (i40 % 2 != 0) {
                    throw null;
                }
                fk fkVar2 = (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar2, (gv) setscrollbardefaultdelaybeforefade, settextkeepstate3}, 1517844032, -1517844031, System.identityHashCode(exVar2));
                int i41 = f55431l;
                int i42 = (i41 ^ 101) + ((i41 & 101) << 1);
                f55430k = i42 % 128;
                int i43 = i42 % 2;
                return fkVar2;
            case 6:
                ex exVar3 = (ex) objArr[0];
                gv gvVar2 = (gv) objArr[1];
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[2];
                fd fdVar = (fd) objArr[3];
                getY gety = (getY) objArr[4];
                setItemChecked setitemchecked = (setItemChecked) objArr[5];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[6];
                setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[7];
                Byte b10 = (Byte) objArr[8];
                boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
                int i44 = f55431l;
                int i45 = i44 & 85;
                int i46 = ((i44 ^ 85) | i45) << 1;
                int i47 = -((~i45) & (i44 | 85));
                int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                f55430k = i48 % 128;
                int i49 = i48 % 2;
                Intrinsics.checkNotNullParameter(gvVar2, "");
                Intrinsics.checkNotNullParameter(settextkeepstate4, "");
                Intrinsics.checkNotNullParameter(fdVar, "");
                Intrinsics.checkNotNullParameter(gety, "");
                Intrinsics.checkNotNullParameter(setitemchecked, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                Intrinsics.checkNotNullParameter(setdrawselectorontop, "");
                fk fkVar3 = (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar3, gvVar2, settextkeepstate4, null, null, null, fdVar, gety, null, null, setitemchecked, null, setcontentcapturesession, setdrawselectorontop, null, null, null, b10, null, Boolean.FALSE, Boolean.valueOf(zBooleanValue), 3007900}, 692489642, -692489630, 3007900);
                int i50 = f55431l;
                int i51 = i50 & 79;
                int i52 = (i50 | 79) & (~i51);
                int i53 = i51 << 1;
                int i54 = (i52 & i53) + (i52 | i53);
                f55430k = i54 % 128;
                int i55 = i54 % 2;
                return fkVar3;
            case 7:
                ex exVar4 = (ex) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[2];
                activateSession activatesession = (activateSession) objArr[3];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[4];
                byte[] bArr = (byte[]) objArr[5];
                int i56 = f55431l;
                int i57 = i56 & 19;
                int i58 = (((i56 ^ 19) | i57) << 1) - ((i56 | 19) & (~i57));
                f55430k = i58 % 128;
                if (i58 % 2 == 0) {
                    setCompoundDrawableTintBlendMode(new Object[]{exVar4, setscrollbardefaultdelaybeforefade2, settextkeepstate5, activatesession, valueQualifier, Boolean.FALSE, bArr}, 1135469441, -1135469430, System.identityHashCode(exVar4));
                } else {
                    setCompoundDrawableTintBlendMode(new Object[]{exVar4, setscrollbardefaultdelaybeforefade2, settextkeepstate5, activatesession, valueQualifier, Boolean.TRUE, bArr}, 1135469441, -1135469430, System.identityHashCode(exVar4));
                }
                break;
            case 8:
                a(objArr);
                break;
            case 9:
                return c(objArr);
            case 10:
                ex exVar5 = (ex) objArr[0];
                gv gvVar3 = (gv) objArr[1];
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[2];
                int i59 = f55431l;
                int i60 = i59 & 91;
                int i61 = (i59 ^ 91) | i60;
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                f55430k = i62 % 128;
                int i63 = i62 % 2;
                Intrinsics.checkNotNullParameter(gvVar3, "");
                Intrinsics.checkNotNullParameter(settextkeepstate6, "");
                fk fkVar4 = (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar5, gvVar3, settextkeepstate6, fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setOnFocusChangeListener, null, Boolean.FALSE, 440}, 146326336, -146326323, 440);
                int i64 = f55431l;
                int i65 = i64 & 75;
                int i66 = -(-((i64 ^ 75) | i65));
                int i67 = (i65 & i66) + (i66 | i65);
                f55430k = i67 % 128;
                if (i67 % 2 == 0) {
                    return fkVar4;
                }
                throw null;
            case 11:
                ex exVar6 = (ex) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[2];
                activateSession activatesession2 = (activateSession) objArr[3];
                ValueQualifier valueQualifier2 = (ValueQualifier) objArr[4];
                boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
                byte[] bArr2 = (byte[]) objArr[6];
                int i68 = f55430k;
                int i69 = (i68 & (-86)) | ((~i68) & 85);
                int i70 = (i68 & 85) << 1;
                int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                f55431l = i71 % 128;
                int i72 = i71 % 2;
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade3, "");
                Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                Intrinsics.checkNotNullParameter(activatesession2, "");
                Intrinsics.checkNotNullParameter(valueQualifier2, "");
                Intrinsics.checkNotNullParameter(bArr2, "");
                af afVar2 = (af) setCompoundDrawableTintBlendMode(new Object[]{exVar6, setscrollbardefaultdelaybeforefade3, activatesession2, valueQualifier2, bArr2, (byte[]) ez.setY.setX(new Object[0], 1514668654, -1514668649, (int) System.currentTimeMillis()), setSelector.NONE, (byte[]) ez.setY.setX(new Object[0], 1936104505, -1936104498, (int) System.currentTimeMillis()), null, Boolean.valueOf(zBooleanValue2)}, 1929876847, -1929876838, System.identityHashCode(exVar6));
                Intrinsics.checkNotNull(afVar2);
                ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade3, settextkeepstate7, (activateSession) af.setDividerPadding(new Object[]{afVar2}, -1539226566, 1539226571, System.identityHashCode(afVar2)), (ValueQualifier) af.setDividerPadding(new Object[]{afVar2}, -973348551, 973348561, System.identityHashCode(afVar2)), (byte[]) af.setDividerPadding(new Object[]{afVar2}, 260633922, -260633914, System.identityHashCode(afVar2)), afVar2.toString()}, 1848792245, -1848792245, (int) System.currentTimeMillis());
                int i73 = f55430k;
                int i74 = (i73 ^ 101) + ((i73 & 101) << 1);
                f55431l = i74 % 128;
                int i75 = i74 % 2;
                break;
            case 12:
                return e(objArr);
            case 13:
                return f(objArr);
            case 14:
                return d(objArr);
            case 15:
                return b(objArr);
            case 16:
                gv gvVar4 = (gv) objArr[0];
                activateSession activatesession3 = (activateSession) objArr[1];
                setItemChecked setitemchecked2 = (setItemChecked) objArr[2];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[3];
                setDrawSelectorOnTop setdrawselectorontop2 = (setDrawSelectorOnTop) objArr[4];
                byte[] bArr3 = (byte[]) objArr[5];
                int i76 = f55430k;
                int i77 = i76 & 43;
                int i78 = (i77 - (~(-(-((i76 ^ 43) | i77))))) - 1;
                f55431l = i78 % 128;
                if (i78 % 2 == 0) {
                    activateSession.Companion companion = activateSession.INSTANCE;
                    throw null;
                }
                if (activatesession3 == activateSession.N_A) {
                    int i79 = f55430k + 21;
                    f55431l = i79 % 128;
                    if (i79 % 2 == 0) {
                        setItemChecked.Companion companion2 = setItemChecked.INSTANCE;
                        throw null;
                    }
                    if (setitemchecked2 == setItemChecked.setDividerPadding) {
                        int i80 = f55430k;
                        int i81 = i80 & 107;
                        int i82 = i81 + ((i80 ^ 107) | i81);
                        f55431l = i82 % 128;
                        if (i82 % 2 == 0) {
                            setContentCaptureSession.Companion companion3 = setContentCaptureSession.INSTANCE;
                            throw null;
                        }
                        if (setcontentcapturesession2 == setContentCaptureSession.setCompoundDrawableTintBlendMode && setdrawselectorontop2 == setDrawSelectorOnTop.setDividerPadding) {
                            int i83 = f55431l;
                            int i84 = ((i83 ^ 91) | (i83 & 91)) << 1;
                            int i85 = -(((~i83) & 91) | (i83 & (-92)));
                            int i86 = (i84 & i85) + (i85 | i84);
                            f55430k = i86 % 128;
                            int i87 = i86 % 2;
                        }
                    }
                    break;
                }
                y yVar = new y(gvVar4);
                et etVar = et.INSTANCE;
                et.setDividerPadding(new Object[]{gvVar4, yVar}, 1131837414, -1131837413, (int) System.currentTimeMillis());
                aa aaVar = (aa) ((setImageTintList) w.setX(new Object[]{yVar}, 1693919772, -1693919769, System.identityHashCode(yVar)));
                int i88 = f55431l;
                int i89 = (i88 & 51) + (i88 | 51);
                f55430k = i89 % 128;
                int i90 = i89 % 2;
                return aaVar;
            case 17:
                ex exVar7 = (ex) objArr[0];
                gv gvVar5 = (gv) objArr[1];
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[2];
                activateSession activatesession4 = (activateSession) objArr[3];
                ValueQualifier valueQualifier3 = (ValueQualifier) objArr[4];
                byte[] bArr4 = (byte[]) objArr[5];
                fd fdVar2 = (fd) objArr[6];
                getY gety2 = (getY) objArr[7];
                Boolean bool = (Boolean) objArr[8];
                activateSession activatesession5 = (activateSession) objArr[9];
                setItemChecked setitemchecked3 = (setItemChecked) objArr[10];
                byte[] bArr5 = (byte[]) objArr[11];
                setContentCaptureSession setcontentcapturesession3 = (setContentCaptureSession) objArr[12];
                setDrawSelectorOnTop setdrawselectorontop3 = (setDrawSelectorOnTop) objArr[13];
                setSelector setselector = (setSelector) objArr[14];
                byte[] bArr6 = (byte[]) objArr[15];
                byte[] bArr7 = (byte[]) objArr[16];
                Boolean bool2 = (Boolean) objArr[17];
                Byte b11 = (Byte) objArr[18];
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[19];
                boolean zBooleanValue3 = ((Boolean) objArr[20]).booleanValue();
                boolean zBooleanValue4 = ((Boolean) objArr[21]).booleanValue();
                byte[] bArr8 = (byte[]) objArr[22];
                String str = (String) objArr[23];
                activateSession activatesession6 = activateSession.N_A;
                if (activatesession5 == activatesession6 && setitemchecked3 == setItemChecked.setDividerPadding && setcontentcapturesession3 == setContentCaptureSession.setCompoundDrawableTintBlendMode && setdrawselectorontop3 == setDrawSelectorOnTop.setDividerPadding) {
                    obj = null;
                } else {
                    new f(activatesession5, setitemchecked3, setcontentcapturesession3, setdrawselectorontop3, bArr5 == null ? (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()) : bArr5);
                    obj = r6;
                }
                l lVar = (!zBooleanValue4 || (activatesession4 == activatesession6 && valueQualifier3 == ValueQualifier.setOnDragListener)) ? null : new l(activatesession4, valueQualifier3, bArr4 == null ? (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis()) : bArr4, bArr6, setselector, bArr7, bArr8);
                if (zBooleanValue3) {
                    jVar = (j) ez.setOnFocusChangeListener(new Object[]{fdVar2, gety2, bool, bool2, b11, settransitionvisibility, null, null, 192}, -1608764632, 1608764640, 192);
                    i13 = 1;
                    c10 = 0;
                } else {
                    x xVar = new x(gvVar5);
                    i13 = 1;
                    c10 = 0;
                    z zVar = (z) ((setImageTintList) w.setX(new Object[]{xVar}, 1693919772, -1693919769, System.identityHashCode(xVar)));
                    jVar = (j) z.setY(new Object[]{zVar}, 1928645157, -1928645145, System.identityHashCode(zVar));
                }
                Object[] objArr2 = new Object[i13];
                objArr2[c10] = gvVar5;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) gv.setOnFocusChangeListener(objArr2, -977058734, 977058760, System.identityHashCode(gvVar5));
                Object[] objArr3 = new Object[8];
                objArr3[c10] = exVar7;
                objArr3[i13] = gvVar5;
                objArr3[2] = settextkeepstate8;
                objArr3[3] = getbeeponfailure;
                objArr3[4] = jVar;
                objArr3[5] = lVar;
                objArr3[6] = obj;
                objArr3[7] = str;
                return (fk) ez.setOnFocusChangeListener(objArr3, -923790656, 923790670, System.identityHashCode(exVar7));
            case 18:
                af afVar3 = (af) objArr[0];
                activateSession activatesession7 = (activateSession) objArr[1];
                ValueQualifier valueQualifier4 = (ValueQualifier) objArr[2];
                byte[] bArr9 = (byte[]) objArr[3];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[4];
                byte[] bArr10 = (byte[]) objArr[5];
                byte[] bArr11 = (byte[]) objArr[6];
                setSelector setselector2 = (setSelector) objArr[7];
                byte[] bArr12 = (byte[]) objArr[8];
                int i91 = f55430k + 69;
                f55431l = i91 % 128;
                Object[] objArr4 = new Object[9];
                if (i91 % 2 == 0) {
                    objArr4[0] = afVar3;
                    objArr4[1] = activatesession7;
                    objArr4[2] = valueQualifier4;
                    objArr4[3] = bArr9;
                    objArr4[4] = setscrollbardefaultdelaybeforefade4;
                    objArr4[5] = bArr10;
                    objArr4[6] = bArr11;
                    objArr4[7] = setselector2;
                    objArr4[8] = bArr12;
                    setCompoundDrawableTintBlendMode(objArr4, 463892786, -463892778, (int) System.currentTimeMillis());
                    throw null;
                }
                objArr4[0] = afVar3;
                objArr4[1] = activatesession7;
                objArr4[2] = valueQualifier4;
                objArr4[3] = bArr9;
                objArr4[4] = setscrollbardefaultdelaybeforefade4;
                objArr4[5] = bArr10;
                objArr4[6] = bArr11;
                objArr4[7] = setselector2;
                objArr4[8] = bArr12;
                setCompoundDrawableTintBlendMode(objArr4, 463892786, -463892778, (int) System.currentTimeMillis());
                break;
                break;
            default:
                ex exVar8 = (ex) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade5 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate9 = (setTextKeepState) objArr[2];
                int i92 = f55430k + 87;
                f55431l = i92 % 128;
                int i93 = i92 % 2;
                fk fkVar5 = (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar8, (gv) setscrollbardefaultdelaybeforefade5, settextkeepstate9}, -1581020690, 1581020700, System.identityHashCode(exVar8));
                int i94 = f55431l;
                int i95 = i94 | 67;
                int i96 = i95 << 1;
                int i97 = -((~(i94 & 67)) & i95);
                int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                f55430k = i98 % 128;
                if (i98 % 2 == 0) {
                    return fkVar5;
                }
                throw null;
        }
        return null;
    }

    @NotNull
    public final fk setDividerPadding(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, gvVar, settextkeepstate}, 1517844032, -1517844031, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setOnFocusChangeListener(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -875174686, 875174686, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull activateSession activatesession, @NotNull ValueQualifier valueQualifier, boolean z10, @NotNull byte[] bArr) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, activatesession, valueQualifier, Boolean.valueOf(z10), bArr}, 1135469441, -1135469430, System.identityHashCode(this));
    }

    public static /* synthetic */ fk setDividerPadding(ex exVar, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, activateSession activatesession, ValueQualifier valueQualifier, byte[] bArr, fd fdVar, getY gety, Boolean bool, activateSession activatesession2, setItemChecked setitemchecked, byte[] bArr2, setContentCaptureSession setcontentcapturesession, setDrawSelectorOnTop setdrawselectorontop, setSelector setselector, byte[] bArr3, byte[] bArr4, Byte b10, setTransitionVisibility settransitionvisibility, boolean z10, boolean z11, int i10) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar, setscrollbardefaultdelaybeforefade, settextkeepstate, activatesession, valueQualifier, bArr, fdVar, gety, bool, activatesession2, setitemchecked, bArr2, setcontentcapturesession, setdrawselectorontop, setselector, bArr3, bArr4, b10, settransitionvisibility, Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i10)}, 692489642, -692489630, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setCompoundDrawableTintBlendMode(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1762897647, 1762897652, System.identityHashCode(this));
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull setTextKeepState settextkeepstate, @NotNull ae aeVar) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate, aeVar}, -1057960533, 1057960536, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ fk setCompoundDrawableTintBlendMode(ex exVar, gv gvVar, setTextKeepState settextkeepstate, fd fdVar, getY gety, setItemChecked setitemchecked, setContentCaptureSession setcontentcapturesession, setDrawSelectorOnTop setdrawselectorontop, Byte b10, boolean z10, int i10) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{exVar, gvVar, settextkeepstate, fdVar, gety, setitemchecked, setcontentcapturesession, setdrawselectorontop, b10, Boolean.valueOf(z10), Integer.valueOf(i10)}, 146326336, -146326323, i10);
    }
}
