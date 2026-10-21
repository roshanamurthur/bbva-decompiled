package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n3433#3,7:264\n1726#3,3:271\n3433#3,7:274\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:264,7\n143#1:271,3\n155#1:274,7\n*E\n"})
public final class JavaTypeEnhancement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JavaResolverSettings f80777a;

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final KotlinType f80778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f80779b;

        public a(@Nullable KotlinType kotlinType, int i10) {
            this.f80778a = kotlinType;
            this.f80779b = i10;
        }

        public final int getSubtreeSize() {
            return this.f80779b;
        }

        @Nullable
        public final KotlinType getType() {
            return this.f80778a;
        }
    }

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final SimpleType f80780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f80781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f80782c;

        public b(@Nullable SimpleType simpleType, int i10, boolean z10) {
            this.f80780a = simpleType;
            this.f80781b = i10;
            this.f80782c = z10;
        }

        public final boolean getForWarnings() {
            return this.f80782c;
        }

        public final int getSubtreeSize() {
            return this.f80781b;
        }

        @Nullable
        public final SimpleType getType() {
            return this.f80780a;
        }
    }

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.f80777a = javaResolverSettings;
    }

    public final b a(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11) {
        TypeConstructor constructor;
        boolean z12;
        boolean z13;
        a aVar;
        TypeProjection typeProjectionMakeStarProjection;
        Function1<? super Integer, JavaTypeQualifiers> function2 = function1;
        boolean zShouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z14 = (z11 && z10) ? false : true;
        KotlinType kotlinType = null;
        if (!zShouldEnhance && simpleType.getArguments().isEmpty()) {
            return new b(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = simpleType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor == null) {
            return new b(null, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiersInvoke = function2.invoke(Integer.valueOf(i10));
        ClassifierDescriptor classifierDescriptorAccess$enhanceMutability = TypeEnhancementKt.access$enhanceMutability(classifierDescriptorMo5778getDeclarationDescriptor, javaTypeQualifiersInvoke, typeComponentPosition);
        Boolean boolAccess$getEnhancedNullability = TypeEnhancementKt.access$getEnhancedNullability(javaTypeQualifiersInvoke, typeComponentPosition);
        if (classifierDescriptorAccess$enhanceMutability == null || (constructor = classifierDescriptorAccess$enhanceMutability.getTypeConstructor()) == null) {
            constructor = simpleType.getConstructor();
        }
        TypeConstructor typeConstructor = constructor;
        Intrinsics.checkNotNull(typeConstructor);
        int subtreeSize = i10 + 1;
        List<TypeProjection> arguments = simpleType.getArguments();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = arguments.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z14) {
                z13 = z14;
                if (!typeProjection.isStarProjection()) {
                    aVar = b(typeProjection.getType().unwrap(), function2, subtreeSize, z11);
                } else if (function2.invoke(Integer.valueOf(subtreeSize)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
                    aVar = new a(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                z13 = z14;
                aVar = new a(kotlinType, 0);
            }
            subtreeSize += aVar.getSubtreeSize();
            if (aVar.getType() != null) {
                KotlinType type = aVar.getType();
                Variance projectionKind = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
            } else if (classifierDescriptorAccess$enhanceMutability == null || typeProjection.isStarProjection()) {
                typeProjectionMakeStarProjection = classifierDescriptorAccess$enhanceMutability != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
            } else {
                KotlinType type2 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                Variance projectionKind2 = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionMakeStarProjection);
            function2 = function1;
            z14 = z13;
            kotlinType = null;
        }
        int i11 = subtreeSize - i10;
        if (classifierDescriptorAccess$enhanceMutability == null && boolAccess$getEnhancedNullability == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((TypeProjection) it3.next()) == null);
            }
            return new b(null, i11, false);
        }
        Annotations[] annotationsArr = new Annotations[3];
        annotationsArr[0] = simpleType.getAnnotations();
        al.b bVar = TypeEnhancementKt.f80842b;
        if (classifierDescriptorAccess$enhanceMutability == null) {
            bVar = null;
        }
        annotationsArr[1] = bVar;
        annotationsArr[2] = boolAccess$getEnhancedNullability != null ? TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS() : null;
        TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(TypeEnhancementKt.access$compositeAnnotationsOrSingle(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) annotationsArr)));
        List<TypeProjection> arguments2 = simpleType.getArguments();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = arguments2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, boolAccess$getEnhancedNullability != null ? boolAccess$getEnhancedNullability.booleanValue() : simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
        if (!javaTypeQualifiersInvoke.getDefinitelyNotNull()) {
            z12 = true;
        } else if (this.f80777a.getCorrectNullabilityForNotNullTypeParameter()) {
            z12 = true;
            simpleTypeSimpleType$default = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleTypeSimpleType$default, true);
        } else {
            z12 = true;
            simpleTypeSimpleType$default = new NotNullTypeParameterImpl(simpleTypeSimpleType$default);
        }
        return new b(simpleTypeSimpleType$default, i11, (boolAccess$getEnhancedNullability == null || !javaTypeQualifiersInvoke.isNullabilityQualifierForWarning()) ? false : z12);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    public final a b(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i10, boolean z10) {
        KotlinType type;
        KotlinType kotlinTypeWrapEnhancement = null;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new a(null, 1);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (!(unwrappedType instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            b bVarA = a((SimpleType) unwrappedType, function1, i10, TypeComponentPosition.INFLEXIBLE, false, z10);
            return new a(bVarA.getForWarnings() ? TypeWithEnhancementKt.wrapEnhancement(unwrappedType, bVarA.getType()) : bVarA.getType(), bVarA.getSubtreeSize());
        }
        boolean z11 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        b bVarA2 = a(flexibleType.getLowerBound(), function1, i10, TypeComponentPosition.FLEXIBLE_LOWER, z11, z10);
        b bVarA3 = a(flexibleType.getUpperBound(), function1, i10, TypeComponentPosition.FLEXIBLE_UPPER, z11, z10);
        bVarA2.getSubtreeSize();
        bVarA3.getSubtreeSize();
        if (bVarA2.getType() != null || bVarA3.getType() != null) {
            if (bVarA2.getForWarnings() || bVarA3.getForWarnings()) {
                SimpleType type2 = bVarA3.getType();
                if (type2 == null) {
                    type = bVarA2.getType();
                    Intrinsics.checkNotNull(type);
                } else {
                    SimpleType type3 = bVarA2.getType();
                    if (type3 == null) {
                        type3 = type2;
                    }
                    type = KotlinTypeFactory.flexibleType(type3, type2);
                    if (type == null) {
                        type = bVarA2.getType();
                        Intrinsics.checkNotNull(type);
                    }
                }
                kotlinTypeWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, type);
            } else if (z11) {
                SimpleType type4 = bVarA2.getType();
                if (type4 == null) {
                    type4 = flexibleType.getLowerBound();
                }
                SimpleType type5 = bVarA3.getType();
                if (type5 == null) {
                    type5 = flexibleType.getUpperBound();
                }
                kotlinTypeWrapEnhancement = new RawTypeImpl(type4, type5);
            } else {
                SimpleType type6 = bVarA2.getType();
                if (type6 == null) {
                    type6 = flexibleType.getLowerBound();
                }
                SimpleType type7 = bVarA3.getType();
                if (type7 == null) {
                    type7 = flexibleType.getUpperBound();
                }
                kotlinTypeWrapEnhancement = KotlinTypeFactory.flexibleType(type6, type7);
            }
        }
        return new a(kotlinTypeWrapEnhancement, bVarA2.getSubtreeSize());
    }

    @Nullable
    public final KotlinType enhance(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z10) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return b(kotlinType.unwrap(), qualifiers, 0, z10).getType();
    }
}
