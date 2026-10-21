package com.noknok.android.client.appsdk_plus;

import android.content.Context;
import android.util.Pair;
import androidx.camera.core.processing.f;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ErrorInfoHelper;
import com.noknok.android.client.appsdk.OperationType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.HttpClient;
import com.noknok.android.client.utils.Logger;
import java.io.IOException;
import java.net.MalformedURLException;
import java.security.cert.CertificateEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultRestClient implements IRestClient {
    protected Context mContext;
    protected SessionData mSessionData;
    protected HashMap<String, Pair<SessionType, SessionType>> mSessionMap;

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk_plus.DefaultRestClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62928a;

        static {
            int[] iArr = new int[SessionType.values().length];
            f62928a = iArr;
            try {
                iArr[SessionType.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62928a[SessionType.COOKIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum SessionType {
        JSON,
        COOKIE,
        HEADER
    }

    public DefaultRestClient() {
        this.mSessionData = null;
        this.mSessionMap = new HashMap<>();
    }

    private String a(JsonObject jsonObject, HashMap<String, String> map, SessionType sessionType) {
        JsonObject asJsonObject;
        String str;
        RestRequest restRequest = (RestRequest) new Gson().fromJson((JsonElement) jsonObject, RestRequest.class);
        if (map == null || map.isEmpty() || (str = map.get("options")) == null) {
            asJsonObject = null;
        } else {
            try {
                asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            } catch (JsonParseException e5) {
                throw new AppSDKException(ResultType.FAILURE, "Failed to parse extraOptions ", e5);
            }
        }
        if (asJsonObject != null) {
            restRequest.setOptionsData(asJsonObject);
        }
        if (sessionType == SessionType.JSON) {
            restRequest.sessionData = this.mSessionData.getMap();
        }
        return restRequest.toJSON().toString();
    }

    public HttpClient createRequest(String str, String str2, HashMap<String, String> map, OperationType operationType) {
        try {
            return HttpClient.createInstance(this.mContext).setUrl(str).addHeader(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json; charset=UTF-8").setMessage(str2);
        } catch (MalformedURLException e5) {
            throw new AppSDKException(ResultType.FAILURE, f.d("Malformed URL ", str), e5);
        }
    }

    public SessionData getSessionData(HttpClient httpClient, List<String> list, OperationType operationType) {
        int i10 = AnonymousClass1.f62928a[((SessionType) getSessionType(operationType).second).ordinal()];
        if (i10 == 1) {
            RestResponse restResponseFromJSON = RestResponse.fromJSON(httpClient.getResponse());
            if (restResponseFromJSON.sessionData != null) {
                if (list == null || list.isEmpty()) {
                    return restResponseFromJSON.sessionData;
                }
                SessionData sessionData = new SessionData();
                for (String str : list) {
                    String str2 = restResponseFromJSON.sessionData.get(str);
                    if (str2 != null) {
                        sessionData.put(str, str2);
                    }
                }
                return sessionData;
            }
        } else if (i10 == 2) {
            List<String> header = httpClient.getHeader("Set-Cookie");
            if (header != null) {
                SessionData sessionData2 = new SessionData();
                sessionData2.putCookies(header, list);
                return sessionData2;
            }
            AppSDKException appSDKException = new AppSDKException(ResultType.INVALID_SERVER_RESPONSE);
            ErrorInfoHelper.setOperationType(appSDKException, operationType);
            ErrorInfoHelper.setServerStatusCode(appSDKException, Integer.toString(httpClient.getStatusCode()));
            throw appSDKException;
        }
        return null;
    }

    public Pair<SessionType, SessionType> getSessionType(OperationType operationType) {
        return this.mSessionMap.containsKey(operationType.name()) ? this.mSessionMap.get(operationType.name()) : this.mSessionMap.get("default");
    }

    @Override // com.noknok.android.client.appsdk_plus.IRestClient
    public JsonObject sendRequest(JsonObject jsonObject, RestParams restParams) {
        HttpClient httpClientCreateRequest;
        String str;
        try {
            OperationType byName = OperationType.getByName(jsonObject.get("operation").getAsString());
            HashMap<String, String> extras = restParams.getExtras();
            if (byName.isAdaptive()) {
                httpClientCreateRequest = createRequest(restParams.getServerUrl(), jsonObject.toString(), extras, byName);
            } else {
                setSessionData(restParams.getSessionData());
                SessionData sessionData = this.mSessionData;
                SessionType sessionType = (sessionData == null || sessionData.size() <= 0) ? null : (SessionType) getSessionType(byName).first;
                httpClientCreateRequest = createRequest(restParams.getServerUrl(), a(jsonObject, extras, sessionType), extras, byName);
                if (sessionType == SessionType.COOKIE) {
                    httpClientCreateRequest.setCookies(this.mSessionData.getCookies());
                }
            }
            List<String> stateCookie = restParams.getStateCookie();
            if (stateCookie != null && !stateCookie.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator<String> it = stateCookie.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next());
                    sb2.append(ReplenishLogic.ID_SEPARATOR);
                }
                httpClientCreateRequest.addCookies(sb2.toString());
            }
            if (restParams.getTlsCert() != null) {
                httpClientCreateRequest.setTlsCert(restParams.getTlsCert());
            }
            String strSendRequest = sendRequest(httpClientCreateRequest);
            RestResponse restResponseFromJSON = RestResponse.fromJSON(strSendRequest);
            if (httpClientCreateRequest.getStatusCode() >= 400) {
                if (strSendRequest != null && !strSendRequest.isEmpty()) {
                    if (restResponseFromJSON != null && ((str = restResponseFromJSON.statusCode) == null || str.equals(RestResponse.SERVER_SUCCESS))) {
                        AppSDKException appSDKException = new AppSDKException(ResultType.INVALID_SERVER_RESPONSE);
                        ErrorInfoHelper.setAdditionalErrorInfo(appSDKException, restResponseFromJSON.additionalErrorInfo);
                        throw appSDKException;
                    }
                }
                if (httpClientCreateRequest.getStatusCode() == 401) {
                    AppSDKException appSDKException2 = new AppSDKException(ResultType.BAD_SESSION);
                    ErrorInfoHelper.setHttpStatusCode(appSDKException2, Integer.toString(httpClientCreateRequest.getStatusCode()));
                    ErrorInfoHelper.setAdditionalErrorInfo(appSDKException2, restResponseFromJSON.additionalErrorInfo);
                    throw appSDKException2;
                }
                AppSDKException appSDKException3 = new AppSDKException(ResultType.SERVER_ERROR);
                ErrorInfoHelper.setHttpStatusCode(appSDKException3, Integer.toString(httpClientCreateRequest.getStatusCode()));
                ErrorInfoHelper.setAdditionalErrorInfo(appSDKException3, restResponseFromJSON.additionalErrorInfo);
                throw appSDKException3;
            }
            if (httpClientCreateRequest.getStatusCode() >= 300 && httpClientCreateRequest.getStatusCode() < 400) {
                Logger.w("DefaultRestClient", "Redirection http status code " + httpClientCreateRequest.getStatusCode() + " received");
            }
            restParams.setChannelBindings(httpClientCreateRequest.getChannelBindings()).setTlsCert(httpClientCreateRequest.getTlsCert()).setStateCookie(httpClientCreateRequest.getHeader("Set-Cookie"));
            if (byName == OperationType.FINISH_AUTH || byName == OperationType.FINISH_REG) {
                restParams.setSessionData(getSessionData(httpClientCreateRequest, restParams.getSessionKeys(), byName));
            }
            if (strSendRequest != null) {
                try {
                    if (!strSendRequest.isEmpty()) {
                        return JsonParser.parseString(strSendRequest).getAsJsonObject();
                    }
                } catch (JsonParseException e5) {
                    throw new AppSDKException(ResultType.INVALID_SERVER_RESPONSE, e5);
                }
            }
            Logger.w("DefaultRestClient", "Response is empty, returning empty object");
            return restResponseFromJSON.toJSON();
        } catch (AppSDKException e7) {
            ErrorInfoHelper.setOperationType(e7, jsonObject.get("operation").getAsString());
            throw e7;
        }
    }

    public void setSessionData(SessionData sessionData) {
        this.mSessionData = sessionData;
    }

    public DefaultRestClient(Context context) {
        this.mSessionData = null;
        HashMap<String, Pair<SessionType, SessionType>> map = new HashMap<>();
        this.mSessionMap = map;
        this.mContext = context;
        SessionType sessionType = SessionType.JSON;
        map.put("default", new Pair<>(sessionType, sessionType));
    }

    public DefaultRestClient(Context context, HashMap<String, Pair<SessionType, SessionType>> map) {
        this.mSessionData = null;
        new HashMap();
        this.mContext = context;
        this.mSessionMap = map;
    }

    public String sendRequest(HttpClient httpClient) {
        try {
            return httpClient.sendRequest().getResponse();
        } catch (IOException | CertificateEncodingException e5) {
            throw new AppSDKException(ResultType.CONNECTION_ERROR, e5);
        }
    }
}
