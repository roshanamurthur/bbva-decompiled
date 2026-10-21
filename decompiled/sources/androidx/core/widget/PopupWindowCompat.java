package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class PopupWindowCompat {

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static void a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    @RequiresApi(23)
    public static class b {
        @DoNotInline
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @DoNotInline
        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @DoNotInline
        public static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        @DoNotInline
        public static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static boolean getOverlapAnchor(@NonNull PopupWindow popupWindow) {
        return b.a(popupWindow);
    }

    public static int getWindowLayoutType(@NonNull PopupWindow popupWindow) {
        return b.b(popupWindow);
    }

    public static void setOverlapAnchor(@NonNull PopupWindow popupWindow, boolean z10) {
        b.c(popupWindow, z10);
    }

    public static void setWindowLayoutType(@NonNull PopupWindow popupWindow, int i10) {
        b.d(popupWindow, i10);
    }

    public static void showAsDropDown(@NonNull PopupWindow popupWindow, @NonNull View view, int i10, int i11, int i12) {
        a.a(popupWindow, view, i10, i11, i12);
    }
}
