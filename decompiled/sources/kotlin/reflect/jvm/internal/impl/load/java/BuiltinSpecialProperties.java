package kotlin.reflect.jvm.internal.impl.load.java;

import bk.p;
import bk.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,47:1\n1549#2:48\n1620#2,3:49\n1490#2:52\n1520#2,3:53\n1523#2,3:63\n1238#2,4:68\n1549#2:75\n1620#2,3:76\n372#3,7:56\n453#3:66\n403#3:67\n152#4,3:72\n*S KotlinDebug\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n*L\n28#1:48\n28#1:49,3\n29#1:52\n29#1:53,3\n29#1:63,3\n30#1:68,4\n39#1:75\n39#1:76,3\n29#1:56,7\n30#1:66\n30#1:67\n34#1:72,3\n*E\n"})
public final class BuiltinSpecialProperties {

    @NotNull
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<FqName, Name> f80488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f80489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Set<FqName> f80490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Set<Name> f80491d;

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        FqName fqName = StandardNames.FqNames.map;
        Map<FqName, Name> mapMapOf = q.mapOf(TuplesKt.to(BuiltinSpecialPropertiesKt.access$childSafe(fqNameUnsafe, "name"), StandardNames.NAME), TuplesKt.to(BuiltinSpecialPropertiesKt.access$childSafe(fqNameUnsafe, "ordinal"), Name.identifier("ordinal")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(StandardNames.FqNames.collection, "size"), Name.identifier("size")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(fqName, "size"), Name.identifier("size")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$childSafe(StandardNames.FqNames.charSequence, "length"), Name.identifier("length")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(fqName, "keys"), Name.identifier("keySet")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(fqName, "values"), Name.identifier("values")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(fqName, "entries"), Name.identifier("entrySet")));
        f80488a = mapMapOf;
        Set<Map.Entry<FqName, Name>> setEntrySet = mapMapOf.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.getSecond();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt___CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        f80489b = linkedHashMap2;
        Map<FqName, Name> map = f80488a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<FqName, Name> entry3 : map.entrySet()) {
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqNameUnsafe unsafe = entry3.getKey().parent().toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
            ClassId classIdMapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
            Intrinsics.checkNotNull(classIdMapKotlinToJava);
            linkedHashSet.add(classIdMapKotlinToJava.asSingleFqName().child(entry3.getValue()));
        }
        Set<FqName> setKeySet = f80488a.keySet();
        f80490c = setKeySet;
        Set<FqName> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FqName) it2.next()).shortName());
        }
        f80491d = CollectionsKt___CollectionsKt.toSet(arrayList3);
    }

    @NotNull
    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return f80488a;
    }

    @NotNull
    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List<Name> list = (List) f80489b.get(name1);
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return f80490c;
    }

    @NotNull
    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return f80491d;
    }
}
