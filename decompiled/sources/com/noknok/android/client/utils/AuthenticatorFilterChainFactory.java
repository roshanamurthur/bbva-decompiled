package com.noknok.android.client.utils;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AuthenticatorFilterChainFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AuthenticatorFilterChainFactory f63426a;

    public static AuthenticatorFilterChainFactory getInstance() {
        return f63426a;
    }

    public static void setInstance(AuthenticatorFilterChainFactory authenticatorFilterChainFactory) {
        synchronized (AuthenticatorFilterChainFactory.class) {
            f63426a = authenticatorFilterChainFactory;
        }
    }

    public abstract List<IAuthenticatorFilter> createFilterChain(String str);
}
