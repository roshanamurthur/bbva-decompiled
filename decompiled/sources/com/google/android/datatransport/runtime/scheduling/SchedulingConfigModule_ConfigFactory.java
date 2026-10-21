package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Clock> f43812a;

    public SchedulingConfigModule_ConfigFactory(Provider<Clock> provider) {
        this.f43812a = provider;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulerConfig.getDefault(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(Provider<Clock> provider) {
        return new SchedulingConfigModule_ConfigFactory(provider);
    }

    @Override // javax.inject.Provider
    public SchedulerConfig get() {
        return config(this.f43812a.get());
    }
}
