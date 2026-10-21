package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\b\u0000\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0006R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "", "timeMillis", "", "dataPoint", "", "addDataPoint", "calculateVelocity", "resetTracking", "", "a", "Z", "isDataDifferential", "()Z", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "<init>", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "(Z)V", "Strategy", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class VelocityTracker1D {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isDataDifferential;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Strategy f16504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DataPointAtTime[] f16506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final float[] f16508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final float[] f16509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final float[] f16510h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: VelocityTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "Lsq2", "Impulse", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Strategy {
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final Strategy Impulse;
        public static final Strategy Lsq2;

        static {
            Strategy strategy = new Strategy("Lsq2", 0);
            Lsq2 = strategy;
            Strategy strategy2 = new Strategy("Impulse", 1);
            Impulse = strategy2;
            $VALUES = new Strategy[]{strategy, strategy2};
        }

        public Strategy() {
            throw null;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: VelocityTracker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final void addDataPoint(long timeMillis, float dataPoint) {
        int i10 = (this.f16507e + 1) % 20;
        this.f16507e = i10;
        VelocityTrackerKt.access$set(this.f16506d, i10, timeMillis, dataPoint);
    }

    public final float calculateVelocity() {
        float[] fArr;
        float[] fArr2;
        int i10 = this.f16507e;
        DataPointAtTime[] dataPointAtTimeArr = this.f16506d;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i10];
        float fAccess$calculateImpulseVelocity = 0.0f;
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i11 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = dataPointAtTimeArr[i10];
            fArr = this.f16508f;
            fArr2 = this.f16509g;
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = dataPointAtTime3.getDataPoint();
            fArr2[i11] = -time;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime3;
        }
        if (i11 < this.f16505c) {
            return 0.0f;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.f16504b.ordinal()];
        if (i12 == 1) {
            fAccess$calculateImpulseVelocity = VelocityTrackerKt.access$calculateImpulseVelocity(fArr, fArr2, i11, this.isDataDifferential);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                fAccess$calculateImpulseVelocity = VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i11, 2, this.f16510h)[1];
            } catch (IllegalArgumentException unused) {
            }
        }
        return fAccess$calculateImpulseVelocity * 1000;
    }

    /* JADX INFO: renamed from: isDataDifferential, reason: from getter */
    public final boolean getIsDataDifferential() {
        return this.isDataDifferential;
    }

    public final void resetTracking() {
        ArraysKt___ArraysJvmKt.fill$default(this.f16506d, (Object) null, 0, 0, 6, (Object) null);
        this.f16507e = 0;
    }

    public VelocityTracker1D(boolean z10, @NotNull Strategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.isDataDifferential = z10;
        this.f16504b = strategy;
        if (z10 && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.f16505c = i11;
        this.f16506d = new DataPointAtTime[20];
        this.f16508f = new float[20];
        this.f16509g = new float[20];
        this.f16510h = new float[3];
    }

    public /* synthetic */ VelocityTracker1D(boolean z10, Strategy strategy, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z10) {
        this(z10, Strategy.Impulse);
    }
}
