package x;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class f0 implements PaddingValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Density f94327b;

    public f0(@NotNull WindowInsets insets, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f94326a = insets;
        this.f94327b = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public final float getF4323d() {
        WindowInsets windowInsets = this.f94326a;
        Density density = this.f94327b;
        return density.mo406toDpu2uoSUM(windowInsets.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo302calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        WindowInsets windowInsets = this.f94326a;
        Density density = this.f94327b;
        return density.mo406toDpu2uoSUM(windowInsets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public final float mo303calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        WindowInsets windowInsets = this.f94326a;
        Density density = this.f94327b;
        return density.mo406toDpu2uoSUM(windowInsets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public final float getF4321b() {
        WindowInsets windowInsets = this.f94326a;
        Density density = this.f94327b;
        return density.mo406toDpu2uoSUM(windowInsets.getTop(density));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.areEqual(this.f94326a, f0Var.f94326a) && Intrinsics.areEqual(this.f94327b, f0Var.f94327b);
    }

    public final int hashCode() {
        return this.f94327b.hashCode() + (this.f94326a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f94326a + ", density=" + this.f94327b + RootService.CLOSE_BRACKET;
    }
}
