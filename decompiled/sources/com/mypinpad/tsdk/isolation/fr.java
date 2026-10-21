package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class fr extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55572h = {i.d(fr.class, "validAtTransitTerminals_B2b6", "getValidAtTransitTerminals_B2b6()Z", 0), i.d(fr.class, "validAtCAT3Terminals_B2b5", "getValidAtCAT3Terminals_B2b5()Z", 0), i.d(fr.class, "validForDomesticMoneyAdd_B2b4", "getValidForDomesticMoneyAdd_B2b4()Z", 0), i.d(fr.class, "validForDomesticVoidTransactions_B2b3", "getValidForDomesticVoidTransactions_B2b3()Z", 0)};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55573i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55574j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f55575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f55576g;

    static {
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = iCurrentTimeMillis & 350876755;
        int i12 = ((-350876756) & i10) | i11 | ((-350876756) & iCurrentTimeMillis);
        int i13 = ~i12;
        int i14 = ~i12;
        int i15 = (i12 | i14) & i13;
        int i16 = 275378195 & i15;
        int i17 = (i15 | 275378195) & (~i16);
        int i18 = -(-(((i17 & i16) | (i17 ^ i16)) * (-814)));
        int i19 = 1647757772 & i18;
        int i20 = (i18 | 1647757772) & (~i19);
        int i21 = i19 << 1;
        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
        int i23 = ((~i10) & 1284640228) | (i10 & (-1284640229));
        int i24 = 1284640228 & i10;
        int i25 = ~((i23 & i24) | (i23 ^ i24));
        int i26 = i25 & 1209141668;
        int i27 = (i25 | 1209141668) & (~i26);
        int i28 = (i27 & i26) | (i27 ^ i26);
        int i29 = (i10 & 350876755) | ((-350876756) & iCurrentTimeMillis);
        int i30 = ~((i29 & i11) | (i29 ^ i11));
        int i31 = (i30 & 1209141668) | ((~i30) & 1209141668) | ((-1209141669) & i30);
        int i32 = (iCurrentTimeMillis & (-1284640229)) | ((-1284640229) ^ iCurrentTimeMillis);
        int i33 = (i32 | (~i32)) & (~i32);
        int i34 = i31 & i33;
        int i35 = (i33 | i31) & (~i34);
        int i36 = ((-1) << 1) - (((((((i28 & i14) | (i28 ^ i14)) * 407) + i22) - (~(-(~(((i35 & i34) | (i35 ^ i34)) * 407))))) - 1) ^ (-1));
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i37 = (1721392005 ^ iCurrentTimeMillis2) | (1721392005 & iCurrentTimeMillis2);
        int i38 = ((-570822853) & i37) | ((~i37) & 570822852);
        int i39 = i37 & 570822852;
        int i40 = ((i39 & i38) | (i38 ^ i39)) * (-381);
        int i41 = (-1688898334) & i40;
        int i42 = (((-1688898334) ^ i40) | i41) << 1;
        int i43 = -((i40 | (-1688898334)) & (~i41));
        int i44 = (i42 & i43) + (i43 | i42);
        int i45 = ~iCurrentTimeMillis2;
        int i46 = ((-1721392006) & i45) | ((~i45) & 1721392005);
        int i47 = i45 & 1721392005;
        int i48 = ~((i47 & i46) | (i46 ^ i47));
        int i49 = 1150831361 ^ i48;
        int i50 = i48 & 1150831361;
        int i51 = (i50 & i49) | (i49 ^ i50);
        int i52 = ((i51 & 262208) | (i51 ^ 262208)) * 381;
        int i53 = ((((i44 ^ i52) | (i44 & i52)) << 1) - ((i52 & (~i44)) | ((~i52) & i44))) - (-1179740755);
        if (i36 > (i53 ^ (-1)) + (i53 << 1)) {
            int i54 = 2 / 0;
        }
    }

    public fr() {
        super(setAnimation.setWindowInsetsAnimationCallback().setDividerPadding());
        new h(1, 5);
        this.f55575f = new h(1, 4);
        this.f55576g = new h(1, 3);
        new h(1, 2);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i11;
        int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
        int i17 = ~i12;
        int i18 = (((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614) + (((~(i13 | i17)) | i14 | (~(i17 | i11))) * (-1228)) + i16;
        KProperty<Object>[] kPropertyArr = f55572h;
        if (i18 != 1) {
            fr frVar = (fr) objArr[0];
            int i19 = f55573i + 15;
            f55574j = i19 % 128;
            if (i19 % 2 == 0) {
                h hVar = frVar.f55576g;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar, frVar, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar));
            } else {
                h hVar2 = frVar.f55576g;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar2, frVar, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar2));
            }
            return Boolean.valueOf(((Boolean) onFocusChangeListener).booleanValue());
        }
        fr frVar2 = (fr) objArr[0];
        int i20 = f55573i;
        int i21 = i20 & 79;
        int i22 = i21 + ((i20 ^ 79) | i21);
        f55574j = i22 % 128;
        int i23 = i22 % 2;
        h hVar3 = frVar2.f55575f;
        boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar3, frVar2, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar3))).booleanValue();
        int i24 = f55574j;
        int i25 = i24 & 15;
        int i26 = i24 | 15;
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        f55573i = i27 % 128;
        if (i27 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, 1549416131, -1549416130, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setY(new Object[]{this}, 1275317793, -1275317793, System.identityHashCode(this))).booleanValue();
    }
}
