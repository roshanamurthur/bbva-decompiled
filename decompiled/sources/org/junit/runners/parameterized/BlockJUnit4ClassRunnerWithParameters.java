package org.junit.runners.parameterized;

import androidx.appcompat.widget.o1;
import androidx.collection.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import mx.openpay.library.domain.util.Constant;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class BlockJUnit4ClassRunnerWithParameters extends BlockJUnit4ClassRunner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object[] f92059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f92060j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92061a;

        static {
            int[] iArr = new int[b.values().length];
            f92061a = iArr;
            try {
                iArr[b.CONSTRUCTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92061a[b.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CONSTRUCTOR;
        public static final b FIELD;

        static {
            b bVar = new b("CONSTRUCTOR", 0);
            CONSTRUCTOR = bVar;
            b bVar2 = new b("FIELD", 1);
            FIELD = bVar2;
            $VALUES = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public class c extends RunAfters {
        public c(Statement statement, List<FrameworkMethod> list) {
            super(statement, list, null);
        }

        @Override // org.junit.internal.runners.statements.RunAfters
        public final void invokeMethod(FrameworkMethod frameworkMethod) throws Throwable {
            frameworkMethod.invokeExplosively(null, frameworkMethod.getMethod().getParameterTypes().length == 0 ? null : BlockJUnit4ClassRunnerWithParameters.this.f92059i);
        }
    }

    public class d extends RunBefores {
        public d(Statement statement, List<FrameworkMethod> list) {
            super(statement, list, null);
        }

        @Override // org.junit.internal.runners.statements.RunBefores
        public final void invokeMethod(FrameworkMethod frameworkMethod) throws Throwable {
            frameworkMethod.invokeExplosively(null, frameworkMethod.getMethod().getParameterTypes().length == 0 ? null : BlockJUnit4ClassRunnerWithParameters.this.f92059i);
        }
    }

    public BlockJUnit4ClassRunnerWithParameters(TestWithParameters testWithParameters) throws InitializationError {
        super(testWithParameters.getTestClass());
        this.f92059i = testWithParameters.getParameters().toArray(new Object[testWithParameters.getParameters().size()]);
        this.f92060j = testWithParameters.getName();
    }

    public final b b() {
        return getTestClass().getAnnotatedFields(Parameterized.Parameter.class).isEmpty() ^ true ? b.FIELD : b.CONSTRUCTOR;
    }

    @Override // org.junit.runners.ParentRunner
    public Statement classBlock(RunNotifier runNotifier) {
        Statement statementChildrenInvoker = childrenInvoker(runNotifier);
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Parameterized.BeforeParam.class);
        if (!annotatedMethods.isEmpty()) {
            statementChildrenInvoker = new d(statementChildrenInvoker, annotatedMethods);
        }
        List<FrameworkMethod> annotatedMethods2 = getTestClass().getAnnotatedMethods(Parameterized.AfterParam.class);
        return annotatedMethods2.isEmpty() ? statementChildrenInvoker : new c(statementChildrenInvoker, annotatedMethods2);
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public Object createTest() throws Exception {
        b bVarB = b();
        int i10 = a.f92061a[bVarB.ordinal()];
        Object[] objArr = this.f92059i;
        if (i10 == 1) {
            return getTestClass().getOnlyConstructor().newInstance(objArr);
        }
        if (i10 != 2) {
            throw new IllegalStateException("The injection type " + bVarB + " is not supported.");
        }
        List<FrameworkField> annotatedFields = getTestClass().getAnnotatedFields(Parameterized.Parameter.class);
        if (annotatedFields.size() != objArr.length) {
            StringBuilder sb2 = new StringBuilder("Wrong number of parameters and @Parameter fields. @Parameter fields counted: ");
            sb2.append(annotatedFields.size());
            sb2.append(", available parameters: ");
            throw new Exception(androidx.appcompat.widget.a.c(sb2, objArr.length, Constant.DOT_STRING));
        }
        Object objNewInstance = getTestClass().getJavaClass().newInstance();
        Iterator<FrameworkField> it = annotatedFields.iterator();
        while (it.hasNext()) {
            Field field = it.next().getField();
            int iValue = ((Parameterized.Parameter) field.getAnnotation(Parameterized.Parameter.class)).value();
            try {
                field.set(objNewInstance, objArr[iValue]);
            } catch (IllegalAccessException e5) {
                IllegalAccessException illegalAccessException = new IllegalAccessException("Cannot set parameter '" + field.getName() + "'. Ensure that the field '" + field.getName() + "' is public.");
                illegalAccessException.initCause(e5);
                throw illegalAccessException;
            } catch (IllegalArgumentException e7) {
                throw new Exception(getTestClass().getName() + ": Trying to set " + field.getName() + " with the value " + objArr[iValue] + " that is not the right type (" + objArr[iValue].getClass().getSimpleName() + " instead of " + field.getType().getSimpleName() + ").", e7);
            }
        }
        return objNewInstance;
    }

    @Override // org.junit.runners.ParentRunner
    public String getName() {
        return this.f92060j;
    }

    @Override // org.junit.runners.ParentRunner
    public Annotation[] getRunnerAnnotations() {
        Annotation[] runnerAnnotations = super.getRunnerAnnotations();
        Annotation[] annotationArr = new Annotation[runnerAnnotations.length - 1];
        int i10 = 0;
        for (Annotation annotation : runnerAnnotations) {
            if (!annotation.annotationType().equals(RunWith.class)) {
                annotationArr[i10] = annotation;
                i10++;
            }
        }
        return annotationArr;
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public String testName(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getName() + getName();
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
        if (b() != b.CONSTRUCTOR) {
            validateZeroArgConstructor(list);
        }
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateFields(List<Throwable> list) {
        super.validateFields(list);
        if (b() == b.FIELD) {
            List<FrameworkField> annotatedFields = getTestClass().getAnnotatedFields(Parameterized.Parameter.class);
            int size = annotatedFields.size();
            int[] iArr = new int[size];
            Iterator<FrameworkField> it = annotatedFields.iterator();
            while (it.hasNext()) {
                int iValue = ((Parameterized.Parameter) it.next().getField().getAnnotation(Parameterized.Parameter.class)).value();
                if (iValue < 0 || iValue > annotatedFields.size() - 1) {
                    StringBuilder sbC = o1.c("Invalid @Parameter value: ", iValue, ". @Parameter fields counted: ");
                    sbC.append(annotatedFields.size());
                    sbC.append(". Please use an index between 0 and ");
                    sbC.append(annotatedFields.size() - 1);
                    sbC.append(Constant.DOT_STRING);
                    list.add(new Exception(sbC.toString()));
                } else {
                    iArr[iValue] = iArr[iValue] + 1;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = iArr[i10];
                if (i11 == 0) {
                    list.add(new Exception(androidx.camera.core.impl.utils.b.a("@Parameter(", i10, ") is never used.")));
                } else if (i11 > 1) {
                    list.add(new Exception(k.c("@Parameter(", i10, ") is used more than once (", i11, ").")));
                }
            }
        }
    }
}
