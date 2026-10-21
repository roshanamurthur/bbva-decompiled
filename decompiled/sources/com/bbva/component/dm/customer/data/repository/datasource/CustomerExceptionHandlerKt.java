package com.bbva.component.dm.customer.data.repository.datasource;

import com.bbva.component.dm.customer.data.repository.response.exception.CustomerException;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.network.model.response.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CustomerExceptionHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000b\u001a\u0016\u0010\f\u001a\u00020\u0007*\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000b¨\u0006\r"}, d2 = {"errorIndicator", "", "Lorg/json/JSONObject;", "fieldName", "errorIndicatorAkamai", "errorMessage", "toHandleCustomerException", "Lcom/bbva/component/dm/customer/data/repository/response/exception/CustomerException;", "Lcom/bbva/network/model/response/NetworkResponse;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "toHandleCustomerIndicatorsException", "component-dm-customer_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomerExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerExceptionHandler.kt\ncom/bbva/component/dm/customer/data/repository/datasource/CustomerExceptionHandlerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class CustomerExceptionHandlerKt {
    @Nullable
    public static final String errorIndicator(@NotNull JSONObject jSONObject, @NotNull String fieldName) {
        JSONObject jSONObjectOptJSONObject;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messages");
            if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                return null;
            }
            return jSONObjectOptJSONObject.optString(fieldName);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static final String errorIndicatorAkamai(@NotNull JSONObject jSONObject) {
        String string;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Object objOpt = jSONObject.opt("error-code");
        return (objOpt == null || (string = objOpt.toString()) == null) ? CustomerException.ErrorCategory.UNKNOWN.toString() : string;
    }

    @Nullable
    public static final String errorMessage(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Object objOpt = jSONObject.opt("error-message");
        if (objOpt != null) {
            return objOpt.toString();
        }
        return null;
    }

    @NotNull
    public static final CustomerException toHandleCustomerException(@NotNull NetworkResponse networkResponse, @NotNull Exception exception) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(networkResponse, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        try {
            Result.Companion companion = Result.INSTANCE;
            String strString = networkResponse.getBody().string();
            objM5535constructorimpl = Result.m5535constructorimpl(strString != null ? new JSONObject(strString) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        JSONObject jSONObject = (JSONObject) objM5535constructorimpl;
        String string = jSONObject != null ? jSONObject.getString("error-code") : null;
        if (string == null) {
            string = CustomerException.ErrorCategory.UNKNOWN.toString();
        }
        String str = string;
        return new CustomerException(str, jSONObject != null ? errorMessage(jSONObject) : null, Intrinsics.areEqual(str, LoginHelperConstants.CLIENT_STATUS_DEVICE_NOT_REGISTER) ? CustomerException.ErrorCategory.DEVICE_NOT_REGISTER : CustomerException.ErrorCategory.UNKNOWN, networkResponse, exception);
    }

    @NotNull
    public static final CustomerException toHandleCustomerIndicatorsException(@NotNull NetworkResponse networkResponse, @NotNull Exception exception) throws IOException {
        String str;
        String strErrorMessage;
        String strErrorIndicator;
        Intrinsics.checkNotNullParameter(networkResponse, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String strString = networkResponse.getBody().string();
        JSONObject jSONObject = strString != null ? new JSONObject(strString) : null;
        if (jSONObject != null && (strErrorIndicatorAkamai = errorIndicator(jSONObject, "code")) != null) {
            str = strErrorIndicatorAkamai;
        } else if (jSONObject != null) {
            String strErrorIndicatorAkamai = errorIndicatorAkamai(jSONObject);
            str = strErrorIndicatorAkamai;
        } else {
            str = null;
        }
        if (jSONObject == null || (strErrorIndicator = errorIndicator(jSONObject, "message")) == null) {
            strErrorMessage = jSONObject != null ? errorMessage(jSONObject) : null;
        } else {
            strErrorMessage = strErrorIndicator;
        }
        return new CustomerException(str, strErrorMessage, Intrinsics.areEqual(str, "invalidDevice") ? CustomerException.ErrorCategory.DEVICE_NOT_REGISTER : CustomerException.ErrorCategory.UNKNOWN, networkResponse, exception);
    }
}
