package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<ModuleDescriptorImpl> f80347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<ModuleDescriptorImpl> f80348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<ModuleDescriptorImpl> f80349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Set<ModuleDescriptorImpl> f80350d;

    public ModuleDependenciesImpl(@NotNull List<ModuleDescriptorImpl> allDependencies, @NotNull Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible, @NotNull List<ModuleDescriptorImpl> directExpectedByDependencies, @NotNull Set<ModuleDescriptorImpl> allExpectedByDependencies) {
        Intrinsics.checkNotNullParameter(allDependencies, "allDependencies");
        Intrinsics.checkNotNullParameter(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(allExpectedByDependencies, "allExpectedByDependencies");
        this.f80347a = allDependencies;
        this.f80348b = modulesWhoseInternalsAreVisible;
        this.f80349c = directExpectedByDependencies;
        this.f80350d = allExpectedByDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public List<ModuleDescriptorImpl> getAllDependencies() {
        return this.f80347a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public List<ModuleDescriptorImpl> getDirectExpectedByDependencies() {
        return this.f80349c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.f80348b;
    }
}
