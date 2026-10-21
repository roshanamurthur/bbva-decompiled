package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* JADX INFO: compiled from: AutoValue_SchedulerConfig.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends SchedulerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f43855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Priority, SchedulerConfig.ConfigValue> f43856b;

    public a(Clock clock, Map<Priority, SchedulerConfig.ConfigValue> map) {
        if (clock == null) {
            throw new NullPointerException("Null clock");
        }
        this.f43855a = clock;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f43856b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Clock a() {
        return this.f43855a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.ConfigValue> b() {
        return this.f43856b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f43855a.equals(schedulerConfig.a()) && this.f43856b.equals(schedulerConfig.b());
    }

    public final int hashCode() {
        return ((this.f43855a.hashCode() ^ 1000003) * 1000003) ^ this.f43856b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f43855a + ", values=" + this.f43856b + "}";
    }
}
