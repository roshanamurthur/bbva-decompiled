package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: NavItemSelectedListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ActionBar.OnNavigationListener f695p0;

    public c0(ActionBar.OnNavigationListener onNavigationListener) {
        this.f695p0 = onNavigationListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ActionBar.OnNavigationListener onNavigationListener = this.f695p0;
        if (onNavigationListener != null) {
            onNavigationListener.onNavigationItemSelected(i10, j10);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
