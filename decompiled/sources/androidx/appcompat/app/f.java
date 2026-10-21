package androidx.appcompat.app;

import android.content.Context;
import android.view.MotionEvent;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.material.search.SearchView;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f723p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f724q0;

    public /* synthetic */ f(Object obj, int i10) {
        this.f723p0 = i10;
        this.f724q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f723p0;
        Object obj = this.f724q0;
        switch (i10) {
            case 0:
                AppCompatDelegate.e((Context) obj);
                return;
            case 1:
                ((ListenableFuture) obj).cancel(true);
                return;
            case 2:
                ((TakePictureManager) obj).issueNextRequest();
                return;
            case 3:
                AndroidComposeView this$0 = (AndroidComposeView) obj;
                AndroidComposeView.Companion companion = AndroidComposeView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.F1 = false;
                MotionEvent motionEvent = this$0.f17019z1;
                Intrinsics.checkNotNull(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
                }
                this$0.n(motionEvent);
                return;
            case 4:
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                ((SelfieFragment) obj).z(null, false);
                return;
            default:
                ((SearchView) obj).show();
                return;
        }
    }
}
