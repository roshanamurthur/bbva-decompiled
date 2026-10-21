package com.bbva.notifications.handlers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.camera.core.internal.g;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.notifications.R;
import com.bbva.notifications.activity.NotificationActivity;
import com.bbva.notifications.mapper.SalesforceDeeplinkInfoMapper;
import com.bbva.notifications.model.NotificationsProviderConfig;
import com.bbva.push.salesforce.SalesforcePushHandler;
import com.bbva.push.salesforce.model.SalesforceConfig;
import com.google.android.gms.common.GoogleApiAvailability;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.notifications.NotificationCustomizationOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SalesforcePushHandlerProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/notifications/handlers/SalesforcePushHandlerProvider;", "", "Lcom/bbva/push/salesforce/SalesforcePushHandler;", "provideSalesforceHandler", "Landroid/content/Context;", "context", "Lcom/bbva/notifications/model/NotificationsProviderConfig;", "notificationsProviderConfig", "Lcom/bbva/notifications/mapper/SalesforceDeeplinkInfoMapper;", "salesforceDeeplinkInfoMapper", "<init>", "(Landroid/content/Context;Lcom/bbva/notifications/model/NotificationsProviderConfig;Lcom/bbva/notifications/mapper/SalesforceDeeplinkInfoMapper;)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class SalesforcePushHandlerProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f35378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NotificationsProviderConfig f35379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SalesforceDeeplinkInfoMapper f35380c;

    /* JADX INFO: compiled from: SalesforcePushHandlerProvider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/notifications/handlers/SalesforcePushHandlerProvider$Companion;", "", "()V", "UNIVERSAL_KEY", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: SalesforcePushHandlerProvider.kt */
    public static final class a extends Lambda implements Function1<SalesforcePushHandler, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f35381p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SalesforcePushHandler salesforcePushHandler) {
            return Unit.INSTANCE;
        }
    }

    public SalesforcePushHandlerProvider(@NotNull Context context, @NotNull NotificationsProviderConfig notificationsProviderConfig, @NotNull SalesforceDeeplinkInfoMapper salesforceDeeplinkInfoMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationsProviderConfig, "notificationsProviderConfig");
        Intrinsics.checkNotNullParameter(salesforceDeeplinkInfoMapper, "salesforceDeeplinkInfoMapper");
        this.f35378a = context;
        this.f35379b = notificationsProviderConfig;
        this.f35380c = salesforceDeeplinkInfoMapper;
    }

    public final PendingIntent a(DeepLinkModel deepLinkModel, int i10) {
        Context context = this.f35378a;
        Intent intent = new Intent(context, (Class<?>) NotificationActivity.class);
        intent.putExtra(LinkParamsKt.SALESFORCE_DEEPLINK_KEY, deepLinkModel);
        intent.setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        Unit unit = Unit.INSTANCE;
        PendingIntent activity = PendingIntent.getActivity(context, i10, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @NotNull
    public final SalesforcePushHandler provideSalesforceHandler() {
        NotificationsProviderConfig notificationsProviderConfig = this.f35379b;
        String appId = notificationsProviderConfig.getAppId();
        String accessToken = notificationsProviderConfig.getAccessToken();
        String serverUrl = notificationsProviderConfig.getServerUrl();
        String mid = notificationsProviderConfig.getMid();
        int i10 = R.drawable.icon_notification;
        NotificationCustomizationOptions notificationCustomizationOptionsCreate = NotificationCustomizationOptions.create(i10, new g(this), null);
        Intrinsics.checkNotNullExpressionValue(notificationCustomizationOptionsCreate, "create(...)");
        SalesforceConfig salesforceConfig = new SalesforceConfig(appId, accessToken, serverUrl, mid, null, null, i10, notificationCustomizationOptionsCreate, 48, null);
        Context context = this.f35378a;
        MarketingCloudConfig.Builder builder = MarketingCloudConfig.INSTANCE.builder();
        builder.setGeofencingEnabled(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f35378a) == 0);
        builder.setAnalyticsEnabled(true);
        Unit unit = Unit.INSTANCE;
        return new SalesforcePushHandler(context, null, null, salesforceConfig, builder, a.f35381p0, 6, null);
    }
}
