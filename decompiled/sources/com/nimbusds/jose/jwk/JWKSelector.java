package com.nimbusds.jose.jwk;

import java.util.LinkedList;
import java.util.List;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class JWKSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JWKMatcher f62671a;

    public JWKSelector(JWKMatcher jWKMatcher) {
        if (jWKMatcher == null) {
            throw new IllegalArgumentException("The JWK matcher must not be null");
        }
        this.f62671a = jWKMatcher;
    }

    public JWKMatcher getMatcher() {
        return this.f62671a;
    }

    public List<JWK> select(JWKSet jWKSet) {
        LinkedList linkedList = new LinkedList();
        if (jWKSet == null) {
            return linkedList;
        }
        for (JWK jwk : jWKSet.getKeys()) {
            if (this.f62671a.matches(jwk)) {
                linkedList.add(jwk);
            }
        }
        return linkedList;
    }
}
