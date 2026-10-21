package com.mypinpad.tsdk.isolation;

import bk.d;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setTextKeepState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60680c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60681d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fm<a> f60682a = new fm<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final fm<c> f60683b = new fm<>();

    /* JADX WARN: Code duplicated, block: B:50:0x0360  */
    /* JADX WARN: Code duplicated, block: B:52:0x0373  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Boolean bool;
        Iterator it;
        int i14 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i15 = ~i12;
        int i16 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i15 | i11)) | i10) * (-1042)) + i14;
        int i17 = ~i10;
        switch ((((~(i10 | i15 | i11)) | (~(i12 | i17)) | (~((~i11) | i17))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i16) {
            case 1:
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[0];
                int i18 = f60680c;
                int i19 = (i18 ^ 59) + ((i18 & 59) << 1);
                f60681d = i19 % 128;
                int i20 = i19 % 2;
                fm<a> fmVar = settextkeepstate.f60682a;
                boolean zBooleanValue = ((Boolean) fm.setOnFocusChangeListener(new Object[]{fmVar}, 1125462724, -1125462723, System.identityHashCode(fmVar))).booleanValue();
                int i21 = f60681d;
                int i22 = i21 & 27;
                int i23 = (i21 ^ 27) | i22;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f60680c = i24 % 128;
                int i25 = i24 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 2:
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[0];
                a aVar = (a) objArr[1];
                int i26 = f60681d;
                int i27 = i26 & 121;
                int i28 = ((i26 | 121) & (~i27)) + (i27 << 1);
                f60680c = i28 % 128;
                int i29 = i28 % 2;
                Intrinsics.checkNotNullParameter(aVar, "");
                setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate2, d.listOf(aVar)}, -1408950709, 1408950709, System.identityHashCode(settextkeepstate2));
                int i30 = f60680c;
                int i31 = i30 & 53;
                int i32 = -(-((i30 ^ 53) | i31));
                int i33 = (i31 & i32) + (i32 | i31);
                f60681d = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case 3:
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[0];
                Continuation continuation = (Continuation) objArr[1];
                int i35 = f60680c;
                int i36 = i35 & 71;
                int i37 = (i35 | 71) & (~i36);
                int i38 = -(-(i36 << 1));
                int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                f60681d = i39 % 128;
                int i40 = i39 % 2;
                fm<a> fmVar2 = settextkeepstate3.f60682a;
                Object onFocusChangeListener = fm.setOnFocusChangeListener(new Object[]{fmVar2, continuation}, -656090639, 656090643, System.identityHashCode(fmVar2));
                int i41 = f60680c;
                int i42 = i41 & 79;
                int i43 = i42 + ((i41 ^ 79) | i42);
                f60681d = i43 % 128;
                int i44 = i43 % 2;
                return onFocusChangeListener;
            case 4:
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[0];
                Continuation continuation2 = (Continuation) objArr[1];
                int i45 = f60681d;
                int i46 = i45 & 95;
                int i47 = (i46 - (~(-(-((i45 ^ 95) | i46))))) - 1;
                f60680c = i47 % 128;
                int i48 = i47 % 2;
                fm<c> fmVar3 = settextkeepstate4.f60683b;
                if (i48 == 0) {
                    return fm.setOnFocusChangeListener(new Object[]{fmVar3, continuation2}, -656090639, 656090643, System.identityHashCode(fmVar3));
                }
                fm.setOnFocusChangeListener(new Object[]{fmVar3, continuation2}, -656090639, 656090643, System.identityHashCode(fmVar3));
                throw null;
            case 5:
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[0];
                int i49 = f60681d;
                int i50 = ((i49 | 121) << 1) - (i49 ^ 121);
                f60680c = i50 % 128;
                int i51 = i50 % 2;
                if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate5}, -1147820723, 1147820724, System.identityHashCode(settextkeepstate5))).booleanValue()) {
                    int i52 = f60681d;
                    int i53 = i52 ^ 77;
                    int i54 = (((i52 & 77) | i53) << 1) - i53;
                    f60680c = i54 % 128;
                    if (i54 % 2 != 0) {
                        ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate5}, 218773038, -218773029, System.identityHashCode(settextkeepstate5))).booleanValue();
                        throw null;
                    }
                    if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate5}, 218773038, -218773029, System.identityHashCode(settextkeepstate5))).booleanValue()) {
                        int i55 = f60680c;
                        int i56 = i55 & 83;
                        int i57 = (((i55 | 83) & (~i56)) - (~(i56 << 1))) - 1;
                        f60681d = i57 % 128;
                        int i58 = i57 % 2;
                        bool = Boolean.FALSE;
                    } else {
                        int i59 = f60680c;
                        int i60 = i59 & 75;
                        int i61 = (i59 ^ 75) | i60;
                        i13 = (i60 ^ i61) + ((i61 & i60) << 1);
                        f60681d = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i62 = 28 / 0;
                        }
                        bool = Boolean.TRUE;
                    }
                } else {
                    int i510 = f60680c;
                    int i63 = i510 & 75;
                    int i64 = (i510 ^ 75) | i63;
                    i13 = (i63 ^ i64) + ((i64 & i63) << 1);
                    f60681d = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i65 = 28 / 0;
                    }
                    bool = Boolean.TRUE;
                }
                return bool;
            case 6:
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[0];
                int iIdentityHashCode = System.identityHashCode(settextkeepstate6);
                int i66 = ~iIdentityHashCode;
                int i67 = ((-384817897) & i66) | (384817896 & iIdentityHashCode);
                int i68 = (-384817897) & iIdentityHashCode;
                int i69 = ((i67 & i68) | (i67 ^ i68)) * (-50);
                int i70 = (-844659203) ^ i69;
                int i71 = ((i69 & (-844659203)) | i70) << 1;
                int i72 = -i70;
                int i73 = (i71 & i72) + (i71 | i72);
                int i74 = 922738415 & iIdentityHashCode;
                int i75 = (iIdentityHashCode | 922738415) & (~i74);
                int i76 = ~((i75 & i74) | (i75 ^ i74));
                int i77 = 821548775 | i66;
                int i78 = ~((i77 ^ (-384817897)) | (i77 & (-384817897)));
                int i79 = i76 & i78;
                int i80 = (i76 | i78) & (~i79);
                int i81 = -(-(((i80 & i79) | (i80 ^ i79)) * 50));
                int i82 = i73 & i81;
                int i83 = ((i73 ^ i81) | i82) << 1;
                int i84 = -((i81 | i73) & (~i82));
                int i85 = (i83 & i84) + (i84 | i83);
                int i86 = ~i77;
                int i87 = (i86 & 101189640) | (i86 ^ 101189640);
                int i88 = ~(i66 | (-384817897));
                int i89 = -(-(((i87 & i88) | (i87 ^ i88)) * 50));
                int i90 = (i85 & i89) + (i89 | i85);
                int iIdentityHashCode2 = System.identityHashCode(settextkeepstate6);
                int i91 = ~iIdentityHashCode2;
                int i92 = 569439871 & i91;
                int i93 = (~i92) & (569439871 | i91);
                int i94 = ~((i92 & i93) | (i93 ^ i92));
                int i95 = (-1879046016) & i94;
                int i96 = (i94 | (-1879046016)) & (~i95);
                int i97 = ((i96 & i95) | (i96 ^ i95)) * (-241);
                int i98 = ((~i97) & 713143680) | ((-713143681) & i97);
                int i99 = -(-((i97 & 713143680) << 1));
                int i100 = ((i98 ^ i99) + ((i99 & i98) << 1)) - (-20667649);
                int i101 = (i100 ^ (-1)) + (i100 << 1);
                int i102 = (iIdentityHashCode2 | i91) & i91;
                int i103 = ((~i102) & 569439871) | ((-569439872) & i102);
                int i104 = i102 & 569439871;
                int i105 = (i104 & i103) | (i103 ^ i104);
                int i106 = i105 & (-1327470464);
                int i107 = ~(((i105 | (-1327470464)) & (~i106)) | i106);
                int i108 = 551575552 ^ i107;
                int i109 = i107 & 551575552;
                int i110 = ((i109 & i108) | (i108 ^ i109)) * 241;
                int i111 = i101 & i110;
                if (i90 > (i111 - (~(-(-((i110 ^ i101) | i111))))) - 1) {
                    fm<a> fmVar4 = settextkeepstate6.f60682a;
                    fm.setOnFocusChangeListener(new Object[]{fmVar4}, -1081673723, 1081673725, System.identityHashCode(fmVar4));
                    fm<c> fmVar5 = settextkeepstate6.f60683b;
                    fm.setOnFocusChangeListener(new Object[]{fmVar5}, -1081673723, 1081673725, System.identityHashCode(fmVar5));
                    return null;
                }
                fm<a> fmVar6 = settextkeepstate6.f60682a;
                fm.setOnFocusChangeListener(new Object[]{fmVar6}, -1081673723, 1081673725, System.identityHashCode(fmVar6));
                fm<c> fmVar7 = settextkeepstate6.f60683b;
                fm.setOnFocusChangeListener(new Object[]{fmVar7}, -1081673723, 1081673725, System.identityHashCode(fmVar7));
                throw null;
            case 7:
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[0];
                c cVar = (c) objArr[1];
                int i112 = f60681d;
                int i113 = (i112 & (-50)) | ((~i112) & 49);
                int i114 = (i112 & 49) << 1;
                int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                f60680c = i115 % 128;
                if (i115 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(cVar, "");
                    fm<c> fmVar8 = settextkeepstate7.f60683b;
                    fm.setOnFocusChangeListener(new Object[]{fmVar8, cVar}, -1447780689, 1447780689, System.identityHashCode(fmVar8));
                    throw null;
                }
                Intrinsics.checkNotNullParameter(cVar, "");
                fm<c> fmVar9 = settextkeepstate7.f60683b;
                fm.setOnFocusChangeListener(new Object[]{fmVar9, cVar}, -1447780689, 1447780689, System.identityHashCode(fmVar9));
                int i116 = f60681d;
                int i117 = (i116 & 101) + (i116 | 101);
                f60680c = i117 % 128;
                int i118 = i117 % 2;
                return null;
            case 8:
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[0];
                int i119 = f60680c + 101;
                f60681d = i119 % 128;
                if (i119 % 2 == 0) {
                    fm<a> fmVar10 = settextkeepstate8.f60682a;
                    fm.setOnFocusChangeListener(new Object[]{fmVar10}, 1859548033, -1859548030, System.identityHashCode(fmVar10));
                    fm<c> fmVar11 = settextkeepstate8.f60683b;
                    fm.setOnFocusChangeListener(new Object[]{fmVar11}, 1859548033, -1859548030, System.identityHashCode(fmVar11));
                    throw null;
                }
                fm<a> fmVar12 = settextkeepstate8.f60682a;
                fm.setOnFocusChangeListener(new Object[]{fmVar12}, 1859548033, -1859548030, System.identityHashCode(fmVar12));
                fm<c> fmVar13 = settextkeepstate8.f60683b;
                fm.setOnFocusChangeListener(new Object[]{fmVar13}, 1859548033, -1859548030, System.identityHashCode(fmVar13));
                int i120 = f60681d;
                int i121 = i120 ^ 97;
                int i122 = (((i120 & 97) | i121) << 1) - i121;
                f60680c = i122 % 128;
                int i123 = i122 % 2;
                return null;
            case 9:
                setTextKeepState settextkeepstate9 = (setTextKeepState) objArr[0];
                int i124 = f60681d;
                int i125 = i124 & 39;
                int i126 = ((i124 | 39) & (~i125)) + (i125 << 1);
                f60680c = i126 % 128;
                int i127 = i126 % 2;
                fm<c> fmVar14 = settextkeepstate9.f60683b;
                if (i127 == 0) {
                    return Boolean.valueOf(((Boolean) fm.setOnFocusChangeListener(new Object[]{fmVar14}, 1125462724, -1125462723, System.identityHashCode(fmVar14))).booleanValue());
                }
                ((Boolean) fm.setOnFocusChangeListener(new Object[]{fmVar14}, 1125462724, -1125462723, System.identityHashCode(fmVar14))).booleanValue();
                throw null;
            default:
                setTextKeepState settextkeepstate10 = (setTextKeepState) objArr[0];
                List list = (List) objArr[1];
                int i128 = f60681d;
                int i129 = i128 & 55;
                int i130 = (i128 | 55) & (~i129);
                int i131 = -(-(i129 << 1));
                int i132 = ((i130 | i131) << 1) - (i130 ^ i131);
                f60680c = i132 % 128;
                if (i132 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(list, "");
                    it = list.iterator();
                    int i133 = 5 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(list, "");
                    it = list.iterator();
                }
                int i134 = (-2) - ((f60681d + 92) ^ (-1));
                f60680c = i134 % 128;
                while (true) {
                    int i135 = i134 % 2;
                    if (!it.hasNext()) {
                        int i136 = f60680c;
                        int i137 = ((i136 ^ 100) + ((i136 & 100) << 1)) - 1;
                        f60681d = i137 % 128;
                        if (i137 % 2 != 0) {
                            return null;
                        }
                        int i138 = 15 / 0;
                        return null;
                    }
                    int i139 = f60680c + 43;
                    f60681d = i139 % 128;
                    if (i139 % 2 == 0) {
                        a aVar2 = (a) it.next();
                        fm<a> fmVar15 = settextkeepstate10.f60682a;
                        fm.setOnFocusChangeListener(new Object[]{fmVar15, aVar2}, -1447780689, 1447780689, System.identityHashCode(fmVar15));
                        throw null;
                    }
                    a aVar3 = (a) it.next();
                    fm<a> fmVar16 = settextkeepstate10.f60682a;
                    fm.setOnFocusChangeListener(new Object[]{fmVar16, aVar3}, -1447780689, 1447780689, System.identityHashCode(fmVar16));
                    int i140 = f60680c;
                    int i141 = i140 & 105;
                    i134 = (((i140 | 105) & (~i141)) - (~(-(-(i141 << 1))))) - 1;
                    f60681d = i134 % 128;
                }
                break;
        }
    }

    public final void setDividerPadding() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 1408220406, -1408220398, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 11951396, -11951391, System.identityHashCode(this))).booleanValue();
    }

    public final void setX(@NotNull c cVar) {
        setCompoundDrawableTintBlendMode(new Object[]{this, cVar}, -1386319901, 1386319908, System.identityHashCode(this));
    }

    public final void setY() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -502880194, 502880200, System.identityHashCode(this));
    }

    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super a> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, continuation}, -1083100835, 1083100838, System.identityHashCode(this));
    }

    public final void setX(@NotNull a aVar) {
        setCompoundDrawableTintBlendMode(new Object[]{this, aVar}, 565642854, -565642852, System.identityHashCode(this));
    }

    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull Continuation<? super c> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, continuation}, -1884950385, 1884950389, System.identityHashCode(this));
    }
}
