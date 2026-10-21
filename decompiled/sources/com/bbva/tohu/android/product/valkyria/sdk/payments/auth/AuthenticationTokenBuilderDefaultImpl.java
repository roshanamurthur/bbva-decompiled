package com.bbva.tohu.android.product.valkyria.sdk.payments.auth;

import com.bbva.tohu.android.product.valkyria.sdk.services.ClockService;

/* JADX INFO: loaded from: classes6.dex */
public class AuthenticationTokenBuilderDefaultImpl implements AuthenticationTokenBuilder {
    private ClockService clockService;

    public AuthenticationTokenBuilderDefaultImpl(ClockService clockService) {
        this.clockService = clockService;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationTokenBuilder
    public AuthenticationToken withTimeToLive(long j10) {
        ClockService clockService = this.clockService;
        return new AuthenticationToken(clockService, clockService.getCurrentTimeMillis(), j10);
    }
}
