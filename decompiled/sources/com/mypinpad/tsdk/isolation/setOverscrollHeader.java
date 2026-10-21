package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOverscrollHeader extends ArrayList<byte[]> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f60291p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f60292q0 = 1;

    /* JADX WARN: Code duplicated, block: B:100:0x0617  */
    /* JADX WARN: Code duplicated, block: B:104:0x0642  */
    /* JADX WARN: Code duplicated, block: B:106:0x0649  */
    /* JADX WARN: Code duplicated, block: B:97:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0612  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int iIntValue;
        int i14;
        Boolean boolValueOf;
        int iIntValue2;
        int i15 = ~i11;
        int i16 = ~(i15 | i12);
        int i17 = ~i12;
        int iValueOf = -1;
        switch ((((~((~i10) | i12)) | (~(i11 | i17))) * 406) + ((~(i15 | i17 | i10)) * (-406)) + ((i16 | (~(i17 | i10 | i11))) * (-406)) + (i11 * 407) + (i10 * (-405))) {
            case 1:
                setOverscrollHeader setoverscrollheader = (setOverscrollHeader) objArr[0];
                Object obj = objArr[1];
                int i18 = f60291p0;
                int i19 = i18 & 85;
                int i20 = ((i18 ^ 85) | i19) << 1;
                int i21 = -((i18 | 85) & (~i19));
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = i22 % 128;
                f60292q0 = i23;
                boolean z10 = obj instanceof byte[];
                if (i22 % 2 == 0) {
                    int i24 = 80 / 0;
                    if (z10) {
                        iIntValue = ((Integer) setX(new Object[]{setoverscrollheader, (byte[]) obj}, -10792127, 10792135, System.identityHashCode(setoverscrollheader))).intValue();
                        int i25 = f60291p0 + 100;
                        i14 = (i25 ^ (-1)) + (i25 << 1);
                        f60292q0 = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                        iValueOf = Integer.valueOf(iIntValue);
                    } else {
                        i13 = (((i23 ^ 49) | (i23 & 49)) << 1) - ((i23 & (-50)) | ((~i23) & 49));
                        f60291p0 = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i26 = 38 / 0;
                        }
                    }
                } else if (z10) {
                    iIntValue = ((Integer) setX(new Object[]{setoverscrollheader, (byte[]) obj}, -10792127, 10792135, System.identityHashCode(setoverscrollheader))).intValue();
                    int i27 = f60291p0 + 100;
                    i14 = (i27 ^ (-1)) + (i27 << 1);
                    f60292q0 = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    iValueOf = Integer.valueOf(iIntValue);
                } else {
                    i13 = (((i23 ^ 49) | (i23 & 49)) << 1) - ((i23 & (-50)) | ((~i23) & 49));
                    f60291p0 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i28 = 38 / 0;
                    }
                }
                return iValueOf;
            case 2:
                setOverscrollHeader setoverscrollheader2 = (setOverscrollHeader) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i29 = f60292q0;
                int i30 = ((i29 | 107) << 1) - (i29 ^ 107);
                f60291p0 = i30 % 128;
                if (i30 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bArr, "");
                    setoverscrollheader2.add(bArr);
                    return null;
                }
                Intrinsics.checkNotNullParameter(bArr, "");
                setoverscrollheader2.add(bArr);
                throw null;
            case 3:
                setOverscrollHeader setoverscrollheader3 = (setOverscrollHeader) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i31 = f60292q0 + 5;
                f60291p0 = i31 % 128;
                int i32 = i31 % 2;
                boolean zRemove = super.remove(bArr2);
                if (i32 != 0) {
                    int i33 = 81 / 0;
                }
                int i34 = f60291p0;
                int i35 = i34 ^ 45;
                int i36 = (i34 & 45) << 1;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f60292q0 = i37 % 128;
                if (i37 % 2 != 0) {
                    return Boolean.valueOf(zRemove);
                }
                throw null;
            case 4:
                setOverscrollHeader setoverscrollheader4 = (setOverscrollHeader) objArr[0];
                Object obj2 = objArr[1];
                int i38 = f60291p0;
                int i39 = (i38 ^ 41) + ((i38 & 41) << 1);
                int i40 = i39 % 128;
                f60292q0 = i40;
                if (i39 % 2 == 0) {
                    boolean z11 = obj2 instanceof byte[];
                    throw null;
                }
                if (obj2 instanceof byte[]) {
                    boolean zBooleanValue = ((Boolean) setX(new Object[]{setoverscrollheader4, (byte[]) obj2}, 1022411843, -1022411840, System.identityHashCode(setoverscrollheader4))).booleanValue();
                    int i41 = f60292q0 + 23;
                    f60291p0 = i41 % 128;
                    int i42 = i41 % 2;
                    boolValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    int i43 = ((i40 | 13) << 1) - (i40 ^ 13);
                    int i44 = i43 % 128;
                    f60291p0 = i44;
                    int i45 = i43 % 2;
                    int i46 = (((i44 | 66) << 1) - (i44 ^ 66)) - 1;
                    f60292q0 = i46 % 128;
                    int i47 = i46 % 2;
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            case 5:
                setOverscrollHeader setoverscrollheader5 = (setOverscrollHeader) objArr[0];
                Object obj3 = objArr[1];
                int i48 = f60291p0;
                int i49 = i48 & 13;
                int i50 = (i48 | 13) & (~i49);
                int i51 = i49 << 1;
                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                int i53 = i52 % 128;
                f60292q0 = i53;
                if (i52 % 2 == 0) {
                    boolean z12 = obj3 instanceof byte[];
                    throw null;
                }
                if (obj3 instanceof byte[]) {
                    int iIntValue3 = ((Integer) setX(new Object[]{setoverscrollheader5, (byte[]) obj3}, 91245631, -91245624, System.identityHashCode(setoverscrollheader5))).intValue();
                    int i54 = f60291p0;
                    int i55 = (-2) - (((i54 ^ 14) + ((i54 & 14) << 1)) ^ (-1));
                    f60292q0 = i55 % 128;
                    if (i55 % 2 == 0) {
                        int i56 = 12 / 0;
                    }
                    iValueOf = Integer.valueOf(iIntValue3);
                } else {
                    int i57 = ((((i53 ^ 105) | (i53 & 105)) << 1) - (~(-((i53 & (-106)) | ((~i53) & 105))))) - 1;
                    f60291p0 = i57 % 128;
                    if (i57 % 2 != 0) {
                        throw null;
                    }
                }
                return iValueOf;
            case 6:
                setOverscrollHeader setoverscrollheader6 = (setOverscrollHeader) objArr[0];
                int i58 = f60292q0;
                int i59 = ((i58 & 29) - (~(i58 | 29))) - 1;
                f60291p0 = i59 % 128;
                if (i59 % 2 != 0) {
                    iIntValue2 = ((Integer) setX(new Object[]{setoverscrollheader6}, -908486904, 908486913, System.identityHashCode(setoverscrollheader6))).intValue();
                    int i60 = 23 / 0;
                } else {
                    iIntValue2 = ((Integer) setX(new Object[]{setoverscrollheader6}, -908486904, 908486913, System.identityHashCode(setoverscrollheader6))).intValue();
                }
                int i61 = f60292q0;
                int i62 = (((i61 | 52) << 1) - (i61 ^ 52)) - 1;
                f60291p0 = i62 % 128;
                int i63 = i62 % 2;
                return Integer.valueOf(iIntValue2);
            case 7:
                setOverscrollHeader setoverscrollheader7 = (setOverscrollHeader) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i64 = f60291p0;
                int i65 = i64 & 43;
                int i66 = (i65 - (~((43 ^ i64) | i65))) - 1;
                f60292q0 = i66 % 128;
                int i67 = i66 % 2;
                int iIndexOf = super.indexOf(bArr3);
                if (i67 == 0) {
                    int i68 = 99 / 0;
                }
                return Integer.valueOf(iIndexOf);
            case 8:
                setOverscrollHeader setoverscrollheader8 = (setOverscrollHeader) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int iIdentityHashCode = System.identityHashCode(setoverscrollheader8);
                int i69 = ~iIdentityHashCode;
                int i70 = (1585394197 & i69) | (iIdentityHashCode & (-1585394198));
                int i71 = 1585394197 & iIdentityHashCode;
                int i72 = (i71 & i70) | (i70 ^ i71);
                int i73 = ~i72;
                int i74 = (i72 | i73) & i73;
                int i75 = -(-(((i74 & 1937525980) | (1937525980 ^ i74)) * (-318)));
                int i76 = 1080804415 & i75;
                int i77 = i76 + ((i75 ^ 1080804415) | i76);
                int i78 = 1937525980 & i69;
                int i79 = (iIdentityHashCode & (-1937525981)) | i78;
                int i80 = 1937525980 & iIdentityHashCode;
                int i81 = ~((i79 & i80) | (i79 ^ i80));
                int i82 = (i69 | iIdentityHashCode) & i69;
                int i83 = i82 & (-1585394198);
                int i84 = (i82 | (-1585394198)) & (~i83);
                int i85 = (i84 & i83) | (i84 ^ i83);
                int i86 = (i85 & 1937525980) | ((~i85) & (-1937525981));
                int i87 = (-1937525981) & i85;
                int i88 = ~((i87 & i86) | (i86 ^ i87));
                int i89 = -(~(((i88 & i81) | (i81 ^ i88)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i90 = (((i77 | i89) << 1) - (i89 ^ i77)) - 1;
                int i91 = (i69 ^ 1937525980) | i78;
                int i92 = (i91 & (-1585394198)) | (i91 ^ (-1585394198));
                int i93 = ~i92;
                int i94 = ((~((iIdentityHashCode & (-1383858197)) | ((-1383858197) ^ iIdentityHashCode))) | ((i92 | i93) & i93)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                int i95 = i90 & i94;
                int i96 = -(-((i94 ^ i90) | i95));
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                int i98 = ~System.identityHashCode(setoverscrollheader8);
                int i99 = i98 & 1467779795;
                int i100 = (~i99) & (i98 | 1467779795);
                int i101 = ~((i100 & i99) | (i100 ^ i99));
                int i102 = (-1089839584) ^ i101;
                int i103 = i101 & (-1089839584);
                int i104 = -(-(((i103 & i102) | (i102 ^ i103)) * 764));
                int i105 = (((((-397187161) ^ i104) | ((-397187161) & i104)) << 1) - (~(-((i104 & 397187160) | ((-397187161) & (~i104)))))) - 1;
                int i106 = (i98 ^ (-1089839584)) | ((-1089839584) & i98);
                int i107 = ~i106;
                int i108 = (i106 | i107) & i107;
                int i109 = 1081376979 & i108;
                int i110 = (i108 | 1081376979) & (~i109);
                int i111 = ((i110 & i109) | (i110 ^ i109)) * (-1528);
                int i112 = i105 & i111;
                int i113 = (((i111 | i105) & (~i112)) - (~(-(-(i112 << 1))))) - 1;
                int i114 = i98 ^ 1467779795;
                int i115 = (i114 & i99) | (i114 ^ i99);
                int i116 = ~i115;
                int i117 = (i115 | i116) & i116;
                int i118 = (-394865421) & i117;
                int i119 = (i117 | (-394865421)) & (~i118);
                int i120 = -(~(-(-(((i119 & i118) | (i119 ^ i118)) * 764))));
                int i121 = (((i113 | i120) << 1) - (i120 ^ i113)) - 1;
                int iLastIndexOf = super.lastIndexOf(bArr4);
                if (i97 <= i121) {
                    int i122 = 38 / 0;
                }
                return Integer.valueOf(iLastIndexOf);
            case 9:
                setOverscrollHeader setoverscrollheader9 = (setOverscrollHeader) objArr[0];
                int i123 = f60291p0;
                int i124 = i123 & 99;
                int i125 = i124 + ((i123 ^ 99) | i124);
                f60292q0 = i125 % 128;
                if (i125 % 2 != 0) {
                    return Integer.valueOf(super.size());
                }
                super.size();
                throw null;
            case 10:
                setOverscrollHeader setoverscrollheader10 = (setOverscrollHeader) objArr[0];
                byte[] bArr5 = (byte[]) objArr[1];
                int i126 = f60291p0;
                int i127 = ((i126 ^ 44) + ((i126 & 44) << 1)) - 1;
                f60292q0 = i127 % 128;
                int i128 = i127 % 2;
                boolean zContains = super.contains(bArr5);
                if (i128 == 0) {
                    int i129 = 60 / 0;
                }
                int i130 = f60292q0;
                int i131 = i130 ^ 99;
                int i132 = (((i130 & 99) | i131) << 1) - i131;
                f60291p0 = i132 % 128;
                if (i132 % 2 == 0) {
                    return Boolean.valueOf(zContains);
                }
                throw null;
            case 11:
                setOverscrollHeader setoverscrollheader11 = (setOverscrollHeader) objArr[0];
                Object obj4 = objArr[1];
                int iIdentityHashCode2 = System.identityHashCode(setoverscrollheader11);
                int i133 = ~iIdentityHashCode2;
                int i134 = ((~i133) & 1735249375) | ((-1735249376) & i133);
                int i135 = 1735249375 & i133;
                int i136 = (i134 & i135) | (i134 ^ i135);
                int i137 = ~i136;
                int i138 = (i136 | i137) & i137;
                int i139 = (-1735262208) & i138;
                int i140 = (i138 | (-1735262208)) & (~i139);
                int i141 = (i140 & i139) | (i140 ^ i139);
                int i142 = (-39911834) & iIdentityHashCode2;
                int i143 = (iIdentityHashCode2 | (-39911834)) & (~i142);
                int i144 = ~(i143 | i142);
                int i145 = ((~i144) & i141) | ((~i141) & i144);
                int i146 = i141 & i144;
                int i147 = ((i146 & i145) | (i145 ^ i146)) * (-252);
                int i148 = ((1852533454 & i147) - (~(-(-(i147 | 1852533454))))) - 1;
                int i149 = ((-1467847577) & i148) | ((~i148) & 1467847576);
                int i150 = (i148 & 1467847576) << 1;
                int i151 = (i149 ^ i150) + ((i149 & i150) << 1);
                int i152 = i133 ^ 1735249375;
                int i153 = (i152 & i135) | (i152 ^ i135);
                int i154 = i153 ^ (-39924666);
                int i155 = i153 & (-39924666);
                int i156 = ~((i155 & i154) | (i154 ^ i155));
                int i157 = ~((i143 & i142) | (i143 ^ i142));
                int i158 = i156 & i157;
                int i159 = -(-((((i157 | i156) & (~i158)) | i158) * 252));
                int i160 = (((i151 ^ i159) | (i151 & i159)) << 1) - ((i159 & (~i151)) | ((~i159) & i151));
                int iIdentityHashCode3 = System.identityHashCode(setoverscrollheader11);
                int i161 = ~iIdentityHashCode3;
                int i162 = ((-1786099455) & i161) | (iIdentityHashCode3 & 1786099454);
                int i163 = (-1786099455) & iIdentityHashCode3;
                int i164 = ~((i162 & i163) | (i162 ^ i163));
                int i165 = 690485471 & i164;
                int i166 = (i164 | 690485471) & (~i165);
                int i167 = ((i166 & i165) | (i166 ^ i165)) * (-318);
                int i168 = ((((~i167) & (-1624362014)) | (1624362013 & i167)) - (~((i167 & (-1624362014)) << 1))) - 1;
                int i169 = ~((690485471 ^ iIdentityHashCode3) | (690485471 & iIdentityHashCode3));
                int i170 = i161 ^ 1786099454;
                int i171 = i161 & 1786099454;
                int i172 = (i170 ^ i171) | (i170 & i171);
                int i173 = ~((i172 ^ (-690485472)) | (i172 & (-690485472)));
                int i174 = ((i169 & i173) | (i169 ^ i173)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                int i175 = ((((~i174) & i168) | ((~i168) & i174)) - (~(-(-((i174 & i168) << 1))))) - 1;
                int i176 = 690485471 & i161;
                int i177 = ((i161 | 690485471) & (~i176)) | i176;
                int i178 = ((-1786099455) & i177) | ((~i177) & 1786099454);
                int i179 = i177 & 1786099454;
                int i180 = ~((i179 & i178) | (i178 ^ i179));
                int i181 = (-16926722) & iIdentityHashCode3;
                int i182 = (iIdentityHashCode3 | (-16926722)) & (~i181);
                int i183 = ~((i182 & i181) | (i182 ^ i181));
                int i184 = -(~(((i183 & i180) | (i180 ^ i183)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                if (i160 > ((i175 & i184) + (i184 | i175)) - 1) {
                    boolean z13 = obj4 instanceof byte[];
                    throw null;
                }
                if (!(obj4 instanceof byte[])) {
                    int i185 = f60291p0;
                    int i186 = ((i185 | 35) << 1) - (i185 ^ 35);
                    f60292q0 = i186 % 128;
                    if (i186 % 2 == 0) {
                        throw null;
                    }
                    boolValueOf = Boolean.FALSE;
                } else {
                    boolean zBooleanValue2 = ((Boolean) setX(new Object[]{setoverscrollheader11, (byte[]) obj4}, 303957741, -303957731, System.identityHashCode(setoverscrollheader11))).booleanValue();
                    int i187 = f60292q0;
                    int i188 = (i187 & (-126)) | ((~i187) & 125);
                    int i189 = -(-((i187 & 125) << 1));
                    int i190 = ((i188 | i189) << 1) - (i189 ^ i188);
                    f60291p0 = i190 % 128;
                    int i191 = i190 % 2;
                    boolValueOf = Boolean.valueOf(zBooleanValue2);
                }
                return boolValueOf;
            default:
                setOverscrollHeader setoverscrollheader12 = (setOverscrollHeader) objArr[0];
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setoverscrollheader12, 10));
                Iterator<byte[]> it = setoverscrollheader12.iterator();
                int i192 = f60291p0 + 47;
                f60292q0 = i192 % 128;
                int i193 = i192 % 2;
                while (it.hasNext()) {
                    int i194 = f60291p0;
                    int i195 = (i194 & (-90)) | ((~i194) & 89);
                    int i196 = -(-((i194 & 89) << 1));
                    int i197 = ((i195 | i196) << 1) - (i196 ^ i195);
                    f60292q0 = i197 % 128;
                    if (i197 % 2 == 0) {
                        arrayList.add(Integer.valueOf(it.next().length));
                        throw null;
                    }
                    arrayList.add(Integer.valueOf(it.next().length));
                    int i198 = f60291p0;
                    int i199 = (i198 | 79) << 1;
                    int i200 = -(i198 ^ 79);
                    int i201 = ((i199 | i200) << 1) - (i200 ^ i199);
                    f60292q0 = i201 % 128;
                    int i202 = i201 % 2;
                }
                byte[] bArr6 = new byte[CollectionsKt___CollectionsKt.sumOfInt(arrayList)];
                int i203 = f60292q0;
                int i204 = (i203 & 115) + (i203 | 115);
                f60291p0 = i204 % 128;
                int i205 = i204 % 2;
                int i206 = 0;
                for (byte[] bArr7 : setoverscrollheader12) {
                    int i207 = f60291p0 + 41;
                    f60292q0 = i207 % 128;
                    int i208 = i207 % 2;
                    ArraysKt___ArraysJvmKt.copyInto$default(bArr7, bArr6, i206, 0, 0, 12, (Object) null);
                    int length = bArr7.length;
                    int iIdentityHashCode4 = System.identityHashCode(setoverscrollheader12);
                    int i209 = length * 784;
                    int i210 = i206 * (-782);
                    int i211 = i209 & i210;
                    int i212 = -(-((i209 ^ i210) | i211));
                    int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
                    int i214 = ~i206;
                    int i215 = i214 * (-783);
                    int i216 = ((~i215) & i213) | ((~i213) & i215);
                    int i217 = -(-((i213 & i215) << 1));
                    int i218 = (i216 & i217) + (i217 | i216);
                    int i219 = ~length;
                    int i220 = ~iIdentityHashCode4;
                    int i221 = ((~i220) & i219) | ((~i219) & i220);
                    int i222 = i219 & i220;
                    int i223 = (i221 & i222) | (i221 ^ i222);
                    int i224 = (i214 & i223) | ((~i223) & i206);
                    int i225 = i223 & i206;
                    int i226 = (i224 & i225) | (i224 ^ i225);
                    int i227 = ~i226;
                    int i228 = -(-(((i226 | i227) & i227) * (-783)));
                    int i229 = i218 & i228;
                    int i230 = -(-((i228 ^ i218) | i229));
                    int i231 = (i229 ^ i230) + ((i230 & i229) << 1);
                    int i232 = (iIdentityHashCode4 | i220) & i220;
                    int i233 = i232 ^ i206;
                    int i234 = i206 & i232;
                    int i235 = ~((i234 & i233) | (i233 ^ i234));
                    int i236 = i219 ^ i235;
                    int i237 = i235 & i219;
                    int i238 = -(-(((i237 & i236) | (i236 ^ i237)) * 783));
                    int i239 = i231 & i238;
                    i206 = ((i238 ^ i231) | i239) + i239;
                    int i240 = f60292q0;
                    int i241 = ((i240 | 95) << 1) - (i240 ^ 95);
                    f60291p0 = i241 % 128;
                    int i242 = i241 % 2;
                }
                int i243 = f60292q0;
                int i244 = i243 & 109;
                int i245 = (i243 ^ 109) | i244;
                int i246 = ((i244 | i245) << 1) - (i245 ^ i244);
                f60291p0 = i246 % 128;
                if (i246 % 2 == 0) {
                    return bArr6;
                }
                int i247 = 43 / 0;
                return bArr6;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -1551629845, 1551629856, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return ((Integer) setX(new Object[]{this, obj}, 2036370852, -2036370847, System.identityHashCode(this))).intValue();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return ((Integer) setX(new Object[]{this, obj}, 1570567103, -1570567102, System.identityHashCode(this))).intValue();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 79947427, -79947423, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -158300171, 158300171, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull byte[] bArr) {
        setX(new Object[]{this, bArr}, 2089112754, -2089112752, System.identityHashCode(this));
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((Integer) setX(new Object[]{this}, -320625543, 320625549, System.identityHashCode(this))).intValue();
    }
}
