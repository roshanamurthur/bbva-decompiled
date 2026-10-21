package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public class UserManagerCompat {

    @RequiresApi(24)
    public static class a {
        @DoNotInline
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean isUserUnlocked(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(context);
        }
        return true;
    }
}
