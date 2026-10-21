package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.PaymentApplicationContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.TransactionContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.Util;

/* JADX INFO: loaded from: classes6.dex */
public class TestApduCommands implements ITestApduCommands {
    static final byte[] ISO7816_SW_INS_NOT_SUPPORTED = {109, 0};
    private static final String TAG = "TestApduCommands";
    private static String hexUpdateTestPayload;

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.ITestApduCommands
    public byte[] clearTestData(TransactionContext transactionContext) {
        PaymentApplicationContext.reset();
        byte[] bArr = new byte[2];
        byte[] bArr2 = ISO7816_SW_INS_NOT_SUPPORTED;
        Util.arrayCopy(bArr2, (short) 0, bArr, (short) 0, (short) bArr2.length);
        return bArr;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.ITestApduCommands
    public byte[] processUpdateTestParameters(byte[] bArr) {
        byte[] bArr2 = new byte[2];
        byte[] bArr3 = ISO7816_SW_INS_NOT_SUPPORTED;
        Util.arrayCopy(bArr3, (short) 0, bArr2, (short) 0, (short) bArr3.length);
        return bArr2;
    }
}
