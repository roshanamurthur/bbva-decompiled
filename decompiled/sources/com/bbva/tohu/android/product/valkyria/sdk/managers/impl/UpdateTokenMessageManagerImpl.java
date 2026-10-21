package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.beans.TokenState;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.logic.DeleteCardLogic;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishControllerLogic;
import com.bbva.tohu.android.product.valkyria.sdk.logic.SuspendTokenLogic;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;
import com.bbva.tohu.android.product.valkyria.sdk.utils.UpdateTokenStateMessage;
import com.google.gson.Gson;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class UpdateTokenMessageManagerImpl implements MessageManager {
    private static final String MESSAGE_TOKEN_UPDATE_STATUS_TYPE_WITH_DATA_PAYLOAD = "Message token update status type with data payload: %s";
    public static final String TAG = "MobilePayment";
    private final DatabaseManager databaseManager;
    private final DeleteCardLogic deleteCardLogic;
    private final ReplenishControllerLogic replenishControllerLogic;
    private final SerializerService serializerService;
    private final SuspendTokenLogic suspendTokenLogic;

    public UpdateTokenMessageManagerImpl(DatabaseManager databaseManager, SerializerService serializerService, DeleteCardLogic deleteCardLogic, SuspendTokenLogic suspendTokenLogic, ReplenishControllerLogic replenishControllerLogic) {
        this.databaseManager = databaseManager;
        this.serializerService = serializerService;
        this.deleteCardLogic = deleteCardLogic;
        this.suspendTokenLogic = suspendTokenLogic;
        this.replenishControllerLogic = replenishControllerLogic;
    }

    private void activeToken(Token token, String str, Context context) throws TohuSdkException {
        if (token.getState().equals("ACTIVE")) {
            return;
        }
        token.setState(str);
        this.databaseManager.updateToken(token);
        this.replenishControllerLogic.replenish(token.getCardUniqueReference(), true, context);
    }

    private void updateTokenByState(TokenState tokenState, Token token, Context context) throws TohuSdkException {
        String status = tokenState.getStatus();
        String cardUniqueReference = tokenState.getCardUniqueReference();
        if (status == null) {
            LogTohu.d(TAG, "Arrive token [id='%s'] with no state", cardUniqueReference);
        }
        switch (status) {
            case "DELETED":
                this.deleteCardLogic.deleteCardLocal(token.getCardUniqueReference());
                break;
            case "SUSPENDED":
                this.suspendTokenLogic.doSuspendLocal(token);
                break;
            case "ACTIVE":
                activeToken(token, status, context);
                break;
            default:
                LogTohu.d(TAG, "Arrive token [id='%s'] with inconsistent state [%s]", cardUniqueReference, status);
                break;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager
    public void processMessage(String str, Context context) throws TohuSdkException {
        UpdateTokenStateMessage updateTokenStateMessage = (UpdateTokenStateMessage) new Gson().fromJson(str, UpdateTokenStateMessage.class);
        if (updateTokenStateMessage == null || updateTokenStateMessage.getTokens() == null || updateTokenStateMessage.getTokens().isEmpty()) {
            return;
        }
        TokenState[] tokenStateArrDeserializeNotifyTokenUpdate = this.serializerService.deserializeNotifyTokenUpdate(updateTokenStateMessage.getTokens().toString());
        LogTohu.d(TAG, MESSAGE_TOKEN_UPDATE_STATUS_TYPE_WITH_DATA_PAYLOAD, Arrays.toString(tokenStateArrDeserializeNotifyTokenUpdate));
        for (TokenState tokenState : tokenStateArrDeserializeNotifyTokenUpdate) {
            if (tokenState.getCardUniqueReference() != null && tokenState.getStatus() != null) {
                LogTohu.d(TAG, "Received from NotifyTokenUpdated Hub a token with state %s and cardUniqueReference %s", tokenState.getStatus(), tokenState.getCardUniqueReference());
                try {
                    updateTokenByState(tokenState, this.databaseManager.getTokenByCardUniqueReference(tokenState.getCardUniqueReference()), context);
                } catch (NotFoundEntityException e5) {
                    LogTohu.e(TAG, "Token not found in notify token update firebase message: %s", tokenStateArrDeserializeNotifyTokenUpdate[0].getCardUniqueReference(), e5);
                }
            }
        }
    }
}
