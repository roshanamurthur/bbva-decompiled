package com.bbva.tohu.android.product.valkyria.sdk.logic;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Armadillo401Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu403Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu404Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.PaymentNotEnabledException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardNotFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.CredentialService;

/* JADX INFO: loaded from: classes6.dex */
public class SuspendTokenLogic {
    private static final String TAG = "SuspendTokenLogic";
    private BackendService backendService;
    private BroadcastManager broadcastManager;
    private CredentialService credentialService;
    private DatabaseManager databaseManager;
    private UserSharedPreferencesManager userPreferencesManager;

    public SuspendTokenLogic(DatabaseManager databaseManager, BackendService backendService, BroadcastManager broadcastManager, UserSharedPreferencesManager userSharedPreferencesManager, CredentialService credentialService) {
        this.databaseManager = databaseManager;
        this.backendService = backendService;
        this.broadcastManager = broadcastManager;
        this.userPreferencesManager = userSharedPreferencesManager;
        this.credentialService = credentialService;
    }

    private void callHubSuspendToken(String str, String str2) throws LoginNeededException, TohuBackendException, NetworkNotPresentException, InternalErrorException, CardNotFoundException, CryptoInitException {
        try {
            this.backendService.suspendToken(str, str2);
        } catch (Armadillo401Exception unused) {
            throw new LoginNeededException();
        } catch (Tohu403Exception unused2) {
            throw new LoginNeededException();
        } catch (Tohu404Exception e5) {
            throw new CardNotFoundException(e5, str);
        }
    }

    private Token getTokenFromDataBase(String str) throws PaymentNotEnabledException {
        try {
            return this.databaseManager.getTokenByCardUniqueReference(str);
        } catch (NotFoundEntityException e5) {
            throw new PaymentNotEnabledException(e5);
        }
    }

    private void sendOkResponse(String str) {
        this.broadcastManager.sendBroadcast("TOHU_STATUS_UPDATED", new UpdateCardResponse(str, "SUSPENDED"));
    }

    public void doSuspend(String str, String str2) throws LoginNeededException, TohuBackendException, NetworkNotPresentException, NotFoundEntityException, InternalErrorException, CardNotFoundException, PaymentNotEnabledException, CryptoInitException {
        Token tokenFromDataBase = getTokenFromDataBase(str);
        if ("ACTIVE".equals(tokenFromDataBase.getState())) {
            callHubSuspendToken(str, this.credentialService.getJwt(str2));
        }
        doSuspendLocal(tokenFromDataBase);
    }

    public void doSuspendLocal(Token token) throws NotFoundEntityException, PaymentNotEnabledException {
        if ("SUSPENDED".equals(token.getState())) {
            sendOkResponse(token.getCardUniqueReference());
            return;
        }
        if (!"ACTIVE".equals(token.getState())) {
            throw new PaymentNotEnabledException();
        }
        token.setState("SUSPENDED");
        this.databaseManager.updateToken(token);
        sendOkResponse(token.getCardUniqueReference());
        if (this.userPreferencesManager.isFavouriteCard(token.getCardUniqueReference())) {
            this.userPreferencesManager.setFavouriteCard(null);
        }
    }
}
