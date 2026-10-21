package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class PopupMenuCompat {

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static View.OnTouchListener a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    @Nullable
    public static View.OnTouchListener getDragToOpenListener(@NonNull Object obj) {
        return a.a((PopupMenu) obj);
    }
}
