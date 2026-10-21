package com.nimbusds.jose.proc;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.proc.SecurityContext;
import java.security.Key;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SingleKeyJWSKeySelector<C extends SecurityContext> implements JWSKeySelector<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Key> f62746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JWSAlgorithm f62747b;

    public SingleKeyJWSKeySelector(JWSAlgorithm jWSAlgorithm, Key key) {
        if (jWSAlgorithm == null) {
            throw new IllegalArgumentException("The expected JWS algorithm cannot be null");
        }
        if (key == null) {
            throw new IllegalArgumentException("The key cannot be null");
        }
        this.f62746a = Collections.singletonList(key);
        this.f62747b = jWSAlgorithm;
    }

    @Override // com.nimbusds.jose.proc.JWSKeySelector
    public List<? extends Key> selectJWSKeys(JWSHeader jWSHeader, C c10) {
        return !this.f62747b.equals(jWSHeader.getAlgorithm()) ? Collections.emptyList() : this.f62746a;
    }
}
