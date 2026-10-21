package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaPrimitiveType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<?> f80461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Collection<JavaAnnotation> f80462b;

    public ReflectJavaPrimitiveType(@NotNull Class<?> reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f80461a = reflectType;
        this.f80462b = CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f80462b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public Class<?> getReflectType() {
        return this.f80461a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    @Nullable
    public PrimitiveType getType() {
        if (Intrinsics.areEqual(getReflectType(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(getReflectType().getName()).getPrimitiveType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }
}
