package xf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements SuccessContinuation<Void, Boolean> {
    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Boolean> then(@Nullable Void r1) throws Exception {
        return Tasks.forResult(Boolean.TRUE);
    }
}
