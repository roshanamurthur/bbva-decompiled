package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: compiled from: ListPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f1600p0;

    public g1(ListPopupWindow listPopupWindow) {
        this.f1600p0 = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListPopupWindow listPopupWindow = this.f1600p0;
        View anchorView = listPopupWindow.getAnchorView();
        if (anchorView == null || anchorView.getWindowToken() == null) {
            return;
        }
        listPopupWindow.show();
    }
}
