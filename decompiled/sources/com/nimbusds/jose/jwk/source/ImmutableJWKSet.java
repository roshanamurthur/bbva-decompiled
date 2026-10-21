package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import java.util.List;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class ImmutableJWKSet<C extends SecurityContext> implements JWKSource<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JWKSet f62717a;

    public ImmutableJWKSet(JWKSet jWKSet) {
        if (jWKSet == null) {
            throw new IllegalArgumentException("The JWK set must not be null");
        }
        this.f62717a = jWKSet;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public List<JWK> get(JWKSelector jWKSelector, C c10) {
        return jWKSelector.select(this.f62717a);
    }

    public JWKSet getJWKSet() {
        return this.f62717a;
    }
}
