package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: compiled from: PageTransformerAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f23995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2.PageTransformer f23996b;

    public e(LinearLayoutManager linearLayoutManager) {
        this.f23995a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i10, float f6, int i11) {
        if (this.f23996b == null) {
            return;
        }
        float f10 = -f6;
        int i12 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.f23995a;
            if (i12 >= linearLayoutManager.getChildCount()) {
                return;
            }
            View childAt = linearLayoutManager.getChildAt(i12);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(linearLayoutManager.getChildCount())));
            }
            this.f23996b.transformPage(childAt, (linearLayoutManager.getPosition(childAt) - i10) + f10);
            i12++;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i10) {
    }
}
