package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class SubMenuBuilder extends MenuBuilder implements SubMenu {
    public final MenuBuilder B;
    public final MenuItemImpl C;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.B = menuBuilder;
        this.C = menuItemImpl;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        return super.a(menuBuilder, menuItem) || this.B.a(menuBuilder, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        return this.B.collapseItemActionView(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        return this.B.expandItemActionView(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public String getActionViewStatesKey() {
        MenuItemImpl menuItemImpl = this.C;
        int itemId = menuItemImpl != null ? menuItemImpl.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    public Menu getParentMenu() {
        return this.B;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public MenuBuilder getRootMenu() {
        return this.B.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isGroupDividerEnabled() {
        return this.B.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isQwertyMode() {
        return this.B.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isShortcutsVisible() {
        return this.B.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void setCallback(MenuBuilder.Callback callback) {
        this.B.setCallback(callback);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void setShortcutsVisible(boolean z10) {
        this.B.setShortcutsVisible(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.setHeaderIconInt(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.setHeaderTitleInt(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.C.setIcon(i10);
        return this;
    }
}
