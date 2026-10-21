package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionCredentialsDefaultImpl implements TransactionCredentials {
    private byte[] atc;
    private byte[] idn;
    private byte[] mdSessionKey;
    private byte[] umdSessionKey;

    public TransactionCredentialsDefaultImpl(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.mdSessionKey = bArr;
        this.umdSessionKey = bArr2;
        this.idn = bArr3;
        this.atc = bArr4;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials
    public byte[] getAtc() {
        return this.atc;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials
    public byte[] getIdn() {
        return this.idn;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials
    public byte[] getMdSessionKey() {
        return this.mdSessionKey;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials
    public byte[] getUmdSessionKey() {
        return this.umdSessionKey;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials
    public void wipe() {
    }
}
