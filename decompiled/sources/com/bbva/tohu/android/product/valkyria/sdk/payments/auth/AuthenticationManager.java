package com.bbva.tohu.android.product.valkyria.sdk.payments.auth;

/* JADX INFO: loaded from: classes6.dex */
public interface AuthenticationManager {
    void authenticateWithDeviceUnlocking();

    AuthenticationToken retrieveDeviceAuthentication();

    AuthenticationToken retrieveUserAuthentication();

    void userAuthenticated();
}
