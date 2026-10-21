package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends CursorAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f690p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f691q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f692r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ AlertController f693s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ AlertController.AlertParams f694t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AlertController.AlertParams alertParams, Context context, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, false);
        this.f694t0 = alertParams;
        this.f692r0 = recycleListView;
        this.f693s0 = alertController;
        Cursor cursor2 = getCursor();
        this.f690p0 = cursor2.getColumnIndexOrThrow(alertParams.mLabelColumn);
        this.f691q0 = cursor2.getColumnIndexOrThrow(alertParams.mIsCheckedColumn);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f690p0));
        this.f692r0.setItemChecked(cursor.getPosition(), cursor.getInt(this.f691q0) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f694t0.mInflater.inflate(this.f693s0.L, viewGroup, false);
    }
}
