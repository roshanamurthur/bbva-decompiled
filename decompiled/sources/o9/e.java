package o9;

import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends Lambda implements Function1<QRPayload, LandingContract.Intent.Notification> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e f85322p0 = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final LandingContract.Intent.Notification invoke(QRPayload qRPayload) {
        QRPayload deeplink = qRPayload;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new LandingContract.Intent.Notification(false, null, RouteConstants.CARDS_WITHOUT_DATA, deeplink, 2, null);
    }
}
