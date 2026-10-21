package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class hz extends hi {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56306l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final getValue f56307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final et f56308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final id f56309k;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public hz f56310p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public setRotationX f56311q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f56312r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f56314t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f56312r0 = objArr[1];
            int i10 = aVar.f56314t0;
            int i11 = i10 & Integer.MIN_VALUE;
            int i12 = (i10 | Integer.MIN_VALUE) & (~i11);
            aVar.f56314t0 = (i12 & i11) | (i12 ^ i11);
            hz hzVar = hz.this;
            return hz.setDividerPadding(new Object[]{hzVar, null, aVar}, -1228580271, 1228580275, System.identityHashCode(hzVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull et etVar, @NotNull setContentDescription setcontentdescription, @NotNull di diVar) {
        super(gvVar, settextkeepstate, exVar, getvalue);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(etVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        this.f56307i = getvalue;
        this.f56308j = etVar;
        this.f56309k = new id(exVar, etVar, diVar, setcontentdescription);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x03cb, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r3, (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r6}, 1914607362, -1914607356, java.lang.System.identityHashCode(r6))}, 2064855914, -2064855856, java.lang.System.identityHashCode(r3))).booleanValue() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0402, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r3, (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r6}, 1914607362, -1914607356, java.lang.System.identityHashCode(r6))}, 2064855914, -2064855856, java.lang.System.identityHashCode(r3))).booleanValue()) != true) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.hz.a(java.lang.Object[]):java.lang.Boolean");
    }

    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x0406  */
    /* JADX WARN: Code duplicated, block: B:52:0x040a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0417  */
    /* JADX WARN: Code duplicated, block: B:56:0x042e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0670  */
    /* JADX WARN: Code duplicated, block: B:89:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0754  */
    /* JADX WARN: Code duplicated, block: B:94:0x0756  */
    /* JADX WARN: Code duplicated, block: B:97:0x078c  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        a aVar;
        fk fkVar;
        int i13;
        hz hzVar;
        fk fkVar2;
        ex x4;
        gv onFocusChangeListener;
        setTextKeepState compoundDrawableTintBlendMode;
        activateSession activatesession;
        ValueQualifier valueQualifier;
        byte[] bArr;
        boolean zBooleanValue;
        id idVar;
        int i14;
        int i15 = ~((~i10) | i11);
        int i16 = ~((~i11) | i10);
        int i17 = ~(i10 | i12);
        int i18 = ((i17 | i16) * 658) + (i16 * 658) + ((i15 | i16 | i17) * (-658)) + (i11 * (-657)) + (i10 * 659);
        if (i18 == 1) {
            hz hzVar2 = (hz) objArr[0];
            setRotationX setrotationx = (setRotationX) objArr[1];
            int i19 = m;
            int i20 = i19 & 77;
            int i21 = i20 + ((i19 ^ 77) | i20);
            f56306l = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(setrotationx, "");
            et etVar = hzVar2.f56308j;
            et.setDividerPadding(new Object[]{hzVar2.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
            ex x6 = hzVar2.setX();
            gv onFocusChangeListener2 = hzVar2.setOnFocusChangeListener();
            setTextKeepState compoundDrawableTintBlendMode2 = hzVar2.setCompoundDrawableTintBlendMode();
            activateSession activatesession2 = activateSession.PRESENT_CARD_AGAIN;
            ValueQualifier valueQualifier2 = ValueQualifier.setOnFocusChangeListener;
            byte[] bArr2 = new byte[3];
            int i23 = m;
            int i24 = i23 ^ 113;
            int i25 = ((i23 & 113) | i24) << 1;
            int i26 = -i24;
            int i27 = (i25 & i26) + (i25 | i26);
            f56306l = i27 % 128;
            int i28 = i27 % 2;
            int i29 = 0;
            while (i29 < 3) {
                int i30 = m;
                int i31 = ((i30 ^ 70) + ((i30 & 70) << 1)) - 1;
                f56306l = i31 % 128;
                if (i31 % 2 != 0) {
                    bArr2[i29] = 1;
                } else {
                    bArr2[i29] = 0;
                    i29 = ((i29 & 1) << 1) + (i29 ^ 1);
                }
            }
            fk dividerPadding = ex.setDividerPadding(x6, onFocusChangeListener2, compoundDrawableTintBlendMode2, activatesession2, valueQualifier2, bArr2, fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.FALSE, activateSession.PRESENT_CARD_AGAIN, (setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx)), null, null, null, null, null, null, null, null, false, false, 4193280);
            int i32 = f56306l;
            int i33 = (i32 & (-122)) | ((~i32) & 121);
            int i34 = -(-((i32 & 121) << 1));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            m = i35 % 128;
            if (i35 % 2 != 0) {
                return dividerPadding;
            }
            throw null;
        }
        if (i18 == 2) {
            com.mypinpad.tsdk.isolation.a aVar2 = (com.mypinpad.tsdk.isolation.a) objArr[1];
            int i36 = m;
            int i37 = i36 ^ 81;
            int i38 = ((((i36 & 81) | i37) << 1) - (~(-i37))) - 1;
            f56306l = i38 % 128;
            int i39 = i38 % 2;
            Intrinsics.checkNotNullParameter(aVar2, "");
            fk fkVar3 = fk.setAlwaysDrawnWithCacheEnabled;
            int i40 = m + 125;
            f56306l = i40 % 128;
            int i41 = i40 % 2;
            return fkVar3;
        }
        if (i18 == 3) {
            return a(objArr);
        }
        if (i18 != 4) {
            int i42 = m;
            int i43 = i42 ^ 85;
            int i44 = -(-((i42 & 85) << 1));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            f56306l = i45 % 128;
            if (i45 % 2 != 0) {
                fk fkVar4 = fk.setX;
                throw null;
            }
            fk fkVar5 = fk.setAlwaysDrawnWithCacheEnabled;
            int i46 = f56306l;
            int i47 = ((i46 ^ 126) + ((i46 & 126) << 1)) - 1;
            m = i47 % 128;
            int i48 = i47 % 2;
            return fkVar5;
        }
        hz hzVar3 = (hz) objArr[0];
        setRotationX setrotationx2 = (setRotationX) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i49 = f56306l;
        int i50 = (i49 & 73) + (i49 | 73);
        m = i50 % 128;
        int i51 = i50 % 2;
        if (!(!(continuation instanceof a))) {
            int i52 = ((i49 & 32) + (i49 | 32)) - 1;
            int i53 = i52 % 128;
            m = i53;
            int i54 = i52 % 2;
            aVar = (a) continuation;
            int i55 = aVar.f56314t0;
            if ((i55 & Integer.MIN_VALUE) != 0) {
                int i56 = (i53 ^ 100) + ((i53 & 100) << 1);
                int i57 = (i56 ^ (-1)) + (i56 << 1);
                f56306l = i57 % 128;
                int i58 = i57 % 2;
                int iIdentityHashCode = System.identityHashCode(hzVar3);
                int i59 = i55 * TypedValues.MotionType.TYPE_EASING;
                int i60 = ~iIdentityHashCode;
                int i61 = (Integer.MAX_VALUE & (~i60)) | (i60 & Integer.MIN_VALUE) | (Integer.MAX_VALUE & i60);
                int i62 = ~i61;
                int i63 = (i61 | i62) & i62;
                int i64 = i55 & i63;
                int i65 = (~i64) & (i63 | i55);
                int i66 = ((i65 & i64) | (i65 ^ i64)) * (-602);
                int i67 = i59 & i66;
                int i68 = (((i66 | i59) & (~i67)) - (~(i67 << 1))) - 1;
                int i69 = ~i55;
                int i70 = Integer.MAX_VALUE ^ i69;
                int i71 = Integer.MAX_VALUE & i69;
                int i72 = ~((i71 & i70) | (i70 ^ i71));
                int i73 = Integer.MAX_VALUE & iIdentityHashCode;
                int i74 = ~(i73 | ((~i73) & (Integer.MAX_VALUE | iIdentityHashCode)));
                int i75 = (i72 & i74) | (i72 ^ i74);
                int i76 = i60 & (i60 | iIdentityHashCode);
                int i77 = i76 | Integer.MIN_VALUE;
                int i78 = i77 & i55;
                int i79 = (i77 | i55) & (~i78);
                int i80 = ~((i79 & i78) | (i79 ^ i78));
                int i81 = -(-(((i75 & i80) | (i75 ^ i80)) * (-301)));
                int i82 = ((i68 ^ i81) | (i68 & i81)) << 1;
                int i83 = -(((~i68) & i81) | ((~i81) & i68));
                int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                int i85 = i76 & i55;
                int i86 = (i76 | i55) & (~i85);
                int i87 = (i86 & i85) | (i86 ^ i85);
                int i88 = ~i87;
                int i89 = ((i87 | i88) & i88) * 301;
                int i90 = i84 & i89;
                int i91 = -(-((i89 ^ i84) | i90));
                aVar.f56314t0 = (i90 ^ i91) + ((i91 & i90) << 1);
                int i92 = m;
                int i93 = (i92 & 31) + (i92 | 31);
                f56306l = i93 % 128;
                int i94 = i93 % 2;
            } else {
                aVar = hzVar3.new a(continuation);
                int i95 = f56306l;
                int i96 = (-2) - (((i95 ^ 122) + ((i95 & 122) << 1)) ^ (-1));
                m = i96 % 128;
                int i97 = i96 % 2;
            }
        } else {
            aVar = hzVar3.new a(continuation);
            int i98 = f56306l;
            int i99 = (-2) - (((i98 ^ 122) + ((i98 & 122) << 1)) ^ (-1));
            m = i99 % 128;
            int i910 = i99 % 2;
        }
        Object dividerPadding2 = aVar.f56312r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i100 = aVar.f56314t0;
        if (i100 == 0) {
            ResultKt.throwOnFailure(dividerPadding2);
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{20020, null, 6}, 1336485880, -1336485874, 20020);
            if (!((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
                int i101 = m;
                int i102 = ((i101 & 116) + (i101 | 116)) - 1;
                f56306l = i102 % 128;
                int i103 = i102 % 2;
                id idVar2 = hzVar3.f56309k;
                fk fkVar6 = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar2, hzVar3.setOnFocusChangeListener(), hzVar3.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setLayoutAnimation, (byte[]) setRotationX.setX(new Object[]{setrotationx2}, 1043258083, -1043258081, System.identityHashCode(setrotationx2))}, -2039282543, 2039282552, System.identityHashCode(idVar2));
                int i104 = f56306l;
                int i105 = i104 & 5;
                int i106 = i105 + ((i104 ^ 5) | i105);
                m = i106 % 128;
                if (i106 % 2 != 0) {
                    return fkVar6;
                }
                throw null;
            }
            boolean zBooleanValue2 = ((Boolean) setDividerPadding(new Object[]{setrotationx2, hzVar3.setOnFocusChangeListener()}, -190660859, 190660862, (int) System.currentTimeMillis())).booleanValue();
            id idVar3 = hzVar3.f56309k;
            if (!zBooleanValue2) {
                int i107 = f56306l + 11;
                m = i107 % 128;
                if (i107 % 2 != 0) {
                    return (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar3, hzVar3.setOnFocusChangeListener(), hzVar3.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setNavigationOnClickListener}, 1685816426, -1685816419, (int) System.currentTimeMillis());
                }
                throw null;
            }
            gv onFocusChangeListener3 = hzVar3.setOnFocusChangeListener();
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis());
            String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis());
            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))})}, 318904434, -318904411, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
                int i108 = f56306l;
                int i109 = (i108 & 95) + (i108 | 95);
                m = i109 % 128;
                if (i109 % 2 == 0) {
                    fkVar2 = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar3, hzVar3.setOnFocusChangeListener(), hzVar3.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setOnFocusChangeListener}, 1685816426, -1685816419, (int) System.currentTimeMillis());
                    int i110 = 98 / 0;
                } else {
                    fkVar2 = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar3, hzVar3.setOnFocusChangeListener(), hzVar3.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setOnFocusChangeListener}, 1685816426, -1685816419, (int) System.currentTimeMillis());
                }
                int i111 = m;
                int i112 = i111 & 107;
                int i113 = -(-(i111 | 107));
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                f56306l = i114 % 128;
                int i115 = i114 % 2;
                return fkVar2;
            }
            hk hkVar = new hk(hzVar3.setOnFocusChangeListener());
            hg hgVar = (hg) ((setImageTintList) w.setX(new Object[]{hkVar}, 1693919772, -1693919769, System.identityHashCode(hkVar)));
            setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) hg.setDividerPadding(new Object[]{hgVar}, 1836375893, -1836375891, System.identityHashCode(hgVar));
            gv onFocusChangeListener4 = hzVar3.setOnFocusChangeListener();
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener4));
            Intrinsics.checkNotNull(getbeeponfailure);
            byte b10 = (byte) (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0] & Constants.CVR_B2b87_11_RFU);
            if (b10 == 64) {
                int i116 = m;
                int i117 = (i116 ^ 95) + ((i116 & 95) << 1);
                f56306l = i117 % 128;
                int i118 = i117 % 2;
                if (setfitssystemwindows != setFitsSystemWindows.setDividerPadding) {
                    if (b10 == -128) {
                        int i119 = f56306l + 31;
                        m = i119 % 128;
                        int i120 = i119 % 2;
                        if (setfitssystemwindows != setFitsSystemWindows.setDividerPadding) {
                            int i121 = m;
                            int i122 = (((i121 & (-98)) | ((~i121) & 97)) - (~((i121 & 97) << 1))) - 1;
                            f56306l = i122 % 128;
                            int i123 = i122 % 2;
                            if (setfitssystemwindows != setFitsSystemWindows.setX) {
                                if (b10 != 0) {
                                    fkVar = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar3, hzVar3.setOnFocusChangeListener(), hzVar3.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setOnLongClickListener}, 1685816426, -1685816419, (int) System.currentTimeMillis());
                                    i13 = m + 115;
                                    f56306l = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        return fkVar;
                                    }
                                    throw null;
                                }
                            }
                        }
                    } else if (b10 != 0) {
                        fkVar = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar3, hzVar3.setOnFocusChangeListener(), hzVar3.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setOnLongClickListener}, 1685816426, -1685816419, (int) System.currentTimeMillis());
                        i13 = m + 115;
                        f56306l = i13 % 128;
                        if (i13 % 2 == 0) {
                            return fkVar;
                        }
                        throw null;
                    }
                }
            } else if (b10 == -128) {
                int i1110 = f56306l + 31;
                m = i1110 % 128;
                int i124 = i1110 % 2;
                if (setfitssystemwindows != setFitsSystemWindows.setDividerPadding) {
                    int i125 = m;
                    int i126 = (((i125 & (-98)) | ((~i125) & 97)) - (~((i125 & 97) << 1))) - 1;
                    f56306l = i126 % 128;
                    int i127 = i126 % 2;
                    if (setfitssystemwindows != setFitsSystemWindows.setX) {
                        if (b10 != 0) {
                            fkVar = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar3, hzVar3.setOnFocusChangeListener(), hzVar3.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setOnLongClickListener}, 1685816426, -1685816419, (int) System.currentTimeMillis());
                            i13 = m + 115;
                            f56306l = i13 % 128;
                            if (i13 % 2 == 0) {
                                return fkVar;
                            }
                            throw null;
                        }
                    }
                }
            } else if (b10 != 0) {
                fkVar = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar3, hzVar3.setOnFocusChangeListener(), hzVar3.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setOnLongClickListener}, 1685816426, -1685816419, (int) System.currentTimeMillis());
                i13 = m + 115;
                f56306l = i13 % 128;
                if (i13 % 2 == 0) {
                    return fkVar;
                }
                throw null;
            }
            new ic();
            gv onFocusChangeListener5 = hzVar3.setOnFocusChangeListener();
            setTextKeepState compoundDrawableTintBlendMode3 = hzVar3.setCompoundDrawableTintBlendMode();
            aVar.f56310p0 = hzVar3;
            aVar.f56311q0 = setrotationx2;
            aVar.f56314t0 = 1;
            dividerPadding2 = ic.setDividerPadding(new Object[]{onFocusChangeListener5, compoundDrawableTintBlendMode3, hzVar3.f56307i, aVar}, -2121381249, 2121381249, (int) System.currentTimeMillis());
            if (dividerPadding2 == coroutine_suspended) {
                int i128 = m;
                int i129 = ((((i128 ^ 109) | (i128 & 109)) << 1) - (~(-(((~i128) & 109) | (i128 & (-110)))))) - 1;
                f56306l = i129 % 128;
                if (i129 % 2 == 0) {
                    return coroutine_suspended;
                }
                throw null;
            }
            hzVar = hzVar3;
        } else {
            if (i100 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            setrotationx2 = aVar.f56311q0;
            hzVar = aVar.f56310p0;
            ResultKt.throwOnFailure(dividerPadding2);
            int i130 = (-2) - ((m + 114) ^ (-1));
            f56306l = i130 % 128;
            int i131 = i130 % 2;
        }
        fk fkVar7 = (fk) dividerPadding2;
        if (fkVar7 != fk.setX) {
            int i132 = m;
            int i133 = i132 & 53;
            int i134 = (i133 - (~(-(-((i132 ^ 53) | i133))))) - 1;
            f56306l = i134 % 128;
            if (i134 % 2 != 0) {
                int i135 = 85 / 0;
            }
        } else {
            gv onFocusChangeListener6 = hzVar.setOnFocusChangeListener();
            if (!((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener6}, -595845106, 595845122, System.identityHashCode(onFocusChangeListener6))).isEmpty()) {
                int i136 = f56306l;
                int i137 = ((i136 & (-64)) | ((~i136) & 63)) + ((i136 & 63) << 1);
                m = i137 % 128;
                if (i137 % 2 == 0) {
                }
                gv onFocusChangeListener7 = hzVar.setOnFocusChangeListener();
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
                zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener7, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, 2064855914, -2064855856, System.identityHashCode(onFocusChangeListener7))).booleanValue();
                idVar = hzVar.f56309k;
                if (zBooleanValue) {
                    int i138 = m;
                    int i139 = (i138 & (-46)) | ((~i138) & 45);
                    int i140 = (i138 & 45) << 1;
                    int i141 = ((i139 | i140) << 1) - (i140 ^ i139);
                    f56306l = i141 % 128;
                    int i142 = i141 % 2;
                    fkVar7 = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar, hzVar.setOnFocusChangeListener(), hzVar.setCompoundDrawableTintBlendMode(), hzVar.f56307i, setrotationx2}, -1676045107, 1676045110, System.identityHashCode(idVar));
                    System.identityHashCode(hzVar3);
                    System.identityHashCode(hzVar3);
                } else {
                    fkVar7 = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar, hzVar.setOnFocusChangeListener(), hzVar.setCompoundDrawableTintBlendMode(), hzVar.f56307i}, 1746742594, -1746742592, System.identityHashCode(idVar));
                    int iIdentityHashCode2 = System.identityHashCode(hzVar3);
                    int i143 = (-1411417551) ^ iIdentityHashCode2;
                    int i144 = (-1411417551) & iIdentityHashCode2;
                    int i145 = (i143 & i144) | (i143 ^ i144);
                    int i146 = i145 & 1510788344;
                    int i147 = (i145 | 1510788344) & (~i146);
                    int i148 = -(~(-(-(((i147 & i146) | (i147 ^ i146)) * (-627)))));
                    int i149 = (((-1194267296) ^ i148) + ((i148 & (-1194267296)) << 1)) - 1;
                    int i150 = (1411417550 & iIdentityHashCode2) | (1411417550 ^ iIdentityHashCode2);
                    int i151 = ~i150;
                    int i152 = (i150 | i151) & i151;
                    int i153 = ((i152 & (-1510788345)) | ((-1510788345) ^ i152)) * (-627);
                    int i154 = i149 ^ i153;
                    int i155 = ((i153 & i149) | i154) << 1;
                    int i156 = -i154;
                    int i157 = (i155 & i156) + (i155 | i156);
                    int i158 = ~iIdentityHashCode2;
                    int i159 = i158 & (-1411417551);
                    int i160 = (i158 | (-1411417551)) & (~i159);
                    int i161 = (i160 & i159) | (i160 ^ i159);
                    int i162 = ~i161;
                    int i163 = (i161 | i162) & i162;
                    int i164 = iIdentityHashCode2 | (-1510788345);
                    int i165 = ~i164;
                    int i166 = (i164 | i165) & i165;
                    int i167 = ((~i166) & i163) | ((~i163) & i166);
                    int i168 = i163 & i166;
                    int i169 = ((i168 & i167) | (i167 ^ i168)) * 627;
                    i14 = (i157 & i169) + (i169 | i157);
                    System.identityHashCode(hzVar3);
                    if (i14 <= 774437045) {
                        throw null;
                    }
                }
            } else {
                System.identityHashCode(hzVar3);
                System.identityHashCode(hzVar3);
            }
            int i170 = f56306l;
            int i171 = i170 & 19;
            int i172 = -(-(i170 | 19));
            int i173 = (i171 & i172) + (i172 | i171);
            m = i173 % 128;
            if (i173 % 2 == 0) {
                x4 = hzVar.setX();
                onFocusChangeListener = hzVar.setOnFocusChangeListener();
                compoundDrawableTintBlendMode = hzVar.setCompoundDrawableTintBlendMode();
                activatesession = activateSession.CLEAR_DISPLAY;
                valueQualifier = ValueQualifier.setCompoundDrawableTintBlendMode;
                bArr = new byte[2];
            } else {
                x4 = hzVar.setX();
                onFocusChangeListener = hzVar.setOnFocusChangeListener();
                compoundDrawableTintBlendMode = hzVar.setCompoundDrawableTintBlendMode();
                activatesession = activateSession.CLEAR_DISPLAY;
                valueQualifier = ValueQualifier.setCompoundDrawableTintBlendMode;
                bArr = new byte[3];
            }
            int i174 = f56306l;
            int i175 = i174 & 95;
            int i176 = (i174 | 95) & (~i175);
            int i177 = i175 << 1;
            int i178 = ((i176 | i177) << 1) - (i176 ^ i177);
            m = i178 % 128;
            int i179 = i178 % 2;
            int i180 = 0;
            while (i180 < 3) {
                int i181 = m;
                int i182 = i181 & 121;
                int i183 = ((i181 | 121) & (~i182)) + (i182 << 1);
                f56306l = i183 % 128;
                int i184 = i183 % 2;
                bArr[i180] = 0;
                int iIdentityHashCode3 = System.identityHashCode(hzVar3);
                int i185 = -(-(i180 * 85));
                int i186 = 85 ^ i185;
                int i187 = (i185 & 85) << 1;
                int i188 = (i186 & i187) + (i187 | i186);
                int i189 = ~i180;
                int i190 = (-2) & i189;
                int i191 = ~(i190 | ((~i190) & ((-2) | i189)));
                int i192 = ~iIdentityHashCode3;
                int i193 = (i192 | iIdentityHashCode3) & i192;
                int i194 = (-2) & i193;
                int i195 = (~i194) & ((-2) | i193);
                int i196 = ~((i195 ^ i194) | (i194 & i195));
                int i197 = (i196 & i191) | (i191 ^ i196);
                int i198 = ((~i192) & i189) | ((~i189) & i192);
                int i199 = i189 & i192;
                int i200 = ~((i198 ^ i199) | (i198 & i199));
                int i201 = i197 ^ i200;
                int i202 = i197 & i200;
                int i203 = (i202 & i201) | (i201 ^ i202);
                int i204 = i180 & 1;
                int i205 = (i180 ^ 1) | i204;
                int i206 = (i205 & i192) | ((~i205) & iIdentityHashCode3);
                int i207 = i205 & iIdentityHashCode3;
                int i208 = -(-((i203 | (~((i206 ^ i207) | (i206 & i207)))) * (-84)));
                int i209 = i188 | i208;
                int i210 = ((i209 << 1) - (~(-((~(i208 & i188)) & i209)))) - 1;
                int i211 = i189 ^ iIdentityHashCode3;
                int i212 = iIdentityHashCode3 & i189;
                int i213 = ~((i212 & i211) | (i211 ^ i212));
                int i214 = (i213 & 1) | (i213 ^ 1);
                int i215 = i193 & i180;
                int i216 = (~i215) & (i193 | i180);
                int i217 = ~((i215 & i216) | (i216 ^ i215));
                int i218 = i214 & i217;
                int i219 = (i214 | i217) & (~i218);
                int i220 = ((i219 & i218) | (i219 ^ i218)) * (-84);
                int i221 = i210 & i220;
                int i222 = ((i220 | i210) & (~i221)) + (i221 << 1);
                int i223 = ~((i192 ^ i180) | (i192 & i180));
                int i224 = (i180 & (-2)) | (i189 & 1);
                int i225 = (i224 & i204) | (i224 ^ i204);
                int i226 = ~i225;
                int i227 = (i225 | i226) & i226;
                int i228 = i223 & i227;
                i180 = ((((i227 | i223) & (~i228)) | i228) * 84) + i222;
                int i229 = m + 3;
                f56306l = i229 % 128;
                int i230 = i229 % 2;
            }
            x4.setDividerPadding(onFocusChangeListener, compoundDrawableTintBlendMode, activatesession, valueQualifier, true, bArr);
            int i231 = f56306l;
            int i232 = ((i231 | 43) << 1) - (i231 ^ 43);
            m = i232 % 128;
            int i233 = i232 % 2;
            gv onFocusChangeListener8 = hzVar.setOnFocusChangeListener();
            setAnimation setanimation3 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
            zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, 2064855914, -2064855856, System.identityHashCode(onFocusChangeListener8))).booleanValue();
            idVar = hzVar.f56309k;
            if (zBooleanValue) {
                int i1310 = m;
                int i1311 = (i1310 & (-46)) | ((~i1310) & 45);
                int i1410 = (i1310 & 45) << 1;
                int i1411 = ((i1311 | i1410) << 1) - (i1410 ^ i1311);
                f56306l = i1411 % 128;
                int i1412 = i1411 % 2;
                fkVar7 = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar, hzVar.setOnFocusChangeListener(), hzVar.setCompoundDrawableTintBlendMode(), hzVar.f56307i, setrotationx2}, -1676045107, 1676045110, System.identityHashCode(idVar));
                System.identityHashCode(hzVar3);
                System.identityHashCode(hzVar3);
            } else {
                fkVar7 = (fk) id.setCompoundDrawableTintBlendMode(new Object[]{idVar, hzVar.setOnFocusChangeListener(), hzVar.setCompoundDrawableTintBlendMode(), hzVar.f56307i}, 1746742594, -1746742592, System.identityHashCode(idVar));
                int iIdentityHashCode4 = System.identityHashCode(hzVar3);
                int i1413 = (-1411417551) ^ iIdentityHashCode4;
                int i1414 = (-1411417551) & iIdentityHashCode4;
                int i1415 = (i1413 & i1414) | (i1413 ^ i1414);
                int i1416 = i1415 & 1510788344;
                int i1417 = (i1415 | 1510788344) & (~i1416);
                int i1418 = -(~(-(-(((i1417 & i1416) | (i1417 ^ i1416)) * (-627)))));
                int i1419 = (((-1194267296) ^ i1418) + ((i1418 & (-1194267296)) << 1)) - 1;
                int i1510 = (1411417550 & iIdentityHashCode4) | (1411417550 ^ iIdentityHashCode4);
                int i1511 = ~i1510;
                int i1512 = (i1510 | i1511) & i1511;
                int i1513 = ((i1512 & (-1510788345)) | ((-1510788345) ^ i1512)) * (-627);
                int i1514 = i1419 ^ i1513;
                int i1515 = ((i1513 & i1419) | i1514) << 1;
                int i1516 = -i1514;
                int i1517 = (i1515 & i1516) + (i1515 | i1516);
                int i1518 = ~iIdentityHashCode4;
                int i1519 = i1518 & (-1411417551);
                int i1610 = (i1518 | (-1411417551)) & (~i1519);
                int i1611 = (i1610 & i1519) | (i1610 ^ i1519);
                int i1612 = ~i1611;
                int i1613 = (i1611 | i1612) & i1612;
                int i1614 = iIdentityHashCode4 | (-1510788345);
                int i1615 = ~i1614;
                int i1616 = (i1614 | i1615) & i1615;
                int i1617 = ((~i1616) & i1613) | ((~i1613) & i1616);
                int i1618 = i1613 & i1616;
                int i1619 = ((i1618 & i1617) | (i1617 ^ i1618)) * 627;
                i14 = (i1517 & i1619) + (i1619 | i1517);
                System.identityHashCode(hzVar3);
                if (i14 <= 774437045) {
                    throw null;
                }
            }
        }
        return fkVar7;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull com.mypinpad.tsdk.isolation.a aVar) {
        return (fk) setDividerPadding(new Object[]{this, aVar}, 1603748866, -1603748864, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setDividerPadding(new Object[]{this}, -334005010, 334005010, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.hi
    @NotNull
    public final fk setOnFocusChangeListener(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, 592229480, -592229479, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.hi
    @Nullable
    public final Object setY(@NotNull setRotationX setrotationx, @NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, setrotationx, continuation}, -1228580271, 1228580275, System.identityHashCode(this));
    }
}
