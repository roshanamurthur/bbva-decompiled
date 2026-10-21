package com.nimbusds.jose;

import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
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
public final class JWSHeader extends b {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Set<String> f62531q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f62532p0;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add(JweRSAKeyPairCommand.JWK);
        hashSet.add("x5u");
        hashSet.add("x5t");
        a.d(hashSet, "x5t#S256", "x5c", "kid", ClientData.KEY_TYPE);
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f62531q0 = Collections.unmodifiableSet(hashSet);
    }

    public JWSHeader(JWSAlgorithm jWSAlgorithm) {
        this(jWSAlgorithm, null, null, null, null, null, null, null, null, null, null, true, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return f62531q0;
    }

    public static JWSHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    @Override // gi.b, com.nimbusds.jose.Header
    public Set<String> getIncludedParams() {
        Set<String> includedParams = super.getIncludedParams();
        if (!isBase64URLEncodePayload()) {
            includedParams.add("b64");
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

    public boolean isBase64URLEncodePayload() {
        return this.f62532p0;
    }

    @Override // gi.b, com.nimbusds.jose.Header
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        if (!isBase64URLEncodePayload()) {
            jSONObject.put("b64", Boolean.FALSE);
        }
        return jSONObject;
    }

    @Deprecated
    public JWSHeader(JWSAlgorithm jWSAlgorithm, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, Map<String, Object> map, Base64URL base64URL3) {
        this(jWSAlgorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, true, map, base64URL3);
    }

    public static JWSHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        Algorithm algorithm = Header.parseAlgorithm(map);
        if (!(algorithm instanceof JWSAlgorithm)) {
            throw new ParseException("Not a JWS header", 0);
        }
        Builder builderType = new Builder((JWSAlgorithm) algorithm).parsedBase64URL(base64URL);
        for (String str : map.keySet()) {
            if (!"alg".equals(str)) {
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
                } else {
                    builderType = "b64".equals(str) ? builderType.base64URLEncodePayload(JSONObjectUtils.getBoolean(map, str)) : builderType.customParam(str, map.get(str));
                }
            }
        }
        return builderType.build();
    }

    @Override // com.nimbusds.jose.Header
    public JWSAlgorithm getAlgorithm() {
        return (JWSAlgorithm) super.getAlgorithm();
    }

    public JWSHeader(JWSAlgorithm jWSAlgorithm, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, boolean z10, Map<String, Object> map, Base64URL base64URL3) {
        super(jWSAlgorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL3);
        if (!jWSAlgorithm.getName().equals(Algorithm.NONE.getName())) {
            this.f62532p0 = z10;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JWSAlgorithm f62533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JOSEObjectType f62534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f62535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set<String> f62536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public URI f62537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public JWK f62538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public URI f62539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        public Base64URL f62540h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Base64URL f62541i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<Base64> f62542j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f62543k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f62544l;
        public Map<String, Object> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Base64URL f62545n;

        public Builder(JWSAlgorithm jWSAlgorithm) {
            this.f62544l = true;
            if (jWSAlgorithm.getName().equals(Algorithm.NONE.getName())) {
                throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
            }
            this.f62533a = jWSAlgorithm;
        }

        public Builder base64URLEncodePayload(boolean z10) {
            this.f62544l = z10;
            return this;
        }

        public JWSHeader build() {
            return new JWSHeader(this.f62533a, this.f62534b, this.f62535c, this.f62536d, this.f62537e, this.f62538f, this.f62539g, this.f62540h, this.f62541i, this.f62542j, this.f62543k, this.f62544l, this.m, this.f62545n);
        }

        public Builder contentType(String str) {
            this.f62535c = str;
            return this;
        }

        public Builder criticalParams(Set<String> set) {
            this.f62536d = set;
            return this;
        }

        public Builder customParam(String str, Object obj) {
            if (JWSHeader.getRegisteredParameterNames().contains(str)) {
                throw new IllegalArgumentException(h0.b("The parameter name \"", str, "\" matches a registered name"));
            }
            if (this.m == null) {
                this.m = new HashMap();
            }
            this.m.put(str, obj);
            return this;
        }

        public Builder customParams(Map<String, Object> map) {
            this.m = map;
            return this;
        }

        public Builder jwk(JWK jwk) {
            this.f62538f = jwk;
            return this;
        }

        public Builder jwkURL(URI uri) {
            this.f62537e = uri;
            return this;
        }

        public Builder keyID(String str) {
            this.f62543k = str;
            return this;
        }

        public Builder parsedBase64URL(Base64URL base64URL) {
            this.f62545n = base64URL;
            return this;
        }

        public Builder type(JOSEObjectType jOSEObjectType) {
            this.f62534b = jOSEObjectType;
            return this;
        }

        public Builder x509CertChain(List<Base64> list) {
            this.f62542j = list;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            this.f62541i = base64URL;
            return this;
        }

        @Deprecated
        public Builder x509CertThumbprint(Base64URL base64URL) {
            this.f62540h = base64URL;
            return this;
        }

        public Builder x509CertURL(URI uri) {
            this.f62539g = uri;
            return this;
        }

        public Builder(JWSHeader jWSHeader) {
            this(jWSHeader.getAlgorithm());
            this.f62534b = jWSHeader.getType();
            this.f62535c = jWSHeader.getContentType();
            this.f62536d = jWSHeader.getCriticalParams();
            this.f62537e = jWSHeader.getJWKURL();
            this.f62538f = jWSHeader.getJWK();
            this.f62539g = jWSHeader.getX509CertURL();
            this.f62540h = jWSHeader.getX509CertThumbprint();
            this.f62541i = jWSHeader.getX509CertSHA256Thumbprint();
            this.f62542j = jWSHeader.getX509CertChain();
            this.f62543k = jWSHeader.getKeyID();
            this.f62544l = jWSHeader.isBase64URLEncodePayload();
            this.m = jWSHeader.getCustomParams();
        }
    }

    public JWSHeader(JWSHeader jWSHeader) {
        this(jWSHeader.getAlgorithm(), jWSHeader.getType(), jWSHeader.getContentType(), jWSHeader.getCriticalParams(), jWSHeader.getJWKURL(), jWSHeader.getJWK(), jWSHeader.getX509CertURL(), jWSHeader.getX509CertThumbprint(), jWSHeader.getX509CertSHA256Thumbprint(), jWSHeader.getX509CertChain(), jWSHeader.getKeyID(), jWSHeader.isBase64URLEncodePayload(), jWSHeader.getCustomParams(), jWSHeader.getParsedBase64URL());
    }

    public static JWSHeader parse(String str) throws ParseException {
        return parse(str, (Base64URL) null);
    }

    public static JWSHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(JSONObjectUtils.parse(str), base64URL);
    }

    public static JWSHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
