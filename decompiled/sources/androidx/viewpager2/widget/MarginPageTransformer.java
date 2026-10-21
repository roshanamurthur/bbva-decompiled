package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23959a;

    public MarginPageTransformer(@Px int i10) {
        Preconditions.checkArgumentNonnegative(i10, "Margin must be non-negative");
        this.f23959a = i10;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NonNull View view, float f6) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f10 = this.f23959a * f6;
        if (viewPager2.getOrientation() != 0) {
            view.setTranslationY(f10);
            return;
        }
        if (viewPager2.v0.getLayoutDirection() == 1) {
            f10 = -f10;
        }
        view.setTranslationX(f10);
    }
}
