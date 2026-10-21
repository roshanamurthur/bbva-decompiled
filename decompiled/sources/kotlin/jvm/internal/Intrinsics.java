package kotlin.jvm.internal;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class Intrinsics {

    @SinceKotlin(version = "1.4")
    public static class Kotlin {
    }

    private Intrinsics() {
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void checkExpressionValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(u.f(str, " must not be null"))));
        }
    }

    public static void checkFieldIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(androidx.camera.core.impl.utils.c.a("Field specified as non-null is null: ", str, Constant.DOT_STRING, str2))));
        }
    }

    public static void checkHasClass(String str) throws ClassNotFoundException {
        String strReplace = str.replace(JsonPointer.SEPARATOR, '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e5) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException(h0.b("Class ", strReplace, " is not found. Please update the Kotlin runtime to the latest version"), e5)));
        }
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throwJavaNpe();
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(u.f(str, " must not be null"))));
        }
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullNPE(str);
        }
    }

    public static void checkParameterIsNotNull(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullIAE(str);
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(androidx.camera.core.impl.utils.c.a("Method specified as non-null returned null: ", str, Constant.DOT_STRING, str2))));
        }
    }

    public static int compare(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    private static String createParameterIsNullExceptionMessage(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), Constant.DOT_STRING, stackTraceElement.getMethodName(), ", parameter ");
        sbC.append(str);
        return sbC.toString();
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i10, String str) {
        throwUndefinedForReified();
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t10) {
        return (T) sanitizeStackTrace(t10, Intrinsics.class.getName());
    }

    public static String stringPlus(String str, Object obj) {
        return str + obj;
    }

    public static void throwAssert() {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError()));
    }

    public static void throwIllegalArgument() {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException()));
    }

    public static void throwIllegalState() {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException()));
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe() {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException()));
    }

    public static void throwNpe() {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException()));
    }

    private static void throwParameterIsNullIAE(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(createParameterIsNullExceptionMessage(str))));
    }

    private static void throwParameterIsNullNPE(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(createParameterIsNullExceptionMessage(str))));
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUninitializedProperty(String str) {
        throw ((UninitializedPropertyAccessException) sanitizeStackTrace(new UninitializedPropertyAccessException(str)));
    }

    public static void throwUninitializedPropertyAccessException(String str) {
        throwUninitializedProperty("lateinit property " + str + " has not been initialized");
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double d2, Double d3) {
        if (d2 == null) {
            if (d3 != null) {
                return false;
            }
        } else if (d3 == null || d2.doubleValue() != d3.doubleValue()) {
            return false;
        }
        return true;
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throwJavaNpe(str);
        }
    }

    public static int compare(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static void needClassReification(String str) {
        throwUndefinedForReified(str);
    }

    public static void reifiedOperationMarker(int i10, String str, String str2) {
        throwUndefinedForReified(str2);
    }

    public static <T extends Throwable> T sanitizeStackTrace(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static void throwAssert(String str) {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(str)));
    }

    public static void throwIllegalArgument(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
    }

    public static void throwIllegalState(String str) {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str)));
    }

    public static void throwNpe(String str) {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException(str)));
    }

    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double d2, double d3) {
        return d2 != null && d2.doubleValue() == d3;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(double d2, Double d3) {
        return d3 != null && d2 == d3.doubleValue();
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float f6, Float f10) {
        if (f6 == null) {
            if (f10 != null) {
                return false;
            }
        } else if (f10 == null || f6.floatValue() != f10.floatValue()) {
            return false;
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float f6, float f10) {
        return f6 != null && f6.floatValue() == f10;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(float f6, Float f10) {
        return f10 != null && f6 == f10.floatValue();
    }

    public static void checkFieldIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkHasClass(String str, String str2) throws ClassNotFoundException {
        String strReplace = str.replace(JsonPointer.SEPARATOR, '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e5) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException(androidx.camera.core.impl.utils.c.a("Class ", strReplace, " is not found: this code requires the Kotlin runtime of version at least ", str2), e5)));
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }
}
