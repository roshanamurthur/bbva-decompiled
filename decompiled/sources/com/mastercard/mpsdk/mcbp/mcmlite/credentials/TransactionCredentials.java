package com.mastercard.mpsdk.mcbp.mcmlite.credentials;

/* JADX INFO: loaded from: classes10.dex */
public interface TransactionCredentials {
    byte[] getAtc();

    byte[] getIdn();

    byte[] getMdSessionKey();

    byte[] getUmdSessionKey();

    void wipe();
}
