package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.product.valkyria.sdk.services.ClockService;

/* JADX INFO: loaded from: classes6.dex */
public class ClockServiceDefaultImpl implements ClockService {
    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ClockService
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
