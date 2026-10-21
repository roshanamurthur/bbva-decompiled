package kotlin.reflect.jvm.internal.impl.load.kotlin;

import bk.v;
import bk.w;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDeserializedDescriptorResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n126#1,14:155\n126#1,14:169\n1#2:183\n*S KotlinDebug\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n*L\n56#1:155,14\n68#1:169,14\n*E\n"})
public final class DeserializedDescriptorResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<KotlinClassHeader.Kind> f80892a = v.setOf(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Set<KotlinClassHeader.Kind> f80893b = w.setOf((Object[]) new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final JvmMetadataVersion f80894c = new JvmMetadataVersion(1, 1, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final JvmMetadataVersion f80895d = new JvmMetadataVersion(1, 1, 11);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final JvmMetadataVersion f80896e = new JvmMetadataVersion(1, 1, 13);
    public DeserializationComponents components;

    /* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JvmMetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.f80896e;
        }
    }

    /* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
    public static final class a extends Lambda implements Function0<Collection<? extends Name>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80897p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Collection<? extends Name> invoke() {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public final DeserializedContainerAbiStability a(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getAllowUnstableDependencies()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().isUnstableFirBinary()) {
            return DeserializedContainerAbiStability.FIR_UNSTABLE;
        }
        return kotlinJvmBinaryClass.getClassHeader().isUnstableJvmIrBinary() ? DeserializedContainerAbiStability.IR_UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    public final IncompatibleVersionErrorData<JvmMetadataVersion> b(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()))) {
            return null;
        }
        return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), JvmMetadataVersion.INSTANCE, DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()), DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()).lastSupportedVersionWithThisLanguageVersion(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isStrictSemantics()), kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.getClassId());
    }

    public final boolean c(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return (getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), f80894c))) || (!getComponents().getConfiguration().getSkipPrereleaseCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), f80895d));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    @Nullable
    public final MemberScope createKotlinPackagePartScope(@NotNull PackageFragmentDescriptor descriptor, @NotNull KotlinJvmBinaryClass kotlinClass) {
        String[] strings;
        Pair<JvmNameResolver, ProtoBuf.Package> packageDataFrom;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        KotlinClassHeader classHeader = kotlinClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null) {
            data = null;
        } else if (!f80893b.contains(classHeader.getKind())) {
            data = null;
        }
        if (data == null || (strings = kotlinClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            try {
                packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
            } catch (InvalidProtocolBufferException e5) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e5);
            }
        } catch (Throwable th2) {
            if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()))) {
                throw th2;
            }
            packageDataFrom = null;
        }
        if (packageDataFrom == null) {
            return null;
        }
        JvmNameResolver jvmNameResolverComponent1 = packageDataFrom.component1();
        ProtoBuf.Package packageComponent2 = packageDataFrom.component2();
        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinClass, packageComponent2, jvmNameResolverComponent1, b(kotlinClass), c(kotlinClass), a(kotlinClass));
        return new DeserializedPackageMemberScope(descriptor, packageComponent2, jvmNameResolverComponent1, kotlinClass.getClassHeader().getMetadataVersion(), jvmPackagePartSource, getComponents(), "scope for " + jvmPackagePartSource + " in " + descriptor, a.f80897p0);
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    @Nullable
    public final ClassData readClassData$descriptors_jvm(@NotNull KotlinJvmBinaryClass kotlinClass) {
        Pair<JvmNameResolver, ProtoBuf.Class> classDataFrom;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        KotlinClassHeader classHeader = kotlinClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data != null) {
            if (!f80892a.contains(classHeader.getKind())) {
                data = null;
            }
        } else {
            data = null;
        }
        if (data == null) {
            return null;
        }
        String[] strings = kotlinClass.getClassHeader().getStrings();
        try {
            if (strings == null) {
                return null;
            }
            try {
                classDataFrom = JvmProtoBufUtil.readClassDataFrom(data, strings);
            } catch (InvalidProtocolBufferException e5) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e5);
            }
        } catch (Throwable th2) {
            if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()))) {
                throw th2;
            }
            classDataFrom = null;
        }
        if (classDataFrom == null) {
            return null;
        }
        return new ClassData(classDataFrom.component1(), classDataFrom.component2(), kotlinClass.getClassHeader().getMetadataVersion(), new KotlinJvmBinarySourceElement(kotlinClass, b(kotlinClass), c(kotlinClass), a(kotlinClass)));
    }

    @Nullable
    public final ClassDescriptor resolveClass(@NotNull KotlinJvmBinaryClass kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        ClassData classData$descriptors_jvm = readClassData$descriptors_jvm(kotlinClass);
        if (classData$descriptors_jvm == null) {
            return null;
        }
        return getComponents().getClassDeserializer().deserializeClass(kotlinClass.getClassId(), classData$descriptors_jvm);
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents) {
        Intrinsics.checkNotNullParameter(deserializationComponents, "<set-?>");
        this.components = deserializationComponents;
    }

    public final void setComponents(@NotNull DeserializationComponentsForJava components) {
        Intrinsics.checkNotNullParameter(components, "components");
        setComponents(components.getComponents());
    }
}
