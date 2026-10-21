package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0005\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "p1", "p2", "setOnFocusChangeListener", "([B[B[B)[B"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class o5 extends Lambda implements Function3<byte[], byte[], byte[], byte[]> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57417r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57418s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ initCause f57419p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ getUiMessage f57420q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(initCause initcause, getUiMessage getuimessage) {
        super(3);
        this.f57419p0 = initcause;
        this.f57420q0 = getuimessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        Throwable th2;
        ?? r15;
        getTooFewDigitsMessage gettoofewdigitsmessage;
        Throwable th3;
        byte b10;
        getTooFewDigitsMessage gettoofewdigitsmessage2;
        int i10;
        int i11;
        char c10;
        byte b11;
        byte[] bArr;
        int length;
        int i12;
        char c11 = 0;
        o5 o5Var = (o5) objArr[0];
        int i13 = 1;
        byte[] bArr2 = (byte[]) objArr[1];
        int i14 = 2;
        byte[] bArr3 = (byte[]) objArr[2];
        byte[] bArr4 = (byte[]) objArr[3];
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        initCause.setX(o5Var.f57419p0);
        getTooFewDigitsMessage y7 = setPivotX.setY(bArr4);
        Random.INSTANCE.nextBytes(bArr4);
        initCause initcause = o5Var.f57419p0;
        initCause.setX(initcause);
        getUiMessage getuimessage = o5Var.f57420q0;
        setAnimationMatrix setanimationmatrix = new setAnimationMatrix(bArr3);
        try {
            try {
                int i15 = 1034568962;
                byte[] bArr5 = (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage}, -1034568962, 1034568962, System.identityHashCode(getuimessage));
                ArrayList arrayList = new ArrayList(bArr5.length);
                int length2 = bArr5.length;
                int i16 = f57417r0 + 7;
                f57418s0 = i16 % 128;
                int i17 = 0;
                ?? r16 = i16 % 2;
                while (i17 < length2) {
                    int i18 = f57417r0;
                    int i19 = ((i18 ^ 82) + ((i18 & 82) << 1)) - 1;
                    f57418s0 = i19 % 128;
                    if (i19 % i14 == 0) {
                        b11 = bArr5[i17];
                        Object[] objArr2 = new Object[i13];
                        objArr2[c11] = setanimationmatrix;
                        bArr = (byte[]) setLayerType.setCompoundDrawableTintBlendMode(objArr2, -1034568962, i15, System.identityHashCode(setanimationmatrix));
                        length = bArr.length;
                        i12 = i13;
                    } else {
                        b11 = bArr5[i17];
                        Object[] objArr3 = new Object[i13];
                        objArr3[0] = setanimationmatrix;
                        bArr = (byte[]) setLayerType.setCompoundDrawableTintBlendMode(objArr3, -1034568962, i15, System.identityHashCode(setanimationmatrix));
                        length = bArr.length;
                        i12 = 0;
                    }
                    while (true) {
                        if (i12 >= length) {
                            i12 = -1;
                            break;
                        }
                        int i20 = f57417r0 + 66;
                        int i21 = (i20 ^ (-1)) + (i20 << 1);
                        int i22 = i21 % 128;
                        f57418s0 = i22;
                        if (i21 % 2 == 0) {
                            byte b12 = bArr[i12];
                            throw null;
                        }
                        if (bArr[i12] == b11) {
                            int i23 = ((i22 | 111) << 1) - (i22 ^ 111);
                            f57417r0 = i23 % 128;
                            if (i23 % 2 == 0) {
                                break;
                            }
                            throw null;
                        }
                        int i24 = i22 + 77;
                        int i25 = length;
                        f57417r0 = i24 % 128;
                        int i26 = i24 % 2;
                        int i27 = i12 & 1;
                        int i28 = (~i27) & (i12 | 1);
                        int i29 = -(-(i27 << 1));
                        i12 = (i28 ^ i29) + ((i29 & i28) << 1);
                        length = i25;
                    }
                    arrayList.add(Integer.valueOf(i12));
                    int i30 = i17 & 1;
                    int i31 = -(-((i17 ^ 1) | i30));
                    i17 = (i30 & i31) + (i30 | i31);
                    c11 = 0;
                    i13 = 1;
                    i14 = 2;
                    i15 = 1034568962;
                    r16 = i12;
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i32 = f57417r0;
                    int i33 = i32 ^ 75;
                    int i34 = ((i32 & 75) | i33) << 1;
                    int i35 = -i33;
                    int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                    f57418s0 = i36 % 128;
                    arrayList2.add(i36 % 2 == 0 ? Byte.valueOf((byte) Integer.toHexString(((Number) it.next()).intValue()).charAt(0)) : Byte.valueOf((byte) Integer.toHexString(((Number) it.next()).intValue()).charAt(0)));
                    int i37 = f57418s0;
                    int i38 = ((i37 | 18) << 1) - (i37 ^ 18);
                    int i39 = (i38 ^ (-1)) + (i38 << 1);
                    f57417r0 = i39 % 128;
                    int i40 = i39 % 2;
                }
                getUiMessage getuimessage2 = new getUiMessage(CollectionsKt___CollectionsKt.toByteArray(arrayList2));
                CloseableKt.closeFinally(setanimationmatrix, null);
                System.identityHashCode(o5Var);
                System.identityHashCode(o5Var);
                CloseableKt.closeFinally(getuimessage, null);
                try {
                    setPivotX x4 = initCause.setX(initcause);
                    setTextIsSelectable settextisselectable = new setTextIsSelectable(bArr2);
                    try {
                        try {
                            byte length3 = (byte) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage2}, -1034568962, 1034568962, System.identityHashCode(getuimessage2))).length;
                            byte[] bArr6 = new byte[16];
                            bArr6[0] = 64;
                            byte b13 = (byte) (length3 & 15);
                            int i41 = ((~b13) & 64) | (b13 & ByteSourceJsonBootstrapper.UTF8_BOM_3);
                            int i42 = 64 & b13;
                            bArr6[0] = (byte) ((i42 & i41) | (i41 ^ i42));
                            if (length3 < 4) {
                                System.identityHashCode(o5Var);
                                System.identityHashCode(o5Var);
                                b10 = 4;
                            } else {
                                b10 = length3;
                            }
                            int i43 = -2;
                            if (length3 > 0) {
                                int i44 = 0;
                                while (true) {
                                    int i45 = (i44 & 73) | ((~i44) & (-74));
                                    int i46 = -(-((i44 & (-74)) << 1));
                                    int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
                                    int i48 = i47 & 75;
                                    int i49 = i48 + ((i47 ^ 75) | i48);
                                    int i50 = i44 >> 1;
                                    try {
                                        int iIdentityHashCode = System.identityHashCode(o5Var);
                                        int i51 = i50 * (-1965);
                                        int i52 = ((i51 & 985) + (i51 | 985)) - 1;
                                        int i53 = ~i50;
                                        int i54 = (i50 & 1) | (i43 & i53);
                                        int i55 = i50 & i43;
                                        int i56 = ((i54 ^ i55) | (i54 & i55)) * 983;
                                        int i57 = i52 & i56;
                                        int i58 = i57 + ((i56 ^ i52) | i57);
                                        int i59 = ~iIdentityHashCode;
                                        int i60 = i43 & i59;
                                        gettoofewdigitsmessage2 = y7;
                                        int i61 = (~i60) & (i43 | i59);
                                        int i62 = ~((i61 ^ i60) | (i61 & i60));
                                        int i63 = i53 & i62;
                                        int i64 = (((i62 | i53) & (~i63)) | i63) * (-983);
                                        int i65 = i58 & i64;
                                        int i66 = (i64 ^ i58) | i65;
                                        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                                        int i68 = (iIdentityHashCode | i59) & i59;
                                        int i69 = i53 & i68;
                                        int i70 = (i68 | i53) & (~i69);
                                        int i71 = (i70 & i69) | (i70 ^ i69);
                                        int i72 = ~i71;
                                        int i73 = (i71 | i72) & i72;
                                        int i74 = i53 ^ 1;
                                        int i75 = i53 & 1;
                                        int i76 = ~((i74 & i75) | (i74 ^ i75));
                                        int i77 = i73 & i76;
                                        int i78 = (i73 | i76) & (~i77);
                                        int i79 = -(-(((i78 & i77) | (i78 ^ i77)) * 983));
                                        int i80 = (i67 ^ i79) + ((i79 & i67) << 1);
                                        try {
                                            char c12 = (char) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage2}, -1034568962, 1034568962, System.identityHashCode(getuimessage2)))[i44];
                                            if (c12 == '0') {
                                                int i81 = f57417r0;
                                                int i82 = (i81 ^ 36) + ((i81 & 36) << 1);
                                                int i83 = (i82 ^ (-1)) + (i82 << 1);
                                                int i84 = i83 % 128;
                                                f57418s0 = i84;
                                                int i85 = i83 % 2;
                                                int i86 = i84 & 11;
                                                int i87 = ((i84 ^ 11) | i86) << 1;
                                                int i88 = -((i84 | 11) & (~i86));
                                                int i89 = (i87 & i88) + (i87 | i88);
                                                f57417r0 = i89 % 128;
                                                int i90 = i89 % 2;
                                                c10 = 0;
                                                i11 = i63;
                                            } else if (c12 == '1') {
                                                int i91 = (-2) - ((f57417r0 + 22) ^ (-1));
                                                f57418s0 = i91 % 128;
                                                int i92 = i91 % 2;
                                                c10 = 1;
                                                i11 = i63;
                                            } else if (c12 == '2') {
                                                int i93 = f57417r0;
                                                int i94 = ((i93 & (-104)) | ((~i93) & 103)) + ((i93 & 103) << 1);
                                                f57418s0 = i94 % 128;
                                                int i95 = i94 % 2;
                                                c10 = 2;
                                                i11 = i63;
                                            } else if (c12 == '3') {
                                                int i96 = f57418s0;
                                                int i97 = (i96 & 59) + (i96 | 59);
                                                f57417r0 = i97 % 128;
                                                if (i97 % 2 != 0) {
                                                    c10 = 4;
                                                    i11 = i63;
                                                } else {
                                                    c10 = 3;
                                                    i11 = i63;
                                                }
                                            } else if (c12 == '4') {
                                                int i98 = f57418s0;
                                                int i99 = i98 & 73;
                                                int i100 = (i98 | 73) & (~i99);
                                                int i101 = -(-(i99 << 1));
                                                int i102 = ((i100 | i101) << 1) - (i100 ^ i101);
                                                f57417r0 = i102 % 128;
                                                int i103 = i102 % 2;
                                                c10 = 4;
                                                i11 = i63;
                                            } else if (c12 == '5') {
                                                int i104 = f57418s0;
                                                int i105 = (-2) - (((i104 ^ 102) + ((i104 & 102) << 1)) ^ (-1));
                                                f57417r0 = i105 % 128;
                                                int i106 = i105 % 2;
                                                int i107 = i104 + 125;
                                                f57417r0 = i107 % 128;
                                                int i108 = i107 % 2;
                                                c10 = 5;
                                                i11 = i63;
                                            } else if (c12 == '6') {
                                                int i109 = f57417r0;
                                                int i110 = i109 ^ 67;
                                                int i111 = (((i109 & 67) | i110) << 1) - i110;
                                                f57418s0 = i111 % 128;
                                                int i112 = i111 % 2;
                                                c10 = 6;
                                                i11 = i63;
                                            } else if (c12 == '7') {
                                                int i113 = f57417r0;
                                                int i114 = ((i113 & 13) - (~(-(-(i113 | 13))))) - 1;
                                                f57418s0 = i114 % 128;
                                                int i115 = i114 % 2;
                                                c10 = 7;
                                                i11 = i63;
                                            } else if (c12 == '8') {
                                                int i116 = f57418s0;
                                                int i117 = ((i116 | 29) << 1) - (i116 ^ 29);
                                                f57417r0 = i117 % 128;
                                                if (i117 % 2 != 0) {
                                                    c10 = AbstractJsonLexerKt.COLON;
                                                    i11 = i63;
                                                } else {
                                                    c10 = '\b';
                                                    i11 = i63;
                                                }
                                            } else if (c12 == '9') {
                                                int i118 = f57418s0;
                                                int i119 = (i118 & 43) + (i118 | 43);
                                                f57417r0 = i119 % 128;
                                                if (i119 % 2 != 0) {
                                                    c10 = 21;
                                                    i11 = i63;
                                                } else {
                                                    c10 = '\t';
                                                    i11 = i63;
                                                }
                                            } else if (c12 == 'a') {
                                                int i120 = f57417r0;
                                                int i121 = i120 & 21;
                                                int i122 = -(-(i120 | 21));
                                                int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                                                f57418s0 = i123 % 128;
                                                if (i123 % 2 == 0) {
                                                    c10 = 'p';
                                                    i11 = i63;
                                                } else {
                                                    c10 = '\n';
                                                    i11 = i63;
                                                }
                                            } else if (c12 == 'A') {
                                                System.identityHashCode(o5Var);
                                                System.identityHashCode(o5Var);
                                                int i124 = f57418s0 + 37;
                                                f57417r0 = i124 % 128;
                                                int i125 = i124 % 2;
                                                c10 = '\n';
                                                i11 = i63;
                                            } else {
                                                char c13 = 11;
                                                i11 = 12;
                                                i11 = 12;
                                                i11 = 12;
                                                c = '\f';
                                                char c14 = '\f';
                                                i11 = 12;
                                                i11 = 12;
                                                i11 = 12;
                                                i11 = 12;
                                                i11 = 12;
                                                if (c12 == 'b') {
                                                    int i126 = f57417r0;
                                                    int i127 = ((i126 & 116) + (i126 | 116)) - 1;
                                                    f57418s0 = i127 % 128;
                                                    char c15 = i127 % 2 != 0 ? (char) 11 : '\f';
                                                    System.identityHashCode(o5Var);
                                                    System.identityHashCode(o5Var);
                                                    c14 = c15;
                                                } else if (c12 == 'B') {
                                                    int i128 = f57418s0;
                                                    int i129 = (i128 & 31) + (i128 | 31);
                                                    f57417r0 = i129 % 128;
                                                    c10 = i129 % 2 != 0 ? (char) 16 : c13;
                                                } else if (c12 == 'c') {
                                                    int i130 = f57418s0;
                                                    int i131 = i130 & 11;
                                                    int i132 = -(-((i130 ^ 11) | i131));
                                                    int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
                                                    f57417r0 = i133 % 128;
                                                    int i134 = i133 % 2;
                                                } else {
                                                    c13 = 'E';
                                                    if (c12 == 'C') {
                                                        int i135 = f57418s0;
                                                        int i136 = i135 & 123;
                                                        int i137 = (i135 ^ 123) | i136;
                                                        int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                                                        f57417r0 = i138 % 128;
                                                        if (i138 % 2 != 0) {
                                                        }
                                                    } else {
                                                        if (c12 == 'd') {
                                                            int i139 = f57418s0;
                                                            int i140 = (-2) - (((i139 & 48) + (i139 | 48)) ^ (-1));
                                                            f57417r0 = i140 % 128;
                                                            int i141 = i140 % 2;
                                                        } else if (c12 == 'D') {
                                                            int i142 = f57417r0;
                                                            int i143 = i142 ^ 23;
                                                            int i144 = (((i142 & 23) | i143) << 1) - i143;
                                                            int i145 = i144 % 128;
                                                            f57418s0 = i145;
                                                            int i146 = i144 % 2;
                                                            int i147 = ((i145 ^ 55) - (~((i145 & 55) << 1))) - 1;
                                                            f57417r0 = i147 % 128;
                                                            int i148 = i147 % 2;
                                                        } else if (c12 == 'e') {
                                                            int i149 = f57418s0;
                                                            int i150 = i149 & 121;
                                                            int i151 = (i150 - (~((i149 ^ 121) | i150))) - 1;
                                                            f57417r0 = i151 % 128;
                                                            c10 = i151 % 2 != 0 ? '-' : (char) 14;
                                                        } else if (c12 == 'E') {
                                                            int i152 = f57417r0;
                                                            int i153 = i152 & 69;
                                                            int i154 = (i152 ^ 69) | i153;
                                                            int i155 = (i153 ^ i154) + ((i153 & i154) << 1);
                                                            f57418s0 = i155 % 128;
                                                            c13 = i155 % 2 == 0 ? (char) 17 : (char) 14;
                                                            int i156 = i152 + 111;
                                                            f57418s0 = i156 % 128;
                                                            int i157 = i156 % 2;
                                                        } else if (c12 == 'f') {
                                                            int i158 = f57418s0;
                                                            int i159 = ((i158 | 7) << 1) - (i158 ^ 7);
                                                            f57417r0 = i159 % 128;
                                                            c10 = i159 % 2 != 0 ? 'w' : (char) 15;
                                                        } else {
                                                            if (c12 != 'F') {
                                                                throw new IllegalArgumentException(String.valueOf(c12));
                                                            }
                                                            int i160 = f57418s0;
                                                            int i161 = ((((i160 ^ 71) | (i160 & 71)) << 1) - (~(-(((~i160) & 71) | (i160 & (-72)))))) - 1;
                                                            int i162 = i161 % 128;
                                                            f57417r0 = i162;
                                                            char c16 = i161 % 2 != 0 ? '.' : (char) 15;
                                                            int i163 = i162 & 105;
                                                            int i164 = -(-((i162 ^ 105) | i163));
                                                            int i165 = ((i163 | i164) << 1) - (i164 ^ i163);
                                                            f57418s0 = i165 % 128;
                                                            int i166 = i165 % 2;
                                                            c10 = c16;
                                                        }
                                                        c10 = '\r';
                                                    }
                                                }
                                                c10 = c14;
                                                i11 = c14;
                                            }
                                            if (i44 % 2 == 0) {
                                                int i167 = f57417r0;
                                                int i168 = ((i167 & 76) + (i167 | 76)) - 1;
                                                f57418s0 = i168 % 128;
                                                int i169 = i168 % 2;
                                                byte b14 = bArr6[i80];
                                                byte b15 = (byte) ((c10 << 4) & 240);
                                                int i170 = b14 ^ b15;
                                                int i171 = b15 & b14;
                                                bArr6[i80] = (byte) ((i171 & i170) | (i170 ^ i171));
                                                int i172 = i167 + 79;
                                                f57418s0 = i172 % 128;
                                                int i173 = i172 % 2;
                                            } else {
                                                byte b16 = bArr6[i80];
                                                byte b17 = (byte) (c10 & 15);
                                                int i174 = ((~b17) & b16) | ((~b16) & b17);
                                                int i175 = b17 & b16;
                                                bArr6[i80] = (byte) ((i175 & i174) | (i174 ^ i175));
                                            }
                                            if (i49 >= length3) {
                                                r16 = i11;
                                                break;
                                            }
                                            i44 = i49;
                                            y7 = gettoofewdigitsmessage2;
                                            i43 = -2;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                            r16 = gettoofewdigitsmessage2;
                                            try {
                                                throw th3;
                                            } catch (Throwable th5) {
                                                CloseableKt.closeFinally(getuimessage2, th3);
                                                throw th5;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                        r16 = y7;
                                    }
                                }
                            } else {
                                gettoofewdigitsmessage2 = y7;
                                r16 = r16;
                            }
                            try {
                                getuimessage2.close();
                                int iIdentityHashCode2 = System.identityHashCode(o5Var);
                                int i176 = -(-(b10 * GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG));
                                int i177 = (((-258) | i176) << 1) - (i176 ^ (-258));
                                int i178 = ~b10;
                                int i179 = (i178 | b10) & i178;
                                int i180 = ~iIdentityHashCode2;
                                int i181 = (i180 | iIdentityHashCode2) & i180;
                                int i182 = i179 & i181;
                                int i183 = (i179 | i181) & (~i182);
                                int i184 = (i183 & i182) | (i183 ^ i182);
                                int i185 = (i184 & 2) | (i184 ^ 2);
                                int i186 = ~i185;
                                int i187 = -(-(((i185 | i186) & i186) * 130));
                                int i188 = (i177 ^ i187) + ((i187 & i177) << 1);
                                int i189 = i178 & 2;
                                int i190 = -(-((~((i178 ^ 2) | i189)) * (-260)));
                                int i191 = i188 & i190;
                                int i192 = (i190 ^ i188) | i191;
                                int i193 = (i191 & i192) + (i192 | i191);
                                int i194 = (-3) & i178;
                                int i195 = (b10 & 2) | i194;
                                int i196 = (-3) & b10;
                                int i197 = (i196 & i195) | (i195 ^ i196);
                                int i198 = ~i197;
                                int i199 = (i197 | i198) & i198;
                                int i200 = ((~i178) & 2) | i194;
                                int i201 = (i200 & i189) | (i200 ^ i189);
                                int i202 = (i201 & i180) | ((~i201) & iIdentityHashCode2);
                                int i203 = iIdentityHashCode2 & i201;
                                int i204 = ~((i203 & i202) | (i202 ^ i203));
                                int i205 = ((i204 & i199) | (i199 ^ i204)) * 130;
                                int i206 = i193 & i205;
                                int i207 = (i205 | i193) & (~i206);
                                int i208 = 1;
                                int i209 = -(-(i206 << 1));
                                int i210 = (i207 ^ i209) + ((i207 & i209) << 1);
                                if (i210 < 16) {
                                    while (true) {
                                        int i211 = (((i210 | 2) << i208) - (i210 ^ 2)) - i208;
                                        int i212 = i210 >> 1;
                                        if (i210 % 2 == 0) {
                                            int iIdentityHashCode3 = System.identityHashCode(o5Var);
                                            int i213 = ~iIdentityHashCode3;
                                            int i214 = 328761531 & i213;
                                            int i215 = (328761531 | i213) & (~i214);
                                            int i216 = ~((i215 & i214) | (i215 ^ i214));
                                            int i217 = (((i216 & 1884383776) | (1884383776 ^ i216)) * (-602)) + 1910315928;
                                            int i218 = i214 | ((-328761532) & iIdentityHashCode3);
                                            int i219 = 328761531 & iIdentityHashCode3;
                                            int i220 = ~((i218 & i219) | (i218 ^ i219));
                                            int i221 = 1614899712 & i220;
                                            int i222 = (i220 | 1614899712) & (~i221);
                                            int i223 = (i222 & i221) | (i222 ^ i221);
                                            int i224 = (iIdentityHashCode3 | i213) & i213;
                                            int i225 = i224 & (-328761532);
                                            int i226 = ((-328761532) | i224) & (~i225);
                                            int i227 = (i226 & i225) | (i226 ^ i225);
                                            int i228 = ~((i227 & 1884383776) | (i227 ^ 1884383776));
                                            int i229 = -(-(((i228 & i223) | (i223 ^ i228)) * (-301)));
                                            int i230 = ((~i229) & i217) | ((~i217) & i229);
                                            int i231 = -(-((i229 & i217) << 1));
                                            int i232 = ((i230 | i231) << 1) - (i231 ^ i230);
                                            int i233 = i224 & 1884383776;
                                            int i234 = -(~(-(-((~(((i224 | 1884383776) & (~i233)) | i233)) * 301))));
                                            int i235 = (((i232 | i234) << 1) - (i234 ^ i232)) - 1;
                                            System.identityHashCode(o5Var);
                                            if (i235 <= -1903453512) {
                                                byte b18 = bArr6[i212];
                                                int i236 = b18 & 79;
                                                int i237 = (b18 | 79) & (~i236);
                                                bArr6[i212] = (byte) ((i237 & i236) | (i237 ^ i236));
                                            } else {
                                                byte b19 = bArr6[i212];
                                                int i238 = b19 & (-96);
                                                int i239 = (b19 | (-96)) & (~i238);
                                                bArr6[i212] = (byte) ((i239 & i238) | (i239 ^ i238));
                                            }
                                            int i240 = f57418s0;
                                            int i241 = i240 ^ 121;
                                            int i242 = -(-((i240 & 121) << 1));
                                            int i243 = ((i241 | i242) << 1) - (i242 ^ i241);
                                            f57417r0 = i243 % 128;
                                            int i244 = i243 % 2;
                                            i10 = 16;
                                        } else {
                                            byte b20 = bArr6[i212];
                                            bArr6[i212] = (byte) ((b20 & 10) | (b20 ^ 10));
                                            i10 = 16;
                                        }
                                        if (i211 >= i10) {
                                            break;
                                        }
                                        i210 = i211;
                                        i208 = 1;
                                    }
                                }
                                int i245 = 8;
                                byte[] x6 = setPivotX.setY(x4).setX(8);
                                int i246 = f57418s0;
                                int i247 = ((i246 & (-90)) | ((~i246) & 89)) + ((i246 & 89) << 1);
                                f57417r0 = i247 % 128;
                                int i248 = i247 % 2;
                                do {
                                    int i249 = i245;
                                    int i250 = i249 ^ (-52);
                                    int i251 = ((i249 & (-52)) | i250) << 1;
                                    int i252 = -i250;
                                    i245 = (i251 ^ i252) + ((i252 & i251) << 1) + 53;
                                    int iIdentityHashCode4 = System.identityHashCode(o5Var);
                                    int i253 = -(~(-(-(i249 * (-494)))));
                                    int i254 = ((((3952 & i253) + (i253 | 3952)) - 1) - (~(-(~(-(-((~(((-8) ^ i249) | ((-8) & i249))) * (-495)))))))) - 2;
                                    int i255 = ~iIdentityHashCode4;
                                    int i256 = (iIdentityHashCode4 | i255) & i255;
                                    int i257 = (((-8) | i256) * 495) + i254;
                                    int i258 = ~i249;
                                    int i259 = 7 & i258;
                                    int i260 = (i258 | 7) & (~i259);
                                    int i261 = (i260 & i259) | (i260 ^ i259);
                                    int i262 = ~i261;
                                    int i263 = (i261 | i262) & i262;
                                    int i264 = i256 ^ (-8);
                                    int i265 = i256 & (-8);
                                    int i266 = ~((i265 & i264) | (i264 ^ i265));
                                    bArr6[i249] = x6[(-2) - ((i257 - (~(-(-(((i266 & i263) | (i263 ^ i266)) * 495))))) ^ (-1))];
                                } while (i245 <= 15);
                                getUiMessage getuimessage3 = new getUiMessage(bArr6);
                                try {
                                    CloseableKt.closeFinally(getuimessage2, null);
                                    int i267 = f57418s0;
                                    int i268 = i267 & 67;
                                    int i269 = (i267 | 67) & (~i268);
                                    int i270 = i268 << 1;
                                    int i271 = (i269 & i270) + (i269 | i270);
                                    f57417r0 = i271 % 128;
                                    int i272 = i271 % 2;
                                    try {
                                        byte[] compoundDrawableTintBlendMode = setPivotX.setCompoundDrawableTintBlendMode(x4).setCompoundDrawableTintBlendMode(settextisselectable.setY(), (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getuimessage3}, -1034568962, 1034568962, System.identityHashCode(getuimessage3)));
                                        CloseableKt.closeFinally(getuimessage3, null);
                                        int i273 = f57418s0;
                                        int i274 = i273 ^ 33;
                                        int i275 = (((i273 & 33) | i274) << 1) - i274;
                                        f57417r0 = i275 % 128;
                                        int i276 = i275 % 2;
                                        int length4 = compoundDrawableTintBlendMode.length;
                                        int iIdentityHashCode5 = System.identityHashCode(o5Var);
                                        int i277 = -(~(-(-(length4 * 421))));
                                        int i278 = ((419 ^ i277) + ((i277 & 419) << 1)) - 1;
                                        int i279 = ~iIdentityHashCode5;
                                        int i280 = length4 & i279;
                                        int i281 = ~length4;
                                        int i282 = -(-((~((iIdentityHashCode5 & length4) | (iIdentityHashCode5 & i281) | i280)) * TypedValues.CycleType.TYPE_EASING));
                                        int i283 = i278 & i282;
                                        int i284 = (((i282 | i278) & (~i283)) - (~(-(-(i283 << 1))))) - 1;
                                        int i285 = length4 * (-420);
                                        int i286 = i284 & i285;
                                        int i287 = i286 + ((i284 ^ i285) | i286);
                                        int i288 = ~i281;
                                        int i289 = (length4 | i279) & (~i280);
                                        int i290 = (i289 & i280) | (i289 ^ i280);
                                        int i291 = ~i290;
                                        int i292 = (i290 | i291) & i291;
                                        int i293 = i288 ^ i292;
                                        int i294 = i292 & i288;
                                        int i295 = ((i294 & i293) | (i293 ^ i294)) * TypedValues.CycleType.TYPE_EASING;
                                        int i296 = i287 & i295;
                                        int i297 = ((i287 ^ i295) | i296) << 1;
                                        int i298 = -((i295 | i287) & (~i296));
                                        int i299 = ((i297 | i298) << 1) - (i298 ^ i297);
                                        try {
                                            if (i299 >= 0) {
                                                int i300 = 0;
                                                while (true) {
                                                    int i301 = i300 & (-19);
                                                    int i302 = i301 + ((i300 ^ (-19)) | i301);
                                                    int i303 = i302 & 20;
                                                    int i304 = -(-((i302 ^ 20) | i303));
                                                    int i305 = ((i303 | i304) << 1) - (i304 ^ i303);
                                                    try {
                                                        byte b21 = compoundDrawableTintBlendMode[i300];
                                                        byte b22 = ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{gettoofewdigitsmessage2}, -1034568962, 1034568962, System.identityHashCode(gettoofewdigitsmessage2)))[i300];
                                                        compoundDrawableTintBlendMode[i300] = (byte) (((~b21) & b22) | ((~b22) & b21));
                                                        if (i305 > i299) {
                                                            break;
                                                        }
                                                        i300 = i305;
                                                    } catch (Throwable th7) {
                                                        th2 = th7;
                                                        r15 = gettoofewdigitsmessage2;
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th8) {
                                                            CloseableKt.closeFinally(r15, th2);
                                                            throw th8;
                                                        }
                                                    }
                                                }
                                                byte[] compoundDrawableTintBlendMode2 = setPivotX.setCompoundDrawableTintBlendMode(x4).setCompoundDrawableTintBlendMode(settextisselectable.setY(), compoundDrawableTintBlendMode);
                                                byte[] y10 = settextisselectable.setY();
                                                Random.Companion companion = Random.INSTANCE;
                                                companion.nextBytes(y10);
                                                companion.nextBytes(compoundDrawableTintBlendMode);
                                                System.identityHashCode(o5Var);
                                                System.identityHashCode(o5Var);
                                                setStackFromBottom setstackfrombottom = new setStackFromBottom(compoundDrawableTintBlendMode2);
                                                byte[] bArr7 = (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom));
                                                CloseableKt.closeFinally(gettoofewdigitsmessage2, null);
                                                int i306 = f57417r0;
                                                int i307 = i306 & 63;
                                                int i308 = (i306 ^ 63) | i307;
                                                int i309 = (i307 ^ i308) + ((i308 & i307) << 1);
                                                f57418s0 = i309 % 128;
                                                int i310 = i309 % 2;
                                                return bArr7;
                                            }
                                            byte[] compoundDrawableTintBlendMode3 = setPivotX.setCompoundDrawableTintBlendMode(x4).setCompoundDrawableTintBlendMode(settextisselectable.setY(), compoundDrawableTintBlendMode);
                                            byte[] y11 = settextisselectable.setY();
                                            Random.Companion companion2 = Random.INSTANCE;
                                            companion2.nextBytes(y11);
                                            companion2.nextBytes(compoundDrawableTintBlendMode);
                                            System.identityHashCode(o5Var);
                                            System.identityHashCode(o5Var);
                                            setStackFromBottom setstackfrombottom2 = new setStackFromBottom(compoundDrawableTintBlendMode3);
                                            byte[] bArr8 = (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setstackfrombottom2}, -1034568962, 1034568962, System.identityHashCode(setstackfrombottom2));
                                            CloseableKt.closeFinally(gettoofewdigitsmessage2, null);
                                            int i3010 = f57417r0;
                                            int i3011 = i3010 & 63;
                                            int i3012 = (i3010 ^ 63) | i3011;
                                            int i3013 = (i3011 ^ i3012) + ((i3012 & i3011) << 1);
                                            f57418s0 = i3013 % 128;
                                            int i311 = i3013 % 2;
                                            return bArr8;
                                        } catch (Throwable th9) {
                                            byte[] y12 = settextisselectable.setY();
                                            Random.Companion companion3 = Random.INSTANCE;
                                            companion3.nextBytes(y12);
                                            companion3.nextBytes(compoundDrawableTintBlendMode);
                                            throw th9;
                                        }
                                    } catch (Throwable th10) {
                                        r16 = gettoofewdigitsmessage2;
                                        try {
                                            throw th10;
                                        } catch (Throwable th11) {
                                            CloseableKt.closeFinally(getuimessage3, th10);
                                            throw th11;
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r16 = gettoofewdigitsmessage2;
                                    th2 = th;
                                    r15 = r16;
                                    throw th2;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                gettoofewdigitsmessage = gettoofewdigitsmessage2;
                                th3 = th;
                                r16 = gettoofewdigitsmessage;
                                throw th3;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            th2 = th;
                            r15 = r16;
                            throw th2;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        gettoofewdigitsmessage = y7;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    r16 = y7;
                }
            } catch (Throwable th17) {
                try {
                    throw th17;
                } catch (Throwable th18) {
                    CloseableKt.closeFinally(setanimationmatrix, th17);
                    throw th18;
                }
            }
        } catch (Throwable th19) {
            try {
                throw th19;
            } catch (Throwable th20) {
                CloseableKt.closeFinally(getuimessage, th19);
                throw th20;
            }
        }
    }

    public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        if ((((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i13 | i11 | i12)) * (-604)) + (((~((~i12) | i13 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303) == 1) {
            return a(objArr);
        }
        o5 o5Var = (o5) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        Object obj3 = objArr[3];
        int i14 = f57417r0;
        int i15 = i14 & 49;
        int i16 = (i14 ^ 49) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f57418s0 = i17 % 128;
        int i18 = i17 % 2;
        byte[] bArr = (byte[]) b(new Object[]{o5Var, (byte[]) obj, (byte[]) obj2, (byte[]) obj3}, 1504573936, -1504573935, System.identityHashCode(o5Var));
        int i19 = f57418s0;
        int i20 = i19 ^ 109;
        int i21 = (i19 & 109) << 1;
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        f57417r0 = i22 % 128;
        if (i22 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [byte[], java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ byte[] invoke(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return b(new Object[]{this, bArr, bArr2, bArr3}, 1065902474, -1065902474, System.identityHashCode(this));
    }
}
