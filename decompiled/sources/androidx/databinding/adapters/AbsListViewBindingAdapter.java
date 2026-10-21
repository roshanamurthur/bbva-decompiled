package androidx.databinding.adapters;

import android.widget.AbsListView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @BindingMethod(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @BindingMethod(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @BindingMethod(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AbsListViewBindingAdapter {

    public interface OnScroll {
        void onScroll(AbsListView absListView, int i10, int i11, int i12);
    }

    public interface OnScrollStateChanged {
        void onScrollStateChanged(AbsListView absListView, int i10);
    }

    public class a implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnScrollStateChanged f20572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnScroll f20573b;

        public a(OnScrollStateChanged onScrollStateChanged, OnScroll onScroll) {
            this.f20572a = onScrollStateChanged;
            this.f20573b = onScroll;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            OnScroll onScroll = this.f20573b;
            if (onScroll != null) {
                onScroll.onScroll(absListView, i10, i11, i12);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            OnScrollStateChanged onScrollStateChanged = this.f20572a;
            if (onScrollStateChanged != null) {
                onScrollStateChanged.onScrollStateChanged(absListView, i10);
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void setOnScroll(AbsListView absListView, OnScroll onScroll, OnScrollStateChanged onScrollStateChanged) {
        absListView.setOnScrollListener(new a(onScrollStateChanged, onScroll));
    }
}
