package com.nimbusds.jwt;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.Header;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.text.ParseException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class JWTParser {
    public static JWT parse(String str) throws ParseException {
        int iIndexOf = str.indexOf(Constant.DOT_STRING);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid JWT serialization: Missing dot delimiter(s)", 0);
        }
        try {
            Algorithm algorithm = Header.parseAlgorithm(JSONObjectUtils.parse(new Base64URL(str.substring(0, iIndexOf)).decodeToString()));
            if (algorithm.equals(Algorithm.NONE)) {
                return PlainJWT.parse(str);
            }
            if (algorithm instanceof JWSAlgorithm) {
                return SignedJWT.parse(str);
            }
            if (algorithm instanceof JWEAlgorithm) {
                return EncryptedJWT.parse(str);
            }
            throw new AssertionError("Unexpected algorithm type: " + algorithm);
        } catch (ParseException e5) {
            throw new ParseException("Invalid unsecured/JWS/JWE header: " + e5.getMessage(), 0);
        }
    }
}
