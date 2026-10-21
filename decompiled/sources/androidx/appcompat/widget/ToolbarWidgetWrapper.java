package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ToolbarWidgetWrapper implements DecorToolbar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f1556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScrollingTabContainerView f1558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatSpinner f1559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f1560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f1563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f1567l;
    public Window.Callback m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionMenuPresenter f1569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f1572r;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ActionMenuItem f1573p0;

        public a() {
            this.f1573p0 = new ActionMenuItem(ToolbarWidgetWrapper.this.f1556a.getContext(), 0, R.id.home, 0, 0, ToolbarWidgetWrapper.this.f1565j);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
            Window.Callback callback = toolbarWidgetWrapper.m;
            if (callback == null || !toolbarWidgetWrapper.f1568n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1573p0);
        }
    }

    public class b extends ViewPropertyAnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1575a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1576b;

        public b(int i10) {
            this.f1576b = i10;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationCancel(View view) {
            this.f1575a = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            if (this.f1575a) {
                return;
            }
            ToolbarWidgetWrapper.this.f1556a.setVisibility(this.f1576b);
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart(View view) {
            ToolbarWidgetWrapper.this.f1556a.setVisibility(0);
        }
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, androidx.appcompat.R.string.abc_action_bar_up_description, androidx.appcompat.R.drawable.abc_ic_ab_back_material);
    }

    public final void a() {
        if (this.f1559d == null) {
            this.f1559d = new AppCompatSpinner(getContext(), null, androidx.appcompat.R.attr.actionDropDownStyle);
            this.f1559d.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void animateToVisibility(int i10) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = setupAnimatorToVisibility(i10, 200L);
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.start();
        }
    }

    public final void b() {
        if ((this.f1557b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f1567l);
            Toolbar toolbar = this.f1556a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f1571q);
            } else {
                toolbar.setNavigationContentDescription(this.f1567l);
            }
        }
    }

    public final void c() {
        int i10 = this.f1557b & 4;
        Toolbar toolbar = this.f1556a;
        if (i10 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        Drawable drawable = this.f1563h;
        if (drawable == null) {
            drawable = this.f1572r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
        return this.f1556a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
        this.f1556a.collapseActionView();
    }

    public final void d() {
        Drawable drawable;
        int i10 = this.f1557b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1562g) == null) {
            drawable = this.f1561f;
        }
        this.f1556a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void dismissPopupMenus() {
        this.f1556a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public Context getContext() {
        return this.f1556a.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public View getCustomView() {
        return this.f1560e;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDisplayOptions() {
        return this.f1557b;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownItemCount() {
        AppCompatSpinner appCompatSpinner = this.f1559d;
        if (appCompatSpinner != null) {
            return appCompatSpinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
        AppCompatSpinner appCompatSpinner = this.f1559d;
        if (appCompatSpinner != null) {
            return appCompatSpinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
        return this.f1556a.getHeight();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public Menu getMenu() {
        return this.f1556a.getMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getNavigationMode() {
        return this.f1570p;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public CharSequence getSubtitle() {
        return this.f1556a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public CharSequence getTitle() {
        return this.f1556a.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public ViewGroup getViewGroup() {
        return this.f1556a;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
        return this.f1556a.getVisibility();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
        return this.f1558c != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasExpandedActionView() {
        return this.f1556a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasIcon() {
        return this.f1561f != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasLogo() {
        return this.f1562g != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hideOverflowMenu() {
        return this.f1556a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
        return this.f1556a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
        return this.f1556a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isTitleTruncated() {
        return this.f1556a.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f1556a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f1556a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setBackgroundDrawable(Drawable drawable) {
        this.f1556a.setBackground(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCollapsible(boolean z10) {
        this.f1556a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCustomView(View view) {
        View view2 = this.f1560e;
        Toolbar toolbar = this.f1556a;
        if (view2 != null && (this.f1557b & 16) != 0) {
            toolbar.removeView(view2);
        }
        this.f1560e = view;
        if (view == null || (this.f1557b & 16) == 0) {
            return;
        }
        toolbar.addView(view);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int i10) {
        if (i10 == this.f1571q) {
            return;
        }
        this.f1571q = i10;
        if (TextUtils.isEmpty(this.f1556a.getNavigationContentDescription())) {
            setNavigationContentDescription(this.f1571q);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.f1572r != drawable) {
            this.f1572r = drawable;
            c();
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDisplayOptions(int i10) {
        View view;
        int i11 = this.f1557b ^ i10;
        this.f1557b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                c();
            }
            if ((i11 & 3) != 0) {
                d();
            }
            int i12 = i11 & 8;
            Toolbar toolbar = this.f1556a;
            if (i12 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f1565j);
                    toolbar.setSubtitle(this.f1566k);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1560e) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        a();
        this.f1559d.setAdapter(spinnerAdapter);
        this.f1559d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownSelectedPosition(int i10) {
        AppCompatSpinner appCompatSpinner = this.f1559d;
        if (appCompatSpinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        appCompatSpinner.setSelection(i10);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f1558c;
        Toolbar toolbar = this.f1556a;
        if (scrollingTabContainerView2 != null && scrollingTabContainerView2.getParent() == toolbar) {
            toolbar.removeView(this.f1558c);
        }
        this.f1558c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f1570p != 2) {
            return;
        }
        toolbar.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1558c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.gravity = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int i10) {
        setLogo(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        ActionMenuPresenter actionMenuPresenter = this.f1569o;
        Toolbar toolbar = this.f1556a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.f1569o = actionMenuPresenter2;
            actionMenuPresenter2.setId(androidx.appcompat.R.id.action_menu_presenter);
        }
        this.f1569o.setCallback(callback);
        toolbar.setMenu((MenuBuilder) menu, this.f1569o);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.f1556a.setMenuCallbacks(callback, callback2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuPrepared() {
        this.f1568n = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(CharSequence charSequence) {
        this.f1567l = charSequence;
        b();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(Drawable drawable) {
        this.f1563h = drawable;
        c();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationMode(int i10) {
        ScrollingTabContainerView scrollingTabContainerView;
        int i11 = this.f1570p;
        if (i10 != i11) {
            Toolbar toolbar = this.f1556a;
            if (i11 == 1) {
                AppCompatSpinner appCompatSpinner = this.f1559d;
                if (appCompatSpinner != null && appCompatSpinner.getParent() == toolbar) {
                    toolbar.removeView(this.f1559d);
                }
            } else if (i11 == 2 && (scrollingTabContainerView = this.f1558c) != null && scrollingTabContainerView.getParent() == toolbar) {
                toolbar.removeView(this.f1558c);
            }
            this.f1570p = i10;
            if (i10 != 0) {
                if (i10 == 1) {
                    a();
                    toolbar.addView(this.f1559d, 0);
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(g0.c("Invalid navigation mode ", i10));
                    }
                    ScrollingTabContainerView scrollingTabContainerView2 = this.f1558c;
                    if (scrollingTabContainerView2 != null) {
                        toolbar.addView(scrollingTabContainerView2, 0);
                        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1558c.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                        layoutParams.gravity = 8388691;
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setSubtitle(CharSequence charSequence) {
        this.f1566k = charSequence;
        if ((this.f1557b & 8) != 0) {
            this.f1556a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setTitle(CharSequence charSequence) {
        this.f1564i = true;
        this.f1565j = charSequence;
        if ((this.f1557b & 8) != 0) {
            Toolbar toolbar = this.f1556a;
            toolbar.setTitle(charSequence);
            if (this.f1564i) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int i10) {
        this.f1556a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(Window.Callback callback) {
        this.m = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1564i) {
            return;
        }
        this.f1565j = charSequence;
        if ((this.f1557b & 8) != 0) {
            Toolbar toolbar = this.f1556a;
            toolbar.setTitle(charSequence);
            if (this.f1564i) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i10, long j10) {
        return ViewCompat.animate(this.f1556a).alpha(i10 == 0 ? 1.0f : 0.0f).setDuration(j10).setListener(new b(i10));
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean showOverflowMenu() {
        return this.f1556a.showOverflowMenu();
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z10, int i10, int i11) {
        int i12;
        Drawable drawable;
        this.f1570p = 0;
        this.f1571q = 0;
        this.f1556a = toolbar;
        this.f1565j = toolbar.getTitle();
        this.f1566k = toolbar.getSubtitle();
        this.f1564i = this.f1565j != null;
        this.f1563h = toolbar.getNavigationIcon();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        this.f1572r = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_homeAsUpIndicator);
        if (z10) {
            CharSequence text = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_logo);
            if (drawable2 != null) {
                setLogo(drawable2);
            }
            Drawable drawable3 = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_icon);
            if (drawable3 != null) {
                setIcon(drawable3);
            }
            if (this.f1563h == null && (drawable = this.f1572r) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ActionBar_displayOptions, 0));
            int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false));
                setDisplayOptions(this.f1557b | 16);
            }
            int layoutDimension = tintTypedArrayObtainStyledAttributes.getLayoutDimension(androidx.appcompat.R.styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f1572r = toolbar.getNavigationIcon();
                i12 = 15;
            } else {
                i12 = 11;
            }
            this.f1557b = i12;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i10);
        this.f1567l = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(Drawable drawable) {
        this.f1561f = drawable;
        d();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(Drawable drawable) {
        this.f1562g = drawable;
        d();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(int i10) {
        setNavigationIcon(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initIndeterminateProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean z10) {
    }
}
