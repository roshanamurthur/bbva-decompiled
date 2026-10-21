package okio;

import androidx.camera.core.impl.v;
import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.noknok.android.client.metrics.Tabulator;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0001J/\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Lokio/Timeout;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", Tabulator.KEY_UNIT, "timeoutNanos", "", "hasDeadline", "deadlineNanoTime", TypedValues.TransitionType.S_DURATION, "deadline", "clearTimeout", "clearDeadline", "", "throwIfReached", "Ljava/util/concurrent/locks/Condition;", LandingAEMContentMapper.CONDITION, "awaitSignal", "monitor", "waitUntilNotified", ExifInterface.GPS_DIRECTION_TRUE, "other", "Lkotlin/Function0;", "block", "intersectWith", "(Lokio/Timeout;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "<init>", "()V", "Companion", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
public class Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        @NotNull
        public Timeout timeout(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        @NotNull
        public Timeout deadlineNanoTime(long deadlineNanoTime) {
            return this;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f86438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f86439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f86440c;

    /* JADX INFO: compiled from: Timeout.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokio/Timeout$Companion;", "", "()V", ExpectedUserActionOnPoiTypes.NONE, "Lokio/Timeout;", "minTimeout", "", "aNanos", "bNanos", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long minTimeout(long aNanos, long bNanos) {
            return (aNanos != 0 && (bNanos == 0 || aNanos < bNanos)) ? aNanos : bNanos;
        }
    }

    public final void awaitSignal(@NotNull Condition condition) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(condition, "condition");
        try {
            boolean f86438a = getF86438a();
            long f86440c = getF86440c();
            long jNanoTime = 0;
            if (!f86438a && f86440c == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (f86438a && f86440c != 0) {
                f86440c = Math.min(f86440c, deadlineNanoTime() - jNanoTime2);
            } else if (f86438a) {
                f86440c = deadlineNanoTime() - jNanoTime2;
            }
            if (f86440c > 0) {
                condition.await(f86440c, TimeUnit.NANOSECONDS);
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= f86440c) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @NotNull
    public Timeout clearDeadline() {
        this.f86438a = false;
        return this;
    }

    @NotNull
    public Timeout clearTimeout() {
        this.f86440c = 0L;
        return this;
    }

    @NotNull
    public final Timeout deadline(long duration, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (duration <= 0) {
            throw new IllegalArgumentException(v.c("duration <= 0: ", duration).toString());
        }
        return deadlineNanoTime(unit.toNanos(duration) + System.nanoTime());
    }

    public long deadlineNanoTime() {
        if (this.f86438a) {
            return this.f86439b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* JADX INFO: renamed from: hasDeadline, reason: from getter */
    public boolean getF86438a() {
        return this.f86438a;
    }

    public final <T> T intersectWith(@NotNull Timeout other, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(block, "block");
        long f86440c = getF86440c();
        timeout(INSTANCE.minTimeout(other.getF86440c(), getF86440c()), TimeUnit.NANOSECONDS);
        if (!getF86438a()) {
            if (other.getF86438a()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                T tInvoke = block.invoke();
                InlineMarker.finallyStart(1);
                return tInvoke;
            } finally {
                InlineMarker.finallyStart(1);
                timeout(f86440c, TimeUnit.NANOSECONDS);
                if (other.getF86438a()) {
                    clearDeadline();
                }
                InlineMarker.finallyEnd(1);
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.getF86438a()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            T tInvoke2 = block.invoke();
            InlineMarker.finallyStart(1);
            return tInvoke2;
        } finally {
            InlineMarker.finallyStart(1);
            timeout(f86440c, TimeUnit.NANOSECONDS);
            if (other.getF86438a()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f86438a && this.f86439b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    public Timeout timeout(long timeout, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (timeout < 0) {
            throw new IllegalArgumentException(v.c("timeout < 0: ", timeout).toString());
        }
        this.f86440c = unit.toNanos(timeout);
        return this;
    }

    /* JADX INFO: renamed from: timeoutNanos, reason: from getter */
    public long getF86440c() {
        return this.f86440c;
    }

    public final void waitUntilNotified(@NotNull Object monitor) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        try {
            boolean f86438a = getF86438a();
            long f86440c = getF86440c();
            long jNanoTime = 0;
            if (!f86438a && f86440c == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (f86438a && f86440c != 0) {
                f86440c = Math.min(f86440c, deadlineNanoTime() - jNanoTime2);
            } else if (f86438a) {
                f86440c = deadlineNanoTime() - jNanoTime2;
            }
            if (f86440c > 0) {
                long j10 = f86440c / AnimationKt.MillisToNanos;
                Long.signum(j10);
                monitor.wait(j10, (int) (f86440c - (AnimationKt.MillisToNanos * j10)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= f86440c) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @NotNull
    public Timeout deadlineNanoTime(long deadlineNanoTime) {
        this.f86438a = true;
        this.f86439b = deadlineNanoTime;
        return this;
    }
}
