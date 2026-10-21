package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public final class TimeModule_EventClockFactory implements Factory<Clock> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeModule_EventClockFactory f43889a = new TimeModule_EventClockFactory();
    }

    public static TimeModule_EventClockFactory create() {
        return a.f43889a;
    }

    public static Clock eventClock() {
        return (Clock) Preconditions.checkNotNull(new WallTimeClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return eventClock();
    }
}
