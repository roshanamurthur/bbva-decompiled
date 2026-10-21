package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Executor> f43807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<BackendRegistry> f43808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<WorkScheduler> f43809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<EventStore> f43810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<SynchronizationGuard> f43811e;

    public DefaultScheduler_Factory(Provider<Executor> provider, Provider<BackendRegistry> provider2, Provider<WorkScheduler> provider3, Provider<EventStore> provider4, Provider<SynchronizationGuard> provider5) {
        this.f43807a = provider;
        this.f43808b = provider2;
        this.f43809c = provider3;
        this.f43810d = provider4;
        this.f43811e = provider5;
    }

    public static DefaultScheduler_Factory create(Provider<Executor> provider, Provider<BackendRegistry> provider2, Provider<WorkScheduler> provider3, Provider<EventStore> provider4, Provider<SynchronizationGuard> provider5) {
        return new DefaultScheduler_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // javax.inject.Provider
    public DefaultScheduler get() {
        return newInstance(this.f43807a.get(), this.f43808b.get(), this.f43809c.get(), this.f43810d.get(), this.f43811e.get());
    }
}
