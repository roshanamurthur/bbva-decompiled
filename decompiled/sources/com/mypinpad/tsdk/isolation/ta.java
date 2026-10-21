package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/ta;", "Lcom/mypinpad/tsdk/i/ue;", "Lcom/mypinpad/tsdk/i/sz;", "setX"}, k = 1, mv = {1, 8, 0})
public final class ta implements ue<sz> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61002c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61003d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sz f61004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final tq f61005b;

    public /* synthetic */ class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f61006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f61007b;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[sz.values().length];
            try {
                iArr[sz.setY.ordinal()] = 1;
                int i10 = ((1 & (-20)) | ((~1) & 19)) + ((1 & 19) << 1);
                f61006a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sz.setX.ordinal()] = 2;
                int i12 = f61006a;
                int i13 = (i12 | 125) << 1;
                int i14 = -(((~i12) & 125) | (i12 & (-126)));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                f61007b = i15 % 128;
                int i16 = i15 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sz.setCompoundDrawableTintBlendMode.ordinal()] = 3;
                int i17 = f61007b;
                int i18 = i17 & 71;
                int i19 = ((i17 | 71) & (~i18)) + (i18 << 1);
                f61006a = i19 % 128;
                int i20 = i19 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sz.setDividerPadding.ordinal()] = 4;
                int i21 = f61006a;
                int i22 = i21 & 119;
                int i23 = -(-(i21 | 119));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f61007b = i24 % 128;
                int i25 = i24 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sz.setOnFocusChangeListener.ordinal()] = 5;
                int i26 = f61007b;
                int i27 = (i26 ^ 87) + ((i26 & 87) << 1);
                f61006a = i27 % 128;
                int i28 = i27 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            setY = iArr;
            int i29 = f61007b;
            int i30 = ((i29 & 66) + (i29 | 66)) - 1;
            f61006a = i30 % 128;
            int i31 = i30 % 2;
        }
    }

    static {
        int i10 = f61002c;
        int i11 = ((i10 | 105) << 1) - (i10 ^ 105);
        f61003d = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public ta() {
        throw null;
    }

    public ta(tv tvVar, int i10, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        i10 = (i11 & 2) != 0 ? 700 : i10;
        Intrinsics.checkNotNullParameter(tvVar, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.f61005b = tvVar.setX(i10, ud.getNavBarTitleString, new k9(function0));
        a(sz.setY);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        sz szVar;
        int i13 = (i11 * 334) + (i10 * (-665));
        int i14 = ~i10;
        int i15 = (i14 * (-333)) + i13;
        int i16 = ~i12;
        int i17 = (((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15;
        sz szVar2 = null;
        if (i17 == 1) {
            ta taVar = (ta) objArr[0];
            int i18 = f61002c;
            int i19 = (i18 ^ 35) + ((i18 & 35) << 1);
            f61003d = i19 % 128;
            if (i19 % 2 == 0) {
                taVar.f61005b.setOnFocusChangeListener();
                sz szVar3 = sz.setY;
                throw null;
            }
            taVar.f61005b.setOnFocusChangeListener();
            sz szVar4 = sz.setY;
            int i20 = f61003d;
            int i21 = (i20 & 105) + (i20 | 105);
            f61002c = i21 % 128;
            int i22 = i21 % 2;
            return szVar4;
        }
        if (i17 == 2) {
            ta taVar2 = (ta) objArr[0];
            int i23 = f61002c;
            int i24 = ((i23 & 122) + (i23 | 122)) - 1;
            f61003d = i24 % 128;
            int i25 = i24 % 2;
            taVar2.f61005b.setY();
            szVar = sz.setOnFocusChangeListener;
            int i26 = f61002c;
            int i27 = i26 & 5;
            int i28 = -(-((i26 ^ 5) | i27));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            f61003d = i29 % 128;
            if (i29 % 2 == 0) {
                throw null;
            }
        } else if (i17 == 3) {
            ta taVar3 = (ta) objArr[0];
            int i30 = f61003d;
            int i31 = ((i30 ^ 126) + ((i30 & 126) << 1)) - 1;
            f61002c = i31 % 128;
            int i32 = i31 % 2;
            sz szVar5 = taVar3.f61004a;
            if (szVar5 == null) {
                int i33 = i30 & 103;
                int i34 = ((i30 | 103) & (~i33)) + (i33 << 1);
                f61002c = i34 % 128;
                int i35 = i34 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i35 != 0) {
                    throw null;
                }
                int i36 = f61002c + 80;
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f61003d = i37 % 128;
                int i38 = i37 % 2;
                szVar5 = null;
            }
            if (setY.setY[szVar5.ordinal()] != 3) {
                sz szVar6 = taVar3.f61004a;
                if (szVar6 == null) {
                    int i39 = f61002c;
                    int i40 = (((i39 & (-12)) | ((~i39) & 11)) - (~(-(-((i39 & 11) << 1))))) - 1;
                    f61003d = i40 % 128;
                    if (i40 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i41 = 38 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    int i42 = f61002c;
                    int i43 = i42 & 111;
                    int i44 = (i42 ^ 111) | i43;
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    f61003d = i45 % 128;
                    int i46 = i45 % 2;
                } else {
                    szVar2 = szVar6;
                }
                int i47 = f61003d;
                int i48 = i47 & 3;
                int i49 = ((i47 ^ 3) | i48) << 1;
                int i50 = -((i47 | 3) & (~i48));
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                f61002c = i51 % 128;
                int i52 = i51 % 2;
                return szVar2;
            }
            System.identityHashCode(taVar3);
            System.identityHashCode(taVar3);
            taVar3.f61005b.setOnFocusChangeListener();
            szVar = sz.setDividerPadding;
            int i53 = f61002c;
            int i54 = ((i53 | 124) << 1) - (i53 ^ 124);
            int i55 = (i54 ^ (-1)) + (i54 << 1);
            f61003d = i55 % 128;
            int i56 = i55 % 2;
        } else if (i17 == 4) {
            ta taVar4 = (ta) objArr[0];
            int i57 = f61003d + 51;
            f61002c = i57 % 128;
            if (i57 % 2 != 0) {
                sz szVar7 = taVar4.f61004a;
                throw null;
            }
            sz szVar8 = taVar4.f61004a;
            if (szVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i58 = f61003d;
                int i59 = (((i58 ^ 115) | (i58 & 115)) << 1) - (((~i58) & 115) | (i58 & (-116)));
                f61002c = i59 % 128;
                int i60 = i59 % 2;
                szVar8 = null;
            }
            if (setY.setY[szVar8.ordinal()] != 1) {
                sz szVar9 = taVar4.f61004a;
                if (szVar9 == null) {
                    int i61 = f61003d + 65;
                    f61002c = i61 % 128;
                    int i62 = i61 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i63 = f61003d;
                    int i64 = (i63 & (-18)) | ((~i63) & 17);
                    int i65 = -(-((i63 & 17) << 1));
                    int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                    f61002c = i66 % 128;
                    int i67 = i66 % 2;
                } else {
                    szVar2 = szVar9;
                }
                int i68 = f61003d;
                int i69 = i68 ^ 1;
                int i70 = ((i68 & 1) | i69) << 1;
                int i71 = -i69;
                int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
                f61002c = i72 % 128;
                if (i72 % 2 == 0) {
                    return szVar2;
                }
                int i73 = 78 / 0;
                return szVar2;
            }
            int i74 = f61002c;
            int i75 = i74 & 53;
            int i76 = (i74 | 53) & (~i75);
            int i77 = -(-(i75 << 1));
            int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
            f61003d = i78 % 128;
            int i79 = i78 % 2;
            szVar = sz.setX;
            int i80 = f61002c;
            int i81 = i80 & 117;
            int i82 = ((i80 ^ 117) | i81) << 1;
            int i83 = -((i80 | 117) & (~i81));
            int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
            f61003d = i84 % 128;
            if (i84 % 2 == 0) {
                int i85 = 13 / 0;
            }
        } else {
            if (i17 == 5) {
                ta taVar5 = (ta) objArr[0];
                Object obj = objArr[1];
                int i86 = f61002c;
                int i87 = i86 & 43;
                int i88 = (i86 ^ 43) | i87;
                int i89 = (i87 & i88) + (i88 | i87);
                f61003d = i89 % 128;
                int i90 = i89 % 2;
                taVar5.a((sz) obj);
                int i91 = f61002c;
                int i92 = i91 ^ 57;
                int i93 = ((i91 & 57) | i92) << 1;
                int i94 = -i92;
                int i95 = (i93 ^ i94) + ((i93 & i94) << 1);
                f61003d = i95 % 128;
                if (i95 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            ta taVar6 = (ta) objArr[0];
            int i96 = f61002c;
            int i97 = (i96 ^ 47) + ((i96 & 47) << 1);
            int i98 = i97 % 128;
            f61003d = i98;
            int i99 = i97 % 2;
            sz szVar10 = taVar6.f61004a;
            if (szVar10 == null) {
                int i100 = i98 & 63;
                int i101 = ((i98 ^ 63) | i100) << 1;
                int i102 = -((i98 | 63) & (~i100));
                int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                f61002c = i103 % 128;
                int i104 = i103 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i105 = f61003d + 47;
                f61002c = i105 % 128;
                int i106 = i105 % 2;
                szVar10 = null;
            }
            int i107 = setY.setY[szVar10.ordinal()];
            if (i107 != 2 && i107 != 4) {
                sz szVar11 = taVar6.f61004a;
                if (szVar11 == null) {
                    int i108 = f61002c + 15;
                    f61003d = i108 % 128;
                    if (i108 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i109 = f61003d;
                    int i110 = (i109 ^ 33) + ((i109 & 33) << 1);
                    f61002c = i110 % 128;
                    int i111 = i110 % 2;
                } else {
                    szVar2 = szVar11;
                }
                int i112 = f61003d;
                int i113 = ((i112 ^ 73) | (i112 & 73)) << 1;
                int i114 = -(((~i112) & 73) | (i112 & (-74)));
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                f61002c = i115 % 128;
                int i116 = i115 % 2;
                return szVar2;
            }
            tq tqVar = taVar6.f61005b;
            tqVar.setOnFocusChangeListener();
            tqVar.setCompoundDrawableTintBlendMode();
            szVar = sz.setCompoundDrawableTintBlendMode;
            int i117 = f61002c;
            int i118 = (i117 ^ 47) + ((i117 & 47) << 1);
            f61003d = i118 % 128;
            int i119 = i118 % 2;
        }
        return szVar;
    }

    public final synchronized void a(@NotNull sz szVar) {
        sz szVar2;
        int i10;
        try {
            int i11 = f61002c;
            int i12 = i11 ^ 89;
            int i13 = (i11 & 89) << 1;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            f61003d = i14 % 128;
            int i15 = i14 % 2;
            Intrinsics.checkNotNullParameter(szVar, "");
            int i16 = setY.setY[szVar.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    szVar2 = (sz) setY(new Object[]{this}, -922344600, 922344604, System.identityHashCode(this));
                    int i17 = f61002c;
                    i10 = ((i17 & 126) + (i17 | 126)) - 1;
                    f61003d = i10 % 128;
                } else if (i16 == 3) {
                    szVar2 = (sz) setY(new Object[]{this}, -1264662851, 1264662851, System.identityHashCode(this));
                    int i18 = f61002c;
                    int i19 = i18 & 121;
                    int i20 = (i18 ^ 121) | i19;
                    i10 = (i19 & i20) + (i20 | i19);
                    f61003d = i10 % 128;
                } else if (i16 == 4) {
                    szVar2 = (sz) setY(new Object[]{this}, 166010407, -166010404, System.identityHashCode(this));
                    int i21 = f61003d;
                    int i22 = i21 & 29;
                    int i23 = (i21 | 29) & (~i22);
                    int i24 = -(-(i22 << 1));
                    i10 = (i23 & i24) + (i23 | i24);
                    f61002c = i10 % 128;
                } else {
                    if (i16 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    szVar2 = (sz) setY(new Object[]{this}, 1809502569, -1809502567, System.identityHashCode(this));
                    System.identityHashCode(this);
                    System.identityHashCode(this);
                }
                int i25 = i10 % 2;
            } else {
                szVar2 = (sz) setY(new Object[]{this}, -2114832944, 2114832945, System.identityHashCode(this));
                int i26 = f61002c;
                int i27 = i26 & 107;
                int i28 = (i26 | 107) & (~i27);
                int i29 = -(-(i27 << 1));
                int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                f61003d = i30 % 128;
                int i31 = i30 % 2;
            }
            this.f61004a = szVar2;
            int i32 = f61002c + 5;
            f61003d = i32 % 128;
            int i33 = i32 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ue
    public final /* synthetic */ void setOnFocusChangeListener(sz szVar) {
        setY(new Object[]{this, szVar}, -1487652473, 1487652478, System.identityHashCode(this));
    }
}
