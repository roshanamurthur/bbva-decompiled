package junit.textui;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.mypinpad.tsdk.isolation.z1;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestFailure;
import junit.framework.TestListener;
import junit.framework.TestResult;
import junit.runner.BaseTestRunner;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class ResultPrinter implements TestListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrintStream f79139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79140b = 0;

    public ResultPrinter(PrintStream printStream) {
        this.f79139a = printStream;
    }

    @Override // junit.framework.TestListener
    public void addError(Test test, Throwable th2) {
        getWriter().print(ExifInterface.LONGITUDE_EAST);
    }

    @Override // junit.framework.TestListener
    public void addFailure(Test test, AssertionFailedError assertionFailedError) {
        getWriter().print("F");
    }

    public String elapsedTimeAsString(long j10) {
        return NumberFormat.getInstance().format(j10 / 1000.0d);
    }

    public PrintStream getWriter() {
        return this.f79139a;
    }

    public void printDefect(TestFailure testFailure, int i10) {
        printDefectHeader(testFailure, i10);
        printDefectTrace(testFailure);
    }

    public void printDefectHeader(TestFailure testFailure, int i10) {
        getWriter().print(i10 + ") " + testFailure.failedTest());
    }

    public void printDefectTrace(TestFailure testFailure) {
        getWriter().print(BaseTestRunner.getFilteredTrace(testFailure.trace()));
    }

    public void printDefects(Enumeration<TestFailure> enumeration, int i10, String str) {
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            getWriter().println(z1.c("There was ", i10, " ", str, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER));
        } else {
            getWriter().println(z1.c("There were ", i10, " ", str, "s:"));
        }
        int i11 = 1;
        while (enumeration.hasMoreElements()) {
            printDefect(enumeration.nextElement(), i11);
            i11++;
        }
    }

    public void printErrors(TestResult testResult) {
        printDefects(testResult.errors(), testResult.errorCount(), "error");
    }

    public void printFailures(TestResult testResult) {
        printDefects(testResult.failures(), testResult.failureCount(), "failure");
    }

    public void printFooter(TestResult testResult) {
        if (testResult.wasSuccessful()) {
            getWriter().println();
            getWriter().print("OK");
            PrintStream writer = getWriter();
            StringBuilder sb2 = new StringBuilder(" (");
            sb2.append(testResult.runCount());
            sb2.append(" test");
            sb2.append(testResult.runCount() == 1 ? "" : "s");
            sb2.append(")");
            writer.println(sb2.toString());
        } else {
            getWriter().println();
            getWriter().println("FAILURES!!!");
            getWriter().println("Tests run: " + testResult.runCount() + ",  Failures: " + testResult.failureCount() + ",  Errors: " + testResult.errorCount());
        }
        getWriter().println();
    }

    public void printHeader(long j10) {
        getWriter().println();
        getWriter().println("Time: " + elapsedTimeAsString(j10));
    }

    @Override // junit.framework.TestListener
    public void startTest(Test test) {
        getWriter().print(Constant.DOT_STRING);
        int i10 = this.f79140b;
        this.f79140b = i10 + 1;
        if (i10 >= 40) {
            getWriter().println();
            this.f79140b = 0;
        }
    }

    @Override // junit.framework.TestListener
    public void endTest(Test test) {
    }
}
