package okio;

import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Throttler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!B\t\b\u0016¢\u0006\u0004\b \u0010\"J$\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lokio/Throttler;", "", "", "bytesPerSecond", "waitByteCount", "maxByteCount", "", "byteCount", "take$okio", "(J)J", "take", "now", "byteCountOrWaitNanos$okio", "(JJ)J", "byteCountOrWaitNanos", "Lokio/Source;", "source", "Lokio/Sink;", "sink", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "f", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", LandingAEMContentMapper.CONDITION, "allocatedUntil", "<init>", "(J)V", "()V", "okio"}, k = 1, mv = {1, 9, 0})
public final class Throttler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f86430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f86431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f86432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f86433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Condition condition;

    public Throttler(long j10) {
        this.f86430a = j10;
        this.f86432c = SvgConstantsKt.SPECIFIED_FONT_FAMILY;
        this.f86433d = SvgConstantsKt.SPECIFIED_TEXT_ANCHOR;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = throttler.f86432c;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            j12 = throttler.f86433d;
        }
        throttler.bytesPerSecond(j10, j13, j12);
    }

    public final long byteCountOrWaitNanos$okio(long now, long byteCount) {
        if (this.f86431b == 0) {
            return byteCount;
        }
        long jMax = Math.max(this.f86430a - now, 0L);
        long j10 = this.f86433d;
        long j11 = this.f86431b;
        long j12 = j10 - ((jMax * j11) / 1000000000);
        if (j12 >= byteCount) {
            this.f86430a = ((byteCount * 1000000000) / j11) + now + jMax;
            return byteCount;
        }
        long j13 = this.f86432c;
        if (j12 >= j13) {
            this.f86430a = ((j10 * 1000000000) / j11) + now;
            return j12;
        }
        long jMin = Math.min(j13, byteCount);
        long j14 = this.f86433d;
        long j15 = this.f86431b;
        long j16 = (((jMin - j14) * 1000000000) / j15) + jMax;
        if (j16 != 0) {
            return -j16;
        }
        this.f86430a = ((j14 * 1000000000) / j15) + now;
        return jMin;
    }

    @JvmOverloads
    public final void bytesPerSecond(long j10) {
        bytesPerSecond$default(this, j10, 0L, 0L, 6, null);
    }

    @NotNull
    public final Condition getCondition() {
        return this.condition;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.lock;
    }

    @NotNull
    public final Sink sink(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new ForwardingSink(sink) { // from class: okio.Throttler.sink.1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(@NotNull Buffer source, long byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                while (byteCount > 0) {
                    try {
                        long jTake$okio = this.take$okio(byteCount);
                        super.write(source, jTake$okio);
                        byteCount -= jTake$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new ForwardingSource(source) { // from class: okio.Throttler.source.1
            @Override // okio.ForwardingSource, okio.Source
            public long read(@NotNull Buffer sink, long byteCount) throws InterruptedIOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    return super.read(sink, this.take$okio(byteCount));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long byteCount) {
        if (byteCount <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                long jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), byteCount);
                if (jByteCountOrWaitNanos$okio >= 0) {
                    reentrantLock.unlock();
                    return jByteCountOrWaitNanos$okio;
                }
                this.condition.awaitNanos(-jByteCountOrWaitNanos$okio);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    @JvmOverloads
    public final void bytesPerSecond(long j10, long j11) {
        bytesPerSecond$default(this, j10, j11, 0L, 4, null);
    }

    @JvmOverloads
    public final void bytesPerSecond(long bytesPerSecond, long waitByteCount, long maxByteCount) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (bytesPerSecond < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (waitByteCount <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (maxByteCount >= waitByteCount) {
                this.f86431b = bytesPerSecond;
                this.f86432c = waitByteCount;
                this.f86433d = maxByteCount;
                this.condition.signalAll();
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public Throttler() {
        this(System.nanoTime());
    }
}
