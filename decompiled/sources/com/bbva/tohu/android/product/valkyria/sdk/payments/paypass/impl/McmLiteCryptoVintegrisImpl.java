package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class McmLiteCryptoVintegrisImpl implements McmLiteCrypto {
    public static final String TAG = "McmLiteCryptoVintegrisImpl";
    public static final byte[] ZERO_SINGLE_KEY = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private CryptoKeyManager cryptoKeyManager;
    private Cipher mRsaCipher = null;

    public enum Mode {
        ENCRYPT,
        DECRYPT
    }

    public McmLiteCryptoVintegrisImpl(CryptoKeyManager cryptoKeyManager) {
        this.cryptoKeyManager = cryptoKeyManager;
    }

    private void initRsaPrivate(RSAPrivateKey rSAPrivateKey) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/NOPADDING");
        this.mRsaCipher = cipher;
        cipher.init(1, rSAPrivateKey);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto
    public McmLiteCrypto.TransactionCryptograms buildComputeCcCryptograms(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (Arrays.equals(bArr2, "UMD_RANDOM_CREDENTIAL".getBytes()) || Arrays.equals(bArr3, "MD_RANDOM_CREDENTIAL".getBytes())) {
            byte[] bArr4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            Mode mode = Mode.ENCRYPT;
            return new McmLiteCrypto.TransactionCryptograms(des3(bArr, bArr4, mode), des3(bArr, bArr4, mode));
        }
        try {
            byte[] bArrCreateMcCryptogram = this.cryptoKeyManager.createMcCryptogram(bArr, new String(bArr2));
            byte[] bArrCreateMcCryptogram2 = this.cryptoKeyManager.createMcCryptogram(bArr, new String(bArr3));
            String str = TAG;
            LogTohu.d(str, "zz***********tohu (ccCryptogtams) umd Vintegris 1: %s", McmLiteUtils.byteArrayToHexString(bArrCreateMcCryptogram));
            LogTohu.d(str, "zz***********tohu (ccCryptogtams) md Vintegris 1:  %s", McmLiteUtils.byteArrayToHexString(bArrCreateMcCryptogram2));
            return new McmLiteCrypto.TransactionCryptograms(bArrCreateMcCryptogram, bArrCreateMcCryptogram2);
        } catch (TohuSdkException e5) {
            LogTohu.e(TAG, "BuildComputeCcCryptograms error.", e5);
            return null;
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto
    public McmLiteCrypto.TransactionCryptograms buildGenerateAcCryptograms(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (Arrays.equals(bArr2, "UMD_RANDOM_CREDENTIAL".getBytes()) || Arrays.equals(bArr3, "MD_RANDOM_CREDENTIAL".getBytes())) {
            byte[] bArr4 = ZERO_SINGLE_KEY;
            byte[] bArrMac = mac(bArr, bArr4);
            byte[] bArrMac2 = mac(bArr, bArr4);
            String str = TAG;
            LogTohu.d(str, "RANDOM CREDENTIALS umd Master: %s", McmLiteUtils.byteArrayToHexString(bArrMac));
            LogTohu.d(str, "RANDOM CREDENTIALS md Master: %s", McmLiteUtils.byteArrayToHexString(bArrMac2));
            return new McmLiteCrypto.TransactionCryptograms(bArrMac, bArrMac2);
        }
        try {
            byte[] bArrCreateMcCryptogram = this.cryptoKeyManager.createMcCryptogram(bArr, new String(bArr2));
            byte[] bArrCreateMcCryptogram2 = this.cryptoKeyManager.createMcCryptogram(bArr, new String(bArr3));
            String str2 = TAG;
            LogTohu.d(str2, "UMD Cryptogram Vintegris: %s", McmLiteUtils.byteArrayToHexString(bArrCreateMcCryptogram));
            LogTohu.d(str2, "MD Cryptogram Vintegris: %s", McmLiteUtils.byteArrayToHexString(bArrCreateMcCryptogram2));
            return new McmLiteCrypto.TransactionCryptograms(bArrCreateMcCryptogram, bArrCreateMcCryptogram2);
        } catch (TohuSdkException e5) {
            LogTohu.e(TAG, "buildGenerateAcCryptograms Error", e5);
            throw new GeneralSecurityException(e5);
        }
    }

    public final byte[] des(byte[] bArr, byte[] bArr2, Mode mode) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "DES");
        Cipher cipher = Cipher.getInstance("DES/ECB/noPadding");
        if (mode == Mode.ENCRYPT) {
            cipher.init(1, secretKeySpec);
        } else {
            cipher.init(2, secretKeySpec);
        }
        return cipher.doFinal(bArr);
    }

    public final byte[] des3(byte[] bArr, byte[] bArr2, Mode mode) throws GeneralSecurityException {
        if (bArr2.length != 24 && bArr2.length != 16) {
            throw new InvalidKeyException("Invalid 3DES key length: " + bArr2.length);
        }
        byte[] bArr3 = new byte[24];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        if (bArr2.length == 16) {
            System.arraycopy(bArr2, 0, bArr3, 16, 8);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "DESede");
        Cipher cipher = Cipher.getInstance("DESede/CBC/noPadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        if (mode == Mode.ENCRYPT) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        McmLiteUtils.clearByteArray(bArr3);
        return bArrDoFinal;
    }

    public final byte[] desCbc(byte[] bArr, byte[] bArr2, Mode mode) throws GeneralSecurityException {
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr2));
        Cipher cipher = Cipher.getInstance("DES/CBC/noPadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        if (mode == Mode.ENCRYPT) {
            cipher.init(1, secretKeyGenerateSecret, ivParameterSpec);
        } else {
            cipher.init(2, secretKeyGenerateSecret, ivParameterSpec);
        }
        return cipher.doFinal(bArr);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto
    public int initRsaPrivateKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws GeneralSecurityException {
        return initRsaPrivateKey(new BigInteger(McmLiteUtils.byteArrayToHexString(bArr), 16), new BigInteger(McmLiteUtils.byteArrayToHexString(bArr2), 16), new BigInteger(McmLiteUtils.byteArrayToHexString(bArr3), 16), new BigInteger(McmLiteUtils.byteArrayToHexString(bArr4), 16), new BigInteger(McmLiteUtils.byteArrayToHexString(bArr5), 16));
    }

    public final byte[] mac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int iCeil = ((int) Math.ceil((((double) bArr.length) + 1.0d) / 8.0d)) * 8;
        byte[] bArr3 = new byte[iCeil];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        bArr3[bArr.length] = -128;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, bArr2.length / 2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, bArr2.length / 2, bArr2.length);
        byte[] bArr4 = new byte[8];
        Mode mode = Mode.ENCRYPT;
        System.arraycopy(desCbc(bArr3, bArrCopyOfRange, mode), iCeil - 8, bArr4, 0, 8);
        byte[] bArrDes = des(bArr4, bArrCopyOfRange2, Mode.DECRYPT);
        byte[] bArrDes2 = des(bArrDes, bArrCopyOfRange, mode);
        McmLiteUtils.clearByteArray(bArrDes);
        McmLiteUtils.clearByteArray(bArr3);
        McmLiteUtils.clearByteArray(bArrCopyOfRange);
        McmLiteUtils.clearByteArray(bArrCopyOfRange2);
        McmLiteUtils.clearByteArray(bArr4);
        return bArrDes2;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto
    public byte[] rsa(byte[] bArr) throws GeneralSecurityException {
        try {
            return this.mRsaCipher.doFinal(bArr);
        } catch (Throwable th2) {
            LogTohu.d(TAG, "Exception in rsa operation during Mastercard payment", th2);
            throw new GeneralSecurityException();
        }
    }

    private int initRsaPrivateKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) throws GeneralSecurityException {
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2);
        BigInteger bigInteger6 = BigInteger.ONE;
        BigInteger bigIntegerModInverse = bigInteger3.modInverse(bigInteger.subtract(bigInteger6));
        initRsaPrivate((RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(bigIntegerMultiply, bigIntegerModInverse, bigIntegerModInverse.modInverse(bigInteger.subtract(bigInteger6).multiply(bigInteger2.subtract(bigInteger6)).divide(bigInteger.subtract(bigInteger6).gcd(bigInteger2.subtract(bigInteger6)))), bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5)));
        return bigIntegerMultiply.bitLength() / 8;
    }
}
