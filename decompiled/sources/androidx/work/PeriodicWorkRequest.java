package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class PeriodicWorkRequest extends WorkRequest {

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        public Builder(@NonNull Class<? extends ListenableWorker> cls, long j10, @NonNull TimeUnit timeUnit) {
            super(cls);
            this.f24335c.setPeriodic(timeUnit.toMillis(j10));
        }

        @Override // androidx.work.WorkRequest.Builder
        @NonNull
        public final WorkRequest a() {
            if (this.f24333a && this.f24335c.constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            WorkSpec workSpec = this.f24335c;
            if (workSpec.expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new PeriodicWorkRequest(this.f24334b, workSpec, this.f24336d);
        }

        @RequiresApi(26)
        public Builder(@NonNull Class<? extends ListenableWorker> cls, @NonNull Duration duration) {
            super(cls);
            this.f24335c.setPeriodic(duration.toMillis());
        }

        public Builder(@NonNull Class<? extends ListenableWorker> cls, long j10, @NonNull TimeUnit timeUnit, long j11, @NonNull TimeUnit timeUnit2) {
            super(cls);
            this.f24335c.setPeriodic(timeUnit.toMillis(j10), timeUnit2.toMillis(j11));
        }

        @RequiresApi(26)
        public Builder(@NonNull Class<? extends ListenableWorker> cls, @NonNull Duration duration, @NonNull Duration duration2) {
            super(cls);
            this.f24335c.setPeriodic(duration.toMillis(), duration2.toMillis());
        }

        @Override // androidx.work.WorkRequest.Builder
        @NonNull
        public final WorkRequest.Builder b() {
            return this;
        }
    }
}
