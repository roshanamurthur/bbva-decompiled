package com.bbva.plugin.analyticsdata.command.response;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnalyticsDataErrors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/analyticsdata/command/response/AnalyticsDataErrors;", "", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "description", "Ljava/lang/String;", "ANALYTICS_DATA_NOT_INITIALIZED", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1})
public enum AnalyticsDataErrors implements ErrorMessage {
    ANALYTICS_DATA_NOT_INITIALIZED;

    private final int code = 2010;

    @NotNull
    private final String description = "Analytics Data not initialized";

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AnalyticsDataErrors[] valuesCustom() {
        AnalyticsDataErrors[] analyticsDataErrorsArrValuesCustom = values();
        return (AnalyticsDataErrors[]) Arrays.copyOf(analyticsDataErrorsArrValuesCustom, analyticsDataErrorsArrValuesCustom.length);
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getDescription() {
        return this.description;
    }
}
