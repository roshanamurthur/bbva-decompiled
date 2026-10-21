package com.noknok.android.client.asm.authenticator;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.authenticator.matcherparams.KSMatcherInParams;
import com.noknok.android.client.asm.authenticator.matcherparams.KSMatcherOutParams;
import com.noknok.android.client.asm.core.ICryptoLayer;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IAuthenticatorKernel;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class KsUafCryptoLayer implements ICryptoLayer {
    private static final String TAG = "KsUafCryptoLayer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f63144a = 0;
    private static SecureRandom sr;
    private final KSUtils.AkMode mAkMode;
    private final Context mContext;
    private final KsLabel mLabel;
    private final IMatcher mMatcher;
    public int statusCode = 0;

    public KsUafCryptoLayer(Context context, IMatcher iMatcher, KSUtils.AkMode akMode, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        this.mContext = context;
        this.mMatcher = iMatcher;
        this.mAkMode = akMode;
        this.mLabel = KsLabel.byName(aAIDInfo.label);
        synchronized (KsUafCryptoLayer.class) {
            if (sr == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        sr = CryptoProviderHelper.getSecureRandomInstance();
                    } catch (NoSuchAlgorithmException | NoSuchProviderException e5) {
                        Logger.e(TAG, "Error during getting the SecureRandom instance. The old mechanism will be used", e5);
                        sr = new SecureRandom();
                    }
                } else {
                    sr = new SecureRandom();
                }
            }
        }
        if (!this.mLabel.isSupported(this.mContext)) {
            throw new IllegalArgumentException(String.format("Unsupported label %s", aAIDInfo.label));
        }
    }

    private ICryptoLayer.OutParams performMatcherOperation(Signature signature, boolean z10, Map<IAuthenticatorKernel.AKDataKeys, Object> map) {
        if (map == null) {
            throw new AsmException(Outcome.FAILURE, "Additional parameters for the request is null.");
        }
        if (this.mMatcher == null) {
            throw new AsmException(Outcome.FAILURE, "Matcher object is null.");
        }
        try {
            IMatcher.MatcherInParams extensions = (IMatcher.MatcherInParams) map.get(IAuthenticatorKernel.AKDataKeys.MATCHER_IN_PARAMS);
            if (extensions == null) {
                throw new AsmException(Outcome.FAILURE, "MatcherInParams is null.");
            }
            if (this.mAkMode == KSUtils.AkMode.FP) {
                extensions = new KSMatcherInParams().setCustomUI(extensions.getCustomUI()).setAntihammeringCallback(extensions.getAntiHammeringCallback()).setFinalChallenge(extensions.getFinalChallenge()).setTransText(extensions.getTransText()).setSignatureObject(signature).setCallerActivity(extensions.getCallerActivityProxy()).setExtensions(extensions.getExtensions());
            }
            ICryptoLayer.OutParams outParams = z10 ? (ICryptoLayer.OutParams) this.mMatcher.register(extensions) : (ICryptoLayer.OutParams) this.mMatcher.authenticate(extensions);
            Outcome outcomeFromResult = IMatcher.RESULT.fromResult(outParams.getMatchResult());
            if (outcomeFromResult == Outcome.SUCCESS) {
                return outParams;
            }
            throw new AsmException(outcomeFromResult);
        } catch (ClassCastException e5) {
            throw new AsmException(Outcome.FAILURE, "MatcherInParams class is incorrect.", e5);
        }
    }

    public static byte[] unwrapObjectStatic(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == -127) {
            return Arrays.copyOfRange(bArr, 1, bArr.length);
        }
        return b10 == -128 ? KSUtils.unwrapObject(bArr) : bArr;
    }

    public static byte[] wrapObjectStatic(byte[] bArr) {
        return KSUtils.wrapObject(bArr);
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public byte[] exportPublicKey(byte[] bArr) {
        String str = TAG;
        Logger.i(str, "Export public key");
        this.statusCode = 0;
        byte[] bArrExportPublicKey = KSUtils.exportPublicKey(bArr);
        if (bArrExportPublicKey == null) {
            this.statusCode = 1;
        }
        Logger.i(str, "Key export completed");
        return bArrExportPublicKey;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4 A[Catch: AsmException -> 0x0060, TryCatch #0 {AsmException -> 0x0060, blocks: (B:13:0x0039, B:17:0x004d, B:19:0x0055, B:25:0x0066, B:37:0x00a4, B:39:0x00b4, B:27:0x0071, B:29:0x0077, B:31:0x007d, B:32:0x0085, B:34:0x0098), top: B:43:0x0039, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[Catch: AsmException -> 0x0060, TRY_LEAVE, TryCatch #0 {AsmException -> 0x0060, blocks: (B:13:0x0039, B:17:0x004d, B:19:0x0055, B:25:0x0066, B:37:0x00a4, B:39:0x00b4, B:27:0x0071, B:29:0x0077, B:31:0x007d, B:32:0x0085, B:34:0x0098), top: B:43:0x0039, inners: #1 }] */
    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    @SuppressLint({"MissingPermission"})
    @TargetApi(28)
    public byte[] generateKey(Map<IAuthenticatorKernel.AKDataKeys, Object> map) {
        String strGenerateKeyStoreKeyPair;
        int i10;
        if (this.mAkMode == KSUtils.AkMode.FP && (i10 = Build.VERSION.SDK_INT) > 23 && i10 < 26) {
            try {
                FingerprintManager fingerprintManager = (FingerprintManager) this.mContext.getSystemService(FingerprintManager.class);
                CancellationSignal cancellationSignal = new CancellationSignal();
                fingerprintManager.authenticate(null, cancellationSignal, 0, new FingerprintManager.AuthenticationCallback() { // from class: com.noknok.android.client.asm.authenticator.KsUafCryptoLayer.1
                }, null);
                cancellationSignal.cancel();
            } catch (SecurityException e5) {
                Logger.e(TAG, "mFingerprintManager.authenticate failed with an exception", e5);
            }
        }
        try {
            Logger.i(TAG, "Begin key generation");
            byte[] bArr = (byte[]) map.get(IAuthenticatorKernel.AKDataKeys.KSATTESTATIONCHALLENGE);
            int i11 = 0;
            while (true) {
                if (i11 < 2) {
                    try {
                        IAuthenticatorKernel.AKDataKeys aKDataKeys = IAuthenticatorKernel.AKDataKeys.AUTH_VALIDITY_DURATION;
                        strGenerateKeyStoreKeyPair = KSUtils.generateKeyStoreKeyPair(this.mContext, this.mLabel, this.mAkMode, bArr, map.containsKey(aKDataKeys) ? ((Integer) map.get(aKDataKeys)).intValue() : 0);
                        break;
                    } catch (ProviderException e7) {
                        if (Build.VERSION.SDK_INT < 28 || !a.a(e7)) {
                            String str = TAG;
                            Logger.e(str, "Problem during key generation", e7);
                            if (e7.getMessage().contains("attestation")) {
                                Logger.e(str, "Do key generation without attestation");
                                i11++;
                                bArr = null;
                            }
                        } else {
                            Logger.w(TAG, "StrongBox KeyMaster is not available", e7);
                        }
                        strGenerateKeyStoreKeyPair = null;
                        if (strGenerateKeyStoreKeyPair == null) {
                            Logger.e(TAG, "Key generation failed");
                            this.statusCode = Outcome.FAILURE.getCalErrorCode();
                            return null;
                        }
                        byte[] bytes = strGenerateKeyStoreKeyPair.getBytes(Charsets.utf8Charset);
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 3);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putShort((short) (bytes.length + 1));
                        byteBufferAllocate.put(bytes);
                        this.statusCode = Outcome.SUCCESS.getCalErrorCode();
                        Logger.i(TAG, "End key generation");
                        return byteBufferAllocate.array();
                    }
                }
                strGenerateKeyStoreKeyPair = null;
                break;
            }
            if (strGenerateKeyStoreKeyPair == null) {
                Logger.e(TAG, "Key generation failed");
                this.statusCode = Outcome.FAILURE.getCalErrorCode();
                return null;
            }
            byte[] bytes2 = strGenerateKeyStoreKeyPair.getBytes(Charsets.utf8Charset);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bytes2.length + 3);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putShort((short) (bytes2.length + 1));
            byteBufferAllocate2.put(bytes2);
            this.statusCode = Outcome.SUCCESS.getCalErrorCode();
            Logger.i(TAG, "End key generation");
            return byteBufferAllocate2.array();
        } catch (AsmException e10) {
            this.statusCode = e10.error().getCalErrorCode();
            return null;
        }
    }

    public byte getInfo() {
        Logger.i(TAG, String.format("Selected algorithm type is: %s", getLabel()));
        return this.mLabel.getAlg().getCalId();
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public String getLabel() {
        return this.mLabel.name();
    }

    public byte[] hashData(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        try {
            MessageDigest messageDigestInstance = CryptoProviderHelper.getMessageDigestInstance("SHA-256");
            messageDigestInstance.update(bArr);
            return messageDigestInstance.digest();
        } catch (NoSuchAlgorithmException | NoSuchProviderException unused) {
            Logger.i(TAG, "SHA-256 algorithm does not support");
            return bArr2;
        }
    }

    public byte[] randGen(byte[] bArr) {
        synchronized (KsUafCryptoLayer.class) {
            sr.nextBytes(bArr);
        }
        return bArr;
    }

    public void randSeed(byte[] bArr) {
        synchronized (KsUafCryptoLayer.class) {
            sr.setSeed(bArr);
        }
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public void removeKey(byte[] bArr) {
        Logger.i(TAG, "Removing the key from the CryptoProvider store");
        KSUtils.removeKey(new String(bArr, Charsets.utf8Charset));
        this.statusCode = 0;
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public byte[] signData(byte[] bArr, byte[] bArr2, Map<IAuthenticatorKernel.AKDataKeys, Object> map, Signature signature) {
        this.statusCode = Outcome.SUCCESS.getCalErrorCode();
        if (bArr2 == null) {
            return ByteBuffer.allocate(this.mLabel.getAlg().getSignatureSize()).array();
        }
        String str = TAG;
        Logger.i(str, "Begin Sign command");
        if (bArr == null) {
            Logger.e(str, "No key handle for signing");
            this.statusCode = Outcome.FAILURE.getCalErrorCode();
            return null;
        }
        String str2 = new String(bArr, Charsets.utf8Charset);
        try {
            if (signature == null) {
                try {
                    signature = KSUtils.initSignature(this.mLabel, str2);
                } catch (InvalidKeyException e5) {
                    Logger.w(TAG, "Signing has failed", e5);
                    this.statusCode = Outcome.CMD_NOT_SUPPORTED.getCalErrorCode();
                    if (e5 instanceof KeyPermanentlyInvalidatedException) {
                        this.statusCode = Outcome.KEY_DISAPPEARED_PERMANENTLY.getCalErrorCode();
                    }
                    return null;
                } catch (UnrecoverableEntryException unused) {
                    this.statusCode = Outcome.KEY_DISAPPEARED_PERMANENTLY.getCalErrorCode();
                    return null;
                }
            }
            byte[] bArrSignData = KSUtils.signData(signature, this.mLabel, bArr2);
            if (bArrSignData == null) {
                Logger.e(str, "Data Signing call to KeyStoreCallback failed");
                this.statusCode = Outcome.FAILURE.getCalErrorCode();
                return null;
            }
            if (map.get(IAuthenticatorKernel.AKDataKeys.KSATTESTATIONCHALLENGE) != null) {
                map.put(IAuthenticatorKernel.AKDataKeys.KSATTESTATIONX509, KSUtils.getAttestationChain(str2));
            }
            Logger.i(str, "Sign Command completed");
            return bArrSignData;
        } catch (IllegalArgumentException unused2) {
            Logger.e(TAG, "Data Signing call to KeyStoreCallback failed. Invalid KeyHandle");
            this.statusCode = Outcome.CMD_NOT_SUPPORTED.getCalErrorCode();
            return null;
        }
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public int unwrapGetLength(int i10, byte b10) {
        if (b10 == -127) {
            return i10 - 1;
        }
        return b10 == -128 ? i10 - 13 : i10;
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public byte[] unwrapObject(byte[] bArr) {
        return unwrapObjectStatic(bArr);
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public ICryptoLayer.OutParams verifyUser(byte[] bArr, boolean z10, Map<IAuthenticatorKernel.AKDataKeys, Object> map) {
        Signature signatureInitSignature;
        Logger.i(TAG, "Begin verifyUser command");
        try {
            try {
                IAuthenticatorKernel.AKDataKeys aKDataKeys = IAuthenticatorKernel.AKDataKeys.AUTH_FP_SILENTLY;
                boolean zBooleanValue = map.containsKey(aKDataKeys) ? ((Boolean) map.get(aKDataKeys)).booleanValue() : false;
                if (this.mAkMode != KSUtils.AkMode.FP || zBooleanValue) {
                    signatureInitSignature = null;
                } else {
                    if (bArr == null) {
                        throw new AsmException(Outcome.PARAMS_INVALID, "No key handle for signing");
                    }
                    try {
                        signatureInitSignature = KSUtils.initSignature(this.mLabel, new String(bArr, Charsets.utf8Charset));
                    } catch (InvalidKeyException e5) {
                        if (!(e5 instanceof UserNotAuthenticatedException)) {
                            throw e5;
                        }
                        signatureInitSignature = null;
                    }
                }
                ICryptoLayer.OutParams outParamsCreateKSMatcherOutParams = (this.mAkMode == KSUtils.AkMode.FP && zBooleanValue) ? new KSMatcherOutParams.KSMatcherOutParamsBuilder().setMatchResult(IMatcher.RESULT.SUCCESS).createKSMatcherOutParams(this.mContext) : performMatcherOperation(signatureInitSignature, z10, map);
                this.statusCode = Outcome.SUCCESS.getCalErrorCode();
                Logger.i(TAG, "End verifyUser command");
                return outParamsCreateKSMatcherOutParams;
            } catch (InvalidKeyException e7) {
                Logger.w(TAG, "verifyUser has failed", e7);
                this.statusCode = Outcome.FAILURE.getCalErrorCode();
                if (e7 instanceof KeyPermanentlyInvalidatedException) {
                    this.statusCode = Outcome.KEY_DISAPPEARED_PERMANENTLY.getCalErrorCode();
                }
                return null;
            }
        } catch (AsmException e10) {
            if (e10.error() == Outcome.CANCELED || e10.error() == Outcome.SYSTEM_CANCELED) {
                Logger.i(TAG, "verifyUser has been canceled by user or system");
            } else {
                Logger.e(TAG, "verifyUser has failed", e10);
            }
            this.statusCode = e10.error().getCalErrorCode();
            return null;
        } catch (UnrecoverableEntryException e11) {
            Logger.e(TAG, "verifyUser has failed", e11);
            this.statusCode = Outcome.KEY_DISAPPEARED_PERMANENTLY.getCalErrorCode();
            return null;
        }
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public int wrapGetLength(int i10) {
        return i10 + 29;
    }

    @Override // com.noknok.android.client.asm.core.ICryptoLayer
    public byte[] wrapObject(byte[] bArr) {
        return wrapObjectStatic(bArr);
    }
}
