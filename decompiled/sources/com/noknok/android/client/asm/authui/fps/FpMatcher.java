package com.noknok.android.client.asm.authui.fps;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.util.Base64;
import com.noknok.android.client.asm.authenticator.matcherparams.KSMatcherInParams;
import com.noknok.android.client.asm.authenticator.matcherparams.KSMatcherOutParams;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.utils.Logger;
import java.security.InvalidParameterException;
import java.security.Signature;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(23)
public class FpMatcher implements IMatcher {
    public static final int FINGERPRINT_ERROR_LOCKOUT_PERMANENT = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ActivityStarterResult f63170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f63171b;

    public static class ActivityParams extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f63172a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Signature f63173b;

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            Logger.e("FpMatcher", "onAuthenticationError: " + i10 + ", " + ((Object) charSequence));
            boolean z10 = true;
            if (Build.VERSION.SDK_INT <= 24) {
                this.f63172a = i10 == 7;
                return;
            }
            if (i10 != 7 && i10 != 9) {
                z10 = false;
            }
            this.f63172a = z10;
        }
    }

    public static class ActivityStarterResult {
        public IMatcher.RESULT Result;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        FingerprintManager.CryptoObject f63174a;
    }

    public FpMatcher(Context context, ProtocolType protocolType) {
        this.f63171b = context;
    }

    private void a(int i10, IMatcher.MatcherInParams matcherInParams) {
        if (!matcherInParams.getCallerActivityProxy().hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for openning Fingerprint UI");
        }
        ActivityParams activityParams = new ActivityParams();
        try {
            ((FingerprintManager) this.f63171b.getSystemService(FingerprintManager.class)).authenticate(null, null, 0, activityParams, null);
        } catch (SecurityException e5) {
            Logger.e("FpMatcher", "mFingerprintManager.authenticate failed with an exception", e5);
        }
        ActivityStarterResult activityStarterResult = new ActivityStarterResult();
        activityStarterResult.Result = IMatcher.RESULT.ERRORAUTH;
        activityParams.f63173b = ((KSMatcherInParams) matcherInParams).getSignatureObject();
        String transText = matcherInParams.getTransText();
        if (activityParams.f63173b == null) {
            Logger.e("FpMatcher", "Missing input parameters");
            activityStarterResult = null;
        } else {
            Intent intentCreateIntent = matcherInParams.getCallerActivityProxy().createIntent(FpActivity.class);
            intentCreateIntent.putExtra(FpActivity.KEY_FPS_ACTION, i10);
            intentCreateIntent.putExtra(FpActivity.KEY_IN_TRANSACTION_TEXT, transText);
            if (matcherInParams.getExtensions() != null) {
                for (IMatcher.Extension extension : matcherInParams.getExtensions()) {
                    String str = extension.id;
                    str.getClass();
                    switch (str) {
                        case "noknok.prompt":
                            intentCreateIntent.putExtra("KEY_PROMPT_TEXT", new String(Base64.decode(extension.data, 11)));
                            break;
                        case "noknok.fallback":
                            intentCreateIntent.putExtra(FpActivity.KEY_FALLBACK_TEXT, new String(Base64.decode(extension.data, 11)));
                            break;
                        case "noknok.showWhenLocked":
                            intentCreateIntent.putExtra("KEY_SHOW_WHEN_LOCKED", true);
                            break;
                    }
                }
            }
            Logger.i("FpMatcher", "performFPSAuthenticator: Starting signing operation");
            if (isUserEnrolled() == IMatcher.EnrollState.NOT_ENROLLED) {
                activityStarterResult.Result = IMatcher.RESULT.USER_NOT_ENROLLED;
            } else {
                activityStarterResult = (ActivityStarterResult) matcherInParams.getCallerActivityProxy().startActivityForResult(intentCreateIntent, activityParams);
                if (activityStarterResult == null || activityStarterResult.Result != IMatcher.RESULT.SUCCESS || activityStarterResult.f63174a == null) {
                    Logger.e("FpMatcher", "performFPSAuthenticator: Fp Authenticate operation failed");
                }
            }
        }
        this.f63170a = activityStarterResult;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams authenticate(IMatcher.MatcherInParams matcherInParams) {
        Signature signature = null;
        if (isUserEnrolled() != IMatcher.EnrollState.ENROLLED) {
            Logger.e("FpMatcher", "Fingerprint not enrolled");
            return null;
        }
        KSMatcherInParams kSMatcherInParams = (KSMatcherInParams) matcherInParams;
        if (kSMatcherInParams == null || kSMatcherInParams.getSignatureObject() == null) {
            throw new InvalidParameterException("Invalid KeyMatcherInparams");
        }
        a(FpActivity.FPS_ACTION.AUTHENTICATE.ordinal(), matcherInParams);
        ActivityStarterResult activityStarterResult = this.f63170a;
        if (activityStarterResult.Result == IMatcher.RESULT.SUCCESS) {
            signature = activityStarterResult.f63174a.getSignature();
        } else {
            Logger.e("FpMatcher", "Perform Fp Authentication failed");
        }
        return new KSMatcherOutParams.KSMatcherOutParamsBuilder().setAuthSignature(signature).setMatchResult(this.f63170a.Result).createKSMatcherOutParams(this.f63171b);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherDefinedParamsClassList getMatcherDefinedParamsClassList() {
        return new IMatcher.MatcherDefinedParamsClassList(KSMatcherInParams.class, KSMatcherOutParams.class, IMatcher.MatcherSettingsInParams.class, IMatcher.MatcherSettingsOutParams.class);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.EnrollState isUserEnrolled() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f63171b.getSystemService(FingerprintManager.class);
        return (fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) ? IMatcher.EnrollState.ENROLLED : IMatcher.EnrollState.NOT_ENROLLED;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public boolean isUserIDValid(byte[] bArr) {
        return true;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams register(IMatcher.MatcherInParams matcherInParams) {
        Signature signature;
        try {
            Logger.i("FpMatcher", "Creating Protected Key");
            KSMatcherInParams kSMatcherInParams = (KSMatcherInParams) matcherInParams;
            if (kSMatcherInParams == null || kSMatcherInParams.getSignatureObject() == null) {
                throw new InvalidParameterException("Invalid KeyMatcherInparams");
            }
            a(FpActivity.FPS_ACTION.REGISTER.ordinal(), matcherInParams);
            ActivityStarterResult activityStarterResult = this.f63170a;
            if (activityStarterResult.Result == IMatcher.RESULT.SUCCESS) {
                signature = activityStarterResult.f63174a.getSignature();
            } else {
                Logger.e("FpMatcher", "Perform Fp Authentication failed");
                signature = null;
            }
            return new KSMatcherOutParams.KSMatcherOutParamsBuilder().setAuthSignature(signature).setMatchResult(this.f63170a.Result).createKSMatcherOutParams(this.f63171b);
        } catch (RuntimeException e5) {
            Logger.e("FpMatcher", "Key Generation failed", e5);
            return null;
        }
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherSettingsOutParams settings(IMatcher.MatcherSettingsInParams matcherSettingsInParams) {
        return new IMatcher.MatcherSettingsOutParams(IMatcher.RESULT.ERRORAUTH);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public void cancel() {
    }
}
