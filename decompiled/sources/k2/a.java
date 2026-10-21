package k2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: CalleeHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    @NonNull
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
