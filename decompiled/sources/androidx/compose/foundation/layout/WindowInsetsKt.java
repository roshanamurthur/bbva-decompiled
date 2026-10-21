package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.f0;
import x.h1;
import x.p;
import x.q1;
import x.r;
import x.s;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\rH\u0000\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"WindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", Parameters.DIRECTION.LEFT, "Landroidx/compose/ui/unit/Dp;", "top", Parameters.DIRECTION.RIGHT, "bottom", "WindowInsets-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/WindowInsets;", "", "add", "insets", "asInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "asPaddingValues", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "density", "Landroidx/compose/ui/unit/Density;", "exclude", "only", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "only-bOOhFvg", "(Landroidx/compose/foundation/layout/WindowInsets;I)Landroidx/compose/foundation/layout/WindowInsets;", "union", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,674:1\n76#2:675\n154#3:676\n154#3:677\n154#3:678\n154#3:679\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n243#1:675\n276#1:676\n277#1:677\n278#1:678\n279#1:679\n*E\n"})
public final class WindowInsetsKt {
    @NotNull
    public static final WindowInsets WindowInsets(int i10, int i11, int i12, int i13) {
        return new s(i10, i11, i12, i13);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return WindowInsets(i10, i11, i12, i13);
    }

    @NotNull
    /* JADX INFO: renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final WindowInsets m344WindowInsetsa9UjIt4(float f6, float f10, float f11, float f12) {
        return new r(f6, f10, f11, f12);
    }

    /* JADX INFO: renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ WindowInsets m345WindowInsetsa9UjIt4$default(float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f12 = Dp.m4389constructorimpl(0);
        }
        return m344WindowInsetsa9UjIt4(f6, f10, f11, f12);
    }

    @NotNull
    public static final WindowInsets add(@NotNull WindowInsets windowInsets, @NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new x.a(windowInsets, insets);
    }

    @NotNull
    public static final WindowInsets asInsets(@NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        return new h1(paddingValues);
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final PaddingValues asPaddingValues(@NotNull WindowInsets windowInsets, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i10, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:242)");
        }
        f0 f0Var = new f0(windowInsets, (Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return f0Var;
    }

    @NotNull
    public static final WindowInsets exclude(@NotNull WindowInsets windowInsets, @NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new p(windowInsets, insets);
    }

    @NotNull
    /* JADX INFO: renamed from: only-bOOhFvg, reason: not valid java name */
    public static final WindowInsets m346onlybOOhFvg(@NotNull WindowInsets only, int i10) {
        Intrinsics.checkNotNullParameter(only, "$this$only");
        return new d(only, i10);
    }

    @NotNull
    public static final WindowInsets union(@NotNull WindowInsets windowInsets, @NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new q1(windowInsets, insets);
    }

    @NotNull
    public static final PaddingValues asPaddingValues(@NotNull WindowInsets windowInsets, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        return new f0(windowInsets, density);
    }
}
