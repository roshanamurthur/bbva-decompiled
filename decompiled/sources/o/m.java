package o;

import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: PackageUtils.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class m {
    public static boolean a(@NonNull PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
