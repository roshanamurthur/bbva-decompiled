package com.bbva.notifications;

import android.content.Context;
import com.bbva.notifications.model.NotificationData;
import com.bbva.notifications.model.NotificationDataKt;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GloMoNotificationBodyCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/notifications/GloMoNotificationBodyCreator;", "", "", "", "options", "createBody", "createBigBody", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGloMoNotificationBodyCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GloMoNotificationBodyCreator.kt\ncom/bbva/notifications/GloMoNotificationBodyCreator\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n37#2,2:44\n1#3:46\n*S KotlinDebug\n*F\n+ 1 GloMoNotificationBodyCreator.kt\ncom/bbva/notifications/GloMoNotificationBodyCreator\n*L\n27#1:44,2\n*E\n"})
public final class GloMoNotificationBodyCreator {

    @NotNull
    public static final String OPERATION_REFUSED_KEY = "00050";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f35273a;

    public GloMoNotificationBodyCreator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35273a = context;
    }

    @Nullable
    public final String createBigBody(@NotNull Map<String, String> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        NotificationData notificationData = NotificationDataKt.toNotificationData(options);
        if (l.isBlank(notificationData.getClickAction())) {
            return null;
        }
        String clickAction = notificationData.getClickAction();
        String[] strArr = (String[]) notificationData.getBodyLocArgs().toArray(new String[0]);
        Integer numValueOf = Intrinsics.areEqual(clickAction, OPERATION_REFUSED_KEY) ? Integer.valueOf(R.string.notification_refused_template) : null;
        if (numValueOf != null) {
            return MessageFormat.format(this.f35273a.getString(numValueOf.intValue()), Arrays.copyOf(strArr, strArr.length));
        }
        return null;
    }

    @Nullable
    public final String createBody(@NotNull Map<String, String> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        NotificationData notificationData = NotificationDataKt.toNotificationData(options);
        return notificationData.getContentAvailable() ? notificationData.getContent() : createBigBody(options);
    }
}
