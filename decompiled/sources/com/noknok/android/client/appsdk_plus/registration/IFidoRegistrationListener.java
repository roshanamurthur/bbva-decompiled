package com.noknok.android.client.appsdk_plus.registration;

import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AuthenticationData;

/* JADX INFO: loaded from: classes11.dex */
public interface IFidoRegistrationListener {
    void onDeregisterFailed(ResultType resultType);

    void onRegisterCompleted(AuthenticationData authenticationData);

    void onRegisterFailed(ResultType resultType);
}
