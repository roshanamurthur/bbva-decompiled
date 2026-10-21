package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: CompositeOnPageChangeCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ArrayList f23986a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i10) {
        try {
            Iterator it = this.f23986a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).onPageScrollStateChanged(i10);
            }
        } catch (ConcurrentModificationException e5) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i10, float f6, @Px int i11) {
        try {
            Iterator it = this.f23986a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).onPageScrolled(i10, f6, i11);
            }
        } catch (ConcurrentModificationException e5) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i10) {
        try {
            Iterator it = this.f23986a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).onPageSelected(i10);
            }
        } catch (ConcurrentModificationException e5) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
        }
    }
}
