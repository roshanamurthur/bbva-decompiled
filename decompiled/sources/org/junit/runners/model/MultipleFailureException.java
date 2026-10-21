package org.junit.runners.model;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.TestCouldNotBeSkippedException;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.Throwables;

/* JADX INFO: loaded from: classes13.dex */
public class MultipleFailureException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f92048p0;

    public MultipleFailureException(List<Throwable> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List of Throwables must not be empty");
        }
        this.f92048p0 = new ArrayList(list.size());
        for (Throwable testCouldNotBeSkippedException : list) {
            if (testCouldNotBeSkippedException instanceof AssumptionViolatedException) {
                testCouldNotBeSkippedException = new TestCouldNotBeSkippedException((AssumptionViolatedException) testCouldNotBeSkippedException);
            }
            this.f92048p0.add(testCouldNotBeSkippedException);
        }
    }

    public static void assertEmpty(List<Throwable> list) throws Exception {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new org.junit.internal.runners.model.MultipleFailureException(list);
        }
        throw Throwables.rethrowAsException(list.get(0));
    }

    public List<Throwable> getFailures() {
        return Collections.unmodifiableList(this.f92048p0);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList<Throwable> arrayList = this.f92048p0;
        StringBuilder sb2 = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(arrayList.size())));
        for (Throwable th2 : arrayList) {
            sb2.append(String.format("%n  %s(%s)", th2.getClass().getName(), th2.getMessage()));
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        Iterator it = this.f92048p0.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Iterator it = this.f92048p0.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        Iterator it = this.f92048p0.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).printStackTrace(printWriter);
        }
    }
}
