package com.nimbusds.jose;

import androidx.camera.camera2.internal.h0;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
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
public final class PlainHeader extends Header {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Set<String> f62554p0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JOSEObjectType f62555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f62556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<String> f62557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, Object> f62558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Base64URL f62559e;

        public Builder() {
        }

        public PlainHeader build() {
            return new PlainHeader(this.f62555a, this.f62556b, this.f62557c, this.f62558d, this.f62559e);
        }

        public Builder contentType(String str) {
            this.f62556b = str;
            return this;
        }

        public Builder criticalParams(Set<String> set) {
            this.f62557c = set;
            return this;
        }

        public Builder customParam(String str, Object obj) {
            if (PlainHeader.getRegisteredParameterNames().contains(str)) {
                throw new IllegalArgumentException(h0.b("The parameter name \"", str, "\" matches a registered name"));
            }
            if (this.f62558d == null) {
                this.f62558d = new HashMap();
            }
            this.f62558d.put(str, obj);
            return this;
        }

        public Builder customParams(Map<String, Object> map) {
            this.f62558d = map;
            return this;
        }

        public Builder parsedBase64URL(Base64URL base64URL) {
            this.f62559e = base64URL;
            return this;
        }

        public Builder type(JOSEObjectType jOSEObjectType) {
            this.f62555a = jOSEObjectType;
            return this;
        }

        public Builder(PlainHeader plainHeader) {
            this.f62555a = plainHeader.getType();
            this.f62556b = plainHeader.getContentType();
            this.f62557c = plainHeader.getCriticalParams();
            this.f62558d = plainHeader.getCustomParams();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add(ClientData.KEY_TYPE);
        hashSet.add("cty");
        hashSet.add("crit");
        f62554p0 = Collections.unmodifiableSet(hashSet);
    }

    public PlainHeader() {
        this(null, null, null, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return f62554p0;
    }

    public static PlainHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    @Override // com.nimbusds.jose.Header
    public Algorithm getAlgorithm() {
        return Algorithm.NONE;
    }

    public PlainHeader(JOSEObjectType jOSEObjectType, String str, Set<String> set, Map<String, Object> map, Base64URL base64URL) {
        super(Algorithm.NONE, jOSEObjectType, str, set, map, base64URL);
    }

    public static PlainHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        if (Header.parseAlgorithm(map) != Algorithm.NONE) {
            throw new ParseException("The algorithm \"alg\" header parameter must be \"none\"", 0);
        }
        Builder builderType = new Builder().parsedBase64URL(base64URL);
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
                } else {
                    builderType = builderType.customParam(str, map.get(str));
                }
            }
        }
        return builderType.build();
    }

    public PlainHeader(PlainHeader plainHeader) {
        this(plainHeader.getType(), plainHeader.getContentType(), plainHeader.getCriticalParams(), plainHeader.getCustomParams(), plainHeader.getParsedBase64URL());
    }

    public static PlainHeader parse(String str) throws ParseException {
        return parse(str, (Base64URL) null);
    }

    public static PlainHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(JSONObjectUtils.parse(str), base64URL);
    }

    public static PlainHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
