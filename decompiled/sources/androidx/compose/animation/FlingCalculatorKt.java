package androidx.compose.animation;

import kotlin.Metadata;

/* JADX INFO: compiled from: FlingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation_release"}, k = 2, mv = {1, 8, 0})
public final class FlingCalculatorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2796a = (float) (Math.log(0.78d) / Math.log(0.9d));

    public static final float access$computeDeceleration(float f6, float f10) {
        return f10 * 386.0878f * 160.0f * f6;
    }
}
