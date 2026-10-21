package org.junit.runners.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Description;
import org.junit.runner.OrderWith;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Ordering;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RunnerBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f92049a = new HashSet();

    public abstract Runner runnerForClass(Class<?> cls) throws Throwable;

    public List<Runner> runners(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        HashSet hashSet = this.f92049a;
        if (!hashSet.add(cls)) {
            throw new InitializationError(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : clsArr) {
                Runner runnerSafeRunnerForClass = safeRunnerForClass(cls2);
                if (runnerSafeRunnerForClass != null) {
                    arrayList.add(runnerSafeRunnerForClass);
                }
            }
            hashSet.remove(cls);
            return arrayList;
        } catch (Throwable th2) {
            hashSet.remove(cls);
            throw th2;
        }
    }

    public Runner safeRunnerForClass(Class<?> cls) {
        try {
            Runner runnerRunnerForClass = runnerForClass(cls);
            if (runnerRunnerForClass != null) {
                Description description = runnerRunnerForClass.getDescription();
                OrderWith orderWith = (OrderWith) description.getAnnotation(OrderWith.class);
                if (orderWith != null) {
                    Ordering.definedBy(orderWith.value(), description).apply(runnerRunnerForClass);
                }
            }
            return runnerRunnerForClass;
        } catch (Throwable th2) {
            return new ErrorReportingRunner(cls, th2);
        }
    }

    public List<Runner> runners(Class<?> cls, List<Class<?>> list) throws InitializationError {
        return runners(cls, (Class<?>[]) list.toArray(new Class[0]));
    }
}
