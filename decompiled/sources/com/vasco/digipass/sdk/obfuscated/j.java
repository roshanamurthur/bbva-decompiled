package com.vasco.digipass.sdk.obfuscated;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.esotericsoftware.asm.Opcodes;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import com.vasco.digipass.sdk.responses.DigipassPropertiesResponse;
import com.vasco.digipass.sdk.responses.ManageApplicationResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;
import com.veridas.detect.ImageAnalysisKt;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements DigipassSDKConstants {
    public static String A() {
        byte[] bArr = new byte[50];
        int[] iArr = {169, 188, 184, 114, 182, Opcodes.IFNULL, 180, 188, Opcodes.INSTANCEOF, 108, 189, 175, 170, 171, 187, 175, 187, 165, 183, 171, 176, 174, 95, 161, 172, 177, 169, 174, 158, 170, 87, 156, 164, 166, 160, 147, 165, 80, 152, 161, 77, 149, 153, 141, 152, 154, 153, 139, 136, 152};
        for (int i10 = 0; i10 < 50; i10++) {
            bArr[i10] = (byte) ((iArr[i10] - 85) + i10);
        }
        return new String(bArr);
    }

    public static String A0() {
        byte[] bArr = new byte[28];
        int[] iArr = {84, 103, 99, 29, 84, 65, 59, 61, 24, 99, 91, 99, 91, 103, 90, 17, 89, 98, 14, 86, 90, 78, 89, 91, 90, 76, 73, 89};
        for (int i10 = 0; i10 < 28; i10++) {
            bArr[i10] = (byte) (iArr[i10] + i10);
        }
        return new String(bArr);
    }

    public static String B() {
        byte[] bArr = new byte[50];
        int[] iArr = {84, 104, 101, 32, 101, 118, 101, 110, 116, 32, 114, 101, 97, 99, 116, 105, 118, 97, 116, 105, 111, 110, 32, 99, 111, 117, 110, 116, 101, 114, 32, 108, 101, 110, 103, 116, 104, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 50; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String B0() {
        byte[] bArr = new byte[16];
        int[] iArr = {16, 35, 39, 89, 16, 5, 127, 121, 92, 36, 45, 81, 38, 44, 26, 25};
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = (byte) ((iArr[i10] ^ 68) + i10);
        }
        return new String(bArr);
    }

    public static String C() {
        byte[] bArr = new byte[41];
        int[] iArr = {21, 1, 4, 217, 4, 51, 4, 11, 53, 217, 55, 4, 24, 6, 53, 0, 51, 24, 53, 0, 10, 11, 217, 6, 10, 52, 11, 53, 4, 55, 217, 0, 54, 217, 0, 11, 51, 24, 13, 0, 5};
        for (int i10 = 0; i10 < 41; i10++) {
            bArr[i10] = (byte) ((iArr[i10] ^ 23) + 82);
        }
        return new String(bArr);
    }

    public static String D() {
        byte[] bArr = new byte[38];
        int[] iArr = {25, 157, 57, 144, 184, 89, 186, 26, 180, 178, 22, 152, 81, 54, 245, 18, 108, 204, 129, 15, 47, 73, 109, 10, 132, 138, 166, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 143, 161, 66, 228, 92, 252, 255, 24, 223, 56};
        for (int i10 = 0; i10 < 38; i10++) {
            int i11 = (iArr[i10] ^ i10) + 113;
            bArr[i10] = (byte) ((((i11 & 255) >> 5) | (i11 << 3)) & 255);
        }
        return new String(bArr);
    }

    public static String E() {
        byte[] bArr = new byte[34];
        int[] iArr = {84, 104, 101, 32, 105, 110, 112, 117, 116, 32, 100, 97, 116, 97, 32, 108, 101, 110, 103, 116, 104, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 34; i10++) {
            int i11 = iArr[i10];
            bArr[i10] = (byte) (((i11 & 255) | (i11 << 8)) & 255);
        }
        return new String(bArr);
    }

    public static String F() {
        byte[] bArr = new byte[22];
        int[] iArr = {241, 5, 2, 189, 6, 11, 13, 18, 17, 189, 1, 254, 17, 254, 189, 6, 16, 189, 11, 18, 9, 9};
        for (int i10 = 0; i10 < 22; i10++) {
            bArr[i10] = (byte) (iArr[i10] - 157);
        }
        return new String(bArr);
    }

    public static String G() {
        byte[] bArr = new byte[31];
        int[] iArr = {84, 104, 101, 32, 106, 97, 105, 108, 98, 114, 101, 97, 107, 32, 115, 116, 97, 116, 117, 115, 32, 105, 115, 32, 105, 110, 118, 97, 108, 105, 100};
        for (int i10 = 0; i10 < 31; i10++) {
            bArr[i10] = (byte) ((iArr[i10] ^ i10) ^ i10);
        }
        return new String(bArr);
    }

    public static String H() {
        byte[] bArr = new byte[27];
        int[] iArr = {84, 104, 101, 32, 107, 101, 121, 32, 108, 101, 110, 103, 116, 104, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 27; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String I() {
        byte[] bArr = new byte[15];
        int[] iArr = {84, 105, 103, 35, 111, 106, 127, 39, 113, 124, 42, 121, 129, 121, 122};
        for (int i10 = 0; i10 < 15; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }

    public static String J() {
        byte[] bArr = new byte[33];
        int[] iArr = {84, 104, 101, 32, 68, 73, 71, 73, 80, 65, 83, 83, 32, 108, 105, 99, 101, 110, 115, 101, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 33; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String K() {
        byte[] bArr = new byte[64];
        int[] iArr = {84, 104, 101, 32, 109, 117, 108, 116, 105, 45, 100, 101, 118, 105, 99, 101, 32, 97, 99, 116, 105, 118, 97, 116, 105, 111, 110, 32, 105, 115, 32, 100, 105, 115, 97, 98, 108, 101, 100, 32, 105, 110, 32, 116, 104, 101, 32, 68, 73, 71, 73, 80, 65, 83, 83, 32, 115, 101, 116, 116, 105, 110, 103, 115};
        for (int i10 = 0; i10 < 64; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String L() {
        byte[] bArr = new byte[63];
        int[] iArr = {81, 165, 157, 140, Opcodes.MULTIANEWARRAY, 233, 201, 237, Opcodes.MULTIANEWARRAY, 216, 185, Opcodes.INSTANCEOF, 10, 217, Opcodes.MULTIANEWARRAY, ErrorCodes.ERR_CRY_BAD_PROTO, 192, 201, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 30, 245, 46, 221, 46, 6, 34, 34, 236, 22, 66, 248, 18, 58, 10, 18, 62, 38, 38, 25, 66, 90, 37, 122, 78, 70, 53, 201, 225, 221, 233, 10, ErrorCodes.ERR_CRY_BAD_PROTO, 30, 34, 89, 170, 118, 182, 186, 146, 170, 146, Opcodes.IFNULL};
        for (int i10 = 0; i10 < 63; i10++) {
            int i11 = iArr[i10];
            bArr[i10] = (byte) (((((i11 & 255) >> 2) | (i11 << 6)) & 255) - i10);
        }
        return new String(bArr);
    }

    public static String M() {
        byte[] bArr = new byte[38];
        int[] iArr = {84, 103, 99, 29, 64, 68, 65, 66, 72, 56, 73, 72, 20, 92, 101, 17, 94, 94, 98, 13, 92, 76, 93, 92, 95, 86, 88, 73, 4, 83, 84, 80, 84, 68, 65, 81, 65, 63};
        for (int i10 = 0; i10 < 38; i10++) {
            bArr[i10] = (byte) (iArr[i10] + i10);
        }
        return new String(bArr);
    }

    public static String N() {
        byte[] bArr = new byte[24];
        int[] iArr = {84, 104, 101, 32, 112, 97, 115, 115, 119, 111, 114, 100, 32, 105, 115, 32, 116, 111, 111, 32, 108, 111, 110, 103};
        for (int i10 = 0; i10 < 24; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String O() {
        byte[] bArr = new byte[25];
        int[] iArr = {202, 28, 251, 183, 204, 203, 220, 204, 124, 236, 12, 123, 71, 204, 92, 119, 205, 109, 93, 182, 253, 93, 29, 221, 77};
        for (int i10 = 0; i10 < 25; i10++) {
            int i11 = iArr[i10];
            int i12 = (((((i11 & 255) >> 4) | (i11 << 4)) & 255) ^ i10) + 168;
            bArr[i10] = (byte) (((i12 & 255) | (i12 << 8)) & 255);
        }
        return new String(bArr);
    }

    public static String P() {
        byte[] bArr = new byte[68];
        int[] iArr = {9, 29, 26, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 22, 37, 37, 33, 30, 24, 22, 41, 30, 36, 35, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 30, 40, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 33, 36, 24, 32, 26, 25, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 22, 27, 41, 26, 39, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 41, 36, 36, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 34, 22, 35, 46, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 41, 39, 30, 26, 40, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 44, 30, 41, 29, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 22, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 44, 39, 36, 35, 28, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 37, 22, 40, 40, 44, 36, 39, 25};
        for (int i10 = 0; i10 < 68; i10++) {
            bArr[i10] = (byte) (iArr[i10] - 181);
        }
        return new String(bArr);
    }

    public static String Q() {
        byte[] bArr = new byte[20];
        int[] iArr = {184, 204, 201, 132, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, Opcodes.MULTIANEWARRAY, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, 219, 211, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 200, 132, 205, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, 132, ErrorCodes.ERR_CRY_IO_PROPERTIES, 217, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY};
        for (int i10 = 0; i10 < 20; i10++) {
            int i11 = iArr[i10];
            bArr[i10] = (byte) ((((i11 & 255) | (i11 << 8)) & 255) - 100);
        }
        return new String(bArr);
    }

    public static String R() {
        byte[] bArr = new byte[20];
        int[] iArr = {84, 104, 101, 32, 112, 97, 115, 115, 119, 111, 114, 100, 32, 105, 115, 32, 119, 101, 97, 107};
        for (int i10 = 0; i10 < 20; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String S() {
        byte[] bArr = new byte[32];
        int[] iArr = {Opcodes.INSTANCEOF, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, ErrorCodes.ERR_CRY_IO_PROPERTIES, 141, 221, 206, 224, 224, 228, 220, 223, ErrorCodes.ERR_CRY_BAD_PROTO, 141, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 206, 219, 219, 220, 225, 141, 207, ErrorCodes.ERR_CRY_IO_PROPERTIES, 141, 227, 206, 217, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, ErrorCodes.ERR_CRY_BAD_PROTO, 206, 225, ErrorCodes.ERR_CRY_IO_PROPERTIES, ErrorCodes.ERR_CRY_BAD_PROTO};
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = (byte) (iArr[i10] + 147);
        }
        return new String(bArr);
    }

    public static String T() {
        byte[] bArr = new byte[90];
        int[] iArr = {224, 221, 211, 151, 192, 221, 211, Opcodes.IFNONNULL, 218, ErrorCodes.ERR_CRY_IO_PROPERTIES, 204, ErrorCodes.ERR_CRY_IO_PROPERTIES, 152, 216, 217, 207, 205, 211, Opcodes.IFNONNULL, 211, 201, 206, 204, 131, Opcodes.IFNONNULL, 200, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, 143, Opcodes.INSTANCEOF, 218, 138, Opcodes.MONITORENTER, 250, 227, 247, 251, 249, 245, 178, 241, 249, 254, 255, 234, 235, 252, 186, 242, 240, 165, 229, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 238, 239, 237, 247, 172, 239, 235, 175, 254, 232, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 226, 144, 148, 130, 146, 148, ErrorCodes.ERR_CRY_BAD_PROTO, 147, 148, 157, 148, 144, 140, 140, 217, 147, 143, 151, Opcodes.MULTIANEWARRAY, 133, 143, 133, 130, 137, 144, 153, 128};
        for (int i10 = 0; i10 < 90; i10++) {
            bArr[i10] = (byte) ((iArr[i10] ^ i10) ^ 180);
        }
        return new String(bArr);
    }

    public static String U() {
        byte[] bArr = new byte[39];
        int[] iArr = {84, 104, 101, 32, 112, 108, 97, 116, 102, 111, 114, 109, 32, 102, 105, 110, 103, 101, 114, 112, 114, 105, 110, 116, 32, 105, 115, 32, 110, 111, 116, 32, 100, 101, 102, 105, 110, 101, 100};
        for (int i10 = 0; i10 < 39; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String V() {
        byte[] bArr = new byte[36];
        int[] iArr = {16, 36, 33, 220, 44, 46, 43, 48, 33, 31, 48, 37, 43, 42, 220, 48, 53, 44, 33, 220, 37, 47, 220, 42, 43, 48, 220, 47, 49, 44, 44, 43, 46, 48, 33, 32};
        for (int i10 = 0; i10 < 36; i10++) {
            bArr[i10] = (byte) (iArr[i10] + 68);
        }
        return new String(bArr);
    }

    public static String W() {
        byte[] bArr = new byte[76];
        int[] iArr = {30, 35, 45, 105, 62, 61, 35, 59, 43, 39, 37, 37, 102, 43, 33, 43, 61, 47, 48, 121, 49, 57, 124, 41, 58, 54, 112, 33, 55, 36, 39, 34, 5, 25, 12, 73, 25, 7, 9, 3, 66, 17, 5, 17, 20, 2, 23, 0, 20, 15, 29, 29, 94, 30, 15, 93, 19, 83, 3, 5, 4, 30, 26, 18, 42, 98, 123, 41, 122, 96, 99, 45, 110, 108, 110, 102};
        for (int i10 = 0; i10 < 76; i10++) {
            bArr[i10] = (byte) ((iArr[i10] ^ 74) ^ i10);
        }
        return new String(bArr);
    }

    public static String X() {
        byte[] bArr = new byte[77];
        int[] iArr = {84, 105, 103, 35, 116, 119, 105, 113, 97, 109, 111, 111, 44, 97, 107, 97, 119, 101, 122, 51, 123, 115, 54, 99, 112, 124, 58, 107, 125, 110, 109, 104, 79, 83, 70, 3, 83, 77, 67, 73, 8, 91, 79, 91, 94, 72, 93, 74, 94, 69, 87, 87, 20, 84, 69, 23, 89, 25, 73, 79, 78, 84, 80, 88, 96, 40, 49, 99, 48, 42, 41, 103, 59, 33, 37, 57, 56};
        for (int i10 = 0; i10 < 77; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ i10);
        }
        return new String(bArr);
    }

    public static String Y() {
        byte[] bArr = new byte[54];
        int[] iArr = {172, 144, 157, 216, 153, 136, 136, 148, 145, 155, 153, 140, 145, 151, 150, 216, 144, 153, 139, 216, 154, 157, 157, 150, 216, 148, 151, 155, 147, 157, 156, 216, 145, 150, 216, 153, 216, 138, 157, 153, 155, 140, 145, 142, 153, 140, 145, 151, 150, 216, 155, 153, 139, 157};
        for (int i10 = 0; i10 < 54; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ 248);
        }
        return new String(bArr);
    }

    public static String Z() {
        byte[] bArr = new byte[39];
        int[] iArr = {162, 67, 43, 1, 155, 27, 123, 147, 43, 1, 179, 11, 99, 171, 43, 1, 107, 171, 155, 163, 1, 19, 43, 1, 19, 43, 163, 187, 43, 43, 115, 1, 129, 1, 11, 115, 35, 1, 185};
        for (int i10 = 0; i10 < 39; i10++) {
            int i11 = iArr[i10];
            bArr[i10] = (byte) ((((i11 & 255) >> 3) | (i11 << 5)) & 255);
        }
        return new String(bArr);
    }

    public static ManageApplicationResponse a(byte[] bArr, byte[] bArr2, int i10, boolean z10) {
        try {
            e eVarB = p.b(bArr, bArr2);
            if (!eVarB.e()) {
                return new ManageApplicationResponse(DigipassSDKReturnCodes.STATUS_INVALID, p.a(eVarB));
            }
            if (i10 >= 1 && i10 <= eVarB.f65715a) {
                eVarB.a(i10).f65700a = z10;
                return new ManageApplicationResponse(0, p.a(eVarB));
            }
            return new ManageApplicationResponse(DigipassSDKReturnCodes.CRYPTO_APPLICATION_INDEX_INVALID, p.a(eVarB));
        } catch (h e5) {
            return new ManageApplicationResponse(e5.a());
        } catch (Exception e7) {
            return new ManageApplicationResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    public static String a0() {
        byte[] bArr = new byte[55];
        int[] iArr = {108, 128, 125, 56, 139, 125, 123, 141, 138, 125, 56, 123, 128, 121, 134, 134, 125, 132, 56, 129, 139, 56, 124, 129, 139, 121, 122, 132, 125, 124, 56, 129, 134, 56, 140, 128, 125, 56, 92, 97, 95, 97, 104, 89, 107, 107, 56, 139, 125, 140, 140, 129, 134, 127, 139};
        for (int i10 = 0; i10 < 55; i10++) {
            bArr[i10] = (byte) (iArr[i10] + 232);
        }
        return new String(bArr);
    }

    public static byte[] b(String str) throws h {
        int i10;
        if (((byte) (str.charAt(3) - '0')) >= 8) {
            byte[] bArrA = q.a(str.substring(0, 8));
            i10 = ((bArrA[2] & 255) << 8) + (bArrA[3] & 255) + 4;
        } else {
            i10 = 56;
        }
        int i11 = i10 * 2;
        if (str.length() >= i11) {
            return q.a(str.substring(0, i11));
        }
        throw new h(DigipassSDKReturnCodes.XFAD_INCORRECT_LENGTH);
    }

    public static String b0() {
        byte[] bArr = new byte[51];
        int[] iArr = {84, 104, 101, 32, 115, 101, 99, 117, 114, 101, 32, 99, 104, 97, 110, 110, 101, 108, 32, 109, 101, 115, 115, 97, 103, 101, 32, 98, 111, 100, 121, 32, 102, 111, 114, 109, 97, 116, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 51; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static byte c(d dVar) {
        byte b10 = dVar.f65706g;
        if (b10 == 0) {
            return (byte) 1;
        }
        if (b10 == 1 && dVar.f65707h[0] == dVar.f65708i[0]) {
            return (byte) 2;
        }
        b bVar = dVar.f65704e;
        if (bVar.B) {
            return (byte) 2;
        }
        return (b10 > 0 && dVar.f65707h[0] == 0 && bVar.f65677c == 0) ? (byte) 4 : (byte) 3;
    }

    public static String c0() {
        byte[] bArr = new byte[51];
        int[] iArr = {89, 101, 104, 45, 126, 104, 110, 120, 127, 104, 45, 110, 101, 108, 99, 99, 104, 97, 45, 96, 104, 126, 126, 108, 106, 104, 45, 111, 98, 105, 116, 45, 97, 104, 99, 106, 121, 101, 45, 100, 126, 45, 100, 99, 110, 98, 127, 127, 104, 110, 121};
        for (int i10 = 0; i10 < 51; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ 13);
        }
        return new String(bArr);
    }

    public static String d() {
        byte[] bArr = new byte[2];
        int[] iArr = {83, 71};
        for (int i10 = 0; i10 < 2; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String d0() {
        byte[] bArr = new byte[48];
        int[] iArr = {84, 103, 99, 29, 111, 96, 93, 110, 106, 92, 22, 88, 92, 84, 96, 95, 85, 91, 14, 90, 81, 94, 93, 74, 79, 76, 6, 71, 83, 71, 91, 1, 73, 82, 254, 75, 81, 71, 70, 249, 71, 73, 246, 58, 65, 67, 70, 74};
        for (int i10 = 0; i10 < 48; i10++) {
            bArr[i10] = (byte) (iArr[i10] + i10);
        }
        return new String(bArr);
    }

    public static String e() {
        byte[] bArr = new byte[39];
        int[] iArr = {124, 97, 111, 43, 109, 108, 98, 104, 98, 114, 102, 108, 111, 111, 54, 118, 115, 125, 127, 59, 126, 120, 108, 124, 129, 117, 66, 124, 115, 69, 127, 129, 135, 132, 120, 121, 145, 140, 130};
        for (int i10 = 0; i10 < 39; i10++) {
            bArr[i10] = (byte) (((iArr[i10] - 142) - i10) ^ 186);
        }
        return new String(bArr);
    }

    public static String e0() {
        byte[] bArr = new byte[46];
        int[] iArr = {ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 233, 228, 161, 242, 228, 226, 244, 243, 228, 161, 226, 233, 224, 239, 239, 228, 237, 161, 236, 228, 242, 242, 224, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 228, 161, 231, 238, 243, 236, 224, 245, 161, 232, 242, 161, 232, 239, 226, 238, 243, 243, 228, 226, 245};
        for (int i10 = 0; i10 < 46; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ 129);
        }
        return new String(bArr);
    }

    public static String f() {
        byte[] bArr = new byte[39];
        int[] iArr = {84, 104, 101, 32, 97, 99, 116, 105, 118, 97, 116, 105, 111, 110, 32, 99, 111, 100, 101, 32, 108, 101, 110, 103, 116, 104, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 39; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String f0() {
        byte[] bArr = new byte[46];
        int[] iArr = {218, 27, 235, 151, 204, 235, 203, 236, 188, 235, 151, 203, 27, 171, 123, 123, 235, 91, 151, 107, 235, 204, 204, 171, 11, 235, 151, 91, 235, 123, 11, 220, 27, 151, 43, 204, 151, 43, 123, 203, 139, 188, 188, 235, 203, 220};
        for (int i10 = 0; i10 < 46; i10++) {
            int i11 = iArr[i10] + 107;
            bArr[i10] = (byte) ((((i11 & 255) >> 4) | (i11 << 4)) & 255);
        }
        return new String(bArr);
    }

    public static String g() {
        byte[] bArr = new byte[30];
        int[] iArr = {84, 104, 101, 32, 97, 99, 116, 105, 118, 97, 116, 105, 111, 110, 32, 99, 111, 100, 101, 32, 105, 115, 32, 105, 110, 118, 97, 108, 105, 100};
        for (int i10 = 0; i10 < 30; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String g0() {
        byte[] bArr = new byte[67];
        int[] iArr = {84, 104, 101, 32, 115, 101, 99, 117, 114, 101, 32, 99, 104, 97, 110, 110, 101, 108, 32, 109, 101, 115, 115, 97, 103, 101, 32, 105, 115, 32, 110, 111, 116, 32, 100, 101, 100, 105, 99, 97, 116, 101, 100, 32, 116, 111, 32, 116, 104, 101, 32, 99, 117, 114, 114, 101, 110, 116, 32, 68, 73, 71, 73, 80, 65, 83, 83};
        for (int i10 = 0; i10 < 67; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String h() {
        byte[] bArr = new byte[27];
        int[] iArr = {236, 216, 223, 160, 227, 221, 204, 219, 206, 227, 204, 219, ErrorCodes.ERR_CRY_BAD_PROTO, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 160, 221, ErrorCodes.ERR_CRY_BAD_PROTO, 220, 223, 160, 219, 205, 160, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 207, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE};
        for (int i10 = 0; i10 < 27; i10++) {
            bArr[i10] = (byte) ((iArr[i10] ^ 61) - 125);
        }
        return new String(bArr);
    }

    public static String h0() {
        byte[] bArr = new byte[44];
        int[] iArr = {84, 104, 101, 32, 115, 101, 99, 117, 114, 101, 32, 99, 104, 97, 110, 110, 101, 108, 32, 109, 101, 115, 115, 97, 103, 101, 32, 116, 121, 112, 101, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 44; i10++) {
            bArr[i10] = (byte) ((iArr[i10] + i10) - i10);
        }
        return new String(bArr);
    }

    public static String i() {
        byte[] bArr = new byte[34];
        int[] iArr = {84, 103, 99, 29, 95, 109, 115, 105, 108, 102, 22, 86, 100, 99, 94, 90, 83, 80, 98, 86, 91, 89, 10, 82, 91, 7, 74, 78, 87, 68, 68, 77, 69, 67};
        for (int i10 = 0; i10 < 34; i10++) {
            bArr[i10] = (byte) (iArr[i10] + i10);
        }
        return new String(bArr);
    }

    public static String i0() {
        byte[] bArr = new byte[34];
        int[] iArr = {130, 150, 147, 78, 161, 147, 145, 163, 160, 147, 78, 145, 150, 143, 156, 156, 147, 154, 78, 155, 147, 161, 161, 143, 149, 147, 78, 151, 161, 78, 156, 163, 154, 154};
        for (int i10 = 0; i10 < 34; i10++) {
            bArr[i10] = (byte) (iArr[i10] + ErrorCodes.ERR_CRY_IO_PROPERTIES);
        }
        return new String(bArr);
    }

    public static String j() {
        byte[] bArr = new byte[58];
        int[] iArr = {Opcodes.IFNULL, 229, 220, 151, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 221, 151, 235, 223, 220, 151, 219, 216, 235, 216, 151, 221, 224, 220, 227, 219, 234, 151, 235, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 151, 234, 224, 222, 229, 151, 218, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 229, 235, 216, 224, 229, 234, 151, 224, 229, 237, 216, 227, 224, 219, 151, 218, 223, 216, 233, 216, 218, 235, 220, 233, 234};
        for (int i10 = 0; i10 < 58; i10++) {
            bArr[i10] = (byte) (iArr[i10] + 137);
        }
        return new String(bArr);
    }

    public static String j0() {
        byte[] bArr = new byte[54];
        int[] iArr = {94, 114, 111, 42, 125, 115, 113, 120, 107, 126, 127, 124, 111, 42, 121, 112, 42, 126, 114, 111, 42, 125, 111, 109, 127, 124, 111, 42, 109, 114, 107, 120, 120, 111, 118, 42, 119, 111, 125, 125, 107, 113, 111, 42, 115, 125, 42, 115, 120, 128, 107, 118, 115, 110};
        for (int i10 = 0; i10 < 54; i10++) {
            bArr[i10] = (byte) (iArr[i10] + 246);
        }
        return new String(bArr);
    }

    public static String k() {
        byte[] bArr = new byte[33];
        int[] iArr = {188, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 205, 136, 203, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 201, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 205, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 207, 205, 136, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 205, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 207, 220, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 136, ErrorCodes.ERR_CRY_BAD_PROTO, 219, 136, ErrorCodes.ERR_CRY_BAD_PROTO, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 203, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, 218, 218, 205, 203, 220};
        for (int i10 = 0; i10 < 33; i10++) {
            bArr[i10] = (byte) (iArr[i10] - 104);
        }
        return new String(bArr);
    }

    public static String k0() {
        byte[] bArr = new byte[103];
        int[] iArr = {84, 104, 101, 32, 115, 116, 97, 116, 105, 99, 32, 118, 101, 99, 116, 111, 114, 32, 99, 111, 110, 116, 97, 105, 110, 101, 100, 32, 105, 110, 32, 116, 104, 101, 32, 115, 101, 99, 117, 114, 101, 32, 99, 104, 97, 110, 110, 101, 108, 32, 109, 101, 115, 115, 97, 103, 101, 32, 105, 115, 32, 110, 111, 116, 32, 101, 113, 117, 97, 108, 32, 116, 111, 32, 116, 104, 101, 32, 111, 110, 101, 32, 112, 114, 111, 118, 105, 100, 101, 100, 32, 97, 115, 32, 112, 97, 114, 97, 109, 101, 116, 101, 114};
        for (int i10 = 0; i10 < 103; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String l() {
        byte[] bArr = new byte[21];
        int[] iArr = {84, 103, 99, 29, 95, 99, 91, 101, 100, 92, 100, 92, 89, 19, 91, 100, 16, 93, 99, 89, 88};
        for (int i10 = 0; i10 < 21; i10++) {
            bArr[i10] = (byte) (iArr[i10] + i10);
        }
        return new String(bArr);
    }

    public static String l0() {
        byte[] bArr = new byte[37];
        int[] iArr = {84, 104, 101, 32, 115, 101, 114, 105, 97, 108, 32, 110, 117, 109, 98, 101, 114, 32, 108, 101, 110, 103, 116, 104, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 37; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String m() {
        byte[] bArr = new byte[36];
        int[] iArr = {84, 105, 103, 35, 71, 113, 111, 108, 118, 125, 42, 94, 111, 124, 128, 116, 48, 119, 119, 116, 136, 138, 136, 124, 56, 130, 141, 59, 128, 134, 145, 128, 130, 141, 135, 135};
        for (int i10 = 0; i10 < 36; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }

    public static String m0() {
        byte[] bArr = new byte[25];
        int[] iArr = {0, 243, Opcodes.IFNULL, ErrorCodes.ERR_CRY_IO_PROPERTIES, 128, 203, 158, 253, 220, 235, 219, 149, 176, 147, Opcodes.IFNULL, 245, 136, 192, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 177, Opcodes.MULTIANEWARRAY, 159, 186, 153, 152};
        for (int i10 = 0; i10 < 25; i10++) {
            int i11 = (iArr[i10] ^ 81) - i10;
            bArr[i10] = (byte) ((((i11 & 255) >> 2) | (i11 << 6)) & 255);
        }
        return new String(bArr);
    }

    public static String n() {
        byte[] bArr = new byte[39];
        int[] iArr = {84, 105, 103, 35, 103, 119, 127, 119, 124, 120, 42, 108, 124, 125, 122, 120, 115, 114, 134, 124, 131, 131, 54, 128, 134, 125, 127, 147, 60, 134, 145, 63, 137, 143, 152, 132, 144, 142, 138};
        for (int i10 = 0; i10 < 39; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }

    public static String n0() {
        byte[] bArr = new byte[41];
        int[] iArr = {240, 204, Opcodes.INSTANCEOF, 132, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, Opcodes.INSTANCEOF, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, ErrorCodes.ERR_CRY_IO_PROPERTIES, Opcodes.INSTANCEOF, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 132, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, ErrorCodes.ERR_CRY_BAD_PROTO, Opcodes.IFNULL, 200, 205, Opcodes.IFNONNULL, 132, 207, Opcodes.INSTANCEOF, 221, 132, 200, Opcodes.INSTANCEOF, 202, Opcodes.MONITOREXIT, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 204, 132, 205, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, 132, 205, 202, Opcodes.IFNONNULL, 203, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, Opcodes.INSTANCEOF, Opcodes.IFNONNULL, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY};
        for (int i10 = 0; i10 < 41; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ 164);
        }
        return new String(bArr);
    }

    public static String o() {
        byte[] bArr = new byte[31];
        int[] iArr = {229, 216, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 146, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, Opcodes.IFNULL, 206, Opcodes.IFNULL, 205, 201, 155, 201, 192, Opcodes.INSTANCEOF, Opcodes.IFNONNULL, Opcodes.INSTANCEOF, 207, 203, 52, 49, 133, 207, 56, 134, 48, 54, 33, 205, 57, 55, 51};
        for (int i10 = 0; i10 < 31; i10++) {
            bArr[i10] = (byte) ((iArr[i10] ^ 177) - i10);
        }
        return new String(bArr);
    }

    public static String o0() {
        byte[] bArr = new byte[91];
        int[] iArr = {34, 30, 19, 86, 21, 3, 27, 3, 26, 23, 2, 31, 0, 19, 86, 5, 31, 12, 19, 86, 25, 16, 86, 2, 30, 19, 86, 23, 21, 2, 31, 0, 23, 2, 31, 25, 24, 86, 6, 23, 5, 5, 1, 25, 4, 18, 86, 23, 24, 18, 86, 2, 30, 19, 86, 24, 25, 24, 21, 19, 86, 31, 5, 86, 2, 25, 25, 86, 30, 31, 17, 30, 86, 94, 26, 31, 27, 31, 2, 76, 86, 67, 71, 68, 86, 20, 15, 2, 19, 5, 95};
        for (int i10 = 0; i10 < 91; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ 118);
        }
        return new String(bArr);
    }

    public static String p() {
        byte[] bArr = new byte[26];
        int[] iArr = {103, 91, 86, 19, 80, 65, 74, 67, 71, 92, 19, 94, 92, 87, 86, 19, 90, 64, 19, 90, 93, 69, 82, 95, 90, 87};
        for (int i10 = 0; i10 < 26; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ 51);
        }
        return new String(bArr);
    }

    public static String p0() {
        byte[] bArr = new byte[37];
        int[] iArr = {84, 105, 103, 35, 119, 121, 103, 123, 113, 108, 42, 129, 113, 112, 130, 126, 130, 49, 120, 130, 134, 130, 119, 139, 56, 130, 141, 59, 133, 139, 129, 142, 146, 147, 135, 134, 152};
        for (int i10 = 0; i10 < 37; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }

    public static String q() {
        byte[] bArr = new byte[50];
        int[] iArr = {79, 109, 99, 29, 107, 97, 26, 109, 96, 92, 22, 89, 85, 103, 83, 17, 86, 88, 83, 89, 80, 94, 10, 93, 87, 7, 89, 78, 75, 81, 2, 77, 69, 77, 69, 81, 68, 251, 67, 76, 248, 64, 68, 56, 67, 69, 68, 54, 51, 67};
        for (int i10 = 0; i10 < 50; i10++) {
            bArr[i10] = (byte) (iArr[i10] + i10);
        }
        return new String(bArr);
    }

    public static String q0() {
        byte[] bArr = new byte[37];
        int[] iArr = {225, 221, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 149, Opcodes.IFNULL, Opcodes.INSTANCEOF, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, Opcodes.INSTANCEOF, 220, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 149, Opcodes.MONITOREXIT, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, Opcodes.INSTANCEOF, 218, Opcodes.IFNONNULL, 149, 217, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 219, ErrorCodes.ERR_CRY_IO_PROPERTIES, Opcodes.INSTANCEOF, 221, 149, 220, Opcodes.IFNULL, 149, 220, 219, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 218, Opcodes.IFNONNULL, Opcodes.IFNONNULL, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, Opcodes.INSTANCEOF};
        for (int i10 = 0; i10 < 37; i10++) {
            bArr[i10] = (byte) (((iArr[i10] ^ 181) ^ i10) ^ i10);
        }
        return new String(bArr);
    }

    public static String r() {
        byte[] bArr = new byte[38];
        int[] iArr = {79, 111, 103, 35, 115, 107, 38, 123, 112, 110, 42, 111, 109, 129, 111, 47, 118, 122, 119, 127, 120, 136, 54, 139, 135, 57, 141, 132, 131, 139, 62, 136, 147, 65, 144, 152, 144, 145};
        for (int i10 = 0; i10 < 38; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }

    public static String r0() {
        byte[] bArr = new byte[25];
        int[] iArr = {161, 179, 174, 103, 184, 183, 162, 179, 166, 158, 89, 173, 154, 150, 165, 158, 159, 75, 146, 154, 69, 145, 150, 139, 137};
        for (int i10 = 0; i10 < 25; i10++) {
            bArr[i10] = (byte) androidx.appcompat.widget.c.a(iArr[i10], i10, -77, i10);
        }
        return new String(bArr);
    }

    public static String s() {
        byte[] bArr = new byte[29];
        int[] iArr = {84, 104, 101, 32, 100, 97, 116, 97, 32, 102, 105, 101, 108, 100, 115, 32, 97, 114, 114, 97, 121, 32, 105, 115, 32, 110, 117, 108, 108};
        for (int i10 = 0; i10 < 29; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String s0() {
        byte[] bArr = new byte[56];
        int[] iArr = {84, 105, 103, 35, 72, 78, 77, 80, 88, 74, 93, 94, 44, 128, 130, 112, 132, 134, 133, 51, 125, 136, 54, 128, 134, 143, 123, 135, 133, 129, 62, 71, 142, 144, 150, 67, 133, 136, 154, 144, 158, 138, 158, 144, 144, 77, 157, 161, 80, 157, 161, 150, 159, 154, 154, 96};
        for (int i10 = 0; i10 < 56; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }

    public static String t() {
        byte[] bArr = new byte[34];
        int[] iArr = {84, 104, 101, 32, 100, 97, 116, 97, 32, 102, 105, 101, 108, 100, 115, 32, 97, 114, 101, 32, 110, 111, 116, 32, 99, 111, 110, 116, 105, 103, 117, 111, 117, 115};
        for (int i10 = 0; i10 < 34; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String t0() {
        byte[] bArr = new byte[20];
        int[] iArr = {79, 113, 103, 113, 101, 113, 111, 104, 102, 41, 121, 126, 111, 110, 107, 124, 99, 119, 103, 127};
        for (int i10 = 0; i10 < 20; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ i10);
        }
        return new String(bArr);
    }

    public static String u() {
        byte[] bArr = new byte[44];
        int[] iArr = {84, 104, 101, 32, 110, 117, 109, 98, 101, 114, 32, 111, 102, 32, 100, 97, 116, 97, 32, 102, 105, 101, 108, 100, 115, 32, 116, 111, 32, 115, 105, 103, 110, 32, 105, 115, 32, 105, 110, 118, 97, 108, 105, 100};
        for (int i10 = 0; i10 < 44; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String u0() {
        byte[] bArr = new byte[37];
        int[] iArr = {84, 105, 103, 35, 120, 116, 113, 108, 118, 41, 110, 112, 126, 118, 132, 112, 132, 122, 129, 129, 52, 126, 137, 55, 134, 136, 142, 59, 143, 146, 142, 143, 143, 147, 150, 136, 136};
        for (int i10 = 0; i10 < 37; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }

    public static String v() {
        byte[] bArr = new byte[38];
        int[] iArr = {183, 48, 145, 57, 177, 18, 240, 17, 144, 16, 81, 57, 243, 145, 81, 179, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 115, 57, 241, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 115, 144, 17, 179, 57, 16, 83, 57, 16, 240, 81, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 115, 115, 145, 81, 179};
        for (int i10 = 0; i10 < 38; i10++) {
            int i11 = iArr[i10];
            int i12 = ((i11 & 255) >> 1) | (i11 << 7);
            bArr[i10] = (byte) (((((i12 & 255) >> 4) | ((i12 & 255) << 4)) & 255) ^ 233);
        }
        return new String(bArr);
    }

    public static String v0() {
        byte[] bArr = new byte[18];
        int[] iArr = {85, 109, 105, 107, 107, 114, 104, 25, 93, 105, 104, 100, 102, 19, 85, 96, 84, 84};
        for (int i10 = 0; i10 < 18; i10++) {
            bArr[i10] = (byte) (iArr[i10] + i10);
        }
        return new String(bArr);
    }

    public static String w() {
        byte[] bArr = new byte[38];
        int[] iArr = {15, 62, 66, 88, 67, 47, 75, 25, 64, 67, 28, 80, 73, 27, 16, 64, 22, 68, 101, 28, 20, 28, 20, 24, 19, 94, 38, 27, 95, 39, 19, 31, 38, 20, 19, 33, 118, 38};
        for (int i10 = 0; i10 < 38; i10++) {
            bArr[i10] = (byte) (((iArr[i10] - 141) ^ ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND) + i10);
        }
        return new String(bArr);
    }

    public static String w0() {
        byte[] bArr = new byte[59];
        int[] iArr = {85, 110, 107, 110, 111, 119, 110, 32, 101, 114, 114, 111, 114, 58, 32, 111, 99, 99, 117, 114, 115, 32, 119, 104, 101, 110, 32, 97, 110, 32, 117, 110, 109, 97, 110, 97, 103, 101, 100, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 32, 105, 115, 32, 114, 97, 105, 115, 101, 100};
        for (int i10 = 0; i10 < 59; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String x() {
        byte[] bArr = new byte[26];
        int[] iArr = {84, 104, 101, 32, 100, 121, 110, 97, 109, 105, 99, 32, 118, 101, 99, 116, 111, 114, 32, 105, 115, 32, 110, 117, 108, 108};
        for (int i10 = 0; i10 < 26; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String x0() {
        byte[] bArr = new byte[28];
        int[] iArr = {90, 132, 128, 248, 106, 70, 98, 70, 2, 144, 164, 172, 164, 142, 183, 16, 164, 187, 22, 170, 183, 162, 189, Opcodes.MULTIANEWARRAY, Opcodes.IFNONNULL, 174, 172, ErrorCodes.ERR_CRY_BAD_PROTO};
        for (int i10 = 0; i10 < 28; i10++) {
            int i11 = iArr[i10] - 178;
            bArr[i10] = (byte) (((((i11 & 255) >> 1) | (i11 << 7)) & 255) - i10);
        }
        return new String(bArr);
    }

    public static String y() {
        byte[] bArr = new byte[38];
        int[] iArr = {40, 60, 57, 244, 57, 66, 55, 70, 77, 68, 72, 61, 67, 66, 244, 63, 57, 77, 244, 64, 57, 66, 59, 72, 60, 244, 61, 71, 244, 61, 66, 55, 67, 70, 70, 57, 55, 72};
        for (int i10 = 0; i10 < 38; i10++) {
            bArr[i10] = (byte) (iArr[i10] + 44);
        }
        return new String(bArr);
    }

    public static String y0() {
        byte[] bArr = new byte[28];
        int[] iArr = {84, 104, 101, 32, 88, 69, 82, 67, 32, 108, 101, 110, 103, 116, 104, 32, 105, 115, 32, 105, 110, 99, 111, 114, 114, 101, 99, 116};
        for (int i10 = 0; i10 < 28; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static String z() {
        byte[] bArr = new byte[26];
        int[] iArr = {17, 60, 62, 130, 68, 58, 64, 48, 52, 44, 39, 67, 66, 66, 119, 65, 48, 61, 115, 43, 62, 112, 45, 67, 49, 48};
        for (int i10 = 0; i10 < 26; i10++) {
            bArr[i10] = (byte) (((iArr[i10] - 134) ^ 223) ^ i10);
        }
        return new String(bArr);
    }

    public static String z0() {
        byte[] bArr = new byte[28];
        int[] iArr = {91, 254, 189, 53, 92, 57, 185, 57, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 190, 125, 0, 253, 94, 32, 182, 0, 29, 23, 32, 32, 159, 0, 125, 30, 96, 0, 190};
        for (int i10 = 0; i10 < 28; i10++) {
            int i11 = iArr[i10] - 209;
            bArr[i10] = (byte) (((((i11 & 255) >> 5) | (i11 << 3)) & 255) ^ i10);
        }
        return new String(bArr);
    }

    public static String c() {
        byte[] bArr = new byte[2];
        int[] iArr = {82, 78};
        for (int i10 = 0; i10 < 2; i10++) {
            bArr[i10] = (byte) (iArr[i10] ^ i10);
        }
        return new String(bArr);
    }

    public static int b(byte[] bArr) {
        byte b10;
        byte b11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b12;
        byte b13;
        byte b14;
        int i16;
        int i17;
        byte b15;
        int i18;
        int i19;
        byte b16;
        int i20;
        int i21;
        byte b17;
        if (q.f(bArr)) {
            return DigipassSDKReturnCodes.STATIC_VECTOR_NULL;
        }
        byte b18 = bArr[0];
        if (bArr.length != 56 || b18 != 56) {
            return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH;
        }
        int i22 = bArr[21] & 255;
        if (i22 != 27 && i22 != 47 && i22 != 139 && i22 != 159 && i22 != 34 && i22 != 54 && i22 != 146 && i22 != 166 && i22 != 30 && i22 != 46 && i22 != 142 && i22 != 158) {
            return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
        }
        byte b19 = bArr[23];
        if (b19 != 0 && b19 != 1 && b19 != 2 && b19 != 15) {
            return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
        }
        byte b20 = bArr[24];
        if (b19 != 15 && (b20 < 4 || b20 > 15)) {
            return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
        }
        byte b21 = bArr[25];
        if ((b21 == 0 || b21 == 1 || b21 == 2) && (b10 = bArr[26]) >= 0 && b10 <= 9 && (((b11 = bArr[27]) == 15 || (b11 >= 0 && b11 <= 9)) && (i10 = bArr[28] & 255) >= 10 && i10 <= 200 && (i11 = (bArr[29] & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) >= 0 && i11 <= 255)) {
            byte b22 = bArr[30];
            if (i11 != 0 && b22 != 1) {
                return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
            }
            byte b23 = bArr[36];
            int i23 = b23 & 15;
            byte b24 = bArr[39];
            if (i23 == 0) {
                i23 = 16;
            }
            int i24 = 17;
            if (b24 == 2) {
                if (i23 == 1) {
                    i23 = 17;
                } else if (i23 == 2) {
                    i23 = 18;
                } else if (i23 == 3) {
                    i23 = 19;
                } else if (i23 == 4) {
                    i23 = 20;
                    i12 = 20;
                }
                i12 = 20;
            } else {
                i12 = 16;
            }
            if (i23 < 4 || i23 > i12 || (i13 = (b23 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) < 0 || i13 > 10 || i23 + i13 > i12) {
                return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
            }
            if (bArr[37] == 1 && i13 > 0) {
                return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
            }
            byte b25 = bArr[45];
            int i25 = b25 & 15;
            byte b26 = bArr[49];
            if (b26 >= 0 && b26 <= 2) {
                if (i25 == 0) {
                    i25 = 16;
                }
                if (b26 != 2) {
                    i24 = i25;
                    i14 = 16;
                } else if (i25 == 1) {
                    i14 = 20;
                } else {
                    if (i25 == 2) {
                        i24 = 18;
                    } else if (i25 == 3) {
                        i24 = 19;
                    } else if (i25 != 4) {
                        i24 = i25;
                    } else {
                        i14 = 20;
                        i24 = 20;
                    }
                    i14 = 20;
                }
                if (i24 < 4 || i24 > i14 || (i15 = (b25 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) < 0 || i15 > 10 || i24 + i15 > i14) {
                    return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
                }
                if ((bArr[46] != 1 || i15 <= 0) && (b12 = bArr[47]) >= 0 && b12 <= 3 && (b13 = bArr[48]) >= 0 && b13 <= 8 && (((i16 = (b14 = bArr[50]) & 15) == 15 || (i16 >= 0 && i16 <= 9)) && (i17 = (b14 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) >= 0 && i17 <= 1 && (i18 = (b15 = bArr[51]) & 15) >= 0 && i18 <= 7 && (i19 = (b15 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) >= 0 && i19 <= 3 && (i20 = (b16 = bArr[52]) & 15) >= 0 && i20 <= 7 && (i21 = (b16 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) >= 0 && i21 <= 3 && (b17 = bArr[53]) >= 0 && b17 <= 1)) {
                    return 0;
                }
            }
        }
        return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
    }

    public static DigipassPropertiesResponse a(byte[] bArr, byte[] bArr2, String str) {
        e eVarB;
        try {
            if (bArr == null && bArr2 == null) {
                eVarB = p.a(str);
            } else if (bArr2 == null) {
                eVarB = p.b(bArr);
            } else {
                eVarB = p.b(bArr, bArr2);
            }
            DigipassPropertiesResponse digipassPropertiesResponse = new DigipassPropertiesResponse(0);
            digipassPropertiesResponse.setVersion(eVarB.f65717c.f65748a);
            digipassPropertiesResponse.setStatus(eVarB.f65718d.f65728c);
            digipassPropertiesResponse.setSerialNumber(eVarB.f65717c.f65749b);
            digipassPropertiesResponse.setPasswordMandatory(eVarB.f65717c.f65751d);
            digipassPropertiesResponse.setPasswordProtected(eVarB.f65718d.f65736k);
            digipassPropertiesResponse.setPasswordMinLength(eVarB.f65717c.f65752e);
            digipassPropertiesResponse.setPasswordMaxLength(eVarB.f65717c.f65753f);
            digipassPropertiesResponse.setWeakPasswordControl(eVarB.f65717c.f65754g);
            digipassPropertiesResponse.setPasswordCheckLevel(eVarB.f65717c.f65755h);
            digipassPropertiesResponse.setPenaltyResetAction(eVarB.f65717c.f65758k == 0);
            digipassPropertiesResponse.setPasswordFatal(eVarB.f65717c.f65756i);
            digipassPropertiesResponse.setPasswordFatalCounter(eVarB.f65718d.f65730e);
            digipassPropertiesResponse.setReactivationFatal(eVarB.f65717c.f65757j);
            digipassPropertiesResponse.setReactivationFatalCounter(eVarB.f65718d.f65731f);
            digipassPropertiesResponse.setTokenDerivationSupported(a(eVarB, false));
            digipassPropertiesResponse.setHighSecurity(eVarB.f65717c.f65761o);
            digipassPropertiesResponse.setDpPlusHighSecurity(eVarB.f65717c.f65762p);
            digipassPropertiesResponse.setActivationCodeFormatHexa(eVarB.f65717c.f65763q);
            digipassPropertiesResponse.setUseChecksumForActivationCode(eVarB.f65717c.f65765s);
            digipassPropertiesResponse.setUtcTime(System.currentTimeMillis() / 1000);
            digipassPropertiesResponse.setMasterKey(eVarB.f65717c.f65750c);
            digipassPropertiesResponse.setIterationNumber(eVarB.f65717c.f65759l);
            digipassPropertiesResponse.setIterationPower(eVarB.f65717c.m);
            digipassPropertiesResponse.setUseSecretDerivation(eVarB.f65717c.f65764r);
            digipassPropertiesResponse.setStorageVersion(eVarB.f65718d.f65726a);
            digipassPropertiesResponse.setPinVersion(eVarB.f65718d.f65727b);
            digipassPropertiesResponse.setCreationVersion(eVarB.f65718d.f65737l);
            digipassPropertiesResponse.setTokenDerivationActivated(eVarB.f65718d.m);
            digipassPropertiesResponse.setPasswordDerivationActivated(eVarB.f65718d.f65738n);
            digipassPropertiesResponse.setMultiDeviceActivationEnabled(eVarB.f65717c.f65766t);
            digipassPropertiesResponse.setActivationCryptoApplication(a(eVarB.f65719e));
            digipassPropertiesResponse.setDeviceIdBitsNumber(eVarB.f65717c.f65767u);
            digipassPropertiesResponse.setDeviceType(eVarB.f65718d.f65739o);
            digipassPropertiesResponse.setSequenceNumber(eVarB.f65718d.f65742r);
            digipassPropertiesResponse.setPayloadKeyType(eVarB.f65718d.f65745u);
            digipassPropertiesResponse.setSecureChannelEnabled(eVarB.f65718d.f65746v);
            DigipassPropertiesResponse.Application[] applicationArr = new DigipassPropertiesResponse.Application[eVarB.f65715a];
            d[] dVarArrA = eVarB.a();
            for (int i10 = 0; i10 < eVarB.f65715a; i10++) {
                applicationArr[i10] = a(dVarArrA[i10]);
            }
            digipassPropertiesResponse.setApplications(applicationArr);
            return digipassPropertiesResponse;
        } catch (h e5) {
            return new DigipassPropertiesResponse(e5.a());
        } catch (Exception e7) {
            return new DigipassPropertiesResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    public static byte b(d dVar) {
        b bVar = dVar.f65704e;
        if (bVar.f65683i) {
            return (byte) 5;
        }
        long jB = c.b(bVar.f65675a) & (-33554433);
        if (jB == 20992 || jB == 59393) {
            return (byte) 1;
        }
        if (jB == 255 || jB == 721104) {
            return (byte) 2;
        }
        if (jB == 1037056 || jB == 458752 || jB == 479232 || jB == 196608 || jB == 217088 || jB == 5439488 || jB == 6311936) {
            return (byte) 3;
        }
        return c(dVar);
    }

    public static String b() {
        byte[] bArr = new byte[2];
        int[] iArr = {223, 223};
        for (int i10 = 0; i10 < 2; i10++) {
            bArr[i10] = (byte) (iArr[i10] - 146);
        }
        return new String(bArr);
    }

    private static DigipassPropertiesResponse.Application a(d dVar) {
        DigipassPropertiesResponse.Application application = new DigipassPropertiesResponse.Application();
        if (dVar != null) {
            application.setIndex(dVar.f65702c);
            application.setName(dVar.f65703d);
            application.setEnabled(dVar.f65700a);
            application.setDpPlus(dVar.f65701b);
            application.setResponseLength(dVar.f65709j);
            application.setHostCodeLength(dVar.f65710k);
            application.setCheckDigit(dVar.f65711l);
            application.setDataFieldNumber(dVar.f65706g);
            application.setDataFieldsMinLength(dVar.f65707h);
            application.setDataFieldsMaxLength(dVar.f65708i);
            application.setEventCounter(dVar.f65712n);
            application.setLastTimeUsed(dVar.f65713o);
            application.setTimeBased(dVar.f65704e.f65686l);
            application.setEventBased(dVar.f65704e.f65687n);
            application.setOutputType(dVar.m);
            application.setCodeword(dVar.f65704e.f65675a);
            b bVar = dVar.f65704e;
            long j10 = bVar.f65679e;
            int i10 = 8 << ((int) j10);
            if (bVar.f65690q && j10 > 7) {
                i10 = 15 << ((int) (j10 % 8));
            }
            application.setTimeStep(i10);
            int i11 = dVar.f65714p;
            if (i11 == 1) {
                application.setAuthenticationMode(c());
            } else if (i11 == 2) {
                application.setAuthenticationMode(a());
            } else if (i11 == 3) {
                application.setAuthenticationMode(d());
            } else if (i11 == 4) {
                application.setAuthenticationMode(b());
            }
            application.setScoreCapable(dVar.f65704e.D);
        }
        return application;
    }

    public static String a(int i10) {
        if (i10 == -4999) {
            return w0();
        }
        if (i10 == -4059) {
            return D();
        }
        if (i10 == 0) {
            return t0();
        }
        if (i10 == -4045) {
            return n0();
        }
        if (i10 != -4044) {
            switch (i10) {
                case DigipassSDKReturnCodes.PROVIDED_PASSWORD_AS_STRING_LENGTH_TOO_LONG /* -4087 */:
                    return W();
                case DigipassSDKReturnCodes.PROVIDED_PASSWORD_AS_STRING_LENGTH_TOO_SHORT /* -4086 */:
                    return X();
                case DigipassSDKReturnCodes.PROTECTION_TYPE_NOT_SUPPORTED /* -4085 */:
                    return V();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_INCORRECT_FORMAT /* -4084 */:
                    return b0();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_INCORRECT_LENGTH /* -4083 */:
                    return c0();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_NULL_OR_EMPTY /* -4082 */:
                    return d0();
                case DigipassSDKReturnCodes.SCORE_INVALID /* -4081 */:
                    return Z();
                case DigipassSDKReturnCodes.CLIENT_SCORE_DISABLED /* -4080 */:
                    return m();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_DISABLED /* -4079 */:
                    return a0();
                case DigipassSDKReturnCodes.MULTI_DEVICE_ACTIVATION_ENABLED /* -4078 */:
                    return L();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_TARGET /* -4077 */:
                    return g0();
                case DigipassSDKReturnCodes.LICENSE_INCORRECT /* -4076 */:
                    return J();
                case DigipassSDKReturnCodes.MULTI_DEVICE_ACTIVATION_DISABLED /* -4075 */:
                    return K();
                case DigipassSDKReturnCodes.PLATFORM_ACTIVATION_KEY_INVALID /* -4074 */:
                    return T();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_STATIC_VECTOR_INCONSISTENT /* -4073 */:
                    return k0();
                case DigipassSDKReturnCodes.JAILBREAK_STATUS_INVALID /* -4072 */:
                    return G();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_SIGNATURE_INVALID /* -4071 */:
                    return j0();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_TYPE /* -4070 */:
                    return h0();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_LENGTH /* -4069 */:
                    return f0();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_FORMAT /* -4068 */:
                    return e0();
                case DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NULL /* -4067 */:
                    return i0();
                case DigipassSDKReturnCodes.NOT_PASSWORD_PROTECTED /* -4066 */:
                    return M();
                case DigipassSDKReturnCodes.DATA_FIELDS_NOT_CONTIGUOUS /* -4065 */:
                    return t();
                case DigipassSDKReturnCodes.PLATFORM_FINGERPRINT_NOT_DEFINED /* -4064 */:
                    return U();
                case DigipassSDKReturnCodes.TOKEN_DERIVATION_NOT_SUPPORTED /* -4063 */:
                    return u0();
                default:
                    switch (i10) {
                        case DigipassSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH /* -4056 */:
                            return E();
                        case DigipassSDKReturnCodes.INPUT_DATA_NULL /* -4055 */:
                            return F();
                        case DigipassSDKReturnCodes.KEY_INCORRECT_LENGTH /* -4054 */:
                            return H();
                        case DigipassSDKReturnCodes.KEY_NULL /* -4053 */:
                            return I();
                        case DigipassSDKReturnCodes.CRYPTO_MODE_INVALID /* -4052 */:
                            return p();
                        case DigipassSDKReturnCodes.CRYPTO_MECANISM_INVALID /* -4051 */:
                            return o();
                        default:
                            switch (i10) {
                                case DigipassSDKReturnCodes.DATA_FIELD_INCORRECT_LENGTH /* -4039 */:
                                    return q();
                                case DigipassSDKReturnCodes.DATA_FIELD_NULL /* -4038 */:
                                    return r();
                                case DigipassSDKReturnCodes.DATA_FIELDS_NUMBER_INVALID /* -4037 */:
                                    return u();
                                case DigipassSDKReturnCodes.DATA_FIELDS_ARRAY_NULL /* -4036 */:
                                    return s();
                                case DigipassSDKReturnCodes.CHALLENGE_INCORRECT_LENGTH /* -4035 */:
                                    return k();
                                case DigipassSDKReturnCodes.CHALLENGE_NULL /* -4034 */:
                                    return l();
                                case DigipassSDKReturnCodes.APPLICATION_DISABLED /* -4033 */:
                                    return i();
                                case DigipassSDKReturnCodes.CRYPTO_APPLICATION_INDEX_INVALID /* -4032 */:
                                    return n();
                                case DigipassSDKReturnCodes.STATUS_INVALID /* -4031 */:
                                    return s0();
                                case DigipassSDKReturnCodes.PASSWORD_LOCK /* -4030 */:
                                    return P();
                                case DigipassSDKReturnCodes.PASSWORD_WRONG /* -4029 */:
                                    return S();
                                case DigipassSDKReturnCodes.PASSWORD_WEAK /* -4028 */:
                                    return R();
                                case DigipassSDKReturnCodes.PASSWORD_LENGTH_TOO_LONG /* -4027 */:
                                    return N();
                                case DigipassSDKReturnCodes.PASSWORD_LENGTH_TOO_SHORT /* -4026 */:
                                    return O();
                                case DigipassSDKReturnCodes.PASSWORD_NULL /* -4025 */:
                                    return Q();
                                case DigipassSDKReturnCodes.REACTIVATION_LOCK /* -4024 */:
                                    return Y();
                                case DigipassSDKReturnCodes.ACTIVATION_CODE_INVALID /* -4023 */:
                                    return g();
                                case DigipassSDKReturnCodes.SHARED_SECRET_TOO_LONG /* -4022 */:
                                    return o0();
                                case DigipassSDKReturnCodes.XERC_INCORRECT_FORMAT /* -4021 */:
                                    return x0();
                                case DigipassSDKReturnCodes.XERC_INCORRECT_LENGTH /* -4020 */:
                                    return y0();
                                case DigipassSDKReturnCodes.XFAD_INCORRECT_FORMAT /* -4019 */:
                                    return z0();
                                case DigipassSDKReturnCodes.XFAD_INCORRECT_LENGTH /* -4018 */:
                                    return A0();
                                case DigipassSDKReturnCodes.XFAD_NULL /* -4017 */:
                                    return B0();
                                case DigipassSDKReturnCodes.ERC_INVALID /* -4016 */:
                                    return C();
                                case DigipassSDKReturnCodes.ERC_INCORRECT_FORMAT /* -4015 */:
                                    return A();
                                case DigipassSDKReturnCodes.ERC_INCORRECT_LENGTH /* -4014 */:
                                    return B();
                                case DigipassSDKReturnCodes.ACTIVATION_CODE_INCORRECT_FORMAT /* -4013 */:
                                    return e();
                                case DigipassSDKReturnCodes.ACTIVATION_CODE_INCORRECT_LENGTH /* -4012 */:
                                    return f();
                                case DigipassSDKReturnCodes.ACTIVATION_CODE_NULL /* -4011 */:
                                    return h();
                                case -4010:
                                    return l0();
                                case -4009:
                                    return m0();
                                case DigipassSDKReturnCodes.ENCRYPTION_KEY_INCORRECT_LENGTH /* -4008 */:
                                    return y();
                                case DigipassSDKReturnCodes.ENCRYPTION_KEY_NULL /* -4007 */:
                                    return z();
                                case DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT /* -4006 */:
                                    return v();
                                case DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_LENGTH /* -4005 */:
                                    return w();
                                case DigipassSDKReturnCodes.DYNAMIC_VECTOR_NULL /* -4004 */:
                                    return x();
                                case DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT /* -4003 */:
                                    return p0();
                                case DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH /* -4002 */:
                                    return q0();
                                case DigipassSDKReturnCodes.STATIC_VECTOR_NULL /* -4001 */:
                                    return r0();
                                default:
                                    return v0();
                            }
                    }
            }
        }
        return j();
    }

    public static long a(long j10) {
        return j10 - (System.currentTimeMillis() / 1000);
    }

    public static int a(byte[] bArr) {
        if (bArr == null) {
            return DigipassSDKReturnCodes.ENCRYPTION_KEY_NULL;
        }
        if (bArr.length != 16) {
            return DigipassSDKReturnCodes.ENCRYPTION_KEY_INCORRECT_LENGTH;
        }
        return 0;
    }

    public static int a(String str) {
        if (str == null) {
            return DigipassSDKReturnCodes.XFAD_NULL;
        }
        if (!q.c(str)) {
            return DigipassSDKReturnCodes.XFAD_INCORRECT_FORMAT;
        }
        if (str.length() <= 4) {
            return DigipassSDKReturnCodes.XFAD_INCORRECT_LENGTH;
        }
        if (((byte) (str.charAt(3) - '0')) <= 7) {
            if (str.length() == 146 || str.length() == 142 || str.length() == 166 || str.length() == 158) {
                return 0;
            }
            return DigipassSDKReturnCodes.XFAD_INCORRECT_LENGTH;
        }
        if (str.length() < 205 || str.length() > 1964) {
            return DigipassSDKReturnCodes.XFAD_INCORRECT_LENGTH;
        }
        return 0;
    }

    public static byte a(byte[] bArr, int i10, boolean z10) {
        if (bArr == null || bArr.length < i10) {
            return (byte) -1;
        }
        byte b10 = (byte) (z10 ? 10 : 16);
        byte b11 = (byte) (b10 + 1);
        byte b12 = b10;
        for (int i11 = 0; i11 < i10; i11++) {
            byte bA = c.a(bArr[i11]);
            if (bA < 0) {
                return (byte) -1;
            }
            byte b13 = (byte) (b12 + bA);
            if (b13 > b10) {
                b13 = (byte) (b13 - b10);
            }
            b12 = (byte) (b13 << 1);
            if (b12 > b11) {
                b12 = (byte) (b12 - b11);
            }
        }
        byte b14 = (byte) (b11 - b12);
        byte b15 = b14 != b10 ? b14 : (byte) 0;
        return (byte) (b15 < 10 ? b15 + 48 : b15 + 55);
    }

    public static boolean a(e eVar, boolean z10) {
        if (!eVar.f65717c.f65760n) {
            return false;
        }
        d[] dVarArrA = eVar.a();
        boolean z11 = false;
        for (int i10 = 0; i10 < eVar.f65715a; i10++) {
            d dVar = dVarArrA[i10];
            if ((z10 && dVar.f65701b) || (!z10 && !dVar.f65701b)) {
                byte b10 = b(dVar);
                boolean z12 = (b10 == 1) | (b10 == 2) | (b10 == 4);
                boolean z13 = b10 == 3;
                b bVar = dVar.f65704e;
                z11 = (z13 | z12) & (!bVar.A) & (true ^ bVar.f65690q) & bVar.f65684j;
                if (!z11) {
                    break;
                }
            }
        }
        return z11;
    }

    public static byte[] a(e eVar, d dVar, String str, boolean z10) {
        boolean z11 = z10 || (eVar.f65718d.m && a(eVar, dVar.f65701b));
        if (q.d(str) || !(eVar.f65717c.f65766t || z11)) {
            return null;
        }
        long jB = c.b(q.a(UtilitiesSDK.hash((byte) 3, str.getBytes()).getOutputData(), 0, 4));
        i iVar = eVar.f65717c;
        byte b10 = iVar.f65768v;
        if (b10 == 0) {
            jB >>= (32 - iVar.f65767u) + (iVar.f65766t ? 5 : 0);
        }
        if (iVar.f65766t) {
            jB = (jB << 5) + ((long) (eVar.f65718d.f65739o & 255));
        }
        if (b10 != 0) {
            long j10 = 1;
            for (int i10 = 0; i10 < eVar.f65717c.f65768v; i10++) {
                j10 *= 10;
            }
            jB %= j10;
        }
        return c.a(jB);
    }

    public static String a() {
        byte[] bArr = new byte[2];
        int[] iArr = {ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 149};
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = iArr[i10] ^ i10;
            int i12 = ((i11 & 255) >> 3) | (i11 << 5);
            bArr[i10] = (byte) ((((i12 & 255) >> 3) | ((i12 & 255) << 5)) & 255);
        }
        return new String(bArr);
    }
}
