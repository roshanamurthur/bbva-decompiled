package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class hr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56229b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56230c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ex f56231a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56232p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56233q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56234r0 = 1;

        static {
            int i10 = f56233q0;
            int i11 = ((i10 | 111) << 1) - (i10 ^ 111);
            f56234r0 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
            int i14 = ~i12;
            int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
            int i16 = ~i10;
            if ((((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i17 = f56234r0;
                int i18 = ((i17 | 69) << 1) - (i17 ^ 69);
                f56233q0 = i18 % 128;
                int i19 = i18 % 2;
                a(new Object[]{aVar, (cv) obj}, 899751818, -899751817, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                int i20 = f56233q0;
                int i21 = ((i20 & (-34)) | ((~i20) & 33)) + ((i20 & 33) << 1);
                f56234r0 = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            }
            cv cvVar = (cv) objArr[1];
            int i23 = f56234r0;
            int i24 = i23 & 3;
            int i25 = i24 + ((i23 ^ 3) | i24);
            f56233q0 = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
            int i27 = f56233q0;
            int i28 = i27 & 25;
            int i29 = (i27 ^ 25) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f56234r0 = i30 % 128;
            int i31 = i30 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -534169964, 534169964, System.identityHashCode(this));
        }
    }

    public hr(@NotNull ex exVar) {
        Intrinsics.checkNotNullParameter(exVar, "");
        this.f56231a = exVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x017a  */
    /* JADX WARN: Code duplicated, block: B:24:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:31:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:34:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x0321  */
    /* JADX WARN: Code duplicated, block: B:39:0x0330  */
    /* JADX WARN: Code duplicated, block: B:42:0x034e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0368  */
    /* JADX WARN: Code duplicated, block: B:46:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x0447  */
    /* JADX WARN: Code duplicated, block: B:54:0x0469  */
    /* JADX WARN: Code duplicated, block: B:57:0x0492  */
    /* JADX WARN: Code duplicated, block: B:60:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x0515  */
    /* JADX WARN: Code duplicated, block: B:69:0x055f  */
    /* JADX WARN: Code duplicated, block: B:70:0x057f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0591  */
    /* JADX WARN: Code duplicated, block: B:75:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        String str;
        String str2;
        ah ahVar;
        fk fkVar;
        int i13;
        int i14;
        setImageTintList setimagetintlist;
        TransactionFailed transactionFailed;
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2;
        cu cuVar;
        am amVar;
        int i15;
        int i16;
        cq cqVar;
        int i17;
        boolean zBooleanValue;
        TransactionFailed transactionFailed2;
        int i18;
        int i19 = ~((~i10) | i11);
        int i20 = ~i12;
        int i21 = (((~(i20 | i11)) | i19) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i22 = ~i11;
        int i23 = (~(i12 | i22)) | i19;
        int i24 = ~(i20 | i10);
        if ((((~(i10 | i22)) | (~(i22 | i20)) | i24) * 594) + ((i23 | i24) * 594) + i21 != 1) {
            hr hrVar = (hr) objArr[0];
            gv gvVar = (gv) objArr[1];
            setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
            int i25 = f56229b + 45;
            f56230c = i25 % 128;
            int i26 = i25 % 2;
            ex exVar = hrVar.f56231a;
            activateSession activatesession = activateSession.ERROR_OTHER_CARD;
            fk dividerPadding = ex.setDividerPadding(exVar, gvVar, settextkeepstate, activatesession, ValueQualifier.setY, null, fd.END_APPLICATION, null, Boolean.TRUE, activatesession, null, null, setContentCaptureSession.setOnLongClickListener, null, null, null, null, null, null, false, false, 4191824);
            int i27 = f56230c;
            int i28 = (((i27 | 53) << 1) - (~(-(i27 ^ 53)))) - 1;
            f56229b = i28 % 128;
            if (i28 % 2 == 0) {
                return dividerPadding;
            }
            int i29 = 46 / 0;
            return dividerPadding;
        }
        hr hrVar2 = (hr) objArr[0];
        gv gvVar2 = (gv) objArr[1];
        setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
        gz gzVar = (gz) objArr[3];
        getValue getvalue = (getValue) objArr[4];
        int i30 = f56230c;
        int i31 = (i30 & (-100)) | ((~i30) & 99);
        int i32 = (i30 & 99) << 1;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        f56229b = i33 % 128;
        int i34 = i33 % 2;
        Intrinsics.checkNotNullParameter(gvVar2, "");
        Intrinsics.checkNotNullParameter(settextkeepstate2, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        setMaxWidth setmaxwidth = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -836208544, 836208569, System.identityHashCode(gvVar2));
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth}, -852037600, 852037625, System.identityHashCode(setmaxwidth));
        if (getbeeponfailure3 != null) {
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
            if (setscrollcontainer == null) {
                int i35 = f56230c + 105;
                f56229b = i35 % 128;
                if (i35 % 2 != 0) {
                    throw null;
                }
            } else {
                str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                int i36 = f56230c + 57;
                f56229b = i36 % 128;
                int i37 = i36 % 2;
            }
            gv.setOnFocusChangeListener(new Object[]{gvVar2, str}, -64680794, 64680813, System.identityHashCode(gvVar2));
            str2 = (String) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -1126898243, 1126898267, System.identityHashCode(gvVar2));
            if (str2 != null) {
                ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2}, 1437547358, -1437547304, System.identityHashCode(gvVar2));
                if (ahVar != null) {
                    i14 = f56229b + 61;
                    f56230c = i14 % 128;
                    if (i14 % 2 != 0) {
                        setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1115257939, -1115257923, System.identityHashCode(ahVar));
                        ((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue();
                        throw null;
                    }
                    setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1115257939, -1115257923, System.identityHashCode(ahVar));
                    if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() != 0) {
                        av avVar = ahVar.setAlwaysDrawnWithCacheEnabled().setNavigationOnClickListener().get(0);
                        byte bByteValue = ((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue();
                        av avVar2 = ahVar.setAlwaysDrawnWithCacheEnabled().setNavigationOnClickListener().get(0);
                        getvalue.setOnFocusChangeListener(new setText(bByteValue, ((Byte) av.setY(new Object[]{avVar2}, 1262930435, -1262930433, System.identityHashCode(avVar2))).byteValue()));
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(gvVar2));
                        int i38 = f56229b + 40;
                        int i39 = (i38 ^ (-1)) + (i38 << 1);
                        f56230c = i39 % 128;
                        int i40 = i39 % 2;
                    }
                }
                fkVar = (fk) setOnFocusChangeListener(new Object[]{hrVar2, gvVar2, settextkeepstate2}, -1257828729, 1257828729, System.identityHashCode(hrVar2));
                int i41 = f56229b;
                int i42 = i41 & 33;
                i13 = i42 + ((i41 ^ 33) | i42);
                f56230c = i13 % 128;
                if (i13 % 2 == 0) {
                    return fkVar;
                }
                int i43 = 11 / 0;
                return fkVar;
            }
            getvalue.setOnFocusChangeListener(new setDrawingCacheQuality(setInputExtras.setOnFocusChangeListener(str2, 2)));
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, setSupportBackgroundTintMode.setY}, 346983986, -346983929, System.identityHashCode(gvVar2));
            int i44 = f56229b;
            int i45 = i44 & 19;
            int i46 = -(-(i44 | 19));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            f56230c = i47 % 128;
            int i48 = i47 % 2;
            gv.setOnFocusChangeListener(new Object[]{gvVar2}, -1470087264, 1470087294, System.identityHashCode(gvVar2));
            setAnimation setanimation = setAnimation.INSTANCE;
            transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis());
            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -1557508936, 1557508986, System.identityHashCode(gvVar2))).booleanValue()) {
                int i49 = f56230c;
                int i50 = ((i49 ^ 81) | (i49 & 81)) << 1;
                int i51 = -((i49 & (-82)) | (81 & (~i49)));
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                f56229b = i52 % 128;
                int i53 = i52 % 2;
                transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis());
                if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -1557508936, 1557508986, System.identityHashCode(gvVar2))).booleanValue())) {
                    int i54 = f56230c;
                    int i55 = i54 & 89;
                    i18 = i55 + ((i54 ^ 89) | i55);
                    f56229b = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i56 = 46 / 0;
                        if (((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -836208544, 836208569, System.identityHashCode(gvVar2))).size() == 0) {
                            gz.setCompoundDrawableTintBlendMode(new Object[]{gzVar, gvVar2}, -253416445, 253416445, (int) System.currentTimeMillis());
                            getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                            if (getbeeponfailure != null) {
                                System.identityHashCode(hrVar2);
                                System.identityHashCode(hrVar2);
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                                int i57 = f56229b;
                                int i58 = ((i57 & (-92)) | ((~i57) & 91)) + ((i57 & 91) << 1);
                                f56230c = i58 % 128;
                                int i59 = i58 % 2;
                            }
                            getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                            if (getbeeponfailure2 != null) {
                                int i60 = f56230c;
                                int i61 = ((i60 & 90) + (i60 | 90)) - 1;
                                f56229b = i61 % 128;
                                int i62 = i61 % 2;
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                                System.identityHashCode(hrVar2);
                                System.identityHashCode(hrVar2);
                            }
                        }
                    } else if (((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -836208544, 836208569, System.identityHashCode(gvVar2))).size() == 0) {
                        gz.setCompoundDrawableTintBlendMode(new Object[]{gzVar, gvVar2}, -253416445, 253416445, (int) System.currentTimeMillis());
                        getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                        if (getbeeponfailure != null) {
                            System.identityHashCode(hrVar2);
                            System.identityHashCode(hrVar2);
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                            int i510 = f56229b;
                            int i511 = ((i510 & (-92)) | ((~i510) & 91)) + ((i510 & 91) << 1);
                            f56230c = i511 % 128;
                            int i512 = i511 % 2;
                        }
                        getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                        if (getbeeponfailure2 != null) {
                            int i63 = f56230c;
                            int i64 = ((i63 & 90) + (i63 | 90)) - 1;
                            f56229b = i64 % 128;
                            int i65 = i64 % 2;
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                            System.identityHashCode(hrVar2);
                            System.identityHashCode(hrVar2);
                        }
                    }
                }
            } else {
                gz.setCompoundDrawableTintBlendMode(new Object[]{gzVar, gvVar2}, -253416445, 253416445, (int) System.currentTimeMillis());
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                if (getbeeponfailure != null) {
                    System.identityHashCode(hrVar2);
                    System.identityHashCode(hrVar2);
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                    int i513 = f56229b;
                    int i514 = ((i513 & (-92)) | ((~i513) & 91)) + ((i513 & 91) << 1);
                    f56230c = i514 % 128;
                    int i515 = i514 % 2;
                }
                getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                if (getbeeponfailure2 != null) {
                    int i66 = f56230c;
                    int i67 = ((i66 & 90) + (i66 | 90)) - 1;
                    f56229b = i67 % 128;
                    int i68 = i67 % 2;
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                    System.identityHashCode(hrVar2);
                    System.identityHashCode(hrVar2);
                }
            }
            aq aqVar = new aq(gvVar2);
            cuVar = new cu(gvVar2);
            amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
            if (((Boolean) am.setY(new Object[]{amVar}, -452511308, 452511311, System.identityHashCode(amVar))).booleanValue()) {
                int i69 = f56230c;
                int i70 = ((i69 ^ 61) | (i69 & 61)) << 1;
                int i71 = -(((~i69) & 61) | (i69 & (-62)));
                i16 = (i70 ^ i71) + ((i71 & i70) << 1);
                f56229b = i16 % 128;
                if (i16 % 2 != 0) {
                    cq cqVar2 = (cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar)));
                    zBooleanValue = ((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar2}, 368924951, -368924943, System.identityHashCode(cqVar2))).booleanValue();
                    int i72 = 49 / 0;
                    if (!zBooleanValue) {
                        cz czVar = new cz(gvVar2);
                        int i73 = f56230c;
                        i15 = (((i73 & (-56)) | ((~i73) & 55)) - (~(-(-((i73 & 55) << 1))))) - 1;
                        f56229b = i15 % 128;
                    } else {
                        int i74 = f56229b;
                        int i75 = (i74 & (-106)) | ((~i74) & 105);
                        int i76 = (i74 & 105) << 1;
                        i17 = ((i75 | i76) << 1) - (i76 ^ i75);
                        f56230c = i17 % 128;
                        if (i17 % 2 == 0) {
                            gv.setOnFocusChangeListener(new Object[]{gvVar2, Byte.valueOf(UByte.m5545constructorimpl((byte) 66))}, -73894317, 73894323, System.identityHashCode(gvVar2));
                        } else {
                            gv.setOnFocusChangeListener(new Object[]{gvVar2, Byte.valueOf(UByte.m5545constructorimpl((byte) -128))}, -73894317, 73894323, System.identityHashCode(gvVar2));
                        }
                        int i77 = f56229b;
                        i15 = ((i77 ^ 65) - (~(-(-((i77 & 65) << 1))))) - 1;
                        f56230c = i15 % 128;
                    }
                } else {
                    cqVar = (cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar)));
                    if (!((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 368924951, -368924943, System.identityHashCode(cqVar))).booleanValue()) {
                        cz czVar2 = new cz(gvVar2);
                        int i78 = f56230c;
                        i15 = (((i78 & (-56)) | ((~i78) & 55)) - (~(-(-((i78 & 55) << 1))))) - 1;
                        f56229b = i15 % 128;
                    } else {
                        int i79 = f56229b;
                        int i710 = (i79 & (-106)) | ((~i79) & 105);
                        int i711 = (i79 & 105) << 1;
                        i17 = ((i710 | i711) << 1) - (i711 ^ i710);
                        f56230c = i17 % 128;
                        if (i17 % 2 == 0) {
                            gv.setOnFocusChangeListener(new Object[]{gvVar2, Byte.valueOf(UByte.m5545constructorimpl((byte) 66))}, -73894317, 73894323, System.identityHashCode(gvVar2));
                        } else {
                            gv.setOnFocusChangeListener(new Object[]{gvVar2, Byte.valueOf(UByte.m5545constructorimpl((byte) -128))}, -73894317, 73894323, System.identityHashCode(gvVar2));
                        }
                        int i712 = f56229b;
                        i15 = ((i712 ^ 65) - (~(-(-((i712 & 65) << 1))))) - 1;
                        f56230c = i15 % 128;
                    }
                }
            } else {
                cz czVar3 = new cz(gvVar2);
                int i713 = f56230c;
                i15 = (((i713 & (-56)) | ((~i713) & 55)) - (~(-(-((i713 & 55) << 1))))) - 1;
                f56229b = i15 % 128;
            }
            int i80 = i15 % 2;
            if (((setSupportBackgroundTintMode) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2}, 568936545, -568936540, System.identityHashCode(gvVar2))) == setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode) {
                fk fkVar2 = fk.setNavigationOnClickListener;
                int i81 = f56230c;
                int i82 = i81 & 57;
                int i83 = (i82 - (~((i81 ^ 57) | i82))) - 1;
                f56229b = i83 % 128;
                int i84 = i83 % 2;
                return fkVar2;
            }
            int i85 = f56230c;
            int i86 = i85 & 33;
            int i87 = i85 | 33;
            int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
            f56229b = i88 % 128;
            int i89 = i88 % 2;
            fk fkVar3 = fk.setOnDragListener;
            int i90 = f56230c;
            int i91 = (i90 ^ 19) + ((i90 & 19) << 1);
            f56229b = i91 % 128;
            int i92 = i91 % 2;
            return fkVar3;
        }
        int i93 = f56230c;
        int i94 = ((i93 & 39) - (~(i93 | 39))) - 1;
        int i95 = i94 % 128;
        f56229b = i95;
        if (i94 % 2 != 0) {
            throw null;
        }
        int i96 = i95 & 69;
        int i97 = ((i95 | 69) & (~i96)) + (i96 << 1);
        f56230c = i97 % 128;
        int i98 = i97 % 2;
        str = null;
        gv.setOnFocusChangeListener(new Object[]{gvVar2, str}, -64680794, 64680813, System.identityHashCode(gvVar2));
        str2 = (String) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -1126898243, 1126898267, System.identityHashCode(gvVar2));
        if (str2 != null) {
            ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2}, 1437547358, -1437547304, System.identityHashCode(gvVar2));
            if (ahVar != null) {
                i14 = f56229b + 61;
                f56230c = i14 % 128;
                if (i14 % 2 != 0) {
                    setImageTintList setimagetintlist3 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1115257939, -1115257923, System.identityHashCode(ahVar));
                    ((Integer) setImageTintList.setX(new Object[]{setimagetintlist3}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist3))).intValue();
                    throw null;
                }
                setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1115257939, -1115257923, System.identityHashCode(ahVar));
                if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() != 0) {
                    av avVar3 = ahVar.setAlwaysDrawnWithCacheEnabled().setNavigationOnClickListener().get(0);
                    byte bByteValue2 = ((Byte) av.setY(new Object[]{avVar3}, -888174800, 888174800, System.identityHashCode(avVar3))).byteValue();
                    av avVar4 = ahVar.setAlwaysDrawnWithCacheEnabled().setNavigationOnClickListener().get(0);
                    getvalue.setOnFocusChangeListener(new setText(bByteValue2, ((Byte) av.setY(new Object[]{avVar4}, 1262930435, -1262930433, System.identityHashCode(avVar4))).byteValue()));
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(gvVar2));
                    int i310 = f56229b + 40;
                    int i311 = (i310 ^ (-1)) + (i310 << 1);
                    f56230c = i311 % 128;
                    int i410 = i311 % 2;
                }
            }
            fkVar = (fk) setOnFocusChangeListener(new Object[]{hrVar2, gvVar2, settextkeepstate2}, -1257828729, 1257828729, System.identityHashCode(hrVar2));
            int i411 = f56229b;
            int i412 = i411 & 33;
            i13 = i412 + ((i411 ^ 33) | i412);
            f56230c = i13 % 128;
            if (i13 % 2 == 0) {
                return fkVar;
            }
            int i413 = 11 / 0;
            return fkVar;
        }
        getvalue.setOnFocusChangeListener(new setDrawingCacheQuality(setInputExtras.setOnFocusChangeListener(str2, 2)));
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, setSupportBackgroundTintMode.setY}, 346983986, -346983929, System.identityHashCode(gvVar2));
        int i414 = f56229b;
        int i415 = i414 & 19;
        int i416 = -(-(i414 | 19));
        int i417 = (i415 ^ i416) + ((i416 & i415) << 1);
        f56230c = i417 % 128;
        int i418 = i417 % 2;
        gv.setOnFocusChangeListener(new Object[]{gvVar2}, -1470087264, 1470087294, System.identityHashCode(gvVar2));
        setAnimation setanimation2 = setAnimation.INSTANCE;
        transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis());
        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -1557508936, 1557508986, System.identityHashCode(gvVar2))).booleanValue()) {
            int i419 = f56230c;
            int i516 = ((i419 ^ 81) | (i419 & 81)) << 1;
            int i517 = -((i419 & (-82)) | (81 & (~i419)));
            int i518 = ((i516 | i517) << 1) - (i517 ^ i516);
            f56229b = i518 % 128;
            int i519 = i518 % 2;
            transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis());
            if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -1557508936, 1557508986, System.identityHashCode(gvVar2))).booleanValue())) {
                int i520 = f56230c;
                int i521 = i520 & 89;
                i18 = i521 + ((i520 ^ 89) | i521);
                f56229b = i18 % 128;
                if (i18 % 2 != 0) {
                    int i522 = 46 / 0;
                    if (((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -836208544, 836208569, System.identityHashCode(gvVar2))).size() == 0) {
                        gz.setCompoundDrawableTintBlendMode(new Object[]{gzVar, gvVar2}, -253416445, 253416445, (int) System.currentTimeMillis());
                        getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                        if (getbeeponfailure != null) {
                            System.identityHashCode(hrVar2);
                            System.identityHashCode(hrVar2);
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                            int i5110 = f56229b;
                            int i5111 = ((i5110 & (-92)) | ((~i5110) & 91)) + ((i5110 & 91) << 1);
                            f56230c = i5111 % 128;
                            int i5112 = i5111 % 2;
                        }
                        getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                        if (getbeeponfailure2 != null) {
                            int i610 = f56230c;
                            int i611 = ((i610 & 90) + (i610 | 90)) - 1;
                            f56229b = i611 % 128;
                            int i612 = i611 % 2;
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                            System.identityHashCode(hrVar2);
                            System.identityHashCode(hrVar2);
                        }
                    }
                } else if (((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -836208544, 836208569, System.identityHashCode(gvVar2))).size() == 0) {
                    gz.setCompoundDrawableTintBlendMode(new Object[]{gzVar, gvVar2}, -253416445, 253416445, (int) System.currentTimeMillis());
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                    if (getbeeponfailure != null) {
                        System.identityHashCode(hrVar2);
                        System.identityHashCode(hrVar2);
                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                        int i5113 = f56229b;
                        int i5114 = ((i5113 & (-92)) | ((~i5113) & 91)) + ((i5113 & 91) << 1);
                        f56230c = i5114 % 128;
                        int i5115 = i5114 % 2;
                    }
                    getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                    if (getbeeponfailure2 != null) {
                        int i613 = f56230c;
                        int i614 = ((i613 & 90) + (i613 | 90)) - 1;
                        f56229b = i614 % 128;
                        int i615 = i614 % 2;
                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                        System.identityHashCode(hrVar2);
                        System.identityHashCode(hrVar2);
                    }
                }
            }
        } else {
            gz.setCompoundDrawableTintBlendMode(new Object[]{gzVar, gvVar2}, -253416445, 253416445, (int) System.currentTimeMillis());
            getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
            if (getbeeponfailure != null) {
                System.identityHashCode(hrVar2);
                System.identityHashCode(hrVar2);
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                int i5116 = f56229b;
                int i5117 = ((i5116 & (-92)) | ((~i5116) & 91)) + ((i5116 & 91) << 1);
                f56230c = i5117 % 128;
                int i5118 = i5117 % 2;
            }
            getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
            if (getbeeponfailure2 != null) {
                int i616 = f56230c;
                int i617 = ((i616 & 90) + (i616 | 90)) - 1;
                f56229b = i617 % 128;
                int i618 = i617 % 2;
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                System.identityHashCode(hrVar2);
                System.identityHashCode(hrVar2);
            }
        }
        aq aqVar2 = new aq(gvVar2);
        cuVar = new cu(gvVar2);
        amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar2}, 1693919772, -1693919769, System.identityHashCode(aqVar2)));
        if (((Boolean) am.setY(new Object[]{amVar}, -452511308, 452511311, System.identityHashCode(amVar))).booleanValue()) {
            int i619 = f56230c;
            int i714 = ((i619 ^ 61) | (i619 & 61)) << 1;
            int i715 = -(((~i619) & 61) | (i619 & (-62)));
            i16 = (i714 ^ i715) + ((i715 & i714) << 1);
            f56229b = i16 % 128;
            if (i16 % 2 != 0) {
                cq cqVar3 = (cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar)));
                zBooleanValue = ((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar3}, 368924951, -368924943, System.identityHashCode(cqVar3))).booleanValue();
                int i716 = 49 / 0;
                if (!zBooleanValue) {
                    cz czVar4 = new cz(gvVar2);
                    int i717 = f56230c;
                    i15 = (((i717 & (-56)) | ((~i717) & 55)) - (~(-(-((i717 & 55) << 1))))) - 1;
                    f56229b = i15 % 128;
                } else {
                    int i718 = f56229b;
                    int i719 = (i718 & (-106)) | ((~i718) & 105);
                    int i7110 = (i718 & 105) << 1;
                    i17 = ((i719 | i7110) << 1) - (i7110 ^ i719);
                    f56230c = i17 % 128;
                    if (i17 % 2 == 0) {
                        gv.setOnFocusChangeListener(new Object[]{gvVar2, Byte.valueOf(UByte.m5545constructorimpl((byte) 66))}, -73894317, 73894323, System.identityHashCode(gvVar2));
                    } else {
                        gv.setOnFocusChangeListener(new Object[]{gvVar2, Byte.valueOf(UByte.m5545constructorimpl((byte) -128))}, -73894317, 73894323, System.identityHashCode(gvVar2));
                    }
                    int i7111 = f56229b;
                    i15 = ((i7111 ^ 65) - (~(-(-((i7111 & 65) << 1))))) - 1;
                    f56230c = i15 % 128;
                }
            } else {
                cqVar = (cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar)));
                if (!((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 368924951, -368924943, System.identityHashCode(cqVar))).booleanValue()) {
                    cz czVar5 = new cz(gvVar2);
                    int i7112 = f56230c;
                    i15 = (((i7112 & (-56)) | ((~i7112) & 55)) - (~(-(-((i7112 & 55) << 1))))) - 1;
                    f56229b = i15 % 128;
                } else {
                    int i7113 = f56229b;
                    int i7114 = (i7113 & (-106)) | ((~i7113) & 105);
                    int i7115 = (i7113 & 105) << 1;
                    i17 = ((i7114 | i7115) << 1) - (i7115 ^ i7114);
                    f56230c = i17 % 128;
                    if (i17 % 2 == 0) {
                        gv.setOnFocusChangeListener(new Object[]{gvVar2, Byte.valueOf(UByte.m5545constructorimpl((byte) 66))}, -73894317, 73894323, System.identityHashCode(gvVar2));
                    } else {
                        gv.setOnFocusChangeListener(new Object[]{gvVar2, Byte.valueOf(UByte.m5545constructorimpl((byte) -128))}, -73894317, 73894323, System.identityHashCode(gvVar2));
                    }
                    int i7116 = f56229b;
                    i15 = ((i7116 ^ 65) - (~(-(-((i7116 & 65) << 1))))) - 1;
                    f56230c = i15 % 128;
                }
            }
        } else {
            cz czVar6 = new cz(gvVar2);
            int i7117 = f56230c;
            i15 = (((i7117 & (-56)) | ((~i7117) & 55)) - (~(-(-((i7117 & 55) << 1))))) - 1;
            f56229b = i15 % 128;
        }
        int i810 = i15 % 2;
        if (((setSupportBackgroundTintMode) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2}, 568936545, -568936540, System.identityHashCode(gvVar2))) == setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode) {
            fk fkVar4 = fk.setNavigationOnClickListener;
            int i811 = f56230c;
            int i812 = i811 & 57;
            int i813 = (i812 - (~((i811 ^ 57) | i812))) - 1;
            f56229b = i813 % 128;
            int i814 = i813 % 2;
            return fkVar4;
        }
        int i815 = f56230c;
        int i816 = i815 & 33;
        int i817 = i815 | 33;
        int i818 = ((i816 | i817) << 1) - (i817 ^ i816);
        f56229b = i818 % 128;
        int i819 = i818 % 2;
        fk fkVar5 = fk.setOnDragListener;
        int i99 = f56230c;
        int i910 = (i99 ^ 19) + ((i99 & 19) << 1);
        f56229b = i910 % 128;
        int i911 = i910 % 2;
        return fkVar5;
    }

    @NotNull
    public final fk setY(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull gz gzVar, @NotNull getValue getvalue) {
        return (fk) setOnFocusChangeListener(new Object[]{this, gvVar, settextkeepstate, gzVar, getvalue}, -1673391252, 1673391253, System.identityHashCode(this));
    }
}
