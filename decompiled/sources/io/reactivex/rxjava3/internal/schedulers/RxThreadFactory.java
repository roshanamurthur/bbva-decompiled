package io.reactivex.rxjava3.internal.schedulers;

import ad.d;
import io.reactivex.rxjava3.annotations.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f77973p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f77974q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f77975r0;

    public static final class a extends Thread implements NonBlockingThread {
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@NonNull Runnable runnable) {
        String str = this.f77973p0 + '-' + incrementAndGet();
        Thread aVar = this.f77975r0 ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f77974q0);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return d.f(new StringBuilder("RxThreadFactory["), this.f77973p0, Constant.BRACKET_CLOSE);
    }

    public RxThreadFactory(String str, int i10) {
        this(str, i10, false);
    }

    public RxThreadFactory(String str, int i10, boolean z10) {
        this.f77973p0 = str;
        this.f77974q0 = i10;
        this.f77975r0 = z10;
    }
}
