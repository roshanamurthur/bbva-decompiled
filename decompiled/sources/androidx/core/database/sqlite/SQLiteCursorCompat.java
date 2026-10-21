package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteCursorCompat {

    @RequiresApi(28)
    public static class a {
        @DoNotInline
        public static void a(SQLiteCursor sQLiteCursor, boolean z10) {
            sQLiteCursor.setFillWindowForwardOnly(z10);
        }
    }

    public static void setFillWindowForwardOnly(@NonNull SQLiteCursor sQLiteCursor, boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            a.a(sQLiteCursor, z10);
        }
    }
}
