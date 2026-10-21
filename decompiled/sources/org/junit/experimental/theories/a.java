package org.junit.experimental.theories;

import org.junit.Assume;
import org.junit.experimental.theories.internal.Assignments;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: compiled from: Theories.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Assignments f91829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameworkMethod f91830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Theories.TheoryAnchor f91832d;

    public a(Object obj, Theories.TheoryAnchor theoryAnchor, Assignments assignments, FrameworkMethod frameworkMethod) {
        this.f91832d = theoryAnchor;
        this.f91829a = assignments;
        this.f91830b = frameworkMethod;
        this.f91831c = obj;
    }

    @Override // org.junit.runners.model.Statement
    public final void evaluate() throws Throwable {
        Object[] methodArguments = this.f91829a.getMethodArguments();
        if (!Theories.TheoryAnchor.a(this.f91832d)) {
            Assume.assumeNotNull(methodArguments);
        }
        this.f91830b.invokeExplosively(this.f91831c, methodArguments);
    }
}
