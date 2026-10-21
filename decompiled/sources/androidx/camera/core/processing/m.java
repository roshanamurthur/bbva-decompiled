package androidx.camera.core.processing;

import com.bbva.cellscore.app.WebViewConfigurator;
import com.bbva.ui.component.menu.SlideMenuView;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2221p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2222q0;

    public /* synthetic */ m(Object obj, int i10) {
        this.f2221p0 = i10;
        this.f2222q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2221p0;
        Object obj = this.f2222q0;
        switch (i10) {
            case 0:
                ((SurfaceProcessorNode) obj).lambda$release$1();
                break;
            case 1:
                WebViewConfigurator this$0 = (WebViewConfigurator) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f26926a.loadUrl(this$0.f26928c);
                break;
            case 2:
                SlideMenuView.setUpRecycleViewMarginBottom$lambda$20((SlideMenuView) obj);
                break;
            case 3:
                SelfieFragment selfieFragment = (SelfieFragment) obj;
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                selfieFragment.J();
                selfieFragment.M();
                selfieFragment.E();
                break;
            default:
                Function0 error = (Function0) obj;
                Intrinsics.checkNotNullParameter(error, "$error");
                error.invoke();
                break;
        }
    }
}
