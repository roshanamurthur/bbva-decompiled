package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function0<T> f80030q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile SoftReference<Object> f80031r0;

        public LazySoftVal(@Nullable T t10, @NotNull Function0<T> function0) {
            if (function0 == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
            }
            this.f80031r0 = null;
            this.f80030q0 = function0;
            if (t10 != null) {
                this.f80031r0 = new SoftReference<>(escape(t10));
            }
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f80031r0;
            if (softReference != null && (obj = softReference.get()) != null) {
                return unescape(obj);
            }
            T tInvoke = this.f80030q0.invoke();
            this.f80031r0 = new SoftReference<>(escape(tInvoke));
            return tInvoke;
        }
    }

    public static abstract class Val<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80032p0 = new a();

        public static class a {
        }

        public Object escape(T t10) {
            return t10 == null ? f80032p0 : t10;
        }

        public final T getValue(Object obj, Object obj2) {
            return invoke();
        }

        public abstract T invoke();

        /* JADX WARN: Multi-variable type inference failed */
        public T unescape(Object obj) {
            if (obj == f80032p0) {
                return null;
            }
            return obj;
        }
    }

    public static /* synthetic */ void a() {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@Nullable T t10, @NotNull Function0<T> function0) {
        if (function0 != null) {
            return new LazySoftVal<>(t10, function0);
        }
        a();
        throw null;
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@NotNull Function0<T> function0) {
        if (function0 != null) {
            return lazySoft(null, function0);
        }
        a();
        throw null;
    }
}
