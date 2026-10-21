package com.bbva.ui.component.menu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.ui.component.menu.R;
import com.bbva.ui.component.menu.view.recycler.MenuRecyclerView;
import com.bbva.ui.component.menu.view.recycler.item.HeaderMenuItemView;
import com.bbva.ui.component.menu.view.recycler.item.MenuItemView;
import com.bbva.ui.component.menu.view.recycler.item.ShadowView;

/* JADX INFO: loaded from: classes9.dex */
public final class ViewSlideMenuItemsBinding implements ViewBinding {

    @NonNull
    public final LinearLayoutCompat footerGroup;

    @NonNull
    public final ViewInfoMenuItemBinding footerMenuInfoView;

    @NonNull
    public final MenuItemView footerMenuItemView;

    @NonNull
    public final HeaderMenuItemView headerMenuItemView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f36972p0;

    @NonNull
    public final MenuRecyclerView recyclerView;

    @NonNull
    public final CoordinatorLayout rootLayout;

    @NonNull
    public final ShadowView shadowView;

    public ViewSlideMenuItemsBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ViewInfoMenuItemBinding viewInfoMenuItemBinding, @NonNull MenuItemView menuItemView, @NonNull HeaderMenuItemView headerMenuItemView, @NonNull MenuRecyclerView menuRecyclerView, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull ShadowView shadowView) {
        this.f36972p0 = coordinatorLayout;
        this.footerGroup = linearLayoutCompat;
        this.footerMenuInfoView = viewInfoMenuItemBinding;
        this.footerMenuItemView = menuItemView;
        this.headerMenuItemView = headerMenuItemView;
        this.recyclerView = menuRecyclerView;
        this.rootLayout = coordinatorLayout2;
        this.shadowView = shadowView;
    }

    @NonNull
    public static ViewSlideMenuItemsBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.footerGroup;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i10);
        if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.footerMenuInfoView))) != null) {
            ViewInfoMenuItemBinding viewInfoMenuItemBindingBind = ViewInfoMenuItemBinding.bind(viewFindChildViewById);
            i10 = R.id.footerMenuItemView;
            MenuItemView menuItemView = (MenuItemView) ViewBindings.findChildViewById(view, i10);
            if (menuItemView != null) {
                i10 = R.id.headerMenuItemView;
                HeaderMenuItemView headerMenuItemView = (HeaderMenuItemView) ViewBindings.findChildViewById(view, i10);
                if (headerMenuItemView != null) {
                    i10 = R.id.recyclerView;
                    MenuRecyclerView menuRecyclerView = (MenuRecyclerView) ViewBindings.findChildViewById(view, i10);
                    if (menuRecyclerView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        i10 = R.id.shadowView;
                        ShadowView shadowView = (ShadowView) ViewBindings.findChildViewById(view, i10);
                        if (shadowView != null) {
                            return new ViewSlideMenuItemsBinding(coordinatorLayout, linearLayoutCompat, viewInfoMenuItemBindingBind, menuItemView, headerMenuItemView, menuRecyclerView, coordinatorLayout, shadowView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewSlideMenuItemsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewSlideMenuItemsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_slide_menu_items, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f36972p0;
    }
}
