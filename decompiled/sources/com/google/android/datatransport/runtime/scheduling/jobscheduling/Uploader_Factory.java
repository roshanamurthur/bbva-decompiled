package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class Uploader_Factory implements Factory<Uploader> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Context> f43838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<BackendRegistry> f43839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<EventStore> f43840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<WorkScheduler> f43841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<Executor> f43842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<SynchronizationGuard> f43843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider<Clock> f43844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider<Clock> f43845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Provider<ClientHealthMetricsStore> f43846i;

    public Uploader_Factory(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        this.f43838a = provider;
        this.f43839b = provider2;
        this.f43840c = provider3;
        this.f43841d = provider4;
        this.f43842e = provider5;
        this.f43843f = provider6;
        this.f43844g = provider7;
        this.f43845h = provider8;
        this.f43846i = provider9;
    }

    public static Uploader_Factory create(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        return new Uploader_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // javax.inject.Provider
    public Uploader get() {
        return newInstance(this.f43838a.get(), this.f43839b.get(), this.f43840c.get(), this.f43841d.get(), this.f43842e.get(), this.f43843f.get(), this.f43844g.get(), this.f43845h.get(), this.f43846i.get());
    }
}
