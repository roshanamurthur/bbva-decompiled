package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuBuilder implements SupportMenu {
    public static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Callback f950e;
    public ContextMenu.ContextMenuInfo m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f960p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MenuItemImpl f968x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f970z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f957l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f961q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f962r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f963s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f964t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f965u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList<MenuItemImpl> f966v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<MenuPresenter>> f967w = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f969y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<MenuItemImpl> f951f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<MenuItemImpl> f952g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f953h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<MenuItemImpl> f954i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<MenuItemImpl> f955j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f956k = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface Callback {
        boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem);

        void onMenuModeChange(@NonNull MenuBuilder menuBuilder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ItemInvoker {
        boolean invokeItem(MenuItemImpl menuItemImpl);
    }

    public MenuBuilder(Context context) {
        this.f946a = context;
        this.f947b = context.getResources();
        f(true);
    }

    public boolean a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        Callback callback = this.f950e;
        return callback != null && callback.onMenuItemSelected(menuBuilder, menuItem);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f946a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (A[i14] << 16) | (65535 & i12);
        MenuItemImpl menuItemImpl = new MenuItemImpl(this, i10, i11, i12, i15, charSequence, this.f957l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            menuItemImpl.E = contextMenuInfo;
        }
        ArrayList<MenuItemImpl> arrayList = this.f951f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).getOrdering() <= i15) {
                i13 = size + 1;
                arrayList.add(i13, menuItemImpl);
                onItemsChanged(true);
                return menuItemImpl;
            }
        }
        i13 = 0;
        arrayList.add(i13, menuItemImpl);
        onItemsChanged(true);
        return menuItemImpl;
    }

    public void addMenuPresenter(MenuPresenter menuPresenter) {
        addMenuPresenter(menuPresenter, this.f946a);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final MenuItemImpl b(int i10, KeyEvent keyEvent) {
        ArrayList<MenuItemImpl> arrayList = this.f966v;
        arrayList.clear();
        c(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemImpl menuItemImpl = arrayList.get(i11);
            char alphabeticShortcut = zIsQwertyMode ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && alphabeticShortcut == '\b' && i10 == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    public final void c(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList<MenuItemImpl> arrayList2 = this.f951f;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItemImpl menuItemImpl = arrayList2.get(i11);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).c(arrayList, i10, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if ((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((zIsQwertyMode ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & SupportMenu.SUPPORTED_MODIFIERS_MASK) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if (alphabeticShortcut != cArr[0] && alphabeticShortcut != cArr[2]) {
                        if (zIsQwertyMode && alphabeticShortcut == '\b') {
                            if (i10 == 67) {
                            }
                        }
                    }
                    if (menuItemImpl.isEnabled()) {
                        arrayList.add(menuItemImpl);
                    }
                }
            }
        }
    }

    public void changeMenuMode() {
        Callback callback = this.f950e;
        if (callback != null) {
            callback.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl = this.f968x;
        if (menuItemImpl != null) {
            collapseItemActionView(menuItemImpl);
        }
        this.f951f.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.f961q = true;
        clear();
        clearHeader();
        this.f967w.clear();
        this.f961q = false;
        this.f962r = false;
        this.f963s = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.f959o = null;
        this.f958n = null;
        this.f960p = null;
        onItemsChanged(false);
    }

    public final void close(boolean z10) {
        if (this.f965u) {
            return;
        }
        this.f965u = true;
        CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
        for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.onCloseMenu(this, z10);
            }
        }
        this.f965u = false;
    }

    public boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
        boolean zCollapseItemActionView = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f968x == menuItemImpl) {
            stopDispatchingItemsChanged();
            for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter != null) {
                    zCollapseItemActionView = menuPresenter.collapseItemActionView(this, menuItemImpl);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.f968x = null;
            }
        }
        return zCollapseItemActionView;
    }

    public final void d(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList<MenuItemImpl> arrayList = this.f951f;
            if (i10 >= arrayList.size()) {
                return;
            }
            arrayList.remove(i10);
            if (z10) {
                onItemsChanged(true);
            }
        }
    }

    public final void e(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f960p = view;
            this.f958n = null;
            this.f959o = null;
        } else {
            if (i10 > 0) {
                this.f958n = this.f947b.getText(i10);
            } else if (charSequence != null) {
                this.f958n = charSequence;
            }
            if (i11 > 0) {
                this.f959o = ContextCompat.getDrawable(getContext(), i11);
            } else if (drawable != null) {
                this.f959o = drawable;
            }
            this.f960p = null;
        }
        onItemsChanged(false);
    }

    public boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
        boolean zExpandItemActionView = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter != null) {
                zExpandItemActionView = menuPresenter.expandItemActionView(this, menuItemImpl);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.f968x = menuItemImpl;
        }
        return zExpandItemActionView;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final void f(boolean z10) {
        boolean z11;
        if (z10) {
            if (this.f947b.getConfiguration().keyboard != 1) {
                Context context = this.f946a;
                z11 = ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(context), context);
            }
        }
        this.f949d = z11;
    }

    public int findGroupIndex(int i10) {
        return findGroupIndex(i10, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemImpl menuItemImpl = this.f951f.get(i11);
            if (menuItemImpl.getItemId() == i10) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f951f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public void flagActionItems() {
        ArrayList<MenuItemImpl> visibleItems = getVisibleItems();
        if (this.f956k) {
            CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
            boolean zFlagActionItems = false;
            for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zFlagActionItems |= menuPresenter.flagActionItems();
                }
            }
            ArrayList<MenuItemImpl> arrayList = this.f954i;
            ArrayList<MenuItemImpl> arrayList2 = this.f955j;
            if (zFlagActionItems) {
                arrayList.clear();
                arrayList2.clear();
                int size = visibleItems.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItemImpl menuItemImpl = visibleItems.get(i10);
                    if (menuItemImpl.isActionButton()) {
                        arrayList.add(menuItemImpl);
                    } else {
                        arrayList2.add(menuItemImpl);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(getVisibleItems());
            }
            this.f956k = false;
        }
    }

    public ArrayList<MenuItemImpl> getActionItems() {
        flagActionItems();
        return this.f954i;
    }

    public String getActionViewStatesKey() {
        return "android:menu:actionviewstates";
    }

    public Context getContext() {
        return this.f946a;
    }

    public MenuItemImpl getExpandedItem() {
        return this.f968x;
    }

    public Drawable getHeaderIcon() {
        return this.f959o;
    }

    public CharSequence getHeaderTitle() {
        return this.f958n;
    }

    public View getHeaderView() {
        return this.f960p;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f951f.get(i10);
    }

    public ArrayList<MenuItemImpl> getNonActionItems() {
        flagActionItems();
        return this.f955j;
    }

    @NonNull
    public ArrayList<MenuItemImpl> getVisibleItems() {
        boolean z10 = this.f953h;
        ArrayList<MenuItemImpl> arrayList = this.f952g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<MenuItemImpl> arrayList2 = this.f951f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItemImpl menuItemImpl = arrayList2.get(i10);
            if (menuItemImpl.isVisible()) {
                arrayList.add(menuItemImpl);
            }
        }
        this.f953h = false;
        this.f956k = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f970z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f951f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.f961q;
    }

    public boolean isGroupDividerEnabled() {
        return this.f969y;
    }

    public boolean isQwertyMode() {
        return this.f948c;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return b(i10, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.f949d;
    }

    public void onItemsChanged(boolean z10) {
        if (this.f961q) {
            this.f962r = true;
            if (z10) {
                this.f963s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f953h = true;
            this.f956k = true;
        }
        CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.updateMenuView(z10);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return performItemAction(findItem(i10), i11);
    }

    public boolean performItemAction(MenuItem menuItem, int i10) {
        return performItemAction(menuItem, null, i10);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        MenuItemImpl menuItemImplB = b(i10, keyEvent);
        boolean zPerformItemAction = menuItemImplB != null ? performItemAction(menuItemImplB, i11) : false;
        if ((i11 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iFindGroupIndex = findGroupIndex(i10);
        if (iFindGroupIndex >= 0) {
            ArrayList<MenuItemImpl> arrayList = this.f951f;
            int size = arrayList.size() - iFindGroupIndex;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || arrayList.get(iFindGroupIndex).getGroupId() != i10) {
                    break;
                }
                d(iFindGroupIndex, false);
                i11 = i12;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        d(findItemIndex(i10), true);
    }

    public void removeItemAt(int i10) {
        d(i10, true);
    }

    public void removeMenuPresenter(MenuPresenter menuPresenter) {
        CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
        for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter2 = weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = menuPresenter.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        menuPresenter.onRestoreInstanceState(parcelable);
                    }
                }
            }
        }
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = menuPresenter.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = menuPresenter.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public void setCallback(Callback callback) {
        this.f950e = callback;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.m = contextMenuInfo;
    }

    public MenuBuilder setDefaultShowAsAction(int i10) {
        this.f957l = i10;
        return this;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList<MenuItemImpl> arrayList = this.f951f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemImpl menuItemImpl = arrayList.get(i11);
            if (menuItemImpl.getGroupId() == i10) {
                menuItemImpl.setExclusiveCheckable(z11);
                menuItemImpl.setCheckable(z10);
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f969y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        ArrayList<MenuItemImpl> arrayList = this.f951f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemImpl menuItemImpl = arrayList.get(i11);
            if (menuItemImpl.getGroupId() == i10) {
                menuItemImpl.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        ArrayList<MenuItemImpl> arrayList = this.f951f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemImpl menuItemImpl = arrayList.get(i11);
            if (menuItemImpl.getGroupId() == i10) {
                int i12 = menuItemImpl.f994y;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                menuItemImpl.f994y = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            onItemsChanged(true);
        }
    }

    public MenuBuilder setHeaderIconInt(Drawable drawable) {
        e(0, null, 0, drawable, null);
        return this;
    }

    public MenuBuilder setHeaderTitleInt(CharSequence charSequence) {
        e(0, charSequence, 0, null, null);
        return this;
    }

    public MenuBuilder setHeaderViewInt(View view) {
        e(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z10) {
        this.f964t = z10;
    }

    public void setOverrideVisibleItems(boolean z10) {
        this.f970z = z10;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f948c = z10;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z10) {
        if (this.f949d == z10) {
            return;
        }
        f(z10);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f951f.size();
    }

    public void startDispatchingItemsChanged() {
        this.f961q = false;
        if (this.f962r) {
            this.f962r = false;
            onItemsChanged(this.f963s);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.f961q) {
            return;
        }
        this.f961q = true;
        this.f962r = false;
        this.f963s = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return addInternal(0, 0, 0, this.f947b.getString(i10));
    }

    public void addMenuPresenter(MenuPresenter menuPresenter, Context context) {
        this.f967w.add(new WeakReference<>(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.f956k = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f947b.getString(i10));
    }

    public int findGroupIndex(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f951f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, MenuPresenter menuPresenter, int i10) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        boolean zOnSubMenuSelected = false;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean zInvoke = menuItemImpl.invoke();
        ActionProvider supportActionProvider = menuItemImpl.getSupportActionProvider();
        boolean z10 = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (menuItemImpl.hasCollapsibleActionView()) {
            zInvoke |= menuItemImpl.expandActionView();
            if (zInvoke) {
                close(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                close(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.setSubMenu(new SubMenuBuilder(getContext(), this, menuItemImpl));
            }
            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
            if (z10) {
                supportActionProvider.onPrepareSubMenu(subMenuBuilder);
            }
            CopyOnWriteArrayList<WeakReference<MenuPresenter>> copyOnWriteArrayList = this.f967w;
            if (!copyOnWriteArrayList.isEmpty()) {
                zOnSubMenuSelected = menuPresenter != null ? menuPresenter.onSubMenuSelected(subMenuBuilder) : false;
                for (WeakReference<MenuPresenter> weakReference : copyOnWriteArrayList) {
                    MenuPresenter menuPresenter2 = weakReference.get();
                    if (menuPresenter2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zOnSubMenuSelected) {
                        zOnSubMenuSelected = menuPresenter2.onSubMenuSelected(subMenuBuilder);
                    }
                }
            }
            zInvoke |= zOnSubMenuSelected;
            if (!zInvoke) {
                close(true);
            }
        } else if ((i10 & 1) == 0) {
            close(true);
        }
        return zInvoke;
    }

    public MenuBuilder setHeaderIconInt(int i10) {
        e(0, null, i10, null, null);
        return this;
    }

    public MenuBuilder setHeaderTitleInt(int i10) {
        e(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return addInternal(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i10, i11, i12, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f946a, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenuBuilder);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return addInternal(i10, i11, i12, this.f947b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f947b.getString(i13));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public MenuBuilder getRootMenu() {
        return this;
    }
}
