package com.bbva.tohu.android.core.response.backend.aso;

import ad.d;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class AsoErrorResponse {

    @SerializedName("consumer-request-id")
    private String consumerRequestId;

    @SerializedName("error-code")
    private String errorCode;

    @SerializedName("error-message")
    private String errorMessage;

    @SerializedName("http-status")
    private Integer httpStatus;
    private String severity;

    @SerializedName("system-error-code")
    private String systemErrorCode;

    @SerializedName("system-error-description")
    private String systemErrorDescription;
    private String version;

    public String getConsumerRequestId() {
        return this.consumerRequestId;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Integer getHttpStatus() {
        return this.httpStatus;
    }

    public String getSeverity() {
        return this.severity;
    }

    public String getSystemErrorCode() {
        return this.systemErrorCode;
    }

    public String getSystemErrorDescription() {
        return this.systemErrorDescription;
    }

    public String getVersion() {
        return this.version;
    }

    public void setConsumerRequestId(String str) {
        this.consumerRequestId = str;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setHttpStatus(Integer num) {
        this.httpStatus = num;
    }

    public void setSeverity(String str) {
        this.severity = str;
    }

    public void setSystemErrorCode(String str) {
        this.systemErrorCode = str;
    }

    public void setSystemErrorDescription(String str) {
        this.systemErrorDescription = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AsoErrorResponse{version='");
        sb2.append(this.version);
        sb2.append("', severity='");
        sb2.append(this.severity);
        sb2.append("', httpStatus=");
        sb2.append(this.httpStatus);
        sb2.append(", errorCode='");
        sb2.append(this.errorCode);
        sb2.append("', errorMessage='");
        sb2.append(this.errorMessage);
        sb2.append("', systemErrorCode='");
        sb2.append(this.systemErrorCode);
        sb2.append("', systemErrorDescription='");
        sb2.append(this.systemErrorDescription);
        sb2.append("', consumerRequestId='");
        return d.f(sb2, this.consumerRequestId, "'}");
    }
}
