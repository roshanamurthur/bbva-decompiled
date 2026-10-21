package com.bbva.tohu.android.product.valkyria.sdk.payments.auth;

import com.bbva.tohu.android.product.valkyria.sdk.services.ClockService;

/* JADX INFO: loaded from: classes6.dex */
public class AuthenticationToken {
    private ClockService clockService;
    private long validUntilTimestamp;

    public AuthenticationToken(ClockService clockService, long j10, long j11) {
        this.validUntilTimestamp = (j11 * 1000) + j10;
        this.clockService = clockService;
    }

    public boolean isValid() {
        return this.clockService.getCurrentTimeMillis() <= this.validUntilTimestamp;
    }
}
