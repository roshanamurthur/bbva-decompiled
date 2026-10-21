package androidx.appcompat.widget;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.QueryInterceptorStatement;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.utils.Utils;
import com.appsflyer.internal.AFc1wSDK;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.glomohybrid.welcome.R;
import com.bbva.glomohybrid.welcome.databinding.ActivityWelcomeBinding;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1693p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1694q0;

    public /* synthetic */ w1(Object obj, int i10) {
        this.f1693p0 = i10;
        this.f1694q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1693p0;
        Object obj = this.f1694q0;
        switch (i10) {
            case 0:
                ((y1) obj).c(false);
                break;
            case 1:
                QueryInterceptorStatement this$0 = (QueryInterceptorStatement) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23266s0.onQuery(this$0.f23264q0, this$0.f23267t0);
                break;
            case 2:
                HashMap map = LottieCompositionFactory.f25604a;
                Utils.closeQuietly((Source) obj);
                break;
            case 3:
                AFc1wSDK.AFInAppEventParameterName((AFc1wSDK) obj);
                break;
            case 4:
                WelcomeActivity welcomeActivity = (WelcomeActivity) obj;
                WelcomeActivity.Companion companion = WelcomeActivity.Companion;
                long integer = welcomeActivity.getResources().getInteger(R.integer.translation_duration);
                ConstraintLayout constraintLayout = ((ActivityWelcomeBinding) welcomeActivity.f34760s0.getValue()).mainView;
                constraintLayout.setTranslationY(40.0f);
                constraintLayout.setAlpha(0.0f);
                constraintLayout.animate().setDuration(integer).alpha(1.0f).translationY(0.0f);
                break;
            case 5:
                CommandCallback callback = (CommandCallback) obj;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.sendError(Errors.ErrorDefault);
                break;
            default:
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                ((SelfieFragment) obj).E();
                break;
        }
    }
}
