package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final Method f1345e1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public MenuItemHoverListener f1346d1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends r0 {
        public final int G0;
        public final int H0;
        public MenuItemHoverListener I0;
        public MenuItemImpl J0;

        public MenuDropDownListView(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.G0 = 21;
                this.H0 = 22;
            } else {
                this.G0 = 22;
                this.H0 = 21;
            }
        }

        public void clearSelection() {
            setSelection(-1);
        }

        @Override // androidx.appcompat.widget.r0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.r0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.r0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.r0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.r0
        public /* bridge */ /* synthetic */ int lookForSelectablePosition(int i10, boolean z10) {
            return super.lookForSelectablePosition(i10, z10);
        }

        @Override // androidx.appcompat.widget.r0
        public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int i10, int i11, int i12, int i13, int i14) {
            return super.measureHeightOfChildrenCompat(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.r0
        public /* bridge */ /* synthetic */ boolean onForwardedEvent(MotionEvent motionEvent, int i10) {
            return super.onForwardedEvent(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.r0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            MenuAdapter menuAdapter;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.I0 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                    headersCount = 0;
                }
                MenuItemImpl item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= menuAdapter.getCount()) ? null : menuAdapter.getItem(i10);
                MenuItemImpl menuItemImpl = this.J0;
                if (menuItemImpl != item) {
                    MenuBuilder adapterMenu = menuAdapter.getAdapterMenu();
                    if (menuItemImpl != null) {
                        this.I0.onItemHoverExit(adapterMenu, menuItemImpl);
                    }
                    this.J0 = item;
                    if (item != null) {
                        this.I0.onItemHoverEnter(adapterMenu, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.G0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.H0) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (MenuAdapter) adapter).getAdapterMenu().close(false);
            return true;
        }

        @Override // androidx.appcompat.widget.r0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.I0 = menuItemHoverListener;
        }

        @Override // androidx.appcompat.widget.r0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    @RequiresApi(23)
    public static class a {
        @DoNotInline
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @DoNotInline
        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @RequiresApi(29)
    public static class b {
        @DoNotInline
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1345e1 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @NonNull
    public final r0 d(Context context, boolean z10) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z10);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.f1346d1;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverEnter(menuBuilder, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.f1346d1;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverExit(menuBuilder, menuItem);
        }
    }

    public void setEnterTransition(Object obj) {
        a.a(this.Z0, (Transition) obj);
    }

    public void setExitTransition(Object obj) {
        a.b(this.Z0, (Transition) obj);
    }

    public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
        this.f1346d1 = menuItemHoverListener;
    }

    public void setTouchModal(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        b0 b0Var = this.Z0;
        if (i10 > 28) {
            b.a(b0Var, z10);
            return;
        }
        Method method = f1345e1;
        if (method != null) {
            try {
                method.invoke(b0Var, Boolean.valueOf(z10));
            } catch (Exception unused) {
            }
        }
    }
}
