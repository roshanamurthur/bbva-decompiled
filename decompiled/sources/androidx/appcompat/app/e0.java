package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: ToolbarActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ActionBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarWidgetWrapper f709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<ActionBar.OnMenuVisibilityListener> f715g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f716h = new a();

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e0 e0Var = e0.this;
            Window.Callback callback = e0Var.f710b;
            boolean z10 = e0Var.f713e;
            ToolbarWidgetWrapper toolbarWidgetWrapper = e0Var.f709a;
            if (!z10) {
                toolbarWidgetWrapper.setMenuCallbacks(e0Var.new c(), e0Var.new d());
                e0Var.f713e = true;
            }
            Menu menu = toolbarWidgetWrapper.getMenu();
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (menuBuilder != null) {
                menuBuilder.stopDispatchingItemsChanged();
            }
            try {
                menu.clear();
                if (!callback.onCreatePanelMenu(0, menu) || !callback.onPreparePanel(0, null, menu)) {
                    menu.clear();
                }
            } finally {
                if (menuBuilder != null) {
                    menuBuilder.startDispatchingItemsChanged();
                }
            }
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class b implements Toolbar.OnMenuItemClickListener {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return e0.this.f710b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public final class c implements MenuPresenter.Callback {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f719p0;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z10) {
            if (this.f719p0) {
                return;
            }
            this.f719p0 = true;
            e0 e0Var = e0.this;
            e0Var.f709a.dismissPopupMenus();
            e0Var.f710b.onPanelClosed(108, menuBuilder);
            this.f719p0 = false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            e0.this.f710b.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public final class d implements MenuBuilder.Callback {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            e0 e0Var = e0.this;
            boolean zIsOverflowMenuShowing = e0Var.f709a.isOverflowMenuShowing();
            Window.Callback callback = e0Var.f710b;
            if (zIsOverflowMenuShowing) {
                callback.onPanelClosed(108, menuBuilder);
            } else if (callback.onPreparePanel(0, null, menuBuilder)) {
                callback.onMenuOpened(108, menuBuilder);
            }
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class e implements AppCompatDelegateImpl.c {
        public e() {
        }
    }

    public e0(@NonNull Toolbar toolbar, @Nullable CharSequence charSequence, @NonNull AppCompatDelegateImpl.i iVar) {
        b bVar = new b();
        Preconditions.checkNotNull(toolbar);
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f709a = toolbarWidgetWrapper;
        this.f710b = (Window.Callback) Preconditions.checkNotNull(iVar);
        toolbarWidgetWrapper.setWindowCallback(iVar);
        toolbar.setOnMenuItemClickListener(bVar);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.f711c = new e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void a() {
        this.f709a.getViewGroup().removeCallbacks(this.f716h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.f715g.add(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void addTab(ActionBar.Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean closeOptionsMenu() {
        return this.f709a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean collapseActionView() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f709a;
        if (!toolbarWidgetWrapper.hasExpandedActionView()) {
            return false;
        }
        toolbarWidgetWrapper.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void dispatchMenuVisibilityChanged(boolean z10) {
        if (z10 == this.f714f) {
            return;
        }
        this.f714f = z10;
        ArrayList<ActionBar.OnMenuVisibilityListener> arrayList = this.f715g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final View getCustomView() {
        return this.f709a.getCustomView();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int getDisplayOptions() {
        return this.f709a.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final float getElevation() {
        return ViewCompat.getElevation(this.f709a.getViewGroup());
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int getHeight() {
        return this.f709a.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int getNavigationItemCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int getNavigationMode() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int getSelectedNavigationIndex() {
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ActionBar.Tab getSelectedTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final CharSequence getSubtitle() {
        return this.f709a.getSubtitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ActionBar.Tab getTabAt(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int getTabCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context getThemedContext() {
        return this.f709a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final CharSequence getTitle() {
        return this.f709a.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void hide() {
        this.f709a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean invalidateOptionsMenu() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f709a;
        ViewGroup viewGroup = toolbarWidgetWrapper.getViewGroup();
        a aVar = this.f716h;
        viewGroup.removeCallbacks(aVar);
        ViewCompat.postOnAnimation(toolbarWidgetWrapper.getViewGroup(), aVar);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean isShowing() {
        return this.f709a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean isTitleTruncated() {
        return super.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ActionBar.Tab newTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean onKeyShortcut(int i10, KeyEvent keyEvent) {
        boolean z10 = this.f713e;
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f709a;
        if (!z10) {
            toolbarWidgetWrapper.setMenuCallbacks(new c(), new d());
            this.f713e = true;
        }
        Menu menu = toolbarWidgetWrapper.getMenu();
        if (menu == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean openOptionsMenu() {
        return this.f709a.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void removeAllTabs() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.f715g.remove(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void removeTab(ActionBar.Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void removeTabAt(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void selectTab(ActionBar.Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setBackgroundDrawable(@Nullable Drawable drawable) {
        this.f709a.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setCustomView(View view) {
        setCustomView(view, new ActionBar.LayoutParams(-2, -2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayHomeAsUpEnabled(boolean z10) {
        setDisplayOptions(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    @SuppressLint({"WrongConstant"})
    public final void setDisplayOptions(int i10) {
        setDisplayOptions(i10, -1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayShowCustomEnabled(boolean z10) {
        setDisplayOptions(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayShowHomeEnabled(boolean z10) {
        setDisplayOptions(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayShowTitleEnabled(boolean z10) {
        setDisplayOptions(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayUseLogoEnabled(boolean z10) {
        setDisplayOptions(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setElevation(float f6) {
        ViewCompat.setElevation(this.f709a.getViewGroup(), f6);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setHomeActionContentDescription(CharSequence charSequence) {
        this.f709a.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setHomeAsUpIndicator(Drawable drawable) {
        this.f709a.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setIcon(int i10) {
        this.f709a.setIcon(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, ActionBar.OnNavigationListener onNavigationListener) {
        this.f709a.setDropdownParams(spinnerAdapter, new c0(onNavigationListener));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setLogo(int i10) {
        this.f709a.setLogo(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setNavigationMode(int i10) {
        if (i10 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f709a.setNavigationMode(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setSelectedNavigationItem(int i10) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f709a;
        if (toolbarWidgetWrapper.getNavigationMode() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        toolbarWidgetWrapper.setDropdownSelectedPosition(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setSubtitle(CharSequence charSequence) {
        this.f709a.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setTitle(CharSequence charSequence) {
        this.f709a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setWindowTitle(CharSequence charSequence) {
        this.f709a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void show() {
        this.f709a.setVisibility(0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void addTab(ActionBar.Tab tab, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f709a.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayOptions(int i10, int i11) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f709a;
        toolbarWidgetWrapper.setDisplayOptions((i10 & i11) | ((~i11) & toolbarWidgetWrapper.getDisplayOptions()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setHomeActionContentDescription(int i10) {
        this.f709a.setNavigationContentDescription(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setHomeAsUpIndicator(int i10) {
        this.f709a.setNavigationIcon(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setIcon(Drawable drawable) {
        this.f709a.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setLogo(Drawable drawable) {
        this.f709a.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setSubtitle(int i10) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f709a;
        toolbarWidgetWrapper.setSubtitle(i10 != 0 ? toolbarWidgetWrapper.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setTitle(int i10) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f709a;
        toolbarWidgetWrapper.setTitle(i10 != 0 ? toolbarWidgetWrapper.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void addTab(ActionBar.Tab tab, int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void addTab(ActionBar.Tab tab, int i10, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setCustomView(int i10) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f709a;
        setCustomView(LayoutInflater.from(toolbarWidgetWrapper.getContext()).inflate(i10, toolbarWidgetWrapper.getViewGroup(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setHomeButtonEnabled(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setShowHideAnimationEnabled(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setStackedBackgroundDrawable(Drawable drawable) {
    }
}
