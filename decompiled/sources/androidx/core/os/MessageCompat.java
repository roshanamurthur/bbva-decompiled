package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageCompat {

    @RequiresApi(22)
    public static class a {
        @DoNotInline
        public static boolean a(Message message) {
            return message.isAsynchronous();
        }

        @DoNotInline
        public static void b(Message message, boolean z10) {
            message.setAsynchronous(z10);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@NonNull Message message) {
        return a.a(message);
    }

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message, boolean z10) {
        a.b(message, z10);
    }
}
