package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.Response;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionHistoryResponse;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.request.ProvisionResult;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.ConfirmReplenishRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.DeviceStatusRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.ReplenishRequest;
import com.bbva.tohu.android.product.valkyria.sdk.response.ConfirmReplenishResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.DeleteTokenResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.DeviceDeleteResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.NotifyProvisionResultResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.Digitize;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.GetToken;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.ReplenishResponseData;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface BackendService {
    ConfirmReplenishResponse confirmReplenish(ConfirmReplenishRequest confirmReplenishRequest) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    DeviceDeleteResponse deleteDevice(String str, String str2) throws LoginNeededException, TohuBackendException, NetworkNotPresentException, CryptoInitException;

    DeleteTokenResponse deleteToken(String str, String str2) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    Response<Digitize> digitize(List<Card> list, String str) throws LoginNeededException, TohuBackendException, NetworkNotPresentException, CryptoInitException;

    Response<GetToken> getToken(String str) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    Response<TransactionHistoryResponse> getTransactionHistory(String str, String str2) throws LoginNeededException, TohuBackendException, NetworkNotPresentException, InternalErrorException, CryptoInitException;

    NotifyProvisionResultResponse notifyProvisionResult(ProvisionResult provisionResult, Token token) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    Response<ReplenishResponseData> replenish(ReplenishRequest replenishRequest, String str) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    void sendStatus(DeviceStatusRequest deviceStatusRequest) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;

    void suspendToken(String str, String str2) throws TohuBackendException, NetworkNotPresentException, CryptoInitException;
}
