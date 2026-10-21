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
public final class a implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94302b;

    public a(@NotNull WindowInsets first, @NotNull WindowInsets second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f94301a = first;
        this.f94302b = second;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(aVar.f94301a, this.f94301a) && Intrinsics.areEqual(aVar.f94302b, this.f94302b);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f94302b.getBottom(density) + this.f94301a.getBottom(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f94302b.getLeft(density, layoutDirection) + this.f94301a.getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f94302b.getRight(density, layoutDirection) + this.f94301a.getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f94302b.getTop(density) + this.f94301a.getTop(density);
    }

    public final int hashCode() {
        return (this.f94302b.hashCode() * 31) + this.f94301a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "(" + this.f94301a + " + " + this.f94302b + RootService.CLOSE_BRACKET;
    }
}
