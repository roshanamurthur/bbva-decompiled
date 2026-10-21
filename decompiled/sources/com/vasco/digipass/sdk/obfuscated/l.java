package com.vasco.digipass.sdk.obfuscated;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import com.vasco.digipass.sdk.responses.DigipassResponse;
import com.vasco.digipass.sdk.responses.GenericResponse;
import com.vasco.digipass.sdk.responses.ValidationResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements DigipassSDKConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f65778a = {-14, -29, -34, Constants.CVR_B2b65_CLEAR_BITS, 57, 68, 58, 87, 57, -6, 29, -34, Base64.padSymbol, 90, -27, -42};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f65779b = {16, -76, -122, 7, -123, MessageUtils.MESSAGE_26_SUB, -121, 105, -113, 42, -54, 82, Constants.CVR_B2b65_CLEAR_BITS, -94, -79, 24};

    public static class a extends DigipassResponse {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f65780c;

        public a(int i10, byte[] bArr) {
            super(i10);
            this.f65780c = bArr;
        }
    }

    public static a a(byte[] bArr, int i10, e eVar, String str) {
        int length;
        byte b10 = eVar.f65718d.f65726a;
        boolean z10 = b10 == 56 || b10 < 1;
        byte[] bArrC = q.c(bArr);
        if (eVar.f65717c.f65751d || !q.f(bArr)) {
            int iA = a(bArr, i10, eVar);
            if (iA != 0) {
                q.g(bArrC);
                return new a(iA, null);
            }
            length = i10;
        } else {
            String strB = z10 ? b(eVar) : a(eVar);
            bArrC = strB.getBytes();
            length = strB.length();
        }
        byte[] bArr2 = bArrC;
        if (!q.f(bArr2) && eVar.f65717c.f65754g && q.d(bArr2)) {
            q.g(bArr2);
            return new a(DigipassSDKReturnCodes.PASSWORD_WEAK, null);
        }
        c(bArr2, eVar);
        byte[] bArr3 = new byte[16];
        if (!q.d(str) && eVar.f65717c.f65748a > 7) {
            eVar.f65718d.f65738n = true;
        }
        a(eVar, bArr, i10, bArr2, length, bArr3, str);
        q.g(bArr2);
        return new a(0, bArr3);
    }

    private static String b(e eVar) {
        byte[] bArr = eVar.f65717c.f65750c;
        return Integer.toHexString(bArr[0] & 255) + Integer.toHexString(bArr[2] & 255) + Integer.toHexString(bArr[4] & 255) + Integer.toHexString(bArr[6] & 255) + Integer.toHexString(bArr[8] & 255) + Integer.toHexString(bArr[10] & 255);
    }

    private static boolean c(byte[] bArr, int i10) {
        if (!q.f(bArr) || i10 >= 0) {
            return !q.f(bArr) && i10 < 1;
        }
        return true;
    }

    private static void c(byte[] bArr, e eVar) {
        System.arraycopy(b(bArr, eVar), 0, eVar.f65718d.f65729d, 0, 4);
    }

    private static boolean b(byte[] bArr, int i10) {
        return (q.f(bArr) && i10 > 0) || (!q.f(bArr) && i10 > bArr.length);
    }

    private static byte[] b(byte[] bArr, e eVar) {
        byte b10 = eVar.f65718d.f65727b;
        byte b11 = 1;
        boolean z10 = b10 == 56;
        byte[] bArr2 = new byte[4];
        byte b12 = eVar.f65717c.f65755h;
        if (b12 == 1) {
            bArr2[0] = (byte) (((z10 || b10 < 1) ? b(bArr) : a(bArr)) % 10);
        } else if (b12 == 2) {
            if (!z10 && b10 >= 5) {
                b11 = 3;
            }
            System.arraycopy(a(bArr, b11), 0, bArr2, 0, 4);
        }
        return bArr2;
    }

    private static int b(byte[] bArr) {
        return a(bArr, false);
    }

    private static byte[] b(byte[] bArr, int i10, e eVar) {
        byte[] bArr2 = f65778a;
        byte[] outputData = new byte[i10 + 10 + bArr2.length];
        byte[] bArrC = q.c(bArr);
        System.arraycopy(bArrC, 0, outputData, 0, i10);
        System.arraycopy(eVar.f65717c.f65749b.getBytes(), 0, outputData, i10, 10);
        System.arraycopy(bArr2, 0, outputData, i10 + 10, bArr2.length);
        for (int i11 = 0; i11 < eVar.f65717c.f65759l + 1; i11++) {
            outputData = UtilitiesSDK.hash((byte) 3, outputData).getOutputData();
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(outputData, 0, bArr3, 0, 16);
        q.g(outputData);
        q.g(bArrC);
        return bArr3;
    }

    public static String a(e eVar) {
        byte[] bArr = eVar.f65717c.f65750c;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr[0]);
        byteArrayOutputStream.write(bArr[2]);
        byteArrayOutputStream.write(bArr[4]);
        byteArrayOutputStream.write(bArr[6]);
        byteArrayOutputStream.write(bArr[8]);
        byteArrayOutputStream.write(bArr[10]);
        byteArrayOutputStream.write(eVar.f65717c.f65749b.getBytes(), 0, 10);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] outputData = UtilitiesSDK.hash((byte) 3, byteArray).getOutputData();
        String strA = q.a(outputData);
        byteArrayOutputStream.reset();
        q.g(byteArray);
        q.g(outputData);
        return strA;
    }

    public static ValidationResponse b(byte[] bArr, int i10, e eVar, String str) {
        int length;
        String strA;
        byte b10 = eVar.f65718d.f65727b;
        boolean z10 = b10 == 56 || b10 < 1;
        byte[] bArrC = q.c(bArr);
        i iVar = eVar.f65717c;
        if (iVar.f65748a > 7 ? eVar.f65718d.f65736k : !(!iVar.f65751d && q.f(bArr))) {
            int iA = a(bArr, i10, eVar);
            if (iA != 0) {
                q.g(bArrC);
                return a(iA, eVar);
            }
            length = i10;
        } else {
            if (!q.f(bArr)) {
                q.g(bArrC);
                return a(DigipassSDKReturnCodes.NOT_PASSWORD_PROTECTED, eVar);
            }
            if (z10) {
                strA = b(eVar);
            } else {
                strA = a(eVar);
            }
            bArrC = strA.getBytes();
            length = strA.length();
        }
        byte[] bArrB = b(bArrC, eVar);
        byte[] bArr2 = eVar.f65718d.f65729d;
        for (int i11 = 0; i11 < bArrB.length; i11++) {
            if (bArrB[i11] != bArr2[i11]) {
                g gVar = eVar.f65718d;
                byte b11 = gVar.f65730e;
                if (b11 == 0) {
                    if (eVar.f65717c.f65758k == 0) {
                        eVar.f();
                        eVar.f65718d.f65728c = (byte) 2;
                        q.g(bArrC);
                        return a(DigipassSDKReturnCodes.PASSWORD_LOCK, eVar);
                    }
                    gVar.f65728c = (byte) 3;
                    byte[] bArr3 = new byte[16];
                    a(eVar, bArr, i10, bArrC, length, bArr3, str);
                    q.g(bArrC);
                    return new ValidationResponse(0, eVar.f65718d.f65728c, p.a(eVar), 0, bArr3);
                }
                gVar.f65730e = (byte) (b11 - 1);
                q.g(bArrC);
                return new ValidationResponse(DigipassSDKReturnCodes.PASSWORD_WRONG, eVar.f65718d.f65728c, p.a(eVar), eVar.f65718d.f65730e, null);
            }
        }
        g gVar2 = eVar.f65718d;
        gVar2.f65728c = (byte) 1;
        gVar2.f65730e = eVar.f65717c.f65756i;
        byte[] bArr4 = new byte[16];
        a(eVar, bArr, i10, bArrC, length, bArr4, str);
        q.g(bArrC);
        return new ValidationResponse(0, eVar.f65718d.f65728c, p.a(eVar), 0, bArr4);
    }

    private static int a(byte[] bArr, int i10, e eVar) {
        if (bArr == null) {
            return DigipassSDKReturnCodes.PASSWORD_NULL;
        }
        i iVar = eVar.f65717c;
        if (i10 < iVar.f65752e) {
            return DigipassSDKReturnCodes.PASSWORD_LENGTH_TOO_SHORT;
        }
        if (i10 > iVar.f65753f) {
            return DigipassSDKReturnCodes.PASSWORD_LENGTH_TOO_LONG;
        }
        return 0;
    }

    public static void a(byte[] bArr, int i10) throws h {
        if (!c(bArr, i10)) {
            if (b(bArr, i10)) {
                throw new h(DigipassSDKReturnCodes.PROVIDED_PASSWORD_AS_STRING_LENGTH_TOO_LONG);
            }
            return;
        }
        throw new h(DigipassSDKReturnCodes.PROVIDED_PASSWORD_AS_STRING_LENGTH_TOO_SHORT);
    }

    private static int a(byte[] bArr) {
        return a(bArr, true);
    }

    private static int a(byte[] bArr, boolean z10) {
        boolean z11 = true;
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 - 48;
            if (z11 && (i11 = i11 * 2) > 9) {
                i11 -= 9;
            }
            i10 += i11;
            z11 = !z11;
        }
        return z10 ? i10 % 32 : i10;
    }

    private static byte[] a(byte[] bArr, byte b10) {
        byte[] bArrC = q.c(bArr);
        byte[] outputData = UtilitiesSDK.hash(b10, bArr).getOutputData();
        q.g(bArrC);
        return outputData;
    }

    private static byte[] a(byte[] bArr, e eVar, String str) {
        return a(bArr, eVar, str, q.a(UtilitiesSDK.decryptAESCTRWithMasterKey(f65779b, q.a("B3ED8FB496B1FF8567B26178583EB91F01D853E5D7B8B63F75C2C50ED6FC3E80300D986DD3A70A66C65A48F02127111A7B5B260A88E0911561B6FF873F90D5D8")).getOutputData()));
    }

    public static byte[] a(byte[] bArr, e eVar, String str, String str2) {
        if (!eVar.f65718d.f65738n || q.d(str)) {
            str = "";
        }
        byte[] bytes = str.getBytes();
        byte[] bytes2 = eVar.f65717c.f65749b.getBytes();
        byte[] bArr2 = eVar.f65717c.f65750c;
        byte[] bArrA = q.a(str2);
        byte[] bArr3 = new byte[bytes.length + bytes2.length + bArr2.length + bArrA.length];
        System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
        int length = bytes.length;
        System.arraycopy(bytes2, 0, bArr3, length, bytes2.length);
        int length2 = length + bytes2.length;
        System.arraycopy(bArr2, 0, bArr3, length2, bArr2.length);
        System.arraycopy(bArrA, 0, bArr3, length2 + bArr2.length, bArrA.length);
        byte[] outputData = UtilitiesSDK.hash((byte) 3, bArr3).getOutputData();
        i iVar = eVar.f65717c;
        int i10 = iVar.f65759l;
        for (int i11 = 0; i11 < iVar.m; i11++) {
            i10 *= 10;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        byte[] outputData2 = UtilitiesSDK.deriveKey((byte) 3, bArr, outputData, i10, 16).getOutputData();
        q.g(bArrA);
        q.g(bArr3);
        q.g(outputData);
        return outputData2;
    }

    public static void a(e eVar, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, String str) {
        int i12;
        byte b10;
        byte[] bytes;
        int length;
        byte b11 = eVar.f65718d.f65727b;
        boolean zF = q.f(bArr3);
        boolean z10 = zF && q.f(bArr);
        if (b11 == 56 && zF) {
            byte[] bArrA = a(bArr2, eVar);
            byte[] bArrB = b(bArr2, i11, eVar);
            a(eVar, bArrA, bArrB);
            q.g(bArrA);
            q.g(bArrB);
        }
        if (b11 == 56 || b11 < 1) {
            byte[] bArrC = q.c(bArr);
            if (z10) {
                String strA = a(eVar);
                byte[] bytes2 = strA.getBytes();
                int length2 = strA.length();
                c(bytes2, eVar);
                i12 = length2;
                bArrC = bytes2;
            } else {
                i12 = i10;
            }
            if (zF) {
                byte[] bArrB2 = b(bArr2, i11, eVar);
                System.arraycopy(bArrB2, 0, bArr3, 0, bArrB2.length);
                q.g(bArrB2);
            }
            byte[] bArrA2 = q.a(bArr3, 0, 8);
            byte[] outputData = UtilitiesSDK.decrypt((byte) 1, (byte) 2, bArrA2, null, eVar.f65718d.f65733h).getOutputData();
            q.g(bArrA2);
            if (z10) {
                byte[] bArrB3 = b(bArrC, i12, eVar);
                System.arraycopy(bArrB3, 0, bArr3, 0, bArrB3.length);
                q.g(bArrB3);
            }
            byte[] outputData2 = UtilitiesSDK.encrypt((byte) 3, (byte) 2, bArr3, null, outputData).getOutputData();
            System.arraycopy(outputData, 0, eVar.f65718d.f65732g, 0, 16);
            System.arraycopy(outputData2, 0, eVar.f65718d.f65733h, 0, 16);
            q.g(outputData);
            q.g(bArrC);
            if (zF && eVar.f65717c.f65755h == 1) {
                byte[] bArr4 = new byte[4];
                bArr4[0] = (byte) (a(bArr) % 10);
                System.arraycopy(bArr4, 0, eVar.f65718d.f65729d, 0, 4);
            }
            b10 = 56;
        } else {
            b10 = 56;
        }
        if ((b11 == b10 || b11 < 3) && zF) {
            byte[] bArrC2 = q.c(bArr);
            if (z10) {
                String strA2 = a(eVar);
                bytes = strA2.getBytes();
                length = strA2.length();
            } else {
                bytes = bArrC2;
                length = i10;
            }
            byte[] bArrB4 = b(bytes, length, eVar);
            byte[] bArrA3 = a(bytes, eVar, str);
            a(eVar, bArrB4, bArrA3, false);
            q.g(bytes);
            q.g(bArrB4);
            q.g(bArrA3);
        }
        if ((b11 == 56 || b11 < 5) && zF && eVar.f65717c.f65755h == 2) {
            System.arraycopy(a(bArr2, (byte) 3), 0, eVar.f65718d.f65729d, 0, 4);
        }
        if (zF) {
            byte[] bArrC3 = q.c(bArr);
            if (z10) {
                bArrC3 = a(eVar).getBytes();
            }
            byte[] bArrA4 = a(bArrC3, eVar, str);
            System.arraycopy(bArrA4, 0, bArr3, 0, bArrA4.length);
            q.g(bArrC3);
            q.g(bArrA4);
        }
        g gVar = eVar.f65718d;
        gVar.f65727b = (byte) 7;
        if (eVar.f65717c.f65748a <= 7) {
            gVar.f65726a = (byte) 7;
        }
    }

    private static byte[] a(byte[] bArr, e eVar) {
        byte[] outputData = new byte[16];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        for (int i11 = 1; i11 < 8; i11++) {
            byteArrayOutputStream.write(byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size(), byteArrayOutputStream.size() * 2);
            if (byteArrayOutputStream.size() > 10) {
                break;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        System.arraycopy(byteArray, 0, outputData, 0, 10);
        String strSubstring = eVar.f65717c.f65749b.substring(3);
        System.arraycopy(strSubstring.getBytes(), 1, outputData, 10, strSubstring.length() - 1);
        while (true) {
            i iVar = eVar.f65717c;
            if (i10 <= iVar.f65759l) {
                outputData = UtilitiesSDK.encrypt((byte) 2, (byte) 2, iVar.f65750c, null, outputData).getOutputData();
                i10++;
            } else {
                byteArrayOutputStream.reset();
                q.g(byteArray);
                return outputData;
            }
        }
    }

    private static void a(e eVar, byte[] bArr, byte[] bArr2) {
        byte[] outputData = UtilitiesSDK.decrypt((byte) 1, (byte) 2, bArr, null, eVar.f65718d.f65733h).getOutputData();
        System.arraycopy(outputData, 0, eVar.f65718d.f65732g, 0, 16);
        q.g(outputData);
        System.arraycopy(UtilitiesSDK.encrypt((byte) 1, (byte) 2, bArr2, null, outputData).getOutputData(), 0, eVar.f65718d.f65733h, 0, 16);
    }

    public static ValidationResponse a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, String str) {
        try {
            a(bArr3, i10);
            e eVarB = p.b(bArr, bArr2);
            if (!eVarB.e()) {
                eVarB.f();
                return new ValidationResponse(DigipassSDKReturnCodes.STATUS_INVALID, eVarB.f65718d.f65728c, p.a(eVarB), 0, null);
            }
            ValidationResponse validationResponseB = b(bArr3, i10, eVarB, str);
            eVarB.f();
            return validationResponseB;
        } catch (h e5) {
            return a(e5.a());
        } catch (Exception e7) {
            return a(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    public static GenericResponse a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, int i11, String str) {
        try {
            a(bArr3, i10);
            a(bArr4, i11);
            e eVarB = p.b(bArr, bArr2);
            if (!eVarB.e()) {
                eVarB.f();
                return new GenericResponse(DigipassSDKReturnCodes.STATUS_INVALID, eVarB.f65718d.f65728c, p.a(eVarB));
            }
            GenericResponse genericResponseA = a(bArr3, i10, bArr4, i11, eVarB, str);
            eVarB.f();
            return genericResponseA;
        } catch (h e5) {
            return new GenericResponse(e5.a());
        } catch (Exception e7) {
            return new GenericResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    private static GenericResponse a(byte[] bArr, int i10, byte[] bArr2, int i11, e eVar, String str) {
        ValidationResponse validationResponseB = b(bArr, i10, eVar, str);
        if (validationResponseB.getReturnCode() != 0) {
            return new GenericResponse(validationResponseB.getReturnCode(), eVar.f65718d.f65728c, p.a(eVar), validationResponseB.getAttemptLeft());
        }
        int iA = a(bArr2, i11, eVar);
        if (iA != 0) {
            return new GenericResponse(iA, eVar.f65718d.f65728c, p.a(eVar));
        }
        if (eVar.f65717c.f65754g && a(bArr2, bArr)) {
            return new GenericResponse(DigipassSDKReturnCodes.PASSWORD_WEAK, eVar.f65718d.f65728c, p.a(eVar));
        }
        c(bArr2, eVar);
        byte[] bArrA = a(bArr2, eVar, str);
        a(eVar, validationResponseB.getEncryptionKey(), bArrA, true);
        g gVar = eVar.f65718d;
        gVar.f65736k = true;
        GenericResponse genericResponse = new GenericResponse(0, gVar.f65728c, p.a(eVar));
        q.g(bArrA);
        return genericResponse;
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        return q.d(bArr) || Arrays.equals(bArr, bArr2);
    }

    public static GenericResponse a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            int iA = j.a(bArr3);
            if (iA != 0) {
                return new GenericResponse(iA);
            }
            int iA2 = j.a(bArr4);
            if (iA2 != 0) {
                return new GenericResponse(iA2);
            }
            e eVarB = p.b(bArr, bArr2);
            if (!eVarB.e()) {
                eVarB.f();
                return new GenericResponse(DigipassSDKReturnCodes.STATUS_INVALID, eVarB.f65718d.f65728c, p.a(eVarB));
            }
            a(eVarB, bArr3, bArr4, true);
            GenericResponse genericResponse = new GenericResponse(0, eVarB.f65718d.f65728c, p.a(eVarB));
            eVarB.f();
            return genericResponse;
        } catch (h e5) {
            return new GenericResponse(e5.a());
        } catch (Exception e7) {
            return new GenericResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    private static void a(e eVar, byte[] bArr, byte[] bArr2, boolean z10) {
        if (z10) {
            a(eVar, (byte[]) null, 0, (byte[]) null, 0, bArr, (String) null);
        }
        byte[] outputData = UtilitiesSDK.decrypt((byte) 3, (byte) 2, bArr, null, eVar.f65718d.f65733h).getOutputData();
        System.arraycopy(outputData, 0, eVar.f65718d.f65732g, 0, 16);
        byte[] outputData2 = UtilitiesSDK.decrypt((byte) 3, (byte) 2, bArr, null, eVar.f65718d.f65735j).getOutputData();
        System.arraycopy(outputData2, 0, eVar.f65718d.f65734i, 0, 16);
        System.arraycopy(UtilitiesSDK.encrypt((byte) 3, (byte) 2, bArr2, null, outputData).getOutputData(), 0, eVar.f65718d.f65733h, 0, 16);
        System.arraycopy(UtilitiesSDK.encrypt((byte) 3, (byte) 2, bArr2, null, outputData2).getOutputData(), 0, eVar.f65718d.f65735j, 0, 16);
        q.g(outputData);
        q.g(outputData2);
    }

    private static ValidationResponse a(int i10) {
        return new ValidationResponse(i10);
    }

    private static ValidationResponse a(int i10, Throwable th2) {
        return new ValidationResponse(i10, th2);
    }

    private static ValidationResponse a(int i10, e eVar) {
        return new ValidationResponse(i10, eVar.f65718d.f65728c, p.a(eVar), 0, null);
    }
}
