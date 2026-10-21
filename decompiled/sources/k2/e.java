package k2;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e<T> implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public Callable<T> f79177p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public Consumer<T> f79178q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public Handler f79179r0;

    /* JADX INFO: compiled from: RequestExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Consumer f79180p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f79181q0;

        public a(Consumer consumer, Object obj) {
            this.f79180p0 = consumer;
            this.f79181q0 = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f79180p0.accept(this.f79181q0);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        T tCall;
        try {
            tCall = this.f79177p0.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.f79179r0.post(new a(this.f79178q0, tCall));
    }
}
