package org.junit.runners.parameterized;

import androidx.camera.camera2.internal.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.internal.Checks;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes13.dex */
public class TestWithParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TestClass f92065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Object> f92066c;

    public TestWithParameters(String str, TestClass testClass, List<Object> list) {
        Checks.notNull(str, "The name is missing.");
        Checks.notNull(testClass, "The test class is missing.");
        Checks.notNull(list, "The parameters are missing.");
        this.f92064a = str;
        this.f92065b = testClass;
        this.f92066c = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestWithParameters testWithParameters = (TestWithParameters) obj;
        return this.f92064a.equals(testWithParameters.f92064a) && this.f92066c.equals(testWithParameters.f92066c) && this.f92065b.equals(testWithParameters.f92065b);
    }

    public String getName() {
        return this.f92064a;
    }

    public List<Object> getParameters() {
        return this.f92066c;
    }

    public TestClass getTestClass() {
        return this.f92065b;
    }

    public int hashCode() {
        return this.f92066c.hashCode() + ((this.f92065b.hashCode() + n1.c(this.f92064a, 14747, 14747)) * 14747);
    }

    public String toString() {
        return this.f92065b.getName() + " '" + this.f92064a + "' with parameters " + this.f92066c;
    }
}
