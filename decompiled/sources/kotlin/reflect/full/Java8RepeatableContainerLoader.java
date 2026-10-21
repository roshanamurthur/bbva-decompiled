package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KAnnotatedElements.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/Java8RepeatableContainerLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class Java8RepeatableContainerLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Java8RepeatableContainerLoader f79830a = new Java8RepeatableContainerLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Cache f79831b;

    /* JADX INFO: compiled from: KAnnotatedElements.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R!\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;", "", "Ljava/lang/Class;", "", "a", "Ljava/lang/Class;", "getRepeatableClass", "()Ljava/lang/Class;", "repeatableClass", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "getValueMethod", "()Ljava/lang/reflect/Method;", "valueMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Class<? extends Annotation> repeatableClass;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Method valueMethod;

        public Cache(@Nullable Class<? extends Annotation> cls, @Nullable Method method) {
            this.repeatableClass = cls;
            this.valueMethod = method;
        }

        @Nullable
        public final Class<? extends Annotation> getRepeatableClass() {
            return this.repeatableClass;
        }

        @Nullable
        public final Method getValueMethod() {
            return this.valueMethod;
        }
    }

    @Nullable
    public final Class<? extends Annotation> loadRepeatableContainer(@NotNull Class<? extends Annotation> klass) throws IllegalAccessException, InvocationTargetException {
        Annotation annotation;
        Method valueMethod;
        Cache cache;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Cache cache2 = f79831b;
        if (cache2 == null) {
            synchronized (this) {
                cache2 = f79831b;
                if (cache2 == null) {
                    try {
                        Class<?> cls = Class.forName("java.lang.annotation.Repeatable");
                        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
                        cache = new Cache(cls, cls.getMethod("value", new Class[0]));
                    } catch (ClassNotFoundException unused) {
                        cache = new Cache(null, null);
                    }
                    f79831b = cache;
                    cache2 = cache;
                }
            }
        }
        Class repeatableClass = cache2.getRepeatableClass();
        if (repeatableClass == null || (annotation = klass.getAnnotation(repeatableClass)) == null || (valueMethod = cache2.getValueMethod()) == null) {
            return null;
        }
        Object objInvoke = valueMethod.invoke(annotation, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
        return (Class) objInvoke;
    }
}
