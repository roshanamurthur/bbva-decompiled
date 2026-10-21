package com.noknok.android.client.appsdk_plus.pending_auth;

import com.noknok.android.client.appsdk.ResultType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IPendingAuthsLiveData {
    void onApproveCompleted(ResultType resultType, String str);

    void onRejectCompleted(ResultType resultType, String str);

    void setPendingAuths(List<PendingAuth> list, ResultType resultType, String str);
}
