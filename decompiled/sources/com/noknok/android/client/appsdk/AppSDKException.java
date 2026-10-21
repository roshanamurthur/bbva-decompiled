package com.noknok.android.client.appsdk;

import androidx.annotation.NonNull;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes11.dex */
public class AppSDKException extends RuntimeException {
    public static final String KEY_ADAPTIVE_METHOD = "adaptiveMethod";
    public static final String KEY_ADDITIONAL_ERROR_INFO = "additionalErrorInfo";
    public static final String KEY_CORRELATION_ID = "correlationId";
    public static final String KEY_FACET_ID = "facetId";
    public static final String KEY_HTTP_STATUS_CODE = "httpStatusCode";
    public static final String KEY_OPERATION_TYPE = "operationType";
    public static final String KEY_SERVER_STATUS_CODE = "serverStatusCode";
    public static final String KEY_TRANSACTION_ID = "transactionID";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ResultType f62862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JsonObject f62863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SubSystem f62864c;

    public enum SubSystem {
        UAF,
        FIDO2,
        NON_FIDO,
        ADAPTIVE_ENGINE
    }

    public AppSDKException(ResultType resultType) {
        super(resultType.name());
        this.f62863b = null;
        this.f62862a = resultType;
    }

    public JsonObject getAdditionalData() {
        return this.f62863b;
    }

    public ResultType getResultType() {
        return this.f62862a;
    }

    public SubSystem getSubSystem() {
        return this.f62864c;
    }

    public AppSDKException setAdditionalData(JsonObject jsonObject) {
        this.f62863b = jsonObject;
        return this;
    }

    public AppSDKException setSubSystem(SubSystem subSystem) {
        this.f62864c = subSystem;
        return this;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (this.f62863b != null) {
            str = ". Additional Data: " + this.f62863b;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public AppSDKException(ResultType resultType, String str) {
        super(resultType.name() + " : " + str);
        this.f62863b = null;
        this.f62862a = resultType;
    }

    public AppSDKException(ResultType resultType, String str, Throwable th2) {
        super(resultType.name() + " : " + str, th2);
        this.f62863b = null;
        this.f62862a = resultType;
    }

    public AppSDKException(ResultType resultType, Throwable th2) {
        super(resultType.name(), th2);
        this.f62863b = null;
        this.f62862a = resultType;
    }
}
