package com.bbva.notifications.handlers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.notifications.GloMoNotificationCreator;
import com.bbva.notifications.R;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.notifications.extensions.DeepLinkModelExtensionKt;
import com.bbva.notifications.extensions.PushExtensionKt;
import com.bbva.notifications.model.TokenOTP;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: CountryGlomoPushHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0014R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/bbva/notifications/handlers/CountryGlomoPushHandler;", "Lcom/bbva/notifications/handlers/GlomoPushHandler;", "Landroid/content/Context;", "context", "Lcom/bbva/push/model/Push;", "push", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "Lcom/bbva/notifications/CellsNotificationChannel;", "defaultChannel", "Landroidx/core/app/NotificationCompat$Builder;", "createNotification", "requestCode", "data", "Landroid/app/PendingIntent;", "notificationActivityPendingIntent", "from", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeeplink", "", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/notifications/GloMoNotificationCreator;", "creator", "Lcom/bbva/glomohybrid/base/datasource/UserStoredDatasource;", "userStoredDatasource", "<init>", "(Lcom/bbva/notifications/GloMoNotificationCreator;Lcom/bbva/glomohybrid/base/datasource/UserStoredDatasource;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryGlomoPushHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryGlomoPushHandler.kt\ncom/bbva/notifications/handlers/CountryGlomoPushHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class CountryGlomoPushHandler extends GlomoPushHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UserStoredDatasource f35373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f35374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f35375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryGlomoPushHandler(@NotNull GloMoNotificationCreator creator, @NotNull UserStoredDatasource userStoredDatasource) {
        super(creator);
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(userStoredDatasource, "userStoredDatasource");
        this.f35373b = userStoredDatasource;
        this.f35374c = KoinJavaComponent.inject$default(MessageDispatcher.class, null, null, 6, null);
        this.f35375d = "";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0064  */
    @Override // com.bbva.notifications.handlers.GlomoPushHandler, com.bbva.push.handler.PushHandler
    @NotNull
    public NotificationCompat.Builder createNotification(@NotNull Context context, @NotNull Push push, int defaultIcon, @NotNull NotificationChannel defaultChannel) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(push, "push");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        if (PushExtensionKt.isEventManagerPush(push)) {
            PushExtensionKt.convertFromEventManagerPush(push, this.f35373b.isLogged());
            JSONObject jSONObject = new JSONObject(push.getData());
            if (jSONObject.has("otp")) {
                String string = jSONObject.getString("otp");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                this.f35375d = string;
                if (!(!l.isBlank(string)) || Intrinsics.areEqual(this.f35375d, AbstractJsonLexerKt.NULL)) {
                    this.f35376e = false;
                } else {
                    ((MessageDispatcher) this.f35374c.getValue()).sendMessage(PushConstants.GLOBAL_MTU_SET_OTP_EXCEPTION, new TokenOTP(this.f35375d));
                    this.f35376e = true;
                }
            } else {
                this.f35376e = false;
            }
        }
        if (!this.f35376e) {
            return super.createNotification(context, push, defaultIcon, defaultChannel);
        }
        NotificationCompat.Builder autoCancel = super.createNotification(context, push, defaultIcon, defaultChannel).setContentIntent(null).setAutoCancel(false);
        Intrinsics.checkNotNull(autoCancel);
        return autoCancel;
    }

    @Override // com.bbva.notifications.handlers.GlomoPushHandler
    @NotNull
    public DeepLinkModel getDeeplink(@NotNull Push from) {
        Intrinsics.checkNotNullParameter(from, "from");
        return DeepLinkModel.copy$default(super.getDeeplink(from), null, null, null, PushExtensionKt.toLocalArgs(from), 7, null);
    }

    @Override // com.bbva.notifications.handlers.GlomoPushHandler, com.bbva.push.handler.PushHandler
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF36222b() {
        return "glomomx";
    }

    @Override // com.bbva.notifications.handlers.GlomoPushHandler
    @NotNull
    public PendingIntent notificationActivityPendingIntent(@NotNull Context context, int requestCode, @NotNull Push data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        DeepLinkModel deeplink = getDeeplink(data);
        String string = context.getString(R.string.deeplink_scheme);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Intent intent = new Intent("android.intent.action.VIEW", DeepLinkModelExtensionKt.toUri(deeplink, string));
        Map<String, String> localArgs = PushExtensionKt.toLocalArgs(data);
        if (localArgs != null) {
            intent.putExtra(LinkParamsKt.PUSH_DEEPLINK_DATA_KEY, new HashMap(localArgs));
        }
        intent.setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        Unit unit = Unit.INSTANCE;
        PendingIntent activity = PendingIntent.getActivity(context, requestCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }
}
