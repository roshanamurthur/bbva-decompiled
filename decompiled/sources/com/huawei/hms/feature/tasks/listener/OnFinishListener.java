package com.huawei.hms.feature.tasks.listener;

import com.huawei.hms.feature.tasks.FeatureTask;

/* JADX INFO: loaded from: classes10.dex */
public interface OnFinishListener<TResult> {
    boolean needNotify();

    void onFinish();

    void setTask(FeatureTask<TResult> featureTask);
}
