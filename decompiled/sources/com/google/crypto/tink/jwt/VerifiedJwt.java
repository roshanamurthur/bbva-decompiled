package com.google.crypto.tink.jwt;

import androidx.camera.camera2.internal.h0;
import com.google.errorprone.annotations.Immutable;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.time.Instant;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class VerifiedJwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RawJwt f46736a;

    public VerifiedJwt(RawJwt rawJwt) {
        this.f46736a = rawJwt;
    }

    public Set<String> customClaimNames() {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        HashSet hashSet = new HashSet();
        for (String str : rawJwt.f46731a.keySet()) {
            if (!androidx.collection.b.b(str)) {
                hashSet.add(str);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public List<String> getAudiences() throws JwtInvalidException {
        return this.f46736a.a();
    }

    public Boolean getBooleanClaim(String str) throws JwtInvalidException {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        if (!jsonObject.has(str)) {
            throw new JwtInvalidException(h0.b("claim ", str, " does not exist"));
        }
        if (jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isBoolean()) {
            return Boolean.valueOf(jsonObject.get(str).getAsBoolean());
        }
        throw new JwtInvalidException(h0.b("claim ", str, " is not a boolean"));
    }

    public Instant getExpiration() throws JwtInvalidException {
        return this.f46736a.b("exp");
    }

    public Instant getIssuedAt() throws JwtInvalidException {
        return this.f46736a.b("iat");
    }

    public String getIssuer() throws JwtInvalidException {
        return this.f46736a.c("iss");
    }

    public String getJsonArrayClaim(String str) throws JwtInvalidException {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        if (!jsonObject.has(str)) {
            throw new JwtInvalidException(h0.b("claim ", str, " does not exist"));
        }
        if (jsonObject.get(str).isJsonArray()) {
            return jsonObject.get(str).getAsJsonArray().toString();
        }
        throw new JwtInvalidException(h0.b("claim ", str, " is not a JSON array"));
    }

    public String getJsonObjectClaim(String str) throws JwtInvalidException {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        if (!jsonObject.has(str)) {
            throw new JwtInvalidException(h0.b("claim ", str, " does not exist"));
        }
        if (jsonObject.get(str).isJsonObject()) {
            return jsonObject.get(str).getAsJsonObject().toString();
        }
        throw new JwtInvalidException(h0.b("claim ", str, " is not a JSON object"));
    }

    public String getJwtId() throws JwtInvalidException {
        return this.f46736a.c("jti");
    }

    public Instant getNotBefore() throws JwtInvalidException {
        return this.f46736a.b("nbf");
    }

    public Double getNumberClaim(String str) throws JwtInvalidException {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        if (!jsonObject.has(str)) {
            throw new JwtInvalidException(h0.b("claim ", str, " does not exist"));
        }
        if (jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isNumber()) {
            return Double.valueOf(jsonObject.get(str).getAsDouble());
        }
        throw new JwtInvalidException(h0.b("claim ", str, " is not a number"));
    }

    public String getStringClaim(String str) throws JwtInvalidException {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        return rawJwt.c(str);
    }

    public String getSubject() throws JwtInvalidException {
        return this.f46736a.c("sub");
    }

    public String getTypeHeader() throws JwtInvalidException {
        return this.f46736a.d();
    }

    public boolean hasAudiences() {
        return this.f46736a.f46731a.has("aud");
    }

    public boolean hasBooleanClaim(String str) {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        return jsonObject.has(str) && jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isBoolean();
    }

    public boolean hasExpiration() {
        return this.f46736a.f46731a.has("exp");
    }

    public boolean hasIssuedAt() {
        return this.f46736a.f46731a.has("iat");
    }

    public boolean hasIssuer() {
        return this.f46736a.f46731a.has("iss");
    }

    public boolean hasJsonArrayClaim(String str) {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        return jsonObject.has(str) && jsonObject.get(str).isJsonArray();
    }

    public boolean hasJsonObjectClaim(String str) {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        return jsonObject.has(str) && jsonObject.get(str).isJsonObject();
    }

    public boolean hasJwtId() {
        return this.f46736a.f46731a.has("jti");
    }

    public boolean hasNotBefore() {
        return this.f46736a.f46731a.has("nbf");
    }

    public boolean hasNumberClaim(String str) {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        return jsonObject.has(str) && jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isNumber();
    }

    public boolean hasStringClaim(String str) {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        JsonObject jsonObject = rawJwt.f46731a;
        return jsonObject.has(str) && jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isString();
    }

    public boolean hasSubject() {
        return this.f46736a.f46731a.has("sub");
    }

    public boolean hasTypeHeader() {
        return this.f46736a.f46732b.isPresent();
    }

    public boolean isNullClaim(String str) {
        RawJwt rawJwt = this.f46736a;
        rawJwt.getClass();
        androidx.collection.b.d(str);
        try {
            return JsonNull.INSTANCE.equals(rawJwt.f46731a.get(str));
        } catch (JsonParseException unused) {
            return false;
        }
    }

    public String toString() {
        return "verified{" + this.f46736a + "}";
    }
}
