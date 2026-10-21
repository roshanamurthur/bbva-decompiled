package m3;

import androidx.camera.core.impl.utils.c;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Configuration.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicInteger f83346p0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f83347q0;

    public a(boolean z10) {
        this.f83347q0 = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbD = c.d(this.f83347q0 ? "WM.task-" : "androidx.work-");
        sbD.append(this.f83346p0.incrementAndGet());
        return new Thread(runnable, sbD.toString());
    }
}
