package com.bbva.tohu.android.core.crypto;

import android.content.Context;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.repository.IStorage;
import com.bbva.tohu.android.core.exceptions.CryptoException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SecureStorage {
    private IStorage iStorage;
    private PlatformCryptography platformCryptography;

    public SecureStorage(PlatformCryptography platformCryptography) {
        this.platformCryptography = platformCryptography;
    }

    public static SecureStorage getInstance(Context context, String str, String str2) {
        return new SecureStorage(PlatformCryptography.getInstance(context, str, str2));
    }

    private void initializeSecureStorageIfNeeded() throws CryptoException, KeyManagementException {
        if (this.iStorage == null) {
            this.platformCryptography.initializeKeyManagerIfNeeded();
            this.iStorage = this.platformCryptography.getLibKeyManagement().getStorage();
        }
    }

    public byte[] getEntry(String str) throws CryptoException {
        try {
            initializeSecureStorageIfNeeded();
            return this.iStorage.getData(str);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public List<String> listEntryKeys() throws CryptoException {
        try {
            initializeSecureStorageIfNeeded();
            return this.iStorage.getKeys();
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public void putEntry(String str, byte[] bArr) throws CryptoException {
        try {
            initializeSecureStorageIfNeeded();
            this.iStorage.putData(str, bArr);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public void removeEntry(String str) throws CryptoException {
        try {
            initializeSecureStorageIfNeeded();
            this.iStorage.removeData(str);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }
}
