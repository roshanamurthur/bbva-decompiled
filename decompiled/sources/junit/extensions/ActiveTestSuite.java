package junit.extensions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/* JADX INFO: loaded from: classes12.dex */
public class ActiveTestSuite extends TestSuite {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f79108c;

    public class a extends Thread {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Test f79109p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TestResult f79110q0;

        public a(Test test, TestResult testResult) {
            this.f79109p0 = test;
            this.f79110q0 = testResult;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ActiveTestSuite activeTestSuite = ActiveTestSuite.this;
            try {
                this.f79109p0.run(this.f79110q0);
            } finally {
                activeTestSuite.runFinished();
            }
        }
    }

    public ActiveTestSuite() {
    }

    @Override // junit.framework.TestSuite, junit.framework.Test
    public void run(TestResult testResult) {
        this.f79108c = 0;
        super.run(testResult);
        synchronized (this) {
            while (this.f79108c < testCount()) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public synchronized void runFinished() {
        this.f79108c++;
        notifyAll();
    }

    @Override // junit.framework.TestSuite
    public void runTest(Test test, TestResult testResult) {
        new a(test, testResult).start();
    }

    public ActiveTestSuite(Class<? extends TestCase> cls) {
        super(cls);
    }

    public ActiveTestSuite(String str) {
        super(str);
    }

    public ActiveTestSuite(Class<? extends TestCase> cls, String str) {
        super(cls, str);
    }
}
