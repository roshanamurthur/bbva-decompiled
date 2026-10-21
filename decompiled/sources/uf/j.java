package uf;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DelegatingScheduledFuture.java */
/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"RestrictedApi"})
public final class j<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ScheduledFuture<?> f93830w0;

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    public class a implements b<V> {
        public a() {
        }
    }

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    public interface b<T> {
    }

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    public interface c<T> {
        ScheduledFuture a(a aVar);
    }

    public j(c<V> cVar) {
        this.f93830w0 = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void afterDone() {
        this.f93830w0.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f93830w0.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f93830w0.getDelay(timeUnit);
    }
}
