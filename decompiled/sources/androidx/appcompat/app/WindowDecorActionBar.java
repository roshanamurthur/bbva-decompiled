package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    public static final AccelerateInterpolator F = new AccelerateInterpolator();
    public static final DecelerateInterpolator G = new DecelerateInterpolator();
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DecorToolbar f650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScrollingTabContainerView f653i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TabImpl f655k;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ActionModeImpl f657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionModeImpl f658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ActionMode.Callback f659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f660q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f662s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f665v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f667x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewPropertyAnimatorCompatSet f669z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<TabImpl> f654j = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f656l = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<ActionBar.OnMenuVisibilityListener> f661r = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f663t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f664u = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f668y = true;
    public final a C = new a();
    public final b D = new b();
    public final c E = new c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Context f670r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final MenuBuilder f671s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public ActionMode.Callback f672t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public WeakReference<View> f673u0;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.f670r0 = context;
            this.f672t0 = callback;
            MenuBuilder defaultShowAsAction = new MenuBuilder(context).setDefaultShowAsAction(1);
            this.f671s0 = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        public boolean dispatchOnCreate() {
            MenuBuilder menuBuilder = this.f671s0;
            menuBuilder.stopDispatchingItemsChanged();
            try {
                return this.f672t0.onCreateActionMode(this, menuBuilder);
            } finally {
                menuBuilder.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public void finish() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f657n != this) {
                return;
            }
            boolean z10 = windowDecorActionBar.f665v;
            boolean z11 = windowDecorActionBar.f666w;
            if (z10 || z11) {
                windowDecorActionBar.f658o = this;
                windowDecorActionBar.f659p = this.f672t0;
            } else {
                this.f672t0.onDestroyActionMode(this);
            }
            this.f672t0 = null;
            windowDecorActionBar.animateToMode(false);
            windowDecorActionBar.f651g.closeMode();
            windowDecorActionBar.f648d.setHideOnContentScrollEnabled(windowDecorActionBar.B);
            windowDecorActionBar.f657n = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public View getCustomView() {
            WeakReference<View> weakReference = this.f673u0;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public Menu getMenu() {
            return this.f671s0;
        }

        @Override // androidx.appcompat.view.ActionMode
        public MenuInflater getMenuInflater() {
            return new SupportMenuInflater(this.f670r0);
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence getSubtitle() {
            return WindowDecorActionBar.this.f651g.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence getTitle() {
            return WindowDecorActionBar.this.f651g.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void invalidate() {
            if (WindowDecorActionBar.this.f657n != this) {
                return;
            }
            MenuBuilder menuBuilder = this.f671s0;
            menuBuilder.stopDispatchingItemsChanged();
            try {
                this.f672t0.onPrepareActionMode(this, menuBuilder);
            } finally {
                menuBuilder.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean isTitleOptional() {
            return WindowDecorActionBar.this.f651g.isTitleOptional();
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            ActionMode.Callback callback = this.f672t0;
            if (callback != null) {
                return callback.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            if (this.f672t0 == null) {
                return;
            }
            invalidate();
            WindowDecorActionBar.this.f651g.showOverflowMenu();
        }

        public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            if (this.f672t0 == null) {
                return false;
            }
            if (!subMenuBuilder.hasVisibleItems()) {
                return true;
            }
            new MenuPopupHelper(WindowDecorActionBar.this.getThemedContext(), subMenuBuilder).show();
            return true;
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setCustomView(View view) {
            WindowDecorActionBar.this.f651g.setCustomView(view);
            this.f673u0 = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(CharSequence charSequence) {
            WindowDecorActionBar.this.f651g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(CharSequence charSequence) {
            WindowDecorActionBar.this.f651g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitleOptionalHint(boolean z10) {
            super.setTitleOptionalHint(z10);
            WindowDecorActionBar.this.f651g.setTitleOptional(z10);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(int i10) {
            setSubtitle(WindowDecorActionBar.this.f645a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(int i10) {
            setTitle(WindowDecorActionBar.this.f645a.getResources().getString(i10));
        }

        public void onCloseSubMenu(SubMenuBuilder subMenuBuilder) {
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class TabImpl extends ActionBar.Tab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActionBar.TabListener f674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Drawable f676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f679f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f680g;

        public TabImpl() {
        }

        public ActionBar.TabListener getCallback() {
            return this.f674a;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public CharSequence getContentDescription() {
            return this.f678e;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public View getCustomView() {
            return this.f680g;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public Drawable getIcon() {
            return this.f676c;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public int getPosition() {
            return this.f679f;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public Object getTag() {
            return this.f675b;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public CharSequence getText() {
            return this.f677d;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public void select() {
            WindowDecorActionBar.this.selectTab(this);
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setContentDescription(int i10) {
            return setContentDescription(WindowDecorActionBar.this.f645a.getResources().getText(i10));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setCustomView(View view) {
            this.f680g = view;
            int i10 = this.f679f;
            if (i10 >= 0) {
                WindowDecorActionBar.this.f653i.updateTab(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setIcon(Drawable drawable) {
            this.f676c = drawable;
            int i10 = this.f679f;
            if (i10 >= 0) {
                WindowDecorActionBar.this.f653i.updateTab(i10);
            }
            return this;
        }

        public void setPosition(int i10) {
            this.f679f = i10;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setTabListener(ActionBar.TabListener tabListener) {
            this.f674a = tabListener;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setTag(Object obj) {
            this.f675b = obj;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setText(CharSequence charSequence) {
            this.f677d = charSequence;
            int i10 = this.f679f;
            if (i10 >= 0) {
                WindowDecorActionBar.this.f653i.updateTab(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setContentDescription(CharSequence charSequence) {
            this.f678e = charSequence;
            int i10 = this.f679f;
            if (i10 >= 0) {
                WindowDecorActionBar.this.f653i.updateTab(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setCustomView(int i10) {
            return setCustomView(LayoutInflater.from(WindowDecorActionBar.this.getThemedContext()).inflate(i10, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setIcon(int i10) {
            return setIcon(AppCompatResources.getDrawable(WindowDecorActionBar.this.f645a, i10));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setText(int i10) {
            return setText(WindowDecorActionBar.this.f645a.getResources().getText(i10));
        }
    }

    public class a extends ViewPropertyAnimatorListenerAdapter {
        public a() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            View view2;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f664u && (view2 = windowDecorActionBar.f652h) != null) {
                view2.setTranslationY(0.0f);
                windowDecorActionBar.f649e.setTranslationY(0.0f);
            }
            windowDecorActionBar.f649e.setVisibility(8);
            windowDecorActionBar.f649e.setTransitioning(false);
            windowDecorActionBar.f669z = null;
            ActionMode.Callback callback = windowDecorActionBar.f659p;
            if (callback != null) {
                callback.onDestroyActionMode(windowDecorActionBar.f658o);
                windowDecorActionBar.f658o = null;
                windowDecorActionBar.f659p = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = windowDecorActionBar.f648d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.requestApplyInsets(actionBarOverlayLayout);
            }
        }
    }

    public class b extends ViewPropertyAnimatorListenerAdapter {
        public b() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.f669z = null;
            windowDecorActionBar.f649e.requestLayout();
        }
    }

    public class c implements ViewPropertyAnimatorUpdateListener {
        public c() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
        public final void onAnimationUpdate(View view) {
            ((View) WindowDecorActionBar.this.f649e.getParent()).invalidate();
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z10) {
        this.f647c = activity;
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (z10) {
            return;
        }
        this.f652h = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.f661r.add(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab) {
        addTab(tab, this.f654j.isEmpty());
    }

    public void animateToMode(boolean z10) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z10) {
            if (!this.f667x) {
                this.f667x = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f648d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (this.f667x) {
            this.f667x = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f648d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        if (!this.f649e.isLaidOut()) {
            if (z10) {
                this.f650f.setVisibility(4);
                this.f651g.setVisibility(0);
                return;
            } else {
                this.f650f.setVisibility(0);
                this.f651g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            viewPropertyAnimatorCompat2 = this.f650f.setupAnimatorToVisibility(4, 100L);
            viewPropertyAnimatorCompat = this.f651g.setupAnimatorToVisibility(0, 200L);
        } else {
            viewPropertyAnimatorCompat = this.f650f.setupAnimatorToVisibility(0, 200L);
            viewPropertyAnimatorCompat2 = this.f651g.setupAnimatorToVisibility(8, 100L);
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        viewPropertyAnimatorCompatSet.playSequentially(viewPropertyAnimatorCompat2, viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompatSet.start();
    }

    public final void b(ActionBar.Tab tab, int i10) {
        TabImpl tabImpl = (TabImpl) tab;
        if (tabImpl.getCallback() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        tabImpl.setPosition(i10);
        ArrayList<TabImpl> arrayList = this.f654j;
        arrayList.add(i10, tabImpl);
        int size = arrayList.size();
        while (true) {
            i10++;
            if (i10 >= size) {
                return;
            } else {
                arrayList.get(i10).setPosition(i10);
            }
        }
    }

    public final void c() {
        if (this.f653i != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.f645a);
        if (this.f662s) {
            scrollingTabContainerView.setVisibility(0);
            this.f650f.setEmbeddedTabView(scrollingTabContainerView);
        } else {
            if (getNavigationMode() == 2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f648d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.f649e.setTabContainer(scrollingTabContainerView);
        }
        this.f653i = scrollingTabContainerView;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        DecorToolbar decorToolbar = this.f650f;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.f650f.collapseActionView();
        return true;
    }

    public final void d(View view) {
        DecorToolbar wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(androidx.appcompat.R.id.decor_content_parent);
        this.f648d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(androidx.appcompat.R.id.action_bar);
        if (callbackFindViewById instanceof DecorToolbar) {
            wrapper = (DecorToolbar) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : AbstractJsonLexerKt.NULL));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f650f = wrapper;
        this.f651g = (ActionBarContextView) view.findViewById(androidx.appcompat.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(androidx.appcompat.R.id.action_bar_container);
        this.f649e = actionBarContainer;
        DecorToolbar decorToolbar = this.f650f;
        if (decorToolbar == null || this.f651g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f645a = decorToolbar.getContext();
        boolean z10 = (this.f650f.getDisplayOptions() & 4) != 0;
        if (z10) {
            this.m = true;
        }
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(this.f645a);
        setHomeButtonEnabled(actionBarPolicy.enableHomeButtonByDefault() || z10);
        e(actionBarPolicy.hasEmbeddedTabs());
        TypedArray typedArrayObtainStyledAttributes = this.f645a.obtainStyledAttributes(null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.ActionBar_hideOnContentScroll, false)) {
            setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z10) {
        if (z10 == this.f660q) {
            return;
        }
        this.f660q = z10;
        ArrayList<ActionBar.OnMenuVisibilityListener> arrayList = this.f661r;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    public void doHide(boolean z10) {
        View view;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f669z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        int i10 = this.f663t;
        a aVar = this.C;
        if (i10 != 0 || (!this.A && !z10)) {
            aVar.onAnimationEnd(null);
            return;
        }
        this.f649e.setAlpha(1.0f);
        this.f649e.setTransitioning(true);
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
        float f6 = -this.f649e.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f649e.getLocationInWindow(iArr);
            f6 -= iArr[1];
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatTranslationY = ViewCompat.animate(this.f649e).translationY(f6);
        viewPropertyAnimatorCompatTranslationY.setUpdateListener(this.E);
        viewPropertyAnimatorCompatSet2.play(viewPropertyAnimatorCompatTranslationY);
        if (this.f664u && (view = this.f652h) != null) {
            viewPropertyAnimatorCompatSet2.play(ViewCompat.animate(view).translationY(f6));
        }
        viewPropertyAnimatorCompatSet2.setInterpolator(F);
        viewPropertyAnimatorCompatSet2.setDuration(250L);
        viewPropertyAnimatorCompatSet2.setListener(aVar);
        this.f669z = viewPropertyAnimatorCompatSet2;
        viewPropertyAnimatorCompatSet2.start();
    }

    public void doShow(boolean z10) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f669z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        this.f649e.setVisibility(0);
        int i10 = this.f663t;
        View view = this.f652h;
        b bVar = this.D;
        if (i10 == 0 && (this.A || z10)) {
            this.f649e.setTranslationY(0.0f);
            float f6 = -this.f649e.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f649e.getLocationInWindow(iArr);
                f6 -= iArr[1];
            }
            this.f649e.setTranslationY(f6);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatTranslationY = ViewCompat.animate(this.f649e).translationY(0.0f);
            viewPropertyAnimatorCompatTranslationY.setUpdateListener(this.E);
            viewPropertyAnimatorCompatSet2.play(viewPropertyAnimatorCompatTranslationY);
            if (this.f664u && view != null) {
                view.setTranslationY(f6);
                viewPropertyAnimatorCompatSet2.play(ViewCompat.animate(view).translationY(0.0f));
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(G);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(bVar);
            this.f669z = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
        } else {
            this.f649e.setAlpha(1.0f);
            this.f649e.setTranslationY(0.0f);
            if (this.f664u && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f648d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    public final void e(boolean z10) {
        this.f662s = z10;
        if (z10) {
            this.f649e.setTabContainer(null);
            this.f650f.setEmbeddedTabView(this.f653i);
        } else {
            this.f650f.setEmbeddedTabView(null);
            this.f649e.setTabContainer(this.f653i);
        }
        boolean z11 = getNavigationMode() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f653i;
        if (scrollingTabContainerView != null) {
            if (z11) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f648d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f650f.setCollapsible(!this.f662s && z11);
        this.f648d.setHasNonEmbeddedTabs(!this.f662s && z11);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z10) {
        this.f664u = z10;
    }

    public final void f(boolean z10) {
        boolean z11 = this.f665v;
        boolean z12 = this.f666w;
        if (!this.f667x && (z11 || z12)) {
            if (this.f668y) {
                this.f668y = false;
                doHide(z10);
                return;
            }
            return;
        }
        if (this.f668y) {
            return;
        }
        this.f668y = true;
        doShow(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public View getCustomView() {
        return this.f650f.getCustomView();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.f650f.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return ViewCompat.getElevation(this.f649e);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.f649e.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHideOffset() {
        return this.f648d.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        int navigationMode = this.f650f.getNavigationMode();
        if (navigationMode == 1) {
            return this.f650f.getDropdownItemCount();
        }
        if (navigationMode != 2) {
            return 0;
        }
        return this.f654j.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return this.f650f.getNavigationMode();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        TabImpl tabImpl;
        int navigationMode = this.f650f.getNavigationMode();
        if (navigationMode == 1) {
            return this.f650f.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (tabImpl = this.f655k) != null) {
            return tabImpl.getPosition();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab getSelectedTab() {
        return this.f655k;
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getSubtitle() {
        return this.f650f.getSubtitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab getTabAt(int i10) {
        return this.f654j.get(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return this.f654j.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context getThemedContext() {
        if (this.f646b == null) {
            TypedValue typedValue = new TypedValue();
            this.f645a.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f646b = new ContextThemeWrapper(this.f645a, i10);
            } else {
                this.f646b = this.f645a;
            }
        }
        return this.f646b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getTitle() {
        return this.f650f.getTitle();
    }

    public boolean hasIcon() {
        return this.f650f.hasIcon();
    }

    public boolean hasLogo() {
        return this.f650f.hasLogo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        if (this.f665v) {
            return;
        }
        this.f665v = true;
        f(false);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.f666w) {
            return;
        }
        this.f666w = true;
        f(true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
        return this.f648d.isHideOnContentScrollEnabled();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        int height = getHeight();
        return this.f668y && (height == 0 || getHideOffset() < height);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        DecorToolbar decorToolbar = this.f650f;
        return decorToolbar != null && decorToolbar.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab newTab() {
        return new TabImpl();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(Configuration configuration) {
        e(ActionBarPolicy.get(this.f645a).hasEmbeddedTabs());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f669z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
            this.f669z = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int i10, KeyEvent keyEvent) {
        Menu menu;
        ActionModeImpl actionModeImpl = this.f657n;
        if (actionModeImpl == null || (menu = actionModeImpl.getMenu()) == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i10) {
        this.f663t = i10;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        if (this.f655k != null) {
            selectTab(null);
        }
        this.f654j.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.f653i;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.removeAllTabs();
        }
        this.f656l = -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.f661r.remove(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(ActionBar.Tab tab) {
        removeTabAt(tab.getPosition());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i10) {
        if (this.f653i == null) {
            return;
        }
        TabImpl tabImpl = this.f655k;
        int position = tabImpl != null ? tabImpl.getPosition() : this.f656l;
        this.f653i.removeTabAt(i10);
        ArrayList<TabImpl> arrayList = this.f654j;
        TabImpl tabImplRemove = arrayList.remove(i10);
        if (tabImplRemove != null) {
            tabImplRemove.setPosition(-1);
        }
        int size = arrayList.size();
        for (int i11 = i10; i11 < size; i11++) {
            arrayList.get(i11).setPosition(i11);
        }
        if (position == i10) {
            selectTab(arrayList.isEmpty() ? null : arrayList.get(Math.max(0, i10 - 1)));
        }
    }

    public boolean requestFocus() {
        ViewGroup viewGroup = this.f650f.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(ActionBar.Tab tab) {
        if (getNavigationMode() != 2) {
            this.f656l = tab != null ? tab.getPosition() : -1;
            return;
        }
        Activity activity = this.f647c;
        FragmentTransaction fragmentTransactionDisallowAddToBackStack = (!(activity instanceof FragmentActivity) || this.f650f.getViewGroup().isInEditMode()) ? null : ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        TabImpl tabImpl = this.f655k;
        if (tabImpl != tab) {
            this.f653i.setTabSelected(tab != null ? tab.getPosition() : -1);
            TabImpl tabImpl2 = this.f655k;
            if (tabImpl2 != null) {
                tabImpl2.getCallback().onTabUnselected(this.f655k, fragmentTransactionDisallowAddToBackStack);
            }
            TabImpl tabImpl3 = (TabImpl) tab;
            this.f655k = tabImpl3;
            if (tabImpl3 != null) {
                tabImpl3.getCallback().onTabSelected(this.f655k, fragmentTransactionDisallowAddToBackStack);
            }
        } else if (tabImpl != null) {
            tabImpl.getCallback().onTabReselected(this.f655k, fragmentTransactionDisallowAddToBackStack);
            this.f653i.animateToTab(tab.getPosition());
        }
        if (fragmentTransactionDisallowAddToBackStack == null || fragmentTransactionDisallowAddToBackStack.isEmpty()) {
            return;
        }
        fragmentTransactionDisallowAddToBackStack.commit();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(Drawable drawable) {
        this.f649e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i10) {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i10, this.f650f.getViewGroup(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z10) {
        if (this.m) {
            return;
        }
        setDisplayHomeAsUpEnabled(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z10) {
        setDisplayOptions(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i10) {
        if ((i10 & 4) != 0) {
            this.m = true;
        }
        this.f650f.setDisplayOptions(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z10) {
        setDisplayOptions(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z10) {
        setDisplayOptions(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z10) {
        setDisplayOptions(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z10) {
        setDisplayOptions(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float f6) {
        ViewCompat.setElevation(this.f649e, f6);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOffset(int i10) {
        if (i10 != 0 && !this.f648d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f648d.setActionBarHideOffset(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 && !this.f648d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z10;
        this.f648d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f650f.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f650f.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z10) {
        this.f650f.setHomeButtonEnabled(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i10) {
        this.f650f.setIcon(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, ActionBar.OnNavigationListener onNavigationListener) {
        this.f650f.setDropdownParams(spinnerAdapter, new c0(onNavigationListener));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i10) {
        this.f650f.setLogo(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i10) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int navigationMode = this.f650f.getNavigationMode();
        if (navigationMode == 2) {
            this.f656l = getSelectedNavigationIndex();
            selectTab(null);
            this.f653i.setVisibility(8);
        }
        if (navigationMode != i10 && !this.f662s && (actionBarOverlayLayout = this.f648d) != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
        this.f650f.setNavigationMode(i10);
        boolean z10 = false;
        if (i10 == 2) {
            c();
            this.f653i.setVisibility(0);
            int i11 = this.f656l;
            if (i11 != -1) {
                setSelectedNavigationItem(i11);
                this.f656l = -1;
            }
        }
        this.f650f.setCollapsible(i10 == 2 && !this.f662s);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f648d;
        if (i10 == 2 && !this.f662s) {
            z10 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i10) {
        int navigationMode = this.f650f.getNavigationMode();
        if (navigationMode == 1) {
            this.f650f.setDropdownSelectedPosition(i10);
        } else {
            if (navigationMode != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            selectTab(this.f654j.get(i10));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z10) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.A = z10;
        if (z10 || (viewPropertyAnimatorCompatSet = this.f669z) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.cancel();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(Drawable drawable) {
        this.f649e.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i10) {
        setSubtitle(this.f645a.getString(i10));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i10) {
        setTitle(this.f645a.getString(i10));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(CharSequence charSequence) {
        this.f650f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        if (this.f665v) {
            this.f665v = false;
            f(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.f666w) {
            this.f666w = false;
            f(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.f657n;
        if (actionModeImpl != null) {
            actionModeImpl.finish();
        }
        this.f648d.setHideOnContentScrollEnabled(false);
        this.f651g.killMode();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.f651g.getContext(), callback);
        if (!actionModeImpl2.dispatchOnCreate()) {
            return null;
        }
        this.f657n = actionModeImpl2;
        actionModeImpl2.invalidate();
        this.f651g.initForMode(actionModeImpl2);
        animateToMode(true);
        return actionModeImpl2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, int i10) {
        addTab(tab, i10, this.f654j.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int i10) {
        this.f650f.setNavigationContentDescription(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int i10) {
        this.f650f.setNavigationIcon(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(Drawable drawable) {
        this.f650f.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(Drawable drawable) {
        this.f650f.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(CharSequence charSequence) {
        this.f650f.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(CharSequence charSequence) {
        this.f650f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, boolean z10) {
        c();
        this.f653i.addTab(tab, z10);
        b(tab, this.f654j.size());
        if (z10) {
            selectTab(tab);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i10, int i11) {
        int displayOptions = this.f650f.getDisplayOptions();
        if ((i11 & 4) != 0) {
            this.m = true;
        }
        this.f650f.setDisplayOptions((i10 & i11) | ((~i11) & displayOptions));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view) {
        this.f650f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f650f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, int i10, boolean z10) {
        c();
        this.f653i.addTab(tab, i10, z10);
        b(tab, i10);
        if (z10) {
            selectTab(tab);
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        d(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public WindowDecorActionBar(View view) {
        d(view);
    }
}
