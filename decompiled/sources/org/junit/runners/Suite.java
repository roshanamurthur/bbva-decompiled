package org.junit.runners;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class Suite extends ParentRunner<Runner> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Runner> f92033f;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SuiteClasses {
        Class<?>[] value();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Suite(Class<?> cls, RunnerBuilder runnerBuilder) throws InitializationError {
        SuiteClasses suiteClasses = (SuiteClasses) cls.getAnnotation(SuiteClasses.class);
        if (suiteClasses == null) {
            throw new InitializationError(String.format("class '%s' must have a SuiteClasses annotation", cls.getName()));
        }
        this(runnerBuilder, cls, suiteClasses.value());
    }

    public static Runner emptySuite() {
        try {
            return new Suite((Class<?>) null, (Class<?>[]) new Class[0]);
        } catch (InitializationError unused) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    @Override // org.junit.runners.ParentRunner
    public List<Runner> getChildren() {
        return this.f92033f;
    }

    @Override // org.junit.runners.ParentRunner
    public Description describeChild(Runner runner) {
        return runner.getDescription();
    }

    @Override // org.junit.runners.ParentRunner
    public void runChild(Runner runner, RunNotifier runNotifier) {
        runner.run(runNotifier);
    }

    public Suite(RunnerBuilder runnerBuilder, Class<?>[] clsArr) throws InitializationError {
        this((Class<?>) null, runnerBuilder.runners((Class<?>) null, clsArr));
    }

    public Suite(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        this(new AllDefaultPossibilitiesBuilder(), cls, clsArr);
    }

    public Suite(RunnerBuilder runnerBuilder, Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        this(cls, runnerBuilder.runners(cls, clsArr));
    }

    public Suite(Class<?> cls, List<Runner> list) throws InitializationError {
        super(cls);
        this.f92033f = Collections.unmodifiableList(list);
    }
}
