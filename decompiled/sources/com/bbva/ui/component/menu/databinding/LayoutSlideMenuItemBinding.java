package com.bbva.ui.component.menu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.ui.component.menu.R;
import com.bbva.ui.component.menu.view.recycler.item.MenuItemView;

/* JADX INFO: loaded from: classes9.dex */
public final class LayoutSlideMenuItemBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final MenuItemView f36966p0;

    public LayoutSlideMenuItemBinding(@NonNull MenuItemView menuItemView) {
        this.f36966p0 = menuItemView;
    }

    @NonNull
    public static LayoutSlideMenuItemBinding bind(@NonNull View view) {
        if (view != null) {
            return new LayoutSlideMenuItemBinding((MenuItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static LayoutSlideMenuItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutSlideMenuItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_slide_menu_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public MenuItemView getRoot() {
        return this.f36966p0;
    }
}
