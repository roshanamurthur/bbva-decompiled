package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AlertController f696p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AlertController.AlertParams f697q0;

    public d(AlertController.AlertParams alertParams, AlertController alertController) {
        this.f697q0 = alertParams;
        this.f696p0 = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        AlertController.AlertParams alertParams = this.f697q0;
        DialogInterface.OnClickListener onClickListener = alertParams.mOnClickListener;
        AlertController alertController = this.f696p0;
        onClickListener.onClick(alertController.f524b, i10);
        if (alertParams.mIsSingleChoice) {
            return;
        }
        alertController.f524b.dismiss();
    }
}
