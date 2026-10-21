package androidx.compose.foundation.layout;

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
public final class d implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowInsets f4488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4489b;

    public d(WindowInsets insets, int i10) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f4488a = insets;
        this.f4489b = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f4488a, dVar.f4488a) && WindowInsetsSides.m349equalsimpl0(this.f4489b, dVar.f4489b);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m350hasAnybkgdKaI$foundation_layout_release(this.f4489b, WindowInsetsSides.INSTANCE.m359getBottomJoeWqyM())) {
            return this.f4488a.getBottom(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (WindowInsetsSides.m350hasAnybkgdKaI$foundation_layout_release(this.f4489b, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.INSTANCE.m355getAllowLeftInLtrJoeWqyM$foundation_layout_release() : WindowInsetsSides.INSTANCE.m356getAllowLeftInRtlJoeWqyM$foundation_layout_release())) {
            return this.f4488a.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (WindowInsetsSides.m350hasAnybkgdKaI$foundation_layout_release(this.f4489b, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.INSTANCE.m357getAllowRightInLtrJoeWqyM$foundation_layout_release() : WindowInsetsSides.INSTANCE.m358getAllowRightInRtlJoeWqyM$foundation_layout_release())) {
            return this.f4488a.getRight(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m350hasAnybkgdKaI$foundation_layout_release(this.f4489b, WindowInsetsSides.INSTANCE.m365getTopJoeWqyM())) {
            return this.f4488a.getTop(density);
        }
        return 0;
    }

    public final int hashCode() {
        return WindowInsetsSides.m351hashCodeimpl(this.f4489b) + (this.f4488a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "(" + this.f4488a + " only " + ((Object) WindowInsetsSides.m353toStringimpl(this.f4489b)) + RootService.CLOSE_BRACKET;
    }
}
