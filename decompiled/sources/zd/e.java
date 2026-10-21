package zd;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;

/* JADX INFO: compiled from: HeaderScrollingViewBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e extends f<View> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Rect f95046s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Rect f95047t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f95048u0;
    public int v0;

    public e() {
        this.f95046s0 = new Rect();
        this.f95047t0 = new Rect();
        this.f95048u0 = 0;
    }

    @Nullable
    public abstract AppBarLayout b(List list);

    public float c(View view) {
        return 1.0f;
    }

    public int d(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    public final int getOverlayTop() {
        return this.v0;
    }

    @Override // zd.f
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        AppBarLayout appBarLayoutB = b(coordinatorLayout.getDependencies(view));
        int iClamp = 0;
        if (appBarLayoutB == null) {
            super.layoutChild(coordinatorLayout, view, i10);
            this.f95048u0 = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int bottom = appBarLayoutB.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int bottom2 = ((appBarLayoutB.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        Rect rect = this.f95046s0;
        rect.set(paddingLeft, bottom, width, bottom2);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
            rect.left = lastWindowInsets.getSystemWindowInsetLeft() + rect.left;
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f95047t0;
        int i11 = layoutParams.gravity;
        if (i11 == 0) {
            i11 = 8388659;
        }
        GravityCompat.apply(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        if (this.v0 != 0) {
            float fC = c(appBarLayoutB);
            int i12 = this.v0;
            iClamp = MathUtils.clamp((int) (fC * i12), 0, i12);
        }
        view.layout(rect2.left, rect2.top - iClamp, rect2.right, rect2.bottom - iClamp);
        this.f95048u0 = rect2.top - appBarLayoutB.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
        AppBarLayout appBarLayoutB;
        WindowInsetsCompat lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (appBarLayoutB = b(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.getFitsSystemWindows(appBarLayoutB) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetBottom() + lastWindowInsets.getSystemWindowInsetTop();
        }
        int iD = d(appBarLayoutB) + size;
        int measuredHeight = appBarLayoutB.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iD -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iD, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public final void setOverlayTop(int i10) {
        this.v0 = i10;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f95046s0 = new Rect();
        this.f95047t0 = new Rect();
        this.f95048u0 = 0;
    }
}
