package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class ao extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f53382p = {i.d(ao.class, "validForDomesticCashTransactions_B1b8", "getValidForDomesticCashTransactions_B1b8()Z", 0), i.d(ao.class, "validForInternationalCashTransactions_B1b7", "getValidForInternationalCashTransactions_B1b7()Z", 0), i.d(ao.class, "validForDomesticGoods_B1b6", "getValidForDomesticGoods_B1b6()Z", 0), i.d(ao.class, "validForInternationalGoods_B1b5", "getValidForInternationalGoods_B1b5()Z", 0), i.d(ao.class, "validForDomesticServices_B1b4", "getValidForDomesticServices_B1b4()Z", 0), i.d(ao.class, "validForInternationalServices_B1b3", "getValidForInternationalServices_B1b3()Z", 0), i.d(ao.class, "validAtATMs_B1b2", "getValidAtATMs_B1b2()Z", 0), i.d(ao.class, "validAtTerminalsOtherThanATMs_B1b1", "getValidAtTerminalsOtherThanATMs_B1b1()Z", 0), i.d(ao.class, "domesticCashbackAllowed_B2b8", "getDomesticCashbackAllowed_B2b8()Z", 0), i.d(ao.class, "internationalCashbackAllowed_B2b7", "getInternationalCashbackAllowed_B2b7()Z", 0)};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f53383q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f53384r = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f53385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f53386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f53387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f53388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f53389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f53390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f53391l;

    @NotNull
    public final h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h f53392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final h f53393o;

    static {
        int i10 = f53383q;
        int i11 = i10 & 95;
        int i12 = -(-((i10 ^ 95) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53384r = i13 % 128;
        int i14 = i13 % 2;
    }

    public ao() {
        super(setAnimation.setSelectedChildViewEnabled().setDividerPadding());
        this.f53385f = new h(0, 7);
        this.f53386g = new h(0, 6);
        this.f53387h = new h(0, 5);
        this.f53388i = new h(0, 4);
        this.f53389j = new h(0, 3);
        this.f53390k = new h(0, 2);
        this.f53391l = new h(0, 1);
        this.m = new h(0, 0);
        this.f53392n = new h(1, 7);
        this.f53393o = new h(1, 6);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167));
        KProperty<Object>[] kPropertyArr = f53382p;
        switch (i18) {
            case 1:
                ao aoVar = (ao) objArr[0];
                int i19 = f53384r + 23;
                f53383q = i19 % 128;
                int i20 = i19 % 2;
                h hVar = aoVar.f53387h;
                boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, aoVar, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
                int i21 = f53384r + 19;
                f53383q = i21 % 128;
                int i22 = i21 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 2:
                ao aoVar2 = (ao) objArr[0];
                int i23 = f53383q;
                int i24 = (i23 & 93) + (i23 | 93);
                f53384r = i24 % 128;
                int i25 = i24 % 2;
                h hVar2 = aoVar2.f53385f;
                boolean zBooleanValue2 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar2, aoVar2, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar2))).booleanValue();
                int i26 = f53384r;
                int i27 = ((-1) << 1) - ((-1) ^ (((i26 | 84) << 1) - (i26 ^ 84)));
                f53383q = i27 % 128;
                int i28 = i27 % 2;
                return Boolean.valueOf(zBooleanValue2);
            case 3:
                ao aoVar3 = (ao) objArr[0];
                int i29 = f53384r;
                int i30 = (i29 ^ 123) + ((i29 & 123) << 1);
                f53383q = i30 % 128;
                int i31 = i30 % 2;
                h hVar3 = aoVar3.f53389j;
                boolean zBooleanValue3 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar3, aoVar3, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar3))).booleanValue();
                int i32 = f53383q;
                int i33 = (i32 ^ 17) + ((i32 & 17) << 1);
                f53384r = i33 % 128;
                if (i33 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue3);
                }
                throw null;
            case 4:
                ao aoVar4 = (ao) objArr[0];
                int i34 = f53383q + 21;
                f53384r = i34 % 128;
                if (i34 % 2 == 0) {
                    h hVar4 = aoVar4.f53388i;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar4, aoVar4, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar4));
                } else {
                    h hVar5 = aoVar4.f53388i;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar5, aoVar4, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar5));
                }
                boolean zBooleanValue4 = ((Boolean) onFocusChangeListener).booleanValue();
                int i35 = f53384r;
                int i36 = ((i35 | 115) << 1) - (i35 ^ 115);
                f53383q = i36 % 128;
                if (i36 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue4);
                }
                throw null;
            case 5:
                ao aoVar5 = (ao) objArr[0];
                int i37 = f53383q;
                int i38 = i37 & 97;
                int i39 = (i37 | 97) & (~i38);
                int i40 = -(-(i38 << 1));
                int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                f53384r = i41 % 128;
                int i42 = i41 % 2;
                h hVar6 = aoVar5.f53392n;
                boolean zBooleanValue5 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar6, aoVar5, kPropertyArr[8]}, -709183664, 709183665, System.identityHashCode(hVar6))).booleanValue();
                int i43 = f53384r;
                int i44 = (((i43 ^ 53) | (i43 & 53)) << 1) - (((~i43) & 53) | (i43 & (-54)));
                f53383q = i44 % 128;
                int i45 = i44 % 2;
                return Boolean.valueOf(zBooleanValue5);
            case 6:
                ao aoVar6 = (ao) objArr[0];
                int i46 = f53383q;
                int i47 = (i46 & 51) + (i46 | 51);
                f53384r = i47 % 128;
                int i48 = i47 % 2;
                h hVar7 = aoVar6.f53386g;
                boolean zBooleanValue6 = ((Boolean) (i48 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar7, aoVar6, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar7)) : h.setOnFocusChangeListener(new Object[]{hVar7, aoVar6, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar7)))).booleanValue();
                int i49 = f53383q;
                int i50 = i49 & 3;
                int i51 = i50 + ((i49 ^ 3) | i50);
                f53384r = i51 % 128;
                if (i51 % 2 == 0) {
                    int i52 = 2 / 0;
                }
                return Boolean.valueOf(zBooleanValue6);
            case 7:
                ao aoVar7 = (ao) objArr[0];
                int i53 = f53383q;
                int i54 = i53 & 53;
                int i55 = (i53 | 53) & (~i54);
                int i56 = -(-(i54 << 1));
                int i57 = (i55 & i56) + (i55 | i56);
                f53384r = i57 % 128;
                int i58 = i57 % 2;
                h hVar8 = aoVar7.m;
                boolean zBooleanValue7 = ((Boolean) (i58 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar8, aoVar7, kPropertyArr[47]}, -709183664, 709183665, System.identityHashCode(hVar8)) : h.setOnFocusChangeListener(new Object[]{hVar8, aoVar7, kPropertyArr[7]}, -709183664, 709183665, System.identityHashCode(hVar8)))).booleanValue();
                int i59 = f53383q;
                int i60 = (i59 & 123) + (i59 | 123);
                f53384r = i60 % 128;
                if (i60 % 2 == 0) {
                    int i61 = 7 / 0;
                }
                return Boolean.valueOf(zBooleanValue7);
            case 8:
                ao aoVar8 = (ao) objArr[0];
                int i62 = f53384r;
                int i63 = ((i62 ^ 109) | (i62 & 109)) << 1;
                int i64 = -(((~i62) & 109) | (i62 & (-110)));
                int i65 = (i63 & i64) + (i64 | i63);
                f53383q = i65 % 128;
                int i66 = i65 % 2;
                h hVar9 = aoVar8.f53391l;
                return Boolean.valueOf(((Boolean) (i66 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar9, aoVar8, kPropertyArr[91]}, -709183664, 709183665, System.identityHashCode(hVar9)) : h.setOnFocusChangeListener(new Object[]{hVar9, aoVar8, kPropertyArr[6]}, -709183664, 709183665, System.identityHashCode(hVar9)))).booleanValue());
            case 9:
                ao aoVar9 = (ao) objArr[0];
                int i67 = f53384r;
                int i68 = (((i67 ^ 95) | (i67 & 95)) << 1) - (((~i67) & 95) | (i67 & (-96)));
                f53383q = i68 % 128;
                int i69 = i68 % 2;
                h hVar10 = aoVar9.f53390k;
                boolean zBooleanValue8 = ((Boolean) (i69 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar10, aoVar9, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar10)) : h.setOnFocusChangeListener(new Object[]{hVar10, aoVar9, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar10)))).booleanValue();
                int i70 = f53384r;
                int i71 = (i70 & 81) + (i70 | 81);
                f53383q = i71 % 128;
                if (i71 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue8);
                }
                throw null;
            default:
                ao aoVar10 = (ao) objArr[0];
                int i72 = f53383q;
                int i73 = (((i72 | 104) << 1) - (i72 ^ 104)) - 1;
                f53384r = i73 % 128;
                int i74 = i73 % 2;
                h hVar11 = aoVar10.f53393o;
                boolean zBooleanValue9 = ((Boolean) (i74 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar11, aoVar10, kPropertyArr[100]}, -709183664, 709183665, System.identityHashCode(hVar11)) : h.setOnFocusChangeListener(new Object[]{hVar11, aoVar10, kPropertyArr[9]}, -709183664, 709183665, System.identityHashCode(hVar11)))).booleanValue();
                int i75 = f53383q;
                int i76 = i75 & 97;
                int i77 = (i76 - (~((i75 ^ 97) | i76))) - 1;
                f53384r = i77 % 128;
                int i78 = i77 % 2;
                return Boolean.valueOf(zBooleanValue9);
        }
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setY(new Object[]{this}, 1416983743, -1416983736, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -1312436044, 1312436045, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, 388481781, -388481773, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setCompoundDrawablePadding() {
        return ((Boolean) setY(new Object[]{this}, 575922476, -575922476, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setIncludeFontPadding() {
        return ((Boolean) setY(new Object[]{this}, -1993631086, 1993631090, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setY(new Object[]{this}, 1150239482, -1150239480, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setY(new Object[]{this}, 743383994, -743383988, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnEditorActionListener() {
        return ((Boolean) setY(new Object[]{this}, -625784071, 625784076, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setY(new Object[]{this}, -1370773042, 1370773045, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setZ() {
        return ((Boolean) setY(new Object[]{this}, -1383166788, 1383166797, System.identityHashCode(this))).booleanValue();
    }
}
