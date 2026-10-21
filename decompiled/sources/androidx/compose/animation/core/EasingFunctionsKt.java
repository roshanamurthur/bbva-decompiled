package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EasingFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bi\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0014\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u001a\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u0017\u0010 \u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u0017\u0010&\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u0017\u0010)\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u0017\u0010,\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0004\"\u0017\u0010/\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u0017\u00102\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0004\"\u0017\u00105\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u0017\u00108\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0004\"\u0017\u0010;\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u0017\u0010>\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0004\"\u0017\u0010A\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0004\"\u0017\u0010D\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u0004\"\u0017\u0010G\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0004\"\u0017\u0010J\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0004\"\u0017\u0010M\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u0004\"\u0017\u0010P\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\u0004\"\u0017\u0010S\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010\u0004\"\u0017\u0010V\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0004\"\u0017\u0010Y\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u0004\"\u0017\u0010\\\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bZ\u0010\u0002\u001a\u0004\b[\u0010\u0004\"\u0017\u0010_\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b]\u0010\u0002\u001a\u0004\b^\u0010\u0004\"\u0017\u0010b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\u0004\"\u0017\u0010e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bc\u0010\u0002\u001a\u0004\bd\u0010\u0004\"\u0017\u0010h\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bf\u0010\u0002\u001a\u0004\bg\u0010\u0004¨\u0006i"}, d2 = {"Landroidx/compose/animation/core/Easing;", "a", "Landroidx/compose/animation/core/Easing;", "getEase", "()Landroidx/compose/animation/core/Easing;", "Ease", "b", "getEaseOut", "EaseOut", "c", "getEaseIn", "EaseIn", "d", "getEaseInOut", "EaseInOut", "e", "getEaseInSine", "EaseInSine", "f", "getEaseOutSine", "EaseOutSine", "g", "getEaseInOutSine", "EaseInOutSine", "h", "getEaseInCubic", "EaseInCubic", "i", "getEaseOutCubic", "EaseOutCubic", "j", "getEaseInOutCubic", "EaseInOutCubic", "k", "getEaseInQuint", "EaseInQuint", "l", "getEaseOutQuint", "EaseOutQuint", "m", "getEaseInOutQuint", "EaseInOutQuint", "n", "getEaseInCirc", "EaseInCirc", "o", "getEaseOutCirc", "EaseOutCirc", "p", "getEaseInOutCirc", "EaseInOutCirc", "q", "getEaseInQuad", "EaseInQuad", "r", "getEaseOutQuad", "EaseOutQuad", "s", "getEaseInOutQuad", "EaseInOutQuad", "t", "getEaseInQuart", "EaseInQuart", "u", "getEaseOutQuart", "EaseOutQuart", SharedPrefsStorage.VERSION_KEY, "getEaseInOutQuart", "EaseInOutQuart", "w", "getEaseInExpo", "EaseInExpo", "x", "getEaseOutExpo", "EaseOutExpo", "y", "getEaseInOutExpo", "EaseInOutExpo", "z", "getEaseInBack", "EaseInBack", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getEaseOutBack", "EaseOutBack", "B", "getEaseInOutBack", "EaseInOutBack", "C", "getEaseInElastic", "EaseInElastic", "D", "getEaseOutElastic", "EaseOutElastic", ExifInterface.LONGITUDE_EAST, "getEaseInOutElastic", "EaseInOutElastic", "F", "getEaseOutBounce", "EaseOutBounce", "G", "getEaseInBounce", "EaseInBounce", "H", "getEaseInOutBounce", "EaseInOutBounce", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class EasingFunctionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2923a = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2924b = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2925c = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2926d = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2927e = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2928f = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2929g = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2930h = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2931i = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2932j = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2933k = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2934l = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);

    @NotNull
    public static final CubicBezierEasing m = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2935n = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2936o = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2937p = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2938q = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2939r = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2940s = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2941t = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2942u = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2943v = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2944w = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2945x = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2946y = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f2947z = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);

    @NotNull
    public static final CubicBezierEasing A = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);

    @NotNull
    public static final CubicBezierEasing B = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);

    @NotNull
    public static final b C = b.f2949a;

    @NotNull
    public static final f D = f.f2953a;

    @NotNull
    public static final d E = d.f2951a;

    @NotNull
    public static final e F = e.f2952a;

    @NotNull
    public static final a G = a.f2948a;

    @NotNull
    public static final c H = c.f2950a;

    /* JADX INFO: compiled from: EasingFunctions.kt */
    public static final class a implements Easing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2948a = new a();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f6) {
            return 1 - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - f6);
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    public static final class b implements Easing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2949a = new b();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f6) {
            if (f6 == 0.0f) {
                return 0.0f;
            }
            if (f6 == 1.0f) {
                return 1.0f;
            }
            float f10 = f6 * 10.0f;
            return (float) (Math.sin(((double) (f10 - 10.75f)) * 2.0943951023931953d) * ((double) (-((float) Math.pow(2.0f, f10 - 10.0f)))));
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    public static final class c implements Easing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f2950a = new c();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f6) {
            if (f6 < 0.5d) {
                return (1 - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - (f6 * 2.0f))) / 2.0f;
            }
            return (EasingFunctionsKt.getEaseOutBounce().transform((f6 * 2.0f) - 1.0f) + 1) / 2.0f;
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    public static final class d implements Easing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f2951a = new d();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f6) {
            if (f6 == 0.0f) {
                return 0.0f;
            }
            if (f6 == 1.0f) {
                return 1.0f;
            }
            if (0.0f > f6 || f6 > 0.5f) {
                double d2 = 2.0f;
                return ((float) ((Math.sin(((double) ((f6 * 20.0f) - 11.125f)) * 1.3962634015954636d) * ((double) ((float) Math.pow(d2, ((-20.0f) * f6) + 10.0f)))) / d2)) + 1.0f;
            }
            double d3 = 2.0f;
            float f10 = f6 * 20.0f;
            return (float) ((-(Math.sin(((double) (f10 - 11.125f)) * 1.3962634015954636d) * ((double) ((float) Math.pow(d3, f10 - 10.0f))))) / d3);
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    public static final class e implements Easing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f2952a = new e();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f6) {
            float f10;
            float f11;
            if (f6 < 0.36363637f) {
                return 7.5625f * f6 * f6;
            }
            if (f6 < 0.72727275f) {
                float f12 = f6 - 0.54545456f;
                f10 = 7.5625f * f12 * f12;
                f11 = 0.75f;
            } else if (f6 < 0.90909094f) {
                float f13 = f6 - 0.8181818f;
                f10 = 7.5625f * f13 * f13;
                f11 = 0.9375f;
            } else {
                float f14 = f6 - 0.95454544f;
                f10 = 7.5625f * f14 * f14;
                f11 = 0.984375f;
            }
            return f10 + f11;
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    public static final class f implements Easing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f2953a = new f();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f6) {
            if (f6 == 0.0f) {
                return 0.0f;
            }
            if (f6 == 1.0f) {
                return 1.0f;
            }
            return (float) ((Math.sin(((double) ((f6 * 10.0f) - 0.75f)) * 2.0943951023931953d) * ((double) ((float) Math.pow(2.0f, (-10.0f) * f6)))) + ((double) 1.0f));
        }
    }

    @NotNull
    public static final Easing getEase() {
        return f2923a;
    }

    @NotNull
    public static final Easing getEaseIn() {
        return f2925c;
    }

    @NotNull
    public static final Easing getEaseInBack() {
        return f2947z;
    }

    @NotNull
    public static final Easing getEaseInBounce() {
        return G;
    }

    @NotNull
    public static final Easing getEaseInCirc() {
        return f2935n;
    }

    @NotNull
    public static final Easing getEaseInCubic() {
        return f2930h;
    }

    @NotNull
    public static final Easing getEaseInElastic() {
        return C;
    }

    @NotNull
    public static final Easing getEaseInExpo() {
        return f2944w;
    }

    @NotNull
    public static final Easing getEaseInOut() {
        return f2926d;
    }

    @NotNull
    public static final Easing getEaseInOutBack() {
        return B;
    }

    @NotNull
    public static final Easing getEaseInOutBounce() {
        return H;
    }

    @NotNull
    public static final Easing getEaseInOutCirc() {
        return f2937p;
    }

    @NotNull
    public static final Easing getEaseInOutCubic() {
        return f2932j;
    }

    @NotNull
    public static final Easing getEaseInOutElastic() {
        return E;
    }

    @NotNull
    public static final Easing getEaseInOutExpo() {
        return f2946y;
    }

    @NotNull
    public static final Easing getEaseInOutQuad() {
        return f2940s;
    }

    @NotNull
    public static final Easing getEaseInOutQuart() {
        return f2943v;
    }

    @NotNull
    public static final Easing getEaseInOutQuint() {
        return m;
    }

    @NotNull
    public static final Easing getEaseInOutSine() {
        return f2929g;
    }

    @NotNull
    public static final Easing getEaseInQuad() {
        return f2938q;
    }

    @NotNull
    public static final Easing getEaseInQuart() {
        return f2941t;
    }

    @NotNull
    public static final Easing getEaseInQuint() {
        return f2933k;
    }

    @NotNull
    public static final Easing getEaseInSine() {
        return f2927e;
    }

    @NotNull
    public static final Easing getEaseOut() {
        return f2924b;
    }

    @NotNull
    public static final Easing getEaseOutBack() {
        return A;
    }

    @NotNull
    public static final Easing getEaseOutBounce() {
        return F;
    }

    @NotNull
    public static final Easing getEaseOutCirc() {
        return f2936o;
    }

    @NotNull
    public static final Easing getEaseOutCubic() {
        return f2931i;
    }

    @NotNull
    public static final Easing getEaseOutElastic() {
        return D;
    }

    @NotNull
    public static final Easing getEaseOutExpo() {
        return f2945x;
    }

    @NotNull
    public static final Easing getEaseOutQuad() {
        return f2939r;
    }

    @NotNull
    public static final Easing getEaseOutQuart() {
        return f2942u;
    }

    @NotNull
    public static final Easing getEaseOutQuint() {
        return f2934l;
    }

    @NotNull
    public static final Easing getEaseOutSine() {
        return f2928f;
    }
}
