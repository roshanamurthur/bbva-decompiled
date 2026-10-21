package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/setFocusable;", "Lcom/mypinpad/tsdk/i/setLeftTopRightBottom;", "", "p0", "", "p1", "setOnFocusChangeListener", "([BI)I", "setY", "()[B", "", "toString", "()Ljava/lang/String;", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setCompoundDrawableTintBlendMode", "()I", "(I)V", "<init>"}, k = 1, mv = {1, 5, 1})
public final class setFocusable extends setLeftTopRightBottom {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59718b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59719c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int setCompoundDrawableTintBlendMode;

    static {
        int i10 = f59718b + 96;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f59719c = i11 % 128;
        int i12 = i11 % 2;
    }

    public setFocusable(int i10) {
        this.setCompoundDrawableTintBlendMode = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int iIntValue;
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        String str = null;
        int i17 = 2;
        switch (((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + (i11 * (-344)) + (i10 * (-344))) {
            case 1:
                byte[] bArr = (byte[]) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i18 = f59718b;
                int i19 = i18 & 79;
                int i20 = (i18 ^ 79) | i19;
                int i21 = (i19 & i20) + (i20 | i19);
                int i22 = i21 % 128;
                f59719c = i22;
                int i23 = i21 % 2;
                byte b10 = (byte) (bArr[iIntValue2] & 127);
                int i24 = (i22 ^ 6) + ((i22 & 6) << 1);
                int i25 = (i24 ^ (-1)) + (i24 << 1);
                f59718b = i25 % 128;
                int i26 = i25 % 2;
                return Byte.valueOf(b10);
            case 2:
                int i27 = ((setFocusable) objArr[0]).setCompoundDrawableTintBlendMode;
                byte[] bArr2 = (byte[]) setInputExtras.setDividerPadding(new Object[]{(byte[]) setInputExtras.setDividerPadding(new Object[]{Integer.valueOf(i27)}, -1690212590, 1690212600, i27)}, 708511835, -708511823, (int) System.currentTimeMillis());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new byte[]{((Byte) setLogo.setY(new Object[]{Byte.valueOf((byte) bArr2.length), 7}, -1215674910, 1215674913, 7)).byteValue()});
                arrayList.add(bArr2);
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it.next();
                int i28 = f59718b;
                int i29 = ((i28 | 15) << 1) - (i28 ^ 15);
                f59719c = i29 % 128;
                while (true) {
                    int i30 = i29 % 2;
                    if (it.hasNext()) {
                        int i31 = f59719c;
                        int i32 = (((i31 | 9) << 1) - (~(-(((~i31) & 9) | (i31 & (-10)))))) - 1;
                        f59718b = i32 % 128;
                        if (i32 % 2 != 0) {
                            ArraysKt___ArraysJvmKt.plus((byte[]) next, (byte[]) it.next());
                            throw null;
                        }
                        next = ArraysKt___ArraysJvmKt.plus((byte[]) next, (byte[]) it.next());
                        int i33 = f59719c;
                        i29 = ((((i33 ^ 101) | (i33 & 101)) << 1) - (~(-(((~i33) & 101) | (i33 & (-102)))))) - 1;
                        f59718b = i29 % 128;
                    } else {
                        objValueOf = (byte[]) next;
                        int i34 = f59719c;
                        int i35 = i34 & 119;
                        int i36 = (((i34 | 119) & (~i35)) - (~(-(-(i35 << 1))))) - 1;
                        f59718b = i36 % 128;
                        if (i36 % 2 != 0) {
                            throw null;
                        }
                    }
                }
                break;
            case 3:
                byte[] bArr3 = (byte[]) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i37 = f59719c;
                int i38 = (((i37 | 122) << 1) - (i37 ^ 122)) - 1;
                f59718b = i38 % 128;
                return Integer.valueOf(i38 % 2 != 0 ? UByte.m5545constructorimpl(bArr3[iIntValue3]) & 20325 : UByte.m5545constructorimpl(bArr3[iIntValue3]) & 255);
            case 4:
                setFocusable setfocusable = (setFocusable) objArr[0];
                int i39 = f59719c;
                int i40 = i39 & 9;
                int i41 = (((i39 | 9) & (~i40)) - (~(i40 << 1))) - 1;
                int i42 = i41 % 128;
                f59718b = i42;
                if (i41 % 2 == 0 ? setfocusable.setCompoundDrawableTintBlendMode <= 127 : setfocusable.setCompoundDrawableTintBlendMode <= 98) {
                    objValueOf = (byte[]) setOnFocusChangeListener(new Object[]{setfocusable}, 1696714035, -1696714035, System.identityHashCode(setfocusable));
                    int i43 = f59718b;
                    int i44 = i43 & 49;
                    int i45 = ((i43 ^ 49) | i44) << 1;
                    int i46 = -((i43 | 49) & (~i44));
                    int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                    f59719c = i47 % 128;
                    int i48 = i47 % 2;
                } else {
                    int i49 = i42 & 73;
                    int i50 = (i42 | 73) & (~i49);
                    int i51 = i49 << 1;
                    int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                    f59719c = i52 % 128;
                    if (i52 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = (byte[]) setOnFocusChangeListener(new Object[]{setfocusable}, 330625035, -330625033, System.identityHashCode(setfocusable));
                }
                break;
            case 5:
                int i53 = f59719c + 83;
                f59718b = i53 % 128;
                if (i53 % 2 != 0) {
                    setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                    int i54 = 53 / 0;
                } else {
                    setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
                }
                int i55 = f59719c;
                int i56 = i55 & 33;
                int i57 = ((i55 ^ 33) | i56) << 1;
                int i58 = -((i55 | 33) & (~i56));
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                f59718b = i59 % 128;
                int i60 = i59 % 2;
                return "";
            case 6:
                setFocusable setfocusable2 = (setFocusable) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int i61 = f59719c;
                int i62 = ((((i61 ^ 67) | (i61 & 67)) << 1) - (~(-(((~i61) & 67) | (i61 & (-68)))))) - 1;
                f59718b = i62 % 128;
                if (i62 % 2 != 0) {
                    throw null;
                }
                if (bArr4 == null) {
                    throw new setOnHierarchyChangeListener(2003, str, i17, null == true ? 1 : 0);
                }
                boolean z10 = !((Boolean) setLogo.setY(new Object[]{Byte.valueOf(bArr4[iIntValue4]), 7}, 1812344530, -1812344522, 7)).booleanValue();
                if (!z10) {
                    int i63 = f59718b;
                    int i64 = i63 & 65;
                    int i65 = -(-((i63 ^ 65) | i64));
                    int i66 = (i64 & i65) + (i65 | i64);
                    f59719c = i66 % 128;
                    int i67 = i66 % 2;
                    iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{bArr4, Integer.valueOf(iIntValue4)}, 2124088592, -2124088585, iIntValue4)).intValue();
                    int i68 = f59719c;
                    int i69 = i68 & 13;
                    int i70 = (i68 | 13) & (~i69);
                    int i71 = -(-(i69 << 1));
                    int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
                    f59718b = i72 % 128;
                    int i73 = i72 % 2;
                } else {
                    iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{bArr4, Integer.valueOf(iIntValue4)}, 2033618547, -2033618544, iIntValue4)).intValue();
                    int i74 = f59719c;
                    int i75 = (i74 & (-34)) | ((~i74) & 33);
                    int i76 = (33 & i74) << 1;
                    int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                    f59718b = i77 % 128;
                    int i78 = i77 % 2;
                }
                setfocusable2.setCompoundDrawableTintBlendMode = iIntValue;
                if (z10) {
                    int i79 = (iIntValue4 & 2) + (iIntValue4 | 2);
                    int i80 = (i79 ^ (-1)) + (i79 << 1);
                    int i81 = f59719c;
                    int i82 = (i81 & 39) + (i81 | 39);
                    f59718b = i82 % 128;
                    if (i82 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Integer.valueOf(i80);
                } else {
                    int i83 = f59719c;
                    int i84 = i83 & 55;
                    int i85 = -(-((i83 ^ 55) | i84));
                    int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                    f59718b = i86 % 128;
                    int i87 = i86 % 2;
                    int i88 = -(-((Byte) setOnFocusChangeListener(new Object[]{bArr4, Integer.valueOf(iIntValue4)}, 1541762161, -1541762160, iIntValue4)).byteValue());
                    int i89 = iIntValue4 ^ i88;
                    int i90 = ((i88 & iIntValue4) | i89) << 1;
                    int i91 = -i89;
                    int i92 = (i90 & i91) + (i90 | i91);
                    int i93 = -(-(i92 * (-55)));
                    int i94 = (-55) ^ i93;
                    int i95 = ((i93 & (-55)) | i94) << 1;
                    int i96 = -i94;
                    int i97 = (i95 ^ i96) + ((i95 & i96) << 1);
                    int i98 = iIntValue4 & 1;
                    int i99 = (~i98) & (iIntValue4 | 1);
                    int i100 = ~iIntValue4;
                    int i101 = (i98 & i99) | (i99 ^ i98);
                    int i102 = ~i101;
                    int i103 = (i101 | i102) & i102;
                    int i104 = (~i103) & i92;
                    int i105 = ~i92;
                    int i106 = i104 | (i103 & i105);
                    int i107 = i103 & i92;
                    int i108 = (i97 - (~(((i107 & i106) | (i106 ^ i107)) * 56))) - 1;
                    int i109 = (i92 ^ 1) | (i92 & 1);
                    int i110 = ~i109;
                    int i111 = -(-(((i109 | i110) & i110) * (-56)));
                    int i112 = ((((i108 ^ i111) | (i108 & i111)) << 1) - (~(-((i111 & (~i108)) | ((~i111) & i108))))) - 1;
                    int i113 = (i100 | iIntValue4) & i100;
                    int i114 = (i113 & i105) | ((~i113) & i92);
                    int i115 = i113 & i92;
                    int i116 = ~((i115 & i114) | (i114 ^ i115));
                    int i117 = -(-(((i116 & 1) | ((~i116) & 1) | (i116 & (-2))) * 56));
                    int i118 = i112 ^ i117;
                    int i119 = ((i117 & i112) | i118) << 1;
                    int i120 = -i118;
                    int i121 = (i119 ^ i120) + ((i119 & i120) << 1);
                    int i122 = f59719c;
                    int i123 = (((i122 ^ 51) | (i122 & 51)) << 1) - (((~i122) & 51) | (i122 & (-52)));
                    f59718b = i123 % 128;
                    if (i123 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Integer.valueOf(i121);
                }
                break;
                break;
            case 7:
                byte[] bArr5 = (byte[]) objArr[0];
                int iIntValue5 = ((Number) objArr[1]).intValue();
                int i124 = (-2) - ((f59719c + 64) ^ (-1));
                f59718b = i124 % 128;
                int i125 = i124 % 2;
                byte bByteValue = ((Byte) setOnFocusChangeListener(new Object[]{bArr5, Integer.valueOf(iIntValue5)}, 1541762161, -1541762160, iIntValue5)).byteValue();
                if (bByteValue > 0) {
                    i13 = 0;
                    int i126 = 1;
                    while (true) {
                        int i127 = i126 + 1;
                        int i128 = i13 << 8;
                        int i129 = i126 * 141;
                        int i130 = iIntValue5 * (-139);
                        int i131 = ((((~i130) & i129) | ((~i129) & i130)) - (~((i129 & i130) << 1))) - 1;
                        int i132 = ~i126;
                        int i133 = i132 ^ iIntValue5;
                        int i134 = i132 & iIntValue5;
                        int i135 = (i133 ^ i134) | (i133 & i134);
                        int i136 = ~i135;
                        int i137 = (i135 | i136) & i136;
                        int i138 = ~(i133 | i134);
                        int i139 = ((~i138) & i137) | ((~i137) & i138);
                        int i140 = i137 & i138;
                        int i141 = ((i139 & i140) | (i139 ^ i140)) * (-280);
                        int i142 = ((i131 ^ i141) | (i131 & i141)) << 1;
                        int i143 = -(((~i131) & i141) | ((~i141) & i131));
                        int i144 = (i142 & i143) + (i143 | i142);
                        int i145 = ~iIntValue5;
                        int i146 = i145 & iIntValue5;
                        int i147 = i145 | iIntValue5;
                        int i148 = (~i146) & i147;
                        int i149 = ~((i148 ^ i146) | (i146 & i148));
                        int i150 = i138 ^ i149;
                        int i151 = i138 & i149;
                        int i152 = ((i151 & i150) | (i150 ^ i151)) * 140;
                        int i153 = (((i144 ^ i152) | (i144 & i152)) << 1) - ((i152 & (~i144)) | ((~i152) & i144));
                        int i154 = ~i145;
                        int i155 = (i132 & i154) | ((~i132) & i145);
                        int i156 = i132 & i145;
                        int i157 = (i155 ^ i156) | (i155 & i156);
                        int i158 = (i157 & i145) | ((~i157) & iIntValue5);
                        int i159 = i157 & iIntValue5;
                        int i160 = ~((i158 ^ i159) | (i158 & i159));
                        int i161 = (i132 | i145) & (~i156);
                        int i162 = (i161 & i156) | (i161 ^ i156);
                        int i163 = (i162 & i145) | ((~i162) & iIntValue5);
                        int i164 = i162 & iIntValue5;
                        int i165 = ~((i164 & i163) | (i163 ^ i164));
                        int i166 = (i165 & i160) | (i160 ^ i165);
                        int i167 = i145 & i147;
                        int i168 = (i154 & i167) | ((~i167) & i145);
                        int i169 = i167 & i145;
                        int i170 = (i168 & i169) | (i168 ^ i169);
                        int i171 = ~((i170 & i126) | (i170 ^ i126));
                        int i172 = ((~i171) & i166) | ((~i166) & i171);
                        int i173 = i166 & i171;
                        int i174 = -(-(((i173 & i172) | (i172 ^ i173)) * 140));
                        int i175 = i153 & i174;
                        int i176 = (i174 ^ i153) | i175;
                        int iM5545constructorimpl = UByte.m5545constructorimpl(bArr5[((i175 | i176) << 1) - (i176 ^ i175)]) & 255;
                        int i177 = ((~iM5545constructorimpl) & i128) | ((~i128) & iM5545constructorimpl);
                        int i178 = i128 & iM5545constructorimpl;
                        i13 = (i178 & i177) | (i177 ^ i178);
                        if (i126 != bByteValue) {
                            i126 = i127;
                        }
                    }
                } else {
                    i13 = 0;
                }
                int i179 = f59718b;
                int i180 = (((i179 | 57) << 1) - (~(-(((~i179) & 57) | (i179 & (-58)))))) - 1;
                f59719c = i180 % 128;
                if (i180 % 2 == 0) {
                    int i181 = 97 / 0;
                }
                objValueOf = Integer.valueOf(i13);
                break;
            case 8:
                setFocusable setfocusable3 = (setFocusable) objArr[0];
                int i182 = f59718b;
                int i183 = (i182 ^ 17) + ((i182 & 17) << 1);
                f59719c = i183 % 128;
                int i184 = i183 % 2;
                int i185 = setfocusable3.setCompoundDrawableTintBlendMode;
                if (i184 == 0) {
                    throw null;
                }
                int i186 = i182 & 57;
                int i187 = i182 | 57;
                int i188 = ((i186 | i187) << 1) - (i187 ^ i186);
                f59719c = i188 % 128;
                int i189 = i188 % 2;
                return Integer.valueOf(i185);
            case 9:
                setFocusable setfocusable4 = (setFocusable) objArr[0];
                int iIntValue6 = ((Number) objArr[1]).intValue();
                int i190 = f59719c;
                int i191 = (i190 & 93) + (i190 | 93);
                f59718b = i191 % 128;
                int i192 = i191 % 2;
                setfocusable4.setCompoundDrawableTintBlendMode = iIntValue6;
                if (i192 == 0) {
                    return null;
                }
                throw null;
            case 10:
                setFocusable setfocusable5 = (setFocusable) objArr[0];
                byte[] bArr6 = (byte[]) objArr[1];
                int iIntValue7 = ((Number) objArr[2]).intValue();
                int i193 = f59719c;
                int i194 = (((i193 & (-68)) | ((~i193) & 67)) - (~(-(-((i193 & 67) << 1))))) - 1;
                f59718b = i194 % 128;
                int i195 = i194 % 2;
                Intrinsics.checkNotNullParameter(bArr6, "");
                setfocusable5.setCompoundDrawableTintBlendMode = ((Integer) setOnFocusChangeListener(new Object[]{bArr6, Integer.valueOf(iIntValue7)}, 2033618547, -2033618544, iIntValue7)).intValue();
                int i196 = iIntValue7 & 1;
                int i197 = (iIntValue7 ^ 1) | i196;
                int i198 = (i196 & i197) + (i196 | i197);
                int i199 = f59718b;
                int i200 = i199 & 87;
                int i201 = (i199 | 87) & (~i200);
                int i202 = -(-(i200 << 1));
                int i203 = (i201 & i202) + (i201 | i202);
                f59719c = i203 % 128;
                int i204 = i203 % 2;
                return Integer.valueOf(i198);
            default:
                setFocusable setfocusable6 = (setFocusable) objArr[0];
                ArrayList arrayList2 = new ArrayList();
                int i205 = setfocusable6.setCompoundDrawableTintBlendMode;
                arrayList2.add(new byte[]{ArraysKt___ArraysKt.last((byte[]) setInputExtras.setDividerPadding(new Object[]{Integer.valueOf(i205)}, -1690212590, 1690212600, i205))});
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it2.next();
                int i206 = f59718b + 9;
                f59719c = i206 % 128;
                int i207 = i206 % 2;
                while (it2.hasNext()) {
                    int i208 = f59718b;
                    int i209 = i208 & 113;
                    int i210 = (((i208 | 113) & (~i209)) - (~(-(-(i209 << 1))))) - 1;
                    f59719c = i210 % 128;
                    int i211 = i210 % 2;
                    next2 = ArraysKt___ArraysJvmKt.plus((byte[]) next2, (byte[]) it2.next());
                    int i212 = f59719c;
                    int i213 = i212 & 125;
                    int i214 = -(-((i212 ^ 125) | i213));
                    int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
                    f59718b = i215 % 128;
                    int i216 = i215 % 2;
                }
                objValueOf = (byte[]) next2;
                int i217 = f59719c;
                int i218 = i217 & 45;
                int i219 = (i218 - (~((i217 ^ 45) | i218))) - 1;
                f59718b = i219 % 128;
                if (i219 % 2 != 0) {
                    throw null;
                }
                break;
        }
        return objValueOf;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1668155176, 1668155184, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1803955216, -1803955212, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1699215358, 1699215363, System.identityHashCode(this));
    }

    public final int setY(@NotNull byte[] p4, int p10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, p4, Integer.valueOf(p10)}, -1501513269, 1501513279, p10)).intValue();
    }

    @JvmName(name = "setY")
    public final void setY(int i10) {
        setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, 1283315027, -1283315018, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] p4, int p10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, p4, Integer.valueOf(p10)}, -455104071, 455104077, p10)).intValue();
    }
}
