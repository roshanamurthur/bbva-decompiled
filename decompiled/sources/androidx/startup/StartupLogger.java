package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class StartupLogger {
    public static void w(@NonNull String str) {
        Log.w("StartupLogger", str);
    }

    public static void i(@NonNull String str) {
    }

    public static void e(@NonNull String str, @Nullable Throwable th2) {
    }
}
