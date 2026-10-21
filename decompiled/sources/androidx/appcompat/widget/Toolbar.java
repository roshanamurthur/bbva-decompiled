package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements MenuHost {
    public int E0;
    public int F0;
    public int G0;
    public final int H0;
    public final int I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public j1 N0;
    public int O0;
    public int P0;
    public final int Q0;
    public CharSequence R0;
    public CharSequence S0;
    public ColorStateList T0;
    public ColorStateList U0;
    public boolean V0;
    public boolean W0;
    public final ArrayList<View> X0;
    public final ArrayList<View> Y0;
    public final int[] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final MenuHostHelper f1503a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public ArrayList<MenuItem> f1504b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public OnMenuItemClickListener f1505c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final a f1506d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public ToolbarWidgetWrapper f1507e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public ActionMenuPresenter f1508f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public f f1509g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public MenuPresenter.Callback f1510h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public MenuBuilder.Callback f1511i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f1512j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public OnBackInvokedCallback f1513k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public OnBackInvokedDispatcher f1514l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f1515m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final b f1516n1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ActionMenuView f1517p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AppCompatTextView f1518q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AppCompatTextView f1519r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AppCompatImageButton f1520s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AppCompatImageView f1521t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Drawable f1522u0;
    public final CharSequence v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public AppCompatImageButton f1523w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public View f1524x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Context f1525y0;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1526a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1533h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1534i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1537l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1538n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1539o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1540p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1541q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1542r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1543s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1544t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1545u;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1527b = propertyMapper.mapObject("collapseContentDescription", R.attr.collapseContentDescription);
            this.f1528c = propertyMapper.mapObject("collapseIcon", R.attr.collapseIcon);
            this.f1529d = propertyMapper.mapInt("contentInsetEnd", R.attr.contentInsetEnd);
            this.f1530e = propertyMapper.mapInt("contentInsetEndWithActions", R.attr.contentInsetEndWithActions);
            this.f1531f = propertyMapper.mapInt("contentInsetLeft", R.attr.contentInsetLeft);
            this.f1532g = propertyMapper.mapInt("contentInsetRight", R.attr.contentInsetRight);
            this.f1533h = propertyMapper.mapInt("contentInsetStart", R.attr.contentInsetStart);
            this.f1534i = propertyMapper.mapInt("contentInsetStartWithNavigation", R.attr.contentInsetStartWithNavigation);
            this.f1535j = propertyMapper.mapObject("logo", R.attr.logo);
            this.f1536k = propertyMapper.mapObject("logoDescription", R.attr.logoDescription);
            this.f1537l = propertyMapper.mapObject("menu", R.attr.menu);
            this.m = propertyMapper.mapObject("navigationContentDescription", R.attr.navigationContentDescription);
            this.f1538n = propertyMapper.mapObject("navigationIcon", R.attr.navigationIcon);
            this.f1539o = propertyMapper.mapResourceId("popupTheme", R.attr.popupTheme);
            this.f1540p = propertyMapper.mapObject(NotificationMessage.NOTIF_KEY_SUB_TITLE, R.attr.subtitle);
            this.f1541q = propertyMapper.mapObject("title", R.attr.title);
            this.f1542r = propertyMapper.mapInt("titleMarginBottom", R.attr.titleMarginBottom);
            this.f1543s = propertyMapper.mapInt("titleMarginEnd", R.attr.titleMarginEnd);
            this.f1544t = propertyMapper.mapInt("titleMarginStart", R.attr.titleMarginStart);
            this.f1545u = propertyMapper.mapInt("titleMarginTop", R.attr.titleMarginTop);
            this.f1526a = true;
        }

        public void readProperties(@NonNull Toolbar toolbar, @NonNull PropertyReader propertyReader) {
            if (!this.f1526a) {
                throw j.c();
            }
            propertyReader.readObject(this.f1527b, toolbar.getCollapseContentDescription());
            propertyReader.readObject(this.f1528c, toolbar.getCollapseIcon());
            propertyReader.readInt(this.f1529d, toolbar.getContentInsetEnd());
            propertyReader.readInt(this.f1530e, toolbar.getContentInsetEndWithActions());
            propertyReader.readInt(this.f1531f, toolbar.getContentInsetLeft());
            propertyReader.readInt(this.f1532g, toolbar.getContentInsetRight());
            propertyReader.readInt(this.f1533h, toolbar.getContentInsetStart());
            propertyReader.readInt(this.f1534i, toolbar.getContentInsetStartWithNavigation());
            propertyReader.readObject(this.f1535j, toolbar.getLogo());
            propertyReader.readObject(this.f1536k, toolbar.getLogoDescription());
            propertyReader.readObject(this.f1537l, toolbar.getMenu());
            propertyReader.readObject(this.m, toolbar.getNavigationContentDescription());
            propertyReader.readObject(this.f1538n, toolbar.getNavigationIcon());
            propertyReader.readResourceId(this.f1539o, toolbar.getPopupTheme());
            propertyReader.readObject(this.f1540p, toolbar.getSubtitle());
            propertyReader.readObject(this.f1541q, toolbar.getTitle());
            propertyReader.readInt(this.f1542r, toolbar.getTitleMarginBottom());
            propertyReader.readInt(this.f1543s, toolbar.getTitleMarginEnd());
            propertyReader.readInt(this.f1544t, toolbar.getTitleMarginStart());
            propertyReader.readInt(this.f1545u, toolbar.getTitleMarginTop());
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f1547q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f1548r0;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1547q0);
            parcel.writeInt(this.f1548r0 ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1547q0 = parcel.readInt();
            this.f1548r0 = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public class a implements ActionMenuView.OnMenuItemClickListener {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar toolbar = Toolbar.this;
            if (toolbar.f1503a1.onMenuItemSelected(menuItem)) {
                return true;
            }
            OnMenuItemClickListener onMenuItemClickListener = toolbar.f1505c1;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    public class c implements MenuBuilder.Callback {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            MenuBuilder.Callback callback = Toolbar.this.f1511i1;
            return callback != null && callback.onMenuItemSelected(menuBuilder, menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            Toolbar toolbar = Toolbar.this;
            if (!toolbar.f1517p0.isOverflowMenuShowing()) {
                toolbar.f1503a1.onPrepareMenu(menuBuilder);
            }
            MenuBuilder.Callback callback = toolbar.f1511i1;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    @RequiresApi(33)
    public static class e {
        @Nullable
        @DoNotInline
        public static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        public static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.t1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @DoNotInline
        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1546a == 0 && p(childAt)) {
                    int i12 = layoutParams.gravity;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = GravityCompat.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1546a == 0 && p(childAt2)) {
                int i14 = layoutParams2.gravity;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = GravityCompat.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f1503a1.addMenuProvider(menuProvider);
    }

    public final void b(View view, boolean z10) {
        LayoutParams layoutParamsGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        }
        layoutParamsGenerateLayoutParams.f1546a = 1;
        if (!z10 || this.f1524x0 == null) {
            addView(view, layoutParamsGenerateLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateLayoutParams);
            this.Y0.add(view);
        }
    }

    public final void c() {
        if (this.f1523w0 == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1523w0 = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1522u0);
            this.f1523w0.setContentDescription(this.v0);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.H0 & 112) | GravityCompat.START;
            layoutParamsGenerateDefaultLayoutParams.f1546a = 2;
            this.f1523w0.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.f1523w0.setOnClickListener(new d());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1517p0) != null && actionMenuView.isOverflowReserved();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void collapseActionView() {
        f fVar = this.f1509g1;
        MenuItemImpl menuItemImpl = fVar == null ? null : fVar.f1554q0;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    public final void d() {
        if (this.N0 == null) {
            j1 j1Var = new j1();
            j1Var.f1622a = 0;
            j1Var.f1623b = 0;
            j1Var.f1624c = Integer.MIN_VALUE;
            j1Var.f1625d = Integer.MIN_VALUE;
            j1Var.f1626e = 0;
            j1Var.f1627f = 0;
            j1Var.f1628g = false;
            j1Var.f1629h = false;
            this.N0 = j1Var;
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.f1517p0;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    public final void e() {
        f();
        if (this.f1517p0.peekMenu() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.f1517p0.getMenu();
            if (this.f1509g1 == null) {
                this.f1509g1 = new f();
            }
            this.f1517p0.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.f1509g1, this.f1525y0);
            q();
        }
    }

    public final void f() {
        if (this.f1517p0 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1517p0 = actionMenuView;
            actionMenuView.setPopupTheme(this.E0);
            this.f1517p0.setOnMenuItemClickListener(this.f1506d1);
            this.f1517p0.setMenuCallbacks(this.f1510h1, new c());
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.H0 & 112) | GravityCompat.END;
            this.f1517p0.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            b(this.f1517p0, false);
        }
    }

    public final void g() {
        if (this.f1520s0 == null) {
            this.f1520s0 = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.H0 & 112) | GravityCompat.START;
            this.f1520s0.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1523w0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f1523w0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        j1 j1Var = this.N0;
        if (j1Var != null) {
            return j1Var.f1628g ? j1Var.f1622a : j1Var.f1623b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.P0;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        j1 j1Var = this.N0;
        if (j1Var != null) {
            return j1Var.f1622a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        j1 j1Var = this.N0;
        if (j1Var != null) {
            return j1Var.f1623b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        j1 j1Var = this.N0;
        if (j1Var != null) {
            return j1Var.f1628g ? j1Var.f1623b : j1Var.f1622a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.O0;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilderPeekMenu;
        ActionMenuView actionMenuView = this.f1517p0;
        return (actionMenuView == null || (menuBuilderPeekMenu = actionMenuView.peekMenu()) == null || !menuBuilderPeekMenu.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.P0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.O0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1521t0;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1521t0;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1517p0.getMenu();
    }

    @Nullable
    @VisibleForTesting
    public View getNavButtonView() {
        return this.f1520s0;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1520s0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f1520s0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1508f1;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        e();
        return this.f1517p0.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1525y0;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.E0;
    }

    public CharSequence getSubtitle() {
        return this.S0;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getSubtitleTextView() {
        return this.f1519r0;
    }

    public CharSequence getTitle() {
        return this.R0;
    }

    public int getTitleMarginBottom() {
        return this.M0;
    }

    public int getTitleMarginEnd() {
        return this.K0;
    }

    public int getTitleMarginStart() {
        return this.J0;
    }

    public int getTitleMarginTop() {
        return this.L0;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getTitleTextView() {
        return this.f1518q0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DecorToolbar getWrapper() {
        if (this.f1507e1 == null) {
            this.f1507e1 = new ToolbarWidgetWrapper(this, true);
        }
        return this.f1507e1;
    }

    public final int h(int i10, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = layoutParams.gravity & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.Q0 & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.f1509g1;
        return (fVar == null || fVar.f1554q0 == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.f1517p0;
        return actionMenuView != null && actionMenuView.hideOverflowMenu();
    }

    public void inflateMenu(@MenuRes int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.f1504b1.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1503a1.onCreateMenu(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1504b1 = currentMenuItems2;
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.f1515m1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.f1517p0;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.f1517p0;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowing();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        Layout layout;
        AppCompatTextView appCompatTextView = this.f1518q0;
        if (appCompatTextView == null || (layout = appCompatTextView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (layout.getEllipsisCount(i10) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(View view) {
        return view.getParent() == this || this.Y0.contains(view);
    }

    public final int l(View view, int i10, int i11, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iH = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iH, iMax + measuredWidth, view.getMeasuredHeight() + iH);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
    }

    public final int m(View view, int i10, int i11, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iH = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iH, iMax, view.getMeasuredHeight() + iH);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int n(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void o(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1516n1);
        q();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.W0 = false;
        }
        if (!this.W0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.W0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.W0 = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027c  */
    /* JADX WARN: Code duplicated, block: B:102:0x027f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0291 A[LOOP:0: B:104:0x028f->B:105:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ad A[LOOP:1: B:107:0x02ab->B:108:0x02ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02cd A[LOOP:2: B:110:0x02cb->B:111:0x02cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0310  */
    /* JADX WARN: Code duplicated, block: B:117:0x0314  */
    /* JADX WARN: Code duplicated, block: B:120:0x031b A[LOOP:3: B:119:0x0319->B:120:0x031b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    /* JADX WARN: Code duplicated, block: B:70:0x017b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:75:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x0212  */
    /* JADX WARN: Code duplicated, block: B:89:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x021d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0221  */
    /* JADX WARN: Code duplicated, block: B:96:0x0234  */
    /* JADX WARN: Code duplicated, block: B:97:0x0257  */
    /* JADX WARN: Code duplicated, block: B:99:0x025a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iL;
        int iM;
        int iMax;
        int iMin;
        boolean zP;
        boolean zP2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z11;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList<View> arrayList;
        int size;
        int iL2;
        int i26;
        int i27;
        int size2;
        int i28;
        int size3;
        int i29;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int i34;
        int size4;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.Z0;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i13 - i11) : 0;
        if (p(this.f1520s0)) {
            if (z12) {
                iM = m(this.f1520s0, i35, iMin2, iArr);
                iL = paddingLeft;
            } else {
                iL = l(this.f1520s0, paddingLeft, iMin2, iArr);
            }
            if (p(this.f1523w0)) {
                if (z12) {
                    iM = m(this.f1523w0, iM, iMin2, iArr);
                } else {
                    iL = l(this.f1523w0, iL, iMin2, iArr);
                }
            }
            if (p(this.f1517p0)) {
                if (z12) {
                    iL = l(this.f1517p0, iL, iMin2, iArr);
                } else {
                    iM = m(this.f1517p0, iM, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iL);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iM));
            iMax = Math.max(iL, currentContentInsetLeft);
            iMin = Math.min(iM, i35 - currentContentInsetRight);
            if (p(this.f1524x0)) {
                if (z12) {
                    iMin = m(this.f1524x0, iMin, iMin2, iArr);
                } else {
                    iMax = l(this.f1524x0, iMax, iMin2, iArr);
                }
            }
            if (p(this.f1521t0)) {
                if (z12) {
                    iMin = m(this.f1521t0, iMin, iMin2, iArr);
                } else {
                    iMax = l(this.f1521t0, iMax, iMin2, iArr);
                }
            }
            zP = p(this.f1518q0);
            zP2 = p(this.f1519r0);
            if (zP) {
                LayoutParams layoutParams3 = (LayoutParams) this.f1518q0.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + this.f1518q0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zP2) {
                LayoutParams layoutParams4 = (LayoutParams) this.f1519r0.getLayoutParams();
                measuredHeight += this.f1519r0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
            }
            if (!zP || zP2) {
                if (zP) {
                    appCompatTextView = this.f1518q0;
                } else {
                    appCompatTextView = this.f1519r0;
                }
                if (zP2) {
                    appCompatTextView2 = this.f1519r0;
                } else {
                    appCompatTextView2 = this.f1518q0;
                }
                layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
                layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
                z11 = (!zP && this.f1518q0.getMeasuredWidth() > 0) || (zP2 && this.f1519r0.getMeasuredWidth() > 0);
                i14 = this.Q0 & 112;
                i15 = paddingLeft;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.L0;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.L0;
                    if (iMax2 < i22) {
                        iMax2 = i22;
                    } else {
                        i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i24 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        i25 = this.M0;
                        if (i23 < i24 + i25) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i25) - i23));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.M0) - measuredHeight;
                }
                if (z12) {
                    if (z11) {
                        i19 = this.J0;
                    } else {
                        i19 = 0;
                    }
                    int i36 = i19 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zP) {
                        LayoutParams layoutParams5 = (LayoutParams) this.f1518q0.getLayoutParams();
                        int measuredWidth2 = iMin - this.f1518q0.getMeasuredWidth();
                        int measuredHeight2 = this.f1518q0.getMeasuredHeight() + paddingTop;
                        this.f1518q0.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth2 - this.K0;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zP2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f1519r0.getLayoutParams())).topMargin;
                        this.f1519r0.layout(iMin - this.f1519r0.getMeasuredWidth(), i37, iMin, this.f1519r0.getMeasuredHeight() + i37);
                        i21 = iMin - this.K0;
                    } else {
                        i21 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i20, i21);
                    }
                } else {
                    if (z11) {
                        i16 = this.J0;
                    } else {
                        i16 = 0;
                    }
                    int i38 = i16 - iArr[0];
                    iMax += Math.max(0, i38);
                    iArr[0] = Math.max(0, -i38);
                    if (zP) {
                        LayoutParams layoutParams6 = (LayoutParams) this.f1518q0.getLayoutParams();
                        int measuredWidth3 = this.f1518q0.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1518q0.getMeasuredHeight() + paddingTop;
                        this.f1518q0.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i17 = measuredWidth3 + this.K0;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zP2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f1519r0.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f1519r0.getMeasuredWidth() + iMax;
                        this.f1519r0.layout(iMax, i39, measuredWidth4, this.f1519r0.getMeasuredHeight() + i39);
                        i18 = measuredWidth4 + this.K0;
                    } else {
                        i18 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i17, i18);
                    }
                }
            } else {
                i15 = paddingLeft;
                iMin2 = iMin2;
            }
            arrayList = this.X0;
            a(3, arrayList);
            size = arrayList.size();
            iL2 = iMax;
            for (i26 = 0; i26 < size; i26++) {
                iL2 = l(arrayList.get(i26), iL2, iMin2, iArr);
            }
            i27 = iMin2;
            a(5, arrayList);
            size2 = arrayList.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = m(arrayList.get(i28), iMin, i27, iArr);
            }
            a(1, arrayList);
            int i40 = iArr[0];
            int i41 = iArr[1];
            size3 = arrayList.size();
            i29 = i41;
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = arrayList.get(i31);
                LayoutParams layoutParams7 = (LayoutParams) view.getLayoutParams();
                int i42 = ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin - i30;
                int i43 = ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin - i29;
                int iMax3 = Math.max(0, i42);
                int iMax4 = Math.max(0, i43);
                int iMax5 = Math.max(0, -i42);
                int iMax6 = Math.max(0, -i43);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i31++;
                i29 = iMax6;
                i30 = iMax5;
            }
            i33 = ((((width - i15) - paddingRight) / 2) + i15) - (measuredWidth / 2);
            i34 = measuredWidth + i33;
            if (i33 >= iL2) {
                if (i34 > iMin) {
                    iL2 = i33 - (i34 - iMin);
                } else {
                    iL2 = i33;
                }
            }
            size4 = arrayList.size();
            for (i32 = 0; i32 < size4; i32++) {
                iL2 = l(arrayList.get(i32), iL2, i27, iArr);
            }
            arrayList.clear();
        }
        iL = paddingLeft;
        iM = i35;
        if (p(this.f1523w0)) {
            if (z12) {
                iM = m(this.f1523w0, iM, iMin2, iArr);
            } else {
                iL = l(this.f1523w0, iL, iMin2, iArr);
            }
        }
        if (p(this.f1517p0)) {
            if (z12) {
                iL = l(this.f1517p0, iL, iMin2, iArr);
            } else {
                iM = m(this.f1517p0, iM, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iL);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iM));
        iMax = Math.max(iL, currentContentInsetLeft2);
        iMin = Math.min(iM, i35 - currentContentInsetRight2);
        if (p(this.f1524x0)) {
            if (z12) {
                iMin = m(this.f1524x0, iMin, iMin2, iArr);
            } else {
                iMax = l(this.f1524x0, iMax, iMin2, iArr);
            }
        }
        if (p(this.f1521t0)) {
            if (z12) {
                iMin = m(this.f1521t0, iMin, iMin2, iArr);
            } else {
                iMax = l(this.f1521t0, iMax, iMin2, iArr);
            }
        }
        zP = p(this.f1518q0);
        zP2 = p(this.f1519r0);
        if (zP) {
            LayoutParams layoutParams8 = (LayoutParams) this.f1518q0.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin + this.f1518q0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zP2) {
            LayoutParams layoutParams9 = (LayoutParams) this.f1519r0.getLayoutParams();
            measuredHeight += this.f1519r0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin;
        }
        if (zP) {
            if (zP) {
                appCompatTextView = this.f1518q0;
            } else {
                appCompatTextView = this.f1519r0;
            }
            if (zP2) {
                appCompatTextView2 = this.f1519r0;
            } else {
                appCompatTextView2 = this.f1518q0;
            }
            layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
            layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
            if (zP) {
            }
            i14 = this.Q0 & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.L0;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.L0;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i25 = this.M0;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.M0) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i19 = this.J0;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zP) {
                    LayoutParams layoutParams10 = (LayoutParams) this.f1518q0.getLayoutParams();
                    int measuredWidth5 = iMin - this.f1518q0.getMeasuredWidth();
                    int measuredHeight4 = this.f1518q0.getMeasuredHeight() + paddingTop;
                    this.f1518q0.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth5 - this.K0;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zP2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f1519r0.getLayoutParams())).topMargin;
                    this.f1519r0.layout(iMin - this.f1519r0.getMeasuredWidth(), i311, iMin, this.f1519r0.getMeasuredHeight() + i311);
                    i21 = iMin - this.K0;
                } else {
                    i21 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i20, i21);
                }
            } else {
                if (z11) {
                    i16 = this.J0;
                } else {
                    i16 = 0;
                }
                int i312 = i16 - iArr[0];
                iMax += Math.max(0, i312);
                iArr[0] = Math.max(0, -i312);
                if (zP) {
                    LayoutParams layoutParams11 = (LayoutParams) this.f1518q0.getLayoutParams();
                    int measuredWidth6 = this.f1518q0.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1518q0.getMeasuredHeight() + paddingTop;
                    this.f1518q0.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i17 = measuredWidth6 + this.K0;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zP2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f1519r0.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f1519r0.getMeasuredWidth() + iMax;
                    this.f1519r0.layout(iMax, i313, measuredWidth7, this.f1519r0.getMeasuredHeight() + i313);
                    i18 = measuredWidth7 + this.K0;
                } else {
                    i18 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zP) {
                appCompatTextView = this.f1518q0;
            } else {
                appCompatTextView = this.f1519r0;
            }
            if (zP2) {
                appCompatTextView2 = this.f1519r0;
            } else {
                appCompatTextView2 = this.f1518q0;
            }
            layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
            layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
            if (zP) {
            }
            i14 = this.Q0 & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.L0;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.L0;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i25 = this.M0;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.M0) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i19 = this.J0;
                } else {
                    i19 = 0;
                }
                int i314 = i19 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zP) {
                    LayoutParams layoutParams12 = (LayoutParams) this.f1518q0.getLayoutParams();
                    int measuredWidth8 = iMin - this.f1518q0.getMeasuredWidth();
                    int measuredHeight6 = this.f1518q0.getMeasuredHeight() + paddingTop;
                    this.f1518q0.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth8 - this.K0;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zP2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f1519r0.getLayoutParams())).topMargin;
                    this.f1519r0.layout(iMin - this.f1519r0.getMeasuredWidth(), i315, iMin, this.f1519r0.getMeasuredHeight() + i315);
                    i21 = iMin - this.K0;
                } else {
                    i21 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i20, i21);
                }
            } else {
                if (z11) {
                    i16 = this.J0;
                } else {
                    i16 = 0;
                }
                int i316 = i16 - iArr[0];
                iMax += Math.max(0, i316);
                iArr[0] = Math.max(0, -i316);
                if (zP) {
                    LayoutParams layoutParams13 = (LayoutParams) this.f1518q0.getLayoutParams();
                    int measuredWidth9 = this.f1518q0.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1518q0.getMeasuredHeight() + paddingTop;
                    this.f1518q0.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i17 = measuredWidth9 + this.K0;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zP2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f1519r0.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f1519r0.getMeasuredWidth() + iMax;
                    this.f1519r0.layout(iMax, i317, measuredWidth10, this.f1519r0.getMeasuredHeight() + i317);
                    i18 = measuredWidth10 + this.K0;
                } else {
                    i18 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        arrayList = this.X0;
        a(3, arrayList);
        size = arrayList.size();
        iL2 = iMax;
        while (i26 < size) {
            iL2 = l(arrayList.get(i26), iL2, iMin2, iArr);
        }
        i27 = iMin2;
        a(5, arrayList);
        size2 = arrayList.size();
        while (i28 < size2) {
            iMin = m(arrayList.get(i28), iMin, i27, iArr);
        }
        a(1, arrayList);
        int i44 = iArr[0];
        int i45 = iArr[1];
        size3 = arrayList.size();
        i29 = i45;
        i30 = i44;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = arrayList.get(i31);
            LayoutParams layoutParams14 = (LayoutParams) view2.getLayoutParams();
            int i46 = ((ViewGroup.MarginLayoutParams) layoutParams14).leftMargin - i30;
            int i47 = ((ViewGroup.MarginLayoutParams) layoutParams14).rightMargin - i29;
            int iMax7 = Math.max(0, i46);
            int iMax8 = Math.max(0, i47);
            int iMax9 = Math.max(0, -i46);
            int iMax10 = Math.max(0, -i47);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i31++;
            i29 = iMax10;
            i30 = iMax9;
        }
        i33 = ((((width - i15) - paddingRight) / 2) + i15) - (measuredWidth / 2);
        i34 = measuredWidth + i33;
        if (i33 >= iL2) {
            if (i34 > iMin) {
                iL2 = i33 - (i34 - iMin);
            } else {
                iL2 = i33;
            }
        }
        size4 = arrayList.size();
        while (i32 < size4) {
            iL2 = l(arrayList.get(i32), iL2, i27, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int iMax;
        int iCombineMeasuredStates;
        int i13;
        int iJ;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i14 = !zIsLayoutRtl ? 1 : 0;
        int i15 = 0;
        if (p(this.f1520s0)) {
            o(this.f1520s0, i10, 0, i11, this.I0);
            i12 = i(this.f1520s0) + this.f1520s0.getMeasuredWidth();
            iMax = Math.max(0, j(this.f1520s0) + this.f1520s0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1520s0.getMeasuredState());
        } else {
            i12 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (p(this.f1523w0)) {
            o(this.f1523w0, i10, 0, i11, this.I0);
            i12 = i(this.f1523w0) + this.f1523w0.getMeasuredWidth();
            iMax = Math.max(iMax, j(this.f1523w0) + this.f1523w0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1523w0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, i12);
        int iMax4 = Math.max(0, currentContentInsetStart - i12);
        int[] iArr = this.Z0;
        iArr[zIsLayoutRtl ? 1 : 0] = iMax4;
        if (p(this.f1517p0)) {
            o(this.f1517p0, i10, iMax3, i11, this.I0);
            i13 = i(this.f1517p0) + this.f1517p0.getMeasuredWidth();
            iMax = Math.max(iMax, j(this.f1517p0) + this.f1517p0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1517p0.getMeasuredState());
        } else {
            i13 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = Math.max(currentContentInsetEnd, i13) + iMax3;
        iArr[i14] = Math.max(0, currentContentInsetEnd - i13);
        if (p(this.f1524x0)) {
            iMax5 += n(this.f1524x0, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, j(this.f1524x0) + this.f1524x0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1524x0.getMeasuredState());
        }
        if (p(this.f1521t0)) {
            iMax5 += n(this.f1521t0, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, j(this.f1521t0) + this.f1521t0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1521t0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((LayoutParams) childAt.getLayoutParams()).f1546a == 0 && p(childAt)) {
                iMax5 += n(childAt, i10, iMax5, i11, 0, iArr);
                iMax = Math.max(iMax, j(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i17 = this.L0 + this.M0;
        int i18 = this.J0 + this.K0;
        if (p(this.f1518q0)) {
            n(this.f1518q0, i10, iMax5 + i18, i11, i17, iArr);
            int i19 = i(this.f1518q0) + this.f1518q0.getMeasuredWidth();
            iJ = j(this.f1518q0) + this.f1518q0.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1518q0.getMeasuredState());
            iMax2 = i19;
        } else {
            iJ = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (p(this.f1519r0)) {
            iMax2 = Math.max(iMax2, n(this.f1519r0, i10, iMax5 + i18, i11, iJ + i17, iArr));
            iJ += j(this.f1519r0) + this.f1519r0.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1519r0.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iJ);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f1512j1) {
            i15 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (p(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i15 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i15);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.f1517p0;
        MenuBuilder menuBuilderPeekMenu = actionMenuView != null ? actionMenuView.peekMenu() : null;
        int i10 = savedState.f1547q0;
        if (i10 != 0 && this.f1509g1 != null && menuBuilderPeekMenu != null && (menuItemFindItem = menuBuilderPeekMenu.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1548r0) {
            b bVar = this.f1516n1;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        j1 j1Var = this.N0;
        boolean z10 = i10 == 1;
        if (z10 == j1Var.f1628g) {
            return;
        }
        j1Var.f1628g = z10;
        if (!j1Var.f1629h) {
            j1Var.f1622a = j1Var.f1626e;
            j1Var.f1623b = j1Var.f1627f;
            return;
        }
        if (z10) {
            int i11 = j1Var.f1625d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = j1Var.f1626e;
            }
            j1Var.f1622a = i11;
            int i12 = j1Var.f1624c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = j1Var.f1627f;
            }
            j1Var.f1623b = i12;
            return;
        }
        int i13 = j1Var.f1624c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = j1Var.f1626e;
        }
        j1Var.f1622a = i13;
        int i14 = j1Var.f1625d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = j1Var.f1627f;
        }
        j1Var.f1623b = i14;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f1509g1;
        if (fVar != null && (menuItemImpl = fVar.f1554q0) != null) {
            savedState.f1547q0 = menuItemImpl.getItemId();
        }
        savedState.f1548r0 = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V0 = false;
        }
        if (!this.V0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.V0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.V0 = false;
        }
        return true;
    }

    public final boolean p(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void q() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            int i10 = 0;
            boolean z10 = hasExpandedActionView() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f1515m1;
            if (z10 && this.f1514l1 == null) {
                if (this.f1513k1 == null) {
                    this.f1513k1 = e.b(new s1(this, i10));
                }
                e.c(onBackInvokedDispatcherA, this.f1513k1);
                this.f1514l1 = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f1514l1) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f1513k1);
            this.f1514l1 = null;
        }
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f1503a1.removeMenuProvider(menuProvider);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1515m1 != z10) {
            this.f1515m1 = z10;
            q();
        }
    }

    public void setCollapseContentDescription(@StringRes int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(@DrawableRes int i10) {
        setCollapseIcon(AppCompatResources.getDrawable(getContext(), i10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z10) {
        this.f1512j1 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.P0) {
            this.P0 = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.O0) {
            this.O0 = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i10, int i11) {
        d();
        j1 j1Var = this.N0;
        j1Var.f1629h = false;
        if (i10 != Integer.MIN_VALUE) {
            j1Var.f1626e = i10;
            j1Var.f1622a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            j1Var.f1627f = i11;
            j1Var.f1623b = i11;
        }
    }

    public void setContentInsetsRelative(int i10, int i11) {
        d();
        this.N0.a(i10, i11);
    }

    public void setLogo(@DrawableRes int i10) {
        setLogo(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setLogoDescription(@StringRes int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setMenu(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.f1517p0 == null) {
            return;
        }
        f();
        MenuBuilder menuBuilderPeekMenu = this.f1517p0.peekMenu();
        if (menuBuilderPeekMenu == menuBuilder) {
            return;
        }
        if (menuBuilderPeekMenu != null) {
            menuBuilderPeekMenu.removeMenuPresenter(this.f1508f1);
            menuBuilderPeekMenu.removeMenuPresenter(this.f1509g1);
        }
        if (this.f1509g1 == null) {
            this.f1509g1 = new f();
        }
        actionMenuPresenter.G0 = true;
        if (menuBuilder != null) {
            menuBuilder.addMenuPresenter(actionMenuPresenter, this.f1525y0);
            menuBuilder.addMenuPresenter(this.f1509g1, this.f1525y0);
        } else {
            actionMenuPresenter.initForMenu(this.f1525y0, null);
            this.f1509g1.initForMenu(this.f1525y0, null);
            actionMenuPresenter.updateMenuView(true);
            this.f1509g1.updateMenuView(true);
        }
        this.f1517p0.setPopupTheme(this.E0);
        this.f1517p0.setPresenter(actionMenuPresenter);
        this.f1508f1 = actionMenuPresenter;
        q();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.f1510h1 = callback;
        this.f1511i1 = callback2;
        ActionMenuView actionMenuView = this.f1517p0;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(callback, callback2);
        }
    }

    public void setNavigationContentDescription(@StringRes int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(@DrawableRes int i10) {
        setNavigationIcon(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1520s0.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1505c1 = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        e();
        this.f1517p0.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i10) {
        if (this.E0 != i10) {
            this.E0 = i10;
            if (i10 == 0) {
                this.f1525y0 = getContext();
            } else {
                this.f1525y0 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(@StringRes int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextAppearance(Context context, @StyleRes int i10) {
        this.G0 = i10;
        AppCompatTextView appCompatTextView = this.f1519r0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i10);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(@StringRes int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMargin(int i10, int i11, int i12, int i13) {
        this.J0 = i10;
        this.L0 = i11;
        this.K0 = i12;
        this.M0 = i13;
        requestLayout();
    }

    public void setTitleMarginBottom(int i10) {
        this.M0 = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.K0 = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.J0 = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.L0 = i10;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @StyleRes int i10) {
        this.F0 = i10;
        AppCompatTextView appCompatTextView = this.f1518q0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i10);
        }
    }

    public void setTitleTextColor(@ColorInt int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.f1517p0;
        return actionMenuView != null && actionMenuView.showOverflowMenu();
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1546a;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1546a = 0;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f1546a = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i10, int i11, int i12) {
            super(i10, i11);
            this.f1546a = 0;
            this.gravity = i12;
        }

        public LayoutParams(int i10) {
            this(-2, -1, i10);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1546a = 0;
            this.f1546a = layoutParams.f1546a;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1546a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1546a = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1546a = 0;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.f1503a1.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f1523w0;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1523w0.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f1523w0;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f1522u0);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1521t0 == null) {
                this.f1521t0 = new AppCompatImageView(getContext());
            }
            if (!k(this.f1521t0)) {
                b(this.f1521t0, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1521t0;
            if (appCompatImageView != null && k(appCompatImageView)) {
                removeView(this.f1521t0);
                this.Y0.remove(this.f1521t0);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1521t0;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1521t0 == null) {
            this.f1521t0 = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f1521t0;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f1520s0;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            TooltipCompat.setTooltipText(this.f1520s0, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            g();
            if (!k(this.f1520s0)) {
                b(this.f1520s0, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f1520s0;
            if (appCompatImageButton != null && k(appCompatImageButton)) {
                removeView(this.f1520s0);
                this.Y0.remove(this.f1520s0);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f1520s0;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f1519r0;
            if (appCompatTextView != null && k(appCompatTextView)) {
                removeView(this.f1519r0);
                this.Y0.remove(this.f1519r0);
            }
        } else {
            if (this.f1519r0 == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f1519r0 = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f1519r0.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.G0;
                if (i10 != 0) {
                    this.f1519r0.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.U0;
                if (colorStateList != null) {
                    this.f1519r0.setTextColor(colorStateList);
                }
            }
            if (!k(this.f1519r0)) {
                b(this.f1519r0, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1519r0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.S0 = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.U0 = colorStateList;
        AppCompatTextView appCompatTextView = this.f1519r0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f1518q0;
            if (appCompatTextView != null && k(appCompatTextView)) {
                removeView(this.f1518q0);
                this.Y0.remove(this.f1518q0);
            }
        } else {
            if (this.f1518q0 == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f1518q0 = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f1518q0.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.F0;
                if (i10 != 0) {
                    this.f1518q0.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.T0;
                if (colorStateList != null) {
                    this.f1518q0.setTextColor(colorStateList);
                }
            }
            if (!k(this.f1518q0)) {
                b(this.f1518q0, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1518q0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.R0 = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.T0 = colorStateList;
        AppCompatTextView appCompatTextView = this.f1518q0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Q0 = 8388627;
        this.X0 = new ArrayList<>();
        this.Y0 = new ArrayList<>();
        this.Z0 = new int[2];
        this.f1503a1 = new MenuHostHelper(new r1(this, 0));
        this.f1504b1 = new ArrayList<>();
        this.f1506d1 = new a();
        this.f1516n1 = new b();
        Context context2 = getContext();
        int[] iArr = R.styleable.Toolbar;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        this.F0 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        this.G0 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.Q0 = tintTypedArrayObtainStyledAttributes.getInteger(R.styleable.Toolbar_android_gravity, 8388627);
        this.H0 = tintTypedArrayObtainStyledAttributes.getInteger(R.styleable.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMargin, 0);
        int i11 = R.styleable.Toolbar_titleMargins;
        dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.hasValue(i11) ? tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(i11, dimensionPixelOffset) : dimensionPixelOffset;
        this.M0 = dimensionPixelOffset;
        this.L0 = dimensionPixelOffset;
        this.K0 = dimensionPixelOffset;
        this.J0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.J0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.K0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.L0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.M0 = dimensionPixelOffset5;
        }
        this.I0 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_contentInsetRight, 0);
        d();
        j1 j1Var = this.N0;
        j1Var.f1629h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            j1Var.f1626e = dimensionPixelSize;
            j1Var.f1622a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            j1Var.f1627f = dimensionPixelSize2;
            j1Var.f1623b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            j1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.O0 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.P0 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1522u0 = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.Toolbar_collapseIcon);
        this.v0 = tintTypedArrayObtainStyledAttributes.getText(R.styleable.Toolbar_collapseContentDescription);
        CharSequence text = tintTypedArrayObtainStyledAttributes.getText(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = tintTypedArrayObtainStyledAttributes.getText(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1525y0 = getContext();
        setPopupTheme(tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.Toolbar_popupTheme, 0));
        Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.Toolbar_navigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        CharSequence text3 = tintTypedArrayObtainStyledAttributes.getText(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.Toolbar_logo);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        CharSequence text4 = tintTypedArrayObtainStyledAttributes.getText(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        int i12 = R.styleable.Toolbar_titleTextColor;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            setTitleTextColor(tintTypedArrayObtainStyledAttributes.getColorStateList(i12));
        }
        int i13 = R.styleable.Toolbar_subtitleTextColor;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
            setSubtitleTextColor(tintTypedArrayObtainStyledAttributes.getColorStateList(i13));
        }
        int i14 = R.styleable.Toolbar_menu;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
            inflateMenu(tintTypedArrayObtainStyledAttributes.getResourceId(i14, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state) {
        this.f1503a1.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public class f implements MenuPresenter {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public MenuBuilder f1553p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MenuItemImpl f1554q0;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.f1524x0;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.f1524x0);
            toolbar.removeView(toolbar.f1523w0);
            toolbar.f1524x0 = null;
            ArrayList<View> arrayList = toolbar.Y0;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView(arrayList.get(size));
            }
            arrayList.clear();
            this.f1554q0 = null;
            toolbar.requestLayout();
            menuItemImpl.setActionViewExpanded(false);
            toolbar.q();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.f1523w0.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1523w0);
                }
                toolbar.addView(toolbar.f1523w0);
            }
            View actionView = menuItemImpl.getActionView();
            toolbar.f1524x0 = actionView;
            this.f1554q0 = menuItemImpl;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f1524x0);
                }
                LayoutParams layoutParamsGenerateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
                layoutParamsGenerateDefaultLayoutParams.gravity = (toolbar.H0 & 112) | GravityCompat.START;
                layoutParamsGenerateDefaultLayoutParams.f1546a = 2;
                toolbar.f1524x0.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                toolbar.addView(toolbar.f1524x0);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((LayoutParams) childAt.getLayoutParams()).f1546a != 2 && childAt != toolbar.f1517p0) {
                    toolbar.removeViewAt(childCount);
                    toolbar.Y0.add(childAt);
                }
            }
            toolbar.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            KeyEvent.Callback callback = toolbar.f1524x0;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewExpanded();
            }
            toolbar.q();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final MenuView getMenuView(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void initForMenu(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.f1553p0;
            if (menuBuilder2 != null && (menuItemImpl = this.f1554q0) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.f1553p0 = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void updateMenuView(boolean z10) {
            if (this.f1554q0 != null) {
                MenuBuilder menuBuilder = this.f1553p0;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1553p0.getItem(i10) == this.f1554q0) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.f1553p0, this.f1554q0);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void setCallback(MenuPresenter.Callback callback) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
        }
    }
}
