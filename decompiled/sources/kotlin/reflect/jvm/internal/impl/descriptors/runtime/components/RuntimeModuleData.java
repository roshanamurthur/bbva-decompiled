package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RuntimeModuleData.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class RuntimeModuleData {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeserializationComponents f80413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PackagePartScopeCache f80414b;

    /* JADX INFO: compiled from: RuntimeModuleData.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RuntimeModuleData create(@NotNull ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(classLoader, "classLoader");
            ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoader);
            DeserializationComponentsForJava.Companion companion = DeserializationComponentsForJava.Companion;
            ClassLoader classLoader2 = Unit.class.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader2, "getClassLoader(...)");
            DeserializationComponentsForJava.Companion.ModuleData moduleDataCreateModuleData = companion.createModuleData(reflectKotlinClassFinder, new ReflectKotlinClassFinder(classLoader2), new ReflectJavaClassFinder(classLoader), "runtime module for " + classLoader, RuntimeErrorReporter.INSTANCE, RuntimeSourceElementFactory.INSTANCE);
            return new RuntimeModuleData(moduleDataCreateModuleData.getDeserializationComponentsForJava().getComponents(), new PackagePartScopeCache(moduleDataCreateModuleData.getDeserializedDescriptorResolver(), reflectKotlinClassFinder), null);
        }
    }

    public RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache, DefaultConstructorMarker defaultConstructorMarker) {
        this.f80413a = deserializationComponents;
        this.f80414b = packagePartScopeCache;
    }

    @NotNull
    public final DeserializationComponents getDeserialization() {
        return this.f80413a;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.f80413a.getModuleDescriptor();
    }

    @NotNull
    public final PackagePartScopeCache getPackagePartScopeCache() {
        return this.f80414b;
    }
}
