package kotlin.reflect.jvm.internal.impl.load.java;

import bk.x;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAbstractAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,213:1\n1#2:214\n1#2:220\n1#2:225\n1#2:247\n1747#3,3:215\n288#3,2:221\n1611#3:223\n1855#3:224\n1856#3:226\n1612#3:227\n1747#3,3:228\n1789#3,3:231\n1789#3,3:234\n1603#3,9:237\n1855#3:246\n1856#3:248\n1612#3:249\n72#4,2:218\n372#5,7:250\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n*L\n40#1:220\n81#1:225\n162#1:247\n30#1:215,3\n79#1:221,2\n81#1:223\n81#1:224\n81#1:226\n81#1:227\n88#1:228,3\n124#1:231,3\n136#1:234,3\n162#1:237,9\n162#1:246\n162#1:248\n162#1:249\n40#1:218,2\n208#1:250,7\n*E\n"})
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f80474c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JavaTypeEnhancementState f80475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Object, TAnnotation> f80476b;

    /* JADX INFO: compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f80474c = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(@NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f80475a = javaTypeEnhancementState;
        this.f80476b = new ConcurrentHashMap<>();
    }

    public final NullabilityQualifierWithMigrationStatus a(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusD;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusD2 = d(tannotation, function1.invoke(tannotation).booleanValue());
        if (nullabilityQualifierWithMigrationStatusD2 != null) {
            return nullabilityQualifierWithMigrationStatusD2;
        }
        TAnnotation tannotationResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(tannotation);
        if (tannotationResolveTypeQualifierAnnotation == null) {
            return null;
        }
        ReportLevel reportLevelE = e(tannotation);
        if (reportLevelE == null) {
            reportLevelE = this.f80475a.getJsr305().getGlobalLevel();
        }
        if (reportLevelE.isIgnore() || (nullabilityQualifierWithMigrationStatusD = d(tannotationResolveTypeQualifierAnnotation, function1.invoke(tannotationResolveTypeQualifierAnnotation).booleanValue())) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusD, null, reportLevelE.isWarning(), 1, null);
    }

    public final TAnnotation b(TAnnotation tannotation, FqName fqName) {
        for (TAnnotation tannotation2 : getMetaAnnotations(tannotation)) {
            if (Intrinsics.areEqual(getFqName(tannotation2), fqName)) {
                return tannotation2;
            }
        }
        return null;
    }

    public final boolean c(TAnnotation tannotation, FqName fqName) {
        Iterable<TAnnotation> metaAnnotations = getMetaAnnotations(tannotation);
        if ((metaAnnotations instanceof Collection) && ((Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = metaAnnotations.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(getFqName(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r6.equals("NEVER") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
    
        if (r6.equals("MAYBE") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus d(TAnnotation r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.d(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    public final ReportLevel e(TAnnotation tannotation) {
        Iterable<String> iterableEnumArguments;
        String str;
        JavaTypeEnhancementState javaTypeEnhancementState = this.f80475a;
        ReportLevel reportLevel = javaTypeEnhancementState.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation tannotationB = b(tannotation, AnnotationQualifiersFqNamesKt.getMIGRATION_ANNOTATION_FQNAME());
        if (tannotationB == null || (iterableEnumArguments = enumArguments(tannotationB, false)) == null || (str = (String) CollectionsKt___CollectionsKt.firstOrNull(iterableEnumArguments)) == null) {
            return null;
        }
        ReportLevel migrationLevel = javaTypeEnhancementState.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return ReportLevel.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return ReportLevel.WARN;
        }
        return null;
    }

    @NotNull
    public abstract Iterable<String> enumArguments(@NotNull TAnnotation tannotation, boolean z10);

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(@Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @NotNull Iterable<? extends TAnnotation> annotations) {
        EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers;
        JavaDefaultQualifiers javaDefaultQualifiers;
        ReportLevel reportLevelE;
        JavaDefaultQualifiers javaDefaultQualifiersCopy$default;
        Object objB;
        Object next;
        Pair pair;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusA;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        JavaTypeEnhancementState javaTypeEnhancementState = this.f80475a;
        if (javaTypeEnhancementState.getDisabledDefaultAnnotations()) {
            return javaTypeQualifiersByElementType;
        }
        ArrayList<JavaDefaultQualifiers> arrayList = new ArrayList();
        for (TAnnotation tannotation : annotations) {
            JavaDefaultQualifiers javaDefaultQualifiers2 = null;
            if (javaTypeEnhancementState.getDisabledDefaultAnnotations() || (javaDefaultQualifiers = AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(getFqName(tannotation))) == null) {
                javaDefaultQualifiersCopy$default = null;
            } else {
                FqName fqName = getFqName(tannotation);
                if (fqName == null || !AnnotationQualifiersFqNamesKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) {
                    reportLevelE = e(tannotation);
                    if (reportLevelE == null) {
                        reportLevelE = javaTypeEnhancementState.getJsr305().getGlobalLevel();
                    }
                } else {
                    reportLevelE = javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
                }
                if (reportLevelE == ReportLevel.IGNORE) {
                    reportLevelE = null;
                }
                if (reportLevelE == null) {
                    javaDefaultQualifiersCopy$default = null;
                } else {
                    javaDefaultQualifiersCopy$default = JavaDefaultQualifiers.copy$default(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.copy$default(javaDefaultQualifiers.getNullabilityQualifier(), null, reportLevelE.isWarning(), 1, null), null, false, 6, null);
                }
            }
            if (javaDefaultQualifiersCopy$default != null) {
                javaDefaultQualifiers2 = javaDefaultQualifiersCopy$default;
            } else {
                if (javaTypeEnhancementState.getJsr305().isDisabled() || (objB = b(tannotation, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_DEFAULT_FQNAME())) == null) {
                    pair = null;
                } else {
                    Iterator it = getMetaAnnotations(tannotation).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (resolveTypeQualifierAnnotation(next) == null);
                    if (next == null) {
                        pair = null;
                    } else {
                        Iterable<String> iterableEnumArguments = enumArguments(objB, true);
                        Set linkedHashSet = new LinkedHashSet();
                        Iterator<String> it2 = iterableEnumArguments.iterator();
                        while (it2.hasNext()) {
                            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) f80474c.get(it2.next());
                            if (annotationQualifierApplicabilityType != null) {
                                linkedHashSet.add(annotationQualifierApplicabilityType);
                            }
                        }
                        if (linkedHashSet.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
                            linkedHashSet = x.plus(x.minus((Set<? extends AnnotationQualifierApplicabilityType>) ArraysKt___ArraysKt.toSet(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), (Iterable) linkedHashSet);
                        }
                        pair = new Pair(next, linkedHashSet);
                    }
                }
                if (pair != null) {
                    Object objComponent1 = pair.component1();
                    Set set = (Set) pair.component2();
                    ReportLevel reportLevelE2 = e(tannotation);
                    if (reportLevelE2 == null && (reportLevelE2 = e(objComponent1)) == null) {
                        reportLevelE2 = javaTypeEnhancementState.getJsr305().getGlobalLevel();
                    }
                    if (!reportLevelE2.isIgnore() && (nullabilityQualifierWithMigrationStatusA = a(objComponent1, wk.a.f94284p0)) != null) {
                        javaDefaultQualifiers2 = new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusA, null, reportLevelE2.isWarning(), 1, null), set, false, 4, null);
                    }
                }
            }
            if (javaDefaultQualifiers2 != null) {
                arrayList.add(javaDefaultQualifiers2);
            }
        }
        if (arrayList.isEmpty()) {
            return javaTypeQualifiersByElementType;
        }
        EnumMap enumMap = (javaTypeQualifiersByElementType == null || (defaultQualifiers = javaTypeQualifiersByElementType.getDefaultQualifiers()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) defaultQualifiers);
        boolean z10 = false;
        for (JavaDefaultQualifiers javaDefaultQualifiers3 : arrayList) {
            Iterator<AnnotationQualifierApplicabilityType> it3 = javaDefaultQualifiers3.getQualifierApplicabilityTypes().iterator();
            while (it3.hasNext()) {
                enumMap.put(it3.next(), javaDefaultQualifiers3);
                z10 = true;
            }
        }
        return !z10 ? javaTypeQualifiersByElementType : new JavaTypeQualifiersByElementType(enumMap);
    }

    @Nullable
    public final MutabilityQualifier extractMutability(@NotNull Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            FqName fqName = getFqName(it.next());
            if (JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS().contains(fqName)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS().contains(fqName)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final NullabilityQualifierWithMigrationStatus extractNullability(@NotNull Iterable<? extends TAnnotation> iterable, @NotNull Function1<? super TAnnotation, Boolean> function1) {
        Iterator itD = androidx.camera.core.imagecapture.a.d(iterable, "annotations", function1, "forceWarning");
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        while (itD.hasNext()) {
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusA = a(itD.next(), function1);
            if (nullabilityQualifierWithMigrationStatus != null) {
                if (nullabilityQualifierWithMigrationStatusA != null && !Intrinsics.areEqual(nullabilityQualifierWithMigrationStatusA, nullabilityQualifierWithMigrationStatus) && (!nullabilityQualifierWithMigrationStatusA.isForWarningOnly() || nullabilityQualifierWithMigrationStatus.isForWarningOnly())) {
                    if (nullabilityQualifierWithMigrationStatusA.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus.isForWarningOnly()) {
                        return null;
                    }
                }
            }
            nullabilityQualifierWithMigrationStatus = nullabilityQualifierWithMigrationStatusA;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    @Nullable
    public abstract FqName getFqName(@NotNull TAnnotation tannotation);

    @NotNull
    public abstract Object getKey(@NotNull TAnnotation tannotation);

    @NotNull
    public abstract Iterable<TAnnotation> getMetaAnnotations(@NotNull TAnnotation tannotation);

    public final boolean isTypeUseAnnotation(@NotNull TAnnotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        TAnnotation tannotationB = b(annotation, StandardNames.FqNames.target);
        if (tannotationB == null) {
            return false;
        }
        Iterable<String> iterableEnumArguments = enumArguments(tannotationB, false);
        if ((iterableEnumArguments instanceof Collection) && ((Collection) iterableEnumArguments).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableEnumArguments.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), ConstantsKt.TYPE)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final TAnnotation resolveTypeQualifierAnnotation(@NotNull TAnnotation annotation) {
        TAnnotation tannotationResolveTypeQualifierAnnotation;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (this.f80475a.getJsr305().isDisabled()) {
            return null;
        }
        if (CollectionsKt___CollectionsKt.contains(AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_FQ_NAMES(), getFqName(annotation)) || c(annotation, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_FQNAME())) {
            return annotation;
        }
        if (!c(annotation, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_NICKNAME_FQNAME())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f80476b;
        Object key = getKey(annotation);
        TAnnotation tannotation = concurrentHashMap.get(key);
        if (tannotation != null) {
            return tannotation;
        }
        Iterator<TAnnotation> it = getMetaAnnotations(annotation).iterator();
        do {
            if (!it.hasNext()) {
                tannotationResolveTypeQualifierAnnotation = null;
                break;
            }
            tannotationResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(it.next());
        } while (tannotationResolveTypeQualifierAnnotation == null);
        if (tannotationResolveTypeQualifierAnnotation == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(key, tannotationResolveTypeQualifierAnnotation);
        return tannotationPutIfAbsent == null ? tannotationResolveTypeQualifierAnnotation : tannotationPutIfAbsent;
    }
}
