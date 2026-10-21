package com.nimbusds.jose.crypto.impl;

import androidx.emoji2.text.flatbuffer.a;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.Container;
import com.nimbusds.jose.util.KeyUtils;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class AESGCM {
    public static final int AUTH_TAG_BIT_LENGTH = 128;
    public static final int IV_BIT_LENGTH = 96;

    public static byte[] decrypt(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider) throws JOSEException {
        SecretKey aESKey = KeyUtils.toAESKey(secretKey);
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AES/GCM/NoPadding", provider) : Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, aESKey, new GCMParameterSpec(128, bArr));
            cipher.updateAAD(bArr3);
            try {
                return cipher.doFinal(ByteUtils.concat(bArr2, bArr4));
            } catch (BadPaddingException | IllegalBlockSizeException e5) {
                throw new JOSEException(a.d(e5, new StringBuilder("AES/GCM/NoPadding decryption failed: ")), e5);
            }
        } catch (NoClassDefFoundError unused) {
            return LegacyAESGCM.decrypt(aESKey, bArr, bArr2, bArr3, bArr4);
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e);
        } catch (InvalidKeyException e10) {
            e = e10;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e);
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e);
        } catch (NoSuchPaddingException e12) {
            e = e12;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e);
        }
    }

    public static AuthenticatedCipherText encrypt(SecretKey secretKey, Container<byte[]> container, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        SecretKey aESKey = KeyUtils.toAESKey(secretKey);
        byte[] bArr3 = container.get();
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AES/GCM/NoPadding", provider) : Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, aESKey, new GCMParameterSpec(128, bArr3));
            cipher.updateAAD(bArr2);
            try {
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                int length = bArrDoFinal.length - ByteUtils.byteLength(128);
                byte[] bArrSubArray = ByteUtils.subArray(bArrDoFinal, 0, length);
                byte[] bArrSubArray2 = ByteUtils.subArray(bArrDoFinal, length, ByteUtils.byteLength(128));
                AlgorithmParameters parameters = cipher.getParameters();
                if (parameters == null) {
                    throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
                }
                try {
                    GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
                    byte[] iv = gCMParameterSpec.getIV();
                    int tLen = gCMParameterSpec.getTLen();
                    if (ByteUtils.safeBitLength(iv) != 96) {
                        throw new JOSEException(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(ByteUtils.safeBitLength(iv))));
                    }
                    if (tLen != 128) {
                        throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(tLen)));
                    }
                    container.set(iv);
                    return new AuthenticatedCipherText(bArrSubArray, bArrSubArray2);
                } catch (InvalidParameterSpecException e5) {
                    throw new JOSEException(e5.getMessage(), e5);
                }
            } catch (BadPaddingException | IllegalBlockSizeException e7) {
                throw new JOSEException(a.d(e7, new StringBuilder("Couldn't encrypt with AES/GCM/NoPadding: ")), e7);
            }
        } catch (NoClassDefFoundError unused) {
            return LegacyAESGCM.encrypt(aESKey, bArr3, bArr, bArr2);
        } catch (InvalidAlgorithmParameterException e10) {
            e = e10;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e);
        } catch (InvalidKeyException e11) {
            e = e11;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e);
        } catch (NoSuchAlgorithmException e12) {
            e = e12;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e);
        } catch (NoSuchPaddingException e13) {
            e = e13;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e);
        }
    }

    public static byte[] generateIV(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
