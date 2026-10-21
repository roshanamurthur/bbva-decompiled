package com.bbva.tohu.android.product.valkyria.sdk.payments.auth;

/* JADX INFO: loaded from: classes6.dex */
public class AuthenticationManagerDefaultImpl implements AuthenticationManager {
    private final AuthenticationTokenBuilder authenticationTokenBuilder;
    private final long authenticationTtlInSeconds;
    private static AuthenticationToken[] userAuthHolder = {null};
    private static AuthenticationToken[] deviceAuthHolder = {null};

    public AuthenticationManagerDefaultImpl(AuthenticationTokenBuilder authenticationTokenBuilder, long j10) {
        this.authenticationTtlInSeconds = j10;
        this.authenticationTokenBuilder = authenticationTokenBuilder;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager
    public synchronized void authenticateWithDeviceUnlocking() {
        deviceAuthHolder[0] = this.authenticationTokenBuilder.withTimeToLive(this.authenticationTtlInSeconds);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager
    public AuthenticationToken retrieveDeviceAuthentication() {
        return deviceAuthHolder[0];
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager
    public AuthenticationToken retrieveUserAuthentication() {
        return userAuthHolder[0];
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager
    public synchronized void userAuthenticated() {
        userAuthHolder[0] = this.authenticationTokenBuilder.withTimeToLive(this.authenticationTtlInSeconds);
    }
}
