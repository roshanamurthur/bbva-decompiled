package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {
    public static final String VIEWS_TAG = "android:menu:list";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Context f929p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LayoutInflater f930q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MenuBuilder f931r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ExpandedMenuView f932s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f933t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f934u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public MenuPresenter.Callback f935w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public a f936x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f937y0;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f938p0 = -1;

        public a() {
            a();
        }

        public final void a() {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            MenuItemImpl expandedItem = listMenuPresenter.f931r0.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> nonActionItems = listMenuPresenter.f931r0.getNonActionItems();
                int size = nonActionItems.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (nonActionItems.get(i10) == expandedItem) {
                        this.f938p0 = i10;
                        return;
                    }
                }
            }
            this.f938p0 = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MenuItemImpl getItem(int i10) {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            ArrayList<MenuItemImpl> nonActionItems = listMenuPresenter.f931r0.getNonActionItems();
            int i11 = i10 + listMenuPresenter.f933t0;
            int i12 = this.f938p0;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return nonActionItems.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            int size = listMenuPresenter.f931r0.getNonActionItems().size() - listMenuPresenter.f933t0;
            return this.f938p0 < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
                view = listMenuPresenter.f930q0.inflate(listMenuPresenter.v0, viewGroup, false);
            }
            ((MenuView.ItemView) view).initialize(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context, int i10) {
        this(i10, 0);
        this.f929p0 = context;
        this.f930q0 = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public ListAdapter getAdapter() {
        if (this.f936x0 == null) {
            this.f936x0 = new a();
        }
        return this.f936x0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f937y0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f932s0 == null) {
            this.f932s0 = (ExpandedMenuView) this.f930q0.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f936x0 == null) {
                this.f936x0 = new a();
            }
            this.f932s0.setAdapter((ListAdapter) this.f936x0);
            this.f932s0.setOnItemClickListener(this);
        }
        return this.f932s0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        int i10 = this.f934u0;
        if (i10 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            this.f929p0 = contextThemeWrapper;
            this.f930q0 = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f929p0 != null) {
            this.f929p0 = context;
            if (this.f930q0 == null) {
                this.f930q0 = LayoutInflater.from(context);
            }
        }
        this.f931r0 = menuBuilder;
        a aVar = this.f936x0;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
        MenuPresenter.Callback callback = this.f935w0;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z10);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f931r0.performItemAction(this.f936x0.getItem(i10), this, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        restoreHierarchyState((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        if (this.f932s0 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        c cVar = new c();
        cVar.f1024p0 = subMenuBuilder;
        AlertDialog.Builder builder = new AlertDialog.Builder(subMenuBuilder.getContext());
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext(), R.layout.abc_list_menu_item_layout);
        cVar.f1026r0 = listMenuPresenter;
        listMenuPresenter.setCallback(cVar);
        subMenuBuilder.addMenuPresenter(cVar.f1026r0);
        builder.setAdapter(cVar.f1026r0.getAdapter(), cVar);
        View headerView = subMenuBuilder.getHeaderView();
        if (headerView != null) {
            builder.setCustomTitle(headerView);
        } else {
            builder.setIcon(subMenuBuilder.getHeaderIcon()).setTitle(subMenuBuilder.getHeaderTitle());
        }
        builder.setOnKeyListener(cVar);
        AlertDialog alertDialogCreate = builder.create();
        cVar.f1025q0 = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(cVar);
        WindowManager.LayoutParams attributes = cVar.f1025q0.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        cVar.f1025q0.show();
        MenuPresenter.Callback callback = this.f935w0;
        if (callback == null) {
            return true;
        }
        callback.onOpenSubMenu(subMenuBuilder);
        return true;
    }

    public void restoreHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(VIEWS_TAG);
        if (sparseParcelableArray != null) {
            this.f932s0.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void saveHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f932s0;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(VIEWS_TAG, sparseArray);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f935w0 = callback;
    }

    public void setId(int i10) {
        this.f937y0 = i10;
    }

    public void setItemIndexOffset(int i10) {
        this.f933t0 = i10;
        if (this.f932s0 != null) {
            updateMenuView(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z10) {
        a aVar = this.f936x0;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(int i10, int i11) {
        this.v0 = i10;
        this.f934u0 = i11;
    }
}
