package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class WrappedValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f82119a = new a();
    public static volatile boolean throwWrappedProcessCanceledException = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    public static class a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f82120a;

        public b(Throwable th2) {
            if (th2 != null) {
                this.f82120a = th2;
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @NotNull
        public Throwable getThrowable() {
            Throwable th2 = this.f82120a;
            if (th2 != null) {
                return th2;
            }
            a(1);
            throw null;
        }

        public String toString() {
            return this.f82120a.toString();
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i10 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i10 == 1 || i10 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i10 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static <V> Object escapeNull(@Nullable V v3) {
        return v3 == null ? f82119a : v3;
    }

    @NotNull
    public static Object escapeThrowable(@NotNull Throwable th2) {
        if (th2 != null) {
            return new b(th2);
        }
        a(3);
        throw null;
    }

    @Nullable
    public static <V> V unescapeExceptionOrNull(@NotNull Object obj) {
        if (obj != null) {
            return (V) unescapeNull(unescapeThrowable(obj));
        }
        a(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <V> V unescapeNull(@NotNull Object obj) {
        if (obj == 0) {
            a(0);
            throw null;
        }
        if (obj == f82119a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <V> V unescapeThrowable(@Nullable Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable throwable = ((b) obj).getThrowable();
        if (throwWrappedProcessCanceledException && ExceptionUtilsKt.isProcessCanceledException(throwable)) {
            throw new WrappedProcessCanceledException(throwable);
        }
        throw ExceptionUtilsKt.rethrow(throwable);
    }
}
