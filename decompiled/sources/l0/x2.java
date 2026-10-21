package l0;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements PopupPositionProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83035a;

    public x2(int i10) {
        this.f83035a = i10;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public final long mo601calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long j10, @NotNull LayoutDirection layoutDirection, long j11) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int right = anchorBounds.getRight();
        if (IntSize.m4549getWidthimpl(j11) + right > IntSize.m4549getWidthimpl(j10) && (right = anchorBounds.getLeft() - IntSize.m4549getWidthimpl(j11)) < 0) {
            right = ((anchorBounds.getWidth() - IntSize.m4549getWidthimpl(j11)) / 2) + anchorBounds.getLeft();
        }
        int top = anchorBounds.getTop() - IntSize.m4548getHeightimpl(j11);
        int i10 = this.f83035a;
        int bottom = top - i10;
        if (bottom < 0) {
            bottom = anchorBounds.getBottom() + i10;
        }
        return IntOffsetKt.IntOffset(right, bottom);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2) && this.f83035a == ((x2) obj).f83035a;
    }

    public final int hashCode() {
        return this.f83035a;
    }

    @NotNull
    public final String toString() {
        return androidx.activity.a.d(new StringBuilder("RichTooltipPositionProvider(tooltipAnchorPadding="), this.f83035a, RootService.CLOSE_BRACKET);
    }
}
