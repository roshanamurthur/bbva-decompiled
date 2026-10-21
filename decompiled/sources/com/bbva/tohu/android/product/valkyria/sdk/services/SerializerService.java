package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.response.Response;
import com.bbva.tohu.android.product.valkyria.sdk.beans.TokenState;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileDataMdesCmsC;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.VtsCardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.ReplenishResponseData;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.TransactionHistoryResponseData;

/* JADX INFO: loaded from: classes6.dex */
public interface SerializerService {
    <T> T deserialize(String str, Class<T> cls);

    Response<TransactionHistoryResponseData> deserializeGetTransactionHistoryResponse(String str);

    CardProfileDataMdesCmsC deserializeMcCardProfile(String str);

    TokenState[] deserializeNotifyTokenUpdate(String str);

    Response<ReplenishResponseData> deserializeReplenishResponse(String str);

    VtsCardProfile deserializeVtsCardProfile(String str);

    String serialize(Object obj);

    String serializeMcCardProfile(CardProfileDataMdesCmsC cardProfileDataMdesCmsC);

    String serializeVtsCardProfile(VtsCardProfile vtsCardProfile);
}
