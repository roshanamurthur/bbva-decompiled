package org.junit.internal.builders;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes13.dex */
public class IgnoredClassRunner extends Runner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f91854a;

    public IgnoredClassRunner(Class<?> cls) {
        this.f91854a = cls;
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        return Description.createSuiteDescription(this.f91854a);
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        runNotifier.fireTestIgnored(getDescription());
    }
}
