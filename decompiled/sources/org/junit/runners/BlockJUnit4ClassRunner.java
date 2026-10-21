package org.junit.runners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.model.ReflectiveCallable;
import org.junit.internal.runners.rules.RuleMemberValidator;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.internal.runners.statements.Fail;
import org.junit.internal.runners.statements.FailOnTimeout;
import org.junit.internal.runners.statements.InvokeMethod;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMember;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.MemberValueConsumer;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;
import org.junit.validator.PublicClassValidator;

/* JADX INFO: loaded from: classes13.dex */
public class BlockJUnit4ClassRunner extends ParentRunner<FrameworkMethod> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicClassValidator f92008g = new PublicClassValidator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<org.junit.runners.a> f92009h = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f92010f;

    public class a extends Statement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameworkMethod f92011a;

        public a(FrameworkMethod frameworkMethod) {
            this.f92011a = frameworkMethod;
        }

        @Override // org.junit.runners.model.Statement
        public final void evaluate() throws Throwable {
            BlockJUnit4ClassRunner.this.methodBlock(this.f92011a).evaluate();
        }
    }

    public class b extends ReflectiveCallable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameworkMethod f92013a;

        public b(FrameworkMethod frameworkMethod) {
            this.f92013a = frameworkMethod;
        }

        @Override // org.junit.internal.runners.model.ReflectiveCallable
        public final Object runReflectiveCall() throws Throwable {
            return BlockJUnit4ClassRunner.this.createTest(this.f92013a);
        }
    }

    public static class c<T> implements MemberValueConsumer<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f92015a = new ArrayList();

        @Override // org.junit.runners.model.MemberValueConsumer
        public final void accept(FrameworkMember<?> frameworkMember, T t10) {
            org.junit.runners.a aVar;
            Rule rule = (Rule) frameworkMember.getAnnotation(Rule.class);
            if (rule != null && (aVar = BlockJUnit4ClassRunner.f92009h.get()) != null) {
                aVar.f92035a.put(t10, Integer.valueOf(rule.order()));
            }
            this.f92015a.add(t10);
        }
    }

    public BlockJUnit4ClassRunner(Class<?> cls) throws InitializationError {
        super(cls);
        this.f92010f = new ConcurrentHashMap();
    }

    @Override // org.junit.runners.ParentRunner
    public void collectInitializationErrors(List<Throwable> list) {
        super.collectInitializationErrors(list);
        if (getTestClass().getJavaClass() != null) {
            list.addAll(f92008g.validateTestClass(getTestClass()));
        }
        validateNoNonStaticInnerClass(list);
        validateConstructor(list);
        validateInstanceMethods(list);
        validateFields(list);
        RuleMemberValidator.RULE_METHOD_VALIDATOR.validate(getTestClass(), list);
    }

    public List<FrameworkMethod> computeTestMethods() {
        return getTestClass().getAnnotatedMethods(Test.class);
    }

    public Object createTest() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(new Object[0]);
    }

    @Override // org.junit.runners.ParentRunner
    public List<FrameworkMethod> getChildren() {
        return computeTestMethods();
    }

    public List<TestRule> getTestRules(Object obj) {
        c cVar = new c();
        getTestClass().collectAnnotatedMethodValues(obj, Rule.class, TestRule.class, cVar);
        getTestClass().collectAnnotatedFieldValues(obj, Rule.class, TestRule.class, cVar);
        return cVar.f92015a;
    }

    public Statement methodBlock(FrameworkMethod frameworkMethod) {
        ArrayList arrayList;
        ArrayList<TestRule> arrayList2;
        IdentityHashMap<Object, Integer> identityHashMap;
        try {
            Object objRun = new b(frameworkMethod).run();
            Statement statementWithAfters = withAfters(frameworkMethod, objRun, withBefores(frameworkMethod, objRun, withPotentialTimeout(frameworkMethod, objRun, possiblyExpectingExceptions(frameworkMethod, objRun, methodInvoker(frameworkMethod, objRun)))));
            org.junit.runners.a aVar = new org.junit.runners.a();
            ThreadLocal<org.junit.runners.a> threadLocal = f92009h;
            threadLocal.set(aVar);
            try {
                List<TestRule> testRules = getTestRules(objRun);
                Iterator<MethodRule> it = rules(objRun).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    arrayList = aVar.f92037c;
                    if (!zHasNext) {
                        break;
                    }
                    MethodRule next = it.next();
                    if (!(next instanceof TestRule) || !testRules.contains(next)) {
                        arrayList.add(next);
                    }
                }
                Iterator<TestRule> it2 = testRules.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    arrayList2 = aVar.f92036b;
                    if (!zHasNext2) {
                        break;
                    }
                    arrayList2.add(it2.next());
                }
                threadLocal.remove();
                Description descriptionDescribeChild = describeChild(frameworkMethod);
                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    ArrayList<org.junit.runners.a.b> arrayList3 = new ArrayList(arrayList2.size() + arrayList.size());
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        boolean zHasNext3 = it3.hasNext();
                        identityHashMap = aVar.f92035a;
                        if (!zHasNext3) {
                            break;
                        }
                        MethodRule methodRule = (MethodRule) it3.next();
                        arrayList3.add(new org.junit.runners.a.b(methodRule, 0, identityHashMap.get(methodRule)));
                    }
                    for (TestRule testRule : arrayList2) {
                        arrayList3.add(new org.junit.runners.a.b(testRule, 1, identityHashMap.get(testRule)));
                    }
                    Collections.sort(arrayList3, org.junit.runners.a.f92034d);
                    for (org.junit.runners.a.b bVar : arrayList3) {
                        int i10 = bVar.f92039b;
                        Object obj = bVar.f92038a;
                        statementWithAfters = i10 == 1 ? ((TestRule) obj).apply(statementWithAfters, descriptionDescribeChild) : ((MethodRule) obj).apply(statementWithAfters, frameworkMethod, objRun);
                    }
                }
                return withInterruptIsolation(statementWithAfters);
            } catch (Throwable th2) {
                threadLocal.remove();
                throw th2;
            }
        } catch (Throwable th3) {
            return new Fail(th3);
        }
    }

    public Statement methodInvoker(FrameworkMethod frameworkMethod, Object obj) {
        return new InvokeMethod(frameworkMethod, obj);
    }

    public Statement possiblyExpectingExceptions(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        Test test = (Test) frameworkMethod.getAnnotation(Test.class);
        Class<? extends Throwable> clsExpected = (test == null || test.expected() == Test.None.class) ? null : test.expected();
        return clsExpected != null ? new ExpectException(statement, clsExpected) : statement;
    }

    public List<MethodRule> rules(Object obj) {
        c cVar = new c();
        getTestClass().collectAnnotatedMethodValues(obj, Rule.class, MethodRule.class, cVar);
        getTestClass().collectAnnotatedFieldValues(obj, Rule.class, MethodRule.class, cVar);
        return cVar.f92015a;
    }

    public String testName(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getName();
    }

    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
        validateZeroArgConstructor(list);
    }

    public void validateFields(List<Throwable> list) {
        RuleMemberValidator.RULE_VALIDATOR.validate(getTestClass(), list);
    }

    @Deprecated
    public void validateInstanceMethods(List<Throwable> list) {
        validatePublicVoidNoArgMethods(After.class, false, list);
        validatePublicVoidNoArgMethods(Before.class, false, list);
        validateTestMethods(list);
        if (computeTestMethods().isEmpty()) {
            list.add(new Exception("No runnable methods"));
        }
    }

    public void validateNoNonStaticInnerClass(List<Throwable> list) {
        if (getTestClass().isANonStaticInnerClass()) {
            list.add(new Exception("The inner class " + getTestClass().getName() + " is not static."));
        }
    }

    public void validateOnlyOneConstructor(List<Throwable> list) {
        if (getTestClass().getJavaClass().getConstructors().length == 1) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public constructor"));
    }

    public void validateTestMethods(List<Throwable> list) {
        validatePublicVoidNoArgMethods(Test.class, false, list);
    }

    public void validateZeroArgConstructor(List<Throwable> list) {
        if (getTestClass().isANonStaticInnerClass() || getTestClass().getJavaClass().getConstructors().length != 1 || getTestClass().getOnlyConstructor().getParameterTypes().length == 0) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
    }

    public Statement withAfters(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(After.class);
        return annotatedMethods.isEmpty() ? statement : new RunAfters(statement, annotatedMethods, obj);
    }

    public Statement withBefores(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Before.class);
        return annotatedMethods.isEmpty() ? statement : new RunBefores(statement, annotatedMethods, obj);
    }

    @Deprecated
    public Statement withPotentialTimeout(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        Test test = (Test) frameworkMethod.getAnnotation(Test.class);
        long jTimeout = test == null ? 0L : test.timeout();
        return jTimeout <= 0 ? statement : FailOnTimeout.builder().withTimeout(jTimeout, TimeUnit.MILLISECONDS).build(statement);
    }

    public Object createTest(FrameworkMethod frameworkMethod) throws Exception {
        return createTest();
    }

    @Override // org.junit.runners.ParentRunner
    public Description describeChild(FrameworkMethod frameworkMethod) {
        ConcurrentHashMap concurrentHashMap = this.f92010f;
        Description description = (Description) concurrentHashMap.get(frameworkMethod);
        if (description != null) {
            return description;
        }
        Description descriptionCreateTestDescription = Description.createTestDescription(getTestClass().getJavaClass(), testName(frameworkMethod), frameworkMethod.getAnnotations());
        concurrentHashMap.putIfAbsent(frameworkMethod, descriptionCreateTestDescription);
        return descriptionCreateTestDescription;
    }

    @Override // org.junit.runners.ParentRunner
    public boolean isIgnored(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getAnnotation(Ignore.class) != null;
    }

    @Override // org.junit.runners.ParentRunner
    public void runChild(FrameworkMethod frameworkMethod, RunNotifier runNotifier) {
        Description descriptionDescribeChild = describeChild(frameworkMethod);
        if (isIgnored(frameworkMethod)) {
            runNotifier.fireTestIgnored(descriptionDescribeChild);
        } else {
            runLeaf(new a(frameworkMethod), descriptionDescribeChild, runNotifier);
        }
    }

    public BlockJUnit4ClassRunner(TestClass testClass) throws InitializationError {
        super(testClass);
        this.f92010f = new ConcurrentHashMap();
    }
}
