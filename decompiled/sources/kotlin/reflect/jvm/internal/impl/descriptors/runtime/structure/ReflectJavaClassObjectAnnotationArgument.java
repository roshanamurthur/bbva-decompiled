package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReflectJavaClassObjectAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaClassObjectAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Class<?> f80452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClassObjectAnnotationArgument(@Nullable Name name, @NotNull Class<?> klass) {
        super(name, null);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f80452b = klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument
    @NotNull
    public JavaType getReferencedType() {
        return ReflectJavaType.Factory.create(this.f80452b);
    }
}
