package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class SupportActionModeWrapper extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionMode f818b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class CallbackWrapper implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.ActionMode.Callback f819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<SupportActionModeWrapper> f821c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SimpleArrayMap<Menu, Menu> f822d = new SimpleArrayMap<>();

        public CallbackWrapper(Context context, android.view.ActionMode.Callback callback) {
            this.f820b = context;
            this.f819a = callback;
        }

        public android.view.ActionMode getActionModeWrapper(ActionMode actionMode) {
            ArrayList<SupportActionModeWrapper> arrayList = this.f821c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                SupportActionModeWrapper supportActionModeWrapper = arrayList.get(i10);
                if (supportActionModeWrapper != null && supportActionModeWrapper.f818b == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f820b, actionMode);
            arrayList.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f819a.onActionItemClicked(getActionModeWrapper(actionMode), new MenuItemWrapperICS(this.f820b, (SupportMenuItem) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            android.view.ActionMode actionModeWrapper = getActionModeWrapper(actionMode);
            SimpleArrayMap<Menu, Menu> simpleArrayMap = this.f822d;
            Menu menuWrapperICS = simpleArrayMap.get(menu);
            if (menuWrapperICS == null) {
                menuWrapperICS = new MenuWrapperICS(this.f820b, (SupportMenu) menu);
                simpleArrayMap.put(menu, menuWrapperICS);
            }
            return this.f819a.onCreateActionMode(actionModeWrapper, menuWrapperICS);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f819a.onDestroyActionMode(getActionModeWrapper(actionMode));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            android.view.ActionMode actionModeWrapper = getActionModeWrapper(actionMode);
            SimpleArrayMap<Menu, Menu> simpleArrayMap = this.f822d;
            Menu menuWrapperICS = simpleArrayMap.get(menu);
            if (menuWrapperICS == null) {
                menuWrapperICS = new MenuWrapperICS(this.f820b, (SupportMenu) menu);
                simpleArrayMap.put(menu, menuWrapperICS);
            }
            return this.f819a.onPrepareActionMode(actionModeWrapper, menuWrapperICS);
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.f817a = context;
        this.f818b = actionMode;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f818b.finish();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f818b.getCustomView();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuWrapperICS(this.f817a, (SupportMenu) this.f818b.getMenu());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f818b.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f818b.getSubtitle();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f818b.getTag();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f818b.getTitle();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f818b.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f818b.invalidate();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f818b.isTitleOptional();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f818b.setCustomView(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f818b.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f818b.setTag(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f818b.setTitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f818b.setTitleOptionalHint(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f818b.setSubtitle(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f818b.setTitle(i10);
    }
}
