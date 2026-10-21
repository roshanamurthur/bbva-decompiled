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
public final class p implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94383b;

    public p(@NotNull WindowInsets included, @NotNull WindowInsets excluded) {
        Intrinsics.checkNotNullParameter(included, "included");
        Intrinsics.checkNotNullParameter(excluded, "excluded");
        this.f94382a = included;
        this.f94383b = excluded;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(pVar.f94382a, this.f94382a) && Intrinsics.areEqual(pVar.f94383b, this.f94383b);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return kotlin.ranges.c.coerceAtLeast(this.f94382a.getBottom(density) - this.f94383b.getBottom(density), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return kotlin.ranges.c.coerceAtLeast(this.f94382a.getLeft(density, layoutDirection) - this.f94383b.getLeft(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return kotlin.ranges.c.coerceAtLeast(this.f94382a.getRight(density, layoutDirection) - this.f94383b.getRight(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return kotlin.ranges.c.coerceAtLeast(this.f94382a.getTop(density) - this.f94383b.getTop(density), 0);
    }

    public final int hashCode() {
        return this.f94383b.hashCode() + (this.f94382a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "(" + this.f94382a + " - " + this.f94383b + RootService.CLOSE_BRACKET;
    }
}
