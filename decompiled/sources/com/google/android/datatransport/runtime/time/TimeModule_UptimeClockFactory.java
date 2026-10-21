package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeModule_UptimeClockFactory f43890a = new TimeModule_UptimeClockFactory();
    }

    public static TimeModule_UptimeClockFactory create() {
        return a.f43890a;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNull(new UptimeClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return uptimeClock();
    }
}
