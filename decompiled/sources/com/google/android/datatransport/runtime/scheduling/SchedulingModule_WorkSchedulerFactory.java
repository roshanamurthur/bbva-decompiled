package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Context> f43813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<EventStore> f43814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<SchedulerConfig> f43815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<Clock> f43816d;

    public SchedulingModule_WorkSchedulerFactory(Provider<Context> provider, Provider<EventStore> provider2, Provider<SchedulerConfig> provider3, Provider<Clock> provider4) {
        this.f43813a = provider;
        this.f43814b = provider2;
        this.f43815c = provider3;
        this.f43816d = provider4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(Provider<Context> provider, Provider<EventStore> provider2, Provider<SchedulerConfig> provider3, Provider<Clock> provider4) {
        return new SchedulingModule_WorkSchedulerFactory(provider, provider2, provider3, provider4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNull(new JobInfoScheduler(context, eventStore, schedulerConfig), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public WorkScheduler get() {
        return workScheduler(this.f43813a.get(), this.f43814b.get(), this.f43815c.get(), this.f43816d.get());
    }
}
