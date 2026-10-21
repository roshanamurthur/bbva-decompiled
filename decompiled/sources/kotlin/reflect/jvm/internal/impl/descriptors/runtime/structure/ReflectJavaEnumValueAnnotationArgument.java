package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Enum<?> f80456b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaEnumValueAnnotationArgument(@Nullable Name name, @NotNull Enum<?> value) {
        super(name, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f80456b = value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    public Name getEntryName() {
        return Name.identifier(this.f80456b.name());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    public ClassId getEnumClassId() {
        Class<?> enclosingClass = this.f80456b.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        Intrinsics.checkNotNull(enclosingClass);
        return ReflectClassUtilKt.getClassId(enclosingClass);
    }
}
