package junit.framework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.junit.internal.MethodSorter;
import org.junit.internal.Throwables;

/* JADX INFO: loaded from: classes12.dex */
public class TestSuite implements Test {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f79132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vector<Test> f79133b;

    public static class a extends TestCase {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f79134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super("warning");
            this.f79134b = str;
        }

        @Override // junit.framework.TestCase
        public final void runTest() {
            TestCase.fail(this.f79134b);
        }
    }

    public TestSuite() {
        this.f79133b = new Vector<>(10);
    }

    public static boolean a(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    public static Test createTest(Class<?> cls, String str) {
        Object objNewInstance;
        try {
            Constructor<?> testConstructor = getTestConstructor(cls);
            try {
                if (testConstructor.getParameterTypes().length == 0) {
                    objNewInstance = testConstructor.newInstance(new Object[0]);
                    if (objNewInstance instanceof TestCase) {
                        ((TestCase) objNewInstance).setName(str);
                    }
                } else {
                    objNewInstance = testConstructor.newInstance(str);
                }
                return (Test) objNewInstance;
            } catch (IllegalAccessException e5) {
                StringBuilder sbD = ci.a.d("Cannot access test case: ", str, " (");
                sbD.append(Throwables.getStacktrace(e5));
                sbD.append(")");
                return warning(sbD.toString());
            } catch (InstantiationException e7) {
                StringBuilder sbD2 = ci.a.d("Cannot instantiate test case: ", str, " (");
                sbD2.append(Throwables.getStacktrace(e7));
                sbD2.append(")");
                return warning(sbD2.toString());
            } catch (InvocationTargetException e10) {
                StringBuilder sbD3 = ci.a.d("Exception in constructor: ", str, " (");
                sbD3.append(Throwables.getStacktrace(e10.getTargetException()));
                sbD3.append(")");
                return warning(sbD3.toString());
            }
        } catch (NoSuchMethodException unused) {
            return warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    public static Constructor<?> getTestConstructor(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(new Class[0]);
        }
    }

    public static Test warning(String str) {
        return new a(str);
    }

    public void addTest(Test test) {
        this.f79133b.add(test);
    }

    public void addTestSuite(Class<? extends TestCase> cls) {
        addTest(new TestSuite(cls));
    }

    @Override // junit.framework.Test
    public int countTestCases() {
        Iterator<Test> it = this.f79133b.iterator();
        int iCountTestCases = 0;
        while (it.hasNext()) {
            iCountTestCases += it.next().countTestCases();
        }
        return iCountTestCases;
    }

    public String getName() {
        return this.f79132a;
    }

    @Override // junit.framework.Test
    public void run(TestResult testResult) {
        for (Test test : this.f79133b) {
            if (testResult.shouldStop()) {
                return;
            } else {
                runTest(test, testResult);
            }
        }
    }

    public void runTest(Test test, TestResult testResult) {
        test.run(testResult);
    }

    public void setName(String str) {
        this.f79132a = str;
    }

    public Test testAt(int i10) {
        return this.f79133b.get(i10);
    }

    public int testCount() {
        return this.f79133b.size();
    }

    public Enumeration<Test> tests() {
        return this.f79133b.elements();
    }

    public String toString() {
        return getName() != null ? getName() : super.toString();
    }

    public TestSuite(Class<?> cls) {
        this.f79133b = new Vector<>(10);
        this.f79132a = cls.getName();
        try {
            getTestConstructor(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                addTest(warning("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = cls; Test.class.isAssignableFrom(superclass); superclass = superclass.getSuperclass()) {
                for (Method method : MethodSorter.getDeclaredMethods(superclass)) {
                    String name = method.getName();
                    if (!arrayList.contains(name)) {
                        if (a(method) && Modifier.isPublic(method.getModifiers())) {
                            arrayList.add(name);
                            addTest(createTest(cls, name));
                        } else if (a(method)) {
                            addTest(warning("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
                        }
                    }
                }
            }
            if (this.f79133b.size() == 0) {
                addTest(warning("No tests found in ".concat(cls.getName())));
            }
        } catch (NoSuchMethodException unused) {
            addTest(warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    public TestSuite(Class<? extends TestCase> cls, String str) {
        this(cls);
        setName(str);
    }

    public TestSuite(String str) {
        this.f79133b = new Vector<>(10);
        setName(str);
    }

    public TestSuite(Class<?>... clsArr) {
        this.f79133b = new Vector<>(10);
        for (Class<?> cls : clsArr) {
            addTest(TestCase.class.isAssignableFrom(cls) ? new TestSuite(cls.asSubclass(TestCase.class)) : warning(cls.getCanonicalName() + " does not extend TestCase"));
        }
    }

    public TestSuite(Class<? extends TestCase>[] clsArr, String str) {
        this(clsArr);
        setName(str);
    }
}
