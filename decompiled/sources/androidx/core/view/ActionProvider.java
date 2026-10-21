package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActionProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SubUiVisibilityListener f20171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VisibilityListener f20172c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean z10);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public ActionProvider(@NonNull Context context) {
        this.f20170a = context;
    }

    @NonNull
    public Context getContext() {
        return this.f20170a;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    @NonNull
    public abstract View onCreateActionView();

    @NonNull
    public View onCreateActionView(@NonNull MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.f20172c == null || !overridesItemVisibility()) {
            return;
        }
        this.f20172c.onActionProviderVisibilityChanged(isVisible());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void reset() {
        this.f20172c = null;
        this.f20171b = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSubUiVisibilityListener(@Nullable SubUiVisibilityListener subUiVisibilityListener) {
        this.f20171b = subUiVisibilityListener;
    }

    public void setVisibilityListener(@Nullable VisibilityListener visibilityListener) {
        if (this.f20172c != null && visibilityListener != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f20172c = visibilityListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void subUiVisibilityChanged(boolean z10) {
        SubUiVisibilityListener subUiVisibilityListener = this.f20171b;
        if (subUiVisibilityListener != null) {
            subUiVisibilityListener.onSubUiVisibilityChanged(z10);
        }
    }

    public void onPrepareSubMenu(@NonNull SubMenu subMenu) {
    }
}
