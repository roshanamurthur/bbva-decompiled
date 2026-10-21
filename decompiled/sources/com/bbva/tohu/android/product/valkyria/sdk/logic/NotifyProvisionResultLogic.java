package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.content.Context;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.request.ProvisionResult;
import com.bbva.tohu.android.product.valkyria.sdk.response.NotifyProvisionResultResponse;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;

/* JADX INFO: loaded from: classes6.dex */
public class NotifyProvisionResultLogic {
    private static final String TAG = "NotifyProvisionResultLogic";
    private BackendService backendService;
    private DatabaseManager databaseManager;
    private ReplenishControllerLogic replenishControllerLogic;

    public NotifyProvisionResultLogic(BackendService backendService, DatabaseManager databaseManager, ReplenishControllerLogic replenishControllerLogic) {
        this.backendService = backendService;
        this.databaseManager = databaseManager;
        this.replenishControllerLogic = replenishControllerLogic;
    }

    private boolean isActiveToken(Token token) {
        return "ACTIVE".equals(token.getState());
    }

    private boolean isInactiveToken(Token token) {
        return "INACTIVE".equals(token.getState());
    }

    private void updateStateTokenToActiveIfStateIsInactive(Token token) throws NotFoundEntityException {
        if (isInactiveToken(token)) {
            LogTohu.i(TAG, "Token: %s set to state Active", token.getCardUniqueReference());
            token.setState("ACTIVE");
            this.databaseManager.updateToken(token);
        }
    }

    public ProvisionResult buildSuccessProvisionResult(String str) {
        ProvisionResult provisionResult = new ProvisionResult();
        provisionResult.setCardUniqueReference(str);
        provisionResult.setResult(NotifyProvisionResult.SUCCESS_RESULT);
        return provisionResult;
    }

    public void doNotifyProvisionResult(ProvisionResult provisionResult, Token token, Context context) throws TohuBackendException, NetworkNotPresentException, NotFoundEntityException, CryptoInitException {
        if (token == null) {
            LogTohu.i(TAG, "Token is null at NotifyProvisionResult Service", new Object[0]);
            return;
        }
        NotifyProvisionResultResponse notifyProvisionResultResponseNotifyProvisionResult = this.backendService.notifyProvisionResult(provisionResult, token);
        if (!Result.OK_RESPONSE_CODE.equals(notifyProvisionResultResponseNotifyProvisionResult.getResult().getCode())) {
            LogTohu.i(TAG, String.format("NotifyProvisionResultResponse is not right: %n%s", notifyProvisionResultResponseNotifyProvisionResult), new Object[0]);
        } else if (isActiveToken(token) || isInactiveToken(token)) {
            updateStateTokenToActiveIfStateIsInactive(token);
            this.replenishControllerLogic.replenish(token.getCardUniqueReference(), true, context);
        }
    }
}
