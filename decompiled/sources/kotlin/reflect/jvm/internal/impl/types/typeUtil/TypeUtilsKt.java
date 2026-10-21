package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nTypeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n261#1,14:433\n276#1:451\n265#1,12:452\n261#1,14:464\n276#1:482\n265#1,12:483\n272#1,3:501\n276#1:508\n272#1,3:509\n276#1:516\n272#1,3:517\n276#1:524\n397#1:550\n397#1:551\n397#1:552\n1747#2,3:407\n1549#2:410\n1620#2,3:411\n1855#2,2:414\n1603#2,9:417\n1855#2:426\n1856#2:428\n1612#2:429\n766#2:430\n857#2,2:431\n1549#2:447\n1620#2,3:448\n1549#2:478\n1620#2,3:479\n1747#2,3:495\n1747#2,3:498\n1549#2:504\n1620#2,3:505\n1549#2:512\n1620#2,3:513\n1549#2:520\n1620#2,3:521\n1549#2:525\n1620#2,3:526\n1549#2:529\n1620#2,3:530\n1747#2,3:533\n288#2,2:536\n1549#2:538\n1620#2,3:539\n1549#2:542\n1620#2,3:543\n1549#2:546\n1620#2,3:547\n1#3:416\n1#3:427\n*S KotlinDebug\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n200#1:433,14\n200#1:451\n200#1:452,12\n201#1:464,14\n201#1:482\n201#1:483,12\n264#1:501,3\n264#1:508\n265#1:509,3\n265#1:516\n267#1:517,3\n267#1:524\n389#1:550\n392#1:551\n395#1:552\n90#1:407,3\n141#1:410\n141#1:411,3\n157#1:414,2\n183#1:417,9\n183#1:426\n183#1:428\n183#1:429\n189#1:430\n189#1:431,2\n200#1:447\n200#1:448,3\n201#1:478\n201#1:479,3\n239#1:495,3\n251#1:498,3\n264#1:504\n264#1:505,3\n265#1:512\n265#1:513,3\n267#1:520\n267#1:521,3\n274#1:525\n274#1:526,3\n281#1:529\n281#1:530,3\n307#1:533,3\n314#1:536,2\n324#1:538\n324#1:539,3\n343#1:542\n343#1:543,3\n351#1:546\n351#1:547,3\n183#1:427\n*E\n"})
public final class TypeUtilsKt {

