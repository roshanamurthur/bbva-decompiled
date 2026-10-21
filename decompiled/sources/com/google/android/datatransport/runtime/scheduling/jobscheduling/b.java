package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.camera.camera2.internal.compat.u;
import java.util.Set;

/* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends SchedulerConfig.ConfigValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<SchedulerConfig.Flag> f43859c;

    /* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    public static final class a extends SchedulerConfig.ConfigValue.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f43860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f43861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<SchedulerConfig.Flag> f43862c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public final SchedulerConfig.ConfigValue build() {
            String strF = this.f43860a == null ? " delta" : "";
            if (this.f43861b == null) {
                strF = strF.concat(" maxAllowedDelay");
            }
            if (this.f43862c == null) {
                strF = u.f(strF, " flags");
            }
            if (strF.isEmpty()) {
                return new b(this.f43860a.longValue(), this.f43861b.longValue(), this.f43862c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public final SchedulerConfig.ConfigValue.Builder setDelta(long j10) {
            this.f43860a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public final SchedulerConfig.ConfigValue.Builder setFlags(Set<SchedulerConfig.Flag> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f43862c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public final SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j10) {
            this.f43861b = Long.valueOf(j10);
            return this;
        }
    }

    public b(long j10, long j11, Set set) {
        this.f43857a = j10;
        this.f43858b = j11;
        this.f43859c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final long a() {
        return this.f43857a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final Set<SchedulerConfig.Flag> b() {
        return this.f43859c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final long c() {
        return this.f43858b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        return this.f43857a == configValue.a() && this.f43858b == configValue.c() && this.f43859c.equals(configValue.b());
    }

    public final int hashCode() {
        long j10 = this.f43857a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f43858b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f43859c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f43857a + ", maxAllowedDelay=" + this.f43858b + ", flags=" + this.f43859c + "}";
    }
}
