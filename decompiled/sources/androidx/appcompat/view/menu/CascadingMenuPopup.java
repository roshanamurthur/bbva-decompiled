package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class CascadingMenuPopup extends androidx.appcompat.view.menu.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int V0 = R.layout.abc_cascading_menu_item_layout;
    public View I0;
    public View J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public int O0;
    public boolean Q0;
    public MenuPresenter.Callback R0;
    public ViewTreeObserver S0;
    public PopupWindow.OnDismissListener T0;
    public boolean U0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Context f900q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f901r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f902s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f903t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f904u0;
    public final Handler v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ArrayList f905w0 = new ArrayList();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ArrayList f906x0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final a f907y0 = new a();
    public final b E0 = new b();
    public final c F0 = new c();
    public int G0 = 0;
    public int H0 = 0;
    public boolean P0 = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            if (cascadingMenuPopup.isShowing()) {
                ArrayList arrayList = cascadingMenuPopup.f906x0;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).f915a.isModal()) {
                    return;
                }
                View view = cascadingMenuPopup.J0;
                if (view == null || !view.isShown()) {
                    cascadingMenuPopup.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f915a.show();
                }
            }
        }
    }

    public class c implements MenuItemHoverListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ d f911p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MenuItem f912q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ MenuBuilder f913r0;

            public a(d dVar, MenuItem menuItem, MenuBuilder menuBuilder) {
                this.f911p0 = dVar;
                this.f912q0 = menuItem;
                this.f913r0 = menuBuilder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = this.f911p0;
                if (dVar != null) {
                    c cVar = c.this;
                    CascadingMenuPopup.this.U0 = true;
                    dVar.f916b.close(false);
                    CascadingMenuPopup.this.U0 = false;
                }
                MenuItem menuItem = this.f912q0;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    this.f913r0.performItemAction(menuItem, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void onItemHoverEnter(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            cascadingMenuPopup.v0.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.f906x0;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (menuBuilder == ((d) arrayList.get(i10)).f916b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            cascadingMenuPopup.v0.postAtTime(new a(i11 < arrayList.size() ? (d) arrayList.get(i11) : null, menuItem, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void onItemHoverExit(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.v0.removeCallbacksAndMessages(menuBuilder);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MenuBuilder f916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f917c;

        public d(@NonNull MenuPopupWindow menuPopupWindow, @NonNull MenuBuilder menuBuilder, int i10) {
            this.f915a = menuPopupWindow;
            this.f916b = menuBuilder;
            this.f917c = i10;
        }
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i10, @StyleRes int i11, boolean z10) {
        this.f900q0 = context;
        this.I0 = view;
        this.f902s0 = i10;
        this.f903t0 = i11;
        this.f904u0 = z10;
        this.K0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f901r0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.v0 = new Handler();
    }

    @Override // androidx.appcompat.view.menu.d
    public final void a(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.f900q0);
        if (isShowing()) {
            j(menuBuilder);
        } else {
            this.f905w0.add(menuBuilder);
        }
    }

    @Override // androidx.appcompat.view.menu.d
    public final void c(@NonNull View view) {
        if (this.I0 != view) {
            this.I0 = view;
            this.H0 = GravityCompat.getAbsoluteGravity(this.G0, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.d
    public final void d(boolean z10) {
        this.P0 = z10;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        ArrayList arrayList = this.f906x0;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f915a.isShowing()) {
                    dVar.f915a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.d
    public final void e(int i10) {
        if (this.G0 != i10) {
            this.G0 = i10;
            this.H0 = GravityCompat.getAbsoluteGravity(i10, this.I0.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.d
    public final void f(int i10) {
        this.L0 = true;
        this.N0 = i10;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.d
    public final void g(PopupWindow.OnDismissListener onDismissListener) {
        this.T0 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView getListView() {
        ArrayList arrayList = this.f906x0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) androidx.appcompat.view.menu.b.b(arrayList, 1)).f915a.getListView();
    }

    @Override // androidx.appcompat.view.menu.d
    public final void h(boolean z10) {
        this.Q0 = z10;
    }

    @Override // androidx.appcompat.view.menu.d
    public final void i(int i10) {
        this.M0 = true;
        this.O0 = i10;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        ArrayList arrayList = this.f906x0;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f915a.isShowing();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b  */
    public final void j(@NonNull MenuBuilder menuBuilder) {
        boolean z10;
        View childAt;
        d dVar;
        int i10;
        int i11;
        int i12;
        int width;
        MenuItem item;
        MenuAdapter menuAdapter;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f900q0;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        MenuAdapter menuAdapter2 = new MenuAdapter(menuBuilder, layoutInflaterFrom, this.f904u0, V0);
        if (!isShowing() && this.P0) {
            menuAdapter2.setForceShowIcon(true);
        } else if (isShowing()) {
            int size = menuBuilder.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item2 = menuBuilder.getItem(i13);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            menuAdapter2.setForceShowIcon(z10);
        }
        int iB = androidx.appcompat.view.menu.d.b(menuAdapter2, context, this.f901r0);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(context, null, this.f902s0, this.f903t0);
        menuPopupWindow.setHoverListener(this.F0);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.I0);
        menuPopupWindow.setDropDownGravity(this.H0);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        menuPopupWindow.setAdapter(menuAdapter2);
        menuPopupWindow.setContentWidth(iB);
        menuPopupWindow.setDropDownGravity(this.H0);
        ArrayList arrayList = this.f906x0;
        if (arrayList.size() > 0) {
            dVar = (d) androidx.appcompat.view.menu.b.b(arrayList, 1);
            MenuBuilder menuBuilder2 = dVar.f916b;
            int size2 = menuBuilder2.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    item = null;
                    break;
                }
                item = menuBuilder2.getItem(i14);
                if (item.hasSubMenu() && menuBuilder == item.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                ListView listView = dVar.f915a.getListView();
                ListAdapter adapter = listView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                    headersCount = 0;
                }
                int count = menuAdapter.getCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (item == menuAdapter.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                childAt = (i15 != -1 && (firstVisiblePosition = (i15 + headersCount) - listView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listView.getChildCount()) ? listView.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            childAt = null;
            dVar = null;
        }
        if (childAt != null) {
            menuPopupWindow.setTouchModal(false);
            menuPopupWindow.setEnterTransition(null);
            ListView listView2 = ((d) arrayList.get(arrayList.size() - 1)).f915a.getListView();
            int[] iArr = new int[2];
            listView2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.J0.getWindowVisibleDisplayFrame(rect);
            if (this.K0 == 1) {
                if (listView2.getWidth() + iArr[0] + iB > rect.right) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            } else if (iArr[0] - iB < 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z11 = i10 == 1;
            this.K0 = i10;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindow.setAnchorView(childAt);
                i12 = 0;
                i11 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.I0.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.H0 & 7) == 5) {
                    iArr2[0] = this.I0.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i11 = iArr3[0] - iArr2[0];
                i12 = iArr3[1] - iArr2[1];
            }
            if ((this.H0 & 5) == 5) {
                width = z11 ? i11 + iB : i11 - childAt.getWidth();
            } else {
                width = z11 ? i11 + childAt.getWidth() : i11 - iB;
            }
            menuPopupWindow.setHorizontalOffset(width);
            menuPopupWindow.setOverlapAnchor(true);
            menuPopupWindow.setVerticalOffset(i12);
        } else {
            if (this.L0) {
                menuPopupWindow.setHorizontalOffset(this.N0);
            }
            if (this.M0) {
                menuPopupWindow.setVerticalOffset(this.O0);
            }
            menuPopupWindow.setEpicenterBounds(this.f1027p0);
        }
        arrayList.add(new d(menuPopupWindow, menuBuilder, this.K0));
        menuPopupWindow.show();
        ListView listView3 = menuPopupWindow.getListView();
        listView3.setOnKeyListener(this);
        if (dVar == null && this.Q0 && menuBuilder.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.getHeaderTitle());
            listView3.addHeaderView(frameLayout, null, false);
            menuPopupWindow.show();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
        ArrayList arrayList = this.f906x0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (menuBuilder == ((d) arrayList.get(i10)).f916b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((d) arrayList.get(i11)).f916b.close(false);
        }
        d dVar = (d) arrayList.remove(i10);
        dVar.f916b.removeMenuPresenter(this);
        boolean z11 = this.U0;
        MenuPopupWindow menuPopupWindow = dVar.f915a;
        if (z11) {
            menuPopupWindow.setExitTransition(null);
            menuPopupWindow.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.K0 = ((d) arrayList.get(size2 - 1)).f917c;
        } else {
            this.K0 = this.I0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).f916b.close(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.R0;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.S0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.S0.removeGlobalOnLayoutListener(this.f907y0);
            }
            this.S0 = null;
        }
        this.J0.removeOnAttachStateChangeListener(this.E0);
        this.T0.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f906x0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f915a.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f916b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        for (d dVar : this.f906x0) {
            if (subMenuBuilder == dVar.f916b) {
                dVar.f915a.getListView().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        a(subMenuBuilder);
        MenuPresenter.Callback callback = this.R0;
        if (callback != null) {
            callback.onOpenSubMenu(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.R0 = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f905w0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j((MenuBuilder) it.next());
        }
        arrayList.clear();
        View view = this.I0;
        this.J0 = view;
        if (view != null) {
            boolean z10 = this.S0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.S0 = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f907y0);
            }
            this.J0.addOnAttachStateChangeListener(this.E0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z10) {
        Iterator it = this.f906x0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f915a.getListView().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ViewTreeObserver viewTreeObserver = cascadingMenuPopup.S0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cascadingMenuPopup.S0 = view.getViewTreeObserver();
                }
                cascadingMenuPopup.S0.removeGlobalOnLayoutListener(cascadingMenuPopup.f907y0);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }
}
