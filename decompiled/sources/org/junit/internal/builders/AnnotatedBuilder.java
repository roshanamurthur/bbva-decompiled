package org.junit.internal.builders;

import java.lang.reflect.Modifier;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class AnnotatedBuilder extends RunnerBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnerBuilder f91853b;

    public AnnotatedBuilder(RunnerBuilder runnerBuilder) {
        this.f91853b = runnerBuilder;
    }

    public Runner buildRunner(Class<? extends Runner> cls, Class<?> cls2) throws Exception {
        try {
            return cls.getConstructor(Class.class).newInstance(cls2);
        } catch (NoSuchMethodException unused) {
            try {
                return cls.getConstructor(Class.class, RunnerBuilder.class).newInstance(cls2, this.f91853b);
            } catch (NoSuchMethodException unused2) {
                String simpleName = cls.getSimpleName();
                throw new InitializationError(String.format("Custom runner class %s should have a public constructor with signature %s(Class testClass)", simpleName, simpleName));
            }
        }
    }

    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> cls) throws Exception {
        Class<?> enclosingClass = cls;
        while (enclosingClass != null) {
            RunWith runWith = (RunWith) enclosingClass.getAnnotation(RunWith.class);
            if (runWith != null) {
                return buildRunner(runWith.value(), cls);
            }
            enclosingClass = (!enclosingClass.isMemberClass() || Modifier.isStatic(enclosingClass.getModifiers())) ? null : enclosingClass.getEnclosingClass();
        }
        return null;
    }
}
