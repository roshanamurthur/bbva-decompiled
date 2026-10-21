package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReflectJavaLiteralAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaLiteralAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f80458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaLiteralAnnotationArgument(@Nullable Name name, @NotNull Object value) {
        super(name, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f80458b = value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument
    @NotNull
    public Object getValue() {
        return this.f80458b;
    }
}
