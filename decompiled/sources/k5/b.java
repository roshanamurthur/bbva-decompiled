package k5;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.ui.landing.access.LandingAccessView;
import com.bbva.component.ui.modal.halfmodal.views.DefaultHalfModalView;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity;
import com.noknok.android.client.asm.authui.fps.FpAuthUiFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import mx.openpay.library.ui.signature.DigitalSignatureTopActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79191p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f79192q0;

    public /* synthetic */ b(Object obj, int i10) {
        this.f79191p0 = i10;
        this.f79192q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f79191p0;
        Object obj = this.f79192q0;
        switch (i10) {
            case 0:
                LandingAccessView this$0 = (LandingAccessView) obj;
                int i11 = LandingAccessView.$stable;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f28395q0.linkTap$component_ui_landing_access_release();
                break;
            case 1:
                DefaultHalfModalView this$1 = (DefaultHalfModalView) obj;
                DefaultHalfModalView.Companion companion = DefaultHalfModalView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$1), null, null, new w5.b(this$1, null), 3, null);
                break;
            case 2:
                WelcomeDistributionActivity this$2 = (WelcomeDistributionActivity) obj;
                WelcomeDistributionActivity.Companion companion2 = WelcomeDistributionActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.navigateTopButton();
                ((AnalyticsManager) this$2.f34802u0.getValue()).trackEvent(AnalyticsEvent.WELCOME_USER_DISTRIBUTION_ACCESS);
                break;
            case 3:
                ((FpAuthUiFragment) obj).a(view);
                break;
            default:
                DigitalSignatureTopActivity.a((DigitalSignatureTopActivity) obj, view);
                break;
        }
    }
}
