package org.junit;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.function.ThrowingRunnable;
import org.junit.internal.ArrayComparisonFailure;
import org.junit.internal.ExactComparisonCriteria;
import org.junit.internal.InexactComparisonCriteria;

/* JADX INFO: loaded from: classes13.dex */
public class Assert {
    public static void a(Object obj, String str) {
        fail((str != null ? str.concat(". ") : "Values should be different. ") + "Actual: " + obj);
    }

    public static void assertArrayEquals(String str, Object[] objArr, Object[] objArr2) throws ArrayComparisonFailure {
        d(objArr, str, objArr2);
    }

    public static void assertEquals(String str, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return;
            }
        } else if (obj.equals(obj2)) {
            return;
        }
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            fail(b(str, obj, obj2));
        } else {
            if (str == null) {
                str = "";
            }
            throw new ComparisonFailure(str, (String) obj, (String) obj2);
        }
    }

    public static void assertFalse(String str, boolean z10) {
        assertTrue(str, !z10);
    }

    public static void assertNotEquals(String str, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return;
            }
        } else if (!obj.equals(obj2)) {
            return;
        }
        a(obj2, str);
    }

    public static void assertNotNull(String str, Object obj) {
        assertTrue(str, obj != null);
    }

    public static void assertNotSame(Object obj, Object obj2) {
        assertNotSame(null, obj, obj2);
    }

    public static void assertNull(Object obj) {
        assertNull(null, obj);
    }

    public static void assertSame(Object obj, Object obj2) {
        assertSame(null, obj, obj2);
    }

    @Deprecated
    public static <T> void assertThat(T t10, Matcher<? super T> matcher) {
        assertThat("", t10, matcher);
    }

    public static <T extends Throwable> T assertThrows(Class<T> cls, ThrowingRunnable throwingRunnable) {
        return (T) assertThrows(null, cls, throwingRunnable);
    }

    public static void assertTrue(String str, boolean z10) {
        if (z10) {
            return;
        }
        fail(str);
    }

    public static String b(String str, Object obj, Object obj2) {
        String strConcat = "";
        if (str != null && !"".equals(str)) {
            strConcat = str.concat(" ");
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        if (strValueOf.equals(strValueOf2)) {
            StringBuilder sbE = f.e(strConcat, "expected: ");
            sbE.append(c(obj, strValueOf));
            sbE.append(" but was: ");
            sbE.append(c(obj2, strValueOf2));
            return sbE.toString();
        }
        return strConcat + "expected:<" + strValueOf + "> but was:<" + strValueOf2 + ">";
    }

    public static String c(Object obj, String str) {
        return (obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName()) + "<" + str + ">";
    }

    public static void d(Object obj, String str, Object obj2) throws ArrayComparisonFailure {
        new ExactComparisonCriteria().arrayEquals(str, obj, obj2);
    }

    public static void fail(String str) {
        if (str != null) {
            throw new AssertionError(str);
        }
        throw new AssertionError();
    }

    public static void assertArrayEquals(Object[] objArr, Object[] objArr2) {
        assertArrayEquals((String) null, objArr, objArr2);
    }

    public static void assertFalse(boolean z10) {
        assertFalse(null, z10);
    }

    public static void assertNotNull(Object obj) {
        assertNotNull(null, obj);
    }

    public static void assertNotSame(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            fail((str != null ? str.concat(" ") : "") + "expected not same");
        }
    }

    public static void assertNull(String str, Object obj) {
        if (obj == null) {
            return;
        }
        fail((str != null ? str.concat(" ") : "") + "expected null, but was:<" + obj + ">");
    }

    public static void assertSame(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            return;
        }
        fail((str != null ? str.concat(" ") : "") + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    @Deprecated
    public static <T> void assertThat(String str, T t10, Matcher<? super T> matcher) {
        MatcherAssert.assertThat(str, t10, matcher);
    }

    public static <T extends Throwable> T assertThrows(String str, Class<T> cls, ThrowingRunnable throwingRunnable) {
        String strConcat = "";
        try {
            throwingRunnable.run();
            StringBuilder sb2 = new StringBuilder();
            if (str != null && str.length() != 0) {
                strConcat = str.concat(": ");
            }
            sb2.append(strConcat);
            Object[] objArr = new Object[1];
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null) {
                canonicalName = cls.getName();
            }
            objArr[0] = canonicalName;
            throw new AssertionError(u.h("expected %s to be thrown, but nothing was thrown", objArr, sb2));
        } catch (Throwable th2) {
            if (cls.isInstance(th2)) {
                return th2;
            }
            String canonicalName2 = cls.getCanonicalName();
            if (canonicalName2 == null) {
                canonicalName2 = cls.getName();
            }
            Class<?> cls2 = th2.getClass();
            String canonicalName3 = cls2.getCanonicalName();
            if (canonicalName3 == null) {
                canonicalName3 = cls2.getName();
            }
            if (canonicalName2.equals(canonicalName3)) {
                StringBuilder sbE = f.e(canonicalName2, "@");
                sbE.append(Integer.toHexString(System.identityHashCode(cls)));
                canonicalName2 = sbE.toString();
                StringBuilder sbE2 = f.e(canonicalName3, "@");
                sbE2.append(Integer.toHexString(System.identityHashCode(cls2)));
                canonicalName3 = sbE2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            if (str != null && str.length() != 0) {
                strConcat = str.concat(": ");
            }
            sb3.append(strConcat);
            sb3.append(b("unexpected exception type thrown;", canonicalName2, canonicalName3));
            AssertionError assertionError = new AssertionError(sb3.toString());
            assertionError.initCause(th2);
            throw assertionError;
        }
    }

    public static void assertTrue(boolean z10) {
        assertTrue(null, z10);
    }

    public static void assertArrayEquals(String str, boolean[] zArr, boolean[] zArr2) throws ArrayComparisonFailure {
        d(zArr, str, zArr2);
    }

    public static void assertNotEquals(Object obj, Object obj2) {
        assertNotEquals((String) null, obj, obj2);
    }

    public static void fail() {
        fail(null);
    }

    public static void assertArrayEquals(boolean[] zArr, boolean[] zArr2) {
        assertArrayEquals((String) null, zArr, zArr2);
    }

    public static void assertNotEquals(String str, long j10, long j11) {
        if (j10 == j11) {
            a(Long.valueOf(j11), str);
        }
    }

    public static void assertArrayEquals(String str, byte[] bArr, byte[] bArr2) throws ArrayComparisonFailure {
        d(bArr, str, bArr2);
    }

    public static void assertEquals(Object obj, Object obj2) {
        assertEquals((String) null, obj, obj2);
    }

    public static void assertNotEquals(long j10, long j11) {
        assertNotEquals((String) null, j10, j11);
    }

    public static void assertArrayEquals(byte[] bArr, byte[] bArr2) {
        assertArrayEquals((String) null, bArr, bArr2);
    }

    public static void assertEquals(String str, double d2, double d3, double d7) {
        if (Double.compare(d2, d3) != 0 && Math.abs(d2 - d3) > d7) {
            fail(b(str, Double.valueOf(d2), Double.valueOf(d3)));
        }
    }

    public static void assertNotEquals(double d2, double d3, double d7) {
        assertNotEquals((String) null, d2, d3, d7);
    }

    public static void assertArrayEquals(String str, char[] cArr, char[] cArr2) throws ArrayComparisonFailure {
        d(cArr, str, cArr2);
    }

    public static void assertNotEquals(float f6, float f10, float f11) {
        assertNotEquals((String) null, f6, f10, f11);
    }

    public static void assertArrayEquals(char[] cArr, char[] cArr2) {
        assertArrayEquals((String) null, cArr, cArr2);
    }

    public static void assertNotEquals(String str, double d2, double d3, double d7) {
        if (Double.compare(d2, d3) != 0 && Math.abs(d2 - d3) > d7) {
            return;
        }
        a(Double.valueOf(d3), str);
    }

    public static void assertArrayEquals(String str, short[] sArr, short[] sArr2) throws ArrayComparisonFailure {
        d(sArr, str, sArr2);
    }

    public static void assertArrayEquals(short[] sArr, short[] sArr2) {
        assertArrayEquals((String) null, sArr, sArr2);
    }

    public static void assertEquals(String str, float f6, float f10, float f11) {
        if (Float.compare(f6, f10) != 0 && Math.abs(f6 - f10) > f11) {
            fail(b(str, Float.valueOf(f6), Float.valueOf(f10)));
        }
    }

    public static void assertArrayEquals(String str, int[] iArr, int[] iArr2) throws ArrayComparisonFailure {
        d(iArr, str, iArr2);
    }

    public static void assertNotEquals(String str, float f6, float f10, float f11) {
        if (Float.compare(f6, f10) != 0 && Math.abs(f6 - f10) > f11) {
            return;
        }
        a(Float.valueOf(f10), str);
    }

    public static void assertArrayEquals(int[] iArr, int[] iArr2) {
        assertArrayEquals((String) null, iArr, iArr2);
    }

    public static void assertArrayEquals(String str, long[] jArr, long[] jArr2) throws ArrayComparisonFailure {
        d(jArr, str, jArr2);
    }

    public static void assertArrayEquals(long[] jArr, long[] jArr2) {
        assertArrayEquals((String) null, jArr, jArr2);
    }

    public static void assertEquals(long j10, long j11) {
        assertEquals((String) null, j10, j11);
    }

    public static void assertArrayEquals(String str, double[] dArr, double[] dArr2, double d2) throws ArrayComparisonFailure {
        new InexactComparisonCriteria(d2).arrayEquals(str, dArr, dArr2);
    }

    public static void assertEquals(String str, long j10, long j11) {
        if (j10 != j11) {
            fail(b(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void assertArrayEquals(double[] dArr, double[] dArr2, double d2) {
        assertArrayEquals((String) null, dArr, dArr2, d2);
    }

    public static void assertArrayEquals(String str, float[] fArr, float[] fArr2, float f6) throws ArrayComparisonFailure {
        new InexactComparisonCriteria(f6).arrayEquals(str, fArr, fArr2);
    }

    @Deprecated
    public static void assertEquals(double d2, double d3) {
        assertEquals((String) null, d2, d3);
    }

    public static void assertArrayEquals(float[] fArr, float[] fArr2, float f6) {
        assertArrayEquals((String) null, fArr, fArr2, f6);
    }

    @Deprecated
    public static void assertEquals(String str, double d2, double d3) {
        fail("Use assertEquals(expected, actual, delta) to compare floating-point numbers");
    }

    public static void assertEquals(double d2, double d3, double d7) {
        assertEquals((String) null, d2, d3, d7);
    }

    public static void assertEquals(float f6, float f10, float f11) {
        assertEquals((String) null, f6, f10, f11);
    }

    @Deprecated
    public static void assertEquals(String str, Object[] objArr, Object[] objArr2) {
        assertArrayEquals(str, objArr, objArr2);
    }

    @Deprecated
    public static void assertEquals(Object[] objArr, Object[] objArr2) {
        assertArrayEquals(objArr, objArr2);
    }
}
