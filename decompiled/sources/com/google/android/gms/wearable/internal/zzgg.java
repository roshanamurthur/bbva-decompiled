package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class zzgg implements BaseImplementation.ResultHolder<Status> {
    private final TaskCompletionSource<Boolean> zzes;

    public zzgg(TaskCompletionSource<Boolean> taskCompletionSource) {
        this.zzes = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.zzes.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(Object obj) {
        Status status = (Status) obj;
        int statusCode = status.getStatusCode();
        if (statusCode == 0) {
            this.zzes.setResult(Boolean.TRUE);
        } else if (statusCode == 4002) {
            this.zzes.setResult(Boolean.FALSE);
        } else {
            setFailedResult(status);
        }
    }
}
