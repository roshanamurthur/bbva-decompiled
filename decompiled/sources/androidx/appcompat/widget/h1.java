package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: ListPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f1617p0;

    public h1(ListPopupWindow listPopupWindow) {
        this.f1617p0 = listPopupWindow;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        r0 r0Var;
        if (i10 == -1 || (r0Var = this.f1617p0.f1332r0) == null) {
            return;
        }
        r0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
