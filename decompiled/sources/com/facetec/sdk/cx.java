package com.facetec.sdk;

import android.os.AsyncTask;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
final class cx extends AsyncTask<Void, Void, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f41073a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f41074c;

    private cx(Runnable runnable) {
        this.f41074c = runnable;
    }

    public static cx b(@NonNull Runnable runnable) {
        cx cxVar = new cx(runnable);
        cxVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        return cxVar;
    }

    public static cx d(@NonNull Runnable runnable) {
        cx cxVar = new cx(runnable);
        cxVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return cxVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Void doInBackground(Void[] voidArr) {
        this.f41074c.run();
        return null;
    }

    public final cx e(Runnable runnable) {
        this.f41073a = runnable;
        return this;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Void r1) {
        super.onPostExecute(r1);
        Runnable runnable = this.f41073a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
