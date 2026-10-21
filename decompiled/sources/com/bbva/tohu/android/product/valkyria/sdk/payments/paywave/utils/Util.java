package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils;

import android.annotation.SuppressLint;
import androidx.core.view.MotionEventCompat;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes6.dex */
public class Util {
    private static final String CLASS_TAG = "Util";
    public static final byte LEN = 1;
    public static final byte TAG = 0;
    private static short _resultLEN;
    private static short _resultTAG;

    public static byte[] DecToBCDArray(int i10) {
        int i11 = 0;
        for (int i12 = i10; i12 != 0; i12 /= 10) {
            i11++;
        }
        int i13 = i11 % 2;
        int i14 = i13 == 0 ? i11 / 2 : (i11 + 1) / 2;
        boolean z10 = i13 != 0;
        byte[] bArr = new byte[i14];
        for (int i15 = 0; i15 < i11; i15++) {
            byte b10 = (byte) (i10 % 10);
            if (i15 == i11 - 1 && z10) {
                bArr[i15 / 2] = b10;
            } else if (i15 % 2 == 0) {
                bArr[i15 / 2] = b10;
            } else {
                int i16 = i15 / 2;
                bArr[i16] = (byte) (((byte) (b10 << 4)) | bArr[i16]);
            }
            i10 /= 10;
        }
        for (int i17 = 0; i17 < i14 / 2; i17++) {
            byte b11 = bArr[i17];
            int i18 = (i14 - i17) - 1;
            bArr[i17] = bArr[i18];
            bArr[i18] = b11;
        }
        return bArr;
    }

    public static byte[] XOR(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (short s4 = 0; s4 < bArr.length; s4 = (short) (s4 + 1)) {
            bArr3[s4] = (byte) (bArr[s4] ^ bArr2[s4]);
        }
        return bArr3;
    }

    private static short _parseDOL(byte[] bArr, short s4) {
        byte b10;
        short s7;
        short s9 = s4;
        while (true) {
            b10 = bArr[s9];
            if (b10 != 0 && b10 != -1) {
                break;
            }
            s9 = (short) (s9 + 1);
        }
        if ((b10 & 31) == 31) {
            s7 = s9;
            do {
                s7 = (short) (s7 + 1);
            } while ((bArr[s7] & 128) == 128);
        } else {
            s7 = s9;
        }
        short s10 = (short) (s7 + 1);
        short s11 = (short) (s10 - s9);
        if (s11 == 1) {
            _resultTAG = (short) (bArr[s9] & 255);
        } else if (s11 == 2) {
            _resultTAG = (short) ((((short) (bArr[s9] & 255)) << 8) + ((short) (bArr[(short) (s9 + 1)] & 255)));
        }
        _resultLEN = (short) (bArr[s10] & 255);
        return (short) (((short) (s10 + 1)) - s4);
    }

    public static boolean arrayCompare(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (bArr == null) {
            return true;
        }
        if (bArr2 == null) {
            return false;
        }
        int i12 = i10;
        while (i12 < bArr.length + i10) {
            int i13 = i11 + 1;
            if (bArr2[i11] != bArr[i12]) {
                return false;
            }
            i12++;
            i11 = i13;
        }
        return true;
    }

    public static void arrayCopy(byte[] bArr, short s4, byte[] bArr2, short s7, short s9) {
        for (int i10 = 0; i10 < s9; i10++) {
            bArr2[s7 + i10] = bArr[s4 + i10];
        }
    }

    public static String byteArrayToHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public static String byteHexString(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = 65535 & i10;
        if ((i10 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) == 65280) {
            i11 = i10 & 255;
        }
        if (i11 > 256 && i11 < 16) {
            stringBuffer.append("0");
        } else if (i11 > 255 && i11 < 4096) {
            stringBuffer.append("0");
        }
        stringBuffer.append(Integer.toHexString(i11).toUpperCase(Locale.US));
        return stringBuffer.toString();
    }

