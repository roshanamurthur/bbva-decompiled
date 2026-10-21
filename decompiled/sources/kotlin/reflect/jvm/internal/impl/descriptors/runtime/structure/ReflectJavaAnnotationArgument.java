package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {

    @NotNull
    public static final Factory Factory = new Factory(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Name f80437a;

    /* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class Factory {
        public Factory() {
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReflectJavaAnnotationArgument create(@NotNull Object value, @Nullable Name name) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(value.getClass())) {
                return new ReflectJavaEnumValueAnnotationArgument(name, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new ReflectJavaArrayAnnotationArgument(name, (Object[]) value);
            }
            return value instanceof Class ? new ReflectJavaClassObjectAnnotationArgument(name, (Class) value) : new ReflectJavaLiteralAnnotationArgument(name, value);
        }
    }

    public ReflectJavaAnnotationArgument(Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this.f80437a = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    @Nullable
    public Name getName() {
        return this.f80437a;
    }
}
