package org.junit.internal;

import gn.a;
import java.lang.reflect.Array;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;
import org.junit.Assert;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ComparisonCriteria {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f91846a = new a("end of array");

    public static String b(Class cls) {
        Class<?> componentType = cls.getComponentType();
        if (!componentType.isArray()) {
            return componentType.getName();
        }
        return b(componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public static Object c(int i10, int i11, Object obj) {
        if (i11 >= i10) {
            return f91846a;
        }
        Object obj2 = Array.get(obj, i11);
        if (obj2 == null || !obj2.getClass().isArray()) {
            return obj2;
        }
        return new a(b(obj2.getClass()) + Constant.BRACKET_OPEN + Array.getLength(obj2) + Constant.BRACKET_CLOSE);
    }

    public final void a(String str, Object obj, Object obj2, boolean z10) throws ArrayComparisonFailure {
        if (obj == obj2 || Arrays.deepEquals(new Object[]{obj}, new Object[]{obj2})) {
            return;
        }
        String strConcat = str == null ? "" : str.concat(": ");
        String str2 = z10 ? strConcat : "";
        if (obj == null) {
            Assert.fail(str2 + "expected array was null");
        }
        if (obj2 == null) {
            Assert.fail(str2 + "actual array was null");
        }
        int length = Array.getLength(obj2);
        int length2 = Array.getLength(obj);
        if (length != length2) {
            strConcat = strConcat + "array lengths differed, expected.length=" + length2 + " actual.length=" + length + "; ";
        }
        int iMin = Math.min(length, length2);
        for (int i10 = 0; i10 < iMin; i10++) {
            Object obj3 = Array.get(obj, i10);
            Object obj4 = Array.get(obj2, i10);
            if (obj3 == null || !obj3.getClass().isArray() || obj4 == null || !obj4.getClass().isArray()) {
                try {
                    assertElementsEqual(obj3, obj4);
                } catch (AssertionError e5) {
                    throw new ArrayComparisonFailure(strConcat, e5, i10);
                }
            } else {
                try {
                    a(str, obj3, obj4, false);
                } catch (ArrayComparisonFailure e7) {
                    e7.addDimension(i10);
                    throw e7;
                } catch (AssertionError e10) {
                    throw new ArrayComparisonFailure(strConcat, e10, i10);
                }
            }
        }
        if (length != length2) {
            try {
                Assert.assertEquals(c(length2, iMin, obj), c(length, iMin, obj2));
            } catch (AssertionError e11) {
                throw new ArrayComparisonFailure(strConcat, e11, iMin);
            }
        }
    }

    public void arrayEquals(String str, Object obj, Object obj2) throws ArrayComparisonFailure {
        a(str, obj, obj2, true);
    }

    public abstract void assertElementsEqual(Object obj, Object obj2);
}
