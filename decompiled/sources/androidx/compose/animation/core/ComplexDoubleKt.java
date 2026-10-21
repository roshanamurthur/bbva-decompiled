package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ComplexDouble.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0000\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n¨\u0006\r"}, d2 = {"complexQuadraticFormula", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "a", "", "b", "c", "complexSqrt", "num", "minus", "other", "plus", "times", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n103#1:113\n107#1:119\n103#1:123\n103#1:134\n35#2,2:114\n54#2,3:116\n66#2,3:120\n35#2,2:124\n54#2,3:126\n35#2,2:129\n66#2,3:131\n35#2,2:135\n54#2,3:137\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n88#1:113\n89#1:119\n89#1:123\n107#1:134\n88#1:114,2\n88#1:116,3\n89#1:120,3\n89#1:124,2\n89#1:126,3\n103#1:129,2\n107#1:131,3\n107#1:135,2\n111#1:137,3\n*E\n"})
public final class ComplexDoubleKt {
    @NotNull
    public static final Pair<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d2, double d3, double d7) {
        double d10 = (d3 * d3) - ((4.0d * d2) * d7);
        double d11 = 1.0d / (d2 * 2.0d);
        double d12 = -d3;
        ComplexDouble complexDoubleComplexSqrt = complexSqrt(d10);
        complexDoubleComplexSqrt.f2909a += d12;
        complexDoubleComplexSqrt.f2909a *= d11;
        complexDoubleComplexSqrt.f2910b *= d11;
        ComplexDouble complexDoubleComplexSqrt2 = complexSqrt(d10);
        double d13 = -1;
        complexDoubleComplexSqrt2.f2909a *= d13;
        complexDoubleComplexSqrt2.f2910b *= d13;
        complexDoubleComplexSqrt2.f2909a += d12;
        complexDoubleComplexSqrt2.f2909a *= d11;
        complexDoubleComplexSqrt2.f2910b *= d11;
        return TuplesKt.to(complexDoubleComplexSqrt, complexDoubleComplexSqrt2);
    }

    @NotNull
    public static final ComplexDouble complexSqrt(double d2) {
        return d2 < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d2))) : new ComplexDouble(Math.sqrt(d2), 0.0d);
    }

    @NotNull
    public static final ComplexDouble minus(double d2, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d3 = -1;
        other.f2909a *= d3;
        other.f2910b *= d3;
        other.f2909a += d2;
        return other;
    }

    @NotNull
    public static final ComplexDouble plus(double d2, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.f2909a += d2;
        return other;
    }

    @NotNull
    public static final ComplexDouble times(double d2, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.f2909a *= d2;
        other.f2910b *= d2;
        return other;
    }
}
