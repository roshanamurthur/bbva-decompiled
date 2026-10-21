package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyJavaPackageFragment f80918a;

    public KotlinJvmBinaryPackageSourceElement(@NotNull LazyJavaPackageFragment packageFragment) {
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f80918a = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f80918a;
        sb2.append(lazyJavaPackageFragment);
        sb2.append(": ");
        sb2.append(lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().keySet());
        return sb2.toString();
    }
}
