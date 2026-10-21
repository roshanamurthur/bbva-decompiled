package com.noknok.android.uaf.framework.service;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.bbva.component.dm.naturalauth.Constants;
import com.fido.android.framework.service.Mfac;
import com.fido.uaf.ver0100.message.UafMessage;
import com.fido.uaf.ver0100.types.OperationHeader;
import com.fido.uaf.ver0100.types.UafException;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.noknok.android.client.appsdk.FidoIn;
import com.noknok.android.client.appsdk.FidoOut;
import com.noknok.android.client.appsdk.IAppSDK;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.uaf.UafAppSDKProxy;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.ConformanceTest;
import com.noknok.android.client.utils.ExceptionEncoder;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.fidoalliance.intent.api.UAFIntentType;
import org.fidoalliance.uaf.client.UAFMessage;

/* JADX INFO: loaded from: classes11.dex */
public class UafProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tabulator f63608a = Tabulator.getInstance();

    public static class UafRequestTask {
        public final ActivityProxy mActivityProxy;
        public final String mAdditionalData;
        public List<IAuthenticatorFilter> mAuthenticatorFilters;
        public final String mCallerPkgName;
        public final int mCallingPid;
        public final int mCallingUid;
        public final String mChannelBindings;
        public final boolean mCheckPolicy;
        public final Context mContext;
        public final boolean mIsLocal;
        public final String mOrigin;
        public boolean mRetryOnCancel = false;
        public boolean mShowWhenLocked = false;
        public final String mUafMessage;
        public JsonObject resultAdditionalData;

        public UafRequestTask(String str, String str2, String str3, String str4, int i10, int i11, Context context, String str5, boolean z10, ActivityProxy activityProxy, boolean z11) {
            this.mUafMessage = str;
            this.mChannelBindings = str2;
            this.mAdditionalData = str5;
            this.mOrigin = str3;
            this.mCallingPid = i10;
            this.mCallingUid = i11;
            this.mCheckPolicy = z10;
            this.mActivityProxy = activityProxy;
            this.mContext = context;
            this.mCallerPkgName = str4;
            this.mIsLocal = z11;
        }

        public void addAdditionalData(String str, JsonElement jsonElement) {
            if (this.resultAdditionalData == null) {
                this.resultAdditionalData = new JsonObject();
            }
            this.resultAdditionalData.add(str, jsonElement);
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.mCheckPolicy ? "CHECK_POLICY " : "");
            sb2.append("from ");
            sb2.append(this.mCallerPkgName);
            sb2.append(", PID=");
            sb2.append(this.mCallingPid);
            sb2.append(", UID=");
            sb2.append(this.mCallingUid);
            return sb2.toString();
        }
    }

    public static class UafResponseTask {
        public final Outcome returnCode;
        public final UAFMessage uafResponseMessage;

        public UafResponseTask(UAFMessage uAFMessage, Outcome outcome) {
            this.uafResponseMessage = uAFMessage;
            this.returnCode = outcome;
        }

        @NonNull
        public String toString() {
            return "Status:" + this.returnCode;
        }
    }

    private String a(UafRequestTask uafRequestTask, UafVersionSelector uafVersionSelector) {
        boolean z10;
        JsonArray jsonArray = new JsonArray();
        do {
            try {
                for (UafVersionSelector.SupportedMessage supportedMessage : uafVersionSelector.getAvailableMessages()) {
                    JsonElement jsonElementProcess = supportedMessage.uafEngine.process(uafRequestTask, supportedMessage.uafMessage, supportedMessage.authenticators);
                    if (jsonElementProcess != null) {
                        jsonArray.add(jsonElementProcess);
                    }
                }
                z10 = false;
            } catch (UafException e5) {
                if (!e5.error().equals(Outcome.CANCELED)) {
                    throw e5;
                }
                uafVersionSelector.resetSupportedMessageMap();
                z10 = true;
            }
            if (!uafRequestTask.mRetryOnCancel) {
                break;
            }
        } while (z10);
        if (z10) {
            throw new UafException(Outcome.CANCELED, (List<Extension>) null);
        }
        return jsonArray.toString();
    }

    private String b(UafRequestTask uafRequestTask, UafVersionSelector uafVersionSelector) {
        UafAppSDKProxy uafAppSDKProxy;
        try {
            uafAppSDKProxy = new UafAppSDKProxy(IAppSDK.ClientLocation.REMOTE_CLIENT);
        } catch (ClassNotFoundException e5) {
            Logger.e("UafProcessor", "Error while processing Uaf request", e5);
            uafAppSDKProxy = null;
        }
        if (uafAppSDKProxy == null) {
            throw new UafException(Outcome.NOT_INSTALLED);
        }
        ResultType resultTypeInit = uafAppSDKProxy.init(uafRequestTask.mContext);
        if (resultTypeInit != ResultType.SUCCESS) {
            throw new UafException(resultTypeInit.getOutcome());
        }
        JsonArray jsonArray = new JsonArray();
        Map<Version, UafVersionSelector.SupportedMessage> supportedMessageMap = uafVersionSelector.getSupportedMessageMap();
        Gson gson = new Gson();
        Iterator<UafVersionSelector.SupportedMessage> it = supportedMessageMap.values().iterator();
        while (it.hasNext()) {
            jsonArray.add(gson.toJsonTree(it.next().uafMessage));
        }
        FidoIn fidoIn = new FidoIn();
        try {
            fidoIn.channelBindings = (Map) gson.fromJson(uafRequestTask.mChannelBindings, new TypeToken<HashMap<String, String>>() { // from class: com.noknok.android.uaf.framework.service.UafProcessor.1
            }.getType());
            fidoIn.checkPolicyOnly = uafRequestTask.mCheckPolicy;
            fidoIn.setCallerActivityProxy(uafRequestTask.mActivityProxy);
            fidoIn.fidoRequest = jsonArray.toString();
            if (uafRequestTask.mCheckPolicy) {
                fidoIn.uafIntent = UAFIntentType.CHECK_POLICY.name();
            } else {
                fidoIn.uafIntent = UAFIntentType.UAF_OPERATION.name();
            }
            FidoOut fidoOutProcess = uafAppSDKProxy.process(fidoIn);
            if (fidoOutProcess.fidoStatus == ResultType.SUCCESS) {
                String str = fidoOutProcess.responseParams;
                if (str != null) {
                    uafRequestTask.resultAdditionalData = (JsonObject) gson.fromJson(str, JsonObject.class);
                }
                return fidoOutProcess.fidoResponse;
            }
            String str2 = fidoOutProcess.responseParams;
            if (str2 != null) {
                try {
                    JsonArray asJsonArray = ((JsonObject) gson.fromJson(str2, JsonObject.class)).getAsJsonArray("exts");
                    if (asJsonArray != null) {
                        UafException uafException = new UafException(fidoOutProcess.fidoStatus.getOutcome(), (List<Extension>) gson.fromJson(gson.toJsonTree(asJsonArray), new TypeToken<List<Extension>>() { // from class: com.noknok.android.uaf.framework.service.UafProcessor.2
                        }.getType()));
                        if (uafRequestTask.mCheckPolicy) {
                            uafException.setAcceptedAuthenticators(((JsonObject) gson.fromJson(fidoOutProcess.responseParams, JsonObject.class)).getAsJsonArray(Constants.authenticators));
                        }
                        throw uafException;
                    }
                } catch (JsonSyntaxException | ClassCastException unused) {
                    throw new UafException(fidoOutProcess.fidoStatus.getOutcome());
                }
            }
            throw new UafException(fidoOutProcess.fidoStatus.getOutcome());
        } catch (JsonSyntaxException e7) {
            Logger.e("UafProcessor", "Failed to parse channel bindings", e7);
            throw new UafException(Outcome.PROTOCOL_ERROR);
        }
    }

    public DiscoveryData getDiscoveryData(ActivityProxy activityProxy) {
        short s4;
        UafAppSDKProxy uafAppSDKProxy;
        DiscoveryData discoveryData = new DiscoveryData();
        discoveryData.clientVendor = "Nok Nok Labs, Inc";
        short s7 = 0;
        try {
            String[] strArrSplit = activityProxy.getApplicationContext().getPackageManager().getPackageInfo(activityProxy.getApplicationContext().getPackageName(), 0).versionName.split("\\.");
            s4 = Short.parseShort(strArrSplit[0]);
            try {
                s7 = Short.parseShort(strArrSplit[1]);
            } catch (PackageManager.NameNotFoundException unused) {
                Logger.e("UafProcessor", "Failed on getting valid app version, default 1.0 will be used instead");
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            s4 = 1;
        }
        discoveryData.clientVersion = new Version(s4, s7);
        discoveryData.availableAuthenticators = new ArrayList();
        discoveryData.supportedUAFVersions = new ArrayList();
        JsonArray asJsonArray = Mfac.Instance().getConfig().get(AppSDKConfig.Key.clientOrder).getAsJsonArray();
        Iterator<JsonElement> it = asJsonArray.iterator();
        while (it.hasNext()) {
            String upperCase = it.next().getAsString().toUpperCase();
            upperCase.getClass();
            DiscoveryData discoveryData2 = null;
            if (upperCase.equals("REMOTE")) {
                try {
                    uafAppSDKProxy = new UafAppSDKProxy(IAppSDK.ClientLocation.REMOTE_CLIENT);
                } catch (ClassNotFoundException e5) {
                    Logger.e("UafProcessor", "Error while getting discovery data", e5);
                    uafAppSDKProxy = null;
                }
                if (uafAppSDKProxy != null) {
                    ResultType resultTypeInit = uafAppSDKProxy.init(activityProxy.getApplicationContext());
                    ResultType resultType = ResultType.SUCCESS;
                    if (resultTypeInit == resultType) {
                        FidoIn fidoIn = new FidoIn();
                        fidoIn.setCallerActivityProxy(activityProxy);
                        fidoIn.uafIntent = UAFIntentType.DISCOVER.name();
                        FidoOut fidoOutProcess = uafAppSDKProxy.process(fidoIn);
                        if (fidoOutProcess.fidoStatus == resultType && fidoOutProcess.discoveryData != null) {
                            discoveryData2 = (DiscoveryData) new Gson().fromJson(fidoOutProcess.discoveryData, DiscoveryData.class);
                        }
                    }
                }
                if (discoveryData2 != null && asJsonArray.size() == 1) {
                    discoveryData.clientVendor = discoveryData2.clientVendor;
                    discoveryData.clientVersion = discoveryData2.clientVersion;
                }
            } else if (upperCase.equals(ASMCommunicationClientProxy.ASMDestinationType.ASM_LOCAL)) {
                DiscoveryData discoveryData3 = new DiscoveryData();
                discoveryData3.supportedUAFVersions.addAll(UafVersionSelector.FC_VERSION_SET.keySet());
                Collections.sort(discoveryData3.supportedUAFVersions, Collections.reverseOrder());
                for (Authenticator authenticator : AuthenticatorManager.instance(activityProxy).getAuthenticators()) {
                    DiscoveryData.Authenticator authenticator2 = new DiscoveryData.Authenticator();
                    Logger.i(Logger.TAG_CONFIG_REPORTER, "Authnr: " + authenticator.getId());
                    authenticator2.supportedUAFVersions.addAll(UafVersionSelector.AS_UPV_SET.get(authenticator.f63562b.assertionScheme));
                    authenticator2.supportedUAFVersions.retainAll(authenticator.f63562b.asmVersions);
                    if (!authenticator2.supportedUAFVersions.isEmpty()) {
                        String str = authenticator.f63562b.title;
                        authenticator2.title = str;
                        if (str == null || str.equals("")) {
                            authenticator2.title = "title";
                        }
                        AuthenticatorInfo authenticatorInfo = authenticator.f63562b;
                        authenticator2.aaid = authenticatorInfo.aaid;
                        String str2 = authenticatorInfo.description;
                        authenticator2.description = str2;
                        if (str2 == null || str2.equals("")) {
                            authenticator2.description = "description";
                        }
                        AuthenticatorInfo authenticatorInfo2 = authenticator.f63562b;
                        authenticator2.assertionScheme = authenticatorInfo2.assertionScheme;
                        authenticator2.authenticationAlgorithm = authenticatorInfo2.authenticationAlgorithm;
                        authenticator2.attestationTypes = authenticatorInfo2.attestationTypes;
                        authenticator2.userVerification = authenticatorInfo2.userVerification;
                        authenticator2.keyProtection = authenticatorInfo2.keyProtection;
                        authenticator2.matcherProtection = authenticatorInfo2.matcherProtection;
                        authenticator2.attachmentHint = authenticatorInfo2.attachmentHint;
                        authenticator2.isSecondFactorOnly = authenticatorInfo2.isSecondFactorOnly;
                        authenticator2.tcDisplay = authenticatorInfo2.tcDisplay;
                        String str3 = authenticatorInfo2.tcDisplayContentType;
                        authenticator2.tcDisplayContentType = str3;
                        authenticator2.supportedExtensionIDs = authenticatorInfo2.supportedExtensionIDs;
                        authenticator2.tcDisplayPNGCharacteristics = authenticatorInfo2.tcDisplayPNGCharacteristics;
                        authenticator2.icon = authenticatorInfo2.icon;
                        if (str3 != null && !str3.equals("image/png")) {
                            authenticator2.tcDisplayPNGCharacteristics = null;
                        }
                        discoveryData3.availableAuthenticators.add(authenticator2);
                    }
                }
                discoveryData2 = discoveryData3;
            }
            if (discoveryData2 != null) {
                discoveryData.availableAuthenticators.addAll(discoveryData2.availableAuthenticators);
                for (Version version : discoveryData2.supportedUAFVersions) {
                    if (!discoveryData.supportedUAFVersions.contains(version)) {
                        discoveryData.supportedUAFVersions.add(version);
                    }
                }
            }
        }
        return discoveryData;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    public UafResponseTask processUafRequest(UafRequestTask uafRequestTask) {
        UafException uafException;
        OperationHeader.OperationType operationType;
        String string;
        UAFMessage uAFMessage;
        UafException uafException2;
        UafException uafException3;
        ExtensionManager extensionManager;
        byte b10;
        String strA;
        this.f63608a.startTimer("UafProcessor:processUafRequest");
        try {
            UafException uafException4 = new UafException(Outcome.PROTOCOL_ERROR);
            try {
                UafVersionSelector uafVersionSelector = new UafVersionSelector(uafRequestTask);
                Map<Version, UafVersionSelector.SupportedMessage> supportedMessageMap = uafVersionSelector.getSupportedMessageMap();
                JsonArray asJsonArray = Mfac.Instance().getConfig().get(AppSDKConfig.Key.clientOrder).getAsJsonArray();
                operationType = ((UafMessage) supportedMessageMap.values().iterator().next().uafMessage).getOperationType();
                uafException = uafException4;
                boolean z10 = true;
                string = null;
                boolean z11 = false;
                for (int i10 = 0; i10 < asJsonArray.size() && z10; i10++) {
                    try {
                        boolean z12 = operationType == OperationHeader.OperationType.Dereg;
                        try {
                            String upperCase = asJsonArray.get(i10).getAsString().toUpperCase();
                            int iHashCode = upperCase.hashCode();
                            if (iHashCode != -1881281466) {
                                if (iHashCode == 72607563 && upperCase.equals(ASMCommunicationClientProxy.ASMDestinationType.ASM_LOCAL)) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                            } else if (upperCase.equals("REMOTE")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            if (b10 != 0) {
                                if (b10 == 1) {
                                    strA = b(uafRequestTask, uafVersionSelector);
                                }
                                z10 = z12;
                            } else {
                                Iterator<UafVersionSelector.SupportedMessage> it = supportedMessageMap.values().iterator();
                                while (it.hasNext()) {
                                    UafVersionSelector.SupportedMessage next = it.next();
                                    it = it;
                                    ExtensionManager extensionManagerStartExtensionProcessing = next.uafEngine.startExtensionProcessing(uafRequestTask, next.uafMessage);
                                    next.extensionManager = extensionManagerStartExtensionProcessing;
                                    if (extensionManagerStartExtensionProcessing != null) {
                                        z11 = true;
                                    }
                                }
                                strA = a(uafRequestTask, uafVersionSelector);
                            }
                            string = strA;
                            z10 = z12;
                        } catch (UafException e5) {
                            Logger.i("UafProcessor", asJsonArray.get(i10).toString() + " client processing failed.", e5);
                            if (i10 == 0 || asJsonArray.get(i10).getAsString().equalsIgnoreCase(ASMCommunicationClientProxy.ASMDestinationType.ASM_LOCAL)) {
                                uafException = e5;
                            }
                            z10 = (e5.error().equals(Outcome.NO_MATCH) || e5.error().equals(Outcome.NOT_INSTALLED) || e5.error().equals(Outcome.NOT_COMPATIBLE)) | z12;
                        }
                    } catch (UafException e7) {
                        uafException = e7;
                        Logger.w("UafProcessor", "Error while processing Uaf request: " + uafException.getMessage());
                        string = null;
                    }
                }
                if (string != null && z11) {
                    JsonArray jsonArray = new JsonArray();
                    try {
                        for (JsonElement jsonElementFinishExtensionProcessing : (JsonArray) JsonParser.parseString(string)) {
                            JsonElement jsonElement = jsonElementFinishExtensionProcessing.getAsJsonObject().get("header");
                            if (jsonElement == null || !jsonElement.isJsonObject()) {
                                throw new UafException(Outcome.PROTOCOL_ERROR, "Invalid response header.");
                            }
                            Version version = (Version) new Gson().fromJson(jsonElement.getAsJsonObject().get("upv"), Version.class);
                            if (version == null || !version.isValid()) {
                                throw new UafException(Outcome.PROTOCOL_ERROR, "Invalid UPV.");
                            }
                            UafVersionSelector.SupportedMessage supportedMessage = supportedMessageMap.get(version);
                            if (supportedMessage != null && (extensionManager = supportedMessage.extensionManager) != null) {
                                jsonElementFinishExtensionProcessing = supportedMessage.uafEngine.finishExtensionProcessing(jsonElementFinishExtensionProcessing, extensionManager);
                            }
                            jsonArray.add(jsonElementFinishExtensionProcessing);
                        }
                        string = jsonArray.toString();
                    } catch (JsonParseException e10) {
                        Logger.e("UafProcessor", "Failed to parse json", e10);
                        throw new UafException(Outcome.PROTOCOL_ERROR);
                    }
                }
            } catch (UafException e11) {
                uafException = e11;
                operationType = null;
            }
            if (string != null) {
                uAFMessage = new UAFMessage();
                uAFMessage.uafProtocolMessage = string;
                JsonObject jsonObject = uafRequestTask.resultAdditionalData;
                if (jsonObject != null) {
                    uAFMessage.additionalData = jsonObject.toString();
                    uafException3 = null;
                } else {
                    uafException3 = null;
                    uAFMessage.additionalData = null;
                }
                uafException2 = uafException3;
            } else {
                uAFMessage = null;
                uafException2 = uafException;
            }
            if (uafException2 != null) {
                uAFMessage = new UAFMessage();
                uAFMessage.uafProtocolMessage = a(uafRequestTask.mUafMessage);
                uAFMessage.additionalData = ExceptionEncoder.addExceptionExtension(uafException2.getAdditionalData(), uafException2).toString();
            }
            if (operationType != null) {
                ConformanceTest.logResponse(ConformanceTest.logUafRequest(operationType.name(), uafRequestTask.mUafMessage), uAFMessage == null ? "" : new Gson().toJson(uAFMessage));
            }
            UafResponseTask uafResponseTask = new UafResponseTask(uAFMessage, uafException2 == null ? Outcome.SUCCESS : uafException2.error());
            this.f63608a.endTimer("UafProcessor:processUafRequest");
            return uafResponseTask;
        } catch (Throwable th2) {
            this.f63608a.endTimer("UafProcessor:processUafRequest");
            throw th2;
        }
    }

    private String a(String str) {
        JsonArray jsonArray = (JsonArray) JsonParser.parseString(str);
        JsonArray jsonArray2 = new JsonArray();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement jsonElement = it.next().getAsJsonObject().get("header");
            if (jsonElement != null) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.add("header", jsonElement);
                jsonArray2.add(jsonObject);
            }
        }
        return jsonArray2.toString();
    }
}
