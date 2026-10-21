package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaRecordComponent.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Java16RecordComponentsLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Java16RecordComponentsLoader f80416a = new Java16RecordComponentsLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Cache f80417b;

    /* JADX INFO: compiled from: ReflectJavaRecordComponent.kt */
    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Method f80418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Method f80419b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f80418a = method;
            this.f80419b = method2;
        }

        @Nullable
        public final Method getGetAccessor() {
            return this.f80419b;
        }

        @Nullable
        public final Method getGetType() {
            return this.f80418a;
        }
    }

    public static Cache a(Object obj) {
        Cache cache = f80417b;
        if (cache == null) {
            Class<?> cls = obj.getClass();
            try {
                cache = new Cache(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                cache = new Cache(null, null);
            }
            f80417b = cache;
        }
        return cache;
    }

    @Nullable
    public final Method loadGetAccessor(@NotNull Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method getAccessor = a(recordComponent).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        Object objInvoke = getAccessor.invoke(recordComponent, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    @Nullable
    public final Class<?> loadGetType(@NotNull Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method getType = a(recordComponent).getGetType();
        if (getType == null) {
            return null;
        }
        Object objInvoke = getType.invoke(recordComponent, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
