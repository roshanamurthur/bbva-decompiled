package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes10.dex */
public class MessagingAnalytics {
    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.getInstance();
            Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    @VisibleForTesting
    public static void b(Bundle bundle, String str) {
        try {
            FirebaseApp.getInstance();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString(Constants.AnalyticsKeys.COMPOSER_LABEL);
            if (string2 != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_NAME, string2);
            }
            String string3 = bundle.getString(Constants.AnalyticsKeys.MESSAGE_LABEL);
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString(Constants.AnalyticsKeys.MESSAGE_CHANNEL);
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_CHANNEL, string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_TOPIC, string5);
            }
            String string6 = bundle.getString(Constants.AnalyticsKeys.MESSAGE_TIMESTAMP);
            if (string6 != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_TIME, Integer.parseInt(string6));
                } catch (NumberFormatException e5) {
                    Log.w(Constants.TAG, "Error while parsing timestamp in GCM event", e5);
                }
            }
            String string7 = bundle.containsKey(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME) ? bundle.getString(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME) : null;
            if (string7 != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, Integer.parseInt(string7));
                } catch (NumberFormatException e7) {
                    Log.w(Constants.TAG, "Error while parsing use_device_time in GCM event", e7);
                }
            }
            String str2 = NotificationParams.isNotification(bundle) ? "display" : "data";
            if (Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE.equals(str) || Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND.equals(str)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, str2);
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                bundle2.toString();
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.logEvent("fcm", str, bundle2);
            } else {
                Log.w(Constants.TAG, "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static void logNotificationDismiss(Intent intent) {
        b(intent.getExtras(), Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS);
    }

    public static void logNotificationForeground(Intent intent) {
        b(intent.getExtras(), Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND);
    }

    public static void logNotificationOpen(Bundle bundle) {
        if (bundle != null && "1".equals(bundle.getString(Constants.AnalyticsKeys.TRACK_CONVERSIONS))) {
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                String string = bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
                analyticsConnector.setUserProperty("fcm", Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string);
                analyticsConnector.logEvent("fcm", "_cmp", bundle2);
            } else {
                Log.w(Constants.TAG, "Unable to set user property for conversion tracking:  analytics library is missing");
            }
        }
        b(bundle, Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:75:0x0155  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void logNotificationReceived(Intent intent) {
        int iIntValue;
        long j10;
        FirebaseApp firebaseApp;
        String gcmSenderId;
        String applicationId;
        String[] strArrSplit;
        String str;
        if (shouldUploadScionMetrics(intent)) {
            b(intent.getExtras(), Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE);
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            MessagingClientEvent.Event event = MessagingClientEvent.Event.MESSAGE_DELIVERED;
            TransportFactory transportFactory = FirebaseMessaging.getTransportFactory();
            if (transportFactory == null) {
                return;
            }
            MessagingClientEvent messagingClientEventBuild = null;
            str = null;
            String str2 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                MessagingClientEvent.Builder builderNewBuilder = MessagingClientEvent.newBuilder();
                Object obj = extras.get(Constants.MessagePayloadKeys.TTL);
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w(Constants.TAG, "Invalid TTL: " + obj);
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                MessagingClientEvent.Builder event2 = builderNewBuilder.setTtl(iIntValue).setEvent(event);
                String string = extras.getString(Constants.MessagePayloadKeys.TO);
                if (TextUtils.isEmpty(string)) {
                    try {
                        string = (String) Tasks.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
                    } catch (InterruptedException | ExecutionException e5) {
                        throw new RuntimeException(e5);
                    }
                }
                MessagingClientEvent.Builder messageType = event2.setInstanceId(string).setPackageName(FirebaseApp.getInstance().getApplicationContext().getPackageName()).setSdkPlatform(MessagingClientEvent.SDKPlatform.ANDROID).setMessageType(NotificationParams.isNotification(extras) ? MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent.MessageType.DATA_MESSAGE);
                String string2 = extras.getString(Constants.MessagePayloadKeys.MSGID);
                if (string2 == null) {
                    string2 = extras.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
                }
                if (string2 != null) {
                    messageType.setMessageId(string2);
                }
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str2 = string3;
                }
                if (str2 != null) {
                    messageType.setTopic(str2);
                }
                String string4 = extras.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
                if (string4 != null) {
                    messageType.setCollapseKey(string4);
                }
                String string5 = extras.getString(Constants.AnalyticsKeys.MESSAGE_LABEL);
                if (string5 != null) {
                    messageType.setAnalyticsLabel(string5);
                }
                String string6 = extras.getString(Constants.AnalyticsKeys.COMPOSER_LABEL);
                if (string6 != null) {
                    messageType.setComposerLabel(string6);
                }
                if (extras.containsKey(Constants.MessagePayloadKeys.SENDER_ID)) {
                    try {
                        j10 = Long.parseLong(extras.getString(Constants.MessagePayloadKeys.SENDER_ID));
                    } catch (NumberFormatException e7) {
                        Log.w(Constants.TAG, "error parsing project number", e7);
                        firebaseApp = FirebaseApp.getInstance();
                        gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
                        if (gcmSenderId != null) {
                            try {
                                j10 = Long.parseLong(gcmSenderId);
                            } catch (NumberFormatException e10) {
                                Log.w(Constants.TAG, "error parsing sender ID", e10);
                                applicationId = firebaseApp.getOptions().getApplicationId();
                                if (applicationId.startsWith("1:")) {
                                    strArrSplit = applicationId.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                                    if (strArrSplit.length < 2) {
                                        j10 = 0;
                                    } else {
                                        str = strArrSplit[1];
                                        if (str.isEmpty()) {
                                            j10 = 0;
                                        } else {
                                            try {
                                                j10 = Long.parseLong(str);
                                            } catch (NumberFormatException e11) {
                                                Log.w(Constants.TAG, "error parsing app ID", e11);
                                                j10 = 0;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        j10 = Long.parseLong(applicationId);
                                    } catch (NumberFormatException e12) {
                                        Log.w(Constants.TAG, "error parsing app ID", e12);
                                        j10 = 0;
                                    }
                                }
                            }
                        } else {
                            applicationId = firebaseApp.getOptions().getApplicationId();
                            if (applicationId.startsWith("1:")) {
                                j10 = Long.parseLong(applicationId);
                            } else {
                                strArrSplit = applicationId.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                                if (strArrSplit.length < 2) {
                                    j10 = 0;
                                } else {
                                    str = strArrSplit[1];
                                    if (str.isEmpty()) {
                                        j10 = 0;
                                    } else {
                                        j10 = Long.parseLong(str);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    firebaseApp = FirebaseApp.getInstance();
                    gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
                    if (gcmSenderId != null) {
                        j10 = Long.parseLong(gcmSenderId);
                    } else {
                        applicationId = firebaseApp.getOptions().getApplicationId();
                        if (applicationId.startsWith("1:")) {
                            j10 = Long.parseLong(applicationId);
                        } else {
                            strArrSplit = applicationId.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                            if (strArrSplit.length < 2) {
                                j10 = 0;
                            } else {
                                str = strArrSplit[1];
                                if (str.isEmpty()) {
                                    j10 = 0;
                                } else {
                                    j10 = Long.parseLong(str);
                                }
                            }
                        }
                    }
                }
                if (j10 > 0) {
                    messageType.setProjectNumber(j10);
                }
                messagingClientEventBuild = messageType.build();
            }
            if (messagingClientEventBuild == null) {
                return;
            }
            try {
                transportFactory.getTransport(Constants.FirelogAnalytics.FCM_LOG_SOURCE, MessagingClientEventExtension.class, Encoding.of("proto"), new ai.a()).send(Event.ofData(MessagingClientEventExtension.newBuilder().setMessagingClientEvent(messagingClientEventBuild).build()));
            } catch (RuntimeException e13) {
                Log.w(Constants.TAG, "Failed to send big query analytics payload.", e13);
            }
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return a();
    }

    public static boolean shouldUploadScionMetrics(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(Constants.AnalyticsKeys.ENABLED));
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return shouldUploadScionMetrics(intent.getExtras());
    }
}
