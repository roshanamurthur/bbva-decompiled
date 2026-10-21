package o9;

import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Lambda implements Function1<DeepLinkModel, LandingContract.Intent.Notification> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f85316p0 = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final LandingContract.Intent.Notification invoke(DeepLinkModel deepLinkModel) {
        DeepLinkModel it = deepLinkModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return new LandingContract.Intent.Notification(true, it, null, null, 12, null);
    }
}
