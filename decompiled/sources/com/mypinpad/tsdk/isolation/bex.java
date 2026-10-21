package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes10.dex */
public final class bex implements bey {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54666d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54667e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f54668a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, Constants.CVR_B1b85_0101_MOBILE_APP, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102, 103, 104, 105, GenerateAcResponseApdu.DDA_HEADER, 107, 108, 109, 110, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 113, 114, 115, 116, 117, 118, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f54669b = Base64.padSymbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f54670c = new byte[128];

    public bex() {
        setX(new Object[]{this}, 1706152333, -1706152326, System.identityHashCode(this));
    }

    public static /* synthetic */ Integer a(Object[] objArr) throws IOException {
        int i10 = 0;
        bex bexVar = (bex) objArr[0];
        int i11 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int i12 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        char c10 = 3;
        int iIntValue2 = ((Number) objArr[3]).intValue();
        char c11 = 4;
        OutputStream outputStream = (OutputStream) objArr[4];
        int i13 = f54666d;
        int i14 = i13 + 9;
        f54667e = i14 % 128;
        int i15 = i14 % 2;
        if (iIntValue2 < 0) {
            int i16 = (((i13 | 124) << 1) - (i13 ^ 124)) - 1;
            int i17 = i16 % 128;
            f54667e = i17;
            int i18 = i16 % 2;
            int i19 = i17 + 97;
            f54666d = i19 % 128;
            int i20 = i19 % 2;
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i21 = i13 & 107;
        int i22 = (i13 ^ 107) | i21;
        int i23 = (i21 & i22) + (i22 | i21);
        f54667e = i23 % 128;
        int i24 = i23 % 2;
        int i25 = iIntValue;
        int i26 = iIntValue2;
        while (i26 > 0) {
            int i27 = f54666d + 21;
            f54667e = i27 % 128;
            int i28 = i27 % i12;
            int iMin = Math.min(54, i26);
            Object[] objArr2 = new Object[5];
            objArr2[i10] = bexVar;
            objArr2[i11] = bArr;
            objArr2[i12] = Integer.valueOf(i25);
            objArr2[c10] = Integer.valueOf(iMin);
            objArr2[c11] = bArr2;
            outputStream.write(bArr2, i10, ((Integer) setX(objArr2, 1165786174, -1165786170, i25)).intValue());
            int i29 = iMin * (-661);
            int i30 = -(~(i25 * (-661)));
            int i31 = ((i29 ^ i30) + ((i29 & i30) << i11)) - i11;
            int i32 = ~iIntValue;
            int i33 = ~iMin;
            int i34 = i33 & (i33 | iMin);
            int i35 = ~i25;
            int i36 = i35 & (i35 | i25);
            int i37 = i34 ^ i36;
            int i38 = i34 & i36;
            int i39 = ~((i37 ^ i38) | (i37 & i38));
            int i40 = i32 ^ i39;
            int i41 = i39 & i32;
            int i42 = ((i40 ^ i41) | (i40 & i41)) * 1324;
            int i43 = ((((~i31) & i42) | ((~i42) & i31)) - (~((i31 & i42) << 1))) - 1;
            int i44 = (iMin & i32) | (iIntValue & i33);
            int i45 = iMin & iIntValue;
            int i46 = ~((i44 & i45) | (i44 ^ i45));
            int i47 = (i25 ^ iIntValue) | (i25 & iIntValue);
            int i48 = ~i47;
            int i49 = (i47 | i48) & i48;
            int i50 = i46 ^ i49;
            int i51 = i46 & i49;
            int i52 = -(-(((i51 & i50) | (i50 ^ i51)) * (-1324)));
            int i53 = i43 & i52;
            int i54 = ((i43 ^ i52) | i53) << 1;
            int i55 = -((i43 | i52) & (~i53));
            int i56 = (i54 & i55) + (i55 | i54);
            int i57 = (i33 ^ i25) | (i33 & i25);
            int i58 = ~i57;
            int i59 = (i57 | i58) & i58;
            int i60 = i35 & iMin;
            int i61 = (i35 | iMin) & (~i60);
            int i62 = ~((i61 & i60) | (i61 ^ i60));
            int i63 = ((~i62) & i59) | ((~i59) & i62);
            int i64 = i62 & i59;
            int i65 = ((i64 & i63) | (i63 ^ i64)) * 662;
            int i66 = ((i56 ^ i65) | (i56 & i65)) << 1;
            int i67 = -((i65 & (~i56)) | ((~i65) & i56));
            i25 = (i66 & i67) + (i67 | i66);
            int i68 = -iMin;
            int i69 = i26 & i68;
            int i70 = (i68 ^ i26) | i69;
            i26 = ((i69 | i70) << 1) - (i70 ^ i69);
            int i71 = f54667e;
            int i72 = (((i71 ^ 103) | (i71 & 103)) << 1) - (((~i71) & 103) | (i71 & (-104)));
            f54666d = i72 % 128;
            int i73 = i72 % 2;
            i10 = 0;
            i11 = 1;
            i12 = 2;
            c10 = 3;
            c11 = 4;
        }
        int i74 = 1133 - (~(-(-(iIntValue2 * (-565)))));
        int i75 = (-3) & iIntValue2;
        int i76 = (~i75) & ((-3) | iIntValue2);
        int i77 = (i75 & i76) | (i76 ^ i75);
        int i78 = ~i77;
        int i79 = (i77 | i78) & i78;
        int i80 = ((~iIntValue) & (-3)) | (iIntValue & 2);
        int i81 = (-3) & iIntValue;
        int i82 = ~((i80 & i81) | (i80 ^ i81));
        int i83 = i79 & i82;
        int i84 = (i79 | i82) & (~i83);
        int i85 = ((i84 & i83) | (i84 ^ i83)) * (-566);
        int i86 = i74 & i85;
        int i87 = (((i74 | i85) & (~i86)) - (~(-(-(i86 << 1))))) - 1;
        int i88 = ~iIntValue2;
        int i89 = -(~((~((i88 ^ 2) | (i88 & 2))) * 566));
        int i90 = ((i87 ^ i89) + ((i87 & i89) << 1)) - 1;
        int i91 = (i88 | iIntValue2) & i88;
        int i92 = (-3) ^ i91;
        int i93 = i91 & (-3);
        int i94 = (i93 & i92) | (i92 ^ i93);
        int i95 = i94 ^ iIntValue;
        int i96 = i94 & iIntValue;
        int i97 = (i96 & i95) | (i95 ^ i96);
        int i98 = ~i97;
        int i99 = -(-(((i97 | i98) & i98) * 566));
        int i100 = i90 ^ i99;
        int i101 = (i99 & i90) << 1;
        int i102 = (((i100 ^ i101) + ((i101 & i100) << 1)) / 3) << 2;
        int i103 = f54667e;
        int i104 = (i103 ^ 85) + ((i103 & 85) << 1);
        f54666d = i104 % 128;
        if (i104 % 2 == 0) {
            return Integer.valueOf(i102);
        }
        int i105 = 24 / 0;
        return Integer.valueOf(i102);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0172 A[PHI: r7
      0x0172: PHI (r7v29 java.io.OutputStream) = (r7v26 java.io.OutputStream), (r7v32 java.io.OutputStream) binds: [B:30:0x0170, B:27:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Integer b(Object[] objArr) throws IOException {
        byte[] bArr;
        char c10;
        char c11;
        int i10;
        OutputStream outputStream;
        char c12 = 0;
        bex bexVar = (bex) objArr[0];
        int i11 = 1;
        String str = (String) objArr[1];
        int i12 = 2;
        OutputStream outputStream2 = (OutputStream) objArr[2];
        int i13 = f54667e + 1;
        f54666d = i13 % 128;
        int i14 = i13 % 2;
        byte[] bArr2 = new byte[54];
        int length = str.length();
        int i15 = f54667e;
        int i16 = ((i15 ^ 87) - (~((i15 & 87) << 1))) - 1;
        f54666d = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            if (length <= 0) {
                bArr = bArr2;
                break;
            }
            int i18 = f54666d;
            int i19 = ((i18 & (-10)) | (9 & (~i18))) + ((i18 & 9) << 1);
            f54667e = i19 % 128;
            int i20 = i19 % 2;
            bArr = bArr2;
            if (!((Boolean) setX(new Object[]{Character.valueOf(str.charAt(length - 1))}, -10584373, 10584374, (int) System.currentTimeMillis())).booleanValue()) {
                break;
            }
            int i21 = f54666d;
            int i22 = (-2) - ((((i21 | 20) << 1) - (i21 ^ 20)) ^ (-1));
            int i23 = i22 % 128;
            f54667e = i23;
            if (i22 % 2 == 0) {
                int i24 = (length & 6) + (length | 6);
                length = (i24 ^ 45) + ((i24 & 45) << 1);
            } else {
                int i25 = ~length;
                int i26 = (length | i25) << 1;
                int i27 = -i25;
                length = (i26 ^ i27) + ((i27 & i26) << 1);
            }
            int i28 = (((i23 ^ 85) | (i23 & 85)) << 1) - (((~i23) & 85) | (i23 & (-86)));
            f54666d = i28 % 128;
            int i29 = i28 % 2;
            bArr2 = bArr;
        }
        if (length == 0) {
            int i30 = f54667e;
            int i31 = i30 & 65;
            int i32 = (i31 - (~(-(-((i30 ^ 65) | i31))))) - 1;
            f54666d = i32 % 128;
            int i33 = i32 % 2;
            int i34 = ((i30 ^ 37) | (i30 & 37)) << 1;
            int i35 = -(((~i30) & 37) | (i30 & (-38)));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            f54666d = i36 % 128;
            if (i36 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int i37 = f54666d;
        int i38 = i37 & 69;
        int i39 = (i38 - (~(-(-((i37 ^ 69) | i38))))) - 1;
        f54667e = i39 % 128;
        int i40 = i39 % 2;
        int i41 = 0;
        int i42 = length;
        while (i42 > 0) {
            int i43 = f54666d;
            int i44 = i43 & 119;
            int i45 = ((i43 ^ 119) | i44) << 1;
            int i46 = -((~i44) & (i43 | 119));
            int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
            int i48 = i47 % 128;
            f54667e = i48;
            int i49 = i47 % i12;
            if (i41 == 4) {
                break;
            }
            int i50 = (-2) - ((i48 + 6) ^ (-1));
            f54666d = i50 % 128;
            if (i50 % i12 != 0) {
                outputStream = outputStream2;
                if (!((Boolean) setX(new Object[]{Character.valueOf(str.charAt(i42))}, -10584373, 10584374, (int) System.currentTimeMillis())).booleanValue()) {
                    int i51 = (i41 | 59) << 1;
                    int i52 = -(i41 ^ 59);
                    int i53 = (i51 & i52) + (i51 | i52);
                    i41 = ((((i53 ^ (-58)) | (i53 & (-58))) << 1) - (~(-((i53 & 57) | ((~i53) & (-58)))))) - 1;
                    System.identityHashCode(bexVar);
                    System.identityHashCode(bexVar);
                }
            } else {
                outputStream = outputStream2;
                int i54 = ((i42 ^ (-1)) | i42) << 1;
                int i55 = -(~i42);
                if (!((Boolean) setX(new Object[]{Character.valueOf(str.charAt(((i54 | i55) << 1) - (i54 ^ i55)))}, -10584373, 10584374, (int) System.currentTimeMillis())).booleanValue()) {
                    int i56 = (i41 | 59) << 1;
                    int i57 = -(i41 ^ 59);
                    int i58 = (i56 & i57) + (i56 | i57);
                    i41 = ((((i58 ^ (-58)) | (i58 & (-58))) << 1) - (~(-((i58 & 57) | ((~i58) & (-58)))))) - 1;
                    System.identityHashCode(bexVar);
                    System.identityHashCode(bexVar);
                }
            }
            i42--;
            int i59 = f54667e;
            int i60 = i59 & 123;
            int i61 = (i59 | 123) & (~i60);
            int i62 = -(-(i60 << 1));
            int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
            f54666d = i63 % 128;
            int i64 = i63 % 2;
            i12 = 2;
            outputStream2 = outputStream;
        }
        OutputStream outputStream3 = outputStream2;
        int i65 = 3;
        Object[] objArr2 = new Object[3];
        objArr2[0] = str;
        objArr2[1] = 0;
        objArr2[i12] = Integer.valueOf(i42);
        int i66 = -1178624864;
        int iIntValue = ((Integer) setX(objArr2, 1178624870, -1178624864, 0)).intValue();
        int i67 = f54667e + 80;
        int i68 = (i67 ^ (-1)) + (i67 << 1);
        f54666d = i68 % 128;
        int i69 = 2;
        int i70 = i68 % 2;
        int i71 = 0;
        int i72 = 0;
        while (iIntValue < i42) {
            int i73 = f54666d + 7;
            f54667e = i73 % 128;
            int i74 = i73 % i69;
            byte[] bArr3 = bexVar.f54670c;
            int i75 = iIntValue & (-92);
            int i76 = (((~i75) & (iIntValue | (-92))) - (~(-(-(i75 << i11))))) - i11;
            int i77 = i76 & 93;
            int i78 = -(-((i76 ^ 93) | i77));
            int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
            byte b10 = bArr3[str.charAt(iIntValue)];
            Object[] objArr3 = new Object[i65];
            objArr3[c12] = str;
            objArr3[i11] = Integer.valueOf(i79);
            objArr3[2] = Integer.valueOf(i42);
            int iIntValue2 = ((Integer) setX(objArr3, 1178624870, i66, i79)).intValue();
            int i80 = (-2) - ((((iIntValue2 | (-110)) << i11) - (iIntValue2 ^ (-110))) ^ (-1));
            int i81 = i80 ^ 112;
            int i82 = ((i80 & 112) | i81) << i11;
            int i83 = -i81;
            int i84 = ((i82 | i83) << 1) - (i82 ^ i83);
            char cCharAt = str.charAt(iIntValue2);
            byte[] bArr4 = bexVar.f54670c;
            byte b11 = bArr4[cCharAt];
            Object[] objArr4 = new Object[i65];
            objArr4[c12] = str;
            objArr4[i11] = Integer.valueOf(i84);
            objArr4[2] = Integer.valueOf(i42);
            int iIntValue3 = ((Integer) setX(objArr4, 1178624870, -1178624864, i84)).intValue();
            int i85 = (iIntValue3 ^ 1) + ((iIntValue3 & 1) << i11);
            byte b12 = bArr4[str.charAt(iIntValue3)];
            Object[] objArr5 = new Object[3];
            objArr5[0] = str;
            objArr5[i11] = Integer.valueOf(i85);
            objArr5[2] = Integer.valueOf(i42);
            int iIntValue4 = ((Integer) setX(objArr5, 1178624870, -1178624864, i85)).intValue();
            int i86 = ((iIntValue4 ^ 44) + ((iIntValue4 & 44) << 1)) - 1;
            int i87 = ((i86 ^ (-42)) | (i86 & (-42))) << 1;
            int i88 = -(((-42) & (~i86)) | (i86 & 41));
            int i89 = (i87 & i88) + (i88 | i87);
            byte b13 = bArr4[str.charAt(iIntValue4)];
            int i90 = (b10 ^ b11) | (b10 & b11);
            int i91 = i90 ^ b12;
            int i92 = i90 & b12;
            int i93 = (i92 & i91) | (i91 ^ i92);
            int i94 = i93 & b13;
            int i95 = (i93 | b13) & (~i94);
            int i96 = ~b13;
            if (((i95 ^ i94) | (i95 & i94)) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            int i97 = b10 << 2;
            int i98 = b11 >> 4;
            bex bexVar2 = bexVar;
            int i99 = i97 & i98;
            int i100 = length;
            int i101 = (i97 | i98) & (~i99);
            bArr[i72] = (byte) ((i101 & i99) | (i101 ^ i99));
            int i102 = (-2) - ((i72 + 3) ^ (-1));
            int i103 = b11 << 4;
            int i104 = b12 >> 2;
            int i105 = i103 & i104;
            int i106 = (i103 | i104) & (~i105);
            bArr[i72 + 1] = (byte) ((i106 & i105) | (i106 ^ i105));
            int i107 = i102 ^ 34;
            int i108 = -(-((i102 & 34) << 1));
            int i109 = (i107 ^ i108) + ((i107 & i108) << 1);
            int i110 = i109 & (-33);
            int i111 = -(-(i109 | (-33)));
            int i112 = (i110 & i111) + (i110 | i111);
            int i113 = b12 << 6;
            int i114 = (i113 & i96) | ((~i113) & b13);
            int i115 = i113 & b13;
            bArr[i102] = (byte) ((i115 & i114) | (i114 ^ i115));
            i71 = ((i71 | 3) << 1) - (i71 ^ 3);
            if (i112 == 54) {
                int i116 = f54667e + 83;
                f54666d = i116 % 128;
                c11 = 2;
                int i117 = i116 % 2;
                outputStream3.write(bArr);
                int i118 = f54666d + 27;
                f54667e = i118 % 128;
                int i119 = i118 % 2;
                i10 = 3;
                i72 = 0;
            } else {
                c11 = 2;
                i72 = i112;
                i10 = 3;
            }
            Object[] objArr6 = new Object[i10];
            objArr6[0] = str;
            objArr6[1] = Integer.valueOf(i89);
            objArr6[c11] = Integer.valueOf(i42);
            iIntValue = ((Integer) setX(objArr6, 1178624870, -1178624864, i89)).intValue();
            int i120 = f54667e;
            int i121 = i120 & 79;
            int i122 = i120 | 79;
            int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
            f54666d = i123 % 128;
            int i124 = i123 % 2;
            bexVar = bexVar2;
            length = i100;
            c12 = 0;
            i11 = 1;
            i66 = -1178624864;
            i65 = 3;
            i69 = 2;
        }
        bex bexVar3 = bexVar;
        int i125 = length;
        if (i72 > 0) {
            int i126 = f54667e;
            int i127 = (i126 & 41) + (i126 | 41);
            f54666d = i127 % 128;
            int i128 = i127 % 2;
            outputStream3.write(bArr, 0, i72);
            int i129 = f54667e;
            int i130 = (i129 ^ 6) + ((i129 & 6) << 1);
            int i131 = (i130 ^ (-1)) + (i130 << 1);
            f54666d = i131 % 128;
            c10 = 2;
            int i132 = i131 % 2;
        } else {
            c10 = 2;
        }
        Object[] objArr7 = new Object[3];
        objArr7[0] = str;
        objArr7[1] = Integer.valueOf(iIntValue);
        objArr7[c10] = Integer.valueOf(i125);
        int iIntValue5 = ((Integer) setX(objArr7, 1178624870, -1178624864, iIntValue)).intValue();
        int iIdentityHashCode = System.identityHashCode(bexVar3);
        int i133 = iIntValue5 * 517;
        int i134 = (-515) & i133;
        int i135 = (i133 ^ (-515)) | i134;
        int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
        int i137 = ~iIntValue5;
        int i138 = ~iIdentityHashCode;
        int i139 = ~((i137 ^ iIdentityHashCode) | (i137 & iIdentityHashCode));
        int i140 = ~i138;
        int i141 = (i138 & (-2)) | (i140 & 1);
        int i142 = i138 & 1;
        int i143 = i139 | (~((i141 & i142) | (i141 ^ i142)));
        int i144 = (i138 & i137) | (i140 & iIntValue5);
        int i145 = i138 & iIntValue5;
        int i146 = ~((i144 & i145) | (i144 ^ i145));
        int i147 = i143 & i146;
        int i148 = (i143 | i146) & (~i147);
        int i149 = i136 - (~(-(-(((i148 & i147) | (i148 ^ i147)) * (-516)))));
        int i150 = (i149 ^ (-1)) + (i149 << 1);
        int i151 = (-2) & i137;
        int i152 = (~i151) & ((-2) | i137);
        int i153 = (i152 & i151) | (i152 ^ i151);
        int i154 = (i153 & i138) | ((~i153) & iIdentityHashCode);
        int i155 = i153 & iIdentityHashCode;
        int i156 = (i155 & i154) | (i154 ^ i155);
        int i157 = ~i156;
        int i158 = (i156 | i157) & i157;
        int i159 = (iIdentityHashCode | i138) & i138;
        int i160 = (-2) & i159;
        int i161 = (i159 | (-2)) & (~i160);
        int i162 = (i161 & i160) | (i161 ^ i160);
        int i163 = (i137 & i162) | ((~i162) & iIntValue5);
        int i164 = i162 & iIntValue5;
        int i165 = (i164 & i163) | (i163 ^ i164);
        int i166 = ~i165;
        int i167 = -(~((((i165 | i166) & i166) | i158) * LibMCryptConstants.IND_HEX_SEGMENTO2));
        int i168 = ((i150 & i167) + (i167 | i150)) - 1;
        int i169 = (iIntValue5 & 1) | i151;
        int i170 = (-2) & iIntValue5;
        int i171 = ~((i169 & i170) | (i169 ^ i170));
        int i172 = ~(((~i145) & (i138 | iIntValue5)) | i145);
        int i173 = ((~i172) & i171) | ((~i171) & i172);
        int i174 = i171 & i172;
        int i175 = ((i174 & i173) | (i173 ^ i174)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
        int i176 = i168 & i175;
        int i177 = (i175 | i168) & (~i176);
        int i178 = i176 << 1;
        int i179 = (i177 ^ i178) + ((i177 & i178) << 1);
        int iIntValue6 = ((Integer) setX(new Object[]{str, Integer.valueOf(i179), Integer.valueOf(i125)}, 1178624870, -1178624864, i179)).intValue();
        int iIdentityHashCode2 = System.identityHashCode(bexVar3);
        int i180 = -(-(iIntValue6 * 319));
        int i181 = (((-317) | i180) << 1) - (i180 ^ (-317));
        int i182 = ~iIntValue6;
        int i183 = (-2) & i182;
        int i184 = ((-2) ^ i182) | i183;
        int i185 = ~((i184 & iIdentityHashCode2) | (i184 ^ iIdentityHashCode2));
        int i186 = ~iIdentityHashCode2;
        int i187 = (i186 | iIdentityHashCode2) & i186;
        int i188 = i187 & 1;
        int i189 = (i187 | 1) & (~i188);
        int i190 = (i189 & i188) | (i189 ^ i188);
        int i191 = (i190 & i182) | ((~i190) & iIntValue6);
        int i192 = i190 & iIntValue6;
        int i193 = ~((i192 & i191) | (i191 ^ i192));
        int i194 = i185 & i193;
        int i195 = (i185 | i193) & (~i194);
        int i196 = -(-(((i195 & i194) | (i195 ^ i194)) * (-318)));
        int i197 = i181 & i196;
        int i198 = -(-((i196 ^ i181) | i197));
        int i199 = (i197 ^ i198) + ((i198 & i197) << 1);
        int i200 = ~(((~i182) & 1) | i183 | (i182 & 1));
        int i201 = iIdentityHashCode2 & 1;
        int i202 = ~((iIdentityHashCode2 ^ 1) | i201);
        int i203 = i200 & i202;
        int i204 = -(~((((i200 | i202) & (~i203)) | i203) * (-318)));
        int i205 = ((i199 & i204) + (i204 | i199)) - 1;
        int i206 = ((-2) & i186) | i201;
        int i207 = iIdentityHashCode2 & (-2);
        int i208 = -(-(((~((i207 & i206) | (i206 ^ i207))) | i182) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        int i209 = i205 & i208;
        int i210 = ((i205 ^ i208) | i209) << 1;
        int i211 = -((i208 | i205) & (~i209));
        int i212 = ((i210 | i211) << 1) - (i211 ^ i210);
        int iIntValue7 = ((Integer) setX(new Object[]{str, Integer.valueOf(i212), Integer.valueOf(i125)}, 1178624870, -1178624864, i212)).intValue();
        int iIdentityHashCode3 = System.identityHashCode(bexVar3);
        int i213 = iIntValue7 * (-55);
        int i214 = (-55) ^ i213;
        int i215 = (((i213 & (-55)) | i214) << 1) - i214;
        int i216 = iIdentityHashCode3 | 1;
        int i217 = ~i216;
        int i218 = (i216 | i217) & i217;
        int i219 = ((~i218) & iIntValue7) | ((~iIntValue7) & i218);
        int i220 = i218 & iIntValue7;
        int i221 = (((i220 & i219) | (i219 ^ i220)) * 56) + i215;
        int i222 = iIntValue7 & 1;
        int i223 = (~i222) & (iIntValue7 | 1);
        int i224 = -(-((~((i222 & i223) | (i223 ^ i222))) * (-56)));
        int i225 = i221 & i224;
        int i226 = (i224 | i221) & (~i225);
        int i227 = i225 << 1;
        int i228 = ((i226 | i227) << 1) - (i226 ^ i227);
        int i229 = ~iIdentityHashCode3;
        int i230 = i229 ^ iIntValue7;
        int i231 = i229 & iIntValue7;
        int i232 = ~((i231 & i230) | (i230 ^ i231));
        int i233 = i232 & 1;
        int i234 = (i232 | 1) & (~i233);
        int i235 = -(~(((i234 & i233) | (i234 ^ i233)) * 56));
        int i236 = (((i228 | i235) << 1) - (i235 ^ i228)) - 1;
        int iIntValue8 = ((Integer) setX(new Object[]{bexVar3, outputStream3, Character.valueOf(str.charAt(iIntValue5)), Character.valueOf(str.charAt(iIntValue6)), Character.valueOf(str.charAt(iIntValue7)), Character.valueOf(str.charAt(((Integer) setX(new Object[]{str, Integer.valueOf(i236), Integer.valueOf(i125)}, 1178624870, -1178624864, i236)).intValue()))}, 1588883057, -1588883057, System.identityHashCode(bexVar3))).intValue();
        int iIdentityHashCode4 = System.identityHashCode(bexVar3);
        int i237 = iIntValue8 * 628;
        int i238 = -(-(i71 * 628));
        int i239 = ((i237 | i238) << 1) - (i237 ^ i238);
        int i240 = ~iIdentityHashCode4;
        int i241 = i71 & i240;
        int i242 = ~i71;
        int i243 = iIdentityHashCode4 & i242;
        int i244 = i241 | i243;
        int i245 = i71 & iIdentityHashCode4;
        int i246 = (i244 & i245) | (i244 ^ i245);
        int i247 = ~iIntValue8;
        int i248 = (-2) - ((i239 - (~(-(-(((i246 & i247) | (i246 ^ i247)) * (-627)))))) ^ (-1));
        int i249 = (i242 & i240) | ((~i242) & iIdentityHashCode4);
        int i250 = ~((i249 & i243) | (i249 ^ i243));
        int i251 = ((~i250) & iIntValue8) | (i250 & i247);
        int i252 = i250 & iIntValue8;
        int i253 = ((i252 & i251) | (i251 ^ i252)) * (-627);
        int i254 = i248 ^ i253;
        int i255 = -(-((i248 & i253) << 1));
        int i256 = ((i254 | i255) << 1) - (i255 ^ i254);
        int i257 = (~i241) & (i240 | i71);
        int i258 = ~((i257 & i241) | (i257 ^ i241));
        int i259 = ~((iIntValue8 & iIdentityHashCode4) | (iIntValue8 ^ iIdentityHashCode4));
        int i260 = i258 ^ i259;
        int i261 = i259 & i258;
        int i262 = (((i261 & i260) | (i260 ^ i261)) * 627) + i256;
        int i263 = f54667e;
        int i264 = ((i263 & (-76)) | ((~i263) & 75)) + ((i263 & 75) << 1);
        f54666d = i264 % 128;
        if (i264 % 2 == 0) {
            return Integer.valueOf(i262);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        if (r15 != r1.f54669b) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        r15 = r1.f54670c;
        r0 = r15[r5];
        r15 = r15[r7];
        r1 = r0 ^ r15;
        r5 = r0 & r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if (((r1 & r5) | (r1 ^ r5)) < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        r0 = r0 << 2;
        r15 = r15 >> 4;
        r1 = r0 ^ r15;
        r15 = r15 & r0;
        r3.write((r15 & r1) | (r1 ^ r15));
        r15 = com.mypinpad.tsdk.isolation.bex.f54667e;
        r0 = r15 & 61;
        r15 = (r15 | 61) & (~r0);
        r0 = -(-(r0 << 1));
        r1 = (r15 ^ r0) + ((r15 & r0) << 1);
        com.mypinpad.tsdk.isolation.bex.f54666d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        throw new java.io.IOException("invalid characters encountered at end of base64 data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        throw new java.io.IOException("invalid characters encountered at end of base64 data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        r0 = r1.f54669b;
        r10 = r1.f54670c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r15 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        r15 = (r12 & 61) + (r12 | 61);
        com.mypinpad.tsdk.isolation.bex.f54667e = r15 % 128;
        r15 = r15 % 2;
        r15 = r10[r5];
        r0 = r10[r7];
        r2 = r10[r9];
        r5 = r15 & r0;
        r6 = (~r5) & (r15 | r0);
        r5 = (r5 & r6) | (r6 ^ r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        if (((r5 & r2) | (r5 ^ r2)) < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        r15 = r15 << 2;
        r5 = r0 >> 4;
        r6 = r15 ^ r5;
        r15 = r15 & r5;
        r3.write((r15 & r6) | (r6 ^ r15));
        r15 = r0 << 4;
        r0 = r2 >> 2;
        r2 = ((~r0) & r15) | ((~r15) & r0);
        r15 = r15 & r0;
        r3.write((r15 & r2) | (r2 ^ r15));
        java.lang.System.identityHashCode(r1);
        java.lang.System.identityHashCode(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f0, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        throw new java.io.IOException("invalid characters encountered at end of base64 data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:
    
        r0 = r10[r5];
        r1 = r10[r7];
        r5 = r10[r9];
        r15 = r10[r15];
        r7 = r0 ^ r1;
        r9 = r0 & r1;
        r7 = (r7 & r9) | (r7 ^ r9);
        r9 = r7 ^ r5;
        r7 = r7 & r5;
        r7 = (r7 & r9) | (r9 ^ r7);
        r9 = r7 & r15;
        r7 = (r7 | r15) & (~r9);
        r10 = ~r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0118, code lost:
    
        if (((r7 & r9) | (r7 ^ r9)) < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011a, code lost:
    
        r0 = r0 << 2;
        r7 = r1 >> 4;
        r9 = r0 ^ r7;
        r0 = r0 & r7;
        r3.write((r0 & r9) | (r9 ^ r0));
        r0 = r1 << 4;
        r1 = r5 >> 2;
        r7 = ((~r1) & r0) | ((~r0) & r1);
        r0 = r0 & r1;
        r3.write((r0 & r7) | (r7 ^ r0));
        r0 = r5 << 6;
        r1 = (r0 & r10) | ((~r0) & r15);
        r15 = r15 & r0;
        r3.write((r15 & r1) | (r1 ^ r15));
        r15 = com.mypinpad.tsdk.isolation.bex.f54667e;
        r0 = r15 ^ 41;
        r15 = -(-((r15 & 41) << 1));
        r1 = (r0 ^ r15) + ((r15 & r0) << 1);
        com.mypinpad.tsdk.isolation.bex.f54666d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015e, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0164, code lost:
    
        throw new java.io.IOException("invalid characters encountered at end of base64 data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
    
        if (r9 == r1.f54669b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r9 == r1.f54669b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r0 = r10 & 1;
        r6 = -(-(r10 | 1));
        r9 = ((r0 | r6) << 1) - (r0 ^ r6);
        com.mypinpad.tsdk.isolation.bex.f54666d = r9 % 128;
        r9 = r9 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer c(java.lang.Object[] r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bex.c(java.lang.Object[]):java.lang.Integer");
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int i10 = 0;
        bex bexVar = (bex) objArr[0];
        int i11 = f54667e + 5;
        int i12 = i11 % 128;
        f54666d = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 67;
        int i15 = -(-((i12 ^ 67) | i14));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        f54667e = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (true) {
            byte[] bArr = bexVar.f54670c;
            if (i18 >= bArr.length) {
                break;
            }
            int i19 = f54667e;
            int i20 = i19 + 99;
            f54666d = i20 % 128;
            int i21 = i20 % 2;
            bArr[i18] = -1;
            int i22 = i18 & 125;
            int i23 = i22 + ((i18 ^ 125) | i22);
            i18 = (((i23 | (-123)) << 1) - (i23 ^ (-123))) - 1;
            int i24 = i19 & 37;
            int i25 = (((i19 ^ 37) | i24) << 1) - ((i19 | 37) & (~i24));
            f54666d = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = f54666d;
        int i28 = (i27 & (-46)) | ((~i27) & 45);
        int i29 = -(-((i27 & 45) << 1));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f54667e = i30 % 128;
        int i31 = i30 % 2;
        while (true) {
            byte[] bArr2 = bexVar.f54668a;
            if (i10 >= bArr2.length) {
                break;
            }
            int i32 = f54666d;
            int i33 = i32 & 113;
            int i34 = i33 + ((i32 ^ 113) | i33);
            f54667e = i34 % 128;
            int i35 = i34 % 2;
            bexVar.f54670c[bArr2[i10]] = (byte) i10;
            int i36 = i10 & 35;
            int i37 = ((i10 ^ 35) | i36) << 1;
            int i38 = -((i10 | 35) & (~i36));
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            i10 = ((i39 & (-33)) + (i39 | (-33))) - 1;
            int i40 = (((i32 | 117) << 1) - (~(-(i32 ^ 117)))) - 1;
            f54667e = i40 % 128;
            int i41 = i40 % 2;
        }
        int i42 = f54666d;
        int i43 = i42 & 119;
        int i44 = -(-(i42 | 119));
        int i45 = (i43 & i44) + (i44 | i43);
        f54667e = i45 % 128;
        if (i45 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer e(Object[] objArr) {
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        while (iIntValue < iIntValue2) {
            int i10 = f54666d;
            int i11 = i10 & 117;
            int i12 = i11 + ((i10 ^ 117) | i11);
            f54667e = i12 % 128;
            if (i12 % 2 == 0) {
                ((Boolean) setX(new Object[]{Character.valueOf(str.charAt(iIntValue))}, -10584373, 10584374, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (!((Boolean) setX(new Object[]{Character.valueOf(str.charAt(iIntValue))}, -10584373, 10584374, (int) System.currentTimeMillis())).booleanValue()) {
                break;
            }
            iIntValue = (((iIntValue | (-62)) << 1) - (iIntValue ^ (-62))) + 63;
            int i13 = f54667e;
            int i14 = ((i13 | 47) << 1) - (i13 ^ 47);
            f54666d = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = f54666d;
        int i17 = i16 & 111;
        int i18 = (i17 - (~(-(-((i16 ^ 111) | i17))))) - 1;
        f54667e = i18 % 128;
        if (i18 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        throw null;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = 2;
        switch ((((~((~i12) | i15)) | i14 | i16) * 398) + ((i10 | i11) * (-1194)) + ((i14 | i16 | (~(i15 | i12))) * 398) + (i11 * 399) + (i10 * 399)) {
            case 1:
                char cCharValue = ((Character) objArr[0]).charValue();
                int i18 = f54667e;
                int i19 = i18 & 79;
                int i20 = -(-(i18 | 79));
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                f54666d = i21 % 128;
                if (i21 % 2 == 0 ? cCharValue != '\n' : cCharValue != '\"') {
                    if (cCharValue != '\r') {
                        int i22 = i18 & 89;
                        int i23 = (~i22) & (i18 | 89);
                        int i24 = i22 << 1;
                        int i25 = (i23 & i24) + (i24 | i23);
                        f54666d = i25 % 128;
                        if (i25 % 2 == 0 ? cCharValue != '\t' : cCharValue != ' ') {
                            int i26 = (i18 ^ 101) + ((i18 & 101) << 1);
                            f54666d = i26 % 128;
                            if (i26 % 2 == 0 ? cCharValue != ' ' : cCharValue != '&') {
                                int i27 = i18 + 69;
                                f54666d = i27 % 128;
                                int i28 = i27 % 2;
                                return Boolean.FALSE;
                            }
                        }
                    }
                }
                int i29 = f54666d + 11;
                f54667e = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.TRUE;
            case 2:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i31 = f54666d;
                int i32 = i31 & 45;
                int i33 = ((i31 | 45) & (~i32)) + (i32 << 1);
                int i34 = i33 % 128;
                f54667e = i34;
                int i35 = i33 % 2;
                int i36 = 1735 - (~(-(-(iIntValue * 868))));
                int i37 = ~iIntValue;
                int i38 = (-3) & i37;
                int i39 = ~(((~i38) & ((-3) | i37)) | i38);
                int i40 = ~i37;
                int i41 = i37 & i40;
                int i42 = i41 | i41;
                int i43 = i37 & i37;
                int i44 = ~((i42 & i43) | (i42 ^ i43));
                int i45 = ((i39 & i44) | (i39 ^ i44)) * (-867);
                int i46 = ((~i45) & i36) | ((~i36) & i45);
                int i47 = -(-((i36 & i45) << 1));
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                int i49 = ~(((-3) ^ i37) | i38);
                int i50 = (iIntValue & 2) | i38;
                int i51 = (-3) & iIntValue;
                int i52 = (i50 & i51) | (i50 ^ i51);
                int i53 = ~i52;
                int i54 = (i52 | i53) & i53;
                int i55 = ((~i54) & i49) | ((~i49) & i54);
                int i56 = i49 & i54;
                int i57 = (i56 & i55) | (i55 ^ i56);
                int i58 = (i37 | iIntValue) & i37;
                int i59 = i58 ^ iIntValue;
                int i60 = i58 & iIntValue;
                int i61 = (i59 & i60) | (i59 ^ i60);
                int i62 = ~i61;
                int i63 = (i61 | i62) & i62;
                int i64 = -(-(((i57 & i63) | (i57 ^ i63)) * (-1734)));
                int i65 = ((((~i64) & i48) | ((~i48) & i64)) - (~((i64 & i48) << 1))) - 1;
                int i66 = (-3) & i40;
                int i67 = i37 & 2;
                int i68 = i66 | i67;
                int i69 = (i68 & i38) | (i68 ^ i38);
                int i70 = i69 ^ i58;
                int i71 = i69 & i58;
                int i72 = (i71 & i70) | (i70 ^ i71);
                int i73 = ~i72;
                int i74 = (i72 | i73) & i73;
                int i75 = (-3) | iIntValue;
                int i76 = ~((i75 & iIntValue) | (i75 ^ iIntValue));
                int i77 = ((~i76) & i74) | ((~i74) & i76);
                int i78 = i74 & i76;
                int i79 = (i78 & i77) | (i77 ^ i78);
                int i80 = ((i37 | 2) & (~i67)) | i67;
                int i81 = ~((iIntValue & i80) | (i80 ^ iIntValue));
                int i82 = i79 & i81;
                int i83 = (i81 | i79) & (~i82);
                int i84 = -(-(((i83 & i82) | (i83 ^ i82)) * 867));
                int i85 = i65 & i84;
                int i86 = -(-((i84 ^ i65) | i85));
                int i87 = ((((i85 | i86) << 1) - (i86 ^ i85)) / 3) << 2;
                int i88 = i34 ^ 79;
                int i89 = (((i34 & 79) | i88) << 1) - i88;
                f54666d = i89 % 128;
                int i90 = i89 % 2;
                return Integer.valueOf(i87);
            case 3:
                return b(objArr);
            case 4:
                bex bexVar = (bex) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int iIntValue3 = ((Number) objArr[3]).intValue();
                byte[] bArr2 = (byte[]) objArr[4];
                int i91 = f54667e;
                int i92 = i91 & 13;
                int i93 = -(-((13 ^ i91) | i92));
                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                int i95 = i94 % 128;
                f54666d = i95;
                int i96 = i94 % 2;
                int i97 = (iIntValue2 - (~(-(~(-(-iIntValue3)))))) - 2;
                int i98 = -(-(i97 * 829));
                int i99 = (((-1658) | i98) << 1) - (i98 ^ (-1658));
                int i100 = ~i97;
                int i101 = i100 & (i100 | i97);
                int i102 = 1 & i101;
                int i103 = (i101 | 1) & (~i102);
                int i104 = ~((i103 & i102) | (i103 ^ i102));
                int i105 = ~iIntValue2;
                int i106 = (i105 | iIntValue2) & i105;
                int i107 = i106 | (-2);
                int i108 = i107 & i97;
                int i109 = ~(i108 | ((~i108) & (i107 | i97)));
                int i110 = ((~i109) & i104) | ((~i104) & i109);
                int i111 = i109 & i104;
                int i112 = -(-(((i111 & i110) | (i110 ^ i111)) * (-828)));
                int i113 = (i99 | i112) << 1;
                int i114 = -(i112 ^ i99);
                int i115 = (((i113 ^ i114) + ((i114 & i113) << 1)) - (~(-(-(((((-2) ^ i97) | ((-2) & i97)) | i106) * (-828)))))) - 1;
                int i116 = -(-((~((-2) | i97)) * 828));
                int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                int i118 = (i95 & (-102)) | ((~i95) & 101);
                int i119 = -(-((i95 & 101) << 1));
                int i120 = (i118 & i119) + (i119 | i118);
                f54667e = i120 % 128;
                int i121 = i120 % 2;
                int i122 = iIntValue2;
                int i123 = 0;
                while (i122 < i117) {
                    int i124 = f54667e;
                    int i125 = i124 + 73;
                    f54666d = i125 % 128;
                    int i126 = i125 % i17;
                    int i127 = ((i122 | 1) << 1) - (i122 ^ 1);
                    byte b10 = bArr[i122];
                    int i128 = i127 & 1;
                    int i129 = -(-(i127 | 1));
                    int i130 = ((i128 | i129) << 1) - (i128 ^ i129);
                    int i131 = bArr[i127] & 255;
                    int i132 = ((i130 ^ 8) - (~(-(-((i130 & 8) << 1))))) - 1;
                    int i133 = i132 | (-7);
                    int i134 = i133 << 1;
                    int i135 = -((~(i132 & (-7))) & i133);
                    int i136 = ((i134 & i135) << 1) + (i134 ^ i135);
                    byte b11 = bArr[i130];
                    int i137 = (i123 & 1) + (i123 | 1);
                    byte[] bArr3 = bexVar.f54668a;
                    bArr2[i123] = bArr3[(b10 >>> 2) & 63];
                    int i138 = i137 + 92;
                    int i139 = (i138 ^ (-1)) + (i138 << 1);
                    int i140 = i117;
                    int i141 = i139 & (-90);
                    int i142 = ((i139 ^ (-90)) | i141) << 1;
                    int i143 = -((~i141) & (i139 | (-90)));
                    int i144 = (i142 & i143) + (i142 | i143);
                    int i145 = b10 << 4;
                    int i146 = i131 >>> 4;
                    int i147 = i145 ^ i146;
                    int i148 = i145 & i146;
                    bArr2[i137] = bArr3[((i148 & i147) | (i147 ^ i148)) & 63];
                    int i149 = i144 & (-109);
                    int i150 = (i149 - (~((i144 ^ (-109)) | i149))) - 1;
                    int i151 = i150 & 110;
                    int i152 = (i150 | 110) & (~i151);
                    int i153 = i151 << 1;
                    int i154 = (i152 & i153) + (i152 | i153);
                    int i155 = i131 << 2;
                    int i156 = (b11 & 255) >>> 6;
                    int i157 = i155 ^ i156;
                    int i158 = i156 & i155;
                    bArr2[i144] = bArr3[((i158 & i157) | (i157 ^ i158)) & 63];
                    int i159 = i154 - 37;
                    int i160 = (i159 ^ (-1)) + (i159 << 1);
                    int i161 = i160 & 39;
                    int i162 = (i160 | 39) & (~i161);
                    int i163 = i161 << 1;
                    i123 = ((i162 | i163) << 1) - (i163 ^ i162);
                    bArr2[i154] = bArr3[b11 & 63];
                    int i164 = i124 & 71;
                    int i165 = i124 | 71;
                    int i166 = (i164 ^ i165) + ((i164 & i165) << 1);
                    f54666d = i166 % 128;
                    int i167 = i166 % 2;
                    i117 = i140;
                    i122 = i136;
                    i17 = 2;
                }
                int i168 = -iIntValue2;
                int i169 = i168 * 881;
                int i170 = -(~(-(-(i122 * 881))));
                int i171 = ((i169 & i170) + (i169 | i170)) - 1;
                int i172 = ~i168;
                int i173 = (i172 | i168) & i172;
                int i174 = ~i122;
                int i175 = ((~i174) & i173) | ((~i173) & i174);
                int i176 = i173 & i174;
                int i177 = ~((i176 & i175) | (i175 ^ i176));
                int i178 = ~((i172 & i105) | ((~i172) & iIntValue2) | (i172 & iIntValue2));
                int i179 = i177 & i178;
                int i180 = (~i179) & (i177 | i178);
                int i181 = (i180 & i179) | (i180 ^ i179);
                int i182 = ~((i174 ^ iIntValue2) | (i174 & iIntValue2));
                int i183 = ((i181 & i182) | ((~i182) & i181) | ((~i181) & i182)) * (-880);
                int i184 = i171 ^ i183;
                int i185 = ((i183 & i171) | i184) << 1;
                int i186 = -i184;
                int i187 = ((i185 | i186) << 1) - (i185 ^ i186);
                int i188 = i172 | i105;
                int i189 = ~i188;
                int i190 = (i188 | i189) & i189;
                int i191 = i122 & i190;
                int i192 = ((i190 | i122) & (~i191)) | i191;
                int i193 = (i168 & iIntValue2) | (i168 ^ iIntValue2);
                int i194 = ~i193;
                int i195 = ((~i194) & i192) | ((~i192) & i194);
                int i196 = i192 & i194;
                int i197 = ((i196 & i195) | (i195 ^ i196)) * (-880);
                int i198 = (i187 ^ i197) + ((i197 & i187) << 1);
                int i199 = ((i193 | i194) & i194) * 880;
                int i200 = i198 | i199;
                int i201 = i200 << 1;
                int i202 = -((~(i199 & i198)) & i200);
                int i203 = -((i201 & i202) + (i202 | i201));
                int i204 = iIntValue3 & i203;
                int i205 = i204 + ((iIntValue3 ^ i203) | i204);
                if (i205 == 1) {
                    int i206 = bArr[i122] & 255;
                    int i207 = ((((i123 ^ (-22)) | (i123 & (-22))) << 1) - (~(-((i123 & 21) | ((~i123) & (-22)))))) + 22;
                    byte[] bArr4 = bexVar.f54668a;
                    bArr2[i123] = bArr4[(i206 >>> 2) & 63];
                    int i208 = (i207 ^ 1) + ((i207 & 1) << 1);
                    bArr2[i207] = bArr4[(i206 << 4) & 63];
                    int i209 = (i208 ^ 1) + ((i208 & 1) << 1);
                    byte b12 = bexVar.f54669b;
                    bArr2[i208] = b12;
                    i123 = ((i209 | 1) << 1) - (i209 ^ 1);
                    bArr2[i209] = b12;
                    int i210 = f54666d;
                    int i211 = i210 & 41;
                    int i212 = ((i210 ^ 41) | i211) << 1;
                    int i213 = -((i210 | 41) & (~i211));
                    int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                    f54667e = i214 % 128;
                    i13 = 2;
                    int i215 = i214 % 2;
                } else if (i205 != 2) {
                    i13 = 2;
                } else {
                    int i216 = i122 & 1;
                    int i217 = (i122 ^ 1) | i216;
                    int i218 = bArr[i122] & 255;
                    int i219 = bArr[((i216 | i217) << 1) - (i216 ^ i217)] & 255;
                    int i220 = i123 & 1;
                    int i221 = (~i220) & (i123 | 1);
                    int i222 = i220 << 1;
                    int i223 = (i221 ^ i222) + ((i222 & i221) << 1);
                    byte[] bArr5 = bexVar.f54668a;
                    bArr2[i123] = bArr5[(i218 >>> 2) & 63];
                    int i224 = i223 ^ 60;
                    int i225 = ((i223 & 60) | i224) << 1;
                    int i226 = -i224;
                    int i227 = (i225 ^ i226) + ((i226 & i225) << 1);
                    int i228 = (((i227 & 58) | ((~i227) & (-59))) - (~(-(-((i227 & (-59)) << 1))))) - 1;
                    int i229 = i218 << 4;
                    int i230 = i219 >>> 4;
                    int i231 = ((~i230) & i229) | ((~i229) & i230);
                    int i232 = i229 & i230;
                    bArr2[i223] = bArr5[((i232 & i231) | (i231 ^ i232)) & 63];
                    int i233 = (i228 & 1) + (i228 | 1);
                    bArr2[i228] = bArr5[(i219 << 2) & 63];
                    int i234 = (i233 & (-86)) + (i233 | (-86));
                    int i235 = (i234 ^ (-1)) + (i234 << 1);
                    int i236 = (i235 | 88) << 1;
                    int i237 = -(((~i235) & 88) | (i235 & (-89)));
                    i123 = ((i236 | i237) << 1) - (i236 ^ i237);
                    bArr2[i233] = bexVar.f54669b;
                    int i238 = f54666d;
                    int i239 = ((i238 | 7) << 1) - (i238 ^ 7);
                    f54667e = i239 % 128;
                    int i240 = i239 % 2;
                    i13 = 2;
                }
                int i241 = f54667e + 43;
                f54666d = i241 % 128;
                int i242 = i241 % i13;
                return Integer.valueOf(i123);
            case 5:
                return a(objArr);
            case 6:
                return e(objArr);
            case 7:
                d(objArr);
                return null;
            default:
                return c(objArr);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.bey
    public final int setDividerPadding(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        return ((Integer) setX(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11), outputStream}, 1084098735, -1084098730, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.bey
    public final int setY(String str, OutputStream outputStream) throws IOException {
        return ((Integer) setX(new Object[]{this, str, outputStream}, 1751215096, -1751215093, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.bey
    public final int setDividerPadding(int i10) {
        return ((Integer) setX(new Object[]{this, Integer.valueOf(i10)}, -1710813070, 1710813072, i10)).intValue();
    }
}
