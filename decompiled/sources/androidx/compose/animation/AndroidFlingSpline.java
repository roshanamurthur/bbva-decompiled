package androidx.compose.animation;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "", "time", "Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "flingPosition", "velocity", "friction", "", "deceleration", "<init>", "()V", "FlingResult", "animation_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidFlingSpline {

    @NotNull
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final float[] f2539a;

    /* JADX INFO: compiled from: SplineBasedDecay.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "", "component1", "component2", "distanceCoefficient", "velocityCoefficient", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "F", "getDistanceCoefficient", "()F", "b", "getVelocityCoefficient", "<init>", "(FF)V", "animation_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FlingResult {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float distanceCoefficient;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final float velocityCoefficient;

        public FlingResult(float f6, float f10) {
            this.distanceCoefficient = f6;
            this.velocityCoefficient = f10;
        }

        public static /* synthetic */ FlingResult copy$default(FlingResult flingResult, float f6, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = flingResult.distanceCoefficient;
            }
            if ((i10 & 2) != 0) {
                f10 = flingResult.velocityCoefficient;
            }
            return flingResult.copy(f6, f10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        @NotNull
        public final FlingResult copy(float distanceCoefficient, float velocityCoefficient) {
            return new FlingResult(distanceCoefficient, velocityCoefficient);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) other;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.velocityCoefficient) + (Float.floatToIntBits(this.distanceCoefficient) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
            sb2.append(this.distanceCoefficient);
            sb2.append(", velocityCoefficient=");
            return u.i(sb2, this.velocityCoefficient, RootService.CLOSE_BRACKET);
        }
    }

    static {
        float[] fArr = new float[101];
        f2539a = fArr;
        SplineBasedDecayKt.access$computeSplineInfo(fArr, new float[101], 100);
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }

    @NotNull
    public final FlingResult flingPosition(float time) {
        float fA;
        float f6;
        float f10 = 100;
        int i10 = (int) (f10 * time);
        if (i10 < 100) {
            float f11 = i10 / f10;
            int i11 = i10 + 1;
            float f12 = i11 / f10;
            float[] fArr = f2539a;
            float f13 = fArr[i10];
            f6 = (fArr[i11] - f13) / (f12 - f11);
            fA = androidx.datastore.preferences.protobuf.e.a(time, f11, f6, f13);
        } else {
            fA = 1.0f;
            f6 = 0.0f;
        }
        return new FlingResult(fA, f6);
    }
}
