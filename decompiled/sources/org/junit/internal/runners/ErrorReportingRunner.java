package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InvalidTestClassError;

/* JADX INFO: loaded from: classes13.dex */
public class ErrorReportingRunner extends Runner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Throwable> f91876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91877b;

    public ErrorReportingRunner(Class<?> cls, Throwable th2) {
        this(th2, (Class<?>[]) new Class[]{cls});
    }

    public static List a(Throwable th2) {
        if (th2 instanceof InvocationTargetException) {
            return a(th2.getCause());
        }
        if (th2 instanceof InvalidTestClassError) {
            return Collections.singletonList(th2);
        }
        if (th2 instanceof org.junit.runners.model.InitializationError) {
            return ((org.junit.runners.model.InitializationError) th2).getCauses();
        }
        return th2 instanceof InitializationError ? ((InitializationError) th2).getCauses() : Collections.singletonList(th2);
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        String str = this.f91877b;
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(str, new Annotation[0]);
        for (Throwable th2 : this.f91876a) {
            descriptionCreateSuiteDescription.addChild(Description.createTestDescription(str, "initializationError", new Annotation[0]));
        }
        return descriptionCreateSuiteDescription;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        for (Throwable th2 : this.f91876a) {
            Description descriptionCreateTestDescription = Description.createTestDescription(this.f91877b, "initializationError", new Annotation[0]);
            runNotifier.fireTestStarted(descriptionCreateTestDescription);
            runNotifier.fireTestFailure(new Failure(descriptionCreateTestDescription, th2));
            runNotifier.fireTestFinished(descriptionCreateTestDescription);
        }
    }

    public ErrorReportingRunner(Throwable th2, Class<?>... clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            throw new NullPointerException("Test classes cannot be null or empty");
        }
        for (Class<?> cls : clsArr) {
            if (cls == null) {
                throw new NullPointerException("Test class cannot be null");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (Class<?> cls2 : clsArr) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(cls2.getName());
        }
        this.f91877b = sb2.toString();
        this.f91876a = a(th2);
    }
}
