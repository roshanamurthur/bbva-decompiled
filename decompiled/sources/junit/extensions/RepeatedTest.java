package junit.extensions;

import ad.d;
import junit.framework.Test;
import junit.framework.TestResult;

/* JADX INFO: loaded from: classes12.dex */
public class RepeatedTest extends TestDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79112a;

    public RepeatedTest(Test test, int i10) {
        super(test);
        if (i10 < 0) {
            throw new IllegalArgumentException("Repetition count must be >= 0");
        }
        this.f79112a = i10;
    }

    @Override // junit.extensions.TestDecorator, junit.framework.Test
    public int countTestCases() {
        return super.countTestCases() * this.f79112a;
    }

    @Override // junit.extensions.TestDecorator, junit.framework.Test
    public void run(TestResult testResult) {
        for (int i10 = 0; i10 < this.f79112a && !testResult.shouldStop(); i10++) {
            super.run(testResult);
        }
    }

    @Override // junit.extensions.TestDecorator
    public String toString() {
        return d.f(new StringBuilder(), super.toString(), "(repeated)");
    }
}
