package com.noknok.android.uaf.asmcore;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.GetRegistrationsOut;
import com.noknok.android.client.asm.core.MatcherParamsHelper;
import com.noknok.android.client.asm.core.uaf.AuthenticatorCore;
import com.noknok.android.client.asm.sdk.AuthenticatorException;
import com.noknok.android.client.asm.sdk.IAKDigestMethod;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IAuthenticatorKernel;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.ConformanceTest;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AKProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IAuthenticatorKernel f63524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AkAuthnrInfo f63525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63526c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63527d = false;

    public static class AKRequestParams {
        public byte[] KHAccessToken;
        public byte[] KSAttestationChallenge;
        public byte[] aaid;
        public byte[] additionalAKArgument;
        public byte[] appID;
        public List<byte[]> attestationCerts;
        public short attestationType;
        public IAuthenticatorDescriptor authenticatorDescriptor;
        public byte authenticatorIndex;
        public short cmd;
        public List<IMatcher.Extension> extensions;
        public byte[] finalChallenge;
        public List<byte[]> keyHandles;
        public byte[] keyID;
        public IMatcher.MatcherInParams matcherInParams;
        public MatcherParamsHelper.AuthenticatorMatcherType matcherType;
        public byte matcherVersion;
        public PINManageParams pinManageParam = new PINManageParams();
        public byte[] transaction;
        public byte[] transactionConfirmationToken;
        public byte[] userName;
        public byte[] userVerifyToken;

        public AKRequestParams setAaid(byte[] bArr) {
            this.aaid = bArr;
            return this;
        }

        public AKRequestParams setAdditionalAKArgument(byte[] bArr) {
            this.additionalAKArgument = bArr;
            return this;
        }

        public AKRequestParams setAppID(byte[] bArr) {
            this.appID = bArr;
            return this;
        }

        public AKRequestParams setAttestationCerts(List<byte[]> list) {
            this.attestationCerts = list;
            return this;
        }

        public AKRequestParams setAttestationType(short s4) {
            this.attestationType = s4;
            return this;
        }

        public AKRequestParams setAuthenticatorDescriptor(IAuthenticatorDescriptor iAuthenticatorDescriptor) {
            this.authenticatorDescriptor = iAuthenticatorDescriptor;
            return this;
        }

        public AKRequestParams setAuthenticatorIndex(byte b10) {
            this.authenticatorIndex = b10;
            return this;
        }

        public AKRequestParams setCmd(short s4) {
            this.cmd = s4;
            return this;
        }

        public AKRequestParams setExtensions(List<IMatcher.Extension> list) {
            this.extensions = list;
            return this;
        }

        public AKRequestParams setFinalChallenge(byte[] bArr) {
            this.finalChallenge = bArr;
            return this;
        }

        public AKRequestParams setKHAccessToken(byte[] bArr) {
            this.KHAccessToken = bArr;
            return this;
        }

        public AKRequestParams setKSAttestationChallenge(byte[] bArr) {
            this.KSAttestationChallenge = bArr;
            return this;
        }

        public AKRequestParams setKeyHandles(List<byte[]> list) {
            this.keyHandles = list;
            return this;
        }

        public AKRequestParams setKeyID(byte[] bArr) {
            this.keyID = bArr;
            return this;
        }

        public AKRequestParams setMatcherInParams(IMatcher.MatcherInParams matcherInParams) {
            this.matcherInParams = matcherInParams;
            return this;
        }

        public AKRequestParams setMatcherType(MatcherParamsHelper.AuthenticatorMatcherType authenticatorMatcherType) {
            this.matcherType = authenticatorMatcherType;
            return this;
        }

        public AKRequestParams setMatcherVersion(byte b10) {
            this.matcherVersion = b10;
            return this;
        }

        public AKRequestParams setPinManageParam(PINManageParams pINManageParams) {
            this.pinManageParam = pINManageParams;
            return this;
        }

        public AKRequestParams setTransaction(byte[] bArr) {
            this.transaction = bArr;
            return this;
        }

        public AKRequestParams setTransactionConfirmationToken(byte[] bArr) {
            this.transactionConfirmationToken = bArr;
            return this;
        }

        public AKRequestParams setUserName(byte[] bArr) {
            this.userName = bArr;
            return this;
        }

        public AKRequestParams setUserVerifyToken(byte[] bArr) {
            this.userVerifyToken = bArr;
            return this;
        }
    }

    public static class AKResponseParams {
        public String KSAttestationX509;
        public byte[] additionalAKInfoToBeStored;
        public String assertion;
        public short statusCode;
        public byte[] transactionConfirmationToken;
        public byte[] userVerifyToken;
        public final List<AuthenticatorCore.Username> usernames = new ArrayList();
        public final List<GetRegistrationsOut.AppRegistration> appRegistrations = new ArrayList();
        public final AkInfo info = new AkInfo();
        public final AuthenticatorDatabase.RegistrationRecord regToBeStored = new AuthenticatorDatabase.RegistrationRecord();

        public Outcome getOutcome() {
            return Outcome.fromUafCmdStatusCode(this.statusCode);
        }

        public void setOutcome(Outcome outcome) {
            this.statusCode = outcome.getUafCmdStatusCode();
        }
    }

    public static class AkAuthnrInfo {
        public final AuthenticatorInfo generalInfo = new AuthenticatorInfo();
        public AuthnrAdditionalInfo additionalInfo = new AuthnrAdditionalInfo();
    }

    public static class AkConfig {
        public int version = 1;
        public int signCounter = 0;
        public int regCounter = 0;
        public int failCounter = 0;
        public byte[] matcherData = null;
        public byte[] enrollId = null;
    }

    public static class AkInfo {
        byte apiVersion;
        public final List<AkAuthnrInfo> authenticators = new ArrayList();
    }

    public static class AuthnrAdditionalInfo {
        public boolean keyHandleStoredInside = false;
        public boolean builtinEnrollUI = false;
        public boolean builtinSettingUI = false;
        public boolean expectAPPID = false;
        public byte maxKeyHandle = 0;
    }

    public static class PINManageParams {
        public byte[] newPIN;
        public byte[] oldPIN;
        public short slotIndex;
        public short subCmd;
    }

    public AKProcessor(IAuthenticatorKernel iAuthenticatorKernel) {
        this.f63524a = iAuthenticatorKernel;
    }

    private void a(List<IMatcher.Extension> list) {
        boolean z10 = false;
        this.f63526c = 0;
        this.f63527d = false;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (IMatcher.Extension extension : list) {
            if (extension.id.equals(ExtensionManager.BIOMETRIC_OPTIONS_EXT_ID)) {
                JsonObject asJsonObject = JsonParser.parseString(new String(extension.data)).getAsJsonObject();
                this.f63526c = asJsonObject.has(TypedValues.TransitionType.S_DURATION) ? asJsonObject.get(TypedValues.TransitionType.S_DURATION).getAsInt() : 0;
                if (asJsonObject.has(ScanDocumentCommand.ID) && !asJsonObject.get(ScanDocumentCommand.ID).getAsBoolean()) {
                    z10 = true;
                }
                this.f63527d = z10;
                return;
            }
        }
    }

    public AkAuthnrInfo getAKInfo(String str) {
        Logger.i("AKProcessor", String.format("Get Info for %s", str));
        AKRequestParams aKRequestParams = new AKRequestParams();
        aKRequestParams.setCmd(TLVCommandEncoder.Commands.GET_INFO);
        AKResponseParams aKResponseParamsProcessAK = processAK(aKRequestParams);
        for (int i10 = 0; i10 < aKResponseParamsProcessAK.info.authenticators.size(); i10++) {
            AkAuthnrInfo akAuthnrInfo = aKResponseParamsProcessAK.info.authenticators.get(i10);
            if (str.equalsIgnoreCase(akAuthnrInfo.generalInfo.aaid)) {
                this.f63525b = akAuthnrInfo;
                return akAuthnrInfo;
            }
        }
        throw new AsmException(Outcome.FAILURE, "Can not find requested Authenticator.");
    }

    public byte[] getKHAccessToken(String str, byte[] bArr, boolean z10, byte[] bArr2, byte[] bArr3) {
        IAKDigestMethod digestMethod = this.f63524a.getDigestMethod();
        if (str != null) {
            digestMethod.update(str.getBytes(Charsets.utf8Charset));
        }
        if (bArr2 != null) {
            digestMethod.update(bArr2);
        }
        if (bArr3 != null) {
            digestMethod.update(bArr3);
        }
        if (!z10 && bArr != null) {
            digestMethod.update(bArr);
        }
        return digestMethod.digest();
    }

    public boolean postProcessAK() {
        return this.f63524a.postProcess();
    }

    public byte[] prepareFinalChallenge(String str) {
        return this.f63524a.getDigestMethod().digest(str.getBytes(Charsets.utf8Charset));
    }

    public byte[] prepareTCToken(byte[] bArr, byte[] bArr2) {
        byte[] bArrDigest = bArr != null ? this.f63524a.getDigestMethod().digest(bArr) : new byte[0];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((short) (bArrDigest.length + 9 + bArr2.length));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(TLVCommandEncoder.TAG_TC_TOKEN_TYPE);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort(TLVCommandEncoder.TAG_TC_TOKEN_CONTENT);
        byteBufferAllocate.putShort((short) (bArrDigest.length + bArr2.length));
        byteBufferAllocate.put(bArrDigest);
        byteBufferAllocate.put(bArr2);
        return byteBufferAllocate.array();
    }

    public AKResponseParams processAK(AKRequestParams aKRequestParams) {
        try {
            byte[] bArrA = TLVCommandEncoder.a(aKRequestParams);
            HashMap map = new HashMap();
            map.put(IAuthenticatorKernel.AKDataKeys.KSATTESTATIONCHALLENGE, aKRequestParams.KSAttestationChallenge);
            map.put(IAuthenticatorKernel.AKDataKeys.APPID, aKRequestParams.appID);
            map.put(IAuthenticatorKernel.AKDataKeys.DESCRIPTOR, aKRequestParams.authenticatorDescriptor);
            map.put(IAuthenticatorKernel.AKDataKeys.MATCHER_IN_PARAMS, aKRequestParams.matcherInParams);
            a(aKRequestParams.extensions);
            map.put(IAuthenticatorKernel.AKDataKeys.AUTH_FP_SILENTLY, Boolean.valueOf(this.f63527d));
            if (aKRequestParams.cmd == 13314) {
                map.put(IAuthenticatorKernel.AKDataKeys.AUTH_VALIDITY_DURATION, Integer.valueOf(this.f63526c));
            }
            byte[] bArrProcessRequest = this.f63524a.processRequest(bArrA, map);
            if (bArrProcessRequest == null) {
                throw new AsmException(Outcome.FAILURE, "AK process failed. Response buffer is empty");
            }
            ConformanceTest.logResponse(ConformanceTest.logAuthnrRequest(aKRequestParams.cmd, bArrA), bArrProcessRequest);
            AKResponseParams aKResponseParamsDecode = TLVCommandEncoder.decode(aKRequestParams.cmd, bArrProcessRequest);
            aKResponseParamsDecode.KSAttestationX509 = (String) map.get(IAuthenticatorKernel.AKDataKeys.KSATTESTATIONX509);
            return aKResponseParamsDecode;
        } catch (AuthenticatorException e5) {
            if (e5.getStatusCode() == AuthenticatorException.StatusCode.AUTHENTICATOR_UNAVAILABLE) {
                throw new AsmException(Outcome.AUTHENTICATOR_DISCONNECTED, "Authenticator is disconnected", e5);
            }
            throw new AsmException(Outcome.FAILURE, "AK process failed", e5);
        }
    }
}
