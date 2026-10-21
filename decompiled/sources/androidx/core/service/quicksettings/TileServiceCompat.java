package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public class TileServiceCompat {

    @RequiresApi(24)
    public static class a {
        @DoNotInline
        public static void a(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    @RequiresApi(34)
    public static class b {
        @DoNotInline
        public static void a(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    public interface c {
    }

    public static void startActivityAndCollapse(@NonNull TileService tileService, @NonNull PendingIntentActivityWrapper pendingIntentActivityWrapper) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            b.a(tileService, pendingIntentActivityWrapper.getPendingIntent());
        } else if (i10 >= 24) {
            a.a(tileService, pendingIntentActivityWrapper.getIntent());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void clearTileServiceWrapper() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void setTileServiceWrapper(@NonNull c cVar) {
    }
}
