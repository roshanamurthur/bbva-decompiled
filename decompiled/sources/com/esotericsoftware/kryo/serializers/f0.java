package com.esotericsoftware.kryo.serializers;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import java.nio.file.FileVisitor;
import java.nio.file.Path;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 {
    public static /* synthetic */ NotificationChannel b(String str) {
        return new NotificationChannel(NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID, str, 3);
    }

    public static /* synthetic */ NotificationChannel c(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return Path.class;
    }

    public static /* bridge */ /* synthetic */ FileVisitor e(Object obj) {
        return (FileVisitor) obj;
    }

    public static /* bridge */ /* synthetic */ boolean h(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
