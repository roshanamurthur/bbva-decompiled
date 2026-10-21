package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.MemberAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<KotlinJvmBinaryClass, AnnotationsContainerWithConstants<A, C>> f80847b;

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class a extends Lambda implements Function2<AnnotationsContainerWithConstants<? extends A, ? extends C>, MemberSignature, C> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80848p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final C invoke(@NotNull AnnotationsContainerWithConstants<? extends A, ? extends C> loadConstantFromProperty, @NotNull MemberSignature it) {
            Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
            Intrinsics.checkNotNullParameter(it, "it");
            return loadConstantFromProperty.getAnnotationParametersDefaultValues().get(it);
        }
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class b extends Lambda implements Function2<AnnotationsContainerWithConstants<? extends A, ? extends C>, MemberSignature, C> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80849p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final C invoke(@NotNull AnnotationsContainerWithConstants<? extends A, ? extends C> loadConstantFromProperty, @NotNull MemberSignature it) {
            Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
            Intrinsics.checkNotNullParameter(it, "it");
            return loadConstantFromProperty.getPropertyConstants().get(it);
        }
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class c extends Lambda implements Function1<KotlinJvmBinaryClass, AnnotationsContainerWithConstants<? extends A, ? extends C>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> f80850p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader) {
            super(1);
            this.f80850p0 = abstractBinaryClassAnnotationAndConstantLoader;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final AnnotationsContainerWithConstants<A, C> invoke(@NotNull KotlinJvmBinaryClass kotlinClass) {
            Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
            return AbstractBinaryClassAnnotationAndConstantLoader.access$loadAnnotationsAndInitializers(this.f80850p0, kotlinClass);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(@NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(kotlinClassFinder);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f80847b = storageManager.createMemoizedFunction(new c(this));
    }

    public static final AnnotationsContainerWithConstants access$loadAnnotationsAndInitializers(final AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, final KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        abstractBinaryClassAnnotationAndConstantLoader.getClass();
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        kotlinJvmBinaryClass.visitMembers(new KotlinJvmBinaryClass.MemberVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1

            /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
            public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 f80855d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnnotationVisitorForMethod(@NotNull AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, MemberSignature signature) {
                    super(abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, signature);
                    Intrinsics.checkNotNullParameter(signature, "signature");
                    this.f80855d = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor
                @Nullable
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation(int i10, @NotNull ClassId classId, @NotNull SourceElement source) {
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    Intrinsics.checkNotNullParameter(source, "source");
                    MemberSignature memberSignatureFromMethodSignatureAndParameterIndex = MemberSignature.Companion.fromMethodSignatureAndParameterIndex(getSignature(), i10);
                    AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 = this.f80855d;
                    List<Object> arrayList = map.get(memberSignatureFromMethodSignatureAndParameterIndex);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map.put(memberSignatureFromMethodSignatureAndParameterIndex, arrayList);
                    }
                    return abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.f80851a.loadAnnotationIfNotSpecial(classId, source, arrayList);
                }
            }

            /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
            public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public final MemberSignature f80856a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                @NotNull
                public final ArrayList<Object> f80857b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 f80858c;

                public MemberAnnotationVisitor(@NotNull AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, MemberSignature signature) {
                    Intrinsics.checkNotNullParameter(signature, "signature");
                    this.f80858c = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
                    this.f80856a = signature;
                    this.f80857b = new ArrayList<>();
                }

                @NotNull
                public final MemberSignature getSignature() {
                    return this.f80856a;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                @Nullable
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement source) {
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    Intrinsics.checkNotNullParameter(source, "source");
                    return this.f80858c.f80851a.loadAnnotationIfNotSpecial(classId, source, this.f80857b);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                    ArrayList<Object> arrayList = this.f80857b;
                    if (!arrayList.isEmpty()) {
                        map.put(this.f80856a, arrayList);
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            @Nullable
            public KotlinJvmBinaryClass.AnnotationVisitor visitField(@NotNull Name name, @NotNull String desc, @Nullable Object obj) {
                Object objLoadConstant;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(desc, "desc");
                MemberSignature.Companion companion = MemberSignature.Companion;
                String strAsString = name.asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                MemberSignature memberSignatureFromFieldNameAndDesc = companion.fromFieldNameAndDesc(strAsString, desc);
                if (obj != null && (objLoadConstant = this.f80851a.loadConstant(desc, obj)) != null) {
                    map2.put(memberSignatureFromFieldNameAndDesc, objLoadConstant);
                }
                return new MemberAnnotationVisitor(this, memberSignatureFromFieldNameAndDesc);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            @Nullable
            public KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod(@NotNull Name name, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(desc, "desc");
                MemberSignature.Companion companion = MemberSignature.Companion;
                String strAsString = name.asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                return new AnnotationVisitorForMethod(this, companion.fromMethodNameAndDesc(strAsString, desc));
            }
        }, abstractBinaryClassAnnotationAndConstantLoader.getCachedFileContent(kotlinJvmBinaryClass));
        return new AnnotationsContainerWithConstants(map, map2, map3);
    }

    public final C d(ProtoContainer protoContainer, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, KotlinType kotlinType, Function2<? super AnnotationsContainerWithConstants<? extends A, ? extends C>, ? super MemberSignature, ? extends C> function2) {
        C cInvoke;
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, AbstractBinaryClassAnnotationLoader.Companion.getSpecialCaseContainerClass(protoContainer, true, true, Flags.IS_CONST.get(property.getFlags()), JvmProtoBufUtil.isMovedFromInterfaceCompanion(property), getKotlinClassFinder(), getJvmMetadataVersion()));
        if (kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers == null) {
            return null;
        }
        MemberSignature callableSignature = getCallableSignature(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers.getClassHeader().getMetadataVersion().isAtLeast(DeserializedDescriptorResolver.Companion.getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm()));
        if (callableSignature == null || (cInvoke = function2.invoke(this.f80847b.invoke(kotlinJvmBinaryClassFindClassWithAnnotationsAndInitializers), callableSignature)) == null) {
            return null;
        }
        return UnsignedTypes.isUnsignedType(kotlinType) ? transformToUnsignedConstant(cInvoke) : cInvoke;
    }

    public final boolean isRepeatableWithImplicitContainer(@NotNull ClassId annotationClassId, @NotNull Map<Name, ? extends ConstantValue<?>> arguments) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!Intrinsics.areEqual(annotationClassId, SpecialJvmAnnotations.INSTANCE.getJAVA_LANG_ANNOTATION_REPEATABLE())) {
            return false;
        }
        ConstantValue<?> constantValue = arguments.get(Name.identifier("value"));
        KClassValue kClassValue = constantValue instanceof KClassValue ? (KClassValue) constantValue : null;
        if (kClassValue == null) {
            return false;
        }
        KClassValue.Value value = kClassValue.getValue();
        KClassValue.Value.NormalClass normalClass = value instanceof KClassValue.Value.NormalClass ? (KClassValue.Value.NormalClass) value : null;
        if (normalClass == null) {
            return false;
        }
        return isImplicitRepeatableContainer(normalClass.getClassId());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    public C loadAnnotationDefaultValue(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto, @NotNull KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return d(container, proto, AnnotatedCallableKind.PROPERTY_GETTER, expectedType, a.f80848p0);
    }

    @Nullable
    public abstract C loadConstant(@NotNull String str, @NotNull Object obj);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    public C loadPropertyConstant(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto, @NotNull KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return d(container, proto, AnnotatedCallableKind.PROPERTY, expectedType, b.f80849p0);
    }

    @Nullable
    public abstract C transformToUnsignedConstant(@NotNull C c10);

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    public AnnotationsContainerWithConstants<A, C> getAnnotationsContainer(@NotNull KotlinJvmBinaryClass binaryClass) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        return this.f80847b.invoke(binaryClass);
    }
}
