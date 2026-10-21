package org.junit.validator;

import java.util.Collections;
import java.util.List;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes13.dex */
public class PublicClassValidator implements TestClassValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Exception> f92071a = Collections.emptyList();

    @Override // org.junit.validator.TestClassValidator
    public List<Exception> validateTestClass(TestClass testClass) {
        if (testClass.isPublic()) {
            return f92071a;
        }
        return Collections.singletonList(new Exception("The class " + testClass.getName() + " is not public."));
    }
}
