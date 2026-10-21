package com.noknok.android.client.asm.core.uaf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.fido.android.framework.tm.core.prov.CryptoModule;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.noknok.android.asmsdk_uaf.R;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.api.uaf.json.ASMResponse;
import com.noknok.android.client.asm.api.uaf.json.AuthenticateIn;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.DeregisterIn;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.asm.api.uaf.json.GetRegistrationsOut;
import com.noknok.android.client.asm.api.uaf.json.RegisterIn;
import com.noknok.android.client.asm.api.uaf.json.RegisterOut;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.asm.authenticator.KsUafAuthenticatorKernel;
import com.noknok.android.client.asm.core.GetInfoParams;
import com.noknok.android.client.asm.core.MatcherParamsHelper;
import com.noknok.android.client.asm.core.shared.DescriptorLoader;
import com.noknok.android.client.asm.extensions.KeyAttestation;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IAuthenticatorKernel;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.asm.sdk.UVTMatcherOutParams;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.extension.IExtensionProcessor;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppUtils;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.JsonObjectAdapter;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.TransactionUIFactory;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.client.utils.UserSelectionUIFactory;
import com.noknok.android.uaf.asmcore.AKProcessor;
import com.noknok.android.uaf.asmcore.AuthenticatorDatabase;
import com.noknok.android.uaf.asmcore.AuthenticatorDatabaseFactory;
import com.noknok.android.uaf.asmcore.TLVCommandEncoder;
import com.noknok.android.uaf.extensions.ExtensionList;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class AuthenticatorCore implements AntiHammering.IEraseCallback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final SecureRandom f63244o = new SecureRandom();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final AtomicInteger f63245p = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IAuthenticatorDescriptor f63247b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tabulator f63246a = Tabulator.getInstance();
    protected Context mContext = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AuthenticatorDatabase f63248c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AKProcessor f63249d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AKProcessor.AkAuthnrInfo f63250e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f63251f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TCDisplayResponse f63252g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AntiHammering f63253h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IMatcher f63254i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ExtensionManager f63255j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Gson f63256k = JsonObjectAdapter.GsonBuilder().create();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IAuthenticatorKernel f63257l = null;
    private boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Semaphore f63258n = new Semaphore(1);

    /* JADX INFO: renamed from: com.noknok.android.client.asm.core.uaf.AuthenticatorCore$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f63260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f63261c;

        static {
            int[] iArr = new int[Outcome.values().length];
            f63261c = iArr;
            try {
                iArr[Outcome.CANCELED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63261c[Outcome.USER_LOCKOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63261c[Outcome.USER_NOT_ENROLLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63261c[Outcome.KEY_DISAPPEARED_PERMANENTLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IMatcher.EnrollState.values().length];
            f63260b = iArr2;
            try {
                iArr2[IMatcher.EnrollState.ENROLLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63260b[IMatcher.EnrollState.NOT_ENROLLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63260b[IMatcher.EnrollState.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[IAuthenticatorDescriptor.TransactionUI.values().length];
            f63259a = iArr3;
            try {
                iArr3[IAuthenticatorDescriptor.TransactionUI.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63259a[IAuthenticatorDescriptor.TransactionUI.Custom.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f63259a[IAuthenticatorDescriptor.TransactionUI.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class TCDisplayResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f63262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Outcome f63263b;

        private TCDisplayResponse() {
        }

        public /* synthetic */ TCDisplayResponse(int i10) {
            this();
        }

        public Outcome getOutcome() {
            return this.f63263b;
        }

        public void setOutcome(Outcome outcome) {
            this.f63263b = outcome;
        }
    }

    public static class UserVerifyResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f63264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f63265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        short f63266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Byte f63267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        IMatcher.MatcherInParams f63268e;
        public List<IMatcher.Extension> extensions;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        MatcherParamsHelper.AuthenticatorMatcherType f63269f;

        public /* synthetic */ UserVerifyResponse(int i10) {
            this();
        }

        public Outcome getOutcome() {
            return Outcome.fromAsmStatusCode(this.f63266c);
        }

        public void setOutcome(Outcome outcome) {
            this.f63266c = outcome.getUafAsmStatusCode();
        }

        private UserVerifyResponse() {
            this.f63268e = null;
        }
    }

    public static class Username {
        public final String keyHandle;
        public long timeStamp;
        public final String username;

        public Username(String str, String str2, long j10) {
            this.username = str;
            this.keyHandle = str2;
            this.timeStamp = j10;
        }
    }

    public AuthenticatorCore(IAuthenticatorDescriptor iAuthenticatorDescriptor) {
        this.f63247b = iAuthenticatorDescriptor;
    }

    private void a(Context context) {
        AuthenticatorInfo authenticatorInfo = this.f63250e.generalInfo;
        String str = authenticatorInfo.aaid;
        this.f63248c = AuthenticatorDatabaseFactory.createAuthenticatorStore(authenticatorInfo.isRoamingAuthenticator, str, new CryptoModule(str, context), context, this.f63249d);
        if (this.f63257l instanceof KsUafAuthenticatorKernel) {
            Logger.i("AuthenticatorCore", "Checking the Authenticator Database");
            if (!((KsUafAuthenticatorKernel) this.f63257l).checkDatabase(this.f63248c)) {
                Logger.w("AuthenticatorCore", "Erasing the Authenticator Database");
                this.f63248c.eraseDatabase();
            }
        }
        this.f63248c.setAuthenticatorIndex(this.f63250e.generalInfo.authenticatorIndex);
    }

    private boolean b() {
        int i10 = AnonymousClass1.f63260b[this.f63254i.isUserEnrolled().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return this.f63250e.generalInfo.isRoamingAuthenticator || this.f63248c.hasRegistrations();
        }
        throw new IllegalArgumentException();
    }

    private void c() {
        try {
            this.f63258n.acquire();
        } catch (InterruptedException e5) {
            throw new AsmException(Outcome.CANCELED, "The processing was interrupted", e5);
        }
    }

    private void d() {
        this.f63250e.generalInfo.userVerification = UserVerification.getUafValue(this.f63247b.getUserVerification());
        this.f63250e.generalInfo.attachmentHint = IAuthenticatorKernel.AttachmentHint.getUafValue(this.f63257l.getAttachmentHint());
        this.f63250e.generalInfo.hasSettings = this.f63247b.hasSettings();
        this.f63250e.generalInfo.isUserEnrolled = b();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.mContext.getResources(), this.f63247b.getIcon());
        if (bitmapDecodeResource != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            this.f63250e.generalInfo.icon = String.format("data:image/png;base64,%s", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        } else {
            Logger.e("AuthenticatorCore", "Failed to find authenticator icon resource");
        }
        Logger.d("AuthenticatorCore", String.format("Authenticator info:\n%s", this.f63250e.generalInfo));
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0206: MOVE (r2 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:106:0x0206 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0210: MOVE (r2 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:108:0x020b */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12371. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public com.noknok.android.client.asm.api.uaf.json.ASMResponse authenticate(com.noknok.android.client.asm.api.uaf.json.AuthenticateIn r30, @androidx.annotation.NonNull java.util.List<com.noknok.android.client.asm.api.uaf.json.Extension> r31, com.noknok.android.client.utils.ActivityProxy r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.noknok.android.client.asm.core.uaf.AuthenticatorCore.authenticate(com.noknok.android.client.asm.api.uaf.json.AuthenticateIn, java.util.List, com.noknok.android.client.utils.ActivityProxy, java.lang.String):com.noknok.android.client.asm.api.uaf.json.ASMResponse");
    }

    public ASMResponse deregister(DeregisterIn deregisterIn, @NonNull List<Extension> list, String str) {
        String str2;
        this.f63246a.startTimer("AuthenticatorCore:deregister");
        this.f63251f = AppUtils.getCallerID(this.mContext, str);
        ASMResponse aSMResponse = new ASMResponse();
        c();
        try {
            String str3 = deregisterIn.appID;
            if (str3 == null || str3.equals("") || deregisterIn.appID.length() > 512 || (str2 = deregisterIn.keyID) == null) {
                Logger.e("AuthenticatorCore", "Invalid DeregisterIn params");
                throw new AsmException(Outcome.FAILURE, "Invalid DeregisterIn params");
            }
            if (str2.equals("")) {
                aSMResponse.setOutcome(Outcome.SUCCESS);
                Iterator<GetRegistrationsOut.AppRegistration> it = a(Base64.encodeToString(this.f63251f, 11)).appRegs.iterator();
                while (it.hasNext()) {
                    Iterator<String> it2 = it.next().keyIDs.iterator();
                    while (it2.hasNext()) {
                        ASMResponse aSMResponseA = a(deregisterIn.appID, it2.next(), list);
                        if (aSMResponseA.getOutcome() != Outcome.SUCCESS) {
                            aSMResponse.setOutcome(aSMResponseA.getOutcome());
                        }
                    }
                }
            } else {
                aSMResponse = a(deregisterIn.appID, deregisterIn.keyID, list);
            }
            this.f63258n.release();
            this.f63246a.endTimer("AuthenticatorCore:deregister");
            return aSMResponse;
        } catch (Throwable th2) {
            this.f63258n.release();
            throw th2;
        }
    }

    public AuthenticatorInfo getInfo() {
        AKProcessor.AkAuthnrInfo aKInfo = this.f63249d.getAKInfo(this.f63250e.generalInfo.aaid);
        c();
        try {
            this.f63248c.setAuthenticatorIndex(aKInfo.generalInfo.authenticatorIndex);
            this.f63250e.generalInfo.isUserEnrolled = b();
            this.f63258n.release();
            AKProcessor.AkAuthnrInfo akAuthnrInfo = this.f63250e;
            akAuthnrInfo.additionalInfo = aKInfo.additionalInfo;
            AuthenticatorInfo authenticatorInfo = akAuthnrInfo.generalInfo;
            AuthenticatorInfo authenticatorInfo2 = aKInfo.generalInfo;
            authenticatorInfo.authenticatorIndex = authenticatorInfo2.authenticatorIndex;
            authenticatorInfo.asmVersions = authenticatorInfo2.asmVersions;
            authenticatorInfo.assertionScheme = authenticatorInfo2.assertionScheme;
            authenticatorInfo.authenticationAlgorithm = authenticatorInfo2.authenticationAlgorithm;
            authenticatorInfo.attestationTypes = authenticatorInfo2.attestationTypes;
            authenticatorInfo.supportedExtensionIDs = authenticatorInfo2.supportedExtensionIDs;
            authenticatorInfo.keyProtection = authenticatorInfo2.keyProtection;
            authenticatorInfo.matcherProtection = authenticatorInfo2.matcherProtection;
            authenticatorInfo.isSecondFactorOnly = authenticatorInfo2.isSecondFactorOnly;
            authenticatorInfo.isRoamingAuthenticator = authenticatorInfo2.isRoamingAuthenticator;
            authenticatorInfo.tcDisplay = authenticatorInfo2.tcDisplay;
            authenticatorInfo.tcDisplayContentType = authenticatorInfo2.tcDisplayContentType;
            authenticatorInfo.tcDisplayPNGCharacteristics = authenticatorInfo2.tcDisplayPNGCharacteristics;
            authenticatorInfo.attachmentHint = IAuthenticatorKernel.AttachmentHint.getUafValue(this.f63257l.getAttachmentHint());
            this.f63250e.generalInfo.description = this.mContext.getString(this.f63247b.getDescription());
            this.f63250e.generalInfo.title = this.mContext.getString(this.f63247b.getTitle());
            return this.f63250e.generalInfo;
        } catch (Throwable th2) {
            this.f63258n.release();
            throw th2;
        }
    }

    public long getReferenceID() {
        return this.f63250e.generalInfo.authenticatorIndex;
    }

    public ASMResponse getRegistrations(String str) {
        this.f63251f = AppUtils.getCallerID(this.mContext, str);
        ASMResponse aSMResponse = new ASMResponse();
        c();
        try {
            try {
                aSMResponse.responseData = (JsonObject) this.f63256k.toJsonTree(a(Base64.encodeToString(this.f63251f, 11)));
                aSMResponse.setOutcome(Outcome.SUCCESS);
                this.f63258n.release();
                return aSMResponse;
            } catch (AsmException e5) {
                Logger.e("AuthenticatorCore", "Failed to get registrations", e5);
                throw e5;
            }
        } catch (Throwable th2) {
            this.f63258n.release();
            throw th2;
        }
    }

    public boolean hasAsmVersion(Version version) {
        return this.f63250e.generalInfo.asmVersions.contains(version);
    }

    public void initialize(Context context, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        Logger.i("AuthenticatorCore", "initialize");
        this.mContext = context;
        Class<? extends IMatcher> matcherClass = this.f63247b.getMatcherClass();
        ProtocolType protocolType = ProtocolType.UAF;
        IMatcher iMatcherLoadAuthenticatorUIFromClassName = DescriptorLoader.loadAuthenticatorUIFromClassName(matcherClass, context, protocolType);
        this.f63254i = iMatcherLoadAuthenticatorUIFromClassName;
        IAuthenticatorKernel authenticatorKernel = DescriptorLoader.loadAKSelectorFromClassName(iMatcherLoadAuthenticatorUIFromClassName, this.f63247b, context, protocolType, aAIDInfo).getAuthenticatorKernel();
        this.f63257l = authenticatorKernel;
        if (authenticatorKernel == null) {
            throw new AsmException(Outcome.FAILURE, "LoadAKSelector failed. No AAID Selected");
        }
        AKProcessor aKProcessor = new AKProcessor(authenticatorKernel);
        this.f63249d = aKProcessor;
        this.f63250e = aKProcessor.getAKInfo(aAIDInfo.aaid);
        c();
        try {
            a(context);
            d();
            if (!this.f63250e.generalInfo.isRoamingAuthenticator) {
                this.f63253h = new AntiHammering(this.f63248c, this);
            }
            if (!this.f63250e.generalInfo.isRoamingAuthenticator) {
                this.f63248c.validateUserRegistrations(this.f63254i);
            }
            this.f63258n.release();
            ArrayList arrayList = new ArrayList();
            ArrayList<String> extensionProcessors = this.f63247b.getExtensionProcessors();
            if (extensionProcessors != null) {
                try {
                    Iterator<String> it = extensionProcessors.iterator();
                    while (it.hasNext()) {
                        arrayList.add((IExtensionProcessor) Class.forName(it.next()).getConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
                    throw new IllegalArgumentException("Failed to initialize the extension processor", e5);
                }
            }
            arrayList.add(new KeyAttestation(this.mContext));
            this.f63255j = new ExtensionManager(arrayList);
        } catch (Throwable th2) {
            this.f63258n.release();
            throw th2;
        }
    }

    @Override // com.noknok.android.client.asm.core.uaf.AntiHammering.IEraseCallback
    public void onErase() {
        c();
        try {
            ArrayList arrayList = new ArrayList();
            for (AuthenticatorDatabase.RegistrationRecord registrationRecord : this.f63248c.getRegistrations()) {
                a(registrationRecord.appID, registrationRecord.keyID, arrayList);
            }
            this.f63258n.release();
        } catch (Throwable th2) {
            this.f63258n.release();
            throw th2;
        }
    }

    public ASMResponse openSettings(ActivityProxy activityProxy) {
        ASMResponse aSMResponse = new ASMResponse();
        if (!this.f63250e.generalInfo.isRoamingAuthenticator && MatcherParamsHelper.getMatcherType(this.f63247b.isAKManagedMatcher(), this.f63250e.generalInfo.isRoamingAuthenticator, this.f63254i) != MatcherParamsHelper.AuthenticatorMatcherType.MATCHER_TYPE_AKMANAGED) {
            IMatcher iMatcher = this.f63254i;
            iMatcher.settings(MatcherParamsHelper.createMatcherManageInParams(iMatcher, this.f63253h, this.f63250e.generalInfo.aaid, activityProxy));
        }
        aSMResponse.setOutcome(Outcome.SUCCESS);
        return aSMResponse;
    }

    public ASMResponse register(RegisterIn registerIn, @NonNull List<Extension> list, ActivityProxy activityProxy, String str) {
        byte[] bArrDigest;
        this.f63246a.startTimer("AuthenticatorCore:register");
        byte[] callerID = AppUtils.getCallerID(this.mContext, str);
        this.f63251f = callerID;
        String strEncodeToString = Base64.encodeToString(callerID, 11);
        try {
            ASMResponse aSMResponse = new ASMResponse();
            if (!registerIn.isValid()) {
                Logger.e("AuthenticatorCore", "Invalid RegisterIn params");
                throw new AsmException(Outcome.FAILURE, "Invalid RegisterIn params");
            }
            if (!a(list)) {
                Logger.e("AuthenticatorCore", "Invalid inAsmExtensions");
                throw new AsmException(Outcome.FAILURE, "Invalid inAsmExtensions");
            }
            int i10 = 1;
            Logger.d("AuthenticatorCore", String.format("AppID for Register: %s", registerIn.appID));
            try {
                try {
                    byte[] bArrPrepareFinalChallenge = this.f63249d.prepareFinalChallenge(registerIn.finalChallenge);
                    if (bArrPrepareFinalChallenge == null) {
                        throw new AsmException(Outcome.FAILURE, "Value \"finalChallenge\" is null");
                    }
                    ExtensionList extensionList = new ExtensionList(list);
                    HashMap<IExtensionProcessor.ExtProcParamKey, String> map = new HashMap<>();
                    this.f63255j.start(extensionList, map, activityProxy);
                    if (map.containsKey(IExtensionProcessor.ExtProcParamKey.KS_ATTESTATION_KEY)) {
                        Logger.i("AuthenticatorCore", "Request attestation certificate chain");
                        try {
                            bArrDigest = CryptoProviderHelper.getMessageDigestInstance("SHA-256").digest(registerIn.finalChallenge.getBytes(Charsets.utf8Charset));
                        } catch (NoSuchAlgorithmException | NoSuchProviderException e5) {
                            Logger.e("AuthenticatorCore", "Failed to calculate nonce", e5);
                            throw new AsmException(Outcome.FAILURE, "Failed to calculate nonce");
                        }
                    } else {
                        bArrDigest = null;
                    }
                    byte[] bArr = bArrDigest;
                    a(extensionList, UiConfig.getText(this.mContext, UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_REGISTER_WITH_USERNAME, R.string.nnl_asmsdk_uaf_setup_domain));
                    ArrayList arrayList = new ArrayList();
                    for (Extension extension : extensionList.getExtensions()) {
                        Object[] objArr = new Object[i10];
                        objArr[0] = extension.id;
                        Logger.i("AuthenticatorCore", String.format("Extension %s will be forwarded to AK", objArr));
                        arrayList.add(a(extension));
                        i10 = 1;
                    }
                    UserVerifyResponse userVerifyResponseA = a(bArrPrepareFinalChallenge, activityProxy, arrayList, strEncodeToString, registerIn);
                    Outcome outcome = userVerifyResponseA.getOutcome();
                    Outcome outcome2 = Outcome.SUCCESS;
                    if (outcome != outcome2) {
                        Logger.e("AuthenticatorCore", "Failed to enroll user");
                        throw new AsmException(Outcome.ACCESS_DENIED, "Failed to enroll user");
                    }
                    Logger.i("AuthenticatorCore", String.format("Is AppID expected: %s, is RoamingAuthenticator: %s", Boolean.valueOf(this.f63250e.additionalInfo.expectAPPID), Boolean.valueOf(this.f63250e.generalInfo.isRoamingAuthenticator)));
                    c();
                    try {
                        AKProcessor.AKResponseParams aKResponseParamsA = a(registerIn, userVerifyResponseA, bArrPrepareFinalChallenge, bArr, arrayList);
                        byte[] bArr2 = aKResponseParamsA.additionalAKInfoToBeStored;
                        if (bArr2 != null && !this.f63250e.generalInfo.isRoamingAuthenticator) {
                            this.f63248c.storeAKConfig(Base64.encodeToString(bArr2, 11));
                        }
                        if (aKResponseParamsA.getOutcome() != outcome2) {
                            Logger.e("AuthenticatorCore", "AK failed to register");
                            if (!this.f63248c.hasRegistrations() && !this.f63250e.generalInfo.isRoamingAuthenticator) {
                                this.f63248c.storeAKConfig("");
                            }
                            throw new AsmException(aKResponseParamsA.getOutcome(), "AK failed to register");
                        }
                        AuthenticatorDatabase.RegistrationRecord registrationRecord = aKResponseParamsA.regToBeStored;
                        registrationRecord.callerID = strEncodeToString;
                        registrationRecord.appID = registerIn.appID;
                        registrationRecord.timeStamp = System.currentTimeMillis();
                        String str2 = userVerifyResponseA.f63265b;
                        if (str2 != null && !str2.equals("")) {
                            Logger.d("AuthenticatorCore", "UserID is not null");
                            try {
                                Base64.decode(userVerifyResponseA.f63265b, 0);
                                aKResponseParamsA.regToBeStored.userID = userVerifyResponseA.f63265b;
                            } catch (IllegalArgumentException unused) {
                                throw new AsmException(Outcome.INVALID_MESSAGE);
                            }
                        }
                        if (!this.f63250e.generalInfo.isRoamingAuthenticator) {
                            this.f63248c.transferStashedData(userVerifyResponseA.f63268e.getKeyId(), aKResponseParamsA.regToBeStored);
                            this.f63248c.addRegistration(aKResponseParamsA.regToBeStored);
                        }
                        RegisterOut registerOut = new RegisterOut();
                        registerOut.assertion = aKResponseParamsA.assertion;
                        registerOut.assertionScheme = this.f63250e.generalInfo.assertionScheme;
                        HashMap<IExtensionProcessor.ExtProcParamKey, String> map2 = new HashMap<>();
                        map2.put(IExtensionProcessor.ExtProcParamKey.KS_ATTESTATION_KEY, aKResponseParamsA.KSAttestationX509);
                        this.f63255j.finish(new ExtensionList(aSMResponse.exts), map2);
                        aSMResponse.responseData = (JsonObject) this.f63256k.toJsonTree(registerOut);
                        aSMResponse.setOutcome(outcome2);
                        this.f63258n.release();
                        this.f63249d.postProcessAK();
                        this.f63246a.endTimer("AuthenticatorCore:register");
                        return aSMResponse;
                    } catch (Throwable th2) {
                        this.f63258n.release();
                        throw th2;
                    }
                } catch (AsmException e7) {
                    if (e7.error().equals(Outcome.CANCELED)) {
                        Logger.w("AuthenticatorCore", "User cancelled to register UAF");
                    } else {
                        Logger.e("AuthenticatorCore", "Failed to register UAF credentials", e7);
                    }
                    throw new AsmException(e7.error());
                }
            } catch (Throwable th3) {
                this.f63249d.postProcessAK();
                throw th3;
            }
        } catch (Throwable th4) {
            this.f63246a.endTimer("AuthenticatorCore:register");
            throw th4;
        }
    }

    private void a(IMatcher.MatcherOutParams matcherOutParams) {
        if (matcherOutParams != null) {
            IMatcher.RESULT matchResult = matcherOutParams.getMatchResult();
            if (matchResult != IMatcher.RESULT.SUCCESS) {
                if (matcherOutParams.getExtensions() != null && !matcherOutParams.getExtensions().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (IMatcher.Extension extension : matcherOutParams.getExtensions()) {
                        arrayList.add(new Extension(extension.id, new String(extension.data, Charsets.utf8Charset), extension.fail_if_unknown));
                    }
                    throw new AsmException(IMatcher.RESULT.fromResult(matchResult)).setExtensions(arrayList);
                }
                throw new AsmException(IMatcher.RESULT.fromResult(matchResult));
            }
            return;
        }
        throw new AsmException(Outcome.FAILURE);
    }

    private UserVerifyResponse a(byte[] bArr, ActivityProxy activityProxy, List<IMatcher.Extension> list, String str, RegisterIn registerIn) {
        Logger.d("AuthenticatorCore", "enrollUser");
        UserVerifyResponse userVerifyResponse = new UserVerifyResponse(0);
        userVerifyResponse.setOutcome(Outcome.ACCESS_DENIED);
        userVerifyResponse.f63269f = MatcherParamsHelper.getMatcherType(this.f63247b.isAKManagedMatcher(), this.f63250e.generalInfo.isRoamingAuthenticator, this.f63254i);
        c();
        try {
            boolean zHasRegistrations = this.f63248c.hasRegistrations();
            this.f63258n.release();
            IMatcher.MatcherInParams keyId = MatcherParamsHelper.createMatcherInParams(userVerifyResponse.f63269f, new GetInfoParams(), bArr, this.f63253h, this.f63250e.generalInfo.aaid, activityProxy, Boolean.valueOf(zHasRegistrations)).setExtensions(list).setCallerId(str).setAppId(registerIn.appID).setKeyId(String.format("%08x", Integer.valueOf(f63245p.incrementAndGet())));
            userVerifyResponse.f63268e = keyId;
            if (userVerifyResponse.f63269f == MatcherParamsHelper.AuthenticatorMatcherType.MATCHER_TYPE_AKMANAGED) {
                userVerifyResponse.setOutcome(Outcome.SUCCESS);
                return userVerifyResponse;
            }
            IMatcher.MatcherOutParams matcherOutParamsRegister = this.f63254i.register(keyId);
            a(matcherOutParamsRegister);
            userVerifyResponse.setOutcome(Outcome.SUCCESS);
            userVerifyResponse.extensions = matcherOutParamsRegister.getExtensions();
            userVerifyResponse.f63267d = matcherOutParamsRegister.getAuthIndex();
            if (matcherOutParamsRegister.getUserID() != null) {
                userVerifyResponse.f63265b = Base64.encodeToString(matcherOutParamsRegister.getUserID(), 0);
            }
            if (userVerifyResponse.f63269f == MatcherParamsHelper.AuthenticatorMatcherType.MATCHER_TYPE_UVT) {
                userVerifyResponse.f63264a = ((UVTMatcherOutParams) matcherOutParamsRegister).getUVT();
            }
            return userVerifyResponse;
        } catch (Throwable th2) {
            this.f63258n.release();
            throw th2;
        }
    }

    private UserVerifyResponse a(String str, String str2, byte[] bArr, ActivityProxy activityProxy, List<IMatcher.Extension> list, String str3, AuthenticateIn authenticateIn) {
        boolean z10;
        int i10 = 0;
        UserVerifyResponse userVerifyResponse = new UserVerifyResponse(i10);
        userVerifyResponse.setOutcome(Outcome.ACCESS_DENIED);
        if (str2 != null) {
            Iterator<IMatcher.Extension> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                IMatcher.Extension next = it.next();
                if (next.id.equals(ExtensionManager.SHOW_TRANSACTION_EXT_ID) && new String(next.data).equals("false")) {
                    z10 = false;
                    break;
                }
            }
            int i11 = AnonymousClass1.f63259a[this.f63247b.getTransactionUIType().ordinal()];
            if (i11 == 1) {
                boolean z11 = this.m;
                TCDisplayResponse tCDisplayResponse = new TCDisplayResponse(i10);
                Outcome outcome = Outcome.FAILURE;
                tCDisplayResponse.setOutcome(outcome);
                HashMap map = new HashMap();
                map.put("KEY_SHOW_WHEN_LOCKED", String.valueOf(z11));
                Outcome outcome2 = Outcome.SUCCESS;
                Outcome outcomeOpenUI = z10 ? TransactionUIFactory.getInstance().createTransactionUIInstance().openUI(activityProxy, str2, str, map) : outcome2;
                if (outcomeOpenUI != null) {
                    if (outcomeOpenUI == outcome2) {
                        tCDisplayResponse.setOutcome(outcome2);
                        byte[] bArrDecode = Base64.decode(str2, 11);
                        if (bArrDecode.length != 0) {
                            tCDisplayResponse.f63262a = this.f63249d.prepareTCToken(bArrDecode, bArr);
                        } else {
                            Logger.e("AuthenticatorCore", "Nothing to display");
                            tCDisplayResponse.setOutcome(outcome);
                        }
                    } else {
                        Outcome outcome3 = Outcome.SYSTEM_CANCELED;
                        if (outcomeOpenUI == outcome3) {
                            tCDisplayResponse.setOutcome(outcome3);
                        } else {
                            tCDisplayResponse.setOutcome(Outcome.CANCELED);
                        }
                    }
                }
                this.f63252g = tCDisplayResponse;
                if (tCDisplayResponse.getOutcome() != outcome2) {
                    if (this.f63252g.getOutcome() == Outcome.CANCELED || this.f63252g.getOutcome() == Outcome.SYSTEM_CANCELED) {
                        userVerifyResponse.setOutcome(this.f63252g.getOutcome());
                    }
                    return userVerifyResponse;
                }
            } else if (i11 == 2) {
                TCDisplayResponse tCDisplayResponse2 = new TCDisplayResponse(i10);
                this.f63252g = tCDisplayResponse2;
                tCDisplayResponse2.setOutcome(Outcome.SUCCESS);
                byte[] bArrDecode2 = Base64.decode(str2, 11);
                if (bArrDecode2.length != 0) {
                    this.f63252g.f63262a = this.f63249d.prepareTCToken(bArrDecode2, bArr);
                } else {
                    Logger.e("AuthenticatorCore", "No transaction text to display");
                    this.f63252g.setOutcome(Outcome.FAILURE);
                    return userVerifyResponse;
                }
            } else if (i11 == 3) {
                throw new AsmException(Outcome.ACCESS_DENIED, "The authenticator doesn't support transaction confirmation");
            }
        }
        String str4 = null;
        GetInfoParams getInfoParams = new GetInfoParams(str2, null);
        userVerifyResponse.f63269f = MatcherParamsHelper.getMatcherType(this.f63247b.isAKManagedMatcher(), this.f63250e.generalInfo.isRoamingAuthenticator, this.f63254i);
        c();
        try {
            boolean zHasRegistrations = this.f63248c.hasRegistrations();
            this.f63258n.release();
            List<String> list2 = authenticateIn.keyIDs;
            if (list2 != null) {
                List<AuthenticatorDatabase.RegistrationRecord> registrations = this.f63248c.getRegistrations(str3, authenticateIn.appID, list2);
                if (registrations.size() == 1) {
                    str4 = registrations.get(0).keyID;
                }
            }
            IMatcher.MatcherInParams keyId = MatcherParamsHelper.createMatcherInParams(userVerifyResponse.f63269f, getInfoParams, bArr, this.f63253h, this.f63250e.generalInfo.aaid, activityProxy, Boolean.valueOf(zHasRegistrations)).setExtensions(list).setCallerId(str3).setAppId(authenticateIn.appID).setKeyId(str4);
            userVerifyResponse.f63268e = keyId;
            if (userVerifyResponse.f63269f == MatcherParamsHelper.AuthenticatorMatcherType.MATCHER_TYPE_AKMANAGED) {
                userVerifyResponse.setOutcome(Outcome.SUCCESS);
                return userVerifyResponse;
            }
            IMatcher.MatcherOutParams matcherOutParamsAuthenticate = this.f63254i.authenticate(keyId);
            a(matcherOutParamsAuthenticate);
            userVerifyResponse.setOutcome(Outcome.SUCCESS);
            userVerifyResponse.extensions = matcherOutParamsAuthenticate.getExtensions();
            userVerifyResponse.f63267d = matcherOutParamsAuthenticate.getAuthIndex();
            if (matcherOutParamsAuthenticate.getUserID() != null) {
                userVerifyResponse.f63265b = Base64.encodeToString(matcherOutParamsAuthenticate.getUserID(), 0);
            }
            if (userVerifyResponse.f63269f == MatcherParamsHelper.AuthenticatorMatcherType.MATCHER_TYPE_UVT) {
                userVerifyResponse.f63264a = ((UVTMatcherOutParams) matcherOutParamsAuthenticate).getUVT();
            }
            return userVerifyResponse;
        } catch (Throwable th2) {
            this.f63258n.release();
            throw th2;
        }
    }

    private byte[] a() {
        String aSMToken = this.f63248c.getASMToken();
        if (aSMToken == null) {
            if (this.f63250e.generalInfo.isRoamingAuthenticator) {
                return null;
            }
            Logger.d("AuthenticatorCore", "Not roaming authenticator setting ASMToken");
            byte[] bArr = new byte[32];
            f63244o.nextBytes(bArr);
            this.f63248c.storeASMToken(Base64.encodeToString(bArr, 11));
            return bArr;
        }
        return Base64.decode(aSMToken, 11);
    }

    private IMatcher.Extension a(Extension extension) {
        IMatcher.Extension extension2 = new IMatcher.Extension();
        extension2.fail_if_unknown = extension.fail_if_unknown.booleanValue();
        extension2.id = extension.id;
        extension2.data = extension.data.getBytes(Charsets.utf8Charset);
        return extension2;
    }

    private AKProcessor.AKResponseParams a(RegisterIn registerIn, UserVerifyResponse userVerifyResponse, byte[] bArr, byte[] bArr2, List<IMatcher.Extension> list) {
        AKProcessor.AKRequestParams authenticatorIndex = new AKProcessor.AKRequestParams().setAuthenticatorIndex(a(userVerifyResponse));
        AKProcessor.AkAuthnrInfo akAuthnrInfo = this.f63250e;
        AKProcessor.AKRequestParams userVerifyToken = authenticatorIndex.setAppID(akAuthnrInfo.generalInfo.isRoamingAuthenticator | akAuthnrInfo.additionalInfo.expectAPPID ? registerIn.appID.getBytes(Charsets.utf8Charset) : null).setFinalChallenge(bArr).setKSAttestationChallenge(bArr2).setUserName(registerIn.username.getBytes(Charsets.utf8Charset)).setAttestationType(registerIn.attestationType.shortValue()).setKHAccessToken(this.f63249d.getKHAccessToken(registerIn.appID, this.f63251f, this.f63250e.generalInfo.isRoamingAuthenticator, a(), null)).setUserVerifyToken(userVerifyResponse.f63264a);
        String aKConfig = this.f63248c.getAKConfig();
        return this.f63249d.processAK(userVerifyToken.setAdditionalAKArgument(aKConfig != null ? Base64.decode(aKConfig, 11) : new byte[0]).setMatcherInParams(userVerifyResponse.f63268e).setAuthenticatorDescriptor(this.f63247b).setMatcherType(userVerifyResponse.f63269f).setExtensions(list).setCmd(TLVCommandEncoder.Commands.REGISTER));
    }

    private boolean a(List<Extension> list) {
        for (Extension extension : list) {
            if (extension == null || !extension.isValid()) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<String> a(AuthenticateIn authenticateIn) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f63250e.generalInfo.isRoamingAuthenticator) {
            List<String> list = authenticateIn.keyIDs;
            if (list != null) {
                arrayList.addAll(list);
            }
        } else {
            List<AuthenticatorDatabase.RegistrationRecord> registrations = this.f63248c.getRegistrations(Base64.encodeToString(this.f63251f, 11), authenticateIn.appID, authenticateIn.keyIDs);
            if (!registrations.isEmpty()) {
                Iterator<AuthenticatorDatabase.RegistrationRecord> it = registrations.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().keyHandle);
                }
            } else {
                Logger.e("AuthenticatorCore", "No registrations found");
                throw new AsmException(Outcome.ACCESS_DENIED);
            }
        }
        return arrayList;
    }

    private byte a(@NonNull UserVerifyResponse userVerifyResponse) {
        Byte b10 = userVerifyResponse.f63267d;
        if (b10 != null) {
            byte bByteValue = b10.byteValue();
            Logger.i("AuthenticatorCore", String.format("AuthenticatorIndex returned by matcher: %s", Byte.valueOf(bByteValue)));
            return bByteValue;
        }
        return (byte) this.f63250e.generalInfo.authenticatorIndex;
    }

    private AKProcessor.AKResponseParams a(byte[] bArr, TCDisplayResponse tCDisplayResponse, AuthenticateIn authenticateIn, UserVerifyResponse userVerifyResponse, byte[] bArr2, List<IMatcher.Extension> list, ArrayList<String> arrayList, boolean z10) {
        this.f63246a.startTimer("AuthenticatorCore:AK Sign");
        try {
            AKProcessor.AKRequestParams aKRequestParams = new AKProcessor.AKRequestParams();
            AKProcessor.AKRequestParams cmd = aKRequestParams.setCmd(TLVCommandEncoder.Commands.SIGN);
            AKProcessor.AkAuthnrInfo akAuthnrInfo = this.f63250e;
            AKProcessor.AKRequestParams userVerifyToken = cmd.setAppID((akAuthnrInfo.additionalInfo.expectAPPID || akAuthnrInfo.generalInfo.isRoamingAuthenticator) ? authenticateIn.appID.getBytes(Charsets.utf8Charset) : null).setKHAccessToken(this.f63249d.getKHAccessToken(authenticateIn.appID, this.f63251f, this.f63250e.generalInfo.isRoamingAuthenticator, a(), null)).setTransaction(bArr).setTransactionConfirmationToken(tCDisplayResponse != null ? tCDisplayResponse.f63262a : null).setUserVerifyToken(userVerifyResponse.f63264a);
            String aKConfig = this.f63248c.getAKConfig();
            userVerifyToken.setAdditionalAKArgument(aKConfig != null ? Base64.decode(aKConfig, 11) : new byte[0]).setAuthenticatorIndex(a(userVerifyResponse)).setFinalChallenge(bArr2).setMatcherInParams(userVerifyResponse.f63268e).setAuthenticatorDescriptor(this.f63247b).setExtensions(list).setMatcherType(userVerifyResponse.f63269f).setKeyHandles(new ArrayList());
            if (z10) {
                aKRequestParams.setKSAttestationChallenge(new byte[0]);
            }
            ArrayList arrayList2 = new ArrayList();
            while (arrayList.size() > 16) {
                AKProcessor.AKResponseParams aKResponseParamsA = a(aKRequestParams, arrayList, 15);
                if (aKResponseParamsA.getOutcome() == Outcome.SUCCESS) {
                    arrayList2.addAll(aKResponseParamsA.usernames);
                } else {
                    Logger.e("AuthenticatorCore", "AK failed to sign");
                    throw new AsmException(aKResponseParamsA.getOutcome());
                }
            }
            AKProcessor.AKResponseParams aKResponseParamsA2 = a(aKRequestParams, arrayList, arrayList.size());
            if (aKResponseParamsA2.getOutcome() == Outcome.SUCCESS) {
                aKResponseParamsA2.usernames.addAll(arrayList2);
                this.f63246a.endTimer("AuthenticatorCore:AK Sign");
                return aKResponseParamsA2;
            }
            Logger.e("AuthenticatorCore", "AK failed to sign");
            throw new AsmException(aKResponseParamsA2.getOutcome());
        } catch (Throwable th2) {
            this.f63246a.endTimer("AuthenticatorCore:AK Sign");
            throw th2;
        }
    }

    private Username a(List<Username> list, AuthenticateIn authenticateIn, ActivityProxy activityProxy) {
        HashMap map = new HashMap();
        if (this.f63250e.generalInfo.isRoamingAuthenticator) {
            for (Username username : list) {
                map.put(username.username, username);
            }
        } else {
            String strEncodeToString = Base64.encodeToString(this.f63251f, 11);
            c();
            try {
                a(list, this.f63248c.getRegistrations(strEncodeToString, authenticateIn.appID, authenticateIn.keyIDs), map);
                this.f63258n.release();
            } catch (Throwable th2) {
                this.f63258n.release();
                throw th2;
            }
        }
        if (map.size() > 1) {
            ArrayList arrayList = new ArrayList(map.values());
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Username) it.next()).username);
            }
            int iOpenUI = UserSelectionUIFactory.getInstance().createUserSelectionUIInstance().openUI(activityProxy, arrayList2, this.m);
            if (iOpenUI < 0 || iOpenUI >= arrayList.size()) {
                if (iOpenUI != -2) {
                    throw new AsmException(Outcome.CANCELED);
                }
                throw new AsmException(Outcome.SYSTEM_CANCELED);
            }
            Username username2 = (Username) arrayList.get(iOpenUI);
            if (username2 != null) {
                return username2;
            }
            Logger.w("AuthenticatorCore", "User canceled username selection");
            throw new AsmException(Outcome.CANCELED);
        }
        return (Username) map.get(list.get(0).username);
    }

    private AKProcessor.AKResponseParams a(AKProcessor.AKRequestParams aKRequestParams, ArrayList<String> arrayList, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            aKRequestParams.keyHandles.add(Base64.decode(arrayList.get(0), 11));
            arrayList.remove(0);
        }
        AKProcessor.AKResponseParams aKResponseParamsProcessAK = this.f63249d.processAK(aKRequestParams);
        aKRequestParams.keyHandles.clear();
        byte[] bArr = aKResponseParamsProcessAK.additionalAKInfoToBeStored;
        if (bArr != null && !this.f63250e.generalInfo.isRoamingAuthenticator) {
            this.f63248c.storeAKConfig(Base64.encodeToString(bArr, 11));
        }
        return aKResponseParamsProcessAK;
    }

    private GetRegistrationsOut a(String str) {
        if (str != null && !str.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            GetRegistrationsOut getRegistrationsOut = new GetRegistrationsOut();
            if (!this.f63250e.generalInfo.isRoamingAuthenticator) {
                this.f63248c.validateUserRegistrations(this.f63254i);
            }
            int i10 = 0;
            for (AuthenticatorDatabase.RegistrationRecord registrationRecord : this.f63248c.getRegistrations(str)) {
                Integer num = (Integer) map.get(registrationRecord.appID);
                if (num == null) {
                    map.put(registrationRecord.appID, Integer.valueOf(i10));
                    arrayList.add(new GetRegistrationsOut.AppRegistration(registrationRecord.appID, registrationRecord.keyID));
                    i10++;
                } else {
                    ((GetRegistrationsOut.AppRegistration) arrayList.get(num.intValue())).keyIDs.add(registrationRecord.keyID);
                }
            }
            getRegistrationsOut.appRegs = arrayList;
            return getRegistrationsOut;
        }
        throw new IllegalArgumentException("The callerID is invalid");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private ASMResponse a(String str, String str2, @NonNull List<Extension> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ASMResponse aSMResponse = new ASMResponse();
        try {
            if (this.f63250e.generalInfo.isRoamingAuthenticator) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(str2);
                String strEncodeToString = Base64.encodeToString(this.f63251f, 11);
                List<AuthenticatorDatabase.RegistrationRecord> registrations = this.f63248c.getRegistrations(strEncodeToString, str, arrayList3);
                if (registrations == null || registrations.size() <= 0) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList();
                    Iterator<AuthenticatorDatabase.RegistrationRecord> it = registrations.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Base64.decode(it.next().keyHandle, 11));
                    }
                }
                Logger.i("AuthenticatorCore", String.format("Delete registration for callerID: %s", strEncodeToString));
                this.f63248c.removeRegistration(strEncodeToString, str, str2);
                arrayList = arrayList2;
            }
            AKProcessor.AKRequestParams aKRequestParams = new AKProcessor.AKRequestParams();
            AKProcessor.AkAuthnrInfo akAuthnrInfo = this.f63250e;
            AKProcessor.AKRequestParams cmd = aKRequestParams.setAppID((akAuthnrInfo.additionalInfo.expectAPPID || akAuthnrInfo.generalInfo.isRoamingAuthenticator) ? str.getBytes(Charsets.utf8Charset) : null).setKeyID(Base64.decode(str2, 11)).setKHAccessToken(this.f63249d.getKHAccessToken(str, this.f63251f, this.f63250e.generalInfo.isRoamingAuthenticator, a(), null)).setAuthenticatorIndex((byte) this.f63250e.generalInfo.authenticatorIndex).setCmd(TLVCommandEncoder.Commands.DEREGISTER);
            if (this.f63257l.requiresKeyHandleForDereg()) {
                cmd.setKeyHandles(arrayList);
            }
            this.f63255j.start(new ExtensionList(list), null, ActivityProxy.createFromAppContext(this.mContext, false));
            if (list.size() > 0) {
                ArrayList arrayList4 = new ArrayList();
                for (Extension extension : list) {
                    IMatcher.Extension extension2 = new IMatcher.Extension();
                    extension2.fail_if_unknown = extension.fail_if_unknown.booleanValue();
                    extension2.id = extension.id;
                    extension2.data = extension.data.getBytes(Charsets.utf8Charset);
                    Logger.i("AuthenticatorCore", String.format("Extension %s will be forwarded to AK", extension2.id));
                    arrayList4.add(extension2);
                }
                if (arrayList4.size() > 0) {
                    cmd.setExtensions(arrayList4);
                }
            }
            Outcome outcome = Outcome.SUCCESS;
            try {
                AKProcessor.AKResponseParams aKResponseParamsProcessAK = this.f63249d.processAK(cmd);
                if (aKResponseParamsProcessAK.getOutcome() == outcome) {
                    if (!this.f63248c.hasRegistrations() && !this.f63250e.generalInfo.isRoamingAuthenticator) {
                        this.f63248c.storeAKConfig("");
                    }
                    aSMResponse.setOutcome(outcome);
                    return aSMResponse;
                }
                throw new AsmException(aKResponseParamsProcessAK.getOutcome(), "Dereg call to AK failed.");
            } catch (AsmException e5) {
                throw new AsmException(e5.error(), "Deregister call to AK failed");
            }
        } catch (AsmException e7) {
            throw new AsmException(e7.error(), "Failed to delete registration");
        }
    }

    private void a(List<Username> list, List<AuthenticatorDatabase.RegistrationRecord> list2, Map<String, Username> map) {
        ArrayList<AuthenticatorDatabase.RegistrationRecord> arrayList = new ArrayList();
        for (Username username : list) {
            AuthenticatorDatabase.RegistrationRecord registrationRecordA = a(list2, username.keyHandle);
            if (registrationRecordA != null) {
                Username username2 = map.get(username.username);
                if (username2 != null && registrationRecordA.timeStamp <= username2.timeStamp) {
                    AuthenticatorDatabase.RegistrationRecord registrationRecord = new AuthenticatorDatabase.RegistrationRecord();
                    registrationRecord.appID = registrationRecordA.appID;
                    registrationRecord.keyID = registrationRecordA.keyID;
                    arrayList.add(registrationRecord);
                } else {
                    if (username2 != null) {
                        AuthenticatorDatabase.RegistrationRecord registrationRecord2 = new AuthenticatorDatabase.RegistrationRecord();
                        AuthenticatorDatabase.RegistrationRecord registrationRecordA2 = a(list2, username2.keyHandle);
                        if (registrationRecordA2 != null) {
                            registrationRecord2.appID = registrationRecordA2.appID;
                            registrationRecord2.keyID = registrationRecordA2.keyID;
                            arrayList.add(registrationRecord2);
                        }
                    }
                    username.timeStamp = registrationRecordA.timeStamp;
                    map.put(username.username, username);
                }
            }
        }
        for (AuthenticatorDatabase.RegistrationRecord registrationRecord3 : arrayList) {
            if (a(registrationRecord3.appID, registrationRecord3.keyID, new ArrayList()).getOutcome() != Outcome.SUCCESS) {
                Logger.e("AuthenticatorCore", "Database cleanup info: Can't delete old registration");
            }
        }
    }

    private AuthenticatorDatabase.RegistrationRecord a(List<AuthenticatorDatabase.RegistrationRecord> list, String str) {
        for (AuthenticatorDatabase.RegistrationRecord registrationRecord : list) {
            if (registrationRecord.keyHandle.equals(str)) {
                return registrationRecord;
            }
        }
        return null;
    }

    private void a(ExtensionList extensionList, String str) {
        if (extensionList.getExtension(ExtensionManager.OOB_DOMAIN_EXT_ID) != null) {
            if (extensionList.getExtension(ExtensionManager.PROMPT_EXT_ID) == null) {
                String str2 = String.format(str, new String(Base64.decode(extensionList.getExtension(ExtensionManager.OOB_DOMAIN_EXT_ID).data, 11)));
                Charset charset = Charsets.utf8Charset;
                extensionList.addExtension(ExtensionManager.PROMPT_EXT_ID, new String(Base64.encode(str2.getBytes(charset), 11), charset), false);
            }
            extensionList.removeExtension(ExtensionManager.OOB_DOMAIN_EXT_ID);
        }
    }
}
