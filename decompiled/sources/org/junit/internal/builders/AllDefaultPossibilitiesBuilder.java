package org.junit.internal.builders;

import java.util.Arrays;
import java.util.Iterator;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class AllDefaultPossibilitiesBuilder extends RunnerBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91852b;

    public AllDefaultPossibilitiesBuilder() {
        this.f91852b = true;
    }

    public AnnotatedBuilder annotatedBuilder() {
        return new AnnotatedBuilder(this);
    }

    public IgnoredBuilder ignoredBuilder() {
        return new IgnoredBuilder();
    }

    public JUnit3Builder junit3Builder() {
        return new JUnit3Builder();
    }

    public JUnit4Builder junit4Builder() {
        return new JUnit4Builder();
    }

    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> cls) throws Throwable {
        Iterator it = Arrays.asList(ignoredBuilder(), annotatedBuilder(), suiteMethodBuilder(), junit3Builder(), junit4Builder()).iterator();
        while (it.hasNext()) {
            Runner runnerSafeRunnerForClass = ((RunnerBuilder) it.next()).safeRunnerForClass(cls);
            if (runnerSafeRunnerForClass != null) {
                return runnerSafeRunnerForClass;
            }
        }
        return null;
    }

    public RunnerBuilder suiteMethodBuilder() {
        return this.f91852b ? new SuiteMethodBuilder() : new NullBuilder();
    }

    @Deprecated
    public AllDefaultPossibilitiesBuilder(boolean z10) {
        this.f91852b = z10;
    }
}
