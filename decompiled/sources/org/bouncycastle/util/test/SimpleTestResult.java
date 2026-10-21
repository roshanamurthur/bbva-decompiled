package org.bouncycastle.util.test;

import androidx.camera.core.impl.utils.c;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes13.dex */
public class SimpleTestResult implements TestResult {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f91675d = Strings.lineSeparator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f91676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f91678c;

    public SimpleTestResult(boolean z10, String str) {
        this.f91676a = z10;
        this.f91677b = str;
    }

    public static TestResult failed(Test test, String str) {
        return new SimpleTestResult(false, test.getName() + ": " + str);
    }

    public static String failedMessage(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(" failing ");
        stringBuffer.append(str2);
        String str5 = f91675d;
        stringBuffer.append(str5);
        stringBuffer.append("    expected: ");
        stringBuffer.append(str3);
        stringBuffer.append(str5);
        stringBuffer.append("    got     : ");
        stringBuffer.append(str4);
        return stringBuffer.toString();
    }

    public static TestResult successful(Test test, String str) {
        return new SimpleTestResult(true, test.getName() + ": " + str);
    }

    @Override // org.bouncycastle.util.test.TestResult
    public Throwable getException() {
        return this.f91678c;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public boolean isSuccessful() {
        return this.f91676a;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public String toString() {
        return this.f91677b;
    }

    public SimpleTestResult(boolean z10, String str, Throwable th2) {
        this.f91676a = z10;
        this.f91677b = str;
        this.f91678c = th2;
    }

    public static TestResult failed(Test test, String str, Object obj, Object obj2) {
        StringBuilder sbD = c.d(str);
        String str2 = f91675d;
        sbD.append(str2);
        sbD.append("Expected: ");
        sbD.append(obj);
        sbD.append(str2);
        sbD.append("Found   : ");
        sbD.append(obj2);
        return failed(test, sbD.toString());
    }

    public static TestResult failed(Test test, String str, Throwable th2) {
        return new SimpleTestResult(false, test.getName() + ": " + str, th2);
    }
}
