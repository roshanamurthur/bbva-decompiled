package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import androidx.datastore.preferences.protobuf.q;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecay", "animation_release"}, k = 2, mv = {1, 8, 0})
public final class SplineBasedDecayKt {
    public static final void access$computeSplineInfo(float[] fArr, float[] fArr2, int i10) {
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            float f19 = i11 / i10;
            float f20 = 1.0f;
            while (true) {
                f6 = ((f20 - f17) / 2.0f) + f17;
                f10 = 1.0f - f6;
                f11 = f6 * 3.0f * f10;
                f12 = f6 * f6 * f6;
                float fA = q.a(f6, 0.35000002f, f10 * 0.175f, f11) + f12;
                if (Math.abs(fA - f19) < 1.0E-5d) {
                    break;
                } else if (fA > f19) {
                    f20 = f6;
                } else {
                    f17 = f6;
                }
            }
            float f21 = 0.5f;
            fArr[i11] = (((f10 * 0.5f) + f6) * f11) + f12;
            float f22 = 1.0f;
            while (true) {
                f13 = ((f22 - f18) / 2.0f) + f18;
                f14 = 1.0f - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float fA2 = q.a(f14, f21, f13, f15) + f16;
                if (Math.abs(fA2 - f19) >= 1.0E-5d) {
                    if (fA2 > f19) {
                        f22 = f13;
                    } else {
                        f18 = f13;
                    }
                    f21 = 0.5f;
                }
            }
            fArr2[i11] = (((f13 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
        }
        fArr2[i10] = 1.0f;
        fArr[i10] = 1.0f;
    }

    @NotNull
    public static final <T> DecayAnimationSpec<T> splineBasedDecay(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
