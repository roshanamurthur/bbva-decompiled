package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.content.Context;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.StoreTokenException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.Response;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.request.ProvisionResult;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.GetToken;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TokenLogic {
    private static final String TAG = "TokenLogic";
    private final BackendService backendService;
    private final CryptoKeyManager cryptoKeyManager;
    private final DatabaseManager databaseManager;
    private final NotifyProvisionResultLogic notifyProvisionResultLogic;
    private final ProviderService providerServiceDefault;
    private final ReplenishControllerLogic replenishControllerLogic;

    public TokenLogic(BackendService backendService, CryptoKeyManager cryptoKeyManager, DatabaseManager databaseManager, ProviderService providerService, ReplenishControllerLogic replenishControllerLogic, NotifyProvisionResultLogic notifyProvisionResultLogic) {
        this.backendService = backendService;
        this.cryptoKeyManager = cryptoKeyManager;
        this.databaseManager = databaseManager;
        this.providerServiceDefault = providerService;
        this.replenishControllerLogic = replenishControllerLogic;
        this.notifyProvisionResultLogic = notifyProvisionResultLogic;
    }

    private void callGetTokenHubAndSecureSave(String str, Context context) throws TohuBackendException, NetworkNotPresentException, NotFoundEntityException, InternalErrorException, CryptoInitException {
        String str2 = TAG;
        LogTohu.d(str2, "Call Service GetToken with cardUniqueReference %s", str);
        Response<GetToken> token = this.backendService.getToken(str);
        LogTohu.d(str2, "GetToken service response: %s %s", token.getResult().getCode(), token.getResult().getInfo());
        if (Result.OK_RESPONSE_CODE.equals(token.getResult().getCode())) {
            GetToken data = token.getData();
            Map<String, byte[]> mapCreateMapToSaveCardProfileInSecureStorage = createMapToSaveCardProfileInSecureStorage(str, this.providerServiceDefault.getTokenByProvider(data).getBytes(StandardCharsets.UTF_8));
            Token tokenCreateTokenForSave = createTokenForSave(str, data);
            putEntryInSecureStorage(mapCreateMapToSaveCardProfileInSecureStorage);
            this.databaseManager.saveToken(tokenCreateTokenForSave);
            notifyProvisionResult(tokenCreateTokenForSave, this.notifyProvisionResultLogic.buildSuccessProvisionResult(str), context);
        }
    }

    private Map<String, byte[]> createMapToSaveCardProfileInSecureStorage(String str, byte[] bArr) {
        HashMap map = new HashMap();
        map.put(str, bArr);
        return map;
    }

    private Token createTokenForSave(String str, GetToken getToken) {
        Token token = new Token();
        token.setCardUniqueReference(str);
        token.setState(getToken.getStatus());
        token.setProvider(getToken.getProvider());
        return token;
    }

    private void notifyProvisionResult(Token token, ProvisionResult provisionResult, Context context) throws NetworkNotPresentException, NotFoundEntityException, InternalErrorException, CryptoInitException {
        try {
            this.notifyProvisionResultLogic.doNotifyProvisionResult(provisionResult, token, context);
        } catch (TohuBackendException e5) {
            throw new InternalErrorException(e5);
        }
    }

    private void putEntryInSecureStorage(Map<String, byte[]> map) throws InternalErrorException, CryptoInitException {
        try {
            this.cryptoKeyManager.putEntryInSecureStorage(map);
        } catch (StoreTokenException e5) {
            throw new InternalErrorException(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    public void getToken(String str, Context context) throws TohuBackendException, NetworkNotPresentException, NotFoundEntityException, InternalErrorException, CryptoInitException {
        byte b10;
        String str2 = TAG;
        try {
            Token tokenByCardUniqueReference = this.databaseManager.getTokenByCardUniqueReference(str);
            LogTohu.d(str2, "Token %s", tokenByCardUniqueReference);
            String state = tokenByCardUniqueReference.getState();
            int iHashCode = state.hashCode();
            if (iHashCode != 807292011) {
                if (iHashCode == 1925346054 && state.equals("ACTIVE")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (state.equals("INACTIVE")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                this.replenishControllerLogic.replenish(tokenByCardUniqueReference.getCardUniqueReference(), false, context);
            } else if (b10 != 1) {
                LogTohu.d(str2, "GetToken state: %s", state);
            } else {
                notifyProvisionResult(tokenByCardUniqueReference, this.notifyProvisionResultLogic.buildSuccessProvisionResult(tokenByCardUniqueReference.getCardUniqueReference()), context);
            }
        } catch (NotFoundEntityException unused) {
            callGetTokenHubAndSecureSave(str, context);
        }
    }
}
