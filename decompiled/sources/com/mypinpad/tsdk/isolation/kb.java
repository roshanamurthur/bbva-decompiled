package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class kb implements setAccessibilityPaneTitle.setY {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56766b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56767c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f56768a = new LinkedHashMap();

    public static final class a implements AutoCloseable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56769q0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final byte[] f56770p0;

        public a(@NotNull byte[] bArr, @NotNull getBeepOnFailure getbeeponfailure) {
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            this.f56770p0 = ArraysKt___ArraysJvmKt.plus(bArr, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)));
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int iHashCode;
            Class<?> cls;
            Boolean boolValueOf;
            int i13 = ~i12;
            int i14 = (~i10) | i13;
            int i15 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i14))) * 369) + (((~i14) | i11) * (-369)) + ((i10 | i11 | i13) * (-369)) + (i11 * 370) + (i10 * 370);
            if (i15 == 1) {
                a aVar = (a) objArr[0];
                int i16 = f56769q0;
                int i17 = i16 & 1;
                int i18 = (i17 - (~((i16 ^ 1) | i17))) - 1;
                int i19 = i18 % 128;
                if (i18 % 2 != 0) {
                    setRemoteViewsAdapter.setX(new Object[]{aVar.f56770p0}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                    return null;
                }
                setRemoteViewsAdapter.setX(new Object[]{aVar.f56770p0}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                throw null;
            }
            if (i15 == 2) {
                a aVar2 = (a) objArr[0];
                int i20 = f56769q0 + 51;
                int i21 = i20 % 128;
                int i22 = i20 % 2;
                a(new Object[]{aVar2}, -465374459, 465374460, System.identityHashCode(aVar2));
                int i23 = f56769q0 + 63;
                int i24 = i23 % 128;
                int i25 = i23 % 2;
                return null;
            }
            if (i15 != 3) {
                a aVar3 = (a) objArr[0];
                Object obj = objArr[1];
                int i26 = f56769q0;
                int i27 = i26 ^ 63;
                int i28 = ((i26 & 63) | i27) << 1;
                int i29 = -i27;
                int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                int i31 = i30 % 128;
                if (i30 % 2 == 0) {
                    throw null;
                }
                if (aVar3 == obj) {
                    int i32 = i31 + 115;
                    f56769q0 = i32 % 128;
                    boolValueOf = Boolean.valueOf(i32 % 2 == 0);
                } else {
                    Class<?> cls2 = aVar3.getClass();
                    if (obj == null) {
                        int i33 = f56769q0;
                        int i34 = (-2) - (((i33 ^ 48) + ((i33 & 48) << 1)) ^ (-1));
                        int i35 = i34 % 128;
                        int i36 = i34 % 2;
                        int i37 = ((i35 & 78) + (i35 | 78)) - 1;
                        f56769q0 = i37 % 128;
                        int i38 = i37 % 2;
                        cls = null;
                    } else {
                        cls = obj.getClass();
                        int i39 = f56769q0 + 61;
                        int i40 = i39 % 128;
                        int i41 = i39 % 2;
                    }
                    if (!Intrinsics.areEqual(cls2, cls)) {
                        int i42 = f56769q0;
                        int i43 = (i42 & 43) + (i42 | 43);
                        int i44 = i43 % 128;
                        int i45 = i43 % 2;
                        int i46 = i42 & 77;
                        int i47 = i42 | 77;
                        int i48 = (i46 & i47) + (i47 | i46);
                        int i49 = i48 % 128;
                        if (i48 % 2 == 0) {
                            int i50 = 76 / 0;
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = Boolean.FALSE;
                        }
                    } else {
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mypinpad.softpos.emv.terminal.kernel.kernel6.cache.TearingLogs.CardFingerprint");
                        }
                        if (Arrays.equals(aVar3.f56770p0, ((a) obj).f56770p0)) {
                            int i51 = f56769q0 + 105;
                            int i52 = i51 % 128;
                            if (i51 % 2 == 0) {
                                int i53 = 40 / 0;
                                boolValueOf = Boolean.TRUE;
                            } else {
                                boolValueOf = Boolean.TRUE;
                            }
                        } else {
                            int i54 = f56769q0;
                            int i55 = i54 & 87;
                            int i56 = ((i54 ^ 87) | i55) << 1;
                            int i57 = -((~i55) & (i54 | 87));
                            int i58 = (i56 & i57) + (i56 | i57);
                            int i59 = i58 % 128;
                            boolean z10 = i58 % 2 == 0;
                            int i60 = ((((i54 ^ 25) | (i54 & 25)) << 1) - (~(-(((~i54) & 25) | (i54 & (-26)))))) - 1;
                            int i61 = i60 % 128;
                            if (i60 % 2 == 0) {
                                throw null;
                            }
                            boolValueOf = Boolean.valueOf(z10);
                        }
                    }
                }
                return boolValueOf;
            }
            a aVar4 = (a) objArr[0];
            int iIdentityHashCode = System.identityHashCode(aVar4);
            int i62 = ~iIdentityHashCode;
            int i63 = (1610600431 & i62) | ((~i62) & (-1610600432));
            int i64 = i62 & (-1610600432);
            int i65 = -(-(((i63 & i64) | (i63 ^ i64)) * (-192)));
            int i66 = (-1487855353) & i65;
            int i67 = (i65 | (-1487855353)) & (~i66);
            int i68 = i66 << 1;
            int i69 = (i67 ^ i68) + ((i67 & i68) << 1);
            int i70 = ((-535564208) ^ i62) | ((-535564208) & i62);
            int i71 = ~i70;
            int i72 = (i70 | i71) & i71;
            int i73 = 355208200 ^ i72;
            int i74 = i72 & 355208200;
            int i75 = ((i74 & i73) | (i73 ^ i74)) * (-384);
            int i76 = i69 & i75;
            int i77 = (i75 ^ i69) | i76;
            int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
            int i79 = (-355208201) & iIdentityHashCode;
            int i80 = ((-355208201) | iIdentityHashCode) & (~i79);
            int i81 = ~((i80 & i79) | (i80 ^ i79));
            int i82 = i62 & (i62 | iIdentityHashCode);
            int i83 = (-535564208) ^ i82;
            int i84 = i82 & (-535564208);
            int i85 = (i84 & i83) | (i83 ^ i84);
            int i86 = (1255392231 & i85) | ((~i85) & (-1255392232));
            int i87 = i85 & (-1255392232);
            int i88 = (i87 & i86) | (i86 ^ i87);
            int i89 = ~i88;
            int i90 = (i88 | i89) & i89;
            int i91 = i81 ^ i90;
            int i92 = i90 & i81;
            int i93 = (i92 & i91) | (i91 ^ i92);
            int i94 = (-1075036225) ^ iIdentityHashCode;
            int i95 = iIdentityHashCode & (-1075036225);
            int i96 = ~((i95 & i94) | (i94 ^ i95));
            int i97 = i93 ^ i96;
            int i98 = i96 & i93;
            int i99 = ((i98 & i97) | (i97 ^ i98)) * 192;
            int i100 = ((i78 ^ i99) | (i78 & i99)) << 1;
            int i101 = -((i99 & (~i78)) | ((~i99) & i78));
            int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
            int iIdentityHashCode2 = System.identityHashCode(aVar4);
            int i103 = (-1596164307) & iIdentityHashCode2;
            int i104 = (~i103) & ((-1596164307) | iIdentityHashCode2);
            int i105 = ~iIdentityHashCode2;
            int i106 = (i103 & i104) | (i104 ^ i103);
            int i107 = ~i106;
            int i108 = (i106 | i107) & i107;
            int i109 = ((~i108) & 1442425283) | ((-1442425284) & i108);
            int i110 = i108 & 1442425283;
            int i111 = ((i110 & i109) | (i109 ^ i110)) * Opcodes.ATHROW;
            int i112 = (-703765563) & i111;
            int i113 = (i112 - (~((i111 ^ (-703765563)) | i112))) - 1;
            int i114 = (iIdentityHashCode2 | i105) & i105;
            int i115 = (1596164306 & i114) | ((~i114) & (-1596164307));
            int i116 = i114 & (-1596164307);
            int i117 = (i116 & i115) | (i115 ^ i116);
            int i118 = ~i117;
            int i119 = (i117 | i118) & i118;
            int i120 = 1428261058 & i119;
            int i121 = (((i119 | 1428261058) & (~i120)) | i120) * Opcodes.ATHROW;
            int i122 = i113 & i121;
            int i123 = -(-((i121 ^ i113) | i122));
            int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
            byte[] bArr = aVar4.f56770p0;
            if (i102 > i124) {
                iHashCode = Arrays.hashCode(bArr);
                int i125 = 38 / 0;
            } else {
                iHashCode = Arrays.hashCode(bArr);
            }
            return Integer.valueOf(iHashCode);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            a(new Object[]{this}, -122638930, 122638932, System.identityHashCode(this));
        }

        public final boolean equals(@Nullable Object obj) {
            return ((Boolean) a(new Object[]{this, obj}, -6362322, 6362322, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) a(new Object[]{this}, 855726146, -855726143, System.identityHashCode(this))).intValue();
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Iterator it;
        int i13 = ~i12;
        int i14 = ~i11;
        int i15 = (((~(i10 | i11 | i12)) | (~(i13 | i14)) | (~((~i10) | i14))) * 757) + ((~(i14 | i10 | i12)) * 1514) + ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
        if (i15 == 1) {
            kb kbVar = (kb) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[2];
            int i16 = f56767c;
            int i17 = ((i16 | 29) << 1) - (i16 ^ 29);
            f56766b = i17 % 128;
            if (i17 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bArr, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(bArr, "");
            if (getbeeponfailure == null) {
                int i18 = f56767c;
                int i19 = i18 & 3;
                int i20 = ((i18 ^ 3) | i19) << 1;
                int i21 = -((i18 | 3) & (~i19));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f56766b = i22 % 128;
                int i23 = i22 % 2;
                return null;
            }
            a aVar = new a(bArr, getbeeponfailure);
            try {
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) kbVar.f56768a.get(aVar);
                AutoCloseableKt.closeFinally(aVar, null);
                int i24 = f56767c;
                int i25 = ((i24 & (-106)) | ((~i24) & 105)) + ((i24 & 105) << 1);
                f56766b = i25 % 128;
                if (i25 % 2 == 0) {
                    return getbeeponfailure2;
                }
                throw null;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AutoCloseableKt.closeFinally(aVar, th2);
                    throw th3;
                }
            }
        }
        if (i15 == 2) {
            kb kbVar2 = (kb) objArr[0];
            int i26 = f56766b;
            int i27 = i26 & 111;
            int i28 = i27 + ((i26 ^ 111) | i27);
            f56767c = i28 % 128;
            int i29 = i28 % 2;
            setX(new Object[]{kbVar2}, -998431871, 998431874, System.identityHashCode(kbVar2));
            int i30 = f56767c;
            int i31 = (((i30 | 63) << 1) - (~(-(((~i30) & 63) | (i30 & (-64)))))) - 1;
            f56766b = i31 % 128;
            int i32 = i31 % 2;
            return null;
        }
        if (i15 != 3) {
            if (i15 != 4) {
                kb kbVar3 = (kb) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[2];
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[3];
                Intrinsics.checkNotNullParameter(bArr2, "");
                Intrinsics.checkNotNullParameter(getbeeponfailure3, "");
                Intrinsics.checkNotNullParameter(getbeeponfailure4, "");
                kbVar3.f56768a.put(new a(bArr2, getbeeponfailure3), getbeeponfailure4);
                int i33 = f56766b;
                int i34 = i33 ^ 11;
                int i35 = (i33 & 11) << 1;
                int i36 = (i34 & i35) + (i35 | i34);
                f56767c = i36 % 128;
                if (i36 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            kb kbVar4 = (kb) objArr[0];
            int i37 = f56767c + 73;
            f56766b = i37 % 128;
            int i38 = i37 % 2;
            LinkedHashMap linkedHashMap = kbVar4.f56768a;
            if (i38 != 0) {
                linkedHashMap.isEmpty();
                throw null;
            }
            boolean zIsEmpty = linkedHashMap.isEmpty();
            int i39 = f56766b;
            int i40 = ((i39 ^ 29) | (i39 & 29)) << 1;
            int i41 = -(((~i39) & 29) | (i39 & (-30)));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            f56767c = i42 % 128;
            if (i42 % 2 != 0) {
                return Boolean.valueOf(zIsEmpty);
            }
            throw null;
        }
        kb kbVar5 = (kb) objArr[0];
        int i43 = f56766b;
        int i44 = (i43 & (-66)) | ((~i43) & 65);
        int i45 = -(-((i43 & 65) << 1));
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        f56767c = i46 % 128;
        if (i46 % 2 == 0) {
            it = kbVar5.f56768a.entrySet().iterator();
            int i47 = 60 / 0;
        } else {
            it = kbVar5.f56768a.entrySet().iterator();
        }
        int i48 = f56767c;
        int i49 = i48 & 21;
        int i50 = (((i48 ^ 21) | i49) << 1) - ((i48 | 21) & (~i49));
        f56766b = i50 % 128;
        int i51 = i50 % 2;
        while (it.hasNext()) {
            int i52 = f56766b;
            int i53 = i52 & 53;
            int i54 = -(-((i52 ^ 53) | i53));
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            f56767c = i55 % 128;
            if (i55 % 2 == 0) {
                Map.Entry entry = (Map.Entry) it.next();
                a aVar2 = (a) entry.getKey();
                getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) entry.getValue();
                a.a(new Object[]{aVar2}, -465374459, 465374460, System.identityHashCode(aVar2));
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure5));
                throw null;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            a aVar3 = (a) entry2.getKey();
            getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) entry2.getValue();
            a.a(new Object[]{aVar3}, -465374459, 465374460, System.identityHashCode(aVar3));
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure6));
            int i56 = f56767c;
            int i57 = i56 & 5;
            int i58 = -(-(i56 | 5));
            int i59 = (i57 & i58) + (i58 | i57);
            f56766b = i59 % 128;
            int i60 = i59 % 2;
        }
        kbVar5.f56768a.clear();
        int i61 = f56766b;
        int i62 = i61 & 55;
        int i63 = -(-(i61 | 55));
        int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
        f56767c = i64 % 128;
        int i65 = i64 % 2;
        return null;
    }

    @Override // com.mypinpad.tsdk.i.setAccessibilityPaneTitle.setY
    public final void setCompoundDrawableTintBlendMode() throws Exception {
        setX(new Object[]{this}, 955630447, -955630445, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener() throws Exception {
        setX(new Object[]{this}, -998431871, 998431874, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setX(@NotNull byte[] bArr, @Nullable getBeepOnFailure getbeeponfailure) {
        return (getBeepOnFailure) setX(new Object[]{this, bArr, getbeeponfailure}, -769591334, 769591335, System.identityHashCode(this));
    }

    public final void setX(@NotNull byte[] bArr, @NotNull getBeepOnFailure getbeeponfailure, @NotNull getBeepOnFailure getbeeponfailure2) throws Exception {
        setX(new Object[]{this, bArr, getbeeponfailure, getbeeponfailure2}, 1914418543, -1914418543, System.identityHashCode(this));
    }

    public final boolean setX() {
        return ((Boolean) setX(new Object[]{this}, -1837987600, 1837987604, System.identityHashCode(this))).booleanValue();
    }
}
