package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Operation;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class PruneWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WorkManagerImpl f24624p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final OperationImpl f24625q0 = new OperationImpl();

    public PruneWorkRunnable(WorkManagerImpl workManagerImpl) {
        this.f24624p0 = workManagerImpl;
    }

    public Operation getOperation() {
        return this.f24625q0;
    }

    @Override // java.lang.Runnable
    public void run() {
        OperationImpl operationImpl = this.f24625q0;
        try {
            this.f24624p0.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            operationImpl.setState(Operation.SUCCESS);
        } catch (Throwable th2) {
            operationImpl.setState(new Operation.State.FAILURE(th2));
        }
    }
}
