package com.nimbusds.jose.jwk.gen;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyUse;
import java.security.KeyStore;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class JWKGenerator<T extends JWK> {
    protected Algorithm alg;
    protected KeyStore keyStore;
    protected String kid;
    protected Set<KeyOperation> ops;
    protected KeyUse use;
    protected boolean x5tKid;

    public JWKGenerator<T> algorithm(Algorithm algorithm) {
        this.alg = algorithm;
        return this;
    }

    public abstract T generate() throws JOSEException;

    public JWKGenerator<T> keyID(String str) {
        this.kid = str;
        return this;
    }

    public JWKGenerator<T> keyIDFromThumbprint(boolean z10) {
        this.x5tKid = z10;
        return this;
    }

    public JWKGenerator<T> keyOperations(Set<KeyOperation> set) {
        this.ops = set;
        return this;
    }

    public JWKGenerator<T> keyStore(KeyStore keyStore) {
        this.keyStore = keyStore;
        return this;
    }

    public JWKGenerator<T> keyUse(KeyUse keyUse) {
        this.use = keyUse;
        return this;
    }
}
