package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\u00020\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\u0006R+\u0010\u0014\u001a\u00020\u00048\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "calculateVelocity", "resetTracking", "c", "J", "getCurrentPointerPositionAccumulator-F1C5BW0$ui_release", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release", "(J)V", "currentPointerPositionAccumulator", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class VelocityTracker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final VelocityTracker1D f16500a = new VelocityTracker1D(false, null, 3, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final VelocityTracker1D f16501b = new VelocityTracker1D(false, null, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long currentPointerPositionAccumulator = Offset.INSTANCE.m2291getZeroF1C5BW0();

    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m3552addPositionUv8p0NA(long timeMillis, long position) {
        this.f16500a.addDataPoint(timeMillis, Offset.m2275getXimpl(position));
        this.f16501b.addDataPoint(timeMillis, Offset.m2276getYimpl(position));
    }

    /* JADX INFO: renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m3553calculateVelocity9UxMQ8M() {
        return VelocityKt.Velocity(this.f16500a.calculateVelocity(), this.f16501b.calculateVelocity());
    }

    /* JADX INFO: renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name and from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    public final void resetTracking() {
        this.f16500a.resetTracking();
        this.f16501b.resetTracking();
    }

    /* JADX INFO: renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m3555setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j10) {
        this.currentPointerPositionAccumulator = j10;
    }
}
