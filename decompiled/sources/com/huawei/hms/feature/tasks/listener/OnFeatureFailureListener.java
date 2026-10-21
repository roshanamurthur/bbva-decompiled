package com.huawei.hms.feature.tasks.listener;

import com.huawei.hms.feature.tasks.FeatureTask;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OnFeatureFailureListener<TResult> implements OnFinishListener<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FeatureTask f50567a;

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final boolean needNotify() {
        return !this.f50567a.isSuccessful();
    }

    public abstract void onFailure(Exception exc);

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final void onFinish() {
        onFailure(this.f50567a.getException());
    }

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final void setTask(FeatureTask<TResult> featureTask) {
        this.f50567a = featureTask;
    }
}
