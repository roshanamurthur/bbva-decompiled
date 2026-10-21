package junit.framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes12.dex */
public abstract class TestCase extends Assert implements Test {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f79129a;

    public TestCase() {
        this.f79129a = null;
    }

    public static void assertEquals(String str, Object obj, Object obj2) {
        Assert.assertEquals(str, obj, obj2);
    }

    public static void assertFalse(String str, boolean z10) {
        Assert.assertFalse(str, z10);
    }

    public static void assertNotNull(Object obj) {
        Assert.assertNotNull(obj);
    }

    public static void assertNotSame(String str, Object obj, Object obj2) {
        Assert.assertNotSame(str, obj, obj2);
    }

    public static void assertNull(Object obj) {
        Assert.assertNull(obj);
    }

    public static void assertSame(String str, Object obj, Object obj2) {
        Assert.assertSame(str, obj, obj2);
    }

    public static void assertTrue(String str, boolean z10) {
        Assert.assertTrue(str, z10);
    }

    public static void fail(String str) {
        Assert.fail(str);
    }

    public static void failNotEquals(String str, Object obj, Object obj2) {
        Assert.failNotEquals(str, obj, obj2);
    }

    public static void failNotSame(String str, Object obj, Object obj2) {
        Assert.failNotSame(str, obj, obj2);
    }

    public static void failSame(String str) {
        Assert.failSame(str);
    }

    public static String format(String str, Object obj, Object obj2) {
        return Assert.format(str, obj, obj2);
    }

    @Override // junit.framework.Test
    public int countTestCases() {
        return 1;
    }

    public TestResult createResult() {
        return new TestResult();
    }

    public String getName() {
        return this.f79129a;
    }

    public TestResult run() {
        TestResult testResultCreateResult = createResult();
        run(testResultCreateResult);
        return testResultCreateResult;
    }

    public void runBare() throws Throwable {
        setUp();
        try {
            runTest();
            try {
                tearDown();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                tearDown();
            } catch (Throwable unused) {
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public void runTest() throws Throwable {
        assertNotNull("TestCase.fName cannot be null", this.f79129a);
        Method method = null;
        try {
            method = getClass().getMethod(this.f79129a, null);
        } catch (NoSuchMethodException unused) {
            fail("Method \"" + this.f79129a + "\" not found");
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            fail("Method \"" + this.f79129a + "\" should be public");
        }
        try {
            method.invoke(this, new Object[0]);
        } catch (IllegalAccessException e5) {
            e5.fillInStackTrace();
            throw e5;
        } catch (InvocationTargetException e7) {
            e7.fillInStackTrace();
            throw e7.getTargetException();
        }
    }

    public void setName(String str) {
        this.f79129a = str;
    }

    public String toString() {
        return getName() + "(" + getClass().getName() + ")";
    }

    public static void assertEquals(Object obj, Object obj2) {
        Assert.assertEquals(obj, obj2);
    }

    public static void assertFalse(boolean z10) {
        Assert.assertFalse(z10);
    }

    public static void assertNotNull(String str, Object obj) {
        Assert.assertNotNull(str, obj);
    }

    public static void assertNotSame(Object obj, Object obj2) {
        Assert.assertNotSame(obj, obj2);
    }

    public static void assertNull(String str, Object obj) {
        Assert.assertNull(str, obj);
    }

    public static void assertSame(Object obj, Object obj2) {
        Assert.assertSame(obj, obj2);
    }

    public static void assertTrue(boolean z10) {
        Assert.assertTrue(z10);
    }

    public static void fail() {
        Assert.fail();
    }

    public TestCase(String str) {
        this.f79129a = str;
    }

    public static void assertEquals(String str, String str2, String str3) {
        Assert.assertEquals(str, str2, str3);
    }

    @Override // junit.framework.Test
    public void run(TestResult testResult) {
        testResult.run(this);
    }

    public static void assertEquals(String str, String str2) {
        Assert.assertEquals(str, str2);
    }

    public static void assertEquals(String str, double d2, double d3, double d7) {
        Assert.assertEquals(str, d2, d3, d7);
    }

    public static void assertEquals(double d2, double d3, double d7) {
        Assert.assertEquals(d2, d3, d7);
    }

    public static void assertEquals(String str, float f6, float f10, float f11) {
        Assert.assertEquals(str, f6, f10, f11);
    }

    public static void assertEquals(float f6, float f10, float f11) {
        Assert.assertEquals(f6, f10, f11);
    }

    public static void assertEquals(String str, long j10, long j11) {
        Assert.assertEquals(str, j10, j11);
    }

    public static void assertEquals(long j10, long j11) {
        Assert.assertEquals(j10, j11);
    }

    public static void assertEquals(String str, boolean z10, boolean z11) {
        Assert.assertEquals(str, z10, z11);
    }

    public static void assertEquals(boolean z10, boolean z11) {
        Assert.assertEquals(z10, z11);
    }

    public static void assertEquals(String str, byte b10, byte b11) {
        Assert.assertEquals(str, b10, b11);
    }

    public static void assertEquals(byte b10, byte b11) {
        Assert.assertEquals(b10, b11);
    }

    public static void assertEquals(String str, char c10, char c11) {
        Assert.assertEquals(str, c10, c11);
    }

    public static void assertEquals(char c10, char c11) {
        Assert.assertEquals(c10, c11);
    }

    public static void assertEquals(String str, short s4, short s7) {
        Assert.assertEquals(str, s4, s7);
    }

    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }

    public static void assertEquals(short s4, short s7) {
        Assert.assertEquals(s4, s7);
    }

    public static void assertEquals(String str, int i10, int i11) {
        Assert.assertEquals(str, i10, i11);
    }

    public static void assertEquals(int i10, int i11) {
        Assert.assertEquals(i10, i11);
    }
}
