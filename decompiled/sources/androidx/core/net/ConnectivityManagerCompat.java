package androidx.core.net;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectivityManagerCompat {
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface RestrictBackgroundStatus {
    }

    @RequiresApi(16)
    public static class a {
        @RequiresPermission(MagiskApp.ACCESS_NETWORK_STATE)
        @DoNotInline
        public static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    @RequiresApi(24)
    public static class b {
        @DoNotInline
        public static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @Nullable
    @RequiresPermission(MagiskApp.ACCESS_NETWORK_STATE)
    @SuppressLint({"ReferencesDeprecated"})
    public static NetworkInfo getNetworkInfoFromBroadcast(@NonNull ConnectivityManager connectivityManager, @NonNull Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int getRestrictBackgroundStatus(@NonNull ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.a(connectivityManager);
        }
        return 3;
    }

    @RequiresPermission(MagiskApp.ACCESS_NETWORK_STATE)
    public static boolean isActiveNetworkMetered(@NonNull ConnectivityManager connectivityManager) {
        return a.a(connectivityManager);
    }
}