    public static long convertArraytoLong(byte[] bArr, int i10, int i11) {
        long j10 = 0;
        long j11 = 1;
        for (int i12 = (i11 + i10) - 1; i12 >= i10; i12--) {
            j10 += ((long) (bArr[i12] & 255)) * j11;
            j11 *= 256;
        }
        return j10;
    }

    public static long convertBCDtoLong(byte[] bArr) {
        long j10 = 0;
        long j11 = 1;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b10 = bArr[length];
            j10 = (10 * j11 * ((long) (b10 >> 4))) + (((long) (b10 & 15)) * j11) + j10;
            j11 *= 100;
        }
        return j10;
    }

    public static byte[] convertToBytes(String str) {
        if (str == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        byte[] bArr = new byte[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i10] = (byte) (Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken(), 16)).byteValue() & 255);
            i10++;
        }
        return bArr;
    }

    public static short findFS(byte[] bArr, short s4) {
        int i10;
        short length = (short) bArr.length;
        for (short s7 = s4; s7 < length; s7 = (short) (s7 + 1)) {
            byte b10 = bArr[s7];
            if ((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) == -48) {
                i10 = (s7 - s4) * 2;
            } else if ((b10 & 15) == 13) {
                i10 = ((s7 - s4) * 2) + 1;
            }
            return (short) i10;
        }
        return (short) -1;
    }

    @SuppressLint({"DefaultLocale"})
    public static String getAsciiString(byte[] bArr, int i10, int i11, String str) {
        String hexString;
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 != 0) {
                int i13 = i12 % 16;
            }
            byte b10 = bArr[i12 + i10];
            if (b10 < 32 || b10 > 125) {
                hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(hexString);
                }
            } else {
                hexString = "" + ((char) (b10 & 255));
            }
            stringBuffer.append(hexString.toUpperCase() + str);
        }
        return stringBuffer.toString();
    }

    public static byte[] getBCD(String str) {
        byte[] bArr = new byte[6];
        int length = str.length() - 1;
        for (int i10 = 5; i10 >= 0; i10--) {
            int i11 = length - 1;
            byte bCharAt = (byte) (str.charAt(length) - '0');
            bArr[i10] = bCharAt;
            if (i11 < 0) {
                break;
            }
            length -= 2;
            bArr[i10] = (byte) (((byte) ((str.charAt(i11) - '0') << 4)) | bCharAt);
            if (length < 0) {
                break;
            }
        }
        return bArr;
    }

    public static short getDOLdataLength(byte[] bArr, short s4, short s7) {
        short s9 = 0;
        short s10 = s4;
        while (s10 < ((short) (s4 + s7))) {
            short s_parseDOL = _parseDOL(bArr, s10);
            s9 = (short) (s9 + _resultLEN);
            s10 = (short) (s10 + s_parseDOL);
        }
        return s9;
    }

    public static String getHexString(byte[] bArr, int i10, int i11, String str) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 != 0) {
                int i13 = i12 % 16;
            }
            String hexString = Integer.toHexString(bArr[i12 + i10] & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            stringBuffer.append(hexString.toUpperCase(Locale.US) + str);
        }
        return stringBuffer.toString();
    }

    public static String getLastAflRecordId(byte[] bArr) {
        byte b10 = (byte) (bArr[0] >>> 3);
        byte[] bArr2 = {b10, bArr[2]};
        LogTohu.d(CLASS_TAG, "+++++++++++++++++. shifted_b1: %s\n+++++++++++++++++. lastRecord: $s", Byte.valueOf(b10), HexUtils.byteArrayToHexString(bArr2));
        return HexUtils.byteArrayToHexString(bArr2);
    }

    public static byte[] getRandomBytes(int i10) {
        byte[] bArr = new byte[i10];
        try {
            SecureRandom secureRandom = SecureRandom.getInstance(AuthConstants.SHA1PRNG);
            secureRandom.nextBytes(new byte[1]);
            secureRandom.nextBytes(bArr);
        } catch (NoSuchAlgorithmException unused) {
            new Random().nextBytes(bArr);
        }
        return bArr;
    }

    public static final short getShort(byte[] bArr, short s4) {
        return (short) ((bArr[s4] << 8) + (bArr[(short) (s4 + 1)] & 255));
    }

    @SuppressLint({"DefaultLocale"})
    public static String getString(byte[] bArr, int i10, int i11, String str) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 != 0) {
                int i13 = i12 % 16;
            }
            String string = Integer.toString(bArr[i12 + i10] & 255);
            if (string.length() == 1) {
                string = "0".concat(string);
            }
            stringBuffer.append(string.toUpperCase() + str);
        }
        return stringBuffer.toString();
    }

    public static short getUByte(byte[] bArr, short s4) {
        return (short) (bArr[s4] & 255);
    }

    public static byte[] hexToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) | Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    public static final short makeShort(byte b10, byte b11) {
        return (short) ((b10 << 8) + (b11 & 255));
    }

    public static void nibbleCopy(byte[] bArr, short s4, byte[] bArr2, short s7, short s9) {
        boolean z10 = true;
        boolean z11 = s4 % 2 == 0;
        boolean z12 = s7 % 2 == 0;
        if (z11 || z12) {
            z10 = z11;
        } else {
            short s10 = (short) (s7 / 2);
            bArr2[s10] = (byte) ((bArr2[s10] & Constants.CVR_B2b8765_1111_APP_DISABLED) + (bArr[(short) (s4 / 2)] & 15));
            s9 = (short) (s9 - 1);
            s7 = (short) (s7 + 1);
            s4 = (short) (s4 + 1);
            z12 = true;
        }
        if (z10 && z12) {
            arrayCopy(bArr, (short) (s4 / 2), bArr2, (short) (s7 / 2), (short) (s9 / 2));
            if (s9 % 2 != 0) {
                short s11 = (short) (((short) (s7 + s9)) / 2);
                bArr2[s11] = (byte) ((bArr2[s11] & 15) + (bArr[(short) (((short) (s4 + s9)) / 2)] & Constants.CVR_B2b8765_1111_APP_DISABLED));
                return;
            }
            return;
        }
        if (z12) {
            short s12 = (short) (s4 / 2);
            short s13 = (short) (s7 / 2);
            short s14 = (short) ((s9 / 2) + s13);
            while (s13 < s14) {
                int i10 = bArr[s12] << 4;
                s12 = (short) (s12 + 1);
                bArr2[s13] = (byte) (i10 + ((bArr[s12] >> 4) & 15));
                s13 = (short) (s13 + 1);
            }
            if (s9 % 2 != 0) {
                bArr2[s13] = (byte) ((bArr2[s13] & 15) + (bArr[s12] << 4));
                return;
            }
            return;
        }
        short s15 = (short) (s7 / 2);
        short s16 = (short) (s4 / 2);
        short s17 = (short) ((s9 / 2) + s16);
        while (s16 < s17) {
            bArr2[s15] = (byte) ((bArr2[s15] & Constants.CVR_B2b8765_1111_APP_DISABLED) + ((bArr[s16] >> 4) & 15));
            s15 = (short) (s15 + 1);
            bArr2[s15] = (byte) ((bArr2[s15] & 15) + (bArr[s16] << 4));
            s16 = (short) (s16 + 1);
        }
        if (s9 % 2 != 0) {
            bArr2[s15] = (byte) ((bArr2[s15] & Constants.CVR_B2b8765_1111_APP_DISABLED) + ((bArr[s16] >> 4) & 15));
        }
    }

    public static String padHexStringWithFs(String str) {
        String str2 = new String(str);
        return str2.length() % 2 != 0 ? str2.concat("F") : str2;
    }

    public static short parseDOL(byte[] bArr, short s4, short[] sArr) {
        byte b10;
        short s7;
        short s9 = s4;
        while (true) {
            b10 = bArr[s9];
            if (b10 != 0 && b10 != -1) {
                break;
            }
            s9 = (short) (s9 + 1);
        }
        if ((b10 & 31) == 31) {
            s7 = s9;
            do {
                s7 = (short) (s7 + 1);
            } while ((bArr[s7] & 128) == 128);
        } else {
            s7 = s9;
        }
        short s10 = (short) (s7 + 1);
        short s11 = (short) (s10 - s9);
        if (s11 == 1) {
            sArr[0] = (short) (bArr[s9] & 255);
        } else if (s11 == 2) {
            sArr[0] = (short) ((((short) (bArr[s9] & 255)) << 8) + ((short) (bArr[(short) (s9 + 1)] & 255)));
        }
        sArr[1] = 0;
        byte b11 = bArr[s10];
        if ((b11 & (-128)) != 0) {
            int i10 = b11 & 127;
            while (true) {
                short s12 = (short) i10;
                if (s12 <= 0) {
                    break;
                }
                s10 = (short) (s10 + 1);
                short s13 = bArr[s10];
                short s14 = sArr[1];
                if (s13 < 0) {
                    s13 = (short) (s13 + 256);
                }
                short s15 = (short) (s14 + s13);
                sArr[1] = s15;
                if (s12 > 1) {
                    sArr[1] = (short) (s15 * 256);
                }
                i10 = s12 - 1;
            }
        } else {
            sArr[1] = b11;
        }
        return (short) (((short) (s10 + 1)) - s4);
    }

    public static void printArray(String str, byte[] bArr, String str2, int i10) {
        LogTohu.d(str, "%s: %s", str2, getHexString(bArr, 0, i10, " "));
    }

    public static short setDataOffsetsFromDOL(byte[] bArr, short s4, short s7, short[] sArr, short[] sArr2, short s9) {
        short dOLdataLength = getDOLdataLength(bArr, s4, s7);
        if (dOLdataLength > 127) {
            s9 = (short) (s9 + 1);
        }
        short s10 = s4;
        while (s10 < ((short) (s4 + s7))) {
            short s_parseDOL = _parseDOL(bArr, s10);
            for (short s11 = 0; s11 < sArr.length; s11 = (short) (s11 + 1)) {
                if (_resultTAG == sArr[s11]) {
                    sArr2[s11] = s9;
                    break;
                }
            }
            s9 = (short) (s9 + _resultLEN);
            s10 = (short) (s10 + s_parseDOL);
        }
        return dOLdataLength;
    }

    public static final short setShort(byte[] bArr, short s4, short s7) {
        bArr[s4] = (byte) (s7 >> 8);
        bArr[s4 + 1] = (byte) s7;
        return (short) (s4 + 2);
    }

    public void XOR2(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            bArr3[i12 + i14] = (byte) (bArr[i10 + i14] ^ bArr2[i11 + i14]);
        }
    }

    public byte[] copyByteArray(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public static long convertArraytoLong(byte[] bArr) {
        return convertArraytoLong(bArr, 0, bArr.length);
    }

    public static boolean arrayCompare(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (bArr == null) {
            return true;
        }
        if (bArr2 == null) {
            return false;
        }
        int i13 = i10;
        while (i13 < i10 + i12) {
            int i14 = i11 + 1;
            if (bArr2[i11] != bArr[i13]) {
                return false;
            }
            i13++;
            i11 = i14;
        }
        return true;
    }

    public static byte[] convertToBytes(String str, String str2, int i10) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        if (str2.equals("")) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < str.length()) {
                int i13 = i11 + 2;
                bArr[i12] = (byte) Integer.parseInt(str.substring(i11, i13), i10);
                i12++;
                i11 = i13;
            }
            return bArr;
        }
        return convertToBytes(str);
    }

    public static String getHexString(byte[] bArr) {
        return bArr != null ? getHexString(bArr, 0, bArr.length, " ") : "";
    }

    public static String getString(byte[] bArr) {
        return bArr != null ? getHexString(bArr, 0, bArr.length, " ") : "";
    }

    public static byte[] convertToBytes(String str, String str2) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        if (str2.equals("")) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < str.length()) {
                int i12 = i10 + 2;
                bArr[i11] = (byte) Integer.parseInt(str.substring(i10, i12));
                i11++;
                i10 = i12;
            }
            return bArr;
        }
        return convertToBytes(str);
    }
}
