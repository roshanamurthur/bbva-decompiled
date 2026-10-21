package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ac extends t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f52363l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public as f52365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f52366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f52367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public au f52368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public aw f52369k;

    public ac() {
        super(setAnimation.setDuplicateParentStateEnabled().setDividerPadding());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        Object obj;
        int i15 = ~i10;
        int i16 = ((i11 | i15) * (-368)) + (i11 * 185) + (i10 * (-183));
        int i17 = ~i11;
        int i18 = ~i12;
        switch ((((~(i10 | i11)) | (~(i18 | i10)) | (~(i15 | i17))) * 184) + ((i10 | i17 | i18) * 184) + i16) {
            case 1:
                ac acVar = (ac) objArr[0];
                int i19 = f52363l;
                int i20 = i19 & 35;
                int i21 = (i19 | 35) & (~i20);
                int i22 = -(-(i20 << 1));
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                m = i23 % 128;
                int i24 = i23 % 2;
                boolean z12 = acVar.f52367i;
                if (i24 != 0) {
                    return Boolean.valueOf(z12);
                }
                throw null;
            case 2:
                ac acVar2 = (ac) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i25 = f52363l;
                int i26 = i25 & 23;
                int i27 = -(-((i25 ^ 23) | i26));
                int i28 = (i26 & i27) + (i27 | i26);
                m = i28 % 128;
                int i29 = i28 % 2;
                int onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
                acVar2.f52364f = acVar2.setCompoundDrawableTintBlendMode()[0] & Constants.CVR_B2b8765_1111_APP_DISABLED;
                as.Companion companion = as.INSTANCE;
                setOnFocusChangeListener(new Object[]{acVar2, (as) as.Companion.setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf((byte) (acVar2.setCompoundDrawableTintBlendMode()[0] & 15))}, 1461447194, -1461447194, (int) System.currentTimeMillis())}, -1642650352, 1642650359, System.identityHashCode(acVar2));
                if (((byte) (acVar2.setCompoundDrawableTintBlendMode()[1] & 4)) == 4) {
                    int i30 = f52363l;
                    int i31 = i30 & 83;
                    int i32 = i31 + ((i30 ^ 83) | i31);
                    int i33 = i32 % 128;
                    m = i33;
                    int i34 = i32 % 2;
                    int i35 = i33 & 111;
                    int i36 = (i35 - (~(-(-((i33 ^ 111) | i35))))) - 1;
                    f52363l = i36 % 128;
                    int i37 = i36 % 2;
                    z10 = true;
                } else {
                    int i38 = f52363l;
                    int i39 = (i38 ^ 15) + ((i38 & 15) << 1);
                    m = i39 % 128;
                    int i40 = i39 % 2;
                    z10 = false;
                }
                acVar2.f52366h = z10;
                if (((byte) (acVar2.setCompoundDrawableTintBlendMode()[1] & 2)) == 2) {
                    int i41 = m;
                    int i42 = i41 & 67;
                    int i43 = -(-(i41 | 67));
                    int i44 = (i42 & i43) + (i42 | i43);
                    f52363l = i44 % 128;
                    int i45 = i44 % 2;
                    int i46 = (((i41 ^ 89) | (i41 & 89)) << 1) - (((~i41) & 89) | (i41 & (-90)));
                    f52363l = i46 % 128;
                    int i47 = i46 % 2;
                    z11 = true;
                } else {
                    int i48 = m;
                    int i49 = i48 ^ 9;
                    int i50 = ((i48 & 9) | i49) << 1;
                    int i51 = -i49;
                    int i52 = (i50 & i51) + (i50 | i51);
                    f52363l = i52 % 128;
                    int i53 = i52 % 2;
                    z11 = false;
                }
                acVar2.f52367i = z11;
                au.Companion companion2 = au.INSTANCE;
                setOnFocusChangeListener(new Object[]{acVar2, (au) au.Companion.setX(new Object[]{Byte.valueOf((byte) (acVar2.setCompoundDrawableTintBlendMode()[1] & 1))}, 178206581, -178206581, (int) System.currentTimeMillis())}, 1309623804, -1309623804, System.identityHashCode(acVar2));
                aw.Companion companion3 = aw.INSTANCE;
                setOnFocusChangeListener(new Object[]{acVar2, (aw) aw.Companion.setX(new Object[]{Byte.valueOf(acVar2.setCompoundDrawableTintBlendMode()[2])}, -1805426140, 1805426140, (int) System.currentTimeMillis())}, 854283130, -854283122, System.identityHashCode(acVar2));
                int i54 = m;
                int i55 = (i54 & 101) + (i54 | 101);
                f52363l = i55 % 128;
                int i56 = i55 % 2;
                return Integer.valueOf(onFocusChangeListener);
            case 3:
                ac acVar3 = (ac) objArr[0];
                int i57 = f52363l;
                int i58 = (((i57 & (-124)) | ((~i57) & 123)) - (~(-(-((i57 & 123) << 1))))) - 1;
                m = i58 % 128;
                int i59 = i58 % 2;
                byte[] compoundDrawableTintBlendMode = acVar3.setCompoundDrawableTintBlendMode();
                int i60 = acVar3.f52364f << 4;
                byte onFocusChangeListener2 = ((as) setOnFocusChangeListener(new Object[]{acVar3}, -469959479, 469959488, System.identityHashCode(acVar3))).setOnFocusChangeListener();
                compoundDrawableTintBlendMode[0] = (byte) ((i60 & onFocusChangeListener2) | (i60 ^ onFocusChangeListener2));
                if (!acVar3.f52366h) {
                    int i61 = m;
                    int i62 = i61 & 13;
                    int i63 = (i61 | 13) & (~i62);
                    int i64 = -(-(i62 << 1));
                    int i65 = (i63 & i64) + (i63 | i64);
                    f52363l = i65 % 128;
                    int i66 = i65 % 2;
                    i13 = 0;
                } else {
                    int i67 = f52363l;
                    int i68 = ((i67 ^ 47) | (i67 & 47)) << 1;
                    int i69 = -(((~i67) & 47) | (i67 & (-48)));
                    int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                    int i71 = i70 % 128;
                    m = i71;
                    int i72 = i70 % 2;
                    int i73 = ((i71 ^ 48) + ((i71 & 48) << 1)) - 1;
                    f52363l = i73 % 128;
                    int i74 = i73 % 2;
                    i13 = 1;
                }
                if (!(!acVar3.f52367i)) {
                    int i75 = f52363l;
                    int i76 = (i75 ^ 109) + ((i75 & 109) << 1);
                    m = i76 % 128;
                    int i77 = i76 % 2;
                    int i78 = i75 & 61;
                    int i79 = ((i75 ^ 61) | i78) << 1;
                    int i80 = -((i75 | 61) & (~i78));
                    int i81 = (i79 & i80) + (i80 | i79);
                    m = i81 % 128;
                    int i82 = i81 % 2;
                    i14 = 1;
                } else {
                    int i83 = m;
                    int i84 = i83 & 43;
                    int i85 = (i83 | 43) & (~i84);
                    int i86 = -(-(i84 << 1));
                    int i87 = (i85 & i86) + (i85 | i86);
                    f52363l = i87 % 128;
                    int i88 = i87 % 2;
                    i14 = 0;
                }
                byte[] compoundDrawableTintBlendMode2 = acVar3.setCompoundDrawableTintBlendMode();
                int i89 = (i13 << 2) | (i14 << 1);
                byte compoundDrawableTintBlendMode3 = ((au) setOnFocusChangeListener(new Object[]{acVar3}, -1387880409, 1387880413, System.identityHashCode(acVar3))).setCompoundDrawableTintBlendMode();
                int i90 = ((~compoundDrawableTintBlendMode3) & i89) | ((~i89) & compoundDrawableTintBlendMode3);
                int i91 = i89 & compoundDrawableTintBlendMode3;
                compoundDrawableTintBlendMode2[1] = (byte) ((i91 & i90) | (i90 ^ i91));
                acVar3.setCompoundDrawableTintBlendMode()[2] = ((aw) setOnFocusChangeListener(new Object[]{acVar3}, -968284064, 968284070, System.identityHashCode(acVar3))).setCompoundDrawableTintBlendMode();
                byte[] dividerPadding = super.setDividerPadding();
                int i92 = m;
                int i93 = (i92 & (-80)) | ((~i92) & 79);
                int i94 = -(-((i92 & 79) << 1));
                int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                f52363l = i95 % 128;
                int i96 = i95 % 2;
                return dividerPadding;
            case 4:
                ac acVar4 = (ac) objArr[0];
                int i97 = f52363l;
                int i98 = i97 & 11;
                int i99 = (i97 ^ 11) | i98;
                int i100 = (i98 & i99) + (i99 | i98);
                int i101 = i100 % 128;
                m = i101;
                int i102 = i100 % 2;
                obj = acVar4.f52368j;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i103 = m;
                    int i104 = ((i103 & 26) + (i103 | 26)) - 1;
                    f52363l = i104 % 128;
                    int i105 = i104 % 2;
                    return null;
                }
                int i106 = (((i101 ^ 117) | (i101 & 117)) << 1) - ((i101 & (-118)) | ((~i101) & 117));
                f52363l = i106 % 128;
                int i107 = i106 % 2;
                int i108 = i101 + 121;
                f52363l = i108 % 128;
                if (i108 % 2 != 0) {
                    throw null;
                }
                break;
            case 5:
                ac acVar5 = (ac) objArr[0];
                int i109 = f52363l;
                int i110 = ((i109 | 13) << 1) - (i109 ^ 13);
                int i111 = i110 % 128;
                m = i111;
                int i112 = i110 % 2;
                boolean z13 = acVar5.f52366h;
                int i113 = i111 + 48;
                int i114 = (i113 ^ (-1)) + (i113 << 1);
                f52363l = i114 % 128;
                int i115 = i114 % 2;
                return Boolean.valueOf(z13);
            case 6:
                ac acVar6 = (ac) objArr[0];
                int i116 = f52363l;
                int i117 = ((i116 | 19) << 1) - (i116 ^ 19);
                m = i117 % 128;
                int i118 = i117 % 2;
                obj = acVar6.f52369k;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i119 = f52363l + 45;
                    m = i119 % 128;
                    if (i119 % 2 != 0) {
                        return null;
                    }
                    int i120 = 54 / 0;
                    return null;
                }
                int i121 = (i116 ^ 3) + ((i116 & 3) << 1);
                m = i121 % 128;
                if (i121 % 2 == 0) {
                    throw null;
                }
                break;
            case 7:
                ac acVar7 = (ac) objArr[0];
                as asVar = (as) objArr[1];
                int i122 = m + 125;
                f52363l = i122 % 128;
                if (i122 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(asVar, "");
                    acVar7.f52365g = asVar;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(asVar, "");
                acVar7.f52365g = asVar;
                int i123 = f52363l;
                int i124 = (i123 | 95) << 1;
                int i125 = -(((~i123) & 95) | (i123 & (-96)));
                int i126 = (i124 & i125) + (i125 | i124);
                m = i126 % 128;
                if (i126 % 2 != 0) {
                    return null;
                }
                throw null;
            case 8:
                ac acVar8 = (ac) objArr[0];
                aw awVar = (aw) objArr[1];
                int i127 = m;
                int i128 = i127 & 75;
                int i129 = (i127 ^ 75) | i128;
                int i130 = (i128 & i129) + (i129 | i128);
                f52363l = i130 % 128;
                int i131 = i130 % 2;
                Intrinsics.checkNotNullParameter(awVar, "");
                acVar8.f52369k = awVar;
                int i132 = f52363l;
                int i133 = (i132 & 43) + (i132 | 43);
                m = i133 % 128;
                if (i133 % 2 != 0) {
                    return null;
                }
                throw null;
            case 9:
                ac acVar9 = (ac) objArr[0];
                int i134 = m;
                int i135 = ((i134 & 121) - (~(-(-(i134 | 121))))) - 1;
                int i136 = i135 % 128;
                f52363l = i136;
                int i137 = i135 % 2;
                obj = acVar9.f52365g;
                if (i137 != 0) {
                    throw null;
                }
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i138 = f52363l;
                    int i139 = i138 ^ 125;
                    int i140 = ((i138 & 125) | i139) << 1;
                    int i141 = -i139;
                    int i142 = ((i140 | i141) << 1) - (i140 ^ i141);
                    m = i142 % 128;
                    if (i142 % 2 != 0) {
                        return null;
                    }
                    int i143 = 85 / 0;
                    return null;
                }
                int i144 = i136 & 13;
                int i145 = i144 + ((i136 ^ 13) | i144);
                m = i145 % 128;
                int i146 = i145 % 2;
                break;
                break;
            default:
                ac acVar10 = (ac) objArr[0];
                au auVar = (au) objArr[1];
                int i147 = m;
                int i148 = ((i147 & (-78)) | ((~i147) & 77)) + ((i147 & 77) << 1);
                f52363l = i148 % 128;
                int i149 = i148 % 2;
                Intrinsics.checkNotNullParameter(auVar, "");
                acVar10.f52368j = auVar;
                int i150 = f52363l;
                int i151 = ((i150 ^ 89) | (i150 & 89)) << 1;
                int i152 = -(((~i150) & 89) | (i150 & (-90)));
                int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                m = i153 % 128;
                if (i153 % 2 != 0) {
                    return null;
                }
                throw null;
        }
        return obj;
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1184470533, 1184470534, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -937514077, 937514080, System.identityHashCode(this));
    }

    @NotNull
    public final au setLayoutAnimation() {
        return (au) setOnFocusChangeListener(new Object[]{this}, -1387880409, 1387880413, System.identityHashCode(this));
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 988777307, -988777302, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10)}, -102511131, 102511133, i10)).intValue();
    }
}
