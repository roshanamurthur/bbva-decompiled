package com.huawei.hms.feature.tasks.listener;

import com.huawei.hms.feature.tasks.FeatureTask;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OnFeatureSuccessListener<TResult> implements OnFinishListener<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FeatureTask<TResult> f50568a;

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final boolean needNotify() {
        return this.f50568a.isSuccessful();
    }

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final void onFinish() {
        onSuccess(this.f50568a.getResult());
    }

    public abstract void onSuccess(TResult tresult);

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final void setTask(FeatureTask<TResult> featureTask) {
        this.f50568a = featureTask;
    }
}
