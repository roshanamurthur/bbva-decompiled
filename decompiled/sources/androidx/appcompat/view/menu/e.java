package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.MenuPopupWindow;

/* JADX INFO: compiled from: StandardMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int P0 = R.layout.abc_popup_menu_item_layout;
    public PopupWindow.OnDismissListener F0;
    public View G0;
    public View H0;
    public MenuPresenter.Callback I0;
    public ViewTreeObserver J0;
    public boolean K0;
    public boolean L0;
    public int M0;
    public boolean O0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Context f1028q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final MenuBuilder f1029r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final MenuAdapter f1030s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f1031t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f1032u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f1033w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final MenuPopupWindow f1034x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final a f1035y0 = new a();
    public final b E0 = new b();
    public int N0 = 0;

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            e eVar = e.this;
            if (!eVar.isShowing() || eVar.f1034x0.isModal()) {
                return;
            }
            View view = eVar.H0;
            if (view == null || !view.isShown()) {
                eVar.dismiss();
            } else {
                eVar.f1034x0.show();
            }
        }
    }

    public e(Context context, MenuBuilder menuBuilder, View view, boolean z10, int i10, int i11) {
        this.f1028q0 = context;
        this.f1029r0 = menuBuilder;
        this.f1031t0 = z10;
        this.f1030s0 = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z10, P0);
        this.v0 = i10;
        this.f1033w0 = i11;
        Resources resources = context.getResources();
        this.f1032u0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.G0 = view;
        this.f1034x0 = new MenuPopupWindow(context, null, i10, i11);
        menuBuilder.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.d
    public final void c(View view) {
        this.G0 = view;
    }

    @Override // androidx.appcompat.view.menu.d
    public final void d(boolean z10) {
        this.f1030s0.setForceShowIcon(z10);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if (isShowing()) {
            this.f1034x0.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.d
    public final void e(int i10) {
        this.N0 = i10;
    }

    @Override // androidx.appcompat.view.menu.d
    public final void f(int i10) {
        this.f1034x0.setHorizontalOffset(i10);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.d
    public final void g(PopupWindow.OnDismissListener onDismissListener) {
        this.F0 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView getListView() {
        return this.f1034x0.getListView();
    }

    @Override // androidx.appcompat.view.menu.d
    public final void h(boolean z10) {
        this.O0 = z10;
    }

    @Override // androidx.appcompat.view.menu.d
    public final void i(int i10) {
        this.f1034x0.setVerticalOffset(i10);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return !this.K0 && this.f1034x0.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
        if (menuBuilder != this.f1029r0) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.I0;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z10);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.K0 = true;
        this.f1029r0.close();
        ViewTreeObserver viewTreeObserver = this.J0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.J0 = this.H0.getViewTreeObserver();
            }
            this.J0.removeGlobalOnLayoutListener(this.f1035y0);
            this.J0 = null;
        }
        this.H0.removeOnAttachStateChangeListener(this.E0);
        PopupWindow.OnDismissListener onDismissListener = this.F0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        boolean z10;
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.f1028q0, subMenuBuilder, this.H0, this.f1031t0, this.v0, this.f1033w0);
            menuPopupHelper.setPresenterCallback(this.I0);
            int size = subMenuBuilder.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = subMenuBuilder.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            menuPopupHelper.setForceShowIcon(z10);
            menuPopupHelper.setOnDismissListener(this.F0);
            this.F0 = null;
            this.f1029r0.close(false);
            MenuPopupWindow menuPopupWindow = this.f1034x0;
            int horizontalOffset = menuPopupWindow.getHorizontalOffset();
            int verticalOffset = menuPopupWindow.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.N0, this.G0.getLayoutDirection()) & 7) == 5) {
                horizontalOffset += this.G0.getWidth();
            }
            if (menuPopupHelper.tryShow(horizontalOffset, verticalOffset)) {
                MenuPresenter.Callback callback = this.I0;
                if (callback != null) {
                    callback.onOpenSubMenu(subMenuBuilder);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.I0 = callback;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (this.K0 || (view = this.G0) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.H0 = view;
        MenuPopupWindow menuPopupWindow = this.f1034x0;
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setModal(true);
        View view2 = this.H0;
        boolean z10 = this.J0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.J0 = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1035y0);
        }
        view2.addOnAttachStateChangeListener(this.E0);
        menuPopupWindow.setAnchorView(view2);
        menuPopupWindow.setDropDownGravity(this.N0);
        boolean z11 = this.L0;
        Context context = this.f1028q0;
        MenuAdapter menuAdapter = this.f1030s0;
        if (!z11) {
            this.M0 = d.b(menuAdapter, context, this.f1032u0);
            this.L0 = true;
        }
        menuPopupWindow.setContentWidth(this.M0);
        menuPopupWindow.setInputMethodMode(2);
        menuPopupWindow.setEpicenterBounds(this.f1027p0);
        menuPopupWindow.show();
        ListView listView = menuPopupWindow.getListView();
        listView.setOnKeyListener(this);
        if (this.O0) {
            MenuBuilder menuBuilder = this.f1029r0;
            if (menuBuilder.getHeaderTitle() != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuBuilder.getHeaderTitle());
                }
                frameLayout.setEnabled(false);
                listView.addHeaderView(frameLayout, null, false);
            }
        }
        menuPopupWindow.setAdapter(menuAdapter);
        menuPopupWindow.show();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z10) {
        this.L0 = false;
        MenuAdapter menuAdapter = this.f1030s0;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            e eVar = e.this;
            ViewTreeObserver viewTreeObserver = eVar.J0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    eVar.J0 = view.getViewTreeObserver();
                }
                eVar.J0.removeGlobalOnLayoutListener(eVar.f1035y0);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.d
    public final void a(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }
}
