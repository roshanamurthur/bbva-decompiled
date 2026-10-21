package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import bk.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: typeEnhancementUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\ntypeEnhancementUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1#2:62\n1#2:73\n1#2:86\n1#2:99\n1603#3,9:63\n1855#3:72\n1856#3:74\n1612#3:75\n1603#3,9:76\n1855#3:85\n1856#3:87\n1612#3:88\n1603#3,9:89\n1855#3:98\n1856#3:100\n1612#3:101\n1747#3,3:102\n*S KotlinDebug\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n*L\n41#1:73\n43#1:86\n45#1:99\n41#1:63,9\n41#1:72\n41#1:74\n41#1:75\n43#1:76,9\n43#1:85\n43#1:87\n43#1:88\n45#1:89,9\n45#1:98\n45#1:100\n45#1:101\n54#1:102,3\n*E\n"})
public final class TypeEnhancementUtilsKt {
    public static final Object a(Set set, Enum r3, Enum r4, Object obj, boolean z10) {
        Set set2;
        Enum r1;
        if (!z10) {
            if (obj != null && (set2 = CollectionsKt___CollectionsKt.toSet(x.plus((Set<? extends Object>) set, obj))) != null) {
                set = set2;
            }
            return CollectionsKt___CollectionsKt.singleOrNull(set);
        }
        if (set.contains(r3)) {
            r1 = r3;
        } else {
            r1 = set.contains(r4) ? r4 : null;
        }
        if (Intrinsics.areEqual(r1, r3) && Intrinsics.areEqual(obj, r4)) {
            return null;
        }
        return obj == null ? r1 : obj;
    }

    @NotNull
    public static final JavaTypeQualifiers computeQualifiersForOverride(@NotNull JavaTypeQualifiers javaTypeQualifiers, @NotNull Collection<JavaTypeQualifiers> superQualifiers, boolean z10, boolean z11, boolean z12) {
        NullabilityQualifier nullability;
        NullabilityQualifier nullabilityQualifier;
        boolean z13;
        Intrinsics.checkNotNullParameter(javaTypeQualifiers, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        Collection<JavaTypeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (true) {
            nullability = null;
            if (!it.hasNext()) {
                break;
            }
            JavaTypeQualifiers javaTypeQualifiers2 = (JavaTypeQualifiers) it.next();
            nullability = javaTypeQualifiers2.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers2.getNullability();
            if (nullability != null) {
                arrayList.add(nullability);
            }
        }
        Set set = CollectionsKt___CollectionsKt.toSet(arrayList);
        NullabilityQualifier nullability2 = javaTypeQualifiers.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers.getNullability();
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        if (nullability2 != nullabilityQualifier2) {
            nullabilityQualifier2 = (NullabilityQualifier) a(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullability2, z10);
        }
        if (nullabilityQualifier2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullability3 = ((JavaTypeQualifiers) it2.next()).getNullability();
                if (nullability3 != null) {
                    arrayList2.add(nullability3);
                }
            }
            Set set2 = CollectionsKt___CollectionsKt.toSet(arrayList2);
            NullabilityQualifier nullability4 = javaTypeQualifiers.getNullability();
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
            if (nullability4 != nullabilityQualifier) {
                nullabilityQualifier = (NullabilityQualifier) a(set2, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullability4, z10);
            }
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutability = ((JavaTypeQualifiers) it3.next()).getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) a(CollectionsKt___CollectionsKt.toSet(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z10);
        if (nullabilityQualifier != null && !z12 && (!z11 || nullabilityQualifier != NullabilityQualifier.NULLABLE)) {
            nullability = nullabilityQualifier;
        }
        boolean z14 = false;
        if (nullability != NullabilityQualifier.NOT_NULL) {
            z13 = false;
        } else {
            if (!javaTypeQualifiers.getDefinitelyNotNull()) {
                if (!collection.isEmpty()) {
                    Iterator<T> it4 = collection.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((JavaTypeQualifiers) it4.next()).getDefinitelyNotNull()) {
                            }
                        }
                    }
                }
                z13 = false;
            }
            z13 = true;
        }
        if (nullability != null && nullabilityQualifier2 != nullabilityQualifier) {
            z14 = true;
        }
        return new JavaTypeQualifiers(nullability, mutabilityQualifier, z13, z14);
    }

    public static final boolean hasEnhancedNullability(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }
}
