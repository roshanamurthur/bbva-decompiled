package junit.textui;

import c2.b;
import java.io.PrintStream;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.runner.BaseTestRunner;
import junit.runner.Version;

/* JADX INFO: loaded from: classes12.dex */
public class TestRunner extends BaseTestRunner {
    public static final int EXCEPTION_EXIT = 2;
    public static final int FAILURE_EXIT = 1;
    public static final int SUCCESS_EXIT = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ResultPrinter f79141e;

    public TestRunner() {
        this(System.out);
    }

    public static void main(String[] strArr) {
        try {
            if (!new TestRunner().start(strArr).wasSuccessful()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e5) {
            System.err.println(e5.getMessage());
            System.exit(2);
        }
    }

    public static void run(Class<? extends TestCase> cls) {
        run(new TestSuite(cls));
    }

    public static void runAndWait(Test test) {
        new TestRunner().doRun(test, true);
    }

    public TestResult createTestResult() {
        return new TestResult();
    }

    public TestResult doRun(Test test) {
        return doRun(test, false);
    }

    public void pause(boolean z10) {
        if (z10) {
            ResultPrinter resultPrinter = this.f79141e;
            resultPrinter.getWriter().println();
            resultPrinter.getWriter().println("<RETURN> to continue");
            try {
                System.in.read();
            } catch (Exception unused) {
            }
        }
    }

    @Override // junit.runner.BaseTestRunner
    public void runFailed(String str) {
        System.err.println(str);
        System.exit(1);
    }

    public TestResult runSingleMethod(String str, String str2, boolean z10) throws Exception {
        return doRun(TestSuite.createTest(loadSuiteClass(str).asSubclass(TestCase.class), str2), z10);
    }

    public void setPrinter(ResultPrinter resultPrinter) {
        this.f79141e = resultPrinter;
    }

    public TestResult start(String[] strArr) throws Exception {
        String strExtractClassName = "";
        String strSubstring = strExtractClassName;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < strArr.length) {
            if (strArr[i10].equals("-wait")) {
                z10 = true;
            } else if (strArr[i10].equals("-c")) {
                i10++;
                strExtractClassName = extractClassName(strArr[i10]);
            } else if (strArr[i10].equals("-m")) {
                i10++;
                String str = strArr[i10];
                int iLastIndexOf = str.lastIndexOf(46);
                String strSubstring2 = str.substring(0, iLastIndexOf);
                strSubstring = str.substring(iLastIndexOf + 1);
                strExtractClassName = strSubstring2;
            } else if (strArr[i10].equals("-v")) {
                System.err.println("JUnit " + Version.id() + " by Kent Beck and Erich Gamma");
            } else {
                strExtractClassName = strArr[i10];
            }
            i10++;
        }
        if (strExtractClassName.equals("")) {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
        try {
            return !strSubstring.equals("") ? runSingleMethod(strExtractClassName, strSubstring, z10) : doRun(getTest(strExtractClassName), z10);
        } catch (Exception e5) {
            throw new Exception(b.d("Could not create and run test suite: ", e5));
        }
    }

    public TestRunner(PrintStream printStream) {
        this(new ResultPrinter(printStream));
    }

    public static TestResult run(Test test) {
        return new TestRunner().doRun(test);
    }

    public TestResult doRun(Test test, boolean z10) {
        TestResult testResultCreateTestResult = createTestResult();
        testResultCreateTestResult.addListener(this.f79141e);
        long jCurrentTimeMillis = System.currentTimeMillis();
        test.run(testResultCreateTestResult);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        ResultPrinter resultPrinter = this.f79141e;
        synchronized (resultPrinter) {
            resultPrinter.printHeader(jCurrentTimeMillis2);
            resultPrinter.printErrors(testResultCreateTestResult);
            resultPrinter.printFailures(testResultCreateTestResult);
            resultPrinter.printFooter(testResultCreateTestResult);
        }
        pause(z10);
        return testResultCreateTestResult;
    }

    public TestRunner(ResultPrinter resultPrinter) {
        this.f79141e = resultPrinter;
    }

    @Override // junit.runner.BaseTestRunner
    public void testEnded(String str) {
    }

    @Override // junit.runner.BaseTestRunner
    public void testStarted(String str) {
    }

    @Override // junit.runner.BaseTestRunner
    public void testFailed(int i10, Test test, Throwable th2) {
    }
}
