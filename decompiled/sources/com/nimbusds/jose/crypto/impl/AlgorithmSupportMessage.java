package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.jwk.Curve;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public class AlgorithmSupportMessage {
    public static String a(Collection collection) {
        StringBuilder sb2 = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            if (i10 != 0) {
                if (i10 < array.length - 1) {
                    sb2.append(", ");
                } else if (i10 == array.length - 1) {
                    sb2.append(" or ");
                }
            }
            sb2.append(array[i10].toString());
        }
        return sb2.toString();
    }

    public static String unsupportedEllipticCurve(Curve curve, Collection<Curve> collection) {
        return "Unsupported elliptic curve " + curve + ", must be " + a(collection);
    }

    public static String unsupportedEncryptionMethod(EncryptionMethod encryptionMethod, Collection<EncryptionMethod> collection) {
        return "Unsupported JWE encryption method " + encryptionMethod + ", must be " + a(collection);
    }

    public static String unsupportedJWEAlgorithm(JWEAlgorithm jWEAlgorithm, Collection<JWEAlgorithm> collection) {
        return "Unsupported JWE algorithm " + jWEAlgorithm + ", must be " + a(collection);
    }

    public static String unsupportedJWSAlgorithm(JWSAlgorithm jWSAlgorithm, Collection<JWSAlgorithm> collection) {
        return "Unsupported JWS algorithm " + jWSAlgorithm + ", must be " + a(collection);
    }
}
