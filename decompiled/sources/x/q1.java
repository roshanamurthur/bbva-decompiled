package x;

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
public final class q1 implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94390b;

    public q1(@NotNull WindowInsets first, @NotNull WindowInsets second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f94389a = first;
        this.f94390b = second;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.areEqual(q1Var.f94389a, this.f94389a) && Intrinsics.areEqual(q1Var.f94390b, this.f94390b);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f94389a.getBottom(density), this.f94390b.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f94389a.getLeft(density, layoutDirection), this.f94390b.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f94389a.getRight(density, layoutDirection), this.f94390b.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f94389a.getTop(density), this.f94390b.getTop(density));
    }

    public final int hashCode() {
        return (this.f94390b.hashCode() * 31) + this.f94389a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "(" + this.f94389a + " ∪ " + this.f94390b + RootService.CLOSE_BRACKET;
    }
}
