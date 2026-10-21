package com.huawei.hms.feature.tasks.listener;

import com.huawei.hms.feature.tasks.FeatureTask;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OnFeatureCompleteListener<TResult> implements OnFinishListener<TResult> {
    public FeatureTask mFeatureTask;

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final boolean needNotify() {
        return this.mFeatureTask.isComplete();
    }

    public abstract void onComplete(FeatureTask<TResult> featureTask);

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final void onFinish() {
        onComplete(this.mFeatureTask);
    }

    @Override // com.huawei.hms.feature.tasks.listener.OnFinishListener
    public final void setTask(FeatureTask<TResult> featureTask) {
        this.mFeatureTask = featureTask;
    }
}
