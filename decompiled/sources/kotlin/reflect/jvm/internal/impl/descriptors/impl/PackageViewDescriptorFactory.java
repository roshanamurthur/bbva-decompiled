package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface PackageViewDescriptorFactory {

    @NotNull
    public static final Companion Companion = Companion.f80365a;

    /* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f80365a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final ModuleCapability<PackageViewDescriptorFactory> f80366b = new ModuleCapability<>("PackageViewDescriptorFactory");

        @NotNull
        public final ModuleCapability<PackageViewDescriptorFactory> getCAPABILITY() {
            return f80366b;
        }
    }

    /* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
    public static final class Default implements PackageViewDescriptorFactory {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        @NotNull
        public PackageViewDescriptor compute(@NotNull ModuleDescriptorImpl module, @NotNull FqName fqName, @NotNull StorageManager storageManager) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            return new LazyPackageViewDescriptorImpl(module, fqName, storageManager);
        }
    }

    @NotNull
    PackageViewDescriptor compute(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager);
}
