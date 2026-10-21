package org.junit.internal;

import androidx.camera.core.processing.f;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes13.dex */
public class TextListener extends RunListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrintStream f91847a;

    public TextListener(JUnitSystem jUnitSystem) {
        this(jUnitSystem.out());
    }

    public String elapsedTimeAsString(long j10) {
        return NumberFormat.getInstance().format(j10 / 1000.0d);
    }

    public void printFailure(Failure failure, String str) {
        StringBuilder sbE = f.e(str, ") ");
        sbE.append(failure.getTestHeader());
        String string = sbE.toString();
        PrintStream printStream = this.f91847a;
        printStream.println(string);
        printStream.print(failure.getTrimmedTrace());
    }

    public void printFailures(Result result) {
        List<Failure> failures = result.getFailures();
        if (failures.isEmpty()) {
            return;
        }
        int size = failures.size();
        PrintStream printStream = this.f91847a;
        int i10 = 1;
        if (size == 1) {
            printStream.println("There was " + failures.size() + " failure:");
        } else {
            printStream.println("There were " + failures.size() + " failures:");
        }
        Iterator<Failure> it = failures.iterator();
        while (it.hasNext()) {
            printFailure(it.next(), "" + i10);
            i10++;
        }
    }

    public void printFooter(Result result) {
        boolean zWasSuccessful = result.wasSuccessful();
        PrintStream printStream = this.f91847a;
        if (zWasSuccessful) {
            printStream.println();
            printStream.print("OK");
            StringBuilder sb2 = new StringBuilder(" (");
            sb2.append(result.getRunCount());
            sb2.append(" test");
            sb2.append(result.getRunCount() == 1 ? "" : "s");
            sb2.append(")");
            printStream.println(sb2.toString());
        } else {
            printStream.println();
            printStream.println("FAILURES!!!");
            printStream.println("Tests run: " + result.getRunCount() + ",  Failures: " + result.getFailureCount());
        }
        printStream.println();
    }

    public void printHeader(long j10) {
        PrintStream printStream = this.f91847a;
        printStream.println();
        printStream.println("Time: " + elapsedTimeAsString(j10));
    }

    @Override // org.junit.runner.notification.RunListener
    public void testFailure(Failure failure) {
        this.f91847a.append('E');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testIgnored(Description description) {
        this.f91847a.append('I');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testRunFinished(Result result) {
        printHeader(result.getRunTime());
        printFailures(result);
        printFooter(result);
    }

    @Override // org.junit.runner.notification.RunListener
    public void testStarted(Description description) {
        this.f91847a.append('.');
    }

    public TextListener(PrintStream printStream) {
        this.f91847a = printStream;
    }
}
