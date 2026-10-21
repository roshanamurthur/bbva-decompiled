package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class ListPopupWindowCompat {

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static View.OnTouchListener a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object obj, View view) {
        return createDragToOpenListener((ListPopupWindow) obj, view);
    }

    @Nullable
    public static View.OnTouchListener createDragToOpenListener(@NonNull ListPopupWindow listPopupWindow, @NonNull View view) {
        return a.a(listPopupWindow, view);
    }
}
