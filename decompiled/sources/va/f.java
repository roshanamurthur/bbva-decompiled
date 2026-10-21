package va;

import android.os.Bundle;
import com.bbva.glomohybrid.base.deeplink.constants.DynamicLinkConstants;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NotificationNoCommercialActivity f94005p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        super(1);
        this.f94005p0 = notificationNoCommercialActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Bundle bundle = new Bundle();
        Intrinsics.checkNotNull(bool2);
        bundle.putBoolean(DynamicLinkConstants.COMES_FROM_DEEPLINK_KEY, bool2.booleanValue());
        NotificationNoCommercialActivity.access$handleLaunchScreenNavigation(this.f94005p0, bundle);
        return Unit.INSTANCE;
    }
}
