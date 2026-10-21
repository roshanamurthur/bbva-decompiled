package g3;

import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: TraceApi29Impl.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
public final class a {
    public static void a(@NonNull String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(@NonNull String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static void c(@NonNull String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
