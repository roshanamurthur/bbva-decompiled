package com.bbva.tohu.android.product.valkyria.sdk.managers;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.StoreTokenException;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface CryptoKeyManager {
    void checkTransportKeysValidity() throws CryptoInitException;

    void clearInstance();

    byte[] createMcCryptogram(byte[] bArr, String str) throws InternalErrorException, CryptoInitException;

    byte[] createVisaCryptogram(byte[] bArr, String str) throws InternalErrorException, CryptoInitException;

    byte[] decryptSecContent(byte[] bArr) throws CryptoInitException;

    String decryptTransportWithSecChannel(CypheredResponse cypheredResponse) throws CryptoInitException;

    String decryptTransportWithSecChannelPayment(CypheredResponse cypheredResponse) throws CryptoInitException;

    CypheredRequest encryptTransportWithSecChannel(String str) throws CryptoInitException;

    CypheredRequest encryptTransportWithSecChannelPayment(String str) throws CryptoInitException;

    byte[] encryptWithSecContent(byte[] bArr) throws CryptoInitException;

    void forceCreateKeys() throws CryptoInitException;

    byte[] getEntryFromSecureStorage(String str) throws InternalErrorException, CryptoInitException;

    List<String> getPaymentStorageEntryKeys() throws InternalErrorException, CryptoInitException;

    List<String> getSecureStorageEntryKeys() throws InternalErrorException, CryptoInitException;

    void putEntryInPaymentStorage(Map<String, byte[]> map) throws InternalErrorException, CryptoInitException;

    void putEntryInSecureStorage(Map<String, byte[]> map) throws StoreTokenException, CryptoInitException;

    void removeEntryInPaymentStorage(String str) throws InternalErrorException, CryptoInitException;

    void removeEntryInPaymentStorage(List<String> list) throws InternalErrorException, CryptoInitException;

    void removeEntryInSecureStorage(String str) throws InternalErrorException, CryptoInitException;

    void renewKeysIfNeeded() throws CryptoInitException;
}
