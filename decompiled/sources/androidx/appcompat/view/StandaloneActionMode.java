package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Context f811r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ActionBarContextView f812s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ActionMode.Callback f813t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public WeakReference<View> f814u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f815w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final MenuBuilder f816x0;

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z10) {
        this.f811r0 = context;
        this.f812s0 = actionBarContextView;
        this.f813t0 = callback;
        MenuBuilder defaultShowAsAction = new MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f816x0 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f815w0 = z10;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void finish() {
        if (this.v0) {
            return;
        }
        this.v0 = true;
        this.f813t0.onDestroyActionMode(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public View getCustomView() {
        WeakReference<View> weakReference = this.f814u0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public Menu getMenu() {
        return this.f816x0;
    }

    @Override // androidx.appcompat.view.ActionMode
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.f812s0.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f812s0.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence getTitle() {
        return this.f812s0.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void invalidate() {
        this.f813t0.onPrepareActionMode(this, this.f816x0);
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isTitleOptional() {
        return this.f812s0.isTitleOptional();
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isUiFocusable() {
        return this.f815w0;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        return this.f813t0.onActionItemClicked(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
        invalidate();
        this.f812s0.showOverflowMenu();
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return true;
        }
        new MenuPopupHelper(this.f812s0.getContext(), subMenuBuilder).show();
        return true;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setCustomView(View view) {
        this.f812s0.setCustomView(view);
        this.f814u0 = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f812s0.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f812s0.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        super.setTitleOptionalHint(z10);
        this.f812s0.setTitleOptional(z10);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(int i10) {
        setSubtitle(this.f811r0.getString(i10));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(int i10) {
        setTitle(this.f811r0.getString(i10));
    }

    public void onCloseSubMenu(SubMenuBuilder subMenuBuilder) {
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
    }
}
