package z1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.window.PopupLayoutHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
public class e implements PopupLayoutHelper {
    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public final void getWindowVisibleDisplayFrame(@NotNull View composeView, @NotNull Rect outRect) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(@NotNull View composeView, int i10, int i11) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public final void updateViewLayout(@NotNull WindowManager windowManager, @NotNull View popupView, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(popupView, "popupView");
        Intrinsics.checkNotNullParameter(params, "params");
        windowManager.updateViewLayout(popupView, params);
    }
}
