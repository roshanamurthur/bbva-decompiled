package org.junit.internal.runners.statements;

import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class RunBefores extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Statement f91922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f91923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<FrameworkMethod> f91924c;

    public RunBefores(Statement statement, List<FrameworkMethod> list, Object obj) {
        this.f91922a = statement;
        this.f91924c = list;
        this.f91923b = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        Iterator<FrameworkMethod> it = this.f91924c.iterator();
        while (it.hasNext()) {
            invokeMethod(it.next());
        }
        this.f91922a.evaluate();
    }

    public void invokeMethod(FrameworkMethod frameworkMethod) throws Throwable {
        frameworkMethod.invokeExplosively(this.f91923b, new Object[0]);
    }
}
