package ne;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: LeftSheetDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f84504a;

    public a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f84504a = sideSheetBehavior;
    }

    @Override // ne.d
    public final int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // ne.d
    public final float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // ne.d
    public final int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // ne.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f84504a;
        return Math.max(0, sideSheetBehavior.I0 + sideSheetBehavior.J0);
    }

    @Override // ne.d
    public final int e() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f84504a;
        return (-sideSheetBehavior.G0) - sideSheetBehavior.J0;
    }

    @Override // ne.d
    public final int f() {
        return this.f84504a.J0;
    }

    @Override // ne.d
    public final int g() {
        return -this.f84504a.G0;
    }

    @Override // ne.d
    public final <V extends View> int h(@NonNull V v3) {
        return v3.getRight() + this.f84504a.J0;
    }

    @Override // ne.d
    public final int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // ne.d
    public final int j() {
        return 1;
    }

    @Override // ne.d
    public final boolean k(float f6) {
        return f6 > 0.0f;
    }

    @Override // ne.d
    public final boolean l(@NonNull View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // ne.d
    public final boolean m(float f6, float f10) {
        if (Math.abs(f6) > Math.abs(f10)) {
            float fAbs = Math.abs(f6);
            this.f84504a.getClass();
            if (fAbs > 500) {
                return true;
            }
        }
        return false;
    }

    @Override // ne.d
    public final boolean n(float f6, @NonNull View view) {
        return Math.abs((this.f84504a.getHideFriction() * f6) + ((float) view.getLeft())) > 0.5f;
    }

    @Override // ne.d
    public final void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // ne.d
    public final void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f84504a.H0) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
