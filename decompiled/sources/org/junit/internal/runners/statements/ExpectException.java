package org.junit.internal.runners.statements;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class ExpectException extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Statement f91905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<? extends Throwable> f91906b;

    public ExpectException(Statement statement, Class<? extends Throwable> cls) {
        this.f91905a = statement;
        this.f91906b = cls;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Exception {
        Class<? extends Throwable> cls = this.f91906b;
        try {
            this.f91905a.evaluate();
            throw new AssertionError("Expected exception: ".concat(cls.getName()));
        } catch (AssumptionViolatedException e5) {
            if (!cls.isAssignableFrom(e5.getClass())) {
                throw e5;
            }
        } catch (Throwable th2) {
            if (cls.isAssignableFrom(th2.getClass())) {
                return;
            }
            throw new Exception("Unexpected exception, expected<" + cls.getName() + "> but was<" + th2.getClass().getName() + ">", th2);
        }
    }
}
