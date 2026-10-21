package z1;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class d extends e {
    @Override // z1.e, androidx.compose.ui.window.PopupLayoutHelper
    public final void setGestureExclusionRects(@NotNull View composeView, int i10, int i11) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        composeView.setSystemGestureExclusionRects(CollectionsKt__CollectionsKt.mutableListOf(new Rect(0, 0, i10, i11)));
    }
}
