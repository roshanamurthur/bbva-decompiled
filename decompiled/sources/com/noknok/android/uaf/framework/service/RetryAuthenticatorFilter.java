package com.noknok.android.uaf.framework.service;

import com.noknok.android.client.utils.AuthenticatorFilterInParams;
import com.noknok.android.client.utils.AuthenticatorFilterOutParams;
import com.noknok.android.client.utils.IAuthenticatorFilter;

/* JADX INFO: loaded from: classes11.dex */
public class RetryAuthenticatorFilter implements IAuthenticatorFilter {
    @Override // com.noknok.android.client.utils.IAuthenticatorFilter
    public AuthenticatorFilterOutParams process(AuthenticatorFilterInParams authenticatorFilterInParams) {
        return new AuthenticatorFilterOutParams().setRetryOnCancel(authenticatorFilterInParams.authenticators.size() > 1).setAuthenticators(authenticatorFilterInParams.authenticators);
    }
}
