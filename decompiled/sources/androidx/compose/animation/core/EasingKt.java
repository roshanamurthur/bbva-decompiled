package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Easing.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000f\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Landroidx/compose/animation/core/Easing;", "a", "Landroidx/compose/animation/core/Easing;", "getFastOutSlowInEasing", "()Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "b", "getLinearOutSlowInEasing", "LinearOutSlowInEasing", "c", "getFastOutLinearInEasing", "FastOutLinearInEasing", "d", "getLinearEasing", "LinearEasing", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class EasingKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2954a = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2955b = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2956c = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f2957d = a.f2958a;

    @NotNull
    public static final Easing getFastOutLinearInEasing() {
        return f2956c;
    }

    @NotNull
    public static final Easing getFastOutSlowInEasing() {
        return f2954a;
    }

    @NotNull
    public static final Easing getLinearEasing() {
        return f2957d;
    }

    @NotNull
    public static final Easing getLinearOutSlowInEasing() {
        return f2955b;
    }

    /* JADX INFO: compiled from: Easing.kt */
    public static final class a implements Easing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2958a = new a();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f6) {
            return f6;
        }
    }
}
