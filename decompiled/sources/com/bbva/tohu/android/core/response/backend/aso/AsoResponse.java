package com.bbva.tohu.android.core.response.backend.aso;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AsoResponse<T> {
    public static final String ERROR_CODE_OTP_BLOCKED = "363";
    public static final String ERROR_CODE_OTP_ERROR = "999";
    public static final String ERROR_CODE_OTP_EXPIRED = "362";
    public static final String ERROR_CODE_OTP_INVALID = "168";
    public static final String ERROR_CODE_OTP_NEEDED = "70";
    public static final String ERROR_CODE_SOFT_TOKEN_NEEDED = "80";
    public static final String ERROR_CODE_TSEC_TIME_OUT = "68";
    public static final String ERROR_OTP_TOKEN_SOFTWARE_INCORRECT = "398";
    public static final String ERROR_TOKEN_SOFTWARE_BLOQUED = "402";
    public static final String ERROR_TOKEN_SOFTWARE_INACTIVE = "399";
    public static final String ERROR_TOKEN_SOFTWARE_UNKNOWN = "403";
    public static final String ERROR_TYPE_TOKEN_INCORRECT = "404";
    public static final int HTTP_ARMADILLO_OTP_NEEDED = 428;
    private static final Map<Integer, List<String>> mapOtpStatusError;
    private AsoErrorResponse asoErrorResponse;
    private String authenticationData;
    private String authenticationState;
    private String authenticationType;
    private Integer responseStatus;
    private T tohuResponse;

    static {
        HashMap map = new HashMap();
        mapOtpStatusError = map;
        map.put(500, Arrays.asList(ERROR_TOKEN_SOFTWARE_INACTIVE, ERROR_TOKEN_SOFTWARE_BLOQUED, ERROR_TOKEN_SOFTWARE_UNKNOWN, ERROR_TYPE_TOKEN_INCORRECT));
        map.put(403, Collections.singletonList(ERROR_OTP_TOKEN_SOFTWARE_INCORRECT));
    }

    public AsoErrorResponse getAsoErrorResponse() {
        return this.asoErrorResponse;
    }

    public String getAuthenticationData() {
        return this.authenticationData;
    }

    public String getAuthenticationState() {
        return this.authenticationState;
    }

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public Integer getResponseStatus() {
        return this.responseStatus;
    }

    public T getTohuResponse() {
        return this.tohuResponse;
    }

    public boolean isAuthenticationNeeded() {
        return this.responseStatus.equals(401) && this.asoErrorResponse.getErrorCode().equals("70");
    }

    public boolean isAuthenticationValueNeeded() {
        return this.responseStatus.equals(401) && this.asoErrorResponse.getErrorCode().equals(ERROR_CODE_OTP_ERROR);
    }

    public boolean isOtpSMSInvalid() {
        return this.responseStatus.equals(401) && this.asoErrorResponse.getErrorCode().equals(ERROR_CODE_OTP_INVALID);
    }

    public boolean isOtpSmsBlocked() {
        return this.responseStatus.equals(403) && this.asoErrorResponse.getErrorCode().equals(ERROR_CODE_OTP_BLOCKED);
    }

    public boolean isOtpSmsExpired() {
        return this.responseStatus.equals(403) && this.asoErrorResponse.getErrorCode().equals(ERROR_CODE_OTP_EXPIRED);
    }

    public boolean isOtpSoftokenInvalid() {
        Map<Integer, List<String>> map = mapOtpStatusError;
        return map.get(this.responseStatus) != null && map.get(this.responseStatus).contains(this.asoErrorResponse.getErrorCode());
    }

    public boolean isSuccessful() {
        return this.responseStatus.equals(200);
    }

    public boolean isTSECTimeOut() {
        return this.responseStatus.equals(403) && this.asoErrorResponse.getErrorCode().equals(ERROR_CODE_TSEC_TIME_OUT);
    }

    public boolean isWrongFingerprint() {
        return this.responseStatus.equals(409);
    }

    public void setAsoError(AsoErrorResponse asoErrorResponse) {
        this.asoErrorResponse = asoErrorResponse;
    }

    public void setAuthenticationData(String str) {
        this.authenticationData = str;
    }

    public void setAuthenticationState(String str) {
        this.authenticationState = str;
    }

    public void setAuthenticationType(String str) {
        this.authenticationType = str;
    }

    public void setResponseStatus(Integer num) {
        this.responseStatus = num;
    }

    public void setTohuResponse(T t10) {
        this.tohuResponse = t10;
    }

    public String toString() {
        return "AsoResponse{authenticationState=" + this.authenticationState + ", responseStatus=" + this.responseStatus + ", tohuResponse=" + this.tohuResponse + ", asoErrorResponse='" + this.asoErrorResponse + "'}";
    }
}
