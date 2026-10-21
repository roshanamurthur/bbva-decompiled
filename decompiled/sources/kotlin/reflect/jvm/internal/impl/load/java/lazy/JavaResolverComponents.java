package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaResolverComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StorageManager f80600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final JavaClassFinder f80601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final KotlinClassFinder f80602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DeserializedDescriptorResolver f80603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SignaturePropagator f80604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ErrorReporter f80605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final JavaResolverCache f80606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final JavaPropertyInitializerEvaluator f80607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SamConversionResolver f80608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final JavaSourceElementFactory f80609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ModuleClassResolver f80610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PackagePartProvider f80611l;

    @NotNull
    public final SupertypeLoopChecker m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final LookupTracker f80612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f80613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ReflectionTypes f80614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final AnnotationTypeQualifierResolver f80615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final SignatureEnhancement f80616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final JavaClassesTracker f80617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final JavaResolverSettings f80618t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final NewKotlinTypeChecker f80619u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final JavaTypeEnhancementState f80620v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final JavaModuleAnnotationsProvider f80621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final SyntheticJavaPartsProvider f80622x;

    public JavaResolverComponents(@NotNull StorageManager storageManager, @NotNull JavaClassFinder finder, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull SignaturePropagator signaturePropagator, @NotNull ErrorReporter errorReporter, @NotNull JavaResolverCache javaResolverCache, @NotNull JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, @NotNull SamConversionResolver samConversionResolver, @NotNull JavaSourceElementFactory sourceElementFactory, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull LookupTracker lookupTracker, @NotNull ModuleDescriptor module, @NotNull ReflectionTypes reflectionTypes, @NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull SignatureEnhancement signatureEnhancement, @NotNull JavaClassesTracker javaClassesTracker, @NotNull JavaResolverSettings settings, @NotNull NewKotlinTypeChecker kotlinTypeChecker, @NotNull JavaTypeEnhancementState javaTypeEnhancementState, @NotNull JavaModuleAnnotationsProvider javaModuleResolver, @NotNull SyntheticJavaPartsProvider syntheticPartsProvider) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(signaturePropagator, "signaturePropagator");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        Intrinsics.checkNotNullParameter(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(sourceElementFactory, "sourceElementFactory");
        Intrinsics.checkNotNullParameter(moduleClassResolver, "moduleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        Intrinsics.checkNotNullParameter(supertypeLoopChecker, "supertypeLoopChecker");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(reflectionTypes, "reflectionTypes");
        Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.checkNotNullParameter(signatureEnhancement, "signatureEnhancement");
        Intrinsics.checkNotNullParameter(javaClassesTracker, "javaClassesTracker");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(javaModuleResolver, "javaModuleResolver");
        Intrinsics.checkNotNullParameter(syntheticPartsProvider, "syntheticPartsProvider");
        this.f80600a = storageManager;
        this.f80601b = finder;
        this.f80602c = kotlinClassFinder;
        this.f80603d = deserializedDescriptorResolver;
        this.f80604e = signaturePropagator;
        this.f80605f = errorReporter;
        this.f80606g = javaResolverCache;
        this.f80607h = javaPropertyInitializerEvaluator;
        this.f80608i = samConversionResolver;
        this.f80609j = sourceElementFactory;
        this.f80610k = moduleClassResolver;
        this.f80611l = packagePartProvider;
        this.m = supertypeLoopChecker;
        this.f80612n = lookupTracker;
        this.f80613o = module;
        this.f80614p = reflectionTypes;
        this.f80615q = annotationTypeQualifierResolver;
        this.f80616r = signatureEnhancement;
        this.f80617s = javaClassesTracker;
        this.f80618t = settings;
        this.f80619u = kotlinTypeChecker;
        this.f80620v = javaTypeEnhancementState;
        this.f80621w = javaModuleResolver;
        this.f80622x = syntheticPartsProvider;
    }

    @NotNull
    public final AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.f80615q;
    }

    @NotNull
    public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.f80603d;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.f80605f;
    }

    @NotNull
    public final JavaClassFinder getFinder() {
        return this.f80601b;
    }

    @NotNull
    public final JavaClassesTracker getJavaClassesTracker() {
        return this.f80617s;
    }

    @NotNull
    public final JavaModuleAnnotationsProvider getJavaModuleResolver() {
        return this.f80621w;
    }

    @NotNull
    public final JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.f80607h;
    }

    @NotNull
    public final JavaResolverCache getJavaResolverCache() {
        return this.f80606g;
    }

    @NotNull
    public final JavaTypeEnhancementState getJavaTypeEnhancementState() {
        return this.f80620v;
    }

    @NotNull
    public final KotlinClassFinder getKotlinClassFinder() {
        return this.f80602c;
    }

    @NotNull
    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.f80619u;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.f80612n;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.f80613o;
    }

    @NotNull
    public final ModuleClassResolver getModuleClassResolver() {
        return this.f80610k;
    }

    @NotNull
    public final PackagePartProvider getPackagePartProvider() {
        return this.f80611l;
    }

    @NotNull
    public final ReflectionTypes getReflectionTypes() {
        return this.f80614p;
    }

    @NotNull
    public final JavaResolverSettings getSettings() {
        return this.f80618t;
    }

    @NotNull
    public final SignatureEnhancement getSignatureEnhancement() {
        return this.f80616r;
    }

    @NotNull
    public final SignaturePropagator getSignaturePropagator() {
        return this.f80604e;
    }

    @NotNull
    public final JavaSourceElementFactory getSourceElementFactory() {
        return this.f80609j;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f80600a;
    }

    @NotNull
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.m;
    }

    @NotNull
    public final SyntheticJavaPartsProvider getSyntheticPartsProvider() {
        return this.f80622x;
    }

    @NotNull
    public final JavaResolverComponents replace(@NotNull JavaResolverCache javaResolverCache) {
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        return new JavaResolverComponents(this.f80600a, this.f80601b, this.f80602c, this.f80603d, this.f80604e, this.f80605f, javaResolverCache, this.f80607h, this.f80608i, this.f80609j, this.f80610k, this.f80611l, this.m, this.f80612n, this.f80613o, this.f80614p, this.f80615q, this.f80616r, this.f80617s, this.f80618t, this.f80619u, this.f80620v, this.f80621w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i10 & 8388608) != 0 ? SyntheticJavaPartsProvider.Companion.getEMPTY() : syntheticJavaPartsProvider);
    }
}
