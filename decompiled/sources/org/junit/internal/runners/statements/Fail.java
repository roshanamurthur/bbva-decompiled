package org.junit.internal.runners.statements;

import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class Fail extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f91907a;

    public Fail(Throwable th2) {
        this.f91907a = th2;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        throw this.f91907a;
    }
}
