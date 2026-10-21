package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.esotericsoftware.kryo.serializers.f0;
import com.esotericsoftware.kryo.serializers.g0;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class CommonNotificationBuilder {
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f48540a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {
        public final int id = 0;
        public final NotificationCompat.Builder notificationBuilder;
        public final String tag;

        public DisplayNotificationInfo(NotificationCompat.Builder builder, String str) {
            this.notificationBuilder = builder;
            this.tag = str;
        }
    }

    @TargetApi(26)
    public static boolean a(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !f0.h(resources.getDrawable(i10, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        int i10;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        int i11;
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, str);
        CharSequence possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.TITLE);
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            builder.setContentTitle(possiblyLocalizedString);
        }
        CharSequence possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.BODY);
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            builder.setContentText(possiblyLocalizedString2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(possiblyLocalizedString2));
        }
        String string = notificationParams.getString(Constants.MessageNotificationKeys.ICON);
        if (TextUtils.isEmpty(string)) {
            i10 = bundle.getInt(METADATA_DEFAULT_ICON, 0);
            if (i10 != 0 || !a(resources, i10)) {
                try {
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.w(Constants.TAG, "Couldn't get own application info: " + e5);
                }
            }
            if (i10 != 0 || !a(resources, i10)) {
                i10 = android.R.drawable.sym_def_app_icon;
            }
            identifier = i10;
        } else {
            identifier = resources.getIdentifier(string, PluginUtils.IDENTIFIER_DRAWABLE, packageName);
            if ((identifier == 0 || !a(resources, identifier)) && ((identifier = resources.getIdentifier(string, "mipmap", packageName)) == 0 || !a(resources, identifier))) {
                Log.w(Constants.TAG, "Icon resource " + string + " not found. Notification will use default icon.");
                i10 = bundle.getInt(METADATA_DEFAULT_ICON, 0);
                i10 = i10 != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (i10 != 0) {
                    i10 = android.R.drawable.sym_def_app_icon;
                } else {
                    i10 = android.R.drawable.sym_def_app_icon;
                }
                identifier = i10;
            }
        }
        builder.setSmallIcon(identifier);
        String soundResourceName = notificationParams.getSoundResourceName();
        Integer num = null;
        if (TextUtils.isEmpty(soundResourceName)) {
            defaultUri = null;
        } else if ("default".equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + soundResourceName);
        }
        if (defaultUri != null) {
            builder.setSound(defaultUri);
        }
        String string2 = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
        if (TextUtils.isEmpty(string2)) {
            Uri link = notificationParams.getLink();
            if (link != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(link);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w(Constants.TAG, "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(string2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = f48540a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            launchIntentForPackage.putExtras(notificationParams.paramsWithReservedKeysRemoved());
            if (notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED)) {
                launchIntentForPackage.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
            }
            activity = PendingIntent.getActivity(context, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        builder.setContentIntent(activity);
        PendingIntent broadcast = !notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED) ? null : PendingIntent.getBroadcast(context, atomicInteger.incrementAndGet(), new Intent(com.google.firebase.iid.ServiceStarter.ACTION_MESSAGING_EVENT).setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(notificationParams.paramsForAnalyticsIntent())), 1140850688);
        if (broadcast != null) {
            builder.setDeleteIntent(broadcast);
        }
        String string3 = notificationParams.getString(Constants.MessageNotificationKeys.COLOR);
        if (TextUtils.isEmpty(string3)) {
            i11 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i11 != 0) {
                numValueOf = Integer.valueOf(ContextCompat.getColor(context2, i11));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(string3));
            } catch (IllegalArgumentException unused) {
                Log.w(Constants.TAG, "Color is invalid: " + string3 + ". Notification will use default color.");
                i11 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                    try {
                        numValueOf = Integer.valueOf(ContextCompat.getColor(context2, i11));
                    } catch (Resources.NotFoundException unused2) {
                        Log.w(Constants.TAG, "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            builder.setColor(numValueOf.intValue());
        }
        builder.setAutoCancel(!notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY));
        builder.setLocalOnly(notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY));
        CharSequence string4 = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
        if (string4 != null) {
            builder.setTicker(string4);
        }
        Integer integer = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
        if (integer == null) {
            integer = null;
        } else if (integer.intValue() < -2 || integer.intValue() > 2) {
            Log.w(Constants.TAG, "notificationPriority is invalid " + integer + ". Skipping setting notificationPriority.");
            integer = null;
        }
        if (integer != null) {
            builder.setPriority(integer.intValue());
        }
        Integer integer2 = notificationParams.getInteger(Constants.MessageNotificationKeys.VISIBILITY);
        if (integer2 == null) {
            integer2 = null;
        } else if (integer2.intValue() < -1 || integer2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + integer2 + ". Skipping setting visibility.");
            integer2 = null;
        }
        if (integer2 != null) {
            builder.setVisibility(integer2.intValue());
        }
        Integer integer3 = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
        if (integer3 != null) {
            if (integer3.intValue() < 0) {
                Log.w(Constants.TAG, "notificationCount is invalid: " + integer3 + ". Skipping setting notificationCount.");
            } else {
                num = integer3;
            }
        }
        if (num != null) {
            builder.setNumber(num.intValue());
        }
        Long l6 = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
        if (l6 != null) {
            builder.setShowWhen(true);
            builder.setWhen(l6.longValue());
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            builder.setVibrate(vibrateTimings);
        }
        int[] iArrA = notificationParams.a();
        if (iArrA != null) {
            builder.setLights(iArrA[0], iArrA[1], iArrA[2]);
        }
        boolean z10 = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        ?? r10 = z10;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            r10 = (z10 ? 1 : 0) | 2;
        }
        int i12 = r10;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS)) {
            i12 = (r10 == true ? 1 : 0) | 4;
        }
        builder.setDefaults(i12);
        String string5 = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        if (TextUtils.isEmpty(string5)) {
            string5 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new DisplayNotificationInfo(builder, string5);
    }

    @TargetApi(26)
    @VisibleForTesting
    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w(Constants.TAG, "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (TextUtils.isEmpty(string)) {
                Log.w(Constants.TAG, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                }
                Log.w(Constants.TAG, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) != null) {
                return FCM_FALLBACK_NOTIFICATION_CHANNEL;
            }
            int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
            notificationManager.createNotificationChannel(g0.b(identifier == 0 ? "Misc" : context.getString(identifier)));
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
