package junit.framework;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public class Assert {
    public static void assertEquals(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            failNotEquals(str, obj, obj2);
        }
    }

    public static void assertFalse(String str, boolean z10) {
        assertTrue(str, !z10);
    }

    public static void assertNotNull(Object obj) {
        assertNotNull(null, obj);
    }

    public static void assertNotSame(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            failSame(str);
        }
    }

    public static void assertNull(Object obj) {
        if (obj != null) {
            assertNull("Expected: <null> but was: " + obj.toString(), obj);
        }
    }

    public static void assertSame(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            return;
        }
        failNotSame(str, obj, obj2);
    }

    public static void assertTrue(String str, boolean z10) {
        if (z10) {
            return;
        }
        fail(str);
    }

    public static void fail(String str) {
        if (str != null) {
            throw new AssertionFailedError(str);
        }
        throw new AssertionFailedError();
    }

    public static void failNotEquals(String str, Object obj, Object obj2) {
        fail(format(str, obj, obj2));
    }

    public static void failNotSame(String str, Object obj, Object obj2) {
        fail((str != null ? str.concat(" ") : "") + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static void failSame(String str) {
        fail((str != null ? str.concat(" ") : "") + "expected not same");
    }

    public static String format(String str, Object obj, Object obj2) {
        return ((str == null || str.length() <= 0) ? "" : str.concat(" ")) + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }

    public static void assertFalse(boolean z10) {
        assertFalse(null, z10);
    }

    public static void assertNotNull(String str, Object obj) {
        assertTrue(str, obj != null);
    }

    public static void assertNotSame(Object obj, Object obj2) {
        assertNotSame(null, obj, obj2);
    }

    public static void assertNull(String str, Object obj) {
        assertTrue(str, obj == null);
    }

    public static void assertSame(Object obj, Object obj2) {
        assertSame(null, obj, obj2);
    }

    public static void assertTrue(boolean z10) {
        assertTrue(null, z10);
    }

    public static void assertEquals(Object obj, Object obj2) {
        assertEquals((String) null, obj, obj2);
    }

    public static void fail() {
        fail(null);
    }

    public static void assertEquals(String str, String str2, String str3) {
        if (str2 == null && str3 == null) {
            return;
        }
        if (str2 == null || !str2.equals(str3)) {
            if (str == null) {
                str = "";
            }
            throw new ComparisonFailure(str, str2, str3);
        }
    }

    public static void assertEquals(String str, String str2) {
        assertEquals((String) null, str, str2);
    }

    public static void assertEquals(String str, double d2, double d3, double d7) {
        if (Double.compare(d2, d3) != 0 && Math.abs(d2 - d3) > d7) {
            failNotEquals(str, Double.valueOf(d2), Double.valueOf(d3));
        }
    }

    public static void assertEquals(double d2, double d3, double d7) {
        assertEquals((String) null, d2, d3, d7);
    }

    public static void assertEquals(String str, float f6, float f10, float f11) {
        if (Float.compare(f6, f10) != 0 && Math.abs(f6 - f10) > f11) {
            failNotEquals(str, Float.valueOf(f6), Float.valueOf(f10));
        }
    }

    public static void assertEquals(float f6, float f10, float f11) {
        assertEquals((String) null, f6, f10, f11);
    }

    public static void assertEquals(String str, long j10, long j11) {
        assertEquals(str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static void assertEquals(long j10, long j11) {
        assertEquals((String) null, j10, j11);
    }

    public static void assertEquals(String str, boolean z10, boolean z11) {
        assertEquals(str, Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    public static void assertEquals(boolean z10, boolean z11) {
        assertEquals((String) null, z10, z11);
    }

    public static void assertEquals(String str, byte b10, byte b11) {
        assertEquals(str, Byte.valueOf(b10), Byte.valueOf(b11));
    }

    public static void assertEquals(byte b10, byte b11) {
        assertEquals((String) null, b10, b11);
    }

    public static void assertEquals(String str, char c10, char c11) {
        assertEquals(str, Character.valueOf(c10), Character.valueOf(c11));
    }

    public static void assertEquals(char c10, char c11) {
        assertEquals((String) null, c10, c11);
    }

    public static void assertEquals(String str, short s4, short s7) {
        assertEquals(str, Short.valueOf(s4), Short.valueOf(s7));
    }

    public static void assertEquals(short s4, short s7) {
        assertEquals((String) null, s4, s7);
    }

    public static void assertEquals(String str, int i10, int i11) {
        assertEquals(str, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static void assertEquals(int i10, int i11) {
        assertEquals((String) null, i10, i11);
    }
}
