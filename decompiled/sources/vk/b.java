package vk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f94104a = new b();

    @NotNull
    public final String constructorDesc(@NotNull Constructor<?> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            Intrinsics.checkNotNull(cls);
            sb2.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String fieldDesc(@NotNull Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return ReflectClassUtilKt.getDesc(type);
    }

    @NotNull
    public final String methodDesc(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        StringBuilder sb2 = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            Intrinsics.checkNotNull(cls);
            sb2.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(ReflectClassUtilKt.getDesc(returnType));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
