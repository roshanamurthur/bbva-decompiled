package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JavaClassesTracker.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaClassesTracker {

    /* JADX INFO: compiled from: JavaClassesTracker.kt */
    public static final class Default implements JavaClassesTracker {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public void reportClass(@NotNull JavaClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        }
    }

    void reportClass(@NotNull JavaClassDescriptor javaClassDescriptor);
}
