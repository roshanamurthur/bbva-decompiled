package org.junit.runners;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.Checks;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.internal.runners.rules.RuleMemberValidator;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.rules.RunRules;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Orderable;
import org.junit.runner.manipulation.Orderer;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.model.FrameworkMember;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.InvalidTestClassError;
import org.junit.runners.model.MemberValueConsumer;
import org.junit.runners.model.RunnerScheduler;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;
import org.junit.validator.AnnotationsValidator;
import org.junit.validator.TestClassValidator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<TestClassValidator> f92024e = Collections.singletonList(new AnnotationsValidator());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TestClass f92026b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f92025a = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile List<T> f92027c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile RunnerScheduler f92028d = new a();

    public class b extends Statement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RunNotifier f92029a;

        public b(RunNotifier runNotifier) {
            this.f92029a = runNotifier;
        }

        @Override // org.junit.runners.model.Statement
        public final void evaluate() {
            ParentRunner parentRunner = ParentRunner.this;
            RunNotifier runNotifier = this.f92029a;
            RunnerScheduler runnerScheduler = parentRunner.f92028d;
            try {
                Iterator<T> it = parentRunner.a().iterator();
                while (it.hasNext()) {
                    runnerScheduler.schedule(new mn.a(parentRunner, it.next(), runNotifier));
                }
                runnerScheduler.finished();
            } catch (Throwable th2) {
                runnerScheduler.finished();
                throw th2;
            }
        }
    }

    public class c extends Statement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Statement f92031a;

        public c(Statement statement) {
            this.f92031a = statement;
        }

        @Override // org.junit.runners.model.Statement
        public final void evaluate() throws Throwable {
            try {
                this.f92031a.evaluate();
            } finally {
                Thread.interrupted();
            }
        }
    }

    public static class d implements MemberValueConsumer<TestRule> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f92032a = new ArrayList();

        @Override // org.junit.runners.model.MemberValueConsumer
        public final void accept(FrameworkMember frameworkMember, TestRule testRule) {
            TestRule testRule2 = testRule;
            ClassRule classRule = (ClassRule) frameworkMember.getAnnotation(ClassRule.class);
            this.f92032a.add(new org.junit.runners.a.b(testRule2, 1, classRule != null ? Integer.valueOf(classRule.order()) : null));
        }
    }

    public ParentRunner(Class<?> cls) throws InitializationError {
        TestClass testClassCreateTestClass = createTestClass(cls);
        this.f92026b = testClassCreateTestClass;
        ArrayList arrayList = new ArrayList();
        collectInitializationErrors(arrayList);
        if (!arrayList.isEmpty()) {
            throw new InvalidTestClassError(testClassCreateTestClass.getJavaClass(), arrayList);
        }
    }

    public final List<T> a() {
        if (this.f92027c == null) {
            this.f92025a.lock();
            try {
                if (this.f92027c == null) {
                    this.f92027c = Collections.unmodifiableList(new ArrayList(getChildren()));
                }
            } finally {
                this.f92025a.unlock();
            }
        }
        return this.f92027c;
    }

    public Statement childrenInvoker(RunNotifier runNotifier) {
        return new b(runNotifier);
    }

    public Statement classBlock(RunNotifier runNotifier) {
        Statement statementChildrenInvoker = childrenInvoker(runNotifier);
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            if (!isIgnored(it.next())) {
                Statement statementWithAfterClasses = withAfterClasses(withBeforeClasses(statementChildrenInvoker));
                List<TestRule> listClassRules = classRules();
                if (!listClassRules.isEmpty()) {
                    statementWithAfterClasses = new RunRules(statementWithAfterClasses, listClassRules, getDescription());
                }
                return withInterruptIsolation(statementWithAfterClasses);
            }
        }
        return statementChildrenInvoker;
    }

    public List<TestRule> classRules() {
        d dVar = new d();
        TestClass testClass = this.f92026b;
        testClass.collectAnnotatedMethodValues(null, ClassRule.class, TestRule.class, dVar);
        testClass.collectAnnotatedFieldValues(null, ClassRule.class, TestRule.class, dVar);
        ArrayList arrayList = dVar.f92032a;
        Collections.sort(arrayList, org.junit.runners.a.f92034d);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((TestRule) ((org.junit.runners.a.b) it.next()).f92038a);
        }
        return arrayList2;
    }

    public void collectInitializationErrors(List<Throwable> list) {
        validatePublicVoidNoArgMethods(BeforeClass.class, true, list);
        validatePublicVoidNoArgMethods(AfterClass.class, true, list);
        RuleMemberValidator.CLASS_RULE_VALIDATOR.validate(getTestClass(), list);
        RuleMemberValidator.CLASS_RULE_METHOD_VALIDATOR.validate(getTestClass(), list);
        if (getTestClass().getJavaClass() != null) {
            Iterator<TestClassValidator> it = f92024e.iterator();
            while (it.hasNext()) {
                list.addAll(it.next().validateTestClass(getTestClass()));
            }
        }
    }

    @Deprecated
    public TestClass createTestClass(Class<?> cls) {
        return new TestClass(cls);
    }

    public abstract Description describeChild(T t10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        this.f92025a.lock();
        try {
            ArrayList arrayList = new ArrayList(a());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (filter.shouldRun(describeChild(next))) {
                    try {
                        filter.apply(next);
                    } catch (NoTestsRemainException unused) {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            }
            this.f92027c = Collections.unmodifiableList(arrayList);
            if (this.f92027c.isEmpty()) {
                throw new NoTestsRemainException();
            }
            this.f92025a.unlock();
        } catch (Throwable th2) {
            this.f92025a.unlock();
            throw th2;
        }
    }

    public abstract List<T> getChildren();

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Class<?> javaClass = getTestClass().getJavaClass();
        Description descriptionCreateSuiteDescription = (javaClass == null || !javaClass.getName().equals(getName())) ? Description.createSuiteDescription(getName(), getRunnerAnnotations()) : Description.createSuiteDescription(javaClass, getRunnerAnnotations());
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            descriptionCreateSuiteDescription.addChild(describeChild(it.next()));
        }
        return descriptionCreateSuiteDescription;
    }

    public String getName() {
        return this.f92026b.getName();
    }

    public Annotation[] getRunnerAnnotations() {
        return this.f92026b.getAnnotations();
    }

    public final TestClass getTestClass() {
        return this.f92026b;
    }

    public boolean isIgnored(T t10) {
        return false;
    }

    @Override // org.junit.runner.manipulation.Orderable
    public void order(Orderer orderer) throws InvalidOrderingException {
        if (getDescription().getAnnotation(FixMethodOrder.class) != null) {
            return;
        }
        this.f92025a.lock();
        try {
            List<T> listA = a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(listA.size());
            for (T t10 : listA) {
                Description descriptionDescribeChild = describeChild(t10);
                List arrayList = (List) linkedHashMap.get(descriptionDescribeChild);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    linkedHashMap.put(descriptionDescribeChild, arrayList);
                }
                arrayList.add(t10);
                orderer.apply(t10);
            }
            List<Description> listOrder = orderer.order(linkedHashMap.keySet());
            ArrayList arrayList2 = new ArrayList(listA.size());
            Iterator<Description> it = listOrder.iterator();
            while (it.hasNext()) {
                arrayList2.addAll((Collection) linkedHashMap.get(it.next()));
            }
            this.f92027c = Collections.unmodifiableList(arrayList2);
        } finally {
            this.f92025a.unlock();
        }
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        EachTestNotifier eachTestNotifier = new EachTestNotifier(runNotifier, getDescription());
        eachTestNotifier.fireTestSuiteStarted();
        try {
            try {
                try {
                    try {
                        classBlock(runNotifier).evaluate();
                    } catch (StoppedByUserException e5) {
                        throw e5;
                    }
                } catch (Throwable th2) {
                    eachTestNotifier.addFailure(th2);
                }
            } catch (AssumptionViolatedException e7) {
                eachTestNotifier.addFailedAssumption(e7);
            }
            eachTestNotifier.fireTestSuiteFinished();
        } catch (Throwable th3) {
            eachTestNotifier.fireTestSuiteFinished();
            throw th3;
        }
    }

    public abstract void runChild(T t10, RunNotifier runNotifier);

    public final void runLeaf(Statement statement, Description description, RunNotifier runNotifier) {
        EachTestNotifier eachTestNotifier = new EachTestNotifier(runNotifier, description);
        eachTestNotifier.fireTestStarted();
        try {
            try {
                statement.evaluate();
            } catch (Throwable th2) {
                eachTestNotifier.fireTestFinished();
                throw th2;
            }
        } catch (AssumptionViolatedException e5) {
            eachTestNotifier.addFailedAssumption(e5);
        } catch (Throwable th3) {
            eachTestNotifier.addFailure(th3);
        }
        eachTestNotifier.fireTestFinished();
    }

    public void setScheduler(RunnerScheduler runnerScheduler) {
        this.f92028d = runnerScheduler;
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        if (getDescription().getAnnotation(FixMethodOrder.class) != null) {
            return;
        }
        this.f92025a.lock();
        try {
            Iterator<T> it = a().iterator();
            while (it.hasNext()) {
                sorter.apply(it.next());
            }
            ArrayList arrayList = new ArrayList(a());
            Collections.sort(arrayList, new mn.b(this, sorter));
            this.f92027c = Collections.unmodifiableList(arrayList);
        } finally {
            this.f92025a.unlock();
        }
    }

    public void validatePublicVoidNoArgMethods(Class<? extends Annotation> cls, boolean z10, List<Throwable> list) {
        Iterator<FrameworkMethod> it = getTestClass().getAnnotatedMethods(cls).iterator();
        while (it.hasNext()) {
            it.next().validatePublicVoidNoArg(z10, list);
        }
    }

    public Statement withAfterClasses(Statement statement) {
        List<FrameworkMethod> annotatedMethods = this.f92026b.getAnnotatedMethods(AfterClass.class);
        return annotatedMethods.isEmpty() ? statement : new RunAfters(statement, annotatedMethods, null);
    }

    public Statement withBeforeClasses(Statement statement) {
        List<FrameworkMethod> annotatedMethods = this.f92026b.getAnnotatedMethods(BeforeClass.class);
        return annotatedMethods.isEmpty() ? statement : new RunBefores(statement, annotatedMethods, null);
    }

    public final Statement withInterruptIsolation(Statement statement) {
        return new c(statement);
    }

    public ParentRunner(TestClass testClass) throws InitializationError {
        TestClass testClass2 = (TestClass) Checks.notNull(testClass);
        this.f92026b = testClass2;
        ArrayList arrayList = new ArrayList();
        collectInitializationErrors(arrayList);
        if (!arrayList.isEmpty()) {
            throw new InvalidTestClassError(testClass2.getJavaClass(), arrayList);
        }
    }

    public class a implements RunnerScheduler {
        @Override // org.junit.runners.model.RunnerScheduler
        public final void schedule(Runnable runnable) {
            runnable.run();
        }

        @Override // org.junit.runners.model.RunnerScheduler
        public final void finished() {
        }
    }
}
