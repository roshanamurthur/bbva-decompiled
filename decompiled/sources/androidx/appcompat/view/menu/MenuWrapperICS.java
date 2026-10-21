package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuWrapperICS extends a implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SupportMenu f1020d;

    public MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1020d = supportMenu;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(this.f1020d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f1020d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = a(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return b(this.f1020d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        SimpleArrayMap<SupportMenuItem, MenuItem> simpleArrayMap = this.f1022b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap<SupportSubMenu, SubMenu> simpleArrayMap2 = this.f1023c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
        this.f1020d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1020d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return a(this.f1020d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return a(this.f1020d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1020d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f1020d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f1020d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f1020d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        if (this.f1022b != null) {
            int i11 = 0;
            while (i11 < this.f1022b.getSize()) {
                if (this.f1022b.keyAt(i11).getGroupId() == i10) {
                    this.f1022b.removeAt(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f1020d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        if (this.f1022b != null) {
            for (int i11 = 0; i11 < this.f1022b.getSize(); i11++) {
                if (this.f1022b.keyAt(i11).getItemId() == i10) {
                    this.f1022b.removeAt(i11);
                    break;
                }
            }
        }
        this.f1020d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f1020d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f1020d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f1020d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1020d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1020d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(this.f1020d.add(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return b(this.f1020d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(this.f1020d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return b(this.f1020d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(this.f1020d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return b(this.f1020d.addSubMenu(i10, i11, i12, i13));
    }
}
