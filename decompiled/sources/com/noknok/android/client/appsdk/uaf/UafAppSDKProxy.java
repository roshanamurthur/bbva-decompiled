package com.noknok.android.client.appsdk.uaf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.autofill.HintConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.FidoIn;
import com.noknok.android.client.appsdk.FidoOut;
import com.noknok.android.client.appsdk.IAppSDK;
import com.noknok.android.client.appsdk.ProtocolType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.commlib.UafAidlCommClient;
import com.noknok.android.client.appsdk.commlib.UafIntentCommClient;
import com.noknok.android.client.appsdk.commlib.UafLocalCommClient;
import com.noknok.android.client.appsdk.common.AppSdkBase;
import com.noknok.android.client.commlib.ICommunicationClient;
import com.noknok.android.client.extension.IExtension;
import com.noknok.android.client.extension.IExtensionList;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.AppUtils;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.SelectFromDialogActivity;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.uaf.framework.agent.UafAppSdkAidl;
import com.noknok.android.uaf.framework.agent.UafAppSdkIntent;
import com.noknok.android.uaf.framework.service.UafIntentProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import org.fidoalliance.intent.api.UAFAppIntentExtras;
import org.fidoalliance.intent.api.UAFIntentType;
import org.fidoalliance.uaf.client.UAFMessage;

