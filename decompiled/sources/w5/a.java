package w5;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.ui.modal.halfmodal.views.DefaultHalfModalView;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.material.search.SearchView;
import com.noknok.android.client.asm.authui.fps.FpAuthUiFragment;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import mx.openpay.library.ui.signature.DigitalSignatureTopActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94159p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94160q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f94159p0 = i10;
        this.f94160q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94159p0;
        Object obj = this.f94160q0;
        switch (i10) {
            case 0:
                DefaultHalfModalView this$0 = (DefaultHalfModalView) obj;
                DefaultHalfModalView.Companion companion = DefaultHalfModalView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new c(this$0, null), 3, null);
                break;
            case 1:
                LoginActivity this$1 = (LoginActivity) obj;
                LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.onBackPressed();
                break;
            case 2:
                WelcomeDistributionActivity this$2 = (WelcomeDistributionActivity) obj;
                WelcomeDistributionActivity.Companion companion3 = WelcomeDistributionActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.j().openWeb(new WelcomeContract.Intent.OpenWeb(RouteConstants.ON_BOARDING_SCREEN));
                ((AnalyticsManager) this$2.f34802u0.getValue()).trackEvent(AnalyticsEvent.WELCOME_USER_DISTRIBUTION_REGISTER);
                break;
            case 3:
                SelfieFragment selfieFragment = (SelfieFragment) obj;
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                VDLogger.log(Logger.Tag.CLOSE, "CLOSE_BUTTON with state : %s", selfieFragment.getSelfieState().name());
                selfieFragment.O(new androidx.appcompat.app.f(selfieFragment, 4));
                break;
            case 4:
                int i11 = SearchView.X0;
                ((SearchView) obj).show();
                break;
            case 5:
                ((FpAuthUiFragment) obj).b(view);
                break;
            default:
                DigitalSignatureTopActivity.b((DigitalSignatureTopActivity) obj, view);
                break;
        }
    }
}
