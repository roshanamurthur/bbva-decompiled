package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bk.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeDeserializer.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nTypeDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1549#2:301\n1620#2,3:302\n1559#2:305\n1590#2,4:306\n1549#2:311\n1620#2,3:312\n1#3:310\n*S KotlinDebug\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n*L\n76#1:301\n76#1:302,3\n105#1:305\n105#1:306,4\n246#1:311\n246#1:312,3\n*E\n"})
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeserializationContext f81742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TypeDeserializer f81743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f81744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f81745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable f81746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable f81747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<Integer, TypeParameterDescriptor> f81748g;

    /* JADX INFO: compiled from: TypeDeserializer.kt */
    public static final class a extends Lambda implements Function1<Integer, ClassifierDescriptor> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ClassifierDescriptor invoke(Integer num) {
            return invoke(num.intValue());
        }

        @Nullable
        public final ClassifierDescriptor invoke(int i10) {
            return TypeDeserializer.access$computeClassifierDescriptor(TypeDeserializer.this, i10);
        }
    }

    /* JADX INFO: compiled from: TypeDeserializer.kt */
    public static final class b extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeDeserializer f81750p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ProtoBuf.Type f81751q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
            super(0);
            this.f81750p0 = typeDeserializer;
            this.f81751q0 = type;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends AnnotationDescriptor> invoke() {
            TypeDeserializer typeDeserializer = this.f81750p0;
            return typeDeserializer.f81742a.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(this.f81751q0, typeDeserializer.f81742a.getNameResolver());
        }
    }

    /* JADX INFO: compiled from: TypeDeserializer.kt */
    public static final class c extends Lambda implements Function1<Integer, ClassifierDescriptor> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ClassifierDescriptor invoke(Integer num) {
            return invoke(num.intValue());
        }

        @Nullable
        public final ClassifierDescriptor invoke(int i10) {
            return TypeDeserializer.access$computeTypeAliasDescriptor(TypeDeserializer.this, i10);
        }
    }

    /* JADX INFO: compiled from: TypeDeserializer.kt */
    public /* synthetic */ class d extends FunctionReference implements Function1<ClassId, ClassId> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f81753p0 = new d(1);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ClassId.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ClassId invoke(@NotNull ClassId p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return p4.getOuterClassId();
        }
    }

    /* JADX INFO: compiled from: TypeDeserializer.kt */
    public static final class e extends Lambda implements Function1<ProtoBuf.Type, ProtoBuf.Type> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ProtoBuf.Type invoke(@NotNull ProtoBuf.Type it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ProtoTypeTableUtilKt.outerType(it, TypeDeserializer.this.f81742a.getTypeTable());
        }
    }

    /* JADX INFO: compiled from: TypeDeserializer.kt */
    public static final class f extends Lambda implements Function1<ProtoBuf.Type, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f81755p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Integer invoke(@NotNull ProtoBuf.Type it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getArgumentCount());
        }
    }

    public TypeDeserializer(@NotNull DeserializationContext c10, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> typeParameterProtos, @NotNull String debugName, @NotNull String containerPresentableName) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f81742a = c10;
        this.f81743b = typeDeserializer;
        this.f81744c = debugName;
        this.f81745d = containerPresentableName;
        this.f81746e = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new a());
        this.f81747f = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new c());
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = q.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i10 = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f81742a, typeParameter, i10));
                i10++;
            }
        }
        this.f81748g = linkedHashMap;
    }

    public static SimpleType a(SimpleType simpleType, KotlinType kotlinType) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(simpleType);
        Annotations annotations = simpleType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType);
        List listDropLast = CollectionsKt___CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDropLast, 10));
        Iterator it = listDropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType, true).makeNullableAsSpecified(simpleType.isMarkedNullable());
    }

    public static final ClassifierDescriptor access$computeClassifierDescriptor(TypeDeserializer typeDeserializer, int i10) {
        DeserializationContext deserializationContext = typeDeserializer.f81742a;
        ClassId classId = NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), i10);
        return classId.isLocal() ? deserializationContext.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(deserializationContext.getComponents().getModuleDescriptor(), classId);
    }

    public static final ClassifierDescriptor access$computeTypeAliasDescriptor(TypeDeserializer typeDeserializer, int i10) {
        DeserializationContext deserializationContext = typeDeserializer.f81742a;
        ClassId classId = NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), i10);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(deserializationContext.getComponents().getModuleDescriptor(), classId);
    }

    public static final List<ProtoBuf.Type.Argument> c(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.f81742a.getTypeTable());
        List<ProtoBuf.Type.Argument> listC = typeOuterType != null ? c(typeOuterType, typeDeserializer) : null;
        if (listC == null) {
            listC = CollectionsKt__CollectionsKt.emptyList();
        }
        return CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) listC);
    }

    public static TypeAttributes d(List list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(CollectionsKt__IterablesKt.flatten(arrayList));
    }

    public static final ClassDescriptor e(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i10) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.f81742a.getNameResolver(), i10);
        List<Integer> mutableList = SequencesKt___SequencesKt.toMutableList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(type, typeDeserializer.new e()), f.f81755p0));
        int iCount = SequencesKt___SequencesKt.count(SequencesKt__SequencesKt.generateSequence(classId, d.f81753p0));
        while (mutableList.size() < iCount) {
            mutableList.add(0);
        }
        return typeDeserializer.f81742a.getComponents().getNotFoundClasses().getClass(classId, mutableList);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return typeDeserializer.simpleType(type, z10);
    }

    public final TypeParameterDescriptor b(int i10) {
        TypeParameterDescriptor typeParameterDescriptor = this.f81748g.get(Integer.valueOf(i10));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.f81743b;
        if (typeDeserializer != null) {
            return typeDeserializer.b(i10);
        }
        return null;
    }

    @NotNull
    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt___CollectionsKt.toList(this.f81748g.values());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02da  */
    /* JADX WARN: Code duplicated, block: B:115:0x0324  */
    /* JADX WARN: Code duplicated, block: B:117:0x0327  */
    /* JADX WARN: Code duplicated, block: B:118:0x0332 A[PHI: r4
      0x0332: PHI (r4v7 java.lang.Object) = (r4v5 java.lang.Object), (r4v14 java.lang.Object) binds: [B:122:0x0367, B:116:0x0325] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0334  */
    /* JADX WARN: Code duplicated, block: B:121:0x0357  */
    /* JADX WARN: Code duplicated, block: B:124:0x036a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0056  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01da  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x024a  */
    /* JADX WARN: Code duplicated, block: B:79:0x025f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0272  */
    /* JADX WARN: Code duplicated, block: B:83:0x0277  */
    /* JADX WARN: Code duplicated, block: B:86:0x0298  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x02cf  */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x036a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    @NotNull
    public final SimpleType simpleType(@NotNull ProtoBuf.Type proto, boolean z10) {
        SimpleType replacementTypeForLocalClassifiers;
        TypeConstructor typeConstructorCreateErrorTypeConstructor;
        ClassifierDescriptor classifierDescriptorE;
        Object next;
        TypeAttributes typeAttributesD;
        ArrayList arrayList;
        int i10;
        List<? extends TypeProjection> list;
        Boolean bool;
        SimpleType simpleTypeSimpleType$default;
        Boolean bool2;
        ?? CreateErrorTypeWithArguments;
        boolean nullable;
        int size;
        List<? extends TypeProjection> list2;
        SimpleType simpleTypeSimpleType$default2;
        TypeProjection typeProjection;
        KotlinType type;
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor;
        FqName fqNameSafe;
        int size2;
        SimpleType simpleTypeWithAbbreviation;
        ProtoBuf.Type.Argument argument;
        TypeParameterDescriptor typeParameterDescriptor;
        Variance variance;
        ProtoBuf.Type type2;
        TypeProjectionBase typeProjectionImpl;
        TypeProjectionBase typeProjectionImpl2;
        Intrinsics.checkNotNullParameter(proto, "proto");
        boolean zHasClassName = proto.hasClassName();
        DeserializationContext deserializationContext = this.f81742a;
        Object objMakeDefinitelyNotNull$default = null;
        if (zHasClassName) {
            if (NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), proto.getClassName()).isLocal()) {
                replacementTypeForLocalClassifiers = deserializationContext.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
            } else {
                replacementTypeForLocalClassifiers = null;
            }
        } else if (!proto.hasTypeAliasName()) {
            replacementTypeForLocalClassifiers = null;
        } else if (NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), proto.getTypeAliasName()).isLocal()) {
            replacementTypeForLocalClassifiers = deserializationContext.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        } else {
            replacementTypeForLocalClassifiers = null;
        }
        if (replacementTypeForLocalClassifiers != null) {
            return replacementTypeForLocalClassifiers;
        }
        if (!proto.hasClassName()) {
            if (proto.hasTypeParameter()) {
                classifierDescriptorE = b(proto.getTypeParameter());
                if (classifierDescriptorE == null) {
                    typeConstructorCreateErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(proto.getTypeParameter()), this.f81745d);
                }
            } else if (proto.hasTypeParameterName()) {
                String string = deserializationContext.getNameResolver().getString(proto.getTypeParameterName());
                Iterator it = getOwnTypeParameters().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((TypeParameterDescriptor) next).getName().asString(), string));
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) next;
                if (typeParameterDescriptor2 == null) {
                    typeConstructorCreateErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, deserializationContext.getContainingDeclaration().toString());
                } else {
                    classifierDescriptorE = typeParameterDescriptor2;
                }
            } else if (proto.hasTypeAliasName()) {
                classifierDescriptorE = (ClassifierDescriptor) this.f81747f.invoke(Integer.valueOf(proto.getTypeAliasName()));
                if (classifierDescriptorE == null) {
                    classifierDescriptorE = e(this, proto, proto.getTypeAliasName());
                }
            } else {
                typeConstructorCreateErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            if (ErrorUtils.isError(typeConstructorCreateErrorTypeConstructor.mo5778getDeclarationDescriptor())) {
                return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructorCreateErrorTypeConstructor, typeConstructorCreateErrorTypeConstructor.toString());
            }
            DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(deserializationContext.getStorageManager(), new b(proto, this));
            typeAttributesD = d(deserializationContext.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, typeConstructorCreateErrorTypeConstructor, deserializationContext.getContainingDeclaration());
            List<ProtoBuf.Type.Argument> listC = c(proto, this);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listC, 10));
            i10 = 0;
            for (Object obj : listC) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                argument = (ProtoBuf.Type.Argument) obj;
                List<TypeParameterDescriptor> parameters = typeConstructorCreateErrorTypeConstructor.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt___CollectionsKt.getOrNull(parameters, i10);
                if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
                    ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
                    ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
                    Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
                    variance = protoEnumFlags.variance(projection);
                    type2 = ProtoTypeTableUtilKt.type(argument, deserializationContext.getTypeTable());
                    if (type2 == null) {
                        typeProjectionImpl2 = new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                    } else {
                        typeProjectionImpl = new TypeProjectionImpl(variance, type(type2));
                        typeProjectionImpl2 = typeProjectionImpl;
                    }
                } else if (typeParameterDescriptor == null) {
                    typeProjectionImpl2 = new StarProjectionForAbsentTypeParameter(deserializationContext.getComponents().getModuleDescriptor().getBuiltIns());
                } else {
                    typeProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                    typeProjectionImpl2 = typeProjectionImpl;
                }
                arrayList.add(typeProjectionImpl2);
                i10 = i11;
            }
            list = CollectionsKt___CollectionsKt.toList(arrayList);
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor2 = typeConstructorCreateErrorTypeConstructor.mo5778getDeclarationDescriptor();
            boolean z11 = true;
            if (z10 || !(classifierDescriptorMo5778getDeclarationDescriptor2 instanceof TypeAliasDescriptor)) {
                bool = Flags.SUSPEND_TYPE.get(proto.getFlags());
                Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
                if (bool.booleanValue()) {
                    nullable = proto.getNullable();
                    size = typeConstructorCreateErrorTypeConstructor.getParameters().size() - list.size();
                    if (size != 0) {
                        if (size == 1 && (size2 = list.size() - 1) >= 0) {
                            TypeConstructor typeConstructor = typeConstructorCreateErrorTypeConstructor.getBuiltIns().getSuspendFunction(size2).getTypeConstructor();
                            Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
                            objMakeDefinitelyNotNull$default = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructor, list, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                        }
                        list2 = list;
                    } else {
                        list2 = list;
                        simpleTypeSimpleType$default2 = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructorCreateErrorTypeConstructor, list, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                        if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default2) && (typeProjection = (TypeProjection) CollectionsKt___CollectionsKt.lastOrNull((List) FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleTypeSimpleType$default2))) != null && (type = typeProjection.getType()) != null) {
                            classifierDescriptorMo5778getDeclarationDescriptor = type.getConstructor().mo5778getDeclarationDescriptor();
                            if (classifierDescriptorMo5778getDeclarationDescriptor != null) {
                                fqNameSafe = DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo5778getDeclarationDescriptor);
                            } else {
                                fqNameSafe = null;
                            }
                            if (type.getArguments().size() == 1 || !(Intrinsics.areEqual(fqNameSafe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME) || Intrinsics.areEqual(fqNameSafe, TypeDeserializerKt.f81756a))) {
                                objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                            } else {
                                KotlinType type3 = ((TypeProjection) CollectionsKt___CollectionsKt.single((List) type.getArguments())).getType();
                                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
                                CallableDescriptor callableDescriptor = containingDeclaration instanceof CallableDescriptor ? (CallableDescriptor) containingDeclaration : null;
                                objMakeDefinitelyNotNull$default = Intrinsics.areEqual(callableDescriptor != null ? DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? a(simpleTypeSimpleType$default2, type3) : a(simpleTypeSimpleType$default2, type3);
                            }
                        }
                    }
                    if (objMakeDefinitelyNotNull$default == null) {
                        CreateErrorTypeWithArguments = ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructorCreateErrorTypeConstructor, new String[0]);
                    } else {
                        CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                        CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                    }
                } else {
                    simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructorCreateErrorTypeConstructor, list, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                    bool2 = Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags());
                    Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
                    if (bool2.booleanValue()) {
                        objMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                        if (objMakeDefinitelyNotNull$default == null) {
                            CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                            throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                        }
                        CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                        CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                    }
                }
            } else {
                KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
                SimpleType simpleTypeComputeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorMo5778getDeclarationDescriptor2, list);
                TypeAttributes typeAttributesD2 = d(deserializationContext.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(CollectionsKt___CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) simpleTypeComputeExpandedType.getAnnotations())), typeConstructorCreateErrorTypeConstructor, deserializationContext.getContainingDeclaration());
                if (!KotlinTypeKt.isNullable(simpleTypeComputeExpandedType) && !proto.getNullable()) {
                    z11 = false;
                }
                CreateErrorTypeWithArguments = simpleTypeComputeExpandedType.makeNullableAsSpecified(z11).replaceAttributes(typeAttributesD2);
            }
            CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
            ProtoBuf.Type typeAbbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(proto, deserializationContext.getTypeTable());
            return (typeAbbreviatedType == null || (simpleTypeWithAbbreviation = SpecialTypesKt.withAbbreviation(CreateErrorTypeWithArguments, simpleType(typeAbbreviatedType, false))) == null) ? CreateErrorTypeWithArguments : simpleTypeWithAbbreviation;
        }
        classifierDescriptorE = (ClassifierDescriptor) this.f81746e.invoke(Integer.valueOf(proto.getClassName()));
        if (classifierDescriptorE == null) {
            classifierDescriptorE = e(this, proto, proto.getClassName());
        }
        typeConstructorCreateErrorTypeConstructor = classifierDescriptorE.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructorCreateErrorTypeConstructor, "getTypeConstructor(...)");
        if (ErrorUtils.isError(typeConstructorCreateErrorTypeConstructor.mo5778getDeclarationDescriptor())) {
            return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructorCreateErrorTypeConstructor, typeConstructorCreateErrorTypeConstructor.toString());
        }
        DeserializedAnnotations deserializedAnnotations2 = new DeserializedAnnotations(deserializationContext.getStorageManager(), new b(proto, this));
        typeAttributesD = d(deserializationContext.getComponents().getTypeAttributeTranslators(), deserializedAnnotations2, typeConstructorCreateErrorTypeConstructor, deserializationContext.getContainingDeclaration());
        List<ProtoBuf.Type.Argument> listC2 = c(proto, this);
        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listC2, 10));
        i10 = 0;
        while (r8.hasNext()) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            argument = (ProtoBuf.Type.Argument) obj;
            List<TypeParameterDescriptor> parameters2 = typeConstructorCreateErrorTypeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
            typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt___CollectionsKt.getOrNull(parameters2, i10);
            if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                ProtoBuf.Type.Argument.Projection projection2 = argument.getProjection();
                Intrinsics.checkNotNullExpressionValue(projection2, "getProjection(...)");
                variance = protoEnumFlags2.variance(projection2);
                type2 = ProtoTypeTableUtilKt.type(argument, deserializationContext.getTypeTable());
                if (type2 == null) {
                    typeProjectionImpl2 = new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                } else {
                    typeProjectionImpl = new TypeProjectionImpl(variance, type(type2));
                    typeProjectionImpl2 = typeProjectionImpl;
                }
            } else if (typeParameterDescriptor == null) {
                typeProjectionImpl2 = new StarProjectionForAbsentTypeParameter(deserializationContext.getComponents().getModuleDescriptor().getBuiltIns());
            } else {
                typeProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                typeProjectionImpl2 = typeProjectionImpl;
            }
            arrayList.add(typeProjectionImpl2);
            i10 = i12;
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor3 = typeConstructorCreateErrorTypeConstructor.mo5778getDeclarationDescriptor();
        boolean z12 = true;
        if (z10) {
            bool = Flags.SUSPEND_TYPE.get(proto.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            if (bool.booleanValue()) {
                nullable = proto.getNullable();
                size = typeConstructorCreateErrorTypeConstructor.getParameters().size() - list.size();
                if (size != 0) {
                    if (size == 1) {
                        TypeConstructor typeConstructor2 = typeConstructorCreateErrorTypeConstructor.getBuiltIns().getSuspendFunction(size2).getTypeConstructor();
                        Intrinsics.checkNotNullExpressionValue(typeConstructor2, "getTypeConstructor(...)");
                        objMakeDefinitelyNotNull$default = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructor2, list, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    }
                    list2 = list;
                } else {
                    list2 = list;
                    simpleTypeSimpleType$default2 = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructorCreateErrorTypeConstructor, list, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default2)) {
                        classifierDescriptorMo5778getDeclarationDescriptor = type.getConstructor().mo5778getDeclarationDescriptor();
                        if (classifierDescriptorMo5778getDeclarationDescriptor != null) {
                            fqNameSafe = DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo5778getDeclarationDescriptor);
                        } else {
                            fqNameSafe = null;
                        }
                        if (type.getArguments().size() == 1) {
                            objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                        } else {
                            objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                        }
                    }
                }
                if (objMakeDefinitelyNotNull$default == null) {
                    CreateErrorTypeWithArguments = ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructorCreateErrorTypeConstructor, new String[0]);
                } else {
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                }
            } else {
                simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructorCreateErrorTypeConstructor, list, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                bool2 = Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags());
                Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
                if (bool2.booleanValue()) {
                    objMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                    if (objMakeDefinitelyNotNull$default == null) {
                        CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                    }
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                }
            }
        } else {
            bool = Flags.SUSPEND_TYPE.get(proto.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            if (bool.booleanValue()) {
                nullable = proto.getNullable();
                size = typeConstructorCreateErrorTypeConstructor.getParameters().size() - list.size();
                if (size != 0) {
                    if (size == 1) {
                        TypeConstructor typeConstructor3 = typeConstructorCreateErrorTypeConstructor.getBuiltIns().getSuspendFunction(size2).getTypeConstructor();
                        Intrinsics.checkNotNullExpressionValue(typeConstructor3, "getTypeConstructor(...)");
                        objMakeDefinitelyNotNull$default = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructor3, list, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    }
                    list2 = list;
                } else {
                    list2 = list;
                    simpleTypeSimpleType$default2 = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructorCreateErrorTypeConstructor, list, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default2)) {
                        classifierDescriptorMo5778getDeclarationDescriptor = type.getConstructor().mo5778getDeclarationDescriptor();
                        if (classifierDescriptorMo5778getDeclarationDescriptor != null) {
                            fqNameSafe = DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo5778getDeclarationDescriptor);
                        } else {
                            fqNameSafe = null;
                        }
                        if (type.getArguments().size() == 1) {
                            objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                        } else {
                            objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                        }
                    }
                }
                if (objMakeDefinitelyNotNull$default == null) {
                    CreateErrorTypeWithArguments = ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructorCreateErrorTypeConstructor, new String[0]);
                } else {
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                }
            } else {
                simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributesD, typeConstructorCreateErrorTypeConstructor, list, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                bool2 = Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags());
                Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
                if (bool2.booleanValue()) {
                    objMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                    if (objMakeDefinitelyNotNull$default == null) {
                        CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                    }
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                }
            }
        }
        CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
        ProtoBuf.Type typeAbbreviatedType2 = ProtoTypeTableUtilKt.abbreviatedType(proto, deserializationContext.getTypeTable());
        if (typeAbbreviatedType2 == null) {
            return CreateErrorTypeWithArguments;
        }
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f81744c);
        TypeDeserializer typeDeserializer = this.f81743b;
        if (typeDeserializer == null) {
            str = "";
        } else {
            str = ". Child of " + typeDeserializer.f81744c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @NotNull
    public final KotlinType type(@NotNull ProtoBuf.Type proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(proto, true);
        }
        DeserializationContext deserializationContext = this.f81742a;
        String string = deserializationContext.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeSimpleType$default = simpleType$default(this, proto, false, 2, null);
        ProtoBuf.Type typeFlexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(proto, deserializationContext.getTypeTable());
        Intrinsics.checkNotNull(typeFlexibleUpperBound);
        return deserializationContext.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleTypeSimpleType$default, simpleType$default(this, typeFlexibleUpperBound, false, 2, null));
    }
}
