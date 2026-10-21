package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuItemWrapperICS extends androidx.appcompat.view.menu.a implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SupportMenuItem f997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f998e;

    public class a extends ActionProvider implements android.view.ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ActionProvider.VisibilityListener f999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final android.view.ActionProvider f1000e;

        public a(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f1000e = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean hasSubMenu() {
            return this.f1000e.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean isVisible() {
            return this.f1000e.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z10) {
            ActionProvider.VisibilityListener visibilityListener = this.f999d;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z10);
            }
        }

        @Override // androidx.core.view.ActionProvider
        public final View onCreateActionView(MenuItem menuItem) {
            return this.f1000e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean onPerformDefaultAction() {
            return this.f1000e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public final void onPrepareSubMenu(SubMenu subMenu) {
            this.f1000e.onPrepareSubMenu(MenuItemWrapperICS.this.b(subMenu));
        }

        @Override // androidx.core.view.ActionProvider
        public final boolean overridesItemVisibility() {
            return this.f1000e.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public final void refreshVisibility() {
            this.f1000e.refreshVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public final void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            this.f999d = visibilityListener;
            this.f1000e.setVisibilityListener(visibilityListener != null ? this : null);
        }

        @Override // androidx.core.view.ActionProvider
        @NonNull
        public final View onCreateActionView() {
            return this.f1000e.onCreateActionView();
        }
    }

    public static class b extends FrameLayout implements CollapsibleActionView {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final android.view.CollapsibleActionView f1002p0;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f1002p0 = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public final void onActionViewCollapsed() {
            this.f1002p0.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public final void onActionViewExpanded() {
            this.f1002p0.onActionViewExpanded();
        }
    }

    public class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f1003a;

        public c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1003a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1003a.onMenuItemActionCollapse(MenuItemWrapperICS.this.a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1003a.onMenuItemActionExpand(MenuItemWrapperICS.this.a(menuItem));
        }
    }

    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f1005p0;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1005p0 = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1005p0.onMenuItemClick(MenuItemWrapperICS.this.a(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f997d = supportMenuItem;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f997d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f997d.expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        ActionProvider supportActionProvider = this.f997d.getSupportActionProvider();
        if (supportActionProvider instanceof a) {
            return ((a) supportActionProvider).f1000e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f997d.getActionView();
        return actionView instanceof b ? (View) ((b) actionView).f1002p0 : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f997d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f997d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f997d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f997d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f997d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f997d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f997d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f997d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f997d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f997d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f997d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f997d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f997d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return b(this.f997d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f997d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f997d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f997d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f997d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f997d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f997d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f997d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f997d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f997d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        a aVar = new a(this.f1021a, actionProvider);
        if (actionProvider == null) {
            aVar = null;
        }
        this.f997d.setSupportActionProvider(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new b(view);
        }
        this.f997d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f997d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f997d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f997d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f997d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f997d.setEnabled(z10);
        return this;
    }

    public void setExclusiveCheckable(boolean z10) {
        try {
            Method method = this.f998e;
            SupportMenuItem supportMenuItem = this.f997d;
            if (method == null) {
                this.f998e = supportMenuItem.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f998e.invoke(supportMenuItem, Boolean.valueOf(z10));
        } catch (Exception e5) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e5);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f997d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f997d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f997d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f997d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f997d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f997d.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f997d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f997d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f997d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f997d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f997d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f997d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f997d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f997d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f997d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f997d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f997d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f997d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f997d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        SupportMenuItem supportMenuItem = this.f997d;
        supportMenuItem.setActionView(i10);
        View actionView = supportMenuItem.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            supportMenuItem.setActionView(new b(actionView));
        }
        return this;
    }
}
