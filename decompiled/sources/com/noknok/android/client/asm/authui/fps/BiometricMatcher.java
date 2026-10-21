package com.noknok.android.client.asm.authui.fps;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Handler;
import android.util.Base64;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c1;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.h1;
import androidx.window.layout.n;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.noknok.android.client.asm.authenticator.matcherparams.KSMatcherInParams;
import com.noknok.android.client.asm.authenticator.matcherparams.KSMatcherOutParams;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.security.InvalidParameterException;
import java.security.Signature;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(28)
public abstract class BiometricMatcher implements IMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63150a;

    public static class BiometricResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        IMatcher.RESULT f63151a = IMatcher.RESULT.ERRORAUTH;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Signature f63152b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Semaphore f63153c = new Semaphore(0, true);
    }

    public static class StrongMatcher extends BiometricMatcher {
        public StrongMatcher(Context context, ProtocolType protocolType) {
            super(context, protocolType);
        }

        @Override // com.noknok.android.client.asm.authui.fps.BiometricMatcher
        public boolean isStrongBiometric() {
            return true;
        }
    }

    public static class WeakMatcher extends BiometricMatcher {
        public WeakMatcher(Context context, ProtocolType protocolType) {
            super(context, protocolType);
        }

        @Override // com.noknok.android.client.asm.authui.fps.BiometricMatcher
        public boolean isStrongBiometric() {
            return false;
        }
    }

    public BiometricMatcher(Context context, ProtocolType protocolType) {
        this.f63150a = context;
    }

    private BiometricResult a(final IMatcher.MatcherInParams matcherInParams, final boolean z10) {
        if (!matcherInParams.getCallerActivityProxy().hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for openning Biometric UI");
        }
        BiometricResult biometricResult = new BiometricResult();
        final BiometricAuthenticationCallback biometricAuthenticationCallback = new BiometricAuthenticationCallback(biometricResult);
        new Handler(this.f63150a.getMainLooper()).post(new Runnable() { // from class: com.noknok.android.client.asm.authui.fps.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f63189p0.a(biometricAuthenticationCallback, z10, matcherInParams);
            }
        });
        try {
            biometricResult.f63153c.acquire();
            return biometricResult;
        } catch (InterruptedException e5) {
            biometricAuthenticationCallback.b().cancel();
            throw new IllegalStateException("Problem during wait", e5);
        }
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams authenticate(IMatcher.MatcherInParams matcherInParams) {
        if (matcherInParams == null) {
            throw new InvalidParameterException("Invalid KeyMatcherInparams");
        }
        BiometricResult biometricResultA = a(matcherInParams, false);
        return new KSMatcherOutParams.KSMatcherOutParamsBuilder().setAuthSignature(biometricResultA.f63152b).setMatchResult(biometricResultA.f63151a).createKSMatcherOutParams(this.f63150a);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherDefinedParamsClassList getMatcherDefinedParamsClassList() {
        return new IMatcher.MatcherDefinedParamsClassList(KSMatcherInParams.class, KSMatcherOutParams.class, IMatcher.MatcherSettingsInParams.class, IMatcher.MatcherSettingsOutParams.class);
    }

    public abstract boolean isStrongBiometric();

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.EnrollState isUserEnrolled() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 29) {
            return c1.d(this.f63150a.getSystemService(b1.c())).canAuthenticate(isStrongBiometric() ? 15 : 255) == 11 ? IMatcher.EnrollState.NOT_ENROLLED : IMatcher.EnrollState.ENROLLED;
        }
        if (i10 == 29) {
            return c1.d(this.f63150a.getSystemService(b1.c())).canAuthenticate() == 11 ? IMatcher.EnrollState.NOT_ENROLLED : IMatcher.EnrollState.ENROLLED;
        }
        if (!isStrongBiometric()) {
            return IMatcher.EnrollState.ENROLLED;
        }
        FingerprintManager fingerprintManager = (FingerprintManager) this.f63150a.getSystemService(FingerprintManager.class);
        return (fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) ? IMatcher.EnrollState.ENROLLED : IMatcher.EnrollState.NOT_ENROLLED;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public boolean isUserIDValid(byte[] bArr) {
        return true;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams register(IMatcher.MatcherInParams matcherInParams) {
        Logger.i("BiometricMatcher", "Creating Protected Key");
        if (matcherInParams == null) {
            throw new InvalidParameterException("Invalid KeyMatcherInparams");
        }
        BiometricResult biometricResultA = a(matcherInParams, true);
        return new KSMatcherOutParams.KSMatcherOutParamsBuilder().setAuthSignature(biometricResultA.f63152b).setMatchResult(biometricResultA.f63151a).createKSMatcherOutParams(this.f63150a);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherSettingsOutParams settings(IMatcher.MatcherSettingsInParams matcherSettingsInParams) {
        return new IMatcher.MatcherSettingsOutParams(IMatcher.RESULT.ERRORAUTH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.noknok.android.client.asm.authui.fps.d] */
    public void a(final BiometricAuthenticationCallback biometricAuthenticationCallback, boolean z10, IMatcher.MatcherInParams matcherInParams) {
        String text;
        List<IMatcher.Extension> extensions;
        biometricAuthenticationCallback.a();
        h1.a();
        BiometricPrompt.Builder title = n.a(this.f63150a).setTitle(UiConfig.getText(this.f63150a, UIConfigTags.LEVELS_FINGERPRINT_VIEW, UIConfigTags.TAG_NATIVE_BIOMETRIC_TITLE, R.string.nnl_asm_native_fps_bm_title));
        if (matcherInParams.getExtensions() == null) {
            text = null;
            break;
        }
        Iterator<IMatcher.Extension> it = matcherInParams.getExtensions().iterator();
        while (true) {
            if (!it.hasNext()) {
                text = null;
                break;
            }
            IMatcher.Extension next = it.next();
            if (next.id.equals(ExtensionManager.PROMPT_EXT_ID)) {
                text = new String(Base64.decode(next.data, 11));
                break;
            }
        }
        if (text == null || text.isEmpty()) {
            if (z10) {
                text = UiConfig.getText(this.f63150a, UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_REGISTER, R.string.nnl_asmsdk_uaf_reg_default_prompt);
            } else if (matcherInParams.getTransText() != null) {
                text = UiConfig.getText(this.f63150a, UIConfigTags.LEVELS_METHODS_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_TRANSACTION, R.string.nnl_asmsdk_uaf_trans_default_prompt);
            } else {
                text = UiConfig.getText(this.f63150a, UIConfigTags.LEVELS_METHODS_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_SIGN_IN, R.string.nnl_asmsdk_uaf_auth_default_prompt);
            }
        }
        BiometricPrompt.Builder negativeButton = title.setDescription(text).setNegativeButton(this.f63150a.getString(R.string.nnl_asm_native_fps_cancel), this.f63150a.getMainExecutor(), new DialogInterface.OnClickListener() { // from class: com.noknok.android.client.asm.authui.fps.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                biometricAuthenticationCallback.onAuthenticationError(10, "Canceled by user");
            }
        });
        if (Build.VERSION.SDK_INT >= 29 && (extensions = matcherInParams.getExtensions()) != null && extensions.size() != 0) {
            for (IMatcher.Extension extension : extensions) {
                if (extension.id.equals(ExtensionManager.BIOMETRIC_OPTIONS_EXT_ID)) {
                    byte[] bArr = extension.data;
                    if (bArr == null) {
                        break;
                    }
                    JsonObject asJsonObject = JsonParser.parseString(new String(bArr)).getAsJsonObject();
                    if ((!asJsonObject.has("confirmationRequired") || !asJsonObject.get("confirmationRequired").getAsBoolean()) && asJsonObject.has("confirmationRequired")) {
                        negativeButton.setConfirmationRequired(false);
                        break;
                    } else {
                        break;
                        break;
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && isStrongBiometric()) {
            negativeButton.setAllowedAuthenticators(15);
        }
        BiometricPrompt biometricPromptBuild = negativeButton.build();
        if (isStrongBiometric()) {
            biometricPromptBuild.authenticate(g1.b(((KSMatcherInParams) matcherInParams).getSignatureObject()), biometricAuthenticationCallback.b(), this.f63150a.getMainExecutor(), biometricAuthenticationCallback);
        } else {
            biometricPromptBuild.authenticate(biometricAuthenticationCallback.b(), this.f63150a.getMainExecutor(), biometricAuthenticationCallback);
        }
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public void cancel() {
    }
}
