package com.bbva.tohu.android.core.exceptions.backend;

/* JADX INFO: loaded from: classes6.dex */
public class Tohu428Exception extends TohuBackendException {
    String nonce;

    public Tohu428Exception(String str) {
        this.nonce = str;
    }

    public String getNonce() {
        return this.nonce;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }
}
