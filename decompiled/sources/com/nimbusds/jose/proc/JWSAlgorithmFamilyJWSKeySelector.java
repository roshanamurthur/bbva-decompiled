package com.nimbusds.jose.proc;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.KeyType;
import com.nimbusds.jose.jwk.KeyUse;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.jwk.source.RemoteJWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import java.net.URL;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ji.a;

/* JADX INFO: loaded from: classes10.dex */
public class JWSAlgorithmFamilyJWSKeySelector<C extends SecurityContext> extends a<C> implements JWSKeySelector<C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f62743b;

    public JWSAlgorithmFamilyJWSKeySelector(JWSAlgorithm.Family family, JWKSource<C> jWKSource) {
        super(jWKSource);
        this.f62743b = new HashMap();
        if (family == null) {
            throw new IllegalArgumentException("JWS algorithm family must not be null");
        }
        Iterator<T> it = family.iterator();
        while (it.hasNext()) {
            JWSAlgorithm jWSAlgorithm = (JWSAlgorithm) it.next();
            this.f62743b.put(jWSAlgorithm, new JWSVerificationKeySelector(jWSAlgorithm, jWKSource));
        }
    }

    public static <C extends SecurityContext> JWSAlgorithmFamilyJWSKeySelector<C> fromJWKSetURL(URL url) throws KeySourceException {
        return fromJWKSource(new RemoteJWKSet(url));
    }

    public static <C extends SecurityContext> JWSAlgorithmFamilyJWSKeySelector<C> fromJWKSource(JWKSource<C> jWKSource) throws KeySourceException {
        for (JWK jwk : jWKSource.get(new JWKSelector(new JWKMatcher.Builder().publicOnly(true).keyUses(KeyUse.SIGNATURE, null).keyTypes(KeyType.RSA, KeyType.EC).build()), null)) {
            if (KeyType.RSA.equals(jwk.getKeyType())) {
                return new JWSAlgorithmFamilyJWSKeySelector<>(JWSAlgorithm.Family.RSA, jWKSource);
            }
            if (KeyType.EC.equals(jwk.getKeyType())) {
                return new JWSAlgorithmFamilyJWSKeySelector<>(JWSAlgorithm.Family.EC, jWKSource);
            }
        }
        throw new KeySourceException("Couldn't retrieve JWKs");
    }

    @Override // ji.a
    public /* bridge */ /* synthetic */ JWKSource getJWKSource() {
        return super.getJWKSource();
    }

    @Override // com.nimbusds.jose.proc.JWSKeySelector
    public List<? extends Key> selectJWSKeys(JWSHeader jWSHeader, C c10) throws KeySourceException {
        JWSKeySelector jWSKeySelector = (JWSKeySelector) this.f62743b.get(jWSHeader.getAlgorithm());
        return jWSKeySelector == null ? Collections.emptyList() : jWSKeySelector.selectJWSKeys(jWSHeader, c10);
    }
}
