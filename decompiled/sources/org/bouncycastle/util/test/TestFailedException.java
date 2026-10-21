package org.bouncycastle.util.test;

/* JADX INFO: loaded from: classes13.dex */
public class TestFailedException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TestResult f91679p0;

    public TestFailedException(TestResult testResult) {
        this.f91679p0 = testResult;
    }

    public TestResult getResult() {
        return this.f91679p0;
    }
}
