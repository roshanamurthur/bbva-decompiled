package h3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ViewUtilsApi23.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public class v extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f69349h = true;

    /* JADX INFO: compiled from: ViewUtilsApi23.java */
    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    @Override // h3.s
    @SuppressLint({"NewApi"})
    public void c(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.c(view, i10);
        } else if (f69349h) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f69349h = false;
            }
        }
    }
}
