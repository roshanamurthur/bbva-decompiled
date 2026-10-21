package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class MarginLayoutParamsCompat {

    @RequiresApi(17)
    public static class a {
        @DoNotInline
        public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @DoNotInline
        public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @DoNotInline
        public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @DoNotInline
        public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @DoNotInline
        public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.resolveLayoutDirection(i10);
        }

        @DoNotInline
        public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setLayoutDirection(i10);
        }

        @DoNotInline
        public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginEnd(i10);
        }

        @DoNotInline
        public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginStart(i10);
        }
    }

    public static int getLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        int iA = a.a(marginLayoutParams);
        if (iA == 0 || iA == 1) {
            return iA;
        }
        return 0;
    }

    public static int getMarginEnd(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int getMarginStart(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static boolean isMarginRelative(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.d(marginLayoutParams);
    }

    public static void resolveLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.e(marginLayoutParams, i10);
    }

    public static void setLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.f(marginLayoutParams, i10);
    }

    public static void setMarginEnd(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.g(marginLayoutParams, i10);
    }

    public static void setMarginStart(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.h(marginLayoutParams, i10);
    }
}
