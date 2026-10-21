package com.vasco.digipass.sdk.utils.utilities;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.lingala.zip4j.util.InternalZipConstants;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes9.dex */
public final class UtilitiesSDKCrypto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SecureRandom f65915a = new SecureRandom();

    private UtilitiesSDKCrypto() {
    }

    private static String a(byte b10) {
        if (b10 != 1) {
            return b10 != 2 ? "AES" : "DESede";
        }
        return "DES";
    }

    public static UtilitiesSDKCryptoResponse b(int i10) {
        if (i10 <= 0) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.OUTPUT_DATA_INCORRECT_LENGTH);
        }
        try {
            return new UtilitiesSDKCryptoResponse(0, a(i10));
        } catch (NoSuchAlgorithmException unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static UtilitiesSDKCryptoResponse hash(byte b10, byte[] bArr) {
        if (b10 != 2 && b10 != 3) {
            return a.a(b10, bArr);
        }
        if (bArr == null) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.INPUT_DATA_NULL);
        }
        try {
            return b10 == 2 ? new UtilitiesSDKCryptoResponse(0, a(McElieceCCA2KeyGenParameterSpec.SHA1, bArr)) : new UtilitiesSDKCryptoResponse(0, a("SHA-256", bArr));
        } catch (NoSuchAlgorithmException unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static UtilitiesSDKCryptoResponse hmac(byte b10, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.INPUT_DATA_NULL);
        }
        if (bArr2 == null) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.KEY_NULL);
        }
        if (b10 != 3 && b10 != 2) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.CRYPTO_MECANISM_INVALID);
        }
        try {
            return new UtilitiesSDKCryptoResponse(0, b10 == 2 ? a(InternalZipConstants.AES_MAC_ALGORITHM, bArr2, bArr2.length, bArr) : a("HmacSHA256", bArr2, bArr2.length, bArr));
        } catch (Exception unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static byte[] a(boolean z10, byte b10, byte b11, byte[] bArr, byte[] bArr2, byte[] bArr3) throws UtilitiesSDKException {
        int length;
        if (b10 != 2 && b10 != 3) {
            return a.a(z10, b10, b11, bArr, bArr2, bArr3);
        }
        if (bArr2 != null) {
            try {
                length = bArr2.length;
            } catch (Exception e5) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR, e5);
            }
        } else {
            length = 0;
        }
        int i10 = length;
        return z10 ? a(1, b10, b11, bArr, bArr2, i10, bArr3) : a(2, b10, b11, bArr, bArr2, i10, bArr3);
    }

    private static byte[] b(String str, byte[] bArr) throws NoSuchAlgorithmException {
        if (str.contains("SHA256")) {
            str = "SHA-256";
        } else if (str.contains("SHA384")) {
            str = McElieceCCA2KeyGenParameterSpec.SHA384;
        } else if (str.contains("SHA512")) {
            str = "SHA-512";
        } else if (str.contains("SHA1")) {
            str = McElieceCCA2KeyGenParameterSpec.SHA1;
        } else if (str.contains("MD5")) {
            str = "MD5";
        }
        byte[] bArr2 = new byte[bArr.length + 64];
        System.arraycopy(new byte[]{54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54}, 0, bArr2, 0, 64);
        System.arraycopy(bArr, 0, bArr2, 64, bArr.length);
        byte[] bArrA = a(str, bArr2);
        byte[] bArr3 = new byte[bArrA.length + 64];
        System.arraycopy(new byte[]{92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92}, 0, bArr3, 0, 64);
        System.arraycopy(bArrA, 0, bArr3, 64, bArrA.length);
        return a(str, bArr3);
    }

    private static byte[] a(int i10) throws NoSuchAlgorithmException {
        byte[] bArr = new byte[i10];
        f65915a.nextBytes(bArr);
        return bArr;
    }

    private static String a(byte b10, byte b11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(b10));
        sb2.append("/");
        if (b11 == 1) {
            sb2.append("ECB");
        } else if (b11 == 2) {
            sb2.append("CBC");
        } else if (b11 != 3) {
            sb2.append("CTR");
        } else {
            sb2.append("CFB8");
        }
        sb2.append("/NoPadding");
        return sb2.toString();
    }

    private static byte[] a(int i10, byte b10, byte b11, byte[] bArr, byte[] bArr2, int i11, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec;
        if (b10 == 2 && bArr.length != 24) {
            byte[] bArr4 = new byte[24];
            System.arraycopy(bArr, 0, bArr4, 0, 16);
            System.arraycopy(bArr, 0, bArr4, 16, 8);
            bArr = bArr4;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, a(b10));
        Cipher cipher = Cipher.getInstance(a(b10, b11));
        if (bArr2 == null && b11 != 2 && b11 != 3) {
            cipher.init(i10, secretKeySpec);
        } else {
            if (bArr2 != null) {
                ivParameterSpec = new IvParameterSpec(bArr2, 0, i11);
            } else {
                byte[] bArr5 = new byte[8];
                if (b10 == 3) {
                    bArr5 = new byte[16];
                }
                ivParameterSpec = new IvParameterSpec(bArr5);
            }
            cipher.init(i10, secretKeySpec, ivParameterSpec);
        }
        return cipher.doFinal(bArr3);
    }

    private static byte[] a(String str, byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str).digest(bArr);
    }

    private static byte[] a(String str, byte[] bArr, int i10, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (i10 == 0) {
            return b(str, bArr2);
        }
        Mac mac = Mac.getInstance(str);
        mac.init(new SecretKeySpec(bArr, 0, i10, str));
        return mac.doFinal(bArr2);
    }
}
