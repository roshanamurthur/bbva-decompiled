package com.noknok.android.client.appsdk_plus.registration;

import com.noknok.android.client.appsdk.ResultType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IFidoRegistrationLiveData {
    void askCredentialName(String str, String str2);

    void onOperationCompleted(ResultType resultType, String str);

    void setMethods(List<FidoMethod> list, ResultType resultType, String str);
}
