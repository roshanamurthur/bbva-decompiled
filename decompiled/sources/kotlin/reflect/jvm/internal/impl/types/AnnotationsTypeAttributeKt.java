package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotationsTypeAttribute.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAnnotationsTypeAttribute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationsTypeAttribute.kt\norg/jetbrains/kotlin/types/AnnotationsTypeAttributeKt\n+ 2 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n*L\n1#1,40:1\n42#2:41\n*S KotlinDebug\n*F\n+ 1 AnnotationsTypeAttribute.kt\norg/jetbrains/kotlin/types/AnnotationsTypeAttributeKt\n*L\n37#1:41\n*E\n"})
public final class AnnotationsTypeAttributeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f81900a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinPackage(AnnotationsTypeAttributeKt.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final NullableArrayMapAccessor f81901b;

    static {
        NullableArrayMapAccessor<TypeAttribute<?>, TypeAttribute<?>, T> nullableArrayMapAccessorGenerateNullableAccessor = TypeAttributes.Companion.generateNullableAccessor(Reflection.getOrCreateKotlinClass(AnnotationsTypeAttribute.class));
        Intrinsics.checkNotNull(nullableArrayMapAccessorGenerateNullableAccessor, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f81901b = nullableArrayMapAccessorGenerateNullableAccessor;
    }

    @NotNull
    public static final Annotations getAnnotations(@NotNull TypeAttributes typeAttributes) {
        Annotations annotations;
        Intrinsics.checkNotNullParameter(typeAttributes, "<this>");
        AnnotationsTypeAttribute annotationsAttribute = getAnnotationsAttribute(typeAttributes);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? Annotations.Companion.getEMPTY() : annotations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final AnnotationsTypeAttribute getAnnotationsAttribute(@NotNull TypeAttributes typeAttributes) {
        Intrinsics.checkNotNullParameter(typeAttributes, "<this>");
        return (AnnotationsTypeAttribute) f81901b.getValue(typeAttributes, f81900a[0]);
    }
}
