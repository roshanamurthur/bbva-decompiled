package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeserializedPackageFragmentImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    @NotNull
    public final ProtoBasedClassDataFinder E0;

    @Nullable
    public ProtoBuf.PackageFragment F0;
    public DeserializedPackageMemberScope G0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final BinaryVersion f81692w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public final DeserializedContainerSource f81693x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final NameResolverImpl f81694y0;

    /* JADX INFO: compiled from: DeserializedPackageFragmentImpl.kt */
    public static final class a extends Lambda implements Function1<ClassId, SourceElement> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final SourceElement invoke(@NotNull ClassId it) {
            Intrinsics.checkNotNullParameter(it, "it");
            DeserializedContainerSource deserializedContainerSource = DeserializedPackageFragmentImpl.this.f81693x0;
            if (deserializedContainerSource != null) {
                return deserializedContainerSource;
            }
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return NO_SOURCE;
        }
    }

    /* JADX INFO: compiled from: DeserializedPackageFragmentImpl.kt */
    @SourceDebugExtension({"SMAP\nDeserializedPackageFragmentImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageFragmentImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedPackageFragmentImpl$initialize$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n766#2:64\n857#2,2:65\n1549#2:67\n1620#2,3:68\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageFragmentImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedPackageFragmentImpl$initialize$1\n*L\n54#1:64\n54#1:65,2\n56#1:67\n56#1:68,3\n*E\n"})
    public static final class b extends Lambda implements Function0<Collection<? extends Name>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Collection<? extends Name> invoke() {
            Collection<ClassId> allClassIds = DeserializedPackageFragmentImpl.this.getClassDataFinder().getAllClassIds();
            ArrayList arrayList = new ArrayList();
            for (Object obj : allClassIds) {
                ClassId classId = (ClassId) obj;
                if (!classId.isNestedClass() && !ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ClassId) it.next()).getShortClassName());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor module, @NotNull ProtoBuf.PackageFragment proto, @NotNull BinaryVersion metadataVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, module);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f81692w0 = metadataVersion;
        this.f81693x0 = deserializedContainerSource;
        ProtoBuf.StringTable strings = proto.getStrings();
        Intrinsics.checkNotNullExpressionValue(strings, "getStrings(...)");
        ProtoBuf.QualifiedNameTable qualifiedNames = proto.getQualifiedNames();
        Intrinsics.checkNotNullExpressionValue(qualifiedNames, "getQualifiedNames(...)");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(strings, qualifiedNames);
        this.f81694y0 = nameResolverImpl;
        this.E0 = new ProtoBasedClassDataFinder(proto, nameResolverImpl, metadataVersion, new a());
        this.F0 = proto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public MemberScope getMemberScope() {
        DeserializedPackageMemberScope deserializedPackageMemberScope = this.G0;
        if (deserializedPackageMemberScope != null) {
            return deserializedPackageMemberScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_memberScope");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void initialize(@NotNull DeserializationComponents components) {
        Intrinsics.checkNotNullParameter(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.F0;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.F0 = null;
        ProtoBuf.Package r4 = packageFragment.getPackage();
        Intrinsics.checkNotNullExpressionValue(r4, "getPackage(...)");
        this.G0 = new DeserializedPackageMemberScope(this, r4, this.f81694y0, this.f81692w0, this.f81693x0, components, "scope of " + this, new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    @NotNull
    public ProtoBasedClassDataFinder getClassDataFinder() {
        return this.E0;
    }
}
