package xf;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements Continuation<Void, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Callable f94615p0;

    public g(Callable callable) {
        this.f94615p0 = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(@NonNull Task<Void> task) throws Exception {
        return this.f94615p0.call();
    }
}
