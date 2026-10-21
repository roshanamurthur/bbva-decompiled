package org.junit.runner;

import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class Computer {

    public class a extends RunnerBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RunnerBuilder f91963b;

        public a(RunnerBuilder runnerBuilder) {
            this.f91963b = runnerBuilder;
        }

        @Override // org.junit.runners.model.RunnerBuilder
        public final Runner runnerForClass(Class<?> cls) throws Throwable {
            return Computer.this.getRunner(this.f91963b, cls);
        }
    }

    public class b extends Suite {
        @Override // org.junit.runners.ParentRunner
        public final String getName() {
            return "classes";
        }
    }

    public static Computer serial() {
        return new Computer();
    }

    public Runner getRunner(RunnerBuilder runnerBuilder, Class<?> cls) throws Throwable {
        return runnerBuilder.runnerForClass(cls);
    }

    public Runner getSuite(RunnerBuilder runnerBuilder, Class<?>[] clsArr) throws InitializationError {
        return new b(new a(runnerBuilder), clsArr);
    }
}