/* JADX INFO: loaded from: classes11.dex */
public class UafAppSDKProxy extends AppSdkBase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Pair<IpcType, String> f62906e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62907a = "UafAppSDKProxy";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tabulator f62908b = Tabulator.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Semaphore f62909c = new Semaphore(0, true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f62910d = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.noknok.android.client.appsdk.uaf.a
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return this.f62916a.a(message);
        }
    });

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk.uaf.UafAppSDKProxy$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62911a;

        static {
            int[] iArr = new int[IAppSDK.ClientLocation.values().length];
            f62911a = iArr;
            try {
                iArr[IAppSDK.ClientLocation.REMOTE_CLIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62911a[IAppSDK.ClientLocation.LOCAL_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class AugmentedMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f62912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f62913b;

        public /* synthetic */ AugmentedMessage(int i10) {
            this();
        }

        private AugmentedMessage() {
            this.f62912a = null;
            this.f62913b = true;
        }
    }

    public enum IpcType {
        Intent,
        Service
    }

    public UafAppSDKProxy(IAppSDK.ClientLocation clientLocation) throws ClassNotFoundException {
        this.mClientLocation = clientLocation;
        if (clientLocation == IAppSDK.ClientLocation.LOCAL_CLIENT) {
            Logger.i("UafAppSDKProxy", "Using Local client");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(Message message) {
        this.f62909c.release();
        return false;
    }

    public static void resetSelectedMfac() {
        f62906e = null;
    }

    @Override // com.noknok.android.client.appsdk.common.AppSdkBase, com.noknok.android.client.appsdk.IAppSDK
    public void autoSetSignature(ActivityProxy activityProxy, String str) {
        autoSetSignature(activityProxy, str, (String) null, (String[]) null);
    }

    @Override // com.noknok.android.client.appsdk.common.AppSdkBase, com.noknok.android.client.appsdk.IAppSDK
    public ResultType checkAuthPossible(ActivityProxy activityProxy, String str) {
        return checkAuthPossible(activityProxy, str, (String) null);
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public ProtocolType getProtocolType() {
        return ProtocolType.UAF;
    }

    @Override // com.noknok.android.client.appsdk.common.AppSdkBase, com.noknok.android.client.appsdk.IAppSDK
    public boolean hasPlatformAuthenticator(ActivityProxy activityProxy) {
        return true;
    }

    @Override // com.noknok.android.client.appsdk.common.AppSdkBase, com.noknok.android.client.appsdk.IAppSDK
    public ResultType init(Context context) {
        ResultType resultTypeFromOutcome;
        ResultType resultTypeInit = super.init(context);
        if (resultTypeInit == ResultType.ALREADY_INITIALIZED) {
            Logger.i(this.f62907a, "UafAppSDKProxy init: " + resultTypeInit);
            return resultTypeInit;
        }
        ResultType resultType = ResultType.SUCCESS;
        if (resultTypeInit != resultType) {
            Logger.e(this.f62907a, "UafAppSDKProxy AppSDKBase init failed with an error: " + resultTypeInit.toString());
            return resultTypeInit;
        }
        int i10 = AnonymousClass2.f62911a[this.mClientLocation.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                Logger.e(this.f62907a, "Invalid client location parameter");
                throw new IllegalArgumentException("Invalid client location parameter");
            }
            Logger.i(this.f62907a, "Init done, returning SUCCESS");
            this.isInitialized = true;
            return resultType;
        }
        if (f62906e == null) {
            synchronized (UafAppSDKProxy.class) {
                try {
                    if (f62906e == null) {
                        f62906e = a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (f62906e == null) {
                return ResultType.NOT_INSTALLED;
            }
        }
        Logger.i(Logger.TAG_CONFIG_REPORTER, "Client: " + ((IpcType) f62906e.first).name() + "/" + ((String) f62906e.second));
        if (((IpcType) f62906e.first).equals(IpcType.Service)) {
            Logger.i(this.f62907a, "Trying initialize appsdk with AIDL");
            resultTypeInit = UafAppSdkAidl.Instance().init(context.getApplicationContext(), this.f62910d, (String) f62906e.second);
            try {
                this.f62909c.acquire();
            } catch (InterruptedException e5) {
                Logger.w(this.f62907a, "Error while initializing App SDK with AIDL", e5);
                resultTypeInit = ResultType.FAILURE;
            }
            if (resultTypeInit != ResultType.SUCCESS) {
                f62906e = null;
                return ResultType.NOT_COMPATIBLE;
            }
        }
        ResultType resultType2 = ResultType.SUCCESS;
        if (resultTypeInit == resultType2) {
            Logger.i(this.f62907a, "Trying initialize appsdk with Intents");
            resultTypeFromOutcome = ResultType.fromOutcome(UafAppSdkIntent.instance().init(context, null, (String) f62906e.second));
        } else {
            resultTypeFromOutcome = resultTypeInit;
        }
        if (resultTypeFromOutcome == resultType2) {
            this.isInitialized = true;
        }
        return resultTypeFromOutcome;
    }

    @Override // com.noknok.android.client.appsdk.common.AppSdkBase, com.noknok.android.client.appsdk.IAppSDK
    public FidoOut process(FidoIn fidoIn) {
        StringBuilder sb2;
        Tabulator tabulator;
        FidoOut status;
        this.f62908b.startTimer(this.f62907a + ":uafProxy.process");
        try {
            assertState();
            if (fidoIn.sharedPasskeyEnabled) {
                status = new FidoOut().setStatus(ResultType.NO_MATCH);
                tabulator = this.f62908b;
                sb2 = new StringBuilder();
            } else {
                String str = fidoIn.uafIntent;
                if (str == null) {
                    status = new FidoOut().setStatus(ResultType.PROTOCOL_ERROR);
                    tabulator = this.f62908b;
                    sb2 = new StringBuilder();
                } else if (str.equals(UAFIntentType.DISCOVER.toString()) || fidoIn.uafIntent.equals(UAFIntentType.UAF_OPERATION.toString()) || fidoIn.uafIntent.equals(UAFIntentType.CHECK_POLICY.toString())) {
                    Gson gsonCreate = new GsonBuilder().create();
                    Intent intent = new Intent();
                    intent.putExtra(UAFAppIntentExtras.IEN_UAF_INTENT_TYPE, fidoIn.uafIntent);
                    UAFMessage uAFMessage = new UAFMessage();
                    AugmentedMessage augmentedMessageA = a(fidoIn);
                    uAFMessage.uafProtocolMessage = augmentedMessageA.f62912a;
                    intent.putExtra("message", gsonCreate.toJson(uAFMessage));
                    Map<String, String> map = fidoIn.channelBindings;
                    if (map != null) {
                        intent.putExtra(UAFAppIntentExtras.IEN_CHANNEL_BINDINGS, gsonCreate.toJson(map));
                    }
                    if (fidoIn.remote) {
                        intent.putExtra("remote", "");
                    }
                    ICommunicationClient iCommunicationClientA = a(fidoIn, augmentedMessageA);
                    if (iCommunicationClientA == null) {
                        status = new FidoOut().setStatus(ResultType.NOT_INSTALLED);
                        tabulator = this.f62908b;
                        sb2 = new StringBuilder();
                    } else {
                        iCommunicationClientA.sendRequest("MFAC:NNL", null, intent, new AppSdkBase.CommunicationResponse());
                        FidoOut fidoOutWaitForResponse = waitForResponse();
                        fidoOutWaitForResponse.isPlatformAuthenticator = this.mClientLocation == IAppSDK.ClientLocation.LOCAL_CLIENT;
                        fidoOutWaitForResponse.subSystem = AppSDKException.SubSystem.UAF;
                        fidoOutWaitForResponse.isQuickSupported = true;
                        fidoIn.finishActivity();
                        Tabulator tabulator2 = this.f62908b;
                        sb2 = new StringBuilder();
                        tabulator = tabulator2;
                        status = fidoOutWaitForResponse;
                    }
                } else {
                    status = new FidoOut().setStatus(ResultType.FAILURE);
                    tabulator = this.f62908b;
                    sb2 = new StringBuilder();
                }
            }
            sb2.append(this.f62907a);
            sb2.append(":uafProxy.process");
            tabulator.endTimer(sb2.toString());
            return status;
        } catch (Throwable th2) {
            this.f62908b.endTimer(this.f62907a + ":uafProxy.process");
            throw th2;
        }
    }

    private Pair<IpcType, String> a() {
        String str;
        String str2;
        int iIntValue = 0;
        ActivityProxy activityProxyCreateFromAppContext = ActivityProxy.createFromAppContext(this.mContext, false);
        UafAidlCommClient uafAidlCommClient = new UafAidlCommClient(this.mContext);
        UafIntentCommClient uafIntentCommClient = new UafIntentCommClient(this.mContext, null);
        String[] serviceModuleList = new String[0];
        if (AppSDKConfig.getInstance(this.mContext).get(AppSDKConfig.Key.useAidlService).getAsBoolean()) {
            serviceModuleList = uafAidlCommClient.getServiceModuleList(null);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(uafIntentCommClient.getServiceModuleList(null)));
        ArrayList<String> arrayList2 = new ArrayList<>();
        PackageManager packageManager = this.mContext.getPackageManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                str2 = (String) it.next();
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str2, 0);
                    arrayList2.add((String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : this.mContext.getString(R.string.nnl_appsdk_unknown)));
                } catch (PackageManager.NameNotFoundException e5) {
                    e = e5;
                    it.remove();
                    Logger.e(this.f62907a, "No application with " + str2 + " found", e);
                }
            } catch (PackageManager.NameNotFoundException e7) {
                e = e7;
                str2 = null;
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        if (arrayList.size() == 1) {
            str = (String) arrayList.get(0);
        } else {
            Intent intent = new Intent(this.mContext, (Class<?>) SelectFromDialogActivity.class);
            intent.addFlags(335544320);
            intent.putStringArrayListExtra("DIALOGLIST", arrayList2);
            intent.putExtra("DIALOGTITLEID", UiConfig.getText(this.mContext, UIConfigTags.LEVELS_SELECT_FIDO_CLIENT_VIEW, UIConfigTags.TAG_SELECT_FIDO_CLIENT_TITLE, R.string.nnl_appsdk_select_fido_client));
            Integer num = (Integer) activityProxyCreateFromAppContext.startActivityForResult(intent, null);
            if (num != null && num.intValue() >= 0) {
                iIntValue = num.intValue();
            }
            str = (String) arrayList.get(iIntValue);
        }
        return Arrays.asList(serviceModuleList).contains(str) ? new Pair<>(IpcType.Service, str) : new Pair<>(IpcType.Intent, str);
    }

    @Override // com.noknok.android.client.appsdk.common.AppSdkBase, com.noknok.android.client.appsdk.IAppSDK
    public void autoSetSignature(ActivityProxy activityProxy, String str, String str2) {
        autoSetSignature(activityProxy, str, str2, (String[]) null);
    }

    @Override // com.noknok.android.client.appsdk.common.AppSdkBase, com.noknok.android.client.appsdk.IAppSDK
    public ResultType checkAuthPossible(ActivityProxy activityProxy, String str, String str2) {
        FidoIn fidoIn = new FidoIn();
        if (str == null) {
            str = "";
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (str2 == null) {
            str2 = "{\"accepted\":[[{\"assertionSchemes\": [\"UAFV1TLV\"], \"authenticationAlgorithms\":[1, 2, 3, 4, 5, 6, 7, 8, 9] }]]}";
        }
        objArr[1] = str2;
        fidoIn.fidoRequest = String.format("[{\"header\":{\"upv\":{\"major\":1,\"minor\":0},\"op\":\"Auth\",\"appID\":\"%s\",\"serverData\":\"any\"},\"challenge\":\"n_1rVKXiuEof6V9sjESwmMVmqXqEH7tWx2FWjAoZoMQ\",\"policy\":%s}]", objArr);
        fidoIn.checkPolicyOnly = true;
        fidoIn.uafIntent = "CHECK_POLICY";
        fidoIn.setCallerActivityProxy(activityProxy);
        return process(fidoIn).fidoStatus;
    }

    @Override // com.noknok.android.client.appsdk.common.AppSdkBase, com.noknok.android.client.appsdk.IAppSDK
    @SuppressLint({"PackageManagerGetSignatures"})
    public void autoSetSignature(ActivityProxy activityProxy, String str, String str2, String[] strArr) {
        String packageName = activityProxy.getApplicationContext().getPackageName();
        try {
            Signature[] signatureArr = activityProxy.getApplicationContext().getPackageManager().getPackageInfo(packageName, 64).signatures;
            if (strArr != null) {
                for (String str3 : strArr) {
                    for (Signature signature : signatureArr) {
                        if (signature.equals(new Signature(str3))) {
                            AppUtils.setSignature(signature);
                            if (checkAuthPossible(activityProxy, str, (String) null) == ResultType.SUCCESS) {
                                Logger.i(this.f62907a, "Priority signature has registrations. Using facet ID: " + AppUtils.computeFacetID(activityProxy.getApplicationContext(), null, AppUtils.Algorithm.SHA1));
                                return;
                            }
                        }
                    }
                }
            }
            for (Signature signature2 : signatureArr) {
                AppUtils.setSignature(signature2);
                if (checkAuthPossible(activityProxy, str, (String) null) == ResultType.SUCCESS) {
                    Logger.i(this.f62907a, "Nonpriority signature has registrations. Using facet ID: " + AppUtils.computeFacetID(activityProxy.getApplicationContext(), null, AppUtils.Algorithm.SHA1));
                    return;
                }
            }
            if (str2 != null) {
                AppUtils.setSignature(str2);
                Logger.i(this.f62907a, "No registrations found. Using default facet ID: " + AppUtils.computeFacetID(activityProxy.getApplicationContext(), null, AppUtils.Algorithm.SHA1));
                return;
            }
            AppUtils.setSignature(signatureArr[0]);
            Logger.i(this.f62907a, "No registrations found. Using first facet ID: " + AppUtils.computeFacetID(activityProxy.getApplicationContext(), null, AppUtils.Algorithm.SHA1));
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.e(this.f62907a, "Failed to get signature for " + packageName, e5);
        }
    }

    private ICommunicationClient a(FidoIn fidoIn, AugmentedMessage augmentedMessage) {
        int i10 = AnonymousClass2.f62911a[this.mClientLocation.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            try {
                UafIntentProcessor.class.newInstance();
                return new UafLocalCommClient(this.mContext, fidoIn.getCallerActivityProxy());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e5) {
                Logger.e(this.f62907a, "Error instantiating uaf local client", e5);
                return null;
            }
        }
        if (((IpcType) f62906e.first).equals(IpcType.Service)) {
            if (UAFIntentType.CHECK_POLICY.toString().equals(fidoIn.uafIntent)) {
                Logger.i(this.f62907a, "The request is silent: CHECK_POLICY");
            } else if (UAFIntentType.DISCOVER.toString().equals(fidoIn.uafIntent)) {
                Logger.i(this.f62907a, "The request is silent: DISCOVER");
            } else if (augmentedMessage.f62913b) {
                Logger.i(this.f62907a, "The request is silent: Dereg");
            } else {
                Logger.i(this.f62907a, "Fallback to Intent");
            }
            Logger.i(this.f62907a, "Use AIDL");
            return new UafAidlCommClient(this.mContext);
        }
        return new UafIntentCommClient(this.mContext, fidoIn.getCallerActivityProxy());
    }

    private AugmentedMessage a(FidoIn fidoIn) {
        AugmentedMessage augmentedMessage = new AugmentedMessage(0);
        String str = fidoIn.fidoRequest;
        if (str == null) {
            return augmentedMessage;
        }
        JsonArray asJsonArray = JsonParser.parseString(str).getAsJsonArray();
        for (JsonElement jsonElement : asJsonArray) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.has(HintConstants.AUTOFILL_HINT_USERNAME)) {
                String str2 = fidoIn.userName;
                if (str2 != null && !str2.isEmpty()) {
                    asJsonObject.addProperty(HintConstants.AUTOFILL_HINT_USERNAME, fidoIn.userName);
                } else {
                    String str3 = fidoIn.userDisplayName;
                    if (str3 != null && !str3.isEmpty()) {
                        asJsonObject.addProperty(HintConstants.AUTOFILL_HINT_USERNAME, fidoIn.userDisplayName);
                    }
                }
            }
            if (jsonElement.getAsJsonObject().has("header")) {
                JsonObject asJsonObject2 = jsonElement.getAsJsonObject().get("header").getAsJsonObject();
                IExtensionList iExtensionList = fidoIn.extensions;
                if (iExtensionList != null && iExtensionList.getExtensions() != null) {
                    if (asJsonObject2.get("exts") == null) {
                        asJsonObject2.add("exts", new JsonArray());
                    }
                    asJsonObject2.get("exts").getAsJsonArray().addAll(new Gson().toJsonTree(iExtensionList.getExtensions(), new TypeToken<ArrayList<IExtension>>() { // from class: com.noknok.android.client.appsdk.uaf.UafAppSDKProxy.1
                    }.getType()).getAsJsonArray());
                }
                if (augmentedMessage.f62913b && asJsonObject2.has("op")) {
                    augmentedMessage.f62913b = "Dereg".equals(asJsonObject2.get("op").getAsString());
                }
            }
        }
        augmentedMessage.f62912a = asJsonArray.toString();
        return augmentedMessage;
    }
}
