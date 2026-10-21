package com.nimbusds.jose.jwk;

import androidx.emoji2.text.flatbuffer.a;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import ii.b;
import java.io.Serializable;
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
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import java.security.spec.RSAOtherPrimeInfo;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class RSAKey extends JWK implements AsymmetricJWK {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Base64URL f62693d;
    private final Base64URL dp;
    private final Base64URL dq;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Base64URL f62694e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Base64URL f62695n;
    private final List<OtherPrimesInfo> oth;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Base64URL f62696p;
    private final PrivateKey privateKey;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Base64URL f62697q;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private final Base64URL f62698qi;

    public static class Builder {
        private Algorithm alg;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Base64URL f62699d;
        private Base64URL dp;
        private Base64URL dq;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Base64URL f62700e;
        private String kid;
        private KeyStore ks;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Base64URL f62701n;
        private Set<KeyOperation> ops;
        private List<OtherPrimesInfo> oth;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Base64URL f62702p;
        private PrivateKey priv;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Base64URL f62703q;

        /* JADX INFO: renamed from: qi, reason: collision with root package name */
        private Base64URL f62704qi;
        private KeyUse use;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;

        public Builder(Base64URL base64URL, Base64URL base64URL2) {
            if (base64URL == null) {
                throw new IllegalArgumentException("The modulus value must not be null");
            }
            this.f62701n = base64URL;
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The public exponent value must not be null");
            }
            this.f62700e = base64URL2;
        }

        public Builder algorithm(Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public RSAKey build() {
            try {
                return new RSAKey(this.f62701n, this.f62700e, this.f62699d, this.f62702p, this.f62703q, this.dp, this.dq, this.f62704qi, this.oth, this.priv, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.ks);
            } catch (IllegalArgumentException e5) {
                throw new IllegalStateException(e5.getMessage(), e5);
            }
        }

        public Builder firstCRTCoefficient(Base64URL base64URL) {
            this.f62704qi = base64URL;
            return this;
        }

        public Builder firstFactorCRTExponent(Base64URL base64URL) {
            this.dp = base64URL;
            return this;
        }

        public Builder firstPrimeFactor(Base64URL base64URL) {
            this.f62702p = base64URL;
            return this;
        }

        public Builder keyID(String str) {
            this.kid = str;
            return this;
        }

        public Builder keyIDFromThumbprint() throws JOSEException {
            return keyIDFromThumbprint("SHA-256");
        }

        public Builder keyOperations(Set<KeyOperation> set) {
            this.ops = set;
            return this;
        }

        public Builder keyStore(KeyStore keyStore) {
            this.ks = keyStore;
            return this;
        }

        public Builder keyUse(KeyUse keyUse) {
            this.use = keyUse;
            return this;
        }

        public Builder otherPrimes(List<OtherPrimesInfo> list) {
            this.oth = list;
            return this;
        }

        public Builder privateExponent(Base64URL base64URL) {
            this.f62699d = base64URL;
            return this;
        }

        public Builder privateKey(RSAPrivateKey rSAPrivateKey) {
            if (rSAPrivateKey instanceof RSAPrivateCrtKey) {
                return privateKey((RSAPrivateCrtKey) rSAPrivateKey);
            }
            if (rSAPrivateKey instanceof RSAMultiPrimePrivateCrtKey) {
                return privateKey((RSAMultiPrimePrivateCrtKey) rSAPrivateKey);
            }
            this.f62699d = Base64URL.encode(rSAPrivateKey.getPrivateExponent());
            return this;
        }

        public Builder secondFactorCRTExponent(Base64URL base64URL) {
            this.dq = base64URL;
            return this;
        }

        public Builder secondPrimeFactor(Base64URL base64URL) {
            this.f62703q = base64URL;
            return this;
        }

        public Builder x509CertChain(List<Base64> list) {
            this.x5c = list;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        @Deprecated
        public Builder x509CertThumbprint(Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public Builder x509CertURL(URI uri) {
            this.x5u = uri;
            return this;
        }

        public Builder keyIDFromThumbprint(String str) throws JOSEException {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("e", this.f62700e.toString());
            linkedHashMap.put("kty", KeyType.RSA.getValue());
            linkedHashMap.put("n", this.f62701n.toString());
            this.kid = ThumbprintUtils.compute(str, (LinkedHashMap<String, ?>) linkedHashMap).toString();
            return this;
        }

        public Builder(RSAPublicKey rSAPublicKey) {
            this.f62701n = Base64URL.encode(rSAPublicKey.getModulus());
            this.f62700e = Base64URL.encode(rSAPublicKey.getPublicExponent());
        }

        public Builder privateKey(PrivateKey privateKey) {
            if (privateKey instanceof RSAPrivateKey) {
                return privateKey((RSAPrivateKey) privateKey);
            }
            if ("RSA".equalsIgnoreCase(privateKey.getAlgorithm())) {
                this.priv = privateKey;
                return this;
            }
            throw new IllegalArgumentException("The private key algorithm must be RSA");
        }

        public Builder(RSAKey rSAKey) {
            this.f62701n = rSAKey.f62695n;
            this.f62700e = rSAKey.f62694e;
            this.f62699d = rSAKey.f62693d;
            this.f62702p = rSAKey.f62696p;
            this.f62703q = rSAKey.f62697q;
            this.dp = rSAKey.dp;
            this.dq = rSAKey.dq;
            this.f62704qi = rSAKey.f62698qi;
            this.oth = rSAKey.oth;
            this.priv = rSAKey.privateKey;
            this.use = rSAKey.getKeyUse();
            this.ops = rSAKey.getKeyOperations();
            this.alg = rSAKey.getAlgorithm();
            this.kid = rSAKey.getKeyID();
            this.x5u = rSAKey.getX509CertURL();
            this.x5t = rSAKey.getX509CertThumbprint();
            this.x5t256 = rSAKey.getX509CertSHA256Thumbprint();
            this.x5c = rSAKey.getX509CertChain();
            this.ks = rSAKey.getKeyStore();
        }

        public Builder privateKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
            this.f62699d = Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent());
            this.f62702p = Base64URL.encode(rSAPrivateCrtKey.getPrimeP());
            this.f62703q = Base64URL.encode(rSAPrivateCrtKey.getPrimeQ());
            this.dp = Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP());
            this.dq = Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ());
            this.f62704qi = Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient());
            return this;
        }

        public Builder privateKey(RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey) {
            this.f62699d = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent());
            this.f62702p = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP());
            this.f62703q = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ());
            this.dp = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP());
            this.dq = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ());
            this.f62704qi = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient());
            this.oth = OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo());
            return this;
        }
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        this(base64URL, base64URL2, null, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
    }

    public static RSAKey load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof X509Certificate)) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof RSAPublicKey)) {
            throw new JOSEException("Couldn't load RSA JWK: The key algorithm is not RSA");
        }
        RSAKey rSAKeyBuild = new Builder(parse(x509Certificate)).keyID(str).keyStore(keyStore).build();
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof RSAPrivateKey) {
                return new Builder(rSAKeyBuild).privateKey((RSAPrivateKey) key).build();
            }
            return ((key instanceof PrivateKey) && "RSA".equalsIgnoreCase(key.getAlgorithm())) ? new Builder(rSAKeyBuild).privateKey((PrivateKey) key).build() : rSAKeyBuild;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e5) {
            throw new JOSEException(a.d(e5, new StringBuilder("Couldn't retrieve private RSA key (bad pin?): ")), e5);
        }
    }

    public static RSAKey parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RSAKey) || !super.equals(obj)) {
            return false;
        }
        RSAKey rSAKey = (RSAKey) obj;
        return Objects.equals(this.f62695n, rSAKey.f62695n) && Objects.equals(this.f62694e, rSAKey.f62694e) && Objects.equals(this.f62693d, rSAKey.f62693d) && Objects.equals(this.f62696p, rSAKey.f62696p) && Objects.equals(this.f62697q, rSAKey.f62697q) && Objects.equals(this.dp, rSAKey.dp) && Objects.equals(this.dq, rSAKey.dq) && Objects.equals(this.f62698qi, rSAKey.f62698qi) && Objects.equals(this.oth, rSAKey.oth) && Objects.equals(this.privateKey, rSAKey.privateKey);
    }

    public Base64URL getFirstCRTCoefficient() {
        return this.f62698qi;
    }

    public Base64URL getFirstFactorCRTExponent() {
        return this.dp;
    }

    public Base64URL getFirstPrimeFactor() {
        return this.f62696p;
    }

    public Base64URL getModulus() {
        return this.f62695n;
    }

    public List<OtherPrimesInfo> getOtherPrimes() {
        return this.oth;
    }

    public Base64URL getPrivateExponent() {
        return this.f62693d;
    }

    public Base64URL getPublicExponent() {
        return this.f62694e;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("e", this.f62694e.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("n", this.f62695n.toString());
        return linkedHashMap;
    }

    public Base64URL getSecondFactorCRTExponent() {
        return this.dq;
    }

    public Base64URL getSecondPrimeFactor() {
        return this.f62697q;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f62695n, this.f62694e, this.f62693d, this.f62696p, this.f62697q, this.dp, this.dq, this.f62698qi, this.oth, this.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.f62693d == null && this.f62696p == null && this.privateKey == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public boolean matches(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (this.f62694e.decodeToBigInteger().equals(rSAPublicKey.getPublicExponent())) {
                return this.f62695n.decodeToBigInteger().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        try {
            return ByteUtils.safeBitLength(this.f62695n.decode());
        } catch (IntegerOverflowException e5) {
            throw new ArithmeticException(e5.getMessage());
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("n", this.f62695n.toString());
        jSONObject.put("e", this.f62694e.toString());
        Base64URL base64URL = this.f62693d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        Base64URL base64URL2 = this.f62696p;
        if (base64URL2 != null) {
            jSONObject.put("p", base64URL2.toString());
        }
        Base64URL base64URL3 = this.f62697q;
        if (base64URL3 != null) {
            jSONObject.put("q", base64URL3.toString());
        }
        Base64URL base64URL4 = this.dp;
        if (base64URL4 != null) {
            jSONObject.put("dp", base64URL4.toString());
        }
        Base64URL base64URL5 = this.dq;
        if (base64URL5 != null) {
            jSONObject.put("dq", base64URL5.toString());
        }
        Base64URL base64URL6 = this.f62698qi;
        if (base64URL6 != null) {
            jSONObject.put("qi", base64URL6.toString());
        }
        List<OtherPrimesInfo> list = this.oth;
        if (list != null && !list.isEmpty()) {
            List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
            for (OtherPrimesInfo otherPrimesInfo : this.oth) {
                Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
                mapNewJSONObject.put("r", otherPrimesInfo.f62705p0.toString());
                mapNewJSONObject.put("d", otherPrimesInfo.f62706q0.toString());
                mapNewJSONObject.put("t", otherPrimesInfo.f62707r0.toString());
                listNewJSONArray.add(mapNewJSONObject);
            }
            jSONObject.put("oth", listNewJSONArray);
        }
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public KeyPair toKeyPair() throws JOSEException {
        return new KeyPair(toRSAPublicKey(), toPrivateKey());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PrivateKey toPrivateKey() throws JOSEException {
        RSAPrivateKey rSAPrivateKey = toRSAPrivateKey();
        return rSAPrivateKey != null ? rSAPrivateKey : this.privateKey;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PublicKey toPublicKey() throws JOSEException {
        return toRSAPublicKey();
    }

    public RSAPrivateKey toRSAPrivateKey() throws JOSEException {
        KeySpec rSAPrivateCrtKeySpec;
        if (this.f62693d == null) {
            return null;
        }
        BigInteger bigIntegerDecodeToBigInteger = this.f62695n.decodeToBigInteger();
        BigInteger bigIntegerDecodeToBigInteger2 = this.f62693d.decodeToBigInteger();
        if (this.f62696p == null) {
            rSAPrivateCrtKeySpec = new RSAPrivateKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger2);
        } else {
            BigInteger bigIntegerDecodeToBigInteger3 = this.f62694e.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger4 = this.f62696p.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger5 = this.f62697q.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger6 = this.dp.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger7 = this.dq.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger8 = this.f62698qi.decodeToBigInteger();
            List<OtherPrimesInfo> list = this.oth;
            if (list == null || list.isEmpty()) {
                rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger3, bigIntegerDecodeToBigInteger2, bigIntegerDecodeToBigInteger4, bigIntegerDecodeToBigInteger5, bigIntegerDecodeToBigInteger6, bigIntegerDecodeToBigInteger7, bigIntegerDecodeToBigInteger8);
            } else {
                RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr = new RSAOtherPrimeInfo[this.oth.size()];
                for (int i10 = 0; i10 < this.oth.size(); i10++) {
                    OtherPrimesInfo otherPrimesInfo = this.oth.get(i10);
                    rSAOtherPrimeInfoArr[i10] = new RSAOtherPrimeInfo(otherPrimesInfo.getPrimeFactor().decodeToBigInteger(), otherPrimesInfo.getFactorCRTExponent().decodeToBigInteger(), otherPrimesInfo.getFactorCRTCoefficient().decodeToBigInteger());
                }
                rSAPrivateCrtKeySpec = new RSAMultiPrimePrivateCrtKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger3, bigIntegerDecodeToBigInteger2, bigIntegerDecodeToBigInteger4, bigIntegerDecodeToBigInteger5, bigIntegerDecodeToBigInteger6, bigIntegerDecodeToBigInteger7, bigIntegerDecodeToBigInteger8, rSAOtherPrimeInfoArr);
            }
        }
        try {
            return (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(rSAPrivateCrtKeySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }

    public RSAPublicKey toRSAPublicKey() throws JOSEException {
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(this.f62695n.decodeToBigInteger(), this.f62694e.decodeToBigInteger()));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, keyStore);
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The private exponent must not be null");
        }
    }

    public static RSAKey parse(Map<String, Object> map) throws ParseException {
        ArrayList arrayList;
        List<Object> jSONArray;
        if (!KeyType.RSA.equals(b.c(map))) {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
        Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "n");
        Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, "e");
        Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map, "d");
        Base64URL base64URL4 = JSONObjectUtils.getBase64URL(map, "p");
        Base64URL base64URL5 = JSONObjectUtils.getBase64URL(map, "q");
        Base64URL base64URL6 = JSONObjectUtils.getBase64URL(map, "dp");
        Base64URL base64URL7 = JSONObjectUtils.getBase64URL(map, "dq");
        Base64URL base64URL8 = JSONObjectUtils.getBase64URL(map, "qi");
        if (!map.containsKey("oth") || (jSONArray = JSONObjectUtils.getJSONArray(map, "oth")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(jSONArray.size());
            for (Object obj : jSONArray) {
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    try {
                        arrayList.add(new OtherPrimesInfo(JSONObjectUtils.getBase64URL(map2, "r"), JSONObjectUtils.getBase64URL(map2, "dq"), JSONObjectUtils.getBase64URL(map2, "t")));
                    } catch (IllegalArgumentException e5) {
                        throw new ParseException(e5.getMessage(), 0);
                    }
                }
            }
        }
        try {
            return new RSAKey(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, arrayList, null, b.d(map), b.b(map), b.a(map), JSONObjectUtils.getString(map, "kid"), JSONObjectUtils.getURI(map, "x5u"), JSONObjectUtils.getBase64URL(map, "x5t"), JSONObjectUtils.getBase64URL(map, "x5t#S256"), b.e(map), null);
        } catch (IllegalArgumentException e7) {
            throw new ParseException(e7.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public RSAKey toPublicJWK() {
        return new RSAKey(getModulus(), getPublicExponent(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getKeyStore());
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL8, Base64URL base64URL9, List<Base64> list2, KeyStore keyStore) {
        this(base64URL, base64URL2, null, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, list, null, keyUse, set, algorithm, str, uri, base64URL8, base64URL9, list2, keyStore);
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The first prime factor must not be null");
        }
        if (base64URL4 == null) {
            throw new IllegalArgumentException("The second prime factor must not be null");
        }
        if (base64URL5 == null) {
            throw new IllegalArgumentException("The first factor CRT exponent must not be null");
        }
        if (base64URL6 == null) {
            throw new IllegalArgumentException("The second factor CRT exponent must not be null");
        }
        if (base64URL7 == null) {
            throw new IllegalArgumentException("The first CRT coefficient must not be null");
        }
    }

    @Immutable
    public static class OtherPrimesInfo implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Base64URL f62705p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Base64URL f62706q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Base64URL f62707r0;

        public OtherPrimesInfo(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            if (base64URL == null) {
                throw new IllegalArgumentException("The prime factor must not be null");
            }
            this.f62705p0 = base64URL;
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            this.f62706q0 = base64URL2;
            if (base64URL3 == null) {
                throw new IllegalArgumentException("The factor CRT coefficient must not be null");
            }
            this.f62707r0 = base64URL3;
        }

        public static List<OtherPrimesInfo> toList(RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (rSAOtherPrimeInfoArr == null) {
                return arrayList;
            }
            for (RSAOtherPrimeInfo rSAOtherPrimeInfo : rSAOtherPrimeInfoArr) {
                arrayList.add(new OtherPrimesInfo(rSAOtherPrimeInfo));
            }
            return arrayList;
        }

        public Base64URL getFactorCRTCoefficient() {
            return this.f62707r0;
        }

        public Base64URL getFactorCRTExponent() {
            return this.f62706q0;
        }

        public Base64URL getPrimeFactor() {
            return this.f62705p0;
        }

        public OtherPrimesInfo(RSAOtherPrimeInfo rSAOtherPrimeInfo) {
            this.f62705p0 = Base64URL.encode(rSAOtherPrimeInfo.getPrime());
            this.f62706q0 = Base64URL.encode(rSAOtherPrimeInfo.getExponent());
            this.f62707r0 = Base64URL.encode(rSAOtherPrimeInfo.getCrtCoefficient());
        }
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, list, null, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2, KeyStore keyStore) {
        Base64URL base64URL11;
        Base64URL base64URL12;
        Base64URL base64URL13;
        super(KeyType.RSA, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, keyStore);
        if (base64URL != null) {
            this.f62695n = base64URL;
            if (base64URL2 != null) {
                this.f62694e = base64URL2;
                if (getParsedX509CertChain() != null && !matches(getParsedX509CertChain().get(0))) {
                    throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
                }
                this.f62693d = base64URL3;
                if (base64URL4 != null && base64URL5 != null) {
                    base64URL11 = base64URL6;
                    base64URL12 = base64URL7;
                    if (base64URL11 != null) {
                        base64URL13 = base64URL8;
                        if (base64URL12 != null && base64URL13 != null) {
                            this.f62696p = base64URL4;
                            this.f62697q = base64URL5;
                            this.dp = base64URL11;
                            this.dq = base64URL12;
                            this.f62698qi = base64URL13;
                            if (list != null) {
                                this.oth = Collections.unmodifiableList(list);
                            } else {
                                this.oth = Collections.emptyList();
                            }
                        }
                        this.privateKey = privateKey;
                        return;
                    }
                    if (base64URL4 != null && base64URL5 == null && base64URL11 == null && base64URL12 == null && base64URL13 == null && list == null) {
                        this.f62696p = null;
                        this.f62697q = null;
                        this.dp = null;
                        this.dq = null;
                        this.f62698qi = null;
                        this.oth = Collections.emptyList();
                    } else {
                        if (base64URL4 == null || base64URL5 != null || base64URL11 != null || base64URL12 != null || base64URL13 != null) {
                            if (base64URL4 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                            }
                            if (base64URL5 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                            }
                            if (base64URL11 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                            }
                            if (base64URL12 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                            }
                            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                        }
                        this.f62696p = null;
                        this.f62697q = null;
                        this.dp = null;
                        this.dq = null;
                        this.f62698qi = null;
                        this.oth = Collections.emptyList();
                    }
                    this.privateKey = privateKey;
                    return;
                }
                base64URL11 = base64URL6;
                base64URL12 = base64URL7;
                base64URL13 = base64URL8;
                if (base64URL4 != null) {
                    if (base64URL4 == null) {
                    }
                    if (base64URL4 == null) {
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                    }
                    if (base64URL5 == null) {
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                    }
                    if (base64URL11 == null) {
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                    }
                    if (base64URL12 == null) {
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                    }
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                }
                if (base64URL4 == null) {
                }
                if (base64URL4 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                }
                if (base64URL5 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                }
                if (base64URL11 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                }
                if (base64URL12 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                }
                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                this.privateKey = privateKey;
                return;
            }
            throw new IllegalArgumentException("The public exponent value must not be null");
        }
        throw new IllegalArgumentException("The modulus value must not be null");
    }

    public static RSAKey parse(X509Certificate x509Certificate) throws JOSEException {
        if (x509Certificate.getPublicKey() instanceof RSAPublicKey) {
            try {
                return new Builder((RSAPublicKey) x509Certificate.getPublicKey()).keyUse(KeyUse.from(x509Certificate)).keyID(x509Certificate.getSerialNumber().toString(10)).x509CertChain(Collections.singletonList(Base64.encode(x509Certificate.getEncoded()))).x509CertSHA256Thumbprint(Base64URL.encode(MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded()))).build();
            } catch (NoSuchAlgorithmException e5) {
                throw new JOSEException("Couldn't encode x5t parameter: " + e5.getMessage(), e5);
            } catch (CertificateEncodingException e7) {
                throw new JOSEException("Couldn't encode x5c parameter: " + e7.getMessage(), e7);
            }
        }
        throw new JOSEException("The public key of the X.509 certificate is not RSA");
    }

    public RSAKey(RSAPublicKey rSAPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateKey.getPrivateExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateCrtKey rSAPrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrimeP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient()), null, null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient()), OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo()), null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), null, null, null, null, null, null, null, privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }
}
