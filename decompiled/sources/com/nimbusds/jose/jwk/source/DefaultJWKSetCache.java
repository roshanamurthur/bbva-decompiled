package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class DefaultJWKSetCache implements JWKSetCache {
    public static final long DEFAULT_LIFESPAN_MINUTES = 15;
    public static final long DEFAULT_REFRESH_TIME_MINUTES = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f62713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f62715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile JWKSetWithTimestamp f62716d;

    public DefaultJWKSetCache() {
        this(15L, 5L, TimeUnit.MINUTES);
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCache
    public JWKSet get() {
        if (this.f62716d == null || isExpired()) {
            return null;
        }
        return this.f62716d.getJWKSet();
    }

    public long getLifespan(TimeUnit timeUnit) {
        long j10 = this.f62713a;
        return j10 < 0 ? j10 : timeUnit.convert(j10, this.f62715c);
    }

    public long getPutTimestamp() {
        if (this.f62716d != null) {
            return this.f62716d.getDate().getTime();
        }
        return -1L;
    }

    public long getRefreshTime(TimeUnit timeUnit) {
        long j10 = this.f62714b;
        return j10 < 0 ? j10 : timeUnit.convert(j10, this.f62715c);
    }

    public boolean isExpired() {
        if (this.f62716d != null && this.f62713a > -1) {
            if (new Date().getTime() > TimeUnit.MILLISECONDS.convert(this.f62713a, this.f62715c) + this.f62716d.getDate().getTime()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCache
    public void put(JWKSet jWKSet) {
        this.f62716d = jWKSet != null ? new JWKSetWithTimestamp(jWKSet) : null;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCache
    public boolean requiresRefresh() {
        if (this.f62716d != null && this.f62714b > -1) {
            if (new Date().getTime() > TimeUnit.MILLISECONDS.convert(this.f62714b, this.f62715c) + this.f62716d.getDate().getTime()) {
                return true;
            }
        }
        return false;
    }

    public DefaultJWKSetCache(long j10, long j11, TimeUnit timeUnit) {
        this.f62713a = j10;
        this.f62714b = j11;
        if ((j10 > -1 || j11 > -1) && timeUnit == null) {
            throw new IllegalArgumentException("A time unit must be specified for non-negative lifespans or refresh times");
        }
        this.f62715c = timeUnit;
    }
}
