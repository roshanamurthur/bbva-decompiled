package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Delegate f508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DrawerLayout f509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DrawerArrowDrawable f510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View.OnClickListener f517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f518k;

    public interface Delegate {
        Context getActionBarThemedContext();

        Drawable getThemeUpIndicator();

        boolean isNavigationVisible();

        void setActionBarDescription(@StringRes int i10);

        void setActionBarUpIndicator(Drawable drawable, @StringRes int i10);
    }

    public interface DelegateProvider {
        @Nullable
        Delegate getDrawerToggleDelegate();
    }

    public static class a implements Delegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f519a;

        public a(Activity activity) {
            this.f519a = activity;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Context getActionBarThemedContext() {
            Activity activity = this.f519a;
            android.app.ActionBar actionBar = activity.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : activity;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Drawable getThemeUpIndicator() {
            TypedArray typedArrayObtainStyledAttributes = getActionBarThemedContext().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final boolean isNavigationVisible() {
            android.app.ActionBar actionBar = this.f519a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void setActionBarDescription(int i10) {
            android.app.ActionBar actionBar = this.f519a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void setActionBarUpIndicator(Drawable drawable, int i10) {
            android.app.ActionBar actionBar = this.f519a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }
    }

    public static class b implements Delegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Toolbar f520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Drawable f521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f522c;

        public b(Toolbar toolbar) {
            this.f520a = toolbar;
            this.f521b = toolbar.getNavigationIcon();
            this.f522c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Context getActionBarThemedContext() {
            return this.f520a.getContext();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Drawable getThemeUpIndicator() {
            return this.f521b;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final boolean isNavigationVisible() {
            return true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void setActionBarDescription(@StringRes int i10) {
            Toolbar toolbar = this.f520a;
            if (i10 == 0) {
                toolbar.setNavigationContentDescription(this.f522c);
            } else {
                toolbar.setNavigationContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void setActionBarUpIndicator(Drawable drawable, @StringRes int i10) {
            this.f520a.setNavigationIcon(drawable);
            setActionBarDescription(i10);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, @StringRes int i10, @StringRes int i11) {
        this(activity, (Toolbar) null, drawerLayout, i10, i11);
    }

    public final void a(Drawable drawable, int i10) {
        boolean z10 = this.f518k;
        Delegate delegate = this.f508a;
        if (!z10 && !delegate.isNavigationVisible()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f518k = true;
        }
        delegate.setActionBarUpIndicator(drawable, i10);
    }

    public final void b(float f6) {
        if (f6 == 1.0f) {
            this.f510c.setVerticalMirror(true);
        } else if (f6 == 0.0f) {
            this.f510c.setVerticalMirror(false);
        }
        this.f510c.setProgress(f6);
    }

    @NonNull
    public DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.f510c;
    }

    public View.OnClickListener getToolbarNavigationClickListener() {
        return this.f517j;
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.f513f;
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.f511d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f514g) {
            this.f512e = this.f508a.getThemeUpIndicator();
        }
        syncState();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        b(0.0f);
        if (this.f513f) {
            this.f508a.setActionBarDescription(this.f515h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        b(1.0f);
        if (this.f513f) {
            this.f508a.setActionBarDescription(this.f516i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f6) {
        if (this.f511d) {
            b(Math.min(1.0f, Math.max(0.0f, f6)));
        } else {
            b(0.0f);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f513f) {
            return false;
        }
        DrawerLayout drawerLayout = this.f509b;
        int drawerLockMode = drawerLayout.getDrawerLockMode(GravityCompat.START);
        if (drawerLayout.isDrawerVisible(GravityCompat.START) && drawerLockMode != 2) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else if (drawerLockMode != 1) {
            drawerLayout.openDrawer(GravityCompat.START);
        }
        return true;
    }

    public void setDrawerArrowDrawable(@NonNull DrawerArrowDrawable drawerArrowDrawable) {
        this.f510c = drawerArrowDrawable;
        syncState();
    }

    public void setDrawerIndicatorEnabled(boolean z10) {
        if (z10 != this.f513f) {
            if (z10) {
                a(this.f510c, this.f509b.isDrawerOpen(GravityCompat.START) ? this.f516i : this.f515h);
            } else {
                a(this.f512e, 0);
            }
            this.f513f = z10;
        }
    }

    public void setDrawerSlideAnimationEnabled(boolean z10) {
        this.f511d = z10;
        if (z10) {
            return;
        }
        b(0.0f);
    }

    public void setHomeAsUpIndicator(int i10) {
        setHomeAsUpIndicator(i10 != 0 ? this.f509b.getResources().getDrawable(i10) : null);
    }

    public void setToolbarNavigationClickListener(View.OnClickListener onClickListener) {
        this.f517j = onClickListener;
    }

    public void syncState() {
        DrawerLayout drawerLayout = this.f509b;
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            b(1.0f);
        } else {
            b(0.0f);
        }
        if (this.f513f) {
            a(this.f510c, drawerLayout.isDrawerOpen(GravityCompat.START) ? this.f516i : this.f515h);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @StringRes int i10, @StringRes int i11) {
        this(activity, toolbar, drawerLayout, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarDrawerToggle(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, @StringRes int i10, @StringRes int i11) {
        this.f511d = true;
        this.f513f = true;
        this.f518k = false;
        if (toolbar != null) {
            this.f508a = new b(toolbar);
            toolbar.setNavigationOnClickListener(new androidx.appcompat.app.a(this));
        } else if (activity instanceof DelegateProvider) {
            this.f508a = ((DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            this.f508a = new a(activity);
        }
        this.f509b = drawerLayout;
        this.f515h = i10;
        this.f516i = i11;
        this.f510c = new DrawerArrowDrawable(this.f508a.getActionBarThemedContext());
        this.f512e = this.f508a.getThemeUpIndicator();
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.f512e = this.f508a.getThemeUpIndicator();
            this.f514g = false;
        } else {
            this.f512e = drawable;
            this.f514g = true;
        }
        if (this.f513f) {
            return;
        }
        a(this.f512e, 0);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i10) {
    }
}
