package com.noknok.android.client.utils;

/* JADX INFO: loaded from: classes11.dex */
public interface IAuthenticatorFilter {

    public enum OperationType {
        Reg,
        Auth
    }

    AuthenticatorFilterOutParams process(AuthenticatorFilterInParams authenticatorFilterInParams);
}
