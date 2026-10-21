package org.bouncycastle.jcajce.provider.symmetric.util;

import ad.d;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes8.dex */
public class BaseSecretKeyFactory extends SecretKeyFactorySpi implements PBE {
    protected String algName;
    protected ASN1ObjectIdentifier algOid;

    public BaseSecretKeyFactory(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algName = str;
        this.algOid = aSN1ObjectIdentifier;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof SecretKeySpec) {
            return new SecretKeySpec(((SecretKeySpec) keySpec).getEncoded(), this.algName);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        }
        if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.algName);
        }
        try {
            return (KeySpec) cls.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
        } catch (Exception e5) {
            throw new InvalidKeySpecException(e5.toString());
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey == null) {
            throw new InvalidKeyException("key parameter is null");
        }
        if (secretKey.getAlgorithm().equalsIgnoreCase(this.algName)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.algName);
        }
        throw new InvalidKeyException(d.f(new StringBuilder("Key not of type "), this.algName, Constant.DOT_STRING));
    }
}
