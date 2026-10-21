package va;

import android.os.Bundle;
import com.bbva.glomohybrid.base.deeplink.constants.DynamicLinkConstants;
import com.bbva.notifications.activity.NotificationActivity;
import com.bbva.notifications.model.DeepLinkInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NotificationActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements Function1<DeepLinkInfo, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NotificationActivity f93996p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NotificationActivity notificationActivity) {
        super(1);
        this.f93996p0 = notificationActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DeepLinkInfo deepLinkInfo) {
        DeepLinkInfo deepLinkInfo2 = deepLinkInfo;
        Bundle bundle = new Bundle();
        bundle.putBoolean(DynamicLinkConstants.COMES_FROM_DEEPLINK_KEY, deepLinkInfo2.getRead());
        this.f93996p0.f(bundle, deepLinkInfo2.getForceLaunch());
        return Unit.INSTANCE;
    }
}
