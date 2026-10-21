package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncDifferConfig<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Executor f22530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f22531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final DiffUtil.ItemCallback<T> f22532c;

    public static final class Builder<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Object f22533d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static ExecutorService f22534e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Executor f22535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f22536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DiffUtil.ItemCallback<T> f22537c;

        public Builder(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
            this.f22537c = itemCallback;
        }

        @NonNull
        public AsyncDifferConfig<T> build() {
            if (this.f22536b == null) {
                synchronized (f22533d) {
                    try {
                        if (f22534e == null) {
                            f22534e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f22536b = f22534e;
            }
            return new AsyncDifferConfig<>(this.f22535a, this.f22536b, this.f22537c);
        }

        @NonNull
        public Builder<T> setBackgroundThreadExecutor(@Nullable Executor executor) {
            this.f22536b = executor;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder<T> setMainThreadExecutor(@Nullable Executor executor) {
            this.f22535a = executor;
            return this;
        }
    }

    public AsyncDifferConfig(@Nullable Executor executor, @NonNull Executor executor2, @NonNull DiffUtil.ItemCallback<T> itemCallback) {
        this.f22530a = executor;
        this.f22531b = executor2;
        this.f22532c = itemCallback;
    }

    @NonNull
    public Executor getBackgroundThreadExecutor() {
        return this.f22531b;
    }

    @NonNull
    public DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.f22532c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Executor getMainThreadExecutor() {
        return this.f22530a;
    }
}
