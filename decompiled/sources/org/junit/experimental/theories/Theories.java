package org.junit.experimental.theories;

import androidx.datastore.preferences.protobuf.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.internal.Assignments;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes13.dex */
public class Theories extends BlockJUnit4ClassRunner {
    public Theories(Class<?> cls) throws InitializationError {
        super(cls);
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner, org.junit.runners.ParentRunner
    public void collectInitializationErrors(List<Throwable> list) {
        super.collectInitializationErrors(list);
        for (Field field : getTestClass().getJavaClass().getDeclaredFields()) {
            if (field.getAnnotation(DataPoint.class) != null || field.getAnnotation(DataPoints.class) != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be static"));
                }
                if (!Modifier.isPublic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be public"));
                }
            }
        }
        for (Method method : getTestClass().getJavaClass().getDeclaredMethods()) {
            if (method.getAnnotation(DataPoint.class) != null || method.getAnnotation(DataPoints.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be static"));
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be public"));
                }
            }
        }
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public List<FrameworkMethod> computeTestMethods() {
        ArrayList arrayList = new ArrayList(super.computeTestMethods());
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Theory.class);
        arrayList.removeAll(annotatedMethods);
        arrayList.addAll(annotatedMethods);
        return arrayList;
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public Statement methodBlock(FrameworkMethod frameworkMethod) {
        return new TheoryAnchor(frameworkMethod, getTestClass());
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateTestMethods(List<Throwable> list) {
        for (FrameworkMethod frameworkMethod : computeTestMethods()) {
            if (frameworkMethod.getAnnotation(Theory.class) != null) {
                frameworkMethod.validatePublicVoid(false, list);
                frameworkMethod.validateNoTypeParametersOnArgs(list);
            } else {
                frameworkMethod.validatePublicVoidNoArg(false, list);
            }
            Iterator<ParameterSignature> it = ParameterSignature.signatures(frameworkMethod.getMethod()).iterator();
            while (it.hasNext()) {
                ParametersSuppliedBy parametersSuppliedBy = (ParametersSuppliedBy) it.next().findDeepAnnotation(ParametersSuppliedBy.class);
                if (parametersSuppliedBy != null) {
                    Class<? extends ParameterSupplier> clsValue = parametersSuppliedBy.value();
                    Constructor<?>[] constructors = clsValue.getConstructors();
                    if (constructors.length != 1) {
                        list.add(new Error(e.e(clsValue, new StringBuilder("ParameterSupplier "), " must have only one constructor (either empty or taking only a TestClass)")));
                    } else {
                        Class<?>[] parameterTypes = constructors[0].getParameterTypes();
                        if (parameterTypes.length != 0 && !parameterTypes[0].equals(TestClass.class)) {
                            list.add(new Error(e.e(clsValue, new StringBuilder("ParameterSupplier "), " constructor must take either nothing or a single TestClass instance")));
                        }
                    }
                }
            }
        }
    }

    public Theories(TestClass testClass) throws InitializationError {
        super(testClass);
    }

    public static class TheoryAnchor extends Statement {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FrameworkMethod f91822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TestClass f91823c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f91821a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f91824d = new ArrayList();

        public TheoryAnchor(FrameworkMethod frameworkMethod, TestClass testClass) {
            this.f91822b = frameworkMethod;
            this.f91823c = testClass;
        }

        public static boolean a(TheoryAnchor theoryAnchor) {
            Theory theory = (Theory) theoryAnchor.f91822b.getMethod().getAnnotation(Theory.class);
            if (theory == null) {
                return false;
            }
            return theory.nullsAccepted();
        }

        @Override // org.junit.runners.model.Statement
        public void evaluate() throws Throwable {
            FrameworkMethod frameworkMethod = this.f91822b;
            runWithAssignment(Assignments.allUnassigned(frameworkMethod.getMethod(), this.f91823c));
            boolean z10 = frameworkMethod.getAnnotation(Theory.class) != null;
            if (this.f91821a == 0 && z10) {
                Assert.fail("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.f91824d);
            }
        }

        public void handleAssumptionViolation(AssumptionViolatedException assumptionViolatedException) {
            this.f91824d.add(assumptionViolatedException);
        }

        public void handleDataPointSuccess() {
            this.f91821a++;
        }

        public void reportParameterizedError(Throwable th2, Object... objArr) throws Throwable {
            if (objArr.length != 0) {
                throw new ParameterizedAssertionError(th2, this.f91822b.getName(), objArr);
            }
            throw th2;
        }

        public void runWithAssignment(Assignments assignments) throws Throwable {
            if (assignments.isComplete()) {
                runWithCompleteAssignment(assignments);
            } else {
                runWithIncompleteAssignment(assignments);
            }
        }

        public void runWithCompleteAssignment(Assignments assignments) throws Throwable {
            new a(this.f91823c, assignments).methodBlock(this.f91822b).evaluate();
        }

        public void runWithIncompleteAssignment(Assignments assignments) throws Throwable {
            Iterator<PotentialAssignment> it = assignments.potentialsForNextUnassigned().iterator();
            while (it.hasNext()) {
                runWithAssignment(assignments.assignNext(it.next()));
            }
        }

        public class a extends BlockJUnit4ClassRunner {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Assignments f91825i;

            /* JADX INFO: renamed from: org.junit.experimental.theories.Theories$TheoryAnchor$a$a, reason: collision with other inner class name */
            public class C0474a extends Statement {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Statement f91827a;

                public C0474a(Statement statement) {
                    this.f91827a = statement;
                }

                @Override // org.junit.runners.model.Statement
                public final void evaluate() throws Throwable {
                    a aVar = a.this;
                    try {
                        this.f91827a.evaluate();
                        TheoryAnchor.this.handleDataPointSuccess();
                    } catch (AssumptionViolatedException e5) {
                        TheoryAnchor.this.handleAssumptionViolation(e5);
                    } catch (Throwable th2) {
                        TheoryAnchor theoryAnchor = TheoryAnchor.this;
                        theoryAnchor.reportParameterizedError(th2, aVar.f91825i.getArgumentStrings(TheoryAnchor.a(theoryAnchor)));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TestClass testClass, Assignments assignments) {
                super(testClass);
                this.f91825i = assignments;
            }

            @Override // org.junit.runners.BlockJUnit4ClassRunner
            public final Object createTest() throws Exception {
                Object[] constructorArguments = this.f91825i.getConstructorArguments();
                if (!TheoryAnchor.a(TheoryAnchor.this)) {
                    Assume.assumeNotNull(constructorArguments);
                }
                return getTestClass().getOnlyConstructor().newInstance(constructorArguments);
            }

            @Override // org.junit.runners.BlockJUnit4ClassRunner
            public final Statement methodBlock(FrameworkMethod frameworkMethod) {
                return new C0474a(super.methodBlock(frameworkMethod));
            }

            @Override // org.junit.runners.BlockJUnit4ClassRunner
            public final Statement methodInvoker(FrameworkMethod frameworkMethod, Object obj) {
                TheoryAnchor theoryAnchor = TheoryAnchor.this;
                theoryAnchor.getClass();
                return new org.junit.experimental.theories.a(obj, theoryAnchor, this.f91825i, frameworkMethod);
            }

            @Override // org.junit.runners.BlockJUnit4ClassRunner, org.junit.runners.ParentRunner
            public final void collectInitializationErrors(List<Throwable> list) {
            }
        }
    }
}
