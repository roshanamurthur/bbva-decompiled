package com.noknok.android.client.appsdk_plus;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ErrorInfoHelper;
import com.noknok.android.client.appsdk.OperationType;
import com.noknok.android.client.appsdk.ProtocolType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.common.DeviceIDUtil;
import com.noknok.android.client.appsdk.jsonapi.App;
import com.noknok.android.client.appsdk_plus.management.ManageRegistrationController;
import com.noknok.android.client.appsdk_plus.management.ManageUIFactory;
import com.noknok.android.client.appsdk_plus.pending_auth.PendingAuth;
import com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsController;
import com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsUIFactory;
import com.noknok.android.client.appsdk_plus.registration.FidoRegUIFactory;
import com.noknok.android.client.appsdk_plus.registration.FidoRegistrationController;
import com.noknok.android.client.extension.IExtension;
import com.noknok.android.client.extension.IExtensionList;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Charsets;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IAppSDKPlus {
    public static final String EXTRAS_KEY_USE_SIGN_IN_WITH_MOBILE = "signInWithMobile";
    public static final String EXTRA_KEY_ASK_CREDENTIAL_NAME = "AskSecurityKeyCredentialName";
    public static final String EXTRA_KEY_AUTO_FIDO_AUTH = "autoFidoAuth";
    public static final String EXTRA_KEY_AUTO_REG = "autoReg";
    public static final String EXTRA_KEY_CANCEL_PENDING_AUTH = "cancelPendingAuth";
    public static final String EXTRA_KEY_CLIENT_ID = "client_id";
    public static final String EXTRA_KEY_CONTEXT_DATA = "contextData";
    public static final String EXTRA_KEY_CORRELATION_ID = "correlationId";
    public static final String EXTRA_KEY_CURRENT_DEVICE_ONLY = "currentDeviceOnly";
    public static final String EXTRA_KEY_EXCLUDE_AUTHENTICATORS = "excludeAuthenticators";
    public static final String EXTRA_KEY_EXTENSIONS = "extensions";
    public static final String EXTRA_KEY_NONCE = "nonce";
    public static final String EXTRA_KEY_OOBREFID = "oobRefId";
    public static final String EXTRA_KEY_OPTIONS = "options";
    public static final String EXTRA_KEY_OPTION_POLICY_NAME = "policyName";
    public static final String EXTRA_KEY_QR_SUPPORTED = "qrSupported";
    public static final String EXTRA_KEY_QR_TYPE = "qrType";
    public static final String EXTRA_KEY_QR_WEB_URL = "qrWebUrl";
    public static final String EXTRA_KEY_QUICK_AUTH_DATA_KEY_NAME = "quickAuthDataKeyName";
    public static final String EXTRA_KEY_QUICK_DATA = "quickAuthData";
    public static final String EXTRA_KEY_QUICK_ENABLE = "quickAuthEnable";
    public static final String EXTRA_KEY_REDIRECT_URL = "redirect_uri";
    public static final String EXTRA_KEY_REGISTRATION_NAME = "registrationName";
    public static final String EXTRA_KEY_RESPONSE_TYPES = "response_types";
    public static final String EXTRA_KEY_RULE_SET_NAME = "ruleSetName";
    public static final String EXTRA_KEY_SCOPE = "scope";
    public static final String EXTRA_KEY_SIGN_IN_QUICK_MODE = "signInQuickMode";
    public static final String EXTRA_KEY_SIGN_UP_EMAIL_ADDRESS = "emailAddress";
    public static final String EXTRA_KEY_SIGN_UP_ENABLED = "enabled";
    public static final String EXTRA_KEY_SIGN_UP_FIDO = "fido";
    public static final String EXTRA_KEY_SIGN_UP_FULL_NAME = "fullName";
    public static final String EXTRA_KEY_SIGN_UP_PHONE_NUMBER = "phoneNumber";
    public static final String EXTRA_KEY_SIGN_UP_PHOTO_ID = "photoID";
    public static final String EXTRA_KEY_STATE = "state";
    public static final String EXTRA_KEY_SUGGEST_REG_ENABLED = "suggestRegEnabled";
    public static final String EXTRA_KEY_USER_DISPLAY_NAME = "userDisplayName";
    public static final String EXTRA_KEY_USER_MEDIATION = "userMediation";
    public static final String EXTRA_KEY_USER_NAME = "userName";
    public static final String QUICK_AUTH_FIDO2_DATA_KEY_NAME = "dataFido2";
    public static final String USER_MEDIATION_CONDITIONAL = "conditional";
    protected final AppSdkPlusConfig mAppSdkPlusConfig;
    protected final Context mContext;
    protected final IRestClient mRestClient;
    protected List<String> mSessionKeys = null;

    public IAppSDKPlus(AppSdkPlusConfig appSdkPlusConfig, Context context) {
        this.mAppSdkPlusConfig = appSdkPlusConfig;
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mRestClient = RestClientFactory.getInstance().createRestClient(applicationContext, appSdkPlusConfig.restClientParams);
    }

    private String a(SessionData sessionData, OperationType operationType) {
        JsonObject jsonObjectSendRequest = this.mRestClient.sendRequest(new RestRequest().setOperation(operationType).toJSON(), new RestParams().setServerUrl(this.mAppSdkPlusConfig.regServerURL).setSessionData(sessionData).setSessionKeys(this.mSessionKeys));
        String str = RestResponse.fromJSON(jsonObjectSendRequest).statusCode;
        if (RestResponse.SERVER_USER_NOT_FOUND.equals(str) || (RestResponse.SERVER_SUCCESS.equals(str) && operationType == OperationType.PURGE_USER_DATA)) {
            String activeUser = AppSDKPlus.getActiveUser();
            if (activeUser != null) {
                UserDataCache.getInstance(this.mContext).setUserData(activeUser, null);
            }
            OperationResultListener.getInstance(this.mContext).onComplete(OperationResultListener.ListenerOperationType.DELETE_REG, new IOperationResultListener.OperationData(), null);
        }
        return jsonObjectSendRequest.toString();
    }

    @Deprecated
    public AuthenticationData authenticate(Activity activity, SessionData sessionData) {
        return authenticate(activity, sessionData, (HashMap<String, String>) null);
    }

    public abstract AuthenticationData authenticate(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map);

    @Deprecated
    public void checkAuthPossible(Activity activity, SessionData sessionData) {
        checkAuthPossible(activity, sessionData, (HashMap<String, String>) null);
    }

    public abstract void checkAuthPossible(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map);

    public abstract void checkAuthPossible(ActivityProxy activityProxy, String str, String str2);

    public abstract AuthenticationData checkRegPossible(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map);

    @Deprecated
    public void checkRegPossible(Activity activity, SessionData sessionData) {
        checkRegPossible(activity, sessionData, (HashMap<String, String>) null);
    }

    @Deprecated
    public void checkTransPossible(Activity activity, SessionData sessionData, String str) {
        checkTransPossible(activity, sessionData, str, (HashMap<String, String>) null);
    }

    public abstract void checkTransPossible(ActivityProxy activityProxy, SessionData sessionData, String str, HashMap<String, String> map);

    @Deprecated
    public void clearLocalRegistrations(Activity activity, String str) {
        clearLocalRegistrations(activity, str, (String) null);
    }

    public abstract void clearLocalRegistrations(ActivityProxy activityProxy, String str, String str2);

    @NonNull
    public ActivityProxy createActivityProxy(Activity activity) {
        if (activity != null) {
            return ActivityProxy.createFromActivity(activity);
        }
        Context context = this.mContext;
        if (context != null) {
            return ActivityProxy.createFromAppContext(context, false);
        }
        throw new IllegalArgumentException("Either Activity or Context should be valid");
    }

    @Deprecated
    public void deleteAllRegistrations(Activity activity, SessionData sessionData, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            deleteAllRegistrations(activityProxyCreateActivityProxy, sessionData, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    public abstract void deleteAllRegistrations(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map);

    @Deprecated
    public void deleteRegistration(Activity activity, SessionData sessionData, String str, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            deleteRegistration(activityProxyCreateActivityProxy, sessionData, str, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    public abstract void deleteRegistration(ActivityProxy activityProxy, SessionData sessionData, String str, HashMap<String, String> map);

    @Deprecated
    public String fetchUserData(Activity activity, SessionData sessionData) {
        return fetchUserData(sessionData);
    }

    public String getCorrelationID(HashMap<String, String> map) {
        return (map == null || !map.containsKey("correlationId") || map.get("correlationId").isEmpty()) ? UUID.randomUUID().toString() : map.get("correlationId");
    }

    public List<PendingAuth> getPendingAuths(SessionData sessionData, HashMap<String, String> map) {
        RestRequest correlationId = new RestRequest().setOperation(OperationType.LIST_OOB_AUTH).setCorrelationId(getCorrelationID(map));
        RestParams extras = new RestParams().setServerUrl(this.mAppSdkPlusConfig.authServerURL).setSessionData(sessionData).setSessionKeys(this.mSessionKeys).setExtras(map);
        if (map != null && map.containsKey(EXTRA_KEY_CURRENT_DEVICE_ONLY) && "true".equals(map.get(EXTRA_KEY_CURRENT_DEVICE_ONLY))) {
            correlationId.setDeviceId(new DeviceIDUtil(this.mContext).getDeviceId()).setAppName(new App().computeForThisApp(this.mContext).name);
        }
        RestResponse restResponseFromJSON = null;
        try {
            restResponseFromJSON = RestResponse.fromJSON(this.mRestClient.sendRequest(correlationId.toJSON(), extras));
            return PendingAuth.parsePendingAuths(restResponseFromJSON.pendingAuths);
        } catch (AppSDKException e5) {
            if (restResponseFromJSON != null) {
                ErrorInfoHelper.setCorrelationID(e5, restResponseFromJSON.id);
            }
            ErrorInfoHelper.setOperationType(e5, OperationType.LIST_OOB_AUTH);
            throw e5;
        }
    }

    public Fragment getPendingAuthsFragment(Context context, SessionData sessionData, HashMap<String, String> map) {
        return PendingAuthsUIFactory.getInstance().createFragment(new PendingAuthsController(this.mAppSdkPlusConfig, sessionData, map));
    }

    public Fragment getRegistrationFragment(Context context, SessionData sessionData, HashMap<String, String> map) {
        if (!this.mAppSdkPlusConfig.protocolType.equals(ProtocolType.FIDO2) || Build.VERSION.SDK_INT >= 24) {
            return FidoRegUIFactory.getInstance().createFragment(new FidoRegistrationController(sessionData, this.mAppSdkPlusConfig, map).setApplicationContext(context));
        }
        return null;
    }

    @Deprecated
    public JSONArray getRegistrations(Activity activity, SessionData sessionData, HashMap<String, String> map) {
        return getRegistrations(sessionData, map);
    }

    @Deprecated
    public void hasPlatformAuthenticator(Activity activity) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            hasPlatformAuthenticator(activityProxyCreateActivityProxy);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    public abstract void hasPlatformAuthenticator(ActivityProxy activityProxy);

    public Fragment manageRegistrations(Context context, SessionData sessionData, HashMap<String, String> map) {
        return ManageUIFactory.getInstance().createFragment(new ManageRegistrationController(this.mAppSdkPlusConfig, sessionData, map).setApplicationContext(context));
    }

    @Deprecated
    public String purgeUserData(Activity activity, SessionData sessionData) {
        return purgeUserData(sessionData);
    }

    @Deprecated
    public AuthenticationData register(Activity activity, SessionData sessionData) {
        return register(activity, sessionData, (HashMap<String, String>) null);
    }

    public abstract AuthenticationData register(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map);

    public void setExtensions(IExtensionList iExtensionList) {
        AppSDKConfig.getInstance(this.mContext).set(AppSDKConfig.Key.defaultExtensions, new Gson().toJsonTree(iExtensionList.getExtensions(), new TypeToken<ArrayList<IExtension>>() { // from class: com.noknok.android.client.appsdk_plus.IAppSDKPlus.1
        }.getType()).getAsJsonArray());
    }

    public void setSendDiscoveryInfo(boolean z10) {
        this.mAppSdkPlusConfig.sendDiscoveryInfo = z10;
    }

    public void setSessionKeys(List<String> list) {
        this.mSessionKeys = list;
    }

    @Deprecated
    public AuthenticationData transact(Activity activity, SessionData sessionData, String str) {
        return transact(activity, sessionData, str, (HashMap<String, String>) null);
    }

    public abstract AuthenticationData transact(ActivityProxy activityProxy, SessionData sessionData, String str, HashMap<String, String> map);

    @Deprecated
    public void updateRegistration(Activity activity, SessionData sessionData, String str, RegData regData, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            updateRegistration(activityProxyCreateActivityProxy, sessionData, str, regData, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    public abstract void updateRegistration(ActivityProxy activityProxy, SessionData sessionData, String str, RegData regData, HashMap<String, String> map);

    public AuthenticationData authenticate(ActivityProxy activityProxy, SessionData sessionData) {
        return authenticate(activityProxy, sessionData, (HashMap<String, String>) null);
    }

    public void checkAuthPossible(ActivityProxy activityProxy, SessionData sessionData) {
        checkAuthPossible(activityProxy, sessionData, (HashMap<String, String>) null);
    }

    public void checkRegPossible(ActivityProxy activityProxy, SessionData sessionData) {
        checkRegPossible(activityProxy, sessionData, (HashMap<String, String>) null);
    }

    public void checkTransPossible(ActivityProxy activityProxy, SessionData sessionData, String str) {
        checkTransPossible(activityProxy, sessionData, str, (HashMap<String, String>) null);
    }

    public void clearLocalRegistrations(ActivityProxy activityProxy, String str) {
        clearLocalRegistrations(activityProxy, str, (String) null);
    }

    public String fetchUserData(SessionData sessionData) {
        return a(sessionData, OperationType.FETCH_USER_DATA);
    }

    public JSONArray getRegistrations(SessionData sessionData, HashMap<String, String> map) {
        RestRequest correlationId = new RestRequest().setOperation(OperationType.LIST_REG).setCorrelationId(getCorrelationID(map));
        RestParams extras = new RestParams().setServerUrl(this.mAppSdkPlusConfig.regServerURL).setSessionData(sessionData).setSessionKeys(this.mSessionKeys).setExtras(map);
        RestResponse restResponseFromJSON = null;
        try {
            JSONArray jSONArray = new JSONArray();
            for (ProtocolType protocolType : ProtocolType.values()) {
                if (protocolType != ProtocolType.BOTH) {
                    restResponseFromJSON = RestResponse.fromJSON(this.mRestClient.sendRequest(correlationId.setProtocolFamily(protocolType.protocolName()).toJSON(), extras));
                    a(restResponseFromJSON.registrations, protocolType, map, jSONArray);
                }
            }
            return jSONArray;
        } catch (AppSDKException e5) {
            if (restResponseFromJSON != null) {
                ErrorInfoHelper.setCorrelationID(e5, restResponseFromJSON.id);
            }
            ErrorInfoHelper.setOperationType(e5, OperationType.LIST_REG);
            throw e5;
        }
    }

    public String purgeUserData(SessionData sessionData) {
        return a(sessionData, OperationType.PURGE_USER_DATA);
    }

    public AuthenticationData register(ActivityProxy activityProxy, SessionData sessionData) {
        return register(activityProxy, sessionData, (HashMap<String, String>) null);
    }

    public AuthenticationData transact(ActivityProxy activityProxy, SessionData sessionData, String str) {
        return transact(activityProxy, sessionData, str, (HashMap<String, String>) null);
    }

    @Deprecated
    public AuthenticationData authenticate(Activity activity, SessionData sessionData, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            return authenticate(activityProxyCreateActivityProxy, sessionData, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    @Deprecated
    public void checkAuthPossible(Activity activity, SessionData sessionData, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            checkAuthPossible(activityProxyCreateActivityProxy, sessionData, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    @Deprecated
    public AuthenticationData checkRegPossible(Activity activity, SessionData sessionData, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            return checkRegPossible(activityProxyCreateActivityProxy, sessionData, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    @Deprecated
    public void checkTransPossible(Activity activity, SessionData sessionData, String str, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            checkTransPossible(activityProxyCreateActivityProxy, sessionData, str, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    @Deprecated
    public void clearLocalRegistrations(Activity activity, String str, String str2) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            clearLocalRegistrations(activityProxyCreateActivityProxy, str, str2);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    @Deprecated
    public AuthenticationData register(Activity activity, SessionData sessionData, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            return register(activityProxyCreateActivityProxy, sessionData, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    @Deprecated
    public AuthenticationData transact(Activity activity, SessionData sessionData, String str, HashMap<String, String> map) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            return transact(activityProxyCreateActivityProxy, sessionData, str, map);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    public Fragment manageRegistrations(Context context, SessionData sessionData) {
        return manageRegistrations(context, sessionData, null);
    }

    @Deprecated
    public void checkAuthPossible(Activity activity, String str) {
        checkAuthPossible(activity, str, (String) null);
    }

    public void checkAuthPossible(ActivityProxy activityProxy, String str) {
        checkAuthPossible(activityProxy, str, (String) null);
    }

    @Deprecated
    public void checkAuthPossible(Activity activity, String str, String str2) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            checkAuthPossible(activityProxyCreateActivityProxy, str, str2);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    private void a(JsonArray jsonArray, ProtocolType protocolType, HashMap<String, String> map, JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        if (jsonArray != null) {
            try {
                for (JsonElement jsonElement : jsonArray) {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject().getAsJsonObject(Constants.device);
                    if (asJsonObject != null) {
                        String asString = asJsonObject.has("info") ? asJsonObject.get("info").getAsString() : "UNKNOWN";
                        String asString2 = asJsonObject.has("id") ? asJsonObject.get("id").getAsString() : "UNKNOWN";
                        JsonArray asJsonArray = jsonElement.getAsJsonObject().getAsJsonArray(Constants.authenticators);
                        if (asJsonArray != null) {
                            Iterator<JsonElement> it = asJsonArray.iterator();
                            while (it.hasNext()) {
                                JsonObject asJsonObject2 = it.next().getAsJsonObject();
                                if (!a(asJsonObject2.get("handle").getAsString(), map)) {
                                    JSONObject jSONObject = new JSONObject(asJsonObject2.toString());
                                    jSONObject.put("info", asString);
                                    jSONObject.put("id", asString2);
                                    jSONArray.put(jSONObject);
                                    jSONArray2.put(jSONObject);
                                }
                            }
                        } else {
                            OperationResultListener operationResultListener = OperationResultListener.getInstance(this.mContext);
                            OperationResultListener.ListenerOperationType listenerOperationType = OperationResultListener.ListenerOperationType.LIST_REG;
                            ResultType resultType = ResultType.SERVER_ERROR;
                            operationResultListener.onFailure(listenerOperationType, new AppSDKException(resultType), map);
                            throw new AppSDKException(resultType);
                        }
                    } else {
                        OperationResultListener operationResultListener2 = OperationResultListener.getInstance(this.mContext);
                        OperationResultListener.ListenerOperationType listenerOperationType2 = OperationResultListener.ListenerOperationType.LIST_REG;
                        ResultType resultType2 = ResultType.SERVER_ERROR;
                        operationResultListener2.onFailure(listenerOperationType2, new AppSDKException(resultType2), map);
                        throw new AppSDKException(resultType2);
                    }
                }
            } catch (JSONException e5) {
                OperationResultListener operationResultListener3 = OperationResultListener.getInstance(this.mContext);
                OperationResultListener.ListenerOperationType listenerOperationType3 = OperationResultListener.ListenerOperationType.LIST_REG;
                ResultType resultType3 = ResultType.SERVER_ERROR;
                operationResultListener3.onFailure(listenerOperationType3, new AppSDKException(resultType3), map);
                throw new AppSDKException(resultType3, e5);
            }
        }
        IOperationResultListener.OperationData operationData = new IOperationResultListener.OperationData();
        operationData.registrations = jSONArray2;
        operationData.protocolFamily = protocolType.protocolName();
        OperationResultListener.getInstance(this.mContext).onComplete(OperationResultListener.ListenerOperationType.LIST_REG, operationData, map);
    }

    private boolean a(String str, HashMap<String, String> map) {
        String str2;
        if (map != null && map.containsKey(EXTRA_KEY_EXCLUDE_AUTHENTICATORS)) {
            Charset charset = Charsets.utf8Charset;
            String asString = JsonParser.parseString(new String(Base64.decode(str.getBytes(charset), 8), charset)).getAsJsonArray().get(1).getAsString();
            if (map.containsKey(EXTRA_KEY_EXCLUDE_AUTHENTICATORS) && (str2 = map.get(EXTRA_KEY_EXCLUDE_AUTHENTICATORS)) != null) {
                Iterator<JsonElement> it = JsonParser.parseString(str2).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    if (it.next().getAsString().equals(asString)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
