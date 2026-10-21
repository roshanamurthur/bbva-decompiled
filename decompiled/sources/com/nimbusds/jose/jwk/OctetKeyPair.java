package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import ii.b;
import java.net.URI;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
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

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class OctetKeyPair extends JWK implements AsymmetricJWK, CurveBasedJWK {
    public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.Ed25519, Curve.Ed448, Curve.X25519, Curve.X448)));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Curve f62674p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Base64URL f62675q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f62676r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Base64URL f62677s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f62678t0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Curve f62679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Base64URL f62680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Base64URL f62681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public KeyUse f62682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set<KeyOperation> f62683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Algorithm f62684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f62685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public URI f62686h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public Base64URL f62687i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Base64URL f62688j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<Base64> f62689k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public KeyStore f62690l;

        public Builder(Curve curve, Base64URL base64URL) {
            if (curve == null) {
                throw new IllegalArgumentException("The curve must not be null");
            }
            this.f62679a = curve;
            if (base64URL == null) {
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            this.f62680b = base64URL;
        }

        public Builder algorithm(Algorithm algorithm) {
            this.f62684f = algorithm;
            return this;
        }

        public OctetKeyPair build() {
            try {
                return this.f62681c == null ? new OctetKeyPair(this.f62679a, this.f62680b, this.f62682d, this.f62683e, this.f62684f, this.f62685g, this.f62686h, this.f62687i, this.f62688j, this.f62689k, this.f62690l) : new OctetKeyPair(this.f62679a, this.f62680b, this.f62681c, this.f62682d, this.f62683e, this.f62684f, this.f62685g, this.f62686h, this.f62687i, this.f62688j, this.f62689k, this.f62690l);
            } catch (IllegalArgumentException e5) {
                throw new IllegalStateException(e5.getMessage(), e5);
            }
        }

        public Builder d(Base64URL base64URL) {
            this.f62681c = base64URL;
            return this;
        }

        public Builder keyID(String str) {
            this.f62685g = str;
            return this;
        }

        public Builder keyIDFromThumbprint() throws JOSEException {
            return keyIDFromThumbprint("SHA-256");
        }

        public Builder keyOperations(Set<KeyOperation> set) {
            this.f62683e = set;
            return this;
        }

        public Builder keyStore(KeyStore keyStore) {
            this.f62690l = keyStore;
            return this;
        }

        public Builder keyUse(KeyUse keyUse) {
            this.f62682d = keyUse;
            return this;
        }

        public Builder x509CertChain(List<Base64> list) {
            this.f62689k = list;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            this.f62688j = base64URL;
            return this;
        }

        @Deprecated
        public Builder x509CertThumbprint(Base64URL base64URL) {
            this.f62687i = base64URL;
            return this;
        }

        public Builder x509CertURL(URI uri) {
            this.f62686h = uri;
            return this;
        }

        public Builder keyIDFromThumbprint(String str) throws JOSEException {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("crv", this.f62679a.toString());
            linkedHashMap.put("kty", KeyType.OKP.getValue());
            linkedHashMap.put("x", this.f62680b.toString());
            this.f62685g = ThumbprintUtils.compute(str, (LinkedHashMap<String, ?>) linkedHashMap).toString();
            return this;
        }

        public Builder(OctetKeyPair octetKeyPair) {
            this.f62679a = octetKeyPair.f62674p0;
            this.f62680b = octetKeyPair.f62675q0;
            this.f62681c = octetKeyPair.f62677s0;
            this.f62682d = octetKeyPair.getKeyUse();
            this.f62683e = octetKeyPair.getKeyOperations();
            this.f62684f = octetKeyPair.getAlgorithm();
            this.f62685g = octetKeyPair.getKeyID();
            this.f62686h = octetKeyPair.getX509CertURL();
            this.f62687i = octetKeyPair.getX509CertThumbprint();
            this.f62688j = octetKeyPair.getX509CertSHA256Thumbprint();
            this.f62689k = octetKeyPair.getX509CertChain();
            this.f62690l = octetKeyPair.getKeyStore();
        }
    }

    public OctetKeyPair(Curve curve, Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, keyStore);
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        this.f62674p0 = curve;
        if (base64URL == null) {
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.f62675q0 = base64URL;
        this.f62676r0 = base64URL.decode();
        this.f62677s0 = null;
        this.f62678t0 = null;
    }

    public static OctetKeyPair parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OctetKeyPair) || !super.equals(obj)) {
            return false;
        }
        OctetKeyPair octetKeyPair = (OctetKeyPair) obj;
        return Objects.equals(this.f62674p0, octetKeyPair.f62674p0) && Objects.equals(this.f62675q0, octetKeyPair.f62675q0) && Arrays.equals(this.f62676r0, octetKeyPair.f62676r0) && Objects.equals(this.f62677s0, octetKeyPair.f62677s0) && Arrays.equals(this.f62678t0, octetKeyPair.f62678t0);
    }

    @Override // com.nimbusds.jose.jwk.CurveBasedJWK
    public Curve getCurve() {
        return this.f62674p0;
    }

    public Base64URL getD() {
        return this.f62677s0;
    }

    public byte[] getDecodedD() {
        byte[] bArr = this.f62678t0;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public byte[] getDecodedX() {
        return (byte[]) this.f62676r0.clone();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("crv", this.f62674p0.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("x", this.f62675q0.toString());
        return linkedHashMap;
    }

    public Base64URL getX() {
        return this.f62675q0;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Arrays.hashCode(this.f62678t0) + ((Arrays.hashCode(this.f62676r0) + (Objects.hash(Integer.valueOf(super.hashCode()), this.f62674p0, this.f62675q0, this.f62677s0) * 31)) * 31);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return this.f62677s0 != null;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public boolean matches(X509Certificate x509Certificate) {
        return false;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        return ByteUtils.bitLength(this.f62675q0.decode());
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.f62674p0.toString());
        jSONObject.put("x", this.f62675q0.toString());
        Base64URL base64URL = this.f62677s0;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public KeyPair toKeyPair() throws JOSEException {
        throw new JOSEException("Export to java.security.KeyPair not supported");
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PrivateKey toPrivateKey() throws JOSEException {
        throw new JOSEException("Export to java.security.PrivateKey not supported");
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PublicKey toPublicKey() throws JOSEException {
        throw new JOSEException("Export to java.security.PublicKey not supported");
    }

    public static OctetKeyPair parse(Map<String, Object> map) throws ParseException {
        if (!KeyType.OKP.equals(b.c(map))) {
            throw new ParseException("The key type \"kty\" must be OKP", 0);
        }
        try {
            Curve curve = Curve.parse(JSONObjectUtils.getString(map, "crv"));
            Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "x");
            Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, "d");
            try {
                return base64URL2 == null ? new OctetKeyPair(curve, base64URL, b.d(map), b.b(map), b.a(map), JSONObjectUtils.getString(map, "kid"), JSONObjectUtils.getURI(map, "x5u"), JSONObjectUtils.getBase64URL(map, "x5t"), JSONObjectUtils.getBase64URL(map, "x5t#S256"), b.e(map), null) : new OctetKeyPair(curve, base64URL, base64URL2, b.d(map), b.b(map), b.a(map), JSONObjectUtils.getString(map, "kid"), JSONObjectUtils.getURI(map, "x5u"), JSONObjectUtils.getBase64URL(map, "x5t"), JSONObjectUtils.getBase64URL(map, "x5t#S256"), b.e(map), null);
            } catch (IllegalArgumentException e5) {
                throw new ParseException(e5.getMessage(), 0);
            }
        } catch (IllegalArgumentException e7) {
            throw new ParseException(e7.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public OctetKeyPair toPublicJWK() {
        return new OctetKeyPair(getCurve(), getX(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getKeyStore());
    }

    public OctetKeyPair(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        if (curve != null) {
            if (SUPPORTED_CURVES.contains(curve)) {
                this.f62674p0 = curve;
                if (base64URL != null) {
                    this.f62675q0 = base64URL;
                    this.f62676r0 = base64URL.decode();
                    if (base64URL2 != null) {
                        this.f62677s0 = base64URL2;
                        this.f62678t0 = base64URL2.decode();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
