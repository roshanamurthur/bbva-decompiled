package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AppCompatDelegate f631s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final KeyEventDispatcher.Component f632t0;

    public AppCompatDialog(@NonNull Context context) {
        this(context, 0);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().addContentView(view, layoutParams);
    }

    public final void c() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.set(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.set(getWindow().getDecorView(), this);
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().onDestroy();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.dispatchKeyEvent(this.f632t0, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@IdRes int i10) {
        return (T) getDelegate().findViewById(i10);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.f631s0 == null) {
            this.f631s0 = AppCompatDelegate.create(this, this);
        }
        return this.f631s0;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i10) {
        c();
        getDelegate().setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().requestWindowFeature(i10);
    }

    public AppCompatDialog(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.f632t0 = new KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.b0
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f689p0.d(keyEvent);
            }
        };
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@NonNull View view) {
        c();
        getDelegate().setContentView(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        getDelegate().setTitle(getContext().getString(i10));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        c();
        getDelegate().setContentView(view, layoutParams);
    }

    public AppCompatDialog(@NonNull Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.f632t0 = new KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.b0
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f689p0.d(keyEvent);
            }
        };
        AppCompatDelegate delegate = getDelegate();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        delegate.setTheme(i10);
        delegate.onCreate(null);
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }
}
