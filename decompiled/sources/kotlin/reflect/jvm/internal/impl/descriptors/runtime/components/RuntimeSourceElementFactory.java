package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RuntimeSourceElementFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {

    @NotNull
    public static final RuntimeSourceElementFactory INSTANCE = new RuntimeSourceElementFactory();

    /* JADX INFO: compiled from: RuntimeSourceElementFactory.kt */
    public static final class RuntimeSourceElement implements JavaSourceElement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ReflectJavaElement f80415a;

        public RuntimeSourceElement(@NotNull ReflectJavaElement javaElement) {
            Intrinsics.checkNotNullParameter(javaElement, "javaElement");
            this.f80415a = javaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        @NotNull
        public SourceFile getContainingFile() {
            SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        @NotNull
        public ReflectJavaElement getJavaElement() {
            return this.f80415a;
        }

        @NotNull
        public String toString() {
            return RuntimeSourceElement.class.getName() + ": " + getJavaElement();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    @NotNull
    public JavaSourceElement source(@NotNull JavaElement javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }
}
