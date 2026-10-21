package okio;

import androidx.camera.core.impl.v;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Pipe.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b>\u0010?J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010(\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR$\u0010.\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b\u0003\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\b8G¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u000b\u0010\n¨\u0006@"}, d2 = {"Lokio/Pipe;", "", "Lokio/Sink;", "sink", "", "fold", "-deprecated_sink", "()Lokio/Sink;", "Lokio/Source;", "-deprecated_source", "()Lokio/Source;", "source", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "", "a", "J", "getMaxBufferSize$okio", "()J", "maxBufferSize", "Lokio/Buffer;", "b", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "buffer", "", "c", "Z", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "canceled", "d", "getSinkClosed$okio", "setSinkClosed$okio", "sinkClosed", "e", "getSourceClosed$okio", "setSourceClosed$okio", "sourceClosed", "f", "Lokio/Sink;", "getFoldedSink$okio", "setFoldedSink$okio", "(Lokio/Sink;)V", "foldedSink", "Ljava/util/concurrent/locks/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "h", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", LandingAEMContentMapper.CONDITION, "i", "j", "Lokio/Source;", "<init>", "(J)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n268#3,26:259\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n217#1:259,26\n*E\n"})
public final class Pipe {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long maxBufferSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Buffer buffer = new Buffer();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean canceled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean sinkClosed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean sourceClosed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Sink foldedSink;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Condition condition;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final AnonymousClass1 f86416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C07791 f86417j;

    /* JADX WARN: Type inference failed for: r3v3, types: [okio.Pipe$sink$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [okio.Pipe$source$1] */
    public Pipe(long j10) {
        this.maxBufferSize = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
        if (j10 < 1) {
            throw new IllegalArgumentException(v.c("maxBufferSize < 1: ", j10).toString());
        }
        this.f86416i = new Sink() { // from class: okio.Pipe.sink.1

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NotNull
            public final Timeout f86418p0 = new Timeout();

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                boolean f86438a;
                Pipe pipe = Pipe.this;
                ReentrantLock lock = pipe.getLock();
                lock.lock();
                try {
                    if (pipe.getSinkClosed()) {
                        lock.unlock();
                        return;
                    }
                    Sink foldedSink = pipe.getFoldedSink();
                    if (foldedSink == null) {
                        if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getCondition().signalAll();
                        foldedSink = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    if (foldedSink != null) {
                        Timeout f86418p0 = foldedSink.getF86418p0();
                        Timeout f86418p1 = pipe.sink().getF86418p0();
                        long f86440c = f86418p0.getF86440c();
                        f86418p0.timeout(Timeout.INSTANCE.minTimeout(f86418p1.getF86440c(), f86418p0.getF86440c()), TimeUnit.NANOSECONDS);
                        if (!f86418p0.getF86438a()) {
                            if (f86418p1.getF86438a()) {
                                f86418p0.deadlineNanoTime(f86418p1.deadlineNanoTime());
                            }
                            try {
                                foldedSink.close();
                                if (f86438a) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                f86418p0.timeout(f86440c, TimeUnit.NANOSECONDS);
                                if (f86418p1.getF86438a()) {
                                    f86418p0.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = f86418p0.deadlineNanoTime();
                        if (f86418p1.getF86438a()) {
                            f86418p0.deadlineNanoTime(Math.min(f86418p0.deadlineNanoTime(), f86418p1.deadlineNanoTime()));
                        }
                        try {
                            foldedSink.close();
                        } finally {
                            f86418p0.timeout(f86440c, TimeUnit.NANOSECONDS);
                            if (f86418p1.getF86438a()) {
                                f86418p0.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                boolean f86438a;
                Pipe pipe = Pipe.this;
                ReentrantLock lock = pipe.getLock();
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new IOException("canceled");
                    }
                    Sink foldedSink = pipe.getFoldedSink();
                    if (foldedSink == null) {
                        if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        foldedSink = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    if (foldedSink != null) {
                        Timeout f86418p0 = foldedSink.getF86418p0();
                        Timeout f86418p1 = pipe.sink().getF86418p0();
                        long f86440c = f86418p0.getF86440c();
                        f86418p0.timeout(Timeout.INSTANCE.minTimeout(f86418p1.getF86440c(), f86418p0.getF86440c()), TimeUnit.NANOSECONDS);
                        if (!f86418p0.getF86438a()) {
                            if (f86418p1.getF86438a()) {
                                f86418p0.deadlineNanoTime(f86418p1.deadlineNanoTime());
                            }
                            try {
                                foldedSink.flush();
                                if (f86438a) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                f86418p0.timeout(f86440c, TimeUnit.NANOSECONDS);
                                if (f86418p1.getF86438a()) {
                                    f86418p0.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = f86418p0.deadlineNanoTime();
                        if (f86418p1.getF86438a()) {
                            f86418p0.deadlineNanoTime(Math.min(f86418p0.deadlineNanoTime(), f86418p1.deadlineNanoTime()));
                        }
                        try {
                            foldedSink.flush();
                        } finally {
                            f86418p0.timeout(f86440c, TimeUnit.NANOSECONDS);
                            if (f86418p1.getF86438a()) {
                                f86418p0.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }

            @Override // okio.Sink
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public Timeout getF86418p0() {
                return this.f86418p0;
            }

            @Override // okio.Sink
            public void write(@NotNull Buffer source, long byteCount) {
                Sink foldedSink;
                boolean f86438a;
                Intrinsics.checkNotNullParameter(source, "source");
                Pipe pipe = Pipe.this;
                ReentrantLock lock = pipe.getLock();
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new IOException("canceled");
                    }
                    while (true) {
                        if (byteCount <= 0) {
                            foldedSink = null;
                            break;
                        }
                        foldedSink = pipe.getFoldedSink();
                        if (foldedSink != null) {
                            break;
                        }
                        if (pipe.getSourceClosed()) {
                            throw new IOException("source is closed");
                        }
                        long maxBufferSize = pipe.getMaxBufferSize() - pipe.getBuffer().size();
                        if (maxBufferSize == 0) {
                            this.f86418p0.awaitSignal(pipe.getCondition());
                            if (pipe.getCanceled()) {
                                throw new IOException("canceled");
                            }
                        } else {
                            long jMin = Math.min(maxBufferSize, byteCount);
                            pipe.getBuffer().write(source, jMin);
                            byteCount -= jMin;
                            pipe.getCondition().signalAll();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    if (foldedSink != null) {
                        Timeout f86418p0 = foldedSink.getF86418p0();
                        Timeout f86418p1 = pipe.sink().getF86418p0();
                        long f86440c = f86418p0.getF86440c();
                        f86418p0.timeout(Timeout.INSTANCE.minTimeout(f86418p1.getF86440c(), f86418p0.getF86440c()), TimeUnit.NANOSECONDS);
                        if (!f86418p0.getF86438a()) {
                            if (f86418p1.getF86438a()) {
                                f86418p0.deadlineNanoTime(f86418p1.deadlineNanoTime());
                            }
                            try {
                                foldedSink.write(source, byteCount);
                                if (f86438a) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                f86418p0.timeout(f86440c, TimeUnit.NANOSECONDS);
                                if (f86418p1.getF86438a()) {
                                    f86418p0.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = f86418p0.deadlineNanoTime();
                        if (f86418p1.getF86438a()) {
                            f86418p0.deadlineNanoTime(Math.min(f86418p0.deadlineNanoTime(), f86418p1.deadlineNanoTime()));
                        }
                        try {
                            foldedSink.write(source, byteCount);
                        } finally {
                            f86418p0.timeout(f86440c, TimeUnit.NANOSECONDS);
                            if (f86418p1.getF86438a()) {
                                f86418p0.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }
        };
        this.f86417j = new Source() { // from class: okio.Pipe.source.1

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NotNull
            public final Timeout f86420p0 = new Timeout();

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Pipe pipe = Pipe.this;
                ReentrantLock lock = pipe.getLock();
                lock.lock();
                try {
                    pipe.setSourceClosed$okio(true);
                    pipe.getCondition().signalAll();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long byteCount) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Pipe pipe = Pipe.this;
                ReentrantLock lock = pipe.getLock();
                lock.lock();
                try {
                    if (!(!pipe.getSourceClosed())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new IOException("canceled");
                    }
                    while (pipe.getBuffer().size() == 0) {
                        if (pipe.getSinkClosed()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.f86420p0.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled()) {
                            throw new IOException("canceled");
                        }
                    }
                    long j11 = pipe.getBuffer().read(sink, byteCount);
                    pipe.getCondition().signalAll();
                    lock.unlock();
                    return j11;
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }

            @Override // okio.Source
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public Timeout getF86420p0() {
                return this.f86420p0;
            }
        };
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    @JvmName(name = "-deprecated_sink")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final Sink m6222deprecated_sink() {
        return this.f86416i;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "source", imports = {}))
    @JvmName(name = "-deprecated_source")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final Source m6223deprecated_source() {
        return this.f86417j;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(@NotNull Sink sink) throws IOException {
        Condition condition = this.condition;
        Buffer buffer = this.buffer;
        Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                }
                if (buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    reentrantLock.unlock();
                    return;
                }
                boolean z10 = this.sinkClosed;
                Buffer buffer2 = new Buffer();
                buffer2.write(buffer, buffer.size());
                condition.signalAll();
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                try {
                    sink.write(buffer2, buffer2.size());
                    if (z10) {
                        sink.close();
                    } else {
                        sink.flush();
                    }
                } catch (Throwable th2) {
                    reentrantLock.lock();
                    try {
                        this.sourceClosed = true;
                        condition.signalAll();
                        Unit unit2 = Unit.INSTANCE;
                        throw th2;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getBuffer$okio, reason: from getter */
    public final Buffer getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: getCanceled$okio, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    @NotNull
    public final Condition getCondition() {
        return this.condition;
    }

    @Nullable
    /* JADX INFO: renamed from: getFoldedSink$okio, reason: from getter */
    public final Sink getFoldedSink() {
        return this.foldedSink;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.lock;
    }

    /* JADX INFO: renamed from: getMaxBufferSize$okio, reason: from getter */
    public final long getMaxBufferSize() {
        return this.maxBufferSize;
    }

    /* JADX INFO: renamed from: getSinkClosed$okio, reason: from getter */
    public final boolean getSinkClosed() {
        return this.sinkClosed;
    }

    /* JADX INFO: renamed from: getSourceClosed$okio, reason: from getter */
    public final boolean getSourceClosed() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z10) {
        this.canceled = z10;
    }

    public final void setFoldedSink$okio(@Nullable Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z10) {
        this.sinkClosed = z10;
    }

    public final void setSourceClosed$okio(boolean z10) {
        this.sourceClosed = z10;
    }

    @JvmName(name = "sink")
    @NotNull
    public final Sink sink() {
        return this.f86416i;
    }

    @JvmName(name = "source")
    @NotNull
    public final Source source() {
        return this.f86417j;
    }
}
