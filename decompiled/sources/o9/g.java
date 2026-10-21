package o9;

import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends Lambda implements Function1<DeepLinkModel, LandingContract.Intent.Notification> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g f85327p0 = new g(1);

    @Override // kotlin.jvm.functions.Function1
    public final LandingContract.Intent.Notification invoke(DeepLinkModel deepLinkModel) {
        DeepLinkModel deeplink = deepLinkModel;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new LandingContract.Intent.Notification(false, null, RouteConstants.DYNAMICS_AND_REWARDS, deeplink, 2, null);
    }
}
