package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardNotFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionHistoryResponse;

/* JADX INFO: loaded from: classes6.dex */
public interface GetTransactionHistoryService {
    TransactionHistoryResponse getTransactionHistory(String str, String str2) throws LoginNeededException, NetworkNotPresentException, InternalErrorException, CardNotFoundException;
}
