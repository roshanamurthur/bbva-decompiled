package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarMenu extends MenuBuilder {

    @NonNull
    public final Class<?> B;
    public final int C;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i10) {
        super(context);
        this.B = cls;
        this.C = i10;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public MenuItem addInternal(int i10, int i11, int i12, @NonNull CharSequence charSequence) {
        int size = size() + 1;
        int i13 = this.C;
        if (size <= i13) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i10, i11, i12, charSequence);
            if (menuItemAddInternal instanceof MenuItemImpl) {
                ((MenuItemImpl) menuItemAddInternal).setExclusiveCheckable(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.B.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i13);
        sb2.append(". Limit can be checked with ");
        throw new IllegalArgumentException(ad.d.f(sb2, simpleName, "#getMaxItemCount()"));
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i10, int i11, int i12, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.B.getSimpleName().concat(" does not support submenus"));
    }

    public int getMaxItemCount() {
        return this.C;
    }
}
