package com.noknok.android.client.asm.keyguard;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.noknok.android.client.asm.authenticator.matcherparams.KSMatcherOutParams;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.asm.sdk.UVTMatcherInParams;
import com.noknok.android.client.asm.sdk.UVTMatcherOutParams;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class KgMatcher implements IMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63279a;
    public IMatcher.RESULT mResult = IMatcher.RESULT.SUCCESS;

    @TargetApi(21)
    public KgMatcher(Context context, ProtocolType protocolType) {
        this.f63279a = context;
    }

    private void a(IMatcher.MatcherInParams matcherInParams, boolean z10) {
        if (!matcherInParams.getCallerActivityProxy().hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for openning KeyGuard UI");
        }
        Intent intent = new Intent(this.f63279a, (Class<?>) KgActivity.class);
        intent.putExtra(KgActivity.KEY_IS_REG_OPERATION, z10);
        intent.putExtra(KgActivity.KEY_IN_TRANSACTION_TEXT, matcherInParams.getTransText());
        if (matcherInParams.getExtensions() != null) {
            for (IMatcher.Extension extension : matcherInParams.getExtensions()) {
                if (extension.id.equals(ExtensionManager.PROMPT_EXT_ID)) {
                    intent.putExtra("KEY_PROMPT_TEXT", new String(Base64.decode(extension.data, 11)));
                    break;
                }
            }
        }
        this.mResult = (IMatcher.RESULT) matcherInParams.getCallerActivityProxy().startActivityForResult(intent, null);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams authenticate(IMatcher.MatcherInParams matcherInParams) {
        a(matcherInParams, false);
        if (this.mResult != IMatcher.RESULT.SUCCESS) {
            Logger.e("KgMatcher", "perform authentication failed.");
        }
        return new KSMatcherOutParams.KSMatcherOutParamsBuilder().setMatchResult(this.mResult).createKSMatcherOutParams(this.f63279a);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherDefinedParamsClassList getMatcherDefinedParamsClassList() {
        return new IMatcher.MatcherDefinedParamsClassList(UVTMatcherInParams.class, UVTMatcherOutParams.class, IMatcher.MatcherSettingsInParams.class, IMatcher.MatcherSettingsOutParams.class);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    @TargetApi(21)
    public IMatcher.EnrollState isUserEnrolled() {
        return ((KeyguardManager) this.f63279a.getSystemService("keyguard")).isKeyguardSecure() ? IMatcher.EnrollState.ENROLLED : IMatcher.EnrollState.NOT_ENROLLED;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public boolean isUserIDValid(byte[] bArr) {
        return true;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams register(IMatcher.MatcherInParams matcherInParams) {
        a(matcherInParams, true);
        if (this.mResult != IMatcher.RESULT.SUCCESS) {
            Logger.e("KgMatcher", "perform registration failed.");
        }
        return new KSMatcherOutParams.KSMatcherOutParamsBuilder().setMatchResult(this.mResult).createKSMatcherOutParams(this.f63279a);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherSettingsOutParams settings(IMatcher.MatcherSettingsInParams matcherSettingsInParams) {
        return new IMatcher.MatcherSettingsOutParams(IMatcher.RESULT.ERRORAUTH);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public void cancel() {
    }
}
