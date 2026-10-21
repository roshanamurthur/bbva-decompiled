package org.junit;

/* JADX INFO: loaded from: classes13.dex */
public class TestCouldNotBeSkippedException extends RuntimeException {
    public TestCouldNotBeSkippedException(org.junit.internal.AssumptionViolatedException assumptionViolatedException) {
        super("Test could not be skipped due to other failures", assumptionViolatedException);
    }
}
