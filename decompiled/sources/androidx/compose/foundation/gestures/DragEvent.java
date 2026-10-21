package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class DragEvent {

    /* JADX INFO: compiled from: Draggable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;

        @NotNull
        public static final DragCancelled INSTANCE = new DragCancelled();

        public DragCancelled() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "a", "J", "getDelta-F1C5BW0", "()J", "delta", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long delta;

        public DragDelta(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.delta = j10;
        }

        /* JADX INFO: renamed from: getDelta-F1C5BW0, reason: not valid java name and from getter */
        public final long getDelta() {
            return this.delta;
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "a", "J", "getStartPoint-F1C5BW0", "()J", "startPoint", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long startPoint;

        public DragStarted(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.startPoint = j10;
        }

        /* JADX INFO: renamed from: getStartPoint-F1C5BW0, reason: not valid java name and from getter */
        public final long getStartPoint() {
            return this.startPoint;
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/unit/Velocity;", "a", "J", "getVelocity-9UxMQ8M", "()J", "velocity", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long velocity;

        public DragStopped(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.velocity = j10;
        }

        /* JADX INFO: renamed from: getVelocity-9UxMQ8M, reason: not valid java name and from getter */
        public final long getVelocity() {
            return this.velocity;
        }
    }

    public DragEvent() {
    }

    public /* synthetic */ DragEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
