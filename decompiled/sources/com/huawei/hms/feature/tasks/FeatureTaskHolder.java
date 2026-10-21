package com.huawei.hms.feature.tasks;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureTaskHolder<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<TResult> f50554a = new b<>();

    public final FeatureTask<TResult> getTask() {
        return this.f50554a;
    }

    public final boolean notifyFailure(Exception exc) {
        return this.f50554a.a(exc);
    }

    public final boolean notifyResult(TResult tresult) {
        return this.f50554a.a(tresult);
    }
}
