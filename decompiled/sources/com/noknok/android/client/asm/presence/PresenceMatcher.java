package com.noknok.android.client.asm.presence;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.noknok.android.client.asm.authenticator.UVTHelper;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.asm.sdk.UVTMatcherInParams;
import com.noknok.android.client.asm.sdk.UVTMatcherOutParams;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.utils.ConfirmationActivity;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class PresenceMatcher implements IMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63294a;

    /* JADX INFO: renamed from: com.noknok.android.client.asm.presence.PresenceMatcher$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63295a;

        static {
            int[] iArr = new int[Operation.values().length];
            f63295a = iArr;
            try {
                iArr[Operation.REGISTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63295a[Operation.AUTHENTICATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum Operation {
        REGISTER,
        AUTHENTICATE
    }

    public PresenceMatcher(Context context, ProtocolType protocolType) {
        this.f63294a = context;
    }

    private IMatcher.MatcherOutParams a(Operation operation, IMatcher.MatcherInParams matcherInParams) {
        String text;
        if (!(matcherInParams instanceof UVTMatcherInParams)) {
            Logger.e("PresenceMatcher", "Invalid input params, expected UVTMatcherInParams");
            return new UVTMatcherOutParams(IMatcher.RESULT.ERRORAUTH, null, null, null);
        }
        if (!matcherInParams.getCallerActivityProxy().hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for openning Presence ASM UI");
        }
        Intent intentCreateIntent = matcherInParams.getCallerActivityProxy().createIntent(ConfirmationActivity.class);
        if (matcherInParams.getExtensions() != null) {
            text = null;
            for (IMatcher.Extension extension : matcherInParams.getExtensions()) {
                if (extension.id.equals(ExtensionManager.PROMPT_EXT_ID)) {
                    text = new String(Base64.decode(extension.data, 11));
                }
                if (extension.id.equals(ExtensionManager.SHOW_TRANSACTION_EXT_ID) && new String(extension.data).equals("false")) {
                    return new UVTMatcherOutParams(IMatcher.RESULT.SUCCESS, null, new ArrayList(), new UVTHelper(matcherInParams.getAAID(), matcherInParams.getFinalChallenge()).createUVT());
                }
            }
        } else {
            text = null;
        }
        if (text == null) {
            int i10 = AnonymousClass1.f63295a[operation.ordinal()];
            if (i10 == 1) {
                text = UiConfig.getText(this.f63294a, UIConfigTags.LEVELS_YES_NO_VIEW, UIConfigTags.TAG_YES_NO_REG_DESCRIPTION, R.string.nnl_asm_presence_reg_prompt);
            } else if (i10 == 2 && (text = matcherInParams.getTransText()) == null) {
                text = UiConfig.getText(this.f63294a, UIConfigTags.LEVELS_YES_NO_VIEW, UIConfigTags.TAG_YES_NO_AUTH_DESCRIPTION, R.string.nnl_asm_presence_auth_prompt);
            }
        }
        intentCreateIntent.putExtra("KEY_PROMPT_TEXT", text);
        intentCreateIntent.putExtra(ConfirmationActivity.KEY_SHOW_PASSKEY_ICON, true);
        intentCreateIntent.putExtra(ConfirmationActivity.KEY_DIALOG_HEADER, operation.equals(Operation.REGISTER) ? UiConfig.getText(this.f63294a, UIConfigTags.LEVELS_YES_NO_VIEW, UIConfigTags.TAG_YES_NO_REG_TITLE, R.string.nnl_dialog_reg_title) : UiConfig.getText(this.f63294a, UIConfigTags.LEVELS_YES_NO_VIEW, UIConfigTags.TAG_YES_NO_AUTH_TITLE, R.string.nnl_dialog_auth_title));
        IMatcher.RESULT resultFromOutcome = IMatcher.RESULT.fromOutcome((Outcome) matcherInParams.getCallerActivityProxy().startActivityForResult(intentCreateIntent, matcherInParams));
        return new UVTMatcherOutParams(resultFromOutcome, null, new ArrayList(), resultFromOutcome == IMatcher.RESULT.SUCCESS ? new UVTHelper(matcherInParams.getAAID(), matcherInParams.getFinalChallenge()).createUVT() : null);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams authenticate(IMatcher.MatcherInParams matcherInParams) {
        return a(Operation.AUTHENTICATE, matcherInParams);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherDefinedParamsClassList getMatcherDefinedParamsClassList() {
        return new IMatcher.MatcherDefinedParamsClassList(UVTMatcherInParams.class, UVTMatcherOutParams.class, null, null);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.EnrollState isUserEnrolled() {
        return IMatcher.EnrollState.UNAVAILABLE;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public boolean isUserIDValid(byte[] bArr) {
        return false;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams register(IMatcher.MatcherInParams matcherInParams) {
        return a(Operation.REGISTER, matcherInParams);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherSettingsOutParams settings(IMatcher.MatcherSettingsInParams matcherSettingsInParams) {
        return null;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public void cancel() {
    }
}
