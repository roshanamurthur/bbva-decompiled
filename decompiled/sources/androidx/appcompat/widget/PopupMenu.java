package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: loaded from: classes.dex */
public class PopupMenu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuBuilder f1348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f1349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MenuPopupHelper f1350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnMenuItemClickListener f1351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnDismissListener f1352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f1353g;

    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PopupMenu popupMenu = PopupMenu.this;
            OnDismissListener onDismissListener = popupMenu.f1352f;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(popupMenu);
            }
        }
    }

    public class c extends ForwardingListener {
        public c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu getPopup() {
            return PopupMenu.this.f1350d.getPopup();
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean onForwardingStarted() {
            PopupMenu.this.show();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean onForwardingStopped() {
            PopupMenu.this.dismiss();
            return true;
        }
    }

    public PopupMenu(@NonNull Context context, @NonNull View view) {
        this(context, view, 0);
    }

    public void dismiss() {
        this.f1350d.dismiss();
    }

    @NonNull
    public View.OnTouchListener getDragToOpenListener() {
        if (this.f1353g == null) {
            this.f1353g = new c(this.f1349c);
        }
        return this.f1353g;
    }

    public int getGravity() {
        return this.f1350d.getGravity();
    }

    @NonNull
    public Menu getMenu() {
        return this.f1348b;
    }

    @NonNull
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.f1347a);
    }

    public void inflate(@MenuRes int i10) {
        getMenuInflater().inflate(i10, this.f1348b);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1350d.setForceShowIcon(z10);
    }

    public void setGravity(int i10) {
        this.f1350d.setGravity(i10);
    }

    public void setOnDismissListener(@Nullable OnDismissListener onDismissListener) {
        this.f1352f = onDismissListener;
    }

    public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener onMenuItemClickListener) {
        this.f1351e = onMenuItemClickListener;
    }

    public void show() {
        this.f1350d.show();
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i10) {
        this(context, view, i10, R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i10, @AttrRes int i11, @StyleRes int i12) {
        this.f1347a = context;
        this.f1349c = view;
        MenuBuilder menuBuilder = new MenuBuilder(context);
        this.f1348b = menuBuilder;
        menuBuilder.setCallback(new a());
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context, menuBuilder, view, false, i11, i12);
        this.f1350d = menuPopupHelper;
        menuPopupHelper.setGravity(i10);
        menuPopupHelper.setOnDismissListener(new b());
    }

    public class a implements MenuBuilder.Callback {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.f1351e;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
        }
    }
}
