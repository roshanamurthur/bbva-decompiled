package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/ii;", "", "Lcom/mypinpad/tsdk/i/gv;", "p0", "Lcom/mypinpad/tsdk/i/setFitsSystemWindows;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/gv;)Lcom/mypinpad/tsdk/i/setFitsSystemWindows;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ii {

    @NotNull
    public static final ii INSTANCE = new ii();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56463a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56464b = 1;

    static {
        int i10 = f56463a;
        int i11 = i10 & 23;
        int i12 = (i11 - (~((i10 ^ 23) | i11))) - 1;
        f56464b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 59 / 0;
        }
    }

    @NotNull
    public static setFitsSystemWindows setOnFocusChangeListener(@NotNull gv p4) {
        return (setFitsSystemWindows) setY(new Object[]{p4}, -553802178, 553802178, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        gv gvVar = (gv) objArr[0];
        Intrinsics.checkNotNullParameter(gvVar, "");
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{20017, null, 6}, 1336485880, -1336485874, 20017);
        cz czVar = new cz(gvVar);
        long jLongValue = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{czVar}, 252497730, -252497710, System.identityHashCode(czVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
        setAnimation setanimation = setAnimation.INSTANCE;
        long jLongValue2 = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 166350058, -166349798, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 812392256, -812392155, (int) System.currentTimeMillis());
        if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(gvVar))).booleanValue())) {
            int i13 = f56463a;
            int i14 = i13 ^ 97;
            int i15 = ((i13 & 97) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 & i16) + (i16 | i15);
            f56464b = i17 % 128;
            int i18 = i17 % 2;
            if (((((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 812392256, -812392155, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue() | jLongValue2) & jLongValue) != 0) {
                int i19 = f56464b;
                int i20 = i19 & 81;
                int i21 = (((i19 ^ 81) | i20) << 1) - ((i19 | 81) & (~i20));
                f56463a = i21 % 128;
                if (i21 % 2 != 0) {
                    setFitsSystemWindows.Companion companion = setFitsSystemWindows.INSTANCE;
                    throw null;
                }
                setFitsSystemWindows setfitssystemwindows = setFitsSystemWindows.setOnFocusChangeListener;
                int i22 = f56464b;
                int i23 = i22 | 25;
                int i24 = ((i23 << 1) - (~(-((~(i22 & 25)) & i23)))) - 1;
                f56463a = i24 % 128;
                int i25 = i24 % 2;
                return setfitssystemwindows;
            }
        } else if ((jLongValue2 & jLongValue) != 0) {
            int i26 = f56464b;
            int i27 = i26 ^ 45;
            int i28 = (i26 & 45) << 1;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f56463a = i29 % 128;
            int i30 = i29 % 2;
            setFitsSystemWindows setfitssystemwindows2 = setFitsSystemWindows.setOnFocusChangeListener;
            int i31 = f56463a;
            int i32 = (((i31 ^ 29) | (i31 & 29)) << 1) - (((~i31) & 29) | (i31 & (-30)));
            f56464b = i32 % 128;
            if (i32 % 2 != 0) {
                return setfitssystemwindows2;
            }
            throw null;
        }
        cx cxVar = new cx(gvVar);
        cw cwVar = (cw) ((setImageTintList) w.setX(new Object[]{cxVar}, 1693919772, -1693919769, System.identityHashCode(cxVar)));
        byte x4 = ((da) cw.setY(new Object[]{cwVar}, -1066192597, 1066192597, System.identityHashCode(cwVar))).setX();
        if (x4 != 17) {
            int i33 = f56464b;
            int i34 = i33 + 115;
            f56463a = i34 % 128;
            int i35 = i34 % 2;
            if (x4 != 33) {
                int i36 = i33 & 97;
                int i37 = -(-(i33 | 97));
                int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                f56463a = i38 % 128;
                if (i38 % 2 == 0 ? x4 != 20 : x4 != 38) {
                    int i39 = i33 | 115;
                    int i40 = i39 << 1;
                    int i41 = -((~(i33 & 115)) & i39);
                    int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                    int i43 = i42 % 128;
                    f56463a = i43;
                    if (i42 % 2 == 0 ? x4 != 36 : x4 != 29) {
                        if (x4 != 52) {
                            if (x4 != 35) {
                                int i44 = i43 + 43;
                                f56464b = i44 % 128;
                                if (i44 % 2 != 0 ? x4 != 38 : x4 != 25) {
                                    int i45 = (i43 & 113) + (i43 | 113);
                                    int i46 = i45 % 128;
                                    f56464b = i46;
                                    if (i45 % 2 != 0 ? x4 != 54 : x4 != 43) {
                                        if (x4 != 19) {
                                            int i47 = (-2) - ((i46 + 80) ^ (-1));
                                            f56463a = i47 % 128;
                                            int i48 = i47 % 2;
                                            if (x4 != 22) {
                                                long jLongValue3 = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -1173953479, 1173953575, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
                                                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1457907498, 1457907557, (int) System.currentTimeMillis());
                                                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -232375606, 232375652, System.identityHashCode(gvVar))).booleanValue()) {
                                                    if (((1099511627772L | jLongValue3) & jLongValue) == 0) {
                                                        int i49 = f56463a + 3;
                                                        f56464b = i49 % 128;
                                                        if (i49 % 2 != 0) {
                                                            return setFitsSystemWindows.setDividerPadding;
                                                        }
                                                        int i50 = 67 / 0;
                                                        return setFitsSystemWindows.setDividerPadding;
                                                    }
                                                    setFitsSystemWindows setfitssystemwindows3 = setFitsSystemWindows.setX;
                                                    int i51 = f56463a;
                                                    int i52 = i51 ^ 75;
                                                    int i53 = ((i51 & 75) | i52) << 1;
                                                    int i54 = -i52;
                                                    int i55 = (i53 & i54) + (i53 | i54);
                                                    f56464b = i55 % 128;
                                                    int i56 = i55 % 2;
                                                    return setfitssystemwindows3;
                                                }
                                                int i57 = f56464b;
                                                int i58 = (-2) - (((i57 ^ 6) + ((i57 & 6) << 1)) ^ (-1));
                                                f56463a = i58 % 128;
                                                int i59 = i58 % 2;
                                                if (((((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -1457907498, 1457907557, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue() | jLongValue3) & jLongValue) != 0) {
                                                    setFitsSystemWindows setfitssystemwindows4 = setFitsSystemWindows.setX;
                                                    int i60 = f56463a + 99;
                                                    f56464b = i60 % 128;
                                                    if (i60 % 2 != 0) {
                                                        return setfitssystemwindows4;
                                                    }
                                                    throw null;
                                                }
                                                int i61 = f56464b;
                                                int i62 = ((i61 ^ 27) | (i61 & 27)) << 1;
                                                int i63 = -(((~i61) & 27) | (i61 & (-28)));
                                                int i64 = (i62 & i63) + (i63 | i62);
                                                f56463a = i64 % 128;
                                                int i65 = i64 % 2;
                                                setFitsSystemWindows setfitssystemwindows5 = setFitsSystemWindows.setDividerPadding;
                                                int i66 = f56463a + 95;
                                                f56464b = i66 % 128;
                                                int i67 = i66 % 2;
                                                return setfitssystemwindows5;
                                            }
                                        }
                                    }
                                }
                            }
                            long jLongValue4 = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 499827513, -499827474, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
                            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -956296156, 956296218, (int) System.currentTimeMillis());
                            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -232375606, 232375652, System.identityHashCode(gvVar))).booleanValue()) {
                                if (((1099511627772L | jLongValue4) & jLongValue) != 0) {
                                    setFitsSystemWindows setfitssystemwindows6 = setFitsSystemWindows.setOnFocusChangeListener;
                                    int i68 = f56464b + 81;
                                    f56463a = i68 % 128;
                                    int i69 = i68 % 2;
                                    return setfitssystemwindows6;
                                }
                                int i70 = f56464b;
                                int i71 = (i70 & (-4)) | ((~i70) & 3);
                                int i72 = (i70 & 3) << 1;
                                int i73 = (i71 & i72) + (i72 | i71);
                                f56463a = i73 % 128;
                                if (i73 % 2 == 0) {
                                    return setFitsSystemWindows.setDividerPadding;
                                }
                                setFitsSystemWindows.Companion companion2 = setFitsSystemWindows.INSTANCE;
                                throw null;
                            }
                            int i74 = f56463a + 105;
                            f56464b = i74 % 128;
                            int i75 = i74 % 2;
                            if (((((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -956296156, 956296218, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue() | jLongValue4) & jLongValue) == 0) {
                                int i76 = f56464b + 19;
                                f56463a = i76 % 128;
                                if (i76 % 2 == 0) {
                                    return setFitsSystemWindows.setDividerPadding;
                                }
                                setFitsSystemWindows.Companion companion3 = setFitsSystemWindows.INSTANCE;
                                throw null;
                            }
                            setFitsSystemWindows setfitssystemwindows7 = setFitsSystemWindows.setOnFocusChangeListener;
                            int i77 = f56463a;
                            int i78 = i77 ^ 1;
                            int i79 = ((i77 & 1) | i78) << 1;
                            int i80 = -i78;
                            int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
                            f56464b = i81 % 128;
                            int i82 = i81 % 2;
                            return setfitssystemwindows7;
                        }
                    }
                }
            }
        }
        setFitsSystemWindows setfitssystemwindows8 = setFitsSystemWindows.setX;
        int i83 = f56463a;
        int i84 = i83 & 7;
        int i85 = (i83 | 7) & (~i84);
        int i86 = i84 << 1;
        int i87 = (i85 & i86) + (i85 | i86);
        f56464b = i87 % 128;
        int i88 = i87 % 2;
        return setfitssystemwindows8;
    }
}
