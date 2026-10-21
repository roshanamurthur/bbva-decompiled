package com.nimbusds.jose.proc;

import com.nimbusds.jose.jwk.JWK;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class JWKSecurityContext implements SecurityContext {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<JWK> f62742p0;

    public JWKSecurityContext(List<JWK> list) {
        this.f62742p0 = list;
        if (list == null) {
            throw new IllegalArgumentException("The list of keys must not be null");
        }
    }

    public List<JWK> getKeys() {
        return this.f62742p0;
    }
}
