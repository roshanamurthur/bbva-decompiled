package com.fido.uaf.ver0100.engine;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bbva.component.dm.naturalauth.Constants;
import com.fido.android.framework.service.Mfac;
import com.fido.uaf.ver0100.message.AuthenticationRequest;
import com.fido.uaf.ver0100.message.AuthenticationResponse;
import com.fido.uaf.ver0100.message.DeregistrationRequest;
import com.fido.uaf.ver0100.message.RegistrationRequest;
import com.fido.uaf.ver0100.message.RegistrationResponse;
import com.fido.uaf.ver0100.message.UafMessage;
import com.fido.uaf.ver0100.message.UafRequest;
import com.fido.uaf.ver0100.message.UafResponse;
import com.fido.uaf.ver0100.types.AuthenticatorRegistrationAssertion;
import com.fido.uaf.ver0100.types.AuthenticatorSignAssertion;
import com.fido.uaf.ver0100.types.ChannelBinding;
import com.fido.uaf.ver0100.types.DeregisterAuthenticator;
import com.fido.uaf.ver0100.types.FinalChallengeParams;
import com.fido.uaf.ver0100.types.OperationHeader;
import com.fido.uaf.ver0100.types.Policy;
import com.fido.uaf.ver0100.types.UafException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.json.ASMRequest;
import com.noknok.android.client.asm.api.uaf.json.ASMResponse;
import com.noknok.android.client.asm.api.uaf.json.AuthenticateIn;
import com.noknok.android.client.asm.api.uaf.json.AuthenticateOut;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.asm.api.uaf.json.RegisterIn;
import com.noknok.android.client.asm.api.uaf.json.RegisterOut;
import com.noknok.android.client.extension.ExtensionLoader;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.extension.IExtensionProcessor;
import com.noknok.android.client.extension.PlayIntegrity;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.AuthenticatorFilterChainFactory;
import com.noknok.android.client.utils.AuthenticatorFilterInParams;
import com.noknok.android.client.utils.AuthenticatorFilterOutParams;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import com.noknok.android.client.utils.JsonObjectAdapter;
import com.noknok.android.client.utils.KeyLock;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.StrictTypeAdapter;
import com.noknok.android.uaf.extensions.ExtensionList;
import com.noknok.android.uaf.framework.service.Authenticator;
import com.noknok.android.uaf.framework.service.AuthenticatorManager;
import com.noknok.android.uaf.framework.service.DefaultAuthenticatorFilterChainFactory;
import com.noknok.android.uaf.framework.service.EligibleAuthenticators;
import com.noknok.android.uaf.framework.service.FacetIDsValidator;
import com.noknok.android.uaf.framework.service.UafPolicyProcessor;
import com.noknok.android.uaf.framework.service.UafProcessor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class UafEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Tabulator f43540a = Tabulator.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlayIntegrityProcessor f43541b = new PlayIntegrityProcessor();

    /* JADX INFO: renamed from: com.fido.uaf.ver0100.engine.UafEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43542a;

        static {
            int[] iArr = new int[OperationHeader.OperationType.values().length];
            f43542a = iArr;
            try {
                iArr[OperationHeader.OperationType.Reg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43542a[OperationHeader.OperationType.Auth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43542a[OperationHeader.OperationType.Dereg.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class PlayIntegrityProcessor implements PlayIntegrity.INonceGenerator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AuthenticationResponse f43543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RegistrationResponse f43544b;

        @Override // com.noknok.android.client.extension.PlayIntegrity.INonceGenerator
        public String generateNonce() {
            String str;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                AuthenticationResponse authenticationResponse = this.f43543a;
                if (authenticationResponse != null) {
                    Iterator<AuthenticatorSignAssertion> it = authenticationResponse.assertions.iterator();
                    while (it.hasNext()) {
                        byteArrayOutputStream.write(Base64.decode(it.next().assertion, 11));
                    }
                    str = this.f43543a.fcParams;
                } else {
                    RegistrationResponse registrationResponse = this.f43544b;
                    if (registrationResponse != null) {
                        Iterator<AuthenticatorRegistrationAssertion> it2 = registrationResponse.assertions.iterator();
                        while (it2.hasNext()) {
                            byteArrayOutputStream.write(Base64.decode(it2.next().assertion, 11));
                        }
                        str = this.f43544b.fcParams;
                    } else {
                        str = null;
                    }
                }
                if (str != null) {
                    byteArrayOutputStream.write(CryptoProviderHelper.getMessageDigestInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
                }
                return Base64.encodeToString(CryptoProviderHelper.getMessageDigestInstance("SHA-256").digest(byteArrayOutputStream.toByteArray()), 11);
            } catch (IOException e5) {
                e = e5;
                throw new IllegalStateException("nonce calculation failed with exception", e);
            } catch (NoSuchAlgorithmException e7) {
                e = e7;
                throw new IllegalStateException("nonce calculation failed with exception", e);
            } catch (NoSuchProviderException e10) {
                e = e10;
                throw new IllegalStateException("nonce calculation failed with exception", e);
            }
        }
    }

    public static JsonObject a(AuthenticatorInfo authenticatorInfo, boolean z10) {
        JsonObject asJsonObject = new GsonBuilder().create().toJsonTree(authenticatorInfo).getAsJsonObject();
        asJsonObject.addProperty("isAllowed", Boolean.valueOf(z10));
        return asJsonObject;
    }

    public static String b(UafProcessor.UafRequestTask uafRequestTask, UafMessage uafMessage) {
        return new FacetIDsValidator(uafMessage.header.appID, Mfac.Instance().getContext()).validateCaller(uafRequestTask.mCallingPid, uafRequestTask.mCallingUid, uafRequestTask.mActivityProxy, uafRequestTask.mOrigin, uafRequestTask.mIsLocal, uafMessage.header.upv);
    }

    public static String c(String str, String str2, String str3, String str4) {
        return new FinalChallengeParams(str, str2, str4, str3 != null ? (ChannelBinding) new Gson().fromJson(str3, ChannelBinding.class) : null).getFinalChallenge();
    }

    public static List d(UafRequest uafRequest, String str) {
        JsonElement jsonElement;
        List<Extension> list = uafRequest.header.exts;
        return (list == null || list.size() == 0 || !((jsonElement = Mfac.Instance().getConfig().get(AppSDKConfig.Key.asmFixes).getAsJsonObject().get(str)) == null || jsonElement.getAsJsonObject().get("noExtensions") == null || !jsonElement.getAsJsonObject().get("noExtensions").getAsBoolean())) ? new ArrayList() : uafRequest.header.exts;
    }

    public static void e(List list) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Authenticator) it.next()).getAuthnrInfo().aaid);
            }
            KeyLock.getInstance().lock(arrayList);
        } catch (InterruptedException unused) {
            throw new UafException(Outcome.SYSTEM_CANCELED, "Failed to acquire the keyLock");
        }
    }

    public JsonElement finishExtensionProcessing(JsonElement jsonElement, ExtensionManager extensionManager) {
        UafResponse uafResponse;
        Gson gson = new Gson();
        try {
            UafResponse uafResponse2 = (UafResponse) gson.fromJson(jsonElement, UafResponse.class);
            if (uafResponse2 == null) {
                throw new UafException(Outcome.PROTOCOL_ERROR);
            }
            int i10 = AnonymousClass1.f43542a[uafResponse2.getOperationType().ordinal()];
            if (i10 == 1) {
                uafResponse = (UafResponse) gson.fromJson(jsonElement, RegistrationResponse.class);
            } else {
                if (i10 != 2) {
                    throw new UafException(Outcome.PROTOCOL_ERROR);
                }
                uafResponse = (UafResponse) gson.fromJson(jsonElement, AuthenticationResponse.class);
            }
            OperationHeader operationHeader = uafResponse.header;
            if (operationHeader.exts == null) {
                operationHeader.exts = new ArrayList();
            }
            extensionManager.finish(new ExtensionList(uafResponse.header.exts), null);
            if (uafResponse.header.exts.isEmpty()) {
                uafResponse.header.exts = null;
            }
            return gson.toJsonTree(uafResponse);
        } catch (JsonParseException e5) {
            Logger.e("UafEngine", "Failed to parse response.", e5);
            throw new UafException(Outcome.PROTOCOL_ERROR);
        }
    }

    public List<Authenticator> getAuthenticators(UafProcessor.UafRequestTask uafRequestTask, Object obj) {
        Policy policy;
        JsonArray jsonArray;
        List<List<AuthenticatorInfo>> list;
        List<UafPolicyProcessor.AcceptedAuthnr> arrayList;
        UafPolicyProcessor.AcceptedAuthnr acceptedAuthnr;
        char c10;
        try {
            UafMessage uafMessage = (UafMessage) obj;
            if (uafMessage == null) {
                throw new UafException(Outcome.PROTOCOL_ERROR);
            }
            List<Authenticator> authenticators = AuthenticatorManager.instance(uafRequestTask.mActivityProxy).getAuthenticators();
            if (authenticators == null || authenticators.size() == 0) {
                Logger.e("UafEngine", "Failed to get authenticator list.");
                throw new UafException(Outcome.NO_MATCH);
            }
            ArrayList arrayList2 = new ArrayList();
            int i10 = AnonymousClass1.f43542a[uafMessage.getOperationType().ordinal()];
            int i11 = 3;
            if (i10 == 1) {
                policy = ((RegistrationRequest) uafMessage).policy;
                if (!uafRequestTask.mCheckPolicy) {
                    try {
                        Mfac.Instance().showEulaDialog();
                    } catch (AsmException unused) {
                        throw new UafException(Outcome.CANCELED);
                    }
                }
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return authenticators;
                    }
                    throw new UafException(Outcome.PROTOCOL_ERROR);
                }
                policy = ((AuthenticationRequest) uafMessage).policy;
                String strB = b(uafRequestTask, uafMessage);
                String str = uafMessage.header.appID;
                if (str != null && str.length() != 0) {
                    strB = str;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Authenticator authenticator : authenticators) {
                    if (authenticator.isRegistered(strB)) {
                        arrayList3.add(authenticator);
                    }
                }
                authenticators = arrayList3;
            }
            if (!Mfac.Instance().isEnabled()) {
                Logger.e("UafEngine", "MFAC is not enabled.");
                throw new UafException(Outcome.NO_MATCH);
            }
            UafPolicyProcessor uafPolicyProcessor = new UafPolicyProcessor(policy.accepted, policy.disallowed, authenticators);
            EligibleAuthenticators eligibleAuthnrs = uafPolicyProcessor.getEligibleAuthnrs();
            List<List<UafPolicyProcessor.AcceptedAuthnr>> allAuthnrs = (uafMessage.getOperationType() == OperationHeader.OperationType.Auth && policy.accepted.size() == 0) ? uafPolicyProcessor.getAllAuthnrs() : uafPolicyProcessor.getAcceptedAuthnrs();
            if (allAuthnrs == null || allAuthnrs.size() == 0) {
                throw new UafException(Outcome.NO_MATCH, "No accepted authenticators");
            }
            Logger.i("UafEngine", allAuthnrs.size() + " authenticators accepted");
            IAuthenticatorFilter.OperationType operationType = uafMessage.getOperationType() == OperationHeader.OperationType.Reg ? IAuthenticatorFilter.OperationType.Reg : IAuthenticatorFilter.OperationType.Auth;
            ArrayList<List> arrayList4 = new ArrayList();
            for (List<UafPolicyProcessor.AcceptedAuthnr> list2 : allAuthnrs) {
                ArrayList arrayList5 = new ArrayList();
                Iterator<UafPolicyProcessor.AcceptedAuthnr> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList5.add(eligibleAuthnrs.getAuthenticators().get(it.next().index).getAuthnrInfo());
                }
                arrayList4.add(arrayList5);
            }
            AuthenticatorFilterInParams authenticatorFilterInParams = new AuthenticatorFilterInParams();
            authenticatorFilterInParams.disallowedAAIDs = eligibleAuthnrs.getDisallowedAAIDs();
            authenticatorFilterInParams.context = uafRequestTask.mContext;
            authenticatorFilterInParams.activityProxy = uafRequestTask.mActivityProxy;
            authenticatorFilterInParams.operationType = operationType;
            authenticatorFilterInParams.showWhenLocked = uafRequestTask.mShowWhenLocked;
            authenticatorFilterInParams.checkPolicy = uafRequestTask.mCheckPolicy;
            authenticatorFilterInParams.authenticators = new ArrayList();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                authenticatorFilterInParams.authenticators.add(new ArrayList((List) it2.next()));
            }
            AuthenticatorFilterOutParams authenticatorFilterOutParams = null;
            boolean z10 = false;
            for (IAuthenticatorFilter iAuthenticatorFilter : uafRequestTask.mAuthenticatorFilters) {
                AuthenticatorFilterOutParams authenticatorFilterOutParamsProcess = iAuthenticatorFilter.process(authenticatorFilterInParams);
                if (authenticatorFilterOutParamsProcess.mOperationCanceled) {
                    throw new UafException(Outcome.CANCELED);
                }
                if (authenticatorFilterOutParamsProcess.mOperationSystemCanceled) {
                    throw new UafException(Outcome.SYSTEM_CANCELED);
                }
                if (authenticatorFilterOutParamsProcess.mOperationTimeout) {
                    throw new UafException(Outcome.USER_NOT_RESPONSIVE);
                }
                if (authenticatorFilterOutParamsProcess.mRetryOnCancel) {
                    z10 = true;
                }
                if (authenticatorFilterInParams.authenticators.size() != authenticatorFilterOutParamsProcess.mAuthenticators.size()) {
                    Locale locale = Locale.getDefault();
                    Object[] objArr = new Object[i11];
                    objArr[0] = Integer.valueOf(authenticatorFilterInParams.authenticators.size());
                    objArr[1] = Integer.valueOf(authenticatorFilterOutParamsProcess.mAuthenticators.size());
                    String simpleName = iAuthenticatorFilter.getClass().getSimpleName();
                    c10 = 2;
                    objArr[2] = simpleName;
                    Logger.i("UafEngine", String.format(locale, "%d -> %d: %s", objArr));
                } else {
                    c10 = 2;
                }
                authenticatorFilterInParams.authenticators = authenticatorFilterOutParamsProcess.mAuthenticators;
                i11 = 3;
                authenticatorFilterOutParams = authenticatorFilterOutParamsProcess;
            }
            uafRequestTask.mRetryOnCancel = z10;
            if (uafRequestTask.mCheckPolicy) {
                jsonArray = new JsonArray();
                List<String> list3 = authenticatorFilterInParams.disallowedAAIDs;
                if (list3 == null || list3.isEmpty()) {
                    Iterator<List<AuthenticatorInfo>> it3 = authenticatorFilterOutParams.mAuthenticators.iterator();
                    while (it3.hasNext()) {
                        jsonArray.add(a(it3.next().get(0), true));
                    }
                } else {
                    for (List list4 : arrayList4) {
                        if (authenticatorFilterOutParams.mAuthenticators.contains(list4)) {
                            jsonArray.add(a((AuthenticatorInfo) list4.get(0), true));
                        } else if (authenticatorFilterInParams.disallowedAAIDs.contains(((AuthenticatorInfo) list4.get(0)).aaid)) {
                            jsonArray.add(a((AuthenticatorInfo) list4.get(0), false));
                        }
                    }
                }
                uafRequestTask.addAdditionalData(Constants.authenticators, jsonArray);
            } else {
                jsonArray = null;
            }
            if (authenticatorFilterOutParams == null || (list = authenticatorFilterOutParams.mAuthenticators) == null || list.isEmpty()) {
                UafException uafException = new UafException(Outcome.NO_MATCH, "No accepted authenticators");
                uafException.setAcceptedAuthenticators(jsonArray);
                throw uafException;
            }
            List<AuthenticatorInfo> list5 = authenticatorFilterOutParams.mAuthenticators.get(0);
            Iterator<List<UafPolicyProcessor.AcceptedAuthnr>> it4 = allAuthnrs.iterator();
            loop6: while (true) {
                if (!it4.hasNext()) {
                    arrayList = new ArrayList();
                    break;
                }
                arrayList = it4.next();
                if (operationType != IAuthenticatorFilter.OperationType.Auth) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<AuthenticatorInfo> it5 = list5.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            arrayList = arrayList6;
                            break;
                        }
                        AuthenticatorInfo next = it5.next();
                        Iterator it6 = arrayList.iterator();
                        do {
                            if (!it6.hasNext()) {
                                arrayList = new ArrayList();
                                break;
                            }
                            acceptedAuthnr = (UafPolicyProcessor.AcceptedAuthnr) it6.next();
                        } while (!acceptedAuthnr.aaid.equals(next.aaid));
                        arrayList6.add(acceptedAuthnr);
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                } else if (arrayList.size() == list5.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break loop6;
                        }
                        if (!((UafPolicyProcessor.AcceptedAuthnr) arrayList.get(i12)).aaid.equals(list5.get(i12).aaid)) {
                            break;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            }
            if (uafRequestTask.mCheckPolicy) {
                return arrayList2;
            }
            for (UafPolicyProcessor.AcceptedAuthnr acceptedAuthnr2 : arrayList) {
                Authenticator authenticator2 = eligibleAuthnrs.getAuthenticators().get(acceptedAuthnr2.index);
                authenticator2.setKeyIDs(acceptedAuthnr2.keyIDList);
                arrayList2.add(authenticator2);
            }
            return arrayList2;
        } catch (ClassCastException unused2) {
            throw new UafException(Outcome.PROTOCOL_ERROR);
        }
    }

    public OperationHeader.OperationType getOperationType(Object obj) {
        return ((UafMessage) obj).getOperationType();
    }

    public Object parseRequest(JsonElement jsonElement) {
        UafMessage uafMessage;
        Gson gsonCreate = StrictTypeAdapter.GsonBuilder().create();
        try {
            UafMessage uafMessage2 = (UafMessage) gsonCreate.fromJson(jsonElement, UafMessage.class);
            if (uafMessage2 == null || !uafMessage2.isValid()) {
                throw new UafException(Outcome.PROTOCOL_ERROR);
            }
            int i10 = AnonymousClass1.f43542a[uafMessage2.getOperationType().ordinal()];
            if (i10 == 1) {
                uafMessage = (UafMessage) gsonCreate.fromJson(jsonElement, RegistrationRequest.class);
            } else if (i10 == 2) {
                uafMessage = (UafMessage) gsonCreate.fromJson(jsonElement, AuthenticationRequest.class);
            } else {
                if (i10 != 3) {
                    throw new UafException(Outcome.PROTOCOL_ERROR);
                }
                uafMessage = (UafMessage) gsonCreate.fromJson(jsonElement, DeregistrationRequest.class);
            }
            if (uafMessage.isValid()) {
                return uafMessage;
            }
            throw new UafException(Outcome.PROTOCOL_ERROR);
        } catch (JsonParseException e5) {
            Logger.e("UafEngine", "Failed to parse message.", e5);
            throw new UafException(Outcome.PROTOCOL_ERROR);
        }
    }

    public JsonElement process(@NonNull UafProcessor.UafRequestTask uafRequestTask, @NonNull Object obj, @NonNull List<Authenticator> list) {
        Object obj2;
        int i10 = AnonymousClass1.f43542a[((UafMessage) obj).getOperationType().ordinal()];
        PlayIntegrityProcessor playIntegrityProcessor = this.f43541b;
        Tabulator tabulator = this.f43540a;
        if (i10 == 1) {
            RegistrationRequest registrationRequest = (RegistrationRequest) obj;
            tabulator.startTimer("UafEngine:processRegister");
            try {
                String strB = b(uafRequestTask, registrationRequest);
                String str = registrationRequest.header.appID;
                if (str == null || str.length() == 0) {
                    str = strB;
                }
                ArrayList arrayList = new ArrayList();
                String strC = c(str, registrationRequest.challenge, uafRequestTask.mChannelBindings, strB);
                RegisterIn registerIn = new RegisterIn();
                registerIn.appID = str;
                registerIn.username = registrationRequest.username;
                registerIn.finalChallenge = strC;
                e(list);
                Iterator<Authenticator> it = list.iterator();
                while (it.hasNext()) {
                    Authenticator next = it.next();
                    AuthenticatorInfo authnrInfo = next.getAuthnrInfo();
                    registerIn.attestationType = Short.valueOf(next.getAttestationType());
                    try {
                        Gson gsonCreate = JsonObjectAdapter.GsonBuilder().create();
                        ASMRequest aSMRequest = new ASMRequest();
                        aSMRequest.args = (JsonObject) gsonCreate.toJsonTree(registerIn);
                        aSMRequest.exts = d(registrationRequest, authnrInfo.aaid);
                        ASMResponse aSMResponseRegister = next.register(aSMRequest);
                        RegisterOut registerOut = (RegisterOut) gsonCreate.fromJson((JsonElement) aSMResponseRegister.responseData, RegisterOut.class);
                        JsonObject jsonObject = (JsonObject) gsonCreate.fromJson(gsonCreate.toJson(next.getAuthnrInfo()), JsonObject.class);
                        jsonObject.remove("icon");
                        JsonArray jsonArray = new JsonArray();
                        RegisterIn registerIn2 = registerIn;
                        Iterator<Authenticator> it2 = it;
                        jsonArray.add(gsonCreate.toJsonTree(new Extension(ExtensionManager.AUTHENTICATOR_INFO_EXT_ID, gsonCreate.toJson((JsonElement) jsonObject), false)));
                        uafRequestTask.addAdditionalData("exts", jsonArray);
                        List<Extension> list2 = aSMResponseRegister.exts;
                        if (list2 != null && list2.isEmpty()) {
                            aSMResponseRegister.exts = null;
                        }
                        arrayList.add(new AuthenticatorRegistrationAssertion(registerOut.assertionScheme, registerOut.assertion, aSMResponseRegister.exts));
                        registerIn = registerIn2;
                        it = it2;
                    } catch (AsmException e5) {
                        throw new UafException(e5.error(), e5.getExtensions());
                    }
                }
                RegistrationResponse registrationResponse = new RegistrationResponse(str);
                registrationResponse.header = registrationRequest.header;
                registrationResponse.fcParams = strC;
                registrationResponse.assertions = arrayList;
                playIntegrityProcessor.f43544b = registrationResponse;
                tabulator.endTimer("UafEngine:processRegister");
                obj2 = registrationResponse;
            } catch (Throwable th2) {
                tabulator.endTimer("UafEngine:processRegister");
                throw th2;
            }
        } else if (i10 == 2) {
            AuthenticationRequest authenticationRequest = (AuthenticationRequest) obj;
            tabulator.startTimer("UafEngine:processAuthenticate");
            try {
                String strB2 = b(uafRequestTask, authenticationRequest);
                String str2 = authenticationRequest.header.appID;
                if (str2 == null || str2.length() == 0) {
                    str2 = strB2;
                }
                ArrayList arrayList2 = new ArrayList();
                String strC2 = c(str2, authenticationRequest.challenge, uafRequestTask.mChannelBindings, strB2);
                AuthenticateIn authenticateIn = new AuthenticateIn();
                authenticateIn.appID = str2;
                authenticateIn.finalChallenge = strC2;
                authenticateIn.transaction = authenticationRequest.transaction;
                e(list);
                for (Authenticator authenticator : list) {
                    AuthenticatorInfo authnrInfo2 = authenticator.getAuthnrInfo();
                    if (!authenticator.getKeyIDs().isEmpty()) {
                        authenticateIn.keyIDs = authenticator.getKeyIDs();
                    }
                    try {
                        Gson gsonCreate2 = JsonObjectAdapter.GsonBuilder().create();
                        ASMRequest aSMRequest2 = new ASMRequest();
                        aSMRequest2.args = (JsonObject) gsonCreate2.toJsonTree(authenticateIn);
                        aSMRequest2.exts = d(authenticationRequest, authnrInfo2.aaid);
                        ASMResponse aSMResponseAuthenticate = authenticator.authenticate(aSMRequest2);
                        AuthenticateOut authenticateOut = (AuthenticateOut) gsonCreate2.fromJson((JsonElement) aSMResponseAuthenticate.responseData, AuthenticateOut.class);
                        List<Extension> list3 = aSMResponseAuthenticate.exts;
                        if (list3 != null && list3.isEmpty()) {
                            aSMResponseAuthenticate.exts = null;
                        }
                        arrayList2.add(new AuthenticatorSignAssertion(authnrInfo2.assertionScheme, authenticateOut.assertion, aSMResponseAuthenticate.exts));
                    } catch (AsmException e7) {
                        throw new UafException(e7.error(), e7.getExtensions());
                    }
                }
                AuthenticationResponse authenticationResponse = new AuthenticationResponse(str2);
                authenticationResponse.header = authenticationRequest.header;
                authenticationResponse.fcParams = strC2;
                authenticationResponse.assertions = arrayList2;
                playIntegrityProcessor.f43543a = authenticationResponse;
                tabulator.endTimer("UafEngine:processAuthenticate");
                obj2 = authenticationResponse;
            } catch (Throwable th3) {
                tabulator.endTimer("UafEngine:processAuthenticate");
                throw th3;
            }
        } else {
            if (i10 != 3) {
                throw new UafException(Outcome.PROTOCOL_ERROR);
            }
            DeregistrationRequest deregistrationRequest = (DeregistrationRequest) obj;
            tabulator.startTimer("UafEngine:processDeregister");
            List<DeregisterAuthenticator> list4 = deregistrationRequest.authenticators;
            String strB3 = b(uafRequestTask, deregistrationRequest);
            String str3 = deregistrationRequest.header.appID;
            if (str3 != null && str3.length() != 0) {
                strB3 = str3;
            }
            for (DeregisterAuthenticator deregisterAuthenticator : list4) {
                AuthenticatorManager.instance(uafRequestTask.mActivityProxy).deregisterAuthenticator(deregisterAuthenticator, list, strB3, d(deregistrationRequest, deregisterAuthenticator.aaid));
            }
            tabulator.endTimer("UafEngine:processDeregister");
            obj2 = null;
        }
        if (obj2 != null) {
            return new Gson().toJsonTree(obj2);
        }
        return null;
    }

    public ExtensionManager startExtensionProcessing(UafProcessor.UafRequestTask uafRequestTask, Object obj) {
        ExtensionManager extensionManager;
        try {
            UafMessage uafMessage = (UafMessage) obj;
            if (uafMessage == null) {
                throw new UafException(Outcome.PROTOCOL_ERROR);
            }
            String data = null;
            if (uafRequestTask.mCheckPolicy || uafMessage.getOperationType() == OperationHeader.OperationType.Dereg) {
                extensionManager = null;
            } else {
                List<IExtensionProcessor> listLoadExtensions = ExtensionLoader.getInstance(uafRequestTask.mContext).loadExtensions();
                listLoadExtensions.set(0, new PlayIntegrity(uafRequestTask.mContext, this.f43541b));
                extensionManager = new ExtensionManager(listLoadExtensions);
                String strB = b(uafRequestTask, uafMessage);
                String str = uafMessage.header.appID;
                if (str == null || str.length() == 0) {
                    str = strB;
                }
                String strC = c(str, uafMessage.getOperationType() == OperationHeader.OperationType.Reg ? ((RegistrationRequest) uafMessage).challenge : ((AuthenticationRequest) uafMessage).challenge, uafRequestTask.mChannelBindings, strB);
                HashMap<IExtensionProcessor.ExtProcParamKey, String> map = new HashMap<>();
                map.put(IExtensionProcessor.ExtProcParamKey.FACET_ID_KEY, strB);
                map.put(IExtensionProcessor.ExtProcParamKey.FC_PARAMS_KEY, strC);
                map.put(IExtensionProcessor.ExtProcParamKey.PACKAGE_NAME_KEY, uafRequestTask.mCallerPkgName);
                map.put(IExtensionProcessor.ExtProcParamKey.EXT_OP_TYPE, IExtensionProcessor.ExtensionOpType.protocol.name());
                extensionManager.start(new ExtensionList(uafMessage.header.exts), map, uafRequestTask.mActivityProxy);
                List<Extension> list = uafMessage.header.exts;
                if (list != null) {
                    for (Extension extension : list) {
                        if (extension.getId().equals(ExtensionList.SHOWWHENLOCKED_ID)) {
                            uafRequestTask.mShowWhenLocked = true;
                        }
                        Logger.d("UafEngine", String.format("Extension: %s, \"%s\", %s", extension.getId(), extension.getData(), Boolean.valueOf(extension.isFailIfUnknown())));
                    }
                }
                List<Extension> list2 = uafMessage.header.exts;
                if (list2 != null && list2.isEmpty()) {
                    uafMessage.header.exts = null;
                }
            }
            ExtensionList extensionList = new ExtensionList(uafMessage.header.exts);
            Extension extension2 = extensionList.getExtension(ExtensionManager.FILTER_CHAIN_EXT_ID);
            if (extension2 != null) {
                data = extension2.getData() != null ? extension2.getData() : null;
                extensionList.removeExtension(extension2.getId());
            }
            synchronized (AuthenticatorFilterChainFactory.class) {
                try {
                    if (AuthenticatorFilterChainFactory.getInstance() == null) {
                        AuthenticatorFilterChainFactory.setInstance(new DefaultAuthenticatorFilterChainFactory());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            uafRequestTask.mAuthenticatorFilters = AuthenticatorFilterChainFactory.getInstance().createFilterChain(data);
            return extensionManager;
        } catch (ClassCastException unused) {
            throw new UafException(Outcome.PROTOCOL_ERROR);
        }
    }
}
