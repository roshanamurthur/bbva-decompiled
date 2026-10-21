package com.nimbusds.jose.jwk;

import com.nimbusds.jose.JWSAlgorithm;
import ii.a;
import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import net.jcip.annotations.Immutable;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class Curve implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f62624p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f62625q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f62626r0;
    public static final Curve P_256 = new Curve("P-256", "secp256r1", "1.2.840.10045.3.1.7");
    public static final Curve SECP256K1 = new Curve("secp256k1", "secp256k1", "1.3.132.0.10");

    @Deprecated
    public static final Curve P_256K = new Curve("P-256K", "secp256k1", "1.3.132.0.10");
    public static final Curve P_384 = new Curve("P-384", "secp384r1", "1.3.132.0.34");
    public static final Curve P_521 = new Curve("P-521", "secp521r1", "1.3.132.0.35");
    public static final Curve Ed25519 = new Curve(EdDSAParameterSpec.Ed25519, EdDSAParameterSpec.Ed25519, null);
    public static final Curve Ed448 = new Curve(EdDSAParameterSpec.Ed448, EdDSAParameterSpec.Ed448, null);
    public static final Curve X25519 = new Curve(XDHParameterSpec.X25519, XDHParameterSpec.X25519, null);
    public static final Curve X448 = new Curve(XDHParameterSpec.X448, XDHParameterSpec.X448, null);

    public Curve(String str) {
        this(str, null, null);
    }

    public static Curve forECParameterSpec(ECParameterSpec eCParameterSpec) {
        ECParameterSpec eCParameterSpec2 = a.f69712a;
        if (eCParameterSpec == null) {
            return null;
        }
        int fieldSize = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec3 = a.f69712a;
        if (fieldSize == eCParameterSpec3.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec3.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec3.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec3.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec3.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec3.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec3.getCofactor()) {
            return P_256;
        }
        int fieldSize2 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec4 = a.f69713b;
        if (fieldSize2 == eCParameterSpec4.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec4.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec4.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec4.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec4.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec4.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec4.getCofactor()) {
            return SECP256K1;
        }
        int fieldSize3 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec5 = a.f69714c;
        if (fieldSize3 == eCParameterSpec5.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec5.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec5.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec5.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec5.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec5.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec5.getCofactor()) {
            return P_384;
        }
        int fieldSize4 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec6 = a.f69715d;
        if (fieldSize4 == eCParameterSpec6.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec6.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec6.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec6.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec6.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec6.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec6.getCofactor()) {
            return P_521;
        }
        return null;
    }

    public static Set<Curve> forJWSAlgorithm(JWSAlgorithm jWSAlgorithm) {
        if (JWSAlgorithm.ES256.equals(jWSAlgorithm)) {
            return Collections.singleton(P_256);
        }
        if (JWSAlgorithm.ES256K.equals(jWSAlgorithm)) {
            return Collections.singleton(SECP256K1);
        }
        if (JWSAlgorithm.ES384.equals(jWSAlgorithm)) {
            return Collections.singleton(P_384);
        }
        if (JWSAlgorithm.ES512.equals(jWSAlgorithm)) {
            return Collections.singleton(P_521);
        }
        if (JWSAlgorithm.EdDSA.equals(jWSAlgorithm)) {
            return Collections.unmodifiableSet(new HashSet(Arrays.asList(Ed25519, Ed448)));
        }
        return null;
    }

    public static Curve forOID(String str) {
        Curve curve = P_256;
        if (curve.getOID().equals(str)) {
            return curve;
        }
        Curve curve2 = SECP256K1;
        if (curve2.getOID().equals(str)) {
            return curve2;
        }
        Curve curve3 = P_384;
        if (curve3.getOID().equals(str)) {
            return curve3;
        }
        Curve curve4 = P_521;
        if (curve4.getOID().equals(str)) {
            return curve4;
        }
        return null;
    }

    public static Curve forStdName(String str) {
        if ("secp256r1".equals(str) || "prime256v1".equals(str)) {
            return P_256;
        }
        if ("secp256k1".equals(str)) {
            return SECP256K1;
        }
        if ("secp384r1".equals(str)) {
            return P_384;
        }
        if ("secp521r1".equals(str)) {
            return P_521;
        }
        Curve curve = Ed25519;
        if (curve.getStdName().equals(str)) {
            return curve;
        }
        Curve curve2 = Ed448;
        if (curve2.getStdName().equals(str)) {
            return curve2;
        }
        Curve curve3 = X25519;
        if (curve3.getStdName().equals(str)) {
            return curve3;
        }
        Curve curve4 = X448;
        if (curve4.getStdName().equals(str)) {
            return curve4;
        }
        return null;
    }

    public static Curve parse(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        Curve curve = P_256;
        if (str.equals(curve.getName())) {
            return curve;
        }
        Curve curve2 = P_256K;
        if (str.equals(curve2.getName())) {
            return curve2;
        }
        Curve curve3 = SECP256K1;
        if (str.equals(curve3.getName())) {
            return curve3;
        }
        Curve curve4 = P_384;
        if (str.equals(curve4.getName())) {
            return curve4;
        }
        Curve curve5 = P_521;
        if (str.equals(curve5.getName())) {
            return curve5;
        }
        Curve curve6 = Ed25519;
        if (str.equals(curve6.getName())) {
            return curve6;
        }
        Curve curve7 = Ed448;
        if (str.equals(curve7.getName())) {
            return curve7;
        }
        Curve curve8 = X25519;
        if (str.equals(curve8.getName())) {
            return curve8;
        }
        Curve curve9 = X448;
        return str.equals(curve9.getName()) ? curve9 : new Curve(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Curve) && toString().equals(obj.toString());
    }

    public String getName() {
        return this.f62624p0;
    }

    public String getOID() {
        return this.f62626r0;
    }

    public String getStdName() {
        return this.f62625q0;
    }

    public ECParameterSpec toECParameterSpec() {
        ECParameterSpec eCParameterSpec = a.f69712a;
        if (P_256.equals(this)) {
            return a.f69712a;
        }
        if (SECP256K1.equals(this)) {
            return a.f69713b;
        }
        if (P_384.equals(this)) {
            return a.f69714c;
        }
        if (P_521.equals(this)) {
            return a.f69715d;
        }
        return null;
    }

    public String toString() {
        return getName();
    }

    public Curve(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
        }
        this.f62624p0 = str;
        this.f62625q0 = str2;
        this.f62626r0 = str3;
    }
}
