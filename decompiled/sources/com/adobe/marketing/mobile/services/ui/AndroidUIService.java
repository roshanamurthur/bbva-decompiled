package com.adobe.marketing.mobile.services.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.adobe.marketing.mobile.LocalNotificationHandler;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.internal.context.App;
import com.adobe.marketing.mobile.services.ui.internal.MessagesMonitor;
import java.lang.reflect.Field;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidUIService implements UIService {
    private static final String LOG_TAG = "AndroidUIService";
    public static final String NOTIFICATION_CONTENT_KEY = "NOTIFICATION_CONTENT";
    public static final String NOTIFICATION_DEEPLINK_KEY = "NOTIFICATION_DEEPLINK";
    public static final String NOTIFICATION_IDENTIFIER_KEY = "NOTIFICATION_IDENTIFIER";
    public static final String NOTIFICATION_REQUEST_CODE_KEY = "NOTIFICATION_REQUEST_CODE";
    public static final int NOTIFICATION_SENDER_CODE = 750183;
    public static final String NOTIFICATION_SENDER_CODE_KEY = "NOTIFICATION_SENDER_CODE";
    public static final String NOTIFICATION_SOUND_KEY = "NOTIFICATION_SOUND";
    public static final String NOTIFICATION_TITLE = "NOTIFICATION_TITLE";
    public static final String NOTIFICATION_USER_INFO_KEY = "NOTIFICATION_USER_INFO";
    private static final String UNEXPECTED_NULL_VALUE = "Unexpected Null Value";
    MessagesMonitor messagesMonitor = MessagesMonitor.getInstance();

    private static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    public FloatingButton createFloatingButton(FloatingButtonListener floatingButtonListener) {
        Activity currentActivity = App.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (current activity), no button created.", UNEXPECTED_NULL_VALUE));
            return null;
        }
        FloatingButtonView floatingButtonViewCreateFloatingButtonView = createFloatingButtonView(currentActivity);
        FloatingButtonManager floatingButtonManager = new FloatingButtonManager(this, floatingButtonListener);
        floatingButtonManager.addManagedButton(currentActivity.getLocalClassName(), floatingButtonViewCreateFloatingButtonView);
        return floatingButtonManager;
    }

    public FloatingButtonView createFloatingButtonView(Activity activity) {
        FloatingButtonView floatingButtonView = new FloatingButtonView(activity);
        floatingButtonView.setTag("ADBFloatingButtonTag");
        return floatingButtonView;
    }

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    @Deprecated
    public FullscreenMessage createFullscreenMessage(String str, FullscreenMessageDelegate fullscreenMessageDelegate, boolean z10, MessageSettings messageSettings) {
        try {
            return new AEPMessage(str, fullscreenMessageDelegate, z10, MessagesMonitor.getInstance(), messageSettings);
        } catch (MessageCreationException e5) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("Error when creating the message: %s.", e5.getLocalizedMessage()));
            return null;
        }
    }

    public DialogInterface.OnCancelListener getAlertDialogOnCancelListener(final AlertListener alertListener) {
        return new DialogInterface.OnCancelListener() { // from class: com.adobe.marketing.mobile.services.ui.AndroidUIService.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                AndroidUIService.this.messagesMonitor.dismissed();
                AlertListener alertListener2 = alertListener;
                if (alertListener2 != null) {
                    alertListener2.onDismiss();
                }
            }
        };
    }

    public DialogInterface.OnClickListener getAlertDialogOnClickListener(final AlertListener alertListener) {
        return new DialogInterface.OnClickListener() { // from class: com.adobe.marketing.mobile.services.ui.AndroidUIService.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                AndroidUIService.this.messagesMonitor.dismissed();
                AlertListener alertListener2 = alertListener;
                if (alertListener2 != null) {
                    if (i10 == -1) {
                        alertListener2.onPositiveResponse();
                    } else if (i10 == -2) {
                        alertListener2.onNegativeResponse();
                    }
                }
            }
        };
    }

    public DialogInterface.OnShowListener getAlertDialogOnShowListener(final AlertListener alertListener) {
        return new DialogInterface.OnShowListener() { // from class: com.adobe.marketing.mobile.services.ui.AndroidUIService.2
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                AlertListener alertListener2 = alertListener;
                if (alertListener2 != null) {
                    alertListener2.onShow();
                }
            }
        };
    }

    public Intent getIntentWithUrl(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    public void showAlert(final AlertSetting alertSetting, final AlertListener alertListener) {
        if (this.messagesMonitor.isDisplayed()) {
            if (alertListener != null) {
                alertListener.onError(UIError.ANOTHER_MESSAGE_IS_DISPLAYED);
            }
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, "Failed to show alert, another message is displayed at this time");
            return;
        }
        final Activity currentActivity = App.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (current activity), unable to show alert", UNEXPECTED_NULL_VALUE));
        } else if (isNullOrEmpty(alertSetting.getNegativeButtonText()) && isNullOrEmpty(alertSetting.getPositiveButtonText())) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, "Unable to show alert, button texts are invalid.");
        } else {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.adobe.marketing.mobile.services.ui.AndroidUIService.1
                @Override // java.lang.Runnable
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(currentActivity);
                    builder.setTitle(alertSetting.getTitle());
                    builder.setMessage(alertSetting.getMessage());
                    DialogInterface.OnClickListener alertDialogOnClickListener = AndroidUIService.this.getAlertDialogOnClickListener(alertListener);
                    if (alertSetting.getPositiveButtonText() != null && !alertSetting.getPositiveButtonText().isEmpty()) {
                        builder.setPositiveButton(alertSetting.getPositiveButtonText(), alertDialogOnClickListener);
                    }
                    if (alertSetting.getNegativeButtonText() != null && !alertSetting.getNegativeButtonText().isEmpty()) {
                        builder.setNegativeButton(alertSetting.getNegativeButtonText(), alertDialogOnClickListener);
                    }
                    builder.setOnCancelListener(AndroidUIService.this.getAlertDialogOnCancelListener(alertListener));
                    AlertDialog alertDialogCreate = builder.create();
                    alertDialogCreate.setOnShowListener(AndroidUIService.this.getAlertDialogOnShowListener(alertListener));
                    alertDialogCreate.setCanceledOnTouchOutside(false);
                    alertDialogCreate.show();
                }
            });
            this.messagesMonitor.displayed();
        }
    }

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    @SuppressLint({"TrulyRandom"})
    public void showLocalNotification(NotificationSetting notificationSetting) {
        Context appContext = App.getInstance().getAppContext();
        if (appContext == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (application context), unable to show local notification", UNEXPECTED_NULL_VALUE));
            return;
        }
        int iNextInt = new SecureRandom().nextInt();
        Calendar calendar = Calendar.getInstance();
        if (notificationSetting.getFireDate() > 0) {
            int fireDate = (int) (notificationSetting.getFireDate() - (calendar.getTimeInMillis() / 1000));
            if (fireDate > 0) {
                calendar.add(13, fireDate);
            }
        } else {
            calendar.add(13, notificationSetting.getDelaySeconds());
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClass(appContext, LocalNotificationHandler.class);
        intent.putExtra(NOTIFICATION_SENDER_CODE_KEY, NOTIFICATION_SENDER_CODE);
        intent.putExtra(NOTIFICATION_IDENTIFIER_KEY, notificationSetting.getIdentifier());
        intent.putExtra(NOTIFICATION_REQUEST_CODE_KEY, iNextInt);
        intent.putExtra(NOTIFICATION_DEEPLINK_KEY, notificationSetting.getDeeplink());
        intent.putExtra(NOTIFICATION_CONTENT_KEY, notificationSetting.getContent());
        intent.putExtra(NOTIFICATION_USER_INFO_KEY, (HashMap) notificationSetting.getUserInfo());
        intent.putExtra(NOTIFICATION_SOUND_KEY, notificationSetting.getSound());
        intent.putExtra(NOTIFICATION_TITLE, notificationSetting.getTitle());
        try {
            Field field = PendingIntent.class.getField("FLAG_IMMUTABLE");
            field.setAccessible(true);
            PendingIntent broadcast = PendingIntent.getBroadcast(appContext, iNextInt, intent, ((Integer) field.get(null)).intValue() | 134217728);
            AlarmManager alarmManager = (AlarmManager) appContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (alarmManager != null) {
                alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
            }
        } catch (Exception e5) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("Unable to create PendingIntent object, error: %s", e5.getLocalizedMessage()));
        }
    }

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    public boolean showUrl(String str) {
        Activity currentActivity = App.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (current activity), could not open URL %s", UNEXPECTED_NULL_VALUE, str));
            return false;
        }
        if (isNullOrEmpty(str)) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, "Could not open URL - URL was not provided");
            return false;
        }
        try {
            currentActivity.startActivity(getIntentWithUrl(str));
            return true;
        } catch (Exception unused) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, "Could not open an Intent with URL");
            return false;
        }
    }

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    public FullscreenMessage createFullscreenMessage(String str, MessageSettings messageSettings) {
        return createFullscreenMessage(str, messageSettings, null);
    }

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    public FullscreenMessage createFullscreenMessage(String str, MessageSettings messageSettings, Map<String, String> map) {
        try {
            return new AEPMessage(str, messageSettings, map);
        } catch (MessageCreationException e5) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("Error when creating the message: %s.", e5.getLocalizedMessage()));
            return null;
        }
    }
}
