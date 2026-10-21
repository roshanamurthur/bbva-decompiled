package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Java16SealedRecordLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Java16SealedRecordLoader f80420a = new Java16SealedRecordLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Cache f80421b;

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Method f80422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Method f80423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Method f80424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Method f80425d;

        public Cache(@Nullable Method method, @Nullable Method method2, @Nullable Method method3, @Nullable Method method4) {
            this.f80422a = method;
            this.f80423b = method2;
            this.f80424c = method3;
            this.f80425d = method4;
        }

        @Nullable
        public final Method getGetPermittedSubclasses() {
            return this.f80423b;
        }

        @Nullable
        public final Method getGetRecordComponents() {
            return this.f80425d;
        }

        @Nullable
        public final Method isRecord() {
            return this.f80424c;
        }

        @Nullable
        public final Method isSealed() {
            return this.f80422a;
        }
    }

    public static Cache a() {
        Cache cache = f80421b;
        if (cache == null) {
            try {
                cache = new Cache(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                cache = new Cache(null, null, null, null);
            }
            f80421b = cache;
        }
        return cache;
    }

    @Nullable
    public final Class<?>[] loadGetPermittedSubclasses(@NotNull Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method getPermittedSubclasses = a().getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        Object objInvoke = getPermittedSubclasses.invoke(clazz, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    @Nullable
    public final Object[] loadGetRecordComponents(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method getRecordComponents = a().getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (Object[]) getRecordComponents.invoke(clazz, new Object[0]);
    }

    @Nullable
    public final Boolean loadIsRecord(@NotNull Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodIsRecord = a().isRecord();
        if (methodIsRecord == null) {
            return null;
        }
        Object objInvoke = methodIsRecord.invoke(clazz, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    @Nullable
    public final Boolean loadIsSealed(@NotNull Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodIsSealed = a().isSealed();
        if (methodIsSealed == null) {
            return null;
        }
        Object objInvoke = methodIsSealed.invoke(clazz, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
