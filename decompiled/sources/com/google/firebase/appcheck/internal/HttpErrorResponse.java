package com.google.firebase.appcheck.internal;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HttpErrorResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47619b;

    @NonNull
    public static HttpErrorResponse fromJsonString(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("error"));
        int iOptInt = jSONObject.optInt("code");
        String strOptString = jSONObject.optString("message");
        HttpErrorResponse httpErrorResponse = new HttpErrorResponse();
        httpErrorResponse.f47618a = iOptInt;
        httpErrorResponse.f47619b = strOptString;
        return httpErrorResponse;
    }

    public int getErrorCode() {
        return this.f47618a;
    }

    @NonNull
    public String getErrorMessage() {
        return this.f47619b;
    }
}
