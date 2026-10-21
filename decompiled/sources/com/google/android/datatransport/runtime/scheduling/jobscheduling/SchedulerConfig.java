package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@AutoValue
public abstract class SchedulerConfig {

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Clock f43827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f43828b = new HashMap();

        public Builder addConfig(Priority priority, ConfigValue configValue) {
            this.f43828b.put(priority, configValue);
            return this;
        }

        public SchedulerConfig build() {
            if (this.f43827a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f43828b.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            HashMap map = this.f43828b;
            this.f43828b = new HashMap();
            return new a(this.f43827a, map);
        }

        public Builder setClock(Clock clock) {
            this.f43827a = clock;
            return this;
        }
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j10);

            public abstract Builder setFlags(Set<Flag> set);

            public abstract Builder setMaxAllowedDelay(long j10);
        }

        public static Builder builder() {
            b.a aVar = new b.a();
            aVar.setFlags(Collections.emptySet());
            return aVar;
        }

        public abstract long a();

        public abstract Set<Flag> b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flag {
        private static final /* synthetic */ Flag[] $VALUES;
        public static final Flag DEVICE_CHARGING;
        public static final Flag DEVICE_IDLE;
        public static final Flag NETWORK_UNMETERED;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            NETWORK_UNMETERED = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            DEVICE_IDLE = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            DEVICE_CHARGING = flag3;
            $VALUES = new Flag[]{flag, flag2, flag3};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchedulerConfig getDefault(Clock clock) {
        return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(Collections.unmodifiableSet(new HashSet(Arrays.asList(Flag.DEVICE_IDLE)))).build()).setClock(clock).build();
    }

    public abstract Clock a();

    public abstract Map<Priority, ConfigValue> b();

    @RequiresApi(api = 21)
    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j10, int i10) {
        builder.setMinimumLatency(getScheduleDelay(priority, j10, i10));
        Set<Flag> setB = b().get(priority).b();
        if (setB.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        return builder;
    }

    public Set<Flag> getFlags(Priority priority) {
        return b().get(priority).b();
    }

    public long getScheduleDelay(Priority priority, long j10, int i10) {
        long time = j10 - a().getTime();
        ConfigValue configValue = b().get(priority);
        long jA = configValue.a();
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * jA * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA > 1 ? jA : 2L) * ((long) i11)))), time), configValue.c());
    }
}
