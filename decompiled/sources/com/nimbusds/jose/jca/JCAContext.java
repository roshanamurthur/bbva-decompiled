package com.nimbusds.jose.jca;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class JCAContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Provider f62619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f62620b;

    public JCAContext() {
        this(null, null);
    }

    public Provider getProvider() {
        return this.f62619a;
    }

    public SecureRandom getSecureRandom() {
        SecureRandom secureRandom = this.f62620b;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }

    public void setProvider(Provider provider) {
        this.f62619a = provider;
    }

    public void setSecureRandom(SecureRandom secureRandom) {
        this.f62620b = secureRandom;
    }

    public JCAContext(Provider provider, SecureRandom secureRandom) {
        this.f62619a = provider;
        this.f62620b = secureRandom;
    }
}
