package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;

/* JADX INFO: loaded from: classes10.dex */
public interface JWKSetCache {
    JWKSet get();

    void put(JWKSet jWKSet);

    boolean requiresRefresh();
}
