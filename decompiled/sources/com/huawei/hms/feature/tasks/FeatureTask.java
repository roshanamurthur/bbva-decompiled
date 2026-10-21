package com.huawei.hms.feature.tasks;

import com.huawei.hms.feature.tasks.listener.OnFinishListener;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FeatureTask<TResult> {
    public abstract FeatureTask<TResult> addOnListener(OnFinishListener<TResult> onFinishListener);

    public abstract FeatureTask<TResult> addOnListener(Executor executor, OnFinishListener<TResult> onFinishListener);

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();
}
