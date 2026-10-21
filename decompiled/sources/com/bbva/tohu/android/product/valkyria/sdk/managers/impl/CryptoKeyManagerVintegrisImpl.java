package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import androidx.annotation.NonNull;
import com.bbva.sl.ar.android.libkeymanagement.crypto.EncryptedData;
import com.bbva.tohu.android.core.constants.CryptoKeyType;
import com.bbva.tohu.android.core.crypto.PaymentCryptography;
import com.bbva.tohu.android.core.crypto.PlatformCryptography;
import com.bbva.tohu.android.core.crypto.SecureStorage;
import com.bbva.tohu.android.core.exceptions.CryptoException;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.StoreTokenException;
import com.bbva.tohu.android.core.request.backend.ClosedDerivationId;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.core.utils.PlatformPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CryptoKeyManagerVintegrisImpl implements CryptoKeyManager {
    public static final String TAG = "CryptoKeyManagerVintegrisImpl";
    private PaymentCryptography paymentCryptography;
    private PlatformCryptography platformCryptography;
    private PlatformPreferencesManager platformPreferencesManager;
    private SecureStorage secureStorage;

    public CryptoKeyManagerVintegrisImpl(PlatformPreferencesManager platformPreferencesManager) {
        this.platformPreferencesManager = platformPreferencesManager;
    }

    private CypheredRequest getCypheredRequest(String str, String str2) throws CryptoInitException {
        try {
            initializePlatformCryptographyIfNeeded();
            return getCypheredRequest(this.platformCryptography.encryptJWE(str.getBytes(), str2));
        } catch (CryptoException e5) {
            throw new CryptoInitException(e5);
        }
    }

    @NonNull
    private String getCypheredResponse(CypheredResponse cypheredResponse, String str) throws CryptoInitException {
        try {
            if (cypheredResponse.getMsg() == null) {
                throw new CryptoInitException();
            }
            initializePlatformCryptographyIfNeeded();
            return new String(this.platformCryptography.decryptJWE(cypheredResponse.getMsg(), str));
        } catch (CryptoException e5) {
            throw new CryptoInitException(e5);
        }
    }

    private void initializePaymentCrytographyStorageIfNeeded() throws CryptoInitException {
        if (this.paymentCryptography == null) {
            String did = this.platformPreferencesManager.getDid();
            if (did == null) {
                throw new CryptoInitException("Derivation id null on initializeProductSecureStorageIfNeeded");
            }
            this.paymentCryptography = PaymentCryptography.getInstance(MobilePayment.getInstance().getContext(), did, MobilePayment.ORIGEN);
        }
    }

    private void initializePlatformCryptographyIfNeeded() throws CryptoInitException {
        if (this.platformCryptography == null) {
            String did = this.platformPreferencesManager.getDid();
            if (did == null) {
                throw new CryptoInitException("Derivation id null on initializeProductSecureStorageIfNeeded");
            }
            this.platformCryptography = PlatformCryptography.getInstance(MobilePayment.getInstance().getContext(), did, MobilePayment.ORIGEN);
        }
    }

    private void initializeProductSecureStorageIfNeeded() throws CryptoInitException {
        if (this.secureStorage == null) {
            String did = this.platformPreferencesManager.getDid();
            if (did == null) {
                throw new CryptoInitException("Derivation id null on initializeProductSecureStorageIfNeeded");
            }
            this.secureStorage = SecureStorage.getInstance(MobilePayment.getInstance().getContext(), did, MobilePayment.ORIGEN);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void checkTransportKeysValidity() throws CryptoInitException {
        LogTohu.d(TAG, "checkTransportKeysValidity", new Object[0]);
        initializePlatformCryptographyIfNeeded();
        try {
            this.platformCryptography.loadKeysNeeded();
        } catch (CryptoException e5) {
            throw new CryptoInitException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void clearInstance() {
        this.paymentCryptography = null;
        this.platformCryptography = null;
        this.secureStorage = null;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public byte[] createMcCryptogram(byte[] bArr, String str) throws InternalErrorException, CryptoInitException {
        try {
            initializePaymentCrytographyStorageIfNeeded();
            return this.paymentCryptography.createMasterCardCryptogram(bArr, str);
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public byte[] createVisaCryptogram(byte[] bArr, String str) throws InternalErrorException, CryptoInitException {
        LogTohu.d(TAG, "createVisaCryptogram, keyId: %s", str);
        try {
            initializePaymentCrytographyStorageIfNeeded();
            return this.paymentCryptography.createVisaCryptogram(bArr, str);
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public byte[] decryptSecContent(byte[] bArr) throws CryptoInitException {
        try {
            initializePlatformCryptographyIfNeeded();
            return this.platformCryptography.decryptRaw(bArr, CryptoKeyType.SEC_CONTENT);
        } catch (CryptoException e5) {
            throw new CryptoInitException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public String decryptTransportWithSecChannel(CypheredResponse cypheredResponse) throws CryptoInitException {
        return getCypheredResponse(cypheredResponse, CryptoKeyType.SEC_CHANNEL);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public String decryptTransportWithSecChannelPayment(CypheredResponse cypheredResponse) throws CryptoInitException {
        return getCypheredResponse(cypheredResponse, CryptoKeyType.SEC_CHANNEL_PAYMENT);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public CypheredRequest encryptTransportWithSecChannel(String str) throws CryptoInitException {
        return getCypheredRequest(str, CryptoKeyType.SEC_CHANNEL);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public CypheredRequest encryptTransportWithSecChannelPayment(String str) throws CryptoInitException {
        return getCypheredRequest(str, CryptoKeyType.SEC_CHANNEL_PAYMENT);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public byte[] encryptWithSecContent(byte[] bArr) throws CryptoInitException {
        try {
            initializePlatformCryptographyIfNeeded();
            return this.platformCryptography.encryptRaw(bArr, CryptoKeyType.SEC_CONTENT);
        } catch (CryptoException e5) {
            throw new CryptoInitException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void forceCreateKeys() throws CryptoInitException {
        initializePlatformCryptographyIfNeeded();
        this.platformCryptography.setForceLoadKeys(true);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public byte[] getEntryFromSecureStorage(String str) throws InternalErrorException, CryptoInitException {
        try {
            initializeProductSecureStorageIfNeeded();
            return this.secureStorage.getEntry(str);
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public List<String> getPaymentStorageEntryKeys() throws InternalErrorException, CryptoInitException {
        try {
            initializePaymentCrytographyStorageIfNeeded();
            return this.paymentCryptography.listPaymentStorageKeys();
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public List<String> getSecureStorageEntryKeys() throws InternalErrorException, CryptoInitException {
        try {
            initializeProductSecureStorageIfNeeded();
            return this.secureStorage.listEntryKeys();
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void putEntryInPaymentStorage(Map<String, byte[]> map) throws InternalErrorException, CryptoInitException {
        try {
            initializePaymentCrytographyStorageIfNeeded();
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                this.paymentCryptography.putEntry(entry.getKey(), entry.getValue());
            }
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void putEntryInSecureStorage(Map<String, byte[]> map) throws StoreTokenException, CryptoInitException {
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            putEntryInSecureStorage(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void removeEntryInPaymentStorage(List<String> list) throws InternalErrorException, CryptoInitException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            removeEntryInPaymentStorage(list.get(i10));
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void removeEntryInSecureStorage(String str) throws InternalErrorException, CryptoInitException {
        try {
            initializeProductSecureStorageIfNeeded();
            this.secureStorage.removeEntry(str);
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void renewKeysIfNeeded() throws CryptoInitException {
        LogTohu.d(TAG, "renewKeysIfNeeded", new Object[0]);
        initializePlatformCryptographyIfNeeded();
        try {
            this.platformCryptography.renewKeysNeeded();
        } catch (CryptoException e5) {
            throw new CryptoInitException(e5);
        }
    }

    private void putEntryInSecureStorage(String str, byte[] bArr) throws StoreTokenException, CryptoInitException {
        try {
            initializeProductSecureStorageIfNeeded();
            this.secureStorage.putEntry(str, bArr);
        } catch (CryptoException unused) {
            throw new StoreTokenException();
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager
    public void removeEntryInPaymentStorage(String str) throws InternalErrorException, CryptoInitException {
        try {
            initializePaymentCrytographyStorageIfNeeded();
            this.paymentCryptography.removeEntry(str);
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        }
    }

    private CypheredRequest getCypheredRequest(EncryptedData encryptedData) {
        CypheredRequest cypheredRequest = new CypheredRequest();
        ClosedDerivationId closedDerivationId = new ClosedDerivationId();
        closedDerivationId.setDerivationId(encryptedData.getDerivationId().get(PlatformCryptography.DERIVATION_ID_KEY));
        cypheredRequest.setDerivationId(closedDerivationId);
        cypheredRequest.setDerivationComplement(encryptedData.getDerivationComplement());
        cypheredRequest.setMsg(encryptedData.getMsg());
        return cypheredRequest;
    }
}
