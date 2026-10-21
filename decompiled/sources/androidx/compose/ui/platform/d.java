package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;
import com.noknok.android.client.asm.authui.fps.FpAuthUiFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f17393p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f17394q0;

    public /* synthetic */ d(Object obj, int i10) {
        this.f17393p0 = i10;
        this.f17394q0 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f17393p0;
        Object obj = this.f17394q0;
        switch (i10) {
            case 0:
                AndroidComposeView this$0 = (AndroidComposeView) obj;
                AndroidComposeView.Companion companion = AndroidComposeView.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.p();
                break;
            default:
                ((FpAuthUiFragment) obj).b();
                break;
        }
    }
}
