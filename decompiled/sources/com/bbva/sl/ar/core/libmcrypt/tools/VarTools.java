package com.bbva.sl.ar.core.libmcrypt.tools;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public class VarTools {
    public static String bytes2HexStr(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = (bArr[i10] >> (4 - (i11 * 4))) & 15;
                cArr[(i10 << 1) + i11] = (char) ((i12 < 10 ? 48 : 55) + i12);
            }
        }
        return new String(cArr);
    }

    public static String bytes2String(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append((char) b10);
        }
        return stringBuffer.toString();
    }

    public static byte[] hexStr2Bytes(String str) throws LibMCryptException {
        if (str == null) {
            return null;
        }
        try {
            byte[] byteArray = new BigInteger("10".concat(str), 16).toByteArray();
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                bArr[i10] = byteArray[i11];
                i10 = i11;
            }
            return bArr;
        } catch (NumberFormatException unused) {
            throw new LibMCryptException(211, ErrorCodes.ERR_CRY_BAD_TYPES_CONV_MSG);
        }
    }

    public static byte[] string2Byte(String str) {
        return str.getBytes();
    }

    public static String toHex(String str) {
        return String.format("%040x", new BigInteger(1, str.getBytes()));
    }
}
