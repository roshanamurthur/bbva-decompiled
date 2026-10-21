package com.noknok.android.uaf.asm;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.IUafAsmApi;
import com.noknok.android.client.asm.api.uaf.json.ASMRequest;
import com.noknok.android.client.asm.api.uaf.json.ASMResponse;
import com.noknok.android.client.asm.api.uaf.json.AuthenticateIn;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.DeregisterIn;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.asm.api.uaf.json.GetInfoOut;
import com.noknok.android.client.asm.api.uaf.json.RegisterIn;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.asm.core.uaf.AuthenticatorCore;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.ConformanceTest;
import com.noknok.android.client.utils.ExceptionEncoder;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.StrictTypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ASM implements IUafAsmApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f63521c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<AuthenticatorCore> f63519a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gson f63520b = StrictTypeAdapter.GsonBuilder().create();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f63522d = new ArrayList();

    /* JADX INFO: renamed from: com.noknok.android.uaf.asm.ASM$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63523a;

        static {
            int[] iArr = new int[ASMRequest.RequestType.values().length];
            f63523a = iArr;
            try {
                iArr[ASMRequest.RequestType.Register.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63523a[ASMRequest.RequestType.Authenticate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63523a[ASMRequest.RequestType.Deregister.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63523a[ASMRequest.RequestType.GetRegistrations.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63523a[ASMRequest.RequestType.OpenSettings.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ASM(Context context) {
        this.f63521c = context.getApplicationContext();
        ConformanceTest.init(context);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.asm.core.uaf.AuthenticatorCore>] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.asm.core.uaf.AuthenticatorCore>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.asm.core.uaf.AuthenticatorCore>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    private ASMResponse a(ASMRequest aSMRequest, ActivityProxy activityProxy, String str) {
        ASMRequest.RequestType requestType = aSMRequest.requestType;
        if (requestType == ASMRequest.RequestType.GetInfo) {
            Logger.d("ASM", String.format("%s. %s", this.f63521c.getApplicationContext().getPackageName(), aSMRequest.requestType));
            GetInfoOut getInfoOut = new GetInfoOut();
            ASMResponse aSMResponse = new ASMResponse();
            for (int i10 = 0; i10 < this.f63519a.size(); i10++) {
                try {
                    AuthenticatorInfo authenticatorInfoShallowCopy = ((AuthenticatorCore) this.f63519a.get(i10)).getInfo().shallowCopy();
                    authenticatorInfoShallowCopy.authenticatorIndex = (short) i10;
                    getInfoOut.Authenticators.add(authenticatorInfoShallowCopy);
                    this.f63522d.add(authenticatorInfoShallowCopy.aaid);
                } catch (AsmException e5) {
                    if (!e5.error().equals(Outcome.AUTHENTICATOR_DISCONNECTED)) {
                        throw e5;
                    }
                    Logger.w("ASM", "Authenticator is disconnected, skip adding into the list", e5);
                }
            }
            aSMResponse.responseData = (JsonObject) this.f63520b.toJsonTree(getInfoOut);
            aSMResponse.setOutcome(Outcome.SUCCESS);
            return aSMResponse;
        }
        AuthenticatorCore authenticatorCore = (AuthenticatorCore) this.f63519a.get(aSMRequest.authenticatorIndex.shortValue());
        Version version = aSMRequest.asmVersion;
        if (version == null || !authenticatorCore.hasAsmVersion(version)) {
            throw new AsmException(Outcome.NOT_SUPPORTED, String.format("ASM Version %s is not supported.", aSMRequest.asmVersion));
        }
        Logger.d("ASM", String.format("%s/%s:%s. %s", this.f63521c.getApplicationContext().getPackageName(), aSMRequest.authenticatorIndex, !this.f63522d.isEmpty() ? (String) this.f63522d.get(aSMRequest.authenticatorIndex.shortValue()) : "", aSMRequest.requestType));
        int i11 = AnonymousClass1.f63523a[requestType.ordinal()];
        if (i11 == 1) {
            return authenticatorCore.register((RegisterIn) this.f63520b.fromJson((JsonElement) aSMRequest.args, RegisterIn.class), aSMRequest.exts, activityProxy, str);
        }
        if (i11 == 2) {
            return authenticatorCore.authenticate((AuthenticateIn) this.f63520b.fromJson((JsonElement) aSMRequest.args, AuthenticateIn.class), aSMRequest.exts, activityProxy, str);
        }
        if (i11 == 3) {
            return authenticatorCore.deregister((DeregisterIn) this.f63520b.fromJson((JsonElement) aSMRequest.args, DeregisterIn.class), aSMRequest.exts, str);
        }
        if (i11 == 4) {
            return authenticatorCore.getRegistrations(str);
        }
        if (i11 == 5) {
            return authenticatorCore.openSettings(activityProxy);
        }
        throw new AsmException(Outcome.FAILURE, "Unknown command");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.noknok.android.client.asm.core.uaf.AuthenticatorCore>] */
    public void addAuthenticator(AuthenticatorCore authenticatorCore) {
        this.f63519a.add(authenticatorCore);
    }

    @Override // com.noknok.android.client.asm.api.uaf.IUafAsmApi
    public String process(String str, ActivityProxy activityProxy, String str2) {
        ASMResponse aSMResponse = new ASMResponse();
        try {
            aSMResponse = a((ASMRequest) this.f63520b.fromJson(str, ASMRequest.class), activityProxy, str2);
        } catch (RuntimeException e5) {
            Logger.e("ASM", "Failure while processing ASM request", e5);
            aSMResponse.setOutcome(Outcome.FAILURE);
            boolean z10 = e5 instanceof AsmException;
            if (z10) {
                aSMResponse.setOutcome(((AsmException) e5).error());
            }
            if (aSMResponse.exts == null) {
                aSMResponse.exts = new ArrayList();
            }
            if (z10) {
                AsmException asmException = (AsmException) e5;
                if (asmException.getExtensions() != null) {
                    aSMResponse.exts.addAll(asmException.getExtensions());
                }
            }
            aSMResponse.exts.add(ExceptionEncoder.createExceptionExtension(e5));
        }
        List<Extension> list = aSMResponse.exts;
        if (list != null && list.isEmpty()) {
            aSMResponse.exts = null;
        }
        return this.f63520b.toJson(aSMResponse);
    }
}
