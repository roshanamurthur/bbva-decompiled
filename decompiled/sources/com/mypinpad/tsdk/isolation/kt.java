package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class kt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56837c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56838d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ka f56839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56840b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56841p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56842q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56843r0 = 1;

        static {
            int i10 = f56842q0;
            int i11 = i10 & 11;
            int i12 = ((((i10 ^ 11) | i11) << 1) - (~(-((i10 | 11) & (~i11))))) - 1;
            f56843r0 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            if ((((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432)) == 1) {
                dc dcVar = (dc) objArr[1];
                int i14 = f56842q0;
                int i15 = i14 & 91;
                int i16 = (i15 - (~((i14 ^ 91) | i15))) - 1;
                f56843r0 = i16 % 128;
                if (i16 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(dcVar, "");
                    dc.setDividerPadding(new Object[]{dcVar}, -1087540522, 1087540523, System.identityHashCode(dcVar));
                    return null;
                }
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar}, -1087540522, 1087540523, System.identityHashCode(dcVar));
                int i17 = 64 / 0;
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i18 = f56842q0 + 45;
            f56843r0 = i18 % 128;
            dc dcVar2 = (dc) obj;
            if (i18 % 2 == 0) {
                a(new Object[]{aVar, dcVar2}, 859757200, -859757199, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{aVar, dcVar2}, 859757200, -859757199, System.identityHashCode(aVar));
            Unit unit2 = Unit.INSTANCE;
            int i19 = f56843r0;
            int i20 = (-2) - (((i19 ^ 4) + ((i19 & 4) << 1)) ^ (-1));
            f56842q0 = i20 % 128;
            int i21 = i20 % 2;
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, 1806451437, -1806451437, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f56844p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56845q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56846r0 = 1;

        static {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i10 = ~iCurrentTimeMillis;
            int i11 = ~iCurrentTimeMillis;
            int i12 = i10 & (i11 | iCurrentTimeMillis);
            int i13 = ((~i12) & 1997158183) | (i12 & (-1997158184));
            int i14 = 1997158183 & i12;
            int i15 = (i13 & i14) | (i13 ^ i14);
            int i16 = (i15 | (~i15)) & (~i15);
            int i17 = 1684695020 ^ iCurrentTimeMillis;
            int i18 = 1684695020 & iCurrentTimeMillis;
            int i19 = ~((i17 & i18) | (i17 ^ i18));
            int i20 = ((~i19) & i16) | ((~i16) & i19);
            int i21 = i16 & i19;
            int i22 = ((i21 & i20) | (i20 ^ i21)) * 1150;
            int i23 = (259830038 | i22) << 1;
            int i24 = -((i22 & (-259830039)) | (259830038 & (~i22)));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            int i26 = 1684695020 ^ iCurrentTimeMillis;
            int i27 = 1684695020 & iCurrentTimeMillis;
            int i28 = ~((i26 & i27) | (i26 ^ i27));
            int i29 = (1684695020 & i11) | ((~i11) & (-1684695021));
            int i30 = i11 & (-1684695021);
            int i31 = ~((i30 & i29) | (i29 ^ i30));
            int i32 = i28 & i31;
            int i33 = -(-((((i31 | i28) & (~i32)) | i32) * (-575)));
            int i34 = i25 & i33;
            int i35 = (i33 | i25) & (~i34);
            int i36 = -(-(i34 << 1));
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            int i38 = 1997158183 & iCurrentTimeMillis;
            int i39 = (iCurrentTimeMillis | 1997158183) & (~i38);
            int i40 = ~((i39 & i38) | (i39 ^ i38));
            int i41 = ~(i12 | (-1997158184));
            int i42 = -(-(((i40 & i41) | (i40 ^ i41)) * 575));
            int i43 = i37 & i42;
            int i44 = ((i42 | i37) & (~i43)) + (i43 << 1);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i45 = ((~iCurrentTimeMillis2) & (-518034022)) | (518034021 & iCurrentTimeMillis2);
            int i46 = (-518034022) & iCurrentTimeMillis2;
            int i47 = (i45 & i46) | (i45 ^ i46);
            int i48 = (i47 | (~i47)) & (~i47);
            int i49 = ((~i48) & 274760289) | ((-274760290) & i48);
            int i50 = i48 & 274760289;
            int i51 = 536191091 - (~(-(~(-(-(((i50 & i49) | (i49 ^ i50)) * (-566)))))));
            int i52 = ((i51 | 1137804397) << 1) - (1137804397 ^ i51);
            if (i44 > (((i52 ^ (-1)) + (i52 << 1)) - (~(-(-((~((iCurrentTimeMillis2 & (-243273733)) | ((-243273733) ^ iCurrentTimeMillis2))) * 566))))) - 1) {
                int i53 = 14 / 0;
            }
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
            int i15 = ~i12;
            int i16 = ~(i15 | i11);
            int i17 = ~(i10 | i11);
            int i18 = i13 | (~i11);
            if (((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14 == 1) {
                cv cvVar = (cv) objArr[1];
                int i19 = f56845q0 + 95;
                f56846r0 = i19 % 128;
                if (i19 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(cvVar, "");
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.FALSE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                    return null;
                }
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.FALSE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                return null;
            }
            b bVar = (b) objArr[0];
            Object obj = objArr[1];
            int i20 = f56846r0;
            int i21 = ((i20 & (-78)) | ((~i20) & 77)) + ((i20 & 77) << 1);
            f56845q0 = i21 % 128;
            cv cvVar2 = (cv) obj;
            if (i21 % 2 != 0) {
                a(new Object[]{bVar, cvVar2}, -73599083, 73599084, System.identityHashCode(bVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{bVar, cvVar2}, -73599083, 73599084, System.identityHashCode(bVar));
            Unit unit2 = Unit.INSTANCE;
            int i22 = f56845q0;
            int i23 = ((i22 & 17) - (~(-(-(i22 | 17))))) - 1;
            f56846r0 = i23 % 128;
            if (i23 % 2 != 0) {
                return unit2;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -442137180, 442137180, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "p0", "", "p1", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p2", "p3", "p4", "Lcom/mypinpad/tsdk/i/df;", "setY", "([BILcom/mypinpad/tsdk/i/getBeepOnFailure;Lcom/mypinpad/tsdk/i/getBeepOnFailure;[B)Lcom/mypinpad/tsdk/i/df;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends Lambda implements Function5<byte[], Integer, getBeepOnFailure, getBeepOnFailure, byte[], df> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f56847p0 = new c();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56848q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56849r0 = 1;

        static {
            int i10 = f56848q0;
            int i11 = ((((i10 ^ 107) | (i10 & 107)) << 1) - (~(-(((~i10) & 107) | (i10 & (-108)))))) - 1;
            f56849r0 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        public c() {
            super(5);
        }

        public static /* synthetic */ df a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
            int i15 = ~i11;
            if (((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14 == 1) {
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[3];
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[4];
                byte[] bArr2 = (byte[]) objArr[5];
                Intrinsics.checkNotNullParameter(bArr, "");
                Intrinsics.checkNotNullParameter(getbeeponfailure2, "");
                Intrinsics.checkNotNullParameter(bArr2, "");
                byte[] onFocusChangeListener = getbeeponfailure != null ? getbeeponfailure.setOnFocusChangeListener() : null;
                if (onFocusChangeListener == null) {
                    onFocusChangeListener = new byte[0];
                }
                return new dh(bArr, iIntValue, onFocusChangeListener, getbeeponfailure2.setOnFocusChangeListener(), bArr2);
            }
            c cVar = (c) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            Object obj3 = objArr[3];
            Object obj4 = objArr[4];
            Object obj5 = objArr[5];
            int i16 = f56849r0;
            int i17 = (i16 & 117) + (i16 | 117);
            f56848q0 = i17 % 128;
            int i18 = i17 % 2;
            byte[] bArr3 = (byte[]) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) obj3;
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) obj4;
            byte[] bArr4 = (byte[]) obj5;
            Object[] objArr2 = new Object[6];
            if (i18 != 0) {
                objArr2[0] = cVar;
                objArr2[1] = bArr3;
                objArr2[2] = Integer.valueOf(iIntValue2);
                objArr2[3] = getbeeponfailure3;
                objArr2[4] = getbeeponfailure4;
                objArr2[5] = bArr4;
                a(objArr2, 1323047554, -1323047553, iIntValue2);
                throw null;
            }
            objArr2[0] = cVar;
            objArr2[1] = bArr3;
            objArr2[2] = Integer.valueOf(iIntValue2);
            objArr2[3] = getbeeponfailure3;
            objArr2[4] = getbeeponfailure4;
            objArr2[5] = bArr4;
            df dfVarA = a(objArr2, 1323047554, -1323047553, iIntValue2);
            int i19 = f56848q0;
            int i20 = i19 & 121;
            int i21 = ((i19 ^ 121) | i20) << 1;
            int i22 = -((i19 | 121) & (~i20));
            int i23 = (i21 & i22) + (i22 | i21);
            f56849r0 = i23 % 128;
            int i24 = i23 % 2;
            return dfVarA;
        }

        @Override // kotlin.jvm.functions.Function5
        public final /* synthetic */ df invoke(byte[] bArr, Integer num, getBeepOnFailure getbeeponfailure, getBeepOnFailure getbeeponfailure2, byte[] bArr2) {
            return a(new Object[]{this, bArr, num, getbeeponfailure, getbeeponfailure2, bArr2}, 584389216, -584389216, System.identityHashCode(this));
        }
    }

    public kt(@NotNull ka kaVar, @NotNull setContentDescription setcontentdescription) {
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56839a = kaVar;
        this.f56840b = setcontentdescription;
    }

    public static /* synthetic */ void a(Object[] objArr) throws Exception {
        kt ktVar = (kt) objArr[0];
        int i10 = f56838d;
        int i11 = i10 & 59;
        int i12 = i11 + ((i10 ^ 59) | i11);
        f56837c = i12 % 128;
        int i13 = i12 % 2;
        ka kaVar = ktVar.f56839a;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1211815225, 1211815329, (int) System.currentTimeMillis());
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2064855914, -2064855856, System.identityHashCode(kaVar))).booleanValue()) {
            ka kaVar2 = ktVar.f56839a;
            cz czVar = new cz(kaVar2);
            cy cyVar = new cy(kaVar2);
            if (!((Boolean) setDividerPadding(new Object[]{ktVar}, -1552686320, 1552686326, System.identityHashCode(ktVar))).booleanValue()) {
                int iIdentityHashCode = System.identityHashCode(ktVar);
                int i14 = ~iIdentityHashCode;
                int i15 = ~i14;
                int i16 = ((-1542037989) & i15) | (i14 & 1542037988);
                int i17 = (-1542037989) & i14;
                int i18 = ~((i17 & i16) | (i16 ^ i17));
                int i19 = 1268850724 ^ i18;
                int i20 = i18 & 1268850724;
                int i21 = (i20 & i19) | (i19 ^ i20);
                int i22 = i14 & 1270034989;
                int i23 = ~((i15 & (-1270034990)) | i22 | ((-1270034990) & i14));
                int i24 = i21 & i23;
                int i25 = (i23 | i21) & (~i24);
                int i26 = -(-(((i25 & i24) | (i25 ^ i24) | (~((1543222253 & i14) | (iIdentityHashCode & (-1543222254)) | (1543222253 & iIdentityHashCode)))) * (-84)));
                int i27 = (-1491965531) | i26;
                int i28 = (i27 << 1) - ((~(i26 & (-1491965531))) & i27);
                int i29 = ~(((-1270034990) & iIdentityHashCode) | ((-1270034990) ^ iIdentityHashCode));
                int i30 = 1542037988 & i29;
                int i31 = (~i30) & (i29 | 1542037988);
                int i32 = (i31 & i30) | (i31 ^ i30);
                int i33 = i14 ^ 1270034989;
                int i34 = (i33 & i22) | (i33 ^ i22);
                int i35 = ~i34;
                int i36 = (i34 | i35) & i35;
                int i37 = ((~i36) & i32) | ((~i32) & i36);
                int i38 = i32 & i36;
                int i39 = -(-(((i38 & i37) | (i37 ^ i38)) * (-84)));
                int i40 = (((i28 | i39) << 1) - (~(-((i39 & (~i28)) | ((~i39) & i28))))) - 1;
                int i41 = (iIdentityHashCode | i14) & i14;
                int i42 = i41 & 1270034989;
                int i43 = ~(((i41 | 1270034989) & (~i42)) | i42);
                int i44 = (i43 & 1543222253) | ((~i43) & (-1543222254));
                int i45 = i43 & (-1543222254);
                int i46 = -(~(-(-(((i45 & i44) | (i44 ^ i45)) * 84))));
                int i47 = (((i40 | i46) << 1) - (i46 ^ i40)) - 1;
                int iIdentityHashCode2 = System.identityHashCode(ktVar);
                int i48 = ~iIdentityHashCode2;
                int i49 = i48 ^ 1178017663;
                int i50 = i48 & 1178017663;
                int i51 = ~((i49 & i50) | (i49 ^ i50));
                int i52 = i51 & (-2000674688);
                int i53 = -(-((((i51 | (-2000674688)) & (~i52)) | i52 | (~(((-1176506730) ^ iIdentityHashCode2) | ((-1176506730) & iIdentityHashCode2)))) * 717));
                int i54 = (-69771053) & i53;
                int i55 = (i53 | (-69771053)) & (~i54);
                int i56 = -(-(i54 << 1));
                int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
                int i58 = ((~i48) & (-1176506730)) | (1176506729 & i48);
                int i59 = i48 & (-1176506730);
                int i60 = (i59 & i58) | (i58 ^ i59);
                int i61 = ~i60;
                int i62 = (i60 | i61) & i61;
                int i63 = i62 & (-2000674688);
                int i64 = (i62 | (-2000674688)) & (~i63);
                int i65 = (i64 & i63) | (i64 ^ i63);
                int i66 = ((-1178017664) & iIdentityHashCode2) | i50;
                int i67 = iIdentityHashCode2 & 1178017663;
                int i68 = ~((i67 & i66) | (i66 ^ i67));
                int i69 = ((i68 & i65) | (i65 ^ i68)) * 717;
                int i70 = i57 ^ i69;
                int i71 = ((i69 & i57) | i70) << 1;
                int i72 = -i70;
                if (i47 > ((i71 | i72) << 1) - (i71 ^ i72)) {
                    setDividerPadding(new Object[]{ktVar, Boolean.FALSE}, -455942023, 455942023, System.identityHashCode(ktVar));
                    return;
                } else {
                    setDividerPadding(new Object[]{ktVar, Boolean.TRUE}, -455942023, 455942023, System.identityHashCode(ktVar));
                    return;
                }
            }
            if (!((Boolean) setDividerPadding(new Object[]{ktVar}, 497976005, -497976003, System.identityHashCode(ktVar))).booleanValue()) {
                int i73 = f56837c;
                int i74 = (i73 & 109) + (i73 | 109);
                f56838d = i74 % 128;
                if (i74 % 2 == 0) {
                    setDividerPadding(new Object[]{ktVar, Boolean.TRUE}, -455942023, 455942023, System.identityHashCode(ktVar));
                } else {
                    setDividerPadding(new Object[]{ktVar, Boolean.TRUE}, -455942023, 455942023, System.identityHashCode(ktVar));
                }
                int i75 = f56838d + 51;
                f56837c = i75 % 128;
                int i76 = i75 % 2;
                return;
            }
            dj djVar = (dj) setDividerPadding(new Object[]{ktVar}, -370495981, 370495985, System.identityHashCode(ktVar));
            if (djVar == null) {
                int i77 = f56837c;
                int i78 = ((i77 | 15) << 1) - (i77 ^ 15);
                f56838d = i78 % 128;
                if (i78 % 2 != 0) {
                    setDividerPadding(new Object[]{ktVar}, 1784396291, -1784396283, (int) System.currentTimeMillis());
                    return;
                } else {
                    setDividerPadding(new Object[]{ktVar}, 1784396291, -1784396283, (int) System.currentTimeMillis());
                    int i79 = 4 / 0;
                    return;
                }
            }
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar2, djVar}, -834780049, 834780078, System.identityHashCode(kaVar2));
            df.setDividerPadding setdividerpadding = df.setDividerPadding;
            df dfVar = (df) df.setDividerPadding.setOnFocusChangeListener(new Object[]{kaVar2, ktVar.f56840b, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2004011430, 2004011432, System.identityHashCode(djVar)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2055662065, 2055662076, System.identityHashCode(djVar)), c.f56847p0}, -1840351827, 1840351827, (int) System.currentTimeMillis());
            if (dfVar == null) {
                int i80 = f56837c;
                int i81 = i80 ^ 33;
                int i82 = ((i80 & 33) | i81) << 1;
                int i83 = -i81;
                int i84 = (i82 & i83) + (i82 | i83);
                f56838d = i84 % 128;
                if (i84 % 2 == 0) {
                    setDividerPadding(new Object[]{ktVar}, 1784396291, -1784396283, (int) System.currentTimeMillis());
                    throw null;
                }
                setDividerPadding(new Object[]{ktVar}, 1784396291, -1784396283, (int) System.currentTimeMillis());
                int i85 = f56837c;
                int i86 = (i85 ^ 47) + ((i85 & 47) << 1);
                f56838d = i86 % 128;
                if (i86 % 2 == 0) {
                    int i87 = 29 / 0;
                    return;
                }
                return;
            }
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar2, dfVar}, -1414515296, 1414515343, System.identityHashCode(kaVar2));
            du duVar = du.INSTANCE;
            if (!((Boolean) du.setOnFocusChangeListener(new Object[]{kaVar2, (byte[]) setDividerPadding(new Object[]{ktVar}, -1082312192, 1082312195, System.identityHashCode(ktVar))}, -597819605, 597819611, (int) System.currentTimeMillis())).booleanValue()) {
                int i88 = f56838d;
                int i89 = (i88 ^ 109) + ((i88 & 109) << 1);
                f56837c = i89 % 128;
                int i90 = i89 % 2;
                setDividerPadding(new Object[]{ktVar}, 1784396291, -1784396283, (int) System.currentTimeMillis());
                int i91 = f56837c;
                int i92 = i91 ^ 119;
                int i93 = -(-((i91 & 119) << 1));
                int i94 = (i92 & i93) + (i93 | i92);
                f56838d = i94 % 128;
                if (i94 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        int i95 = f56837c;
        int i96 = i95 & 25;
        int i97 = (((i95 ^ 25) | i96) << 1) - ((i95 | 25) & (~i96));
        f56838d = i97 % 128;
        int i98 = i97 % 2;
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        int i10;
        kt ktVar = (kt) objArr[0];
        int i11 = f56838d;
        int i12 = ((i11 & (-72)) | ((~i11) & 71)) + ((i11 & 71) << 1);
        f56837c = i12 % 128;
        Byte bValueOf = null;
        if (i12 % 2 != 0) {
            ka kaVar = ktVar.f56839a;
            throw null;
        }
        ka kaVar2 = ktVar.f56839a;
        di diVar = (di) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar2}, 974755449, -974755438, System.identityHashCode(kaVar2));
        if (diVar == null) {
            int iIdentityHashCode = System.identityHashCode(ktVar);
            int i13 = ~iIdentityHashCode;
            int i14 = i13 & (-1712786489);
            int i15 = (~i14) & (i13 | (-1712786489));
            int i16 = ~((i14 & i15) | (i15 ^ i14));
            int i17 = i16 & 67503144;
            int i18 = ((i16 | 67503144) & (~i17)) | i17;
            int i19 = (2115981242 ^ iIdentityHashCode) | (2115981242 & iIdentityHashCode);
            int i20 = ~i19;
            int i21 = (i19 | i20) & i20;
            int i22 = i18 ^ i21;
            int i23 = i18 & i21;
            int i24 = ((i23 & i22) | (i22 ^ i23)) * 717;
            int i25 = (-2010767877) ^ i24;
            int i26 = -(-((i24 & (-2010767877)) << 1));
            int i27 = (i25 & i26) + (i26 | i25);
            int i28 = ~((i13 & 2115981242) | (2115981242 ^ i13));
            int i29 = ((-67503145) & i28) | ((~i28) & 67503144);
            int i30 = i28 & 67503144;
            int i31 = (i30 & i29) | (i29 ^ i30);
            int i32 = ~((iIdentityHashCode & (-1712786489)) | ((-1712786489) ^ iIdentityHashCode));
            int i33 = ((~i32) & i31) | ((~i31) & i32);
            int i34 = i32 & i31;
            int i35 = -(-(((i34 & i33) | (i33 ^ i34)) * 717));
            int i36 = i27 | i35;
            int i37 = (i36 << 1) - ((~(i35 & i27)) & i36);
            int iIdentityHashCode2 = System.identityHashCode(ktVar);
            int i38 = ~iIdentityHashCode2;
            int i39 = ~(((-1550256242) ^ i38) | ((-1550256242) & i38) | 288447869);
            int i40 = ((-288447870) ^ i38) | ((-288447870) & i38);
            int i41 = (i40 & (-1550256242)) | ((~i40) & 1550256241);
            int i42 = i40 & 1550256241;
            int i43 = ~((i42 & i41) | (i41 ^ i42));
            int i44 = i39 & i43;
            int i45 = (i39 | i43) & (~i44);
            int i46 = (-1475403043) - (~(-(-(((i45 & i44) | (i45 ^ i44)) * (-184)))));
            int i47 = (iIdentityHashCode2 | i38) & i38;
            int i48 = ~((i47 & (-1550256242)) | ((-1550256242) ^ i47));
            int i49 = ((~i48) & 270600305) | ((-270600306) & i48);
            int i50 = i48 & 270600305;
            int i51 = (i50 & i49) | (i49 ^ i50);
            int i52 = ~(i38 | (-288447870));
            int i53 = ((~i52) & i51) | ((~i51) & i52);
            int i54 = i51 & i52;
            int i55 = (i46 - (~(-(-(((i54 & i53) | (i53 ^ i54)) * 184))))) - 1;
            if (i37 > (i55 & 768291288) + (768291288 | i55)) {
                return Boolean.FALSE;
            }
            throw null;
        }
        ka kaVar3 = ktVar.f56839a;
        setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar3}, -296152793, 296152815, System.identityHashCode(kaVar3));
        byte[] bArr = (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist));
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar3, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(kaVar3));
        if (getbeeponfailure == null) {
            int iIdentityHashCode3 = System.identityHashCode(ktVar);
            int i56 = ~iIdentityHashCode3;
            int i57 = ~i56;
            int i58 = (703870489 & i57) | ((-703870490) & i56) | (703870489 & i56);
            int i59 = ~i58;
            int i60 = (i58 | i59) & i59;
            int i61 = 810084744 ^ iIdentityHashCode3;
            int i62 = 810084744 & iIdentityHashCode3;
            int i63 = ~((i61 & i62) | (i61 ^ i62));
            int i64 = -(-(((i60 & i63) | ((~i63) & i60) | ((~i60) & i63)) * 959));
            int i65 = ((((~i64) & 992272050) | ((-992272051) & i64)) - (~(-(-((i64 & 992272050) << 1))))) - 1;
            int i66 = i65 & (-701933479);
            int i67 = ((((-701933479) | i65) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
            int i68 = 703870489 & iIdentityHashCode3;
            int i69 = (iIdentityHashCode3 | 703870489) & (~i68);
            int i70 = (i69 & i68) | (i69 ^ i68);
            int i71 = ~i70;
            int i72 = (i70 | i71) & i71;
            int i73 = ~((i56 & 810084744) | (i57 & 810084744) | ((-810084745) & i56));
            int i74 = i72 & i73;
            int i75 = (i72 | i73) & (~i74);
            int i76 = ((i75 & i74) | (i75 ^ i74)) * 959;
            int i77 = i67 & i76;
            int i78 = ((i76 | i67) & (~i77)) + (i77 << 1);
            int iIdentityHashCode4 = System.identityHashCode(ktVar);
            int i79 = ~iIdentityHashCode4;
            int i80 = (i79 & (-1770485019)) | ((~i79) & 1770485018);
            int i81 = i79 & 1770485018;
            int i82 = (i80 & i81) | (i80 ^ i81);
            int i83 = i82 & (-1375191890);
            int i84 = (i82 | (-1375191890)) & (~i83);
            int i85 = ((~((i84 & i83) | (i84 ^ i83))) * 52) + 28851160;
            int i86 = ~((1375191889 & i79) | (1375191889 ^ i79));
            int i87 = i86 ^ (-2046293852);
            int i88 = i86 & (-2046293852);
            int i89 = (i88 & i87) | (i87 ^ i88);
            int i90 = 1770485018 ^ i79;
            int i91 = ~((i81 & i90) | (i90 ^ i81));
            int i92 = i89 ^ i91;
            int i93 = i91 & i89;
            int i94 = (i85 - (~(((i93 & i92) | (i92 ^ i93)) * (-52)))) - 1;
            int i95 = (iIdentityHashCode4 | i79) & i79;
            int i96 = ~((i95 & (-1770485019)) | ((-1770485019) ^ i95));
            int i97 = i96 ^ 1099383056;
            int i98 = i96 & 1099383056;
            int i99 = ((i98 & i97) | (i97 ^ i98)) * 52;
            if (i78 > (i94 ^ i99) + ((i99 & i94) << 1)) {
                throw null;
            }
        } else {
            byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
            if (bArr2 == null) {
                int i100 = f56838d + 39;
                int i101 = i100 % 128;
                f56837c = i101;
                if (i100 % 2 != 0) {
                    int i102 = 5 / 0;
                }
                int i103 = i101 & 5;
                i10 = (i103 - (~(-(-((i101 ^ 5) | i103))))) - 1;
            } else {
                bValueOf = Byte.valueOf(ArraysKt___ArraysKt.first(bArr2));
                i10 = f56837c + 65;
            }
            f56838d = i10 % 128;
            int i104 = i10 % 2;
        }
        boolean zBooleanValue = ((Boolean) di.setDividerPadding(new Object[]{diVar, bArr, bValueOf}, -1412595436, 1412595438, System.identityHashCode(diVar))).booleanValue();
        int i105 = f56837c;
        int i106 = ((i105 | 59) << 1) - (i105 ^ 59);
        f56838d = i106 % 128;
        int i107 = i106 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0386  */
    /* JADX WARN: Code duplicated, block: B:55:0x0399  */
    /* JADX WARN: Code duplicated, block: B:56:0x039d  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object objValueOf;
        int i13;
        boolean z10;
        int i14;
        int i15 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i16 = ~i11;
        Byte bValueOf = null;
        switch ((((~((~i10) | i12)) | i16) * 301) + (((~(i16 | i12)) | (~((~i12) | i10))) * (-301)) + i15) {
            case 1:
                a(objArr);
                return null;
            case 2:
                return b(objArr);
            case 3:
                kt ktVar = (kt) objArr[0];
                setOverscrollHeader setoverscrollheader = new setOverscrollHeader();
                ka kaVar = ktVar.f56839a;
                Iterator<getBeepOnFailure> it = ((setMaxWidth) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar}, 2099681381, -2099681372, System.identityHashCode(kaVar))).iterator();
                int i17 = f56838d;
                int i18 = i17 & 19;
                int i19 = (i17 ^ 19) | i18;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f56837c = i20 % 128;
                int i21 = i20 % 2;
                while (!(!it.hasNext())) {
                    int i22 = f56838d;
                    int i23 = ((i22 | 47) << 1) - (i22 ^ 47);
                    f56837c = i23 % 128;
                    int i24 = i23 % 2;
                    getBeepOnFailure next = it.next();
                    getBeepOnFailure navigationOnClickListener = next.setNavigationOnClickListener();
                    setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 1115257939, -1115257923, System.identityHashCode(navigationOnClickListener));
                    setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 1115257939, -1115257923, System.identityHashCode(next));
                    int iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue();
                    setImageTintList.setX(new Object[]{setimagetintlist, Integer.valueOf(iIntValue)}, -2003004454, 2003004454, iIntValue);
                    setOverscrollHeader.setX(new Object[]{setoverscrollheader, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 252497730, -252497710, System.identityHashCode(navigationOnClickListener))}, 2089112754, -2089112752, System.identityHashCode(setoverscrollheader));
                    int i25 = f56837c;
                    int i26 = ((i25 & (-90)) | ((~i25) & 89)) + ((i25 & 89) << 1);
                    f56838d = i26 % 128;
                    int i27 = i26 % 2;
                }
                ka kaVar2 = ktVar.f56839a;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar2}, 959776700, -959776697, System.identityHashCode(kaVar2));
                if (getbeeponfailure != null) {
                    int i28 = f56838d;
                    int i29 = i28 & 115;
                    int i30 = (((i28 | 115) & (~i29)) - (~(-(-(i29 << 1))))) - 1;
                    f56837c = i30 % 128;
                    if (i30 % 2 != 0) {
                        throw null;
                    }
                    List list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure));
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list.iterator();
                        int i31 = f56837c;
                        int i32 = (i31 ^ 35) + ((i31 & 35) << 1);
                        f56838d = i32 % 128;
                        int i33 = i32 % 2;
                        while (it2.hasNext()) {
                            int i34 = f56838d;
                            int i35 = ((i34 | 60) << 1) - (i34 ^ 60);
                            int i36 = (i35 ^ (-1)) + (i35 << 1);
                            f56837c = i36 % 128;
                            if (i36 % 2 != 0) {
                                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) it2.next();
                                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                                String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                                setAnimation setanimation = setAnimation.INSTANCE;
                                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1211815225, 1211815329, (int) System.currentTimeMillis());
                                Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)));
                                throw null;
                            }
                            Object next2 = it2.next();
                            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) next2;
                            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                            String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                            setAnimation setanimation2 = setAnimation.INSTANCE;
                            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1211815225, 1211815329, (int) System.currentTimeMillis());
                            if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                                int i37 = f56837c;
                                i13 = (i37 ^ 47) + ((i37 & 47) << 1);
                            } else {
                                int i38 = f56838d;
                                int i39 = i38 & 119;
                                int i40 = (i38 | 119) & (~i39);
                                int i41 = -(-(i39 << 1));
                                int i42 = (i40 & i41) + (i40 | i41);
                                int i43 = i42 % 128;
                                f56837c = i43;
                                int i44 = i42 % 2;
                                int i45 = (i43 & 61) + (i43 | 61);
                                f56838d = i45 % 128;
                                int i46 = i45 % 2;
                                arrayList.add(next2);
                                int i47 = f56837c;
                                int i48 = i47 & 31;
                                i13 = (i48 - (~((i47 ^ 31) | i48))) - 1;
                            }
                            f56838d = i13 % 128;
                            int i49 = i13 % 2;
                        }
                        Iterator it3 = arrayList.iterator();
                        int i50 = f56837c + 81;
                        f56838d = i50 % 128;
                        int i51 = i50 % 2;
                        while (it3.hasNext()) {
                            int i52 = f56838d + 101;
                            f56837c = i52 % 128;
                            if (i52 % 2 != 0) {
                                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) it3.next();
                                setOverscrollHeader.setX(new Object[]{setoverscrollheader, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 243863605, -243863605, System.identityHashCode(getbeeponfailure4))}, 2089112754, -2089112752, System.identityHashCode(setoverscrollheader));
                                throw null;
                            }
                            getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) it3.next();
                            setOverscrollHeader.setX(new Object[]{setoverscrollheader, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 243863605, -243863605, System.identityHashCode(getbeeponfailure5))}, 2089112754, -2089112752, System.identityHashCode(setoverscrollheader));
                        }
                    }
                }
                objValueOf = (byte[]) setOverscrollHeader.setX(new Object[]{setoverscrollheader}, -158300171, 158300171, System.identityHashCode(setoverscrollheader));
                int i53 = f56838d;
                int i54 = ((((i53 ^ 75) | (i53 & 75)) << 1) - (~(-(((~i53) & 75) | (i53 & (-76)))))) - 1;
                f56837c = i54 % 128;
                if (i54 % 2 != 0) {
                    throw null;
                }
                break;
            case 4:
                kt ktVar2 = (kt) objArr[0];
                System.identityHashCode(ktVar2);
                System.identityHashCode(ktVar2);
                dg dgVar = (dg) setDividerPadding(new Object[]{ktVar2}, 2025478223, -2025478216, System.identityHashCode(ktVar2));
                if (dgVar == null) {
                    int i55 = f56838d;
                    int i56 = i55 & 115;
                    int i57 = i56 + ((i55 ^ 115) | i56);
                    f56837c = i57 % 128;
                    if (i57 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                dj.setY sety = dj.setY;
                dj djVar = (dj) dj.setY.setX(new Object[]{ktVar2.f56839a, ktVar2.f56840b, dgVar}, 1210480347, -1210480347, (int) System.currentTimeMillis());
                int i58 = f56837c;
                int i59 = ((i58 & (-10)) | ((~i58) & 9)) + ((i58 & 9) << 1);
                f56838d = i59 % 128;
                int i60 = i59 % 2;
                return djVar;
            case 5:
                kt ktVar3 = (kt) objArr[0];
                int i61 = f56837c;
                int i62 = (i61 & (-64)) | ((~i61) & 63);
                int i63 = (i61 & 63) << 1;
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                f56838d = i64 % 128;
                int i65 = i64 % 2;
                ka kaVar3 = ktVar3.f56839a;
                setAnimation setanimation3 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis());
                String str3 = (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3));
                TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 727546065, -727545958, (int) System.currentTimeMillis());
                String str4 = (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4));
                TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 34771733, -34771475, (int) System.currentTimeMillis());
                String str5 = (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5));
                TransactionFailed accessibilityTraversalAfter = setAnimation.setAccessibilityTraversalAfter();
                String str6 = (String) TransactionFailed.setX(new Object[]{accessibilityTraversalAfter}, 1914607362, -1914607356, System.identityHashCode(accessibilityTraversalAfter));
                TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], -598265962, 598266002, (int) System.currentTimeMillis());
                String str7 = (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6));
                TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], -1550249147, 1550249160, (int) System.currentTimeMillis());
                String str8 = (String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7));
                TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], -49734503, 49734731, (int) System.currentTimeMillis());
                boolean zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar3, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str3, str4, str5, str6, str7, str8, (String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8))})}, 1649211393, -1649211385, System.identityHashCode(kaVar3))).booleanValue();
                int i66 = f56838d;
                int i67 = (i66 ^ 103) + ((i66 & 103) << 1);
                f56837c = i67 % 128;
                if (i67 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            case 6:
                kt ktVar4 = (kt) objArr[0];
                int i68 = f56838d;
                int i69 = (((i68 ^ 17) | (i68 & 17)) << 1) - (((~i68) & 17) | (i68 & (-18)));
                f56837c = i69 % 128;
                int i70 = i69 % 2;
                ka kaVar4 = ktVar4.f56839a;
                setAnimation setanimation4 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed9 = (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis());
                boolean zBooleanValue2 = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar4, (String) TransactionFailed.setX(new Object[]{transactionFailed9}, 1914607362, -1914607356, System.identityHashCode(transactionFailed9))}, -232375606, 232375652, System.identityHashCode(kaVar4))).booleanValue();
                ka kaVar5 = ktVar4.f56839a;
                if (zBooleanValue2) {
                    int i71 = f56837c;
                    int i72 = (i71 & (-42)) | ((~i71) & 41);
                    int i73 = -(-((i71 & 41) << 1));
                    int i74 = (i72 & i73) + (i73 | i72);
                    f56838d = i74 % 128;
                    int i75 = i74 % 2;
                    z10 = true;
                } else {
                    int i76 = f56837c;
                    int i77 = i76 & 23;
                    int i78 = ((i76 | 23) & (~i77)) + (i77 << 1);
                    f56838d = i78 % 128;
                    if (i78 % 2 == 0) {
                        TransactionFailed transactionFailed10 = (TransactionFailed) setAnimation.setY(new Object[0], 1963048329, -1963048320, (int) System.currentTimeMillis());
                        ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar5, (String) TransactionFailed.setX(new Object[]{transactionFailed10}, 1914607362, -1914607356, System.identityHashCode(transactionFailed10))}, -232375606, 232375652, System.identityHashCode(kaVar5))).booleanValue();
                        throw null;
                    }
                    TransactionFailed transactionFailed11 = (TransactionFailed) setAnimation.setY(new Object[0], 1963048329, -1963048320, (int) System.currentTimeMillis());
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar5, (String) TransactionFailed.setX(new Object[]{transactionFailed11}, 1914607362, -1914607356, System.identityHashCode(transactionFailed11))}, -232375606, 232375652, System.identityHashCode(kaVar5))).booleanValue()) {
                        int i79 = f56837c;
                        int i80 = i79 ^ 121;
                        int i81 = (((i79 & 121) | i80) << 1) - i80;
                        f56838d = i81 % 128;
                        int i82 = i81 % 2;
                        z10 = false;
                    } else {
                        int i710 = f56837c;
                        int i711 = (i710 & (-42)) | ((~i710) & 41);
                        int i712 = -(-((i710 & 41) << 1));
                        int i713 = (i711 & i712) + (i712 | i711);
                        f56838d = i713 % 128;
                        int i714 = i713 % 2;
                        z10 = true;
                    }
                }
                TransactionFailed persistentDrawingCache = setAnimation.setPersistentDrawingCache();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar5, (String) TransactionFailed.setX(new Object[]{persistentDrawingCache}, 1914607362, -1914607356, System.identityHashCode(persistentDrawingCache))}, -232375606, 232375652, System.identityHashCode(kaVar5))).booleanValue()) {
                    int i83 = f56838d;
                    int i84 = ~i83;
                    int i85 = ((((i83 ^ 119) | (i83 & 119)) << 1) - (~(-((i83 & (-120)) | (119 & i84))))) - 1;
                    f56837c = i85 % 128;
                    if (i85 % 2 != 0) {
                        throw null;
                    }
                    if (z10) {
                        int i86 = (i83 | 93) << 1;
                        int i87 = -((i83 & (-94)) | (i84 & 93));
                        int i88 = (i86 & i87) + (i86 | i87);
                        f56837c = i88 % 128;
                        int i89 = i88 % 2;
                        if (!((Boolean) setDividerPadding(new Object[]{ktVar4}, 11707749, -11707744, System.identityHashCode(ktVar4))).booleanValue()) {
                            int i90 = f56838d;
                            int i91 = i90 & 19;
                            i14 = (i91 - (~(-(-((i90 ^ 19) | i91))))) - 1;
                            f56837c = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                            objValueOf = Boolean.FALSE;
                        } else {
                            int i92 = f56837c;
                            int i93 = i92 + 105;
                            f56838d = i93 % 128;
                            boolean z11 = i93 % 2 != 0;
                            int i94 = ((i92 | 59) << 1) - (i92 ^ 59);
                            f56838d = i94 % 128;
                            if (i94 % 2 == 0) {
                                throw null;
                            }
                            objValueOf = Boolean.valueOf(z11);
                        }
                    } else {
                        int i95 = f56838d;
                        int i96 = i95 & 19;
                        i14 = (i96 - (~(-(-((i95 ^ 19) | i96))))) - 1;
                        f56837c = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                        objValueOf = Boolean.FALSE;
                    }
                } else {
                    int i97 = f56838d;
                    int i98 = i97 & 19;
                    i14 = (i98 - (~(-(-((i97 ^ 19) | i98))))) - 1;
                    f56837c = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
            case 7:
                kt ktVar5 = (kt) objArr[0];
                int i99 = f56838d;
                int i100 = i99 & 109;
                int i101 = -(-((i99 ^ 109) | i100));
                int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                f56837c = i102 % 128;
                int i103 = i102 % 2;
                ka kaVar6 = ktVar5.f56839a;
                di diVar = (di) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar6}, 974755449, -974755438, System.identityHashCode(kaVar6));
                if (diVar == null) {
                    int i104 = f56838d;
                    int i105 = ((i104 | 99) << 1) - (i104 ^ 99);
                    f56837c = i105 % 128;
                    int i106 = i105 % 2;
                    int i107 = (((i104 | 94) << 1) - (i104 ^ 94)) - 1;
                    f56837c = i107 % 128;
                    if (i107 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                ka kaVar7 = ktVar5.f56839a;
                setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar7}, -296152793, 296152815, System.identityHashCode(kaVar7));
                byte[] bArr = (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist));
                setAnimation setanimation5 = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar7, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(kaVar7));
                if (getbeeponfailure6 == null) {
                    int i108 = f56837c;
                    int i109 = ((i108 ^ 52) + ((i108 & 52) << 1)) - 1;
                    f56838d = i109 % 128;
                    int i110 = i109 % 2;
                    System.identityHashCode(ktVar5);
                    System.identityHashCode(ktVar5);
                } else {
                    byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 252497730, -252497710, System.identityHashCode(getbeeponfailure6));
                    if (bArr2 == null) {
                        int i111 = f56837c;
                        int i112 = i111 & 85;
                        int i113 = -(-((i111 ^ 85) | i112));
                        int i114 = (i112 & i113) + (i113 | i112);
                        int i115 = i114 % 128;
                        f56838d = i115;
                        int i116 = i114 % 2;
                        int i117 = (i115 & (-66)) | ((~i115) & 65);
                        int i118 = (i115 & 65) << 1;
                        int i119 = (i117 & i118) + (i118 | i117);
                        f56837c = i119 % 128;
                        int i120 = i119 % 2;
                    } else {
                        bValueOf = Byte.valueOf(ArraysKt___ArraysKt.first(bArr2));
                        int i121 = f56837c;
                        int i122 = ((i121 | 84) << 1) - (i121 ^ 84);
                        int i123 = (i122 ^ (-1)) + (i122 << 1);
                        f56838d = i123 % 128;
                        int i124 = i123 % 2;
                    }
                }
                dg dgVar2 = (dg) di.setDividerPadding(new Object[]{diVar, kaVar7, bArr, bValueOf}, 1002023655, -1002023654, System.identityHashCode(diVar));
                int i125 = f56838d;
                int i126 = i125 & 31;
                int i127 = i125 | 31;
                int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
                f56837c = i128 % 128;
                int i129 = i128 % 2;
                return dgVar2;
            case 8:
                kt ktVar6 = (kt) objArr[0];
                int i130 = f56837c + 89;
                f56838d = i130 % 128;
                if (i130 % 2 == 0) {
                    setDividerPadding(new Object[]{ktVar6, Boolean.FALSE}, -455942023, 455942023, System.identityHashCode(ktVar6));
                } else {
                    setDividerPadding(new Object[]{ktVar6, Boolean.FALSE}, -455942023, 455942023, System.identityHashCode(ktVar6));
                }
                int i131 = f56838d;
                int i132 = ((i131 & 126) + (i131 | 126)) - 1;
                f56837c = i132 % 128;
                int i133 = i132 % 2;
                return null;
            default:
                kt ktVar7 = (kt) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                cz czVar = new cz(ktVar7.f56839a);
                int i134 = f56838d;
                int i135 = i134 & 49;
                int i136 = ((i134 | 49) & (~i135)) + (i135 << 1);
                f56837c = i136 % 128;
                if (i136 % 2 == 0) {
                    return null;
                }
                int i137 = 16 / 0;
                return null;
        }
        return objValueOf;
    }

    public final void setX() throws Exception {
        setDividerPadding(new Object[]{this}, -1265802861, 1265802862, System.identityHashCode(this));
    }
}
