package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BuiltInsLoader.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface BuiltInsLoader {

    @NotNull
    public static final Companion Companion = Companion.f80084a;

    /* JADX INFO: compiled from: BuiltInsLoader.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f80084a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Lazy<BuiltInsLoader> f80085b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.f80086p0);

        /* JADX INFO: compiled from: BuiltInsLoader.kt */
        public static final class a extends Lambda implements Function0<BuiltInsLoader> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f80086p0 = new a(0);

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BuiltInsLoader invoke() {
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                Intrinsics.checkNotNull(serviceLoaderLoad);
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt___CollectionsKt.firstOrNull(serviceLoaderLoad);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        @NotNull
        public final BuiltInsLoader getInstance() {
            return f80085b.getValue();
        }
    }

    @NotNull
    PackageFragmentProvider createPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z10);
}
