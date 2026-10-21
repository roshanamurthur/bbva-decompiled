package tk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends Lambda implements Function0<ClassDescriptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassDescriptor f93621p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ClassDescriptor f93622q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        super(0);
        this.f93621p0 = lazyJavaClassDescriptor;
        this.f93622q0 = classDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ClassDescriptor invoke() {
        JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return this.f93621p0.copy$descriptors_jvm(EMPTY, this.f93622q0);
    }
}
