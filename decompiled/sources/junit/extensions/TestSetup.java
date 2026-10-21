package junit.extensions;

import junit.framework.Protectable;
import junit.framework.Test;
import junit.framework.TestResult;

/* JADX INFO: loaded from: classes12.dex */
public class TestSetup extends TestDecorator {

    public class a implements Protectable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TestResult f79113a;

        public a(TestResult testResult) {
            this.f79113a = testResult;
        }

        @Override // junit.framework.Protectable
        public final void protect() throws Exception {
            TestSetup testSetup = TestSetup.this;
            testSetup.setUp();
            testSetup.basicRun(this.f79113a);
            testSetup.tearDown();
        }
    }

    public TestSetup(Test test) {
        super(test);
    }

    @Override // junit.extensions.TestDecorator, junit.framework.Test
    public void run(TestResult testResult) {
        testResult.runProtected(this, new a(testResult));
    }

    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }
}
