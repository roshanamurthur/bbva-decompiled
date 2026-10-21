package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.content.Context;
import android.os.ResultReceiver;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class EnablePaymentControllerLogic {
    private static final String TAG = "EnablePaymentControllerLogic";
    private EnablePaymentLogic enablePaymentLogic;

    public EnablePaymentControllerLogic(EnablePaymentLogic enablePaymentLogic) {
        this.enablePaymentLogic = enablePaymentLogic;
    }

    public void enablePayment(List<Card> list, String str, ResultReceiver resultReceiver, Context context) {
        CallbackManager callbackManager = ManagerFactory.getCallbackManager(resultReceiver);
        try {
            this.enablePaymentLogic.doEnablePayment(list, str, resultReceiver, context);
        } catch (CryptoInitException e5) {
            LogTohu.e(TAG, "Error EnablePaymentControllerLogic enablePayment: ", e5);
            callbackManager.sendTohuException(e5, null);
        }
    }
}
