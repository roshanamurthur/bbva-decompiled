package com.huawei.hms.feature.tasks;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureTasks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50555a = "FeatureTasks";

    public static <TResult> FeatureTask<TResult> createFeatureTask(Exception exc) {
        b bVar = new b();
        bVar.a(exc);
        return bVar;
    }

    public static <TResult> FeatureTask<TResult> createFeatureTask(TResult tresult) {
        b bVar = new b();
        bVar.a(tresult);
        return bVar;
    }
}
