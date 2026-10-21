package com.noknok.android.client.oobsdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Base64;
import android.webkit.URLUtil;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ExtensionList;
import com.noknok.android.client.appsdk.OperationType;
import com.noknok.android.client.appsdk.ProtocolType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.jsonapi.Message;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.AuthenticationData;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import com.noknok.android.client.appsdk_plus.IOperationResultListener;
import com.noknok.android.client.appsdk_plus.IRestClient;
import com.noknok.android.client.appsdk_plus.OperationResultListener;
import com.noknok.android.client.appsdk_plus.RestParams;
import com.noknok.android.client.appsdk_plus.RestRequest;
import com.noknok.android.client.appsdk_plus.RestResponse;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.extension.IExtensionList;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"MissingPermission"})
public class OOBRequestProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IRestClient f63366b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tabulator f63365a = Tabulator.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63367c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63368d = null;

    /* JADX INFO: renamed from: com.noknok.android.client.oobsdk.OOBRequestProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63369a;

        static {
            int[] iArr = new int[ResultType.values().length];
            f63369a = iArr;
            try {
                iArr[ResultType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63369a[ResultType.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63369a[ResultType.SYSTEM_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63369a[ResultType.NO_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63369a[ResultType.USER_NOT_ENROLLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63369a[ResultType.USER_LOCKOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63369a[ResultType.AUTHENTICATOR_UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f63369a[ResultType.USER_NOT_RESPONSIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63369a[ResultType.KEY_DISAPPEARED_PERMANENTLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum CommandMode {
        WITH_RESPONSE,
        WITHOUT_RESPONSE
    }

    public static class OobData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f63371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f63372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AppSDK2.Operation f63373c = AppSDK2.Operation.UNKNOWN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f63374d;
    }

    private JsonObject b(String str) {
        Charset charset = Charsets.utf8Charset;
        return JsonParser.parseString(new String(Base64.decode(str.getBytes(charset), 8), charset)).getAsJsonObject();
    }

    public final AuthenticationData a(ActivityProxy activityProxy, OobData oobData, HashMap<String, String> map) throws Throwable {
        Throwable th2;
        IllegalArgumentException illegalArgumentException;
        JsonParseException jsonParseException;
        boolean zContainsKey;
        AppSDK2.ResponseData responseDataA;
        String str = IAppSDKPlus.EXTRA_KEY_OOBREFID;
        try {
            try {
                Context applicationContext = activityProxy.getApplicationContext();
                if (map != null) {
                    try {
                        zContainsKey = map.containsKey("remote");
                    } catch (JsonParseException e5) {
                        jsonParseException = e5;
                    } catch (IllegalArgumentException e7) {
                        illegalArgumentException = e7;
                        throw new AppSDKException(ResultType.FAILURE, "Failed due to illegal arguments", illegalArgumentException);
                    } catch (Throwable th3) {
                        th2 = th3;
                        str = AppSDKPlus.AUTH_TIME;
                        this.f63365a.endTimer(AppSDKPlus.INIT_AUTH_TIME);
                        this.f63365a.endTimer(AppSDKPlus.FINISH_AUTH_TIME);
                        this.f63365a.endTimer(str);
                        throw th2;
                    }
                } else {
                    zContainsKey = false;
                }
                AppSDK2.Operation operation = oobData.f63373c;
                AppSDK2.Operation operation2 = AppSDK2.Operation.OOB_AUTH;
                if (operation == operation2) {
                    this.f63365a.startTimer(AppSDKPlus.AUTH_TIME);
                    this.f63365a.startTimer(AppSDKPlus.INIT_AUTH_TIME);
                }
                IRestClient iRestClient = this.f63366b;
                try {
                    RestResponse restResponseFromJSON = RestResponse.fromJSON(iRestClient.sendRequest(a(map).setOperation(OperationType.valueOf("INIT_" + oobData.f63373c.toString())).setRequest(a(activityProxy, oobData.f63373c, oobData.f63374d, zContainsKey)).setOobRefId(oobData.f63372b).toJSON(), new RestParams().setServerUrl(oobData.f63371a).setExtras(map)).toString());
                    this.f63365a.updateMetricTime(applicationContext, AppSDKPlus.INIT_AUTH_TIME);
                    try {
                        if (RestResponse.SERVER_CANCELED.equals(restResponseFromJSON.statusCode)) {
                            throw new AppSDKException(ResultType.CANCELED);
                        }
                        String str2 = restResponseFromJSON.message;
                        if (str2 == null) {
                            throw new AppSDKException(ResultType.SERVER_ERROR);
                        }
                        JsonObject jsonObjectB = b(str2);
                        if (jsonObjectB.has(IAppSDKPlus.EXTRA_KEY_OOBREFID)) {
                            try {
                                oobData.f63372b = jsonObjectB.get(IAppSDKPlus.EXTRA_KEY_OOBREFID).getAsString();
                            } catch (JsonParseException e10) {
                                jsonParseException = e10;
                            } catch (IllegalArgumentException e11) {
                                illegalArgumentException = e11;
                                throw new AppSDKException(ResultType.FAILURE, "Failed due to illegal arguments", illegalArgumentException);
                            } catch (Throwable th4) {
                                th2 = th4;
                                str = AppSDKPlus.AUTH_TIME;
                                this.f63365a.endTimer(AppSDKPlus.INIT_AUTH_TIME);
                                this.f63365a.endTimer(AppSDKPlus.FINISH_AUTH_TIME);
                                this.f63365a.endTimer(str);
                                throw th2;
                            }
                        }
                        AppSDK2.RPData rPData = new AppSDK2.RPData();
                        rPData.remote = zContainsKey;
                        AppSDKPlus.initRpDataWithExtras(rPData, map);
                        if (!OobReceiver.instance().areUrlsSet()) {
                            a(rPData, oobData.f63371a);
                        }
                        if (map == null || !"true".equals(map.remove(IAppSDKPlus.EXTRA_KEY_CANCEL_PENDING_AUTH))) {
                            responseDataA = a(activityProxy, CommandMode.WITH_RESPONSE, restResponseFromJSON.message, rPData);
                        } else {
                            responseDataA = new AppSDK2.ResponseData();
                            responseDataA.status = ResultType.CANCELED;
                            responseDataA.subSystem = AppSDKException.SubSystem.NON_FIDO;
                        }
                        ResultType resultType = responseDataA.status;
                        ResultType resultType2 = ResultType.SUCCESS;
                        if (resultType != resultType2) {
                            a(oobData, restResponseFromJSON.message, map);
                            throw new AppSDKException(responseDataA.status).setSubSystem(responseDataA.subSystem);
                        }
                        if (oobData.f63373c == operation2) {
                            this.f63365a.startTimer(AppSDKPlus.FINISH_AUTH_TIME);
                        }
                        String strGenerateRegName = (map == null || !map.containsKey(IAppSDKPlus.EXTRA_KEY_REGISTRATION_NAME)) ? responseDataA.generateRegName(responseDataA.additionalData, applicationContext) : map.get(IAppSDKPlus.EXTRA_KEY_REGISTRATION_NAME);
                        RestResponse restResponseFromJSON2 = RestResponse.fromJSON(this.f63366b.sendRequest(a(map).setOperation(OperationType.valueOf("FINISH_" + oobData.f63373c.toString())).setRequest(responseDataA.message).setOobRefId(oobData.f63372b).setAuthenticatorName(strGenerateRegName).toJSON(), new RestParams().setServerUrl(oobData.f63371a).setExtras(map)).toString());
                        this.f63365a.updateMetricTime(applicationContext, AppSDKPlus.FINISH_AUTH_TIME);
                        String str3 = restResponseFromJSON2.message;
                        if (str3 != null) {
                            a(activityProxy, CommandMode.WITHOUT_RESPONSE, str3, (AppSDK2.RPData) null);
                        }
                        JsonObject jsonObject = restResponseFromJSON2.additionalInfo;
                        if (jsonObject != null && jsonObject.has(IAppSDKPlus.EXTRA_KEY_OOBREFID)) {
                            oobData.f63372b = restResponseFromJSON2.additionalInfo.get(IAppSDKPlus.EXTRA_KEY_OOBREFID).getAsString();
                        }
                        ResultType resultType3 = restResponseFromJSON2.getResultType();
                        if (resultType3 != resultType2) {
                            throw new AppSDKException(resultType3);
                        }
                        AuthenticationData authenticationData = new AuthenticationData();
                        authenticationData.additionalInfo = restResponseFromJSON2.additionalInfo;
                        JsonObject jsonObjectB2 = b(restResponseFromJSON2.message);
                        if (jsonObjectB2.has("userName")) {
                            HashMap<String, String> map2 = new HashMap<>();
                            authenticationData.profileData = map2;
                            map2.put("userName", jsonObjectB2.get("userName").getAsString());
                        }
                        this.f63365a.updateMetricTime(applicationContext, AppSDKPlus.AUTH_TIME);
                        authenticationData.oobRefId = oobData.f63372b;
                        authenticationData.operation = oobData.f63373c;
                        IOperationResultListener.OperationData operationData = new IOperationResultListener.OperationData();
                        operationData.protocolFamily = ProtocolType.getByName(b(responseDataA.message).get("protocol").getAsString()).protocolName();
                        operationData.additionalInfo = authenticationData.additionalInfo;
                        operationData.quickData = authenticationData.quickData;
                        HashMap<String, String> map3 = authenticationData.profileData;
                        if (map3 != null) {
                            operationData.username = map3.get("userName");
                        }
                        operationData.authenticatorAttachment = responseDataA.isPlatformAuthenticator ? k.a.f65035b : "cross-platform";
                        OperationResultListener.ListenerOperationType listenerOperationType = OperationResultListener.ListenerOperationType.AUTH;
                        if (oobData.f63373c.equals(AppSDK2.Operation.OOB_REG)) {
                            listenerOperationType = OperationResultListener.ListenerOperationType.REG;
                        }
                        OperationResultListener.getInstance(applicationContext).onComplete(listenerOperationType, operationData, map);
                        this.f63365a.endTimer(AppSDKPlus.INIT_AUTH_TIME);
                        this.f63365a.endTimer(AppSDKPlus.FINISH_AUTH_TIME);
                        this.f63365a.endTimer(AppSDKPlus.AUTH_TIME);
                        return authenticationData;
                    } catch (JsonParseException e12) {
                        e = e12;
                        jsonParseException = e;
                    } catch (IllegalArgumentException e13) {
                        e = e13;
                        illegalArgumentException = e;
                        throw new AppSDKException(ResultType.FAILURE, "Failed due to illegal arguments", illegalArgumentException);
                    }
                } catch (JsonParseException e14) {
                    e = e14;
                } catch (IllegalArgumentException e15) {
                    e = e15;
                } catch (Throwable th5) {
                    th = th5;
                    str = AppSDKPlus.AUTH_TIME;
                    th2 = th;
                    this.f63365a.endTimer(AppSDKPlus.INIT_AUTH_TIME);
                    this.f63365a.endTimer(AppSDKPlus.FINISH_AUTH_TIME);
                    this.f63365a.endTimer(str);
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (JsonParseException e16) {
            e = e16;
        } catch (IllegalArgumentException e17) {
            e = e17;
        } catch (Throwable th7) {
            th = th7;
            str = AppSDKPlus.AUTH_TIME;
        }
        jsonParseException = e;
        throw new AppSDKException(ResultType.SERVER_ERROR, "Failed to parse the JSON", jsonParseException);
    }

    public final OobData c(String str) {
        String str2;
        String str3;
        if (str == null || str.length() == 0) {
            throw new AppSDKException(ResultType.INVALID_QR, "There is no QR message");
        }
        if (URLUtil.isValidUrl(str) && !str.contains("|")) {
            if (!str.contains("nnl-oobdata=")) {
                throw new AppSDKException(ResultType.INVALID_QR, "Invalid Encoding");
            }
            try {
                str = URLDecoder.decode(str.split("nnl-oobdata=")[1], "UTF-8");
            } catch (UnsupportedEncodingException e5) {
                throw new AppSDKException(ResultType.INVALID_QR, "Invalid Encoding", e5);
            }
        }
        OobData oobData = new OobData();
        oobData.f63374d = str;
        String[] strArrSplit = str.split("\\|");
        if (strArrSplit.length == 2) {
            oobData.f63373c = a(strArrSplit[0]);
        } else {
            if (strArrSplit.length <= 2) {
                throw new AppSDKException(ResultType.INVALID_QR, "Invalid QR message format");
            }
            oobData.f63371a = strArrSplit[0];
            oobData.f63373c = a(strArrSplit[1]);
            if (strArrSplit.length > 3) {
                oobData.f63372b = strArrSplit[3];
            }
        }
        AppSDK2.Operation operation = oobData.f63373c;
        if (operation == AppSDK2.Operation.OOB_REG && (str3 = this.f63367c) != null) {
            oobData.f63371a = str3;
        } else if (operation == AppSDK2.Operation.OOB_AUTH && (str2 = this.f63368d) != null) {
            oobData.f63371a = str2;
        }
        return oobData;
    }

    public void processMessage(ActivityProxy activityProxy, String str, OobReceiver.ICompletionListener iCompletionListener) {
        processMessage(activityProxy, str, iCompletionListener, null);
    }

    public OOBRequestProcessor setRestClient(IRestClient iRestClient) {
        this.f63366b = iRestClient;
        return this;
    }

    public void setURLs(String str, String str2) {
        this.f63367c = str;
        this.f63368d = str2;
    }

    public void processMessage(ActivityProxy activityProxy, String str, OobReceiver.ICompletionListener iCompletionListener, HashMap<String, String> map) {
        new ProcessQRTask().a(iCompletionListener).a(this).a(str).a(map).execute(activityProxy);
    }

    private void a(OobData oobData, String str, HashMap<String, String> map) {
        Gson gson = new Gson();
        Charset charset = Charsets.utf8Charset;
        String str2 = ((Message) gson.fromJson(new String(Base64.decode(str.getBytes(charset), 8), charset), Message.class)).server.nnlData;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        this.f63366b.sendRequest(a(map).setOperation(OperationType.valueOf("CANCEL_" + oobData.f63373c.toString())).setNnlData(str2).setOobRefId(oobData.f63372b).toJSON(), new RestParams().setServerUrl(oobData.f63371a).setExtras(map));
    }

    private void a(AppSDK2.RPData rPData, String str) {
        String str2;
        try {
            String[] strArrSplit = new URI(str).getHost().split("[.]");
            if (strArrSplit.length > 1) {
                str2 = strArrSplit[strArrSplit.length - 2] + Constant.DOT_STRING + strArrSplit[strArrSplit.length - 1];
            } else {
                str2 = null;
            }
        } catch (URISyntaxException e5) {
            Logger.e("OOBRequestProcessor", "unable to get domain for URL :" + str, e5);
        }
        if (rPData.extensions == null) {
            rPData.extensions = new ExtensionList();
        }
        if (str2 == null) {
            return;
        }
        IExtensionList iExtensionList = rPData.extensions;
        Charset charset = Charsets.utf8Charset;
        iExtensionList.addExtension(ExtensionManager.OOB_DOMAIN_EXT_ID, new String(Base64.encode(str2.getBytes(charset), 11), charset), false);
    }

    private String a(ActivityProxy activityProxy, AppSDK2.Operation operation, String str, boolean z10) {
        AppSDK2.RPData rPData = new AppSDK2.RPData();
        rPData.remote = z10;
        rPData.OOBData = str;
        rPData.setCallerActivityProxy(activityProxy);
        AppSDK2.ResponseData responseDataInitOperation = OobReceiver.instance().getAppSDK2().initOperation(operation, rPData);
        if (responseDataInitOperation.status == ResultType.SUCCESS) {
            return responseDataInitOperation.message;
        }
        throw new AppSDKException(ResultType.FAILURE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private AppSDK2.ResponseData a(ActivityProxy activityProxy, CommandMode commandMode, String str, AppSDK2.RPData rPData) throws Throwable {
        if (rPData == null) {
            rPData = new AppSDK2.RPData();
        }
        rPData.setCallerActivityProxy(activityProxy);
        HashMap map = new HashMap();
        rPData.channelBindings = map;
        map.put("serverEndPoint", null);
        rPData.channelBindings.put("tlsServerCertificate", null);
        rPData.channelBindings.put(ClientData.KEY_CID_PUBKEY, null);
        rPData.channelBindings.put("tlsUnique", null);
        AppSDK2.ResponseData responseDataProcess = OobReceiver.instance().getAppSDK2().process(rPData, str);
        switch (AnonymousClass1.f63369a[responseDataProcess.status.ordinal()]) {
            case 1:
                if (commandMode == CommandMode.WITH_RESPONSE && responseDataProcess.message == null) {
                    responseDataProcess.status = ResultType.FAILURE;
                }
                return responseDataProcess;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return responseDataProcess;
            default:
                responseDataProcess.status = ResultType.FAILURE;
                return responseDataProcess;
        }
    }

    private RestRequest a(Map<String, String> map) {
        String str;
        RestRequest restRequest = new RestRequest();
        if (map != null && (str = map.get("options")) != null) {
            restRequest.setOptionsData(JsonParser.parseString(str).getAsJsonObject());
        }
        return restRequest;
    }

    private AppSDK2.Operation a(String str) {
        str.getClass();
        if (str.equals("a")) {
            return AppSDK2.Operation.OOB_AUTH;
        }
        if (str.equals("r")) {
            return AppSDK2.Operation.OOB_REG;
        }
        throw new AppSDKException(ResultType.SERVER_ERROR);
    }
}
