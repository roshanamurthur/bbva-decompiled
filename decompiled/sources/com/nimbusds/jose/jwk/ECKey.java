package com.nimbusds.jose.jwk;

import androidx.emoji2.text.flatbuffer.a;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.utils.ECChecks;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.BigIntegerUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import ii.b;
import java.math.BigInteger;
import java.net.URI;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.jcip.annotations.Immutable;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class ECKey extends JWK implements AsymmetricJWK, CurveBasedJWK {
    public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.P_256, Curve.SECP256K1, Curve.P_384, Curve.P_521)));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Curve f62627p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Base64URL f62628q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Base64URL f62629r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Base64URL f62630s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final PrivateKey f62631t0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Curve f62632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Base64URL f62633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Base64URL f62634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Base64URL f62635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PrivateKey f62636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public KeyUse f62637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Set<KeyOperation> f62638g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Algorithm f62639h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f62640i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public URI f62641j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public Base64URL f62642k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Base64URL f62643l;
        public List<Base64> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public KeyStore f62644n;

        public Builder(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
            if (curve == null) {
                throw new IllegalArgumentException("The curve must not be null");
            }
            this.f62632a = curve;
            if (base64URL == null) {
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            this.f62633b = base64URL;
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            this.f62634c = base64URL2;
        }

        public Builder algorithm(Algorithm algorithm) {
            this.f62639h = algorithm;
            return this;
        }

        public ECKey build() {
            try {
                if (this.f62635d == null && this.f62636e == null) {
                    return new ECKey(this.f62632a, this.f62633b, this.f62634c, this.f62637f, this.f62638g, this.f62639h, this.f62640i, this.f62641j, this.f62642k, this.f62643l, this.m, this.f62644n);
                }
                return this.f62636e != null ? new ECKey(this.f62632a, this.f62633b, this.f62634c, this.f62636e, this.f62637f, this.f62638g, this.f62639h, this.f62640i, this.f62641j, this.f62642k, this.f62643l, this.m, this.f62644n) : new ECKey(this.f62632a, this.f62633b, this.f62634c, this.f62635d, this.f62637f, this.f62638g, this.f62639h, this.f62640i, this.f62641j, this.f62642k, this.f62643l, this.m, this.f62644n);
            } catch (IllegalArgumentException e5) {
                throw new IllegalStateException(e5.getMessage(), e5);
            }
        }

        public Builder d(Base64URL base64URL) {
            this.f62635d = base64URL;
            return this;
        }

        public Builder keyID(String str) {
            this.f62640i = str;
            return this;
        }

        public Builder keyIDFromThumbprint() throws JOSEException {
            return keyIDFromThumbprint("SHA-256");
        }

        public Builder keyOperations(Set<KeyOperation> set) {
            this.f62638g = set;
            return this;
        }

        public Builder keyStore(KeyStore keyStore) {
            this.f62644n = keyStore;
            return this;
        }

        public Builder keyUse(KeyUse keyUse) {
            this.f62637f = keyUse;
            return this;
        }

        public Builder privateKey(ECPrivateKey eCPrivateKey) {
            if (eCPrivateKey != null) {
                this.f62635d = ECKey.encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS());
            }
            return this;
        }

        public Builder x509CertChain(List<Base64> list) {
            this.m = list;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            this.f62643l = base64URL;
            return this;
        }

        @Deprecated
        public Builder x509CertThumbprint(Base64URL base64URL) {
            this.f62642k = base64URL;
            return this;
        }

        public Builder x509CertURL(URI uri) {
            this.f62641j = uri;
            return this;
        }

        public Builder keyIDFromThumbprint(String str) throws JOSEException {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("crv", this.f62632a.toString());
            linkedHashMap.put("kty", KeyType.EC.getValue());
            linkedHashMap.put("x", this.f62633b.toString());
            linkedHashMap.put("y", this.f62634c.toString());
            this.f62640i = ThumbprintUtils.compute(str, (LinkedHashMap<String, ?>) linkedHashMap).toString();
            return this;
        }

        public Builder privateKey(PrivateKey privateKey) {
            if (privateKey instanceof ECPrivateKey) {
                return privateKey((ECPrivateKey) privateKey);
            }
            if (!LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC.equalsIgnoreCase(privateKey.getAlgorithm())) {
                throw new IllegalArgumentException("The private key algorithm must be EC");
            }
            this.f62636e = privateKey;
            return this;
        }

        public Builder(Curve curve, ECPublicKey eCPublicKey) {
            this(curve, ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }

        public Builder(ECKey eCKey) {
            this.f62632a = eCKey.f62627p0;
            this.f62633b = eCKey.f62628q0;
            this.f62634c = eCKey.f62629r0;
            this.f62635d = eCKey.f62630s0;
            this.f62636e = eCKey.f62631t0;
            this.f62637f = eCKey.getKeyUse();
            this.f62638g = eCKey.getKeyOperations();
            this.f62639h = eCKey.getAlgorithm();
            this.f62640i = eCKey.getKeyID();
            this.f62641j = eCKey.getX509CertURL();
            this.f62642k = eCKey.getX509CertThumbprint();
            this.f62643l = eCKey.getX509CertSHA256Thumbprint();
            this.m = eCKey.getX509CertChain();
            this.f62644n = eCKey.getKeyStore();
        }
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.f62627p0 = curve;
        if (base64URL == null) {
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.f62628q0 = base64URL;
        if (base64URL2 == null) {
            throw new IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.f62629r0 = base64URL2;
        b(curve, base64URL, base64URL2);
        a(getParsedX509CertChain());
        this.f62630s0 = null;
        this.f62631t0 = null;
    }

    public static void b(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        if (ECChecks.isPointOnCurve(base64URL.decodeToBigInteger(), base64URL2.decodeToBigInteger(), curve.toECParameterSpec())) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + curve + " curve");
    }

    public static Base64URL encodeCoordinate(int i10, BigInteger bigInteger) {
        byte[] bytesUnsigned = BigIntegerUtils.toBytesUnsigned(bigInteger);
        int i11 = (i10 + 7) / 8;
        if (bytesUnsigned.length >= i11) {
            return Base64URL.encode(bytesUnsigned);
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(bytesUnsigned, 0, bArr, i11 - bytesUnsigned.length, bytesUnsigned.length);
        return Base64URL.encode(bArr);
    }

    public static ECKey load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof X509Certificate)) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof ECPublicKey)) {
            throw new JOSEException("Couldn't load EC JWK: The key algorithm is not EC");
        }
        ECKey eCKeyBuild = new Builder(parse(x509Certificate)).keyID(str).keyStore(keyStore).build();
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof ECPrivateKey) {
                return new Builder(eCKeyBuild).privateKey((ECPrivateKey) key).build();
            }
            return ((key instanceof PrivateKey) && LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC.equalsIgnoreCase(key.getAlgorithm())) ? new Builder(eCKeyBuild).privateKey((PrivateKey) key).build() : eCKeyBuild;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e5) {
            throw new JOSEException(a.d(e5, new StringBuilder("Couldn't retrieve private EC key (bad pin?): ")), e5);
        }
    }

    public static ECKey parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }

    public final void a(List<X509Certificate> list) {
        if (list != null && !matches(list.get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECKey) || !super.equals(obj)) {
            return false;
        }
        ECKey eCKey = (ECKey) obj;
        return Objects.equals(this.f62627p0, eCKey.f62627p0) && Objects.equals(this.f62628q0, eCKey.f62628q0) && Objects.equals(this.f62629r0, eCKey.f62629r0) && Objects.equals(this.f62630s0, eCKey.f62630s0) && Objects.equals(this.f62631t0, eCKey.f62631t0);
    }

    @Override // com.nimbusds.jose.jwk.CurveBasedJWK
    public Curve getCurve() {
        return this.f62627p0;
    }

    public Base64URL getD() {
        return this.f62630s0;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("crv", this.f62627p0.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("x", this.f62628q0.toString());
        linkedHashMap.put("y", this.f62629r0.toString());
        return linkedHashMap;
    }

    public Base64URL getX() {
        return this.f62628q0;
    }

    public Base64URL getY() {
        return this.f62629r0;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f62627p0, this.f62628q0, this.f62629r0, this.f62630s0, this.f62631t0);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.f62630s0 == null && this.f62631t0 == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public boolean matches(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (getX().decodeToBigInteger().equals(eCPublicKey.getW().getAffineX())) {
                return getY().decodeToBigInteger().equals(eCPublicKey.getW().getAffineY());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        Curve curve = this.f62627p0;
        ECParameterSpec eCParameterSpec = curve.toECParameterSpec();
        if (eCParameterSpec != null) {
            return eCParameterSpec.getCurve().getField().getFieldSize();
        }
        throw new UnsupportedOperationException("Couldn't determine field size for curve " + curve.getName());
    }

    public ECPrivateKey toECPrivateKey() throws JOSEException {
        return toECPrivateKey(null);
    }

    public ECPublicKey toECPublicKey() throws JOSEException {
        return toECPublicKey(null);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.f62627p0.toString());
        jSONObject.put("x", this.f62628q0.toString());
        jSONObject.put("y", this.f62629r0.toString());
        Base64URL base64URL = this.f62630s0;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public KeyPair toKeyPair() throws JOSEException {
        return toKeyPair(null);
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PrivateKey toPrivateKey() throws JOSEException {
        ECPrivateKey eCPrivateKey = toECPrivateKey();
        return eCPrivateKey != null ? eCPrivateKey : this.f62631t0;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PublicKey toPublicKey() throws JOSEException {
        return toECPublicKey();
    }

    public static ECKey parse(Map<String, Object> map) throws ParseException {
        if (!KeyType.EC.equals(b.c(map))) {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
        try {
            Curve curve = Curve.parse(JSONObjectUtils.getString(map, "crv"));
            Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "x");
            Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, "y");
            Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map, "d");
            try {
                return base64URL3 == null ? new ECKey(curve, base64URL, base64URL2, b.d(map), b.b(map), b.a(map), JSONObjectUtils.getString(map, "kid"), JSONObjectUtils.getURI(map, "x5u"), JSONObjectUtils.getBase64URL(map, "x5t"), JSONObjectUtils.getBase64URL(map, "x5t#S256"), b.e(map), (KeyStore) null) : new ECKey(curve, base64URL, base64URL2, base64URL3, b.d(map), b.b(map), b.a(map), JSONObjectUtils.getString(map, "kid"), JSONObjectUtils.getURI(map, "x5u"), JSONObjectUtils.getBase64URL(map, "x5t"), JSONObjectUtils.getBase64URL(map, "x5t#S256"), b.e(map), (KeyStore) null);
            } catch (IllegalArgumentException e5) {
                throw new ParseException(e5.getMessage(), 0);
            }
        } catch (IllegalArgumentException e7) {
            throw new ParseException(e7.getMessage(), 0);
        }
    }

    public ECPrivateKey toECPrivateKey(Provider provider) throws JOSEException {
        Base64URL base64URL = this.f62630s0;
        if (base64URL == null) {
            return null;
        }
        Curve curve = this.f62627p0;
        ECParameterSpec eCParameterSpec = curve.toECParameterSpec();
        if (eCParameterSpec == null) {
            throw new JOSEException("Couldn't get EC parameter spec for curve " + curve);
        }
        try {
            return (ECPrivateKey) (provider == null ? KeyFactory.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC) : KeyFactory.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, provider)).generatePrivate(new ECPrivateKeySpec(base64URL.decodeToBigInteger(), eCParameterSpec));
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            throw new JOSEException(e.getMessage(), e);
        } catch (InvalidKeySpecException e7) {
            e = e7;
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public ECPublicKey toECPublicKey(Provider provider) throws JOSEException {
        Curve curve = this.f62627p0;
        ECParameterSpec eCParameterSpec = curve.toECParameterSpec();
        if (eCParameterSpec == null) {
            throw new JOSEException("Couldn't get EC parameter spec for curve " + curve);
        }
        try {
            return (ECPublicKey) (provider == null ? KeyFactory.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC) : KeyFactory.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, provider)).generatePublic(new ECPublicKeySpec(new ECPoint(this.f62628q0.decodeToBigInteger(), this.f62629r0.decodeToBigInteger()), eCParameterSpec));
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            throw new JOSEException(e.getMessage(), e);
        } catch (InvalidKeySpecException e7) {
            e = e7;
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public KeyPair toKeyPair(Provider provider) throws JOSEException {
        PrivateKey privateKey = this.f62631t0;
        return privateKey != null ? new KeyPair(toECPublicKey(provider), privateKey) : new KeyPair(toECPublicKey(provider), toECPrivateKey(provider));
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public ECKey toPublicJWK() {
        return new ECKey(getCurve(), getX(), getY(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getKeyStore());
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, keyStore);
        if (curve != null) {
            this.f62627p0 = curve;
            if (base64URL != null) {
                this.f62628q0 = base64URL;
                if (base64URL2 != null) {
                    this.f62629r0 = base64URL2;
                    b(curve, base64URL, base64URL2);
                    a(getParsedX509CertChain());
                    if (base64URL3 != null) {
                        this.f62630s0 = base64URL3;
                        this.f62631t0 = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        if (curve != null) {
            this.f62627p0 = curve;
            if (base64URL != null) {
                this.f62628q0 = base64URL;
                if (base64URL2 != null) {
                    this.f62629r0 = base64URL2;
                    b(curve, base64URL, base64URL2);
                    a(getParsedX509CertChain());
                    this.f62630s0 = null;
                    this.f62631t0 = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static ECKey parse(X509Certificate x509Certificate) throws JOSEException {
        if (x509Certificate.getPublicKey() instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) x509Certificate.getPublicKey();
            try {
                String string = new JcaX509CertificateHolder(x509Certificate).getSubjectPublicKeyInfo().getAlgorithm().getParameters().toString();
                Curve curveForOID = Curve.forOID(string);
                if (curveForOID != null) {
                    return new Builder(curveForOID, eCPublicKey).keyUse(KeyUse.from(x509Certificate)).keyID(x509Certificate.getSerialNumber().toString(10)).x509CertChain(Collections.singletonList(Base64.encode(x509Certificate.getEncoded()))).x509CertSHA256Thumbprint(Base64URL.encode(MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded()))).build();
                }
                throw new JOSEException("Couldn't determine EC JWK curve for OID " + string);
            } catch (NoSuchAlgorithmException e5) {
                throw new JOSEException("Couldn't encode x5t parameter: " + e5.getMessage(), e5);
            } catch (CertificateEncodingException e7) {
                throw new JOSEException("Couldn't encode x5c parameter: " + e7.getMessage(), e7);
            }
        }
        throw new JOSEException("The public key of the X.509 certificate is not EC");
    }

    public ECKey(Curve curve, ECPublicKey eCPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public ECKey(Curve curve, ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public ECKey(Curve curve, ECPublicKey eCPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }
}
