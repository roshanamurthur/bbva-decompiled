package com.nimbusds.jose.jca;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class JWEJCAContext extends JCAContext {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Provider f62621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Provider f62622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Provider f62623e;

    public JWEJCAContext() {
        this(null, null, null, null, null);
    }

    public Provider getContentEncryptionProvider() {
        Provider provider = this.f62622d;
        return provider != null ? provider : getProvider();
    }

    public Provider getKeyEncryptionProvider() {
        Provider provider = this.f62621c;
        return provider != null ? provider : getProvider();
    }

    public Provider getMACProvider() {
        Provider provider = this.f62623e;
        return provider != null ? provider : getProvider();
    }

    public void setContentEncryptionProvider(Provider provider) {
        this.f62622d = provider;
    }

    public void setKeyEncryptionProvider(Provider provider) {
        this.f62621c = provider;
    }

    public void setMACProvider(Provider provider) {
        this.f62623e = provider;
    }

    public JWEJCAContext(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f62621c = provider2;
        this.f62622d = provider3;
        this.f62623e = provider4;
    }
}
