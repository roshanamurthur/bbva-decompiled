package k2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f79173p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79174q0;

    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class a extends Thread {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f79175p0;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f79175p0 = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f79175p0);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f79173p0, this.f79174q0);
    }
}
