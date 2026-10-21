package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: compiled from: BaseMenuWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SimpleArrayMap<SupportMenuItem, MenuItem> f1022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SimpleArrayMap<SupportSubMenu, SubMenu> f1023c;

    public a(Context context) {
        this.f1021a = context;
    }

    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f1022b == null) {
            this.f1022b = new SimpleArrayMap<>();
        }
        MenuItem menuItem2 = this.f1022b.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f1021a, supportMenuItem);
        this.f1022b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    public final SubMenu b(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f1023c == null) {
            this.f1023c = new SimpleArrayMap<>();
        }
        SubMenu subMenu2 = this.f1023c.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f1021a, supportSubMenu);
        this.f1023c.put(supportSubMenu, fVar);
        return fVar;
    }
}
