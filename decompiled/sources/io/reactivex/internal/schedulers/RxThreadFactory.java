package io.reactivex.internal.schedulers;

import ad.d;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f73683p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f73684q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f73685r0;

    public static final class a extends Thread implements NonBlockingThread {
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f73683p0 + '-' + incrementAndGet();
        Thread aVar = this.f73685r0 ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f73684q0);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return d.f(new StringBuilder("RxThreadFactory["), this.f73683p0, Constant.BRACKET_CLOSE);
    }

    public RxThreadFactory(String str, int i10) {
        this(str, i10, false);
    }

    public RxThreadFactory(String str, int i10, boolean z10) {
        this.f73683p0 = str;
        this.f73684q0 = i10;
        this.f73685r0 = z10;
    }
}
