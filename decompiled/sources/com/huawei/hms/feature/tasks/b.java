package com.huawei.hms.feature.tasks;

import com.huawei.hms.feature.tasks.listener.OnFinishListener;
import com.huawei.hms.feature.utils.Logger;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class b<TResult> extends FeatureTask<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50558a = "FeatureTaskImpl";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f50559b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f50560c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f50561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TResult f50562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f50563f;

    private void a() {
        synchronized (this.f50559b) {
            try {
                if (this.f50561d) {
                    this.f50560c.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.feature.tasks.FeatureTask
    public final FeatureTask<TResult> addOnListener(OnFinishListener<TResult> onFinishListener) {
        Logger.d(f50558a, "addOnSuccessListener singleThread");
        return addOnListener(a.f50556a, onFinishListener);
    }

    @Override // com.huawei.hms.feature.tasks.FeatureTask
    public final Exception getException() {
        Exception exc;
        synchronized (this.f50559b) {
            exc = this.f50563f;
        }
        return exc;
    }

    @Override // com.huawei.hms.feature.tasks.FeatureTask
    public final TResult getResult() throws IllegalStateException {
        TResult tresult;
        synchronized (this.f50559b) {
            try {
                if (!this.f50561d) {
                    throw new IllegalStateException("FeatureTask is not yet complete");
                }
                if (this.f50563f != null) {
                    throw new IllegalStateException("FeatureTask encounter error ,msg :" + this.f50563f.getMessage());
                }
                tresult = this.f50562e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.huawei.hms.feature.tasks.FeatureTask
    public final boolean isComplete() {
        boolean z10;
        synchronized (this.f50559b) {
            z10 = this.f50561d;
        }
        return z10;
    }

    @Override // com.huawei.hms.feature.tasks.FeatureTask
    public final boolean isSuccessful() {
        boolean z10;
        synchronized (this.f50559b) {
            try {
                z10 = this.f50561d && this.f50563f == null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final boolean a(Exception exc) {
        if (exc == null) {
            throw new IllegalArgumentException("Exception must not be null");
        }
        synchronized (this.f50559b) {
            try {
                if (this.f50561d) {
                    return false;
                }
                this.f50561d = true;
                this.f50563f = exc;
                this.f50560c.a();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.feature.tasks.FeatureTask
    public FeatureTask<TResult> addOnListener(Executor executor, OnFinishListener<TResult> onFinishListener) {
        onFinishListener.setTask(this);
        this.f50560c.a(new com.huawei.hms.feature.tasks.listener.a(executor, onFinishListener));
        a();
        return this;
    }

    public final boolean a(TResult tresult) {
        Logger.d(f50558a, "notifyResult result " + tresult);
        synchronized (this.f50559b) {
            try {
                if (this.f50561d) {
                    return false;
                }
                this.f50561d = true;
                this.f50562e = tresult;
                this.f50560c.a();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
