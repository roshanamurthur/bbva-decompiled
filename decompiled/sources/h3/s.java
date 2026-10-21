package h3;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ViewUtilsApi19.java */
/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f69342a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f69343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f69344c;

    /* JADX INFO: compiled from: ViewUtilsApi19.java */
    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static float a(View view) {
            return view.getTransitionAlpha();
        }

        @DoNotInline
        public static void b(View view, float f6) {
            view.setTransitionAlpha(f6);
        }
    }

    @SuppressLint({"NewApi"})
    public float a(@NonNull View view) {
        if (f69342a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f69342a = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void b(@NonNull View view, float f6) {
        if (f69342a) {
            try {
                a.b(view, f6);
                return;
            } catch (NoSuchMethodError unused) {
                f69342a = false;
            }
        }
        view.setAlpha(f6);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void c(@NonNull View view, int i10) {
        if (!f69344c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f69343b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f69344c = true;
        }
        Field field = f69343b;
        if (field != null) {
            try {
                f69343b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
