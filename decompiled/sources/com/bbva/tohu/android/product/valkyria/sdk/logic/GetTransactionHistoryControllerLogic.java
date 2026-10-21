package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.os.ResultReceiver;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardNotFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;

/* JADX INFO: loaded from: classes6.dex */
public class GetTransactionHistoryControllerLogic {
    private static final String TAG = "GetTransactionHistoryControllerLogic";
    private GetTransactionHistoryLogic getTransactionHistoryLogic;

    public GetTransactionHistoryControllerLogic(GetTransactionHistoryLogic getTransactionHistoryLogic) {
        this.getTransactionHistoryLogic = getTransactionHistoryLogic;
    }

    public void getTransactionHistory(String str, String str2, ResultReceiver resultReceiver) {
        CallbackManager callbackManager = ManagerFactory.getCallbackManager(resultReceiver);
        try {
            callbackManager.sendWithResult(this.getTransactionHistoryLogic.getTransactionHistory(str, str2));
        } catch (InternalErrorException | LoginNeededException | NetworkNotPresentException | CardNotFoundException e5) {
            callbackManager.sendTohuException(e5, null);
        }
    }
}
