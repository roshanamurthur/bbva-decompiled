package com.bbva.notifications.handlers;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.notifications.DeepLinkConstants;
import com.bbva.notifications.GloMoNotificationCreator;
import com.bbva.notifications.activity.NotificationActivity;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.model.NotificationData;
import com.bbva.notifications.model.NotificationDataKt;
import com.bbva.notifications.model.NotificationNoCommercialDataKt;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlomoPushHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J,\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016J\u0013\u0010\u000f\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010JG\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2&\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0015J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0014R\u0014\u0010!\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/bbva/notifications/handlers/GlomoPushHandler;", "Lcom/bbva/push/handler/PushHandler;", "Lcom/bbva/push/model/Push;", "push", "", "canHandlePush", "Landroid/content/Context;", "context", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "Lcom/bbva/notifications/CellsNotificationChannel;", "defaultChannel", "Landroidx/core/app/NotificationCompat$Builder;", "createNotification", "register", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", UnregisterCommand.ID, "requestCode", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "data", "Landroid/app/PendingIntent;", "noCommercialActivityPendingIntent$Notifications_mexicoRelease", "(Landroid/content/Context;ILjava/util/HashMap;)Landroid/app/PendingIntent;", "noCommercialActivityPendingIntent", "notificationActivityPendingIntent", "from", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeeplink", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/notifications/GloMoNotificationCreator;", "creator", "<init>", "(Lcom/bbva/notifications/GloMoNotificationCreator;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class GlomoPushHandler implements PushHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GloMoNotificationCreator f35377a;

    public GlomoPushHandler(@NotNull GloMoNotificationCreator creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.f35377a = creator;
    }

    @Override // com.bbva.push.handler.PushHandler
    public boolean canHandlePush(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "push");
        return true;
    }

    @Override // com.bbva.push.handler.PushHandler
    public void configure(@NotNull Map<String, ? extends Object> map) {
        PushHandler.DefaultImpls.configure(this, map);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0059  */
    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    public NotificationCompat.Builder createNotification(@NotNull Context context, @NotNull Push push, int defaultIcon, @NotNull NotificationChannel defaultChannel) {
        PendingIntent pendingIntentNotificationActivityPendingIntent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(push, "push");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        int iNextInt = new Random().nextInt();
        NotificationCompat.Builder contentText = this.f35377a.createNotificationBuilder(context, defaultIcon, defaultChannel, push).setContentText(push.getNotification().getContent());
        Intrinsics.checkNotNullExpressionValue(contentText, "setContentText(...)");
        String clickAction = push.getNotification().getClickAction();
        if (clickAction == null) {
            pendingIntentNotificationActivityPendingIntent = notificationActivityPendingIntent(context, iNextInt, push);
        } else {
            String simpleName = Reflection.getOrCreateKotlinClass(NotificationNoCommercialActivity.class).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) clickAction, (CharSequence) simpleName, false, 2, (Object) null)) {
                pendingIntentNotificationActivityPendingIntent = noCommercialActivityPendingIntent$Notifications_mexicoRelease(context, iNextInt, NotificationNoCommercialDataKt.toHashMap(push));
            } else {
                pendingIntentNotificationActivityPendingIntent = notificationActivityPendingIntent(context, iNextInt, push);
            }
        }
        contentText.setContentIntent(pendingIntentNotificationActivityPendingIntent);
        return contentText;
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object getConfiguration(@NotNull Continuation<? super Map<String, ? extends Object>> continuation) {
        return PushHandler.DefaultImpls.getConfiguration(this, continuation);
    }

    @NotNull
    public DeepLinkModel getDeeplink(@NotNull Push from) {
        Intrinsics.checkNotNullParameter(from, "from");
        NotificationData notificationData = NotificationDataKt.toNotificationData(from.getData());
        return new DeepLinkModel(notificationData.getBodyLocKey(), notificationData.getClickAction(), notificationData.getBodyLocArgs(), null, 8, null);
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF36222b() {
        return "glomo";
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    public Inbox getInbox() {
        return PushHandler.DefaultImpls.getInbox(this);
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    @NotNull
    public final PendingIntent noCommercialActivityPendingIntent$Notifications_mexicoRelease(@NotNull Context context, int requestCode, @NotNull HashMap<String, String> data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intent intent = new Intent(context, (Class<?>) NotificationNoCommercialActivity.class);
        intent.putExtra(NotificationNoCommercialActivity.NOTIFICATION_INTENT_DATA, data);
        intent.putExtra(LinkParamsKt.NEED_NAVIGATE, data.containsKey(DeepLinkConstants.INSTANCE.getDEEPLINK_NOTIFICATION()));
        intent.setFlags(268435456);
        Unit unit = Unit.INSTANCE;
        PendingIntent activity = PendingIntent.getActivity(context, requestCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    @NotNull
    public PendingIntent notificationActivityPendingIntent(@NotNull Context context, int requestCode, @NotNull Push data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intent intent = new Intent(context, (Class<?>) NotificationActivity.class);
        intent.putExtra(LinkParamsKt.OPERATIONAL_KEY, getDeeplink(data));
        intent.setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        Unit unit = Unit.INSTANCE;
        PendingIntent activity = PendingIntent.getActivity(context, requestCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @Override // com.bbva.push.handler.PushHandler
    public void onNewToken(@NotNull String str) {
        PushHandler.DefaultImpls.onNewToken(this, str);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object register(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object token(@NotNull Continuation<? super String> continuation) {
        return PushHandler.DefaultImpls.token(this, continuation);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object unregister(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }
}
