package x;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class h1 implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PaddingValues f94335a;

    public h1(@NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f94335a = paddingValues;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            return Intrinsics.areEqual(((h1) obj).f94335a, this.f94335a);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo413roundToPx0680j_4(this.f94335a.getF4323d());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo413roundToPx0680j_4(this.f94335a.mo302calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo413roundToPx0680j_4(this.f94335a.mo303calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo413roundToPx0680j_4(this.f94335a.getF4321b());
    }

    public final int hashCode() {
        return this.f94335a.hashCode();
    }

    @NotNull
    public final String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        PaddingValues paddingValues = this.f94335a;
        return "PaddingValues(" + ((Object) Dp.m4400toStringimpl(paddingValues.mo302calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m4400toStringimpl(paddingValues.getF4321b())) + ", " + ((Object) Dp.m4400toStringimpl(paddingValues.mo303calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m4400toStringimpl(paddingValues.getF4323d())) + RootService.CLOSE_BRACKET;
    }
}
