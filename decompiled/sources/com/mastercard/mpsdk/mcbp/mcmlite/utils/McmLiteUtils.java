package com.mastercard.mpsdk.mcbp.mcmlite.utils;

import android.util.Base64;
import androidx.camera.camera2.internal.h0;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class McmLiteUtils {
    private static final /* synthetic */ McmLiteUtils[] $VALUES;
    private static final char[] HEX_DIGITS;
    private static final String HEX_PREFIX = "0x";
    private static final String HEX_REGEX = "^([A-Fa-f0-9]{2})+$";
    public static final McmLiteUtils INSTANCE;

    static {
        McmLiteUtils mcmLiteUtils = new McmLiteUtils("INSTANCE", 0);
        INSTANCE = mcmLiteUtils;
        $VALUES = new McmLiteUtils[]{mcmLiteUtils};
        HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public McmLiteUtils() {
        throw null;
    }

    public static int bcdByteToInt(byte b10) {
        return (((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4) * 10) + (b10 & 15);
    }

    public static byte[] byteArrayFromBase64String(String str) {
        return Base64.decode(str, 2);
    }

    public static byte[] byteArrayFromChar(char c10) {
        return new byte[]{(byte) ((65280 & c10) >> 8), (byte) (c10 & 255)};
    }

    public static byte[] byteArrayFromHexString(String str) {
        int i10 = 0;
        if (str == null || str.isEmpty() || str.equals(HEX_PREFIX)) {
            return new byte[0];
        }
        if (str.startsWith(HEX_PREFIX)) {
            str = str.substring(2);
        }
        if (str.length() % 2 != 0) {
            str = "0".concat(str);
        }
        if (!Pattern.compile(HEX_REGEX, 2).matcher(str).matches()) {
            throw new IllegalArgumentException(h0.b("invalid hex string [", str, Constant.BRACKET_CLOSE));
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        while (i10 < length) {
            int i11 = i10 / 2;
            int i12 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 16) << 4;
            i10 += 2;
            bArr[i11] = (byte) (Character.digit(str.charAt(i12), 16) + iDigit);
        }
        return bArr;
    }

    public static String byteArrayToBase64String(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static String byteArrayToHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            char[] cArr = new char[bArr.length * 2];
            int i10 = 0;
            for (byte b10 : bArr) {
                int i11 = i10 + 1;
                char[] cArr2 = HEX_DIGITS;
                cArr[i10] = cArr2[(b10 >>> 4) & 15];
                i10 += 2;
                cArr[i11] = cArr2[b10 & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Invalid Input");
        }
    }

    public static void clearArraysList(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            clearByteArray(it.next());
        }
    }

    public static void clearByteArray(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = 0;
        }
    }

    public static byte[] concatenateArrays(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : list) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static final byte[] copyValue(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static boolean isLackOfCdCvmIndicatedIn(List<Reason> list) {
        return list.contains(Reason.MISSING_CD_CVM) || list.contains(Reason.INSUFFICIENT_CD_CVM) || list.contains(Reason.CREDENTIALS_NOT_ACCESSIBLE_WITHOUT_CVM);
    }

    public static boolean isTerminalOffline(byte b10) {
        byte b11 = (byte) (b10 & 15);
        return b11 == 3 || b11 == 6;
    }

    public static boolean isZero(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Input data is null in isZero(...)");
        }
        for (byte b10 : bArr) {
            if (b10 != 0) {
                return false;
            }
        }
        return true;
    }

    public static byte[] longToBcd(long j10, int i10) {
        int i11 = 0;
        for (long j11 = j10; j11 != 0; j11 /= 10) {
            i11++;
        }
        int i12 = i11 % 2;
        int i13 = i12 == 0 ? i11 / 2 : (i11 + 1) / 2;
        boolean z10 = i12 != 0;
        byte[] bArr = new byte[i13];
        for (int i14 = 0; i14 < i11; i14++) {
            byte b10 = (byte) (j10 % 10);
            if (i14 == i11 - 1 && z10) {
                bArr[i14 / 2] = b10;
            } else if (i14 % 2 == 0) {
                bArr[i14 / 2] = b10;
            } else {
                int i15 = i14 / 2;
                bArr[i15] = (byte) (((byte) (b10 << 4)) | bArr[i15]);
            }
            j10 /= 10;
        }
        for (int i16 = 0; i16 < i13 / 2; i16++) {
            byte b11 = bArr[i16];
            int i17 = (i13 - i16) - 1;
            bArr[i16] = bArr[i17];
            bArr[i17] = b11;
        }
        if (i10 == i13) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, i10 - i13, i13);
        return bArr2;
    }

    public static byte[] longToBinaryByteArray(long j10, int i10) {
        if (i10 < 0 || i10 > 8) {
            i10 = 8;
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 8;
            bArr[(i10 - 1) - i11] = (byte) ((((long) (255 << i12)) & j10) >> i12);
        }
        return bArr;
    }

    public static int readInt(byte[] bArr, int i10) {
        int length = bArr.length - i10;
        if (length < 4) {
            byte[] bArr2 = {0, 0, 0, 0};
            System.arraycopy(bArr, 0, bArr2, 4 - length, length);
            bArr = bArr2;
        }
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static short readShort(byte[] bArr, int i10) {
        return (short) (((bArr[i10 + 1] & 255) | (bArr[i10] << 8)) & 65535);
    }

    public static byte[] sha1(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static byte[] sha256(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }

    public static McmLiteUtils valueOf(String str) {
        return (McmLiteUtils) Enum.valueOf(McmLiteUtils.class, str);
    }

    public static McmLiteUtils[] values() {
        return (McmLiteUtils[]) $VALUES.clone();
    }

    public static void writeInt(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 3] = (byte) (j10 & 255);
    }
}
