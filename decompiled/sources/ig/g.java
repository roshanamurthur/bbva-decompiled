package ig;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: compiled from: GetIdListener.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource<String> f69679a;

    public g(TaskCompletionSource<String> taskCompletionSource) {
        this.f69679a = taskCompletionSource;
    }

    @Override // ig.h
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // ig.h
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.f69679a.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
