package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface PlatformDependentDeclarationFilter {

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class All implements PlatformDependentDeclarationFilter {

        @NotNull
        public static final All INSTANCE = new All();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {

        @NotNull
        public static final NoPlatformDependent INSTANCE = new NoPlatformDependent();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME());
        }
    }

    boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor);
}
