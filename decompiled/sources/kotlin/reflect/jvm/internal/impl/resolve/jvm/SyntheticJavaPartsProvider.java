package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SyntheticJavaPartsProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface SyntheticJavaPartsProvider {

    @NotNull
    public static final Companion Companion = Companion.f81567a;

    /* JADX INFO: compiled from: SyntheticJavaPartsProvider.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f81567a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final CompositeSyntheticJavaPartsProvider f81568b = new CompositeSyntheticJavaPartsProvider(CollectionsKt__CollectionsKt.emptyList());

        @NotNull
        public final CompositeSyntheticJavaPartsProvider getEMPTY() {
            return f81568b;
        }
    }

    void generateConstructors(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull List<ClassConstructorDescriptor> list);

    void generateMethods(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection);

    void generateNestedClass(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> list);

    void generateStaticFunctions(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection);

    @NotNull
    List<Name> getMethodNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    List<Name> getNestedClassNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    List<Name> getStaticFunctionNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    PropertyDescriptorImpl modifyField(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptorImpl);
}
