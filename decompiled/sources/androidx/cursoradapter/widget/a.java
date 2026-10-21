package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: compiled from: CursorFilter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0075a f20471a;

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CursorFilter.java */
    public interface InterfaceC0075a {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f20471a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorRunQueryOnBackgroundThread = this.f20471a.runQueryOnBackgroundThread(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorRunQueryOnBackgroundThread != null) {
            filterResults.count = cursorRunQueryOnBackgroundThread.getCount();
            filterResults.values = cursorRunQueryOnBackgroundThread;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        InterfaceC0075a interfaceC0075a = this.f20471a;
        Cursor cursor = interfaceC0075a.getCursor();
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        interfaceC0075a.changeCursor((Cursor) obj);
    }
}
