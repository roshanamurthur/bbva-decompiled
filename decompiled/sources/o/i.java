package o;

import android.os.CancellationSignal;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: CancellationSignalProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f85237a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CancellationSignal f85238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public androidx.core.os.CancellationSignal f85239c;

    /* JADX INFO: compiled from: CancellationSignalProvider.java */
    public class a {
    }

    /* JADX INFO: compiled from: CancellationSignalProvider.java */
    @RequiresApi(16)
    public static class b {
        public static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }
}
