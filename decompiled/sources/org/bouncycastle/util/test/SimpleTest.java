package org.bouncycastle.util.test;

import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SimpleTest implements Test {
    public static void runTest(Test test) {
        runTest(test, System.out);
    }

    public static void runTests(Test[] testArr) {
        runTests(testArr, System.out);
    }

    public boolean areEqual(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        return Arrays.areEqual(bArr, i10, i11, bArr2, i12, i13);
    }

    public void fail(String str) {
        throw new TestFailedException(SimpleTestResult.failed(this, str));
    }

    @Override // org.bouncycastle.util.test.Test
    public abstract String getName();

    public void isEquals(int i10, int i11) {
        if (i10 != i11) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    public void isTrue(String str, boolean z10) {
        if (!z10) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    @Override // org.bouncycastle.util.test.Test
    public TestResult perform() {
        try {
            performTest();
            return SimpleTestResult.successful(this, "Okay");
        } catch (TestFailedException e5) {
            return e5.getResult();
        } catch (Exception e7) {
            return SimpleTestResult.failed(this, "Exception: " + e7, e7);
        }
    }

    public abstract void performTest() throws Exception;

    public static void runTest(Test test, PrintStream printStream) {
        TestResult testResultPerform = test.perform();
        if (testResultPerform.getException() != null) {
            testResultPerform.getException().printStackTrace(printStream);
        }
        printStream.println(testResultPerform);
    }

    public static void runTests(Test[] testArr, PrintStream printStream) {
        Vector vector = new Vector();
        for (int i10 = 0; i10 != testArr.length; i10++) {
            TestResult testResultPerform = testArr[i10].perform();
            if (!testResultPerform.isSuccessful()) {
                vector.addElement(testResultPerform);
            }
            if (testResultPerform.getException() != null) {
                testResultPerform.getException().printStackTrace(printStream);
            }
            printStream.println(testResultPerform);
        }
        printStream.println("-----");
        if (vector.isEmpty()) {
            printStream.println("All tests successful.");
            return;
        }
        printStream.println("Completed with " + vector.size() + " FAILURES:");
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            System.out.println("=>  " + ((TestResult) enumerationElements.nextElement()));
        }
    }

    public boolean areEqual(byte[] bArr, byte[] bArr2) {
        return Arrays.areEqual(bArr, bArr2);
    }

    public void fail(String str, Object obj, Object obj2) {
        throw new TestFailedException(SimpleTestResult.failed(this, str, obj, obj2));
    }

    public void isEquals(long j10, long j11) {
        if (j10 != j11) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    public void isTrue(boolean z10) {
        if (!z10) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    public boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!areEqual(bArr[i10], bArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    public void fail(String str, Throwable th2) {
        throw new TestFailedException(SimpleTestResult.failed(this, str, th2));
    }

    public void isEquals(Object obj, Object obj2) {
        if (!obj.equals(obj2)) {
            throw new TestFailedException(SimpleTestResult.failed(this, "no message"));
        }
    }

    public void isEquals(String str, long j10, long j11) {
        if (j10 != j11) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public void isEquals(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
        if (obj2 == null) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
        if (!obj.equals(obj2)) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public void isEquals(String str, boolean z10, boolean z11) {
        if (z10 != z11) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }
}
