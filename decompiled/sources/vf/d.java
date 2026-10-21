package vf;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.Logger;

/* JADX INFO: compiled from: FirebaseCrashlytics.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements Continuation<Void, Object> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(@NonNull Task<Void> task) throws Exception {
        if (task.isSuccessful()) {
            return null;
        }
        Logger.getLogger().e("Error fetching settings.", task.getException());
        return null;
    }
}
