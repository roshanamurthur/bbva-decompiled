package v2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ConcurrencyHelpers.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
public final class c {
    @DoNotInline
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
