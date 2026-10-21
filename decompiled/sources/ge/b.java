package ge;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;

/* JADX INFO: compiled from: Chip.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f68602a;

    public b(Chip chip) {
        this.f68602a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        ChipDrawable chipDrawable = this.f68602a.f44249t0;
        if (chipDrawable != null) {
            chipDrawable.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
