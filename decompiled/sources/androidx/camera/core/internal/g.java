package androidx.camera.core.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.deeplink.model.SalesforceDeepLinkModel;
import com.bbva.notifications.DeepLinkConstants;
import com.bbva.notifications.activity.NotificationActivity;
import com.bbva.notifications.extensions.NotificationExtensionKt;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import com.bbva.notifications.handlers.SalesforcePushHandlerProvider;
import com.bbva.notifications.handlers.SalesforcePushHandlerProviderKt;
import com.bbva.notifications.model.SalesforceDeeplinkInfo;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements CallbackToFutureAdapter.Resolver, NotificationManager.NotificationLaunchIntentProvider {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2153p0;

    public /* synthetic */ g(Object obj) {
        this.f2153p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((YuvToJpegProcessor) this.f2153p0).lambda$getCloseFuture$0(completer);
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager.NotificationLaunchIntentProvider
    public final PendingIntent getNotificationPendingIntent(Context context, NotificationMessage notificationMessage) {
        Map<String, Object> payload;
        SalesforcePushHandlerProvider this$0 = (SalesforcePushHandlerProvider) this.f2153p0;
        SalesforcePushHandlerProvider.Companion companion = SalesforcePushHandlerProvider.Companion;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationMessage, "notificationMessage");
        int iNextInt = new Random().nextInt();
        SalesforceDeeplinkInfo map = this$0.f35380c.map(notificationMessage);
        String universalKey = map.getUniversalKey();
        String url = map.getUrl();
        boolean hasOriginId = map.getHasOriginId();
        String str = notificationMessage.customKeys().get(DeepLinkConstants.SALESFORCE_NOTIFICATION);
        if (str == null || str.length() == 0) {
            if (universalKey == null || universalKey.length() == 0) {
                return (url == null || url.length() == 0) ? PendingIntent.getActivity(context, iNextInt, new Intent(context, (Class<?>) NotificationActivity.class), 201326592) : PendingIntent.getActivity(context, iNextInt, new Intent("android.intent.action.VIEW", Uri.parse(url)), 201326592);
            }
            Intent intent = new Intent(context, (Class<?>) NotificationActivity.class);
            if (hasOriginId) {
                intent.putExtra(LinkParamsKt.UNIVERSAL_KEY, NotificationExtensionKt.toOriginIdWebNotification(universalKey));
            } else {
                intent.putExtra(LinkParamsKt.UNIVERSAL_KEY, NotificationExtensionKt.toWebNotification(universalKey));
            }
            intent.setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            Unit unit = Unit.INSTANCE;
            return PendingIntent.getActivity(context, iNextInt, intent, 201326592);
        }
        SalesforceDeepLinkModel salesforceDeeplinkModel = NotificationExtensionKt.toSalesforceDeeplinkModel(str);
        if (l.equals$default(salesforceDeeplinkModel != null ? salesforceDeeplinkModel.getApp() : null, "gema", false, 2, null)) {
            return this$0.a(salesforceDeeplinkModel != null ? SalesforceDeepLinkModelExtensionsKt.toGemaDeepLink(salesforceDeeplinkModel) : null, iNextInt);
        }
        if (SalesforcePushHandlerProviderKt.access$isUrl(salesforceDeeplinkModel != null ? salesforceDeeplinkModel.getSubtype() : null)) {
            Object obj = (salesforceDeeplinkModel == null || (payload = salesforceDeeplinkModel.getPayload()) == null) ? null : payload.get("destination");
            String str2 = obj instanceof String ? (String) obj : null;
            return (str2 == null || str2.length() == 0) ? PendingIntent.getActivity(context, iNextInt, new Intent(context, (Class<?>) NotificationActivity.class), 201326592) : PendingIntent.getActivity(context, iNextInt, new Intent("android.intent.action.VIEW", Uri.parse(str2)), 201326592);
        }
        if (l.equals$default(salesforceDeeplinkModel != null ? salesforceDeeplinkModel.getSubtype() : null, "deeplink", false, 2, null)) {
            return this$0.a(salesforceDeeplinkModel != null ? SalesforceDeepLinkModelExtensionsKt.toDeepLink(salesforceDeeplinkModel) : null, iNextInt);
        }
        return PendingIntent.getActivity(context, iNextInt, new Intent(context, (Class<?>) NotificationActivity.class), 201326592);
    }
}
