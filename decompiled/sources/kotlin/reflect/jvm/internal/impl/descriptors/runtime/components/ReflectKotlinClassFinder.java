package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectKotlinClassFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReflectKotlinClassFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectKotlinClassFinder.kt\norg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClassFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class ReflectKotlinClassFinder implements KotlinClassFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClassLoader f80410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BuiltInsResourceLoader f80411b;

    public ReflectKotlinClassFinder(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f80410a = classLoader;
        this.f80411b = new BuiltInsResourceLoader();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    @Nullable
    public InputStream findBuiltInsData(@NotNull FqName packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (!packageFqName.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return null;
        }
        return this.f80411b.loadResource(BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(packageFqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    public KotlinClassFinder.Result findKotlinClassOrContent(@NotNull ClassId classId, @NotNull JvmMetadataVersion jvmMetadataVersion) {
        ReflectKotlinClass reflectKotlinClassCreate;
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        Class<?> clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.f80410a, ReflectKotlinClassFinderKt.access$toRuntimeFqName(classId));
        if (clsTryLoadClass == null || (reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(clsTryLoadClass)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassCreate, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    public KotlinClassFinder.Result findKotlinClassOrContent(@NotNull JavaClass javaClass, @NotNull JvmMetadataVersion jvmMetadataVersion) {
        String strAsString;
        Class<?> clsTryLoadClass;
        ReflectKotlinClass reflectKotlinClassCreate;
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        FqName fqName = javaClass.getFqName();
        if (fqName == null || (strAsString = fqName.asString()) == null || (clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.f80410a, strAsString)) == null || (reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(clsTryLoadClass)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassCreate, null, 2, null);
    }
}
