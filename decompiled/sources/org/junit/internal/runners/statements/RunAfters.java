package org.junit.internal.runners.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class RunAfters extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Statement f91919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f91920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<FrameworkMethod> f91921c;

    public RunAfters(Statement statement, List<FrameworkMethod> list, Object obj) {
        this.f91919a = statement;
        this.f91921c = list;
        this.f91920b = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Exception {
        List<FrameworkMethod> list = this.f91921c;
        ArrayList arrayList = new ArrayList();
        try {
            this.f91919a.evaluate();
            Iterator<FrameworkMethod> it = list.iterator();
            while (it.hasNext()) {
                try {
                    invokeMethod(it.next());
                } catch (Throwable th2) {
                    arrayList.add(th2);
                }
            }
        } catch (Throwable th3) {
            try {
                arrayList.add(th3);
                Iterator<FrameworkMethod> it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        invokeMethod(it2.next());
                    } catch (Throwable th4) {
                        arrayList.add(th4);
                    }
                }
            } catch (Throwable th5) {
                Iterator<FrameworkMethod> it3 = list.iterator();
                while (it3.hasNext()) {
                    try {
                        invokeMethod(it3.next());
                    } catch (Throwable th6) {
                        arrayList.add(th6);
                    }
                }
                throw th5;
            }
        }
        MultipleFailureException.assertEmpty(arrayList);
    }

    public void invokeMethod(FrameworkMethod frameworkMethod) throws Throwable {
        frameworkMethod.invokeExplosively(this.f91920b, new Object[0]);
    }
}
