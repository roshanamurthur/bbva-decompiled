package h3;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewGroupUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f69336a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f69337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f69338c;

    /* JADX INFO: compiled from: ViewGroupUtils.java */
    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static int a(ViewGroup viewGroup, int i10) {
            return viewGroup.getChildDrawingOrder(i10);
        }

        @DoNotInline
        public static void b(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z10);
        } else if (f69336a) {
            try {
                a.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f69336a = false;
            }
        }
    }
}
