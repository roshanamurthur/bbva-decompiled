package n;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f84401p0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f84401p0) {
            case 0:
                ArchTaskExecutor.getInstance().executeOnDiskIO(runnable);
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
