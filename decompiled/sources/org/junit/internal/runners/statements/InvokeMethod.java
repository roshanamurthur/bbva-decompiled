package org.junit.internal.runners.statements;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class InvokeMethod extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameworkMethod f91917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f91918b;

    public InvokeMethod(FrameworkMethod frameworkMethod, Object obj) {
        this.f91917a = frameworkMethod;
        this.f91918b = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        this.f91917a.invokeExplosively(this.f91918b, new Object[0]);
    }
}
