package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransformEvent {

    /* JADX INFO: compiled from: Transformable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent;", "", "a", "F", "getZoomChange", "()F", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "b", "J", "getPanChange-F1C5BW0", "()J", "panChange", "c", "getRotationChange", "rotationChange", "<init>", "(FJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float zoomChange;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final long panChange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float rotationChange;

        public TransformDelta(float f6, long j10, float f10, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.zoomChange = f6;
            this.panChange = j10;
            this.rotationChange = f10;
        }

        /* JADX INFO: renamed from: getPanChange-F1C5BW0, reason: not valid java name and from getter */
        public final long getPanChange() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }
    }

    /* JADX INFO: compiled from: Transformable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;

        @NotNull
        public static final TransformStarted INSTANCE = new TransformStarted();

        public TransformStarted() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Transformable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "Landroidx/compose/foundation/gestures/TransformEvent;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;

        @NotNull
        public static final TransformStopped INSTANCE = new TransformStopped();

        public TransformStopped() {
            super(null);
        }
    }

    public TransformEvent() {
    }

    public /* synthetic */ TransformEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
