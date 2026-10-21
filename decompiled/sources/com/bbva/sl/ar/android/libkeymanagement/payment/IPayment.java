package com.bbva.sl.ar.android.libkeymanagement.payment;

import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IPayment {
    byte[] createCryptogram(byte[] bArr, String str, PaddingMethod paddingMethod, UnpaddingMethod unpaddingMethod, PaymentAlgorithm paymentAlgorithm) throws KeyManagementException;

    byte[] createMCCryptogram(byte[] bArr, String str) throws KeyManagementException;

    byte[] createVCryptogram(byte[] bArr, String str) throws KeyManagementException;

    List<String> getPaymentEntries() throws KeyManagementException;

    void putPaymentEntry(String str, byte[] bArr) throws KeyManagementException;

    void removePaymentEntry(String str) throws KeyManagementException;
}
