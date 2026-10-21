package kotlin.reflect.jvm.internal.impl.types.checker;

import il.c;
import il.d;
import il.e;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/TypeIntersector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1549#2:184\n1620#2,2:185\n1622#2:188\n1789#2,3:189\n1620#2,3:192\n1549#2:195\n1620#2,3:196\n2661#2,7:199\n1747#2,3:206\n1#3:187\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/TypeIntersector\n*L\n80#1:184\n80#1:185,2\n80#1:188\n87#1:189,3\n98#1:192,3\n104#1:195\n104#1:196,3\n104#1:199,7\n137#1:206,3\n*E\n"})
public final class TypeIntersector {

    @NotNull
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: IntersectionType.kt */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACCEPT_NULL;
        public static final a NOT_NULL;
        public static final a START;
        public static final a UNKNOWN;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class C0452a extends a {
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            @NotNull
            public a combine(@NotNull UnwrappedType nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return a.a(nextType);
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class b extends a {
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            @NotNull
            public b combine(@NotNull UnwrappedType nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return this;
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class c extends a {
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            @NotNull
            public a combine(@NotNull UnwrappedType nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return a.a(nextType);
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class d extends a {
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            @NotNull
            public a combine(@NotNull UnwrappedType nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                a aVarA = a.a(nextType);
                return aVarA == a.ACCEPT_NULL ? this : aVarA;
            }
        }

        static {
            c cVar = new c("START", 0, null);
            START = cVar;
            C0452a c0452a = new C0452a("ACCEPT_NULL", 1, null);
            ACCEPT_NULL = c0452a;
            d dVar = new d("UNKNOWN", 2, null);
            UNKNOWN = dVar;
            b bVar = new b("NOT_NULL", 3, null);
            NOT_NULL = bVar;
            a[] aVarArr = {cVar, c0452a, dVar, bVar};
            $VALUES = aVarArr;
            $ENTRIES = EnumEntriesKt.enumEntries(aVarArr);
        }

        public a() {
            throw null;
        }

        public a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            super(str, i10);
        }

        @NotNull
        public static a a(@NotNull UnwrappedType unwrappedType) {
            Intrinsics.checkNotNullParameter(unwrappedType, "<this>");
            if (unwrappedType.isMarkedNullable()) {
                return ACCEPT_NULL;
            }
            if ((unwrappedType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) unwrappedType).getOriginal() instanceof StubTypeForBuilderInference)) {
                return NOT_NULL;
            }
            if (unwrappedType instanceof StubTypeForBuilderInference) {
                return UNKNOWN;
            }
            return NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType) ? NOT_NULL : UNKNOWN;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public abstract a combine(@NotNull UnwrappedType unwrappedType);
    }

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList<SimpleType> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            SimpleType simpleType = (SimpleType) it.next();
            if (!arrayList.isEmpty()) {
                for (SimpleType simpleType2 : arrayList) {
                    if (simpleType2 != simpleType) {
                        Intrinsics.checkNotNull(simpleType2);
                        Intrinsics.checkNotNull(simpleType);
                        if (((Boolean) function2.invoke(simpleType2, simpleType)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean access$isStrictSupertype(TypeIntersector typeIntersector, KotlinType kotlinType, KotlinType kotlinType2) {
        typeIntersector.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType2, kotlinType);
    }

    @NotNull
    public final SimpleType intersectTypes$descriptors(@NotNull List<? extends SimpleType> types) {
        SimpleType simpleTypeCreateType;
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList<SimpleType> arrayList = new ArrayList();
        for (SimpleType simpleType : types) {
            if (simpleType.getConstructor() instanceof IntersectionTypeConstructor) {
                Collection<KotlinType> supertypes = simpleType.getConstructor().getSupertypes();
                Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
                Collection<KotlinType> collection = supertypes;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
                for (KotlinType kotlinType : collection) {
                    Intrinsics.checkNotNull(kotlinType);
                    SimpleType simpleTypeUpperIfFlexible = FlexibleTypesKt.upperIfFlexible(kotlinType);
                    if (simpleType.isMarkedNullable()) {
                        simpleTypeUpperIfFlexible = simpleTypeUpperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(simpleTypeUpperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        a aVarCombine = a.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVarCombine = aVarCombine.combine((UnwrappedType) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SimpleType simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default : arrayList) {
            if (aVarCombine == a.NOT_NULL) {
                if (simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default instanceof NewCapturedType) {
                    simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.withNotNullProjection((NewCapturedType) simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default);
                }
                simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull$default(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default, false, 1, null);
            }
            linkedHashSet.add(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default);
        }
        List<? extends SimpleType> list = types;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((SimpleType) it2.next()).getAttributes());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((TypeAttributes) next).intersect((TypeAttributes) it3.next());
        }
        TypeAttributes typeAttributes = (TypeAttributes) next;
        if (linkedHashSet.size() == 1) {
            simpleTypeCreateType = (SimpleType) CollectionsKt___CollectionsKt.single(linkedHashSet);
        } else {
            new c(linkedHashSet);
            ArrayList arrayListA = a(linkedHashSet, new d(2, this));
            arrayListA.isEmpty();
            SimpleType simpleTypeFindIntersectionType = IntegerLiteralTypeConstructor.Companion.findIntersectionType(arrayListA);
            if (simpleTypeFindIntersectionType != null) {
                simpleTypeCreateType = simpleTypeFindIntersectionType;
            } else {
                ArrayList arrayListA2 = a(arrayListA, new e(2, NewKotlinTypeChecker.Companion.getDefault()));
                arrayListA2.isEmpty();
                simpleTypeCreateType = arrayListA2.size() < 2 ? (SimpleType) CollectionsKt___CollectionsKt.single((Iterable) arrayListA2) : new IntersectionTypeConstructor(linkedHashSet).createType();
            }
        }
        return simpleTypeCreateType.replaceAttributes(typeAttributes);
    }
}
