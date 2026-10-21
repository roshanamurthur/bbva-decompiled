package kotlinx.coroutines;

import androidx.compose.animation.core.AnimationKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007*\u001e\b\u0002\u0010\u000b\u001a\u0004\b\u0000\u0010\t\"\b\u0012\u0004\u0012\u00028\u00000\n2\b\u0012\u0004\u0012\u00028\u00000\n¨\u0006\f"}, d2 = {"", "timeMillis", "delayToNanos", "timeNanos", "delayNanosToMillis", "Lkotlinx/coroutines/internal/Symbol;", "DISPOSED_TASK", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED_EMPTY", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
public final class EventLoop_commonKt {

    @NotNull
    private static final Symbol DISPOSED_TASK = new Symbol("REMOVED_TASK");

    @NotNull
    private static final Symbol CLOSED_EMPTY = new Symbol("CLOSED_EMPTY");

    public static final long delayNanosToMillis(long j10) {
        return j10 / AnimationKt.MillisToNanos;
    }

    public static final long delayToNanos(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return AnimationKt.MillisToNanos * j10;
    }
}
