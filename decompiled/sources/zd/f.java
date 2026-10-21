package zd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: ViewOffsetBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public class f<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public g f95049p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f95050q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f95051r0;

    public f() {
        this.f95050q0 = 0;
        this.f95051r0 = 0;
    }

    public int a() {
        return getTopAndBottomOffset();
    }

    public int getLeftAndRightOffset() {
        g gVar = this.f95049p0;
        if (gVar != null) {
            return gVar.f95056e;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        g gVar = this.f95049p0;
        if (gVar != null) {
            return gVar.f95055d;
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        g gVar = this.f95049p0;
        return gVar != null && gVar.f95058g;
    }

    public boolean isVerticalOffsetEnabled() {
        g gVar = this.f95049p0;
        return gVar != null && gVar.f95057f;
    }

    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10) {
        coordinatorLayout.onLayoutChild(v3, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10) {
        layoutChild(coordinatorLayout, v3, i10);
        if (this.f95049p0 == null) {
            this.f95049p0 = new g(v3);
        }
        g gVar = this.f95049p0;
        View view = gVar.f95052a;
        gVar.f95053b = view.getTop();
        gVar.f95054c = view.getLeft();
        this.f95049p0.a();
        int i11 = this.f95050q0;
        if (i11 != 0) {
            this.f95049p0.b(i11);
            this.f95050q0 = 0;
        }
        int i12 = this.f95051r0;
        if (i12 == 0) {
            return true;
        }
        g gVar2 = this.f95049p0;
        if (gVar2.f95058g && gVar2.f95056e != i12) {
            gVar2.f95056e = i12;
            gVar2.a();
        }
        this.f95051r0 = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z10) {
        g gVar = this.f95049p0;
        if (gVar != null) {
            gVar.f95058g = z10;
        }
    }

    public boolean setLeftAndRightOffset(int i10) {
        g gVar = this.f95049p0;
        if (gVar == null) {
            this.f95051r0 = i10;
            return false;
        }
        if (!gVar.f95058g || gVar.f95056e == i10) {
            return false;
        }
        gVar.f95056e = i10;
        gVar.a();
        return true;
    }

    public boolean setTopAndBottomOffset(int i10) {
        g gVar = this.f95049p0;
        if (gVar != null) {
            return gVar.b(i10);
        }
        this.f95050q0 = i10;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z10) {
        g gVar = this.f95049p0;
        if (gVar != null) {
            gVar.f95057f = z10;
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f95050q0 = 0;
        this.f95051r0 = 0;
    }
}
