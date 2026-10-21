package com.noknok.android.client.asm.sdk;

import com.noknok.android.client.utils.ActivityProxy;

/* JADX INFO: loaded from: classes11.dex */
public class UVTMatcherInParams extends IMatcher.MatcherInParams {
    public UVTMatcherInParams(String str, String str2, byte[] bArr, IMatcher.IAntiHammeringCallback iAntiHammeringCallback, String str3, Boolean bool, ActivityProxy activityProxy) {
        super(str, str2, bArr, iAntiHammeringCallback, str3, bool, activityProxy);
    }

    public UVTMatcherInParams setAAID(String str) {
        this.m_AAID = str;
        return this;
    }

    public UVTMatcherInParams setAntihammeringCallback(IMatcher.IAntiHammeringCallback iAntiHammeringCallback) {
        this.m_antihammeringCallback = iAntiHammeringCallback;
        return this;
    }

    public UVTMatcherInParams setCallerActivity(ActivityProxy activityProxy) {
        this.mActivityProxy = activityProxy;
        return this;
    }

    public UVTMatcherInParams setCustomUI(String str) {
        this.m_customUI = str;
        return this;
    }

    public UVTMatcherInParams setFinalChallenge(byte[] bArr) {
        this.FinalChallenge = bArr;
        return this;
    }

    public UVTMatcherInParams setHasRegistrations(Boolean bool) {
        this.mHasRegistrations = bool;
        return this;
    }

    public UVTMatcherInParams setTransText(String str) {
        this.m_transText = str;
        return this;
    }

    public UVTMatcherInParams() {
    }
}
