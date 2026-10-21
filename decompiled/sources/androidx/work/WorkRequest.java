package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WorkRequest {
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final UUID f24330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final WorkSpec f24331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Set<String> f24332c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkRequest(@NonNull UUID uuid, @NonNull WorkSpec workSpec, @NonNull Set<String> set) {
        this.f24330a = uuid;
        this.f24331b = workSpec;
        this.f24332c = set;
    }

    @NonNull
    public UUID getId() {
        return this.f24330a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getStringId() {
        return this.f24330a.toString();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<String> getTags() {
        return this.f24332c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkSpec getWorkSpec() {
        return this.f24331b;
    }

    public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WorkSpec f24335c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24333a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashSet f24336d = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f24334b = UUID.randomUUID();

        public Builder(@NonNull Class<? extends ListenableWorker> cls) {
            this.f24335c = new WorkSpec(this.f24334b.toString(), cls.getName());
            addTag(cls.getName());
        }

        @NonNull
        public abstract W a();

        @NonNull
        public final B addTag(@NonNull String str) {
            this.f24336d.add(str);
            return (B) b();
        }

        @NonNull
        public abstract B b();

        @NonNull
        public final W build() {
            W w6 = (W) a();
            Constraints constraints = this.f24335c.constraints;
            boolean z10 = (Build.VERSION.SDK_INT >= 24 && constraints.hasContentUriTriggers()) || constraints.requiresBatteryNotLow() || constraints.requiresCharging() || constraints.requiresDeviceIdle();
            WorkSpec workSpec = this.f24335c;
            if (workSpec.expedited) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (workSpec.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f24334b = UUID.randomUUID();
            WorkSpec workSpec2 = new WorkSpec(this.f24335c);
            this.f24335c = workSpec2;
            workSpec2.id = this.f24334b.toString();
            return w6;
        }

        @NonNull
        public final B keepResultsForAtLeast(long j10, @NonNull TimeUnit timeUnit) {
            this.f24335c.minimumRetentionDuration = timeUnit.toMillis(j10);
            return (B) b();
        }

        @NonNull
        public final B setBackoffCriteria(@NonNull BackoffPolicy backoffPolicy, long j10, @NonNull TimeUnit timeUnit) {
            this.f24333a = true;
            WorkSpec workSpec = this.f24335c;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(timeUnit.toMillis(j10));
            return (B) b();
        }

        @NonNull
        public final B setConstraints(@NonNull Constraints constraints) {
            this.f24335c.constraints = constraints;
            return (B) b();
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(@NonNull OutOfQuotaPolicy outOfQuotaPolicy) {
            WorkSpec workSpec = this.f24335c;
            workSpec.expedited = true;
            workSpec.outOfQuotaPolicy = outOfQuotaPolicy;
            return (B) b();
        }

        @NonNull
        public B setInitialDelay(long j10, @NonNull TimeUnit timeUnit) {
            this.f24335c.initialDelay = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f24335c.initialDelay) {
                return (B) b();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setInitialRunAttemptCount(int i10) {
            this.f24335c.runAttemptCount = i10;
            return (B) b();
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setInitialState(@NonNull WorkInfo.State state) {
            this.f24335c.state = state;
            return (B) b();
        }

        @NonNull
        public final B setInputData(@NonNull Data data) {
            this.f24335c.input = data;
            return (B) b();
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setPeriodStartTime(long j10, @NonNull TimeUnit timeUnit) {
            this.f24335c.periodStartTime = timeUnit.toMillis(j10);
            return (B) b();
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setScheduleRequestedAt(long j10, @NonNull TimeUnit timeUnit) {
            this.f24335c.scheduleRequestedAt = timeUnit.toMillis(j10);
            return (B) b();
        }

        @NonNull
        @RequiresApi(26)
        public final B keepResultsForAtLeast(@NonNull Duration duration) {
            this.f24335c.minimumRetentionDuration = duration.toMillis();
            return (B) b();
        }

        @NonNull
        @RequiresApi(26)
        public final B setBackoffCriteria(@NonNull BackoffPolicy backoffPolicy, @NonNull Duration duration) {
            this.f24333a = true;
            WorkSpec workSpec = this.f24335c;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(duration.toMillis());
            return (B) b();
        }

        @NonNull
        @RequiresApi(26)
        public B setInitialDelay(@NonNull Duration duration) {
            this.f24335c.initialDelay = duration.toMillis();
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f24335c.initialDelay) {
                return (B) b();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }
}
