package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: DisplayNotification.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f48611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f48612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationParams f48613c;

    public b(Context context, NotificationParams notificationParams, ExecutorService executorService) {
        this.f48611a = executorService;
        this.f48612b = context;
        this.f48613c = notificationParams;
    }

    public final boolean a() {
        Bundle bundle;
        NotificationParams notificationParams = this.f48613c;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.NO_UI)) {
            return true;
        }
        Context context = this.f48612b;
        if (!((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID)).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        ImageDownload imageDownloadCreate = ImageDownload.create(notificationParams.getString(Constants.MessageNotificationKeys.IMAGE_URL));
        if (imageDownloadCreate != null) {
            imageDownloadCreate.start(this.f48611a);
        }
        String str = CommonNotificationBuilder.METADATA_DEFAULT_COLOR;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w(Constants.TAG, "Couldn't get own application info: " + e5);
        }
        CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfoCreateNotificationInfo = CommonNotificationBuilder.createNotificationInfo(context, context, notificationParams, CommonNotificationBuilder.getOrCreateChannel(context, notificationParams.getNotificationChannelId(), bundle), bundle);
        NotificationCompat.Builder builder = displayNotificationInfoCreateNotificationInfo.notificationBuilder;
        if (imageDownloadCreate != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(imageDownloadCreate.getTask(), 5L, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
            } catch (InterruptedException unused) {
                Log.w(Constants.TAG, "Interrupted while downloading image, showing notification without it");
                imageDownloadCreate.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e7) {
                Log.w(Constants.TAG, "Failed to download image: " + e7.getCause());
            } catch (TimeoutException unused2) {
                Log.w(Constants.TAG, "Failed to download image in time, showing notification without it");
                imageDownloadCreate.close();
            }
        }
        ((NotificationManager) context.getSystemService("notification")).notify(displayNotificationInfoCreateNotificationInfo.tag, displayNotificationInfoCreateNotificationInfo.id, displayNotificationInfoCreateNotificationInfo.notificationBuilder.build());
        return true;
    }
}
