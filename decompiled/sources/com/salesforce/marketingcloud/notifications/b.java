package com.salesforce.marketingcloud.notifications;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.e;
import com.esotericsoftware.kryo.serializers.f0;
import com.esotericsoftware.kryo.serializers.g0;
import com.salesforce.marketingcloud.R;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.util.l;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
class b implements NotificationManager.NotificationBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NotificationManager.NotificationLaunchIntentProvider f64828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager.NotificationBuilder f64829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotificationManager.NotificationChannelIdProvider f64830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f64831d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64832a;

        static {
            int[] iArr = new int[NotificationMessage.Sound.values().length];
            f64832a = iArr;
            try {
                iArr[NotificationMessage.Sound.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64832a[NotificationMessage.Sound.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64832a[NotificationMessage.Sound.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(@DrawableRes int i10, @Nullable NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider, @Nullable NotificationManager.NotificationBuilder notificationBuilder, @Nullable NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider) {
        this.f64828a = notificationLaunchIntentProvider;
        this.f64829b = notificationBuilder;
        this.f64830c = notificationChannelIdProvider;
        this.f64831d = i10;
    }

    private static Bitmap a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (Exception e5) {
            g.b(NotificationManager.f64803d, e5, "Unable to download image %s", str);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public String b(Context context, NotificationMessage notificationMessage) {
        String notificationChannelId;
        NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider = this.f64830c;
        if (notificationChannelIdProvider != null) {
            try {
                notificationChannelId = notificationChannelIdProvider.getNotificationChannelId(context, notificationMessage);
            } catch (Exception e5) {
                g.b(NotificationManager.f64803d, e5, "Exception thrown while app determined channel id for notification message.", new Object[0]);
                notificationChannelId = null;
            }
        } else {
            notificationChannelId = null;
        }
        if (notificationChannelId != null) {
            return notificationChannelId;
        }
        b(context, false);
        return NotificationManager.DEFAULT_CHANNEL_ID;
    }

    public PendingIntent c(Context context, @NonNull NotificationMessage notificationMessage) {
        try {
            NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider = this.f64828a;
            if (notificationLaunchIntentProvider != null) {
                return notificationLaunchIntentProvider.getNotificationPendingIntent(context, notificationMessage);
            }
        } catch (IllegalArgumentException e5) {
            g.b(NotificationManager.f64803d, e5, "Missing FLAG_IMMUTABLE or FLAG_MUTABLE flag in PendingIntent", new Object[0]);
        }
        int iA = l.a(134217728);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        Intent intentA = NotificationManager.a(launchIntentForPackage, notificationMessage);
        intentA.addFlags(134217728);
        return PendingIntent.getActivity(context, notificationMessage.notificationId(), intentA, iA);
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager.NotificationBuilder
    @NonNull
    public NotificationCompat.Builder setupNotificationBuilder(@NonNull Context context, @NonNull NotificationMessage notificationMessage) {
        NotificationCompat.Builder builderA;
        NotificationManager.NotificationBuilder notificationBuilder = this.f64829b;
        if (notificationBuilder != null) {
            try {
                builderA = notificationBuilder.setupNotificationBuilder(context, notificationMessage);
            } catch (Exception e5) {
                g.b(NotificationManager.f64803d, e5, "Custom notification builder threw an exception.  Using default notification builder.", new Object[0]);
                builderA = null;
            }
        } else {
            builderA = null;
        }
        if (builderA == null) {
            builderA = a(context, notificationMessage, b(context, notificationMessage), this.f64831d);
            PendingIntent pendingIntentC = c(context, notificationMessage);
            if (pendingIntentC != null) {
                builderA.setContentIntent(NotificationManager.redirectIntentForAnalytics(context, pendingIntentC, notificationMessage, true));
            }
        }
        return builderA;
    }

    private static Uri a(Context context, String str, Uri uri) {
        int identifier = context.getResources().getIdentifier(b(str), "raw", context.getPackageName());
        if (identifier <= 0) {
            return uri;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier);
    }

    public static String b(Context context, boolean z10) {
        android.app.NotificationManager notificationManager;
        if (!l.c() || (notificationManager = (android.app.NotificationManager) context.getSystemService("notification")) == null) {
            return NotificationManager.DEFAULT_CHANNEL_ID;
        }
        if (notificationManager.getNotificationChannel(NotificationManager.DEFAULT_CHANNEL_ID) != null && !z10) {
            return NotificationManager.DEFAULT_CHANNEL_ID;
        }
        e.e();
        NotificationChannel notificationChannelI = g0.i(context.getString(R.string.mcsdk_default_notification_channel_name));
        notificationChannelI.enableLights(false);
        notificationChannelI.enableVibration(false);
        notificationChannelI.setShowBadge(true);
        notificationChannelI.setLockscreenVisibility(0);
        notificationManager.createNotificationChannel(notificationChannelI);
        return NotificationManager.DEFAULT_CHANNEL_ID;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    @NonNull
    public static NotificationCompat.Builder a(Context context, NotificationMessage notificationMessage, String str, int i10) {
        boolean z10;
        Uri uriA;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str);
        int i11 = context.getApplicationInfo().icon;
        if (i11 > 0) {
            builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), i11));
        }
        builder.setSmallIcon(i10);
        builder.setContentTitle(notificationMessage.title());
        if (TextUtils.isEmpty(notificationMessage.mediaUrl())) {
            z10 = false;
        } else {
            try {
                Bitmap bitmapA = a(notificationMessage.mediaUrl());
                if (bitmapA != null) {
                    builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapA).setSummaryText(notificationMessage.alert()));
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Exception e5) {
                g.b(NotificationManager.f64803d, e5, "Unable to load notification image %s", notificationMessage.mediaUrl());
            }
        }
        String strAlert = (z10 || TextUtils.isEmpty(notificationMessage.mediaAltText())) ? notificationMessage.alert() : notificationMessage.mediaAltText();
        builder.setContentText(strAlert);
        builder.setTicker(strAlert);
        if (!z10) {
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(strAlert).setBigContentTitle(notificationMessage.title()));
        }
        int i12 = a.f64832a[notificationMessage.sound().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                uriA = Settings.System.DEFAULT_NOTIFICATION_URI;
            } else if (i12 == 3) {
                g.a(NotificationManager.f64803d, "No sound was set for notification.", new Object[0]);
            }
            return builder;
        }
        uriA = a(context, notificationMessage.soundName(), Settings.System.DEFAULT_NOTIFICATION_URI);
        builder.setSound(uriA);
        return builder;
    }

    private static String b(String str) {
        return (str == null || str.lastIndexOf(46) <= 0) ? str : str.substring(0, str.lastIndexOf(46));
    }

    @SuppressLint({"NewApi"})
    public String a(Context context, NotificationMessage notificationMessage) {
        String notificationChannelId;
        NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider = this.f64830c;
        if (notificationChannelIdProvider != null) {
            try {
                notificationChannelId = notificationChannelIdProvider.getNotificationChannelId(context, notificationMessage);
            } catch (Exception e5) {
                g.b(NotificationManager.f64803d, e5, "Exception thrown while app determined channel id for notification message.", new Object[0]);
                notificationChannelId = null;
            }
        } else {
            notificationChannelId = null;
        }
        if (notificationChannelId != null) {
            return notificationChannelId;
        }
        a(context, false);
        return NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID;
    }

    public static String a(Context context, boolean z10) {
        android.app.NotificationManager notificationManager;
        if (!l.c() || (notificationManager = (android.app.NotificationManager) context.getSystemService("notification")) == null) {
            return NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID;
        }
        if (notificationManager.getNotificationChannel(NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID) != null && !z10) {
            return NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID;
        }
        e.e();
        NotificationChannel notificationChannelB = f0.b(context.getString(R.string.mcsdk_foreground_notification_channel_name));
        notificationChannelB.enableLights(false);
        notificationChannelB.enableVibration(false);
        notificationChannelB.setShowBadge(false);
        notificationChannelB.setSound(null, null);
        notificationChannelB.setLockscreenVisibility(0);
        notificationManager.createNotificationChannel(notificationChannelB);
        return NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID;
    }
}
