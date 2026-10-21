package com.nimbusds.jose;

import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import gi.b;
import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class JWEHeader extends b {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;
    private final Base64URL apu;
    private final Base64URL apv;
    private final EncryptionMethod enc;
    private final JWK epk;
    private final Base64URL iv;
    private final int p2c;
    private final Base64URL p2s;
    private final Base64URL tag;
    private final CompressionAlgorithm zip;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        a.d(hashSet, JweRSAKeyPairCommand.JWK, "x5u", "x5t", "x5t#S256");
        a.d(hashSet, "x5c", "kid", ClientData.KEY_TYPE, "cty");
        a.d(hashSet, "crit", "apu", "apv", "p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("authTag");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public JWEHeader(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
        this(jWEAlgorithm, encryptionMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    public static JWEHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    private static EncryptionMethod parseEncryptionMethod(Map<String, Object> map) throws ParseException {
        return EncryptionMethod.parse(JSONObjectUtils.getString(map, "enc"));
    }

    public Base64URL getAgreementPartyUInfo() {
        return this.apu;
    }

    public Base64URL getAgreementPartyVInfo() {
        return this.apv;
    }

    public Base64URL getAuthTag() {
        return this.tag;
    }

    public CompressionAlgorithm getCompressionAlgorithm() {
        return this.zip;
    }

    public EncryptionMethod getEncryptionMethod() {
        return this.enc;
    }

    public JWK getEphemeralPublicKey() {
        return this.epk;
    }

    public Base64URL getIV() {
        return this.iv;
    }

    @Override // gi.b, com.nimbusds.jose.Header
    public Set<String> getIncludedParams() {
        Set<String> includedParams = super.getIncludedParams();
        if (this.enc != null) {
            includedParams.add("enc");
        }
        if (this.epk != null) {
            includedParams.add("epk");
        }
        if (this.zip != null) {
            includedParams.add("zip");
        }
        if (this.apu != null) {
            includedParams.add("apu");
        }
        if (this.apv != null) {
            includedParams.add("apv");
        }
        if (this.p2s != null) {
            includedParams.add("p2s");
        }
        if (this.p2c > 0) {
            includedParams.add("p2c");
        }
        if (this.iv != null) {
            includedParams.add("iv");
        }
        if (this.tag != null) {
            includedParams.add(LogKeysKt.TAG);
        }
        return includedParams;
    }

    @Override // gi.b
    public /* bridge */ /* synthetic */ JWK getJWK() {
        return super.getJWK();
    }

    @Override // gi.b
    public /* bridge */ /* synthetic */ URI getJWKURL() {
        return super.getJWKURL();
    }

    @Override // gi.b
    public /* bridge */ /* synthetic */ String getKeyID() {
        return super.getKeyID();
    }

    public int getPBES2Count() {
        return this.p2c;
    }

    public Base64URL getPBES2Salt() {
        return this.p2s;
    }

    @Override // gi.b
    public /* bridge */ /* synthetic */ List getX509CertChain() {
        return super.getX509CertChain();
    }

    @Override // gi.b
    public /* bridge */ /* synthetic */ Base64URL getX509CertSHA256Thumbprint() {
        return super.getX509CertSHA256Thumbprint();
    }

    @Override // gi.b
    @Deprecated
    public /* bridge */ /* synthetic */ Base64URL getX509CertThumbprint() {
        return super.getX509CertThumbprint();
    }

    @Override // gi.b
    public /* bridge */ /* synthetic */ URI getX509CertURL() {
        return super.getX509CertURL();
    }

    @Override // gi.b, com.nimbusds.jose.Header
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        EncryptionMethod encryptionMethod = this.enc;
        if (encryptionMethod != null) {
            jSONObject.put("enc", encryptionMethod.toString());
        }
        JWK jwk = this.epk;
        if (jwk != null) {
            jSONObject.put("epk", jwk.toJSONObject());
        }
        CompressionAlgorithm compressionAlgorithm = this.zip;
        if (compressionAlgorithm != null) {
            jSONObject.put("zip", compressionAlgorithm.toString());
        }
        Base64URL base64URL = this.apu;
        if (base64URL != null) {
            jSONObject.put("apu", base64URL.toString());
        }
        Base64URL base64URL2 = this.apv;
        if (base64URL2 != null) {
            jSONObject.put("apv", base64URL2.toString());
        }
        Base64URL base64URL3 = this.p2s;
        if (base64URL3 != null) {
            jSONObject.put("p2s", base64URL3.toString());
        }
        int i10 = this.p2c;
        if (i10 > 0) {
            jSONObject.put("p2c", Integer.valueOf(i10));
        }
        Base64URL base64URL4 = this.iv;
        if (base64URL4 != null) {
            jSONObject.put("iv", base64URL4.toString());
        }
        Base64URL base64URL5 = this.tag;
        if (base64URL5 != null) {
            jSONObject.put(LogKeysKt.TAG, base64URL5.toString());
        }
        return jSONObject;
    }

    public JWEHeader(Algorithm algorithm, EncryptionMethod encryptionMethod, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, CompressionAlgorithm compressionAlgorithm, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i10, Base64URL base64URL6, Base64URL base64URL7, Map<String, Object> map, Base64URL base64URL8) {
        super(algorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        if (algorithm.getName().equals(Algorithm.NONE.getName())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (encryptionMethod == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
        if (jwk2 != null && jwk2.isPrivate()) {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
        this.enc = encryptionMethod;
        this.epk = jwk2;
        this.zip = compressionAlgorithm;
        this.apu = base64URL3;
        this.apv = base64URL4;
        this.p2s = base64URL5;
        this.p2c = i10;
        this.iv = base64URL6;
        this.tag = base64URL7;
    }

    public static JWEHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        Algorithm algorithm = Header.parseAlgorithm(map);
        if (!(algorithm instanceof JWEAlgorithm)) {
            throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
        }
        Builder builderType = new Builder((JWEAlgorithm) algorithm, parseEncryptionMethod(map)).parsedBase64URL(base64URL);
        for (String str : map.keySet()) {
            if (!"alg".equals(str) && !"enc".equals(str)) {
                if (ClientData.KEY_TYPE.equals(str)) {
                    String string = JSONObjectUtils.getString(map, str);
                    if (string != null) {
                        builderType = builderType.type(new JOSEObjectType(string));
                    }
                } else if ("cty".equals(str)) {
                    builderType = builderType.contentType(JSONObjectUtils.getString(map, str));
                } else if ("crit".equals(str)) {
                    List<String> stringList = JSONObjectUtils.getStringList(map, str);
                    if (stringList != null) {
                        builderType = builderType.criticalParams(new HashSet(stringList));
                    }
                } else if ("jku".equals(str)) {
                    builderType = builderType.jwkURL(JSONObjectUtils.getURI(map, str));
                } else if (JweRSAKeyPairCommand.JWK.equals(str)) {
                    Map<String, Object> jSONObject = JSONObjectUtils.getJSONObject(map, str);
                    if (jSONObject != null) {
                        builderType = builderType.jwk(JWK.parse(jSONObject));
                    }
                } else if ("x5u".equals(str)) {
                    builderType = builderType.x509CertURL(JSONObjectUtils.getURI(map, str));
                } else if ("x5t".equals(str)) {
                    builderType = builderType.x509CertThumbprint(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    builderType = builderType.x509CertSHA256Thumbprint(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("x5c".equals(str)) {
                    builderType = builderType.x509CertChain(X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(map, str)));
                } else if ("kid".equals(str)) {
                    builderType = builderType.keyID(JSONObjectUtils.getString(map, str));
                } else if ("epk".equals(str)) {
                    builderType = builderType.ephemeralPublicKey(JWK.parse(JSONObjectUtils.getJSONObject(map, str)));
                } else if ("zip".equals(str)) {
                    String string2 = JSONObjectUtils.getString(map, str);
                    if (string2 != null) {
                        builderType = builderType.compressionAlgorithm(new CompressionAlgorithm(string2));
                    }
                } else if ("apu".equals(str)) {
                    builderType = builderType.agreementPartyUInfo(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("apv".equals(str)) {
                    builderType = builderType.agreementPartyVInfo(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("p2s".equals(str)) {
                    builderType = builderType.pbes2Salt(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("p2c".equals(str)) {
                    builderType = builderType.pbes2Count(JSONObjectUtils.getInt(map, str));
                } else if ("iv".equals(str)) {
                    builderType = builderType.iv(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else {
                    builderType = LogKeysKt.TAG.equals(str) ? builderType.authTag(Base64URL.from(JSONObjectUtils.getString(map, str))) : builderType.customParam(str, map.get(str));
                }
            }
        }
        return builderType.build();
    }

    @Override // com.nimbusds.jose.Header
    public JWEAlgorithm getAlgorithm() {
        return (JWEAlgorithm) super.getAlgorithm();
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JWEAlgorithm f62510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EncryptionMethod f62511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JOSEObjectType f62512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f62513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set<String> f62514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public URI f62515f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public JWK f62516g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public URI f62517h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public Base64URL f62518i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Base64URL f62519j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<Base64> f62520k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f62521l;
        public JWK m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CompressionAlgorithm f62522n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Base64URL f62523o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Base64URL f62524p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Base64URL f62525q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f62526r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Base64URL f62527s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Base64URL f62528t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Map<String, Object> f62529u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Base64URL f62530v;

        public Builder(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
            if (jWEAlgorithm.getName().equals(Algorithm.NONE.getName())) {
                throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            }
            this.f62510a = jWEAlgorithm;
            if (encryptionMethod == null) {
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            this.f62511b = encryptionMethod;
        }

        public Builder agreementPartyUInfo(Base64URL base64URL) {
            this.f62523o = base64URL;
            return this;
        }

        public Builder agreementPartyVInfo(Base64URL base64URL) {
            this.f62524p = base64URL;
            return this;
        }

        public Builder authTag(Base64URL base64URL) {
            this.f62528t = base64URL;
            return this;
        }

        public JWEHeader build() {
            return new JWEHeader(this.f62510a, this.f62511b, this.f62512c, this.f62513d, this.f62514e, this.f62515f, this.f62516g, this.f62517h, this.f62518i, this.f62519j, this.f62520k, this.f62521l, this.m, this.f62522n, this.f62523o, this.f62524p, this.f62525q, this.f62526r, this.f62527s, this.f62528t, this.f62529u, this.f62530v);
        }

        public Builder compressionAlgorithm(CompressionAlgorithm compressionAlgorithm) {
            this.f62522n = compressionAlgorithm;
            return this;
        }

        public Builder contentType(String str) {
            this.f62513d = str;
            return this;
        }

        public Builder criticalParams(Set<String> set) {
            this.f62514e = set;
            return this;
        }

        public Builder customParam(String str, Object obj) {
            if (JWEHeader.getRegisteredParameterNames().contains(str)) {
                throw new IllegalArgumentException(h0.b("The parameter name \"", str, "\" matches a registered name"));
            }
            if (this.f62529u == null) {
                this.f62529u = new HashMap();
            }
            this.f62529u.put(str, obj);
            return this;
        }

        public Builder customParams(Map<String, Object> map) {
            this.f62529u = map;
            return this;
        }

        public Builder ephemeralPublicKey(JWK jwk) {
            this.m = jwk;
            return this;
        }

        public Builder iv(Base64URL base64URL) {
            this.f62527s = base64URL;
            return this;
        }

        public Builder jwk(JWK jwk) {
            this.f62516g = jwk;
            return this;
        }

        public Builder jwkURL(URI uri) {
            this.f62515f = uri;
            return this;
        }

        public Builder keyID(String str) {
            this.f62521l = str;
            return this;
        }

        public Builder parsedBase64URL(Base64URL base64URL) {
            this.f62530v = base64URL;
            return this;
        }

        public Builder pbes2Count(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
            }
            this.f62526r = i10;
            return this;
        }

        public Builder pbes2Salt(Base64URL base64URL) {
            this.f62525q = base64URL;
            return this;
        }

        public Builder type(JOSEObjectType jOSEObjectType) {
            this.f62512c = jOSEObjectType;
            return this;
        }

        public Builder x509CertChain(List<Base64> list) {
            this.f62520k = list;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            this.f62519j = base64URL;
            return this;
        }

        @Deprecated
        public Builder x509CertThumbprint(Base64URL base64URL) {
            this.f62518i = base64URL;
            return this;
        }

        public Builder x509CertURL(URI uri) {
            this.f62517h = uri;
            return this;
        }

        public Builder(JWEHeader jWEHeader) {
            this(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod());
            this.f62512c = jWEHeader.getType();
            this.f62513d = jWEHeader.getContentType();
            this.f62514e = jWEHeader.getCriticalParams();
            this.f62529u = jWEHeader.getCustomParams();
            this.f62515f = jWEHeader.getJWKURL();
            this.f62516g = jWEHeader.getJWK();
            this.f62517h = jWEHeader.getX509CertURL();
            this.f62518i = jWEHeader.getX509CertThumbprint();
            this.f62519j = jWEHeader.getX509CertSHA256Thumbprint();
            this.f62520k = jWEHeader.getX509CertChain();
            this.f62521l = jWEHeader.getKeyID();
            this.m = jWEHeader.getEphemeralPublicKey();
            this.f62522n = jWEHeader.getCompressionAlgorithm();
            this.f62523o = jWEHeader.getAgreementPartyUInfo();
            this.f62524p = jWEHeader.getAgreementPartyVInfo();
            this.f62525q = jWEHeader.getPBES2Salt();
            this.f62526r = jWEHeader.getPBES2Count();
            this.f62527s = jWEHeader.getIV();
            this.f62528t = jWEHeader.getAuthTag();
            this.f62529u = jWEHeader.getCustomParams();
        }
    }

    public JWEHeader(JWEHeader jWEHeader) {
        this(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod(), jWEHeader.getType(), jWEHeader.getContentType(), jWEHeader.getCriticalParams(), jWEHeader.getJWKURL(), jWEHeader.getJWK(), jWEHeader.getX509CertURL(), jWEHeader.getX509CertThumbprint(), jWEHeader.getX509CertSHA256Thumbprint(), jWEHeader.getX509CertChain(), jWEHeader.getKeyID(), jWEHeader.getEphemeralPublicKey(), jWEHeader.getCompressionAlgorithm(), jWEHeader.getAgreementPartyUInfo(), jWEHeader.getAgreementPartyVInfo(), jWEHeader.getPBES2Salt(), jWEHeader.getPBES2Count(), jWEHeader.getIV(), jWEHeader.getAuthTag(), jWEHeader.getCustomParams(), jWEHeader.getParsedBase64URL());
    }

    public static JWEHeader parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str), (Base64URL) null);
    }

    public static JWEHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(JSONObjectUtils.parse(str), base64URL);
    }

    public static JWEHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
