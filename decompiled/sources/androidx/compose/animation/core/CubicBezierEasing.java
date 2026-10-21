package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Easing.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "", "fraction", "transform", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", "b", "c", "d", "<init>", "(FFFF)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2914d;

    public CubicBezierEasing(float f6, float f10, float f11, float f12) {
        this.f2911a = f6;
        this.f2912b = f10;
        this.f2913c = f11;
        this.f2914d = f12;
        if (Float.isNaN(f6) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) {
            throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f6 + ", " + f10 + ", " + f11 + ", " + f12 + '.').toString());
        }
    }

    public static float a(float f6, float f10, float f11) {
        float f12 = 3;
        float f13 = 1 - f11;
        return (f11 * f11 * f11) + (f12 * f10 * f13 * f11 * f11) + (f6 * f12 * f13 * f13 * f11);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) other;
            if (this.f2911a == cubicBezierEasing.f2911a && this.f2912b == cubicBezierEasing.f2912b && this.f2913c == cubicBezierEasing.f2913c && this.f2914d == cubicBezierEasing.f2914d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f2914d) + z1.a(this.f2913c, z1.a(this.f2912b, Float.floatToIntBits(this.f2911a) * 31, 31), 31);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float fraction) {
        float f6 = 0.0f;
        if (fraction > 0.0f) {
            float f10 = 1.0f;
            if (fraction < 1.0f) {
                while (true) {
                    float f11 = (f6 + f10) / 2;
                    float fA = a(this.f2911a, this.f2913c, f11);
                    if (Math.abs(fraction - fA) < 0.001f) {
                        return a(this.f2912b, this.f2914d, f11);
                    }
                    if (fA < fraction) {
                        f6 = f11;
                    } else {
                        f10 = f11;
                    }
                }
            }
        }
        return fraction;
    }
}
