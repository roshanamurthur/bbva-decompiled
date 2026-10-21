package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionMode {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Object f803p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f804q0;

    public interface Callback {
        boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem);

        boolean onCreateActionMode(ActionMode actionMode, Menu menu);

        void onDestroyActionMode(ActionMode actionMode);

        boolean onPrepareActionMode(ActionMode actionMode, Menu menu);
    }

    public abstract void finish();

    public abstract View getCustomView();

    public abstract Menu getMenu();

    public abstract MenuInflater getMenuInflater();

    public abstract CharSequence getSubtitle();

    public Object getTag() {
        return this.f803p0;
    }

    public abstract CharSequence getTitle();

    public boolean getTitleOptionalHint() {
        return this.f804q0;
    }

    public abstract void invalidate();

    public boolean isTitleOptional() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isUiFocusable() {
        return true;
    }

    public abstract void setCustomView(View view);

    public abstract void setSubtitle(int i10);

    public abstract void setSubtitle(CharSequence charSequence);

    public void setTag(Object obj) {
        this.f803p0 = obj;
    }

    public abstract void setTitle(int i10);

    public abstract void setTitle(CharSequence charSequence);

    public void setTitleOptionalHint(boolean z10) {
        this.f804q0 = z10;
    }
}
