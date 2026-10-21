package com.nimbusds.jose.crypto.utils;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes10.dex */
public class ECChecks {
    public static boolean isPointOnCurve(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        return isPointOnCurve(eCPublicKey, eCPrivateKey.getParams());
    }

    public static boolean isPointOnCurve(ECPublicKey eCPublicKey, ECParameterSpec eCParameterSpec) {
        ECPoint w6 = eCPublicKey.getW();
        return isPointOnCurve(w6.getAffineX(), w6.getAffineY(), eCParameterSpec);
    }

    public static boolean isPointOnCurve(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a10 = curve.getA();
        BigInteger b10 = curve.getB();
        BigInteger p4 = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p4).equals(bigInteger.pow(3).add(a10.multiply(bigInteger)).add(b10).mod(p4));
    }
}
