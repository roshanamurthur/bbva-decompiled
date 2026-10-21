package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f706p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AlertController f707q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ AlertController.AlertParams f708r0;

    public e(AlertController.AlertParams alertParams, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f708r0 = alertParams;
        this.f706p0 = recycleListView;
        this.f707q0 = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        AlertController.AlertParams alertParams = this.f708r0;
        boolean[] zArr = alertParams.mCheckedItems;
        AlertController.RecycleListView recycleListView = this.f706p0;
        if (zArr != null) {
            zArr[i10] = recycleListView.isItemChecked(i10);
        }
        alertParams.mOnCheckboxClickListener.onClick(this.f707q0.f524b, i10, recycleListView.isItemChecked(i10));
    }
}
