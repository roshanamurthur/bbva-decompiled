package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bh extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f54707i = {i.d(bh.class, "consumerDeviceFormFactor_B1b5b1", "getConsumerDeviceFormFactor_B1b5b1()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/card/ConsumerDeviceFormFactor;", 0), i.d(bh.class, "passcodeCapable_B2b8", "getPasscodeCapable_B2b8()Z", 0), i.d(bh.class, "biometricCapable_B2b2", "getBiometricCapable_B2b2()Z", 0)};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f54708j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f54709k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f54710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f54711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f54712h;

    static {
        int i10 = f54708j;
        int i11 = ((((i10 ^ 49) | (i10 & 49)) << 1) - (~(-(((~i10) & 49) | (i10 & (-50)))))) - 1;
        f54709k = i11 % 128;
        int i12 = i11 % 2;
    }

    public bh() {
        super(setAnimation.setSubtitle().setDividerPadding());
        bc.Companion companion = bc.INSTANCE;
        this.f54710f = new n(0, 4, 0, bc.Companion.setCompoundDrawableTintBlendMode());
        this.f54711g = new h(1, 7);
        this.f54712h = new h(1, 1);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = (((~(i10 | i12)) | (~((~i11) | i10)) | i13) * 70) + ((~(i10 | i11 | i12)) * 70) + (((~(i11 | i12)) | i13) * (-140)) + (i11 * (-69)) + (i10 * 71);
        KProperty<Object>[] kPropertyArr = f54707i;
        if (i14 == 1) {
            bh bhVar = (bh) objArr[0];
            int i15 = (-2) - ((f54709k + 2) ^ (-1));
            f54708j = i15 % 128;
            int i16 = i15 % 2;
            h hVar = bhVar.f54712h;
            boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, bhVar, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
            int i17 = f54709k;
            int i18 = i17 | 53;
            int i19 = ((i18 << 1) - (~(-((~(i17 & 53)) & i18)))) - 1;
            f54708j = i19 % 128;
            if (i19 % 2 == 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        if (i14 != 2) {
            bh bhVar2 = (bh) objArr[0];
            int i20 = f54708j;
            int i21 = i20 & 105;
            int i22 = ((i20 ^ 105) | i21) << 1;
            int i23 = -((i20 | 105) & (~i21));
            int i24 = (i22 & i23) + (i23 | i22);
            f54709k = i24 % 128;
            int i25 = i24 % 2;
            h hVar2 = bhVar2.f54711g;
            return Boolean.valueOf(((Boolean) (i25 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar2, bhVar2, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar2)) : h.setOnFocusChangeListener(new Object[]{hVar2, bhVar2, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar2)))).booleanValue());
        }
        bh bhVar3 = (bh) objArr[0];
        int i26 = f54709k;
        int i27 = i26 & 61;
        int i28 = ((i26 ^ 61) | i27) << 1;
        int i29 = -((i26 | 61) & (~i27));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        f54708j = i30 % 128;
        int i31 = i30 % 2;
        n nVar = bhVar3.f54710f;
        bc bcVar = (bc) ((Enum) n.setCompoundDrawableTintBlendMode(new Object[]{nVar, bhVar3, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar)));
        int i32 = f54708j;
        int i33 = i32 & 75;
        int i34 = (i32 ^ 75) | i33;
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        f54709k = i35 % 128;
        int i36 = i35 % 2;
        return bcVar;
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1252898241, -1252898240, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final bc setLayoutAnimation() {
        return (bc) setOnFocusChangeListener(new Object[]{this}, 1456793442, -1456793440, System.identityHashCode(this));
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 587843053, -587843053, System.identityHashCode(this))).booleanValue();
    }
}
