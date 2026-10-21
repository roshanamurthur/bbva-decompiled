package com.bbva.sl.ar.android.libkeymanagement.repository;

import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IStorage {
    byte[] getData(String str) throws KeyManagementException;

    List<String> getKeys() throws KeyManagementException;

    String getSharedStorageKey() throws KeyManagementException;

    void putData(String str, byte[] bArr) throws KeyManagementException;

    void removeData(String str) throws KeyManagementException;
}
