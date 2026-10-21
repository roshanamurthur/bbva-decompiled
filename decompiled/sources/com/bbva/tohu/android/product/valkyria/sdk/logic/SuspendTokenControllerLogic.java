package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.os.ResultReceiver;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.PaymentNotEnabledException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;

/* JADX INFO: loaded from: classes6.dex */
public class SuspendTokenControllerLogic {
    private static final String TAG = "SuspendTokenControllerLogic";
    private BroadcastManager broadCastCardStatusUpdated;
    private BroadcastManager broadCastSystemNotification;
    private SuspendTokenLogic suspendTokenLogic;

    public SuspendTokenControllerLogic(SuspendTokenLogic suspendTokenLogic, BroadcastManager broadcastManager, BroadcastManager broadcastManager2) {
        this.suspendTokenLogic = suspendTokenLogic;
        this.broadCastSystemNotification = broadcastManager;
        this.broadCastCardStatusUpdated = broadcastManager2;
    }

    public void suspendToken(String str, String str2, ResultReceiver resultReceiver) {
        try {
            this.suspendTokenLogic.doSuspend(str, str2);
        } catch (PaymentNotEnabledException e5) {
            LogTohu.e(TAG, "Error SuspendTokenControllerLogic, PaymentNotEnabledException: ", e5);
            this.broadCastCardStatusUpdated.sendBroadcast("TOHU_STATUS_UPDATED", new UpdateCardResponse(str, PaymentStatus.NOT_ENABLED));
        } catch (TohuSdkException e7) {
            LogTohu.e(TAG, "SuspendTokenControllerLogic TohuSdkException: ", e7);
            ManagerFactory.getCallbackManager(resultReceiver).sendTohuException(e7, null);
        }
    }
}
