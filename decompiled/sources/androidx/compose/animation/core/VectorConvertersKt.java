package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VectorConverters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000\"!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u0006*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0006*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0014\"!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0018\"$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u0006*\u00020\u00198Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001b\"$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0006*\u00020\u001c8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001f\"$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001e0\u0006*\u00020 8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\"\"$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0\u0006*\u00020#8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010%\"$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001e0\u0006*\u00020&8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010(\"$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0\u0006*\u00020)8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp", "Lkotlin/Float$Companion;", "Landroidx/compose/animation/core/AnimationVector1D;", "getVectorConverter", "(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "VectorConverter", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class VectorConvertersKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<Float, AnimationVector1D> f3154a = TwoWayConverter(e.f3167p0, f.f3168p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<Integer, AnimationVector1D> f3155b = TwoWayConverter(k.f3173p0, l.f3174p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<Dp, AnimationVector1D> f3156c = TwoWayConverter(c.f3165p0, d.f3166p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<DpOffset, AnimationVector2D> f3157d = TwoWayConverter(a.f3163p0, b.f3164p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<Size, AnimationVector2D> f3158e = TwoWayConverter(q.f3179p0, r.f3180p0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<Offset, AnimationVector2D> f3159f = TwoWayConverter(m.f3175p0, n.f3176p0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<IntOffset, AnimationVector2D> f3160g = TwoWayConverter(g.f3169p0, h.f3170p0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<IntSize, AnimationVector2D> f3161h = TwoWayConverter(i.f3171p0, j.f3172p0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<Rect, AnimationVector4D> f3162i = TwoWayConverter(o.f3177p0, p.f3178p0);

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class a extends Lambda implements Function1<DpOffset, AnimationVector2D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3163p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector2D invoke(DpOffset dpOffset) {
            long f18303a = dpOffset.getF18303a();
            return new AnimationVector2D(DpOffset.m4450getXD9Ej5fM(f18303a), DpOffset.m4452getYD9Ej5fM(f18303a));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    @SourceDebugExtension({"SMAP\nVectorConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,195:1\n174#2:196\n*S KotlinDebug\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n*L\n145#1:196\n*E\n"})
    public static final class b extends Lambda implements Function1<AnimationVector2D, DpOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f3164p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final DpOffset invoke(AnimationVector2D animationVector2D) {
            AnimationVector2D it = animationVector2D;
            Intrinsics.checkNotNullParameter(it, "it");
            return DpOffset.m4444boximpl(DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(it.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String()), Dp.m4389constructorimpl(it.getV2())));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class c extends Lambda implements Function1<Dp, AnimationVector1D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f3165p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector1D invoke(Dp dp) {
            return new AnimationVector1D(dp.m4403unboximpl());
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class d extends Lambda implements Function1<AnimationVector1D, Dp> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f3166p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Dp invoke(AnimationVector1D animationVector1D) {
            AnimationVector1D it = animationVector1D;
            Intrinsics.checkNotNullParameter(it, "it");
            return Dp.m4387boximpl(Dp.m4389constructorimpl(it.getValue()));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class e extends Lambda implements Function1<Float, AnimationVector1D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f3167p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector1D invoke(Float f6) {
            return new AnimationVector1D(f6.floatValue());
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class f extends Lambda implements Function1<AnimationVector1D, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f3168p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(AnimationVector1D animationVector1D) {
            AnimationVector1D it = animationVector1D;
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.getValue());
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class g extends Lambda implements Function1<IntOffset, AnimationVector2D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f3169p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector2D invoke(IntOffset intOffset) {
            long f18312a = intOffset.getF18312a();
            return new AnimationVector2D(IntOffset.m4507getXimpl(f18312a), IntOffset.m4508getYimpl(f18312a));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class h extends Lambda implements Function1<AnimationVector2D, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f3170p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(AnimationVector2D animationVector2D) {
            AnimationVector2D it = animationVector2D;
            Intrinsics.checkNotNullParameter(it, "it");
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(mk.c.roundToInt(it.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String()), mk.c.roundToInt(it.getV2())));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class i extends Lambda implements Function1<IntSize, AnimationVector2D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f3171p0 = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector2D invoke(IntSize intSize) {
            long f18319a = intSize.getF18319a();
            return new AnimationVector2D(IntSize.m4549getWidthimpl(f18319a), IntSize.m4548getHeightimpl(f18319a));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class j extends Lambda implements Function1<AnimationVector2D, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f3172p0 = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(AnimationVector2D animationVector2D) {
            AnimationVector2D it = animationVector2D;
            Intrinsics.checkNotNullParameter(it, "it");
            return IntSize.m4541boximpl(IntSizeKt.IntSize(mk.c.roundToInt(it.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String()), mk.c.roundToInt(it.getV2())));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class k extends Lambda implements Function1<Integer, AnimationVector1D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f3173p0 = new k(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector1D invoke(Integer num) {
            return new AnimationVector1D(num.intValue());
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class l extends Lambda implements Function1<AnimationVector1D, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f3174p0 = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(AnimationVector1D animationVector1D) {
            AnimationVector1D it = animationVector1D;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf((int) it.getValue());
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class m extends Lambda implements Function1<Offset, AnimationVector2D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f3175p0 = new m(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector2D invoke(Offset offset) {
            long f15533a = offset.getF15533a();
            return new AnimationVector2D(Offset.m2275getXimpl(f15533a), Offset.m2276getYimpl(f15533a));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class n extends Lambda implements Function1<AnimationVector2D, Offset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f3176p0 = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final Offset invoke(AnimationVector2D animationVector2D) {
            AnimationVector2D it = animationVector2D;
            Intrinsics.checkNotNullParameter(it, "it");
            return Offset.m2264boximpl(OffsetKt.Offset(it.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String(), it.getV2()));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class o extends Lambda implements Function1<Rect, AnimationVector4D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f3177p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector4D invoke(Rect rect) {
            Rect it = rect;
            Intrinsics.checkNotNullParameter(it, "it");
            return new AnimationVector4D(it.getLeft(), it.getTop(), it.getRight(), it.getBottom());
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class p extends Lambda implements Function1<AnimationVector4D, Rect> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f3178p0 = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final Rect invoke(AnimationVector4D animationVector4D) {
            AnimationVector4D it = animationVector4D;
            Intrinsics.checkNotNullParameter(it, "it");
            return new Rect(it.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String(), it.getV2(), it.getV3(), it.getV4());
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class q extends Lambda implements Function1<Size, AnimationVector2D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f3179p0 = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector2D invoke(Size size) {
            long f15551a = size.getF15551a();
            return new AnimationVector2D(Size.m2344getWidthimpl(f15551a), Size.m2341getHeightimpl(f15551a));
        }
    }

    /* JADX INFO: compiled from: VectorConverters.kt */
    public static final class r extends Lambda implements Function1<AnimationVector2D, Size> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f3180p0 = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final Size invoke(AnimationVector2D animationVector2D) {
            AnimationVector2D it = animationVector2D;
            Intrinsics.checkNotNullParameter(it, "it");
            return Size.m2332boximpl(SizeKt.Size(it.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String(), it.getV2()));
        }
    }

    @NotNull
    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(@NotNull Function1<? super T, ? extends V> convertToVector, @NotNull Function1<? super V, ? extends T> convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        return new s.f(convertToVector, convertFromVector);
    }

    @NotNull
    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(@NotNull FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return f3154a;
    }

    public static final float lerp(float f6, float f10, float f11) {
        return (f10 * f11) + ((1 - f11) * f6);
    }

    @NotNull
    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(@NotNull IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return f3155b;
    }

    @NotNull
    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(@NotNull Rect.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f3162i;
    }

    @NotNull
    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(@NotNull Dp.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f3156c;
    }

    @NotNull
    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(@NotNull DpOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f3157d;
    }

    @NotNull
    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(@NotNull Size.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f3158e;
    }

    @NotNull
    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(@NotNull Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f3159f;
    }

    @NotNull
    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(@NotNull IntOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f3160g;
    }

    @NotNull
    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(@NotNull IntSize.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f3161h;
    }
}
