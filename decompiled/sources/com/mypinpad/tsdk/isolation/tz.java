package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tz {
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        sd sdVar = (sd) objArr[0];
        Intrinsics.checkNotNullParameter(sdVar, "");
        int compoundDrawableTintBlendMode = sdVar.setCompoundDrawableTintBlendMode();
        int x4 = sdVar.setX();
        int navigationOnClickListener = sdVar.setNavigationOnClickListener();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i13 = navigationOnClickListener * (-764);
        int i14 = (-15290000) & i13;
        int i15 = ((((-15290000) ^ i13) | i14) << 1) - ((i13 | (-15290000)) & (~i14));
        int i16 = ~navigationOnClickListener;
        int i17 = (-10001) & i16;
        int i18 = ((-10001) ^ i16) | i17;
        int i19 = ~iCurrentTimeMillis;
        int i20 = i18 & i19;
        int i21 = (i18 | i19) & (~i20);
        int i22 = ~((i21 & i20) | (i21 ^ i20));
        int i23 = (-10001) & navigationOnClickListener;
        int i24 = (~i23) & ((-10001) | navigationOnClickListener);
        int i25 = (i23 & i24) | (i24 ^ i23);
        int i26 = i25 ^ iCurrentTimeMillis;
        int i27 = i25 & iCurrentTimeMillis;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = ~i28;
        int i30 = (i28 | i29) & i29;
        int i31 = (i22 & i30) | ((~i30) & i22) | ((~i22) & i30);
        int i32 = (navigationOnClickListener | i16) & i16;
        int i33 = (i32 & 10000) | (i32 ^ 10000);
        int i34 = i33 & iCurrentTimeMillis;
        int i35 = (i33 | iCurrentTimeMillis) & (~i34);
        int i36 = (i35 & i34) | (i35 ^ i34);
        int i37 = ~i36;
        int i38 = (i36 | i37) & i37;
        int i39 = i31 & i38;
        int i40 = (i38 | i31) & (~i39);
        int i41 = ((i40 & i39) | (i40 ^ i39)) * 765;
        int i42 = i15 & i41;
        int i43 = -(-((i41 ^ i15) | i42));
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        int i45 = (~i17) & ((-10001) | i16);
        int i46 = ~((i45 & i17) | (i45 ^ i17));
        int i47 = ~(((-10001) ^ i19) | ((-10001) & i19));
        int i48 = i46 & i47;
        int i49 = (i46 | i47) & (~i48);
        int i50 = ((i49 & i48) | (i49 ^ i48)) * 1530;
        int i51 = i44 & i50;
        int i52 = i51 + ((i50 ^ i44) | i51);
        int i53 = (-10001) & iCurrentTimeMillis;
        int i54 = (iCurrentTimeMillis | (-10001)) & (~i53);
        int i55 = (i53 & i54) | (i54 ^ i53);
        int i56 = ~i55;
        int i57 = (i55 | i56) & i56;
        int i58 = i16 | i19;
        int i59 = ~((i58 & 10000) | (i58 ^ 10000));
        int i60 = i57 & i59;
        int i61 = (i57 | i59) & (~i60);
        int i62 = -(-(((i61 & i60) | (i61 ^ i60)) * 765));
        int i63 = ((~i62) & i52) | ((~i52) & i62);
        int i64 = -(-((i62 & i52) << 1));
        return new tw(compoundDrawableTintBlendMode, x4, (i63 & i64) + (i64 | i63));
    }

    @NotNull
    public static final tw setY(@NotNull sd sdVar) {
        return (tw) setX(new Object[]{sdVar}, -2006376377, 2006376377, (int) System.currentTimeMillis());
    }
}
