package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bk.v;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassDeserializer.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nClassDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n288#3,2:93\n*S KotlinDebug\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n*L\n57#1:93,2\n*E\n"})
public final class ClassDeserializer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Set<ClassId> f81654c = v.setOf(ClassId.topLevel(StandardNames.FqNames.cloneable.toSafe()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeserializationComponents f81655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable f81656b;

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.f81654c;
        }
    }

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ClassId f81657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final ClassData f81658b;

        public a(@NotNull ClassId classId, @Nullable ClassData classData) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f81657a = classId;
            this.f81658b = classData;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                if (Intrinsics.areEqual(this.f81657a, ((a) obj).f81657a)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final ClassData getClassData() {
            return this.f81658b;
        }

        @NotNull
        public final ClassId getClassId() {
            return this.f81657a;
        }

        public int hashCode() {
            return this.f81657a.hashCode();
        }
    }

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class b extends Lambda implements Function1<a, ClassDescriptor> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ClassDescriptor invoke(@NotNull a key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return ClassDeserializer.access$createClass(ClassDeserializer.this, key);
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f81655a = components;
        this.f81656b = components.getStorageManager().createMemoizedFunctionWithNullableValues(new b());
    }

    public static final ClassDescriptor access$createClass(ClassDeserializer classDeserializer, a aVar) {
        Object next;
        DeserializationContext deserializationContextCreateContext;
        PackageFragmentDescriptor packageFragmentDescriptor;
        Name shortClassName;
        classDeserializer.getClass();
        ClassId classId = aVar.getClassId();
        DeserializationComponents deserializationComponents = classDeserializer.f81655a;
        Iterator<ClassDescriptorFactory> it = deserializationComponents.getFictitiousClassDescriptorFactories().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorCreateClass = it.next().createClass(classId);
            if (classDescriptorCreateClass != null) {
                return classDescriptorCreateClass;
            }
        }
        if (f81654c.contains(classId)) {
            return null;
        }
        ClassData classData = aVar.getClassData();
        if (classData == null && (classData = deserializationComponents.getClassDataFinder().findClassData(classId)) == null) {
            return null;
        }
        NameResolver nameResolverComponent1 = classData.component1();
        ProtoBuf.Class classComponent2 = classData.component2();
        BinaryVersion binaryVersionComponent3 = classData.component3();
        SourceElement sourceElementComponent4 = classData.component4();
        ClassId outerClassId = classId.getOuterClassId();
        if (outerClassId != null) {
            ClassDescriptor classDescriptorDeserializeClass$default = deserializeClass$default(classDeserializer, outerClassId, null, 2, null);
            DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorDeserializeClass$default instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorDeserializeClass$default : null;
            if (deserializedClassDescriptor == null) {
                return null;
            }
            Name shortClassName2 = classId.getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName2, "getShortClassName(...)");
            if (!deserializedClassDescriptor.hasNestedClass$deserialization(shortClassName2)) {
                return null;
            }
            deserializationContextCreateContext = deserializedClassDescriptor.getC();
        } else {
            PackageFragmentProvider packageFragmentProvider = deserializationComponents.getPackageFragmentProvider();
            FqName packageFqName = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "getPackageFqName(...)");
            Iterator<T> it2 = PackageFragmentProviderKt.packageFragments(packageFragmentProvider, packageFqName).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                if (!(packageFragmentDescriptor instanceof DeserializedPackageFragment)) {
                    break;
                }
                shortClassName = classId.getShortClassName();
                Intrinsics.checkNotNullExpressionValue(shortClassName, "getShortClassName(...)");
            } while (!((DeserializedPackageFragment) packageFragmentDescriptor).hasTopLevelClass(shortClassName));
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            DeserializationComponents deserializationComponents2 = classDeserializer.f81655a;
            ProtoBuf.TypeTable typeTable = classComponent2.getTypeTable();
            Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
            TypeTable typeTable2 = new TypeTable(typeTable);
            VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
            ProtoBuf.VersionRequirementTable versionRequirementTable = classComponent2.getVersionRequirementTable();
            Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "getVersionRequirementTable(...)");
            deserializationContextCreateContext = deserializationComponents2.createContext(packageFragmentDescriptor2, nameResolverComponent1, typeTable2, companion.create(versionRequirementTable), binaryVersionComponent3, null);
        }
        return new DeserializedClassDescriptor(deserializationContextCreateContext, classComponent2, nameResolverComponent1, binaryVersionComponent3, sourceElementComponent4);
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId, @Nullable ClassData classData) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (ClassDescriptor) this.f81656b.invoke(new a(classId, classData));
    }
}
