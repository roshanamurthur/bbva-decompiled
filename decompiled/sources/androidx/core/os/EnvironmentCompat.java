package androidx.core.os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @NonNull
    public static String getStorageState(@NonNull File file) {
        return a.a(file);
    }
}
