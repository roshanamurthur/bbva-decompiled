package com.viergegroup.sdk.taptophone.webApi;

import com.viergegroup.sdk.taptophone.vierge.models.CalculateHashResponse;
import com.viergegroup.sdk.taptophone.vierge.models.SearchTxnResponse;
import com.viergegroup.sdk.taptophone.vierge.models.SearchTxnResponseOpenPay;
import com.viergegroup.sdk.taptophone.vierge.models.SendTransactionResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes7.dex */
public interface TransactionsApi {
    @POST("pandora/calculate-rsa-hash")
    Call<CalculateHashResponse> calculateHash(@Body RequestBody requestBody);

    @POST("gateway/comm-test")
    Call<SendTransactionResponse> commTest(@Body RequestBody requestBody);

    @POST("vault/save-dukpt-data")
    Call<SendTransactionResponse> saveDUKPData(@Body RequestBody requestBody);

    @POST("gateway/search-txn")
    Call<SearchTxnResponse> searchTxn(@Body RequestBody requestBody);

    @POST("gateway/search-txn")
    Call<SearchTxnResponseOpenPay> searchTxnOpenPay(@Body RequestBody requestBody);

    @POST("logs/save")
    Call<String> sendLogs(@Body RequestBody requestBody);

    @POST("transactions/send-transaction")
    Call<SendTransactionResponse> sendTransaction(@Body RequestBody requestBody);
}
