package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: compiled from: MenuDialogHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MenuBuilder f1024p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlertDialog f1025q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ListMenuPresenter f1026r0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f1024p0.performItemAction((MenuItemImpl) this.f1026r0.getAdapter().getItem(i10), 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z10) {
        AlertDialog alertDialog;
        if ((z10 || menuBuilder == this.f1024p0) && (alertDialog = this.f1025q0) != null) {
            alertDialog.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1026r0.onCloseMenu(this.f1024p0, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        MenuBuilder menuBuilder = this.f1024p0;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1025q0.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1025q0.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                menuBuilder.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return menuBuilder.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
        return false;
    }
}
