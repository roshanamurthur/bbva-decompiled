package k4;

import com.bbva.cellscore.web.component.CellsWebView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;
import io.reactivex.functions.Predicate;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Predicate, SynchronizationGuard.CriticalSection, Continuation {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f79186p0;

    public /* synthetic */ b(Object obj) {
        this.f79186p0 = obj;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        ((Uploader) this.f79186p0).f43837i.resetClientMetrics();
        return null;
    }

    @Override // io.reactivex.functions.Predicate
    public final boolean test(Object obj) {
        return ((CellsWebView) this.f79186p0).f27065q0.getVisibility() == 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f79186p0;
        ExecutorService executorService = Utils.f47779a;
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }
}
