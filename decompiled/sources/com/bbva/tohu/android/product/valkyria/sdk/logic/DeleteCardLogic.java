package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.database.SQLException;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Tohu403Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu503Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.PaymentNotEnabledException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TemporaryUnavailableException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.CredentialService;

/* JADX INFO: loaded from: classes6.dex */
public class DeleteCardLogic {
    private static final String TAG = "DeleteDeviceLogic";
    private BackendService backendService;
    private BroadcastManager broadcastStatusUpdated;
    private CredentialService credentialService;
    private CryptoKeyManager cryptoKeyManager;
    private DatabaseManager databaseManager;
    private UserSharedPreferencesManager userSharedPreferencesManager;

    public DeleteCardLogic(BackendService backendService, DatabaseManager databaseManager, BroadcastManager broadcastManager, CryptoKeyManager cryptoKeyManager, UserSharedPreferencesManager userSharedPreferencesManager, CredentialService credentialService) {
        this.backendService = backendService;
        this.databaseManager = databaseManager;
        this.broadcastStatusUpdated = broadcastManager;
        this.cryptoKeyManager = cryptoKeyManager;
        this.userSharedPreferencesManager = userSharedPreferencesManager;
        this.credentialService = credentialService;
    }

    private void deleteAllBullets(String str) throws InternalErrorException, CryptoInitException {
        try {
            this.cryptoKeyManager.removeEntryInPaymentStorage(this.databaseManager.deleteTransactionCredentialsAndBulletsByCardUniqRef(str));
            LogTohu.d(TAG, "Deleted all token's bullets with cardUniqueReference %s", str);
        } catch (SQLException e5) {
            e5.getMessage();
            throw new InternalErrorException(e5);
        }
    }

    private void sendBroadcastStatusUpdated(String str, String str2) {
        this.broadcastStatusUpdated.sendBroadcast("TOHU_STATUS_UPDATED", new UpdateCardResponse(str, str2));
    }

    public void deleteCardLocal(String str) throws InternalErrorException, CryptoInitException {
        deleteAllBullets(str);
        this.databaseManager.deleteTokenByCardUniqueReference(str);
        this.cryptoKeyManager.removeEntryInSecureStorage(str);
        if (this.userSharedPreferencesManager.isFavouriteCard(str)) {
            this.userSharedPreferencesManager.setFavouriteCard(null);
        }
        sendBroadcastStatusUpdated(str, PaymentStatus.NOT_ENABLED);
    }

    public void doDeleteCard(String str, String str2) throws LoginNeededException, NetworkNotPresentException, InternalErrorException, PaymentNotEnabledException, CryptoInitException, TemporaryUnavailableException {
        try {
            this.databaseManager.getTokenByCardUniqueReference(str);
            if (Result.OK_RESPONSE_CODE.equals(this.backendService.deleteToken(str, this.credentialService.getJwt(str2)).getResult().getCode())) {
                deleteCardLocal(str);
            }
        } catch (Tohu403Exception unused) {
            throw new LoginNeededException();
        } catch (Tohu503Exception e5) {
            throw new TemporaryUnavailableException(e5);
        } catch (TohuBackendException e7) {
            throw new InternalErrorException(e7);
        } catch (NotFoundEntityException e10) {
            e10.getMessage();
            throw new PaymentNotEnabledException();
        }
    }
}
