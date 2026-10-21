package com.adobe.marketing.mobile;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.i;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class LocalNotificationHandler extends BroadcastReceiver {
    private static final String LOG_TAG = "Messages";
    private static final String NOTIFICATION_CHANNEL_DESCRIPTION = "Adobe Experience Platform SDK Notifications";
    private static final String NOTIFICATION_CHANNEL_ID = "ADOBE_EXPERIENCE_PLATFORM_SDK";
    private static final String NOTIFICATION_CHANNEL_NAME = "ADOBE_EXPERIENCE_PLATFORM_SDK";

    private static Object getBigTextStyle(int i10, ClassLoader classLoader, String str) throws Exception {
        Class<?> clsLoadClass = classLoader.loadClass(i10 >= 26 ? "androidx.core.app.NotificationCompat$BigTextStyle" : "android.app.Notification$BigTextStyle");
        Object objNewInstance = clsLoadClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        clsLoadClass.getDeclaredMethod("bigText", CharSequence.class).invoke(objNewInstance, str);
        return objNewInstance;
    }

    private Bitmap getBitmapFromDrawable(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private Bitmap getLargeIcon(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Drawable applicationIcon;
        PackageManager packageManager;
        if (context == null) {
            return null;
        }
        int largeIconResourceID = App.getLargeIconResourceID();
        if (largeIconResourceID != -1) {
            applicationIcon = (Drawable) Resources.class.getDeclaredMethod("getDrawable", Integer.TYPE, Resources.Theme.class).invoke(context.getResources(), Integer.valueOf(largeIconResourceID), context.getTheme());
        } else {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            applicationIcon = (applicationInfo == null || (packageManager = context.getPackageManager()) == null) ? null : packageManager.getApplicationIcon(applicationInfo);
        }
        if (applicationIcon != null) {
            return applicationIcon instanceof BitmapDrawable ? ((BitmapDrawable) applicationIcon).getBitmap() : getBitmapFromDrawable(applicationIcon);
        }
        return null;
    }

    private int getSmallIcon() {
        return App.getSmallIconResourceID() != -1 ? App.getSmallIconResourceID() : android.R.drawable.sym_def_app_icon;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0261 A[Catch: Exception -> 0x026b, TRY_LEAVE, TryCatch #4 {Exception -> 0x026b, blocks: (B:59:0x0214, B:70:0x0252, B:72:0x0261, B:78:0x0277, B:77:0x026f, B:58:0x01b2), top: B:104:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x026f A[Catch: Exception -> 0x026b, TRY_ENTER, TryCatch #4 {Exception -> 0x026b, blocks: (B:59:0x0214, B:70:0x0252, B:72:0x0261, B:78:0x0277, B:77:0x026f, B:58:0x01b2), top: B:104:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x02fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x02ff A[Catch: Exception -> 0x018d, TRY_LEAVE, TryCatch #2 {Exception -> 0x018d, blocks: (B:37:0x00e4, B:41:0x010e, B:44:0x0137, B:47:0x0180, B:60:0x0222, B:65:0x0245, B:73:0x0263, B:79:0x0294, B:82:0x02e7, B:85:0x02ff, B:56:0x019b), top: B:100:0x00e2 }] */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent intent2;
        String str;
        int i10;
        int i11;
        char c10;
        Class<?> clsLoadClass;
        Object objNewInstance;
        Method declaredMethod;
        char c11;
        Object objInvoke;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.debug(LOG_TAG, "Failed to load extras from local notification intent", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = extras.getString(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_CONTENT_KEY);
            extras.getInt(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_REQUEST_CODE_KEY);
            int i12 = extras.getInt(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_SENDER_CODE_KEY);
            String string2 = extras.getString(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_IDENTIFIER_KEY);
            String string3 = extras.getString(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_DEEPLINK_KEY);
            extras.getString(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_SOUND_KEY);
            HashMap map = (HashMap) extras.getSerializable(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_USER_INFO_KEY);
            String string4 = extras.getString(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_TITLE);
            if (i12 != 750183) {
                return;
            }
            if (string == null) {
                Log.debug(LOG_TAG, "%s (local notification message)", "Unexpected Null Value");
                return;
            }
            Activity currentActivity = App.getCurrentActivity();
            if (string3 == null || string3.isEmpty()) {
                intent2 = currentActivity != null ? currentActivity.getIntent() : intent;
            } else {
                intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(string3));
            }
            intent2.setFlags(603979776);
            intent2.putExtra(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_IDENTIFIER_KEY, string2);
            intent2.putExtra(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_USER_INFO_KEY, map);
            int i13 = Build.VERSION.SDK_INT;
            NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
            try {
                Field field = PendingIntent.class.getField("FLAG_IMMUTABLE");
                try {
                    field.setAccessible(true);
                    PendingIntent activity = PendingIntent.getActivity(applicationContext, i12, intent2, ((Integer) field.get(null)).intValue() | 134217728);
                    if (activity == null) {
                        Log.debug(LOG_TAG, "Failed to retrieve sender from broadcast, unable to post notification", new Object[0]);
                        return;
                    }
                    App.setAppContext(context.getApplicationContext());
                    String applicationName = new AndroidSystemInfoService().getApplicationName();
                    str = LOG_TAG;
                    try {
                        if (i13 >= 26) {
                            ClassLoader classLoader = LocalNotificationHandler.class.getClassLoader();
                            Class<?> clsLoadClass2 = classLoader.loadClass("android.app.NotificationChannel");
                            Class<?>[] clsArr = new Class[3];
                            clsArr[0] = String.class;
                            i10 = 1;
                            try {
                                clsArr[1] = CharSequence.class;
                                clsArr[2] = Integer.TYPE;
                                Constructor<?> constructor = clsLoadClass2.getConstructor(clsArr);
                                constructor.setAccessible(true);
                                Object[] objArr = new Object[3];
                                objArr[0] = "ADOBE_EXPERIENCE_PLATFORM_SDK";
                                try {
                                    objArr[1] = "ADOBE_EXPERIENCE_PLATFORM_SDK";
                                    objArr[2] = 4;
                                    Object objNewInstance2 = constructor.newInstance(objArr);
                                    Method method = clsLoadClass2.getMethod("setDescription", String.class);
                                    Object[] objArr2 = new Object[1];
                                    objArr2[0] = NOTIFICATION_CHANNEL_DESCRIPTION;
                                    method.invoke(objNewInstance2, objArr2);
                                    notificationManager.createNotificationChannel(i.b(objNewInstance2));
                                    clsLoadClass = classLoader.loadClass("androidx.core.app.NotificationCompat$Builder");
                                    Class<?>[] clsArr2 = new Class[2];
                                    clsArr2[0] = Context.class;
                                    try {
                                        clsArr2[1] = "ADOBE_EXPERIENCE_PLATFORM_SDK".getClass();
                                        Constructor<?> constructor2 = clsLoadClass.getConstructor(clsArr2);
                                        constructor2.setAccessible(true);
                                        objNewInstance = constructor2.newInstance(context.getApplicationContext(), "ADOBE_EXPERIENCE_PLATFORM_SDK");
                                        Method declaredMethod2 = clsLoadClass.getDeclaredMethod("setStyle", classLoader.loadClass("androidx.core.app.NotificationCompat$Style"));
                                        Object[] objArr3 = new Object[1];
                                        objArr3[0] = getBigTextStyle(i13, classLoader, string);
                                        declaredMethod2.invoke(objNewInstance, objArr3);
                                        i11 = 1;
                                        c10 = 0;
                                    } catch (Exception e5) {
                                        e = e5;
                                        i10 = 1;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    i10 = 1;
                                }
                            } catch (Exception e10) {
                                e = e10;
                            }
                        } else {
                            ClassLoader classLoader2 = BroadcastHandler.class.getClassLoader();
                            Class<?> clsLoadClass3 = classLoader2.loadClass("android.app.Notification$Builder");
                            i11 = 1;
                            try {
                                c10 = 0;
                                Constructor<?> constructor3 = clsLoadClass3.getConstructor(Context.class);
                                constructor3.setAccessible(true);
                                Object objNewInstance3 = constructor3.newInstance(context.getApplicationContext());
                                clsLoadClass3.getDeclaredMethod("setSound", Uri.class).invoke(objNewInstance3, RingtoneManager.getDefaultUri(2));
                                clsLoadClass3.getDeclaredMethod("setPriority", Integer.TYPE).invoke(objNewInstance3, 1);
                                clsLoadClass3.getDeclaredMethod("setStyle", classLoader2.loadClass("android.app.Notification$Style")).invoke(objNewInstance3, getBigTextStyle(i13, classLoader2, string));
                                clsLoadClass = clsLoadClass3;
                                objNewInstance = objNewInstance3;
                            } catch (Exception e11) {
                                e = e11;
                                i10 = i11;
                            }
                        }
                        Class<?>[] clsArr3 = new Class[i11];
                        clsArr3[c10] = Integer.TYPE;
                        Method declaredMethod3 = clsLoadClass.getDeclaredMethod("setSmallIcon", clsArr3);
                        Object[] objArr4 = new Object[i11];
                        objArr4[c10] = Integer.valueOf(getSmallIcon());
                        declaredMethod3.invoke(objNewInstance, objArr4);
                        Bitmap largeIcon = getLargeIcon(context);
                        if (largeIcon == null) {
                            i11 = 1;
                            declaredMethod = clsLoadClass.getDeclaredMethod("setContentTitle", CharSequence.class);
                            if (StringUtils.isNullOrEmpty(string4)) {
                                c11 = 0;
                                declaredMethod.invoke(objNewInstance, applicationName);
                            } else {
                                Object[] objArr5 = new Object[1];
                                objArr5[0] = string4;
                                declaredMethod.invoke(objNewInstance, objArr5);
                                i11 = 1;
                                c11 = 0;
                            }
                            Class<?>[] clsArr4 = new Class[i11];
                            clsArr4[c11] = CharSequence.class;
                            Method declaredMethod4 = clsLoadClass.getDeclaredMethod("setContentText", clsArr4);
                            Object[] objArr6 = new Object[i11];
                            objArr6[c11] = string;
                            declaredMethod4.invoke(objNewInstance, objArr6);
                            Class<?>[] clsArr5 = new Class[i11];
                            clsArr5[c11] = PendingIntent.class;
                            Method declaredMethod5 = clsLoadClass.getDeclaredMethod("setContentIntent", clsArr5);
                            Object[] objArr7 = new Object[i11];
                            objArr7[c11] = activity;
                            declaredMethod5.invoke(objNewInstance, objArr7);
                            Intent intent3 = new Intent(applicationContext, (Class<?>) NotificationDismissalHandler.class);
                            intent3.putExtra(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_USER_INFO_KEY, map);
                            Method declaredMethod6 = clsLoadClass.getDeclaredMethod("setDeleteIntent", PendingIntent.class);
                            Field field2 = PendingIntent.class.getField("FLAG_IMMUTABLE");
                            field2.setAccessible(true);
                            declaredMethod6.invoke(objNewInstance, PendingIntent.getBroadcast(applicationContext, i12, intent3, ((Integer) field2.get(null)).intValue() | 134217728));
                            Method declaredMethod7 = clsLoadClass.getDeclaredMethod("setAutoCancel", Boolean.TYPE);
                            Object[] objArr8 = new Object[1];
                            objArr8[0] = Boolean.TRUE;
                            declaredMethod7.invoke(objNewInstance, objArr8);
                            objInvoke = clsLoadClass.getDeclaredMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]).invoke(objNewInstance, new Object[0]);
                            if (objInvoke == null) {
                                return;
                            }
                            notificationManager.notify(new SecureRandom().nextInt(), (Notification) objInvoke);
                            return;
                        }
                        try {
                            Method declaredMethod8 = clsLoadClass.getDeclaredMethod("setLargeIcon", Bitmap.class);
                            Object[] objArr9 = new Object[1];
                            objArr9[0] = largeIcon;
                            declaredMethod8.invoke(objNewInstance, objArr9);
                            i11 = 1;
                            declaredMethod = clsLoadClass.getDeclaredMethod("setContentTitle", CharSequence.class);
                            if (StringUtils.isNullOrEmpty(string4)) {
                                Object[] objArr10 = new Object[1];
                                objArr10[0] = string4;
                                declaredMethod.invoke(objNewInstance, objArr10);
                                i11 = 1;
                                c11 = 0;
                            } else {
                                c11 = 0;
                                declaredMethod.invoke(objNewInstance, applicationName);
                            }
                            Class<?>[] clsArr6 = new Class[i11];
                            clsArr6[c11] = CharSequence.class;
                            Method declaredMethod9 = clsLoadClass.getDeclaredMethod("setContentText", clsArr6);
                            Object[] objArr11 = new Object[i11];
                            objArr11[c11] = string;
                            declaredMethod9.invoke(objNewInstance, objArr11);
                            Class<?>[] clsArr7 = new Class[i11];
                            clsArr7[c11] = PendingIntent.class;
                            Method declaredMethod10 = clsLoadClass.getDeclaredMethod("setContentIntent", clsArr7);
                            Object[] objArr12 = new Object[i11];
                            objArr12[c11] = activity;
                            declaredMethod10.invoke(objNewInstance, objArr12);
                            Intent intent4 = new Intent(applicationContext, (Class<?>) NotificationDismissalHandler.class);
                            intent4.putExtra(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_USER_INFO_KEY, map);
                            try {
                                Method declaredMethod11 = clsLoadClass.getDeclaredMethod("setDeleteIntent", PendingIntent.class);
                                Field field3 = PendingIntent.class.getField("FLAG_IMMUTABLE");
                                field3.setAccessible(true);
                                declaredMethod11.invoke(objNewInstance, PendingIntent.getBroadcast(applicationContext, i12, intent4, ((Integer) field3.get(null)).intValue() | 134217728));
                                Method declaredMethod12 = clsLoadClass.getDeclaredMethod("setAutoCancel", Boolean.TYPE);
                                Object[] objArr13 = new Object[1];
                                objArr13[0] = Boolean.TRUE;
                                declaredMethod12.invoke(objNewInstance, objArr13);
                                objInvoke = clsLoadClass.getDeclaredMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]).invoke(objNewInstance, new Object[0]);
                                if (objInvoke == null) {
                                    return;
                                }
                                notificationManager.notify(new SecureRandom().nextInt(), (Notification) objInvoke);
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                i10 = 1;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            i10 = 1;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        i10 = 1;
                    }
                    Object[] objArr14 = new Object[i10];
                    objArr14[0] = e;
                    Log.warning(str, "unexpected error posting notification (%s)", objArr14);
                } catch (Exception e15) {
                    e = e15;
                    str = LOG_TAG;
                    i10 = 1;
                }
            } catch (Exception e16) {
                e = e16;
                str = LOG_TAG;
            }
        } catch (Exception e17) {
            Log.debug(LOG_TAG, "Failed to process bundle (%s)", e17);
        }
    }
}
