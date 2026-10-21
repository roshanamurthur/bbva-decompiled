package kotlin.reflect.jvm.internal.impl.name;

import androidx.camera.core.processing.f;
import bk.w;
import bk.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StandardClassIds.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n1271#2,2:288\n1285#2,4:290\n1271#2,2:294\n1285#2,4:296\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n*L\n86#1:288,2\n86#1:290,4\n90#1:294,2\n90#1:296,4\n*E\n"})
public final class StandardClassIds {

    @NotNull
    public static final StandardClassIds INSTANCE = new StandardClassIds();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final FqName f81341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final FqName f81342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FqName f81343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final FqName f81344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final FqName f81345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final FqName f81346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final FqName f81347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Set<FqName> f81348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final ClassId f81349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ClassId f81350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final ClassId f81351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final ClassId f81352l;

    @NotNull
    public static final ClassId m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final ClassId f81353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final ClassId f81354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final ClassId f81355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Set<ClassId> f81356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final Map<ClassId, ClassId> f81357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final Set<ClassId> f81358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final Map<ClassId, ClassId> f81359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final Set<ClassId> f81360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final ClassId f81361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final ClassId f81362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final ClassId f81363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final ClassId f81364y;

    static {
        FqName fqName = new FqName("kotlin");
        f81341a = fqName;
        FqName fqNameChild = fqName.child(Name.identifier("reflect"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
        f81342b = fqNameChild;
        FqName fqNameChild2 = fqName.child(Name.identifier("collections"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild2, "child(...)");
        f81343c = fqNameChild2;
        FqName fqNameChild3 = fqName.child(Name.identifier("ranges"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild3, "child(...)");
        f81344d = fqNameChild3;
        FqName fqNameChild4 = fqName.child(Name.identifier("jvm"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild4, "child(...)");
        Intrinsics.checkNotNullExpressionValue(fqNameChild4.child(Name.identifier("internal")), "child(...)");
        FqName fqNameChild5 = fqName.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild5, "child(...)");
        f81345e = fqNameChild5;
        FqName fqNameChild6 = fqName.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild6, "child(...)");
        Intrinsics.checkNotNullExpressionValue(fqNameChild6.child(Name.identifier("ir")), "child(...)");
        FqName fqNameChild7 = fqName.child(Name.identifier("coroutines"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild7, "child(...)");
        f81346f = fqNameChild7;
        FqName fqNameChild8 = fqName.child(Name.identifier("enums"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild8, "child(...)");
        f81347g = fqNameChild8;
        Intrinsics.checkNotNullExpressionValue(fqName.child(Name.identifier("contracts")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(fqName.child(Name.identifier("concurrent")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(fqName.child(Name.identifier("test")), "child(...)");
        f81348h = w.setOf((Object[]) new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild5, fqNameChild, fqNameChild6, fqNameChild7});
        StandardClassIdsKt.access$baseId("Nothing");
        StandardClassIdsKt.access$baseId("Unit");
        StandardClassIdsKt.access$baseId("Any");
        StandardClassIdsKt.access$baseId("Enum");
        StandardClassIdsKt.access$baseId("Annotation");
        f81349i = StandardClassIdsKt.access$baseId("Array");
        ClassId classIdAccess$baseId = StandardClassIdsKt.access$baseId("Boolean");
        ClassId classIdAccess$baseId2 = StandardClassIdsKt.access$baseId("Char");
        ClassId classIdAccess$baseId3 = StandardClassIdsKt.access$baseId("Byte");
        ClassId classIdAccess$baseId4 = StandardClassIdsKt.access$baseId("Short");
        ClassId classIdAccess$baseId5 = StandardClassIdsKt.access$baseId("Int");
        ClassId classIdAccess$baseId6 = StandardClassIdsKt.access$baseId("Long");
        ClassId classIdAccess$baseId7 = StandardClassIdsKt.access$baseId("Float");
        ClassId classIdAccess$baseId8 = StandardClassIdsKt.access$baseId("Double");
        f81350j = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId3);
        f81351k = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId4);
        f81352l = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId5);
        m = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId6);
        StandardClassIdsKt.access$baseId("CharSequence");
        f81353n = StandardClassIdsKt.access$baseId("String");
        StandardClassIdsKt.access$baseId("Throwable");
        StandardClassIdsKt.access$baseId("Cloneable");
        StandardClassIdsKt.access$reflectId("KProperty");
        StandardClassIdsKt.access$reflectId("KMutableProperty");
        StandardClassIdsKt.access$reflectId("KProperty0");
        StandardClassIdsKt.access$reflectId("KMutableProperty0");
        StandardClassIdsKt.access$reflectId("KProperty1");
        StandardClassIdsKt.access$reflectId("KMutableProperty1");
        StandardClassIdsKt.access$reflectId("KProperty2");
        StandardClassIdsKt.access$reflectId("KMutableProperty2");
        f81354o = StandardClassIdsKt.access$reflectId("KFunction");
        f81355p = StandardClassIdsKt.access$reflectId("KClass");
        StandardClassIdsKt.access$reflectId("KCallable");
        StandardClassIdsKt.access$reflectId("KType");
        StandardClassIdsKt.access$baseId("Comparable");
        StandardClassIdsKt.access$baseId("Number");
        StandardClassIdsKt.access$baseId("Function");
        Set<ClassId> of2 = w.setOf((Object[]) new ClassId[]{classIdAccess$baseId, classIdAccess$baseId2, classIdAccess$baseId3, classIdAccess$baseId4, classIdAccess$baseId5, classIdAccess$baseId6, classIdAccess$baseId7, classIdAccess$baseId8});
        f81356q = of2;
        Set<ClassId> set = of2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(set, 10, 16));
        for (Object obj : set) {
            Name shortClassName = ((ClassId) obj).getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName, "getShortClassName(...)");
            linkedHashMap.put(obj, StandardClassIdsKt.access$primitiveArrayId(shortClassName));
        }
        f81357r = StandardClassIdsKt.access$inverseMap(linkedHashMap);
        Set<ClassId> of3 = w.setOf((Object[]) new ClassId[]{f81350j, f81351k, f81352l, m});
        f81358s = of3;
        Set<ClassId> set2 = of3;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(f.a(set2, 10, 16));
        for (Object obj2 : set2) {
            Name shortClassName2 = ((ClassId) obj2).getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName2, "getShortClassName(...)");
            linkedHashMap2.put(obj2, StandardClassIdsKt.access$primitiveArrayId(shortClassName2));
        }
        f81359t = StandardClassIdsKt.access$inverseMap(linkedHashMap2);
        f81360u = x.plus((Set<? extends ClassId>) x.plus((Set) f81356q, (Iterable) f81358s), f81353n);
        StandardClassIdsKt.access$coroutinesId("Continuation");
        StandardClassIdsKt.access$collectionsId("Iterator");
        StandardClassIdsKt.access$collectionsId("Iterable");
        StandardClassIdsKt.access$collectionsId("Collection");
        StandardClassIdsKt.access$collectionsId("List");
        StandardClassIdsKt.access$collectionsId("ListIterator");
        StandardClassIdsKt.access$collectionsId("Set");
        ClassId classIdAccess$collectionsId = StandardClassIdsKt.access$collectionsId("Map");
        StandardClassIdsKt.access$collectionsId("MutableIterator");
        StandardClassIdsKt.access$collectionsId("CharIterator");
        StandardClassIdsKt.access$collectionsId("MutableIterable");
        StandardClassIdsKt.access$collectionsId("MutableCollection");
        f81361v = StandardClassIdsKt.access$collectionsId("MutableList");
        StandardClassIdsKt.access$collectionsId("MutableListIterator");
        f81362w = StandardClassIdsKt.access$collectionsId("MutableSet");
        ClassId classIdAccess$collectionsId2 = StandardClassIdsKt.access$collectionsId("MutableMap");
        f81363x = classIdAccess$collectionsId2;
        Intrinsics.checkNotNullExpressionValue(classIdAccess$collectionsId.createNestedClassId(Name.identifier("Entry")), "createNestedClassId(...)");
        Intrinsics.checkNotNullExpressionValue(classIdAccess$collectionsId2.createNestedClassId(Name.identifier("MutableEntry")), "createNestedClassId(...)");
        StandardClassIdsKt.access$baseId("Result");
        StandardClassIdsKt.access$rangesId("IntRange");
        StandardClassIdsKt.access$rangesId("LongRange");
        StandardClassIdsKt.access$rangesId("CharRange");
        StandardClassIdsKt.access$annotationId("AnnotationRetention");
        StandardClassIdsKt.access$annotationId("AnnotationTarget");
        StandardClassIdsKt.access$baseId("DeprecationLevel");
        f81364y = StandardClassIdsKt.access$enumsId("EnumEntries");
    }

    @NotNull
    public final ClassId getArray() {
        return f81349i;
    }

    @NotNull
    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return f81345e;
    }

    @NotNull
    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return f81343c;
    }

    @NotNull
    public final FqName getBASE_COROUTINES_PACKAGE() {
        return f81346f;
    }

    @NotNull
    public final FqName getBASE_ENUMS_PACKAGE() {
        return f81347g;
    }

    @NotNull
    public final FqName getBASE_KOTLIN_PACKAGE() {
        return f81341a;
    }

    @NotNull
    public final FqName getBASE_RANGES_PACKAGE() {
        return f81344d;
    }

    @NotNull
    public final FqName getBASE_REFLECT_PACKAGE() {
        return f81342b;
    }

    @NotNull
    public final ClassId getEnumEntries() {
        return f81364y;
    }

    @NotNull
    public final ClassId getKClass() {
        return f81355p;
    }

    @NotNull
    public final ClassId getKFunction() {
        return f81354o;
    }

    @NotNull
    public final ClassId getMutableList() {
        return f81361v;
    }

    @NotNull
    public final ClassId getMutableMap() {
        return f81363x;
    }

    @NotNull
    public final ClassId getMutableSet() {
        return f81362w;
    }
}
