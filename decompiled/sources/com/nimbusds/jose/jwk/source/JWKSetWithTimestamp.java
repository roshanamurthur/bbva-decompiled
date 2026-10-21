package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import java.util.Date;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class JWKSetWithTimestamp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JWKSet f62718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f62719b;

    public JWKSetWithTimestamp(JWKSet jWKSet) {
        this(jWKSet, new Date());
    }

    public Date getDate() {
        return this.f62719b;
    }

    public JWKSet getJWKSet() {
        return this.f62718a;
    }

    public JWKSetWithTimestamp(JWKSet jWKSet, Date date) {
        if (jWKSet == null) {
            throw new IllegalArgumentException("The JWK set must not be null");
        }
        this.f62718a = jWKSet;
        if (date == null) {
            throw new IllegalArgumentException("The timestamp must not null");
        }
        this.f62719b = date;
    }
}
