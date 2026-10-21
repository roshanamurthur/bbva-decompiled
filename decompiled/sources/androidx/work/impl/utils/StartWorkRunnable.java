package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StartWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WorkManagerImpl f24632p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f24633q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final WorkerParameters.RuntimeExtras f24634r0;

    public StartWorkRunnable(WorkManagerImpl workManagerImpl, String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        this.f24632p0 = workManagerImpl;
        this.f24633q0 = str;
        this.f24634r0 = runtimeExtras;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24632p0.getProcessor().startWork(this.f24633q0, this.f24634r0);
    }
}
