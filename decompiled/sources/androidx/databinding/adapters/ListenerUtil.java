package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class ListenerUtil {
    static {
        new SparseArray();
    }

    public static <T> T getListener(View view, int i10) {
        return (T) view.getTag(i10);
    }

    public static <T> T trackListener(View view, T t10, int i10) {
        T t11 = (T) view.getTag(i10);
        view.setTag(i10, t10);
        return t11;
    }
}
