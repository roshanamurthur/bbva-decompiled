package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaWildcardType.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReflectJavaWildcardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaWildcardType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaWildcardType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WildcardType f80469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Collection<JavaAnnotation> f80470b;

    public ReflectJavaWildcardType(@NotNull WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f80469a = reflectType;
        this.f80470b = CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f80470b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        return !Intrinsics.areEqual(ArraysKt___ArraysKt.firstOrNull(upperBounds), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    @Nullable
    public ReflectJavaType getBound() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Type[] lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + getReflectType());
        }
        if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.Factory;
            Intrinsics.checkNotNull(lowerBounds);
            Object objSingle = ArraysKt___ArraysKt.single(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(objSingle, "single(...)");
            return factory.create((Type) objSingle);
        }
        if (upperBounds.length == 1) {
            Intrinsics.checkNotNull(upperBounds);
            Type type = (Type) ArraysKt___ArraysKt.single(upperBounds);
            if (!Intrinsics.areEqual(type, Object.class)) {
                ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
                Intrinsics.checkNotNull(type);
                return factory2.create(type);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public WildcardType getReflectType() {
        return this.f80469a;
    }
}
