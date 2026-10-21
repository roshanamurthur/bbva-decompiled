package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JvmTypeFactory<T> {
    @NotNull
    T boxType(@NotNull T t10);

    @NotNull
    T createFromString(@NotNull String str);

    @NotNull
    T createObjectType(@NotNull String str);

    @NotNull
    T createPrimitiveType(@NotNull PrimitiveType primitiveType);

    @NotNull
    T getJavaLangClassType();

    @NotNull
    String toString(@NotNull T t10);
}
