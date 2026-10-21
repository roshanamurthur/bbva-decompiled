package org.junit.internal.requests;

import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.internal.builders.SuiteMethodBuilder;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class ClassRequest extends in.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f91862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91863d;

    public class a extends AllDefaultPossibilitiesBuilder {
        public a() {
        }

        @Override // org.junit.internal.builders.AllDefaultPossibilitiesBuilder
        public final RunnerBuilder suiteMethodBuilder() {
            return ClassRequest.this.new b();
        }
    }

    public class b extends SuiteMethodBuilder {
        public b() {
        }

        @Override // org.junit.internal.builders.SuiteMethodBuilder, org.junit.runners.model.RunnerBuilder
        public final Runner runnerForClass(Class<?> cls) throws Throwable {
            ClassRequest classRequest = ClassRequest.this;
            if (cls != classRequest.f91862c || classRequest.f91863d) {
                return super.runnerForClass(cls);
            }
            return null;
        }
    }

    public ClassRequest(Class<?> cls, boolean z10) {
        this.f91862c = cls;
        this.f91863d = z10;
    }

    @Override // in.a
    public Runner createRunner() {
        return new a().safeRunnerForClass(this.f91862c);
    }

    public ClassRequest(Class<?> cls) {
        this(cls, true);
    }
}
