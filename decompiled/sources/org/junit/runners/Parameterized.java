package org.junit.runners;

import androidx.camera.camera2.internal.h0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mx.openpay.library.domain.util.Constant;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InvalidTestClassError;
import org.junit.runners.model.TestClass;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

/* JADX INFO: loaded from: classes13.dex */
public class Parameterized extends Suite {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AfterParam {
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BeforeParam {
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameter {
        int value() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameters {
        String name() default "{index}";
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UseParametersRunnerFactory {
        Class<? extends ParametersRunnerFactory> value() default BlockJUnit4ClassRunnerWithParametersFactory.class;
    }

    public static class a extends Runner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Description f92016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AssumptionViolatedException f92017b;

        public a(TestClass testClass, String str, AssumptionViolatedException assumptionViolatedException) {
            this.f92016a = Description.createTestDescription(testClass.getJavaClass(), str + "() assumption violation");
            this.f92017b = assumptionViolatedException;
        }

        @Override // org.junit.runner.Runner, org.junit.runner.Describable
        public final Description getDescription() {
            return this.f92016a;
        }

        @Override // org.junit.runner.Runner
        public final void run(RunNotifier runNotifier) {
            runNotifier.fireTestAssumptionFailed(new Failure(this.f92016a, this.f92017b));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final BlockJUnit4ClassRunnerWithParametersFactory f92018f = new BlockJUnit4ClassRunnerWithParametersFactory();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TestClass f92019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FrameworkMethod f92020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Object> f92021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f92022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f92023e;

        public b(Class cls) throws Exception {
            List<Object> listA;
            a aVar;
            TestClass testClass = new TestClass(cls);
            this.f92019a = testClass;
            for (FrameworkMethod frameworkMethod : testClass.getAnnotatedMethods(Parameters.class)) {
                if (frameworkMethod.isStatic() && frameworkMethod.isPublic()) {
                    this.f92020b = frameworkMethod;
                    try {
                        listA = a(frameworkMethod, this.f92019a);
                        aVar = null;
                    } catch (AssumptionViolatedException e5) {
                        List<Object> listEmptyList = Collections.emptyList();
                        a aVar2 = new a(this.f92019a, this.f92020b.getName(), e5);
                        listA = listEmptyList;
                        aVar = aVar2;
                    }
                    this.f92021c = listA;
                    this.f92023e = aVar;
                    int length = 0;
                    if (!listA.isEmpty()) {
                        Object obj = listA.get(0);
                        length = (obj instanceof Object[] ? (Object[]) obj : new Object[]{obj}).length;
                    }
                    this.f92022d = length;
                    return;
                }
            }
            throw new Exception("No public static parameters method on class " + testClass.getName());
        }

        public static List a(FrameworkMethod frameworkMethod, TestClass testClass) throws Exception {
            Object objInvokeExplosively = frameworkMethod.invokeExplosively(null, new Object[0]);
            if (objInvokeExplosively instanceof List) {
                return (List) objInvokeExplosively;
            }
            if (objInvokeExplosively instanceof Collection) {
                return new ArrayList((Collection) objInvokeExplosively);
            }
            if (!(objInvokeExplosively instanceof Iterable)) {
                if (objInvokeExplosively instanceof Object[]) {
                    return Arrays.asList((Object[]) objInvokeExplosively);
                }
                throw new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", testClass.getName(), frameworkMethod.getName()));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) objInvokeExplosively).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList;
        }

        public final ArrayList b(List list, String str) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                Object[] objArr = obj instanceof Object[] ? (Object[]) obj : new Object[]{obj};
                arrayList.add(new TestWithParameters(h0.b(Constant.BRACKET_OPEN, MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i10)), objArr), Constant.BRACKET_CLOSE), this.f92019a, Arrays.asList(objArr)));
                i10 = i11;
            }
            return arrayList;
        }
    }

    public Parameterized() throws Exception {
        throw null;
    }

    public Parameterized(Class<?> cls) throws Exception {
        List listUnmodifiableList;
        b bVar = new b(cls);
        a aVar = bVar.f92023e;
        if (aVar != null) {
            listUnmodifiableList = Collections.singletonList(aVar);
        } else {
            FrameworkMethod frameworkMethod = bVar.f92020b;
            Parameters parameters = (Parameters) frameworkMethod.getAnnotation(Parameters.class);
            List<Object> list = bVar.f92021c;
            String strName = parameters.name();
            TestClass testClass = bVar.f92019a;
            UseParametersRunnerFactory useParametersRunnerFactory = (UseParametersRunnerFactory) testClass.getAnnotation(UseParametersRunnerFactory.class);
            ParametersRunnerFactory parametersRunnerFactoryNewInstance = useParametersRunnerFactory == null ? b.f92018f : useParametersRunnerFactory.value().newInstance();
            try {
                ArrayList arrayListB = bVar.b(list, strName);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    arrayList.add(parametersRunnerFactoryNewInstance.createRunnerForTestWithParameters((TestWithParameters) it.next()));
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (ClassCastException unused) {
                throw new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", testClass.getName(), frameworkMethod.getName()));
            }
        }
        super(cls, (List<Runner>) listUnmodifiableList);
        Integer numValueOf = Integer.valueOf(bVar.f92022d);
        ArrayList arrayList2 = new ArrayList();
        b(BeforeParam.class, numValueOf, arrayList2);
        b(AfterParam.class, numValueOf, arrayList2);
        if (!arrayList2.isEmpty()) {
            throw new InvalidTestClassError(getTestClass().getJavaClass(), arrayList2);
        }
    }

    public final void b(Class cls, Integer num, ArrayList arrayList) {
        int length;
        for (FrameworkMethod frameworkMethod : getTestClass().getAnnotatedMethods(cls)) {
            frameworkMethod.validatePublicVoid(true, arrayList);
            if (num != null && (length = frameworkMethod.getMethod().getParameterTypes().length) != 0 && length != num.intValue()) {
                arrayList.add(new Exception("Method " + frameworkMethod.getName() + "() should have 0 or " + num + " parameter(s)"));
            }
        }
    }
}
