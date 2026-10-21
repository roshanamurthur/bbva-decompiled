package kotlin.reflect.jvm.internal.impl.load.java;

import bk.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FakePureImplementationsProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nFakePureImplementationsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n1285#2,4:39\n11065#3:43\n11400#3,3:44\n125#4:47\n152#4,3:48\n*S KotlinDebug\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n*L\n18#1:39,4\n36#1:43\n36#1:44,3\n32#1:47\n32#1:48,3\n*E\n"})
public final class FakePureImplementationsProvider {

    @NotNull
    public static final FakePureImplementationsProvider INSTANCE = new FakePureImplementationsProvider();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f80495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<FqName, FqName> f80496b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f80495a = linkedHashMap;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        b(standardClassIds.getMutableList(), a("java.util.ArrayList", "java.util.LinkedList"));
        b(standardClassIds.getMutableSet(), a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(standardClassIds.getMutableMap(), a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ClassId classId = ClassId.topLevel(new FqName("java.util.function.Function"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        b(classId, a("java.util.function.UnaryOperator"));
        ClassId classId2 = ClassId.topLevel(new FqName("java.util.function.BiFunction"));
        Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(...)");
        b(classId2, a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(TuplesKt.to(((ClassId) entry.getKey()).asSingleFqName(), ((ClassId) entry.getValue()).asSingleFqName()));
        }
        f80496b = q.toMap(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.topLevel(new FqName(str)));
        }
        return arrayList;
    }

    public static void b(ClassId classId, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f80495a.put(obj, classId);
        }
    }

    @Nullable
    public final FqName getPurelyImplementedInterface(@NotNull FqName classFqName) {
        Intrinsics.checkNotNullParameter(classFqName, "classFqName");
        return f80496b.get(classFqName);
    }
}
