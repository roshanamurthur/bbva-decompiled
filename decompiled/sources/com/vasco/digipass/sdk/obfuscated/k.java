package com.vasco.digipass.sdk.obfuscated;

import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.esotericsoftware.asm.Opcodes;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import com.vasco.digipass.sdk.responses.DigipassResponse;
import com.vasco.digipass.sdk.responses.GenerateDerivationCodeResponse;
import com.vasco.digipass.sdk.responses.GenerationResponse;
import com.vasco.digipass.sdk.responses.ValidationResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;
import com.veridas.detect.ImageAnalysisKt;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements DigipassSDKConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f65770a = {146, 130, 85, 35, 144, 113, 34, 99, 55, 37, 254, 255, 250, 251, 252, 253, 89, 83, 6, 68, 121, 117, 136, 19, 100, 54, 239, 234, 235, 236, 237, 238, 52, 70, 53, 33, 87, 39, 32, 101, 119, 3, 218, 219, 220, 221, 222, 223, 16, 120, 129, 73, 132, 1, 50, 150, 17, 2, 203, 204, 205, 206, 207, 202, 4, 36, 0, 84, 69, 114, 135, 9, 115, 131, 188, 189, 190, Opcodes.ATHROW, 186, 187, 118, 152, 18, 66, 56, 51, 148, 5, 145, 134, 173, 174, 175, 170, 171, 172, 40, 57, 104, 71, 21, 86, 96, 23, 153, 7, 158, 159, 154, 155, 156, 157, 38, 24, 80, 116, 147, 137, 112, 97, 49, 88, 143, 138, 139, 140, 141, 142, 22, 105, 48, 8, 67, 133, 103, 98, 149, 72, 122, 123, 124, 125, 126, 127, 82, 102, 20, 41, 25, 151, 81, 64, 128, 65, 107, 108, 109, 110, 111, 106, 229, 244, 163, 178, Opcodes.INSTANCEOF, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 233, 248, 167, 182, 92, 93, 94, 95, 90, 91, 245, 164, 179, Opcodes.MONITORENTER, ErrorCodes.ERR_CRY_BAD_PROTO, 224, 249, 168, 183, Opcodes.IFNULL, 77, 78, 79, 74, 75, 76, 165, 180, Opcodes.MONITOREXIT, ErrorCodes.ERR_CRY_IO_PROPERTIES, 225, 240, 169, 184, Opcodes.IFNONNULL, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 62, 63, 58, 59, 60, 61, 181, 196, 211, 226, 241, 160, 185, 200, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 47, 42, 43, 44, 45, 46, Opcodes.MULTIANEWARRAY, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 227, 242, 161, 176, 201, 216, 231, 246, 26, 27, 28, 29, 30, 31, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 228, 243, 162, 177, 192, 217, 232, 247, 166, 11, 12, 13, 14, 15, 10};

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f65771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f65772b;

        public a(String str, String str2) {
            this.f65771a = str;
            this.f65772b = str2;
        }
    }

    public static class b extends DigipassResponse {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f65773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String[] f65774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f65775e;

        public b(int i10, e eVar, String[] strArr, int i11) {
            super(i10);
            this.f65773c = eVar;
            this.f65774d = strArr;
            this.f65775e = i11;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f65776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte f65777b;

        public c(byte[] bArr, byte b10) {
            this.f65776a = bArr;
            this.f65777b = b10;
        }
    }

    private static int a(byte b10, int i10) {
        return (b10 & 255) << i10;
    }

    private static byte b(byte b10, int i10) {
        int i11 = b10 - (b10 > 57 ? (byte) 55 : (byte) 48);
        if ((i10 & 1) == 0) {
            i11 <<= 4;
        }
        return (byte) i11;
    }

    private static void c(byte[] bArr, byte[] bArr2) {
        byte[] bArrA;
        byte[] bArrA2 = q.a(bArr2, 0, 8);
        if (bArr.length == 16) {
            bArrA = q.a(bArr, 0, bArr.length / 2);
        } else {
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArr, 0, bArr3, 0, 8);
            bArrA = bArr3;
        }
        byte[] outputData = UtilitiesSDK.encrypt((byte) 1, (byte) 2, bArrA2, null, bArrA).getOutputData();
        System.arraycopy(outputData, 0, bArr, 0, outputData.length);
        q.g(bArrA2);
    }

    private static void d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArr, 0, bArr3, 0, 32);
        long jA = a(bArr3[0], 24) | a(bArr3[1], 16) | a(bArr3[2], 8) | a(bArr3[3], 0);
        long jA2 = a(bArr3[4], 24) | a(bArr3[5], 16) | a(bArr3[6], 8) | a(bArr3[7], 0);
        long jA3 = a(bArr3[8], 24) | a(bArr3[9], 16) | a(bArr3[10], 8) | a(bArr3[11], 0);
        long jA4 = a(bArr3[12], 24) | a(bArr3[13], 16) | a(bArr3[14], 8) | a(bArr3[15], 0);
        long jA5 = a(bArr3[16], 24) | a(bArr3[17], 16) | a(bArr3[18], 8) | a(bArr3[19], 0);
        byte[] bArrA = com.vasco.digipass.sdk.obfuscated.c.a(jA2 + jA + jA3 + jA4 + jA5 + (a(bArr3[20], 24) | a(bArr3[21], 16) | a(bArr3[22], 8) | a(bArr3[23], 0)) + ((long) (a(bArr3[24], 24) | a(bArr3[25], 16) | a(bArr3[26], 8) | a(bArr3[27], 0))) + ((long) (a(bArr3[28], 24) | a(bArr3[29], 16) | a(bArr3[30], 8) | a(bArr3[31], 0))));
        System.arraycopy(bArrA, 0, bArr2, 0, 4);
        q.g(bArr3);
        q.g(bArrA);
    }

    public static String e() {
        byte[] bArr = new byte[2];
        int[] iArr = {165, 138};
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = iArr[i10];
            bArr[i10] = (byte) ((((i11 & 255) >> 5) | (i11 << 3)) & 255);
        }
        return new String(bArr);
    }

    public static String f() {
        return new String(new byte[]{(byte) (new int[]{5}[0] ^ 72)});
    }

    public static String g() {
        byte[] bArr = new byte[3];
        int[] iArr = {63, 63, 63};
        for (int i10 = 0; i10 < 3; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static GenerationResponse a(byte[] bArr, byte[] bArr2, long j10, int i10, byte[] bArr3, int i11, byte[] bArr4, boolean z10, String str, boolean z11, String[] strArr, boolean z12, String str2, String str3, boolean z13, byte b10, boolean z14) {
        try {
            l.a(bArr3, i11);
            b bVarA = a(bArr, bArr2, i10, bArr3, i11, bArr4, z10, str, z11, strArr, z12, str3, z13, str2, b10, z14);
            if (bVarA.getReturnCode() == 0) {
                GenerationResponse generationResponseA = a(bVarA.f65773c, i10, bVarA.f65774d, str2, j10, false, b10);
                bVarA.f65773c.f();
                return generationResponseA;
            }
            int returnCode = bVarA.getReturnCode();
            e eVar = bVarA.f65773c;
            GenerationResponse generationResponse = new GenerationResponse(returnCode, eVar.f65718d.f65728c, p.a(eVar), bVarA.f65775e, null, null);
            bVarA.f65773c.f();
            return generationResponse;
        } catch (h e5) {
            return a(e5.a());
        } catch (Exception e7) {
            return a(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    private static long b(long j10) {
        if (j10 == 0) {
            return 1L;
        }
        if (j10 == 1) {
            return 8L;
        }
        if (j10 == 2) {
            return 16L;
        }
        if (j10 == 3) {
            return 30L;
        }
        if (j10 == 4) {
            return 32L;
        }
        return j10 == 5 ? 60L : 1L;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    private static boolean b(d dVar, String str) {
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        String upperCase = (bVar.B || bVar.E) ? str : str.toUpperCase();
        for (int i10 = 0; i10 < upperCase.length(); i10++) {
            char cCharAt = upperCase.charAt(i10);
            if (!bVar.B && !bVar.E) {
                if (bVar.f65697x) {
                    return cCharAt >= '%' ? false : false;
                }
                long j10 = bVar.f65676b;
                if (j10 == 1 || j10 == 2) {
                    if ((cCharAt >= '%' || cCharAt > '?') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_')) {
                    }
                } else if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'A' || cCharAt > 'F')) {
                    return false;
                }
            } else {
                long j11 = bVar.f65676b;
                if (j11 == 1 || bVar.E) {
                    if ((cCharAt < '%' || cCharAt > '?') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_' && (cCharAt < 'a' || cCharAt > 'z'))) {
                        return false;
                    }
                } else if (j11 == 2) {
                    char upperCase2 = Character.toUpperCase(cCharAt);
                    if ((upperCase2 < '0' || upperCase2 > '9') && (upperCase2 < 'A' || upperCase2 > 'F')) {
                        return false;
                    }
                } else if (cCharAt < '0' || cCharAt > '9') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void c(d dVar, byte[] bArr) {
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        byte b10 = (byte) (dVar.f65712n % 10);
        byte b11 = dVar.m;
        if (b11 == 1) {
            bArr[0] = (byte) ((bArr[0] & Constants.CVR_B2b8765_1111_APP_DISABLED) + b10);
            return;
        }
        if (b11 == 0) {
            bArr[1] = (byte) (b10 + 48);
        } else if (b11 == 2 && bVar.f65688o) {
            bArr[1] = (byte) Integer.toString(b10).charAt(0);
        }
    }

    private static String b(String str) {
        byte[] outputData = UtilitiesSDK.hash((byte) 3, str.getBytes()).getOutputData();
        b(outputData, 16);
        b(outputData, 8);
        return q.a(outputData).substring(0, 16);
    }

    private static b a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11, byte[] bArr4, boolean z10, String str, boolean z11, String[] strArr, boolean z12, String str2, boolean z13, String str3, byte b10, boolean z14) throws h {
        e eVarB;
        byte[] encryptionKey;
        if (z10) {
            eVarB = p.b(bArr, bArr2, bArr4);
            if (!eVarB.e()) {
                return new b(DigipassSDKReturnCodes.STATUS_INVALID, eVarB, null, 0);
            }
            l.a(eVarB, (byte[]) null, 0, (byte[]) null, 0, bArr4, (String) null);
        } else {
            eVarB = p.b(bArr, bArr2);
            if (!eVarB.e()) {
                return new b(DigipassSDKReturnCodes.STATUS_INVALID, eVarB, null, 0);
            }
        }
        if (i10 != 100 && (i10 < 1 || i10 > eVarB.f65715a)) {
            return new b(DigipassSDKReturnCodes.CRYPTO_APPLICATION_INDEX_INVALID, eVarB, null, 0);
        }
        d dVarA = eVarB.a(i10);
        if (!dVarA.f65700a) {
            return new b(DigipassSDKReturnCodes.APPLICATION_DISABLED, eVarB, null, 0);
        }
        if (eVarB.f65717c.f65766t && q.d(str3)) {
            return new b(DigipassSDKReturnCodes.PLATFORM_FINGERPRINT_NOT_DEFINED, eVarB, null, 0);
        }
        if (!z10) {
            ValidationResponse validationResponseB = l.b(bArr3, i11, eVarB, str3);
            if (validationResponseB.getReturnCode() != 0) {
                return new b(validationResponseB.getReturnCode(), eVarB, null, validationResponseB.getAttemptLeft());
            }
            encryptionKey = validationResponseB.getEncryptionKey();
        } else {
            byte[] bArr5 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, 16);
            encryptionKey = bArr5;
        }
        a(eVarB, dVarA, encryptionKey);
        b bVarA = a(eVarB, dVarA, str, z11, strArr, z12, str2, z13);
        if (!z14 || dVarA.f65704e.D) {
            return (b10 < 0 || b10 > 7) ? new b(DigipassSDKReturnCodes.SCORE_INVALID, eVarB, null, 0) : bVarA;
        }
        return new b(DigipassSDKReturnCodes.CLIENT_SCORE_DISABLED, eVarB, null, 0);
    }

    public static String d() {
        return new String(new byte[]{(byte) (new int[]{190}[0] ^ 237)});
    }

    private static a c(d dVar, String str) {
        String strSubstring;
        String strSubstring2;
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        int i10 = dVar.f65709j;
        int i11 = dVar.f65710k;
        if (bVar.f65691r) {
            strSubstring2 = str.substring(0, i11);
            strSubstring = str.substring(i11);
        } else {
            strSubstring = str.substring(0, i10);
            strSubstring2 = str.substring(i10);
        }
        return new a(strSubstring, strSubstring2);
    }

    private static void b(byte[] bArr, int i10) {
        a(bArr, bArr, i10, i10);
    }

    private static void b(d dVar) {
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        if (bVar.f65697x || !bVar.f65680f) {
            return;
        }
        for (int i10 = 0; i10 < dVar.f65706g; i10++) {
            if (dVar.f65708i[i10] > 8) {
                long j10 = bVar.f65676b;
                if ((j10 == 0 || j10 == 3) && !bVar.f65681g) {
                    bVar.f65681g = true;
                    bVar.C = true;
                }
                if ((j10 == 1 || j10 == 2) && bVar.f65681g) {
                    bVar.f65697x = true;
                    bVar.f65698y = 1L;
                    bVar.C = true;
                    bVar.f65677c = 13L;
                    bVar.f65678d = 13L;
                    return;
                }
                return;
            }
        }
    }

    public static String c() {
        byte[] bArr = new byte[2];
        int[] iArr = {186, ErrorCodes.ERR_CRY_BAD_PROTO};
        for (int i10 = 0; i10 < 2; i10++) {
            bArr[i10] = (byte) (iArr[i10] + 128);
        }
        return new String(bArr);
    }

    private static void b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr3.length + bArr2.length;
        if (length < 32) {
            length = 32;
        }
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArr2, 0, bArr4, bArr3.length, bArr2.length);
        byte[] outputData = UtilitiesSDK.hash((byte) 4, bArr4).getOutputData();
        q.g(bArr4);
        byte[] bArr5 = new byte[4];
        d(outputData, bArr5);
        q.g(outputData);
        q.g(bArr);
        System.arraycopy(bArr5, 0, bArr, 4, 4);
        q.g(bArr5);
    }

    private static void a(e eVar, d dVar, byte[] bArr) {
        g gVar = eVar.f65718d;
        byte[] bArr2 = gVar.f65732g;
        byte[] bArr3 = gVar.f65733h;
        if (dVar.f65701b) {
            bArr2 = gVar.f65734i;
            bArr3 = gVar.f65735j;
        } else if (dVar.f65702c == 100) {
            bArr2 = gVar.f65740p;
            bArr3 = gVar.f65741q;
        }
        byte[] outputData = UtilitiesSDK.decrypt((byte) 3, (byte) 2, bArr, null, bArr3).getOutputData();
        System.arraycopy(outputData, 0, bArr2, 0, 16);
        q.g(outputData);
        q.g(bArr);
    }

    private static void b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, 8);
        System.arraycopy(bArr, 0, bArr3, 8, 8);
        byte[] outputData = UtilitiesSDK.encrypt((byte) 3, (byte) 2, bArr2, null, bArr3).getOutputData();
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[i10] = (byte) (outputData[i10] ^ outputData[i10 + 8]);
        }
    }

    private static void b(d dVar, byte[] bArr, c cVar) {
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        byte b10 = cVar.f65777b;
        byte b11 = dVar.m;
        if (b11 == 1) {
            bArr[0] = (byte) ((bArr[0] & 15) + (b10 << 4));
            return;
        }
        if (b11 == 0) {
            bArr[0] = (byte) (b10 + 48);
        } else if (b11 == 2 && bVar.m) {
            bArr[0] = (byte) Integer.toString(b10).charAt(0);
        }
    }

    private static b a(e eVar, d dVar, String str, boolean z10, String[] strArr, boolean z11, String str2, boolean z12) {
        String[] strArr2;
        int i10 = dVar.f65714p;
        if (i10 == 2 && !z10 && !z11) {
            return new b(DigipassSDKReturnCodes.CHALLENGE_NULL, eVar, null, 0);
        }
        if (i10 == 3 && !z10 && !z11) {
            return new b(DigipassSDKReturnCodes.DATA_FIELD_NULL, eVar, null, 0);
        }
        if (!z10) {
            strArr2 = null;
        } else {
            if (str == null) {
                return new b(DigipassSDKReturnCodes.CHALLENGE_NULL, eVar, null, 0);
            }
            if (str.length() >= dVar.f65707h[0] && str.length() <= dVar.f65708i[0]) {
                if (!b(dVar, str)) {
                    return new b(DigipassSDKReturnCodes.CHALLENGE_CHARACTER_INVALID, eVar, null, 0);
                }
                strArr2 = new String[]{str};
            } else {
                return new b(DigipassSDKReturnCodes.CHALLENGE_INCORRECT_LENGTH, eVar, null, 0);
            }
        }
        if (!z11) {
            strArr = strArr2;
        } else {
            if (strArr == null) {
                return new b(DigipassSDKReturnCodes.DATA_FIELDS_ARRAY_NULL, eVar, null, 0);
            }
            if (strArr.length > dVar.f65706g) {
                return new b(DigipassSDKReturnCodes.DATA_FIELDS_NUMBER_INVALID, eVar, null, 0);
            }
            if (!z12) {
                boolean zD = false;
                for (int i11 = 0; i11 < dVar.f65706g; i11++) {
                    if (i11 < strArr.length) {
                        String str3 = strArr[i11];
                        if (str3 == null) {
                            return new b(DigipassSDKReturnCodes.DATA_FIELD_NULL, eVar, null, 0);
                        }
                        if (str3.length() >= dVar.f65707h[i11] && str3.length() <= dVar.f65708i[i11]) {
                            if (!b(dVar, str3)) {
                                return new b(DigipassSDKReturnCodes.CHALLENGE_CHARACTER_INVALID, eVar, null, 0);
                            }
                            if (zD && !q.d(str3)) {
                                return new b(DigipassSDKReturnCodes.DATA_FIELDS_NOT_CONTIGUOUS, eVar, null, 0);
                            }
                            zD = q.d(str3);
                        } else {
                            return new b(DigipassSDKReturnCodes.DATA_FIELD_INCORRECT_LENGTH, eVar, null, 0);
                        }
                    } else if (dVar.f65707h[i11] > 0) {
                        return new b(DigipassSDKReturnCodes.DATA_FIELDS_NUMBER_INVALID, eVar, null, 0);
                    }
                }
            } else {
                b bVarA = a(eVar, strArr);
                if (bVarA.getReturnCode() != 0) {
                    return bVarA;
                }
                strArr = bVarA.f65774d;
            }
        }
        if (str2 != null) {
            b bVarA2 = a(eVar, str2, strArr);
            if (bVarA2.getReturnCode() != 0) {
                return bVarA2;
            }
            strArr = bVarA2.f65774d;
        }
        return new b(0, eVar, strArr, 0);
    }

    private static a b(d dVar, byte[] bArr) {
        String strSubstring;
        String strSubstring2;
        String str;
        String strSubstring3;
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        int i10 = dVar.f65709j;
        int i11 = dVar.f65710k;
        int i12 = i10 + i11;
        byte b10 = dVar.m;
        if (b10 == 1) {
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArr) {
                String hexString = Integer.toHexString(b11 & 255);
                if (!bVar.f65691r && hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            String upperCase = sb2.toString().toUpperCase();
            if (bVar.f65691r && i12 < 14) {
                strSubstring3 = upperCase.substring(14 - i12, 14);
            } else {
                strSubstring3 = upperCase.substring(0, i12);
            }
            return c(dVar, strSubstring3);
        }
        if (b10 == 0) {
            if (bVar.f65691r && i12 < 14) {
                str = new String(bArr, 14 - i12, i12);
            } else {
                str = new String(bArr, 0, i12);
            }
            return c(dVar, str);
        }
        if (!bVar.f65688o && !bVar.m) {
            String strA = q.a(bArr);
            String strSubstring4 = strA.substring(strA.length() - i12);
            strSubstring = strSubstring4.substring(0, i11);
            strSubstring2 = strSubstring4.substring(i11);
        } else {
            String str2 = new String(bArr, 0, i12);
            if (bVar.f65691r) {
                strSubstring = str2.substring(0, i11);
                strSubstring2 = str2.substring(i11);
            } else {
                String strSubstring5 = str2.substring(0, i10);
                strSubstring = str2.substring(i10);
                strSubstring2 = strSubstring5;
            }
        }
        return new a(strSubstring2, strSubstring);
    }

    public static String b() {
        byte[] bArr = new byte[4];
        int[] iArr = {58, 68, 47, 84};
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }

    private static b a(e eVar, String[] strArr) {
        int length = strArr.length;
        int i10 = 0;
        int length2 = 0;
        while (true) {
            String[] strArr2 = null;
            if (i10 >= length) {
                if (length2 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (String str : strArr) {
                        sb2.append(str);
                    }
                    strArr2 = new String[]{b(sb2.toString())};
                }
                return new b(0, eVar, strArr2, 0);
            }
            String str2 = strArr[i10];
            if (str2 == null) {
                return new b(DigipassSDKReturnCodes.DATA_FIELD_NULL, eVar, null, 0);
            }
            if (str2.length() > 32000) {
                return new b(DigipassSDKReturnCodes.DATA_FIELD_INCORRECT_LENGTH, eVar, null, 0);
            }
            for (int i11 = 0; i11 < str2.length(); i11++) {
                char cCharAt = str2.charAt(i11);
                if (cCharAt < ' ' || ((cCharAt > ' ' && cCharAt < '%') || ((cCharAt > '?' && cCharAt < 'A') || ((cCharAt > 'Z' && cCharAt < '_') || ((cCharAt > '_' && cCharAt < 'a') || cCharAt > 'z'))))) {
                    return new b(DigipassSDKReturnCodes.CHALLENGE_CHARACTER_INVALID, eVar, null, 0);
                }
            }
            length2 += str2.length();
            i10++;
        }
    }

    private static void a(byte[] bArr, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12 + i10]);
        }
    }

    private static b a(e eVar, String str, String[] strArr) {
        if (str.length() > 1024) {
            return new b(DigipassSDKReturnCodes.SERVER_PUBLIC_KEY_INCORRECT_LENGTH, eVar, null, 0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.toUpperCase());
        if (strArr != null && strArr.length != 0) {
            sb2.append(strArr[0]);
        }
        return new b(0, eVar, new String[]{b(sb2.toString())}, 0);
    }

    private static GenerationResponse a(e eVar, int i10, String[] strArr, String str, long j10, boolean z10, byte b10) {
        d dVarA = eVar.a(i10);
        b(dVarA);
        a(eVar, dVarA);
        byte[] bArrA = j.a(eVar, dVarA, str, z10);
        c cVarA = a(eVar, dVarA, j10, bArrA, b10);
        byte[] bArr = cVarA.f65776a;
        byte[] bArrA2 = a(eVar, dVarA, bArrA, bArr, strArr);
        q.g(bArrA);
        a(eVar, dVarA, bArr, bArrA2, false);
        q.g(bArrA2);
        byte[] bArrA3 = a(dVarA, bArr, cVarA);
        q.g(bArr);
        a aVarB = b(dVarA, bArrA3);
        q.g(bArrA3);
        return a(0, eVar, a(dVarA, a(aVarB.f65771a, b10, dVarA)), aVarB.f65772b);
    }

    private static void a(e eVar, d dVar) {
        byte b10;
        byte[] bArrA;
        if (dVar.f65701b || (b10 = dVar.f65702c) == 1 || b10 == 100) {
            return;
        }
        i iVar = eVar.f65717c;
        if (iVar.f65764r || iVar.f65766t) {
            if (!iVar.f65766t) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(eVar.f65718d.f65732g, 0, 16);
                byteArrayOutputStream.write(eVar.f65717c.f65749b.getBytes(), 0, 10);
                byteArrayOutputStream.write(dVar.f65703d.getBytes(), 0, 12);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bArrA = UtilitiesSDK.hash((byte) 3, byteArray).getOutputData();
                byteArrayOutputStream.reset();
                q.g(byteArray);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dVar.f65703d.substring(0, 10));
                byte b11 = eVar.f65718d.f65742r;
                if (b11 < 10) {
                    sb2.append('0');
                }
                sb2.append((int) b11);
                bArrA = o.a(eVar.f65718d.f65732g, sb2.toString().getBytes());
            }
            System.arraycopy(bArrA, 0, eVar.f65718d.f65732g, 0, 16);
            q.g(bArrA);
        }
    }

    private static c a(e eVar, d dVar, long j10, byte[] bArr, byte b10) {
        byte b11;
        long j11;
        long j12;
        int i10;
        char c10;
        byte[] bArr2 = new byte[16];
        long jA = a(j10);
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        if (!bVar.E) {
            if (bVar.D) {
                byte[] bArr3 = new byte[8];
                bArr3[7] = b10;
                a(eVar, dVar, bArr2, bArr3, true);
            }
            if (bArr != null) {
                byte[] bArr4 = new byte[4];
                System.arraycopy(bArr2, 4, bArr4, 0, 4);
                a(bArr4, bArr, 0, 4);
                System.arraycopy(bArr4, 0, bArr2, 4, 4);
            }
            if (bVar.C && bVar.f65686l && bVar.f65684j) {
                byte[] bArr5 = new byte[8];
                System.arraycopy(bArr2, 0, bArr5, 0, 8);
                a(eVar, dVar, bArr2, bArr5, true);
            }
        }
        if (bVar.f65691r) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(Time.GMT));
            calendar.setTime(new Date(jA * 1000));
            int i11 = calendar.get(1) - 1900;
            int i12 = calendar.get(2) + 1;
            int i13 = calendar.get(5);
            int i14 = calendar.get(11);
            int i15 = (calendar.get(13) + (calendar.get(12) * 60)) / 36;
            byte[] bArr6 = {0, 0, 0, (byte) ((i11 % 10) + ((i11 / 10) * 16)), (byte) ((i12 % 10) + ((i12 / 10) * 16)), (byte) ((i13 % 10) + ((i13 / 10) * 16)), (byte) ((i14 % 10) + ((i14 / 10) * 16)), (byte) ((i15 % 10) + ((i15 / 10) * 16))};
            if (bVar.f65684j) {
                i10 = 4;
                System.arraycopy(bArr6, 4, bArr2, 4, 4);
            } else {
                i10 = 4;
            }
            if (bVar.f65685k) {
                System.arraycopy(bArr6, 0, bArr2, 0, i10);
            }
            if (bVar.f65693t) {
                c10 = 7;
                bArr2[7] = bArr2[6];
            } else {
                c10 = 7;
            }
            b11 = bArr2[c10];
        } else {
            if (bVar.f65687n) {
                long j13 = dVar.f65712n + 1;
                if (j13 == SvgConstantsKt.SPECIFIED_SOLID_OPACITY) {
                    j13 = 0;
                }
                if (!bVar.B && !bVar.E) {
                    a(bArr2, com.vasco.digipass.sdk.obfuscated.c.a(j13), 0, 4);
                }
                dVar.f65712n = j13;
            }
            if (bVar.f65686l) {
                long j14 = bVar.f65679e;
                if (bVar.f65690q) {
                    if (j14 > 7) {
                        jA /= 15;
                        j12 = j14 % 8;
                    } else {
                        j12 = j14 + 3;
                    }
                    j11 = jA >> ((int) j12);
                    bArr2[0] = (byte) (bArr2[0] ^ ((byte) ((j11 >> 24) & 255)));
                    bArr2[1] = (byte) (bArr2[1] ^ ((byte) ((j11 >> 16) & 255)));
                    bArr2[2] = (byte) (bArr2[2] ^ ((byte) ((j11 >> 8) & 255)));
                    bArr2[3] = (byte) (bArr2[3] ^ ((byte) (j11 & 255)));
                } else if (bVar.E) {
                    long jB = b(j14);
                    j11 = jA / (jB != 0 ? jB : 1L);
                    bArr2[4] = (byte) (bArr2[4] ^ ((byte) ((j11 >> 24) & 255)));
                    bArr2[5] = (byte) (((byte) ((j11 >> 16) & 255)) ^ bArr2[5]);
                    bArr2[6] = (byte) (bArr2[6] ^ ((byte) ((j11 >> 8) & 255)));
                    bArr2[7] = (byte) (bArr2[7] ^ ((byte) (j11 & 255)));
                } else {
                    j11 = jA >> ((int) (j14 + 3));
                    bArr2[4] = (byte) (bArr2[4] ^ ((byte) ((j11 >> 24) & 255)));
                    bArr2[5] = (byte) (((byte) ((j11 >> 16) & 255)) ^ bArr2[5]);
                    bArr2[6] = (byte) (bArr2[6] ^ ((byte) ((j11 >> 8) & 255)));
                    bArr2[7] = (byte) (bArr2[7] ^ ((byte) (j11 & 255)));
                }
                b11 = (byte) (j11 % 10);
            } else {
                b11 = 0;
            }
        }
        if (bVar.C && ((bVar.f65685k || bVar.f65686l || bVar.f65684j) && (bVar.f65697x || bVar.f65680f || bVar.f65681g))) {
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr2, 0, bArr7, 0, 8);
            a(eVar, dVar, bArr2, bArr7, true);
        }
        dVar.f65713o = System.currentTimeMillis() / 1000;
        return new c(bArr2, b11);
    }

    private static long a(long j10) {
        return (System.currentTimeMillis() / 1000) + j10;
    }

    private static byte[] a(e eVar, d dVar, byte[] bArr, byte[] bArr2, String[] strArr) {
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z10 = bVar.f65680f || bVar.f65681g || bVar.f65697x;
        if (z10 && strArr == null) {
            strArr = new String[]{""};
        }
        if (bVar.E) {
            a(dVar, bArr, bArr2, strArr, byteArrayOutputStream);
        } else if (z10) {
            if (bVar.f65690q) {
                byteArrayOutputStream.write(bArr2, 0, 8);
                q.g(bArr2);
            }
            if (bVar.B) {
                a(dVar, strArr, byteArrayOutputStream);
            } else {
                a(eVar, dVar, bArr2, byteArrayOutputStream, strArr);
            }
        } else {
            byteArrayOutputStream.write(bArr2, 0, 8);
            q.g(bArr2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void a(d dVar, byte[] bArr, byte[] bArr2, String[] strArr, ByteArrayOutputStream byteArrayOutputStream) {
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        if (bVar.f65686l) {
            byteArrayOutputStream.write(bArr2, 0, 8);
        }
        if (bVar.f65687n) {
            byte[] bArrA = com.vasco.digipass.sdk.obfuscated.c.a(dVar.f65712n);
            byteArrayOutputStream.write(bArrA, 0, bArrA.length);
            q.g(bArrA);
        }
        if (bVar.f65684j) {
            if (bArr != null) {
                byteArrayOutputStream.write(bArr, 0, bArr.length);
            } else {
                byteArrayOutputStream.write(new byte[4], 0, 4);
            }
        }
        for (int i10 = 0; strArr != null && i10 < strArr.length && i10 < dVar.f65706g && strArr[i10].getBytes().length > 0; i10++) {
            if (i10 != 0) {
                byteArrayOutputStream.write(0);
            }
            byteArrayOutputStream.write(strArr[i10].getBytes(), 0, strArr[i10].getBytes().length);
        }
    }

    private static void a(d dVar, String[] strArr, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArrA;
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        String strA = a(dVar);
        byteArrayOutputStream.write(strA.getBytes(), 0, strA.length());
        byteArrayOutputStream.write(0);
        if (bVar.f65687n) {
            byte[] bArrA2 = com.vasco.digipass.sdk.obfuscated.c.a(dVar.f65712n);
            for (int i10 = 0; i10 < 4; i10++) {
                byteArrayOutputStream.write(0);
            }
            byteArrayOutputStream.write(bArrA2, 0, bArrA2.length);
        }
        String str = strArr[0];
        if (bVar.f65676b == 0) {
            bArrA = a(str);
        } else {
            byte[] bArr = new byte[16];
            System.arraycopy(str.getBytes(), 0, bArr, 0, str.length());
            bArrA = bArr;
        }
        byteArrayOutputStream.write(bArrA, 0, bArrA.length);
        for (int i11 = 0; i11 < 128 - bArrA.length; i11++) {
            byteArrayOutputStream.write(0);
        }
        if (bVar.f65686l) {
            for (int i12 = 0; i12 < 4; i12++) {
                byteArrayOutputStream.write(0);
            }
            byteArrayOutputStream.write(byteArrayOutputStream.toByteArray(), 0, 4);
        }
    }

    private static String a(d dVar) {
        String strC;
        long j10;
        String strG;
        StringBuilder sb2 = new StringBuilder();
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        sb2.append(a());
        sb2.append(dVar.f65709j);
        if (bVar.f65687n) {
            strC = b();
        } else {
            strC = c();
        }
        sb2.append(strC);
        sb2.append(bVar.f65676b == 1 ? 'A' : 'N');
        byte b10 = dVar.f65708i[0];
        if (b10 < 10) {
            sb2.append('0');
        }
        sb2.append((int) b10);
        if (bVar.f65686l) {
            long j11 = bVar.f65679e;
            if (j11 > 7) {
                j10 = 15 << ((int) (j11 % 8));
            } else {
                j10 = j11 < 3 ? 8 << ((int) j11) : 0L;
            }
            if (j10 == 0) {
                strG = g();
            } else if (j10 < 60) {
                strG = j10 + d();
            } else {
                strG = (j10 / 60) + f();
            }
            sb2.append(e());
            sb2.append(strG);
        }
        return sb2.toString();
    }

    private static byte[] a(String str) {
        if (str.length() > 16) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[16];
        }
        String upperCase = new BigInteger(str, 10).toString(16).toUpperCase();
        if (upperCase.length() == 1) {
            upperCase = "0".concat(upperCase);
        }
        if (upperCase.length() % 2 != 0) {
            upperCase = upperCase.concat("0");
        }
        byte[] bArrA = q.a(upperCase);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0095 A[EDGE_INSN: B:105:0x0095->B:25:0x0095 BREAK  A[LOOP:5: B:22:0x0079->B:24:0x007f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f A[LOOP:5: B:22:0x0079->B:24:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7 A[LOOP:3: B:50:0x00e5->B:51:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8 A[LOOP:4: B:53:0x00f6->B:54:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x015d  */
    private static void a(e eVar, d dVar, byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, String[] strArr) {
        String upperCase;
        byte[] bArrA;
        byte[] bArr2;
        int i10;
        int length;
        byte[] bArr3;
        int i11;
        int i12;
        int i13;
        int length2;
        int i14;
        int i15;
        int i16;
        int i17;
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        byte[] bArr4 = new byte[8];
        byte b10 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i18 < strArr.length) {
            String str = strArr[i18];
            if (!q.d(str)) {
                upperCase = str.toUpperCase();
                bArrA = new byte[32];
                if (bVar.f65697x) {
                    System.arraycopy(bArr4, b10, bArrA, b10, i19);
                    System.arraycopy(upperCase.getBytes(), b10, bArrA, i19, upperCase.length());
                    length = upperCase.length() + i19;
                    if (i18 != strArr.length - 1 || q.d(strArr[i18 + 1])) {
                        bArr3 = bArr4;
                        i11 = b10;
                        while (true) {
                            i12 = i11 + length;
                            if (i12 % 8 == 0) {
                                break;
                            }
                            bArrA[i12] = (byte) ((bVar.f65678d << 4) + bVar.f65677c);
                            i11++;
                            length = length;
                            i18 = i18;
                        }
                        i10 = i18;
                        i13 = length;
                        if (!bVar.f65690q && !bVar.f65691r && ((bVar.f65689p || bVar.f65695v || !dVar.f65705f) && bVar.C && i10 == 0 && i13 == 0)) {
                            for (length2 = upperCase.length(); length2 < 16; length2++) {
                                if ((length2 & 1) == 1) {
                                    int i20 = length2 >> 1;
                                    bArrA[i20] = (byte) (((long) bArrA[i20]) + bVar.f65677c);
                                } else {
                                    bArrA[length2 >> 1] = (byte) (((byte) bVar.f65677c) << 4);
                                }
                            }
                            i11 = 8;
                        }
                    } else {
                        i11 = b10;
                        while (true) {
                            bArr3 = bArr4;
                            if (i11 >= bVar.f65698y) {
                                break;
                            }
                            bArrA[i11 + length] = b10;
                            i11++;
                            bArr4 = bArr3;
                        }
                        i10 = i18;
                        i13 = length;
                    }
                    i14 = i13 + i11;
                    i19 = i14 % 8;
                    i15 = 8;
                    while (i14 >= i15) {
                        i16 = 0;
                        while (i16 < i15) {
                            bArr[i16] = (byte) (bArr[i16] ^ bArrA[i16]);
                            i16++;
                            i15 = 8;
                        }
                        for (i17 = 8; i17 < i14; i17++) {
                            bArrA[i17 - 8] = bArrA[i17];
                        }
                        i14 -= 8;
                        i15 = 8;
                        byteArrayOutputStream.write(bArr, 0, 8);
                        q.g(bArr);
                    }
                    bArr2 = bArr3;
                    if (i19 != 0) {
                        System.arraycopy(bArrA, 0, bArr2, 0, i14);
                    }
                    if (byteArrayOutputStream.size() != 0 && i19 == 0) {
                        byteArrayOutputStream.write(bArr, 0, i15);
                        q.g(bArr);
                    }
                } else {
                    bArr2 = bArr4;
                    i10 = i18;
                    if (!bVar.f65680f || bVar.f65681g) {
                        bArrA = a(bVar, upperCase);
                    }
                    if (bVar.f65680f) {
                        bArr[0] = (byte) (bArr[0] ^ bArrA[0]);
                        bArr[1] = (byte) (bArr[1] ^ bArrA[1]);
                        bArr[2] = (byte) (bArr[2] ^ bArrA[2]);
                        bArr[3] = (byte) (bArr[3] ^ bArrA[3]);
                    }
                    if (bVar.f65681g) {
                        bArr[4] = (byte) (bArr[4] ^ bArrA[4]);
                        bArr[5] = (byte) (bArr[5] ^ bArrA[5]);
                        bArr[6] = (byte) (bArr[6] ^ bArrA[6]);
                        bArr[7] = (byte) (bArr[7] ^ bArrA[7]);
                    }
                    byteArrayOutputStream.write(bArr, 0, 8);
                    q.g(bArr);
                }
            } else if (i18 != 0) {
                bArr2 = bArr4;
                i10 = i18;
            } else {
                str = "";
                upperCase = str.toUpperCase();
                bArrA = new byte[32];
                if (bVar.f65697x) {
                    System.arraycopy(bArr4, b10, bArrA, b10, i19);
                    System.arraycopy(upperCase.getBytes(), b10, bArrA, i19, upperCase.length());
                    length = upperCase.length() + i19;
                    if (i18 != strArr.length - 1) {
                        bArr3 = bArr4;
                        i11 = b10;
                        while (true) {
                            i12 = i11 + length;
                            if (i12 % 8 == 0) {
                                break;
                                break;
                            }
                            bArrA[i12] = (byte) ((bVar.f65678d << 4) + bVar.f65677c);
                            i11++;
                            length = length;
                            i18 = i18;
                        }
                        i10 = i18;
                        i13 = length;
                        if (!bVar.f65690q) {
                            while (length2 < 16) {
                                if ((length2 & 1) == 1) {
                                    int i21 = length2 >> 1;
                                    bArrA[i21] = (byte) (((long) bArrA[i21]) + bVar.f65677c);
                                } else {
                                    bArrA[length2 >> 1] = (byte) (((byte) bVar.f65677c) << 4);
                                }
                            }
                            i11 = 8;
                        }
                    } else {
                        bArr3 = bArr4;
                        i11 = b10;
                        while (true) {
                            i12 = i11 + length;
                            if (i12 % 8 == 0) {
                                break;
                                break;
                            }
                            bArrA[i12] = (byte) ((bVar.f65678d << 4) + bVar.f65677c);
                            i11++;
                            length = length;
                            i18 = i18;
                        }
                        i10 = i18;
                        i13 = length;
                        if (!bVar.f65690q) {
                            while (length2 < 16) {
                                if ((length2 & 1) == 1) {
                                    int i22 = length2 >> 1;
                                    bArrA[i22] = (byte) (((long) bArrA[i22]) + bVar.f65677c);
                                } else {
                                    bArrA[length2 >> 1] = (byte) (((byte) bVar.f65677c) << 4);
                                }
                            }
                            i11 = 8;
                        }
                    }
                    i14 = i13 + i11;
                    i19 = i14 % 8;
                    i15 = 8;
                    while (i14 >= i15) {
                        i16 = 0;
                        while (i16 < i15) {
                            bArr[i16] = (byte) (bArr[i16] ^ bArrA[i16]);
                            i16++;
                            i15 = 8;
                        }
                        while (i17 < i14) {
                            bArrA[i17 - 8] = bArrA[i17];
                        }
                        i14 -= 8;
                        i15 = 8;
                        byteArrayOutputStream.write(bArr, 0, 8);
                        q.g(bArr);
                    }
                    bArr2 = bArr3;
                    if (i19 != 0) {
                        System.arraycopy(bArrA, 0, bArr2, 0, i14);
                    }
                    if (byteArrayOutputStream.size() != 0) {
                    }
                } else {
                    bArr2 = bArr4;
                    i10 = i18;
                    if (!bVar.f65680f) {
                        bArrA = a(bVar, upperCase);
                    } else {
                        bArrA = a(bVar, upperCase);
                    }
                    if (bVar.f65680f) {
                        bArr[0] = (byte) (bArr[0] ^ bArrA[0]);
                        bArr[1] = (byte) (bArr[1] ^ bArrA[1]);
                        bArr[2] = (byte) (bArr[2] ^ bArrA[2]);
                        bArr[3] = (byte) (bArr[3] ^ bArrA[3]);
                    }
                    if (bVar.f65681g) {
                        bArr[4] = (byte) (bArr[4] ^ bArrA[4]);
                        bArr[5] = (byte) (bArr[5] ^ bArrA[5]);
                        bArr[6] = (byte) (bArr[6] ^ bArrA[6]);
                        bArr[7] = (byte) (bArr[7] ^ bArrA[7]);
                    }
                    byteArrayOutputStream.write(bArr, 0, 8);
                    q.g(bArr);
                }
            }
            i18 = i10 + 1;
            bArr4 = bArr2;
            b10 = 0;
        }
        if (bVar.C) {
            if (bVar.f65697x || bVar.f65680f || bVar.f65681g) {
                if (bVar.f65689p || bVar.f65695v || !dVar.f65705f) {
                    byte[] bArr5 = {(byte) (((byte) (j >> 56)) & 255), (byte) (((byte) (j >> 48)) & 255), (byte) (((byte) (j >> 40)) & 255), (byte) (((byte) (j >> 32)) & 255), (byte) (((byte) (j >> 24)) & 255), (byte) (((byte) (j >> 16)) & 255), (byte) (((byte) (j >> 8)) & 255), b};
                    a(eVar, dVar, bArr5, bArr5, false);
                    byte b11 = bArr5[0];
                    byte b12 = (byte) (b11 & 128);
                    long j10 = ((((((((((long) (b11 & 255)) << 56) + (((long) (bArr5[1] & 255)) << 48)) + (((long) (bArr5[2] & 255)) << 40)) + (((long) (bArr5[3] & 255)) << 32)) + (((long) (bArr5[4] & 255)) << 24)) + (((long) (bArr5[5] & 255)) << 16)) + (((long) (bArr5[6] & 255)) << 8)) + ((long) (bArr5[7] & 255))) << 1;
                    byte b13 = (byte) (((byte) j10) & 255);
                    if (b12 != 0) {
                        bArr5[7] = (byte) (b13 ^ 27);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byte[] bArr6 = new byte[8];
                    System.arraycopy(byteArray, byteArray.length - 8, bArr6, 0, 8);
                    a(bArr6, bArr5, 0, 8);
                    byteArrayOutputStream.reset();
                    byteArrayOutputStream.write(byteArray, 0, byteArray.length - 8);
                    byteArrayOutputStream.write(bArr6, 0, 8);
                }
            }
        }
    }

    private static byte[] a(com.vasco.digipass.sdk.obfuscated.b bVar, String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[16];
        int i10 = (int) bVar.f65676b;
        int i11 = 0;
        if (i10 == 0) {
            while (i11 < bytes.length) {
                int i12 = i11 >> 1;
                bArr[i12] = (byte) (bArr[i12] ^ b(bytes[i11], i11));
                i11++;
            }
            for (int length = bytes.length; length < 16; length++) {
                int i13 = length >> 1;
                bArr[i13] = (byte) (bArr[i13] ^ a(bVar, length));
            }
        } else if (i10 == 1) {
            a(bArr, bytes, bVar, (byte) (bVar.f65677c << 4));
        } else if (i10 == 2) {
            a(bArr, bytes, bVar, (byte) 48);
        } else if (i10 == 3) {
            while (i11 < 16 - bytes.length) {
                int i14 = i11 >> 1;
                bArr[i14] = (byte) (bArr[i14] ^ a(bVar, i11));
                i11++;
            }
            for (int length2 = 16 - bytes.length; length2 < 16; length2++) {
                int i15 = length2 >> 1;
                bArr[i15] = (byte) (bArr[i15] ^ b(bytes[length2 - (16 - bytes.length)], length2));
            }
        }
        return bArr;
    }

    private static byte a(com.vasco.digipass.sdk.obfuscated.b bVar, int i10) {
        return (byte) ((i10 & 1) == 0 ? bVar.f65677c << 4 : bVar.f65677c);
    }

    private static void a(byte[] bArr, byte[] bArr2, com.vasco.digipass.sdk.obfuscated.b bVar, byte b10) {
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ ((byte) (bArr2[i10] & 63)));
            if (i10 == 7) {
                break;
            }
        }
        for (int length = bArr2.length; length < 8; length++) {
            bArr[length] = (byte) (bArr[length] ^ ((byte) (bVar.f65677c | ((long) b10))));
        }
    }

    private static void a(e eVar, d dVar, byte[] bArr, byte[] bArr2, boolean z10) {
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        g gVar = eVar.f65718d;
        byte[] bArr3 = gVar.f65732g;
        if (dVar.f65701b) {
            bArr3 = gVar.f65734i;
        } else if (dVar.f65702c == 100) {
            bArr3 = gVar.f65740p;
        }
        if (bVar.E) {
            b(bArr, bArr2, bArr3);
            return;
        }
        if (bVar.f65690q) {
            a(bArr, bArr2, bArr3);
        } else {
            System.arraycopy(bArr2, 0, bArr, 0, 8);
            for (int i10 = 8; i10 <= bArr2.length; i10 += 8) {
                if (bVar.f65689p) {
                    b(bArr, bArr3);
                } else {
                    c(bArr, bArr3);
                    if (bVar.f65695v) {
                        a(bArr, bArr3);
                    }
                }
                if (i10 < bArr2.length) {
                    a(bArr, bArr2, i10, 8);
                }
            }
        }
        if (bVar.f65695v || bVar.f65689p || bVar.f65690q) {
            return;
        }
        if (dVar.f65705f && !z10) {
            a(bArr, bArr3);
        } else if (bVar.f65692s) {
            c(bArr, bArr3);
        }
    }

    private static void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        if (bArr2.length == 8) {
            bArr4 = new byte[8];
            System.arraycopy(bArr2, 0, bArr4, 4, 4);
        } else {
            int length = bArr2.length - 8;
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr2, 8, bArr5, 0, length);
            bArr4 = bArr5;
        }
        byte[] bArr6 = new byte[20];
        System.arraycopy(bArr, 4, bArr6, 0, 4);
        System.arraycopy(bArr3, 0, bArr6, 4, bArr3.length);
        byte[] outputData = UtilitiesSDK.hmac((byte) 2, bArr4, bArr6).getOutputData();
        q.g(bArr);
        System.arraycopy(outputData, outputData[19] & 15, bArr, 4, 4);
        bArr[4] = (byte) (bArr[4] & 127);
        q.g(bArr6);
    }

    private static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA;
        byte[] bArrA2 = q.a(bArr2, 0, 8);
        byte[] bArrA3 = q.a(bArr2, 8, 8);
        if (bArr.length == 16) {
            bArrA = q.a(bArr, 0, bArr.length / 2);
        } else {
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArr, 0, bArr3, 0, 8);
            bArrA = bArr3;
        }
        byte[] outputData = UtilitiesSDK.encrypt((byte) 1, (byte) 2, bArrA2, null, UtilitiesSDK.decrypt((byte) 1, (byte) 2, bArrA3, null, bArrA).getOutputData()).getOutputData();
        System.arraycopy(outputData, 0, bArr, 0, outputData.length);
        q.g(bArrA2);
        q.g(bArrA3);
    }

    private static byte[] a(d dVar, byte[] bArr, c cVar) {
        byte[] bArrA;
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        if (bVar.f65682h) {
            bArr[0] = (byte) (bArr[0] ^ bArr[4]);
            bArr[1] = (byte) (bArr[1] ^ bArr[5]);
            bArr[2] = (byte) (bArr[2] ^ bArr[6]);
            bArr[3] = (byte) (bArr[3] ^ bArr[7]);
        }
        if (dVar.m == 2 && !bVar.m && !bVar.f65688o) {
            return a(dVar, bArr);
        }
        if (bVar.f65691r) {
            bArr[2] = (byte) (bArr[2] ^ bArr[0]);
            bArr[3] = (byte) (bArr[3] ^ bArr[1]);
            bArr[4] = (byte) (bArr[4] ^ bArr[6]);
            bArr[5] = (byte) (bArr[5] ^ bArr[7]);
            bArrA = a(dVar, bArr);
            if (dVar.m == 2) {
                System.arraycopy(bArrA, 2, bArrA, 0, 8);
            }
            bArrA[6] = cVar.f65777b;
            a(bArrA);
        } else {
            bArrA = a(dVar, bArr);
            if (bVar.f65686l && (dVar.m != 2 || bVar.m)) {
                b(dVar, bArrA, cVar);
            }
            if (bVar.f65687n && (dVar.m != 2 || bVar.f65688o)) {
                c(dVar, bArrA);
            }
        }
        return bArrA;
    }

    private static byte[] a(d dVar, byte[] bArr) {
        com.vasco.digipass.sdk.obfuscated.b bVar = dVar.f65704e;
        byte[] bArr2 = new byte[16];
        byte b10 = dVar.m;
        if (b10 == 0) {
            a(bArr, bVar.f65691r ? 6 : 10);
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = i10 * 2;
                bArr2[i11] = (byte) (((bArr[i10] >> 4) & 15) + 48);
                bArr2[i11 + 1] = (byte) ((bArr[i10] & 15) + 48);
            }
            return bArr2;
        }
        if (b10 != 2) {
            if (b10 != 1) {
                return bArr2;
            }
            System.arraycopy(bArr, 0, bArr2, 0, 8);
            return bArr2;
        }
        String strSubstring = com.vasco.digipass.sdk.obfuscated.c.a(q.a(bArr, 0, bArr.length / 2)).substring(4);
        if (!bVar.f65688o && !bVar.m) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(q.a(strSubstring), 0, bArr3, 0, 8);
            return bArr3;
        }
        System.arraycopy(strSubstring.getBytes(), 0, bArr2, 0, 16);
        return bArr2;
    }

    private static void a(byte[] bArr) {
        for (int i10 = 0; i10 < 6; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = i11 + 4;
                bArr[i12] = (byte) f65770a[(((byte) ((bArr[i12] & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4)) * 16) + ((byte) (bArr[i12] & 15))];
            }
            byte b10 = bArr[6];
            byte b11 = bArr[5];
            bArr[6] = (byte) (((b11 & 15) << 4) + ((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4));
            byte b12 = bArr[4];
            bArr[5] = (byte) (((b12 & 15) << 4) + ((b11 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4));
            bArr[4] = (byte) ((((byte) (b10 & 15)) << 4) + ((b12 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4));
        }
    }

    private static void a(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = bArr[i11];
            if ((i12 & 255) >= 160) {
                bArr[i11] = (byte) (i12 - (i10 * 16));
            }
            int i13 = bArr[i11];
            if ((i13 & 15) >= 10) {
                bArr[i11] = (byte) (i13 - i10);
            }
        }
    }

    private static String a(d dVar, String str) {
        if (!dVar.f65711l) {
            return str;
        }
        boolean z10 = dVar.m != 1;
        byte[] bytes = str.getBytes();
        byte bA = j.a(bytes, bytes.length, z10);
        if (z10) {
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
            sbD.append(bA - 48);
            return sbD.toString();
        }
        byte bA2 = com.vasco.digipass.sdk.obfuscated.c.a(bA);
        StringBuilder sbD2 = androidx.camera.core.impl.utils.c.d(str);
        sbD2.append(Integer.toHexString(bA2).toUpperCase());
        return sbD2.toString();
    }

    private static String a(String str, byte b10, d dVar) {
        int i10;
        if (!dVar.f65704e.D) {
            return str;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (i12 != 2) {
                i11 += Integer.parseInt(str.substring(i12, i12 + 1), 16);
            }
        }
        int i13 = i11 + b10;
        byte b11 = dVar.m;
        if (b11 != 0 && b11 != 2) {
            i10 = i13 % 16;
        } else {
            i10 = i13 % 10;
        }
        return str.substring(0, 2) + Integer.toHexString(i10).toUpperCase() + str.substring(3);
    }

    private static GenerationResponse a(int i10) {
        return new GenerationResponse(i10);
    }

    private static GenerationResponse a(int i10, Throwable th2) {
        return new GenerationResponse(i10, th2);
    }

    private static GenerationResponse a(int i10, e eVar, String str, String str2) {
        return new GenerationResponse(i10, eVar.f65718d.f65728c, p.a(eVar), 0, str, str2);
    }

    public static GenerateDerivationCodeResponse a(byte[] bArr, byte[] bArr2, long j10, int i10, byte[] bArr3, int i11, byte[] bArr4, boolean z10, String str, String str2) {
        try {
            l.a(bArr3, i11);
            b bVarA = a(bArr, bArr2, i10, bArr3, i11, bArr4, z10, str == null ? "" : str, true, null, false, null, false, str2, (byte) 0, false);
            String strA = null;
            if (bVarA.getReturnCode() != 0) {
                bVarA.f65773c.f();
                return a(bVarA.getReturnCode(), bVarA.f65773c, (String) null, bVarA.f65775e);
            }
            e eVar = bVarA.f65773c;
            d dVarA = eVar.a(i10);
            if (!j.a(eVar, dVarA.f65701b)) {
                bVarA.f65773c.f();
                return a(DigipassSDKReturnCodes.TOKEN_DERIVATION_NOT_SUPPORTED, eVar, (String) null, 0);
            }
            byte b10 = j.b(dVarA);
            if (b10 != 5 && (b10 != 3 || dVarA.f65706g <= 1)) {
                if (q.d(str2)) {
                    bVarA.f65773c.f();
                    return a(DigipassSDKReturnCodes.PLATFORM_FINGERPRINT_NOT_DEFINED, eVar, (String) null, 0);
                }
                GenerationResponse generationResponseA = a(eVar, i10, bVarA.f65774d, str2, j10, true, (byte) 0);
                if (bVarA.getReturnCode() == 0) {
                    strA = a(eVar, str2, generationResponseA.getResponse(), i10);
                    eVar.f65718d.m = true;
                }
                GenerateDerivationCodeResponse generateDerivationCodeResponseA = a(bVarA.getReturnCode(), eVar, strA, 0);
                bVarA.f65773c.f();
                return generateDerivationCodeResponseA;
            }
            bVarA.f65773c.f();
            return a(DigipassSDKReturnCodes.TOKEN_DERIVATION_NOT_SUPPORTED, eVar, (String) null, 0);
        } catch (h e5) {
            return new GenerateDerivationCodeResponse(e5.a());
        } catch (Exception e7) {
            return new GenerateDerivationCodeResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    private static String a(e eVar, String str, String str2, int i10) {
        int iB;
        int length;
        d dVarA = eVar.a(i10);
        StringBuilder sb2 = new StringBuilder(Long.toString(com.vasco.digipass.sdk.obfuscated.c.b(j.a(eVar, dVarA, str, true))));
        byte b10 = eVar.f65717c.f65768v;
        if (b10 != 0 && (length = b10 - sb2.length()) > 0) {
            for (int i11 = 0; i11 < length; i11++) {
                sb2.insert(0, "0");
            }
        }
        StringBuilder sb3 = new StringBuilder();
        int length2 = dVarA.f65711l ? str2.length() - 1 : str2.length();
        int i12 = 0;
        while (i12 < sb2.length()) {
            int i13 = i12 < length2 ? i12 : i12 % length2;
            String strSubstring = str2.substring(i13, i13 + 1);
            if (dVarA.m == 1) {
                iB = com.vasco.digipass.sdk.obfuscated.c.b(strSubstring);
            } else {
                iB = Integer.parseInt(strSubstring);
            }
            sb3.append(((sb2.charAt(i12) - '0') + iB) % 10);
            i12++;
        }
        return a(dVarA, ((Object) sb3) + str2.substring(0, length2));
    }

    private static GenerateDerivationCodeResponse a(int i10, e eVar, String str, int i11) {
        return new GenerateDerivationCodeResponse(i10, eVar.f65718d.f65728c, p.a(eVar), i11, str);
    }

    public static String a() {
        byte[] bArr = new byte[17];
        int[] iArr = {79, 68, 84, 68, 49, 54, 64, 79, 87, 93, 90, 56, 95, 85, 79, 64, 61};
        for (int i10 = 0; i10 < 17; i10++) {
            bArr[i10] = (byte) (iArr[i10] - i10);
        }
        return new String(bArr);
    }
}
