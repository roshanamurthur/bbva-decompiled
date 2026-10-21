package com.noknok.android.client.asm.authui.pin;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.pinmanagement.PinDatabase;
import com.noknok.android.client.asm.pinmanagement.PinManager;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.asm.sdk.UVTMatcherInParams;
import com.noknok.android.client.asm.sdk.UVTMatcherOutParams;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;

/* JADX INFO: loaded from: classes11.dex */
public class PINMatcher implements IMatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<PINActivity> f63211b = PINActivity.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63212a;

    public enum ACTION {
        ENROLL,
        REGISTER,
        IDENTIFY,
        MANAGE,
        MAX
    }

    public PINMatcher(Context context, ProtocolType protocolType) {
        this.f63212a = context;
    }

    private IMatcher.MatcherOutParams a(ACTION action, IMatcher.MatcherInParams matcherInParams) {
        if (!(matcherInParams instanceof UVTMatcherInParams)) {
            Logger.e("PINMatcher", "Invalid input params, expected UVTMatcherInParams");
            return new UVTMatcherOutParams(IMatcher.RESULT.ERRORAUTH, null, null, null);
        }
        if (!matcherInParams.getCallerActivityProxy().hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for openning PIN UI");
        }
        Intent intentA = a(action);
        if (matcherInParams.getExtensions() != null) {
            for (IMatcher.Extension extension : matcherInParams.getExtensions()) {
                String str = extension.id;
                str.getClass();
                switch (str) {
                    case "noknok.manageAuthenticator":
                        intentA.removeExtra("ACTION");
                        intentA.putExtra("ACTION", ACTION.MANAGE.ordinal());
                        break;
                    case "noknok.prompt":
                        intentA.putExtra("KEY_PROMPT_TEXT", new String(Base64.decode(extension.data, 11)));
                        break;
                    case "noknok.showWhenLocked":
                        intentA.putExtra("KEY_SHOW_WHEN_LOCKED", true);
                        break;
                }
            }
        }
        return (IMatcher.MatcherOutParams) matcherInParams.getCallerActivityProxy().startActivityForResult(intentA, matcherInParams);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams authenticate(IMatcher.MatcherInParams matcherInParams) {
        PinDatabase.PinConfig pinConfig = new PinManager(matcherInParams.getAAID(), this.f63212a, null).setCallerId(matcherInParams.getCallerId()).setAppId(matcherInParams.getAppId()).setKeyId(matcherInParams.getKeyId()).setGlobalEnrollment(true).getPinConfig();
        if (matcherInParams.getAntiHammeringCallback().setMaxFalseAttempts(pinConfig.maxFalseAttempts).setLockoutPeriod(pinConfig.lockoutPeriod).setProbationPeriod(pinConfig.probationPeriod).getLockedState() <= 0) {
            return a(ACTION.IDENTIFY, matcherInParams);
        }
        throw new AsmException(Outcome.USER_LOCKOUT, "The Authenticator is locked");
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherDefinedParamsClassList getMatcherDefinedParamsClassList() {
        return new IMatcher.MatcherDefinedParamsClassList(UVTMatcherInParams.class, UVTMatcherOutParams.class, IMatcher.MatcherSettingsInParams.class, IMatcher.MatcherSettingsOutParams.class);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.EnrollState isUserEnrolled() {
        return IMatcher.EnrollState.UNAVAILABLE;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public boolean isUserIDValid(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams register(IMatcher.MatcherInParams matcherInParams) {
        PinManager globalEnrollment = new PinManager(matcherInParams.getAAID(), this.f63212a, null).setGlobalEnrollment(true);
        ACTION action = globalEnrollment.isEnrolled() ? ACTION.REGISTER : ACTION.ENROLL;
        if (action == ACTION.ENROLL) {
            globalEnrollment.remove();
        }
        return a(action, matcherInParams);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherSettingsOutParams settings(IMatcher.MatcherSettingsInParams matcherSettingsInParams) {
        if (matcherSettingsInParams == null) {
            Logger.e("PINMatcher", "Invalid input params");
            return new IMatcher.MatcherSettingsOutParams(IMatcher.RESULT.ERRORAUTH);
        }
        if (matcherSettingsInParams.getCallerActivityProxy().hasActivity()) {
            return (IMatcher.MatcherSettingsOutParams) matcherSettingsInParams.getCallerActivityProxy().startActivityForResult(a(ACTION.MANAGE), matcherSettingsInParams);
        }
        throw new IllegalArgumentException("Caller Activity is required for openning PIN settings UI");
    }

    private Intent a(ACTION action) {
        Intent intent = new Intent(this.f63212a, f63211b);
        intent.putExtra("ACTION", action.ordinal());
        intent.putExtra("GLOBAL_ENROLLMENT", true);
        return intent;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public void cancel() {
    }
}
