package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractSignatureParts.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1#2:252\n1#2:275\n766#3:230\n857#3,2:231\n1726#3,3:233\n1747#3,3:236\n1747#3,3:239\n1603#3,9:242\n1855#3:251\n1856#3:253\n1612#3:254\n1726#3,3:255\n1549#3:258\n1620#3,3:259\n1747#3,3:262\n1603#3,9:265\n1855#3:274\n1856#3:276\n1612#3:277\n1855#3,2:278\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n156#1:252\n182#1:275\n89#1:230\n89#1:231,2\n153#1:233,3\n155#1:236,3\n156#1:239,3\n156#1:242,9\n156#1:251\n156#1:253\n156#1:254\n159#1:255,3\n169#1:258\n169#1:259,3\n177#1:262,3\n182#1:265,9\n182#1:274\n182#1:276\n182#1:277\n195#1:278,2\n*E\n"})
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: compiled from: AbstractSignatureParts.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final KotlinTypeMarker f80772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final JavaTypeQualifiersByElementType f80773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final TypeParameterMarker f80774c;

        public a(@Nullable KotlinTypeMarker kotlinTypeMarker, @Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @Nullable TypeParameterMarker typeParameterMarker) {
            this.f80772a = kotlinTypeMarker;
            this.f80773b = javaTypeQualifiersByElementType;
            this.f80774c = typeParameterMarker;
        }

        @Nullable
        public final JavaTypeQualifiersByElementType getDefaultQualifiers() {
            return this.f80773b;
        }

        @Nullable
        public final KotlinTypeMarker getType() {
            return this.f80772a;
        }

        @Nullable
        public final TypeParameterMarker getTypeParameterForArgument() {
            return this.f80774c;
        }
    }

    /* JADX INFO: compiled from: AbstractSignatureParts.kt */
    @SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$computeIndexedQualifiers$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
    public static final class b extends Lambda implements Function1<Integer, JavaTypeQualifiers> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeEnhancementInfo f80775p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ JavaTypeQualifiers[] f80776q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
            super(1);
            this.f80775p0 = typeEnhancementInfo;
            this.f80776q0 = javaTypeQualifiersArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ JavaTypeQualifiers invoke(Integer num) {
            return invoke(num.intValue());
        }

        @NotNull
        public final JavaTypeQualifiers invoke(int i10) {
            Map<Integer, JavaTypeQualifiers> map;
            JavaTypeQualifiers javaTypeQualifiers;
            TypeEnhancementInfo typeEnhancementInfo = this.f80775p0;
            if (typeEnhancementInfo != null && (map = typeEnhancementInfo.getMap()) != null && (javaTypeQualifiers = map.get(Integer.valueOf(i10))) != null) {
                return javaTypeQualifiers;
            }
            if (i10 >= 0) {
                JavaTypeQualifiers[] javaTypeQualifiersArr = this.f80776q0;
                if (i10 <= ArraysKt___ArraysKt.getLastIndex(javaTypeQualifiersArr)) {
                    return javaTypeQualifiersArr[i10];
                }
            }
            return JavaTypeQualifiers.Companion.getNONE();
        }
    }

    public static void a(ArrayList arrayList, Object obj, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b bVar) {
        arrayList.add(obj);
        Iterable<? extends a> iterableInvoke = bVar.invoke(obj);
        if (iterableInvoke != null) {
            Iterator<? extends a> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                a(arrayList, it.next(), bVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:3: B:46:0x00b3->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public final NullabilityQualifierWithMigrationStatus b(TypeParameterMarker typeParameterMarker) {
        ?? arrayList;
        Iterable iterable;
        Iterator it;
        NullabilityQualifier nullabilityQualifier;
        boolean z10;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list = upperBounds;
        boolean z11 = list instanceof Collection;
        if (!z11 || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!typeSystem.isError((KotlinTypeMarker) it2.next())) {
                    if (!z11 || !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (c((KotlinTypeMarker) it3.next()) != null) {
                                    arrayList = upperBounds;
                                }
                            }
                            iterable = (Iterable) arrayList;
                            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                break;
                            }
                            it = iterable.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                    break;
                                }
                                if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                    nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                    break;
                                }
                            }
                            if (arrayList != upperBounds) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z10);
                        }
                    }
                    if (!z11 || !list.isEmpty()) {
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            if (getEnhancedForWarnings((KotlinTypeMarker) it4.next()) != null) {
                                arrayList = new ArrayList();
                                Iterator it5 = list.iterator();
                                while (it5.hasNext()) {
                                    KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it5.next());
                                    if (enhancedForWarnings != null) {
                                        arrayList.add(enhancedForWarnings);
                                    }
                                }
                                iterable = (Iterable) arrayList;
                                if (iterable instanceof Collection) {
                                    it = iterable.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                } else {
                                    it = iterable.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                if (arrayList != upperBounds) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z10);
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return null;
    }

    public final NullabilityQualifier c(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0198  */
    /* JADX WARN: Code duplicated, block: B:102:0x019d  */
    /* JADX WARN: Code duplicated, block: B:111:0x01af  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:143:0x0216  */
    /* JADX WARN: Code duplicated, block: B:144:0x021b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0226  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0166  */
    /* JADX WARN: Code duplicated, block: B:86:0x0170  */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    /* JADX WARN: Code duplicated, block: B:89:0x0178  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:97:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0190  */
    /* JADX WARN: Code duplicated, block: B:99:0x0195  */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiers(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull Iterable<? extends KotlinTypeMarker> overrides, @Nullable TypeEnhancementInfo typeEnhancementInfo, boolean z10) {
        int size;
        boolean z11;
        KotlinTypeMarker type;
        List listEmptyList;
        KotlinTypeMarker type2;
        TypeParameterMarker typeParameterClassifier;
        boolean z12;
        MutabilityQualifier mutabilityQualifierExtractMutability;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability;
        AnnotationQualifierApplicabilityType containerApplicabilityType;
        JavaTypeQualifiersByElementType defaultQualifiers;
        JavaDefaultQualifiers javaDefaultQualifiers;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusB;
        NullabilityQualifierWithMigrationStatus nullabilityQualifier;
        NullabilityQualifier qualifier;
        boolean z13;
        TypeParameterMarker typeParameterForArgument;
        boolean z14;
        NullabilityQualifier nullabilityQualifier2;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusB2;
        JavaTypeQualifiers javaTypeQualifiers;
        NullabilityQualifier qualifier2;
        boolean z15;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusCopy$default;
        boolean z16;
        KotlinTypeMarker type3;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        Object javaTypeQualifiers2;
        KotlinTypeMarker type4;
        NullabilityQualifier nullabilityQualifierC;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        ArrayList arrayListD = d(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(overrides, 10));
        Iterator<? extends KotlinTypeMarker> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next()));
        }
        boolean z17 = true;
        if (getForceOnlyHeadTypeConstructor()) {
            size = 1;
        } else {
            if (isCovariant() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                Iterator<? extends KotlinTypeMarker> it2 = overrides.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!isEqual(kotlinTypeMarker, it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = arrayListD.size();
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i10 = 0;
        while (i10 < size) {
            a aVar = (a) arrayListD.get(i10);
            if (aVar.getType() == null) {
                TypeSystemContext typeSystem = getTypeSystem();
                TypeParameterMarker typeParameterForArgument2 = aVar.getTypeParameterForArgument();
                if ((typeParameterForArgument2 != null ? typeSystem.getVariance(typeParameterForArgument2) : null) == TypeVariance.IN) {
                    javaTypeQualifiers = JavaTypeQualifiers.Companion.getNONE();
                } else {
                    if (aVar.getTypeParameterForArgument() == null) {
                        z11 = z17;
                    } else {
                        z11 = false;
                    }
                    type = aVar.getType();
                    if (type != null || (listEmptyList = getAnnotations(type)) == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    TypeSystemContext typeSystem2 = getTypeSystem();
                    type2 = aVar.getType();
                    if (type2 != null || (typeConstructorMarkerTypeConstructor = typeSystem2.typeConstructor(type2)) == null) {
                        typeParameterClassifier = null;
                    } else {
                        typeParameterClassifier = typeSystem2.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
                    }
                    if (getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                        z12 = z17;
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                        if (z12 && getEnableImprovementsInStrictMode() && (type3 = aVar.getType()) != null && isArrayOrPrimitiveArray(type3) == z17) {
                            Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                            ArrayList arrayList2 = new ArrayList();
                            for (TAnnotation tannotation : containerAnnotations) {
                                if (getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation) ^ z17) {
                                    arrayList2.add(tannotation);
                                }
                            }
                            listEmptyList = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) listEmptyList);
                        } else {
                            listEmptyList = CollectionsKt___CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) listEmptyList);
                        }
                    }
                    mutabilityQualifierExtractMutability = getAnnotationTypeQualifierResolver().extractMutability(listEmptyList);
                    nullabilityQualifierWithMigrationStatusExtractNullability = getAnnotationTypeQualifierResolver().extractNullability(listEmptyList, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a(this, aVar));
                    if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
                        NullabilityQualifier qualifier3 = nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier();
                        if (nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() == NullabilityQualifier.NOT_NULL || typeParameterClassifier == null) {
                            z16 = false;
                        } else {
                            z16 = z17;
                        }
                        javaTypeQualifiers = new JavaTypeQualifiers(qualifier3, mutabilityQualifierExtractMutability, z16, nullabilityQualifierWithMigrationStatusExtractNullability.isForWarningOnly());
                    } else {
                        if (!z11 || z12) {
                            containerApplicabilityType = getContainerApplicabilityType();
                        } else {
                            containerApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
                        }
                        defaultQualifiers = aVar.getDefaultQualifiers();
                        if (defaultQualifiers != null) {
                            javaDefaultQualifiers = defaultQualifiers.get(containerApplicabilityType);
                        } else {
                            javaDefaultQualifiers = null;
                        }
                        if (typeParameterClassifier != null) {
                            nullabilityQualifierWithMigrationStatusB = b(typeParameterClassifier);
                        } else {
                            nullabilityQualifierWithMigrationStatusB = null;
                        }
                        if (nullabilityQualifierWithMigrationStatusB == null && (nullabilityQualifierWithMigrationStatusCopy$default = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusB, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
                            nullabilityQualifier = nullabilityQualifierWithMigrationStatusCopy$default;
                        } else if (javaDefaultQualifiers != null) {
                            nullabilityQualifier = javaDefaultQualifiers.getNullabilityQualifier();
                        } else {
                            nullabilityQualifier = null;
                        }
                        if (nullabilityQualifierWithMigrationStatusB != null) {
                            qualifier = nullabilityQualifierWithMigrationStatusB.getQualifier();
                        } else {
                            qualifier = null;
                        }
                        if (qualifier == NullabilityQualifier.NOT_NULL && (typeParameterClassifier == null || javaDefaultQualifiers == null || javaDefaultQualifiers.getDefinitelyNotNull() != z17)) {
                            z13 = false;
                        } else {
                            z13 = z17;
                        }
                        typeParameterForArgument = aVar.getTypeParameterForArgument();
                        if (typeParameterForArgument != null || (nullabilityQualifierWithMigrationStatusB2 = b(typeParameterForArgument)) == null) {
                            z14 = false;
                            nullabilityQualifier2 = null;
                            nullabilityQualifierWithMigrationStatusB2 = null;
                        } else if (nullabilityQualifierWithMigrationStatusB2.getQualifier() == NullabilityQualifier.NULLABLE) {
                            z14 = false;
                            nullabilityQualifier2 = null;
                            nullabilityQualifierWithMigrationStatusB2 = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusB2, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
                        } else {
                            z14 = false;
                            nullabilityQualifier2 = null;
                        }
                        if (nullabilityQualifierWithMigrationStatusB2 != null && (nullabilityQualifier == null || ((!nullabilityQualifierWithMigrationStatusB2.isForWarningOnly() || nullabilityQualifier.isForWarningOnly()) && ((!nullabilityQualifierWithMigrationStatusB2.isForWarningOnly() && nullabilityQualifier.isForWarningOnly()) || (nullabilityQualifierWithMigrationStatusB2.getQualifier().compareTo(nullabilityQualifier.getQualifier()) >= 0 && nullabilityQualifierWithMigrationStatusB2.getQualifier().compareTo(nullabilityQualifier.getQualifier()) > 0))))) {
                            nullabilityQualifier = nullabilityQualifierWithMigrationStatusB2;
                        }
                        if (nullabilityQualifier != null) {
                            qualifier2 = nullabilityQualifier.getQualifier();
                        } else {
                            qualifier2 = nullabilityQualifier2;
                        }
                        if (nullabilityQualifier == null && nullabilityQualifier.isForWarningOnly() == z17) {
                            z15 = z17;
                        } else {
                            z15 = z14;
                        }
                        javaTypeQualifiers = new JavaTypeQualifiers(qualifier2, mutabilityQualifierExtractMutability, z13, z15);
                    }
                }
                nullabilityQualifier2 = null;
            } else {
                if (aVar.getTypeParameterForArgument() == null) {
                    z11 = z17;
                } else {
                    z11 = false;
                }
                type = aVar.getType();
                if (type != null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                TypeSystemContext typeSystem3 = getTypeSystem();
                type2 = aVar.getType();
                if (type2 != null) {
                    typeParameterClassifier = null;
                } else {
                    typeParameterClassifier = null;
                }
                if (getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                    z12 = z17;
                } else {
                    z12 = false;
                }
                if (z11) {
                    if (z12) {
                        listEmptyList = CollectionsKt___CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) listEmptyList);
                    } else {
                        listEmptyList = CollectionsKt___CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) listEmptyList);
                    }
                }
                mutabilityQualifierExtractMutability = getAnnotationTypeQualifierResolver().extractMutability(listEmptyList);
                nullabilityQualifierWithMigrationStatusExtractNullability = getAnnotationTypeQualifierResolver().extractNullability(listEmptyList, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a(this, aVar));
                if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
                    NullabilityQualifier qualifier4 = nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier();
                    if (nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() == NullabilityQualifier.NOT_NULL) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    javaTypeQualifiers = new JavaTypeQualifiers(qualifier4, mutabilityQualifierExtractMutability, z16, nullabilityQualifierWithMigrationStatusExtractNullability.isForWarningOnly());
                    nullabilityQualifier2 = null;
                } else {
                    if (z11) {
                        containerApplicabilityType = getContainerApplicabilityType();
                    } else {
                        containerApplicabilityType = getContainerApplicabilityType();
                    }
                    defaultQualifiers = aVar.getDefaultQualifiers();
                    if (defaultQualifiers != null) {
                        javaDefaultQualifiers = defaultQualifiers.get(containerApplicabilityType);
                    } else {
                        javaDefaultQualifiers = null;
                    }
                    if (typeParameterClassifier != null) {
                        nullabilityQualifierWithMigrationStatusB = b(typeParameterClassifier);
                    } else {
                        nullabilityQualifierWithMigrationStatusB = null;
                    }
                    if (nullabilityQualifierWithMigrationStatusB == null) {
                        if (javaDefaultQualifiers != null) {
                            nullabilityQualifier = javaDefaultQualifiers.getNullabilityQualifier();
                        } else {
                            nullabilityQualifier = null;
                        }
                    } else if (javaDefaultQualifiers != null) {
                        nullabilityQualifier = javaDefaultQualifiers.getNullabilityQualifier();
                    } else {
                        nullabilityQualifier = null;
                    }
                    if (nullabilityQualifierWithMigrationStatusB != null) {
                        qualifier = nullabilityQualifierWithMigrationStatusB.getQualifier();
                    } else {
                        qualifier = null;
                    }
                    if (qualifier == NullabilityQualifier.NOT_NULL) {
                        z13 = z17;
                    } else {
                        z13 = z17;
                    }
                    typeParameterForArgument = aVar.getTypeParameterForArgument();
                    if (typeParameterForArgument != null) {
                        z14 = false;
                        nullabilityQualifier2 = null;
                        nullabilityQualifierWithMigrationStatusB2 = null;
                    } else {
                        z14 = false;
                        nullabilityQualifier2 = null;
                        nullabilityQualifierWithMigrationStatusB2 = null;
                    }
                    if (nullabilityQualifierWithMigrationStatusB2 != null) {
                        nullabilityQualifier = nullabilityQualifierWithMigrationStatusB2;
                    }
                    if (nullabilityQualifier != null) {
                        qualifier2 = nullabilityQualifier.getQualifier();
                    } else {
                        qualifier2 = nullabilityQualifier2;
                    }
                    if (nullabilityQualifier == null) {
                        z15 = z14;
                    } else {
                        z15 = z14;
                    }
                    javaTypeQualifiers = new JavaTypeQualifiers(qualifier2, mutabilityQualifierExtractMutability, z13, z15);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar2 = (a) CollectionsKt___CollectionsKt.getOrNull((List) it3.next(), i10);
                if (aVar2 == null || (type4 = aVar2.getType()) == null) {
                    javaTypeQualifiers2 = nullabilityQualifier2;
                } else {
                    NullabilityQualifier nullabilityQualifierC2 = c(type4);
                    if (nullabilityQualifierC2 == null) {
                        KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(type4);
                        nullabilityQualifierC = enhancedForWarnings != null ? c(enhancedForWarnings) : nullabilityQualifier2;
                    } else {
                        nullabilityQualifierC = nullabilityQualifierC2;
                    }
                    TypeSystemContext typeSystem4 = getTypeSystem();
                    JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
                    javaTypeQualifiers2 = new JavaTypeQualifiers(nullabilityQualifierC, javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem4.lowerBoundIfFlexible(type4))) ? MutabilityQualifier.READ_ONLY : javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem4.upperBoundIfFlexible(type4))) ? MutabilityQualifier.MUTABLE : nullabilityQualifier2, getTypeSystem().isDefinitelyNotNullType(type4) || isNotNullTypeParameterCompat(type4), nullabilityQualifierC != nullabilityQualifierC2);
                }
                if (javaTypeQualifiers2 != null) {
                    arrayList3.add(javaTypeQualifiers2);
                }
            }
            javaTypeQualifiersArr[i10] = TypeEnhancementUtilsKt.computeQualifiersForOverride(javaTypeQualifiers, arrayList3, i10 == 0 && isCovariant(), i10 == 0 && getContainerIsVarargParameter(), z10);
            i10++;
            z17 = true;
        }
        return new b(typeEnhancementInfo, javaTypeQualifiersArr);
    }

    public final ArrayList d(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        a aVar = new a(kotlinTypeMarker, getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(getContainerDefaultTypeQualifiers(), getAnnotations(kotlinTypeMarker)), null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b bVar = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b(this, typeSystem);
        ArrayList arrayList = new ArrayList(1);
        a(arrayList, aVar, bVar);
        return arrayList;
    }

    public abstract boolean forceWarning(@NotNull TAnnotation tannotation, @Nullable KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    @NotNull
    public abstract Iterable<TAnnotation> getAnnotations(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract Iterable<TAnnotation> getContainerAnnotations();

    @NotNull
    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    @Nullable
    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    @Nullable
    public abstract KotlinTypeMarker getEnhancedForWarnings(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    @Nullable
    public abstract FqNameUnsafe getFqNameUnsafe(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    @NotNull
    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(@NotNull TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return false;
    }
}
