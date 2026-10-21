package org.junit.experimental.results;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes13.dex */
public class PrintableResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Result f91811a;

    public PrintableResult(List<Failure> list) {
        Result result = new Result();
        RunListener runListenerCreateListener = result.createListener();
        Iterator<Failure> it = list.iterator();
        while (it.hasNext()) {
            try {
                runListenerCreateListener.testFailure(it.next());
            } catch (Exception unused) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        this(result);
    }

    public static PrintableResult testResult(Class<?> cls) {
        return testResult(Request.aClass(cls));
    }

    public int failureCount() {
        return this.f91811a.getFailures().size();
    }

    public List<Failure> failures() {
        return this.f91811a.getFailures();
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new TextListener(new PrintStream(byteArrayOutputStream)).testRunFinished(this.f91811a);
        return byteArrayOutputStream.toString();
    }

    public static PrintableResult testResult(Request request) {
        return new PrintableResult(new JUnitCore().run(request));
    }

    public PrintableResult(Result result) {
        this.f91811a = result;
    }
}
