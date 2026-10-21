package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.response.Response;
import com.bbva.tohu.android.core.utils.Serializer;
import com.bbva.tohu.android.product.valkyria.sdk.beans.TokenState;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileDataMdesCmsC;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.VtsCardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.ReplenishResponseData;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.TransactionHistoryResponseData;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes6.dex */
public class SerializerServiceGsonImpl implements SerializerService {
    private Serializer serializer = Serializer.getInstance();

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public <T> T deserialize(String str, Class<T> cls) {
        return (T) this.serializer.deserialize(str, (Class) cls);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public Response<TransactionHistoryResponseData> deserializeGetTransactionHistoryResponse(String str) {
        Gson gson = new Gson();
        Response<TransactionHistoryResponseData> response = (Response) gson.fromJson(str, Response.class);
        response.setData((TransactionHistoryResponseData) gson.fromJson(gson.toJsonTree(response).getAsJsonObject().get("data"), TransactionHistoryResponseData.class));
        if (response.getData().getTransactionsDetails() != null) {
            return response;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public CardProfileDataMdesCmsC deserializeMcCardProfile(String str) {
        return CardProfileDataMdesCmsC.valueOf(str);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public TokenState[] deserializeNotifyTokenUpdate(String str) {
        return (TokenState[]) new Gson().fromJson(str, TokenState[].class);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public Response<ReplenishResponseData> deserializeReplenishResponse(String str) {
        Gson gson = new Gson();
        Response<ReplenishResponseData> response = (Response) gson.fromJson(str, Response.class);
        response.setData((ReplenishResponseData) gson.fromJson(gson.toJsonTree(response).getAsJsonObject().get("data"), ReplenishResponseData.class));
        return response;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public VtsCardProfile deserializeVtsCardProfile(String str) {
        return VtsCardProfile.valueOf(str);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public String serialize(Object obj) {
        return this.serializer.serialize(obj);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public String serializeMcCardProfile(CardProfileDataMdesCmsC cardProfileDataMdesCmsC) {
        return serialize(cardProfileDataMdesCmsC).replace("dpValue", "dp").replace("dqValue", "dq").replace("pValue", "p").replace("qValue", "q").replace("uValue", "u");
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService
    public String serializeVtsCardProfile(VtsCardProfile vtsCardProfile) {
        return serialize(vtsCardProfile);
    }
}
