package com.nimbusds.jose.proc;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.KeyConverter;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import java.security.Key;
import java.security.PublicKey;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.crypto.SecretKey;
import ji.a;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class JWSVerificationKeySelector<C extends SecurityContext> extends a<C> implements JWSKeySelector<C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<JWSAlgorithm> f62744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62745c;

    public JWSVerificationKeySelector(JWSAlgorithm jWSAlgorithm, JWKSource<C> jWKSource) {
        super(jWKSource);
        if (jWSAlgorithm == null) {
            throw new IllegalArgumentException("The JWS algorithm must not be null");
        }
        this.f62744b = Collections.singleton(jWSAlgorithm);
        this.f62745c = true;
    }

    public JWKMatcher createJWKMatcher(JWSHeader jWSHeader) {
        if (isAllowed(jWSHeader.getAlgorithm())) {
            return JWKMatcher.forJWSHeader(jWSHeader);
        }
        return null;
    }

    @Deprecated
    public JWSAlgorithm getExpectedJWSAlgorithm() {
        if (this.f62745c) {
            return this.f62744b.iterator().next();
        }
        throw new UnsupportedOperationException("Since this class was constructed with multiple algorithms, the behavior of this method is undefined.");
    }

    @Override // ji.a
    public /* bridge */ /* synthetic */ JWKSource getJWKSource() {
        return super.getJWKSource();
    }

    public boolean isAllowed(JWSAlgorithm jWSAlgorithm) {
        return this.f62744b.contains(jWSAlgorithm);
    }

    @Override // com.nimbusds.jose.proc.JWSKeySelector
    public List<Key> selectJWSKeys(JWSHeader jWSHeader, C c10) throws KeySourceException {
        if (!this.f62744b.contains(jWSHeader.getAlgorithm())) {
            return Collections.emptyList();
        }
        JWKMatcher jWKMatcherCreateJWKMatcher = createJWKMatcher(jWSHeader);
        if (jWKMatcherCreateJWKMatcher == null) {
            return Collections.emptyList();
        }
        List<JWK> list = getJWKSource().get(new JWKSelector(jWKMatcherCreateJWKMatcher), c10);
        LinkedList linkedList = new LinkedList();
        for (Key key : KeyConverter.toJavaKeys(list)) {
            if ((key instanceof PublicKey) || (key instanceof SecretKey)) {
                linkedList.add(key);
            }
        }
        return linkedList;
    }

    public JWSVerificationKeySelector(Set<JWSAlgorithm> set, JWKSource<C> jWKSource) {
        super(jWKSource);
        if (set != null && !set.isEmpty()) {
            this.f62744b = Collections.unmodifiableSet(set);
            this.f62745c = false;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithms must not be null or empty");
    }
}
