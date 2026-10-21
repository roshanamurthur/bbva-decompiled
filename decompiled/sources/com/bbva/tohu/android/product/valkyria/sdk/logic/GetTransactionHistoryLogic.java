package com.bbva.tohu.android.product.valkyria.sdk.logic;

import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardNotFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionHistoryResponse;
import com.bbva.tohu.android.product.valkyria.sdk.services.GetTransactionHistoryService;

/* JADX INFO: loaded from: classes6.dex */
public class GetTransactionHistoryLogic {
    private static final String TAG = "GetTransactionHistoryLogic";
    private GetTransactionHistoryService getTransactionHistoryService;

    public GetTransactionHistoryLogic(GetTransactionHistoryService getTransactionHistoryService) {
        this.getTransactionHistoryService = getTransactionHistoryService;
    }

    public TransactionHistoryResponse getTransactionHistory(String str, String str2) throws LoginNeededException, NetworkNotPresentException, InternalErrorException, CardNotFoundException {
        return this.getTransactionHistoryService.getTransactionHistory(str, str2);
    }
}
