package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Context f48647p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f48648q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f48649r0;

    public /* synthetic */ m(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f48647p0 = context;
        this.f48648q0 = z10;
        this.f48649r0 = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f48647p0;
        TaskCompletionSource taskCompletionSource = this.f48649r0;
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (this.f48648q0) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                context.getPackageName();
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }
}
