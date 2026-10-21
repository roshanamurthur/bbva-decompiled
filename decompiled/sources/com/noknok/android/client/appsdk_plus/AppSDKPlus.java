package com.noknok.android.client.appsdk_plus;

import android.app.Activity;
import android.content.Context;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ErrorInfoHelper;
import com.noknok.android.client.appsdk.ExtensionList;
import com.noknok.android.client.appsdk.OperationType;
import com.noknok.android.client.appsdk.ProtocolType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.common.DeviceIDUtil;
import com.noknok.android.client.appsdk.jsonapi.QuickData;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppUtils;
import com.noknok.android.client.utils.KeyLock;
import com.noknok.android.client.utils.Logger;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AppSDKPlus extends IAppSDKPlus {
    public static final String AUTHENTICATOR_NAME = "authenticatorName";
    public static final String AUTH_TIME = "authTime";
    public static final String DESCRIPTION = "description";
    public static final String FINISH_AUTH_TIME = "finishAuthTime";
    public static final String HANDLE = "handle";
    public static final String ID = "id";
    public static final String INFO = "info";
    public static final String INIT_AUTH_TIME = "initAuthTime";
    public static final String INVALID_FINISH_AUTH = "invalidFinishAuth";
    public static final String INVALID_INIT_AUTH = "invalidInitAuth";
    public static final String LAST_USED_TIMESTAMP = "lastUsedTimeStamp";
    public static final String UNKNOWN = "UNKNOWN";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f62917c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClientAPI f62918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tabulator f62919b;

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk_plus.AppSDKPlus$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62920a;

        static {
            int[] iArr = new int[ProtocolType.values().length];
            f62920a = iArr;
            try {
                iArr[ProtocolType.UAF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62920a[ProtocolType.FIDO2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum QRType {
        APP_RP_SPECIFIC,
        APP_ANY_RP,
        UNIVERSAL_RP_SPECIFIC,
        UNIVERSAL_ANY_RP
    }

    public AppSDKPlus(AppSdkPlusConfig appSdkPlusConfig, Context context) {
        super(appSdkPlusConfig, context);
        this.f62919b = Tabulator.getInstance();
        this.f62918a = new ClientAPI(this.mContext, appSdkPlusConfig.protocolType);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    private QRCodeSession a(SessionData sessionData, AppSDK2.Operation operation, HashMap<String, String> map) {
        OperationType operationType;
        String str;
        QRType qRTypeValueOf;
        String str2;
        IllegalArgumentException illegalArgumentException;
        AppSDKException appSDKException;
        if (operation.equals(AppSDK2.Operation.OOB_REG)) {
            operationType = OperationType.START_OOB_REG;
            str = this.mAppSdkPlusConfig.regServerURL;
        } else {
            operationType = OperationType.START_OOB_AUTH;
            str = this.mAppSdkPlusConfig.authServerURL;
        }
        String str3 = str;
        RestResponse restResponse = null;
        if (map != null) {
            try {
                qRTypeValueOf = map.containsKey(IAppSDKPlus.EXTRA_KEY_QR_TYPE) ? QRType.valueOf(map.get(IAppSDKPlus.EXTRA_KEY_QR_TYPE)) : null;
                str2 = map.containsKey(IAppSDKPlus.EXTRA_KEY_QR_WEB_URL) ? map.get(IAppSDKPlus.EXTRA_KEY_QR_WEB_URL) : null;
            } catch (IllegalArgumentException e5) {
                illegalArgumentException = e5;
                appSDKException = new AppSDKException(ResultType.INVALID_QR, "Failed to create bitmap", illegalArgumentException);
                if (restResponse != null) {
                    ErrorInfoHelper.setCorrelationID(appSDKException, restResponse.id);
                    ErrorInfoHelper.setAdditionalErrorInfo(appSDKException, restResponse.additionalErrorInfo);
                }
                ErrorInfoHelper.setServerStatusCode(appSDKException, 0);
                ErrorInfoHelper.setOperationType(appSDKException, operationType);
                throw appSDKException;
            }
        } else {
            str2 = null;
            qRTypeValueOf = null;
        }
        RestRequest correlationId = new RestRequest().setOperation(operationType).setOobMode(true, qRTypeValueOf, str2, true).setCorrelationId(getCorrelationID(map));
        if (map != null && map.containsKey(IAppSDKPlus.EXTRA_KEY_OOBREFID)) {
            correlationId.setOobRefId(map.get(IAppSDKPlus.EXTRA_KEY_OOBREFID));
        }
        RestResponse restResponseFromJSON = RestResponse.fromJSON(this.mRestClient.sendRequest(correlationId.toJSON(), new RestParams().setServerUrl(str3).setSessionData(sessionData).setSessionKeys(this.mSessionKeys)));
        try {
            String str4 = restResponseFromJSON.statusCode;
            if (restResponseFromJSON.getResultType() != ResultType.SUCCESS) {
                throw new AppSDKException(ResultType.SERVER_ERROR);
            }
            RestResponse.ModeResult modeResult = restResponseFromJSON.modeResult;
            if (modeResult.rawData != null || restResponseFromJSON.oobStatusHandle != null) {
                if (modeResult.qrCode.qrImage != null) {
                    return new QRCodeSession(this, sessionData, modeResult, operation, restResponseFromJSON.oobStatusHandle, str3, this.mRestClient, map);
                }
            }
            Logger.e("AppSDKPlus", "Server Error");
            throw new AppSDKException(ResultType.SERVER_ERROR);
        } catch (IllegalArgumentException e7) {
            illegalArgumentException = e7;
            restResponse = restResponseFromJSON;
            appSDKException = new AppSDKException(ResultType.INVALID_QR, "Failed to create bitmap", illegalArgumentException);
            if (restResponse != null) {
                ErrorInfoHelper.setCorrelationID(appSDKException, restResponse.id);
                ErrorInfoHelper.setAdditionalErrorInfo(appSDKException, restResponse.additionalErrorInfo);
            }
            ErrorInfoHelper.setServerStatusCode(appSDKException, 0);
            ErrorInfoHelper.setOperationType(appSDKException, operationType);
            throw appSDKException;
        }
    }

    public static String getActiveUser() {
        return f62917c;
    }

    public static void initRpDataWithExtras(AppSDK2.RPData rPData, HashMap<String, String> map) {
        String str;
        if (map == null) {
            return;
        }
        if (map.containsKey(IAppSDKPlus.EXTRA_KEY_USER_DISPLAY_NAME)) {
            rPData.userDisplayName = map.get(IAppSDKPlus.EXTRA_KEY_USER_DISPLAY_NAME);
        }
        if (map.containsKey("userName")) {
            rPData.userName = map.get("userName");
        }
        if (map.containsKey(IAppSDKPlus.EXTRA_KEY_QR_SUPPORTED) && (str = map.get(IAppSDKPlus.EXTRA_KEY_QR_SUPPORTED)) != null) {
            if (str.equals("true")) {
                rPData.qrSupported = true;
            } else if (str.equals("false")) {
            }
            rPData.qrSupported = false;
        }
        if (map.containsKey(IAppSDKPlus.EXTRA_KEY_EXTENSIONS)) {
            rPData.extensions = new ExtensionList(JsonParser.parseString(map.get(IAppSDKPlus.EXTRA_KEY_EXTENSIONS)).getAsJsonArray());
        }
        if ("true".equals(map.get(IAppSDKPlus.EXTRA_KEY_QUICK_ENABLE))) {
            rPData.quickData = new QuickData();
        } else if (map.containsKey(IAppSDKPlus.EXTRA_KEY_QUICK_DATA)) {
            rPData.quickData = QuickData.fromJson(map.get(IAppSDKPlus.EXTRA_KEY_QUICK_DATA));
        }
        if (IAppSDKPlus.USER_MEDIATION_CONDITIONAL.equals(map.get(IAppSDKPlus.EXTRA_KEY_USER_MEDIATION))) {
            rPData.setSharedPasskeyEnabled(true);
        }
    }

    public static void setActiveUser(String str) {
        f62917c = str;
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public AuthenticationData authenticate(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map) {
        return a(sessionData, (String) null, a(activityProxy, false, this.mAppSdkPlusConfig.remote, map), map);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public void checkAuthPossible(ActivityProxy activityProxy, String str, String str2) {
        this.f62918a.checkAuthPossible(activityProxy, str, str2);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public AuthenticationData checkRegPossible(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map) {
        return a(sessionData, a(activityProxy, true, this.mAppSdkPlusConfig.remote, map), map);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public void checkTransPossible(ActivityProxy activityProxy, SessionData sessionData, String str, HashMap<String, String> map) throws Throwable {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("TransactionID could not be null or empty");
        }
        a(sessionData, str, a(activityProxy, true, this.mAppSdkPlusConfig.remote, map), map);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public void clearLocalRegistrations(ActivityProxy activityProxy, String str, String str2) {
        this.f62918a.clearLocalRegistrations(activityProxy, str, str2);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public void deleteAllRegistrations(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map) {
        a(activityProxy, sessionData, (String) null, map);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public void deleteRegistration(ActivityProxy activityProxy, SessionData sessionData, String str, HashMap<String, String> map) {
        if (str == null || str.isEmpty()) {
            throw new AppSDKException(ResultType.FAILURE, "Registration ID could not be empty");
        }
        a(activityProxy, sessionData, str, map);
    }

    @Deprecated
    public JSONObject discover(Activity activity) {
        ActivityProxy activityProxyCreateActivityProxy = createActivityProxy(activity);
        try {
            return discover(activityProxyCreateActivityProxy);
        } finally {
            activityProxyCreateActivityProxy.finish();
        }
    }

    public AppSdkPlusConfig getAppSdkPlusConfig() {
        return this.mAppSdkPlusConfig;
    }

    public String getDeviceId() {
        return new DeviceIDUtil(this.mContext).getDeviceId();
    }

    public QRCodeSession getQRCodeForAuth(SessionData sessionData, HashMap<String, String> map) {
        return a(sessionData, AppSDK2.Operation.OOB_AUTH, map);
    }

    public QRCodeSession getQRCodeForReg(SessionData sessionData, HashMap<String, String> map) {
        return a(sessionData, AppSDK2.Operation.OOB_REG, map);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public void hasPlatformAuthenticator(ActivityProxy activityProxy) {
        this.f62918a.b(activityProxy);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public AuthenticationData register(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map) {
        return a(sessionData, a(activityProxy, false, this.mAppSdkPlusConfig.remote, map), map);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public AuthenticationData transact(ActivityProxy activityProxy, SessionData sessionData, String str, HashMap<String, String> map) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("TransactionID could not be null or empty");
        }
        return a(sessionData, str, a(activityProxy, false, this.mAppSdkPlusConfig.remote, map), map);
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public void updateRegistration(ActivityProxy activityProxy, SessionData sessionData, String str, RegData regData, HashMap<String, String> map) {
        RestResponse restResponse = null;
        try {
            if (RestResponse.fromJSON(this.mRestClient.sendRequest(new RestRequest().setOperation(OperationType.UPDATE_REG).setRequest(this.f62918a.a(AppSDK2.Operation.UPDATE_REG, a(activityProxy, false, this.mAppSdkPlusConfig.remote, map))).setHandle(str).setRegData(regData.toJsonArray()).setProtocolFamily(this.mAppSdkPlusConfig.protocolType.protocolName()).setCorrelationId(getCorrelationID(map)).toJSON(), new RestParams().setServerUrl(this.mAppSdkPlusConfig.regServerURL).setSessionData(sessionData).setSessionKeys(this.mSessionKeys).setExtras(map))).getResultType() != ResultType.SUCCESS) {
                throw new AppSDKException(ResultType.SERVER_ERROR);
            }
            IOperationResultListener.OperationData operationData = new IOperationResultListener.OperationData();
            operationData.handle = str;
            OperationResultListener.getInstance(this.mContext).onComplete(OperationResultListener.ListenerOperationType.RENAME_REG, operationData, map);
        } catch (AppSDKException e5) {
            if (0 != 0) {
                ErrorInfoHelper.setCorrelationID(e5, restResponse.id);
            }
            ErrorInfoHelper.setOperationType(e5, OperationType.UPDATE_REG);
            OperationResultListener.getInstance(this.mContext).onFailure(OperationResultListener.ListenerOperationType.RENAME_REG, e5, map);
            throw e5;
        }
    }

    @Override // com.noknok.android.client.appsdk_plus.IAppSDKPlus
    public void checkAuthPossible(ActivityProxy activityProxy, SessionData sessionData, HashMap<String, String> map) throws Throwable {
        a(sessionData, (String) null, a(activityProxy, true, this.mAppSdkPlusConfig.remote, map), map);
    }

    public JSONObject discover(ActivityProxy activityProxy) {
        JSONObject jSONObjectA = this.f62918a.a(activityProxy);
        Logger.i("AppSDKPlus", "Discovery Data: " + jSONObjectA);
        return jSONObjectA;
    }

    private AppSDK2.RPData a(ActivityProxy activityProxy, boolean z10, boolean z11, HashMap<String, String> map) {
        AppSDK2.RPData remote = new AppSDK2.RPData().setCallerActivityProxy(activityProxy).setCheckPolicy(z10).setRemote(z11);
        initRpDataWithExtras(remote, map);
        return remote;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01bb A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #3 {all -> 0x0078, blocks: (B:3:0x000a, B:4:0x0014, B:5:0x0058, B:8:0x0066, B:10:0x0070, B:15:0x007f, B:17:0x008b, B:19:0x008f, B:25:0x00aa, B:27:0x00b0, B:29:0x00bf, B:30:0x00c1, B:31:0x00fb, B:33:0x00ff, B:35:0x0105, B:38:0x0111, B:39:0x0116, B:41:0x011e, B:43:0x012b, B:44:0x0132, B:45:0x013a, B:46:0x013b, B:49:0x0141, B:50:0x0149, B:54:0x0175, B:56:0x017f, B:58:0x0183, B:60:0x0189, B:61:0x018e, B:73:0x01bb, B:74:0x01c0, B:75:0x01ce, B:28:0x00b7, B:66:0x01a5, B:67:0x01b4), top: B:82:0x000a }] */
    private AuthenticationData a(SessionData sessionData, AppSDK2.RPData rPData, HashMap<String, String> map) {
        OperationType operationType;
        String strGenerateRegName;
        AuthenticationData authenticationData = new AuthenticationData();
        RestResponse restResponse = null;
        try {
            try {
                String strA = this.f62918a.a(AppSDK2.Operation.REG, rPData);
                operationType = OperationType.INIT_REG;
                try {
                    JsonObject json = new RestRequest().setOperation(operationType).setDisplayName(rPData.userDisplayName).setCorrelationId(getCorrelationID(map)).setRequest(strA).toJSON();
                    RestParams extras = new RestParams().setServerUrl(this.mAppSdkPlusConfig.regServerURL).setSessionData(sessionData).setSessionKeys(this.mSessionKeys).setExtras(map);
                    RestResponse restResponseFromJSON = RestResponse.fromJSON(this.mRestClient.sendRequest(json, extras));
                    try {
                        String str = restResponseFromJSON.statusCode;
                        String str2 = restResponseFromJSON.message;
                        ResultType resultType = restResponseFromJSON.getResultType();
                        ResultType resultType2 = ResultType.SUCCESS;
                        if (resultType == resultType2 && str2 != null) {
                            rPData.channelBindings = extras.getChannelBindings();
                            if (!rPData.checkPolicy) {
                                KeyLock.getInstance().activate();
                            }
                            AppSDK2.ResponseData responseDataA = this.f62918a.a(str2, rPData);
                            String str3 = responseDataA.message;
                            if (rPData.checkPolicy) {
                                if (responseDataA.additionalData == null) {
                                    KeyLock.getInstance().unlock();
                                    return null;
                                }
                                AuthenticationData authenticationData2 = new AuthenticationData();
                                authenticationData2.additionalInfo = responseDataA.additionalData;
                                KeyLock.getInstance().unlock();
                                return authenticationData2;
                            }
                            if (map != null && map.containsKey(IAppSDKPlus.EXTRA_KEY_REGISTRATION_NAME)) {
                                strGenerateRegName = map.get(IAppSDKPlus.EXTRA_KEY_REGISTRATION_NAME);
                            } else {
                                strGenerateRegName = responseDataA.generateRegName(responseDataA.additionalData, this.mContext);
                            }
                            OperationType operationType2 = OperationType.FINISH_REG;
                            try {
                                JsonObject json2 = new RestRequest().setOperation(operationType2).setAuthenticatorName(strGenerateRegName).setRequest(str3).toJSON();
                                RestParams extras2 = new RestParams().setServerUrl(this.mAppSdkPlusConfig.regServerURL).setSessionData(sessionData).setSessionKeys(this.mSessionKeys).setExtras(map);
                                RestResponse restResponseFromJSON2 = RestResponse.fromJSON(this.mRestClient.sendRequest(json2, extras2));
                                try {
                                    String str4 = restResponseFromJSON2.message;
                                    if (str4 != null) {
                                        if (extras2.getChannelBindings() != null) {
                                            rPData.channelBindings = extras2.getChannelBindings();
                                        }
                                        this.f62918a.a(str4, rPData);
                                    }
                                    String str5 = restResponseFromJSON2.statusCode;
                                    ResultType resultType3 = restResponseFromJSON2.getResultType();
                                    if (resultType3 != resultType2) {
                                        AppSDKException appSDKException = new AppSDKException(resultType3);
                                        if (RestResponse.SERVER_SECURITY_EXCEPTION.equals(str5)) {
                                            ErrorInfoHelper.setFacetId(appSDKException, a());
                                        }
                                        ErrorInfoHelper.setServerStatusCode(appSDKException, str5);
                                        ErrorInfoHelper.setAdditionalErrorInfo(appSDKException, restResponseFromJSON2.additionalErrorInfo);
                                        throw appSDKException;
                                    }
                                    if (rPData.quickData != null && str4 != null) {
                                        authenticationData.quickData = QuickData.fromServer(str4, this.mContext);
                                    }
                                    authenticationData.sessionData = extras2.getSessionData();
                                    authenticationData.additionalInfo = restResponseFromJSON2.additionalInfo;
                                    authenticationData.isPlatformAuthenticator = responseDataA.isPlatformAuthenticator;
                                    IOperationResultListener.OperationData operationData = new IOperationResultListener.OperationData();
                                    String strProtocolName = responseDataA.protocolFamily.protocolName();
                                    operationData.protocolFamily = strProtocolName;
                                    operationData.additionalInfo = authenticationData.additionalInfo;
                                    operationData.quickData = authenticationData.quickData;
                                    operationData.authenticatorAttachment = authenticationData.isPlatformAuthenticator ? k.a.f65035b : "cross-platform";
                                    if ("web".equals(strProtocolName) && authenticationData.quickData != null && !map.containsKey(IAppSDKPlus.EXTRA_KEY_QUICK_AUTH_DATA_KEY_NAME)) {
                                        map.put(IAppSDKPlus.EXTRA_KEY_QUICK_AUTH_DATA_KEY_NAME, IAppSDKPlus.QUICK_AUTH_FIDO2_DATA_KEY_NAME);
                                    }
                                    OperationResultListener.getInstance(this.mContext).onComplete(OperationResultListener.ListenerOperationType.REG, operationData, map);
                                    KeyLock.getInstance().unlock();
                                    return authenticationData;
                                } catch (AppSDKException e5) {
                                    e = e5;
                                    operationType = operationType2;
                                    restResponse = restResponseFromJSON2;
                                    if (restResponse != null) {
                                        ErrorInfoHelper.setCorrelationID(e, restResponse.id);
                                    }
                                    ErrorInfoHelper.setOperationType(e, operationType);
                                    OperationResultListener.getInstance(this.mContext).onFailure(OperationResultListener.ListenerOperationType.REG, e, map);
                                    throw e;
                                }
                            } catch (AppSDKException e7) {
                                e = e7;
                                operationType = operationType2;
                                restResponse = restResponseFromJSON;
                                if (restResponse != null) {
                                    ErrorInfoHelper.setCorrelationID(e, restResponse.id);
                                }
                                ErrorInfoHelper.setOperationType(e, operationType);
                                OperationResultListener.getInstance(this.mContext).onFailure(OperationResultListener.ListenerOperationType.REG, e, map);
                                throw e;
                            }
                        }
                        AppSDKException appSDKException2 = new AppSDKException(ResultType.SERVER_ERROR);
                        ErrorInfoHelper.setServerStatusCode(appSDKException2, str);
                        ErrorInfoHelper.setAdditionalErrorInfo(appSDKException2, restResponseFromJSON.additionalErrorInfo);
                        throw appSDKException2;
                    } catch (AppSDKException e10) {
                        e = e10;
                    }
                } catch (AppSDKException e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                KeyLock.getInstance().unlock();
                throw th2;
            }
        } catch (AppSDKException e12) {
            e = e12;
            operationType = null;
        }
    }

    private void a(ActivityProxy activityProxy, SessionData sessionData, String str, HashMap<String, String> map) {
        RestResponse restResponseFromJSON = null;
        try {
            AppSDK2.RPData rPDataA = a(activityProxy, false, this.mAppSdkPlusConfig.remote, map);
            RestRequest correlationId = new RestRequest().setOperation(OperationType.DELETE_REG).setCorrelationId(getCorrelationID(map));
            RestParams extras = new RestParams().setServerUrl(this.mAppSdkPlusConfig.regServerURL).setSessionData(sessionData).setSessionKeys(this.mSessionKeys).setExtras(map);
            correlationId.setRequest(this.f62918a.a(AppSDK2.Operation.DELETE_REG, rPDataA));
            if (str != null && !str.isEmpty()) {
                correlationId.setHandle(str);
            } else if (!this.mAppSdkPlusConfig.protocolType.equals(ProtocolType.BOTH)) {
                correlationId.setProtocolFamily(this.mAppSdkPlusConfig.protocolType.protocolName());
            }
            restResponseFromJSON = RestResponse.fromJSON(this.mRestClient.sendRequest(correlationId.toJSON(), extras));
            String str2 = restResponseFromJSON.statusCode;
            if (str2 != null && restResponseFromJSON.message != null) {
                if (!str2.equals(RestResponse.SERVER_USER_NOT_FOUND)) {
                    if (restResponseFromJSON.statusCode.equals(RestResponse.SERVER_SUCCESS)) {
                        try {
                            this.f62918a.a(restResponseFromJSON.message, rPDataA);
                        } catch (AppSDKException e5) {
                            if (!e5.getResultType().equals(ResultType.NOT_INSTALLED)) {
                                throw e5;
                            }
                        }
                        IOperationResultListener.OperationData operationData = new IOperationResultListener.OperationData();
                        operationData.handle = str;
                        OperationResultListener.getInstance(this.mContext).onComplete(OperationResultListener.ListenerOperationType.DELETE_REG, operationData, map);
                        return;
                    }
                    throw new AppSDKException(ResultType.SERVER_ERROR);
                }
                throw new AppSDKException(ResultType.SERVER_USER_NOT_FOUND);
            }
            throw new AppSDKException(ResultType.INVALID_SERVER_RESPONSE);
        } catch (AppSDKException e7) {
            if (restResponseFromJSON != null) {
                ErrorInfoHelper.setCorrelationID(e7, restResponseFromJSON.id);
            }
            ErrorInfoHelper.setOperationType(e7, OperationType.DELETE_REG);
            OperationResultListener.getInstance(this.mContext).onFailure(OperationResultListener.ListenerOperationType.DELETE_REG, e7, map);
            throw e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0280 A[Catch: all -> 0x0270, TryCatch #8 {all -> 0x0270, blocks: (B:115:0x027c, B:117:0x0280, B:118:0x0289, B:120:0x028d, B:121:0x0296, B:123:0x029b, B:124:0x02a0, B:125:0x02ab, B:107:0x0268, B:108:0x026f), top: B:134:0x0268 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x028d A[Catch: all -> 0x0270, TryCatch #8 {all -> 0x0270, blocks: (B:115:0x027c, B:117:0x0280, B:118:0x0289, B:120:0x028d, B:121:0x0296, B:123:0x029b, B:124:0x02a0, B:125:0x02ab, B:107:0x0268, B:108:0x026f), top: B:134:0x0268 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x029b A[Catch: all -> 0x0270, TryCatch #8 {all -> 0x0270, blocks: (B:115:0x027c, B:117:0x0280, B:118:0x0289, B:120:0x028d, B:121:0x0296, B:123:0x029b, B:124:0x02a0, B:125:0x02ab, B:107:0x0268, B:108:0x026f), top: B:134:0x0268 }] */
    private AuthenticationData a(SessionData sessionData, String str, AppSDK2.RPData rPData, HashMap<String, String> map) throws Throwable {
        OperationType operationType;
        OperationType operationType2;
        String str2;
        List<String> stateCookie;
        String str3;
        String tlsCert;
        RestResponse restResponse;
        String strDecode;
        String str4 = INIT_AUTH_TIME;
        AuthenticationData authenticationData = new AuthenticationData();
        RestResponse restResponse2 = new RestResponse();
        RestParams restParams = new RestParams();
        if (!rPData.checkPolicy) {
            this.f62919b.startTimer(AUTH_TIME);
        }
        try {
            try {
                String strA = this.f62918a.a(AppSDK2.Operation.AUTH, rPData);
                boolean z10 = strA == null;
                if (z10) {
                    operationType2 = null;
                    str2 = null;
                } else {
                    OperationType operationType3 = OperationType.INIT_AUTH;
                    try {
                        JsonObject json = new RestRequest().setOperation(operationType3).setRequest(strA).setTransactionId(str).setCorrelationId(getCorrelationID(map)).toJSON();
                        RestParams extras = new RestParams().setServerUrl(this.mAppSdkPlusConfig.authServerURL).setSessionData(sessionData).setSessionKeys(this.mSessionKeys).setExtras(map);
                        if (!rPData.checkPolicy) {
                            this.f62919b.startTimer(INIT_AUTH_TIME);
                        }
                        restResponse2 = RestResponse.fromJSON(this.mRestClient.sendRequest(json, extras));
                        if (!rPData.checkPolicy) {
                            this.f62919b.updateMetricTime(this.mContext, INIT_AUTH_TIME);
                        }
                        ResultType resultType = restResponse2.getResultType();
                        if (resultType == ResultType.SUCCESS) {
                            String str5 = restResponse2.message;
                            if (str5 != null) {
                                if (extras.getChannelBindings() != null) {
                                    rPData.channelBindings = extras.getChannelBindings();
                                }
                                operationType2 = operationType3;
                                restParams = extras;
                                str2 = str5;
                            } else {
                                throw new AppSDKException(ResultType.INVALID_SERVER_RESPONSE);
                            }
                        } else {
                            AppSDKException appSDKException = new AppSDKException(resultType);
                            ErrorInfoHelper.setServerStatusCode(appSDKException, restResponse2.statusCode);
                            ErrorInfoHelper.setAdditionalErrorInfo(appSDKException, restResponse2.additionalErrorInfo);
                            throw appSDKException;
                        }
                    } catch (AppSDKException e5) {
                        e = e5;
                        str4 = INIT_AUTH_TIME;
                        operationType = operationType3;
                    }
                }
                try {
                    if (!rPData.checkPolicy) {
                        try {
                            KeyLock.getInstance().activate();
                        } catch (AppSDKException e7) {
                            e = e7;
                            str4 = INIT_AUTH_TIME;
                            operationType = operationType2;
                            if (operationType == OperationType.INIT_AUTH) {
                                this.f62919b.updateMetric(this.mContext, INVALID_INIT_AUTH);
                            }
                            if (operationType == OperationType.FINISH_AUTH) {
                                this.f62919b.updateMetric(this.mContext, INVALID_FINISH_AUTH);
                            }
                            ErrorInfoHelper.setOperationType(e, operationType);
                            if (restResponse2 != null) {
                                ErrorInfoHelper.setCorrelationID(e, restResponse2.id);
                            }
                            OperationResultListener.getInstance(this.mContext).onFailure(OperationResultListener.ListenerOperationType.AUTH, e, map);
                            throw e;
                        }
                    }
                    AppSDK2.ResponseData responseDataA = this.f62918a.a(str2, rPData);
                    String str6 = responseDataA.message;
                    if (rPData.checkPolicy) {
                        KeyLock.getInstance().unlock();
                        this.f62919b.endTimer(INIT_AUTH_TIME);
                        this.f62919b.endTimer(FINISH_AUTH_TIME);
                        this.f62919b.endTimer(AUTH_TIME);
                        return null;
                    }
                    if (z10) {
                        stateCookie = null;
                        str3 = null;
                        tlsCert = null;
                    } else {
                        tlsCert = restParams.getTlsCert();
                        str3 = restResponse2.additionalData;
                        stateCookie = restParams.getStateCookie();
                    }
                    try {
                        String str7 = restResponse2.returnURL;
                        if (str7 != null) {
                            restResponse = restResponse2;
                            try {
                                try {
                                    strDecode = URLDecoder.decode(str7, "UTF-8");
                                } catch (AppSDKException e10) {
                                    e = e10;
                                    str4 = INIT_AUTH_TIME;
                                    operationType = operationType2;
                                    restResponse2 = restResponse;
                                    if (operationType == OperationType.INIT_AUTH) {
                                        this.f62919b.updateMetric(this.mContext, INVALID_INIT_AUTH);
                                    }
                                    if (operationType == OperationType.FINISH_AUTH) {
                                        this.f62919b.updateMetric(this.mContext, INVALID_FINISH_AUTH);
                                    }
                                    ErrorInfoHelper.setOperationType(e, operationType);
                                    if (restResponse2 != null) {
                                        ErrorInfoHelper.setCorrelationID(e, restResponse2.id);
                                    }
                                    OperationResultListener.getInstance(this.mContext).onFailure(OperationResultListener.ListenerOperationType.AUTH, e, map);
                                    throw e;
                                }
                            } catch (UnsupportedEncodingException e11) {
                                e = e11;
                                try {
                                    try {
                                        throw new AppSDKException(ResultType.INVALID_SERVER_RESPONSE, e);
                                    } catch (AppSDKException e12) {
                                        e = e12;
                                        operationType = operationType2;
                                        restResponse2 = restResponse;
                                        if (operationType == OperationType.INIT_AUTH) {
                                            this.f62919b.updateMetric(this.mContext, INVALID_INIT_AUTH);
                                        }
                                        if (operationType == OperationType.FINISH_AUTH) {
                                            this.f62919b.updateMetric(this.mContext, INVALID_FINISH_AUTH);
                                        }
                                        ErrorInfoHelper.setOperationType(e, operationType);
                                        if (restResponse2 != null) {
                                            ErrorInfoHelper.setCorrelationID(e, restResponse2.id);
                                        }
                                        OperationResultListener.getInstance(this.mContext).onFailure(OperationResultListener.ListenerOperationType.AUTH, e, map);
                                        throw e;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    KeyLock.getInstance().unlock();
                                    this.f62919b.endTimer(str4);
                                    this.f62919b.endTimer(FINISH_AUTH_TIME);
                                    this.f62919b.endTimer(AUTH_TIME);
                                    throw th;
                                }
                            }
                        } else {
                            restResponse = restResponse2;
                            strDecode = null;
                        }
                        String str8 = (strDecode == null || strDecode.isEmpty()) ? this.mAppSdkPlusConfig.authServerURL : strDecode;
                        operationType2 = OperationType.FINISH_AUTH;
                        try {
                            try {
                                JsonObject json2 = new RestRequest().setOperation(operationType2).setRequest(str6).setAdditionalData(str3).setTransactionId(str).toJSON();
                                RestParams extras2 = new RestParams().setServerUrl(str8).setSessionData(sessionData).setSessionKeys(this.mSessionKeys).setStateCookie(stateCookie).setTlsCert(tlsCert).setExtras(map);
                                this.f62919b.startTimer(FINISH_AUTH_TIME);
                                restResponse2 = RestResponse.fromJSON(this.mRestClient.sendRequest(json2, extras2));
                                try {
                                    this.f62919b.updateMetricTime(this.mContext, FINISH_AUTH_TIME);
                                    String str9 = restResponse2.message;
                                    if (str9 != null) {
                                        try {
                                            rPData.channelBindings = extras2.getChannelBindings();
                                            this.f62918a.a(str9, rPData);
                                        } catch (AppSDKException e13) {
                                            e = e13;
                                            operationType = operationType2;
                                            str4 = INIT_AUTH_TIME;
                                        }
                                    }
                                    String str10 = restResponse2.statusCode;
                                    ResultType resultType2 = restResponse2.getResultType();
                                    if (resultType2 != ResultType.SUCCESS) {
                                        AppSDKException appSDKException2 = new AppSDKException(resultType2);
                                        if (RestResponse.SERVER_SECURITY_EXCEPTION.equals(str10)) {
                                            ErrorInfoHelper.setFacetId(appSDKException2, a());
                                        }
                                        ErrorInfoHelper.setServerStatusCode(appSDKException2, str10);
                                        ErrorInfoHelper.setAdditionalErrorInfo(appSDKException2, restResponse2.additionalErrorInfo);
                                        throw appSDKException2;
                                    }
                                    if (rPData.quickData != null && str9 != null) {
                                        authenticationData.quickData = QuickData.fromServer(str9, this.mContext);
                                    }
                                    authenticationData.sessionData = extras2.getSessionData();
                                    authenticationData.additionalInfo = restResponse2.additionalInfo;
                                    if (restResponse2.userName != null) {
                                        HashMap<String, String> map2 = new HashMap<>();
                                        authenticationData.profileData = map2;
                                        map2.put("userName", restResponse2.userName);
                                    }
                                    this.f62919b.updateMetricTime(this.mContext, AUTH_TIME);
                                    IOperationResultListener.OperationData operationData = new IOperationResultListener.OperationData();
                                    operationData.protocolFamily = responseDataA.protocolFamily.protocolName();
                                    operationData.additionalInfo = authenticationData.additionalInfo;
                                    operationData.quickData = authenticationData.quickData;
                                    operationData.username = restResponse2.userName;
                                    OperationResultListener.getInstance(this.mContext).onComplete(OperationResultListener.ListenerOperationType.AUTH, operationData, map);
                                    KeyLock.getInstance().unlock();
                                    this.f62919b.endTimer(INIT_AUTH_TIME);
                                    this.f62919b.endTimer(FINISH_AUTH_TIME);
                                    this.f62919b.endTimer(AUTH_TIME);
                                    return authenticationData;
                                } catch (AppSDKException e14) {
                                    e = e14;
                                    str4 = INIT_AUTH_TIME;
                                    operationType = operationType2;
                                }
                            } catch (AppSDKException e15) {
                                e = e15;
                                str4 = INIT_AUTH_TIME;
                                operationType = operationType2;
                                restResponse2 = restResponse;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str4 = INIT_AUTH_TIME;
                            KeyLock.getInstance().unlock();
                            this.f62919b.endTimer(str4);
                            this.f62919b.endTimer(FINISH_AUTH_TIME);
                            this.f62919b.endTimer(AUTH_TIME);
                            throw th;
                        }
                    } catch (AppSDKException e16) {
                        e = e16;
                        operationType = operationType2;
                    } catch (UnsupportedEncodingException e17) {
                        e = e17;
                        restResponse = restResponse2;
                    }
                    if (operationType == OperationType.INIT_AUTH) {
                        this.f62919b.updateMetric(this.mContext, INVALID_INIT_AUTH);
                    }
                    if (operationType == OperationType.FINISH_AUTH) {
                        this.f62919b.updateMetric(this.mContext, INVALID_FINISH_AUTH);
                    }
                    ErrorInfoHelper.setOperationType(e, operationType);
                    if (restResponse2 != null) {
                        ErrorInfoHelper.setCorrelationID(e, restResponse2.id);
                    }
                    OperationResultListener.getInstance(this.mContext).onFailure(OperationResultListener.ListenerOperationType.AUTH, e, map);
                    throw e;
                } catch (AppSDKException e18) {
                    e = e18;
                    operationType2 = operationType2;
                }
            } catch (AppSDKException e19) {
                e = e19;
                str4 = INIT_AUTH_TIME;
                operationType = null;
            }
        } catch (Throwable th4) {
            th = th4;
            str4 = INIT_AUTH_TIME;
        }
    }

    private String a() {
        int i10 = AnonymousClass1.f62920a[this.mAppSdkPlusConfig.protocolType.ordinal()];
        if (i10 == 1) {
            return AppUtils.computeFacetID(this.mContext, null, AppUtils.Algorithm.SHA1);
        }
        if (i10 != 2) {
            return null;
        }
        return AppUtils.computeFacetID(this.mContext, null, AppUtils.Algorithm.SHA256);
    }
}
