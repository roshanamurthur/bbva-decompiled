package com.bbva.sl.ar.core.libmcrypt.tools;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.a;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Properties;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public final class CryptoTools {
    public static byte[] decrypt(SecretKey secretKey, byte[] bArr) throws LibMCryptException {
        try {
            Cipher cipher = Cipher.getInstance(VarTools.bytes2String(LibMCryptConstants.CIPHER_ALGORITHM));
            cipher.init(2, secretKey, new IvParameterSpec(LibMCryptConstants.IV));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new LibMCryptException(205, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        } catch (InvalidKeyException unused2) {
            throw new LibMCryptException(205, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        } catch (NoSuchAlgorithmException unused3) {
            throw new LibMCryptException(205, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        } catch (BadPaddingException unused4) {
            throw new LibMCryptException(205, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        } catch (IllegalBlockSizeException unused5) {
            throw new LibMCryptException(ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE_MSG);
        } catch (NoSuchPaddingException unused6) {
            throw new LibMCryptException(205, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        }
    }

    public static byte[] encrypt(SecretKey secretKey, byte[] bArr) throws LibMCryptException {
        try {
            Cipher cipher = Cipher.getInstance(VarTools.bytes2String(LibMCryptConstants.CIPHER_ALGORITHM));
            cipher.init(1, secretKey, new IvParameterSpec(LibMCryptConstants.IV));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new LibMCryptException(206, ErrorCodes.ERR_CRY_BAD_ENCRYPT_MSG);
        } catch (InvalidKeyException unused2) {
            throw new LibMCryptException(206, ErrorCodes.ERR_CRY_BAD_ENCRYPT_MSG);
        } catch (NoSuchAlgorithmException unused3) {
            throw new LibMCryptException(206, ErrorCodes.ERR_CRY_BAD_ENCRYPT_MSG);
        } catch (BadPaddingException unused4) {
            throw new LibMCryptException(206, ErrorCodes.ERR_CRY_BAD_ENCRYPT_MSG);
        } catch (IllegalBlockSizeException unused5) {
            throw new LibMCryptException(ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE_MSG);
        } catch (NoSuchPaddingException unused6) {
            throw new LibMCryptException(206, ErrorCodes.ERR_CRY_BAD_ENCRYPT_MSG);
        }
    }

    public static SecretKey generateKeyDESEDE(byte[] bArr) throws LibMCryptException {
        try {
            byte[] bArr2 = new byte[24];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 0, bArr2, 16, 8);
            return SecretKeyFactory.getInstance(VarTools.bytes2String(LibMCryptConstants.CIPHER_KEYTYPE)).generateSecret(new DESedeKeySpec(bArr2));
        } catch (InvalidKeyException unused) {
            throw new LibMCryptException(207, ErrorCodes.ERR_CRY_GEN_KEY_MSG);
        } catch (NoSuchAlgorithmException unused2) {
            throw new LibMCryptException(207, ErrorCodes.ERR_CRY_GEN_KEY_MSG);
        } catch (InvalidKeySpecException unused3) {
            throw new LibMCryptException(207, ErrorCodes.ERR_CRY_GEN_KEY_MSG);
        }
    }

    public static KeyPair generateKeyPair() throws LibMCryptException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(VarTools.bytes2String(LibMCryptConstants.PUBPRIVKEY_KEYTYPE));
            keyPairGenerator.initialize(new RSAKeyGenParameterSpec(2048, LibMCryptConstants.PUBPRIVKEY_EXP));
            return keyPairGenerator.genKeyPair();
        } catch (InvalidAlgorithmParameterException unused) {
            throw new LibMCryptException(201, ErrorCodes.ERR_CRY_GEN_KEYPAIR_MSG);
        } catch (NoSuchAlgorithmException unused2) {
            throw new LibMCryptException(201, ErrorCodes.ERR_CRY_GEN_KEYPAIR_MSG);
        }
    }

    public static RSAPublicKey generatePublicKey(PropertiesManager propertiesManager, String str) throws LibMCryptException {
        try {
            return (RSAPublicKey) KeyFactory.getInstance(VarTools.bytes2String(LibMCryptConstants.PUBPRIVKEY_KEYTYPE)).generatePublic(new RSAPublicKeySpec(new BigInteger(propertiesManager.getProperty(getPublicKeyByTag(FacialAuthFragment.PUBLIC_KEY, str, propertiesManager.getProperties())), 16), LibMCryptConstants.PUBPRIVKEY_EXP));
        } catch (NoSuchAlgorithmException unused) {
            throw new LibMCryptException(201, ErrorCodes.ERR_CRY_GEN_KEYPAIR_MSG);
        } catch (InvalidKeySpecException unused2) {
            throw new LibMCryptException(201, ErrorCodes.ERR_CRY_GEN_KEYPAIR_MSG);
        }
    }

    public static SecretKey generateRandomKeyDESEDE() throws LibMCryptException {
        try {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[8];
            secureRandom.nextBytes(bArr);
            byte[] bArr2 = new byte[8];
            secureRandom.nextBytes(bArr2);
            byte[] bArr3 = new byte[24];
            System.arraycopy(bArr, 0, bArr3, 0, 8);
            System.arraycopy(bArr2, 0, bArr3, 8, 8);
            System.arraycopy(bArr, 0, bArr3, 16, 8);
            return SecretKeyFactory.getInstance(VarTools.bytes2String(LibMCryptConstants.CIPHER_KEYTYPE)).generateSecret(new DESedeKeySpec(bArr3));
        } catch (InvalidKeyException unused) {
            throw new LibMCryptException(207, ErrorCodes.ERR_CRY_GEN_KEY_MSG);
        } catch (NoSuchAlgorithmException unused2) {
            throw new LibMCryptException(207, ErrorCodes.ERR_CRY_GEN_KEY_MSG);
        } catch (InvalidKeySpecException unused3) {
            throw new LibMCryptException(207, ErrorCodes.ERR_CRY_GEN_KEY_MSG);
        }
    }

    public static String getPublicKeyByTag(String str, String str2, Properties properties) throws LibMCryptException {
        if (properties.containsKey(str + Constant.DOT_STRING + str2)) {
            return a.b(str, Constant.DOT_STRING, str2);
        }
        if (properties.containsKey(str + ".default") && (str2.equals("default") || str2.equals(""))) {
            return u.f(str, ".default");
        }
        throw new LibMCryptException(ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND_MSG);
    }

    public static byte[] rsaDecrypt(byte[] bArr, RSAPrivateKey rSAPrivateKey) throws LibMCryptException {
        if (rSAPrivateKey == null) {
            throw new LibMCryptException(ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY_MSG);
        }
        if (bArr.length != 256) {
            throw new LibMCryptException(203, ErrorCodes.ERR_CRY_BAD_RSA_DATA_LEN_MSG);
        }
        try {
            Cipher cipher = Cipher.getInstance(VarTools.bytes2String(LibMCryptConstants.PUBPRIVKEY_ALGORITHM));
            cipher.init(2, rSAPrivateKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException unused) {
            throw new LibMCryptException(202, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        } catch (NoSuchAlgorithmException unused2) {
            throw new LibMCryptException(202, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        } catch (BadPaddingException unused3) {
            throw new LibMCryptException(202, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        } catch (IllegalBlockSizeException unused4) {
            throw new LibMCryptException(202, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        } catch (NoSuchPaddingException unused5) {
            throw new LibMCryptException(202, ErrorCodes.ERR_CRY_BAD_DECRYPT_MSG);
        }
    }

    public static byte[] rsaEncrypt(byte[] bArr, RSAPublicKey rSAPublicKey) throws LibMCryptException {
        try {
            Cipher cipher = Cipher.getInstance(VarTools.bytes2String(LibMCryptConstants.PUBPRIVKEY_ALGORITHM));
            cipher.init(1, rSAPublicKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException unused) {
            throw new LibMCryptException(204, ErrorCodes.ERR_CRY_RSA_ENCRYPT_MSG);
        } catch (NoSuchAlgorithmException unused2) {
            throw new LibMCryptException(204, ErrorCodes.ERR_CRY_RSA_ENCRYPT_MSG);
        } catch (BadPaddingException unused3) {
            throw new LibMCryptException(204, ErrorCodes.ERR_CRY_RSA_ENCRYPT_MSG);
        } catch (IllegalBlockSizeException unused4) {
            throw new LibMCryptException(204, ErrorCodes.ERR_CRY_RSA_ENCRYPT_MSG);
        } catch (NoSuchPaddingException unused5) {
            throw new LibMCryptException(204, ErrorCodes.ERR_CRY_RSA_ENCRYPT_MSG);
        }
    }
}
