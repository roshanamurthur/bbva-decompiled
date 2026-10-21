package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.ConfirmReplenishRequest;
import com.bbva.tohu.android.product.valkyria.sdk.response.ConfirmReplenishResponse;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ConfirmReplenishService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ConfirmReplenishServiceDefaultImpl implements ConfirmReplenishService {
    private static final String TAG = "ConfirmReplenishServiceDefaultImpl";
    private BackendService backendService;
    private BroadcastManager broadcastManager;
    private DatabaseManager databaseManager;
    private ProviderService providerService;

    public ConfirmReplenishServiceDefaultImpl(ProviderService providerService, DatabaseManager databaseManager, BroadcastManager broadcastManager, BackendService backendService) {
        this.providerService = providerService;
        this.databaseManager = databaseManager;
        this.broadcastManager = broadcastManager;
        this.backendService = backendService;
    }

    private void actualizeStateAllBulletsOfToken(Token token, String str) throws NotFoundEntityException {
        List<Bullet> bulletsByCardUniqueReference = this.databaseManager.getBulletsByCardUniqueReference(token.getCardUniqueReference());
        for (int i10 = 0; i10 < bulletsByCardUniqueReference.size(); i10++) {
            bulletsByCardUniqueReference.get(i10).setStatus(str);
        }
        LogTohu.d(TAG, "Updated %d bullets of %d to state %s", Integer.valueOf(this.databaseManager.updateBullets(bulletsByCardUniqueReference)), Integer.valueOf(bulletsByCardUniqueReference.size()), str);
    }

    private boolean confirmBullets(Token token, boolean z10) throws Exception {
        if (existsInactiveBulletsToConfirm(token)) {
            ConfirmReplenishResponse confirmReplenishResponse = new ConfirmReplenishResponse();
            try {
                confirmReplenishResponse = this.backendService.confirmReplenish(new ConfirmReplenishRequest(token.getCardUniqueReference()));
            } catch (Exception e5) {
                if (this.providerService.needConfirmReplenishInBackend(token.getProvider())) {
                    throw e5;
                }
                confirmReplenishResponse.setResult(new Result(Result.OK_RESPONSE_CODE, ConfirmReplenishService.AUTO_RESPONSE_INFO));
            }
            if (!Result.OK_RESPONSE_CODE.equals(confirmReplenishResponse.getResult().getCode())) {
                return false;
            }
            actualizeStateAllBulletsOfToken(token, "ACTIVE");
            if (z10) {
                sendEnabledBroadCast(token);
            }
        }
        return true;
    }

    private boolean existsInactiveBulletsToConfirm(Token token) throws NotFoundEntityException {
        try {
            this.databaseManager.getInactiveBulletByCardUniqueReference(token.getCardUniqueReference());
            return true;
        } catch (NotFoundEntityException e5) {
            LogTohu.d(TAG, "Inactive bullet not found.", e5);
            return false;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ConfirmReplenishService
    public boolean confirmReplenish(Token token, boolean z10) throws TohuBackendException, NotFoundEntityException, NetworkNotPresentException, CryptoInitException {
        if ("ACTIVE".equals(token.getState())) {
            return confirmBullets(token, z10);
        }
        LogTohu.i(TAG, "Token is not ACTIVE for confirm Replenish", new Object[0]);
        return true;
    }

    public void sendEnabledBroadCast(Token token) {
        UpdateCardResponse updateCardResponse = new UpdateCardResponse();
        updateCardResponse.setState(PaymentStatus.ENABLED);
        updateCardResponse.setCardUniqueReference(token.getCardUniqueReference());
        this.broadcastManager.sendBroadcast("TOHU_STATUS_UPDATED", updateCardResponse);
    }
}
