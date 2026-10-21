package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public static final class Completer<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f18509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b<T> f18510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ResolvableFuture<Void> f18511c = ResolvableFuture.create();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18512d;

        public void addCancellationListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            ResolvableFuture<Void> resolvableFuture = this.f18511c;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        public void finalize() {
            ResolvableFuture<Void> resolvableFuture;
            b<T> bVar = this.f18510b;
            if (bVar != null) {
                b.a aVar = bVar.f18514q0;
                if (!aVar.isDone()) {
                    aVar.setException(new a("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f18509a));
                }
            }
            if (this.f18512d || (resolvableFuture = this.f18511c) == null) {
                return;
            }
            resolvableFuture.set(null);
        }

        public boolean set(T t10) {
            this.f18512d = true;
            b<T> bVar = this.f18510b;
            boolean z10 = bVar != null && bVar.f18514q0.set(t10);
            if (z10) {
                this.f18509a = null;
                this.f18510b = null;
                this.f18511c = null;
            }
            return z10;
        }

        public boolean setCancelled() {
            this.f18512d = true;
            b<T> bVar = this.f18510b;
            boolean z10 = bVar != null && bVar.f18514q0.cancel(true);
            if (z10) {
                this.f18509a = null;
                this.f18510b = null;
                this.f18511c = null;
            }
            return z10;
        }

        public boolean setException(@NonNull Throwable th2) {
            this.f18512d = true;
            b<T> bVar = this.f18510b;
            boolean z10 = bVar != null && bVar.f18514q0.setException(th2);
            if (z10) {
                this.f18509a = null;
                this.f18510b = null;
                this.f18511c = null;
            }
            return z10;
        }
    }

    public interface Resolver<T> {
        @Nullable
        Object attachCompleter(@NonNull Completer<T> completer) throws Exception;
    }

    public static final class a extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final class b<T> implements ListenableFuture<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final WeakReference<Completer<T>> f18513p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final a f18514q0 = new a();

        public class a extends AbstractResolvableFuture<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public final String pendingToString() {
                Completer<T> completer = b.this.f18513p0.get();
                return completer == null ? "Completer object has been garbage collected, future will fail soon" : androidx.camera.core.impl.a.e(new StringBuilder("tag=["), completer.f18509a, Constant.BRACKET_CLOSE);
            }
        }

        public b(Completer<T> completer) {
            this.f18513p0 = new WeakReference<>(completer);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f18514q0.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            Completer<T> completer = this.f18513p0.get();
            boolean zCancel = this.f18514q0.cancel(z10);
            if (zCancel && completer != null) {
                completer.f18509a = null;
                completer.f18510b = null;
                completer.f18511c.set(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() throws ExecutionException, InterruptedException {
            return this.f18514q0.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f18514q0.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f18514q0.isDone();
        }

        public final String toString() {
            return this.f18514q0.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f18514q0.get(j10, timeUnit);
        }
    }

    @NonNull
    public static <T> ListenableFuture<T> getFuture(@NonNull Resolver<T> resolver) {
        Completer<T> completer = new Completer<>();
        b<T> bVar = new b<>(completer);
        completer.f18510b = bVar;
        completer.f18509a = resolver.getClass();
        try {
            Object objAttachCompleter = resolver.attachCompleter(completer);
            if (objAttachCompleter != null) {
                completer.f18509a = objAttachCompleter;
            }
        } catch (Exception e5) {
            bVar.f18514q0.setException(e5);
        }
        return bVar;
    }
}
