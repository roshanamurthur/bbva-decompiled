package de;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewUtils.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f68171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f68172q0;

    public b(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f68172q0 = bottomSheetBehavior;
        this.f68171p0 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[DONT_INVERT] */
    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        boolean z10;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures());
        int i10 = insets.top;
        BottomSheetBehavior bottomSheetBehavior = this.f68172q0;
        bottomSheetBehavior.R0 = i10;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.J0) {
            bottomSheetBehavior.Q0 = windowInsetsCompat.getSystemWindowInsetBottom();
            paddingBottom = relativePadding.bottom + bottomSheetBehavior.Q0;
        }
        if (bottomSheetBehavior.K0) {
            paddingLeft = (zIsLayoutRtl ? relativePadding.end : relativePadding.start) + insets.left;
        }
        if (bottomSheetBehavior.L0) {
            paddingRight = (zIsLayoutRtl ? relativePadding.start : relativePadding.end) + insets.right;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z11 = true;
        if (bottomSheetBehavior.N0) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = insets.left;
            if (i11 != i12) {
                marginLayoutParams.leftMargin = i12;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (bottomSheetBehavior.O0) {
            int i13 = marginLayoutParams.rightMargin;
            int i14 = insets.right;
            if (i13 != i14) {
                marginLayoutParams.rightMargin = i14;
            } else {
                z11 = z10;
            }
        } else {
            z11 = z10;
        }
        if (bottomSheetBehavior.P0) {
            int i15 = marginLayoutParams.topMargin;
            int i16 = insets.top;
            if (i15 != i16) {
                marginLayoutParams.topMargin = i16;
            } else if (z11) {
            }
            view.setLayoutParams(marginLayoutParams);
        } else if (z11) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z12 = this.f68171p0;
        if (z12) {
            bottomSheetBehavior.H0 = insets2.bottom;
        }
        if (bottomSheetBehavior.J0 || z12) {
            bottomSheetBehavior.s(false);
        }
        return windowInsetsCompat;
    }
}
