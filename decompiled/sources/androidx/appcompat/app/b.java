package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ArrayAdapter<CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f687p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AlertController.AlertParams f688q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AlertController.AlertParams alertParams, Context context, int i10, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i10, R.id.text1, charSequenceArr);
        this.f688q0 = alertParams;
        this.f687p0 = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        boolean[] zArr = this.f688q0.mCheckedItems;
        if (zArr != null && zArr[i10]) {
            this.f687p0.setItemChecked(i10, true);
        }
        return view2;
    }
}
