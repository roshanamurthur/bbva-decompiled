package a6;

import android.view.View;
import com.bbva.component.ui.showinfo.ShowInfoSnackbar;

/* JADX INFO: compiled from: ShowInfoSnackbar.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ShowInfoSnackbar f205p0;

    public a(ShowInfoSnackbar showInfoSnackbar) {
        this.f205p0 = showInfoSnackbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f205p0.fire(ShowInfoSnackbar.ACTION_SNACKBAR_CLICK);
    }
}
