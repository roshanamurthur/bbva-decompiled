package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuBuilder f1008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f1012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MenuPresenter.Callback f1015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f1016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f1017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f1018l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            MenuPopupHelper.this.onDismiss();
        }
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this(context, menuBuilder, null, false, R.attr.popupMenuStyle, 0);
    }

    public final void a(int i10, int i11, boolean z10, boolean z11) {
        d popup = getPopup();
        popup.h(z11);
        if (z10) {
            if ((GravityCompat.getAbsoluteGravity(this.f1013g, this.f1012f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f1012f.getWidth();
            }
            popup.f(i10);
            popup.i(i11);
            int i12 = (int) ((this.f1007a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.f1027p0 = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        popup.show();
    }

    public void dismiss() {
        if (isShowing()) {
            this.f1016j.dismiss();
        }
    }

    public int getGravity() {
        return this.f1013g;
    }

    public ListView getListView() {
        return getPopup().getListView();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d getPopup() {
        d eVar;
        if (this.f1016j == null) {
            Context context = this.f1007a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                eVar = new CascadingMenuPopup(this.f1007a, this.f1012f, this.f1010d, this.f1011e, this.f1009c);
            } else {
                eVar = new e(this.f1007a, this.f1008b, this.f1012f, this.f1009c, this.f1010d, this.f1011e);
            }
            eVar.a(this.f1008b);
            eVar.g(this.f1018l);
            eVar.c(this.f1012f);
            eVar.setCallback(this.f1015i);
            eVar.d(this.f1014h);
            eVar.e(this.f1013g);
            this.f1016j = eVar;
        }
        return this.f1016j;
    }

    public boolean isShowing() {
        d dVar = this.f1016j;
        return dVar != null && dVar.isShowing();
    }

    public void onDismiss() {
        this.f1016j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1017k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void setAnchorView(@NonNull View view) {
        this.f1012f = view;
    }

    public void setForceShowIcon(boolean z10) {
        this.f1014h = z10;
        d dVar = this.f1016j;
        if (dVar != null) {
            dVar.d(z10);
        }
    }

    public void setGravity(int i10) {
        this.f1013g = i10;
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f1017k = onDismissListener;
    }

    public void setPresenterCallback(@Nullable MenuPresenter.Callback callback) {
        this.f1015i = callback;
        d dVar = this.f1016j;
        if (dVar != null) {
            dVar.setCallback(callback);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.f1012f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view) {
        this(context, menuBuilder, view, false, R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z10, @AttrRes int i10) {
        this(context, menuBuilder, view, z10, i10, 0);
    }

    public void show(int i10, int i11) {
        if (!tryShow(i10, i11)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z10, @AttrRes int i10, @StyleRes int i11) {
        this.f1013g = GravityCompat.START;
        this.f1018l = new a();
        this.f1007a = context;
        this.f1008b = menuBuilder;
        this.f1012f = view;
        this.f1009c = z10;
        this.f1010d = i10;
        this.f1011e = i11;
    }

    public boolean tryShow(int i10, int i11) {
        if (isShowing()) {
            return true;
        }
        if (this.f1012f == null) {
            return false;
        }
        a(i10, i11, true, true);
        return true;
    }
}
