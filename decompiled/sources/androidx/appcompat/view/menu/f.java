package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: compiled from: SubMenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class f extends MenuWrapperICS implements SubMenu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SupportSubMenu f1038e;

    public f(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f1038e = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f1038e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return a(this.f1038e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        this.f1038e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        this.f1038e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f1038e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f1038e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f1038e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1038e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f1038e.setIcon(drawable);
        return this;
    }
}
