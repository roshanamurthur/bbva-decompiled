package com.noknok.android.client.utils;

import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseTask<Params> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63428b;

    public BaseTask() {
        this.f63427a = true;
        this.f63428b = false;
    }

    public abstract void doInBackground(Params... paramsArr);

    public BaseTask<Params> execute(Params... paramsArr) {
        this.f63428b = true;
        Executors.newSingleThreadExecutor().submit(new androidx.camera.camera2.interop.a(this, paramsArr, 6));
        return this;
    }

    public BaseTask<Params> executeOnThisThread(Params... paramsArr) {
        if (this.f63427a) {
            ProgressIndicator.getInstance().incCounter();
        }
        try {
            this.f63428b = true;
            doInBackground(paramsArr);
            return this;
        } finally {
            ProgressIndicator.getInstance().decCounter();
            this.f63428b = false;
        }
    }

    public abstract void handleException(RuntimeException runtimeException, Params... paramsArr);

    public boolean isInProgress() {
        return this.f63428b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void a(Object[] objArr) {
        try {
            executeOnThisThread(objArr);
        } catch (RuntimeException e5) {
            Logger.e("BaseTask", "BaseTask failed", e5);
            handleException(e5, objArr);
        }
    }

    public BaseTask(boolean z10) {
        this.f63428b = false;
        this.f63427a = z10;
    }
}
