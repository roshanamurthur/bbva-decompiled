package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.HubDigitizeStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse;
import com.bbva.tohu.android.product.valkyria.sdk.logic.TokenLogic;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.OperationLockManager;
import com.bbva.tohu.android.product.valkyria.sdk.utils.DigitizeMessage;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes6.dex */
public class DigitizeMessageManagerImpl implements MessageManager {
    private static final String CARD_UNELIGIBLE_ERROR = "Card %s not elegible. Error code: %s";
    private static final String MESSAGE_DIGITIZE_CARD_UNIQUE_REFERENCE_AND_STATUS_CODE = "Message digitize type with cardUniqueReference: %s and statusCode: %s";
    private static final String MESSAGE_DIGITIZE_WITH_CARD_UNIQUE_REFERENCE_HAS_ERROR = "Message digitize withCardUniqueReference %s has error %s";
    public static final String TAG = "DigitizeMessageManagerImpl";
    private final BroadcastManager broadcastManager;
    private final OperationLockManager operationLockManager;
    private final TokenLogic tokenLogic;

    public DigitizeMessageManagerImpl(TokenLogic tokenLogic, BroadcastManager broadcastManager, OperationLockManager operationLockManager) {
        this.tokenLogic = tokenLogic;
        this.broadcastManager = broadcastManager;
        this.operationLockManager = operationLockManager;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager
    public void processMessage(String str, Context context) {
        DigitizeMessage digitizeMessage = (DigitizeMessage) new Gson().fromJson(str, DigitizeMessage.class);
        String str2 = TAG;
        LogTohu.d(str2, "ProcessMessage %s", digitizeMessage);
        if (digitizeMessage == null || digitizeMessage.getCardUniqueReference() == null || digitizeMessage.getStatusCode() == null) {
            LogTohu.d(str2, "processMessage with cardUniqueReference null and statusCode null", new Object[0]);
            return;
        }
        String cardUniqueReference = digitizeMessage.getCardUniqueReference();
        String statusCode = digitizeMessage.getStatusCode();
        LogTohu.d(str2, MESSAGE_DIGITIZE_CARD_UNIQUE_REFERENCE_AND_STATUS_CODE, cardUniqueReference, statusCode);
        if (!HubDigitizeStatus.OK_CODE.equals(statusCode)) {
            if ("NOT_ELIGIBLE".equals(statusCode)) {
                LogTohu.e(str2, CARD_UNELIGIBLE_ERROR, cardUniqueReference, statusCode);
                sendUneligibleBroadcast(cardUniqueReference);
                return;
            } else {
                LogTohu.e(str2, MESSAGE_DIGITIZE_WITH_CARD_UNIQUE_REFERENCE_HAS_ERROR, cardUniqueReference, statusCode);
                sendNotEnabledBroadCast(cardUniqueReference);
                return;
            }
        }
        try {
            if (this.operationLockManager.lock(cardUniqueReference)) {
                try {
                    this.tokenLogic.getToken(cardUniqueReference, context);
                } catch (CryptoInitException e5) {
                    LogTohu.d(TAG, "CryptoInitException", e5);
                    this.broadcastManager.sendBroadcast(e5);
                } catch (TohuSdkException e7) {
                    LogTohu.d(TAG, "Card not enabled.", e7);
                    sendNotEnabledBroadCast(cardUniqueReference);
                }
            }
        } finally {
            this.operationLockManager.unlock(cardUniqueReference);
        }
    }

    public void sendNotEnabledBroadCast(String str) {
        UpdateCardResponse updateCardResponse = new UpdateCardResponse();
        updateCardResponse.setState(PaymentStatus.NOT_ENABLED);
        updateCardResponse.setCardUniqueReference(str);
        this.broadcastManager.sendBroadcast("TOHU_STATUS_UPDATED", updateCardResponse);
    }

    public void sendUneligibleBroadcast(String str) {
        UpdateCardResponse updateCardResponse = new UpdateCardResponse();
        updateCardResponse.setState("NOT_ELIGIBLE");
        updateCardResponse.setCardUniqueReference(str);
        this.broadcastManager.sendBroadcast("TOHU_STATUS_UPDATED", updateCardResponse);
    }
}
