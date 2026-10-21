package okhttp3.internal.connection;

import ad.d;
import androidx.camera.core.impl.v;
import androidx.core.app.NotificationCompat;
import com.bbva.networkplugin.command.impl.PutCommand;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¨\u0006!"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "", "idleConnectionCount", "connectionCount", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "", "Lokhttp3/Route;", "routes", "", "requireMultiplexed", "callAcquirePooledConnection", "Lokhttp3/internal/connection/RealConnection;", "connection", "", PutCommand.ID, "connectionBecameIdle", "evictAll", "", "now", "cleanup", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "maxIdleConnections", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
public final class RealConnectionPool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f85847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TaskQueue f85848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RealConnectionPool$cleanupTask$1 f85849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ConcurrentLinkedQueue<RealConnection> f85850e;

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RealConnectionPool get(@NotNull ConnectionPool connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            return connectionPool.getDelegate();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(@NotNull TaskRunner taskRunner, int i10, long j10, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f85846a = i10;
        this.f85847b = timeUnit.toNanos(j10);
        this.f85848c = taskRunner.newQueue();
        final String strF = d.f(new StringBuilder(), Util.okHttpName, " ConnectionPool");
        this.f85849d = new Task(strF) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return this.f85851e.cleanup(System.nanoTime());
            }
        };
        this.f85850e = new ConcurrentLinkedQueue<>();
        if (j10 <= 0) {
            throw new IllegalArgumentException(v.c("keepAliveDuration <= 0: ", j10).toString());
        }
    }

    public final int a(RealConnection realConnection, long j10) {
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        int i10 = 0;
        while (i10 < calls.size()) {
            Reference<RealCall> reference = calls.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Platform.INSTANCE.get().logCloseableLeak("A connection to " + realConnection.getF85830b().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i10);
                realConnection.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs$okhttp(j10 - this.f85847b);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    public final boolean callAcquirePooledConnection(@NotNull Address address, @NotNull RealCall call, @Nullable List<Route> routes, boolean requireMultiplexed) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        for (RealConnection connection : this.f85850e) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (requireMultiplexed) {
                    try {
                        if (connection.isMultiplexed$okhttp()) {
                            if (connection.isEligible$okhttp(address, routes)) {
                                call.acquireConnectionNoEvents(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (connection.isEligible$okhttp(address, routes)) {
                    call.acquireConnectionNoEvents(connection);
                    return true;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return false;
    }

    public final long cleanup(long now) {
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i11 = 0;
        for (RealConnection connection : this.f85850e) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (a(connection, now) > 0) {
                    i11++;
                } else {
                    i10++;
                    long idleAtNs = now - connection.getIdleAtNs();
                    if (idleAtNs > j10) {
                        realConnection = connection;
                        j10 = idleAtNs;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        long j11 = this.f85847b;
        if (j10 < j11 && i10 <= this.f85846a) {
            if (i10 > 0) {
                return j11 - j10;
            }
            if (i11 > 0) {
                return j11;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(realConnection);
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() + j10 != now) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.f85850e.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            if (this.f85850e.isEmpty()) {
                this.f85848c.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.getNoNewExchanges() && this.f85846a != 0) {
            TaskQueue.schedule$default(this.f85848c, this.f85849d, 0L, 2, null);
            return false;
        }
        connection.setNoNewExchanges(true);
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.f85850e;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            this.f85848c.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.f85850e.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.f85850e.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "connections.iterator()");
        while (it.hasNext()) {
            RealConnection connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (connection.getCalls().isEmpty()) {
                    it.remove();
                    connection.setNoNewExchanges(true);
                    socket = connection.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Util.closeQuietly(socket);
            }
        }
        if (this.f85850e.isEmpty()) {
            this.f85848c.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.f85850e;
        int i10 = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (RealConnection it : concurrentLinkedQueue) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                synchronized (it) {
                    zIsEmpty = it.getCalls().isEmpty();
                }
                if (zIsEmpty && (i10 = i10 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i10;
    }

    public final void put(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(connection)) {
            this.f85850e.add(connection);
            TaskQueue.schedule$default(this.f85848c, this.f85849d, 0L, 2, null);
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
    }
}
