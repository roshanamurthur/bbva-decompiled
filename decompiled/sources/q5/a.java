package q5;

import android.content.DialogInterface;
import com.bbva.component.ui.login.credentials.documentlist.DocumentListSelector;
import com.dasnano.vdvideoselfiecapture.fragments.VideoFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92762p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f92763q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f92762p0 = i10;
        this.f92763q0 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f92762p0;
        Object obj = this.f92763q0;
        switch (i11) {
            case 0:
                DocumentListSelector this$0 = (DocumentListSelector) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f28495b = i10;
                break;
            default:
                VideoFragment videoFragment = (VideoFragment) obj;
                videoFragment.f39729b1.set(false);
                videoFragment.L0.removeCallbacks(videoFragment.R2);
                videoFragment.L0.postDelayed(videoFragment.R2, videoFragment.r1);
                break;
        }
    }
}
