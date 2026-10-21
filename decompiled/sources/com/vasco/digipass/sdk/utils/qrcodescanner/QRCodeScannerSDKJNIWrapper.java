package com.vasco.digipass.sdk.utils.qrcodescanner;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class QRCodeScannerSDKJNIWrapper {
    private QRCodeScannerSDKJNIWrapper() {
    }

    public static String DecodeCrontoImage(byte[] bArr, int i10, int i11) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        QRCodeScannerSDKJNIResult qRCodeScannerSDKJNIResultPredecodeCrontoImage = PredecodeCrontoImage(bArr, i10, i11);
        if (qRCodeScannerSDKJNIResultPredecodeCrontoImage != null) {
            return a(a(a(qRCodeScannerSDKJNIResultPredecodeCrontoImage.getProcessedCrontoImage(), bArr2, bArr3), qRCodeScannerSDKJNIResultPredecodeCrontoImage.getCodePoints()));
        }
        return null;
    }

    public static native byte[] DecodeQRImage(byte[] bArr, int i10, int i11);

    public static native QRCodeScannerSDKJNIResult PredecodeCrontoImage(byte[] bArr, int i10, int i11);

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, 0, bArr2.length, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public static byte[] a(byte[] bArr, int i10) {
        int i11;
        int i12 = 1;
        if (i10 == 25) {
            i11 = bArr[0];
        } else {
            i11 = (bArr[0] << 8) + (bArr[1] & 255);
            i12 = 2;
        }
        return Arrays.copyOfRange(bArr, i12, i11 + i12);
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String upperCase = Integer.toHexString(b10 & 255).toUpperCase(Locale.ROOT);
            if (upperCase.length() % 2 == 1) {
                upperCase = "0".concat(upperCase);
            }
            sb2.append(upperCase);
        }
        return sb2.toString().toUpperCase(Locale.ROOT);
    }
}
