package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositePageTransformer implements ViewPager2.PageTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23958a = new ArrayList();

    public void addTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.f23958a.add(pageTransformer);
    }

    public void removeTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.f23958a.remove(pageTransformer);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NonNull View view, float f6) {
        Iterator it = this.f23958a.iterator();
        while (it.hasNext()) {
            ((ViewPager2.PageTransformer) it.next()).transformPage(view, f6);
        }
    }
}
