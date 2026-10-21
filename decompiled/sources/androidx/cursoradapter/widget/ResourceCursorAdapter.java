package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f20465p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f20466q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LayoutInflater f20467r0;

    @Deprecated
    public ResourceCursorAdapter(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.f20466q0 = i10;
        this.f20465p0 = i10;
        this.f20467r0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f20467r0.inflate(this.f20466q0, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f20467r0.inflate(this.f20465p0, viewGroup, false);
    }

    public void setDropDownViewResource(int i10) {
        this.f20466q0 = i10;
    }

    public void setViewResource(int i10) {
        this.f20465p0 = i10;
    }

    @Deprecated
    public ResourceCursorAdapter(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f20466q0 = i10;
        this.f20465p0 = i10;
        this.f20467r0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.f20466q0 = i10;
        this.f20465p0 = i10;
        this.f20467r0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
