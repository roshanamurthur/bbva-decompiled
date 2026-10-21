package com.huawei.hms.feature.dynamicinstall;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public class e implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "FeatureCompatBackgroundThread");
    }
}
