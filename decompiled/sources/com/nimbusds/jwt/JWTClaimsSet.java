package com.nimbusds.jwt;

import androidx.camera.camera2.internal.h0;
import ci.a;
import com.nimbusds.jose.util.DateUtils;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class JWTClaimsSet implements Serializable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Set<String> f62833q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LinkedHashMap f62834p0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f62835a;

        public Builder() {
            this.f62835a = new LinkedHashMap();
        }

        public Builder audience(List<String> list) {
            this.f62835a.put("aud", list);
            return this;
        }

        public JWTClaimsSet build() {
            return new JWTClaimsSet(this.f62835a);
        }

        public Builder claim(String str, Object obj) {
            this.f62835a.put(str, obj);
            return this;
        }

        public Builder expirationTime(Date date) {
            this.f62835a.put("exp", date);
            return this;
        }

        public Map<String, Object> getClaims() {
            return Collections.unmodifiableMap(this.f62835a);
        }

        public Builder issueTime(Date date) {
            this.f62835a.put("iat", date);
            return this;
        }

        public Builder issuer(String str) {
            this.f62835a.put("iss", str);
            return this;
        }

        public Builder jwtID(String str) {
            this.f62835a.put("jti", str);
            return this;
        }

        public Builder notBeforeTime(Date date) {
            this.f62835a.put("nbf", date);
            return this;
        }

        public Builder subject(String str) {
            this.f62835a.put("sub", str);
            return this;
        }

        public Builder audience(String str) {
            LinkedHashMap linkedHashMap = this.f62835a;
            if (str == null) {
                linkedHashMap.put("aud", null);
            } else {
                linkedHashMap.put("aud", Collections.singletonList(str));
            }
            return this;
        }

        public Builder(JWTClaimsSet jWTClaimsSet) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f62835a = linkedHashMap;
            linkedHashMap.putAll(jWTClaimsSet.f62834p0);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        f62833q0 = Collections.unmodifiableSet(hashSet);
    }

    public JWTClaimsSet() {
        throw null;
    }

    public JWTClaimsSet(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f62834p0 = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    public static Set<String> getRegisteredNames() {
        return f62833q0;
    }

    public static JWTClaimsSet parse(Map<String, Object> map) throws ParseException {
        Builder builder = new Builder();
        for (String str : map.keySet()) {
            if (str.equals("iss")) {
                builder.issuer(JSONObjectUtils.getString(map, "iss"));
            } else if (str.equals("sub")) {
                builder.subject(JSONObjectUtils.getString(map, "sub"));
            } else if (str.equals("aud")) {
                Object obj = map.get("aud");
                if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(JSONObjectUtils.getString(map, "aud"));
                    builder.audience(arrayList);
                } else if (obj instanceof List) {
                    builder.audience(JSONObjectUtils.getStringList(map, "aud"));
                } else if (obj == null) {
                    builder.audience((String) null);
                }
            } else if (str.equals("exp")) {
                builder.expirationTime(new Date(JSONObjectUtils.getLong(map, "exp") * 1000));
            } else if (str.equals("nbf")) {
                builder.notBeforeTime(new Date(JSONObjectUtils.getLong(map, "nbf") * 1000));
            } else if (str.equals("iat")) {
                builder.issueTime(new Date(JSONObjectUtils.getLong(map, "iat") * 1000));
            } else if (str.equals("jti")) {
                builder.jwtID(JSONObjectUtils.getString(map, "jti"));
            } else {
                builder.claim(str, map.get(str));
            }
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JWTClaimsSet) {
            return Objects.equals(this.f62834p0, ((JWTClaimsSet) obj).f62834p0);
        }
        return false;
    }

    public List<String> getAudience() {
        Object claim = getClaim("aud");
        if (claim instanceof String) {
            return Collections.singletonList((String) claim);
        }
        try {
            List<String> stringListClaim = getStringListClaim("aud");
            return stringListClaim != null ? Collections.unmodifiableList(stringListClaim) : Collections.emptyList();
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    public Boolean getBooleanClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof Boolean)) {
            return (Boolean) claim;
        }
        throw new ParseException(h0.b("The \"", str, "\" claim is not a Boolean"), 0);
    }

    public Object getClaim(String str) {
        return this.f62834p0.get(str);
    }

    public Map<String, Object> getClaims() {
        return Collections.unmodifiableMap(this.f62834p0);
    }

    public Date getDateClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Date) {
            return (Date) claim;
        }
        if (claim instanceof Number) {
            return DateUtils.fromSecondsSinceEpoch(((Number) claim).longValue());
        }
        throw new ParseException(h0.b("The \"", str, "\" claim is not a Date"), 0);
    }

    public Double getDoubleClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Double.valueOf(((Number) claim).doubleValue());
        }
        throw new ParseException(h0.b("The \"", str, "\" claim is not a Double"), 0);
    }

    public Date getExpirationTime() {
        try {
            return getDateClaim("exp");
        } catch (ParseException unused) {
            return null;
        }
    }

    public Float getFloatClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Float.valueOf(((Number) claim).floatValue());
        }
        throw new ParseException(h0.b("The \"", str, "\" claim is not a Float"), 0);
    }

    public Integer getIntegerClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Integer.valueOf(((Number) claim).intValue());
        }
        throw new ParseException(h0.b("The \"", str, "\" claim is not an Integer"), 0);
    }

    public Date getIssueTime() {
        try {
            return getDateClaim("iat");
        } catch (ParseException unused) {
            return null;
        }
    }

    public String getIssuer() {
        try {
            return getStringClaim("iss");
        } catch (ParseException unused) {
            return null;
        }
    }

    public Map<String, Object> getJSONObjectClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (!(claim instanceof Map)) {
            throw new ParseException(h0.b("The \"", str, "\" claim is not a JSON object or Map"), 0);
        }
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        for (Map.Entry entry : ((Map) claim).entrySet()) {
            if (entry.getKey() instanceof String) {
                mapNewJSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        return mapNewJSONObject;
    }

    public String getJWTID() {
        try {
            return getStringClaim("jti");
        } catch (ParseException unused) {
            return null;
        }
    }

    public Long getLongClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Long.valueOf(((Number) claim).longValue());
        }
        throw new ParseException(h0.b("The \"", str, "\" claim is not a Number"), 0);
    }

    public Date getNotBeforeTime() {
        try {
            return getDateClaim("nbf");
        } catch (ParseException unused) {
            return null;
        }
    }

    public String[] getStringArrayClaim(String str) throws ParseException {
        if (getClaim(str) == null) {
            return null;
        }
        try {
            List list = (List) getClaim(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    strArr[i10] = (String) list.get(i10);
                } catch (ClassCastException unused) {
                    throw new ParseException(h0.b("The \"", str, "\" claim is not a list / JSON array of strings"), 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException(h0.b("The \"", str, "\" claim is not a list / JSON array"), 0);
        }
    }

    public String getStringClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof String)) {
            return (String) claim;
        }
        throw new ParseException(h0.b("The \"", str, "\" claim is not a String"), 0);
    }

    public List<String> getStringListClaim(String str) throws ParseException {
        String[] stringArrayClaim = getStringArrayClaim(str);
        if (stringArrayClaim == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(stringArrayClaim));
    }

    public String getSubject() {
        try {
            return getStringClaim("sub");
        } catch (ParseException unused) {
            return null;
        }
    }

    public URI getURIClaim(String str) throws ParseException {
        String stringClaim = getStringClaim(str);
        if (stringClaim == null) {
            return null;
        }
        try {
            return new URI(stringClaim);
        } catch (URISyntaxException e5) {
            StringBuilder sbD = a.d("The \"", str, "\" claim is not a URI: ");
            sbD.append(e5.getMessage());
            throw new ParseException(sbD.toString(), 0);
        }
    }

    public int hashCode() {
        return Objects.hash(this.f62834p0);
    }

    public Map<String, Object> toJSONObject() {
        return toJSONObject(false);
    }

    public String toString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }

    public <T> T toType(JWTClaimsSetTransformer<T> jWTClaimsSetTransformer) {
        return jWTClaimsSetTransformer.transform(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> toJSONObject(boolean z10) {
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        for (Map.Entry entry : this.f62834p0.entrySet()) {
            if (entry.getValue() instanceof Date) {
                mapNewJSONObject.put(entry.getKey(), Long.valueOf(DateUtils.toSecondsSinceEpoch((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List<String> audience = getAudience();
                if (audience == null || audience.isEmpty()) {
                    if (z10) {
                        mapNewJSONObject.put("aud", null);
                    }
                } else if (audience.size() == 1) {
                    mapNewJSONObject.put("aud", audience.get(0));
                } else {
                    List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
                    listNewJSONArray.addAll(audience);
                    mapNewJSONObject.put("aud", listNewJSONArray);
                }
            } else if (entry.getValue() != null) {
                mapNewJSONObject.put(entry.getKey(), entry.getValue());
            } else if (z10) {
                mapNewJSONObject.put(entry.getKey(), null);
            }
        }
        return mapNewJSONObject;
    }

    public String toString(boolean z10) {
        return JSONObjectUtils.toJSONString(toJSONObject(z10));
    }

    public static JWTClaimsSet parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }
}
