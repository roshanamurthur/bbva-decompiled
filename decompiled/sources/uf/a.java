package uf;

import android.os.StrictMode;
import androidx.camera.core.o1;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: CustomThreadFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final ThreadFactory f93795t0 = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicLong f93796p0 = new AtomicLong();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f93797q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f93798r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f93799s0;

    public a(String str, int i10, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f93797q0 = str;
        this.f93798r0 = i10;
        this.f93799s0 = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f93795t0.newThread(new o1(this, runnable, 4));
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f93797q0, Long.valueOf(this.f93796p0.getAndIncrement())));
        return threadNewThread;
    }
}
