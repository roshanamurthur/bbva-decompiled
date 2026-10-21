package com.bbva.tohu.android.core.crypto;

import android.content.Context;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.payment.IPayment;
import com.bbva.tohu.android.core.exceptions.CryptoException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PaymentCryptography {
    private IPayment iPayment;
    private PlatformCryptography platformCryptography;

    public PaymentCryptography(PlatformCryptography platformCryptography) {
        this.platformCryptography = platformCryptography;
    }

    public static PaymentCryptography getInstance(Context context, String str, String str2) {
        return new PaymentCryptography(PlatformCryptography.getInstance(context, str, str2));
    }

    private void initializePaymentStorageIfNeeded() throws CryptoException, KeyManagementException {
        if (this.iPayment == null) {
            this.platformCryptography.initializeKeyManagerIfNeeded();
            this.iPayment = this.platformCryptography.getLibKeyManagement().getPayment();
        }
    }

    public void clearAllEntries() throws CryptoException {
        IPayment iPayment = this.iPayment;
        if (iPayment != null) {
            try {
                Iterator<String> it = iPayment.getPaymentEntries().iterator();
                while (it.hasNext()) {
                    removeEntry(it.next());
                }
            } catch (KeyManagementException e5) {
                throw new CryptoException(e5);
            }
        }
    }

    public byte[] createMasterCardCryptogram(byte[] bArr, String str) throws CryptoException {
        try {
            initializePaymentStorageIfNeeded();
            return this.iPayment.createMCCryptogram(bArr, str);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public byte[] createVisaCryptogram(byte[] bArr, String str) throws InternalErrorException, CryptoException {
        try {
            initializePaymentStorageIfNeeded();
            return this.iPayment.createVCryptogram(bArr, str);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public List<String> listPaymentStorageKeys() throws CryptoException {
        try {
            initializePaymentStorageIfNeeded();
            return this.iPayment.getPaymentEntries();
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public void putEntry(String str, byte[] bArr) throws CryptoException {
        try {
            initializePaymentStorageIfNeeded();
            this.iPayment.putPaymentEntry(str, bArr);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public void removeEntry(String str) throws CryptoException {
        try {
            initializePaymentStorageIfNeeded();
            this.iPayment.removePaymentEntry(str);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }
}
