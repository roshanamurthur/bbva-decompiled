package com.bbva.component.dm.customer.data.repository.response.indicators;

import com.bbva.component.dm.customer.data.repository.response.Parser;
import com.bbva.component.dm.customer.domain.model.IndicatorResponse;
import com.bbva.component.dm.customer.domain.model.IndicatorsLoginsEntity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndicatorsLoginsParser.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/customer/data/repository/response/indicators/IndicatorsLoginsParser;", "Lcom/bbva/component/dm/customer/data/repository/response/Parser;", "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "()V", "parseResponse", "result", "", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IndicatorsLoginsParser implements Parser<IndicatorResponse> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.component.dm.customer.data.repository.response.Parser
    @NotNull
    public IndicatorResponse parseResponse(@Nullable String result) {
        Object objFromJson = new Gson().fromJson(result, new TypeToken<IndicatorsLoginsEntity>() { // from class: com.bbva.component.dm.customer.data.repository.response.indicators.IndicatorsLoginsParser.parseResponse.1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (IndicatorResponse) objFromJson;
    }
}
