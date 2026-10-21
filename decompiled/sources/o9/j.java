package o9;

import com.bbva.glomohybrid.base.models.QRDeepLinkModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends Lambda implements Function1<QRDeepLinkModel, LandingContract.Intent.Notification> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j f85340p0 = new j(1);

    @Override // kotlin.jvm.functions.Function1
    public final LandingContract.Intent.Notification invoke(QRDeepLinkModel qRDeepLinkModel) {
        QRDeepLinkModel deeplink = qRDeepLinkModel;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new LandingContract.Intent.Notification(false, null, deeplink.getRoute().getRoute(), deeplink.getPayload(), 2, null);
    }
}