    /* JADX INFO: compiled from: TypeUtils.kt */
    public static final class a extends Lambda implements Function1<UnwrappedType, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82053p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull UnwrappedType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = it.getConstructor().mo5778getDeclarationDescriptor();
            return Boolean.valueOf(classifierDescriptorMo5778getDeclarationDescriptor != null ? TypeUtilsKt.isTypeAliasParameter(classifierDescriptorMo5778getDeclarationDescriptor) : false);
        }
    }

    /* JADX INFO: compiled from: TypeUtils.kt */
    public static final class b extends Lambda implements Function1<UnwrappedType, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f82054p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(UnwrappedType unwrappedType) {
            return Boolean.valueOf(TypeUtils.isTypeParameter(unwrappedType));
        }
    }

    /* JADX INFO: compiled from: TypeUtils.kt */
    public static final class c extends Lambda implements Function1<UnwrappedType, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f82055p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull UnwrappedType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = it.getConstructor().mo5778getDeclarationDescriptor();
            boolean z10 = false;
            if (classifierDescriptorMo5778getDeclarationDescriptor != null && ((classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeAliasDescriptor) || (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor))) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: TypeUtils.kt */
    public static final class d extends Lambda implements Function1<UnwrappedType, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f82056p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull UnwrappedType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf((it instanceof StubTypeForBuilderInference) || (it.getConstructor() instanceof TypeVariableTypeConstructorMarker) || KotlinTypeKt.isError(it));
        }
    }

    public static final boolean a(KotlinType kotlinType, TypeConstructor typeConstructor, Set<? extends TypeParameterDescriptor> set) {
        if (Intrinsics.areEqual(kotlinType.getConstructor(), typeConstructor)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo5778getDeclarationDescriptor : null;
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.getDeclaredTypeParameters() : null;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(kotlinType.getArguments());
        if (!(iterableWithIndex instanceof Collection) || !((Collection) iterableWithIndex).isEmpty()) {
            for (IndexedValue indexedValue : iterableWithIndex) {
                int index = indexedValue.getIndex();
                TypeProjection typeProjection = (TypeProjection) indexedValue.component2();
                TypeParameterDescriptor typeParameterDescriptor = declaredTypeParameters != null ? (TypeParameterDescriptor) CollectionsKt___CollectionsKt.getOrNull(declaredTypeParameters, index) : null;
                if (typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) {
                    if (typeProjection.isStarProjection()) {
                        continue;
                    } else {
                        KotlinType type = typeProjection.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        if (a(type, typeConstructor, set)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final TypeProjection asTypeProjection(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return new TypeProjectionImpl(kotlinType);
    }

    public static final void b(KotlinType kotlinType, KotlinType kotlinType2, LinkedHashSet linkedHashSet, Set set) {
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            if (!Intrinsics.areEqual(kotlinType.getConstructor(), kotlinType2.getConstructor())) {
                linkedHashSet.add(classifierDescriptorMo5778getDeclarationDescriptor);
                return;
            }
            for (KotlinType kotlinType3 : ((TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor).getUpperBounds()) {
                Intrinsics.checkNotNull(kotlinType3);
                b(kotlinType3, kotlinType2, linkedHashSet, set);
            }
            return;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor2 = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorMo5778getDeclarationDescriptor2 instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo5778getDeclarationDescriptor2 : null;
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.getDeclaredTypeParameters() : null;
        int i10 = 0;
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            int i11 = i10 + 1;
            TypeParameterDescriptor typeParameterDescriptor = declaredTypeParameters != null ? (TypeParameterDescriptor) CollectionsKt___CollectionsKt.getOrNull(declaredTypeParameters, i10) : null;
            if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.isStarProjection() && !CollectionsKt___CollectionsKt.contains(linkedHashSet, typeProjection.getType().getConstructor().mo5778getDeclarationDescriptor()) && !Intrinsics.areEqual(typeProjection.getType().getConstructor(), kotlinType2.getConstructor())) {
                KotlinType type = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                b(type, kotlinType2, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    public static final boolean contains(@NotNull KotlinType kotlinType, @NotNull Function1<? super UnwrappedType, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return TypeUtils.contains(kotlinType, predicate);
    }

    public static final boolean containsTypeAliasParameters(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return contains(kotlinType, a.f82053p0);
    }

    public static final boolean containsTypeParameter(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return TypeUtils.contains(kotlinType, b.f82054p0);
    }

    @NotNull
    public static final TypeProjection createProjection(@NotNull KotlinType type, @NotNull Variance projectionKind, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(projectionKind, "projectionKind");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.getVariance() : null) == projectionKind) {
            projectionKind = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(projectionKind, type);
    }

    @NotNull
    public static final Set<TypeParameterDescriptor> extractTypeParametersFromUpperBounds(@NotNull KotlinType kotlinType, @Nullable Set<? extends TypeParameterDescriptor> set) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b(kotlinType, kotlinType, linkedHashSet, set);
        return linkedHashSet;
    }

    @NotNull
    public static final KotlinBuiltIns getBuiltIns(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinBuiltIns builtIns = kotlinType.getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @NotNull
    public static final KotlinType getRepresentativeUpperBound(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        Object obj;
        Intrinsics.checkNotNullParameter(typeParameterDescriptor, "<this>");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((KotlinType) next).getConstructor().mo5778getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.INTERFACE && classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        List<KotlinType> upperBounds3 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds3, "getUpperBounds(...)");
        Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) upperBounds3);
        Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
        return (KotlinType) objFirst;
    }

    @JvmOverloads
    public static final boolean hasTypeParameterRecursiveBounds(@NotNull TypeParameterDescriptor typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return hasTypeParameterRecursiveBounds$default(typeParameter, null, null, 6, null);
    }

    public static /* synthetic */ boolean hasTypeParameterRecursiveBounds$default(TypeParameterDescriptor typeParameterDescriptor, TypeConstructor typeConstructor, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeConstructor = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return hasTypeParameterRecursiveBounds(typeParameterDescriptor, typeConstructor, set);
    }

    public static final boolean isBoolean(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return KotlinBuiltIns.isBoolean(kotlinType);
    }

    public static final boolean isNothing(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return KotlinBuiltIns.isNothing(kotlinType);
    }

    public static final boolean isStubType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return (kotlinType instanceof AbstractStubType) || ((kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).getOriginal() instanceof AbstractStubType));
    }

    public static final boolean isStubTypeForBuilderInference(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return (kotlinType instanceof StubTypeForBuilderInference) || ((kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).getOriginal() instanceof StubTypeForBuilderInference));
    }

    public static final boolean isSubtypeOf(@NotNull KotlinType kotlinType, @NotNull KotlinType superType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType, superType);
    }

    public static final boolean isTypeAliasParameter(@NotNull ClassifierDescriptor classifierDescriptor) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "<this>");
        return (classifierDescriptor instanceof TypeParameterDescriptor) && (((TypeParameterDescriptor) classifierDescriptor).getContainingDeclaration() instanceof TypeAliasDescriptor);
    }

    public static final boolean isTypeParameter(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return TypeUtils.isTypeParameter(kotlinType);
    }

    public static final boolean isUnresolvedType(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (type instanceof ErrorType) && ((ErrorType) type).getKind().isUnresolved();
    }

    @NotNull
    public static final KotlinType makeNotNullable(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNotNullable, "makeNotNullable(...)");
        return kotlinTypeMakeNotNullable;
    }

    @NotNull
    public static final KotlinType makeNullable(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType kotlinTypeMakeNullable = TypeUtils.makeNullable(kotlinType);
        Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullable, "makeNullable(...)");
        return kotlinTypeMakeNullable;
    }

    @NotNull
    public static final KotlinType replaceAnnotations(@NotNull KotlinType kotlinType, @NotNull Annotations newAnnotations) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (kotlinType.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? kotlinType : kotlinType.unwrap().replaceAttributes(TypeAttributesKt.replaceAnnotations(kotlinType.getAttributes(), newAnnotations));
    }

    @NotNull
    public static final KotlinType replaceArgumentsWithStarProjections(@NotNull KotlinType kotlinType) {
        SimpleType simpleType;
        UnwrappedType unwrappedTypeReplace$default;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
            SimpleType lowerBound = flexibleType.getLowerBound();
            if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo5778getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                List<TypeParameterDescriptor> list = parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
            }
            SimpleType upperBound = flexibleType.getUpperBound();
            if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo5778getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                List<TypeParameterDescriptor> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
            }
            unwrappedTypeReplace$default = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        } else {
            if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            simpleType = (SimpleType) unwrappedTypeUnwrap;
            if (!simpleType.getConstructor().getParameters().isEmpty() && simpleType.getConstructor().mo5778getDeclarationDescriptor() != null) {
                unwrappedTypeReplace$default = simpleType;
                unwrappedTypeReplace$default = simpleType;
                List<TypeParameterDescriptor> parameters3 = simpleType.getConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                List<TypeParameterDescriptor> list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                }
                unwrappedTypeReplace$default = TypeSubstitutionKt.replace$default(simpleType, arrayList3, null, 2, null);
            }
        }
        unwrappedTypeReplace$default = simpleType;
        unwrappedTypeReplace$default = simpleType;
        unwrappedTypeReplace$default = simpleType;
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeReplace$default, unwrappedTypeUnwrap);
    }

    public static final boolean requiresTypeAliasExpansion(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return contains(kotlinType, c.f82055p0);
    }

    public static final boolean shouldBeUpdated(@Nullable KotlinType kotlinType) {
        return kotlinType == null || contains(kotlinType, d.f82056p0);
    }

    @JvmOverloads
    public static final boolean hasTypeParameterRecursiveBounds(@NotNull TypeParameterDescriptor typeParameter, @Nullable TypeConstructor typeConstructor, @Nullable Set<? extends TypeParameterDescriptor> set) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        List<KotlinType> upperBounds = typeParameter.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        List<KotlinType> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (KotlinType kotlinType : list) {
            Intrinsics.checkNotNull(kotlinType);
            if (a(kotlinType, typeParameter.getDefaultType().getConstructor(), set) && (typeConstructor == null || Intrinsics.areEqual(kotlinType.getConstructor(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }
}
