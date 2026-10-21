package com.bbva.notifications.provider;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import bk.q;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.delegate.LogEventDelegate;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.notifications.utils.BanxicoPushDecryption;
import com.bbva.push.creator.NotificationCreator;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import com.esotericsoftware.kryo.serializers.f0;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BanxicoNotificationProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bbva/notifications/provider/BanxicoNotificationProvider;", "Lcom/bbva/push/creator/NotificationCreator;", "Landroid/content/Context;", "context", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "defaultChannel", "Lcom/bbva/push/model/Push;", "push", "Landroidx/core/app/NotificationCompat$Builder;", "createNotificationBuilder", "", "isAboveOreo$Notifications_mexicoRelease", "()Z", "isAboveOreo", "", "channelId", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "Lcom/bbva/notifications/delegate/LogEventDelegate;", "logEvent", "<init>", "(Ljava/lang/String;Lcom/bbva/glomo/storage/MainStorage;Lcom/bbva/notifications/delegate/LogEventDelegate;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBanxicoNotificationProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BanxicoNotificationProvider.kt\ncom/bbva/notifications/provider/BanxicoNotificationProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class BanxicoNotificationProvider implements NotificationCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f35436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f35437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LogEventDelegate f35438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f35439d;

    /* JADX INFO: compiled from: BanxicoNotificationProvider.kt */
    public static final class a extends Lambda implements Function0<BanxicoPushDecryption> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BanxicoPushDecryption invoke() {
            return new BanxicoPushDecryption(BanxicoNotificationProvider.this.f35437b);
        }
    }

    public BanxicoNotificationProvider(@NotNull String channelId, @NotNull MainStorage storage, @NotNull LogEventDelegate logEvent) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        this.f35436a = channelId;
        this.f35437b = storage;
        this.f35438c = logEvent;
        this.f35439d = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Override // com.bbva.push.creator.NotificationCreator
    @NotNull
    public NotificationCompat.Builder createNotificationBuilder(@NotNull Context context, int defaultIcon, @NotNull NotificationChannel defaultChannel, @NotNull Push push) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        Intrinsics.checkNotNullParameter(push, "push");
        this.f35438c.storeInformPushAction(BanxicoConstants.UNIFIED_LOG_EVENT_MESSAGE_RECEIVED_VALUE);
        Push decryptedPush = ((BanxicoPushDecryption) this.f35439d.getValue()).getDecryptedPush(context, push);
        Pair[] pairArr = new Pair[2];
        String str = push.getData().get("data");
        if (str == null) {
            str = "";
        }
        pairArr[0] = TuplesKt.to(BanxicoConstants.KEY_UNIFIED_LOG_EVENT_PUSH_DATA, str);
        pairArr[1] = TuplesKt.to(BanxicoConstants.KEY_UNIFIED_LOG_EVENT_PUSH_APP_STATE, ProcessLifecycleOwner.INSTANCE.get().getLifecycle().getF21906d().isAtLeast(Lifecycle.State.STARTED) ? "FOREGROUND" : "BACKGROUND");
        Map mapMapOf = q.mapOf(pairArr);
        boolean zIsAboveOreo$Notifications_mexicoRelease = isAboveOreo$Notifications_mexicoRelease();
        String str2 = this.f35436a;
        if (zIsAboveOreo$Notifications_mexicoRelease) {
            e.e();
            android.app.NotificationChannel notificationChannelC = f0.c(str2, str2);
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelC);
        }
        NotificationCompat.Builder priority = new NotificationCompat.Builder(context, str2).setSmallIcon(defaultIcon).setContentTitle(decryptedPush.getNotification().getTitle()).setContentText(decryptedPush.getNotification().getContent()).setPriority(0);
        int iNextInt = new Random().nextInt();
        Intent intent = new Intent(context, (Class<?>) NotificationNoCommercialActivity.class);
        HashMap map = new HashMap(decryptedPush.getData());
        map.putAll(mapMapOf);
        intent.putExtra(NotificationNoCommercialActivity.NOTIFICATION_INTENT_DATA, map);
        Unit unit = Unit.INSTANCE;
        NotificationCompat.Builder autoCancel = priority.setContentIntent(PendingIntent.getActivity(context, iNextInt, intent, 201326592)).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "setAutoCancel(...)");
        return autoCancel;
    }

    public final boolean isAboveOreo$Notifications_mexicoRelease() {
        return Build.VERSION.SDK_INT >= 26;
    }
}
