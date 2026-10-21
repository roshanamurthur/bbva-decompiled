package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Executor> f43851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<EventStore> f43852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<WorkScheduler> f43853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<SynchronizationGuard> f43854d;

    public WorkInitializer_Factory(Provider<Executor> provider, Provider<EventStore> provider2, Provider<WorkScheduler> provider3, Provider<SynchronizationGuard> provider4) {
        this.f43851a = provider;
        this.f43852b = provider2;
        this.f43853c = provider3;
        this.f43854d = provider4;
    }

    public static WorkInitializer_Factory create(Provider<Executor> provider, Provider<EventStore> provider2, Provider<WorkScheduler> provider3, Provider<SynchronizationGuard> provider4) {
        return new WorkInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // javax.inject.Provider
    public WorkInitializer get() {
        return newInstance(this.f43851a.get(), this.f43852b.get(), this.f43853c.get(), this.f43854d.get());
    }
}
