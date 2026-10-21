package com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto;

import ad.d;
import com.bbva.tohu.android.product.valkyria.sdk.model.TransactionCredential;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionCredentialDto {
    private String bid;
    private String id;

    public TransactionCredentialDto(TransactionCredential transactionCredential) {
        this.id = transactionCredential.getTransactionCredentialId();
        this.bid = transactionCredential.getBullet() == null ? null : transactionCredential.getBullet().getBulletId();
    }

    public String getBid() {
        return this.bid;
    }

    public String getId() {
        return this.id;
    }

    public void setBid(String str) {
        this.bid = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionCredentialDto{id='");
        sb2.append(this.id);
        sb2.append("', bid='");
        return d.f(sb2, this.bid, "'}");
    }
}
