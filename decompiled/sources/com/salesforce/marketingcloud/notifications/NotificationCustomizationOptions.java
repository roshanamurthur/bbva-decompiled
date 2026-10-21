package com.salesforce.marketingcloud.notifications;

import android.os.Build;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.util.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
public class NotificationCustomizationOptions {
    static final String TAG = g.a("NotificationCustomizationOptions");
    final NotificationManager.NotificationChannelIdProvider channelIdProvider;
    final NotificationManager.NotificationLaunchIntentProvider launchIntentProvider;
    final NotificationManager.NotificationBuilder notificationBuilder;
    final int smallIconResId;

    private NotificationCustomizationOptions(int i10, NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider, NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider, NotificationManager.NotificationBuilder notificationBuilder) {
        this.smallIconResId = i10;
        this.launchIntentProvider = notificationLaunchIntentProvider;
        this.channelIdProvider = notificationChannelIdProvider;
        this.notificationBuilder = notificationBuilder;
    }

    private static String classNameOrNull(Object obj) {
        return obj != null ? obj.getClass().getName() : AbstractJsonLexerKt.NULL;
    }

    @NonNull
    public static NotificationCustomizationOptions create(@DrawableRes int i10) {
        return new NotificationCustomizationOptions(i10, null, null, null);
    }

    @Nullable
    public NotificationManager.NotificationBuilder getNotificationBuilder() {
        return this.notificationBuilder;
    }

    @NonNull
    public String toString() {
        NotificationManager.NotificationBuilder notificationBuilder = this.notificationBuilder;
        return notificationBuilder != null ? String.format(l.f65195a, "{notificationBuilder=%s}", classNameOrNull(notificationBuilder)) : String.format(l.f65195a, "{smallIconResId=%d, launchIntentProvider=%s, channelIdProvider=%s}", Integer.valueOf(this.smallIconResId), classNameOrNull(this.launchIntentProvider), classNameOrNull(this.channelIdProvider));
    }

    @NonNull
    public static NotificationCustomizationOptions create(@DrawableRes int i10, @Nullable NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider, @Nullable NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider) {
        if (notificationLaunchIntentProvider != null && Build.VERSION.SDK_INT >= 31) {
            g.c(TAG, "Make sure FLAG_IMMUTABLE or FLAG_MUTABLE for Pending Intent is set because of Targeting S+ (version 31 and above) ", new Object[0]);
        }
        return new NotificationCustomizationOptions(i10, notificationLaunchIntentProvider, notificationChannelIdProvider, null);
    }

    @NonNull
    public static NotificationCustomizationOptions create(@NonNull NotificationManager.NotificationBuilder notificationBuilder) {
        if (notificationBuilder != null) {
            return new NotificationCustomizationOptions(0, null, null, notificationBuilder);
        }
        throw new IllegalArgumentException("The provided NotificationManager.NotificationBuilder cannot be null.");
    }
}
