package com.bbva.sl.ar.android.libkeymanagement.crypto;

import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;

/* JADX INFO: loaded from: classes8.dex */
public interface ICrypto {
    byte[] decrypt(String str, String str2) throws KeyManagementException;

    byte[] decryptRaw(byte[] bArr, String str) throws KeyManagementException;

    EncryptedData encrypt(byte[] bArr, String str) throws KeyManagementException;

    byte[] encryptRaw(byte[] bArr, String str) throws KeyManagementException;

    MacData generateHostMac(byte[] bArr) throws KeyManagementException;
}
