package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

/* JADX INFO: loaded from: classes6.dex */
public interface SingleKey {
    byte[] getAtc();

    byte[] getIdn();

    byte[] getSessionKeyContactlessMd();

    byte[] getSessionKeyContactlessUmd();

    byte[] getSessionKeyRemotePaymentMd();

    byte[] getSessionKeyRemotePaymentUmd();
}
