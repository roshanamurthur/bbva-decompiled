package com.google.crypto.tink.jwt;

import androidx.camera.camera2.internal.h0;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.crypto.tink.internal.JsonParser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class RawJwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonObject f46731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Optional<String> f46732b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Optional<String> f46733a = Optional.empty();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f46734b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JsonObject f46735c = new JsonObject();

        public final void a(String str, Instant instant) {
            long epochSecond = instant.getEpochSecond();
            if (epochSecond > 253402300799L || epochSecond < 0) {
                throw new IllegalArgumentException(h0.b("timestamp of claim ", str, " is out of range"));
            }
            this.f46735c.add(str, new JsonPrimitive(Long.valueOf(epochSecond)));
        }

        @CanIgnoreReturnValue
        public Builder addAudience(String str) {
            JsonArray jsonArray;
            if (!JsonParser.isValidString(str)) {
                throw new IllegalArgumentException("invalid string");
            }
            JsonObject jsonObject = this.f46735c;
            if (jsonObject.has("aud")) {
                JsonElement jsonElement = jsonObject.get("aud");
                if (!jsonElement.isJsonArray()) {
                    throw new IllegalArgumentException("addAudience can't be used together with setAudience");
                }
                jsonArray = jsonElement.getAsJsonArray();
            } else {
                jsonArray = new JsonArray();
            }
            jsonArray.add(str);
            jsonObject.add("aud", jsonArray);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addBooleanClaim(String str, boolean z10) {
            androidx.collection.b.d(str);
            this.f46735c.add(str, new JsonPrimitive(Boolean.valueOf(z10)));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addJsonArrayClaim(String str, String str2) throws JwtInvalidException {
            androidx.collection.b.d(str);
            try {
                this.f46735c.add(str, JsonParser.parse(str2).getAsJsonArray());
                return this;
            } catch (JsonParseException | IOException | IllegalStateException e5) {
                throw new JwtInvalidException(c2.b.d("invalid JSON: ", e5));
            }
        }

        @CanIgnoreReturnValue
        public Builder addJsonObjectClaim(String str, String str2) throws JwtInvalidException {
            androidx.collection.b.d(str);
            this.f46735c.add(str, hf.a.a(str2));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addNullClaim(String str) {
            androidx.collection.b.d(str);
            this.f46735c.add(str, JsonNull.INSTANCE);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addNumberClaim(String str, double d2) {
            androidx.collection.b.d(str);
            this.f46735c.add(str, new JsonPrimitive(Double.valueOf(d2)));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addStringClaim(String str, String str2) {
            if (!JsonParser.isValidString(str2)) {
                throw new IllegalArgumentException();
            }
            androidx.collection.b.d(str);
            this.f46735c.add(str, new JsonPrimitive(str2));
            return this;
        }

        public RawJwt build() {
            return new RawJwt(this);
        }

        @CanIgnoreReturnValue
        public Builder setAudience(String str) {
            JsonObject jsonObject = this.f46735c;
            if (jsonObject.has("aud") && jsonObject.get("aud").isJsonArray()) {
                throw new IllegalArgumentException("setAudience can't be used together with setAudiences or addAudience");
            }
            if (!JsonParser.isValidString(str)) {
                throw new IllegalArgumentException("invalid string");
            }
            jsonObject.add("aud", new JsonPrimitive(str));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudiences(List<String> list) {
            JsonObject jsonObject = this.f46735c;
            if (jsonObject.has("aud") && !jsonObject.get("aud").isJsonArray()) {
                throw new IllegalArgumentException("setAudiences can't be used together with setAudience");
            }
            if (list.isEmpty()) {
                throw new IllegalArgumentException("audiences must not be empty");
            }
            JsonArray jsonArray = new JsonArray();
            for (String str : list) {
                if (!JsonParser.isValidString(str)) {
                    throw new IllegalArgumentException("invalid string");
                }
                jsonArray.add(str);
            }
            jsonObject.add("aud", jsonArray);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setExpiration(Instant instant) {
            a("exp", instant);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIssuedAt(Instant instant) {
            a("iat", instant);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIssuer(String str) {
            if (!JsonParser.isValidString(str)) {
                throw new IllegalArgumentException();
            }
            this.f46735c.add("iss", new JsonPrimitive(str));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setJwtId(String str) {
            if (!JsonParser.isValidString(str)) {
                throw new IllegalArgumentException();
            }
            this.f46735c.add("jti", new JsonPrimitive(str));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setNotBefore(Instant instant) {
            a("nbf", instant);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubject(String str) {
            if (!JsonParser.isValidString(str)) {
                throw new IllegalArgumentException();
            }
            this.f46735c.add("sub", new JsonPrimitive(str));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTypeHeader(String str) {
            this.f46733a = Optional.of(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withoutExpiration() {
            this.f46734b = true;
            return this;
        }
    }

    public RawJwt(Builder builder) {
        if (!builder.f46735c.has("exp") && !builder.f46734b) {
            throw new IllegalArgumentException("neither setExpiration() nor withoutExpiration() was called");
        }
        JsonObject jsonObject = builder.f46735c;
        if (jsonObject.has("exp") && builder.f46734b) {
            throw new IllegalArgumentException("setExpiration() and withoutExpiration() must not be called together");
        }
        this.f46732b = builder.f46733a;
        this.f46731a = jsonObject.deepCopy();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final List<String> a() throws JwtInvalidException {
        JsonObject jsonObject = this.f46731a;
        if (!jsonObject.has("aud")) {
            throw new JwtInvalidException("claim aud does not exist");
        }
        JsonElement jsonElement = jsonObject.get("aud");
        if (jsonElement.isJsonPrimitive()) {
            if (jsonElement.getAsJsonPrimitive().isString()) {
                return Collections.unmodifiableList(Arrays.asList(jsonElement.getAsString()));
            }
            throw new JwtInvalidException(String.format("invalid audience: got %s; want a string", jsonElement));
        }
        if (!jsonElement.isJsonArray()) {
            throw new JwtInvalidException("claim aud is not a string or a JSON array");
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        ArrayList arrayList = new ArrayList(asJsonArray.size());
        for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
            if (!asJsonArray.get(i10).isJsonPrimitive() || !asJsonArray.get(i10).getAsJsonPrimitive().isString()) {
                throw new JwtInvalidException(String.format("invalid audience: got %s; want a string", asJsonArray.get(i10)));
            }
            arrayList.add(asJsonArray.get(i10).getAsString());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Instant b(String str) throws JwtInvalidException {
        JsonObject jsonObject = this.f46731a;
        if (!jsonObject.has(str)) {
            throw new JwtInvalidException(h0.b("claim ", str, " does not exist"));
        }
        if (!jsonObject.get(str).isJsonPrimitive() || !jsonObject.get(str).getAsJsonPrimitive().isNumber()) {
            throw new JwtInvalidException(h0.b("claim ", str, " is not a timestamp"));
        }
        try {
            return Instant.ofEpochMilli((long) (jsonObject.get(str).getAsJsonPrimitive().getAsDouble() * 1000.0d));
        } catch (NumberFormatException e5) {
            throw new JwtInvalidException("claim " + str + " is not a timestamp: " + e5);
        }
    }

    public final String c(String str) throws JwtInvalidException {
        JsonObject jsonObject = this.f46731a;
        if (!jsonObject.has(str)) {
            throw new JwtInvalidException(h0.b("claim ", str, " does not exist"));
        }
        if (jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isString()) {
            return jsonObject.get(str).getAsString();
        }
        throw new JwtInvalidException(h0.b("claim ", str, " is not a string"));
    }

    public final String d() throws JwtInvalidException {
        Optional<String> optional = this.f46732b;
        if (optional.isPresent()) {
            return (String) optional.get();
        }
        throw new JwtInvalidException("type header is not set");
    }

    public final void e(String str) throws JwtInvalidException {
        JsonObject jsonObject = this.f46731a;
        if (jsonObject.has(str)) {
            if (!jsonObject.get(str).isJsonPrimitive() || !jsonObject.get(str).getAsJsonPrimitive().isString()) {
                throw new JwtInvalidException(h0.b("invalid JWT payload: claim ", str, " is not a string."));
            }
        }
    }

    public final void f(String str) throws JwtInvalidException {
        JsonObject jsonObject = this.f46731a;
        if (jsonObject.has(str)) {
            if (!jsonObject.get(str).isJsonPrimitive() || !jsonObject.get(str).getAsJsonPrimitive().isNumber()) {
                throw new JwtInvalidException(h0.b("invalid JWT payload: claim ", str, " is not a number."));
            }
            double asDouble = jsonObject.get(str).getAsJsonPrimitive().getAsDouble();
            if (asDouble > 2.53402300799E11d || asDouble < 0.0d) {
                throw new JwtInvalidException(h0.b("invalid JWT payload: claim ", str, " has an invalid timestamp"));
            }
        }
    }

    public String toString() {
        JsonObject jsonObject = new JsonObject();
        Optional<String> optional = this.f46732b;
        if (optional.isPresent()) {
            jsonObject.add(ClientData.KEY_TYPE, new JsonPrimitive((String) optional.get()));
        }
        return jsonObject + Constant.DOT_STRING + this.f46731a;
    }

    public RawJwt(Optional<String> optional, String str) throws JwtInvalidException {
        this.f46732b = optional;
        JsonObject jsonObjectA = hf.a.a(str);
        this.f46731a = jsonObjectA;
        e("iss");
        e("sub");
        e("jti");
        f("exp");
        f("nbf");
        f("iat");
        if (jsonObjectA.has("aud")) {
            if (!(jsonObjectA.get("aud").isJsonPrimitive() && jsonObjectA.get("aud").getAsJsonPrimitive().isString()) && a().size() < 1) {
                throw new JwtInvalidException("invalid JWT payload: claim aud is present but empty.");
            }
        }
    }
}
