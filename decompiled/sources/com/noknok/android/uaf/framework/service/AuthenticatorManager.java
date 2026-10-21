package com.noknok.android.uaf.framework.service;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.fido.android.framework.service.IAuthenticatorUIAdapter;
import com.fido.android.framework.service.Mfac;
import com.fido.uaf.ver0100.types.DeregisterAuthenticator;
import com.fido.uaf.ver0100.types.UafException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.json.ASMRequest;
import com.noknok.android.client.asm.api.uaf.json.ASMResponse;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.DeregisterIn;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.asm.api.uaf.json.GetRegistrationsOut;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.mfac.ASMCommunicationClientRequest;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.ConformanceTest;
import com.noknok.android.client.utils.JsonObjectAdapter;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.client.utils.ViewWrapper;
import com.noknok.android.mfac.uaf.R;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class AuthenticatorManager {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Tabulator f63569g = Tabulator.getInstance();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static AuthenticatorManager f63570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f63571i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ASMCommunicationClientProxy f63573b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Authenticator> f63572a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal<ActivityProxy> f63574c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Object> f63575d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal<String> f63576e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AuthnrInfoMgnr f63577f = new AuthnrInfoMgnr();

    private AuthenticatorManager() {
        try {
            Mfac.Instance().getContext().getPackageManager().getPackageInfo(Mfac.Instance().getContext().getPackageName(), 0);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put(ASMCommunicationClientProxy.ASMDestinationType.ASM_LOCAL, new UAFLocalASMCommunicationClient());
            if (Mfac.Instance().getConfig().get(AppSDKConfig.Key.useAidlService).getAsBoolean()) {
                concurrentHashMap.put(ASMCommunicationClientProxy.ASMDestinationType.ASM_SERVICE, new UAFServiceASMCommunicationClient());
            }
            concurrentHashMap.put(ASMCommunicationClientProxy.ASMDestinationType.ASM_INTENT, new UAFIntentASMCommunicationClient());
            this.f63573b = new ASMCommunicationClientProxy(concurrentHashMap);
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.e("AuthenticatorManager", "Cannot find package info of Fido.", e5);
        }
    }

    public static ASMResponse executeAsmRequest(ASMRequest aSMRequest, String str) {
        Tabulator tabulator = f63569g;
        tabulator.startTimer("AuthenticatorManager:executeAsmRequest");
        try {
            Gson gsonCreate = JsonObjectAdapter.GsonBuilder().create();
            List<Extension> list = aSMRequest.exts;
            if (list != null && list.isEmpty()) {
                aSMRequest.exts = null;
            }
            String json = gsonCreate.toJson(aSMRequest);
            ASMCommunicationClientRequest aSMCommunicationClientRequest = new ASMCommunicationClientRequest();
            aSMCommunicationClientRequest.sRequest = json;
            aSMCommunicationClientRequest.activityProxy = f63570h.f63574c.get();
            AuthenticatorManager authenticatorManager = f63570h;
            ASMCommunicationClientProxy aSMCommunicationClientProxy = authenticatorManager.f63573b;
            authenticatorManager.f63575d.set(null);
            f63570h.f63576e.set(null);
            aSMCommunicationClientProxy.waitForResponse(aSMCommunicationClientProxy.sendRequest(str, aSMRequest.requestType.name(), aSMCommunicationClientRequest, new ASMCommunicationResponse(0)));
            if (f63570h.f63576e.get() != null) {
                throw new AsmException(Outcome.FAILURE, "Commlib ASM SendRequest failed: " + f63570h.f63576e.get());
            }
            String str2 = (String) f63570h.f63575d.get();
            if (str2 == null) {
                throw new AsmException(Outcome.FAILURE, "Commlib ASM SendRequest failed to receive response");
            }
            ConformanceTest.logResponse(ConformanceTest.logAsmRequest(aSMRequest.requestType.name(), json), str2);
            ASMResponse aSMResponse = (ASMResponse) gsonCreate.fromJson(str2, ASMResponse.class);
            if (aSMResponse.statusCode == Outcome.SUCCESS.getUafAsmStatusCode()) {
                tabulator.endTimer("AuthenticatorManager:executeAsmRequest");
                return aSMResponse;
            }
            Logger.e("AuthenticatorManager", "executeAsmRequest failed with error code " + Integer.valueOf(aSMResponse.statusCode).toString());
            throw new AsmException(Outcome.fromAsmStatusCode(aSMResponse.statusCode)).setExtensions(aSMResponse.exts);
        } catch (Throwable th2) {
            f63569g.endTimer("AuthenticatorManager:executeAsmRequest");
            throw th2;
        }
    }

    public static synchronized AuthenticatorManager instance(ActivityProxy activityProxy) {
        try {
            if (f63570h == null) {
                f63570h = new AuthenticatorManager();
            }
            f63570h.f63574c.set(activityProxy);
        } catch (Throwable th2) {
            throw th2;
        }
        return f63570h;
    }

    public void deregisterAuthenticator(DeregisterAuthenticator deregisterAuthenticator, List<Authenticator> list, String str, List<Extension> list2) {
        for (Authenticator authenticator : list) {
            try {
                if (deregisterAuthenticator.aaid.isEmpty() || authenticator.f63561a.endsWith(deregisterAuthenticator.aaid)) {
                    if (deregisterAuthenticator.keyID.isEmpty()) {
                        for (GetRegistrationsOut.AppRegistration appRegistration : authenticator.getRegistrations().appRegs) {
                            if (appRegistration.appID.equals(str)) {
                                Iterator<String> it = appRegistration.keyIDs.iterator();
                                while (it.hasNext()) {
                                    authenticator.deregister(a(str, it.next(), list2));
                                }
                                break;
                            }
                        }
                    } else {
                        authenticator.deregister(a(str, deregisterAuthenticator.keyID, list2));
                    }
                }
            } catch (AsmException e5) {
                throw new UafException(e5.error(), "Deregistration failed");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.noknok.android.uaf.framework.service.Authenticator>, java.util.concurrent.ConcurrentHashMap] */
    public Authenticator getAuthenticator(String str) {
        Authenticator authenticator = (Authenticator) this.f63572a.get(str);
        if (authenticator != null) {
            return authenticator;
        }
        throw new AsmException(Outcome.BAD_TOKEN, str);
    }

    public List<IAuthenticatorUIAdapter> getAuthenticatorUIAdapters(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getAuthenticators());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Map<java.lang.String, com.noknok.android.uaf.framework.service.Authenticator>, java.util.concurrent.ConcurrentHashMap] */
    public List<Authenticator> getAuthenticators() {
        JsonObject asJsonObject;
        ArrayList arrayList = new ArrayList();
        String[] serviceModuleList = this.f63573b.getServiceModuleList("ASM");
        JsonElement jsonElement = Mfac.Instance().getConfig().get(AppSDKConfig.Key.asmFixes);
        for (String str : serviceModuleList) {
            ArrayList<AuthenticatorInfo> authenticatorsInfo = this.f63577f.getAuthenticatorsInfo(str);
            if (authenticatorsInfo != null && authenticatorsInfo.size() != 0) {
                for (AuthenticatorInfo authenticatorInfo : authenticatorsInfo) {
                    try {
                        String str2 = str + authenticatorInfo.aaid;
                        if (jsonElement != null && (asJsonObject = jsonElement.getAsJsonObject().getAsJsonObject(authenticatorInfo.aaid)) != null && asJsonObject.has("userVerification")) {
                            authenticatorInfo.userVerification = asJsonObject.get("userVerification").getAsLong();
                        }
                        if (UiConfig.getJsonWrapper(Mfac.Instance().getContext()) != null) {
                            a(authenticatorInfo, UiConfig.getJsonWrapper(Mfac.Instance().getContext()).searchUp(ViewWrapper.AUTHENTICATOR_MAP, authenticatorInfo.aaid));
                        }
                        if (authenticatorInfo.icon == null) {
                            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f63574c.get().getApplicationContext().getResources(), R.drawable.nnl_asm_launcher_icon);
                            if (bitmapDecodeResource != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                authenticatorInfo.icon = "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            } else {
                                Logger.e("AuthenticatorManager", "Failed to find authenticator icon resource");
                            }
                        }
                        Authenticator authenticator = new Authenticator(authenticatorInfo, str2, str);
                        this.f63572a.put(str2, authenticator);
                        arrayList.add(authenticator);
                    } catch (AsmException e5) {
                        Logger.e("AuthenticatorManager", "Exception while getting authenticators", e5);
                    }
                }
            }
        }
        return arrayList;
    }

    public void setCommClientError(String str) {
        this.f63576e.set(str);
    }

    public void setCommClientResponse(Object obj) {
        this.f63575d.set(obj);
    }

    @SuppressLint({"DiscouragedApi"})
    private void a(@NonNull AuthenticatorInfo authenticatorInfo, @NonNull JsonElement jsonElement) {
        if (jsonElement != null) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.has("title")) {
                authenticatorInfo.title = asJsonObject.get("title").getAsString();
            }
            if (asJsonObject.has("description")) {
                authenticatorInfo.description = asJsonObject.get("description").getAsString();
            }
            if (asJsonObject.has("icon")) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f63574c.get().getApplicationContext().getResources(), this.f63574c.get().getApplicationContext().getResources().getIdentifier(asJsonObject.get("icon").getAsString(), PluginUtils.IDENTIFIER_DRAWABLE, this.f63574c.get().getApplicationContext().getPackageName()));
                if (bitmapDecodeResource == null) {
                    Logger.e("AuthenticatorManager", "Failed to find authenticator icon resource");
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                authenticatorInfo.icon = "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
        }
    }

    private static ASMRequest a(String str, String str2, List<Extension> list) {
        DeregisterIn deregisterIn = new DeregisterIn();
        deregisterIn.appID = str;
        deregisterIn.keyID = str2;
        ASMRequest aSMRequest = new ASMRequest();
        aSMRequest.args = (JsonObject) JsonObjectAdapter.GsonBuilder().create().toJsonTree(deregisterIn);
        aSMRequest.exts = list;
        return aSMRequest;
    }

    public static class ASMCommunicationResponse implements ICommunicationClientResponse {
        private ASMCommunicationResponse() {
        }

        public /* synthetic */ ASMCommunicationResponse(int i10) {
            this();
        }

        @Override // com.noknok.android.client.commlib.ICommunicationClientResponse
        public void onResponse(String str, Object obj) {
            AuthenticatorManager.f63570h.setCommClientResponse(obj);
        }

        @Override // com.noknok.android.client.commlib.ICommunicationClientResponse
        public void onRemoveRequest() {
        }

        @Override // com.noknok.android.client.commlib.ICommunicationClientResponse
        public void onError(String str) {
        }
    }
}
