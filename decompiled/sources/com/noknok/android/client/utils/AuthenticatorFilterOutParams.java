package com.noknok.android.client.utils;

import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AuthenticatorFilterOutParams {
    public List<List<AuthenticatorInfo>> mAuthenticators = null;
    public boolean mRetryOnCancel = false;
    public boolean mOperationCanceled = false;
    public boolean mOperationSystemCanceled = false;
    public boolean mOperationTimeout = false;

    public AuthenticatorFilterOutParams setAuthenticators(List<List<AuthenticatorInfo>> list) {
        this.mAuthenticators = list;
        return this;
    }

    public AuthenticatorFilterOutParams setOperationCanceled(boolean z10) {
        this.mOperationCanceled = z10;
        return this;
    }

    public AuthenticatorFilterOutParams setOperationSystemCanceled(boolean z10) {
        this.mOperationSystemCanceled = z10;
        return this;
    }

    public AuthenticatorFilterOutParams setOperationTimeout(boolean z10) {
        this.mOperationTimeout = z10;
        return this;
    }

    public AuthenticatorFilterOutParams setRetryOnCancel(boolean z10) {
        this.mRetryOnCancel = z10;
        return this;
    }
}
