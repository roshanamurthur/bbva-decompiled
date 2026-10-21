package com.nimbusds.jose.jwk;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ThumbprintUtils {
    public static Base64URL compute(JWK jwk) throws JOSEException {
        return compute("SHA-256", jwk);
    }

    public static Base64URL compute(String str, JWK jwk) throws JOSEException {
        return compute(str, jwk.getRequiredParams());
    }

    public static Base64URL compute(String str, LinkedHashMap<String, ?> linkedHashMap) throws JOSEException {
        String jSONString = JSONObjectUtils.toJSONString(linkedHashMap);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(jSONString.getBytes(StandardCharset.UTF_8));
            return Base64URL.encode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e5) {
            throw new JOSEException("Couldn't compute JWK thumbprint: Unsupported hash algorithm: " + e5.getMessage(), e5);
        }
    }
}
