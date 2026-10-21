package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class JUnit4ClassRunner extends Runner implements Filterable, Sortable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Method> f91881a = getTestMethods();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TestClass f91882b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RunNotifier f91883p0;

        public a(RunNotifier runNotifier) {
            this.f91883p0 = runNotifier;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JUnit4ClassRunner.this.runMethods(this.f91883p0);
        }
    }

    public class b implements Comparator<Method> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Sorter f91885p0;

        public b(Sorter sorter) {
            this.f91885p0 = sorter;
        }

        @Override // java.util.Comparator
        public final int compare(Method method, Method method2) {
            JUnit4ClassRunner jUnit4ClassRunner = JUnit4ClassRunner.this;
            return this.f91885p0.compare(jUnit4ClassRunner.methodDescription(method), jUnit4ClassRunner.methodDescription(method2));
        }
    }

    public JUnit4ClassRunner(Class<?> cls) throws InitializationError {
        this.f91882b = new TestClass(cls);
        validate();
    }

    public Annotation[] classAnnotations() {
        return this.f91882b.getJavaClass().getAnnotations();
    }

    public Object createTest() throws Exception {
        return getTestClass().getConstructor().newInstance(new Object[0]);
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        List<Method> list = this.f91881a;
        Iterator<Method> it = list.iterator();
        while (it.hasNext()) {
            if (!filter.shouldRun(methodDescription(it.next()))) {
                it.remove();
            }
        }
        if (list.isEmpty()) {
            throw new NoTestsRemainException();
        }
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(getName(), classAnnotations());
        Iterator<Method> it = this.f91881a.iterator();
        while (it.hasNext()) {
            descriptionCreateSuiteDescription.addChild(methodDescription(it.next()));
        }
        return descriptionCreateSuiteDescription;
    }

    public String getName() {
        return getTestClass().getName();
    }

    public TestClass getTestClass() {
        return this.f91882b;
    }

    public List<Method> getTestMethods() {
        return this.f91882b.getTestMethods();
    }

    public void invokeTestMethod(Method method, RunNotifier runNotifier) {
        Description descriptionMethodDescription = methodDescription(method);
        try {
            new MethodRoadie(createTest(), wrapMethod(method), runNotifier, descriptionMethodDescription).run();
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            runNotifier.fireTestStarted(descriptionMethodDescription);
            runNotifier.fireTestFailure(new Failure(descriptionMethodDescription, cause));
            runNotifier.fireTestFinished(descriptionMethodDescription);
        } catch (Exception e7) {
            runNotifier.fireTestStarted(descriptionMethodDescription);
            runNotifier.fireTestFailure(new Failure(descriptionMethodDescription, e7));
            runNotifier.fireTestFinished(descriptionMethodDescription);
        }
    }

    public Description methodDescription(Method method) {
        return Description.createTestDescription(getTestClass().getJavaClass(), testName(method), testAnnotations(method));
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        new ClassRoadie(runNotifier, this.f91882b, getDescription(), new a(runNotifier)).runProtected();
    }

    public void runMethods(RunNotifier runNotifier) {
        Iterator<Method> it = this.f91881a.iterator();
        while (it.hasNext()) {
            invokeTestMethod(it.next(), runNotifier);
        }
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        Collections.sort(this.f91881a, new b(sorter));
    }

    public Annotation[] testAnnotations(Method method) {
        return method.getAnnotations();
    }

    public String testName(Method method) {
        return method.getName();
    }

    public void validate() throws InitializationError {
        MethodValidator methodValidator = new MethodValidator(this.f91882b);
        methodValidator.validateMethodsForDefaultRunner();
        methodValidator.assertValid();
    }

    public TestMethod wrapMethod(Method method) {
        return new TestMethod(method, this.f91882b);
    }
}
