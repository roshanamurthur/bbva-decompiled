package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: ViewPager2.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements RecyclerView.OnChildAttachStateChangeListener {
    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(@NonNull View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(@NonNull View view) {
    }
}
