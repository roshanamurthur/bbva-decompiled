package org.junit.validator;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.runners.model.Annotatable;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes13.dex */
public final class AnnotationsValidator implements TestClassValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<a<?>> f92069a = Arrays.asList(new b(), new d(), new c());

    public static abstract class a<T extends Annotatable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnnotationValidatorFactory f92070a = new AnnotationValidatorFactory();

        public abstract List a(TestClass testClass);

        public abstract List<Exception> b(AnnotationValidator annotationValidator, T t10);
    }

    public static class b extends a<TestClass> {
        @Override // org.junit.validator.AnnotationsValidator.a
        public final List a(TestClass testClass) {
            return Collections.singletonList(testClass);
        }

        @Override // org.junit.validator.AnnotationsValidator.a
        public final List b(AnnotationValidator annotationValidator, Annotatable annotatable) {
            return annotationValidator.validateAnnotatedClass((TestClass) annotatable);
        }
    }

    public static class c extends a<FrameworkField> {
        @Override // org.junit.validator.AnnotationsValidator.a
        public final List a(TestClass testClass) {
            return testClass.getAnnotatedFields();
        }

        @Override // org.junit.validator.AnnotationsValidator.a
        public final List b(AnnotationValidator annotationValidator, Annotatable annotatable) {
            return annotationValidator.validateAnnotatedField((FrameworkField) annotatable);
        }
    }

    public static class d extends a<FrameworkMethod> {
        @Override // org.junit.validator.AnnotationsValidator.a
        public final List a(TestClass testClass) {
            return testClass.getAnnotatedMethods();
        }

        @Override // org.junit.validator.AnnotationsValidator.a
        public final List b(AnnotationValidator annotationValidator, Annotatable annotatable) {
            return annotationValidator.validateAnnotatedMethod((FrameworkMethod) annotatable);
        }
    }

    @Override // org.junit.validator.TestClassValidator
    public List<Exception> validateTestClass(TestClass testClass) {
        ArrayList arrayList = new ArrayList();
        for (a<?> aVar : f92069a) {
            aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Annotatable annotatable : aVar.a(testClass)) {
                ArrayList arrayList3 = new ArrayList();
                for (Annotation annotation : annotatable.getAnnotations()) {
                    ValidateWith validateWith = (ValidateWith) annotation.annotationType().getAnnotation(ValidateWith.class);
                    if (validateWith != null) {
                        arrayList3.addAll(aVar.b(a.f92070a.createAnnotationValidator(validateWith), annotatable));
                    }
                }
                arrayList2.addAll(arrayList3);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
