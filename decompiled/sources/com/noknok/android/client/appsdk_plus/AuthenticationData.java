package com.noknok.android.client.appsdk_plus;

import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import com.noknok.android.client.appsdk.AppSDK2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class AuthenticationData {
    public static final String USER_NAME = "userName";
    public JsonObject additionalInfo;
    public boolean isPlatformAuthenticator;
    public String oobRefId;
    public AppSDK2.Operation operation;
    public HashMap<String, String> profileData;
    public String quickData;
    public SessionData sessionData;

    public void setAuthenticationData(AuthenticationData authenticationData) {
        this.sessionData = authenticationData.sessionData;
        this.profileData = authenticationData.profileData;
        this.additionalInfo = authenticationData.additionalInfo;
        this.oobRefId = authenticationData.oobRefId;
        this.operation = authenticationData.operation;
        this.quickData = authenticationData.quickData;
        this.isPlatformAuthenticator = authenticationData.isPlatformAuthenticator;
    }

    @NonNull
    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object[] objArr = new Object[8];
        objArr[0] = "AuthenticationData";
        if (this.sessionData != null) {
            str = "session:" + this.sessionData.getMap();
        } else {
            str = "";
        }
        objArr[1] = str;
        if (this.profileData != null) {
            str2 = ",profileData:" + this.profileData;
        } else {
            str2 = "";
        }
        objArr[2] = str2;
        if (this.additionalInfo != null) {
            str3 = ",additionalInfo:" + this.additionalInfo;
        } else {
            str3 = "";
        }
        objArr[3] = str3;
        if (this.quickData != null) {
            str4 = ",quickData:" + this.quickData;
        } else {
            str4 = "";
        }
        objArr[4] = str4;
        if (this.oobRefId != null) {
            str5 = ",oobRefId:" + this.oobRefId;
        } else {
            str5 = "";
        }
        objArr[5] = str5;
        if (this.operation != null) {
            str6 = ",operation:" + this.operation;
        } else {
            str6 = "";
        }
        objArr[6] = str6;
        objArr[7] = this.isPlatformAuthenticator ? ",platformAuthenticator" : "";
        return String.format("%s:{%s%s%s%s%s%s%s}", objArr);
    }
}
