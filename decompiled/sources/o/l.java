package o;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: KeyguardUtils.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class l {
    @Nullable
    public static KeyguardManager a(@NonNull Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(@NonNull KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
