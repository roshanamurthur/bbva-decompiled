package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FlingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "", "velocity", "", "flingDuration", "flingDistance", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "flingInfo", "Landroidx/compose/ui/unit/Density;", "b", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "friction", "<init>", "(FLandroidx/compose/ui/unit/Density;)V", "FlingInfo", "animation_release"}, k = 1, mv = {1, 8, 0})
public final class FlingCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Density density;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2792c;

    /* JADX INFO: compiled from: FlingCalculator.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "", "time", "", "position", "velocity", "component1", "component2", "component3", "initialVelocity", "distance", TypedValues.TransitionType.S_DURATION, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "F", "getInitialVelocity", "()F", "b", "getDistance", "c", "J", "getDuration", "()J", "<init>", "(FFJ)V", "animation_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FlingInfo {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float initialVelocity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final float distance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long duration;

        public FlingInfo(float f6, float f10, long j10) {
            this.initialVelocity = f6;
            this.distance = f10;
            this.duration = j10;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f6, float f10, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = flingInfo.initialVelocity;
            }
            if ((i10 & 2) != 0) {
                f10 = flingInfo.distance;
            }
            if ((i10 & 4) != 0) {
                j10 = flingInfo.duration;
            }
            return flingInfo.copy(f6, f10, j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getDistance() {
            return this.distance;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @NotNull
        public final FlingInfo copy(float initialVelocity, float distance, long duration) {
            return new FlingInfo(initialVelocity, distance, duration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) other;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            int iA = z1.a(this.distance, Float.floatToIntBits(this.initialVelocity) * 31, 31);
            long j10 = this.duration;
            return iA + ((int) (j10 ^ (j10 >>> 32)));
        }

        public final float position(long time) {
            long j10 = this.duration;
            return AndroidFlingSpline.INSTANCE.flingPosition(j10 > 0 ? time / j10 : 1.0f).getDistanceCoefficient() * Math.signum(this.initialVelocity) * this.distance;
        }

        @NotNull
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + RootService.CLOSE_BRACKET;
        }

        public final float velocity(long time) {
            long j10 = this.duration;
            return (((Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(j10 > 0 ? time / j10 : 1.0f).getVelocityCoefficient()) * this.distance) / j10) * 1000.0f;
        }
    }

    public FlingCalculator(float f6, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f2790a = f6;
        this.density = density;
        this.f2792c = FlingCalculatorKt.access$computeDeceleration(0.84f, density.getDensity());
    }

    public final float flingDistance(float velocity) {
        AndroidFlingSpline androidFlingSpline = AndroidFlingSpline.INSTANCE;
        float f6 = this.f2790a;
        float f10 = this.f2792c;
        double dDeceleration = androidFlingSpline.deceleration(velocity, f6 * f10);
        return (float) (Math.exp((((double) FlingCalculatorKt.f2796a) / (((double) FlingCalculatorKt.f2796a) - 1.0d)) * dDeceleration) * ((double) (f6 * f10)));
    }

    public final long flingDuration(float velocity) {
        return (long) (Math.exp(AndroidFlingSpline.INSTANCE.deceleration(velocity, this.f2790a * this.f2792c) / (((double) FlingCalculatorKt.f2796a) - 1.0d)) * 1000.0d);
    }

    @NotNull
    public final FlingInfo flingInfo(float velocity) {
        AndroidFlingSpline androidFlingSpline = AndroidFlingSpline.INSTANCE;
        float f6 = this.f2790a;
        float f10 = this.f2792c;
        double dDeceleration = androidFlingSpline.deceleration(velocity, f6 * f10);
        double d2 = ((double) FlingCalculatorKt.f2796a) - 1.0d;
        return new FlingInfo(velocity, (float) (Math.exp((((double) FlingCalculatorKt.f2796a) / d2) * dDeceleration) * ((double) (f6 * f10))), (long) (Math.exp(dDeceleration / d2) * 1000.0d));
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }
}
