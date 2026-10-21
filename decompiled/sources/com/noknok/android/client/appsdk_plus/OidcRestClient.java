package com.noknok.android.client.appsdk_plus;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import androidx.camera.core.processing.f;
import com.google.android.gms.common.Scopes;
import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import com.google.gson.JsonObject;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.OperationType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.HttpClient;
import com.noknok.android.client.utils.Logger;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class OidcRestClient extends DefaultRestClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f62931c = {"id_token", "token"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f62932a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f62933b;

    public OidcRestClient(Context context, HashMap<String, Pair<DefaultRestClient.SessionType, DefaultRestClient.SessionType>> map) {
        this.mContext = context;
        this.mSessionMap = map;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.noknok.android.client.appsdk_plus.DefaultRestClient
    public HttpClient createRequest(String str, String str2, HashMap<String, String> map, OperationType operationType) {
        HttpClient httpClientCreateRequest;
        if (operationType != OperationType.INIT_AUTH) {
            httpClientCreateRequest = super.createRequest(str, str2, map, operationType);
            DefaultRestClient.SessionType sessionType = (DefaultRestClient.SessionType) getSessionType(operationType).first;
            SessionData sessionData = this.mSessionData;
            if (sessionData != null && sessionData.size() > 0 && sessionType.equals(DefaultRestClient.SessionType.HEADER)) {
                for (String str3 : this.mSessionData.getMap().keySet()) {
                    httpClientCreateRequest.addHeader(str3, this.mSessionData.get(str3));
                }
            }
            if (operationType == OperationType.FINISH_AUTH) {
                httpClientCreateRequest.setFollowRedirects(false);
            }
        } else {
            if (map == null) {
                throw new AppSDKException(ResultType.FAILURE, "extras parameter not provided, OIDC requires some mandatory values in extras");
            }
            String str4 = map.get(IAppSDKPlus.EXTRA_KEY_NONCE);
            if (str4 == null) {
                throw new AppSDKException(ResultType.FAILURE, "nonce must be set for OIDC authentication");
            }
            String str5 = map.get(IAppSDKPlus.EXTRA_KEY_CLIENT_ID);
            if (str5 == null) {
                throw new AppSDKException(ResultType.FAILURE, "OAUTH/OIDC client ID not provided");
            }
            String str6 = map.get(IAppSDKPlus.EXTRA_KEY_REDIRECT_URL);
            if (str6 == null) {
                throw new AppSDKException(ResultType.FAILURE, "OIDC redirect uri not provided");
            }
            String str7 = map.get(IAppSDKPlus.EXTRA_KEY_RESPONSE_TYPES);
            if (str7 == null) {
                this.f62932a = Arrays.asList(f62931c);
            } else {
                this.f62932a = Arrays.asList(str7.split(" "));
            }
            AuthorizationRequestUrl authorizationRequestUrl = new AuthorizationRequestUrl(str, str5, this.f62932a);
            authorizationRequestUrl.set(IAppSDKPlus.EXTRA_KEY_NONCE, str4);
            authorizationRequestUrl.setRedirectUri(str6);
            String strConcat = map.get("scope");
            if (strConcat == null) {
                strConcat = Scopes.OPEN_ID;
            } else if (!strConcat.contains(Scopes.OPEN_ID)) {
                strConcat = "openid ".concat(strConcat);
            }
            authorizationRequestUrl.setScopes(Arrays.asList(strConcat.split(" ")));
            String str8 = map.get("state");
            if (str8 != null) {
                authorizationRequestUrl.setState(str8);
            }
            authorizationRequestUrl.set("nnlMessage", str2);
            String strBuild = authorizationRequestUrl.build();
            try {
                httpClientCreateRequest = HttpClient.createInstance(this.mContext).setMethod(HttpClient.HttpMethod.GET).setUrl(strBuild);
                DefaultRestClient.SessionType sessionType2 = (DefaultRestClient.SessionType) getSessionType(operationType).first;
                if (this.f62933b != null && sessionType2.equals(DefaultRestClient.SessionType.HEADER)) {
                    for (String str9 : this.f62933b.keySet()) {
                        httpClientCreateRequest.addHeader(str9, (String) this.f62933b.get(str9));
                    }
                }
            } catch (MalformedURLException e5) {
                throw new AppSDKException(ResultType.FAILURE, f.d("Malformed URL ", strBuild), e5);
            }
        }
        return httpClientCreateRequest;
    }

    @Override // com.noknok.android.client.appsdk_plus.DefaultRestClient
    public SessionData getSessionData(HttpClient httpClient, List<String> list, OperationType operationType) {
        SessionData sessionData = new SessionData();
        if (operationType != OperationType.INIT_AUTH && operationType != OperationType.FINISH_AUTH) {
            return super.getSessionData(httpClient, list, operationType);
        }
        List<String> header = httpClient.getHeader("Location");
        if (header == null || header.isEmpty()) {
            throw new AppSDKException(ResultType.SERVER_ERROR, "Malformed server response. \"Location\" is missing.");
        }
        if (header.get(0) == null || header.get(0).isEmpty()) {
            throw new AppSDKException(ResultType.SERVER_ERROR, "Malformed server response. redirect uri is null.");
        }
        Uri uriBuild = Uri.parse(header.get(0));
        if (!this.f62932a.contains("code")) {
            if (uriBuild.getEncodedFragment() == null) {
                throw new AppSDKException(ResultType.SERVER_ERROR, "Malformed server response. Fragment is missing.");
            }
            uriBuild = new Uri.Builder().encodedQuery(uriBuild.getEncodedFragment()).build();
        }
        Set<String> queryParameterNames = uriBuild.getQueryParameterNames();
        if (queryParameterNames.contains("error")) {
            for (String str : queryParameterNames) {
                StringBuilder sbD = ci.a.d("OAuth/OIDC ", str, ": ");
                sbD.append(uriBuild.getQueryParameter(str));
                Logger.e("OidcRestClient", sbD.toString());
            }
            Logger.e("OidcRestClient", "error code " + uriBuild.getQueryParameter("error"));
            throw new AppSDKException(ResultType.SERVER_ERROR);
        }
        if (this.f62932a.contains("id_token") && !queryParameterNames.contains("id_token")) {
            throw new AppSDKException(ResultType.SERVER_ERROR, "Malformed server response. id_token is missing.");
        }
        if (this.f62932a.contains("token") && !queryParameterNames.contains("access_token")) {
            throw new AppSDKException(ResultType.SERVER_ERROR, "Malformed server response. access_token is missing.");
        }
        if (this.f62932a.contains("code") && !queryParameterNames.contains("code")) {
            throw new AppSDKException(ResultType.SERVER_ERROR, "Malformed server response. code is missing.");
        }
        for (String str2 : queryParameterNames) {
            if (list == null || list.isEmpty() || list.contains(str2)) {
                sessionData.put(str2, uriBuild.getQueryParameter(str2));
            }
        }
        return sessionData;
    }

    @Override // com.noknok.android.client.appsdk_plus.DefaultRestClient, com.noknok.android.client.appsdk_plus.IRestClient
    public JsonObject sendRequest(JsonObject jsonObject, RestParams restParams) {
        JsonObject jsonObjectSendRequest = super.sendRequest(jsonObject, restParams);
        return (jsonObjectSendRequest.has("error") && jsonObjectSendRequest.has("message")) ? jsonObjectSendRequest.get("message").getAsJsonObject() : jsonObjectSendRequest;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.noknok.android.client.appsdk_plus.DefaultRestClient
    public void setSessionData(SessionData sessionData) {
        if (sessionData != null && sessionData.size() > 0) {
            this.f62933b = new HashMap();
            for (String str : sessionData.getMap().keySet()) {
                this.f62933b.put(str, sessionData.getMap().get(str));
            }
        }
        super.setSessionData(sessionData);
    }
}
