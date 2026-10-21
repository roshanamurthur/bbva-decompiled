package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bk.d;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DeserializationComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StorageManager f81662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f81663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DeserializationConfiguration f81664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ClassDataFinder f81665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> f81666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PackageFragmentProvider f81667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final LocalClassifierTypeSettings f81668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ErrorReporter f81669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final LookupTracker f81670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final FlexibleTypeDeserializer f81671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Iterable<ClassDescriptorFactory> f81672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final NotFoundClasses f81673l;

    @NotNull
    public final ContractDeserializer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final AdditionalClassPartsProvider f81674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PlatformDependentDeclarationFilter f81675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ExtensionRegistryLite f81676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final NewKotlinTypeChecker f81677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final SamConversionResolver f81678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final List<TypeAttributeTranslator> f81679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final EnumEntriesDeserializationSupport f81680t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final ClassDeserializer f81681u;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration configuration, @NotNull ClassDataFinder classDataFinder, @NotNull AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader, @NotNull PackageFragmentProvider packageFragmentProvider, @NotNull LocalClassifierTypeSettings localClassifierTypeSettings, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull FlexibleTypeDeserializer flexibleTypeDeserializer, @NotNull Iterable<? extends ClassDescriptorFactory> fictitiousClassDescriptorFactories, @NotNull NotFoundClasses notFoundClasses, @NotNull ContractDeserializer contractDeserializer, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull ExtensionRegistryLite extensionRegistryLite, @NotNull NewKotlinTypeChecker kotlinTypeChecker, @NotNull SamConversionResolver samConversionResolver, @NotNull List<? extends TypeAttributeTranslator> typeAttributeTranslators, @NotNull EnumEntriesDeserializationSupport enumEntriesDeserializationSupport) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        Intrinsics.checkNotNullParameter(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f81662a = storageManager;
        this.f81663b = moduleDescriptor;
        this.f81664c = configuration;
        this.f81665d = classDataFinder;
        this.f81666e = annotationAndConstantLoader;
        this.f81667f = packageFragmentProvider;
        this.f81668g = localClassifierTypeSettings;
        this.f81669h = errorReporter;
        this.f81670i = lookupTracker;
        this.f81671j = flexibleTypeDeserializer;
        this.f81672k = fictitiousClassDescriptorFactories;
        this.f81673l = notFoundClasses;
        this.m = contractDeserializer;
        this.f81674n = additionalClassPartsProvider;
        this.f81675o = platformDependentDeclarationFilter;
        this.f81676p = extensionRegistryLite;
        this.f81677q = kotlinTypeChecker;
        this.f81678r = samConversionResolver;
        this.f81679s = typeAttributeTranslators;
        this.f81680t = enumEntriesDeserializationSupport;
        this.f81681u = new ClassDeserializer(this);
    }

    @NotNull
    public final DeserializationContext createContext(@NotNull PackageFragmentDescriptor descriptor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion metadataVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, deserializedContainerSource, null, CollectionsKt__CollectionsKt.emptyList());
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return ClassDeserializer.deserializeClass$default(this.f81681u, classId, null, 2, null);
    }

    @NotNull
    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.f81674n;
    }

    @NotNull
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.f81666e;
    }

    @NotNull
    public final ClassDataFinder getClassDataFinder() {
        return this.f81665d;
    }

    @NotNull
    public final ClassDeserializer getClassDeserializer() {
        return this.f81681u;
    }

    @NotNull
    public final DeserializationConfiguration getConfiguration() {
        return this.f81664c;
    }

    @NotNull
    public final ContractDeserializer getContractDeserializer() {
        return this.m;
    }

    @NotNull
    public final EnumEntriesDeserializationSupport getEnumEntriesDeserializationSupport() {
        return this.f81680t;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.f81669h;
    }

    @NotNull
    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.f81676p;
    }

    @NotNull
    public final Iterable<ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.f81672k;
    }

    @NotNull
    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.f81671j;
    }

    @NotNull
    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.f81677q;
    }

    @NotNull
    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.f81668g;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.f81670i;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.f81663b;
    }

    @NotNull
    public final NotFoundClasses getNotFoundClasses() {
        return this.f81673l;
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.f81667f;
    }

    @NotNull
    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.f81675o;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f81662a;
    }

    @NotNull
    public final List<TypeAttributeTranslator> getTypeAttributeTranslators() {
        return this.f81679s;
    }

    public /* synthetic */ DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable iterable, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolver samConversionResolver, List list, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, (i10 & 8192) != 0 ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProvider, (i10 & 16384) != 0 ? PlatformDependentDeclarationFilter.All.INSTANCE : platformDependentDeclarationFilter, extensionRegistryLite, (65536 & i10) != 0 ? NewKotlinTypeChecker.Companion.getDefault() : newKotlinTypeChecker, samConversionResolver, (262144 & i10) != 0 ? d.listOf(DefaultTypeAttributeTranslator.INSTANCE) : list, (i10 & 524288) != 0 ? EnumEntriesDeserializationSupport.Default.INSTANCE : enumEntriesDeserializationSupport);
    }
}
