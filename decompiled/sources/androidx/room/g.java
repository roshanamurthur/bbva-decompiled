package androidx.room;

import android.view.View;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.material.internal.ViewUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f23378p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f23379q0;

    public /* synthetic */ g(Object obj, int i10) {
        this.f23378p0 = i10;
        this.f23379q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23378p0;
        Object obj = this.f23379q0;
        switch (i10) {
            case 0:
                QueryInterceptorStatement this$0 = (QueryInterceptorStatement) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23266s0.onQuery(this$0.f23264q0, this$0.f23267t0);
                break;
            case 1:
                CommandCallback commandCallback = (CommandCallback) obj;
                Intrinsics.checkNotNullParameter(commandCallback, "$commandCallback");
                commandCallback.sendError(Errors.ErrorCanceled);
                break;
            case 2:
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                ((SelfieFragment) obj).E();
                break;
            default:
                ViewUtils.requestFocusAndShowKeyboard((View) obj, false);
                break;
        }
    }
}
