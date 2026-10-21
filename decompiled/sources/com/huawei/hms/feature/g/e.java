package com.huawei.hms.feature.g;

import com.huawei.hms.feature.tasks.FeatureTaskHolder;
import com.huawei.hms.feature.utils.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FeatureTaskHolder<?> f50333a;

    public e() {
        this.f50333a = null;
    }

    public abstract void a();

    public final FeatureTaskHolder<?> b() {
        return this.f50333a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Exception e5) {
            Logger.w("MarketRequestExcutor", "error encounter", e5);
            if (this.f50333a != null) {
                this.f50333a.notifyFailure(e5);
            }
        }
    }

    public e(FeatureTaskHolder<?> featureTaskHolder) {
        this.f50333a = featureTaskHolder;
    }
}
