package com.noknok.android.client.appsdk;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import com.noknok.android.client.appsdk.common.DeviceIDUtil;
import com.noknok.android.client.appsdk.jsonapi.App;
import com.noknok.android.client.appsdk.jsonapi.Device;
import com.noknok.android.client.appsdk.jsonapi.DiscoveryInfo;
import com.noknok.android.client.appsdk.jsonapi.Message;
import com.noknok.android.client.appsdk.jsonapi.Notify;
import com.noknok.android.client.appsdk.jsonapi.Protocol;
import com.noknok.android.client.appsdk.jsonapi.ProtocolMessage;
import com.noknok.android.client.appsdk.jsonapi.QuickAuthData;
import com.noknok.android.client.appsdk.jsonapi.QuickData;
import com.noknok.android.client.appsdk.jsonapi.Sdk;
import com.noknok.android.client.appsdk.jsonapi.Server;
import com.noknok.android.client.extension.ExtensionLoader;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.extension.IExtension;
import com.noknok.android.client.extension.IExtensionList;
import com.noknok.android.client.extension.IExtensionProcessor;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.MobileServicesAvailabilityChecker;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AppSDK2 {
    public static final String CLIENT_PROCESS_TIME = "clientProcessTime";
    public static final String INVALID_CLIENT_PROCESS = "invalidClientProcess";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f62852d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f62853e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ProtocolType f62855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Tabulator f62856c;

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk.AppSDK2$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f62858b;

        static {
            int[] iArr = new int[Message.OperationID.values().length];
            f62858b = iArr;
            try {
                iArr[Message.OperationID.INIT_OOB_REG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62858b[Message.OperationID.INIT_OOB_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62858b[Message.OperationID.INIT_REG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62858b[Message.OperationID.INIT_AUTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62858b[Message.OperationID.FINISH_OOB_REG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62858b[Message.OperationID.FINISH_OOB_AUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62858b[Message.OperationID.FINISH_REG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62858b[Message.OperationID.FINISH_AUTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62858b[Message.OperationID.DELETE_REG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[ProtocolType.values().length];
            f62857a = iArr2;
            try {
                iArr2[ProtocolType.UAF.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f62857a[ProtocolType.FIDO2.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f62857a[ProtocolType.NEITHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum Operation {
        REG,
        AUTH,
        OOB_REG,
        OOB_AUTH,
        DELETE_REG,
        UPDATE_REG,
        TRANSACT,
        CHECK_REG,
        CHECK_AUTH,
        CHECK_TRANSACT,
        UNKNOWN
    }

    public static class RPData {

        @Expose
        public String OOBData;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Activity f62859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ActivityProxy f62860b;

        @Expose
        public Map<String, String> channelBindings;

        @Expose
        public boolean checkPolicy;
        public IExtensionList extensions;

        @Expose
        public String origin;
        public boolean qrSupported;
        public QuickData quickData;
        public boolean remote;
        public boolean sharedPasskeyEnabled;
        public String userDisplayName;
        public String userName;
        public boolean sendDiscoveryInfo = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f62861c = true;

        public RPData() {
            a();
            b();
        }

        private void a() {
            this.qrSupported = true;
            try {
                try {
                    Class.forName("com.noknok.android.client.appsdk.hmsscan.ScanQRFragment");
                } catch (ClassNotFoundException unused) {
                    Class.forName("com.noknok.android.client.oobsdk.vision.ScanQRFragment");
                }
            } catch (ClassNotFoundException unused2) {
                this.qrSupported = false;
            }
        }

        private void b() {
            HashMap map = new HashMap();
            this.channelBindings = map;
            map.put("serverEndPoint", null);
            this.channelBindings.put("tlsServerCertificate", null);
            this.channelBindings.put(ClientData.KEY_CID_PUBKEY, null);
            this.channelBindings.put("tlsUnique", null);
        }

        public void finishActivity() {
            if (this.f62861c) {
                return;
            }
            this.f62860b.finish();
            this.f62860b = null;
            this.f62861c = true;
        }

        public ActivityProxy getCallerActivityProxy(Context context) {
            if (this.f62860b == null) {
                this.f62861c = false;
                Activity activity = this.f62859a;
                this.f62860b = activity != null ? ActivityProxy.createFromActivity(activity) : ActivityProxy.createFromAppContext(context, false);
            }
            return this.f62860b;
        }

        @Deprecated
        public RPData setCallerActivity(Activity activity) {
            this.f62859a = activity;
            return this;
        }

        public RPData setCallerActivityProxy(ActivityProxy activityProxy) {
            this.f62860b = activityProxy;
            return this;
        }

        public RPData setCheckPolicy(boolean z10) {
            this.checkPolicy = z10;
            return this;
        }

        public RPData setRemote(boolean z10) {
            this.remote = z10;
            return this;
        }

        public RPData setSendDiscoveryInfo(boolean z10) {
            this.sendDiscoveryInfo = z10;
            return this;
        }

        public RPData setSharedPasskeyEnabled(boolean z10) {
            this.sharedPasskeyEnabled = z10;
            return this;
        }
    }

    public static class ResponseData {

        @Expose
        public JsonObject additionalData;

        @Expose
        public Device device;

        @Expose
        public boolean isPlatformAuthenticator;

        @Expose
        public boolean isSharedPasskey;

        @Expose
        public String message;
        public ProtocolType protocolFamily;

        @Expose
        public ResultType status;
        public AppSDKException.SubSystem subSystem;

        public String generateRegName(JsonObject jsonObject, Context context) {
            if (!this.isPlatformAuthenticator) {
                return UiConfig.getText(context, UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_REGISTER_SECURITY_KEY_TITLE, R.string.nnl_register_security_key_title);
            }
            if (jsonObject != null && jsonObject.has("exts")) {
                for (JsonElement jsonElement : jsonObject.getAsJsonArray("exts")) {
                    if (jsonElement.getAsJsonObject().get("id").getAsString().equals(ExtensionManager.AUTHENTICATOR_INFO_EXT_ID)) {
                        return this.device.info + " " + ((JsonObject) new Gson().fromJson(((JsonObject) jsonElement).get("data").getAsString(), JsonObject.class)).get("title").getAsString();
                    }
                }
            }
            return this.isSharedPasskey ? UiConfig.getText(context, UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_PASSKEY_NAME_ON_GOOGLE_PASSWORD_MANAGER, R.string.nnl_passkey_name_on_google_password_manager) : UiConfig.getText(context, UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_PASSKEY_NAME_ON_LOCAL_ANDROID, R.string.nnl_passkey_name_on_local_android);
        }
    }

    @Deprecated
    public AppSDK2(@NonNull Context context) {
        this.f62855b = ProtocolType.UAF;
        this.f62856c = Tabulator.getInstance();
        this.f62854a = context.getApplicationContext();
    }

    private IAppSDK a(ProtocolType protocolType) {
        IAppSDK iAppSDKCreateInstance = AppSDKFactory.createInstance(protocolType, this.f62854a);
        ResultType resultTypeInit = iAppSDKCreateInstance.init(this.f62854a);
        if (resultTypeInit == ResultType.SUCCESS || resultTypeInit == ResultType.ALREADY_INITIALIZED) {
            return iAppSDKCreateInstance;
        }
        throw new AppSDKException(resultTypeInit);
    }

    public static void enableOobAutoStart(boolean z10) {
        f62853e = z10;
    }

    public static boolean isOobAutoStartEnabled() {
        return f62853e;
    }

    @Deprecated
    public AppSDK2 addAppSDK(@NonNull IAppSDK iAppSDK) {
        this.f62855b = iAppSDK.getProtocolType();
        return this;
    }

    @Deprecated
    public void autoSetSignature(Activity activity, String str) {
        a(activity, str, (String) null, (String[]) null);
    }

    public ResultType checkAuthPossible(ActivityProxy activityProxy, String str) {
        return checkAuthPossible(activityProxy, str, (String) null);
    }

    @Deprecated
    public void clearLocalRegistrations(Activity activity, String str, String str2) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            clearLocalRegistrations(activityProxyCreateFromActivity, str, str2);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    @Deprecated
    public JSONObject discover(Activity activity) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            return discover(activityProxyCreateFromActivity);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    public String getDeviceId() {
        return new DeviceIDUtil(this.f62854a).getDeviceId();
    }

    @Deprecated
    public boolean hasPlatformAuthenticator(Activity activity) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            return hasPlatformAuthenticator(activityProxyCreateFromActivity);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    public ResponseData initOperation(Operation operation, RPData rPData) {
        ResponseData responseData = new ResponseData();
        boolean z10 = false;
        try {
            try {
                Logger.i("AppSDK2", "Init called for operation: " + operation.name());
                if (!rPData.checkPolicy && (operation.equals(Operation.REG) || operation.equals(Operation.AUTH))) {
                    int iIncrementAndGet = f62852d.incrementAndGet();
                    z10 = true;
                    if (iIncrementAndGet > 1) {
                        Logger.w("AppSDK2", "Overlapping Init. Ongoing operations: " + iIncrementAndGet);
                    }
                }
                if (operation.equals(Operation.OOB_AUTH) || operation.equals(Operation.OOB_REG)) {
                    String str = rPData.OOBData;
                    if (str == null && str.isEmpty()) {
                        throw new IllegalArgumentException("OOB data not provided for OOB operation");
                    }
                    if (!operation.equals(a(rPData.OOBData))) {
                        throw new IllegalArgumentException("OOB data operation code does not match requested operation type");
                    }
                } else {
                    String str2 = rPData.OOBData;
                    if (str2 != null && !str2.isEmpty()) {
                        throw new IllegalArgumentException("OOB data should not be provided for non OOB operation");
                    }
                }
                Message messageA = a(operation, rPData);
                Logger.i(Logger.TAG_CONFIG_REPORTER, "DeviceInfo : " + messageA.device.info);
                if (messageA.sdk.protocols.isEmpty() && this.f62855b != ProtocolType.NEITHER) {
                    if (operation != Operation.DELETE_REG) {
                        responseData.status = ResultType.NOT_INSTALLED;
                        if (z10) {
                            f62852d.decrementAndGet();
                        }
                        return responseData;
                    }
                    messageA.sdk.protocols.add(new Protocol(ProtocolType.UAF, "1.0"));
                }
                String json = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(messageA, Message.class);
                Charset charset = Charsets.utf8Charset;
                String str3 = new String(Base64.encode(json.getBytes(charset), 10), charset);
                responseData.status = ResultType.SUCCESS;
                responseData.message = str3;
                if (z10) {
                    f62852d.decrementAndGet();
                }
                return responseData;
            } catch (AppSDKException e5) {
                Logger.e("AppSDK2", e5.getMessage());
                responseData.status = e5.getResultType();
                if (e5.getAdditionalData() != null) {
                    JsonObject jsonObject = responseData.additionalData;
                    if (jsonObject == null) {
                        responseData.additionalData = e5.getAdditionalData();
                    } else {
                        jsonObject.entrySet().addAll(e5.getAdditionalData().entrySet());
                    }
                }
                if (0 != 0) {
                    f62852d.decrementAndGet();
                }
                return responseData;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                f62852d.decrementAndGet();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0211 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0214 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TRY_LEAVE, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x022d A[Catch: all -> 0x0173, AppSDKException -> 0x0238, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x024f A[Catch: all -> 0x0173, AppSDKException -> 0x0238, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0261 A[Catch: all -> 0x0173, AppSDKException -> 0x0238, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0294 A[Catch: all -> 0x0173, AppSDKException -> 0x0238, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:137:0x02db A[Catch: all -> 0x0173, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02df A[Catch: all -> 0x0173, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02e6 A[Catch: all -> 0x0173, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0311  */
    /* JADX WARN: Code duplicated, block: B:160:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TRY_ENTER, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015c A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x017d A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0181 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0193 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d2 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01dd A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e3 A[Catch: all -> 0x0173, AppSDKException -> 0x0178, TryCatch #3 {all -> 0x0173, blocks: (B:60:0x0110, B:62:0x012a, B:68:0x0142, B:69:0x0159, B:70:0x015c, B:71:0x0172, B:76:0x017d, B:78:0x0181, B:80:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x01a1, B:89:0x01ba, B:91:0x01d2, B:86:0x01a8, B:88:0x01b2, B:119:0x0290, B:121:0x0294, B:123:0x0298, B:125:0x029c, B:126:0x02a3, B:94:0x01dd, B:96:0x01e3, B:98:0x01e7, B:100:0x01f3, B:102:0x01f9, B:103:0x0211, B:104:0x0214, B:106:0x0229, B:108:0x022d, B:110:0x0231, B:113:0x023b, B:115:0x024f, B:116:0x0259, B:118:0x0261, B:135:0x02bf, B:137:0x02db, B:139:0x02df, B:140:0x02e6, B:141:0x02f5), top: B:153:0x0020 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0142, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x015c, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0174: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r16 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:73:0x0174 */
    public ResponseData process(RPData rPData, String str) throws Throwable {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        JsonObject jsonObject;
        Message message;
        Message message2;
        FidoIn fidoIn;
        Charset charset;
        IAppSDK iAppSDKA;
        Message.OperationID operationIDValueOf;
        int iIncrementAndGet;
        ResultType resultType;
        Charset charset2;
        FidoIn fidoIn2;
        FidoOut fidoOutProcess;
        RPData rPData2;
        String str2;
        Server server;
        String str3;
        List<ProtocolMessage> list;
        FidoIn fidoIn3;
        FidoOut fidoOutProcess2;
        ResultType resultType2;
        String strA = str;
        if (!rPData.checkPolicy) {
            this.f62856c.startTimer(CLIENT_PROCESS_TIME);
        }
        ResponseData responseData = new ResponseData();
        try {
            try {
                try {
                    if (strA != null) {
                        try {
                            if (str.isEmpty() || strA.equals("undefined")) {
                            }
                            message = new Message();
                            message2 = new Message();
                            fidoIn = new FidoIn();
                            charset = Charsets.utf8Charset;
                            message.copy((Message) new Gson().fromJson(new String(Base64.decode(strA.getBytes(charset), 8), charset), Message.class));
                            ProtocolType byName = ProtocolType.getByName(message.protocol);
                            responseData.protocolFamily = byName;
                            iAppSDKA = a(byName);
                            operationIDValueOf = Message.OperationID.valueOf(message.operation);
                            if (!rPData.checkPolicy || operationIDValueOf.equals(Message.OperationID.DELETE_REG)) {
                                charset = charset;
                            } else {
                                List<Extension> list2 = message.extensions;
                                a(list2 == null ? new ExtensionList() : new ExtensionList(list2), message2, IExtensionProcessor.ExtensionOpType.finish, rPData.getCallerActivityProxy(this.f62854a));
                            }
                            if (!rPData.checkPolicy) {
                                z13 = false;
                                resultType = ResultType.SUCCESS;
                                responseData.status = resultType;
                                charset2 = charset;
                                fidoIn2 = fidoIn;
                                a(rPData, message, message2, fidoIn2, responseData);
                                if (responseData.status != resultType) {
                                    this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                    if (z13) {
                                        f62852d.decrementAndGet();
                                        enableOobAutoStart(true);
                                    }
                                    return responseData;
                                }
                                Logger.i("AppSDK2", "Processing " + operationIDValueOf);
                                switch (AnonymousClass2.f62858b[operationIDValueOf.ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                        a(message, message2);
                                        fidoIn2.fidoRequest = message.protocolMessage;
                                        message2.server = message.server;
                                        fidoOutProcess = iAppSDKA.process(fidoIn2);
                                        rPData2 = rPData;
                                        if (rPData2.quickData != null) {
                                            message2.quickAuthData = a(operationIDValueOf, rPData2);
                                        }
                                        responseData.status = fidoOutProcess.fidoStatus;
                                        responseData.isPlatformAuthenticator = fidoOutProcess.isPlatformAuthenticator;
                                        responseData.isSharedPasskey = fidoOutProcess.isSharedPasskey;
                                        responseData.subSystem = fidoOutProcess.subSystem;
                                        str2 = fidoOutProcess.responseParams;
                                        if (str2 != null) {
                                            responseData.additionalData = JsonParser.parseString(str2).getAsJsonObject();
                                        }
                                        if (resultType.equals(fidoOutProcess.fidoStatus)) {
                                            responseData.device = new Device(rPData2.getCallerActivityProxy(this.f62854a));
                                            message2.protocolMessage = fidoOutProcess.fidoResponse;
                                            responseData.message = new String(Base64.encode(new Gson().toJson(message2, Message.class).getBytes(charset2), 10), charset2);
                                        }
                                        if (!rPData2.checkPolicy) {
                                            this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                        }
                                        rPData.finishActivity();
                                        this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                        if (z13) {
                                            f62852d.decrementAndGet();
                                            enableOobAutoStart(true);
                                        }
                                        return responseData;
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        server = message.server;
                                        if (server != null) {
                                            responseData.status = resultType;
                                        } else {
                                            responseData.status = resultType;
                                        }
                                        rPData2 = rPData;
                                        if (!rPData2.checkPolicy) {
                                            this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                        }
                                        rPData.finishActivity();
                                        this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                        if (z13) {
                                            f62852d.decrementAndGet();
                                            enableOobAutoStart(true);
                                        }
                                        return responseData;
                                    case 9:
                                        list = message.protocolMessages;
                                        if (list != null) {
                                            for (ProtocolMessage protocolMessage : message.protocolMessages) {
                                                if (iAppSDKA.getProtocolType() == ProtocolType.UAF) {
                                                    fidoIn3 = fidoIn2;
                                                    fidoIn3.uafIntent = "UAF_OPERATION";
                                                } else {
                                                    fidoIn3 = fidoIn2;
                                                    if (iAppSDKA.getProtocolType() == ProtocolType.FIDO2) {
                                                        fidoIn3.uafIntent = Message.OperationID.DELETE_REG.name();
                                                    }
                                                }
                                                fidoIn3.fidoRequest = protocolMessage.protocolMessage;
                                                fidoOutProcess2 = iAppSDKA.process(fidoIn3);
                                                resultType2 = ResultType.SUCCESS;
                                                responseData.status = resultType2;
                                                responseData.subSystem = fidoOutProcess2.subSystem;
                                                if (!fidoOutProcess2.fidoStatus.equals(resultType2)) {
                                                    responseData.status = fidoOutProcess2.fidoStatus;
                                                }
                                                fidoIn2 = fidoIn3;
                                            }
                                        }
                                        rPData2 = rPData;
                                        if (!rPData2.checkPolicy) {
                                            this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                        }
                                        rPData.finishActivity();
                                        this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                        if (z13) {
                                            f62852d.decrementAndGet();
                                            enableOobAutoStart(true);
                                        }
                                        return responseData;
                                    default:
                                        throw new IllegalArgumentException("Operation id " + operationIDValueOf + " is not supported");
                                }
                            }
                            try {
                                if (!operationIDValueOf.equals(Message.OperationID.INIT_REG) || operationIDValueOf.equals(Message.OperationID.INIT_AUTH)) {
                                    iIncrementAndGet = f62852d.incrementAndGet();
                                    if (iIncrementAndGet > 1) {
                                        try {
                                            Logger.w("AppSDK2", "Overlapping process. Ongoing operations: " + iIncrementAndGet);
                                        } catch (AppSDKException e5) {
                                            e = e5;
                                            z13 = true;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z12 = true;
                                            this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                            if (z12) {
                                                f62852d.decrementAndGet();
                                                enableOobAutoStart(true);
                                            }
                                            throw th;
                                        }
                                    }
                                    enableOobAutoStart(false);
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                try {
                                    resultType = ResultType.SUCCESS;
                                    responseData.status = resultType;
                                    charset2 = charset;
                                    fidoIn2 = fidoIn;
                                    try {
                                        a(rPData, message, message2, fidoIn2, responseData);
                                        if (responseData.status != resultType) {
                                            this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                            if (z13) {
                                                f62852d.decrementAndGet();
                                                enableOobAutoStart(true);
                                            }
                                            return responseData;
                                        }
                                        Logger.i("AppSDK2", "Processing " + operationIDValueOf);
                                        switch (AnonymousClass2.f62858b[operationIDValueOf.ordinal()]) {
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                                a(message, message2);
                                                fidoIn2.fidoRequest = message.protocolMessage;
                                                message2.server = message.server;
                                                fidoOutProcess = iAppSDKA.process(fidoIn2);
                                                rPData2 = rPData;
                                                try {
                                                    if (rPData2.quickData != null && fidoOutProcess.isQuickSupported) {
                                                        message2.quickAuthData = a(operationIDValueOf, rPData2);
                                                    }
                                                    responseData.status = fidoOutProcess.fidoStatus;
                                                    responseData.isPlatformAuthenticator = fidoOutProcess.isPlatformAuthenticator;
                                                    responseData.isSharedPasskey = fidoOutProcess.isSharedPasskey;
                                                    responseData.subSystem = fidoOutProcess.subSystem;
                                                    str2 = fidoOutProcess.responseParams;
                                                    if (str2 != null) {
                                                        responseData.additionalData = JsonParser.parseString(str2).getAsJsonObject();
                                                    }
                                                    if (resultType.equals(fidoOutProcess.fidoStatus)) {
                                                        responseData.device = new Device(rPData2.getCallerActivityProxy(this.f62854a));
                                                        message2.protocolMessage = fidoOutProcess.fidoResponse;
                                                        responseData.message = new String(Base64.encode(new Gson().toJson(message2, Message.class).getBytes(charset2), 10), charset2);
                                                    }
                                                    if (!rPData2.checkPolicy && (operationIDValueOf == Message.OperationID.INIT_AUTH || operationIDValueOf == Message.OperationID.INIT_OOB_AUTH)) {
                                                        this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                                    }
                                                    rPData.finishActivity();
                                                    this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                                    if (z13) {
                                                        f62852d.decrementAndGet();
                                                        enableOobAutoStart(true);
                                                    }
                                                    return responseData;
                                                } catch (AppSDKException e7) {
                                                    e = e7;
                                                }
                                                break;
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                                server = message.server;
                                                if (server != null || (str3 = server.newOperation) == null || !str3.equals(Message.OperationID.DELETE_REG.name()) || message.server.protocolMessage == null) {
                                                    responseData.status = resultType;
                                                } else {
                                                    Logger.i("AppSDK2", "Processing new operation DELETE_REG");
                                                    fidoIn2.fidoRequest = message.server.protocolMessage;
                                                    FidoOut fidoOutProcess3 = iAppSDKA.process(fidoIn2);
                                                    responseData.status = fidoOutProcess3.fidoStatus;
                                                    responseData.subSystem = fidoOutProcess3.subSystem;
                                                }
                                                rPData2 = rPData;
                                                if (!rPData2.checkPolicy) {
                                                    this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                                }
                                                rPData.finishActivity();
                                                this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                                if (z13) {
                                                    f62852d.decrementAndGet();
                                                    enableOobAutoStart(true);
                                                }
                                                return responseData;
                                            case 9:
                                                list = message.protocolMessages;
                                                if (list != null && list.size() > 0) {
                                                    while (r1.hasNext()) {
                                                        if (iAppSDKA.getProtocolType() == ProtocolType.UAF) {
                                                            fidoIn3 = fidoIn2;
                                                            fidoIn3.uafIntent = "UAF_OPERATION";
                                                        } else {
                                                            fidoIn3 = fidoIn2;
                                                            if (iAppSDKA.getProtocolType() == ProtocolType.FIDO2) {
                                                                fidoIn3.uafIntent = Message.OperationID.DELETE_REG.name();
                                                            }
                                                        }
                                                        fidoIn3.fidoRequest = protocolMessage.protocolMessage;
                                                        fidoOutProcess2 = iAppSDKA.process(fidoIn3);
                                                        resultType2 = ResultType.SUCCESS;
                                                        responseData.status = resultType2;
                                                        responseData.subSystem = fidoOutProcess2.subSystem;
                                                        if (!fidoOutProcess2.fidoStatus.equals(resultType2)) {
                                                            responseData.status = fidoOutProcess2.fidoStatus;
                                                        }
                                                        fidoIn2 = fidoIn3;
                                                    }
                                                }
                                                rPData2 = rPData;
                                                if (!rPData2.checkPolicy) {
                                                    this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                                }
                                                rPData.finishActivity();
                                                this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                                if (z13) {
                                                    f62852d.decrementAndGet();
                                                    enableOobAutoStart(true);
                                                }
                                                return responseData;
                                            default:
                                                throw new IllegalArgumentException("Operation id " + operationIDValueOf + " is not supported");
                                        }
                                    } catch (AppSDKException e10) {
                                        e = e10;
                                    }
                                } catch (AppSDKException e11) {
                                    e = e11;
                                }
                            } catch (AppSDKException e12) {
                                e = e12;
                                z13 = false;
                                Logger.e("AppSDK2", e.getMessage());
                                this.f62856c.updateMetric(this.f62854a, INVALID_CLIENT_PROCESS);
                                responseData.status = e.getResultType();
                                if (e.getAdditionalData() != null) {
                                    jsonObject = responseData.additionalData;
                                    if (jsonObject == null) {
                                        responseData.additionalData = e.getAdditionalData();
                                    } else {
                                        jsonObject.entrySet().addAll(e.getAdditionalData().entrySet());
                                    }
                                }
                                rPData.finishActivity();
                                this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                if (z13) {
                                    f62852d.decrementAndGet();
                                    enableOobAutoStart(true);
                                }
                                return responseData;
                            }
                        } catch (AppSDKException e13) {
                            e = e13;
                            z13 = false;
                        } catch (Throwable th3) {
                            th = th3;
                            z11 = false;
                            z12 = z11;
                            this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                            if (z12) {
                                f62852d.decrementAndGet();
                                enableOobAutoStart(true);
                            }
                            throw th;
                        }
                        Logger.e("AppSDK2", e.getMessage());
                        this.f62856c.updateMetric(this.f62854a, INVALID_CLIENT_PROCESS);
                        responseData.status = e.getResultType();
                        if (e.getAdditionalData() != null) {
                            jsonObject = responseData.additionalData;
                            if (jsonObject == null) {
                                responseData.additionalData = e.getAdditionalData();
                            } else {
                                jsonObject.entrySet().addAll(e.getAdditionalData().entrySet());
                            }
                        }
                        rPData.finishActivity();
                        this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                        if (z13) {
                            f62852d.decrementAndGet();
                            enableOobAutoStart(true);
                        }
                        return responseData;
                    }
                    if (rPData.quickData == null) {
                        responseData.status = ResultType.INVALID_SERVER_RESPONSE;
                        this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                        return responseData;
                    }
                    strA = a(rPData);
                    message = new Message();
                    message2 = new Message();
                    fidoIn = new FidoIn();
                    charset = Charsets.utf8Charset;
                    message.copy((Message) new Gson().fromJson(new String(Base64.decode(strA.getBytes(charset), 8), charset), Message.class));
                    ProtocolType byName2 = ProtocolType.getByName(message.protocol);
                    responseData.protocolFamily = byName2;
                    iAppSDKA = a(byName2);
                    operationIDValueOf = Message.OperationID.valueOf(message.operation);
                    if (rPData.checkPolicy) {
                        charset = charset;
                    } else {
                        charset = charset;
                    }
                    if (!rPData.checkPolicy) {
                        z13 = false;
                        resultType = ResultType.SUCCESS;
                        responseData.status = resultType;
                        charset2 = charset;
                        fidoIn2 = fidoIn;
                        a(rPData, message, message2, fidoIn2, responseData);
                        if (responseData.status != resultType) {
                            this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                            if (z13) {
                                f62852d.decrementAndGet();
                                enableOobAutoStart(true);
                            }
                            return responseData;
                        }
                        Logger.i("AppSDK2", "Processing " + operationIDValueOf);
                        switch (AnonymousClass2.f62858b[operationIDValueOf.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                a(message, message2);
                                fidoIn2.fidoRequest = message.protocolMessage;
                                message2.server = message.server;
                                fidoOutProcess = iAppSDKA.process(fidoIn2);
                                rPData2 = rPData;
                                if (rPData2.quickData != null) {
                                    message2.quickAuthData = a(operationIDValueOf, rPData2);
                                }
                                responseData.status = fidoOutProcess.fidoStatus;
                                responseData.isPlatformAuthenticator = fidoOutProcess.isPlatformAuthenticator;
                                responseData.isSharedPasskey = fidoOutProcess.isSharedPasskey;
                                responseData.subSystem = fidoOutProcess.subSystem;
                                str2 = fidoOutProcess.responseParams;
                                if (str2 != null) {
                                    responseData.additionalData = JsonParser.parseString(str2).getAsJsonObject();
                                }
                                if (resultType.equals(fidoOutProcess.fidoStatus)) {
                                    responseData.device = new Device(rPData2.getCallerActivityProxy(this.f62854a));
                                    message2.protocolMessage = fidoOutProcess.fidoResponse;
                                    responseData.message = new String(Base64.encode(new Gson().toJson(message2, Message.class).getBytes(charset2), 10), charset2);
                                }
                                if (!rPData2.checkPolicy) {
                                    this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                }
                                rPData.finishActivity();
                                this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                if (z13) {
                                    f62852d.decrementAndGet();
                                    enableOobAutoStart(true);
                                }
                                return responseData;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                server = message.server;
                                if (server != null) {
                                    responseData.status = resultType;
                                } else {
                                    responseData.status = resultType;
                                }
                                rPData2 = rPData;
                                if (!rPData2.checkPolicy) {
                                    this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                }
                                rPData.finishActivity();
                                this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                if (z13) {
                                    f62852d.decrementAndGet();
                                    enableOobAutoStart(true);
                                }
                                return responseData;
                            case 9:
                                list = message.protocolMessages;
                                if (list != null) {
                                    while (r1.hasNext()) {
                                        if (iAppSDKA.getProtocolType() == ProtocolType.UAF) {
                                            fidoIn3 = fidoIn2;
                                            fidoIn3.uafIntent = "UAF_OPERATION";
                                        } else {
                                            fidoIn3 = fidoIn2;
                                            if (iAppSDKA.getProtocolType() == ProtocolType.FIDO2) {
                                                fidoIn3.uafIntent = Message.OperationID.DELETE_REG.name();
                                            }
                                        }
                                        fidoIn3.fidoRequest = protocolMessage.protocolMessage;
                                        fidoOutProcess2 = iAppSDKA.process(fidoIn3);
                                        resultType2 = ResultType.SUCCESS;
                                        responseData.status = resultType2;
                                        responseData.subSystem = fidoOutProcess2.subSystem;
                                        if (!fidoOutProcess2.fidoStatus.equals(resultType2)) {
                                            responseData.status = fidoOutProcess2.fidoStatus;
                                        }
                                        fidoIn2 = fidoIn3;
                                    }
                                }
                                rPData2 = rPData;
                                if (!rPData2.checkPolicy) {
                                    this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                                }
                                rPData.finishActivity();
                                this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                                if (z13) {
                                    f62852d.decrementAndGet();
                                    enableOobAutoStart(true);
                                }
                                return responseData;
                            default:
                                throw new IllegalArgumentException("Operation id " + operationIDValueOf + " is not supported");
                        }
                    }
                    if (operationIDValueOf.equals(Message.OperationID.INIT_REG)) {
                    }
                    iIncrementAndGet = f62852d.incrementAndGet();
                    if (iIncrementAndGet > 1) {
                        Logger.w("AppSDK2", "Overlapping process. Ongoing operations: " + iIncrementAndGet);
                    }
                    enableOobAutoStart(false);
                    z13 = true;
                    resultType = ResultType.SUCCESS;
                    responseData.status = resultType;
                    charset2 = charset;
                    fidoIn2 = fidoIn;
                    a(rPData, message, message2, fidoIn2, responseData);
                    if (responseData.status != resultType) {
                        this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                        if (z13) {
                            f62852d.decrementAndGet();
                            enableOobAutoStart(true);
                        }
                        return responseData;
                    }
                    Logger.i("AppSDK2", "Processing " + operationIDValueOf);
                    switch (AnonymousClass2.f62858b[operationIDValueOf.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            a(message, message2);
                            fidoIn2.fidoRequest = message.protocolMessage;
                            message2.server = message.server;
                            fidoOutProcess = iAppSDKA.process(fidoIn2);
                            rPData2 = rPData;
                            if (rPData2.quickData != null) {
                                message2.quickAuthData = a(operationIDValueOf, rPData2);
                            }
                            responseData.status = fidoOutProcess.fidoStatus;
                            responseData.isPlatformAuthenticator = fidoOutProcess.isPlatformAuthenticator;
                            responseData.isSharedPasskey = fidoOutProcess.isSharedPasskey;
                            responseData.subSystem = fidoOutProcess.subSystem;
                            str2 = fidoOutProcess.responseParams;
                            if (str2 != null) {
                                responseData.additionalData = JsonParser.parseString(str2).getAsJsonObject();
                            }
                            if (resultType.equals(fidoOutProcess.fidoStatus)) {
                                responseData.device = new Device(rPData2.getCallerActivityProxy(this.f62854a));
                                message2.protocolMessage = fidoOutProcess.fidoResponse;
                                responseData.message = new String(Base64.encode(new Gson().toJson(message2, Message.class).getBytes(charset2), 10), charset2);
                            }
                            if (!rPData2.checkPolicy) {
                                this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                            }
                            rPData.finishActivity();
                            this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                            if (z13) {
                                f62852d.decrementAndGet();
                                enableOobAutoStart(true);
                            }
                            return responseData;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            server = message.server;
                            if (server != null) {
                                responseData.status = resultType;
                            } else {
                                responseData.status = resultType;
                            }
                            rPData2 = rPData;
                            if (!rPData2.checkPolicy) {
                                this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                            }
                            rPData.finishActivity();
                            this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                            if (z13) {
                                f62852d.decrementAndGet();
                                enableOobAutoStart(true);
                            }
                            return responseData;
                        case 9:
                            list = message.protocolMessages;
                            if (list != null) {
                                while (r1.hasNext()) {
                                    if (iAppSDKA.getProtocolType() == ProtocolType.UAF) {
                                        fidoIn3 = fidoIn2;
                                        fidoIn3.uafIntent = "UAF_OPERATION";
                                    } else {
                                        fidoIn3 = fidoIn2;
                                        if (iAppSDKA.getProtocolType() == ProtocolType.FIDO2) {
                                            fidoIn3.uafIntent = Message.OperationID.DELETE_REG.name();
                                        }
                                    }
                                    fidoIn3.fidoRequest = protocolMessage.protocolMessage;
                                    fidoOutProcess2 = iAppSDKA.process(fidoIn3);
                                    resultType2 = ResultType.SUCCESS;
                                    responseData.status = resultType2;
                                    responseData.subSystem = fidoOutProcess2.subSystem;
                                    if (!fidoOutProcess2.fidoStatus.equals(resultType2)) {
                                        responseData.status = fidoOutProcess2.fidoStatus;
                                    }
                                    fidoIn2 = fidoIn3;
                                }
                            }
                            rPData2 = rPData;
                            if (!rPData2.checkPolicy) {
                                this.f62856c.updateMetricTime(this.f62854a, CLIENT_PROCESS_TIME);
                            }
                            rPData.finishActivity();
                            this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                            if (z13) {
                                f62852d.decrementAndGet();
                                enableOobAutoStart(true);
                            }
                            return responseData;
                        default:
                            throw new IllegalArgumentException("Operation id " + operationIDValueOf + " is not supported");
                    }
                    Logger.e("AppSDK2", e.getMessage());
                    this.f62856c.updateMetric(this.f62854a, INVALID_CLIENT_PROCESS);
                    responseData.status = e.getResultType();
                    if (e.getAdditionalData() != null) {
                        jsonObject = responseData.additionalData;
                        if (jsonObject == null) {
                            responseData.additionalData = e.getAdditionalData();
                        } else {
                            jsonObject.entrySet().addAll(e.getAdditionalData().entrySet());
                        }
                    }
                    rPData.finishActivity();
                    this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                    if (z13) {
                        f62852d.decrementAndGet();
                        enableOobAutoStart(true);
                    }
                    return responseData;
                } catch (Throwable th4) {
                    th = th4;
                    z11 = false;
                    z12 = z11;
                    this.f62856c.endTimer(CLIENT_PROCESS_TIME);
                    if (z12) {
                        f62852d.decrementAndGet();
                        enableOobAutoStart(true);
                    }
                    throw th;
                }
            } catch (AppSDKException e14) {
                e = e14;
                z13 = false;
            }
        } catch (Throwable th5) {
            th = th5;
            z11 = z10;
        }
    }

    public void setDeviceId(String str) {
        DeviceIDUtil.setCustomDeviceID(str);
    }

    public void autoSetSignature(ActivityProxy activityProxy, String str) {
        autoSetSignature(activityProxy, str, (String) null, (String[]) null);
    }

    public ResultType checkAuthPossible(ActivityProxy activityProxy, String str, String str2) {
        try {
            return a(this.f62855b).checkAuthPossible(activityProxy, str, str2);
        } catch (AppSDKException e5) {
            Logger.e("AppSDK2", "Error initializing Proxy", e5);
            return e5.getResultType();
        }
    }

    @Deprecated
    public void autoSetSignature(Activity activity, String str, String str2) {
        a(activity, str, str2, (String[]) null);
    }

    public void autoSetSignature(ActivityProxy activityProxy, String str, String str2) {
        autoSetSignature(activityProxy, str, str2, (String[]) null);
    }

    public AppSDK2(@NonNull Context context, ProtocolType protocolType) {
        this.f62855b = ProtocolType.UAF;
        this.f62856c = Tabulator.getInstance();
        this.f62854a = context.getApplicationContext();
        this.f62855b = protocolType;
    }

    private Message a(Operation operation, RPData rPData) {
        Protocol protocol;
        Protocol protocol2;
        Message message = new Message();
        message.version = "1.0";
        Sdk sdk = new Sdk();
        message.sdk = sdk;
        sdk.version = "9.1.0.1100";
        message.device = new Device(rPData.getCallerActivityProxy(this.f62854a));
        App qrSupported = new App().setQrSupported(rPData.qrSupported);
        message.app = qrSupported;
        if (rPData.remote) {
            qrSupported.computeForCallingApp(rPData.getCallerActivityProxy(this.f62854a));
        } else {
            qrSupported.computeForThisApp(this.f62854a);
        }
        if (!rPData.checkPolicy && !operation.equals(Operation.DELETE_REG)) {
            a(new ExtensionList(), message, IExtensionProcessor.ExtensionOpType.init, rPData.getCallerActivityProxy(this.f62854a));
        }
        message.oobData = rPData.OOBData;
        if (this.f62855b != ProtocolType.NEITHER) {
            Sdk sdk2 = message.sdk;
            ArrayList arrayList = new ArrayList();
            for (ProtocolType protocolType : this.f62855b.getList()) {
                try {
                    IAppSDK iAppSDKA = a(protocolType);
                    int i10 = AnonymousClass2.f62857a[protocolType.ordinal()];
                    if (i10 == 1) {
                        FidoIn fidoIn = new FidoIn();
                        fidoIn.uafIntent = "DISCOVER";
                        fidoIn.setCallerActivityProxy(rPData.getCallerActivityProxy(this.f62854a));
                        fidoIn.remote = rPData.remote;
                        FidoOut fidoOutProcess = iAppSDKA.process(fidoIn);
                        if (fidoOutProcess.fidoStatus == ResultType.SUCCESS) {
                            DiscoveryInfo discoveryInfo = (DiscoveryInfo) new Gson().fromJson(fidoOutProcess.discoveryData, DiscoveryInfo.class);
                            if (!discoveryInfo.supportedUAFVersions.isEmpty()) {
                                if (AppSDKConfig.getInstance(this.f62854a).get(AppSDKConfig.Key.multiProtocolSupport).getAsBoolean()) {
                                    protocol2 = new Protocol(ProtocolType.UAF, discoveryInfo.supportedUAFVersions);
                                } else {
                                    protocol2 = new Protocol(ProtocolType.UAF, "1.0");
                                }
                                if (rPData.sendDiscoveryInfo) {
                                    protocol2.setDiscoveryInfo(discoveryInfo);
                                }
                                rPData.finishActivity();
                                protocol = protocol2;
                                arrayList.add(protocol);
                            }
                        }
                    } else {
                        if (i10 == 2) {
                            protocol = new Protocol(ProtocolType.FIDO2, "1.0");
                        } else if (i10 == 3) {
                            protocol = new Protocol(ProtocolType.NEITHER, "");
                        }
                        arrayList.add(protocol);
                    }
                } catch (AppSDKException unused) {
                }
            }
            sdk2.protocols = arrayList;
        } else {
            message.sdk.protocols = new ArrayList();
        }
        rPData.finishActivity();
        return message;
    }

    @Deprecated
    public void autoSetSignature(Activity activity, String str, String str2, String[] strArr) {
        a(activity, str, str2, strArr);
    }

    @Deprecated
    public ResultType checkAuthPossible(Activity activity, String str) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            return checkAuthPossible(activityProxyCreateFromActivity, str, (String) null);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    public void clearLocalRegistrations(ActivityProxy activityProxy, String str, String str2) throws Throwable {
        if (str == null) {
            Logger.e("AppSDK2", "AppId is set null");
            return;
        }
        RPData rPData = new RPData();
        rPData.setCallerActivityProxy(activityProxy);
        rPData.checkPolicy = false;
        HashMap map = new HashMap();
        rPData.channelBindings = map;
        map.put("serverEndPoint", null);
        rPData.channelBindings.put("tlsServerCertificate", null);
        rPData.channelBindings.put(ClientData.KEY_CID_PUBKEY, null);
        rPData.channelBindings.put("tlsUnique", null);
        initOperation(Operation.DELETE_REG, rPData);
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[1] = str2;
        String str3 = String.format("{\"protocolMessages\":[{\"protocol\":\"uaf_1.0\",\"protocolMessage\":\"[{\\\"header\\\":{\\\"upv\\\":{\\\"major\\\":1,\\\"minor\\\":0},\\\"op\\\":\\\"Dereg\\\",\\\"appID\\\":\\\"%s\\\"},\\\"authenticators\\\":[{\\\"aaid\\\":\\\"%s\\\",\\\"keyID\\\":\\\"\\\"}]}]\"}],\"version\":\"1.0\",\"operation\":\"DELETE_REG\",\"protocol\":\"uaf_1.0\"}", objArr);
        Charset charset = Charsets.utf8Charset;
        process(rPData, new String(Base64.encode(str3.getBytes(charset), 10), charset));
    }

    public JSONObject discover(ActivityProxy activityProxy) {
        try {
            IAppSDK iAppSDKA = a(this.f62855b);
            if (AnonymousClass2.f62857a[iAppSDKA.getProtocolType().ordinal()] == 1) {
                FidoIn fidoIn = new FidoIn();
                fidoIn.uafIntent = "DISCOVER";
                fidoIn.setCallerActivityProxy(activityProxy);
                FidoOut fidoOutProcess = iAppSDKA.process(fidoIn);
                if (fidoOutProcess.fidoStatus == ResultType.SUCCESS) {
                    try {
                        return new JSONObject(fidoOutProcess.discoveryData);
                    } catch (JSONException e5) {
                        throw new AppSDKException(ResultType.FAILURE, "Invalid Discovery Data", e5);
                    }
                }
            }
        } catch (AppSDKException unused) {
        }
        return null;
    }

    public boolean hasPlatformAuthenticator(ActivityProxy activityProxy) {
        try {
            return a(this.f62855b).hasPlatformAuthenticator(activityProxy);
        } catch (AppSDKException unused) {
            return false;
        }
    }

    public void autoSetSignature(ActivityProxy activityProxy, String str, String str2, String[] strArr) {
        try {
            a(this.f62855b).autoSetSignature(activityProxy, str, str2, strArr);
        } catch (AppSDKException e5) {
            Logger.e("AppSDK2", "Error initializing Proxy", e5);
        }
    }

    @Deprecated
    public ResultType checkAuthPossible(Activity activity, String str, String str2) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            return checkAuthPossible(activityProxyCreateFromActivity, str, str2);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    private Operation a(String str) {
        String str2;
        String[] strArrSplit = str.split("\\|");
        if (strArrSplit.length == 2) {
            str2 = strArrSplit[0];
        } else if (strArrSplit.length > 2) {
            str2 = strArrSplit[1];
        } else {
            throw new AppSDKException(ResultType.SERVER_ERROR, "Invalid OOB data structure");
        }
        str2.getClass();
        if (str2.equals("a")) {
            return Operation.OOB_AUTH;
        }
        if (str2.equals("r")) {
            return Operation.OOB_REG;
        }
        throw new AppSDKException(ResultType.SERVER_ERROR, "Not supported operation code in OOB data");
    }

    @Deprecated
    public void cancel() {
    }

    private void a(IExtensionList iExtensionList, JsonArray jsonArray) {
        for (int i10 = 0; i10 < jsonArray.size(); i10++) {
            JsonObject asJsonObject = jsonArray.get(i10).getAsJsonObject();
            iExtensionList.addExtension(asJsonObject.get("id").getAsString(), asJsonObject.get("data").getAsString(), asJsonObject.get(ExtensionList.EXTENSION_FAIL_IF_UNKNOWN_KEY).getAsBoolean());
        }
    }

    private String a(RPData rPData) {
        QuickData quickData = rPData.quickData;
        quickData.generateChallenge();
        Message message = new Message();
        message.operation = Message.OperationID.INIT_AUTH.toString();
        message.version = "1.0";
        try {
            if (quickData.aaid == null) {
                message.protocol = new Protocol(ProtocolType.FIDO2, "1.0").protocolVersion;
                message.protocolMessage = String.format("{\"options\":{\"challenge\":\"%s\",\"timeout\":300000,\"rpId\":\"%s\",\"allowCredentials\":[{\"type\":\"public-key\",\"id\":\"%s\"}],\"userVerification\":\"preferred\"}}", quickData.quickAuthData.challenge, quickData.appID, quickData.keyID);
            } else {
                message.protocol = new Protocol(ProtocolType.UAF, "1.0").protocolVersion;
                message.protocolMessage = String.format("[{\"header\":{\"upv\":{\"major\":1,\"minor\":0},\"op\":\"Auth\",\"appID\":\"%s\"},\"challenge\":\"%s\",\"policy\":{\"accepted\":[[{\"aaid\":[\"%s\"],\"keyIDs\":[\"%s\"]}]]}}]", quickData.appID, quickData.quickAuthData.challenge, quickData.aaid, quickData.keyID);
            }
            return Base64.encodeToString(new Gson().toJson(message).getBytes(), 0);
        } catch (IllegalArgumentException e5) {
            throw new AppSDKException(ResultType.FAILURE, "Problem occurred during server message generation", e5);
        }
    }

    private void a(RPData rPData, Message message, Message message2, FidoIn fidoIn, ResponseData responseData) {
        if (!message.version.equals("1.0")) {
            responseData.status = ResultType.NOT_COMPATIBLE;
            return;
        }
        String str = message.operation;
        if (str != null && (message.protocol != null || str.equals(Operation.DELETE_REG.name()))) {
            message2.version = "1.0";
            Sdk sdk = new Sdk();
            message2.sdk = sdk;
            sdk.version = "9.1.0.1100";
            message2.device = new Device(rPData.getCallerActivityProxy(this.f62854a));
            if (rPData.remote) {
                message2.app = new App().computeForCallingApp(rPData.getCallerActivityProxy(this.f62854a)).setQrSupported(rPData.qrSupported);
            } else {
                message2.app = new App().computeForThisApp(this.f62854a).setQrSupported(rPData.qrSupported);
            }
            fidoIn.channelBindings = rPData.channelBindings;
            fidoIn.checkPolicyOnly = rPData.checkPolicy;
            fidoIn.origin = rPData.origin;
            fidoIn.setCallerActivityProxy(rPData.getCallerActivityProxy(this.f62854a));
            fidoIn.remote = rPData.remote;
            fidoIn.extensions = new ExtensionList();
            boolean z10 = rPData.sharedPasskeyEnabled;
            fidoIn.sharedPasskeyEnabled = z10;
            if (!z10) {
                fidoIn.userDisplayName = rPData.userDisplayName;
                fidoIn.userName = rPData.userName;
            } else {
                Logger.i("AppSDK2", "User sharedPasskeyEnabled set true no username will be provided to FIDO API");
            }
            fidoIn.regUsedOnThisDevice = message.regUsedOnThisDevice;
            JsonElement jsonElement = AppSDKConfig.getInstance(this.f62854a).get(AppSDKConfig.Key.defaultExtensions);
            if (jsonElement != null) {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                if (asJsonArray.size() > 0) {
                    a(fidoIn.extensions, asJsonArray);
                }
            }
            if (rPData.extensions != null) {
                a(fidoIn.extensions, new Gson().toJsonTree(rPData.extensions.getExtensions(), new TypeToken<ArrayList<IExtension>>() { // from class: com.noknok.android.client.appsdk.AppSDK2.1
                }.getType()).getAsJsonArray());
            }
            if (message.operation.equals(Operation.DELETE_REG.name())) {
                return;
            }
            String str2 = message.protocol;
            message2.protocol = str2;
            int i10 = AnonymousClass2.f62857a[ProtocolType.getByName(str2).ordinal()];
            if (i10 == 1) {
                fidoIn.uafIntent = fidoIn.checkPolicyOnly ? "CHECK_POLICY" : "UAF_OPERATION";
                return;
            } else {
                if (i10 != 2) {
                    return;
                }
                fidoIn.uafIntent = message.operation;
                return;
            }
        }
        throw new AppSDKException(ResultType.PROTOCOL_ERROR, "Operation or protocol is null");
    }

    private void a(Message message, Message message2) {
        Notify.NotificationID notificationID;
        if (MobileServicesAvailabilityChecker.isGMSAvailable(this.f62854a)) {
            Notify notify = message.notify;
            String str = (notify == null || (notificationID = notify.gcm) == null) ? null : notificationID.senderID;
            if (str == null || str.length() == 0) {
                return;
            }
            try {
                Class<?> cls = Class.forName("com.noknok.android.client.appsdk.fcmpush.PushNotificationProcessor");
                try {
                    String str2 = (String) cls.getMethod("getRegId", String.class).invoke(cls.getConstructor(Context.class).newInstance(this.f62854a), str);
                    if (str2 == null || str2.isEmpty()) {
                        return;
                    }
                    Notify notify2 = new Notify();
                    message2.notify = notify2;
                    notify2.gcm = new Notify.NotificationID();
                    message2.notify.gcm.id = str2;
                    return;
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
                    throw new RuntimeException("Failed to get PN registration ID", e5);
                }
            } catch (ClassNotFoundException e7) {
                Logger.w("AppSDK2", "appsdk_fcm_push library is not added Firebase push notifications will not work", e7);
                return;
            }
        }
        if (MobileServicesAvailabilityChecker.isHMSAvailable(this.f62854a)) {
            try {
                Class<?> cls2 = Class.forName("com.noknok.android.client.appsdk.hmspush.PushNotificationProcessor");
                try {
                    String str3 = (String) cls2.getMethod("getRegId", new Class[0]).invoke(cls2.getConstructor(Context.class).newInstance(this.f62854a), new Object[0]);
                    if (str3 == null || str3.isEmpty()) {
                        return;
                    }
                    Notify notify3 = new Notify();
                    message2.notify = notify3;
                    notify3.hms = new Notify.NotificationID();
                    message2.notify.hms.id = str3;
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                    throw new RuntimeException("Failed to get PN registration ID", e10);
                }
            } catch (ClassNotFoundException e11) {
                Logger.w("AppSDK2", "appsdk_hms_push library is not added Firebase push notifications will not work", e11);
            }
        }
    }

    private void a(ExtensionList extensionList, Message message, IExtensionProcessor.ExtensionOpType extensionOpType, ActivityProxy activityProxy) {
        HashMap<IExtensionProcessor.ExtProcParamKey, String> map = new HashMap<>();
        map.put(IExtensionProcessor.ExtProcParamKey.EXT_OP_TYPE, extensionOpType.name());
        ExtensionManager extensionManager = new ExtensionManager(ExtensionLoader.getInstance(this.f62854a).loadExtensions());
        extensionManager.start(extensionList, map, activityProxy);
        extensionManager.finish(extensionList, map);
        for (Extension extension : extensionList.getExtensions()) {
            if (extension.getData() != null) {
                if (message.extensions == null) {
                    message.extensions = new ArrayList();
                }
                message.extensions.add(extension);
            }
        }
    }

    private QuickAuthData a(Message.OperationID operationID, RPData rPData) {
        if ((operationID == Message.OperationID.INIT_AUTH || operationID == Message.OperationID.INIT_OOB_AUTH) && rPData.quickData.quickAuthData.isNotEmpty()) {
            return rPData.quickData.quickAuthData;
        }
        return new QuickAuthData();
    }

    private void a(Activity activity, String str, String str2, String[] strArr) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            autoSetSignature(activityProxyCreateFromActivity, str, str2, strArr);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }
}
