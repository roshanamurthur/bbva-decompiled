package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class MenuItemImpl implements SupportMenuItem {
    public View A;
    public ActionProvider B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f978h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f980j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f982l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MenuBuilder f983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SubMenuBuilder f984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f988s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f995z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f979i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f981k = 4096;
    public int m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f989t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f990u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f991v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f992w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f993x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f994y = 16;
    public boolean D = false;

    public class a implements ActionProvider.VisibilityListener {
        public a() {
        }

        @Override // androidx.core.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z10) {
            MenuBuilder menuBuilder = MenuItemImpl.this.f983n;
            menuBuilder.f953h = true;
            menuBuilder.onItemsChanged(true);
        }
    }

    public MenuItemImpl(MenuBuilder menuBuilder, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f983n = menuBuilder;
        this.f971a = i11;
        this.f972b = i10;
        this.f973c = i12;
        this.f974d = i13;
        this.f975e = charSequence;
        this.f995z = i14;
    }

    public static void a(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public void actionFormatChanged() {
        MenuBuilder menuBuilder = this.f983n;
        menuBuilder.f956k = true;
        menuBuilder.onItemsChanged(true);
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f993x && (this.f991v || this.f992w)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.f991v) {
                DrawableCompat.setTintList(drawable, this.f989t);
            }
            if (this.f992w) {
                DrawableCompat.setTintMode(drawable, this.f990u);
            }
            this.f993x = false;
        }
        return drawable;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f995z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f983n.collapseItemActionView(this);
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f983n.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.B;
        if (actionProvider == null) {
            return null;
        }
        View viewOnCreateActionView = actionProvider.onCreateActionView(this);
        this.A = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f981k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f980j;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f987r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f972b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f982l;
        if (drawable != null) {
            return b(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable drawable2 = AppCompatResources.getDrawable(this.f983n.getContext(), this.m);
        this.m = 0;
        this.f982l = drawable2;
        return b(drawable2);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f989t;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f990u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f977g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f971a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f979i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f978h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f973c;
    }

    public int getOrdering() {
        return this.f974d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f984o;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public ActionProvider getSupportActionProvider() {
        return this.B;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f975e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f976f;
        return charSequence != null ? charSequence : this.f975e;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f988s;
    }

    public boolean hasCollapsibleActionView() {
        ActionProvider actionProvider;
        if ((this.f995z & 8) == 0) {
            return false;
        }
        if (this.A == null && (actionProvider = this.B) != null) {
            this.A = actionProvider.onCreateActionView(this);
        }
        return this.A != null;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f984o != null;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f986q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        MenuBuilder menuBuilder = this.f983n;
        if (menuBuilder.a(menuBuilder, this)) {
            return true;
        }
        Runnable runnable = this.f985p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f977g != null) {
            try {
                menuBuilder.getContext().startActivity(this.f977g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ActionProvider actionProvider = this.B;
        return actionProvider != null && actionProvider.onPerformDefaultAction();
    }

    public boolean isActionButton() {
        return (this.f994y & 32) == 32;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f994y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f994y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f994y & 16) != 0;
    }

    public boolean isExclusiveCheckable() {
        return (this.f994y & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        ActionProvider actionProvider = this.B;
        if (actionProvider == null || !actionProvider.overridesItemVisibility()) {
            return (this.f994y & 8) == 0;
        }
        return (this.f994y & 8) == 0 && this.B.isVisible();
    }

    public boolean requestsActionButton() {
        return (this.f995z & 1) == 1;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        return (this.f995z & 2) == 2;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        return (requiresActionButton() || requestsActionButton()) ? false : true;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public void setActionViewExpanded(boolean z10) {
        this.D = z10;
        this.f983n.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f980j == c10) {
            return this;
        }
        this.f980j = Character.toLowerCase(c10);
        this.f983n.onItemsChanged(false);
        return this;
    }

    public MenuItem setCallback(Runnable runnable) {
        this.f985p = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f994y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f994y = i11;
        if (i10 != i11) {
            this.f983n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        int i10 = this.f994y;
        if ((i10 & 4) != 0) {
            MenuBuilder menuBuilder = this.f983n;
            menuBuilder.getClass();
            int groupId = getGroupId();
            ArrayList<MenuItemImpl> arrayList = menuBuilder.f951f;
            int size = arrayList.size();
            menuBuilder.stopDispatchingItemsChanged();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItemImpl menuItemImpl = arrayList.get(i11);
                if (menuItemImpl.getGroupId() == groupId && menuItemImpl.isExclusiveCheckable() && menuItemImpl.isCheckable()) {
                    boolean z11 = menuItemImpl == this;
                    int i12 = menuItemImpl.f994y;
                    int i13 = (z11 ? 2 : 0) | (i12 & (-3));
                    menuItemImpl.f994y = i13;
                    if (i12 != i13) {
                        menuItemImpl.f983n.onItemsChanged(false);
                    }
                }
            }
            menuBuilder.startDispatchingItemsChanged();
        } else {
            int i14 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f994y = i14;
            if (i10 != i14) {
                this.f983n.onItemsChanged(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f994y |= 16;
        } else {
            this.f994y &= -17;
        }
        this.f983n.onItemsChanged(false);
        return this;
    }

    public void setExclusiveCheckable(boolean z10) {
        this.f994y = (z10 ? 4 : 0) | (this.f994y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.f982l = drawable;
        this.f993x = true;
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f989t = colorStateList;
        this.f991v = true;
        this.f993x = true;
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f990u = mode;
        this.f992w = true;
        this.f993x = true;
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f977g = intent;
        return this;
    }

    public void setIsActionButton(boolean z10) {
        if (z10) {
            this.f994y |= 32;
        } else {
            this.f994y &= -33;
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f978h == c10) {
            return this;
        }
        this.f978h = c10;
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f986q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f978h = c10;
        this.f980j = Character.toLowerCase(c11);
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f995z = i10;
        MenuBuilder menuBuilder = this.f983n;
        menuBuilder.f956k = true;
        menuBuilder.onItemsChanged(true);
    }

    public void setSubMenu(SubMenuBuilder subMenuBuilder) {
        this.f984o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.B;
        if (actionProvider2 != null) {
            actionProvider2.reset();
        }
        this.A = null;
        this.B = actionProvider;
        this.f983n.onItemsChanged(true);
        ActionProvider actionProvider3 = this.B;
        if (actionProvider3 != null) {
            actionProvider3.setVisibilityListener(new a());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f975e = charSequence;
        this.f983n.onItemsChanged(false);
        SubMenuBuilder subMenuBuilder = this.f984o;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f976f = charSequence;
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        int i10 = this.f994y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f994y = i11;
        if (i10 != i11) {
            MenuBuilder menuBuilder = this.f983n;
            menuBuilder.f953h = true;
            menuBuilder.onItemsChanged(true);
        }
        return this;
    }

    public boolean shouldShowIcon() {
        return this.f983n.f964t;
    }

    public boolean showsTextAsAction() {
        return (this.f995z & 4) == 4;
    }

    public String toString() {
        CharSequence charSequence = this.f975e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f987r = charSequence;
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f988s = charSequence;
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f971a) > 0) {
            view.setId(i10);
        }
        MenuBuilder menuBuilder = this.f983n;
        menuBuilder.f956k = true;
        menuBuilder.onItemsChanged(true);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f980j == c10 && this.f981k == i10) {
            return this;
        }
        this.f980j = Character.toLowerCase(c10);
        this.f981k = KeyEvent.normalizeMetaState(i10);
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f978h == c10 && this.f979i == i10) {
            return this;
        }
        this.f978h = c10;
        this.f979i = KeyEvent.normalizeMetaState(i10);
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f978h = c10;
        this.f979i = KeyEvent.normalizeMetaState(i10);
        this.f980j = Character.toLowerCase(c11);
        this.f981k = KeyEvent.normalizeMetaState(i11);
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f982l = null;
        this.m = i10;
        this.f993x = true;
        this.f983n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f983n.getContext().getString(i10));
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(int i10) {
        Context context = this.f983n.getContext();
        setActionView(LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false));
        return this;
    }
}
