package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class CursorWindowCompat {

    @RequiresApi(15)
    public static class a {
        @DoNotInline
        public static CursorWindow a(String str) {
            return new CursorWindow(str);
        }
    }

    @RequiresApi(28)
    public static class b {
        @DoNotInline
        public static CursorWindow a(String str, long j10) {
            return new CursorWindow(str, j10);
        }
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j10) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(str, j10) : a.a(str);
    }
}
