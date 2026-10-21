package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f740p0;

    public j(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f740p0 = appCompatDelegateImpl;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z10;
        boolean z11;
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        AppCompatDelegateImpl appCompatDelegateImpl = this.f740p0;
        appCompatDelegateImpl.getClass();
        int systemWindowInsetTop2 = windowInsetsCompat.getSystemWindowInsetTop();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.P0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.P0.getLayoutParams();
            boolean z12 = true;
            if (appCompatDelegateImpl.P0.isShown()) {
                if (appCompatDelegateImpl.f589x1 == null) {
                    appCompatDelegateImpl.f589x1 = new Rect();
                    appCompatDelegateImpl.f591y1 = new Rect();
                }
                Rect rect = appCompatDelegateImpl.f589x1;
                Rect rect2 = appCompatDelegateImpl.f591y1;
                rect.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                ViewUtils.computeFitSystemWindows(appCompatDelegateImpl.V0, rect, rect2);
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(appCompatDelegateImpl.V0);
                int systemWindowInsetLeft = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetLeft();
                int systemWindowInsetRight = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                Context context = appCompatDelegateImpl.E0;
                if (i10 <= 0 || appCompatDelegateImpl.X0 != null) {
                    View view2 = appCompatDelegateImpl.X0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            appCompatDelegateImpl.X0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    appCompatDelegateImpl.X0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    appCompatDelegateImpl.V0.addView(appCompatDelegateImpl.X0, -1, layoutParams);
                }
                View view4 = appCompatDelegateImpl.X0;
                z12 = view4 != null;
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = appCompatDelegateImpl.X0;
                    view5.setBackgroundColor((ViewCompat.getWindowSystemUiVisibility(view5) & 8192) != 0 ? ContextCompat.getColor(context, R.color.abc_decor_view_status_guard_light) : ContextCompat.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!appCompatDelegateImpl.f569c1 && z12) {
                    systemWindowInsetTop2 = 0;
                }
                boolean z13 = z12;
                z12 = z11;
                z10 = z13;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                appCompatDelegateImpl.P0.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = appCompatDelegateImpl.X0;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return ViewCompat.onApplyWindowInsets(view, systemWindowInsetTop != systemWindowInsetTop2 ? windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), systemWindowInsetTop2, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()) : windowInsetsCompat);
    }
}
