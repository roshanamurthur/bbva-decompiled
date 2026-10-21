package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.TransactionContext;

/* JADX INFO: loaded from: classes6.dex */
public interface ITestApduCommands {
    byte[] clearTestData(TransactionContext transactionContext);

    byte[] processUpdateTestParameters(byte[] bArr);
}
