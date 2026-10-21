package com.noknok.android.client.asm.authenticator.matcherparams;

import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.ActivityProxy;
import java.security.Signature;

/* JADX INFO: loaded from: classes11.dex */
public class KSMatcherInParams extends IMatcher.MatcherInParams {
    private Signature mAuthSignatureObject;

    public Signature getSignatureObject() {
        return this.mAuthSignatureObject;
    }

    public KSMatcherInParams setAntihammeringCallback(IMatcher.IAntiHammeringCallback iAntiHammeringCallback) {
        this.m_antihammeringCallback = iAntiHammeringCallback;
        return this;
    }

    public KSMatcherInParams setCallerActivity(ActivityProxy activityProxy) {
        this.mActivityProxy = activityProxy;
        return this;
    }

    public KSMatcherInParams setCustomUI(String str) {
        this.m_customUI = str;
        return this;
    }

    public KSMatcherInParams setFinalChallenge(byte[] bArr) {
        this.FinalChallenge = bArr;
        return this;
    }

    public KSMatcherInParams setSignatureObject(Signature signature) {
        this.mAuthSignatureObject = signature;
        return this;
    }

    public KSMatcherInParams setTransText(String str) {
        this.m_transText = str;
        return this;
    }
}
