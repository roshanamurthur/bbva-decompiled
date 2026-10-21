package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.material3.TextFieldImplKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,338:1\n1549#2:339\n1620#2,3:340\n1549#2:343\n1620#2,3:344\n*S KotlinDebug\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n*L\n197#1:339\n197#1:340,3\n201#1:343\n201#1:344,3\n*E\n"})
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KotlinClassFinder f80859a;

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static abstract class AnnotationsContainer<A> {
        @NotNull
        public abstract Map<MemberSignature, List<A>> getMemberAnnotations();
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    @SourceDebugExtension({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final KotlinJvmBinaryClass getSpecialCaseContainerClass(@NotNull ProtoContainer container, boolean z10, boolean z11, @Nullable Boolean bool, boolean z12, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull JvmMetadataVersion jvmMetadataVersion) {
            ProtoContainer.Class outerClass;
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + RootService.CLOSE_BRACKET).toString());
                }
                if (container instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r10 = (ProtoContainer.Class) container;
                    if (r10.getKind() == ProtoBuf.Class.Kind.INTERFACE) {
                        ClassId classIdCreateNestedClassId = r10.getClassId().createNestedClassId(Name.identifier("DefaultImpls"));
                        Intrinsics.checkNotNullExpressionValue(classIdCreateNestedClassId, "createNestedClassId(...)");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, classIdCreateNestedClassId, jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof ProtoContainer.Package)) {
                    SourceElement source = container.getSource();
                    JvmPackagePartSource jvmPackagePartSource = source instanceof JvmPackagePartSource ? (JvmPackagePartSource) source : null;
                    JvmClassName facadeClassName = jvmPackagePartSource != null ? jvmPackagePartSource.getFacadeClassName() : null;
                    if (facadeClassName != null) {
                        String internalName = facadeClassName.getInternalName();
                        Intrinsics.checkNotNullExpressionValue(internalName, "getInternalName(...)");
                        ClassId classId = ClassId.topLevel(new FqName(l.replace$default(internalName, JsonPointer.SEPARATOR, '.', false, 4, (Object) null)));
                        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, classId, jvmMetadataVersion);
                    }
                }
            }
            if (z11 && (container instanceof ProtoContainer.Class)) {
                ProtoContainer.Class r11 = (ProtoContainer.Class) container;
                if (r11.getKind() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (outerClass = r11.getOuterClass()) != null && (outerClass.getKind() == ProtoBuf.Class.Kind.CLASS || outerClass.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS || (z12 && (outerClass.getKind() == ProtoBuf.Class.Kind.INTERFACE || outerClass.getKind() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    SourceElement source2 = outerClass.getSource();
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.getBinaryClass();
                    }
                    return null;
                }
            }
            if (!(container instanceof ProtoContainer.Package) || !(container.getSource() instanceof JvmPackagePartSource)) {
                return null;
            }
            SourceElement source3 = container.getSource();
            Intrinsics.checkNotNull(source3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) source3;
            KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource2.getKnownJvmBinaryClass();
            return knownJvmBinaryClass == null ? KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, jvmPackagePartSource2.getClassId(), jvmMetadataVersion) : knownJvmBinaryClass;
        }
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BACKING_FIELD;
        public static final a DELEGATE_FIELD;
        public static final a PROPERTY;

        static {
            a aVar = new a("PROPERTY", 0);
            PROPERTY = aVar;
            a aVar2 = new a("BACKING_FIELD", 1);
            BACKING_FIELD = aVar2;
            a aVar3 = new a("DELEGATE_FIELD", 2);
            DELEGATE_FIELD = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = EnumEntriesKt.enumEntries(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public AbstractBinaryClassAnnotationLoader(@NotNull KotlinClassFinder kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f80859a = kotlinClassFinder;
    }

    public static /* synthetic */ List b(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z10, Boolean bool, boolean z11, int i10) {
        boolean z12 = (i10 & 4) != 0 ? false : z10;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return abstractBinaryClassAnnotationLoader.a(protoContainer, memberSignature, z12, false, bool, (i10 & 32) != 0 ? false : z11);
    }

    public static /* synthetic */ MemberSignature getCallableSignature$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractBinaryClassAnnotationLoader.getCallableSignature(messageLite, nameResolver, typeTable, annotatedCallableKind, z10);
    }

    public final List<A> a(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z10, boolean z11, Boolean bool, boolean z12) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, Companion.getSpecialCaseContainerClass(protoContainer, z10, z11, bool, z12, this.f80859a, getJvmMetadataVersion()));
        if (kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<A> list = getAnnotationsContainer(kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers).getMemberAnnotations().get(memberSignature);
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    public final List<A> c(ProtoContainer protoContainer, ProtoBuf.Property property, a aVar) {
        Boolean bool = Flags.IS_CONST.get(property.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        boolean zIsMovedFromInterfaceCompanion = JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        if (aVar == a.PROPERTY) {
            MemberSignature propertySignature$default = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            return propertySignature$default == null ? CollectionsKt__CollectionsKt.emptyList() : b(this, protoContainer, propertySignature$default, true, Boolean.valueOf(zBooleanValue), zIsMovedFromInterfaceCompanion, 8);
        }
        MemberSignature propertySignature$default2 = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return StringsKt__StringsKt.contains$default((CharSequence) propertySignature$default2.getSignature(), (CharSequence) "$delegate", false, 2, (Object) null) != (aVar == a.DELEGATE_FIELD) ? CollectionsKt__CollectionsKt.emptyList() : a(protoContainer, propertySignature$default2, true, true, Boolean.valueOf(zBooleanValue), zIsMovedFromInterfaceCompanion);
    }

    @Nullable
    public final KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers(@NotNull ProtoContainer container, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (container instanceof ProtoContainer.Class) {
            SourceElement source = ((ProtoContainer.Class) container).getSource();
            KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
            if (kotlinJvmBinarySourceElement != null) {
                return kotlinJvmBinarySourceElement.getBinaryClass();
            }
        }
        return null;
    }

    @NotNull
    public abstract S getAnnotationsContainer(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass);

    @Nullable
    public byte[] getCachedFileContent(@NotNull KotlinJvmBinaryClass kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        return null;
    }

    @Nullable
    public final MemberSignature getCallableSignature(@NotNull MessageLite proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull AnnotatedCallableKind kind, boolean z10) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.Companion;
            JvmMemberSignature.Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (jvmConstructorSignature == null) {
                return null;
            }
            return companion.fromJvmMemberSignature(jvmConstructorSignature);
        }
        if (proto instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.Companion;
            JvmMemberSignature.Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (jvmMethodSignature == null) {
                return null;
            }
            return companion2.fromJvmMemberSignature(jvmMethodSignature);
        }
        if (!(proto instanceof ProtoBuf.Property)) {
            return null;
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 == 1) {
            if (!jvmPropertySignature.hasGetter()) {
                return null;
            }
            MemberSignature.Companion companion3 = MemberSignature.Companion;
            JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
            Intrinsics.checkNotNullExpressionValue(getter, "getGetter(...)");
            return companion3.fromMethod(nameResolver, getter);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return AbstractBinaryClassAnnotationLoaderKt.getPropertySignature((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z10);
        }
        if (!jvmPropertySignature.hasSetter()) {
            return null;
        }
        MemberSignature.Companion companion4 = MemberSignature.Companion;
        JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
        Intrinsics.checkNotNullExpressionValue(setter, "getSetter(...)");
        return companion4.fromMethod(nameResolver, setter);
    }

    @NotNull
    public abstract JvmMetadataVersion getJvmMetadataVersion();

    @NotNull
    public final KotlinClassFinder getKotlinClassFinder() {
        return this.f80859a;
    }

    public final boolean isImplicitRepeatableContainer(@NotNull ClassId classId) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass;
        Intrinsics.checkNotNullParameter(classId, "classId");
        return classId.getOuterClassId() != null && Intrinsics.areEqual(classId.getShortClassName().asString(), TextFieldImplKt.ContainerId) && (kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f80859a, classId, getJvmMetadataVersion())) != null && SpecialJvmAnnotations.INSTANCE.isAnnotatedWithContainerMetaAnnotation(kotlinJvmBinaryClassFindKotlinClass);
    }

    @NotNull
    public abstract A loadAnnotation(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver);

    @Nullable
    public abstract KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List<A> list);

    @Nullable
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotationIfNotSpecial(@NotNull ClassId annotationClassId, @NotNull SourceElement source, @NotNull List<A> result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        if (SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS().contains(annotationClassId)) {
            return null;
        }
        return loadAnnotation(annotationClassId, source, result);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadCallableAnnotations(@NotNull ProtoContainer container, @NotNull MessageLite proto, @NotNull AnnotatedCallableKind kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind == AnnotatedCallableKind.PROPERTY) {
            return c(container, (ProtoBuf.Property) proto, a.PROPERTY);
        }
        MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        return callableSignature$default == null ? CollectionsKt__CollectionsKt.emptyList() : b(this, container, callableSignature$default, false, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadClassAnnotations(@NotNull ProtoContainer.Class container) {
        Intrinsics.checkNotNullParameter(container, "container");
        SourceElement source = container.getSource();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
        KotlinJvmBinaryClass binaryClass = kotlinJvmBinarySourceElement != null ? kotlinJvmBinarySourceElement.getBinaryClass() : null;
        if (binaryClass != null) {
            final ArrayList arrayList = new ArrayList(1);
            binaryClass.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.loadClassAnnotations.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> f80860a;

                {
                    this.f80860a = this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                @Nullable
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement source2) {
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    Intrinsics.checkNotNullParameter(source2, "source");
                    return this.f80860a.loadAnnotationIfNotSpecial(classId, source2, arrayList);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                }
            }, getCachedFileContent(binaryClass));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.debugFqName()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadEnumEntryAnnotations(@NotNull ProtoContainer container, @NotNull ProtoBuf.EnumEntry proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        MemberSignature.Companion companion = MemberSignature.Companion;
        String string = container.getNameResolver().getString(proto.getName());
        String strAsString = ((ProtoContainer.Class) container).getClassId().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return b(this, container, companion.fromFieldNameAndDesc(string, ClassMapperLite.mapClass(strAsString)), false, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadExtensionReceiverParameterAnnotations(@NotNull ProtoContainer container, @NotNull MessageLite proto, @NotNull AnnotatedCallableKind kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        return callableSignature$default != null ? b(this, container, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, 0), false, null, false, 60) : CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadPropertyBackingFieldAnnotations(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return c(container, proto, a.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadPropertyDelegateFieldAnnotations(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return c(container, proto, a.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadTypeAnnotations(@NotNull ProtoBuf.Type proto, @NotNull NameResolver nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.typeAnnotation);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            Intrinsics.checkNotNull(annotation);
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadTypeParameterAnnotations(@NotNull ProtoBuf.TypeParameter proto, @NotNull NameResolver nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.typeParameterAnnotation);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            Intrinsics.checkNotNull(annotation);
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public List<A> loadValueParameterAnnotations(@NotNull ProtoContainer container, @NotNull MessageLite callableProto, @NotNull AnnotatedCallableKind kind, int i10, @NotNull ProtoBuf.ValueParameter proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        MemberSignature callableSignature$default = getCallableSignature$default(this, callableProto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i11 = 0;
        if (callableProto instanceof ProtoBuf.Function) {
            if (ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Function) callableProto)) {
                i11 = 1;
            }
        } else if (callableProto instanceof ProtoBuf.Property) {
            if (ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Property) callableProto)) {
                i11 = 1;
            }
        } else {
            if (!(callableProto instanceof ProtoBuf.Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            Intrinsics.checkNotNull(container, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            ProtoContainer.Class r11 = (ProtoContainer.Class) container;
            if (r11.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS) {
                i11 = 2;
            } else if (r11.isInner()) {
                i11 = 1;
            }
        }
        return b(this, container, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i10 + i11), false, null, false, 60);
    }
}
