package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Clock> f43700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Clock> f43701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<Scheduler> f43702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<Uploader> f43703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<WorkInitializer> f43704e;

    public TransportRuntime_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<Scheduler> provider3, Provider<Uploader> provider4, Provider<WorkInitializer> provider5) {
        this.f43700a = provider;
        this.f43701b = provider2;
        this.f43702c = provider3;
        this.f43703d = provider4;
        this.f43704e = provider5;
    }

    public static TransportRuntime_Factory create(Provider<Clock> provider, Provider<Clock> provider2, Provider<Scheduler> provider3, Provider<Uploader> provider4, Provider<WorkInitializer> provider5) {
        return new TransportRuntime_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // javax.inject.Provider
    public TransportRuntime get() {
        return newInstance(this.f43700a.get(), this.f43701b.get(), this.f43702c.get(), this.f43703d.get(), this.f43704e.get());
    }
}
