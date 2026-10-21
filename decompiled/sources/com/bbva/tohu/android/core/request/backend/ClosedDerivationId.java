package com.bbva.tohu.android.core.request.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class ClosedDerivationId {
    private String derivationId;

    public String getDerivationId() {
        return this.derivationId;
    }

    public void setDerivationId(String str) {
        this.derivationId = str;
    }

    public String toString() {
        return d.f(new StringBuilder("ClosedDerivationId{derivationId='"), this.derivationId, "'}");
    }
}
