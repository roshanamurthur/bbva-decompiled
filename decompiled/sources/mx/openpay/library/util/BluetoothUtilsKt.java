package mx.openpay.library.util;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"isBluetoothPermissionGranted", "", "context", "Landroid/content/Context;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BluetoothUtilsKt {
    public static final boolean isBluetoothPermissionGranted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return context.checkSelfPermission("android.permission.BLUETOOTH_SCAN") == 0;
        }
        return context.checkSelfPermission("android.permission.BLUETOOTH") == 0;
    }
}
