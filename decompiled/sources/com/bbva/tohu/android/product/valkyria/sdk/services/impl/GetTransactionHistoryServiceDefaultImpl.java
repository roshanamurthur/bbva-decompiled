package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.constants.ResponseCodes;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Armadillo401Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu403Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu404Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.Response;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardNotFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionHistoryResponse;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.CredentialService;
import com.bbva.tohu.android.product.valkyria.sdk.services.GetTransactionHistoryService;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class GetTransactionHistoryServiceDefaultImpl implements GetTransactionHistoryService {
    private static final String TAG = "GetTransactionHistoryServiceDefaultImpl";
    private BackendService backendService;
    private CredentialService credentialService;

    public GetTransactionHistoryServiceDefaultImpl(BackendService backendService, CredentialService credentialService) {
        this.backendService = backendService;
        this.credentialService = credentialService;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.GetTransactionHistoryService
    public TransactionHistoryResponse getTransactionHistory(String str, String str2) throws LoginNeededException, NetworkNotPresentException, InternalErrorException, CardNotFoundException {
        try {
            Response<TransactionHistoryResponse> transactionHistory = this.backendService.getTransactionHistory(str, this.credentialService.getJwt(str2));
            Objects.toString(transactionHistory.getData());
            return transactionHistory.getData();
        } catch (CryptoInitException | Armadillo401Exception | Tohu403Exception unused) {
            throw new LoginNeededException();
        } catch (Tohu404Exception e5) {
            throw new CardNotFoundException(e5, str);
        } catch (TohuBackendException | IllegalArgumentException unused2) {
            throw new InternalErrorException(ResponseCodes.TOHU_INTERNAL_ERROR, 3);
        }
    }
}
