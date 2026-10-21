package com.bbva.plugin.permissions;

import androidx.core.app.NotificationCompat;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.plugin.media.capture.util.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Permissions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\",\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "", "", "a", "Ljava/util/Map;", "getPermissions", "()Ljava/util/Map;", "permissions", "permissions-plugin_release"}, k = 2, mv = {1, 6, 0})
public final class PermissionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<String, String[]> f35889a = q.mapOf(TuplesKt.to(Constants.CAMERA_SRC, new String[]{"android.permission.CAMERA"}), TuplesKt.to("read-contacts", new String[]{"android.permission.READ_CONTACTS"}), TuplesKt.to("write-contacts", new String[]{"android.permission.WRITE_CONTACTS"}), TuplesKt.to("read-calendar", new String[]{"android.permission.READ_CALENDAR"}), TuplesKt.to("write-calendar", new String[]{"android.permission.WRITE_CALENDAR"}), TuplesKt.to("read-storage", new String[]{"android.permission.READ_EXTERNAL_STORAGE"}), TuplesKt.to("write-storage", new String[]{MagiskApp.WRITE_EXTERNAL_STORAGE}), TuplesKt.to("microphone", new String[]{"android.permission.RECORD_AUDIO"}), TuplesKt.to("location", new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}), TuplesKt.to(NotificationCompat.CATEGORY_CALL, new String[]{"android.permission.CALL_PHONE"}), TuplesKt.to("accounts", new String[]{"android.permission.GET_ACCOUNTS"}), TuplesKt.to("location-fine", new String[]{"android.permission.ACCESS_FINE_LOCATION"}), TuplesKt.to("location-coarse", new String[]{"android.permission.ACCESS_COARSE_LOCATION"}), TuplesKt.to("location-background", new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}), TuplesKt.to("activity-recognition", new String[]{"android.permission.ACTIVITY_RECOGNITION"}), TuplesKt.to("read-phone-state", new String[]{"android.permission.READ_PHONE_STATE"}), TuplesKt.to("post-notifications", new String[]{"android.permission.POST_NOTIFICATIONS"}));

    @NotNull
    public static final Map<String, String[]> getPermissions() {
        return f35889a;
    }
}
