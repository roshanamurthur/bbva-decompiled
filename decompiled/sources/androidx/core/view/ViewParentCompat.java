package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewParentCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int[] f20277a;

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static void a(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }
    }

    @RequiresApi(21)
    public static class b {
        @DoNotInline
        public static boolean a(ViewParent viewParent, View view, float f6, float f10, boolean z10) {
            return viewParent.onNestedFling(view, f6, f10, z10);
        }

        @DoNotInline
        public static boolean b(ViewParent viewParent, View view, float f6, float f10) {
            return viewParent.onNestedPreFling(view, f6, f10);
        }

        @DoNotInline
        public static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        @DoNotInline
        public static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        @DoNotInline
        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        @DoNotInline
        public static boolean f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        @DoNotInline
        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static void notifySubtreeAccessibilityStateChanged(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        a.a(viewParent, view, view2, i10);
    }

    public static boolean onNestedFling(@NonNull ViewParent viewParent, @NonNull View view, float f6, float f10, boolean z10) {
        try {
            return b.a(viewParent, view, f6, f10, z10);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static boolean onNestedPreFling(@NonNull ViewParent viewParent, @NonNull View view, float f6, float f10) {
        try {
            return b.b(viewParent, view, f6, f10);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void onNestedPreScroll(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        onNestedPreScroll(viewParent, view, i10, i11, iArr, 0);
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (viewParent instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParent).onNestedScroll(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScroll(view, i10, i11, i12, i13, i14);
        } else if (i14 == 0) {
            try {
                b.d(viewParent, view, i10, i11, i12, i13);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void onNestedScrollAccepted(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        onNestedScrollAccepted(viewParent, view, view2, i10, 0);
    }

    public static boolean onStartNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        return onStartNestedScroll(viewParent, view, view2, i10, 0);
    }

    public static void onStopNestedScroll(@NonNull ViewParent viewParent, @NonNull View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedPreScroll(view, i10, i11, iArr, i12);
        } else if (i12 == 0) {
            try {
                b.c(viewParent, view, i10, i11, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void onNestedScrollAccepted(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10, int i11) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScrollAccepted(view, view2, i10, i11);
        } else if (i11 == 0) {
            try {
                b.e(viewParent, view, view2, i10);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean onStartNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10, int i11) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).onStartNestedScroll(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        try {
            return b.f(viewParent, view, view2, i10);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void onStopNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i10) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onStopNestedScroll(view, i10);
        } else if (i10 == 0) {
            try {
                b.g(viewParent, view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13) {
        int[] iArr = f20277a;
        if (iArr == null) {
            f20277a = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        onNestedScroll(viewParent, view, i10, i11, i12, i13, 0, f20277a);
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = f20277a;
        if (iArr == null) {
            f20277a = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        onNestedScroll(viewParent, view, i10, i11, i12, i13, i14, f20277a);
    }
}
