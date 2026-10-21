package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class be extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f54614p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f54615q = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f54618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f54620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f54621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f54622l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f54623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54624o;

    public be() {
        super(setAnimation.component25().setDividerPadding());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i14)) | (~(i14 | i12));
        int i16 = ~i12;
        int i17 = i16 | i10;
        switch (((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773)) {
            case 1:
                be beVar = (be) objArr[0];
                int i18 = f54614p;
                int i19 = i18 & 79;
                int i20 = (i18 ^ 79) | i19;
                int i21 = (i19 & i20) + (i19 | i20);
                f54615q = i21 % 128;
                int i22 = i21 % 2;
                boolean z10 = beVar.f54621k;
                if (i22 == 0) {
                    int i23 = 47 / 0;
                }
                int i24 = (-2) - ((i18 + 20) ^ (-1));
                f54615q = i24 % 128;
                int i25 = i24 % 2;
                return Boolean.valueOf(z10);
            case 2:
                be beVar2 = (be) objArr[0];
                int i26 = f54615q;
                int i27 = (i26 & 13) + (i26 | 13);
                int i28 = i27 % 128;
                f54614p = i28;
                int i29 = i27 % 2;
                boolean z11 = beVar2.f54618h;
                int i30 = ((i28 ^ 105) | (i28 & 105)) << 1;
                int i31 = -(((~i28) & 105) | (i28 & (-106)));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f54615q = i32 % 128;
                int i33 = i32 % 2;
                return Boolean.valueOf(z11);
            case 3:
                be beVar3 = (be) objArr[0];
                int i34 = f54615q;
                int i35 = (i34 ^ 3) + ((i34 & 3) << 1);
                int i36 = i35 % 128;
                f54614p = i36;
                int i37 = i35 % 2;
                boolean z12 = beVar3.f54617g;
                int i38 = ((((i36 ^ 85) | (i36 & 85)) << 1) - (~(-(((~i36) & 85) | (i36 & (-86)))))) - 1;
                f54615q = i38 % 128;
                if (i38 % 2 != 0) {
                    return Boolean.valueOf(z12);
                }
                throw null;
            case 4:
                be beVar4 = (be) objArr[0];
                int i39 = f54614p + 93;
                f54615q = i39 % 128;
                int i40 = i39 % 2;
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 0, 7, Boolean.valueOf(beVar4.f54616f)}, -91299280, 91299286, 0);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 0, 6, Boolean.valueOf(beVar4.f54617g)}, -91299280, 91299286, 0);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 0, 5, Boolean.valueOf(beVar4.f54618h)}, -91299280, 91299286, 0);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 0, 4, Boolean.valueOf(beVar4.f54619i)}, -91299280, 91299286, 0);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 0, 3, Boolean.valueOf(beVar4.f54620j)}, -91299280, 91299286, 0);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 0, 2, Boolean.valueOf(beVar4.f54621k)}, -91299280, 91299286, 0);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 0, 1, Boolean.valueOf(beVar4.f54622l)}, -91299280, 91299286, 0);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 0, 0, Boolean.valueOf(beVar4.m)}, -91299280, 91299286, 0);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 1, 7, Boolean.valueOf(beVar4.f54623n)}, -91299280, 91299286, 1);
                setInputExtras.setDividerPadding(new Object[]{beVar4.setCompoundDrawableTintBlendMode(), 1, 6, Boolean.valueOf(beVar4.f54624o)}, -91299280, 91299286, 1);
                byte[] dividerPadding = super.setDividerPadding();
                int i41 = f54615q;
                int i42 = (i41 & (-108)) | ((~i41) & 107);
                int i43 = (i41 & 107) << 1;
                int i44 = (i42 & i43) + (i43 | i42);
                f54614p = i44 % 128;
                if (i44 % 2 == 0) {
                    return dividerPadding;
                }
                throw null;
            case 5:
                be beVar5 = (be) objArr[0];
                int i45 = f54614p;
                int i46 = (i45 & 79) + (i45 | 79);
                int i47 = i46 % 128;
                f54615q = i47;
                int i48 = i46 % 2;
                boolean z13 = beVar5.f54619i;
                int i49 = (i47 & (-92)) | ((~i47) & 91);
                int i50 = -(-((i47 & 91) << 1));
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                f54614p = i51 % 128;
                int i52 = i51 % 2;
                return Boolean.valueOf(z13);
            case 6:
                be beVar6 = (be) objArr[0];
                int i53 = f54615q;
                int i54 = ((i53 & 94) + (i53 | 94)) - 1;
                f54614p = i54 % 128;
                int i55 = i54 % 2;
                boolean z14 = beVar6.f54616f;
                int i56 = (-2) - ((i53 + 76) ^ (-1));
                f54614p = i56 % 128;
                if (i56 % 2 != 0) {
                    int i57 = 85 / 0;
                }
                return Boolean.valueOf(z14);
            case 7:
                be beVar7 = (be) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i58 = f54614p + 25;
                f54615q = i58 % 128;
                int i59 = i58 % 2;
                int onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
                beVar7.f54616f = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[0]), 7}, 1812344530, -1812344522, 7)).booleanValue();
                beVar7.f54617g = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[0]), 6}, 1812344530, -1812344522, 6)).booleanValue();
                beVar7.f54618h = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[0]), 5}, 1812344530, -1812344522, 5)).booleanValue();
                beVar7.f54619i = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[0]), 4}, 1812344530, -1812344522, 4)).booleanValue();
                beVar7.f54620j = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[0]), 3}, 1812344530, -1812344522, 3)).booleanValue();
                beVar7.f54621k = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[0]), 2}, 1812344530, -1812344522, 2)).booleanValue();
                beVar7.f54622l = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[0]), 1}, 1812344530, -1812344522, 1)).booleanValue();
                beVar7.m = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[0]), 0}, 1812344530, -1812344522, 0)).booleanValue();
                beVar7.f54623n = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[1]), 7}, 1812344530, -1812344522, 7)).booleanValue();
                beVar7.f54624o = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(beVar7.setCompoundDrawableTintBlendMode()[1]), 6}, 1812344530, -1812344522, 6)).booleanValue();
                int i60 = f54614p + 101;
                f54615q = i60 % 128;
                int i61 = i60 % 2;
                return Integer.valueOf(onFocusChangeListener);
            case 8:
                be beVar8 = (be) objArr[0];
                int i62 = f54615q;
                int i63 = i62 + 35;
                f54614p = i63 % 128;
                int i64 = i63 % 2;
                boolean z15 = beVar8.f54622l;
                int i65 = (((i62 | 22) << 1) - (i62 ^ 22)) - 1;
                f54614p = i65 % 128;
                int i66 = i65 % 2;
                return Boolean.valueOf(z15);
            case 9:
                be beVar9 = (be) objArr[0];
                int i67 = f54615q;
                int i68 = (((i67 ^ 101) | (i67 & 101)) << 1) - ((i67 & (-102)) | ((~i67) & 101));
                f54614p = i68 % 128;
                int i69 = i68 % 2;
                boolean z16 = beVar9.f54620j;
                if (i69 != 0) {
                    int i70 = 43 / 0;
                }
                int i71 = i67 ^ 103;
                int i72 = (((i67 & 103) | i71) << 1) - i71;
                f54614p = i72 % 128;
                if (i72 % 2 != 0) {
                    int i73 = 20 / 0;
                }
                return Boolean.valueOf(z16);
            default:
                be beVar10 = (be) objArr[0];
                int i74 = f54615q;
                int i75 = (((i74 | 112) << 1) - (i74 ^ 112)) - 1;
                int i76 = i75 % 128;
                f54614p = i76;
                int i77 = i75 % 2;
                boolean z17 = beVar10.f54623n;
                int i78 = i76 + 23;
                f54615q = i78 % 128;
                if (i78 % 2 != 0) {
                    return Boolean.valueOf(z17);
                }
                throw null;
        }
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -499525026, 499525031, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 26856484, -26856482, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1887937228, 1887937237, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1911214848, 1911214852, System.identityHashCode(this));
    }

    public final boolean setIncludeFontPadding() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -830732281, 830732281, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1008139860, 1008139863, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1458205871, 1458205877, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -190452344, 190452345, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setZ() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1555636055, 1555636063, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10)}, -65323399, 65323406, i10)).intValue();
    }
}
