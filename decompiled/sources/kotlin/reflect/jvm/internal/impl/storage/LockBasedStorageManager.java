package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class LockBasedStorageManager implements StorageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExceptionHandlingStrategy f81860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81861b;
    protected final SimpleLock lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f81859c = StringsKt__StringsKt.substringBeforeLast(LockBasedStorageManager.class.getCanonicalName(), Constant.DOT_STRING, "");
    public static final StorageManager NO_LOCKS = new a("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE);

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new a();

        public static class a implements ExceptionHandlingStrategy {
            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            @NotNull
            public RuntimeException handleException(@NotNull Throwable th2) {
                if (th2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
                }
                throw ExceptionUtilsKt.rethrow(th2);
            }
        }

        @NotNull
        RuntimeException handleException(@NotNull Throwable th2);
    }

    public static class a extends LockBasedStorageManager {
        public static /* synthetic */ void a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        @NotNull
        public final <K, V> n<V> recursionDetectedDefault(@NotNull String str, K k10) {
            if (str == null) {
                a(0);
                throw null;
            }
            n<V> nVarFallThrough = n.fallThrough();
            if (nVarFallThrough != null) {
                return nVarFallThrough;
            }
            a(1);
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends i<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Object f81862s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Object obj) {
            super(lockBasedStorageManager, function0);
            this.f81862s0 = obj;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        @NotNull
        public final n<T> c(boolean z10) {
            n<T> nVarValue = n.value(this.f81862s0);
            if (nVarValue != null) {
                return nVarValue;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> extends j<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1 f81863t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function1 f81864u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function2) {
            super(lockBasedStorageManager, function0);
            this.f81863t0 = function1;
            this.f81864u0 = function2;
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        @NotNull
        public final n<T> c(boolean z10) {
            Function1 function1 = this.f81863t0;
            if (function1 == null) {
                n<T> nVarC = super.c(z10);
                if (nVarC != null) {
                    return nVarC;
                }
                a(0);
                throw null;
            }
            n<T> nVarValue = n.value(function1.invoke(Boolean.valueOf(z10)));
            if (nVarValue != null) {
                return nVarValue;
            }
            a(1);
            throw null;
        }
    }

    public static class d<K, V> extends e<K, V> implements CacheWithNotNullValues<K, V> {
        public static /* synthetic */ void a(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.e, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        @NotNull
        public V computeIfAbsent(K k10, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                a(2);
                throw null;
            }
            V v3 = (V) super.computeIfAbsent(k10, function0);
            if (v3 != null) {
                return v3;
            }
            a(3);
            throw null;
        }
    }

    public static class e<K, V> extends k<f<K, V>, V> implements CacheWithNullableValues<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap, new kotlin.reflect.jvm.internal.impl.storage.a());
            if (lockBasedStorageManager != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Nullable
        public V computeIfAbsent(K k10, @NotNull Function0<? extends V> function0) {
            if (function0 != null) {
                return invoke(new f(k10, function0));
            }
            a(2);
            throw null;
        }
    }

    public static class f<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f81865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0<? extends V> f81866b;

        public f(K k10, Function0<? extends V> function0) {
            this.f81865a = k10;
            this.f81866b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && f.class == obj.getClass() && this.f81865a.equals(((f) obj).f81865a);
        }

        public int hashCode() {
            return this.f81865a.hashCode();
        }
    }

    public static abstract class h<T> extends g<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @Nullable
        public volatile kotlin.reflect.jvm.internal.impl.storage.b<T> f81870s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            if (function0 == null) {
                a(1);
                throw null;
            }
            this.f81870s0 = null;
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        public final void b(T t10) {
            this.f81870s0 = new kotlin.reflect.jvm.internal.impl.storage.b<>(t10);
            try {
                c cVar = (c) this;
                if (t10 == null) {
                    c.a(2);
                    throw null;
                }
                cVar.f81864u0.invoke(t10);
                this.f81870s0 = null;
            } catch (Throwable th2) {
                this.f81870s0 = null;
                throw th2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        public T invoke() {
            kotlin.reflect.jvm.internal.impl.storage.b<T> bVar = this.f81870s0;
            return (bVar == null || !bVar.hasValue()) ? (T) super.invoke() : bVar.getValue();
        }
    }

    public static class i<T> extends g<T> implements NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            if (function0 != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 != null) {
                return t10;
            }
            a(2);
            throw null;
        }
    }

    public static abstract class j<T> extends h<T> implements NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            if (function0 != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 != null) {
                return t10;
            }
            a(2);
            throw null;
        }
    }

    public static class k<K, V> implements MemoizedFunctionToNullable<K, V> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final LockBasedStorageManager f81871p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ConcurrentMap<K, Object> f81872q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function1<? super K, ? extends V> f81873r0;

        public k(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            if (concurrentMap == null) {
                a(1);
                throw null;
            }
            if (function1 == null) {
                a(2);
                throw null;
            }
            this.f81871p0 = lockBasedStorageManager;
            this.f81872q0 = concurrentMap;
            this.f81873r0 = function1;
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public final AssertionError b(K k10, Object obj) {
            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + m.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k10 + " under " + this.f81871p0);
            LockBasedStorageManager.b(assertionError);
            return assertionError;
        }

        @NotNull
        public final AssertionError c(K k10, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.f81871p0);
            LockBasedStorageManager.b(assertionError);
            return assertionError;
        }

        public final AssertionError d(K k10, Throwable th2) {
            AssertionError assertionError = new AssertionError("Unable to remove " + k10 + " under " + this.f81871p0, th2);
            LockBasedStorageManager.b(assertionError);
            return assertionError;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0043 A[Catch: all -> 0x003c, PHI: r2
          0x0043: PHI (r2v2 java.lang.Object) = (r2v1 java.lang.Object), (r2v7 java.lang.Object) binds: [B:11:0x0022, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x003c, blocks: (B:9:0x0018, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:21:0x003f, B:22:0x0042, B:23:0x0043, B:25:0x0047, B:27:0x004d, B:29:0x0053, B:30:0x0058, B:31:0x005b, B:33:0x005e, B:42:0x0082, B:45:0x008c, B:47:0x0090, B:48:0x0094, B:49:0x0095, B:50:0x0097, B:56:0x00a2, B:58:0x00ae, B:59:0x00b2, B:60:0x00b3, B:61:0x00b7, B:63:0x00bb, B:64:0x00bf, B:66:0x00c1, B:67:0x00c5, B:52:0x0099, B:53:0x009d, B:62:0x00b8, B:35:0x0063, B:39:0x007c, B:40:0x0080, B:44:0x0088), top: B:76:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:9:0x0018, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:21:0x003f, B:22:0x0042, B:23:0x0043, B:25:0x0047, B:27:0x004d, B:29:0x0053, B:30:0x0058, B:31:0x005b, B:33:0x005e, B:42:0x0082, B:45:0x008c, B:47:0x0090, B:48:0x0094, B:49:0x0095, B:50:0x0097, B:56:0x00a2, B:58:0x00ae, B:59:0x00b2, B:60:0x00b3, B:61:0x00b7, B:63:0x00bb, B:64:0x00bf, B:66:0x00c1, B:67:0x00c5, B:52:0x0099, B:53:0x009d, B:62:0x00b8, B:35:0x0063, B:39:0x007c, B:40:0x0080, B:44:0x0088), top: B:76:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x004d A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:9:0x0018, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:21:0x003f, B:22:0x0042, B:23:0x0043, B:25:0x0047, B:27:0x004d, B:29:0x0053, B:30:0x0058, B:31:0x005b, B:33:0x005e, B:42:0x0082, B:45:0x008c, B:47:0x0090, B:48:0x0094, B:49:0x0095, B:50:0x0097, B:56:0x00a2, B:58:0x00ae, B:59:0x00b2, B:60:0x00b3, B:61:0x00b7, B:63:0x00bb, B:64:0x00bf, B:66:0x00c1, B:67:0x00c5, B:52:0x0099, B:53:0x009d, B:62:0x00b8, B:35:0x0063, B:39:0x007c, B:40:0x0080, B:44:0x0088), top: B:76:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0053 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:9:0x0018, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:21:0x003f, B:22:0x0042, B:23:0x0043, B:25:0x0047, B:27:0x004d, B:29:0x0053, B:30:0x0058, B:31:0x005b, B:33:0x005e, B:42:0x0082, B:45:0x008c, B:47:0x0090, B:48:0x0094, B:49:0x0095, B:50:0x0097, B:56:0x00a2, B:58:0x00ae, B:59:0x00b2, B:60:0x00b3, B:61:0x00b7, B:63:0x00bb, B:64:0x00bf, B:66:0x00c1, B:67:0x00c5, B:52:0x0099, B:53:0x009d, B:62:0x00b8, B:35:0x0063, B:39:0x007c, B:40:0x0080, B:44:0x0088), top: B:76:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0058 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:9:0x0018, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:21:0x003f, B:22:0x0042, B:23:0x0043, B:25:0x0047, B:27:0x004d, B:29:0x0053, B:30:0x0058, B:31:0x005b, B:33:0x005e, B:42:0x0082, B:45:0x008c, B:47:0x0090, B:48:0x0094, B:49:0x0095, B:50:0x0097, B:56:0x00a2, B:58:0x00ae, B:59:0x00b2, B:60:0x00b3, B:61:0x00b7, B:63:0x00bb, B:64:0x00bf, B:66:0x00c1, B:67:0x00c5, B:52:0x0099, B:53:0x009d, B:62:0x00b8, B:35:0x0063, B:39:0x007c, B:40:0x0080, B:44:0x0088), top: B:76:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x005c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:33:0x005e A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #3 {all -> 0x003c, blocks: (B:9:0x0018, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:21:0x003f, B:22:0x0042, B:23:0x0043, B:25:0x0047, B:27:0x004d, B:29:0x0053, B:30:0x0058, B:31:0x005b, B:33:0x005e, B:42:0x0082, B:45:0x008c, B:47:0x0090, B:48:0x0094, B:49:0x0095, B:50:0x0097, B:56:0x00a2, B:58:0x00ae, B:59:0x00b2, B:60:0x00b3, B:61:0x00b7, B:63:0x00bb, B:64:0x00bf, B:66:0x00c1, B:67:0x00c5, B:52:0x0099, B:53:0x009d, B:62:0x00b8, B:35:0x0063, B:39:0x007c, B:40:0x0080, B:44:0x0088), top: B:76:0x0018, inners: #0, #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0076  */
        /* JADX WARN: Code duplicated, block: B:39:0x007c A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #1 {all -> 0x0081, blocks: (B:35:0x0063, B:39:0x007c, B:40:0x0080), top: B:72:0x0063, outer: #3 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public V invoke(K k10) {
            V vInvoke;
            Object objPut;
            V value;
            n<V> nVarRecursionDetectedDefault;
            ConcurrentMap<K, Object> concurrentMap = this.f81872q0;
            Object obj = concurrentMap.get(k10);
            if (obj != null && obj != m.COMPUTING) {
                return (V) WrappedValues.unescapeExceptionOrNull(obj);
            }
            LockBasedStorageManager lockBasedStorageManager = this.f81871p0;
            lockBasedStorageManager.lock.lock();
            try {
                Object obj2 = concurrentMap.get(k10);
                m mVar = m.COMPUTING;
                AssertionError assertionErrorC = null;
                if (obj2 == mVar) {
                    obj2 = m.RECURSION_WAS_DETECTED;
                    n<V> nVarRecursionDetectedDefault2 = lockBasedStorageManager.recursionDetectedDefault("", k10);
                    if (nVarRecursionDetectedDefault2 == null) {
                        a(3);
                        throw null;
                    }
                    if (!nVarRecursionDetectedDefault2.isFallThrough()) {
                        value = nVarRecursionDetectedDefault2.getValue();
                    } else if (obj2 != m.RECURSION_WAS_DETECTED) {
                        nVarRecursionDetectedDefault = lockBasedStorageManager.recursionDetectedDefault("", k10);
                        if (nVarRecursionDetectedDefault != null) {
                            a(3);
                            throw null;
                        }
                        if (!nVarRecursionDetectedDefault.isFallThrough()) {
                            value = nVarRecursionDetectedDefault.getValue();
                        } else {
                            if (obj2 != null) {
                                concurrentMap.put(k10, mVar);
                                vInvoke = this.f81873r0.invoke(k10);
                                objPut = concurrentMap.put(k10, WrappedValues.escapeNull(vInvoke));
                                if (objPut == mVar) {
                                    lockBasedStorageManager.lock.unlock();
                                    return vInvoke;
                                }
                                assertionErrorC = c(k10, objPut);
                                throw assertionErrorC;
                                lockBasedStorageManager.lock.unlock();
                                throw th;
                            }
                            value = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            try {
                                concurrentMap.put(k10, mVar);
                                vInvoke = this.f81873r0.invoke(k10);
                                objPut = concurrentMap.put(k10, WrappedValues.escapeNull(vInvoke));
                                if (objPut == mVar) {
                                    lockBasedStorageManager.lock.unlock();
                                    return vInvoke;
                                }
                                assertionErrorC = c(k10, objPut);
                                throw assertionErrorC;
                            } catch (Throwable th2) {
                                if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                                    try {
                                        Object objRemove = concurrentMap.remove(k10);
                                        if (objRemove != m.COMPUTING) {
                                            throw b(k10, objRemove);
                                        }
                                        throw th2;
                                    } catch (Throwable th3) {
                                        throw d(k10, th3);
                                    }
                                }
                                ExceptionHandlingStrategy exceptionHandlingStrategy = lockBasedStorageManager.f81860a;
                                if (th2 != assertionErrorC) {
                                    Object objPut2 = concurrentMap.put(k10, WrappedValues.escapeThrowable(th2));
                                    if (objPut2 != m.COMPUTING) {
                                        throw c(k10, objPut2);
                                    }
                                    throw exceptionHandlingStrategy.handleException(th2);
                                }
                                try {
                                    concurrentMap.remove(k10);
                                    throw exceptionHandlingStrategy.handleException(th2);
                                } catch (Throwable th4) {
                                    throw d(k10, th4);
                                }
                            }
                            lockBasedStorageManager.lock.unlock();
                            throw th;
                        }
                        value = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                    }
                } else if (obj2 != m.RECURSION_WAS_DETECTED) {
                    nVarRecursionDetectedDefault = lockBasedStorageManager.recursionDetectedDefault("", k10);
                    if (nVarRecursionDetectedDefault != null) {
                        a(3);
                        throw null;
                    }
                    if (!nVarRecursionDetectedDefault.isFallThrough()) {
                        value = nVarRecursionDetectedDefault.getValue();
                    } else {
                        if (obj2 != null) {
                            concurrentMap.put(k10, mVar);
                            vInvoke = this.f81873r0.invoke(k10);
                            objPut = concurrentMap.put(k10, WrappedValues.escapeNull(vInvoke));
                            if (objPut == mVar) {
                                lockBasedStorageManager.lock.unlock();
                                return vInvoke;
                            }
                            assertionErrorC = c(k10, objPut);
                            throw assertionErrorC;
                            lockBasedStorageManager.lock.unlock();
                            throw th;
                        }
                        value = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        concurrentMap.put(k10, mVar);
                        vInvoke = this.f81873r0.invoke(k10);
                        objPut = concurrentMap.put(k10, WrappedValues.escapeNull(vInvoke));
                        if (objPut == mVar) {
                            lockBasedStorageManager.lock.unlock();
                            return vInvoke;
                        }
                        assertionErrorC = c(k10, objPut);
                        throw assertionErrorC;
                        lockBasedStorageManager.lock.unlock();
                        throw th;
                    }
                    value = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                }
                lockBasedStorageManager.lock.unlock();
                return value;
            } catch (Throwable th5) {
                lockBasedStorageManager.lock.unlock();
                throw th5;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean isComputed(K k10) {
            Object obj = this.f81872q0.get(k10);
            return (obj == null || obj == m.COMPUTING) ? false : true;
        }
    }

    public static class l<K, V> extends k<K, V> implements MemoizedFunctionToNotNull<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            if (concurrentMap == null) {
                a(1);
                throw null;
            }
            if (function1 != null) {
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.k, kotlin.jvm.functions.Function1
        @NotNull
        public V invoke(K k10) {
            V v3 = (V) super.invoke(k10);
            if (v3 != null) {
                return v3;
            }
            a(3);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class m {
        private static final /* synthetic */ m[] $VALUES;
        public static final m COMPUTING;
        public static final m NOT_COMPUTED;
        public static final m RECURSION_WAS_DETECTED;

        static {
            m mVar = new m("NOT_COMPUTED", 0);
            NOT_COMPUTED = mVar;
            m mVar2 = new m("COMPUTING", 1);
            COMPUTING = mVar2;
            m mVar3 = new m("RECURSION_WAS_DETECTED", 2);
            RECURSION_WAS_DETECTED = mVar3;
            $VALUES = new m[]{mVar, mVar2, mVar3};
        }

        public m() {
            throw null;
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) $VALUES.clone();
        }
    }

    public static class n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f81874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81875b;

        public n(T t10, boolean z10) {
            this.f81874a = t10;
            this.f81875b = z10;
        }

        @NotNull
        public static <T> n<T> fallThrough() {
            return new n<>(null, true);
        }

        @NotNull
        public static <T> n<T> value(T t10) {
            return new n<>(t10, false);
        }

        public T getValue() {
            return this.f81874a;
        }

        public boolean isFallThrough() {
            return this.f81875b;
        }

        public String toString() {
            return isFallThrough() ? "FALL_THROUGH" : String.valueOf(this.f81874a);
        }
    }

    public LockBasedStorageManager(@NotNull String str, @NotNull ExceptionHandlingStrategy exceptionHandlingStrategy, @NotNull SimpleLock simpleLock) {
        if (str == null) {
            a(4);
            throw null;
        }
        if (exceptionHandlingStrategy == null) {
            a(5);
            throw null;
        }
        if (simpleLock == null) {
            a(6);
            throw null;
        }
        this.lock = simpleLock;
        this.f81860a = exceptionHandlingStrategy;
        this.f81861b = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i10 != 6) {
            switch (i10) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i10 == 10 || i10 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i10 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i10 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 10 && i10 != 13 && i10 != 20 && i10 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static void b(@NotNull AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            if (!stackTrace[i10].getClassName().startsWith(f81859c)) {
                List listSubList = Arrays.asList(stackTrace).subList(i10, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i10++;
        }
        i10 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            a(34);
            throw null;
        }
        this.lock.lock();
        try {
            T tInvoke = function0.invoke();
            this.lock.unlock();
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw this.f81860a.handleException(th2);
            } catch (Throwable th3) {
                this.lock.unlock();
                throw th3;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new d(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 != null) {
            return new i(this, function0);
        }
        a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function2) {
        if (function0 == null) {
            a(28);
            throw null;
        }
        if (function2 != null) {
            return new c(this, function0, function1, function2);
        }
        a(29);
        throw null;
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            a(14);
            throw null;
        }
        if (concurrentMap != null) {
            return new l(this, concurrentMap, function1);
        }
        a(15);
        throw null;
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            a(21);
            throw null;
        }
        if (concurrentMap != null) {
            return new k(this, concurrentMap, function1);
        }
        a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 != null) {
            return new g(this, function0);
        }
        a(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull T t10) {
        if (function0 == null) {
            a(26);
            throw null;
        }
        if (t10 != null) {
            return new b(this, function0, t10);
        }
        a(27);
        throw null;
    }

    @NotNull
    public <K, V> n<V> recursionDetectedDefault(@NotNull String str, K k10) {
        if (str == null) {
            a(35);
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        sb2.append(k10 == null ? "" : androidx.databinding.c.c("on input: ", k10));
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        b(assertionError);
        throw assertionError;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return ad.d.f(sb2, this.f81861b, ")");
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 != null) {
            MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(function1, new ConcurrentHashMap(3, 1.0f, 2));
            if (memoizedFunctionToNotNullCreateMemoizedFunction != null) {
                return memoizedFunctionToNotNullCreateMemoizedFunction;
            }
            a(10);
            throw null;
        }
        a(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 != null) {
            MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, new ConcurrentHashMap(3, 1.0f, 2));
            if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues != null) {
                return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, @Nullable Runnable runnable, @Nullable Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, function1));
    }

    public static class g<T> implements NullableLazyValue<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final LockBasedStorageManager f81867p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function0<? extends T> f81868q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public volatile Object f81869r0;

        public g(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            if (function0 == null) {
                a(1);
                throw null;
            }
            this.f81869r0 = m.NOT_COMPUTED;
            this.f81867p0 = lockBasedStorageManager;
            this.f81868q0 = function0;
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @NotNull
        public n<T> c(boolean z10) {
            n<T> nVarRecursionDetectedDefault = this.f81867p0.recursionDetectedDefault("in a lazy value", null);
            if (nVarRecursionDetectedDefault != null) {
                return nVarRecursionDetectedDefault;
            }
            a(2);
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007b, B:35:0x007c, B:36:0x0082, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007b, B:35:0x007c, B:36:0x0082, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007b, B:35:0x007c, B:36:0x0082, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007b, B:35:0x007c, B:36:0x0082, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T tInvoke;
            n<T> nVarC;
            Object obj = this.f81869r0;
            if (!(obj instanceof m)) {
                return (T) WrappedValues.unescapeThrowable(obj);
            }
            this.f81867p0.lock.lock();
            try {
                Object obj2 = this.f81869r0;
                if (obj2 instanceof m) {
                    m mVar = m.COMPUTING;
                    if (obj2 == mVar) {
                        this.f81869r0 = m.RECURSION_WAS_DETECTED;
                        n<T> nVarC2 = c(true);
                        if (!nVarC2.isFallThrough()) {
                            tInvoke = nVarC2.getValue();
                        } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                            nVarC = c(false);
                            if (nVarC.isFallThrough()) {
                                this.f81869r0 = mVar;
                                try {
                                    tInvoke = this.f81868q0.invoke();
                                    b(tInvoke);
                                    this.f81869r0 = tInvoke;
                                } catch (Throwable th2) {
                                    if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                                        this.f81869r0 = m.NOT_COMPUTED;
                                        throw th2;
                                    }
                                    if (this.f81869r0 == m.COMPUTING) {
                                        this.f81869r0 = WrappedValues.escapeThrowable(th2);
                                    }
                                    throw this.f81867p0.f81860a.handleException(th2);
                                }
                            } else {
                                tInvoke = nVarC.getValue();
                            }
                        } else {
                            this.f81869r0 = mVar;
                            tInvoke = this.f81868q0.invoke();
                            b(tInvoke);
                            this.f81869r0 = tInvoke;
                        }
                    } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                        nVarC = c(false);
                        if (nVarC.isFallThrough()) {
                            tInvoke = nVarC.getValue();
                        } else {
                            this.f81869r0 = mVar;
                            tInvoke = this.f81868q0.invoke();
                            b(tInvoke);
                            this.f81869r0 = tInvoke;
                        }
                    } else {
                        this.f81869r0 = mVar;
                        tInvoke = this.f81868q0.invoke();
                        b(tInvoke);
                        this.f81869r0 = tInvoke;
                    }
                } else {
                    tInvoke = (T) WrappedValues.unescapeThrowable(obj2);
                }
                this.f81867p0.lock.unlock();
                return tInvoke;
            } catch (Throwable th3) {
                this.f81867p0.lock.unlock();
                throw th3;
            }
        }

        public boolean isComputed() {
            return (this.f81869r0 == m.NOT_COMPUTED || this.f81869r0 == m.COMPUTING) ? false : true;
        }

        public void b(T t10) {
        }
    }
}
