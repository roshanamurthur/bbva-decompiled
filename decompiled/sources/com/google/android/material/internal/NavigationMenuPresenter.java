package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuPresenter implements MenuPresenter {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    public ColorStateList F0;
    public ColorStateList G0;
    public Drawable H0;
    public RippleDrawable I0;
    public int J0;

    @Px
    public int K0;
    public int L0;
    public int M0;

    @Px
    public int N0;

    @Px
    public int O0;

    @Px
    public int P0;

    @Px
    public int Q0;
    public boolean R0;
    public int T0;
    public int U0;
    public int V0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NavigationMenuView f44851p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LinearLayout f44852q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MenuPresenter.Callback f44853r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public MenuBuilder f44854s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f44855t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public c f44856u0;
    public LayoutInflater v0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public ColorStateList f44858x0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f44857w0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f44859y0 = 0;
    public boolean E0 = true;
    public boolean S0 = true;
    public int W0 = -1;
    public final a X0 = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean z10 = true;
            navigationMenuPresenter.setUpdateSuspended(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            boolean zPerformItemAction = navigationMenuPresenter.f44854s0.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                navigationMenuPresenter.f44856u0.b(itemData);
            } else {
                z10 = false;
            }
            navigationMenuPresenter.setUpdateSuspended(false);
            if (z10) {
                navigationMenuPresenter.updateMenuView(false);
            }
        }
    }

    public static class b extends l {
    }

    public class c extends RecyclerView.Adapter<l> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayList<e> f44861p0 = new ArrayList<>();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MenuItemImpl f44862q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f44863r0;

        public c() {
            a();
        }

        public final void a() {
            boolean z10;
            if (this.f44863r0) {
                return;
            }
            this.f44863r0 = true;
            ArrayList<e> arrayList = this.f44861p0;
            arrayList.clear();
            arrayList.add(new d());
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int size = navigationMenuPresenter.f44854s0.getVisibleItems().size();
            boolean z11 = false;
            int i10 = -1;
            int i11 = 0;
            boolean z12 = false;
            int size2 = 0;
            while (i11 < size) {
                MenuItemImpl menuItemImpl = navigationMenuPresenter.f44854s0.getVisibleItems().get(i11);
                if (menuItemImpl.isChecked()) {
                    b(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.setExclusiveCheckable(z11);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i11 != 0) {
                            arrayList.add(new f(navigationMenuPresenter.V0, z11 ? 1 : 0));
                        }
                        arrayList.add(new g(menuItemImpl));
                        int size3 = subMenu.size();
                        int i12 = z11 ? 1 : 0;
                        int i13 = i12;
                        while (i12 < size3) {
                            MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i12);
                            if (menuItemImpl2.isVisible()) {
                                if (i13 == 0 && menuItemImpl2.getIcon() != null) {
                                    i13 = 1;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.setExclusiveCheckable(z11);
                                }
                                if (menuItemImpl.isChecked()) {
                                    b(menuItemImpl);
                                }
                                arrayList.add(new g(menuItemImpl2));
                            }
                            i12++;
                            z11 = false;
                        }
                        if (i13 != 0) {
                            int size4 = arrayList.size();
                            for (int size5 = arrayList.size(); size5 < size4; size5++) {
                                ((g) arrayList.get(size5)).f44868b = true;
                            }
                        }
                    }
                    z10 = true;
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i10) {
                        size2 = arrayList.size();
                        z12 = menuItemImpl.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            int i14 = navigationMenuPresenter.V0;
                            arrayList.add(new f(i14, i14));
                        }
                    } else {
                        if (!z12 && menuItemImpl.getIcon() != null) {
                            int size6 = arrayList.size();
                            for (int i15 = size2; i15 < size6; i15++) {
                                ((g) arrayList.get(i15)).f44868b = true;
                            }
                            z10 = true;
                            z12 = true;
                        }
                        g gVar = new g(menuItemImpl);
                        gVar.f44868b = z12;
                        arrayList.add(gVar);
                        i10 = groupId;
                    }
                    z10 = true;
                    g gVar2 = new g(menuItemImpl);
                    gVar2.f44868b = z12;
                    arrayList.add(gVar2);
                    i10 = groupId;
                }
                i11++;
                z11 = false;
            }
            this.f44863r0 = z11 ? 1 : 0;
        }

        public final void b(@NonNull MenuItemImpl menuItemImpl) {
            if (this.f44862q0 == menuItemImpl || !menuItemImpl.isCheckable()) {
                return;
            }
            MenuItemImpl menuItemImpl2 = this.f44862q0;
            if (menuItemImpl2 != null) {
                menuItemImpl2.setChecked(false);
            }
            this.f44862q0 = menuItemImpl;
            menuItemImpl.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f44861p0.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i10) {
            e eVar = this.f44861p0.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).f44867a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
            l lVar = (l) viewHolder;
            int itemViewType = getItemViewType(i10);
            ArrayList<e> arrayList = this.f44861p0;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) arrayList.get(i10);
                    lVar.itemView.setPadding(navigationMenuPresenter.N0, fVar.f44865a, navigationMenuPresenter.O0, fVar.f44866b);
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) arrayList.get(i10)).f44867a.getTitle());
                TextViewCompat.setTextAppearance(textView, navigationMenuPresenter.f44857w0);
                textView.setPadding(navigationMenuPresenter.P0, textView.getPaddingTop(), navigationMenuPresenter.Q0, textView.getPaddingBottom());
                ColorStateList colorStateList = navigationMenuPresenter.f44858x0;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                ViewCompat.setAccessibilityDelegate(textView, new com.google.android.material.internal.c(this, i10, true));
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(navigationMenuPresenter.G0);
            navigationMenuItemView.setTextAppearance(navigationMenuPresenter.f44859y0);
            ColorStateList colorStateList2 = navigationMenuPresenter.F0;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = navigationMenuPresenter.H0;
            ViewCompat.setBackground(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = navigationMenuPresenter.I0;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) arrayList.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f44868b);
            int i11 = navigationMenuPresenter.J0;
            int i12 = navigationMenuPresenter.K0;
            navigationMenuItemView.setPadding(i11, i12, i11, i12);
            navigationMenuItemView.setIconPadding(navigationMenuPresenter.L0);
            if (navigationMenuPresenter.R0) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter.M0);
            }
            navigationMenuItemView.setMaxLines(navigationMenuPresenter.T0);
            navigationMenuItemView.initialize(gVar.f44867a, navigationMenuPresenter.E0);
            ViewCompat.setAccessibilityDelegate(navigationMenuItemView, new com.google.android.material.internal.c(this, i10, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            RecyclerView.ViewHolder iVar;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (i10 == 0) {
                iVar = new i(navigationMenuPresenter.v0.inflate(R.layout.design_navigation_item, viewGroup, false));
                iVar.itemView.setOnClickListener(navigationMenuPresenter.X0);
            } else if (i10 == 1) {
                iVar = new k(navigationMenuPresenter.v0.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return new b(navigationMenuPresenter.f44852q0);
                }
                iVar = new j(navigationMenuPresenter.v0.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
            }
            return iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            l lVar = (l) viewHolder;
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).recycle();
            }
        }
    }

    public static class d implements e {
    }

    public interface e {
    }

    public static class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44866b;

        public f(int i10, int i11) {
            this.f44865a = i10;
            this.f44866b = i11;
        }
    }

    public static class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItemImpl f44867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44868b;

        public g(MenuItemImpl menuItemImpl) {
            this.f44867a = menuItemImpl;
        }
    }

    public class h extends RecyclerViewAccessibilityDelegate {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            c cVar = NavigationMenuPresenter.this.f44856u0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                if (i10 >= navigationMenuPresenter.f44856u0.f44861p0.size()) {
                    accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(i11, 1, false));
                    return;
                }
                int itemViewType = navigationMenuPresenter.f44856u0.getItemViewType(i10);
                if (itemViewType == 0 || itemViewType == 1) {
                    i11++;
                }
                i10++;
            }
        }
    }

    public static class i extends l {
    }

    public static class j extends l {
    }

    public static class k extends l {
    }

    public static abstract class l extends RecyclerView.ViewHolder {
    }

    public void addHeaderView(@NonNull View view) {
        this.f44852q0.addView(view);
        NavigationMenuView navigationMenuView = this.f44851p0;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public void dispatchApplyWindowInsets(@NonNull WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.U0 != systemWindowInsetTop) {
            this.U0 = systemWindowInsetTop;
            int i10 = (getHeaderCount() <= 0 && this.S0) ? this.U0 : 0;
            NavigationMenuView navigationMenuView = this.f44851p0;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = this.f44851p0;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.f44852q0, windowInsetsCompat);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Nullable
    public MenuItemImpl getCheckedItem() {
        return this.f44856u0.f44862q0;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.O0;
    }

    @Px
    public int getDividerInsetStart() {
        return this.N0;
    }

    public int getHeaderCount() {
        return this.f44852q0.getChildCount();
    }

    public View getHeaderView(int i10) {
        return this.f44852q0.getChildAt(i10);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f44855t0;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.H0;
    }

    public int getItemHorizontalPadding() {
        return this.J0;
    }

    public int getItemIconPadding() {
        return this.L0;
    }

    public int getItemMaxLines() {
        return this.T0;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.F0;
    }

    @Nullable
    public ColorStateList getItemTintList() {
        return this.G0;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.K0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f44851p0 == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.v0.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f44851p0 = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f44851p0));
            if (this.f44856u0 == null) {
                c cVar = new c();
                this.f44856u0 = cVar;
                cVar.setHasStableIds(true);
            }
            int i10 = this.W0;
            if (i10 != -1) {
                this.f44851p0.setOverScrollMode(i10);
            }
            LinearLayout linearLayout = (LinearLayout) this.v0.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f44851p0, false);
            this.f44852q0 = linearLayout;
            ViewCompat.setImportantForAccessibility(linearLayout, 2);
            this.f44851p0.setAdapter(this.f44856u0);
        }
        return this.f44851p0;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.Q0;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.P0;
    }

    public View inflateHeaderView(@LayoutRes int i10) {
        View viewInflate = this.v0.inflate(i10, (ViewGroup) this.f44852q0, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.v0 = LayoutInflater.from(context);
        this.f44854s0 = menuBuilder;
        this.V0 = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.S0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
        MenuPresenter.Callback callback = this.f44853r0;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItemImpl menuItemImpl;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        MenuItemImpl menuItemImpl2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f44851p0.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f44856u0;
                cVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                ArrayList<e> arrayList = cVar.f44861p0;
                if (i10 != 0) {
                    cVar.f44863r0 = true;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        e eVar = arrayList.get(i11);
                        if ((eVar instanceof g) && (menuItemImpl2 = ((g) eVar).f44867a) != null && menuItemImpl2.getItemId() == i10) {
                            cVar.b(menuItemImpl2);
                            break;
                        }
                    }
                    cVar.f44863r0 = false;
                    cVar.a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        e eVar2 = arrayList.get(i12);
                        if ((eVar2 instanceof g) && (menuItemImpl = ((g) eVar2).f44867a) != null && (actionView = menuItemImpl.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(menuItemImpl.getItemId())) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f44852q0.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f44851p0 != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f44851p0.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        c cVar = this.f44856u0;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            MenuItemImpl menuItemImpl = cVar.f44862q0;
            if (menuItemImpl != null) {
                bundle2.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList<e> arrayList = cVar.f44861p0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof g) {
                    MenuItemImpl menuItemImpl2 = ((g) eVar).f44867a;
                    View actionView = menuItemImpl2 != null ? menuItemImpl2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(menuItemImpl2.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f44852q0 != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f44852q0.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void removeHeaderView(@NonNull View view) {
        this.f44852q0.removeView(view);
        if (getHeaderCount() > 0) {
            return;
        }
        NavigationMenuView navigationMenuView = this.f44851p0;
        navigationMenuView.setPadding(0, this.U0, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBehindStatusBar(boolean z10) {
        if (this.S0 != z10) {
            this.S0 = z10;
            int i10 = (getHeaderCount() <= 0 && this.S0) ? this.U0 : 0;
            NavigationMenuView navigationMenuView = this.f44851p0;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f44853r0 = callback;
    }

    public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
        this.f44856u0.b(menuItemImpl);
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.O0 = i10;
        updateMenuView(false);
    }

    public void setDividerInsetStart(@Px int i10) {
        this.N0 = i10;
        updateMenuView(false);
    }

    public void setId(int i10) {
        this.f44855t0 = i10;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.H0 = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(@Nullable RippleDrawable rippleDrawable) {
        this.I0 = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i10) {
        this.J0 = i10;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i10) {
        this.L0 = i10;
        updateMenuView(false);
    }

    public void setItemIconSize(@Dimension int i10) {
        if (this.M0 != i10) {
            this.M0 = i10;
            this.R0 = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.G0 = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i10) {
        this.T0 = i10;
        updateMenuView(false);
    }

    public void setItemTextAppearance(@StyleRes int i10) {
        this.f44859y0 = i10;
        updateMenuView(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.E0 = z10;
        updateMenuView(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.F0 = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(@Px int i10) {
        this.K0 = i10;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i10) {
        this.W0 = i10;
        NavigationMenuView navigationMenuView = this.f44851p0;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void setSubheaderColor(@Nullable ColorStateList colorStateList) {
        this.f44858x0 = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(@Px int i10) {
        this.Q0 = i10;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(@Px int i10) {
        this.P0 = i10;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(@StyleRes int i10) {
        this.f44857w0 = i10;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z10) {
        c cVar = this.f44856u0;
        if (cVar != null) {
            cVar.f44863r0 = z10;
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z10) {
        c cVar = this.f44856u0;
        if (cVar != null) {
            cVar.a();
            cVar.notifyDataSetChanged();
        }
    }
}
