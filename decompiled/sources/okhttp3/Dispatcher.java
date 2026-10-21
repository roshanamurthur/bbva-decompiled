package okhttp3;

import androidx.appcompat.widget.g0;
import androidx.core.app.NotificationCompat;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b.\u00100J\u001b\u0010\b\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u000f\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010!\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R.\u0010-\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u00061"}, d2 = {"Lokhttp3/Dispatcher;", "", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "", "enqueue$okhttp", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "enqueue", "cancelAll", "executed$okhttp", "(Lokhttp3/internal/connection/RealCall;)V", "executed", "finished$okhttp", "finished", "", "Lokhttp3/Call;", "queuedCalls", "runningCalls", "", "queuedCallsCount", "runningCallsCount", "Ljava/util/concurrent/ExecutorService;", "-deprecated_executorService", "()Ljava/util/concurrent/ExecutorService;", "executorService", "maxRequests", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "b", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "c", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "<init>", "()V", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
public final class Dispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int maxRequests;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int maxRequestsPerHost;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Runnable idleCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ExecutorService f85533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<RealCall.AsyncCall> f85534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<RealCall.AsyncCall> f85535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<RealCall> f85536g;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.f85534e = new ArrayDeque<>();
        this.f85535f = new ArrayDeque<>();
        this.f85536g = new ArrayDeque<>();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "executorService", imports = {}))
    @JvmName(name = "-deprecated_executorService")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m6101deprecated_executorService() {
        return executorService();
    }

    public final void a(ArrayDeque arrayDeque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            Unit unit = Unit.INSTANCE;
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final boolean b() {
        int i10;
        boolean z10;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealCall.AsyncCall> it = this.f85534e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = it.next();
                    if (this.f85535f.size() >= this.maxRequests) {
                        break;
                    }
                    if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        asyncCall.getCallsPerHost().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f85535f.add(asyncCall);
                    }
                }
                z10 = runningCallsCount() > 0;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((RealCall.AsyncCall) arrayList.get(i10)).executeOn(executorService());
        }
        return z10;
    }

    public final synchronized void cancelAll() {
        try {
            Iterator<RealCall.AsyncCall> it = this.f85534e.iterator();
            while (it.hasNext()) {
                it.next().getF85826r0().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.f85535f.iterator();
            while (it2.hasNext()) {
                it2.next().getF85826r0().cancel();
            }
            Iterator<RealCall> it3 = this.f85536g.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void enqueue$okhttp(@NotNull RealCall.AsyncCall call) {
        RealCall.AsyncCall next;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f85534e.add(call);
                if (!call.getF85826r0().getForWebSocket()) {
                    String host = call.getHost();
                    Iterator<RealCall.AsyncCall> it = this.f85535f.iterator();
                    do {
                        if (!it.hasNext()) {
                            Iterator<RealCall.AsyncCall> it2 = this.f85534e.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!Intrinsics.areEqual(next.getHost(), host));
                        } else {
                            next = it.next();
                        }
                    } while (!Intrinsics.areEqual(next.getHost(), host));
                    if (next != null) {
                        call.reuseCallsPerHostFrom(next);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b();
    }

    public final synchronized void executed$okhttp(@NotNull RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f85536g.add(call);
    }

    @JvmName(name = "executorService")
    @NotNull
    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            if (this.f85533d == null) {
                this.f85533d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Util.okHttpName + " Dispatcher", false));
            }
            executorService = this.f85533d;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void finished$okhttp(@NotNull RealCall.AsyncCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.getCallsPerHost().decrementAndGet();
        a(this.f85535f, call);
    }

    @Nullable
    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    @NotNull
    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall.AsyncCall> arrayDeque = this.f85534e;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getF85826r0());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.f85534e.size();
    }

    @NotNull
    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall> arrayDeque = this.f85536g;
            ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.f85535f;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque2, 10));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getF85826r0());
            }
            listUnmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.plus((Collection) arrayDeque, (Iterable) arrayList));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.f85535f.size() + this.f85536g.size();
    }

    public final synchronized void setIdleCallback(@Nullable Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(g0.c("max < 1: ", i10).toString());
        }
        synchronized (this) {
            this.maxRequests = i10;
            Unit unit = Unit.INSTANCE;
        }
        b();
    }

    public final void setMaxRequestsPerHost(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(g0.c("max < 1: ", i10).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i10;
            Unit unit = Unit.INSTANCE;
        }
        b();
    }

    public final void finished$okhttp(@NotNull RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a(this.f85536g, call);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(@NotNull ExecutorService executorService) {
        this();
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f85533d = executorService;
    }
}
