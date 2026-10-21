package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSProvider;
import com.nimbusds.jose.jca.JCAContext;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseJWSProvider implements JWSProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<JWSAlgorithm> f62596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JCAContext f62597b = new JCAContext();

    public BaseJWSProvider(Set<JWSAlgorithm> set) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
        }
        this.f62596a = Collections.unmodifiableSet(set);
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public JCAContext getJCAContext() {
        return this.f62597b;
    }

    @Override // com.nimbusds.jose.JWSProvider
    public Set<JWSAlgorithm> supportedJWSAlgorithms() {
        return this.f62596a;
    }
}
