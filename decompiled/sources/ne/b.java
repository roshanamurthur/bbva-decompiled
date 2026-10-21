package ne;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: RightSheetDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f84505a;

    public b(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f84505a = sideSheetBehavior;
    }

    @Override // ne.d
    public final int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // ne.d
    public final float b(int i10) {
        float f6 = this.f84505a.H0;
        return (f6 - i10) / (f6 - d());
    }

    @Override // ne.d
    public final int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // ne.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f84505a;
        return Math.max(0, (sideSheetBehavior.H0 - sideSheetBehavior.G0) - sideSheetBehavior.J0);
    }

    @Override // ne.d
    public final int e() {
        return this.f84505a.H0;
    }

    @Override // ne.d
    public final int f() {
        return this.f84505a.H0;
    }

    @Override // ne.d
    public final int g() {
        return d();
    }

    @Override // ne.d
    public final <V extends View> int h(@NonNull V v3) {
        return v3.getLeft() - this.f84505a.J0;
    }

    @Override // ne.d
    public final int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // ne.d
    public final int j() {
        return 0;
    }

    @Override // ne.d
    public final boolean k(float f6) {
        return f6 < 0.0f;
    }

    @Override // ne.d
    public final boolean l(@NonNull View view) {
        return view.getLeft() > (d() + this.f84505a.H0) / 2;
    }

    @Override // ne.d
    public final boolean m(float f6, float f10) {
        if (Math.abs(f6) > Math.abs(f10)) {
            float fAbs = Math.abs(f6);
            this.f84505a.getClass();
            if (fAbs > 500) {
                return true;
            }
        }
        return false;
    }

    @Override // ne.d
    public final boolean n(float f6, @NonNull View view) {
        return Math.abs((this.f84505a.getHideFriction() * f6) + ((float) view.getRight())) > 0.5f;
    }

    @Override // ne.d
    public final void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // ne.d
    public final void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int i12 = this.f84505a.H0;
        if (i10 <= i12) {
            marginLayoutParams.rightMargin = i12 - i10;
        }
    }
}
