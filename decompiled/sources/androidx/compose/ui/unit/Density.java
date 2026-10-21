package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import x1.a;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0013\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0013\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0015J\f\u0010!\u001a\u00020\"*\u00020#H\u0017J\u0019\u0010$\u001a\u00020\u001b*\u00020\u001aH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0019\u0010&\u001a\u00020\u0010*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\u0003H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\fH\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006+À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "fontScale", "getFontScale$annotations", "getFontScale", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,163:1\n1#2:164\n174#3:165\n174#3:166\n473#3:167\n152#4:168\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n114#1:165\n124#1:166\n147#1:167\n157#1:168\n*E\n"})
public interface Density {

    /* JADX INFO: compiled from: Density.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4375roundToPxR2X_6o(@NotNull Density density, long j10) {
            return a.a(density, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4376roundToPx0680j_4(@NotNull Density density, float f6) {
            return a.b(density, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4377toDpGaN1DYA(@NotNull Density density, long j10) {
            return a.c(density, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4379toDpu2uoSUM(@NotNull Density density, int i10) {
            return a.e(density, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4380toDpSizekrfVVM(@NotNull Density density, long j10) {
            return a.f(density, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4381toPxR2X_6o(@NotNull Density density, long j10) {
            return a.g(density, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4382toPx0680j_4(@NotNull Density density, float f6) {
            return a.h(density, f6);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull Density density, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return a.i(density, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4383toSizeXkaWNTQ(@NotNull Density density, long j10) {
            return a.j(density, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4384toSp0xMU5do(@NotNull Density density, float f6) {
            return a.k(density, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4386toSpkPz2Gy4(@NotNull Density density, int i10) {
            return a.m(density, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4378toDpu2uoSUM(@NotNull Density density, float f6) {
            return a.d(density, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4385toSpkPz2Gy4(@NotNull Density density, float f6) {
            return a.l(density, f6);
        }

        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }
    }

    float getDensity();

    float getFontScale();

    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    int mo412roundToPxR2X_6o(long j10);

    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    int mo413roundToPx0680j_4(float f6);

    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    float mo404toDpGaN1DYA(long j10);

    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    float mo405toDpu2uoSUM(float f6);

    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    float mo406toDpu2uoSUM(int i10);

    @Stable
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    long mo407toDpSizekrfVVM(long j10);

    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    float mo414toPxR2X_6o(long j10);

    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    float mo415toPx0680j_4(float f6);

    @Stable
    @NotNull
    Rect toRect(@NotNull DpRect dpRect);

    @Stable
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    long mo408toSizeXkaWNTQ(long j10);

    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    long mo409toSp0xMU5do(float f6);

    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    long mo410toSpkPz2Gy4(float f6);

    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    long mo411toSpkPz2Gy4(int i10);
}
