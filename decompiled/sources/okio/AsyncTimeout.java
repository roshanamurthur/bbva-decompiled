package okio;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ'\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "", "enter", "", HearingDisabilitiesConstants.EXIT_VIDEO_CALL, "timedOut", "Lokio/Sink;", "sink", "Lokio/Source;", "source", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "newTimeoutException", "<init>", "()V", "Companion", "a", "okio"}, k = 1, mv = {1, 9, 0})
public class AsyncTimeout extends Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f86323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Condition f86324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f86325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f86326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static AsyncTimeout f86327k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AsyncTimeout f86329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f86330f;

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "Lokio/AsyncTimeout;", "awaitTimeout$okio", "()Lokio/AsyncTimeout;", "awaitTimeout", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", LandingAEMContentMapper.CONDITION, "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", TransactionType.TRANSACTION_TYPE_DRSP_CODE, HeadCommand.ID, "Lokio/AsyncTimeout;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean access$cancelScheduledTimeout(Companion companion, AsyncTimeout asyncTimeout) {
            companion.getClass();
            ReentrantLock lock = AsyncTimeout.INSTANCE.getLock();
            lock.lock();
            try {
                if (!asyncTimeout.f86328d) {
                    return false;
                }
                asyncTimeout.f86328d = false;
                for (AsyncTimeout asyncTimeout2 = AsyncTimeout.f86327k; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.f86329e) {
                    if (asyncTimeout2.f86329e == asyncTimeout) {
                        asyncTimeout2.f86329e = asyncTimeout.f86329e;
                        asyncTimeout.f86329e = null;
                        return false;
                    }
                }
                return true;
            } finally {
                lock.unlock();
            }
        }

        public static final void access$scheduleTimeout(Companion companion, AsyncTimeout asyncTimeout, long j10, boolean z10) {
            companion.getClass();
            ReentrantLock lock = AsyncTimeout.INSTANCE.getLock();
            lock.lock();
            try {
                if (!(!asyncTimeout.f86328d)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                asyncTimeout.f86328d = true;
                if (AsyncTimeout.f86327k == null) {
                    AsyncTimeout.f86327k = new AsyncTimeout();
                    a aVar = new a("Okio Watchdog");
                    aVar.setDaemon(true);
                    aVar.start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    asyncTimeout.f86330f = Math.min(j10, asyncTimeout.deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    asyncTimeout.f86330f = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    asyncTimeout.f86330f = asyncTimeout.deadlineNanoTime();
                }
                long jAccess$remainingNanos = AsyncTimeout.access$remainingNanos(asyncTimeout, jNanoTime);
                AsyncTimeout asyncTimeout2 = AsyncTimeout.f86327k;
                Intrinsics.checkNotNull(asyncTimeout2);
                while (asyncTimeout2.f86329e != null) {
                    AsyncTimeout asyncTimeout3 = asyncTimeout2.f86329e;
                    Intrinsics.checkNotNull(asyncTimeout3);
                    if (jAccess$remainingNanos < AsyncTimeout.access$remainingNanos(asyncTimeout3, jNanoTime)) {
                        break;
                    }
                    asyncTimeout2 = asyncTimeout2.f86329e;
                    Intrinsics.checkNotNull(asyncTimeout2);
                }
                asyncTimeout.f86329e = asyncTimeout2.f86329e;
                asyncTimeout2.f86329e = asyncTimeout;
                if (asyncTimeout2 == AsyncTimeout.f86327k) {
                    AsyncTimeout.INSTANCE.getCondition().signal();
                }
                Unit unit = Unit.INSTANCE;
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        @Nullable
        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.f86327k;
            Intrinsics.checkNotNull(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.f86329e;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                getCondition().await(AsyncTimeout.f86325i, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.f86327k;
                Intrinsics.checkNotNull(asyncTimeout3);
                if (asyncTimeout3.f86329e != null || System.nanoTime() - jNanoTime < AsyncTimeout.f86326j) {
                    return null;
                }
                return AsyncTimeout.f86327k;
            }
            long jAccess$remainingNanos = AsyncTimeout.access$remainingNanos(asyncTimeout2, System.nanoTime());
            if (jAccess$remainingNanos > 0) {
                getCondition().await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.f86327k;
            Intrinsics.checkNotNull(asyncTimeout4);
            asyncTimeout4.f86329e = asyncTimeout2.f86329e;
            asyncTimeout2.f86329e = null;
            return asyncTimeout2;
        }

        @NotNull
        public final Condition getCondition() {
            return AsyncTimeout.f86324h;
        }

        @NotNull
        public final ReentrantLock getLock() {
            return AsyncTimeout.f86323g;
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    public static final class a extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    Companion companion = AsyncTimeout.INSTANCE;
                    ReentrantLock lock = companion.getLock();
                    lock.lock();
                    try {
                        AsyncTimeout asyncTimeoutAwaitTimeout$okio = companion.awaitTimeout$okio();
                        if (asyncTimeoutAwaitTimeout$okio == AsyncTimeout.f86327k) {
                            AsyncTimeout.f86327k = null;
                            lock.unlock();
                            return;
                        } else {
                            Unit unit = Unit.INSTANCE;
                            lock.unlock();
                            if (asyncTimeoutAwaitTimeout$okio != null) {
                                asyncTimeoutAwaitTimeout$okio.timedOut();
                            }
                        }
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f86323g = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        f86324h = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f86325i = millis;
        f86326j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(AsyncTimeout asyncTimeout, long j10) {
        return asyncTimeout.f86330f - j10;
    }

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException cause) {
        return newTimeoutException(cause);
    }

    public final void enter() {
        long f86440c = getF86440c();
        boolean f86438a = getF86438a();
        if (f86440c != 0 || f86438a) {
            Companion.access$scheduleTimeout(INSTANCE, this, f86440c, f86438a);
        }
    }

    public final boolean exit() {
        return Companion.access$cancelScheduledTimeout(INSTANCE, this);
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                Sink sink2 = sink;
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.close();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e5) {
                        if (!asyncTimeout.exit()) {
                            throw e5;
                        }
                        throw asyncTimeout.access$newTimeoutException(e5);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                Sink sink2 = sink;
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.flush();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e5) {
                        if (!asyncTimeout.exit()) {
                            throw e5;
                        }
                        throw asyncTimeout.access$newTimeoutException(e5);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.sink(" + sink + RootService.CLOSE_BRACKET;
            }

            @Override // okio.Sink
            public void write(@NotNull Buffer source, long byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
                while (true) {
                    long j10 = 0;
                    if (byteCount <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    Intrinsics.checkNotNull(segment);
                    while (j10 < SvgConstantsKt.SPECIFIED_FONT_STYLE) {
                        j10 += (long) (segment.limit - segment.pos);
                        if (j10 >= byteCount) {
                            j10 = byteCount;
                            break;
                        } else {
                            segment = segment.next;
                            Intrinsics.checkNotNull(segment);
                        }
                    }
                    Sink sink2 = sink;
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    asyncTimeout.enter();
                    try {
                        try {
                            sink2.write(source, j10);
                            Unit unit = Unit.INSTANCE;
                            if (asyncTimeout.exit()) {
                                throw asyncTimeout.access$newTimeoutException(null);
                            }
                            byteCount -= j10;
                        } catch (IOException e5) {
                            if (!asyncTimeout.exit()) {
                                throw e5;
                            }
                            throw asyncTimeout.access$newTimeoutException(e5);
                        }
                    } catch (Throwable th2) {
                        asyncTimeout.exit();
                        throw th2;
                    }
                }
            }

            @Override // okio.Sink
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public AsyncTimeout getF86331p0() {
                return AsyncTimeout.this;
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new Source() { // from class: okio.AsyncTimeout.source.1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                Source source2 = source;
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        source2.close();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e5) {
                        if (!asyncTimeout.exit()) {
                            throw e5;
                        }
                        throw asyncTimeout.access$newTimeoutException(e5);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source source2 = source;
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        long j10 = source2.read(sink, byteCount);
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        return j10;
                    } catch (IOException e5) {
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(e5);
                        }
                        throw e5;
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.source(" + source + RootService.CLOSE_BRACKET;
            }

            @Override // okio.Source
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public AsyncTimeout getF86333p0() {
                return AsyncTimeout.this;
            }
        };
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                InlineMarker.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (IOException e5) {
                if (exit()) {
                    throw access$newTimeoutException(e5);
                }
                throw e5;
            }
        } catch (Throwable th2) {
            InlineMarker.finallyStart(1);
            exit();
            InlineMarker.finallyEnd(1);
            throw th2;
        }
    }

    public void timedOut() {
    }
}
