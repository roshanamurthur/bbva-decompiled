package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a2\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0000*\u0018\b\u0002\u0010\u000e\"\b\u0012\u0004\u0012\u00020\u00050\r2\b\u0012\u0004\u0012\u00020\u00050\r*\f\b\u0002\u0010\u000f\"\u00020\u00052\u00020\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "", "addPointerInputChange", "", "x", "y", "", "sampleCount", "degree", "coefficients", "polyFitLeastSquares", "", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,618:1\n609#1:625\n616#1,2:626\n612#1,6:628\n609#1:634\n609#1:635\n604#1:636\n612#1:637\n612#1:638\n590#1:639\n590#1:640\n33#2,6:619\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n390#1:625\n392#1:626,2\n394#1:628,6\n401#1:634\n403#1:635\n418#1:636\n460#1:637\n462#1:638\n570#1:639\n580#1:640\n315#1:619,6\n*E\n"})
public final class VelocityTrackerKt {
    public static final float a(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f6 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f6 += fArr[i10] * fArr2[i10];
        }
        return f6;
    }

    public static final float access$calculateImpulseVelocity(float[] fArr, float[] fArr2, int i10, boolean z10) {
        float f6 = 0.0f;
        if (i10 < 2) {
            return 0.0f;
        }
        if (i10 == 2) {
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            if (f10 == f11) {
                return 0.0f;
            }
            return (z10 ? fArr[0] : fArr[0] - fArr[1]) / (f10 - f11);
        }
        int i11 = i10 - 1;
        for (int i12 = i11; i12 > 0; i12--) {
            int i13 = i12 - 1;
            if (fArr2[i12] != fArr2[i13]) {
                float fSignum = Math.signum(f6) * ((float) Math.sqrt(Math.abs(f6) * 2));
                float f12 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (fArr2[i12] - fArr2[i13]);
                float fAbs = (Math.abs(f12) * (f12 - fSignum)) + f6;
                if (i12 == i11) {
                    fAbs *= 0.5f;
                }
                f6 = fAbs;
            }
        }
        return Math.signum(f6) * ((float) Math.sqrt(Math.abs(f6) * 2));
    }

    public static final void access$set(DataPointAtTime[] dataPointAtTimeArr, int i10, long j10, float f6) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i10];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i10] = new DataPointAtTime(j10, f6);
        } else {
            dataPointAtTime.setTime(j10);
            dataPointAtTime.setDataPoint(f6);
        }
    }

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange event) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (PointerEventKt.changedToDownIgnoreConsumed(event)) {
            velocityTracker.m3555setCurrentPointerPositionAccumulatork4lQ0M$ui_release(event.getPosition());
            velocityTracker.resetTracking();
        }
        long previousPosition = event.getPreviousPosition();
        List<HistoricalChange> historical = event.getHistorical();
        int size = historical.size();
        int i10 = 0;
        while (i10 < size) {
            HistoricalChange historicalChange = historical.get(i10);
            long jM2279minusMKHz9U = Offset.m2279minusMKHz9U(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.m3555setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2280plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), jM2279minusMKHz9U));
            velocityTracker.m3552addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i10++;
            previousPosition = position;
        }
        velocityTracker.m3555setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2280plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.m2279minusMKHz9U(event.getPosition(), previousPosition)));
        velocityTracker.m3552addPositionUv8p0NA(event.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
    }

    @NotNull
    public static final float[] polyFitLeastSquares(@NotNull float[] x4, @NotNull float[] y7, int i10, int i11, @NotNull float[] coefficients) {
        int i12 = i11;
        Intrinsics.checkNotNullParameter(x4, "x");
        Intrinsics.checkNotNullParameter(y7, "y");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        if (i12 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        if (i12 >= i10) {
            i12 = i10 - 1;
        }
        int i13 = i12 + 1;
        float[][] fArr = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr[i14] = new float[i10];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            fArr[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr[i16][i15] = fArr[i16 - 1][i15] * x4[i15];
            }
        }
        float[][] fArr2 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr2[i17] = new float[i10];
        }
        float[][] fArr3 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr3[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr4 = fArr2[i19];
            float[] fArr5 = fArr[i19];
            for (int i20 = 0; i20 < i10; i20++) {
                fArr4[i20] = fArr5[i20];
            }
            for (int i21 = 0; i21 < i19; i21++) {
                float[] fArr6 = fArr2[i21];
                float fA = a(fArr4, fArr6);
                for (int i22 = 0; i22 < i10; i22++) {
                    fArr4[i22] = fArr4[i22] - (fArr6[i22] * fA);
                }
            }
            float fSqrt = (float) Math.sqrt(a(fArr4, fArr4));
            if (fSqrt < 1.0E-6f) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f6 = 1.0f / fSqrt;
            for (int i23 = 0; i23 < i10; i23++) {
                fArr4[i23] = fArr4[i23] * f6;
            }
            float[] fArr7 = fArr3[i19];
            int i24 = 0;
            while (i24 < i13) {
                fArr7[i24] = i24 < i19 ? 0.0f : a(fArr4, fArr[i24]);
                i24++;
            }
            i19++;
        }
        for (int i25 = i12; -1 < i25; i25--) {
            coefficients[i25] = a(fArr2[i25], y7);
            int i26 = i25 + 1;
            if (i26 <= i12) {
                int i27 = i12;
                while (true) {
                    coefficients[i25] = coefficients[i25] - (fArr3[i25][i27] * coefficients[i27]);
                    if (i27 != i26) {
                        i27--;
                    }
                }
            }
            coefficients[i25] = coefficients[i25] / fArr3[i25][i25];
        }
        return coefficients;
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            fArr3 = new float[c.coerceAtLeast(i11 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i10, i11, fArr3);
    }
}
