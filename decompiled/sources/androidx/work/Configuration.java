package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import m3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Configuration {

    @SuppressLint({"MinMaxConstant"})
    public static final int MIN_SCHEDULER_LIMIT = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Executor f24237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f24238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final WorkerFactory f24239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final InputMergerFactory f24240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RunnableScheduler f24241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final InitializationExceptionHandler f24242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f24243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f24248l;

    public interface Provider {
        @NonNull
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(@NonNull Builder builder) {
        Executor executor = builder.f24249a;
        if (executor == null) {
            this.f24237a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));
        } else {
            this.f24237a = executor;
        }
        Executor executor2 = builder.f24252d;
        if (executor2 == null) {
            this.f24248l = true;
            this.f24238b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));
        } else {
            this.f24248l = false;
            this.f24238b = executor2;
        }
        WorkerFactory workerFactory = builder.f24250b;
        if (workerFactory == null) {
            this.f24239c = WorkerFactory.getDefaultWorkerFactory();
        } else {
            this.f24239c = workerFactory;
        }
        InputMergerFactory inputMergerFactory = builder.f24251c;
        if (inputMergerFactory == null) {
            this.f24240d = InputMergerFactory.getDefaultInputMergerFactory();
        } else {
            this.f24240d = inputMergerFactory;
        }
        RunnableScheduler runnableScheduler = builder.f24253e;
        if (runnableScheduler == null) {
            this.f24241e = new DefaultRunnableScheduler();
        } else {
            this.f24241e = runnableScheduler;
        }
        this.f24244h = builder.f24256h;
        this.f24245i = builder.f24257i;
        this.f24246j = builder.f24258j;
        this.f24247k = builder.f24259k;
        this.f24242f = builder.f24254f;
        this.f24243g = builder.f24255g;
    }

    @Nullable
    public String getDefaultProcessName() {
        return this.f24243g;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public InitializationExceptionHandler getExceptionHandler() {
        return this.f24242f;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f24237a;
    }

    @NonNull
    public InputMergerFactory getInputMergerFactory() {
        return this.f24240d;
    }

    public int getMaxJobSchedulerId() {
        return this.f24246j;
    }

    @IntRange(from = 20, to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxSchedulerLimit() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f24247k;
        return i10 == 23 ? i11 / 2 : i11;
    }

    public int getMinJobSchedulerId() {
        return this.f24245i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMinimumLoggingLevel() {
        return this.f24244h;
    }

    @NonNull
    public RunnableScheduler getRunnableScheduler() {
        return this.f24241e;
    }

    @NonNull
    public Executor getTaskExecutor() {
        return this.f24238b;
    }

    @NonNull
    public WorkerFactory getWorkerFactory() {
        return this.f24239c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUsingDefaultTaskExecutor() {
        return this.f24248l;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Executor f24249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WorkerFactory f24250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InputMergerFactory f24251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Executor f24252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public RunnableScheduler f24253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public InitializationExceptionHandler f24254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f24255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f24256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f24257i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f24258j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f24259k;

        public Builder() {
            this.f24256h = 4;
            this.f24257i = 0;
            this.f24258j = Integer.MAX_VALUE;
            this.f24259k = 20;
        }

        @NonNull
        public Configuration build() {
            return new Configuration(this);
        }

        @NonNull
        public Builder setDefaultProcessName(@NonNull String str) {
            this.f24255g = str;
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.f24249a = executor;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setInitializationExceptionHandler(@NonNull InitializationExceptionHandler initializationExceptionHandler) {
            this.f24254f = initializationExceptionHandler;
            return this;
        }

        @NonNull
        public Builder setInputMergerFactory(@NonNull InputMergerFactory inputMergerFactory) {
            this.f24251c = inputMergerFactory;
            return this;
        }

        @NonNull
        public Builder setJobSchedulerJobIdRange(int i10, int i11) {
            if (i11 - i10 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.f24257i = i10;
            this.f24258j = i11;
            return this;
        }

        @NonNull
        public Builder setMaxSchedulerLimit(int i10) {
            if (i10 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.f24259k = Math.min(i10, 50);
            return this;
        }

        @NonNull
        public Builder setMinimumLoggingLevel(int i10) {
            this.f24256h = i10;
            return this;
        }

        @NonNull
        public Builder setRunnableScheduler(@NonNull RunnableScheduler runnableScheduler) {
            this.f24253e = runnableScheduler;
            return this;
        }

        @NonNull
        public Builder setTaskExecutor(@NonNull Executor executor) {
            this.f24252d = executor;
            return this;
        }

        @NonNull
        public Builder setWorkerFactory(@NonNull WorkerFactory workerFactory) {
            this.f24250b = workerFactory;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NonNull Configuration configuration) {
            this.f24249a = configuration.f24237a;
            this.f24250b = configuration.f24239c;
            this.f24251c = configuration.f24240d;
            this.f24252d = configuration.f24238b;
            this.f24256h = configuration.f24244h;
            this.f24257i = configuration.f24245i;
            this.f24258j = configuration.f24246j;
            this.f24259k = configuration.f24247k;
            this.f24253e = configuration.f24241e;
            this.f24254f = configuration.f24242f;
            this.f24255g = configuration.f24243g;
        }
    }
}
