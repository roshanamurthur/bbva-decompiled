package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class ListViewCompat {

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static boolean a(ListView listView, int i10) {
            return listView.canScrollList(i10);
        }

        @DoNotInline
        public static void b(ListView listView, int i10) {
            listView.scrollListBy(i10);
        }
    }

    public static boolean canScrollList(@NonNull ListView listView, int i10) {
        return a.a(listView, i10);
    }

    public static void scrollListBy(@NonNull ListView listView, int i10) {
        a.b(listView, i10);
    }
}
