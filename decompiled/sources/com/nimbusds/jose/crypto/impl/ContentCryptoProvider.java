package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.Container;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class ContentCryptoProvider {
    public static final Map<Integer, Set<EncryptionMethod>> COMPATIBLE_ENCRYPTION_METHODS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EncryptionMethod encryptionMethod = EncryptionMethod.A128CBC_HS256;
        linkedHashSet.add(encryptionMethod);
        EncryptionMethod encryptionMethod2 = EncryptionMethod.A192CBC_HS384;
        linkedHashSet.add(encryptionMethod2);
        EncryptionMethod encryptionMethod3 = EncryptionMethod.A256CBC_HS512;
        linkedHashSet.add(encryptionMethod3);
        EncryptionMethod encryptionMethod4 = EncryptionMethod.A128GCM;
        linkedHashSet.add(encryptionMethod4);
        EncryptionMethod encryptionMethod5 = EncryptionMethod.A192GCM;
        linkedHashSet.add(encryptionMethod5);
        EncryptionMethod encryptionMethod6 = EncryptionMethod.A256GCM;
        linkedHashSet.add(encryptionMethod6);
        EncryptionMethod encryptionMethod7 = EncryptionMethod.A128CBC_HS256_DEPRECATED;
        linkedHashSet.add(encryptionMethod7);
        EncryptionMethod encryptionMethod8 = EncryptionMethod.A256CBC_HS512_DEPRECATED;
        linkedHashSet.add(encryptionMethod8);
        SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(linkedHashSet);
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(encryptionMethod4);
        hashSet2.add(encryptionMethod5);
        hashSet3.add(encryptionMethod6);
        hashSet3.add(encryptionMethod);
        hashSet3.add(encryptionMethod7);
        hashSet4.add(encryptionMethod2);
        hashSet5.add(encryptionMethod3);
        hashSet5.add(encryptionMethod8);
        map.put(128, Collections.unmodifiableSet(hashSet));
        map.put(192, Collections.unmodifiableSet(hashSet2));
        map.put(256, Collections.unmodifiableSet(hashSet3));
        map.put(Integer.valueOf(BluetoothState.REQUEST_CONNECT_DEVICE), Collections.unmodifiableSet(hashSet4));
        map.put(512, Collections.unmodifiableSet(hashSet5));
        COMPATIBLE_ENCRYPTION_METHODS = Collections.unmodifiableMap(map);
    }

    public static void a(SecretKey secretKey, EncryptionMethod encryptionMethod) throws KeyLengthException {
        try {
            if (encryptionMethod.cekBitLength() == ByteUtils.safeBitLength(secretKey.getEncoded())) {
                return;
            }
            throw new KeyLengthException("The Content Encryption Key (CEK) length for " + encryptionMethod + " must be " + encryptionMethod.cekBitLength() + " bits");
        } catch (IntegerOverflowException e5) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e5.getMessage());
        }
    }

    public static byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, SecretKey secretKey, JWEJCAContext jWEJCAContext) throws JOSEException {
        byte[] bArrDecryptAuthenticated;
        a(secretKey, jWEHeader.getEncryptionMethod());
        byte[] bArrCompute = AAD.compute(jWEHeader);
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            bArrDecryptAuthenticated = AESCBC.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), bArrCompute, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
            bArrDecryptAuthenticated = AESGCM.decrypt(secretKey, base64URL2.decode(), base64URL3.decode(), bArrCompute, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider());
        } else {
            if (!jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) && !jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
            }
            bArrDecryptAuthenticated = AESCBC.decryptWithConcatKDF(jWEHeader, secretKey, base64URL, base64URL2, base64URL3, base64URL4, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        }
        return DeflateHelper.applyDecompression(jWEHeader, bArrDecryptAuthenticated);
    }

    public static JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, SecretKey secretKey, Base64URL base64URL, JWEJCAContext jWEJCAContext) throws JOSEException {
        byte[] bArrGenerateIV;
        AuthenticatedCipherText authenticatedCipherTextEncryptAuthenticated;
        a(secretKey, jWEHeader.getEncryptionMethod());
        byte[] bArrApplyCompression = DeflateHelper.applyCompression(jWEHeader, bArr);
        byte[] bArrCompute = AAD.compute(jWEHeader);
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            bArrGenerateIV = AESCBC.generateIV(jWEJCAContext.getSecureRandom());
            authenticatedCipherTextEncryptAuthenticated = AESCBC.encryptAuthenticated(secretKey, bArrGenerateIV, bArrApplyCompression, bArrCompute, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
            Container container = new Container(AESGCM.generateIV(jWEJCAContext.getSecureRandom()));
            authenticatedCipherTextEncryptAuthenticated = AESGCM.encrypt(secretKey, container, bArrApplyCompression, bArrCompute, jWEJCAContext.getContentEncryptionProvider());
            bArrGenerateIV = (byte[]) container.get();
        } else {
            if (!jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) && !jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
            }
            bArrGenerateIV = AESCBC.generateIV(jWEJCAContext.getSecureRandom());
            authenticatedCipherTextEncryptAuthenticated = AESCBC.encryptWithConcatKDF(jWEHeader, secretKey, base64URL, bArrGenerateIV, bArrApplyCompression, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        }
        return new JWECryptoParts(jWEHeader, base64URL, Base64URL.encode(bArrGenerateIV), Base64URL.encode(authenticatedCipherTextEncryptAuthenticated.getCipherText()), Base64URL.encode(authenticatedCipherTextEncryptAuthenticated.getAuthenticationTag()));
    }

    public static SecretKey generateCEK(EncryptionMethod encryptionMethod, SecureRandom secureRandom) throws JOSEException {
        Set<EncryptionMethod> set = SUPPORTED_ENCRYPTION_METHODS;
        if (!set.contains(encryptionMethod)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(encryptionMethod, set));
        }
        byte[] bArr = new byte[ByteUtils.byteLength(encryptionMethod.cekBitLength())];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
