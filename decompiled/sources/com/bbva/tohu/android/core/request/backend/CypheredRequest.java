package com.bbva.tohu.android.core.request.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class CypheredRequest {
    private String derivationComplement;
    private ClosedDerivationId derivationId;
    private String msg;

    public String getDerivationComplement() {
        return this.derivationComplement;
    }

    public ClosedDerivationId getDerivationId() {
        return this.derivationId;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setDerivationComplement(String str) {
        this.derivationComplement = str;
    }

    public void setDerivationId(ClosedDerivationId closedDerivationId) {
        this.derivationId = closedDerivationId;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CypheredRequest{derivationId=");
        sb2.append(this.derivationId);
        sb2.append(", derivationComplement='");
        sb2.append(this.derivationComplement);
        sb2.append("', msg='");
        return d.f(sb2, this.msg, "'}");
    }
}
