package org.junit.rules;

import org.junit.runner.Description;

/* JADX INFO: loaded from: classes13.dex */
public class TestName extends TestWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f91947a;

    public String getMethodName() {
        return this.f91947a;
    }

    @Override // org.junit.rules.TestWatcher
    public void starting(Description description) {
        this.f91947a = description.getMethodName();
    }
}
