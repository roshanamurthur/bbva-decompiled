package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.gson.JsonObject;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Optional;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class JwtValidator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Duration f46710k = Duration.ofMinutes(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Optional<String> f46711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Optional<String> f46713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Optional<String> f46715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Clock f46719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Duration f46720j;

    public static final class Builder {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Clock f46729i = Clock.systemUTC();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Duration f46730j = Duration.ZERO;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Optional<String> f46721a = Optional.empty();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f46722b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Optional<String> f46723c = Optional.empty();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f46724d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Optional<String> f46725e = Optional.empty();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f46726f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f46727g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f46728h = false;

        @CanIgnoreReturnValue
        public Builder allowMissingExpiration() {
            this.f46727g = true;
            return this;
        }

        public JwtValidator build() {
            if (this.f46722b && this.f46721a.isPresent()) {
                throw new IllegalArgumentException("ignoreTypeHeader() and expectedTypeHeader() cannot be used together.");
            }
            if (this.f46724d && this.f46723c.isPresent()) {
                throw new IllegalArgumentException("ignoreIssuer() and expectedIssuer() cannot be used together.");
            }
            if (this.f46726f && this.f46725e.isPresent()) {
                throw new IllegalArgumentException("ignoreAudiences() and expectedAudience() cannot be used together.");
            }
            return new JwtValidator(this);
        }

        @CanIgnoreReturnValue
        public Builder expectAudience(String str) {
            if (str == null) {
                throw new NullPointerException("audience cannot be null");
            }
            this.f46725e = Optional.of(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder expectIssuedInThePast() {
            this.f46728h = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder expectIssuer(String str) {
            if (str == null) {
                throw new NullPointerException("issuer cannot be null");
            }
            this.f46723c = Optional.of(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder expectTypeHeader(String str) {
            if (str == null) {
                throw new NullPointerException("typ header cannot be null");
            }
            this.f46721a = Optional.of(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder ignoreAudiences() {
            this.f46726f = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder ignoreIssuer() {
            this.f46724d = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder ignoreTypeHeader() {
            this.f46722b = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClock(Clock clock) {
            if (clock == null) {
                throw new NullPointerException("clock cannot be null");
            }
            this.f46729i = clock;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClockSkew(Duration duration) {
            if (duration.compareTo(JwtValidator.f46710k) > 0) {
                throw new IllegalArgumentException("Clock skew too large, max is 10 minutes");
            }
            this.f46730j = duration;
            return this;
        }
    }

    public JwtValidator(Builder builder) {
        this.f46711a = builder.f46721a;
        this.f46712b = builder.f46722b;
        this.f46713c = builder.f46723c;
        this.f46714d = builder.f46724d;
        this.f46715e = builder.f46725e;
        this.f46716f = builder.f46726f;
        this.f46717g = builder.f46727g;
        this.f46718h = builder.f46728h;
        this.f46719i = builder.f46729i;
        this.f46720j = builder.f46730j;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final VerifiedJwt a(RawJwt rawJwt) throws JwtInvalidException {
        Instant instant = this.f46719i.instant();
        JsonObject jsonObject = rawJwt.f46731a;
        if (!jsonObject.has("exp") && !this.f46717g) {
            throw new JwtInvalidException("token does not have an expiration set");
        }
        boolean zHas = jsonObject.has("exp");
        Duration duration = this.f46720j;
        if (zHas && !rawJwt.b("exp").isAfter(instant.minus((TemporalAmount) duration))) {
            throw new JwtInvalidException("token has expired since " + rawJwt.b("exp"));
        }
        if (jsonObject.has("nbf") && rawJwt.b("nbf").isAfter(instant.plus((TemporalAmount) duration))) {
            throw new JwtInvalidException("token cannot be used before " + rawJwt.b("nbf"));
        }
        if (this.f46718h) {
            if (!jsonObject.has("iat")) {
                throw new JwtInvalidException("token does not have an iat claim");
            }
            if (rawJwt.b("iat").isAfter(instant.plus((TemporalAmount) duration))) {
                throw new JwtInvalidException("token has a invalid iat claim in the future: " + rawJwt.b("iat"));
            }
        }
        Optional<String> optional = this.f46711a;
        boolean zIsPresent = optional.isPresent();
        Optional<String> optional2 = rawJwt.f46732b;
        if (zIsPresent) {
            if (!optional2.isPresent()) {
                throw new JwtInvalidException(String.format("invalid JWT; missing expected type header %s.", optional.get()));
            }
            if (!rawJwt.d().equals(optional.get())) {
                throw new JwtInvalidException(String.format("invalid JWT; expected type header %s, but got %s", optional.get(), rawJwt.d()));
            }
        } else if (optional2.isPresent() && !this.f46712b) {
            throw new JwtInvalidException("invalid JWT; token has type header set, but validator not.");
        }
        Optional<String> optional3 = this.f46713c;
        if (optional3.isPresent()) {
            if (!jsonObject.has("iss")) {
                throw new JwtInvalidException(String.format("invalid JWT; missing expected issuer %s.", optional3.get()));
            }
            if (!rawJwt.c("iss").equals(optional3.get())) {
                throw new JwtInvalidException(String.format("invalid JWT; expected issuer %s, but got %s", optional3.get(), rawJwt.c("iss")));
            }
        } else if (jsonObject.has("iss") && !this.f46714d) {
            throw new JwtInvalidException("invalid JWT; token has issuer set, but validator not.");
        }
        Optional<String> optional4 = this.f46715e;
        if (optional4.isPresent()) {
            if (!jsonObject.has("aud") || !rawJwt.a().contains(optional4.get())) {
                throw new JwtInvalidException(String.format("invalid JWT; missing expected audience %s.", optional4.get()));
            }
        } else if (jsonObject.has("aud") && !this.f46716f) {
            throw new JwtInvalidException("invalid JWT; token has audience set, but validator not.");
        }
        return new VerifiedJwt(rawJwt);
    }

    public String toString() {
        ArrayList<String> arrayList = new ArrayList();
        Optional<String> optional = this.f46711a;
        if (optional.isPresent()) {
            arrayList.add("expectedTypeHeader=" + ((String) optional.get()));
        }
        if (this.f46712b) {
            arrayList.add("ignoreTypeHeader");
        }
        Optional<String> optional2 = this.f46713c;
        if (optional2.isPresent()) {
            arrayList.add("expectedIssuer=" + ((String) optional2.get()));
        }
        if (this.f46714d) {
            arrayList.add("ignoreIssuer");
        }
        Optional<String> optional3 = this.f46715e;
        if (optional3.isPresent()) {
            arrayList.add("expectedAudience=" + ((String) optional3.get()));
        }
        if (this.f46716f) {
            arrayList.add("ignoreAudiences");
        }
        if (this.f46717g) {
            arrayList.add("allowMissingExpiration");
        }
        if (this.f46718h) {
            arrayList.add("expectIssuedInThePast");
        }
        Duration duration = this.f46720j;
        if (!duration.isZero()) {
            arrayList.add("clockSkew=" + duration);
        }
        StringBuilder sb2 = new StringBuilder("JwtValidator{");
        String str = "";
        for (String str2 : arrayList) {
            sb2.append(str);
            sb2.append(str2);
            str = ",";
        }
        sb2.append("}");
        return sb2.toString();
    }
}
