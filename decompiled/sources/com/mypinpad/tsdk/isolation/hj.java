package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/hj;", "", "Lcom/mypinpad/tsdk/i/dk;", "p0", "", "p1", "Lcom/mypinpad/tsdk/i/gv;", "p2", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p3", "Lcom/mypinpad/tsdk/i/dg;", "p4", "Lcom/mypinpad/tsdk/i/setRotationX;", "p5", "Lcom/mypinpad/tsdk/i/dt;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/dk;Lcom/mypinpad/tsdk/i/gv;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/dg;Lcom/mypinpad/tsdk/i/setRotationX;)Lcom/mypinpad/tsdk/i/dt;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class hj {

    @NotNull
    public static final hj INSTANCE = new hj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56196a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56197b = 1;

    static {
        int i10 = f56197b;
        int i11 = (i10 ^ 43) + ((i10 & 43) << 1);
        f56196a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        dk dkVar = (dk) objArr[0];
        gv gvVar = (gv) objArr[1];
        setContentDescription setcontentdescription = (setContentDescription) objArr[2];
        dg dgVar = (dg) objArr[3];
        setRotationX setrotationx = (setRotationX) objArr[4];
        Intrinsics.checkNotNullParameter(dkVar, "");
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(dgVar, "");
        Intrinsics.checkNotNullParameter(setrotationx, "");
        gx gxVar = new gx(setrotationx.setX());
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) gx.setCompoundDrawableTintBlendMode(new Object[]{gxVar}, -89900749, 89900754, System.identityHashCode(gxVar));
        byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
        dj.setY sety = dj.setY;
        dj djVar = (dj) dj.setY.setX(new Object[]{gvVar, setcontentdescription, dgVar}, 1210480347, -1210480347, (int) System.currentTimeMillis());
        if (djVar == null) {
            int i13 = f56197b;
            int i14 = ((i13 ^ 94) + ((i13 & 94) << 1)) - 1;
            f56196a = i14 % 128;
            int i15 = i14 % 2;
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{20010, null, 6}, 1336485880, -1336485874, 20010);
            int i16 = f56197b + 17;
            f56196a = i16 % 128;
            if (i16 % 2 == 0) {
                return null;
            }
            throw null;
        }
        df.setDividerPadding setdividerpadding = df.setDividerPadding;
        df dfVar = (df) df.setDividerPadding.setOnFocusChangeListener(new Object[]{gvVar, setcontentdescription, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2004011430, 2004011432, System.identityHashCode(djVar)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{djVar}, -2055662065, 2055662076, System.identityHashCode(djVar))}, 969232069, -969232068, (int) System.currentTimeMillis());
        if (dfVar == null) {
            int i17 = f56197b;
            int i18 = i17 & 77;
            int i19 = -(-(i17 | 77));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f56196a = i20 % 128;
            int i21 = i20 % 2;
            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{20012, null, 6}, 1336485880, -1336485874, 20012);
            int i22 = f56196a;
            int i23 = i22 & 51;
            int i24 = (i23 - (~((i22 ^ 51) | i23))) - 1;
            f56197b = i24 % 128;
            if (i24 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (bArr.length != ((byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2004011430, 2004011432, System.identityHashCode(dfVar))).length) {
            int i25 = f56197b;
            int i26 = i25 & 113;
            int i27 = -(-(i25 | 113));
            int i28 = (i26 & i27) + (i27 | i26);
            f56196a = i28 % 128;
            int i29 = i28 % 2;
            SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{20013, null, 6}, 1336485880, -1336485874, 20013);
            int i30 = f56197b;
            int i31 = (i30 ^ 35) + ((i30 & 35) << 1);
            f56196a = i31 % 128;
            int i32 = i31 % 2;
            return null;
        }
        dr drVar = new dr((byte[]) dl.Companion.setOnFocusChangeListener(new Object[]{bArr, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2004011430, 2004011432, System.identityHashCode(dfVar)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar}, -2055662065, 2055662076, System.identityHashCode(dfVar))}, -1375611456, 1375611456, (int) System.currentTimeMillis()));
        if (((Byte) dr.setX(new Object[]{drVar}, -1465781391, 1465781396, System.identityHashCode(drVar))).byteValue() != 106) {
            int i33 = f56197b + 115;
            f56196a = i33 % 128;
            if (i33 % 2 == 0) {
                return null;
            }
            int i34 = 70 / 0;
            return null;
        }
        if (((Byte) dr.setX(new Object[]{drVar}, 640139105, -640139096, System.identityHashCode(drVar))).byteValue() != 5) {
            int i35 = f56197b;
            int i36 = i35 | 39;
            int i37 = i36 << 1;
            int i38 = -(i36 & (~(i35 & 39)));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f56196a = i39 % 128;
            int i40 = i39 % 2;
            int i41 = i35 & 25;
            int i42 = ((i35 | 25) & (~i41)) + (i41 << 1);
            f56196a = i42 % 128;
            if (i42 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (((Byte) dr.setX(new Object[]{drVar}, 562516893, -562516887, System.identityHashCode(drVar))).byteValue() != -68) {
            int i43 = f56196a;
            int i44 = i43 & 119;
            int i45 = i44 + ((i43 ^ 119) | i44);
            int i46 = i45 % 128;
            f56197b = i46;
            if (i45 % 2 == 0) {
                throw null;
            }
            int i47 = i46 ^ 79;
            int i48 = ((i46 & 79) | i47) << 1;
            int i49 = -i47;
            int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
            f56196a = i50 % 128;
            int i51 = i50 % 2;
            return null;
        }
        try {
            dt dtVar = new dt(drVar.setDividerPadding(), dkVar);
            int i52 = f56197b;
            int i53 = ((i52 ^ 79) | (i52 & 79)) << 1;
            int i54 = -((79 & (~i52)) | (i52 & (-80)));
            int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
            f56196a = i55 % 128;
            int i56 = i55 % 2;
            int i57 = i52 + 11;
            f56196a = i57 % 128;
            int i58 = i57 % 2;
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) gx.setCompoundDrawableTintBlendMode(new Object[]{gxVar}, -1617299184, 1617299192, System.identityHashCode(gxVar));
            if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))[0] != ((Byte) dp.setY(new Object[]{dtVar}, -2037836328, 2037836331, System.identityHashCode(dtVar))).byteValue()) {
                int i59 = f56197b;
                int i60 = i59 & 111;
                int i61 = (i59 | 111) & (~i60);
                int i62 = i60 << 1;
                int i63 = (i61 ^ i62) + ((i61 & i62) << 1);
                int i64 = i63 % 128;
                f56196a = i64;
                int i65 = i63 % 2;
                int i66 = i64 ^ 93;
                int i67 = (((i64 & 93) | i66) << 1) - i66;
                f56197b = i67 % 128;
                if (i67 % 2 != 0) {
                    return null;
                }
                int i68 = 92 / 0;
                return null;
            }
            setAnimation setanimation = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar));
            Intrinsics.checkNotNull(getbeeponfailure3);
            if (!Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) dr.setX(new Object[]{drVar}, -845228896, 845228903, System.identityHashCode(drVar))}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) dy.setDividerPadding(new Object[]{(byte[]) dr.setX(new Object[]{drVar, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3))}, -1014006140, 1014006148, System.identityHashCode(drVar))}, 504323118, -504323118, (int) System.currentTimeMillis())}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                System.currentTimeMillis();
                System.currentTimeMillis();
                int i69 = f56196a;
                int i70 = ((i69 & (-100)) | ((~i69) & 99)) + ((i69 & 99) << 1);
                f56197b = i70 % 128;
                if (i70 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[0], (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar}, 553421671, -553421615, System.identityHashCode(gvVar)));
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 75174323, -75174132, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar));
            Intrinsics.checkNotNull(getbeeponfailure4);
            byte[] bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArrPlus, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 252497730, -252497710, System.identityHashCode(getbeeponfailure4)));
            System.currentTimeMillis();
            System.currentTimeMillis();
            for (getBeepOnFailure getbeeponfailure5 : gxVar.setOnDragListener()) {
                int i71 = f56196a;
                int i72 = i71 & 83;
                int i73 = i72 + ((i71 ^ 83) | i72);
                f56197b = i73 % 128;
                int i74 = i73 % 2;
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 865402441, -865402437, System.identityHashCode(getbeeponfailure5));
                String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
                if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                    int i75 = f56197b;
                    int i76 = i75 & 55;
                    int i77 = (i75 | 55) & (~i76);
                    int i78 = -(-(i76 << 1));
                    int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                    f56196a = i79 % 128;
                    if (i79 % 2 != 0) {
                        bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArrPlus2, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 243863605, -243863605, System.identityHashCode(getbeeponfailure5)));
                        int i80 = 68 / 0;
                    } else {
                        bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArrPlus2, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 243863605, -243863605, System.identityHashCode(getbeeponfailure5)));
                    }
                    int i81 = f56197b;
                    int i82 = (((i81 | 100) << 1) - (i81 ^ 100)) - 1;
                    f56196a = i82 % 128;
                    int i83 = i82 % 2;
                }
                int i84 = f56197b;
                int i85 = i84 & 15;
                int i86 = ((i84 ^ 15) | i85) << 1;
                int i87 = -((i84 | 15) & (~i85));
                int i88 = (i86 & i87) + (i87 | i86);
                f56196a = i88 % 128;
                int i89 = i88 % 2;
            }
            if (Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) dp.setY(new Object[]{dtVar}, 1264143770, -1264143769, System.identityHashCode(dtVar))}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) dy.setDividerPadding(new Object[]{bArrPlus2}, 504323118, -504323118, (int) System.currentTimeMillis())}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                int i90 = f56196a;
                int i91 = (i90 & 104) + (i90 | 104);
                int i92 = (i91 ^ (-1)) + (i91 << 1);
                f56197b = i92 % 128;
                if (i92 % 2 != 0) {
                    return dtVar;
                }
                throw null;
            }
            int i93 = f56197b;
            int i94 = i93 & 39;
            int i95 = (i93 ^ 39) | i94;
            int i96 = (i94 & i95) + (i94 | i95);
            f56196a = i96 % 128;
            if (i96 % 2 != 0) {
                throw null;
            }
            int i97 = i93 & 51;
            int i98 = i97 + ((i93 ^ 51) | i97);
            f56196a = i98 % 128;
            if (i98 % 2 == 0) {
                return null;
            }
            int i99 = 62 / 0;
            return null;
        } catch (Exception unused) {
            SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{"2"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
            return null;
        }
    }

    @Nullable
    public static dt setOnFocusChangeListener(@NotNull dk dkVar, @NotNull gv gvVar, @NotNull setContentDescription setcontentdescription, @NotNull dg dgVar, @NotNull setRotationX setrotationx) {
        return (dt) setOnFocusChangeListener(new Object[]{dkVar, gvVar, setcontentdescription, dgVar, setrotationx}, -1013702660, 1013702660, (int) System.currentTimeMillis());
    }
}
