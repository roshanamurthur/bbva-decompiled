package h3;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ViewUtilsApi22.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(22)
public class u extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f69348g = true;

    /* JADX INFO: compiled from: ViewUtilsApi22.java */
    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    @SuppressLint({"NewApi"})
    public void g(@NonNull View view, int i10, int i11, int i12, int i13) {
        if (f69348g) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f69348g = false;
            }
        }
    }
}
