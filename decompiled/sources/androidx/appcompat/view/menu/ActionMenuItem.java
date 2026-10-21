package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItem implements SupportMenuItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f873g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f875i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f878l;
    public MenuItem.OnMenuItemClickListener m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f880o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f874h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f876j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f881p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f882q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f883r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f884s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f885t = 16;

    public ActionMenuItem(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f878l = context;
        this.f867a = i11;
        this.f868b = i10;
        this.f869c = i13;
        this.f870d = charSequence;
    }

    public final void a() {
        Drawable drawable = this.f877k;
        if (drawable != null) {
            if (this.f883r || this.f884s) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable);
                this.f877k = drawableWrap;
                Drawable drawableMutate = drawableWrap.mutate();
                this.f877k = drawableMutate;
                if (this.f883r) {
                    DrawableCompat.setTintList(drawableMutate, this.f881p);
                }
                if (this.f884s) {
                    DrawableCompat.setTintMode(this.f877k, this.f882q);
                }
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f876j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f875i;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f879n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f868b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f877k;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f881p;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f882q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f872f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f867a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f874h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f873g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f869c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.view.ActionProvider getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f870d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f871e;
        return charSequence != null ? charSequence : this.f870d;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f880o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.m;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f872f;
        if (intent == null) {
            return false;
        }
        this.f878l.startActivity(intent);
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f885t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f885t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f885t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f885t & 8) == 0;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f875i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f885t = (z10 ? 1 : 0) | (this.f885t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f885t = (z10 ? 2 : 0) | (this.f885t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f885t = (z10 ? 16 : 0) | (this.f885t & (-17));
        return this;
    }

    public ActionMenuItem setExclusiveCheckable(boolean z10) {
        this.f885t = (z10 ? 4 : 0) | (this.f885t & (-5));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f877k = drawable;
        a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f881p = colorStateList;
        this.f883r = true;
        a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f882q = mode;
        this.f884s = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f872f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f873g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f873g = c10;
        this.f875i = Character.toLowerCase(c11);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f870d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f871e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f885t = (this.f885t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f875i = Character.toLowerCase(c10);
        this.f876j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f879n = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f873g = c10;
        this.f874h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f870d = this.f878l.getResources().getString(i10);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f880o = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f877k = ContextCompat.getDrawable(this.f878l, i10);
        a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f873g = c10;
        this.f874h = KeyEvent.normalizeMetaState(i10);
        this.f875i = Character.toLowerCase(c11);
        this.f876j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
