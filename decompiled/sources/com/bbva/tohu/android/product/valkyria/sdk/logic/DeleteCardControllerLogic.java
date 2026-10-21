package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.os.ResultReceiver;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.PaymentNotEnabledException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;

/* JADX INFO: loaded from: classes6.dex */
public class DeleteCardControllerLogic {
    private static final String TAG = "DeleteCardControllerLogic";
    private BroadcastManager broadCastCardStatusUpdated;
    private DeleteCardLogic deleteCardLogic;

    public DeleteCardControllerLogic(DeleteCardLogic deleteCardLogic, BroadcastManager broadcastManager) {
        this.deleteCardLogic = deleteCardLogic;
        this.broadCastCardStatusUpdated = broadcastManager;
    }

    public void deleteCard(String str, String str2, ResultReceiver resultReceiver) {
        try {
            this.deleteCardLogic.doDeleteCard(str, str2);
        } catch (LoginNeededException e5) {
            LogTohu.e(TAG, "Error DeleteCardControllerLogic LoginNeededException: ", e5);
            ManagerFactory.getCallbackManager(resultReceiver).sendTohuException(e5, null);
        } catch (PaymentNotEnabledException unused) {
            this.broadCastCardStatusUpdated.sendBroadcast("TOHU_STATUS_UPDATED", new UpdateCardResponse(str, PaymentStatus.NOT_ENABLED));
        } catch (TohuSdkException e7) {
            LogTohu.e(TAG, "DeleteCardControllerLogic TohuSdkException: ", e7);
            ManagerFactory.getCallbackManager(resultReceiver).sendTohuException(e7, null);
        }
    }
}
