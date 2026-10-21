package org.junit.experimental;

import dn.a;
import org.junit.runner.Computer;
import org.junit.runner.Runner;
import org.junit.runners.ParentRunner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class ParallelComputer extends Computer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f91795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91796b;

    public ParallelComputer(boolean z10, boolean z11) {
        this.f91795a = z10;
        this.f91796b = z11;
    }

    public static Computer classes() {
        return new ParallelComputer(true, false);
    }

    public static Computer methods() {
        return new ParallelComputer(false, true);
    }

    @Override // org.junit.runner.Computer
    public Runner getRunner(RunnerBuilder runnerBuilder, Class<?> cls) throws Throwable {
        Runner runner = super.getRunner(runnerBuilder, cls);
        if (this.f91796b && (runner instanceof ParentRunner)) {
            ((ParentRunner) runner).setScheduler(new a());
        }
        return runner;
    }

    @Override // org.junit.runner.Computer
    public Runner getSuite(RunnerBuilder runnerBuilder, Class<?>[] clsArr) throws InitializationError {
        Runner suite = super.getSuite(runnerBuilder, clsArr);
        if (this.f91795a && (suite instanceof ParentRunner)) {
            ((ParentRunner) suite).setScheduler(new a());
        }
        return suite;
    }
}
