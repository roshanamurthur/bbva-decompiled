package l0;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements PopupPositionProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82943a;

    public t2(int i10) {
        this.f82943a = i10;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public final long mo601calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long j10, @NotNull LayoutDirection layoutDirection, long j11) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int width = ((anchorBounds.getWidth() - IntSize.m4549getWidthimpl(j11)) / 2) + anchorBounds.getLeft();
        int top = anchorBounds.getTop() - IntSize.m4548getHeightimpl(j11);
        int i10 = this.f82943a;
        int bottom = top - i10;
        if (bottom < 0) {
            bottom = anchorBounds.getBottom() + i10;
        }
        return IntOffsetKt.IntOffset(width, bottom);
    }
}
