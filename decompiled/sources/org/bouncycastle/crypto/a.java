package org.bouncycastle.crypto;

import java.security.Permission;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements PrivilegedAction<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SecurityManager f87870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Permission f87871b;

    public a(SecurityManager securityManager, CryptoServicesPermission cryptoServicesPermission) {
        this.f87870a = securityManager;
        this.f87871b = cryptoServicesPermission;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        this.f87870a.checkPermission(this.f87871b);
        return null;
    }
}
