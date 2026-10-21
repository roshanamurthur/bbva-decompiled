package ne;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.sidesheet.SideSheetCallback;
import com.google.android.material.sidesheet.SideSheetDialog;

/* JADX INFO: compiled from: SideSheetDialog.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends SideSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SideSheetDialog f84515a;

    public i(SideSheetDialog sideSheetDialog) {
        this.f84515a = sideSheetDialog;
    }

    @Override // com.google.android.material.sidesheet.SideSheetCallback, ne.c
    public final void onStateChanged(@NonNull View view, int i10) {
        if (i10 == 5) {
            this.f84515a.cancel();
        }
    }

    @Override // com.google.android.material.sidesheet.SideSheetCallback, ne.c
    public final void onSlide(@NonNull View view, float f6) {
    }
}
