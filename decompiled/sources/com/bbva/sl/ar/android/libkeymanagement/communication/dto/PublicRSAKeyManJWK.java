package com.bbva.sl.ar.android.libkeymanagement.communication.dto;

import com.bbva.sl.ar.android.libkeymanagement.exception.ErrorCodeEnum;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.validation.ArgumentValidator;
import com.bbva.sl.ar.keymng.common.encoding.Base64Url;
import com.bbva.sl.ar.keymng.jwk.KeyManJWK;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class PublicRSAKeyManJWK extends KeyManJWK {
    private static final String E_ATTR = "e";
    private static final String KID_ATTR = "kid";
    private static final String KTY_ATTR = "kty";
    private static final String N_ATTR = "n";
    private static final String RSA_TAG = "RSA";

    @JsonCreator
    public PublicRSAKeyManJWK(@JsonProperty(KID_ATTR) String str, @JsonProperty(KTY_ATTR) String str2, @JsonProperty(E_ATTR) String str3, @JsonProperty(N_ATTR) String str4) throws KeyManagementException {
        this(str, createRSAPublicKey(str2, str3, str4));
    }

    private static RSAPublicKey createRSAPublicKey(String str, String str2, String str3) throws KeyManagementException {
        ArgumentValidator.validateNotEmptyString(str, KTY_ATTR);
        if (!str.equalsIgnoreCase("RSA")) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_CRY_NOT_RSA);
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(Base64Url.decodeString(str3)), new BigInteger(Base64Url.decodeString(str2))));
        } catch (NoSuchAlgorithmException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_CRY_MAC_BAD_ALG_RSA, e5);
        } catch (InvalidKeySpecException e7) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_INVALID_KEY_SPEC_RSA, e7);
        }
    }

    @JsonProperty(E_ATTR)
    public String getExponent() {
        return toRSAKey().getPublicExponent().toString();
    }

    @JsonProperty(KID_ATTR)
    public String getKeyId() {
        return super.getKeyId();
    }

    @JsonProperty(KTY_ATTR)
    public String getKeyType() {
        return super.getKeyType();
    }

    @JsonProperty(N_ATTR)
    public String getModulus() {
        return toRSAKey().getModulus().toString();
    }

    public PublicRSAKeyManJWK(String str, RSAPublicKey rSAPublicKey) {
        super(str, rSAPublicKey);
    }
}
