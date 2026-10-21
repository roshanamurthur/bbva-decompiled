package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DeserializationContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeserializationComponents f81682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NameResolver f81683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DeclarationDescriptor f81684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TypeTable f81685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final VersionRequirementTable f81686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BinaryVersion f81687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final DeserializedContainerSource f81688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final TypeDeserializer f81689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MemberDeserializer f81690i;

    public DeserializationContext(@NotNull DeserializationComponents components, @NotNull NameResolver nameResolver, @NotNull DeclarationDescriptor containingDeclaration, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion metadataVersion, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> typeParameters) {
        String presentableString;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        this.f81682a = components;
        this.f81683b = nameResolver;
        this.f81684c = containingDeclaration;
        this.f81685d = typeTable;
        this.f81686e = versionRequirementTable;
        this.f81687f = metadataVersion;
        this.f81688g = deserializedContainerSource;
        this.f81689h = new TypeDeserializer(this, typeDeserializer, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (deserializedContainerSource == null || (presentableString = deserializedContainerSource.getPresentableString()) == null) ? "[container not found]" : presentableString);
        this.f81690i = new MemberDeserializer(this);
    }

    public static /* synthetic */ DeserializationContext childContext$default(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            nameResolver = deserializationContext.f81683b;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i10 & 8) != 0) {
            typeTable = deserializationContext.f81685d;
        }
        TypeTable typeTable2 = typeTable;
        if ((i10 & 16) != 0) {
            versionRequirementTable = deserializationContext.f81686e;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i10 & 32) != 0) {
            binaryVersion = deserializationContext.f81687f;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    @NotNull
    public final DeserializationContext childContext(@NotNull DeclarationDescriptor descriptor, @NotNull List<ProtoBuf.TypeParameter> typeParameterProtos, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion metadataVersion) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        Intrinsics.checkNotNullParameter(versionRequirementTable2, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        DeserializationComponents deserializationComponents = this.f81682a;
        if (!VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(metadataVersion)) {
            versionRequirementTable2 = this.f81686e;
        }
        return new DeserializationContext(deserializationComponents, nameResolver, descriptor, typeTable, versionRequirementTable2, metadataVersion, this.f81688g, this.f81689h, typeParameterProtos);
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.f81682a;
    }

    @Nullable
    public final DeserializedContainerSource getContainerSource() {
        return this.f81688g;
    }

    @NotNull
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.f81684c;
    }

    @NotNull
    public final MemberDeserializer getMemberDeserializer() {
        return this.f81690i;
    }

    @NotNull
    public final NameResolver getNameResolver() {
        return this.f81683b;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f81682a.getStorageManager();
    }

    @NotNull
    public final TypeDeserializer getTypeDeserializer() {
        return this.f81689h;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.f81685d;
    }

    @NotNull
    public final VersionRequirementTable getVersionRequirementTable() {
        return this.f81686e;
    }
}
