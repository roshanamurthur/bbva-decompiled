package androidx.room;

import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.utils.Utils;
import com.bbva.ui.widget.topsnackbar.TSnackbar;
import com.dasnano.vddocumentcapture.activities.DocumentClassificationActivity;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f23376p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f23377q0;

    public /* synthetic */ f(Object obj, int i10) {
        this.f23376p0 = i10;
        this.f23377q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23376p0;
        Object obj = this.f23377q0;
        switch (i10) {
            case 0:
                QueryInterceptorStatement this$0 = (QueryInterceptorStatement) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23266s0.onQuery(this$0.f23264q0, this$0.f23267t0);
                break;
            case 1:
                HashMap map = LottieCompositionFactory.f25604a;
                Utils.closeQuietly((InputStream) obj);
                break;
            case 2:
                com.bbva.ui.widget.topsnackbar.c cVar = (com.bbva.ui.widget.topsnackbar.c) obj;
                cVar.getClass();
                int i11 = TSnackbar.LENGTH_INDEFINITE;
                cVar.f37772a.d(3);
                break;
            case 3:
                DocumentClassificationActivity this$1 = (DocumentClassificationActivity) obj;
                DocumentClassificationActivity.Companion broadcastString = DocumentClassificationActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            default:
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                ((SelfieFragment) obj).E();
                break;
        }
    }
}
