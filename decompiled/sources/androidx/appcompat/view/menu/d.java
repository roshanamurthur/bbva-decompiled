package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: MenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ShowableListMenu, MenuPresenter, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Rect f1027p0;

    public static int b(MenuAdapter menuAdapter, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = menuAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = menuAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = menuAdapter.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public abstract void a(MenuBuilder menuBuilder);

    public abstract void c(View view);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public abstract void d(boolean z10);

    public abstract void e(int i10);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public abstract void f(int i10);

    public abstract void g(PopupWindow.OnDismissListener onDismissListener);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public abstract void h(boolean z10);

    public abstract void i(int i10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (MenuAdapter) listAdapter).f940p0.performItemAction((MenuItem) listAdapter.getItem(i10), this, (this instanceof CascadingMenuPopup) ^ true ? 0 : 4);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(@NonNull Context context, @Nullable MenuBuilder menuBuilder) {
    }
}
