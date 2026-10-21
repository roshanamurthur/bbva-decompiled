package com.noknok.android.client.asm.authenticator;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.webkit.internal.AssetHelper;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.api.uaf.json.DisplayPNGCharacteristicsDescriptor;
import com.noknok.android.client.asm.api.uaf.json.ProtocolTags;
import com.noknok.android.client.asm.api.uaf.json.UAFPublicKeyFormat;
import com.noknok.android.client.asm.authenticator.matcherparams.KSMatcherOutParams;
import com.noknok.android.client.asm.core.AKDigestMethod;
import com.noknok.android.client.asm.core.ICryptoLayer;
import com.noknok.android.client.asm.core.uaf.AuthenticatorCore;
import com.noknok.android.client.asm.sdk.AuthenticatorException;
import com.noknok.android.client.asm.sdk.IAKDigestMethod;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IAuthenticatorKernel;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.uaf.asmcore.AKProcessor;
import com.noknok.android.uaf.asmcore.AuthenticatorDatabase;
import com.noknok.android.uaf.asmcore.TLVCommandEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class KsUafAuthenticatorKernel implements IAuthenticatorKernel {
    private static final String TAG = "KsUafAuthenticatorKernel";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f63143a = 0;
    private static final Map<String, LabelParams> mLabelParams;
    protected final AkUafInfo mAkUafInfo;
    protected final ICryptoLayer mCryptoLayer;

    public static class AkUafInfo {
        public String aaid;
        public short authenticationAlgorithm;
        public short keyProtection;
        public short matcherProtection;
        public short pubKeyAlgAndEncoding;
        public long userVerification;
        public short tcDisplay = 1;
        public String tcDisplayContentType = AssetHelper.DEFAULT_MIME_TYPE;
        public List<DisplayPNGCharacteristicsDescriptor> tcDisplayPNGCharacteristics = null;
        public final String assertionScheme = "UAFV1TLV";
        public final short attestationType = ProtocolTags.TAG_ATTESTATION_BASIC_SURROGATE;
        public short authenticatorType = 0;
        public final byte maxKeyHandleNum = 16;
    }

    public static class LabelParams {
        private final short mAuthenticationAlgorithm;
        private final short mKeyProtection;
        private final short mPubKeyAlgAndEncoding;

        public LabelParams(short s4, short s7, short s9) {
            this.mKeyProtection = s4;
            this.mAuthenticationAlgorithm = s7;
            this.mPubKeyAlgAndEncoding = s9;
        }
    }

    static {
        HashMap map = new HashMap();
        mLabelParams = map;
        map.put("NNL_KS_UAF", new LabelParams((short) 6, (short) 1, (short) 256));
        map.put("NNL_KS_SFT_UAF", new LabelParams((short) 1, (short) 1, (short) 256));
        map.put("NNL_KS_SFT_RSA_UAF", new LabelParams((short) 1, (short) 8, UAFPublicKeyFormat.UAF_ALG_KEY_RSA_2048_PSS_RAW));
        map.put("NNL_KS_RSA_UAF", new LabelParams((short) 6, (short) 8, UAFPublicKeyFormat.UAF_ALG_KEY_RSA_2048_PSS_RAW));
        map.put("NNL_KS_SE_UAF", new LabelParams((short) 2, (short) 1, (short) 256));
        map.put("NNL_KS_SE_RSA_UAF", new LabelParams((short) 2, (short) 8, UAFPublicKeyFormat.UAF_ALG_KEY_RSA_2048_PSS_RAW));
        map.put("NNL_KS_WATCH_UAF", new LabelParams((short) 1, (short) 1, (short) 256));
    }

    public KsUafAuthenticatorKernel(ICryptoLayer iCryptoLayer, @NonNull IAuthenticatorDescriptor iAuthenticatorDescriptor) {
        AkUafInfo akUafInfo = new AkUafInfo();
        this.mAkUafInfo = akUafInfo;
        this.mCryptoLayer = iCryptoLayer;
        String label = iCryptoLayer.getLabel();
        akUafInfo.aaid = iAuthenticatorDescriptor.getAAIDInfo().get(label).aaid;
        akUafInfo.matcherProtection = iAuthenticatorDescriptor.getMatcherProtection().getUafValue();
        akUafInfo.userVerification = UserVerification.getUafValue(iAuthenticatorDescriptor.getUserVerification());
        LabelParams labelParams = mLabelParams.get(label);
        akUafInfo.keyProtection = labelParams.mKeyProtection;
        akUafInfo.authenticationAlgorithm = labelParams.mAuthenticationAlgorithm;
        akUafInfo.pubKeyAlgAndEncoding = labelParams.mPubKeyAlgAndEncoding;
        if (iAuthenticatorDescriptor.getTransactionUIType().equals(IAuthenticatorDescriptor.TransactionUI.None)) {
            akUafInfo.tcDisplay = (short) 0;
        }
    }

    private byte[] processDeregister(AKProcessor.AKRequestParams aKRequestParams, byte[] bArr, Map<IAuthenticatorKernel.AKDataKeys, Object> map) {
        List<byte[]> list = aKRequestParams.keyHandles;
        if (list != null) {
            Iterator<byte[]> it = list.iterator();
            while (it.hasNext()) {
                this.mCryptoLayer.removeKey(KeyHandle.decodeKeyHandle(this.mCryptoLayer.unwrapObject(it.next())).mUAuthPriv);
            }
        }
        AKProcessor.AKResponseParams aKResponseParams = new AKProcessor.AKResponseParams();
        aKResponseParams.statusCode = Outcome.SUCCESS.getUafAsmStatusCode();
        return TLVCommandEncoder.encodeResponse(aKResponseParams, TLVCommandEncoder.Commands.DEREGISTER);
    }

    private byte[] processRegister(AKProcessor.AKRequestParams aKRequestParams, byte[] bArr, Map<IAuthenticatorKernel.AKDataKeys, Object> map) {
        Signature signature;
        byte[] userID;
        byte[] bArr2 = aKRequestParams.userVerifyToken;
        if (bArr2 != null && bArr2.length > 0) {
            UVTHelper.verifyUVT(bArr2);
        }
        ((KsUafCryptoLayer) this.mCryptoLayer).randSeed(aKRequestParams.finalChallenge);
        byte[] bArrGenerateKey = this.mCryptoLayer.generateKey(map);
        if (bArrGenerateKey == null) {
            throw new AsmException(Outcome.fromCalErrorCode(((KsUafCryptoLayer) this.mCryptoLayer).statusCode), "key generation failed");
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrGenerateKey);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        int i10 = byteBufferWrap.getShort();
        byte[] bArr3 = new byte[i10 - 1];
        byteBufferWrap.get(bArr3);
        byte[] bArr4 = new byte[i10];
        byteBufferWrap.position(2);
        byteBufferWrap.get(bArr4);
        byte[] bArr5 = aKRequestParams.userVerifyToken;
        if (bArr5 == null || bArr5.length == 0) {
            Logger.i(TAG, "Register: UVT is not provided, verifying User with internal matcher.");
            KSMatcherOutParams kSMatcherOutParams = (KSMatcherOutParams) this.mCryptoLayer.verifyUser(bArr3, true, map);
            if (kSMatcherOutParams == null) {
                throw new AsmException(Outcome.fromCalErrorCode(((KsUafCryptoLayer) this.mCryptoLayer).statusCode), "User verification failed");
            }
            byte[] userID2 = kSMatcherOutParams.getUserID();
            signature = kSMatcherOutParams.getSignature();
            userID = userID2;
        } else {
            userID = UVTHelper.verifyUVT(bArr5).getUserID();
            signature = null;
        }
        Logger.i(TAG, "Register: User is successfully verified. Generating UAF REG assertion.");
        AKProcessor.AKResponseParams aKResponseParams = new AKProcessor.AKResponseParams();
        byte[] bArrWrapObject = this.mCryptoLayer.wrapObject(new KeyHandle(aKRequestParams.KHAccessToken, bArr4, false, aKRequestParams.userName, userID, null).encodeKeyHandle());
        byte[] bArrHashData = ((KsUafCryptoLayer) this.mCryptoLayer).hashData(bArrWrapObject);
        AKProcessor.AkConfig akConfig = new AKProcessor.AkConfig();
        byte[] bArr6 = aKRequestParams.additionalAKArgument;
        if (bArr6 != null && bArr6.length > 0) {
            akConfig = TLVCommandEncoder.parseAkConfig(this.mCryptoLayer.unwrapObject(bArr6));
        }
        AKProcessor.AkConfig akConfig2 = akConfig;
        akConfig2.regCounter++;
        akConfig2.signCounter++;
        byte[] bArrExportPublicKey = this.mCryptoLayer.exportPublicKey(bArr3);
        if (bArrExportPublicKey == null) {
            throw new AsmException(Outcome.fromCalErrorCode(((KsUafCryptoLayer) this.mCryptoLayer).statusCode), "exporting public key failed");
        }
        byte[] bArrCreateKrd = TLVCommandEncoder.createKrd(aKRequestParams, this.mAkUafInfo, akConfig2, bArrHashData, bArrExportPublicKey, TLVCommandEncoder.createUvmExtensionTlv(this.mAkUafInfo));
        byte[] bArrSignData = this.mCryptoLayer.signData(bArr3, bArrCreateKrd, map, signature);
        if (bArrSignData == null) {
            throw new AsmException(Outcome.fromCalErrorCode(((KsUafCryptoLayer) this.mCryptoLayer).statusCode), "Signing Data failed");
        }
        aKResponseParams.assertion = TLVCommandEncoder.createRegAssertion(bArrCreateKrd, bArrSignData);
        aKResponseParams.regToBeStored.keyID = Base64.encodeToString(bArr3, 11);
        aKResponseParams.regToBeStored.keyHandle = Base64.encodeToString(bArrWrapObject, 11);
        aKResponseParams.additionalAKInfoToBeStored = this.mCryptoLayer.wrapObject(TLVCommandEncoder.encodeAkConfig(akConfig2));
        return TLVCommandEncoder.encodeResponse(aKResponseParams, TLVCommandEncoder.Commands.REGISTER);
    }

    private byte[] processSign(AKProcessor.AKRequestParams aKRequestParams, byte[] bArr, Map<IAuthenticatorKernel.AKDataKeys, Object> map) {
        Signature signature;
        AKProcessor.AKResponseParams aKResponseParams = new AKProcessor.AKResponseParams();
        ((KsUafCryptoLayer) this.mCryptoLayer).randSeed(aKRequestParams.finalChallenge);
        byte[] bArr2 = aKRequestParams.userVerifyToken;
        if (bArr2 != null && bArr2.length > 0) {
            UVTHelper.verifyUVT(bArr2);
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArrVerifyTct = null;
        byte[] bArrHashData = null;
        for (byte[] bArr3 : aKRequestParams.keyHandles) {
            arrayList.add(KeyHandle.decodeKeyHandle(this.mCryptoLayer.unwrapObject(bArr3)));
            bArrHashData = ((KsUafCryptoLayer) this.mCryptoLayer).hashData(bArr3);
        }
        if (arrayList.size() == 0) {
            throw new AsmException(Outcome.ACCESS_DENIED, "No valid key handle provided");
        }
        if (arrayList.size() == 1) {
            byte[] bArr4 = aKRequestParams.userVerifyToken;
            if (bArr4 == null || bArr4.length == 0) {
                Logger.i(TAG, "Register: UVT is not provided, verifying User with internal matcher.");
                KSMatcherOutParams kSMatcherOutParams = (KSMatcherOutParams) this.mCryptoLayer.verifyUser(((KeyHandle) arrayList.get(0)).mUAuthPriv, false, map);
                if (kSMatcherOutParams == null) {
                    throw new AsmException(Outcome.fromCalErrorCode(((KsUafCryptoLayer) this.mCryptoLayer).statusCode), "verifyUser failed");
                }
                signature = kSMatcherOutParams.getSignature();
            } else {
                signature = null;
            }
            AKProcessor.AkConfig akConfig = new AKProcessor.AkConfig();
            byte[] bArr5 = aKRequestParams.additionalAKArgument;
            if (bArr5 != null && bArr5.length > 0) {
                akConfig = TLVCommandEncoder.parseAkConfig(this.mCryptoLayer.unwrapObject(bArr5));
            }
            AKProcessor.AkConfig akConfig2 = akConfig;
            akConfig2.signCounter++;
            byte[] bArrCreateUvmExtensionTlv = TLVCommandEncoder.createUvmExtensionTlv(this.mAkUafInfo);
            byte[] bArrRandGen = ((KsUafCryptoLayer) this.mCryptoLayer).randGen(new byte[32]);
            byte[] bArr6 = aKRequestParams.transaction;
            if (bArr6 != null && bArr6.length > 0) {
                bArrVerifyTct = verifyTct(bArr6, aKRequestParams.transactionConfirmationToken, aKRequestParams.finalChallenge);
            }
            byte[] bArrCreateAuthSignData = TLVCommandEncoder.createAuthSignData(aKRequestParams, this.mAkUafInfo, akConfig2, bArrHashData, bArrRandGen, bArrVerifyTct, bArrCreateUvmExtensionTlv);
            byte[] bArrSignData = this.mCryptoLayer.signData(((KeyHandle) arrayList.get(0)).mUAuthPriv, bArrCreateAuthSignData, map, signature);
            if (bArrSignData == null) {
                throw new AsmException(Outcome.fromCalErrorCode(((KsUafCryptoLayer) this.mCryptoLayer).statusCode), "Signing Data failed");
            }
            aKResponseParams.additionalAKInfoToBeStored = this.mCryptoLayer.wrapObject(TLVCommandEncoder.encodeAkConfig(akConfig2));
            aKResponseParams.assertion = TLVCommandEncoder.createSignAsertion(bArrCreateAuthSignData, bArrSignData);
        } else {
            for (int i10 = 0; i10 < aKRequestParams.keyHandles.size(); i10++) {
                aKResponseParams.usernames.add(new AuthenticatorCore.Username(new String(((KeyHandle) arrayList.get(i10)).mUsername), Base64.encodeToString(aKRequestParams.keyHandles.get(i10), 11), 0L));
            }
        }
        return TLVCommandEncoder.encodeResponse(aKResponseParams, TLVCommandEncoder.Commands.SIGN);
    }

    private byte[] verifyTct(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2 == null || bArr2.length == 0) {
            throw new AsmException(Outcome.ACCESS_DENIED, "Empty Transaction confirmation token");
        }
        byte[] bArrHashData = ((KsUafCryptoLayer) this.mCryptoLayer).hashData(bArr);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byte[] bArr4 = null;
        while (byteBufferWrap.hasRemaining()) {
            TLVCommandEncoder.TagLength tagAndLength = TLVCommandEncoder.readTagAndLength(byteBufferWrap);
            int i10 = tagAndLength.length;
            if (i10 < 0) {
                throw new AsmException(Outcome.PROTOCOL_ERROR, "Invalid TLV structure in TCT");
            }
            short s4 = tagAndLength.tag;
            if (s4 == 10485) {
                byteBufferWrap.get();
            } else {
                if (s4 != 10486) {
                    throw new AsmException(Outcome.PROTOCOL_ERROR, "Uncnown tag in TC token");
                }
                bArr4 = new byte[i10];
                byteBufferWrap.get(bArr4);
            }
        }
        if (bArr4 == null || bArr4.length != bArrHashData.length + bArr3.length) {
            throw new AsmException(Outcome.ACCESS_DENIED, "TCT content is empty or has invalid lengh ");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArrHashData.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, bArrHashData.length, bArr4.length);
        if (Arrays.equals(bArrCopyOf, bArrHashData) && Arrays.equals(bArrCopyOfRange, bArr3)) {
            return bArrHashData;
        }
        throw new AsmException(Outcome.ACCESS_DENIED, "TCT validation failed");
    }

    public boolean checkDatabase(AuthenticatorDatabase authenticatorDatabase) {
        return (authenticatorDatabase.hasRegistrations() && KsUafCryptoLayer.unwrapObjectStatic(Base64.decode(authenticatorDatabase.getAKConfig(), 11)) == null) ? false : true;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public EnumSet<IAuthenticatorKernel.AttachmentHint> getAttachmentHint() {
        return EnumSet.of(IAuthenticatorKernel.AttachmentHint.ATTACHMENT_HINT_INTERNAL);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public IAKDigestMethod getDigestMethod() {
        return new AKDigestMethod();
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public boolean postProcess() {
        return true;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public byte[] processRequest(byte[] bArr, Map<IAuthenticatorKernel.AKDataKeys, Object> map) throws AuthenticatorException {
        AKProcessor.AKRequestParams aKRequestParamsDecodeRequest = TLVCommandEncoder.decodeRequest(bArr);
        switch (aKRequestParamsDecodeRequest.cmd) {
            case 13313:
                return TLVCommandEncoder.prepareGetInfoResponse(this.mAkUafInfo);
            case 13314:
                return processRegister(aKRequestParamsDecodeRequest, bArr, map);
            case 13315:
                return processSign(aKRequestParamsDecodeRequest, bArr, map);
            case 13316:
                return processDeregister(aKRequestParamsDecodeRequest, bArr, map);
            default:
                Logger.e(TAG, "Unsupported command " + ((int) aKRequestParamsDecodeRequest.cmd));
                return null;
        }
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public boolean requiresKeyHandleForDereg() {
        return true;
    }
}
