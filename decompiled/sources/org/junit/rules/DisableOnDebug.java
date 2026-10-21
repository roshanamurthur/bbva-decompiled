package org.junit.rules;

import java.util.List;
import org.junit.internal.management.ManagementFactory;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class DisableOnDebug implements TestRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TestRule f91925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91926b;

    public DisableOnDebug() {
        throw null;
    }

    public DisableOnDebug(TestRule testRule) {
        boolean z10;
        List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        this.f91925a = testRule;
        for (String str : inputArguments) {
            if ("-Xdebug".equals(str) || str.startsWith("-agentlib:jdwp")) {
                z10 = true;
                this.f91926b = z10;
            }
        }
        z10 = false;
        this.f91926b = z10;
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return this.f91926b ? statement : this.f91925a.apply(statement, description);
    }

    public boolean isDebugging() {
        return this.f91926b;
    }
}
